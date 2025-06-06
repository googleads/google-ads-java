// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/asset_types.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

/**
 * <pre>
 * A Page Feed asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.common.PageFeedAsset}
 */
public final class PageFeedAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.common.PageFeedAsset)
    PageFeedAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PageFeedAsset.newBuilder() to construct.
  private PageFeedAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PageFeedAsset() {
    pageUrl_ = "";
    labels_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PageFeedAsset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_PageFeedAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_PageFeedAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.common.PageFeedAsset.class, com.google.ads.googleads.v18.common.PageFeedAsset.Builder.class);
  }

  public static final int PAGE_URL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pageUrl_ = "";
  /**
   * <pre>
   * Required. The webpage that advertisers want to target.
   * </pre>
   *
   * <code>string page_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The pageUrl.
   */
  @java.lang.Override
  public java.lang.String getPageUrl() {
    java.lang.Object ref = pageUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The webpage that advertisers want to target.
   * </pre>
   *
   * <code>string page_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for pageUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageUrlBytes() {
    java.lang.Object ref = pageUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABELS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList labels_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Labels used to group the page urls.
   * </pre>
   *
   * <code>repeated string labels = 2;</code>
   * @return A list containing the labels.
   */
  public com.google.protobuf.ProtocolStringList
      getLabelsList() {
    return labels_;
  }
  /**
   * <pre>
   * Labels used to group the page urls.
   * </pre>
   *
   * <code>repeated string labels = 2;</code>
   * @return The count of labels.
   */
  public int getLabelsCount() {
    return labels_.size();
  }
  /**
   * <pre>
   * Labels used to group the page urls.
   * </pre>
   *
   * <code>repeated string labels = 2;</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  public java.lang.String getLabels(int index) {
    return labels_.get(index);
  }
  /**
   * <pre>
   * Labels used to group the page urls.
   * </pre>
   *
   * <code>repeated string labels = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  public com.google.protobuf.ByteString
      getLabelsBytes(int index) {
    return labels_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pageUrl_);
    }
    for (int i = 0; i < labels_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, labels_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pageUrl_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < labels_.size(); i++) {
        dataSize += computeStringSizeNoTag(labels_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLabelsList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v18.common.PageFeedAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.common.PageFeedAsset other = (com.google.ads.googleads.v18.common.PageFeedAsset) obj;

    if (!getPageUrl()
        .equals(other.getPageUrl())) return false;
    if (!getLabelsList()
        .equals(other.getLabelsList())) return false;
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
    hash = (37 * hash) + PAGE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getPageUrl().hashCode();
    if (getLabelsCount() > 0) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + getLabelsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.common.PageFeedAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.common.PageFeedAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.PageFeedAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.common.PageFeedAsset prototype) {
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
   * A Page Feed asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.common.PageFeedAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.common.PageFeedAsset)
      com.google.ads.googleads.v18.common.PageFeedAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_PageFeedAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_PageFeedAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.common.PageFeedAsset.class, com.google.ads.googleads.v18.common.PageFeedAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.common.PageFeedAsset.newBuilder()
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
      pageUrl_ = "";
      labels_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_PageFeedAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.PageFeedAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.common.PageFeedAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.PageFeedAsset build() {
      com.google.ads.googleads.v18.common.PageFeedAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.PageFeedAsset buildPartial() {
      com.google.ads.googleads.v18.common.PageFeedAsset result = new com.google.ads.googleads.v18.common.PageFeedAsset(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.common.PageFeedAsset result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageUrl_ = pageUrl_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        labels_.makeImmutable();
        result.labels_ = labels_;
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
      if (other instanceof com.google.ads.googleads.v18.common.PageFeedAsset) {
        return mergeFrom((com.google.ads.googleads.v18.common.PageFeedAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.common.PageFeedAsset other) {
      if (other == com.google.ads.googleads.v18.common.PageFeedAsset.getDefaultInstance()) return this;
      if (!other.getPageUrl().isEmpty()) {
        pageUrl_ = other.pageUrl_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.labels_.isEmpty()) {
        if (labels_.isEmpty()) {
          labels_ = other.labels_;
          bitField0_ |= 0x00000002;
        } else {
          ensureLabelsIsMutable();
          labels_.addAll(other.labels_);
        }
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
            case 10: {
              pageUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureLabelsIsMutable();
              labels_.add(s);
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

    private java.lang.Object pageUrl_ = "";
    /**
     * <pre>
     * Required. The webpage that advertisers want to target.
     * </pre>
     *
     * <code>string page_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The pageUrl.
     */
    public java.lang.String getPageUrl() {
      java.lang.Object ref = pageUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The webpage that advertisers want to target.
     * </pre>
     *
     * <code>string page_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for pageUrl.
     */
    public com.google.protobuf.ByteString
        getPageUrlBytes() {
      java.lang.Object ref = pageUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The webpage that advertisers want to target.
     * </pre>
     *
     * <code>string page_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The pageUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPageUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pageUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The webpage that advertisers want to target.
     * </pre>
     *
     * <code>string page_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageUrl() {
      pageUrl_ = getDefaultInstance().getPageUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The webpage that advertisers want to target.
     * </pre>
     *
     * <code>string page_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for pageUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPageUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pageUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList labels_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureLabelsIsMutable() {
      if (!labels_.isModifiable()) {
        labels_ = new com.google.protobuf.LazyStringArrayList(labels_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Labels used to group the page urls.
     * </pre>
     *
     * <code>repeated string labels = 2;</code>
     * @return A list containing the labels.
     */
    public com.google.protobuf.ProtocolStringList
        getLabelsList() {
      labels_.makeImmutable();
      return labels_;
    }
    /**
     * <pre>
     * Labels used to group the page urls.
     * </pre>
     *
     * <code>repeated string labels = 2;</code>
     * @return The count of labels.
     */
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <pre>
     * Labels used to group the page urls.
     * </pre>
     *
     * <code>repeated string labels = 2;</code>
     * @param index The index of the element to return.
     * @return The labels at the given index.
     */
    public java.lang.String getLabels(int index) {
      return labels_.get(index);
    }
    /**
     * <pre>
     * Labels used to group the page urls.
     * </pre>
     *
     * <code>repeated string labels = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the labels at the given index.
     */
    public com.google.protobuf.ByteString
        getLabelsBytes(int index) {
      return labels_.getByteString(index);
    }
    /**
     * <pre>
     * Labels used to group the page urls.
     * </pre>
     *
     * <code>repeated string labels = 2;</code>
     * @param index The index to set the value at.
     * @param value The labels to set.
     * @return This builder for chaining.
     */
    public Builder setLabels(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureLabelsIsMutable();
      labels_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels used to group the page urls.
     * </pre>
     *
     * <code>repeated string labels = 2;</code>
     * @param value The labels to add.
     * @return This builder for chaining.
     */
    public Builder addLabels(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureLabelsIsMutable();
      labels_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels used to group the page urls.
     * </pre>
     *
     * <code>repeated string labels = 2;</code>
     * @param values The labels to add.
     * @return This builder for chaining.
     */
    public Builder addAllLabels(
        java.lang.Iterable<java.lang.String> values) {
      ensureLabelsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, labels_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels used to group the page urls.
     * </pre>
     *
     * <code>repeated string labels = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLabels() {
      labels_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels used to group the page urls.
     * </pre>
     *
     * <code>repeated string labels = 2;</code>
     * @param value The bytes of the labels to add.
     * @return This builder for chaining.
     */
    public Builder addLabelsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureLabelsIsMutable();
      labels_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.common.PageFeedAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.common.PageFeedAsset)
  private static final com.google.ads.googleads.v18.common.PageFeedAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.common.PageFeedAsset();
  }

  public static com.google.ads.googleads.v18.common.PageFeedAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PageFeedAsset>
      PARSER = new com.google.protobuf.AbstractParser<PageFeedAsset>() {
    @java.lang.Override
    public PageFeedAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<PageFeedAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PageFeedAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.common.PageFeedAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

