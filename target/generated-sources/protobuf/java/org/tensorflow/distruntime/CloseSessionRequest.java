// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.CloseSessionRequest}
 */
public  final class CloseSessionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.CloseSessionRequest)
    CloseSessionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloseSessionRequest.newBuilder() to construct.
  private CloseSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloseSessionRequest() {
    sessionHandle_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CloseSessionRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionHandle_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CloseSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CloseSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.CloseSessionRequest.class, org.tensorflow.distruntime.CloseSessionRequest.Builder.class);
  }

  public static final int SESSION_HANDLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object sessionHandle_;
  /**
   * <pre>
   * REQUIRED: session_handle must be returned by a CreateSession call
   * to the same master service.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   */
  public java.lang.String getSessionHandle() {
    java.lang.Object ref = sessionHandle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionHandle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * REQUIRED: session_handle must be returned by a CreateSession call
   * to the same master service.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSessionHandleBytes() {
    java.lang.Object ref = sessionHandle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionHandle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSessionHandleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionHandle_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSessionHandleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionHandle_);
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
    if (!(obj instanceof org.tensorflow.distruntime.CloseSessionRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.CloseSessionRequest other = (org.tensorflow.distruntime.CloseSessionRequest) obj;

    boolean result = true;
    result = result && getSessionHandle()
        .equals(other.getSessionHandle());
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
    hash = (37 * hash) + SESSION_HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getSessionHandle().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CloseSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.distruntime.CloseSessionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code tensorflow.CloseSessionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.CloseSessionRequest)
      org.tensorflow.distruntime.CloseSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CloseSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CloseSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.CloseSessionRequest.class, org.tensorflow.distruntime.CloseSessionRequest.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.CloseSessionRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sessionHandle_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CloseSessionRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CloseSessionRequest getDefaultInstanceForType() {
      return org.tensorflow.distruntime.CloseSessionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CloseSessionRequest build() {
      org.tensorflow.distruntime.CloseSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CloseSessionRequest buildPartial() {
      org.tensorflow.distruntime.CloseSessionRequest result = new org.tensorflow.distruntime.CloseSessionRequest(this);
      result.sessionHandle_ = sessionHandle_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.distruntime.CloseSessionRequest) {
        return mergeFrom((org.tensorflow.distruntime.CloseSessionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.CloseSessionRequest other) {
      if (other == org.tensorflow.distruntime.CloseSessionRequest.getDefaultInstance()) return this;
      if (!other.getSessionHandle().isEmpty()) {
        sessionHandle_ = other.sessionHandle_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.distruntime.CloseSessionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.CloseSessionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sessionHandle_ = "";
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     */
    public java.lang.String getSessionHandle() {
      java.lang.Object ref = sessionHandle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionHandle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSessionHandleBytes() {
      java.lang.Object ref = sessionHandle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionHandle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     */
    public Builder setSessionHandle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionHandle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     */
    public Builder clearSessionHandle() {
      
      sessionHandle_ = getDefaultInstance().getSessionHandle();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     */
    public Builder setSessionHandleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionHandle_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.CloseSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.CloseSessionRequest)
  private static final org.tensorflow.distruntime.CloseSessionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.CloseSessionRequest();
  }

  public static org.tensorflow.distruntime.CloseSessionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloseSessionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CloseSessionRequest>() {
    @java.lang.Override
    public CloseSessionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CloseSessionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CloseSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloseSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.CloseSessionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

