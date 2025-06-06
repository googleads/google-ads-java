// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/offline_user_data.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

/**
 * <pre>
 * Item attributes of the transaction.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.common.ItemAttribute}
 */
public final class ItemAttribute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.common.ItemAttribute)
    ItemAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ItemAttribute.newBuilder() to construct.
  private ItemAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ItemAttribute() {
    itemId_ = "";
    countryCode_ = "";
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ItemAttribute();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.common.OfflineUserDataProto.internal_static_google_ads_googleads_v18_common_ItemAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.common.OfflineUserDataProto.internal_static_google_ads_googleads_v18_common_ItemAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.common.ItemAttribute.class, com.google.ads.googleads.v18.common.ItemAttribute.Builder.class);
  }

  private int bitField0_;
  public static final int ITEM_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object itemId_ = "";
  /**
   * <pre>
   * A unique identifier of a product. It must be the exact same Merchant Center
   * Item ID you use in your Google Merchant Center for this product.
   * Required.
   * </pre>
   *
   * <code>string item_id = 1;</code>
   * @return The itemId.
   */
  @java.lang.Override
  public java.lang.String getItemId() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A unique identifier of a product. It must be the exact same Merchant Center
   * Item ID you use in your Google Merchant Center for this product.
   * Required.
   * </pre>
   *
   * <code>string item_id = 1;</code>
   * @return The bytes for itemId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getItemIdBytes() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MERCHANT_ID_FIELD_NUMBER = 2;
  private long merchantId_ = 0L;
  /**
   * <pre>
   * ID of the Merchant Center Account.
   * Required.
   * </pre>
   *
   * <code>optional int64 merchant_id = 2;</code>
   * @return Whether the merchantId field is set.
   */
  @java.lang.Override
  public boolean hasMerchantId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * ID of the Merchant Center Account.
   * Required.
   * </pre>
   *
   * <code>optional int64 merchant_id = 2;</code>
   * @return The merchantId.
   */
  @java.lang.Override
  public long getMerchantId() {
    return merchantId_;
  }

  public static final int COUNTRY_CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object countryCode_ = "";
  /**
   * <pre>
   * Common Locale Data Repository (CLDR) territory code of the country
   * associated with the feed where your items are uploaded. See
   * https://developers.google.com/google-ads/api/reference/data/codes-formats#country-codes
   * for more information. This information is useful to differentiate product
   * information in cases where a product (identified by item_id) is associated
   * with multiple countries.
   * </pre>
   *
   * <code>string country_code = 3;</code>
   * @return The countryCode.
   */
  @java.lang.Override
  public java.lang.String getCountryCode() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countryCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Common Locale Data Repository (CLDR) territory code of the country
   * associated with the feed where your items are uploaded. See
   * https://developers.google.com/google-ads/api/reference/data/codes-formats#country-codes
   * for more information. This information is useful to differentiate product
   * information in cases where a product (identified by item_id) is associated
   * with multiple countries.
   * </pre>
   *
   * <code>string country_code = 3;</code>
   * @return The bytes for countryCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountryCodeBytes() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      countryCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object languageCode_ = "";
  /**
   * <pre>
   * ISO 639-1 code of the language associated with the feed where your items
   * are uploaded. This information is useful to differentiate product
   * information in cases where a product (identified by item_id) is associated
   * with multiple languages.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ISO 639-1 code of the language associated with the feed where your items
   * are uploaded. This information is useful to differentiate product
   * information in cases where a product (identified by item_id) is associated
   * with multiple languages.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 5;
  private long quantity_ = 0L;
  /**
   * <pre>
   * The number of items sold. Defaults to 1 if not set.
   * </pre>
   *
   * <code>int64 quantity = 5;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public long getQuantity() {
    return quantity_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(itemId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, itemId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, merchantId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, countryCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, languageCode_);
    }
    if (quantity_ != 0L) {
      output.writeInt64(5, quantity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(itemId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, itemId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, merchantId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, countryCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, languageCode_);
    }
    if (quantity_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, quantity_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.common.ItemAttribute)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.common.ItemAttribute other = (com.google.ads.googleads.v18.common.ItemAttribute) obj;

    if (!getItemId()
        .equals(other.getItemId())) return false;
    if (hasMerchantId() != other.hasMerchantId()) return false;
    if (hasMerchantId()) {
      if (getMerchantId()
          != other.getMerchantId()) return false;
    }
    if (!getCountryCode()
        .equals(other.getCountryCode())) return false;
    if (!getLanguageCode()
        .equals(other.getLanguageCode())) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
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
    hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getItemId().hashCode();
    if (hasMerchantId()) {
      hash = (37 * hash) + MERCHANT_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMerchantId());
    }
    hash = (37 * hash) + COUNTRY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCountryCode().hashCode();
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuantity());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.common.ItemAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.common.ItemAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.ItemAttribute parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.common.ItemAttribute prototype) {
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
   * Item attributes of the transaction.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.common.ItemAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.common.ItemAttribute)
      com.google.ads.googleads.v18.common.ItemAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.common.OfflineUserDataProto.internal_static_google_ads_googleads_v18_common_ItemAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.common.OfflineUserDataProto.internal_static_google_ads_googleads_v18_common_ItemAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.common.ItemAttribute.class, com.google.ads.googleads.v18.common.ItemAttribute.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.common.ItemAttribute.newBuilder()
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
      itemId_ = "";
      merchantId_ = 0L;
      countryCode_ = "";
      languageCode_ = "";
      quantity_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.common.OfflineUserDataProto.internal_static_google_ads_googleads_v18_common_ItemAttribute_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.ItemAttribute getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.common.ItemAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.ItemAttribute build() {
      com.google.ads.googleads.v18.common.ItemAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.ItemAttribute buildPartial() {
      com.google.ads.googleads.v18.common.ItemAttribute result = new com.google.ads.googleads.v18.common.ItemAttribute(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.common.ItemAttribute result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.itemId_ = itemId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.merchantId_ = merchantId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.countryCode_ = countryCode_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.languageCode_ = languageCode_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.quantity_ = quantity_;
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
      if (other instanceof com.google.ads.googleads.v18.common.ItemAttribute) {
        return mergeFrom((com.google.ads.googleads.v18.common.ItemAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.common.ItemAttribute other) {
      if (other == com.google.ads.googleads.v18.common.ItemAttribute.getDefaultInstance()) return this;
      if (!other.getItemId().isEmpty()) {
        itemId_ = other.itemId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMerchantId()) {
        setMerchantId(other.getMerchantId());
      }
      if (!other.getCountryCode().isEmpty()) {
        countryCode_ = other.countryCode_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getQuantity() != 0L) {
        setQuantity(other.getQuantity());
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
            case 10: {
              itemId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              merchantId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              countryCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              languageCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              quantity_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object itemId_ = "";
    /**
     * <pre>
     * A unique identifier of a product. It must be the exact same Merchant Center
     * Item ID you use in your Google Merchant Center for this product.
     * Required.
     * </pre>
     *
     * <code>string item_id = 1;</code>
     * @return The itemId.
     */
    public java.lang.String getItemId() {
      java.lang.Object ref = itemId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A unique identifier of a product. It must be the exact same Merchant Center
     * Item ID you use in your Google Merchant Center for this product.
     * Required.
     * </pre>
     *
     * <code>string item_id = 1;</code>
     * @return The bytes for itemId.
     */
    public com.google.protobuf.ByteString
        getItemIdBytes() {
      java.lang.Object ref = itemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A unique identifier of a product. It must be the exact same Merchant Center
     * Item ID you use in your Google Merchant Center for this product.
     * Required.
     * </pre>
     *
     * <code>string item_id = 1;</code>
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      itemId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique identifier of a product. It must be the exact same Merchant Center
     * Item ID you use in your Google Merchant Center for this product.
     * Required.
     * </pre>
     *
     * <code>string item_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      itemId_ = getDefaultInstance().getItemId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique identifier of a product. It must be the exact same Merchant Center
     * Item ID you use in your Google Merchant Center for this product.
     * Required.
     * </pre>
     *
     * <code>string item_id = 1;</code>
     * @param value The bytes for itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      itemId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long merchantId_ ;
    /**
     * <pre>
     * ID of the Merchant Center Account.
     * Required.
     * </pre>
     *
     * <code>optional int64 merchant_id = 2;</code>
     * @return Whether the merchantId field is set.
     */
    @java.lang.Override
    public boolean hasMerchantId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * ID of the Merchant Center Account.
     * Required.
     * </pre>
     *
     * <code>optional int64 merchant_id = 2;</code>
     * @return The merchantId.
     */
    @java.lang.Override
    public long getMerchantId() {
      return merchantId_;
    }
    /**
     * <pre>
     * ID of the Merchant Center Account.
     * Required.
     * </pre>
     *
     * <code>optional int64 merchant_id = 2;</code>
     * @param value The merchantId to set.
     * @return This builder for chaining.
     */
    public Builder setMerchantId(long value) {

      merchantId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the Merchant Center Account.
     * Required.
     * </pre>
     *
     * <code>optional int64 merchant_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMerchantId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      merchantId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object countryCode_ = "";
    /**
     * <pre>
     * Common Locale Data Repository (CLDR) territory code of the country
     * associated with the feed where your items are uploaded. See
     * https://developers.google.com/google-ads/api/reference/data/codes-formats#country-codes
     * for more information. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple countries.
     * </pre>
     *
     * <code>string country_code = 3;</code>
     * @return The countryCode.
     */
    public java.lang.String getCountryCode() {
      java.lang.Object ref = countryCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Common Locale Data Repository (CLDR) territory code of the country
     * associated with the feed where your items are uploaded. See
     * https://developers.google.com/google-ads/api/reference/data/codes-formats#country-codes
     * for more information. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple countries.
     * </pre>
     *
     * <code>string country_code = 3;</code>
     * @return The bytes for countryCode.
     */
    public com.google.protobuf.ByteString
        getCountryCodeBytes() {
      java.lang.Object ref = countryCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Common Locale Data Repository (CLDR) territory code of the country
     * associated with the feed where your items are uploaded. See
     * https://developers.google.com/google-ads/api/reference/data/codes-formats#country-codes
     * for more information. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple countries.
     * </pre>
     *
     * <code>string country_code = 3;</code>
     * @param value The countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      countryCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Common Locale Data Repository (CLDR) territory code of the country
     * associated with the feed where your items are uploaded. See
     * https://developers.google.com/google-ads/api/reference/data/codes-formats#country-codes
     * for more information. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple countries.
     * </pre>
     *
     * <code>string country_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryCode() {
      countryCode_ = getDefaultInstance().getCountryCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Common Locale Data Repository (CLDR) territory code of the country
     * associated with the feed where your items are uploaded. See
     * https://developers.google.com/google-ads/api/reference/data/codes-formats#country-codes
     * for more information. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple countries.
     * </pre>
     *
     * <code>string country_code = 3;</code>
     * @param value The bytes for countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      countryCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * ISO 639-1 code of the language associated with the feed where your items
     * are uploaded. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple languages.
     * </pre>
     *
     * <code>string language_code = 4;</code>
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ISO 639-1 code of the language associated with the feed where your items
     * are uploaded. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple languages.
     * </pre>
     *
     * <code>string language_code = 4;</code>
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ISO 639-1 code of the language associated with the feed where your items
     * are uploaded. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple languages.
     * </pre>
     *
     * <code>string language_code = 4;</code>
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      languageCode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ISO 639-1 code of the language associated with the feed where your items
     * are uploaded. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple languages.
     * </pre>
     *
     * <code>string language_code = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {
      languageCode_ = getDefaultInstance().getLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ISO 639-1 code of the language associated with the feed where your items
     * are uploaded. This information is useful to differentiate product
     * information in cases where a product (identified by item_id) is associated
     * with multiple languages.
     * </pre>
     *
     * <code>string language_code = 4;</code>
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      languageCode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private long quantity_ ;
    /**
     * <pre>
     * The number of items sold. Defaults to 1 if not set.
     * </pre>
     *
     * <code>int64 quantity = 5;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public long getQuantity() {
      return quantity_;
    }
    /**
     * <pre>
     * The number of items sold. Defaults to 1 if not set.
     * </pre>
     *
     * <code>int64 quantity = 5;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(long value) {

      quantity_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of items sold. Defaults to 1 if not set.
     * </pre>
     *
     * <code>int64 quantity = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      bitField0_ = (bitField0_ & ~0x00000010);
      quantity_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.common.ItemAttribute)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.common.ItemAttribute)
  private static final com.google.ads.googleads.v18.common.ItemAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.common.ItemAttribute();
  }

  public static com.google.ads.googleads.v18.common.ItemAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ItemAttribute>
      PARSER = new com.google.protobuf.AbstractParser<ItemAttribute>() {
    @java.lang.Override
    public ItemAttribute parsePartialFrom(
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

  public static com.google.protobuf.Parser<ItemAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ItemAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.common.ItemAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

