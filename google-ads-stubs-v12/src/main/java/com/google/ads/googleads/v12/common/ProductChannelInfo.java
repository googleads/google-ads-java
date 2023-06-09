// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/criteria.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * Locality of a product offer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.ProductChannelInfo}
 */
public final class ProductChannelInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.ProductChannelInfo)
    ProductChannelInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductChannelInfo.newBuilder() to construct.
  private ProductChannelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductChannelInfo() {
    channel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductChannelInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ProductChannelInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ProductChannelInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.ProductChannelInfo.class, com.google.ads.googleads.v12.common.ProductChannelInfo.Builder.class);
  }

  public static final int CHANNEL_FIELD_NUMBER = 1;
  private int channel_ = 0;
  /**
   * <pre>
   * Value of the locality.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel channel = 1;</code>
   * @return The enum numeric value on the wire for channel.
   */
  @java.lang.Override public int getChannelValue() {
    return channel_;
  }
  /**
   * <pre>
   * Value of the locality.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel channel = 1;</code>
   * @return The channel.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel getChannel() {
    com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel result = com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel.forNumber(channel_);
    return result == null ? com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel.UNRECOGNIZED : result;
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
    if (channel_ != com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, channel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channel_ != com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, channel_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.ProductChannelInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.ProductChannelInfo other = (com.google.ads.googleads.v12.common.ProductChannelInfo) obj;

    if (channel_ != other.channel_) return false;
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
    hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + channel_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.ProductChannelInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.ProductChannelInfo prototype) {
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
   * Locality of a product offer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.ProductChannelInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.ProductChannelInfo)
      com.google.ads.googleads.v12.common.ProductChannelInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ProductChannelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ProductChannelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.ProductChannelInfo.class, com.google.ads.googleads.v12.common.ProductChannelInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.ProductChannelInfo.newBuilder()
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
      channel_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ProductChannelInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.ProductChannelInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.ProductChannelInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.ProductChannelInfo build() {
      com.google.ads.googleads.v12.common.ProductChannelInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.ProductChannelInfo buildPartial() {
      com.google.ads.googleads.v12.common.ProductChannelInfo result = new com.google.ads.googleads.v12.common.ProductChannelInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.ProductChannelInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.channel_ = channel_;
      }
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
      if (other instanceof com.google.ads.googleads.v12.common.ProductChannelInfo) {
        return mergeFrom((com.google.ads.googleads.v12.common.ProductChannelInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.ProductChannelInfo other) {
      if (other == com.google.ads.googleads.v12.common.ProductChannelInfo.getDefaultInstance()) return this;
      if (other.channel_ != 0) {
        setChannelValue(other.getChannelValue());
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
            case 8: {
              channel_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int channel_ = 0;
    /**
     * <pre>
     * Value of the locality.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel channel = 1;</code>
     * @return The enum numeric value on the wire for channel.
     */
    @java.lang.Override public int getChannelValue() {
      return channel_;
    }
    /**
     * <pre>
     * Value of the locality.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel channel = 1;</code>
     * @param value The enum numeric value on the wire for channel to set.
     * @return This builder for chaining.
     */
    public Builder setChannelValue(int value) {
      channel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of the locality.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel channel = 1;</code>
     * @return The channel.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel getChannel() {
      com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel result = com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel.forNumber(channel_);
      return result == null ? com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Value of the locality.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel channel = 1;</code>
     * @param value The channel to set.
     * @return This builder for chaining.
     */
    public Builder setChannel(com.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      channel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value of the locality.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ProductChannelEnum.ProductChannel channel = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChannel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      channel_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.ProductChannelInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.ProductChannelInfo)
  private static final com.google.ads.googleads.v12.common.ProductChannelInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.ProductChannelInfo();
  }

  public static com.google.ads.googleads.v12.common.ProductChannelInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductChannelInfo>
      PARSER = new com.google.protobuf.AbstractParser<ProductChannelInfo>() {
    @java.lang.Override
    public ProductChannelInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProductChannelInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductChannelInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.ProductChannelInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

