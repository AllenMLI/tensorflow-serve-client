// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.ExtendSessionRequest}
 */
public  final class ExtendSessionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ExtendSessionRequest)
    ExtendSessionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExtendSessionRequest.newBuilder() to construct.
  private ExtendSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExtendSessionRequest() {
    sessionHandle_ = "";
    currentGraphVersion_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExtendSessionRequest(
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
          case 18: {
            org.tensorflow.framework.GraphDef.Builder subBuilder = null;
            if (graphDef_ != null) {
              subBuilder = graphDef_.toBuilder();
            }
            graphDef_ = input.readMessage(org.tensorflow.framework.GraphDef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(graphDef_);
              graphDef_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            currentGraphVersion_ = input.readInt64();
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
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ExtendSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ExtendSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.ExtendSessionRequest.class, org.tensorflow.distruntime.ExtendSessionRequest.Builder.class);
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

  public static final int GRAPH_DEF_FIELD_NUMBER = 2;
  private org.tensorflow.framework.GraphDef graphDef_;
  /**
   * <pre>
   * REQUIRED: The nodes to be added to the session's graph. If any node has
   * the same name as an existing node, the operation will fail with
   * ILLEGAL_ARGUMENT.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 2;</code>
   */
  public boolean hasGraphDef() {
    return graphDef_ != null;
  }
  /**
   * <pre>
   * REQUIRED: The nodes to be added to the session's graph. If any node has
   * the same name as an existing node, the operation will fail with
   * ILLEGAL_ARGUMENT.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 2;</code>
   */
  public org.tensorflow.framework.GraphDef getGraphDef() {
    return graphDef_ == null ? org.tensorflow.framework.GraphDef.getDefaultInstance() : graphDef_;
  }
  /**
   * <pre>
   * REQUIRED: The nodes to be added to the session's graph. If any node has
   * the same name as an existing node, the operation will fail with
   * ILLEGAL_ARGUMENT.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 2;</code>
   */
  public org.tensorflow.framework.GraphDefOrBuilder getGraphDefOrBuilder() {
    return getGraphDef();
  }

  public static final int CURRENT_GRAPH_VERSION_FIELD_NUMBER = 3;
  private long currentGraphVersion_;
  /**
   * <pre>
   * REQUIRED: The version number of the graph to be extended. This will be
   * tested against the current server-side version number, and the operation
   * will fail with FAILED_PRECONDITION if they do not match.
   * </pre>
   *
   * <code>int64 current_graph_version = 3;</code>
   */
  public long getCurrentGraphVersion() {
    return currentGraphVersion_;
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
    if (graphDef_ != null) {
      output.writeMessage(2, getGraphDef());
    }
    if (currentGraphVersion_ != 0L) {
      output.writeInt64(3, currentGraphVersion_);
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
    if (graphDef_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGraphDef());
    }
    if (currentGraphVersion_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, currentGraphVersion_);
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
    if (!(obj instanceof org.tensorflow.distruntime.ExtendSessionRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.ExtendSessionRequest other = (org.tensorflow.distruntime.ExtendSessionRequest) obj;

    boolean result = true;
    result = result && getSessionHandle()
        .equals(other.getSessionHandle());
    result = result && (hasGraphDef() == other.hasGraphDef());
    if (hasGraphDef()) {
      result = result && getGraphDef()
          .equals(other.getGraphDef());
    }
    result = result && (getCurrentGraphVersion()
        == other.getCurrentGraphVersion());
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
    if (hasGraphDef()) {
      hash = (37 * hash) + GRAPH_DEF_FIELD_NUMBER;
      hash = (53 * hash) + getGraphDef().hashCode();
    }
    hash = (37 * hash) + CURRENT_GRAPH_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCurrentGraphVersion());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ExtendSessionRequest parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.ExtendSessionRequest prototype) {
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
   * Protobuf type {@code tensorflow.ExtendSessionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ExtendSessionRequest)
      org.tensorflow.distruntime.ExtendSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ExtendSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ExtendSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.ExtendSessionRequest.class, org.tensorflow.distruntime.ExtendSessionRequest.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.ExtendSessionRequest.newBuilder()
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

      if (graphDefBuilder_ == null) {
        graphDef_ = null;
      } else {
        graphDef_ = null;
        graphDefBuilder_ = null;
      }
      currentGraphVersion_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ExtendSessionRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.ExtendSessionRequest getDefaultInstanceForType() {
      return org.tensorflow.distruntime.ExtendSessionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.ExtendSessionRequest build() {
      org.tensorflow.distruntime.ExtendSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.ExtendSessionRequest buildPartial() {
      org.tensorflow.distruntime.ExtendSessionRequest result = new org.tensorflow.distruntime.ExtendSessionRequest(this);
      result.sessionHandle_ = sessionHandle_;
      if (graphDefBuilder_ == null) {
        result.graphDef_ = graphDef_;
      } else {
        result.graphDef_ = graphDefBuilder_.build();
      }
      result.currentGraphVersion_ = currentGraphVersion_;
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
      if (other instanceof org.tensorflow.distruntime.ExtendSessionRequest) {
        return mergeFrom((org.tensorflow.distruntime.ExtendSessionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.ExtendSessionRequest other) {
      if (other == org.tensorflow.distruntime.ExtendSessionRequest.getDefaultInstance()) return this;
      if (!other.getSessionHandle().isEmpty()) {
        sessionHandle_ = other.sessionHandle_;
        onChanged();
      }
      if (other.hasGraphDef()) {
        mergeGraphDef(other.getGraphDef());
      }
      if (other.getCurrentGraphVersion() != 0L) {
        setCurrentGraphVersion(other.getCurrentGraphVersion());
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
      org.tensorflow.distruntime.ExtendSessionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.ExtendSessionRequest) e.getUnfinishedMessage();
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

    private org.tensorflow.framework.GraphDef graphDef_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.GraphDef, org.tensorflow.framework.GraphDef.Builder, org.tensorflow.framework.GraphDefOrBuilder> graphDefBuilder_;
    /**
     * <pre>
     * REQUIRED: The nodes to be added to the session's graph. If any node has
     * the same name as an existing node, the operation will fail with
     * ILLEGAL_ARGUMENT.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 2;</code>
     */
    public boolean hasGraphDef() {
      return graphDefBuilder_ != null || graphDef_ != null;
    }
    /**
     * <pre>
     * REQUIRED: The nodes to be added to the session's graph. If any node has
     * the same name as an existing node, the operation will fail with
     * ILLEGAL_ARGUMENT.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 2;</code>
     */
    public org.tensorflow.framework.GraphDef getGraphDef() {
      if (graphDefBuilder_ == null) {
        return graphDef_ == null ? org.tensorflow.framework.GraphDef.getDefaultInstance() : graphDef_;
      } else {
        return graphDefBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * REQUIRED: The nodes to be added to the session's graph. If any node has
     * the same name as an existing node, the operation will fail with
     * ILLEGAL_ARGUMENT.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 2;</code>
     */
    public Builder setGraphDef(org.tensorflow.framework.GraphDef value) {
      if (graphDefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        graphDef_ = value;
        onChanged();
      } else {
        graphDefBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * REQUIRED: The nodes to be added to the session's graph. If any node has
     * the same name as an existing node, the operation will fail with
     * ILLEGAL_ARGUMENT.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 2;</code>
     */
    public Builder setGraphDef(
        org.tensorflow.framework.GraphDef.Builder builderForValue) {
      if (graphDefBuilder_ == null) {
        graphDef_ = builderForValue.build();
        onChanged();
      } else {
        graphDefBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * REQUIRED: The nodes to be added to the session's graph. If any node has
     * the same name as an existing node, the operation will fail with
     * ILLEGAL_ARGUMENT.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 2;</code>
     */
    public Builder mergeGraphDef(org.tensorflow.framework.GraphDef value) {
      if (graphDefBuilder_ == null) {
        if (graphDef_ != null) {
          graphDef_ =
            org.tensorflow.framework.GraphDef.newBuilder(graphDef_).mergeFrom(value).buildPartial();
        } else {
          graphDef_ = value;
        }
        onChanged();
      } else {
        graphDefBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * REQUIRED: The nodes to be added to the session's graph. If any node has
     * the same name as an existing node, the operation will fail with
     * ILLEGAL_ARGUMENT.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 2;</code>
     */
    public Builder clearGraphDef() {
      if (graphDefBuilder_ == null) {
        graphDef_ = null;
        onChanged();
      } else {
        graphDef_ = null;
        graphDefBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * REQUIRED: The nodes to be added to the session's graph. If any node has
     * the same name as an existing node, the operation will fail with
     * ILLEGAL_ARGUMENT.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 2;</code>
     */
    public org.tensorflow.framework.GraphDef.Builder getGraphDefBuilder() {
      
      onChanged();
      return getGraphDefFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * REQUIRED: The nodes to be added to the session's graph. If any node has
     * the same name as an existing node, the operation will fail with
     * ILLEGAL_ARGUMENT.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 2;</code>
     */
    public org.tensorflow.framework.GraphDefOrBuilder getGraphDefOrBuilder() {
      if (graphDefBuilder_ != null) {
        return graphDefBuilder_.getMessageOrBuilder();
      } else {
        return graphDef_ == null ?
            org.tensorflow.framework.GraphDef.getDefaultInstance() : graphDef_;
      }
    }
    /**
     * <pre>
     * REQUIRED: The nodes to be added to the session's graph. If any node has
     * the same name as an existing node, the operation will fail with
     * ILLEGAL_ARGUMENT.
     * </pre>
     *
     * <code>.tensorflow.GraphDef graph_def = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.GraphDef, org.tensorflow.framework.GraphDef.Builder, org.tensorflow.framework.GraphDefOrBuilder> 
        getGraphDefFieldBuilder() {
      if (graphDefBuilder_ == null) {
        graphDefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.GraphDef, org.tensorflow.framework.GraphDef.Builder, org.tensorflow.framework.GraphDefOrBuilder>(
                getGraphDef(),
                getParentForChildren(),
                isClean());
        graphDef_ = null;
      }
      return graphDefBuilder_;
    }

    private long currentGraphVersion_ ;
    /**
     * <pre>
     * REQUIRED: The version number of the graph to be extended. This will be
     * tested against the current server-side version number, and the operation
     * will fail with FAILED_PRECONDITION if they do not match.
     * </pre>
     *
     * <code>int64 current_graph_version = 3;</code>
     */
    public long getCurrentGraphVersion() {
      return currentGraphVersion_;
    }
    /**
     * <pre>
     * REQUIRED: The version number of the graph to be extended. This will be
     * tested against the current server-side version number, and the operation
     * will fail with FAILED_PRECONDITION if they do not match.
     * </pre>
     *
     * <code>int64 current_graph_version = 3;</code>
     */
    public Builder setCurrentGraphVersion(long value) {
      
      currentGraphVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: The version number of the graph to be extended. This will be
     * tested against the current server-side version number, and the operation
     * will fail with FAILED_PRECONDITION if they do not match.
     * </pre>
     *
     * <code>int64 current_graph_version = 3;</code>
     */
    public Builder clearCurrentGraphVersion() {
      
      currentGraphVersion_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.ExtendSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ExtendSessionRequest)
  private static final org.tensorflow.distruntime.ExtendSessionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.ExtendSessionRequest();
  }

  public static org.tensorflow.distruntime.ExtendSessionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExtendSessionRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExtendSessionRequest>() {
    @java.lang.Override
    public ExtendSessionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExtendSessionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExtendSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExtendSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.ExtendSessionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

