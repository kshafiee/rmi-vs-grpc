package foo.rmiclient;

/**
 * Created by k00759368 on 1/26/2018.
 */

import com.google.protobuf.ByteString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import foo.Female;
import foo.Human;
import foo.Male;
import foo.rmiinterface.RMIInterface;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.helloworld.GreeterGrpc;
import io.grpc.helloworld.HelloReply;
import io.grpc.helloworld.HelloRequest;

/*public class ClientOperation {
    private static RMIInterface look_up;

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(args[0], Integer.parseInt(args[1]));
            look_up = (RMIInterface) registry.lookup("//localhost/MyServer");
            String response = look_up.helloTo("CLIENT");
            System.out.println(response);
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}*/

public class ClientOperation {
    private static final Logger logger = Logger.getLogger(foo.rmiclient.ClientOperation.class.getName());

    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    /** Construct client connecting to HelloWorld server at {@code host:port}. */
    public ClientOperation(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext(true)
                .build());
    }

    /** Construct client for accessing RouteGuide server using the existing channel. */
    ClientOperation(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = GreeterGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(obj);
        return out.toByteArray();
    }
    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }

    /** Say hello to server. */
    public void greetOrg(String name) {
        logger.info("Creating Request using String " + name + " ...");
        //HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        //HelloRequest request1 = HelloRequest.newBuilder().setName(ByteString.copyFromUtf8(name)).build();
        HelloRequest request;
        try {
            request = HelloRequest.newBuilder().setName(ByteString.copyFrom(serialize(name))).build();
        } catch(IOException ie) {
            request = HelloRequest.newBuilder().setName(ByteString.copyFrom(name.getBytes(Charset.forName("UTF-8")))).build();
            ie.printStackTrace();
        }
        //HelloRequest request = HelloRequest.newBuilder().setName(ByteString.copyFrom(name.getBytes(Charset.forName("UTF-8")))).build();
        //Object nameObj = name;
        //
        HelloReply response;
    /*try {
      response = blockingStub.sayHello(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    logger.info("Greeting: " + response.getMessage());*/
        try {
            response = blockingStub.helloTo(request);
            //System.out.println("request.toString(): " + request.toString());
            //System.out.println("response.toString(): " + response.toString());
            System.out.println("deserialize(req.getName().toByteArray())" + deserialize(response.getMessage().toByteArray()));
            System.out.println("deserialize(req.getName().toByteArray()).toString()" + deserialize(response.getMessage().toByteArray()).toString());
        } catch (Exception e) {
            return;
        }
        /*} catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }*/
        logger.info("Response to helloTo: " + response.getMessage());
    }

    /** Say hello to server. */
    public void greet(Object obj) {
        HelloRequest request;
        try {
            request = HelloRequest.newBuilder().setName(ByteString.copyFrom(serialize(obj))).build();
        } catch(IOException ie) {
            request = HelloRequest.newBuilder().build();
            ie.printStackTrace();
        }
        HelloReply response;
        try {
            response = blockingStub.helloTo(request);
            System.out.println("deserialize(req.getName().toByteArray())" + deserialize(response.getMessage().toByteArray()));
        } catch (Exception e) {
            return;
        }
        logger.info("Response to helloTo: " + response.getMessage());
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting.
     */
    public static void main(String[] args) throws Exception {
        foo.rmiclient.ClientOperation client = new foo.rmiclient.ClientOperation("localhost", 50051);
        try {
      /* Access a service running on the local machine on port 50051 */
            String user = "CLIENT";
            if (args.length > 0) {
                user = args[0];
            }
            client.greet(user);
        } finally {
            client.shutdown();
        }
    }
}