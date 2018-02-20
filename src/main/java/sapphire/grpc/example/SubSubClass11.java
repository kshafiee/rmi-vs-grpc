package sapphire.grpc.example;

import com.google.protobuf.Message;

import java.io.Serializable;

import sapphire.grpc.example.generated.Base;

/**
 * Created by quinton on 2/12/18.
 */

public class SubSubClass11 extends SubClass1 implements Serializable { // Example derived class
    public enum Corpus { UNIVERSAL, WEB, IMAGES, LOCAL, NEWS, PRODUCTS, VIDEO };
    public Corpus corpus; // Example enum field.
    public boolean isThisDumb = true;
    @Override
    public Message.Builder toProto() { // Note: injected by our compiler.
//        logger.info(">>toProto()");
        sapphire.grpc.example.generated.SubSubClass11.Builder builder = sapphire.grpc.example.generated.SubSubClass11.newBuilder();
        builder.setCorpus(sapphire.grpc.example.generated.SubSubClass11.Corpus.valueOf(corpus.toString()));
        builder.setIsThisDumb(isThisDumb);
        Base.Builder baseBuilder = (Base.Builder) super.toProto();
        sapphire.grpc.example.generated.SubClass1.Builder parentBuilder = baseBuilder.getSubclass1Builder();
        parentBuilder.setSubsubclass11(builder); // TODO: Remove?
//        logger.info("<<toProto()");
        return baseBuilder;
    }
    /**
     * Construct an instance from a protobuf - Note: injected by our compiler
     * @param instance
     * @param proto
     */
    public static SubSubClass11 fromProto(SubSubClass11 instance, sapphire.grpc.example.generated.SubSubClass11 proto) {
        if(instance == null) {
            instance = new SubSubClass11();
        }
        SubClass1.fromProto((SubClass1)instance, proto.getSuper());
        instance.corpus = Corpus.valueOf(proto.getCorpus().toString());
        instance.isThisDumb = proto.getIsThisDumb();
        return instance;
    }
}
