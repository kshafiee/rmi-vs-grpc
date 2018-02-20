package sapphire.grpc.example;

import com.google.protobuf.Message;

import sapphire.grpc.example.generated.Base;

/**
 * Created by quinton on 2/12/18.
 */

public class SubSubClass12 extends SubClass1 {
    public int foo;
    @Override
    public Message.Builder toProto() { // Note: injected by our compiler.
        sapphire.grpc.example.generated.SubSubClass12.Builder builder = sapphire.grpc.example.generated.SubSubClass12.newBuilder();
        builder.setFoo(foo);
        Base.Builder baseBuilder = (Base.Builder) super.toProto();
        sapphire.grpc.example.generated.SubClass1.Builder parentBuilder = baseBuilder.getSubclass1Builder();
        parentBuilder.setSubsubclass12(builder); // TODO: Remove?
        return baseBuilder;
    }
    /**
     * Construct an instance from a protobuf - Note: injected by our compiler
     * @param instance
     * @param proto
     */
    public static SubSubClass12 fromProto(SubSubClass12 instance, sapphire.grpc.example.generated.SubSubClass12 proto) {
        if(instance == null) {
            instance = new SubSubClass12();
        }
        SubClass1.fromProto(instance, proto.getSuper());
        instance.foo = proto.getFoo();
        return instance;
    }

}
