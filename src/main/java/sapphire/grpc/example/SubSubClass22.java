package sapphire.grpc.example;

import com.google.protobuf.Message;

import sapphire.grpc.example.generated.Base;

/**
 * Created by quinton on 2/12/18.
 */

public class SubSubClass22 extends SubClass2 {
    public int baz;
    public BaseClass anyType; // Example via the ultimate ancester type, similar to reference to Object.

    /**
     *
     * @return
     */
    public Message.Builder toProto() { // Note: injected by our compiler.
        sapphire.grpc.example.generated.SubSubClass22.Builder builder = sapphire.grpc.example.generated.SubSubClass22.newBuilder();
        builder.setBaz(baz);
        if(anyType != null) {
            builder.setAnyType((Base.Builder)anyType.toProto());
        }
        Base.Builder baseBuilder = (Base.Builder) super.toProto();
        sapphire.grpc.example.generated.SubClass2.Builder parentBuilder = baseBuilder.getSubclass2Builder();
        parentBuilder.setSubsubclass22(builder);
        return baseBuilder;
    }
    /**
     * Construct an instance from a protobuf - Note: injected by our compiler
     * @param instance
     * @param proto
     */
    public static SubSubClass22 fromProto(SubSubClass22 instance, sapphire.grpc.example.generated.SubSubClass22 proto) {
        if(instance == null) {
            instance = new SubSubClass22();
        }
        SubClass2.fromProto(instance, proto.getSuper());
        instance.baz = proto.getBaz();
        return instance;
    }
}
