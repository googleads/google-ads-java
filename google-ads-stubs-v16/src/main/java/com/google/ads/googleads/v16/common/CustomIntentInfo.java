// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/criteria.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * A custom intent criterion.
 * A criterion of this type is only targetable.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.CustomIntentInfo}
 */
public final class CustomIntentInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.CustomIntentInfo)
    CustomIntentInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomIntentInfo.newBuilder() to construct.
  private CustomIntentInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomIntentInfo() {
    customIntent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomIntentInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_CustomIntentInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_CustomIntentInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.CustomIntentInfo.class, com.google.ads.googleads.v16.common.CustomIntentInfo.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOM_INTENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customIntent_ = "";
  /**
   * <pre>
   * The CustomInterest resource name.
   * </pre>
   *
   * <code>optional string custom_intent = 2;</code>
   * @return Whether the customIntent field is set.
   */
  @java.lang.Override
  public boolean hasCustomIntent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The CustomInterest resource name.
   * </pre>
   *
   * <code>optional string custom_intent = 2;</code>
   * @return The customIntent.
   */
  @java.lang.Override
  public java.lang.String getCustomIntent() {
    java.lang.Object ref = customIntent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customIntent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The CustomInterest resource name.
   * </pre>
   *
   * <code>optional string custom_intent = 2;</code>
   * @return The bytes for customIntent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomIntentBytes() {
    java.lang.Object ref = customIntent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customIntent_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, customIntent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, customIntent_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v16.common.CustomIntentInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.CustomIntentInfo other = (com.google.ads.googleads.v16.common.CustomIntentInfo) obj;

    if (hasCustomIntent() != other.hasCustomIntent()) return false;
    if (hasCustomIntent()) {
      if (!getCustomIntent()
          .equals(other.getCustomIntent())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCustomIntent()) {
      hash = (37 * hash) + CUSTOM_INTENT_FIELD_NUMBER;
      hash = (53 * hash) + getCustomIntent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.CustomIntentInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.CustomIntentInfo prototype) {
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
   * <pre>
   * A custom intent criterion.
   * A criterion of this type is only targetable.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.CustomIntentInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.CustomIntentInfo)
      com.google.ads.googleads.v16.common.CustomIntentInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_CustomIntentInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_CustomIntentInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.CustomIntentInfo.class, com.google.ads.googleads.v16.common.CustomIntentInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.CustomIntentInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      customIntent_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.CriteriaProto.internal_static_google_ads_googleads_v16_common_CustomIntentInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.CustomIntentInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.CustomIntentInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.CustomIntentInfo build() {
      com.google.ads.googleads.v16.common.CustomIntentInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.CustomIntentInfo buildPartial() {
      com.google.ads.googleads.v16.common.CustomIntentInfo result = new com.google.ads.googleads.v16.common.CustomIntentInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.CustomIntentInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customIntent_ = customIntent_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v16.common.CustomIntentInfo) {
        return mergeFrom((com.google.ads.googleads.v16.common.CustomIntentInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.CustomIntentInfo other) {
      if (other == com.google.ads.googleads.v16.common.CustomIntentInfo.getDefaultInstance()) return this;
      if (other.hasCustomIntent()) {
        customIntent_ = other.customIntent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18: {
              customIntent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object customIntent_ = "";
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>optional string custom_intent = 2;</code>
     * @return Whether the customIntent field is set.
     */
    public boolean hasCustomIntent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>optional string custom_intent = 2;</code>
     * @return The customIntent.
     */
    public java.lang.String getCustomIntent() {
      java.lang.Object ref = customIntent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customIntent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>optional string custom_intent = 2;</code>
     * @return The bytes for customIntent.
     */
    public com.google.protobuf.ByteString
        getCustomIntentBytes() {
      java.lang.Object ref = customIntent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customIntent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>optional string custom_intent = 2;</code>
     * @param value The customIntent to set.
     * @return This builder for chaining.
     */
    public Builder setCustomIntent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customIntent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>optional string custom_intent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomIntent() {
      customIntent_ = getDefaultInstance().getCustomIntent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>optional string custom_intent = 2;</code>
     * @param value The bytes for customIntent to set.
     * @return This builder for chaining.
     */
    public Builder setCustomIntentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customIntent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.CustomIntentInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.CustomIntentInfo)
  private static final com.google.ads.googleads.v16.common.CustomIntentInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.CustomIntentInfo();
  }

  public static com.google.ads.googleads.v16.common.CustomIntentInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomIntentInfo>
      PARSER = new com.google.protobuf.AbstractParser<CustomIntentInfo>() {
    @java.lang.Override
    public CustomIntentInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CustomIntentInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomIntentInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.CustomIntentInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

