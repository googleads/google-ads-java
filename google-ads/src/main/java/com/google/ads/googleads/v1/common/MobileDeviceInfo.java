// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/criteria.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * A mobile device criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.MobileDeviceInfo}
 */
public  final class MobileDeviceInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.MobileDeviceInfo)
    MobileDeviceInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MobileDeviceInfo.newBuilder() to construct.
  private MobileDeviceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MobileDeviceInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MobileDeviceInfo(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (mobileDeviceConstant_ != null) {
              subBuilder = mobileDeviceConstant_.toBuilder();
            }
            mobileDeviceConstant_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(mobileDeviceConstant_);
              mobileDeviceConstant_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_MobileDeviceInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_MobileDeviceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.MobileDeviceInfo.class, com.google.ads.googleads.v1.common.MobileDeviceInfo.Builder.class);
  }

  public static final int MOBILE_DEVICE_CONSTANT_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue mobileDeviceConstant_;
  /**
   * <pre>
   * The mobile device constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
   */
  public boolean hasMobileDeviceConstant() {
    return mobileDeviceConstant_ != null;
  }
  /**
   * <pre>
   * The mobile device constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
   */
  public com.google.protobuf.StringValue getMobileDeviceConstant() {
    return mobileDeviceConstant_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : mobileDeviceConstant_;
  }
  /**
   * <pre>
   * The mobile device constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getMobileDeviceConstantOrBuilder() {
    return getMobileDeviceConstant();
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
    if (mobileDeviceConstant_ != null) {
      output.writeMessage(1, getMobileDeviceConstant());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mobileDeviceConstant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMobileDeviceConstant());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.MobileDeviceInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.MobileDeviceInfo other = (com.google.ads.googleads.v1.common.MobileDeviceInfo) obj;

    boolean result = true;
    result = result && (hasMobileDeviceConstant() == other.hasMobileDeviceConstant());
    if (hasMobileDeviceConstant()) {
      result = result && getMobileDeviceConstant()
          .equals(other.getMobileDeviceConstant());
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
    if (hasMobileDeviceConstant()) {
      hash = (37 * hash) + MOBILE_DEVICE_CONSTANT_FIELD_NUMBER;
      hash = (53 * hash) + getMobileDeviceConstant().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.MobileDeviceInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.MobileDeviceInfo prototype) {
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
   * A mobile device criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.MobileDeviceInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.MobileDeviceInfo)
      com.google.ads.googleads.v1.common.MobileDeviceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_MobileDeviceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_MobileDeviceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.MobileDeviceInfo.class, com.google.ads.googleads.v1.common.MobileDeviceInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.MobileDeviceInfo.newBuilder()
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
      if (mobileDeviceConstantBuilder_ == null) {
        mobileDeviceConstant_ = null;
      } else {
        mobileDeviceConstant_ = null;
        mobileDeviceConstantBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_MobileDeviceInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.MobileDeviceInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.MobileDeviceInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.MobileDeviceInfo build() {
      com.google.ads.googleads.v1.common.MobileDeviceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.MobileDeviceInfo buildPartial() {
      com.google.ads.googleads.v1.common.MobileDeviceInfo result = new com.google.ads.googleads.v1.common.MobileDeviceInfo(this);
      if (mobileDeviceConstantBuilder_ == null) {
        result.mobileDeviceConstant_ = mobileDeviceConstant_;
      } else {
        result.mobileDeviceConstant_ = mobileDeviceConstantBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.common.MobileDeviceInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.MobileDeviceInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.MobileDeviceInfo other) {
      if (other == com.google.ads.googleads.v1.common.MobileDeviceInfo.getDefaultInstance()) return this;
      if (other.hasMobileDeviceConstant()) {
        mergeMobileDeviceConstant(other.getMobileDeviceConstant());
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
      com.google.ads.googleads.v1.common.MobileDeviceInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.MobileDeviceInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue mobileDeviceConstant_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> mobileDeviceConstantBuilder_;
    /**
     * <pre>
     * The mobile device constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
     */
    public boolean hasMobileDeviceConstant() {
      return mobileDeviceConstantBuilder_ != null || mobileDeviceConstant_ != null;
    }
    /**
     * <pre>
     * The mobile device constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
     */
    public com.google.protobuf.StringValue getMobileDeviceConstant() {
      if (mobileDeviceConstantBuilder_ == null) {
        return mobileDeviceConstant_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : mobileDeviceConstant_;
      } else {
        return mobileDeviceConstantBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mobile device constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
     */
    public Builder setMobileDeviceConstant(com.google.protobuf.StringValue value) {
      if (mobileDeviceConstantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mobileDeviceConstant_ = value;
        onChanged();
      } else {
        mobileDeviceConstantBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mobile device constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
     */
    public Builder setMobileDeviceConstant(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (mobileDeviceConstantBuilder_ == null) {
        mobileDeviceConstant_ = builderForValue.build();
        onChanged();
      } else {
        mobileDeviceConstantBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mobile device constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
     */
    public Builder mergeMobileDeviceConstant(com.google.protobuf.StringValue value) {
      if (mobileDeviceConstantBuilder_ == null) {
        if (mobileDeviceConstant_ != null) {
          mobileDeviceConstant_ =
            com.google.protobuf.StringValue.newBuilder(mobileDeviceConstant_).mergeFrom(value).buildPartial();
        } else {
          mobileDeviceConstant_ = value;
        }
        onChanged();
      } else {
        mobileDeviceConstantBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mobile device constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
     */
    public Builder clearMobileDeviceConstant() {
      if (mobileDeviceConstantBuilder_ == null) {
        mobileDeviceConstant_ = null;
        onChanged();
      } else {
        mobileDeviceConstant_ = null;
        mobileDeviceConstantBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mobile device constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getMobileDeviceConstantBuilder() {
      
      onChanged();
      return getMobileDeviceConstantFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mobile device constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getMobileDeviceConstantOrBuilder() {
      if (mobileDeviceConstantBuilder_ != null) {
        return mobileDeviceConstantBuilder_.getMessageOrBuilder();
      } else {
        return mobileDeviceConstant_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : mobileDeviceConstant_;
      }
    }
    /**
     * <pre>
     * The mobile device constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue mobile_device_constant = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getMobileDeviceConstantFieldBuilder() {
      if (mobileDeviceConstantBuilder_ == null) {
        mobileDeviceConstantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getMobileDeviceConstant(),
                getParentForChildren(),
                isClean());
        mobileDeviceConstant_ = null;
      }
      return mobileDeviceConstantBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.MobileDeviceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.MobileDeviceInfo)
  private static final com.google.ads.googleads.v1.common.MobileDeviceInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.MobileDeviceInfo();
  }

  public static com.google.ads.googleads.v1.common.MobileDeviceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MobileDeviceInfo>
      PARSER = new com.google.protobuf.AbstractParser<MobileDeviceInfo>() {
    @java.lang.Override
    public MobileDeviceInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MobileDeviceInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MobileDeviceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MobileDeviceInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.MobileDeviceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

