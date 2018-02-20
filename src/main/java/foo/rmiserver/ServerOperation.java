package foo.rmiserver;

/**
 * Created by k00759368 on 1/26/2018.
 */

import com.google.protobuf.ByteString;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.*;
import java.nio.charset.Charset;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import foo.Female;
import foo.Human;
import foo.Male;
import foo.rmiclient.ClientOperation;
import foo.rmiinterface.RMIInterface;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.helloworld.GreeterGrpc;
import io.grpc.helloworld.HelloReply;
import io.grpc.helloworld.HelloRequest;
import io.grpc.stub.StreamObserver;

/*public class ServerOperation extends UnicastRemoteObject implements RMIInterface{
    private static final long serialVersionUID = 1L;

    protected ServerOperation() throws RemoteException {
        super();
    }

    @Override
    public String helloTo(String name) throws RemoteException{
        System.err.println(name + " is trying to contact!");
        return "Server says hello to " + name;
    }

    public static void main(String[] args){
        int port = 1099;
        try {
            port = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid arguments!!");
            return;
        }
        System.setProperty("java.rmi.server.hostname", args[0]);
        try {
            Registry registry = LocateRegistry.createRegistry(port);
            registry.rebind("//localhost/MyServer", new ServerOperation());
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}*/

public class ServerOperation {
    private static final Logger logger = Logger.getLogger(foo.rmiclient.ClientOperation.class.getName());

    private Server server;

    private void start() throws IOException {
    /* The port on which the server should run */
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new foo.rmiserver.ServerOperation.GreeterImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                foo.rmiserver.ServerOperation.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
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

    /*private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields)
            fieldNames.add(field.getName());
        return fieldNames;
    }*/
    private static List<?> getFieldNames(Field[] fields) {
        //List<String> fieldNames = new ArrayList<>();
        List<Class> fieldNames = new ArrayList<Class>();
        for (Field field : fields)
            //fieldNames.add(field.getName());
            fieldNames.add(field.getType());
        return fieldNames;
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final foo.rmiserver.ServerOperation server = new foo.rmiserver.ServerOperation();
        //server.givenObject_whenGetsFieldNamesAtRuntime_thenCorrect();
        /*Reflections reflections = new Reflections("foo");
        Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);
        System.out.print(allClasses);*/
        List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
        classLoadersList.add(ClasspathHelper.contextClassLoader());
        classLoadersList.add(ClasspathHelper.staticClassLoader());
        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
                .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
                .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix("foo"))));
        Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);
        for (Class<?> clazz : allClasses)
            try {
                //System.out.println(clazz.getName() + ' ' + clazz.getInterfaces().length);
                //Object candidate = clazz.newInstance();
                //Field[] fields = candidate.getClass().getDeclaredFields();
                Field[] fields = clazz.getDeclaredFields();
                //List<String> actualFieldNames = getFieldNames(fields);
                List<?> actualFieldNames = getFieldNames(fields);
                /*if (clazz.getInterfaces().length > 0) {
                    System.out.println(clazz.getName() + ' ' + clazz.getInterfaces()[0].getName() + ' ' + actualFieldNames);
                    System.out.println("");
                }*/
                System.out.println(clazz.getName() + ' ' + clazz.getInterfaces()[0].getName() + ' ' + actualFieldNames);
                System.out.println("");
            } catch (Exception e) {}

        server.start();
        server.blockUntilShutdown();
    }

    static class GreeterImpl extends GreeterGrpc.GreeterImplBase {
        @Override
        public void helloTo(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
            System.out.println("req.toString(): " + req.toString());
            try {
                System.out.println("deserialize(req.getName().toByteArray())" + deserialize(req.getName().toByteArray()));
            } catch(Exception e) {
            }
            HelloReply reply = HelloReply.newBuilder().setMessage(req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }
}

