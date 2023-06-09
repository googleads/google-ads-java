// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/keyword_plan_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * An ad group forecast.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.KeywordPlanAdGroupForecast}
 */
public final class KeywordPlanAdGroupForecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.KeywordPlanAdGroupForecast)
    KeywordPlanAdGroupForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanAdGroupForecast.newBuilder() to construct.
  private KeywordPlanAdGroupForecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanAdGroupForecast() {
    keywordPlanAdGroup_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanAdGroupForecast();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupForecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupForecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast.class, com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast.Builder.class);
  }

  private int bitField0_;
  public static final int KEYWORD_PLAN_AD_GROUP_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object keywordPlanAdGroup_ = "";
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   *
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_ad_group = 3;</code>
   * @return Whether the keywordPlanAdGroup field is set.
   */
  @java.lang.Override
  public boolean hasKeywordPlanAdGroup() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   *
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_ad_group = 3;</code>
   * @return The keywordPlanAdGroup.
   */
  @java.lang.Override
  public java.lang.String getKeywordPlanAdGroup() {
    java.lang.Object ref = keywordPlanAdGroup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keywordPlanAdGroup_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan ad group related to the forecast.
   *
   * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_ad_group = 3;</code>
   * @return The bytes for keywordPlanAdGroup.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeywordPlanAdGroupBytes() {
    java.lang.Object ref = keywordPlanAdGroup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keywordPlanAdGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AD_GROUP_FORECAST_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v12.services.ForecastMetrics adGroupForecast_;
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
   * @return Whether the adGroupForecast field is set.
   */
  @java.lang.Override
  public boolean hasAdGroupForecast() {
    return adGroupForecast_ != null;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
   * @return The adGroupForecast.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.ForecastMetrics getAdGroupForecast() {
    return adGroupForecast_ == null ? com.google.ads.googleads.v12.services.ForecastMetrics.getDefaultInstance() : adGroupForecast_;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder getAdGroupForecastOrBuilder() {
    return adGroupForecast_ == null ? com.google.ads.googleads.v12.services.ForecastMetrics.getDefaultInstance() : adGroupForecast_;
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
    if (adGroupForecast_ != null) {
      output.writeMessage(2, getAdGroupForecast());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, keywordPlanAdGroup_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adGroupForecast_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAdGroupForecast());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, keywordPlanAdGroup_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast other = (com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast) obj;

    if (hasKeywordPlanAdGroup() != other.hasKeywordPlanAdGroup()) return false;
    if (hasKeywordPlanAdGroup()) {
      if (!getKeywordPlanAdGroup()
          .equals(other.getKeywordPlanAdGroup())) return false;
    }
    if (hasAdGroupForecast() != other.hasAdGroupForecast()) return false;
    if (hasAdGroupForecast()) {
      if (!getAdGroupForecast()
          .equals(other.getAdGroupForecast())) return false;
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
    if (hasKeywordPlanAdGroup()) {
      hash = (37 * hash) + KEYWORD_PLAN_AD_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordPlanAdGroup().hashCode();
    }
    if (hasAdGroupForecast()) {
      hash = (37 * hash) + AD_GROUP_FORECAST_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroupForecast().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast prototype) {
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
   * An ad group forecast.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.KeywordPlanAdGroupForecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.KeywordPlanAdGroupForecast)
      com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupForecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupForecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast.class, com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast.newBuilder()
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
      keywordPlanAdGroup_ = "";
      adGroupForecast_ = null;
      if (adGroupForecastBuilder_ != null) {
        adGroupForecastBuilder_.dispose();
        adGroupForecastBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupForecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast build() {
      com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast buildPartial() {
      com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast result = new com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.keywordPlanAdGroup_ = keywordPlanAdGroup_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adGroupForecast_ = adGroupForecastBuilder_ == null
            ? adGroupForecast_
            : adGroupForecastBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast) {
        return mergeFrom((com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast other) {
      if (other == com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast.getDefaultInstance()) return this;
      if (other.hasKeywordPlanAdGroup()) {
        keywordPlanAdGroup_ = other.keywordPlanAdGroup_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAdGroupForecast()) {
        mergeAdGroupForecast(other.getAdGroupForecast());
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
                  getAdGroupForecastFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              keywordPlanAdGroup_ = input.readStringRequireUtf8();
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

    private java.lang.Object keywordPlanAdGroup_ = "";
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_ad_group = 3;</code>
     * @return Whether the keywordPlanAdGroup field is set.
     */
    public boolean hasKeywordPlanAdGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_ad_group = 3;</code>
     * @return The keywordPlanAdGroup.
     */
    public java.lang.String getKeywordPlanAdGroup() {
      java.lang.Object ref = keywordPlanAdGroup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keywordPlanAdGroup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_ad_group = 3;</code>
     * @return The bytes for keywordPlanAdGroup.
     */
    public com.google.protobuf.ByteString
        getKeywordPlanAdGroupBytes() {
      java.lang.Object ref = keywordPlanAdGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keywordPlanAdGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_ad_group = 3;</code>
     * @param value The keywordPlanAdGroup to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanAdGroup(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keywordPlanAdGroup_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_ad_group = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywordPlanAdGroup() {
      keywordPlanAdGroup_ = getDefaultInstance().getKeywordPlanAdGroup();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan ad group related to the forecast.
     *
     * `customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_ad_group = 3;</code>
     * @param value The bytes for keywordPlanAdGroup to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanAdGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keywordPlanAdGroup_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v12.services.ForecastMetrics adGroupForecast_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.ForecastMetrics, com.google.ads.googleads.v12.services.ForecastMetrics.Builder, com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder> adGroupForecastBuilder_;
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
     * @return Whether the adGroupForecast field is set.
     */
    public boolean hasAdGroupForecast() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
     * @return The adGroupForecast.
     */
    public com.google.ads.googleads.v12.services.ForecastMetrics getAdGroupForecast() {
      if (adGroupForecastBuilder_ == null) {
        return adGroupForecast_ == null ? com.google.ads.googleads.v12.services.ForecastMetrics.getDefaultInstance() : adGroupForecast_;
      } else {
        return adGroupForecastBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public Builder setAdGroupForecast(com.google.ads.googleads.v12.services.ForecastMetrics value) {
      if (adGroupForecastBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adGroupForecast_ = value;
      } else {
        adGroupForecastBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public Builder setAdGroupForecast(
        com.google.ads.googleads.v12.services.ForecastMetrics.Builder builderForValue) {
      if (adGroupForecastBuilder_ == null) {
        adGroupForecast_ = builderForValue.build();
      } else {
        adGroupForecastBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public Builder mergeAdGroupForecast(com.google.ads.googleads.v12.services.ForecastMetrics value) {
      if (adGroupForecastBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          adGroupForecast_ != null &&
          adGroupForecast_ != com.google.ads.googleads.v12.services.ForecastMetrics.getDefaultInstance()) {
          getAdGroupForecastBuilder().mergeFrom(value);
        } else {
          adGroupForecast_ = value;
        }
      } else {
        adGroupForecastBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public Builder clearAdGroupForecast() {
      bitField0_ = (bitField0_ & ~0x00000002);
      adGroupForecast_ = null;
      if (adGroupForecastBuilder_ != null) {
        adGroupForecastBuilder_.dispose();
        adGroupForecastBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public com.google.ads.googleads.v12.services.ForecastMetrics.Builder getAdGroupForecastBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAdGroupForecastFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    public com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder getAdGroupForecastOrBuilder() {
      if (adGroupForecastBuilder_ != null) {
        return adGroupForecastBuilder_.getMessageOrBuilder();
      } else {
        return adGroupForecast_ == null ?
            com.google.ads.googleads.v12.services.ForecastMetrics.getDefaultInstance() : adGroupForecast_;
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan ad group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics ad_group_forecast = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.ForecastMetrics, com.google.ads.googleads.v12.services.ForecastMetrics.Builder, com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder> 
        getAdGroupForecastFieldBuilder() {
      if (adGroupForecastBuilder_ == null) {
        adGroupForecastBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.services.ForecastMetrics, com.google.ads.googleads.v12.services.ForecastMetrics.Builder, com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder>(
                getAdGroupForecast(),
                getParentForChildren(),
                isClean());
        adGroupForecast_ = null;
      }
      return adGroupForecastBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.KeywordPlanAdGroupForecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.KeywordPlanAdGroupForecast)
  private static final com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast();
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanAdGroupForecast>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanAdGroupForecast>() {
    @java.lang.Override
    public KeywordPlanAdGroupForecast parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordPlanAdGroupForecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanAdGroupForecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

