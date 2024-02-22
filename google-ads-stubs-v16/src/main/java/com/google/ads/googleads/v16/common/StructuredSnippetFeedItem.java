// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/extensions.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * Represents a structured snippet extension.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.StructuredSnippetFeedItem}
 */
public final class StructuredSnippetFeedItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.StructuredSnippetFeedItem)
    StructuredSnippetFeedItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StructuredSnippetFeedItem.newBuilder() to construct.
  private StructuredSnippetFeedItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StructuredSnippetFeedItem() {
    header_ = "";
    values_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StructuredSnippetFeedItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.ExtensionsProto.internal_static_google_ads_googleads_v16_common_StructuredSnippetFeedItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.ExtensionsProto.internal_static_google_ads_googleads_v16_common_StructuredSnippetFeedItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.StructuredSnippetFeedItem.class, com.google.ads.googleads.v16.common.StructuredSnippetFeedItem.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object header_ = "";
  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string header = 3;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string header = 3;</code>
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
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string header = 3;</code>
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

  public static final int VALUES_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList values_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated string values = 4;</code>
   * @return A list containing the values.
   */
  public com.google.protobuf.ProtocolStringList
      getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated string values = 4;</code>
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated string values = 4;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public java.lang.String getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated string values = 4;</code>
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, header_);
    }
    for (int i = 0; i < values_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, values_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, header_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.StructuredSnippetFeedItem)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.StructuredSnippetFeedItem other = (com.google.ads.googleads.v16.common.StructuredSnippetFeedItem) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.StructuredSnippetFeedItem prototype) {
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
   * Represents a structured snippet extension.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.StructuredSnippetFeedItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.StructuredSnippetFeedItem)
      com.google.ads.googleads.v16.common.StructuredSnippetFeedItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.ExtensionsProto.internal_static_google_ads_googleads_v16_common_StructuredSnippetFeedItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.ExtensionsProto.internal_static_google_ads_googleads_v16_common_StructuredSnippetFeedItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.StructuredSnippetFeedItem.class, com.google.ads.googleads.v16.common.StructuredSnippetFeedItem.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.StructuredSnippetFeedItem.newBuilder()
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
      return com.google.ads.googleads.v16.common.ExtensionsProto.internal_static_google_ads_googleads_v16_common_StructuredSnippetFeedItem_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.StructuredSnippetFeedItem getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.StructuredSnippetFeedItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.StructuredSnippetFeedItem build() {
      com.google.ads.googleads.v16.common.StructuredSnippetFeedItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.StructuredSnippetFeedItem buildPartial() {
      com.google.ads.googleads.v16.common.StructuredSnippetFeedItem result = new com.google.ads.googleads.v16.common.StructuredSnippetFeedItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.StructuredSnippetFeedItem result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = header_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        values_.makeImmutable();
        result.values_ = values_;
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
      if (other instanceof com.google.ads.googleads.v16.common.StructuredSnippetFeedItem) {
        return mergeFrom((com.google.ads.googleads.v16.common.StructuredSnippetFeedItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.StructuredSnippetFeedItem other) {
      if (other == com.google.ads.googleads.v16.common.StructuredSnippetFeedItem.getDefaultInstance()) return this;
      if (other.hasHeader()) {
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
            case 26: {
              header_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureValuesIsMutable();
              values_.add(s);
              break;
            } // case 34
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
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>optional string header = 3;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>optional string header = 3;</code>
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
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>optional string header = 3;</code>
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
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>optional string header = 3;</code>
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
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>optional string header = 3;</code>
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
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>optional string header = 3;</code>
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
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated string values = 4;</code>
     * @return A list containing the values.
     */
    public com.google.protobuf.ProtocolStringList
        getValuesList() {
      values_.makeImmutable();
      return values_;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated string values = 4;</code>
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated string values = 4;</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public java.lang.String getValues(int index) {
      return values_.get(index);
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated string values = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    public com.google.protobuf.ByteString
        getValuesBytes(int index) {
      return values_.getByteString(index);
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated string values = 4;</code>
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
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated string values = 4;</code>
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
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated string values = 4;</code>
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
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated string values = 4;</code>
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
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated string values = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.StructuredSnippetFeedItem)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.StructuredSnippetFeedItem)
  private static final com.google.ads.googleads.v16.common.StructuredSnippetFeedItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.StructuredSnippetFeedItem();
  }

  public static com.google.ads.googleads.v16.common.StructuredSnippetFeedItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StructuredSnippetFeedItem>
      PARSER = new com.google.protobuf.AbstractParser<StructuredSnippetFeedItem>() {
    @java.lang.Override
    public StructuredSnippetFeedItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<StructuredSnippetFeedItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StructuredSnippetFeedItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.StructuredSnippetFeedItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

