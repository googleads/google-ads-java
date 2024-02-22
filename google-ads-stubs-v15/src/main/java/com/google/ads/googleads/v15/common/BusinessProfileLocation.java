// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.common;

/**
 * <pre>
 * Business Profile location data synced from the linked Business Profile
 * account.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.common.BusinessProfileLocation}
 */
public final class BusinessProfileLocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.common.BusinessProfileLocation)
    BusinessProfileLocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BusinessProfileLocation.newBuilder() to construct.
  private BusinessProfileLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BusinessProfileLocation() {
    labels_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    storeCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BusinessProfileLocation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_BusinessProfileLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_BusinessProfileLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.common.BusinessProfileLocation.class, com.google.ads.googleads.v15.common.BusinessProfileLocation.Builder.class);
  }

  public static final int LABELS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList labels_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Advertiser specified label for the location on the Business Profile
   * account. This is synced from the Business Profile account.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @return A list containing the labels.
   */
  public com.google.protobuf.ProtocolStringList
      getLabelsList() {
    return labels_;
  }
  /**
   * <pre>
   * Advertiser specified label for the location on the Business Profile
   * account. This is synced from the Business Profile account.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @return The count of labels.
   */
  public int getLabelsCount() {
    return labels_.size();
  }
  /**
   * <pre>
   * Advertiser specified label for the location on the Business Profile
   * account. This is synced from the Business Profile account.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  public java.lang.String getLabels(int index) {
    return labels_.get(index);
  }
  /**
   * <pre>
   * Advertiser specified label for the location on the Business Profile
   * account. This is synced from the Business Profile account.
   * </pre>
   *
   * <code>repeated string labels = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  public com.google.protobuf.ByteString
      getLabelsBytes(int index) {
    return labels_.getByteString(index);
  }

  public static final int STORE_CODE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object storeCode_ = "";
  /**
   * <pre>
   * Business Profile store code of this location. This is synced from the
   * Business Profile account.
   * </pre>
   *
   * <code>string store_code = 2;</code>
   * @return The storeCode.
   */
  @java.lang.Override
  public java.lang.String getStoreCode() {
    java.lang.Object ref = storeCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storeCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Business Profile store code of this location. This is synced from the
   * Business Profile account.
   * </pre>
   *
   * <code>string store_code = 2;</code>
   * @return The bytes for storeCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStoreCodeBytes() {
    java.lang.Object ref = storeCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      storeCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LISTING_ID_FIELD_NUMBER = 3;
  private long listingId_ = 0L;
  /**
   * <pre>
   * Listing ID of this Business Profile location. This is synced from the
   * linked Business Profile account.
   * </pre>
   *
   * <code>int64 listing_id = 3;</code>
   * @return The listingId.
   */
  @java.lang.Override
  public long getListingId() {
    return listingId_;
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
    for (int i = 0; i < labels_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, labels_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, storeCode_);
    }
    if (listingId_ != 0L) {
      output.writeInt64(3, listingId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < labels_.size(); i++) {
        dataSize += computeStringSizeNoTag(labels_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLabelsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storeCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, storeCode_);
    }
    if (listingId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, listingId_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.common.BusinessProfileLocation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.common.BusinessProfileLocation other = (com.google.ads.googleads.v15.common.BusinessProfileLocation) obj;

    if (!getLabelsList()
        .equals(other.getLabelsList())) return false;
    if (!getStoreCode()
        .equals(other.getStoreCode())) return false;
    if (getListingId()
        != other.getListingId()) return false;
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
    if (getLabelsCount() > 0) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + getLabelsList().hashCode();
    }
    hash = (37 * hash) + STORE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getStoreCode().hashCode();
    hash = (37 * hash) + LISTING_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getListingId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.BusinessProfileLocation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.common.BusinessProfileLocation prototype) {
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
   * Business Profile location data synced from the linked Business Profile
   * account.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.common.BusinessProfileLocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.common.BusinessProfileLocation)
      com.google.ads.googleads.v15.common.BusinessProfileLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_BusinessProfileLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_BusinessProfileLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.common.BusinessProfileLocation.class, com.google.ads.googleads.v15.common.BusinessProfileLocation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.common.BusinessProfileLocation.newBuilder()
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
      labels_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      storeCode_ = "";
      listingId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_BusinessProfileLocation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.BusinessProfileLocation getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.common.BusinessProfileLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.BusinessProfileLocation build() {
      com.google.ads.googleads.v15.common.BusinessProfileLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.BusinessProfileLocation buildPartial() {
      com.google.ads.googleads.v15.common.BusinessProfileLocation result = new com.google.ads.googleads.v15.common.BusinessProfileLocation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.common.BusinessProfileLocation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        labels_.makeImmutable();
        result.labels_ = labels_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.storeCode_ = storeCode_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.listingId_ = listingId_;
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
      if (other instanceof com.google.ads.googleads.v15.common.BusinessProfileLocation) {
        return mergeFrom((com.google.ads.googleads.v15.common.BusinessProfileLocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.common.BusinessProfileLocation other) {
      if (other == com.google.ads.googleads.v15.common.BusinessProfileLocation.getDefaultInstance()) return this;
      if (!other.labels_.isEmpty()) {
        if (labels_.isEmpty()) {
          labels_ = other.labels_;
          bitField0_ |= 0x00000001;
        } else {
          ensureLabelsIsMutable();
          labels_.addAll(other.labels_);
        }
        onChanged();
      }
      if (!other.getStoreCode().isEmpty()) {
        storeCode_ = other.storeCode_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getListingId() != 0L) {
        setListingId(other.getListingId());
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureLabelsIsMutable();
              labels_.add(s);
              break;
            } // case 10
            case 18: {
              storeCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              listingId_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.LazyStringArrayList labels_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureLabelsIsMutable() {
      if (!labels_.isModifiable()) {
        labels_ = new com.google.protobuf.LazyStringArrayList(labels_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Advertiser specified label for the location on the Business Profile
     * account. This is synced from the Business Profile account.
     * </pre>
     *
     * <code>repeated string labels = 1;</code>
     * @return A list containing the labels.
     */
    public com.google.protobuf.ProtocolStringList
        getLabelsList() {
      labels_.makeImmutable();
      return labels_;
    }
    /**
     * <pre>
     * Advertiser specified label for the location on the Business Profile
     * account. This is synced from the Business Profile account.
     * </pre>
     *
     * <code>repeated string labels = 1;</code>
     * @return The count of labels.
     */
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <pre>
     * Advertiser specified label for the location on the Business Profile
     * account. This is synced from the Business Profile account.
     * </pre>
     *
     * <code>repeated string labels = 1;</code>
     * @param index The index of the element to return.
     * @return The labels at the given index.
     */
    public java.lang.String getLabels(int index) {
      return labels_.get(index);
    }
    /**
     * <pre>
     * Advertiser specified label for the location on the Business Profile
     * account. This is synced from the Business Profile account.
     * </pre>
     *
     * <code>repeated string labels = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the labels at the given index.
     */
    public com.google.protobuf.ByteString
        getLabelsBytes(int index) {
      return labels_.getByteString(index);
    }
    /**
     * <pre>
     * Advertiser specified label for the location on the Business Profile
     * account. This is synced from the Business Profile account.
     * </pre>
     *
     * <code>repeated string labels = 1;</code>
     * @param index The index to set the value at.
     * @param value The labels to set.
     * @return This builder for chaining.
     */
    public Builder setLabels(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureLabelsIsMutable();
      labels_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Advertiser specified label for the location on the Business Profile
     * account. This is synced from the Business Profile account.
     * </pre>
     *
     * <code>repeated string labels = 1;</code>
     * @param value The labels to add.
     * @return This builder for chaining.
     */
    public Builder addLabels(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureLabelsIsMutable();
      labels_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Advertiser specified label for the location on the Business Profile
     * account. This is synced from the Business Profile account.
     * </pre>
     *
     * <code>repeated string labels = 1;</code>
     * @param values The labels to add.
     * @return This builder for chaining.
     */
    public Builder addAllLabels(
        java.lang.Iterable<java.lang.String> values) {
      ensureLabelsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, labels_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Advertiser specified label for the location on the Business Profile
     * account. This is synced from the Business Profile account.
     * </pre>
     *
     * <code>repeated string labels = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLabels() {
      labels_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Advertiser specified label for the location on the Business Profile
     * account. This is synced from the Business Profile account.
     * </pre>
     *
     * <code>repeated string labels = 1;</code>
     * @param value The bytes of the labels to add.
     * @return This builder for chaining.
     */
    public Builder addLabelsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureLabelsIsMutable();
      labels_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object storeCode_ = "";
    /**
     * <pre>
     * Business Profile store code of this location. This is synced from the
     * Business Profile account.
     * </pre>
     *
     * <code>string store_code = 2;</code>
     * @return The storeCode.
     */
    public java.lang.String getStoreCode() {
      java.lang.Object ref = storeCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storeCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Business Profile store code of this location. This is synced from the
     * Business Profile account.
     * </pre>
     *
     * <code>string store_code = 2;</code>
     * @return The bytes for storeCode.
     */
    public com.google.protobuf.ByteString
        getStoreCodeBytes() {
      java.lang.Object ref = storeCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storeCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Business Profile store code of this location. This is synced from the
     * Business Profile account.
     * </pre>
     *
     * <code>string store_code = 2;</code>
     * @param value The storeCode to set.
     * @return This builder for chaining.
     */
    public Builder setStoreCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      storeCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Business Profile store code of this location. This is synced from the
     * Business Profile account.
     * </pre>
     *
     * <code>string store_code = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreCode() {
      storeCode_ = getDefaultInstance().getStoreCode();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Business Profile store code of this location. This is synced from the
     * Business Profile account.
     * </pre>
     *
     * <code>string store_code = 2;</code>
     * @param value The bytes for storeCode to set.
     * @return This builder for chaining.
     */
    public Builder setStoreCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      storeCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long listingId_ ;
    /**
     * <pre>
     * Listing ID of this Business Profile location. This is synced from the
     * linked Business Profile account.
     * </pre>
     *
     * <code>int64 listing_id = 3;</code>
     * @return The listingId.
     */
    @java.lang.Override
    public long getListingId() {
      return listingId_;
    }
    /**
     * <pre>
     * Listing ID of this Business Profile location. This is synced from the
     * linked Business Profile account.
     * </pre>
     *
     * <code>int64 listing_id = 3;</code>
     * @param value The listingId to set.
     * @return This builder for chaining.
     */
    public Builder setListingId(long value) {

      listingId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Listing ID of this Business Profile location. This is synced from the
     * linked Business Profile account.
     * </pre>
     *
     * <code>int64 listing_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearListingId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      listingId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.common.BusinessProfileLocation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.common.BusinessProfileLocation)
  private static final com.google.ads.googleads.v15.common.BusinessProfileLocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.common.BusinessProfileLocation();
  }

  public static com.google.ads.googleads.v15.common.BusinessProfileLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BusinessProfileLocation>
      PARSER = new com.google.protobuf.AbstractParser<BusinessProfileLocation>() {
    @java.lang.Override
    public BusinessProfileLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<BusinessProfileLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BusinessProfileLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.common.BusinessProfileLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

