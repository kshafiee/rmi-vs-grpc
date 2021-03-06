package sapphire.grpc.example;

import com.google.protobuf.ByteString;
import com.google.protobuf.Message;

import org.nustaq.serialization.FSTConfiguration;
import org.nustaq.serialization.FSTObjectOutput;
import org.nustaq.serialization.simpleapi.DefaultCoder;
import org.nustaq.serialization.util.FSTUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Logger;

import sapphire.grpc.example.generated.Base;

/**
 * Created by quinton on 2/12/18.
 */

public class SubClass1 extends BaseClass implements ProtoBuilder {
    private static final Logger logger = Logger.getLogger(SubClass1.class.getName());
    public float amount; // Example primitive type
    public List<Long> ages; // Example standard lib type with generics
    private static FSTConfiguration fst;

    public static FSTConfiguration getFST() {
        if (fst != null) {
            return fst;
        }
        FSTConfiguration tmp = FSTConfiguration.createDefaultConfiguration();
        tmp.registerClass(Long.class);
        fst = tmp;
        return fst;
    }

    public static byte[] serialize(Object obj) throws IOException {
        FSTConfiguration fst = getFST();
        return fst.asByteArray(obj);
    }

    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        FSTConfiguration fst = getFST();
        return fst.asObject(data);
    }

    @Override
    public Message.Builder toProto() { // Note: injected by our compiler.
        sapphire.grpc.example.generated.SubClass1.Builder builder = sapphire.grpc.example.generated.SubClass1.newBuilder();
        if(ages != null) {
            //builder.addAllAges(ages);
            for (Object element : ages) {
                try {
                    builder.addAges(ByteString.copyFrom(serialize(element)));
                } catch (Exception e) { }
            }
        }
        Base.Builder parentBuilder = (Base.Builder) super.toProto();
        parentBuilder.setSubclass1(builder);
        builder.setSuper(parentBuilder); // TODO: Do we need this?
        return parentBuilder;
    }


    /**
     * Construct an instance from a protobuf - Note: injected by our compiler
     * @param instance
     * @param b
     */
    // @Override
    public static SubClass1 fromProto(SubClass1 instance, sapphire.grpc.example.generated.SubClass1 b) {
        if (instance==null) {
            if (b.hasSubsubclass11()) { // It's an instance of a subclass.
                instance = SubSubClass11.fromProto(null, b.getSubsubclass11());
            } else if (b.hasSubsubclass12()) {
                instance = SubSubClass12.fromProto(null, b.getSubsubclass12());
            } else { // It's an instance of this class.
                instance = new SubClass1();
            }
        }
        instance.amount = b.getAmount();
        //instance.ages = b.getAgesList();
        for (ByteString element : b.getAgesList()) {
            try {
                instance.ages.add((Long)deserialize(element.toByteArray()));
            } catch (Exception e) { }
        }
        return instance;
    }
}
