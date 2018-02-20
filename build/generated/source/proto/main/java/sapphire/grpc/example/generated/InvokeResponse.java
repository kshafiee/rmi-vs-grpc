// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rmi_via_grpc.proto

package sapphire.grpc.example.generated;

/**
 * <pre>
 * The response message containing the greetings
 * </pre>
 *
 * Protobuf type {@code invoker.InvokeResponse}
 */
public  final class InvokeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:invoker.InvokeResponse)
    InvokeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InvokeResponse.newBuilder() to construct.
  private InvokeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvokeResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InvokeResponse(
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
            sapphire.grpc.example.generated.Base.Builder subBuilder = null;
            if (returnOrThrowCase_ == 1) {
              subBuilder = ((sapphire.grpc.example.generated.Base) returnOrThrow_).toBuilder();
            }
            returnOrThrow_ =
                input.readMessage(sapphire.grpc.example.generated.Base.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((sapphire.grpc.example.generated.Base) returnOrThrow_);
              returnOrThrow_ = subBuilder.buildPartial();
            }
            returnOrThrowCase_ = 1;
            break;
          }
          case 18: {
            sapphire.grpc.example.generated.Base.Builder subBuilder = null;
            if (returnOrThrowCase_ == 2) {
              subBuilder = ((sapphire.grpc.example.generated.Base) returnOrThrow_).toBuilder();
            }
            returnOrThrow_ =
                input.readMessage(sapphire.grpc.example.generated.Base.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((sapphire.grpc.example.generated.Base) returnOrThrow_);
              returnOrThrow_ = subBuilder.buildPartial();
            }
            returnOrThrowCase_ = 2;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sapphire.grpc.example.generated.InvokeResponse.class, sapphire.grpc.example.generated.InvokeResponse.Builder.class);
  }

  private int returnOrThrowCase_ = 0;
  private java.lang.Object returnOrThrow_;
  public enum ReturnOrThrowCase
      implements com.google.protobuf.Internal.EnumLite {
    RETURNVALUE(1),
    THREW(2),
    RETURNORTHROW_NOT_SET(0);
    private final int value;
    private ReturnOrThrowCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReturnOrThrowCase valueOf(int value) {
      return forNumber(value);
    }

    public static ReturnOrThrowCase forNumber(int value) {
      switch (value) {
        case 1: return RETURNVALUE;
        case 2: return THREW;
        case 0: return RETURNORTHROW_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ReturnOrThrowCase
  getReturnOrThrowCase() {
    return ReturnOrThrowCase.forNumber(
        returnOrThrowCase_);
  }

  public static final int RETURNVALUE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * One return value (if the method throws an exception, the return value is omitted.
   * </pre>
   *
   * <code>.invoker.Base returnValue = 1;</code>
   */
  public boolean hasReturnValue() {
    return returnOrThrowCase_ == 1;
  }
  /**
   * <pre>
   * One return value (if the method throws an exception, the return value is omitted.
   * </pre>
   *
   * <code>.invoker.Base returnValue = 1;</code>
   */
  public sapphire.grpc.example.generated.Base getReturnValue() {
    if (returnOrThrowCase_ == 1) {
       return (sapphire.grpc.example.generated.Base) returnOrThrow_;
    }
    return sapphire.grpc.example.generated.Base.getDefaultInstance();
  }
  /**
   * <pre>
   * One return value (if the method throws an exception, the return value is omitted.
   * </pre>
   *
   * <code>.invoker.Base returnValue = 1;</code>
   */
  public sapphire.grpc.example.generated.BaseOrBuilder getReturnValueOrBuilder() {
    if (returnOrThrowCase_ == 1) {
       return (sapphire.grpc.example.generated.Base) returnOrThrow_;
    }
    return sapphire.grpc.example.generated.Base.getDefaultInstance();
  }

  public static final int THREW_FIELD_NUMBER = 2;
  /**
   * <pre>
   * What exception the method thew.  If the method returned successfully, the exception is omitted.
   * </pre>
   *
   * <code>.invoker.Base threw = 2;</code>
   */
  public boolean hasThrew() {
    return returnOrThrowCase_ == 2;
  }
  /**
   * <pre>
   * What exception the method thew.  If the method returned successfully, the exception is omitted.
   * </pre>
   *
   * <code>.invoker.Base threw = 2;</code>
   */
  public sapphire.grpc.example.generated.Base getThrew() {
    if (returnOrThrowCase_ == 2) {
       return (sapphire.grpc.example.generated.Base) returnOrThrow_;
    }
    return sapphire.grpc.example.generated.Base.getDefaultInstance();
  }
  /**
   * <pre>
   * What exception the method thew.  If the method returned successfully, the exception is omitted.
   * </pre>
   *
   * <code>.invoker.Base threw = 2;</code>
   */
  public sapphire.grpc.example.generated.BaseOrBuilder getThrewOrBuilder() {
    if (returnOrThrowCase_ == 2) {
       return (sapphire.grpc.example.generated.Base) returnOrThrow_;
    }
    return sapphire.grpc.example.generated.Base.getDefaultInstance();
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
    if (returnOrThrowCase_ == 1) {
      output.writeMessage(1, (sapphire.grpc.example.generated.Base) returnOrThrow_);
    }
    if (returnOrThrowCase_ == 2) {
      output.writeMessage(2, (sapphire.grpc.example.generated.Base) returnOrThrow_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (returnOrThrowCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (sapphire.grpc.example.generated.Base) returnOrThrow_);
    }
    if (returnOrThrowCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (sapphire.grpc.example.generated.Base) returnOrThrow_);
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
    if (!(obj instanceof sapphire.grpc.example.generated.InvokeResponse)) {
      return super.equals(obj);
    }
    sapphire.grpc.example.generated.InvokeResponse other = (sapphire.grpc.example.generated.InvokeResponse) obj;

    boolean result = true;
    result = result && getReturnOrThrowCase().equals(
        other.getReturnOrThrowCase());
    if (!result) return false;
    switch (returnOrThrowCase_) {
      case 1:
        result = result && getReturnValue()
            .equals(other.getReturnValue());
        break;
      case 2:
        result = result && getThrew()
            .equals(other.getThrew());
        break;
      case 0:
      default:
    }
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
    switch (returnOrThrowCase_) {
      case 1:
        hash = (37 * hash) + RETURNVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getReturnValue().hashCode();
        break;
      case 2:
        hash = (37 * hash) + THREW_FIELD_NUMBER;
        hash = (53 * hash) + getThrew().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sapphire.grpc.example.generated.InvokeResponse parseFrom(
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
  public static Builder newBuilder(sapphire.grpc.example.generated.InvokeResponse prototype) {
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
   * The response message containing the greetings
   * </pre>
   *
   * Protobuf type {@code invoker.InvokeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:invoker.InvokeResponse)
      sapphire.grpc.example.generated.InvokeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sapphire.grpc.example.generated.InvokeResponse.class, sapphire.grpc.example.generated.InvokeResponse.Builder.class);
    }

    // Construct using sapphire.grpc.example.generated.InvokeResponse.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      returnOrThrowCase_ = 0;
      returnOrThrow_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sapphire.grpc.example.generated.InvokerProto.internal_static_invoker_InvokeResponse_descriptor;
    }

    public sapphire.grpc.example.generated.InvokeResponse getDefaultInstanceForType() {
      return sapphire.grpc.example.generated.InvokeResponse.getDefaultInstance();
    }

    public sapphire.grpc.example.generated.InvokeResponse build() {
      sapphire.grpc.example.generated.InvokeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public sapphire.grpc.example.generated.InvokeResponse buildPartial() {
      sapphire.grpc.example.generated.InvokeResponse result = new sapphire.grpc.example.generated.InvokeResponse(this);
      if (returnOrThrowCase_ == 1) {
        if (returnValueBuilder_ == null) {
          result.returnOrThrow_ = returnOrThrow_;
        } else {
          result.returnOrThrow_ = returnValueBuilder_.build();
        }
      }
      if (returnOrThrowCase_ == 2) {
        if (threwBuilder_ == null) {
          result.returnOrThrow_ = returnOrThrow_;
        } else {
          result.returnOrThrow_ = threwBuilder_.build();
        }
      }
      result.returnOrThrowCase_ = returnOrThrowCase_;
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
      if (other instanceof sapphire.grpc.example.generated.InvokeResponse) {
        return mergeFrom((sapphire.grpc.example.generated.InvokeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sapphire.grpc.example.generated.InvokeResponse other) {
      if (other == sapphire.grpc.example.generated.InvokeResponse.getDefaultInstance()) return this;
      switch (other.getReturnOrThrowCase()) {
        case RETURNVALUE: {
          mergeReturnValue(other.getReturnValue());
          break;
        }
        case THREW: {
          mergeThrew(other.getThrew());
          break;
        }
        case RETURNORTHROW_NOT_SET: {
          break;
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
      sapphire.grpc.example.generated.InvokeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sapphire.grpc.example.generated.InvokeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int returnOrThrowCase_ = 0;
    private java.lang.Object returnOrThrow_;
    public ReturnOrThrowCase
        getReturnOrThrowCase() {
      return ReturnOrThrowCase.forNumber(
          returnOrThrowCase_);
    }

    public Builder clearReturnOrThrow() {
      returnOrThrowCase_ = 0;
      returnOrThrow_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        sapphire.grpc.example.generated.Base, sapphire.grpc.example.generated.Base.Builder, sapphire.grpc.example.generated.BaseOrBuilder> returnValueBuilder_;
    /**
     * <pre>
     * One return value (if the method throws an exception, the return value is omitted.
     * </pre>
     *
     * <code>.invoker.Base returnValue = 1;</code>
     */
    public boolean hasReturnValue() {
      return returnOrThrowCase_ == 1;
    }
    /**
     * <pre>
     * One return value (if the method throws an exception, the return value is omitted.
     * </pre>
     *
     * <code>.invoker.Base returnValue = 1;</code>
     */
    public sapphire.grpc.example.generated.Base getReturnValue() {
      if (returnValueBuilder_ == null) {
        if (returnOrThrowCase_ == 1) {
          return (sapphire.grpc.example.generated.Base) returnOrThrow_;
        }
        return sapphire.grpc.example.generated.Base.getDefaultInstance();
      } else {
        if (returnOrThrowCase_ == 1) {
          return returnValueBuilder_.getMessage();
        }
        return sapphire.grpc.example.generated.Base.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * One return value (if the method throws an exception, the return value is omitted.
     * </pre>
     *
     * <code>.invoker.Base returnValue = 1;</code>
     */
    public Builder setReturnValue(sapphire.grpc.example.generated.Base value) {
      if (returnValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        returnOrThrow_ = value;
        onChanged();
      } else {
        returnValueBuilder_.setMessage(value);
      }
      returnOrThrowCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * One return value (if the method throws an exception, the return value is omitted.
     * </pre>
     *
     * <code>.invoker.Base returnValue = 1;</code>
     */
    public Builder setReturnValue(
        sapphire.grpc.example.generated.Base.Builder builderForValue) {
      if (returnValueBuilder_ == null) {
        returnOrThrow_ = builderForValue.build();
        onChanged();
      } else {
        returnValueBuilder_.setMessage(builderForValue.build());
      }
      returnOrThrowCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * One return value (if the method throws an exception, the return value is omitted.
     * </pre>
     *
     * <code>.invoker.Base returnValue = 1;</code>
     */
    public Builder mergeReturnValue(sapphire.grpc.example.generated.Base value) {
      if (returnValueBuilder_ == null) {
        if (returnOrThrowCase_ == 1 &&
            returnOrThrow_ != sapphire.grpc.example.generated.Base.getDefaultInstance()) {
          returnOrThrow_ = sapphire.grpc.example.generated.Base.newBuilder((sapphire.grpc.example.generated.Base) returnOrThrow_)
              .mergeFrom(value).buildPartial();
        } else {
          returnOrThrow_ = value;
        }
        onChanged();
      } else {
        if (returnOrThrowCase_ == 1) {
          returnValueBuilder_.mergeFrom(value);
        }
        returnValueBuilder_.setMessage(value);
      }
      returnOrThrowCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * One return value (if the method throws an exception, the return value is omitted.
     * </pre>
     *
     * <code>.invoker.Base returnValue = 1;</code>
     */
    public Builder clearReturnValue() {
      if (returnValueBuilder_ == null) {
        if (returnOrThrowCase_ == 1) {
          returnOrThrowCase_ = 0;
          returnOrThrow_ = null;
          onChanged();
        }
      } else {
        if (returnOrThrowCase_ == 1) {
          returnOrThrowCase_ = 0;
          returnOrThrow_ = null;
        }
        returnValueBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * One return value (if the method throws an exception, the return value is omitted.
     * </pre>
     *
     * <code>.invoker.Base returnValue = 1;</code>
     */
    public sapphire.grpc.example.generated.Base.Builder getReturnValueBuilder() {
      return getReturnValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * One return value (if the method throws an exception, the return value is omitted.
     * </pre>
     *
     * <code>.invoker.Base returnValue = 1;</code>
     */
    public sapphire.grpc.example.generated.BaseOrBuilder getReturnValueOrBuilder() {
      if ((returnOrThrowCase_ == 1) && (returnValueBuilder_ != null)) {
        return returnValueBuilder_.getMessageOrBuilder();
      } else {
        if (returnOrThrowCase_ == 1) {
          return (sapphire.grpc.example.generated.Base) returnOrThrow_;
        }
        return sapphire.grpc.example.generated.Base.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * One return value (if the method throws an exception, the return value is omitted.
     * </pre>
     *
     * <code>.invoker.Base returnValue = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        sapphire.grpc.example.generated.Base, sapphire.grpc.example.generated.Base.Builder, sapphire.grpc.example.generated.BaseOrBuilder> 
        getReturnValueFieldBuilder() {
      if (returnValueBuilder_ == null) {
        if (!(returnOrThrowCase_ == 1)) {
          returnOrThrow_ = sapphire.grpc.example.generated.Base.getDefaultInstance();
        }
        returnValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            sapphire.grpc.example.generated.Base, sapphire.grpc.example.generated.Base.Builder, sapphire.grpc.example.generated.BaseOrBuilder>(
                (sapphire.grpc.example.generated.Base) returnOrThrow_,
                getParentForChildren(),
                isClean());
        returnOrThrow_ = null;
      }
      returnOrThrowCase_ = 1;
      onChanged();;
      return returnValueBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        sapphire.grpc.example.generated.Base, sapphire.grpc.example.generated.Base.Builder, sapphire.grpc.example.generated.BaseOrBuilder> threwBuilder_;
    /**
     * <pre>
     * What exception the method thew.  If the method returned successfully, the exception is omitted.
     * </pre>
     *
     * <code>.invoker.Base threw = 2;</code>
     */
    public boolean hasThrew() {
      return returnOrThrowCase_ == 2;
    }
    /**
     * <pre>
     * What exception the method thew.  If the method returned successfully, the exception is omitted.
     * </pre>
     *
     * <code>.invoker.Base threw = 2;</code>
     */
    public sapphire.grpc.example.generated.Base getThrew() {
      if (threwBuilder_ == null) {
        if (returnOrThrowCase_ == 2) {
          return (sapphire.grpc.example.generated.Base) returnOrThrow_;
        }
        return sapphire.grpc.example.generated.Base.getDefaultInstance();
      } else {
        if (returnOrThrowCase_ == 2) {
          return threwBuilder_.getMessage();
        }
        return sapphire.grpc.example.generated.Base.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * What exception the method thew.  If the method returned successfully, the exception is omitted.
     * </pre>
     *
     * <code>.invoker.Base threw = 2;</code>
     */
    public Builder setThrew(sapphire.grpc.example.generated.Base value) {
      if (threwBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        returnOrThrow_ = value;
        onChanged();
      } else {
        threwBuilder_.setMessage(value);
      }
      returnOrThrowCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * What exception the method thew.  If the method returned successfully, the exception is omitted.
     * </pre>
     *
     * <code>.invoker.Base threw = 2;</code>
     */
    public Builder setThrew(
        sapphire.grpc.example.generated.Base.Builder builderForValue) {
      if (threwBuilder_ == null) {
        returnOrThrow_ = builderForValue.build();
        onChanged();
      } else {
        threwBuilder_.setMessage(builderForValue.build());
      }
      returnOrThrowCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * What exception the method thew.  If the method returned successfully, the exception is omitted.
     * </pre>
     *
     * <code>.invoker.Base threw = 2;</code>
     */
    public Builder mergeThrew(sapphire.grpc.example.generated.Base value) {
      if (threwBuilder_ == null) {
        if (returnOrThrowCase_ == 2 &&
            returnOrThrow_ != sapphire.grpc.example.generated.Base.getDefaultInstance()) {
          returnOrThrow_ = sapphire.grpc.example.generated.Base.newBuilder((sapphire.grpc.example.generated.Base) returnOrThrow_)
              .mergeFrom(value).buildPartial();
        } else {
          returnOrThrow_ = value;
        }
        onChanged();
      } else {
        if (returnOrThrowCase_ == 2) {
          threwBuilder_.mergeFrom(value);
        }
        threwBuilder_.setMessage(value);
      }
      returnOrThrowCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * What exception the method thew.  If the method returned successfully, the exception is omitted.
     * </pre>
     *
     * <code>.invoker.Base threw = 2;</code>
     */
    public Builder clearThrew() {
      if (threwBuilder_ == null) {
        if (returnOrThrowCase_ == 2) {
          returnOrThrowCase_ = 0;
          returnOrThrow_ = null;
          onChanged();
        }
      } else {
        if (returnOrThrowCase_ == 2) {
          returnOrThrowCase_ = 0;
          returnOrThrow_ = null;
        }
        threwBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * What exception the method thew.  If the method returned successfully, the exception is omitted.
     * </pre>
     *
     * <code>.invoker.Base threw = 2;</code>
     */
    public sapphire.grpc.example.generated.Base.Builder getThrewBuilder() {
      return getThrewFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * What exception the method thew.  If the method returned successfully, the exception is omitted.
     * </pre>
     *
     * <code>.invoker.Base threw = 2;</code>
     */
    public sapphire.grpc.example.generated.BaseOrBuilder getThrewOrBuilder() {
      if ((returnOrThrowCase_ == 2) && (threwBuilder_ != null)) {
        return threwBuilder_.getMessageOrBuilder();
      } else {
        if (returnOrThrowCase_ == 2) {
          return (sapphire.grpc.example.generated.Base) returnOrThrow_;
        }
        return sapphire.grpc.example.generated.Base.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * What exception the method thew.  If the method returned successfully, the exception is omitted.
     * </pre>
     *
     * <code>.invoker.Base threw = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        sapphire.grpc.example.generated.Base, sapphire.grpc.example.generated.Base.Builder, sapphire.grpc.example.generated.BaseOrBuilder> 
        getThrewFieldBuilder() {
      if (threwBuilder_ == null) {
        if (!(returnOrThrowCase_ == 2)) {
          returnOrThrow_ = sapphire.grpc.example.generated.Base.getDefaultInstance();
        }
        threwBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            sapphire.grpc.example.generated.Base, sapphire.grpc.example.generated.Base.Builder, sapphire.grpc.example.generated.BaseOrBuilder>(
                (sapphire.grpc.example.generated.Base) returnOrThrow_,
                getParentForChildren(),
                isClean());
        returnOrThrow_ = null;
      }
      returnOrThrowCase_ = 2;
      onChanged();;
      return threwBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:invoker.InvokeResponse)
  }

  // @@protoc_insertion_point(class_scope:invoker.InvokeResponse)
  private static final sapphire.grpc.example.generated.InvokeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sapphire.grpc.example.generated.InvokeResponse();
  }

  public static sapphire.grpc.example.generated.InvokeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvokeResponse>
      PARSER = new com.google.protobuf.AbstractParser<InvokeResponse>() {
    public InvokeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InvokeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InvokeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvokeResponse> getParserForType() {
    return PARSER;
  }

  public sapphire.grpc.example.generated.InvokeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

