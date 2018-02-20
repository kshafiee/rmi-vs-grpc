package sapphire.grpc.example;

import com.google.protobuf.Message;

import sapphire.grpc.example.generated.Base;

/**
 * Created by quinton on 2/12/18.
 */

public class SubSubClass21 extends SubClass2 {
    public int bar; // Example primitive type;
    public SubSubClass11 sub11; // Example direct reference to an instance of a non-base class.
    public SubClass1 sub1; // Example reference via a parent type.

    /**
     *
     * @return
     */
    public Message.Builder toProto() { // Note: injected by our compiler.
        sapphire.grpc.example.generated.SubSubClass21.Builder builder = sapphire.grpc.example.generated.SubSubClass21.newBuilder();
        builder.setBar(bar);
        if(sub11!=null){
            builder.setSub11((sapphire.grpc.example.generated.SubSubClass11.Builder)(sub11.toProto()));
        }
        if (sub1 != null) {
            builder.setSub1((sapphire.grpc.example.generated.SubClass1.Builder)sub1.toProto());
        }
        Base.Builder baseBuilder = (Base.Builder) super.toProto();
        sapphire.grpc.example.generated.SubClass2.Builder parentBuilder = baseBuilder.getSubclass2Builder();
        parentBuilder.setSubsubclass21(builder);
        return baseBuilder;
    }

    /**
     * Construct an instance from a protobuf - Note: injected by our compiler
     * @param instance
     * @param proto
     */
    public static SubSubClass21 fromProto(SubSubClass21 instance, sapphire.grpc.example.generated.SubSubClass21 proto) {
        if(instance == null) {
            instance = new SubSubClass21();
        }
        SubClass2.fromProto(instance, proto.getSuper());
        instance.bar = proto.getBar();
        if(instance.sub11 != null) {
            instance.sub11 = SubSubClass11.fromProto(null, proto.getSub11());
        }
        if(instance.sub1 != null) {
            instance.sub1 = SubClass1.fromProto(null, proto.getSub1());
        }
        return instance;
    }
}
