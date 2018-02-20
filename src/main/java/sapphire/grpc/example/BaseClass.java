package sapphire.grpc.example;

import java.io.Serializable;

import sapphire.grpc.example.generated.Base;

/**
 * Created by quinton on 2/12/18.
 */

public class BaseClass implements ProtoBuilder,Serializable { // Note: "implements ProtoBuilder" is injected by our compiler
    public String name; // Example primitive type field
    public String value; // Example primitive type field

    @Override
    public com.google.protobuf.Message.Builder toProto() { // Note: injected by our compiler
        Base.Builder builder = Base.newBuilder();
        if (name != null) {
            builder.setName(name);
        }
        if (value != null) {
            builder.setValue(value);
        }
        return builder;
    }

    /**
     * Construct an instance from a protobuf - Note: injected by our compiler
     * @param instance
     * @param b
     */
    public static BaseClass fromProto(BaseClass instance, Base b) {
        if (instance==null) {
            if (b.hasSubclass1()) { // It's an instance of a subclass.
                instance = SubClass1.fromProto(null, b.getSubclass1());
            } else if (b.hasSubclass2()) {
                instance = SubClass2.fromProto(null, b.getSubclass2());
            } else { // It's an instance of this class.
                instance = new BaseClass();
            }
        }
        instance.name = b.getName();
        instance.value = b.getValue();
        return instance;
    }
}
