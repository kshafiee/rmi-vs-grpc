package sapphire.grpc.example;

/**
 * Created by quinton on 2/13/18.
 */

public interface ProtoBuilder {
    com.google.protobuf.Message.Builder toProto();
}
