// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/bidding.proto

package com.google.ads.googleads.v13.common;

/**
 * <pre>
 * An automated bid strategy that sets your bids to help get as many clicks
 * as possible within your budget.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.common.TargetSpend}
 */
public final class TargetSpend extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.common.TargetSpend)
    TargetSpendOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetSpend.newBuilder() to construct.
  private TargetSpend(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetSpend() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetSpend();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetSpend_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetSpend_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.common.TargetSpend.class, com.google.ads.googleads.v13.common.TargetSpend.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_SPEND_MICROS_FIELD_NUMBER = 3;
  private long targetSpendMicros_ = 0L;
  /**
   * <pre>
   * The spend target under which to maximize clicks.
   * A TargetSpend bidder will attempt to spend the smaller of this value
   * or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   * This field is deprecated and should no longer be used. See
   * https://ads-developers.googleblog.com/2020/05/reminder-about-sunset-creation-of.html
   * for details.
   * </pre>
   *
   * <code>optional int64 target_spend_micros = 3 [deprecated = true];</code>
   * @deprecated google.ads.googleads.v13.common.TargetSpend.target_spend_micros is deprecated.
   *     See google/ads/googleads/v13/common/bidding.proto;l=196
   * @return Whether the targetSpendMicros field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasTargetSpendMicros() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The spend target under which to maximize clicks.
   * A TargetSpend bidder will attempt to spend the smaller of this value
   * or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   * This field is deprecated and should no longer be used. See
   * https://ads-developers.googleblog.com/2020/05/reminder-about-sunset-creation-of.html
   * for details.
   * </pre>
   *
   * <code>optional int64 target_spend_micros = 3 [deprecated = true];</code>
   * @deprecated google.ads.googleads.v13.common.TargetSpend.target_spend_micros is deprecated.
   *     See google/ads/googleads/v13/common/bidding.proto;l=196
   * @return The targetSpendMicros.
   */
  @java.lang.Override
  @java.lang.Deprecated public long getTargetSpendMicros() {
    return targetSpendMicros_;
  }

  public static final int CPC_BID_CEILING_MICROS_FIELD_NUMBER = 4;
  private long cpcBidCeilingMicros_ = 0L;
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 4;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  @java.lang.Override
  public boolean hasCpcBidCeilingMicros() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 4;</code>
   * @return The cpcBidCeilingMicros.
   */
  @java.lang.Override
  public long getCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_;
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
      output.writeInt64(3, targetSpendMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(4, cpcBidCeilingMicros_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, targetSpendMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, cpcBidCeilingMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v13.common.TargetSpend)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.common.TargetSpend other = (com.google.ads.googleads.v13.common.TargetSpend) obj;

    if (hasTargetSpendMicros() != other.hasTargetSpendMicros()) return false;
    if (hasTargetSpendMicros()) {
      if (getTargetSpendMicros()
          != other.getTargetSpendMicros()) return false;
    }
    if (hasCpcBidCeilingMicros() != other.hasCpcBidCeilingMicros()) return false;
    if (hasCpcBidCeilingMicros()) {
      if (getCpcBidCeilingMicros()
          != other.getCpcBidCeilingMicros()) return false;
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
    if (hasTargetSpendMicros()) {
      hash = (37 * hash) + TARGET_SPEND_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetSpendMicros());
    }
    if (hasCpcBidCeilingMicros()) {
      hash = (37 * hash) + CPC_BID_CEILING_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCpcBidCeilingMicros());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.common.TargetSpend parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.common.TargetSpend parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.TargetSpend parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.common.TargetSpend prototype) {
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
   * An automated bid strategy that sets your bids to help get as many clicks
   * as possible within your budget.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.common.TargetSpend}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.common.TargetSpend)
      com.google.ads.googleads.v13.common.TargetSpendOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetSpend_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetSpend_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.common.TargetSpend.class, com.google.ads.googleads.v13.common.TargetSpend.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.common.TargetSpend.newBuilder()
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
      targetSpendMicros_ = 0L;
      cpcBidCeilingMicros_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.common.BiddingProto.internal_static_google_ads_googleads_v13_common_TargetSpend_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.TargetSpend getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.common.TargetSpend.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.TargetSpend build() {
      com.google.ads.googleads.v13.common.TargetSpend result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.TargetSpend buildPartial() {
      com.google.ads.googleads.v13.common.TargetSpend result = new com.google.ads.googleads.v13.common.TargetSpend(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.common.TargetSpend result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetSpendMicros_ = targetSpendMicros_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cpcBidCeilingMicros_ = cpcBidCeilingMicros_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v13.common.TargetSpend) {
        return mergeFrom((com.google.ads.googleads.v13.common.TargetSpend)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.common.TargetSpend other) {
      if (other == com.google.ads.googleads.v13.common.TargetSpend.getDefaultInstance()) return this;
      if (other.hasTargetSpendMicros()) {
        setTargetSpendMicros(other.getTargetSpendMicros());
      }
      if (other.hasCpcBidCeilingMicros()) {
        setCpcBidCeilingMicros(other.getCpcBidCeilingMicros());
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
              targetSpendMicros_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 32: {
              cpcBidCeilingMicros_ = input.readInt64();
              bitField0_ |= 0x00000002;
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

    private long targetSpendMicros_ ;
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * This field is deprecated and should no longer be used. See
     * https://ads-developers.googleblog.com/2020/05/reminder-about-sunset-creation-of.html
     * for details.
     * </pre>
     *
     * <code>optional int64 target_spend_micros = 3 [deprecated = true];</code>
     * @deprecated google.ads.googleads.v13.common.TargetSpend.target_spend_micros is deprecated.
     *     See google/ads/googleads/v13/common/bidding.proto;l=196
     * @return Whether the targetSpendMicros field is set.
     */
    @java.lang.Override
    @java.lang.Deprecated public boolean hasTargetSpendMicros() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * This field is deprecated and should no longer be used. See
     * https://ads-developers.googleblog.com/2020/05/reminder-about-sunset-creation-of.html
     * for details.
     * </pre>
     *
     * <code>optional int64 target_spend_micros = 3 [deprecated = true];</code>
     * @deprecated google.ads.googleads.v13.common.TargetSpend.target_spend_micros is deprecated.
     *     See google/ads/googleads/v13/common/bidding.proto;l=196
     * @return The targetSpendMicros.
     */
    @java.lang.Override
    @java.lang.Deprecated public long getTargetSpendMicros() {
      return targetSpendMicros_;
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * This field is deprecated and should no longer be used. See
     * https://ads-developers.googleblog.com/2020/05/reminder-about-sunset-creation-of.html
     * for details.
     * </pre>
     *
     * <code>optional int64 target_spend_micros = 3 [deprecated = true];</code>
     * @deprecated google.ads.googleads.v13.common.TargetSpend.target_spend_micros is deprecated.
     *     See google/ads/googleads/v13/common/bidding.proto;l=196
     * @param value The targetSpendMicros to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setTargetSpendMicros(long value) {

      targetSpendMicros_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The spend target under which to maximize clicks.
     * A TargetSpend bidder will attempt to spend the smaller of this value
     * or the natural throttling spend amount.
     * If not specified, the budget is used as the spend target.
     * This field is deprecated and should no longer be used. See
     * https://ads-developers.googleblog.com/2020/05/reminder-about-sunset-creation-of.html
     * for details.
     * </pre>
     *
     * <code>optional int64 target_spend_micros = 3 [deprecated = true];</code>
     * @deprecated google.ads.googleads.v13.common.TargetSpend.target_spend_micros is deprecated.
     *     See google/ads/googleads/v13/common/bidding.proto;l=196
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearTargetSpendMicros() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetSpendMicros_ = 0L;
      onChanged();
      return this;
    }

    private long cpcBidCeilingMicros_ ;
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 4;</code>
     * @return Whether the cpcBidCeilingMicros field is set.
     */
    @java.lang.Override
    public boolean hasCpcBidCeilingMicros() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 4;</code>
     * @return The cpcBidCeilingMicros.
     */
    @java.lang.Override
    public long getCpcBidCeilingMicros() {
      return cpcBidCeilingMicros_;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 4;</code>
     * @param value The cpcBidCeilingMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCpcBidCeilingMicros(long value) {

      cpcBidCeilingMicros_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidCeilingMicros() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cpcBidCeilingMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.common.TargetSpend)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.common.TargetSpend)
  private static final com.google.ads.googleads.v13.common.TargetSpend DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.common.TargetSpend();
  }

  public static com.google.ads.googleads.v13.common.TargetSpend getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetSpend>
      PARSER = new com.google.protobuf.AbstractParser<TargetSpend>() {
    @java.lang.Override
    public TargetSpend parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetSpend> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetSpend> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.common.TargetSpend getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

