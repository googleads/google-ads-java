// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/real_time_bidding_setting.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * Settings for Real-Time Bidding, a feature only available for campaigns
 * targeting the Ad Exchange network.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.RealTimeBiddingSetting}
 */
public final class RealTimeBiddingSetting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.RealTimeBiddingSetting)
    RealTimeBiddingSettingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RealTimeBiddingSetting.newBuilder() to construct.
  private RealTimeBiddingSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RealTimeBiddingSetting() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RealTimeBiddingSetting();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RealTimeBiddingSetting(
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
          case 16: {
            bitField0_ |= 0x00000001;
            optIn_ = input.readBool();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.ads.googleads.v10.common.RealTimeBiddingSettingProto.internal_static_google_ads_googleads_v10_common_RealTimeBiddingSetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.RealTimeBiddingSettingProto.internal_static_google_ads_googleads_v10_common_RealTimeBiddingSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.RealTimeBiddingSetting.class, com.google.ads.googleads.v10.common.RealTimeBiddingSetting.Builder.class);
  }

  private int bitField0_;
  public static final int OPT_IN_FIELD_NUMBER = 2;
  private boolean optIn_;
  /**
   * <pre>
   * Whether the campaign is opted in to real-time bidding.
   * </pre>
   *
   * <code>optional bool opt_in = 2;</code>
   * @return Whether the optIn field is set.
   */
  @java.lang.Override
  public boolean hasOptIn() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Whether the campaign is opted in to real-time bidding.
   * </pre>
   *
   * <code>optional bool opt_in = 2;</code>
   * @return The optIn.
   */
  @java.lang.Override
  public boolean getOptIn() {
    return optIn_;
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
      output.writeBool(2, optIn_);
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
        .computeBoolSize(2, optIn_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.RealTimeBiddingSetting)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.RealTimeBiddingSetting other = (com.google.ads.googleads.v10.common.RealTimeBiddingSetting) obj;

    if (hasOptIn() != other.hasOptIn()) return false;
    if (hasOptIn()) {
      if (getOptIn()
          != other.getOptIn()) return false;
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
    if (hasOptIn()) {
      hash = (37 * hash) + OPT_IN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOptIn());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.RealTimeBiddingSetting prototype) {
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
   * Settings for Real-Time Bidding, a feature only available for campaigns
   * targeting the Ad Exchange network.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.RealTimeBiddingSetting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.RealTimeBiddingSetting)
      com.google.ads.googleads.v10.common.RealTimeBiddingSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.RealTimeBiddingSettingProto.internal_static_google_ads_googleads_v10_common_RealTimeBiddingSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.RealTimeBiddingSettingProto.internal_static_google_ads_googleads_v10_common_RealTimeBiddingSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.RealTimeBiddingSetting.class, com.google.ads.googleads.v10.common.RealTimeBiddingSetting.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.RealTimeBiddingSetting.newBuilder()
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
      optIn_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.RealTimeBiddingSettingProto.internal_static_google_ads_googleads_v10_common_RealTimeBiddingSetting_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.RealTimeBiddingSetting getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.RealTimeBiddingSetting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.RealTimeBiddingSetting build() {
      com.google.ads.googleads.v10.common.RealTimeBiddingSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.RealTimeBiddingSetting buildPartial() {
      com.google.ads.googleads.v10.common.RealTimeBiddingSetting result = new com.google.ads.googleads.v10.common.RealTimeBiddingSetting(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.optIn_ = optIn_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v10.common.RealTimeBiddingSetting) {
        return mergeFrom((com.google.ads.googleads.v10.common.RealTimeBiddingSetting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.RealTimeBiddingSetting other) {
      if (other == com.google.ads.googleads.v10.common.RealTimeBiddingSetting.getDefaultInstance()) return this;
      if (other.hasOptIn()) {
        setOptIn(other.getOptIn());
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
      com.google.ads.googleads.v10.common.RealTimeBiddingSetting parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.common.RealTimeBiddingSetting) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean optIn_ ;
    /**
     * <pre>
     * Whether the campaign is opted in to real-time bidding.
     * </pre>
     *
     * <code>optional bool opt_in = 2;</code>
     * @return Whether the optIn field is set.
     */
    @java.lang.Override
    public boolean hasOptIn() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Whether the campaign is opted in to real-time bidding.
     * </pre>
     *
     * <code>optional bool opt_in = 2;</code>
     * @return The optIn.
     */
    @java.lang.Override
    public boolean getOptIn() {
      return optIn_;
    }
    /**
     * <pre>
     * Whether the campaign is opted in to real-time bidding.
     * </pre>
     *
     * <code>optional bool opt_in = 2;</code>
     * @param value The optIn to set.
     * @return This builder for chaining.
     */
    public Builder setOptIn(boolean value) {
      bitField0_ |= 0x00000001;
      optIn_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the campaign is opted in to real-time bidding.
     * </pre>
     *
     * <code>optional bool opt_in = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOptIn() {
      bitField0_ = (bitField0_ & ~0x00000001);
      optIn_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.RealTimeBiddingSetting)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.RealTimeBiddingSetting)
  private static final com.google.ads.googleads.v10.common.RealTimeBiddingSetting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.RealTimeBiddingSetting();
  }

  public static com.google.ads.googleads.v10.common.RealTimeBiddingSetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RealTimeBiddingSetting>
      PARSER = new com.google.protobuf.AbstractParser<RealTimeBiddingSetting>() {
    @java.lang.Override
    public RealTimeBiddingSetting parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RealTimeBiddingSetting(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RealTimeBiddingSetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RealTimeBiddingSetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.RealTimeBiddingSetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

