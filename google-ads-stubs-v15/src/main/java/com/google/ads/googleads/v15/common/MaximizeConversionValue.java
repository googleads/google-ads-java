// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/bidding.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.common;

/**
 * <pre>
 * An automated bidding strategy to help get the most conversion value for your
 * campaigns while spending your budget.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.common.MaximizeConversionValue}
 */
public final class MaximizeConversionValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.common.MaximizeConversionValue)
    MaximizeConversionValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MaximizeConversionValue.newBuilder() to construct.
  private MaximizeConversionValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MaximizeConversionValue() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MaximizeConversionValue();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.common.BiddingProto.internal_static_google_ads_googleads_v15_common_MaximizeConversionValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.common.BiddingProto.internal_static_google_ads_googleads_v15_common_MaximizeConversionValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.common.MaximizeConversionValue.class, com.google.ads.googleads.v15.common.MaximizeConversionValue.Builder.class);
  }

  public static final int TARGET_ROAS_FIELD_NUMBER = 2;
  private double targetRoas_ = 0D;
  /**
   * <pre>
   * The target return on ad spend (ROAS) option. If set, the bid strategy will
   * maximize revenue while averaging the target return on ad spend. If the
   * target ROAS is high, the bid strategy may not be able to spend the full
   * budget. If the target ROAS is not set, the bid strategy will aim to
   * achieve the highest possible ROAS for the budget.
   * </pre>
   *
   * <code>double target_roas = 2;</code>
   * @return The targetRoas.
   */
  @java.lang.Override
  public double getTargetRoas() {
    return targetRoas_;
  }

  public static final int CPC_BID_CEILING_MICROS_FIELD_NUMBER = 3;
  private long cpcBidCeilingMicros_ = 0L;
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * Mutable for portfolio bidding strategies only.
   * </pre>
   *
   * <code>int64 cpc_bid_ceiling_micros = 3;</code>
   * @return The cpcBidCeilingMicros.
   */
  @java.lang.Override
  public long getCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_;
  }

  public static final int CPC_BID_FLOOR_MICROS_FIELD_NUMBER = 4;
  private long cpcBidFloorMicros_ = 0L;
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * Mutable for portfolio bidding strategies only.
   * </pre>
   *
   * <code>int64 cpc_bid_floor_micros = 4;</code>
   * @return The cpcBidFloorMicros.
   */
  @java.lang.Override
  public long getCpcBidFloorMicros() {
    return cpcBidFloorMicros_;
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
    if (java.lang.Double.doubleToRawLongBits(targetRoas_) != 0) {
      output.writeDouble(2, targetRoas_);
    }
    if (cpcBidCeilingMicros_ != 0L) {
      output.writeInt64(3, cpcBidCeilingMicros_);
    }
    if (cpcBidFloorMicros_ != 0L) {
      output.writeInt64(4, cpcBidFloorMicros_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(targetRoas_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, targetRoas_);
    }
    if (cpcBidCeilingMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, cpcBidCeilingMicros_);
    }
    if (cpcBidFloorMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, cpcBidFloorMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.common.MaximizeConversionValue)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.common.MaximizeConversionValue other = (com.google.ads.googleads.v15.common.MaximizeConversionValue) obj;

    if (java.lang.Double.doubleToLongBits(getTargetRoas())
        != java.lang.Double.doubleToLongBits(
            other.getTargetRoas())) return false;
    if (getCpcBidCeilingMicros()
        != other.getCpcBidCeilingMicros()) return false;
    if (getCpcBidFloorMicros()
        != other.getCpcBidFloorMicros()) return false;
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
    hash = (37 * hash) + TARGET_ROAS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTargetRoas()));
    hash = (37 * hash) + CPC_BID_CEILING_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCpcBidCeilingMicros());
    hash = (37 * hash) + CPC_BID_FLOOR_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCpcBidFloorMicros());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.MaximizeConversionValue parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.common.MaximizeConversionValue prototype) {
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
   * An automated bidding strategy to help get the most conversion value for your
   * campaigns while spending your budget.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.common.MaximizeConversionValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.common.MaximizeConversionValue)
      com.google.ads.googleads.v15.common.MaximizeConversionValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.common.BiddingProto.internal_static_google_ads_googleads_v15_common_MaximizeConversionValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.common.BiddingProto.internal_static_google_ads_googleads_v15_common_MaximizeConversionValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.common.MaximizeConversionValue.class, com.google.ads.googleads.v15.common.MaximizeConversionValue.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.common.MaximizeConversionValue.newBuilder()
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
      targetRoas_ = 0D;
      cpcBidCeilingMicros_ = 0L;
      cpcBidFloorMicros_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.common.BiddingProto.internal_static_google_ads_googleads_v15_common_MaximizeConversionValue_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.MaximizeConversionValue getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.common.MaximizeConversionValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.MaximizeConversionValue build() {
      com.google.ads.googleads.v15.common.MaximizeConversionValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.MaximizeConversionValue buildPartial() {
      com.google.ads.googleads.v15.common.MaximizeConversionValue result = new com.google.ads.googleads.v15.common.MaximizeConversionValue(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.common.MaximizeConversionValue result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetRoas_ = targetRoas_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cpcBidCeilingMicros_ = cpcBidCeilingMicros_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cpcBidFloorMicros_ = cpcBidFloorMicros_;
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
      if (other instanceof com.google.ads.googleads.v15.common.MaximizeConversionValue) {
        return mergeFrom((com.google.ads.googleads.v15.common.MaximizeConversionValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.common.MaximizeConversionValue other) {
      if (other == com.google.ads.googleads.v15.common.MaximizeConversionValue.getDefaultInstance()) return this;
      if (other.getTargetRoas() != 0D) {
        setTargetRoas(other.getTargetRoas());
      }
      if (other.getCpcBidCeilingMicros() != 0L) {
        setCpcBidCeilingMicros(other.getCpcBidCeilingMicros());
      }
      if (other.getCpcBidFloorMicros() != 0L) {
        setCpcBidFloorMicros(other.getCpcBidFloorMicros());
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
            case 17: {
              targetRoas_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 17
            case 24: {
              cpcBidCeilingMicros_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 32: {
              cpcBidFloorMicros_ = input.readInt64();
              bitField0_ |= 0x00000004;
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

    private double targetRoas_ ;
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>double target_roas = 2;</code>
     * @return The targetRoas.
     */
    @java.lang.Override
    public double getTargetRoas() {
      return targetRoas_;
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>double target_roas = 2;</code>
     * @param value The targetRoas to set.
     * @return This builder for chaining.
     */
    public Builder setTargetRoas(double value) {

      targetRoas_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target return on ad spend (ROAS) option. If set, the bid strategy will
     * maximize revenue while averaging the target return on ad spend. If the
     * target ROAS is high, the bid strategy may not be able to spend the full
     * budget. If the target ROAS is not set, the bid strategy will aim to
     * achieve the highest possible ROAS for the budget.
     * </pre>
     *
     * <code>double target_roas = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetRoas() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetRoas_ = 0D;
      onChanged();
      return this;
    }

    private long cpcBidCeilingMicros_ ;
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 3;</code>
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
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 3;</code>
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
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_ceiling_micros = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidCeilingMicros() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cpcBidCeilingMicros_ = 0L;
      onChanged();
      return this;
    }

    private long cpcBidFloorMicros_ ;
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 4;</code>
     * @return The cpcBidFloorMicros.
     */
    @java.lang.Override
    public long getCpcBidFloorMicros() {
      return cpcBidFloorMicros_;
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 4;</code>
     * @param value The cpcBidFloorMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCpcBidFloorMicros(long value) {

      cpcBidFloorMicros_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * Mutable for portfolio bidding strategies only.
     * </pre>
     *
     * <code>int64 cpc_bid_floor_micros = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidFloorMicros() {
      bitField0_ = (bitField0_ & ~0x00000004);
      cpcBidFloorMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.common.MaximizeConversionValue)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.common.MaximizeConversionValue)
  private static final com.google.ads.googleads.v15.common.MaximizeConversionValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.common.MaximizeConversionValue();
  }

  public static com.google.ads.googleads.v15.common.MaximizeConversionValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MaximizeConversionValue>
      PARSER = new com.google.protobuf.AbstractParser<MaximizeConversionValue>() {
    @java.lang.Override
    public MaximizeConversionValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<MaximizeConversionValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MaximizeConversionValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.common.MaximizeConversionValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

