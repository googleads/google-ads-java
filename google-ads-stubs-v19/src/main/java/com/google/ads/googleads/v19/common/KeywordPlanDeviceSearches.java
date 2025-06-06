// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/keyword_plan_common.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

/**
 * <pre>
 * The total searches for the device type during the specified time period.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.common.KeywordPlanDeviceSearches}
 */
public final class KeywordPlanDeviceSearches extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.common.KeywordPlanDeviceSearches)
    KeywordPlanDeviceSearchesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanDeviceSearches.newBuilder() to construct.
  private KeywordPlanDeviceSearches(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanDeviceSearches() {
    device_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanDeviceSearches();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v19_common_KeywordPlanDeviceSearches_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v19_common_KeywordPlanDeviceSearches_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches.class, com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches.Builder.class);
  }

  private int bitField0_;
  public static final int DEVICE_FIELD_NUMBER = 1;
  private int device_ = 0;
  /**
   * <pre>
   * The device type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.DeviceEnum.Device device = 1;</code>
   * @return The enum numeric value on the wire for device.
   */
  @java.lang.Override public int getDeviceValue() {
    return device_;
  }
  /**
   * <pre>
   * The device type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.DeviceEnum.Device device = 1;</code>
   * @return The device.
   */
  @java.lang.Override public com.google.ads.googleads.v19.enums.DeviceEnum.Device getDevice() {
    com.google.ads.googleads.v19.enums.DeviceEnum.Device result = com.google.ads.googleads.v19.enums.DeviceEnum.Device.forNumber(device_);
    return result == null ? com.google.ads.googleads.v19.enums.DeviceEnum.Device.UNRECOGNIZED : result;
  }

  public static final int SEARCH_COUNT_FIELD_NUMBER = 2;
  private long searchCount_ = 0L;
  /**
   * <pre>
   * The total searches for the device.
   * </pre>
   *
   * <code>optional int64 search_count = 2;</code>
   * @return Whether the searchCount field is set.
   */
  @java.lang.Override
  public boolean hasSearchCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The total searches for the device.
   * </pre>
   *
   * <code>optional int64 search_count = 2;</code>
   * @return The searchCount.
   */
  @java.lang.Override
  public long getSearchCount() {
    return searchCount_;
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
    if (device_ != com.google.ads.googleads.v19.enums.DeviceEnum.Device.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, device_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, searchCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (device_ != com.google.ads.googleads.v19.enums.DeviceEnum.Device.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, device_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, searchCount_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches other = (com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches) obj;

    if (device_ != other.device_) return false;
    if (hasSearchCount() != other.hasSearchCount()) return false;
    if (hasSearchCount()) {
      if (getSearchCount()
          != other.getSearchCount()) return false;
    }
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
    hash = (37 * hash) + DEVICE_FIELD_NUMBER;
    hash = (53 * hash) + device_;
    if (hasSearchCount()) {
      hash = (37 * hash) + SEARCH_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSearchCount());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches prototype) {
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
   * The total searches for the device type during the specified time period.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.common.KeywordPlanDeviceSearches}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.common.KeywordPlanDeviceSearches)
      com.google.ads.googleads.v19.common.KeywordPlanDeviceSearchesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v19_common_KeywordPlanDeviceSearches_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v19_common_KeywordPlanDeviceSearches_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches.class, com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches.newBuilder()
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
      device_ = 0;
      searchCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v19_common_KeywordPlanDeviceSearches_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches build() {
      com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches buildPartial() {
      com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches result = new com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.device_ = device_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.searchCount_ = searchCount_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches) {
        return mergeFrom((com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches other) {
      if (other == com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches.getDefaultInstance()) return this;
      if (other.device_ != 0) {
        setDeviceValue(other.getDeviceValue());
      }
      if (other.hasSearchCount()) {
        setSearchCount(other.getSearchCount());
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
              device_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              searchCount_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int device_ = 0;
    /**
     * <pre>
     * The device type.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.DeviceEnum.Device device = 1;</code>
     * @return The enum numeric value on the wire for device.
     */
    @java.lang.Override public int getDeviceValue() {
      return device_;
    }
    /**
     * <pre>
     * The device type.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.DeviceEnum.Device device = 1;</code>
     * @param value The enum numeric value on the wire for device to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceValue(int value) {
      device_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The device type.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.DeviceEnum.Device device = 1;</code>
     * @return The device.
     */
    @java.lang.Override
    public com.google.ads.googleads.v19.enums.DeviceEnum.Device getDevice() {
      com.google.ads.googleads.v19.enums.DeviceEnum.Device result = com.google.ads.googleads.v19.enums.DeviceEnum.Device.forNumber(device_);
      return result == null ? com.google.ads.googleads.v19.enums.DeviceEnum.Device.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The device type.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.DeviceEnum.Device device = 1;</code>
     * @param value The device to set.
     * @return This builder for chaining.
     */
    public Builder setDevice(com.google.ads.googleads.v19.enums.DeviceEnum.Device value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      device_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The device type.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.DeviceEnum.Device device = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevice() {
      bitField0_ = (bitField0_ & ~0x00000001);
      device_ = 0;
      onChanged();
      return this;
    }

    private long searchCount_ ;
    /**
     * <pre>
     * The total searches for the device.
     * </pre>
     *
     * <code>optional int64 search_count = 2;</code>
     * @return Whether the searchCount field is set.
     */
    @java.lang.Override
    public boolean hasSearchCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The total searches for the device.
     * </pre>
     *
     * <code>optional int64 search_count = 2;</code>
     * @return The searchCount.
     */
    @java.lang.Override
    public long getSearchCount() {
      return searchCount_;
    }
    /**
     * <pre>
     * The total searches for the device.
     * </pre>
     *
     * <code>optional int64 search_count = 2;</code>
     * @param value The searchCount to set.
     * @return This builder for chaining.
     */
    public Builder setSearchCount(long value) {

      searchCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total searches for the device.
     * </pre>
     *
     * <code>optional int64 search_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSearchCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      searchCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.common.KeywordPlanDeviceSearches)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.common.KeywordPlanDeviceSearches)
  private static final com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches();
  }

  public static com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanDeviceSearches>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanDeviceSearches>() {
    @java.lang.Override
    public KeywordPlanDeviceSearches parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordPlanDeviceSearches> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanDeviceSearches> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.common.KeywordPlanDeviceSearches getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

