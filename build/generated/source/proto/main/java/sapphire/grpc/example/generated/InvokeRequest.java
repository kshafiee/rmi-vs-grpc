// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rmi_via_grpc.proto

package sapphire.grpc.example.generated;

/**
 * <pre>
 * The request message containing the user's name.
 * </pre>
 *
 * Protobuf type {@code invoker.InvokeRequest}
 */
public  final class InvokeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:invoker.InvokeRequest)
    InvokeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InvokeRequest.newBuilder() to construct.
  private InvokeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvokeRequest() {
    methodName_ = "";
    arg_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InvokeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            methodName_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              arg_ = new java.util.ArrayList<sapphire.grpc.example.generated.Base>();
              mutable_bitField0_ |= 0x00000002;
            }
            arg_.add(
                input.readMessage(sapphire.grpc.example.generated.Base.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        arg_ = java.util.Collections.unmodifiableList(arg_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sapphire.grpc.example.generated.InvokeRequest.class, sapphire.grpc.example.generated.InvokeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int METHODNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object methodName_;
  /**
   * <code>string methodName = 1;</code>
   */
  public java.lang.String getMethodName() {
    java.lang.Object ref = methodName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      methodName_ = s;
      return s;
    }
  }
  /**
   * <code>string methodName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMethodNameBytes() {
    java.lang.Object ref = methodName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      methodName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARG_FIELD_NUMBER = 2;
  private java.util.List<sapphire.grpc.example.generated.Base> arg_;
  /**
   * <pre>
   * Some number of arguments, each of some subtype of Base (i.e. Object).
   * </pre>
   *
   * <code>repeated .invoker.Base arg = 2;</code>
   */
  public java.util.List<sapphire.grpc.example.generated.Base> getArgList() {
    return arg_;
  }
  /**
   * <pre>
   * Some number of arguments, each of some subtype of Base (i.e. Object).
   * </pre>
   *
   * <code>repeated .invoker.Base arg = 2;</code>
   */
  public java.util.List<? extends sapphire.grpc.example.generated.BaseOrBuilder> 
      getArgOrBuilderList() {
    return arg_;
  }
  /**
   * <pre>
   * Some number of arguments, each of some subtype of Base (i.e. Object).
   * </pre>
   *
   * <code>repeated .invoker.Base arg = 2;</code>
   */
  public int getArgCount() {
    return arg_.size();
  }
  /**
   * <pre>
   * Some number of arguments, each of some subtype of Base (i.e. Object).
   * </pre>
   *
   * <code>repeated .invoker.Base arg = 2;</code>
   */
  public sapphire.grpc.example.generated.Base getArg(int index) {
    return arg_.get(index);
  }
  /**
   * <pre>
   * Some number of arguments, each of some subtype of Base (i.e. Object).
   * </pre>
   *
   * <code>repeated .invoker.Base arg = 2;</code>
   */
  public sapphire.grpc.example.generated.BaseOrBuilder getArgOrBuilder(
      int index) {
    return arg_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMethodNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, methodName_);
    }
    for (int i = 0; i < arg_.size(); i++) {
      output.writeMessage(2, arg_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMethodNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, methodName_);
    }
    for (int i = 0; i < arg_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, arg_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sapphire.grpc.example.generated.InvokeRequest)) {
      return super.equals(obj);
    }
    sapphire.grpc.example.generated.InvokeRequest other = (sapphire.grpc.example.generated.InvokeRequest) obj;

    boolean result = true;
    result = result && getMethodName()
        .equals(other.getMethodName());
    result = result && getArgList()
        .equals(other.getArgList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + METHODNAME_FIELD_NUMBER;
    hash = (53 * hash) + getMethodName().hashCode();
    if (getArgCount() > 0) {
      hash = (37 * hash) + ARG_FIELD_NUMBER;
      hash = (53 * hash) + getArgList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sapphire.grpc.example.generated.InvokeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sapphire.grpc.example.generated.InvokeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request message containing the user's name.
   * </pre>
   *
   * Protobuf type {@code invoker.InvokeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:invoker.InvokeRequest)
      sapphire.grpc.example.generated.InvokeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sapphire.grpc.example.generated.InvokeRequest.class, sapphire.grpc.example.generated.InvokeRequest.Builder.class);
    }

    // Construct using sapphire.grpc.example.generated.InvokeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getArgFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      methodName_ = "";

      if (argBuilder_ == null) {
        arg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        argBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeRequest_descriptor;
    }

    public sapphire.grpc.example.generated.InvokeRequest getDefaultInstanceForType() {
      return sapphire.grpc.example.generated.InvokeRequest.getDefaultInstance();
    }

    public sapphire.grpc.example.generated.InvokeRequest build() {
      sapphire.grpc.example.generated.InvokeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public sapphire.grpc.example.generated.InvokeRequest buildPartial() {
      sapphire.grpc.example.generated.InvokeRequest result = new sapphire.grpc.example.generated.InvokeRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.methodName_ = methodName_;
      if (argBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          arg_ = java.util.Collections.unmodifiableList(arg_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.arg_ = arg_;
      } else {
        result.arg_ = argBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sapphire.grpc.example.generated.InvokeRequest) {
        return mergeFrom((sapphire.grpc.example.generated.InvokeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sapphire.grpc.example.generated.InvokeRequest other) {
      if (other == sapphire.grpc.example.generated.InvokeRequest.getDefaultInstance()) return this;
      if (!other.getMethodName().isEmpty()) {
        methodName_ = other.methodName_;
        onChanged();
      }
      if (argBuilder_ == null) {
        if (!other.arg_.isEmpty()) {
          if (arg_.isEmpty()) {
            arg_ = other.arg_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureArgIsMutable();
            arg_.addAll(other.arg_);
          }
          onChanged();
        }
      } else {
        if (!other.arg_.isEmpty()) {
          if (argBuilder_.isEmpty()) {
            argBuilder_.dispose();
            argBuilder_ = null;
            arg_ = other.arg_;
            bitField0_ = (bitField0_ & ~0x00000002);
            argBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArgFieldBuilder() : null;
          } else {
            argBuilder_.addAllMessages(other.arg_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sapphire.grpc.example.generated.InvokeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sapphire.grpc.example.generated.InvokeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object methodName_ = "";
    /**
     * <code>string methodName = 1;</code>
     */
    public java.lang.String getMethodName() {
      java.lang.Object ref = methodName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        methodName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string methodName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        methodName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string methodName = 1;</code>
     */
    public Builder setMethodName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      methodName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string methodName = 1;</code>
     */
    public Builder clearMethodName() {
      
      methodName_ = getDefaultInstance().getMethodName();
      onChanged();
      return this;
    }
    /**
     * <code>string methodName = 1;</code>
     */
    public Builder setMethodNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      methodName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<sapphire.grpc.example.generated.Base> arg_ =
      java.util.Collections.emptyList();
    private void ensureArgIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        arg_ = new java.util.ArrayList<sapphire.grpc.example.generated.Base>(arg_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        sapphire.grpc.example.generated.Base, sapphire.grpc.example.generated.Base.Builder, sapphire.grpc.example.generated.BaseOrBuilder> argBuilder_;

    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public java.util.List<sapphire.grpc.example.generated.Base> getArgList() {
      if (argBuilder_ == null) {
        return java.util.Collections.unmodifiableList(arg_);
      } else {
        return argBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public int getArgCount() {
      if (argBuilder_ == null) {
        return arg_.size();
      } else {
        return argBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public sapphire.grpc.example.generated.Base getArg(int index) {
      if (argBuilder_ == null) {
        return arg_.get(index);
      } else {
        return argBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public Builder setArg(
        int index, sapphire.grpc.example.generated.Base value) {
      if (argBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgIsMutable();
        arg_.set(index, value);
        onChanged();
      } else {
        argBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public Builder setArg(
        int index, sapphire.grpc.example.generated.Base.Builder builderForValue) {
      if (argBuilder_ == null) {
        ensureArgIsMutable();
        arg_.set(index, builderForValue.build());
        onChanged();
      } else {
        argBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public Builder addArg(sapphire.grpc.example.generated.Base value) {
      if (argBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgIsMutable();
        arg_.add(value);
        onChanged();
      } else {
        argBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public Builder addArg(
        int index, sapphire.grpc.example.generated.Base value) {
      if (argBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgIsMutable();
        arg_.add(index, value);
        onChanged();
      } else {
        argBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public Builder addArg(
        sapphire.grpc.example.generated.Base.Builder builderForValue) {
      if (argBuilder_ == null) {
        ensureArgIsMutable();
        arg_.add(builderForValue.build());
        onChanged();
      } else {
        argBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public Builder addArg(
        int index, sapphire.grpc.example.generated.Base.Builder builderForValue) {
      if (argBuilder_ == null) {
        ensureArgIsMutable();
        arg_.add(index, builderForValue.build());
        onChanged();
      } else {
        argBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public Builder addAllArg(
        java.lang.Iterable<? extends sapphire.grpc.example.generated.Base> values) {
      if (argBuilder_ == null) {
        ensureArgIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, arg_);
        onChanged();
      } else {
        argBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public Builder clearArg() {
      if (argBuilder_ == null) {
        arg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        argBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public Builder removeArg(int index) {
      if (argBuilder_ == null) {
        ensureArgIsMutable();
        arg_.remove(index);
        onChanged();
      } else {
        argBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public sapphire.grpc.example.generated.Base.Builder getArgBuilder(
        int index) {
      return getArgFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public sapphire.grpc.example.generated.BaseOrBuilder getArgOrBuilder(
        int index) {
      if (argBuilder_ == null) {
        return arg_.get(index);  } else {
        return argBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public java.util.List<? extends sapphire.grpc.example.generated.BaseOrBuilder> 
         getArgOrBuilderList() {
      if (argBuilder_ != null) {
        return argBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(arg_);
      }
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public sapphire.grpc.example.generated.Base.Builder addArgBuilder() {
      return getArgFieldBuilder().addBuilder(
          sapphire.grpc.example.generated.Base.getDefaultInstance());
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public sapphire.grpc.example.generated.Base.Builder addArgBuilder(
        int index) {
      return getArgFieldBuilder().addBuilder(
          index, sapphire.grpc.example.generated.Base.getDefaultInstance());
    }
    /**
     * <pre>
     * Some number of arguments, each of some subtype of Base (i.e. Object).
     * </pre>
     *
     * <code>repeated .invoker.Base arg = 2;</code>
     */
    public java.util.List<sapphire.grpc.example.generated.Base.Builder> 
         getArgBuilderList() {
      return getArgFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        sapphire.grpc.example.generated.Base, sapphire.grpc.example.generated.Base.Builder, sapphire.grpc.example.generated.BaseOrBuilder> 
        getArgFieldBuilder() {
      if (argBuilder_ == null) {
        argBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            sapphire.grpc.example.generated.Base, sapphire.grpc.example.generated.Base.Builder, sapphire.grpc.example.generated.BaseOrBuilder>(
                arg_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        arg_ = null;
      }
      return argBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:invoker.InvokeRequest)
  }

  // @@protoc_insertion_point(class_scope:invoker.InvokeRequest)
  private static final sapphire.grpc.example.generated.InvokeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sapphire.grpc.example.generated.InvokeRequest();
  }

  public static sapphire.grpc.example.generated.InvokeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvokeRequest>
      PARSER = new com.google.protobuf.AbstractParser<InvokeRequest>() {
    public InvokeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InvokeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InvokeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvokeRequest> getParserForType() {
    return PARSER;
  }

  public sapphire.grpc.example.generated.InvokeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

