// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/criteria.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.common;

/**
 * <pre>
 * Bidding category of a product offer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.common.ProductBiddingCategoryInfo}
 */
public final class ProductBiddingCategoryInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.common.ProductBiddingCategoryInfo)
    ProductBiddingCategoryInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductBiddingCategoryInfo.newBuilder() to construct.
  private ProductBiddingCategoryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductBiddingCategoryInfo() {
    level_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductBiddingCategoryInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_ProductBiddingCategoryInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_ProductBiddingCategoryInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo.class, com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 4;
  private long id_ = 0L;
  /**
   * <pre>
   * ID of the product bidding category.
   *
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436
   * </pre>
   *
   * <code>optional int64 id = 4;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * ID of the product bidding category.
   *
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436
   * </pre>
   *
   * <code>optional int64 id = 4;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int LEVEL_FIELD_NUMBER = 3;
  private int level_ = 0;
  /**
   * <pre>
   * Level of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 3;</code>
   * @return The enum numeric value on the wire for level.
   */
  @java.lang.Override public int getLevelValue() {
    return level_;
  }
  /**
   * <pre>
   * Level of the product bidding category.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 3;</code>
   * @return The level.
   */
  @java.lang.Override public com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel getLevel() {
    com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel result = com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel.forNumber(level_);
    return result == null ? com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel.UNRECOGNIZED : result;
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
    if (level_ != com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, level_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(4, id_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (level_ != com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, level_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, id_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo other = (com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (level_ != other.level_) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + level_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo prototype) {
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
   * Bidding category of a product offer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.common.ProductBiddingCategoryInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.common.ProductBiddingCategoryInfo)
      com.google.ads.googleads.v14.common.ProductBiddingCategoryInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_ProductBiddingCategoryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_ProductBiddingCategoryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo.class, com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo.newBuilder()
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
      id_ = 0L;
      level_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_ProductBiddingCategoryInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo build() {
      com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo buildPartial() {
      com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo result = new com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.level_ = level_;
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
      if (other instanceof com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo) {
        return mergeFrom((com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo other) {
      if (other == com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo.getDefaultInstance()) return this;
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.level_ != 0) {
        setLevelValue(other.getLevelValue());
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
            case 24: {
              level_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 32: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 32
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

    private long id_ ;
    /**
     * <pre>
     * ID of the product bidding category.
     *
     * This ID is equivalent to the google_product_category ID as described in
     * this article: https://support.google.com/merchants/answer/6324436
     * </pre>
     *
     * <code>optional int64 id = 4;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * ID of the product bidding category.
     *
     * This ID is equivalent to the google_product_category ID as described in
     * this article: https://support.google.com/merchants/answer/6324436
     * </pre>
     *
     * <code>optional int64 id = 4;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * ID of the product bidding category.
     *
     * This ID is equivalent to the google_product_category ID as described in
     * this article: https://support.google.com/merchants/answer/6324436
     * </pre>
     *
     * <code>optional int64 id = 4;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the product bidding category.
     *
     * This ID is equivalent to the google_product_category ID as described in
     * this article: https://support.google.com/merchants/answer/6324436
     * </pre>
     *
     * <code>optional int64 id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private int level_ = 0;
    /**
     * <pre>
     * Level of the product bidding category.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 3;</code>
     * @return The enum numeric value on the wire for level.
     */
    @java.lang.Override public int getLevelValue() {
      return level_;
    }
    /**
     * <pre>
     * Level of the product bidding category.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 3;</code>
     * @param value The enum numeric value on the wire for level to set.
     * @return This builder for chaining.
     */
    public Builder setLevelValue(int value) {
      level_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Level of the product bidding category.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 3;</code>
     * @return The level.
     */
    @java.lang.Override
    public com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel getLevel() {
      com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel result = com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel.forNumber(level_);
      return result == null ? com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Level of the product bidding category.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 3;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      level_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Level of the product bidding category.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel level = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      level_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.common.ProductBiddingCategoryInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.common.ProductBiddingCategoryInfo)
  private static final com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo();
  }

  public static com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductBiddingCategoryInfo>
      PARSER = new com.google.protobuf.AbstractParser<ProductBiddingCategoryInfo>() {
    @java.lang.Override
    public ProductBiddingCategoryInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProductBiddingCategoryInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductBiddingCategoryInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.common.ProductBiddingCategoryInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

