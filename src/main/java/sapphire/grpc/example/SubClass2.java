package sapphire.grpc.example;

import com.google.protobuf.Message;

import sapphire.grpc.example.generated.Base;

/**
 * Created by quinton on 2/12/18.
 */

public class SubClass2 extends BaseClass implements ProtoBuilder {
    public double value; // Example mask field - mask base class field.
    public short shortVal; // Example short
    @Override
    public Message.Builder toProto() { // Note: injected by our compiler.
        sapphire.grpc.example.generated.SubClass2.Builder builder = sapphire.grpc.example.generated.SubClass2.newBuilder();
        builder.setValue(value);
        builder.setShortval(shortVal);
        Base.Builder parentBuilder = (Base.Builder) super.toProto();
        parentBuilder.setSubclass2(builder);
        builder.setSuper(parentBuilder);
        return parentBuilder;
    }
    /**
     * Construct an instance from a protobuf - Note: injected by our compiler
     * @param b
     */
    public static SubClass2 fromProto(SubClass2 instance, sapphire.grpc.example.generated.SubClass2 b) {
        if(instance==null) {
            if (b.hasSubsubclass21()) { // It's an instance of a subclass.
                instance = SubSubClass21.fromProto(null, b.getSubsubclass21());
            } else if (b.hasSubsubclass22()) {
                instance = SubSubClass22.fromProto(null, b.getSubsubclass22());
            } else { // It's an instance of this class.
                instance = new SubClass2();
            }
        }
        instance.value = b.getValue();
        instance.shortVal = (short)b.getShortval();
        return instance;
    }

}
