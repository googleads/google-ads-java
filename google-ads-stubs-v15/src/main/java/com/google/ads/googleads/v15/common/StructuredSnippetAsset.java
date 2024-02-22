// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.common;

/**
 * <pre>
 * A Structured Snippet asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.common.StructuredSnippetAsset}
 */
public final class StructuredSnippetAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.common.StructuredSnippetAsset)
    StructuredSnippetAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StructuredSnippetAsset.newBuilder() to construct.
  private StructuredSnippetAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StructuredSnippetAsset() {
    header_ = "";
    values_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StructuredSnippetAsset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_StructuredSnippetAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_StructuredSnippetAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.common.StructuredSnippetAsset.class, com.google.ads.googleads.v15.common.StructuredSnippetAsset.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object header_ = "";
  /**
   * <pre>
   * Required. The header of the snippet.
   * This string should be one of the predefined values at
   * https://developers.google.com/google-ads/api/reference/data/structured-snippet-headers
   * </pre>
   *
   * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The header.
   */
  @java.lang.Override
  public java.lang.String getHeader() {
    java.lang.Object ref = header_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      header_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The header of the snippet.
   * This string should be one of the predefined values at
   * https://developers.google.com/google-ads/api/reference/data/structured-snippet-headers
   * </pre>
   *
   * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for header.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHeaderBytes() {
    java.lang.Object ref = header_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      header_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList values_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Required. The values in the snippet.
   * The size of this collection should be between 3 and 10, inclusive.
   * The length of each value should be between 1 and 25 characters, inclusive.
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the values.
   */
  public com.google.protobuf.ProtocolStringList
      getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * Required. The values in the snippet.
   * The size of this collection should be between 3 and 10, inclusive.
   * The length of each value should be between 1 and 25 characters, inclusive.
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * Required. The values in the snippet.
   * The size of this collection should be between 3 and 10, inclusive.
   * The length of each value should be between 1 and 25 characters, inclusive.
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public java.lang.String getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * Required. The values in the snippet.
   * The size of this collection should be between 3 and 10, inclusive.
   * The length of each value should be between 1 and 25 characters, inclusive.
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  public com.google.protobuf.ByteString
      getValuesBytes(int index) {
    return values_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(header_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, header_);
    }
    for (int i = 0; i < values_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, values_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(header_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, header_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += computeStringSizeNoTag(values_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValuesList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v15.common.StructuredSnippetAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.common.StructuredSnippetAsset other = (com.google.ads.googleads.v15.common.StructuredSnippetAsset) obj;

    if (!getHeader()
        .equals(other.getHeader())) return false;
    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    hash = (37 * hash) + HEADER_FIELD_NUMBER;
    hash = (53 * hash) + getHeader().hashCode();
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.common.StructuredSnippetAsset prototype) {
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
   * A Structured Snippet asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.common.StructuredSnippetAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.common.StructuredSnippetAsset)
      com.google.ads.googleads.v15.common.StructuredSnippetAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_StructuredSnippetAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_StructuredSnippetAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.common.StructuredSnippetAsset.class, com.google.ads.googleads.v15.common.StructuredSnippetAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.common.StructuredSnippetAsset.newBuilder()
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
      header_ = "";
      values_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.common.AssetTypesProto.internal_static_google_ads_googleads_v15_common_StructuredSnippetAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.StructuredSnippetAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.common.StructuredSnippetAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.StructuredSnippetAsset build() {
      com.google.ads.googleads.v15.common.StructuredSnippetAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.StructuredSnippetAsset buildPartial() {
      com.google.ads.googleads.v15.common.StructuredSnippetAsset result = new com.google.ads.googleads.v15.common.StructuredSnippetAsset(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.common.StructuredSnippetAsset result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = header_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        values_.makeImmutable();
        result.values_ = values_;
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
      if (other instanceof com.google.ads.googleads.v15.common.StructuredSnippetAsset) {
        return mergeFrom((com.google.ads.googleads.v15.common.StructuredSnippetAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.common.StructuredSnippetAsset other) {
      if (other == com.google.ads.googleads.v15.common.StructuredSnippetAsset.getDefaultInstance()) return this;
      if (!other.getHeader().isEmpty()) {
        header_ = other.header_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ |= 0x00000002;
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
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
              header_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureValuesIsMutable();
              values_.add(s);
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

    private java.lang.Object header_ = "";
    /**
     * <pre>
     * Required. The header of the snippet.
     * This string should be one of the predefined values at
     * https://developers.google.com/google-ads/api/reference/data/structured-snippet-headers
     * </pre>
     *
     * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The header.
     */
    public java.lang.String getHeader() {
      java.lang.Object ref = header_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        header_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The header of the snippet.
     * This string should be one of the predefined values at
     * https://developers.google.com/google-ads/api/reference/data/structured-snippet-headers
     * </pre>
     *
     * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for header.
     */
    public com.google.protobuf.ByteString
        getHeaderBytes() {
      java.lang.Object ref = header_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        header_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The header of the snippet.
     * This string should be one of the predefined values at
     * https://developers.google.com/google-ads/api/reference/data/structured-snippet-headers
     * </pre>
     *
     * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The header to set.
     * @return This builder for chaining.
     */
    public Builder setHeader(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      header_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The header of the snippet.
     * This string should be one of the predefined values at
     * https://developers.google.com/google-ads/api/reference/data/structured-snippet-headers
     * </pre>
     *
     * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeader() {
      header_ = getDefaultInstance().getHeader();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The header of the snippet.
     * This string should be one of the predefined values at
     * https://developers.google.com/google-ads/api/reference/data/structured-snippet-headers
     * </pre>
     *
     * <code>string header = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for header to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      header_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList values_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureValuesIsMutable() {
      if (!values_.isModifiable()) {
        values_ = new com.google.protobuf.LazyStringArrayList(values_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Required. The values in the snippet.
     * The size of this collection should be between 3 and 10, inclusive.
     * The length of each value should be between 1 and 25 characters, inclusive.
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the values.
     */
    public com.google.protobuf.ProtocolStringList
        getValuesList() {
      values_.makeImmutable();
      return values_;
    }
    /**
     * <pre>
     * Required. The values in the snippet.
     * The size of this collection should be between 3 and 10, inclusive.
     * The length of each value should be between 1 and 25 characters, inclusive.
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <pre>
     * Required. The values in the snippet.
     * The size of this collection should be between 3 and 10, inclusive.
     * The length of each value should be between 1 and 25 characters, inclusive.
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public java.lang.String getValues(int index) {
      return values_.get(index);
    }
    /**
     * <pre>
     * Required. The values in the snippet.
     * The size of this collection should be between 3 and 10, inclusive.
     * The length of each value should be between 1 and 25 characters, inclusive.
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    public com.google.protobuf.ByteString
        getValuesBytes(int index) {
      return values_.getByteString(index);
    }
    /**
     * <pre>
     * Required. The values in the snippet.
     * The size of this collection should be between 3 and 10, inclusive.
     * The length of each value should be between 1 and 25 characters, inclusive.
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureValuesIsMutable();
      values_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The values in the snippet.
     * The size of this collection should be between 3 and 10, inclusive.
     * The length of each value should be between 1 and 25 characters, inclusive.
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureValuesIsMutable();
      values_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The values in the snippet.
     * The size of this collection should be between 3 and 10, inclusive.
     * The length of each value should be between 1 and 25 characters, inclusive.
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(
        java.lang.Iterable<java.lang.String> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, values_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The values in the snippet.
     * The size of this collection should be between 3 and 10, inclusive.
     * The length of each value should be between 1 and 25 characters, inclusive.
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The values in the snippet.
     * The size of this collection should be between 3 and 10, inclusive.
     * The length of each value should be between 1 and 25 characters, inclusive.
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the values to add.
     * @return This builder for chaining.
     */
    public Builder addValuesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureValuesIsMutable();
      values_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.common.StructuredSnippetAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.common.StructuredSnippetAsset)
  private static final com.google.ads.googleads.v15.common.StructuredSnippetAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.common.StructuredSnippetAsset();
  }

  public static com.google.ads.googleads.v15.common.StructuredSnippetAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StructuredSnippetAsset>
      PARSER = new com.google.protobuf.AbstractParser<StructuredSnippetAsset>() {
    @java.lang.Override
    public StructuredSnippetAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<StructuredSnippetAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StructuredSnippetAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.common.StructuredSnippetAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

