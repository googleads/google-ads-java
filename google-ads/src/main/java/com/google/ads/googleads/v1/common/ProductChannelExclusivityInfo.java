// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/criteria.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * Availability of a product offer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.ProductChannelExclusivityInfo}
 */
public  final class ProductChannelExclusivityInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.ProductChannelExclusivityInfo)
    ProductChannelExclusivityInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductChannelExclusivityInfo.newBuilder() to construct.
  private ProductChannelExclusivityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductChannelExclusivityInfo() {
    channelExclusivity_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductChannelExclusivityInfo(
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
          case 8: {
            int rawValue = input.readEnum();

            channelExclusivity_ = rawValue;
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
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductChannelExclusivityInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductChannelExclusivityInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo.class, com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo.Builder.class);
  }

  public static final int CHANNEL_EXCLUSIVITY_FIELD_NUMBER = 1;
  private int channelExclusivity_;
  /**
   * <pre>
   * Value of the availability.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity channel_exclusivity = 1;</code>
   */
  public int getChannelExclusivityValue() {
    return channelExclusivity_;
  }
  /**
   * <pre>
   * Value of the availability.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity channel_exclusivity = 1;</code>
   */
  public com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity getChannelExclusivity() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity result = com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity.valueOf(channelExclusivity_);
    return result == null ? com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity.UNRECOGNIZED : result;
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
    if (channelExclusivity_ != com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, channelExclusivity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channelExclusivity_ != com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, channelExclusivity_);
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo other = (com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo) obj;

    boolean result = true;
    result = result && channelExclusivity_ == other.channelExclusivity_;
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
    hash = (37 * hash) + CHANNEL_EXCLUSIVITY_FIELD_NUMBER;
    hash = (53 * hash) + channelExclusivity_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo prototype) {
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
   * Availability of a product offer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.ProductChannelExclusivityInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.ProductChannelExclusivityInfo)
      com.google.ads.googleads.v1.common.ProductChannelExclusivityInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductChannelExclusivityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductChannelExclusivityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo.class, com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo.newBuilder()
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
      channelExclusivity_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.CriteriaProto.internal_static_google_ads_googleads_v1_common_ProductChannelExclusivityInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo build() {
      com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo buildPartial() {
      com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo result = new com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo(this);
      result.channelExclusivity_ = channelExclusivity_;
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
      if (other instanceof com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo other) {
      if (other == com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo.getDefaultInstance()) return this;
      if (other.channelExclusivity_ != 0) {
        setChannelExclusivityValue(other.getChannelExclusivityValue());
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
      com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int channelExclusivity_ = 0;
    /**
     * <pre>
     * Value of the availability.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity channel_exclusivity = 1;</code>
     */
    public int getChannelExclusivityValue() {
      return channelExclusivity_;
    }
    /**
     * <pre>
     * Value of the availability.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity channel_exclusivity = 1;</code>
     */
    public Builder setChannelExclusivityValue(int value) {
      channelExclusivity_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of the availability.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity channel_exclusivity = 1;</code>
     */
    public com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity getChannelExclusivity() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity result = com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity.valueOf(channelExclusivity_);
      return result == null ? com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Value of the availability.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity channel_exclusivity = 1;</code>
     */
    public Builder setChannelExclusivity(com.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      channelExclusivity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of the availability.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.ProductChannelExclusivityEnum.ProductChannelExclusivity channel_exclusivity = 1;</code>
     */
    public Builder clearChannelExclusivity() {
      
      channelExclusivity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.ProductChannelExclusivityInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.ProductChannelExclusivityInfo)
  private static final com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo();
  }

  public static com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductChannelExclusivityInfo>
      PARSER = new com.google.protobuf.AbstractParser<ProductChannelExclusivityInfo>() {
    @java.lang.Override
    public ProductChannelExclusivityInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductChannelExclusivityInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductChannelExclusivityInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductChannelExclusivityInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.ProductChannelExclusivityInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

