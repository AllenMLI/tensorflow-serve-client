// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/example/example.proto

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.Example}
 */
public  final class Example extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.Example)
    ExampleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Example.newBuilder() to construct.
  private Example(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Example() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Example(
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
            org.tensorflow.example.Features.Builder subBuilder = null;
            if (features_ != null) {
              subBuilder = features_.toBuilder();
            }
            features_ = input.readMessage(org.tensorflow.example.Features.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(features_);
              features_ = subBuilder.buildPartial();
            }

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
    return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_Example_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_Example_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.Example.class, org.tensorflow.example.Example.Builder.class);
  }

  public static final int FEATURES_FIELD_NUMBER = 1;
  private org.tensorflow.example.Features features_;
  /**
   * <code>.tensorflow.Features features = 1;</code>
   */
  public boolean hasFeatures() {
    return features_ != null;
  }
  /**
   * <code>.tensorflow.Features features = 1;</code>
   */
  public org.tensorflow.example.Features getFeatures() {
    return features_ == null ? org.tensorflow.example.Features.getDefaultInstance() : features_;
  }
  /**
   * <code>.tensorflow.Features features = 1;</code>
   */
  public org.tensorflow.example.FeaturesOrBuilder getFeaturesOrBuilder() {
    return getFeatures();
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
    if (features_ != null) {
      output.writeMessage(1, getFeatures());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (features_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFeatures());
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
    if (!(obj instanceof org.tensorflow.example.Example)) {
      return super.equals(obj);
    }
    org.tensorflow.example.Example other = (org.tensorflow.example.Example) obj;

    boolean result = true;
    result = result && (hasFeatures() == other.hasFeatures());
    if (hasFeatures()) {
      result = result && getFeatures()
          .equals(other.getFeatures());
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
    if (hasFeatures()) {
      hash = (37 * hash) + FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getFeatures().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.example.Example parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.Example parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.Example parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.Example parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.Example parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.Example parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.Example parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.Example parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.Example parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.Example parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.Example parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.Example parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.Example prototype) {
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
   * Protobuf type {@code tensorflow.Example}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.Example)
      org.tensorflow.example.ExampleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_Example_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_Example_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.Example.class, org.tensorflow.example.Example.Builder.class);
    }

    // Construct using org.tensorflow.example.Example.newBuilder()
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
      if (featuresBuilder_ == null) {
        features_ = null;
      } else {
        features_ = null;
        featuresBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_Example_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.example.Example getDefaultInstanceForType() {
      return org.tensorflow.example.Example.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.example.Example build() {
      org.tensorflow.example.Example result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.example.Example buildPartial() {
      org.tensorflow.example.Example result = new org.tensorflow.example.Example(this);
      if (featuresBuilder_ == null) {
        result.features_ = features_;
      } else {
        result.features_ = featuresBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.example.Example) {
        return mergeFrom((org.tensorflow.example.Example)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.example.Example other) {
      if (other == org.tensorflow.example.Example.getDefaultInstance()) return this;
      if (other.hasFeatures()) {
        mergeFeatures(other.getFeatures());
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
      org.tensorflow.example.Example parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.example.Example) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.tensorflow.example.Features features_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.Features, org.tensorflow.example.Features.Builder, org.tensorflow.example.FeaturesOrBuilder> featuresBuilder_;
    /**
     * <code>.tensorflow.Features features = 1;</code>
     */
    public boolean hasFeatures() {
      return featuresBuilder_ != null || features_ != null;
    }
    /**
     * <code>.tensorflow.Features features = 1;</code>
     */
    public org.tensorflow.example.Features getFeatures() {
      if (featuresBuilder_ == null) {
        return features_ == null ? org.tensorflow.example.Features.getDefaultInstance() : features_;
      } else {
        return featuresBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.Features features = 1;</code>
     */
    public Builder setFeatures(org.tensorflow.example.Features value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        features_ = value;
        onChanged();
      } else {
        featuresBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features features = 1;</code>
     */
    public Builder setFeatures(
        org.tensorflow.example.Features.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        features_ = builderForValue.build();
        onChanged();
      } else {
        featuresBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features features = 1;</code>
     */
    public Builder mergeFeatures(org.tensorflow.example.Features value) {
      if (featuresBuilder_ == null) {
        if (features_ != null) {
          features_ =
            org.tensorflow.example.Features.newBuilder(features_).mergeFrom(value).buildPartial();
        } else {
          features_ = value;
        }
        onChanged();
      } else {
        featuresBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features features = 1;</code>
     */
    public Builder clearFeatures() {
      if (featuresBuilder_ == null) {
        features_ = null;
        onChanged();
      } else {
        features_ = null;
        featuresBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features features = 1;</code>
     */
    public org.tensorflow.example.Features.Builder getFeaturesBuilder() {
      
      onChanged();
      return getFeaturesFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.Features features = 1;</code>
     */
    public org.tensorflow.example.FeaturesOrBuilder getFeaturesOrBuilder() {
      if (featuresBuilder_ != null) {
        return featuresBuilder_.getMessageOrBuilder();
      } else {
        return features_ == null ?
            org.tensorflow.example.Features.getDefaultInstance() : features_;
      }
    }
    /**
     * <code>.tensorflow.Features features = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.Features, org.tensorflow.example.Features.Builder, org.tensorflow.example.FeaturesOrBuilder> 
        getFeaturesFieldBuilder() {
      if (featuresBuilder_ == null) {
        featuresBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.example.Features, org.tensorflow.example.Features.Builder, org.tensorflow.example.FeaturesOrBuilder>(
                getFeatures(),
                getParentForChildren(),
                isClean());
        features_ = null;
      }
      return featuresBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.Example)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.Example)
  private static final org.tensorflow.example.Example DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.Example();
  }

  public static org.tensorflow.example.Example getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Example>
      PARSER = new com.google.protobuf.AbstractParser<Example>() {
    @java.lang.Override
    public Example parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Example(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Example> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Example> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.example.Example getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

