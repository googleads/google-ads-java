// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

/**
 * <pre>
 * Manual CPC Bidding Strategy.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.services.ManualCpcBiddingStrategy}
 */
public final class ManualCpcBiddingStrategy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.services.ManualCpcBiddingStrategy)
    ManualCpcBiddingStrategyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ManualCpcBiddingStrategy.newBuilder() to construct.
  private ManualCpcBiddingStrategy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManualCpcBiddingStrategy() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ManualCpcBiddingStrategy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v18_services_ManualCpcBiddingStrategy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v18_services_ManualCpcBiddingStrategy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy.class, com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy.Builder.class);
  }

  private int bitField0_;
  public static final int DAILY_BUDGET_MICROS_FIELD_NUMBER = 1;
  private long dailyBudgetMicros_ = 0L;
  /**
   * <pre>
   * Campaign level budget in micros. If set, a minimum value
   * is enforced for the local currency used in the campaign. An error
   * will occur showing the minimum value if this field is set too low.
   * </pre>
   *
   * <code>optional int64 daily_budget_micros = 1;</code>
   * @return Whether the dailyBudgetMicros field is set.
   */
  @java.lang.Override
  public boolean hasDailyBudgetMicros() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Campaign level budget in micros. If set, a minimum value
   * is enforced for the local currency used in the campaign. An error
   * will occur showing the minimum value if this field is set too low.
   * </pre>
   *
   * <code>optional int64 daily_budget_micros = 1;</code>
   * @return The dailyBudgetMicros.
   */
  @java.lang.Override
  public long getDailyBudgetMicros() {
    return dailyBudgetMicros_;
  }

  public static final int MAX_CPC_BID_MICROS_FIELD_NUMBER = 2;
  private long maxCpcBidMicros_ = 0L;
  /**
   * <pre>
   * Required. A bid in micros to be applied to ad groups within the campaign
   * for a manual CPC bidding strategy.
   * </pre>
   *
   * <code>int64 max_cpc_bid_micros = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The maxCpcBidMicros.
   */
  @java.lang.Override
  public long getMaxCpcBidMicros() {
    return maxCpcBidMicros_;
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
      output.writeInt64(1, dailyBudgetMicros_);
    }
    if (maxCpcBidMicros_ != 0L) {
      output.writeInt64(2, maxCpcBidMicros_);
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
        .computeInt64Size(1, dailyBudgetMicros_);
    }
    if (maxCpcBidMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, maxCpcBidMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy other = (com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy) obj;

    if (hasDailyBudgetMicros() != other.hasDailyBudgetMicros()) return false;
    if (hasDailyBudgetMicros()) {
      if (getDailyBudgetMicros()
          != other.getDailyBudgetMicros()) return false;
    }
    if (getMaxCpcBidMicros()
        != other.getMaxCpcBidMicros()) return false;
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
    if (hasDailyBudgetMicros()) {
      hash = (37 * hash) + DAILY_BUDGET_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDailyBudgetMicros());
    }
    hash = (37 * hash) + MAX_CPC_BID_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxCpcBidMicros());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy prototype) {
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
   * Manual CPC Bidding Strategy.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.services.ManualCpcBiddingStrategy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.services.ManualCpcBiddingStrategy)
      com.google.ads.googleads.v18.services.ManualCpcBiddingStrategyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v18_services_ManualCpcBiddingStrategy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v18_services_ManualCpcBiddingStrategy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy.class, com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy.newBuilder()
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
      dailyBudgetMicros_ = 0L;
      maxCpcBidMicros_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v18_services_ManualCpcBiddingStrategy_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy build() {
      com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy buildPartial() {
      com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy result = new com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dailyBudgetMicros_ = dailyBudgetMicros_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxCpcBidMicros_ = maxCpcBidMicros_;
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
      if (other instanceof com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy) {
        return mergeFrom((com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy other) {
      if (other == com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy.getDefaultInstance()) return this;
      if (other.hasDailyBudgetMicros()) {
        setDailyBudgetMicros(other.getDailyBudgetMicros());
      }
      if (other.getMaxCpcBidMicros() != 0L) {
        setMaxCpcBidMicros(other.getMaxCpcBidMicros());
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
              dailyBudgetMicros_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              maxCpcBidMicros_ = input.readInt64();
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

    private long dailyBudgetMicros_ ;
    /**
     * <pre>
     * Campaign level budget in micros. If set, a minimum value
     * is enforced for the local currency used in the campaign. An error
     * will occur showing the minimum value if this field is set too low.
     * </pre>
     *
     * <code>optional int64 daily_budget_micros = 1;</code>
     * @return Whether the dailyBudgetMicros field is set.
     */
    @java.lang.Override
    public boolean hasDailyBudgetMicros() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Campaign level budget in micros. If set, a minimum value
     * is enforced for the local currency used in the campaign. An error
     * will occur showing the minimum value if this field is set too low.
     * </pre>
     *
     * <code>optional int64 daily_budget_micros = 1;</code>
     * @return The dailyBudgetMicros.
     */
    @java.lang.Override
    public long getDailyBudgetMicros() {
      return dailyBudgetMicros_;
    }
    /**
     * <pre>
     * Campaign level budget in micros. If set, a minimum value
     * is enforced for the local currency used in the campaign. An error
     * will occur showing the minimum value if this field is set too low.
     * </pre>
     *
     * <code>optional int64 daily_budget_micros = 1;</code>
     * @param value The dailyBudgetMicros to set.
     * @return This builder for chaining.
     */
    public Builder setDailyBudgetMicros(long value) {

      dailyBudgetMicros_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Campaign level budget in micros. If set, a minimum value
     * is enforced for the local currency used in the campaign. An error
     * will occur showing the minimum value if this field is set too low.
     * </pre>
     *
     * <code>optional int64 daily_budget_micros = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDailyBudgetMicros() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dailyBudgetMicros_ = 0L;
      onChanged();
      return this;
    }

    private long maxCpcBidMicros_ ;
    /**
     * <pre>
     * Required. A bid in micros to be applied to ad groups within the campaign
     * for a manual CPC bidding strategy.
     * </pre>
     *
     * <code>int64 max_cpc_bid_micros = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The maxCpcBidMicros.
     */
    @java.lang.Override
    public long getMaxCpcBidMicros() {
      return maxCpcBidMicros_;
    }
    /**
     * <pre>
     * Required. A bid in micros to be applied to ad groups within the campaign
     * for a manual CPC bidding strategy.
     * </pre>
     *
     * <code>int64 max_cpc_bid_micros = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The maxCpcBidMicros to set.
     * @return This builder for chaining.
     */
    public Builder setMaxCpcBidMicros(long value) {

      maxCpcBidMicros_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A bid in micros to be applied to ad groups within the campaign
     * for a manual CPC bidding strategy.
     * </pre>
     *
     * <code>int64 max_cpc_bid_micros = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxCpcBidMicros() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxCpcBidMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.services.ManualCpcBiddingStrategy)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.services.ManualCpcBiddingStrategy)
  private static final com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy();
  }

  public static com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManualCpcBiddingStrategy>
      PARSER = new com.google.protobuf.AbstractParser<ManualCpcBiddingStrategy>() {
    @java.lang.Override
    public ManualCpcBiddingStrategy parsePartialFrom(
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

  public static com.google.protobuf.Parser<ManualCpcBiddingStrategy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManualCpcBiddingStrategy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.services.ManualCpcBiddingStrategy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

