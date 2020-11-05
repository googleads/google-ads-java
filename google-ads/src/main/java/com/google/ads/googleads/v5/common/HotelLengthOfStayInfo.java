// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/criteria.proto

package com.google.ads.googleads.v5.common;

/**
 * <pre>
 * Criterion for length of hotel stay in nights.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v5.common.HotelLengthOfStayInfo}
 */
public final class HotelLengthOfStayInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v5.common.HotelLengthOfStayInfo)
    HotelLengthOfStayInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelLengthOfStayInfo.newBuilder() to construct.
  private HotelLengthOfStayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelLengthOfStayInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelLengthOfStayInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HotelLengthOfStayInfo(
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
          case 24: {
            bitField0_ |= 0x00000001;
            minNights_ = input.readInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000002;
            maxNights_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.google.ads.googleads.v5.common.CriteriaProto.internal_static_google_ads_googleads_v5_common_HotelLengthOfStayInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v5.common.CriteriaProto.internal_static_google_ads_googleads_v5_common_HotelLengthOfStayInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v5.common.HotelLengthOfStayInfo.class, com.google.ads.googleads.v5.common.HotelLengthOfStayInfo.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_NIGHTS_FIELD_NUMBER = 3;
  private long minNights_;
  /**
   * <pre>
   * Low end of the number of nights in the stay.
   * </pre>
   *
   * <code>int64 min_nights = 3;</code>
   * @return Whether the minNights field is set.
   */
  @java.lang.Override
  public boolean hasMinNights() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Low end of the number of nights in the stay.
   * </pre>
   *
   * <code>int64 min_nights = 3;</code>
   * @return The minNights.
   */
  @java.lang.Override
  public long getMinNights() {
    return minNights_;
  }

  public static final int MAX_NIGHTS_FIELD_NUMBER = 4;
  private long maxNights_;
  /**
   * <pre>
   * High end of the number of nights in the stay.
   * </pre>
   *
   * <code>int64 max_nights = 4;</code>
   * @return Whether the maxNights field is set.
   */
  @java.lang.Override
  public boolean hasMaxNights() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * High end of the number of nights in the stay.
   * </pre>
   *
   * <code>int64 max_nights = 4;</code>
   * @return The maxNights.
   */
  @java.lang.Override
  public long getMaxNights() {
    return maxNights_;
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
      output.writeInt64(3, minNights_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(4, maxNights_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, minNights_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, maxNights_);
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
    if (!(obj instanceof com.google.ads.googleads.v5.common.HotelLengthOfStayInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v5.common.HotelLengthOfStayInfo other = (com.google.ads.googleads.v5.common.HotelLengthOfStayInfo) obj;

    if (hasMinNights() != other.hasMinNights()) return false;
    if (hasMinNights()) {
      if (getMinNights()
          != other.getMinNights()) return false;
    }
    if (hasMaxNights() != other.hasMaxNights()) return false;
    if (hasMaxNights()) {
      if (getMaxNights()
          != other.getMaxNights()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMinNights()) {
      hash = (37 * hash) + MIN_NIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMinNights());
    }
    if (hasMaxNights()) {
      hash = (37 * hash) + MAX_NIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMaxNights());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v5.common.HotelLengthOfStayInfo prototype) {
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
   * Criterion for length of hotel stay in nights.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v5.common.HotelLengthOfStayInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v5.common.HotelLengthOfStayInfo)
      com.google.ads.googleads.v5.common.HotelLengthOfStayInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v5.common.CriteriaProto.internal_static_google_ads_googleads_v5_common_HotelLengthOfStayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v5.common.CriteriaProto.internal_static_google_ads_googleads_v5_common_HotelLengthOfStayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v5.common.HotelLengthOfStayInfo.class, com.google.ads.googleads.v5.common.HotelLengthOfStayInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v5.common.HotelLengthOfStayInfo.newBuilder()
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
      minNights_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      maxNights_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v5.common.CriteriaProto.internal_static_google_ads_googleads_v5_common_HotelLengthOfStayInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.common.HotelLengthOfStayInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v5.common.HotelLengthOfStayInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.common.HotelLengthOfStayInfo build() {
      com.google.ads.googleads.v5.common.HotelLengthOfStayInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.common.HotelLengthOfStayInfo buildPartial() {
      com.google.ads.googleads.v5.common.HotelLengthOfStayInfo result = new com.google.ads.googleads.v5.common.HotelLengthOfStayInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minNights_ = minNights_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxNights_ = maxNights_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v5.common.HotelLengthOfStayInfo) {
        return mergeFrom((com.google.ads.googleads.v5.common.HotelLengthOfStayInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v5.common.HotelLengthOfStayInfo other) {
      if (other == com.google.ads.googleads.v5.common.HotelLengthOfStayInfo.getDefaultInstance()) return this;
      if (other.hasMinNights()) {
        setMinNights(other.getMinNights());
      }
      if (other.hasMaxNights()) {
        setMaxNights(other.getMaxNights());
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
      com.google.ads.googleads.v5.common.HotelLengthOfStayInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v5.common.HotelLengthOfStayInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long minNights_ ;
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>int64 min_nights = 3;</code>
     * @return Whether the minNights field is set.
     */
    @java.lang.Override
    public boolean hasMinNights() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>int64 min_nights = 3;</code>
     * @return The minNights.
     */
    @java.lang.Override
    public long getMinNights() {
      return minNights_;
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>int64 min_nights = 3;</code>
     * @param value The minNights to set.
     * @return This builder for chaining.
     */
    public Builder setMinNights(long value) {
      bitField0_ |= 0x00000001;
      minNights_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Low end of the number of nights in the stay.
     * </pre>
     *
     * <code>int64 min_nights = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinNights() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minNights_ = 0L;
      onChanged();
      return this;
    }

    private long maxNights_ ;
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>int64 max_nights = 4;</code>
     * @return Whether the maxNights field is set.
     */
    @java.lang.Override
    public boolean hasMaxNights() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>int64 max_nights = 4;</code>
     * @return The maxNights.
     */
    @java.lang.Override
    public long getMaxNights() {
      return maxNights_;
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>int64 max_nights = 4;</code>
     * @param value The maxNights to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNights(long value) {
      bitField0_ |= 0x00000002;
      maxNights_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * High end of the number of nights in the stay.
     * </pre>
     *
     * <code>int64 max_nights = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxNights() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxNights_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v5.common.HotelLengthOfStayInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v5.common.HotelLengthOfStayInfo)
  private static final com.google.ads.googleads.v5.common.HotelLengthOfStayInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v5.common.HotelLengthOfStayInfo();
  }

  public static com.google.ads.googleads.v5.common.HotelLengthOfStayInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelLengthOfStayInfo>
      PARSER = new com.google.protobuf.AbstractParser<HotelLengthOfStayInfo>() {
    @java.lang.Override
    public HotelLengthOfStayInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HotelLengthOfStayInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HotelLengthOfStayInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelLengthOfStayInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v5.common.HotelLengthOfStayInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

