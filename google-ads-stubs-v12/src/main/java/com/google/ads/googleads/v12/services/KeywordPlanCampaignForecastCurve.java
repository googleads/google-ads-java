// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/keyword_plan_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * The forecast curve for the campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve}
 */
public final class KeywordPlanCampaignForecastCurve extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve)
    KeywordPlanCampaignForecastCurveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanCampaignForecastCurve.newBuilder() to construct.
  private KeywordPlanCampaignForecastCurve(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanCampaignForecastCurve() {
    keywordPlanCampaign_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanCampaignForecastCurve();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecastCurve_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecastCurve_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.class, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder.class);
  }

  private int bitField0_;
  public static final int KEYWORD_PLAN_CAMPAIGN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object keywordPlanCampaign_ = "";
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   *
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  @java.lang.Override
  public boolean hasKeywordPlanCampaign() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   *
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return The keywordPlanCampaign.
   */
  @java.lang.Override
  public java.lang.String getKeywordPlanCampaign() {
    java.lang.Object ref = keywordPlanCampaign_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keywordPlanCampaign_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   *
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return The bytes for keywordPlanCampaign.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeywordPlanCampaignBytes() {
    java.lang.Object ref = keywordPlanCampaign_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keywordPlanCampaign_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_CPC_BID_FORECAST_CURVE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve maxCpcBidForecastCurve_;
  /**
   * <pre>
   * The max cpc bid forecast curve for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
   * @return Whether the maxCpcBidForecastCurve field is set.
   */
  @java.lang.Override
  public boolean hasMaxCpcBidForecastCurve() {
    return maxCpcBidForecastCurve_ != null;
  }
  /**
   * <pre>
   * The max cpc bid forecast curve for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
   * @return The maxCpcBidForecastCurve.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve getMaxCpcBidForecastCurve() {
    return maxCpcBidForecastCurve_ == null ? com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance() : maxCpcBidForecastCurve_;
  }
  /**
   * <pre>
   * The max cpc bid forecast curve for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder getMaxCpcBidForecastCurveOrBuilder() {
    return maxCpcBidForecastCurve_ == null ? com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance() : maxCpcBidForecastCurve_;
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
    if (maxCpcBidForecastCurve_ != null) {
      output.writeMessage(2, getMaxCpcBidForecastCurve());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, keywordPlanCampaign_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxCpcBidForecastCurve_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMaxCpcBidForecastCurve());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, keywordPlanCampaign_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve other = (com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve) obj;

    if (hasKeywordPlanCampaign() != other.hasKeywordPlanCampaign()) return false;
    if (hasKeywordPlanCampaign()) {
      if (!getKeywordPlanCampaign()
          .equals(other.getKeywordPlanCampaign())) return false;
    }
    if (hasMaxCpcBidForecastCurve() != other.hasMaxCpcBidForecastCurve()) return false;
    if (hasMaxCpcBidForecastCurve()) {
      if (!getMaxCpcBidForecastCurve()
          .equals(other.getMaxCpcBidForecastCurve())) return false;
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
    if (hasKeywordPlanCampaign()) {
      hash = (37 * hash) + KEYWORD_PLAN_CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordPlanCampaign().hashCode();
    }
    if (hasMaxCpcBidForecastCurve()) {
      hash = (37 * hash) + MAX_CPC_BID_FORECAST_CURVE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxCpcBidForecastCurve().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve prototype) {
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
   * The forecast curve for the campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve)
      com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecastCurve_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecastCurve_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.class, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.newBuilder()
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
      keywordPlanCampaign_ = "";
      maxCpcBidForecastCurve_ = null;
      if (maxCpcBidForecastCurveBuilder_ != null) {
        maxCpcBidForecastCurveBuilder_.dispose();
        maxCpcBidForecastCurveBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecastCurve_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve build() {
      com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve buildPartial() {
      com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve result = new com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.keywordPlanCampaign_ = keywordPlanCampaign_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxCpcBidForecastCurve_ = maxCpcBidForecastCurveBuilder_ == null
            ? maxCpcBidForecastCurve_
            : maxCpcBidForecastCurveBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve) {
        return mergeFrom((com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve other) {
      if (other == com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve.getDefaultInstance()) return this;
      if (other.hasKeywordPlanCampaign()) {
        keywordPlanCampaign_ = other.keywordPlanCampaign_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMaxCpcBidForecastCurve()) {
        mergeMaxCpcBidForecastCurve(other.getMaxCpcBidForecastCurve());
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
            case 18: {
              input.readMessage(
                  getMaxCpcBidForecastCurveFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              keywordPlanCampaign_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
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

    private java.lang.Object keywordPlanCampaign_ = "";
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return Whether the keywordPlanCampaign field is set.
     */
    public boolean hasKeywordPlanCampaign() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return The keywordPlanCampaign.
     */
    public java.lang.String getKeywordPlanCampaign() {
      java.lang.Object ref = keywordPlanCampaign_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keywordPlanCampaign_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return The bytes for keywordPlanCampaign.
     */
    public com.google.protobuf.ByteString
        getKeywordPlanCampaignBytes() {
      java.lang.Object ref = keywordPlanCampaign_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keywordPlanCampaign_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @param value The keywordPlanCampaign to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanCampaign(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keywordPlanCampaign_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywordPlanCampaign() {
      keywordPlanCampaign_ = getDefaultInstance().getKeywordPlanCampaign();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @param value The bytes for keywordPlanCampaign to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanCampaignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keywordPlanCampaign_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve maxCpcBidForecastCurve_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve, com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.Builder, com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder> maxCpcBidForecastCurveBuilder_;
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     * @return Whether the maxCpcBidForecastCurve field is set.
     */
    public boolean hasMaxCpcBidForecastCurve() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     * @return The maxCpcBidForecastCurve.
     */
    public com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve getMaxCpcBidForecastCurve() {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        return maxCpcBidForecastCurve_ == null ? com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance() : maxCpcBidForecastCurve_;
      } else {
        return maxCpcBidForecastCurveBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public Builder setMaxCpcBidForecastCurve(com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve value) {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxCpcBidForecastCurve_ = value;
      } else {
        maxCpcBidForecastCurveBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public Builder setMaxCpcBidForecastCurve(
        com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.Builder builderForValue) {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        maxCpcBidForecastCurve_ = builderForValue.build();
      } else {
        maxCpcBidForecastCurveBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public Builder mergeMaxCpcBidForecastCurve(com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve value) {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          maxCpcBidForecastCurve_ != null &&
          maxCpcBidForecastCurve_ != com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance()) {
          getMaxCpcBidForecastCurveBuilder().mergeFrom(value);
        } else {
          maxCpcBidForecastCurve_ = value;
        }
      } else {
        maxCpcBidForecastCurveBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public Builder clearMaxCpcBidForecastCurve() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxCpcBidForecastCurve_ = null;
      if (maxCpcBidForecastCurveBuilder_ != null) {
        maxCpcBidForecastCurveBuilder_.dispose();
        maxCpcBidForecastCurveBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.Builder getMaxCpcBidForecastCurveBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMaxCpcBidForecastCurveFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    public com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder getMaxCpcBidForecastCurveOrBuilder() {
      if (maxCpcBidForecastCurveBuilder_ != null) {
        return maxCpcBidForecastCurveBuilder_.getMessageOrBuilder();
      } else {
        return maxCpcBidForecastCurve_ == null ?
            com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance() : maxCpcBidForecastCurve_;
      }
    }
    /**
     * <pre>
     * The max cpc bid forecast curve for the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve max_cpc_bid_forecast_curve = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve, com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.Builder, com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder> 
        getMaxCpcBidForecastCurveFieldBuilder() {
      if (maxCpcBidForecastCurveBuilder_ == null) {
        maxCpcBidForecastCurveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve, com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurve.Builder, com.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder>(
                getMaxCpcBidForecastCurve(),
                getParentForChildren(),
                isClean());
        maxCpcBidForecastCurve_ = null;
      }
      return maxCpcBidForecastCurveBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve)
  private static final com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve();
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanCampaignForecastCurve>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanCampaignForecastCurve>() {
    @java.lang.Override
    public KeywordPlanCampaignForecastCurve parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordPlanCampaignForecastCurve> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanCampaignForecastCurve> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

