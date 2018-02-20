package sapphire.grpc.example.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.0)",
    comments = "Source: rmi_via_grpc.proto")
public final class InvokerGrpc {

  private InvokerGrpc() {}

  public static final String SERVICE_NAME = "invoker.Invoker";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getInvokeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<sapphire.grpc.example.generated.InvokeRequest,
      sapphire.grpc.example.generated.InvokeResponse> METHOD_INVOKE = getInvokeMethod();

  private static volatile io.grpc.MethodDescriptor<sapphire.grpc.example.generated.InvokeRequest,
      sapphire.grpc.example.generated.InvokeResponse> getInvokeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<sapphire.grpc.example.generated.InvokeRequest,
      sapphire.grpc.example.generated.InvokeResponse> getInvokeMethod() {
    io.grpc.MethodDescriptor<sapphire.grpc.example.generated.InvokeRequest, sapphire.grpc.example.generated.InvokeResponse> getInvokeMethod;
    if ((getInvokeMethod = InvokerGrpc.getInvokeMethod) == null) {
      synchronized (InvokerGrpc.class) {
        if ((getInvokeMethod = InvokerGrpc.getInvokeMethod) == null) {
          InvokerGrpc.getInvokeMethod = getInvokeMethod = 
              io.grpc.MethodDescriptor.<sapphire.grpc.example.generated.InvokeRequest, sapphire.grpc.example.generated.InvokeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "invoker.Invoker", "Invoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sapphire.grpc.example.generated.InvokeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sapphire.grpc.example.generated.InvokeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InvokerMethodDescriptorSupplier("Invoke"))
                  .build();
          }
        }
     }
     return getInvokeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InvokerStub newStub(io.grpc.Channel channel) {
    return new InvokerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InvokerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InvokerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InvokerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InvokerFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class InvokerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void invoke(sapphire.grpc.example.generated.InvokeRequest request,
        io.grpc.stub.StreamObserver<sapphire.grpc.example.generated.InvokeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInvokeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInvokeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sapphire.grpc.example.generated.InvokeRequest,
                sapphire.grpc.example.generated.InvokeResponse>(
                  this, METHODID_INVOKE)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class InvokerStub extends io.grpc.stub.AbstractStub<InvokerStub> {
    private InvokerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InvokerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvokerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InvokerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void invoke(sapphire.grpc.example.generated.InvokeRequest request,
        io.grpc.stub.StreamObserver<sapphire.grpc.example.generated.InvokeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInvokeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class InvokerBlockingStub extends io.grpc.stub.AbstractStub<InvokerBlockingStub> {
    private InvokerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InvokerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvokerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InvokerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public sapphire.grpc.example.generated.InvokeResponse invoke(sapphire.grpc.example.generated.InvokeRequest request) {
      return blockingUnaryCall(
          getChannel(), getInvokeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class InvokerFutureStub extends io.grpc.stub.AbstractStub<InvokerFutureStub> {
    private InvokerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InvokerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvokerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InvokerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<sapphire.grpc.example.generated.InvokeResponse> invoke(
        sapphire.grpc.example.generated.InvokeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInvokeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INVOKE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InvokerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InvokerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INVOKE:
          serviceImpl.invoke((sapphire.grpc.example.generated.InvokeRequest) request,
              (io.grpc.stub.StreamObserver<sapphire.grpc.example.generated.InvokeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InvokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InvokerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sapphire.grpc.example.generated.InvokerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Invoker");
    }
  }

  private static final class InvokerFileDescriptorSupplier
      extends InvokerBaseDescriptorSupplier {
    InvokerFileDescriptorSupplier() {}
  }

  private static final class InvokerMethodDescriptorSupplier
      extends InvokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InvokerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InvokerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InvokerFileDescriptorSupplier())
              .addMethod(getInvokeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
