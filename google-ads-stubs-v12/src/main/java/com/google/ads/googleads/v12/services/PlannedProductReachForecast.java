// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/reach_plan_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * The forecasted allocation and traffic metrics for a specific product
 * at a point on the reach curve.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.PlannedProductReachForecast}
 */
public final class PlannedProductReachForecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.PlannedProductReachForecast)
    PlannedProductReachForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlannedProductReachForecast.newBuilder() to construct.
  private PlannedProductReachForecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlannedProductReachForecast() {
    plannableProductCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlannedProductReachForecast();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_PlannedProductReachForecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_PlannedProductReachForecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.PlannedProductReachForecast.class, com.google.ads.googleads.v12.services.PlannedProductReachForecast.Builder.class);
  }

  public static final int PLANNABLE_PRODUCT_CODE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object plannableProductCode_ = "";
  /**
   * <pre>
   * Selected product for planning. The product codes returned are within the
   * set of the ones returned by ListPlannableProducts when using the same
   * location ID.
   * </pre>
   *
   * <code>string plannable_product_code = 1;</code>
   * @return The plannableProductCode.
   */
  @java.lang.Override
  public java.lang.String getPlannableProductCode() {
    java.lang.Object ref = plannableProductCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plannableProductCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Selected product for planning. The product codes returned are within the
   * set of the ones returned by ListPlannableProducts when using the same
   * location ID.
   * </pre>
   *
   * <code>string plannable_product_code = 1;</code>
   * @return The bytes for plannableProductCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlannableProductCodeBytes() {
    java.lang.Object ref = plannableProductCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plannableProductCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COST_MICROS_FIELD_NUMBER = 2;
  private long costMicros_ = 0L;
  /**
   * <pre>
   * The cost in micros. This may differ from the product's input allocation
   * if one or more planned products cannot fulfill the budget because of
   * limited inventory.
   * </pre>
   *
   * <code>int64 cost_micros = 2;</code>
   * @return The costMicros.
   */
  @java.lang.Override
  public long getCostMicros() {
    return costMicros_;
  }

  public static final int PLANNED_PRODUCT_FORECAST_FIELD_NUMBER = 3;
  private com.google.ads.googleads.v12.services.PlannedProductForecast plannedProductForecast_;
  /**
   * <pre>
   * Forecasted traffic metrics for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
   * @return Whether the plannedProductForecast field is set.
   */
  @java.lang.Override
  public boolean hasPlannedProductForecast() {
    return plannedProductForecast_ != null;
  }
  /**
   * <pre>
   * Forecasted traffic metrics for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
   * @return The plannedProductForecast.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.PlannedProductForecast getPlannedProductForecast() {
    return plannedProductForecast_ == null ? com.google.ads.googleads.v12.services.PlannedProductForecast.getDefaultInstance() : plannedProductForecast_;
  }
  /**
   * <pre>
   * Forecasted traffic metrics for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.PlannedProductForecastOrBuilder getPlannedProductForecastOrBuilder() {
    return plannedProductForecast_ == null ? com.google.ads.googleads.v12.services.PlannedProductForecast.getDefaultInstance() : plannedProductForecast_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plannableProductCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, plannableProductCode_);
    }
    if (costMicros_ != 0L) {
      output.writeInt64(2, costMicros_);
    }
    if (plannedProductForecast_ != null) {
      output.writeMessage(3, getPlannedProductForecast());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plannableProductCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, plannableProductCode_);
    }
    if (costMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, costMicros_);
    }
    if (plannedProductForecast_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPlannedProductForecast());
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.PlannedProductReachForecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.PlannedProductReachForecast other = (com.google.ads.googleads.v12.services.PlannedProductReachForecast) obj;

    if (!getPlannableProductCode()
        .equals(other.getPlannableProductCode())) return false;
    if (getCostMicros()
        != other.getCostMicros()) return false;
    if (hasPlannedProductForecast() != other.hasPlannedProductForecast()) return false;
    if (hasPlannedProductForecast()) {
      if (!getPlannedProductForecast()
          .equals(other.getPlannedProductForecast())) return false;
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
    hash = (37 * hash) + PLANNABLE_PRODUCT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getPlannableProductCode().hashCode();
    hash = (37 * hash) + COST_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCostMicros());
    if (hasPlannedProductForecast()) {
      hash = (37 * hash) + PLANNED_PRODUCT_FORECAST_FIELD_NUMBER;
      hash = (53 * hash) + getPlannedProductForecast().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.PlannedProductReachForecast prototype) {
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
   * The forecasted allocation and traffic metrics for a specific product
   * at a point on the reach curve.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.PlannedProductReachForecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.PlannedProductReachForecast)
      com.google.ads.googleads.v12.services.PlannedProductReachForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_PlannedProductReachForecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_PlannedProductReachForecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.PlannedProductReachForecast.class, com.google.ads.googleads.v12.services.PlannedProductReachForecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.PlannedProductReachForecast.newBuilder()
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
      plannableProductCode_ = "";
      costMicros_ = 0L;
      plannedProductForecast_ = null;
      if (plannedProductForecastBuilder_ != null) {
        plannedProductForecastBuilder_.dispose();
        plannedProductForecastBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v12_services_PlannedProductReachForecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.PlannedProductReachForecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.PlannedProductReachForecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.PlannedProductReachForecast build() {
      com.google.ads.googleads.v12.services.PlannedProductReachForecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.PlannedProductReachForecast buildPartial() {
      com.google.ads.googleads.v12.services.PlannedProductReachForecast result = new com.google.ads.googleads.v12.services.PlannedProductReachForecast(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.PlannedProductReachForecast result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.plannableProductCode_ = plannableProductCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.costMicros_ = costMicros_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.plannedProductForecast_ = plannedProductForecastBuilder_ == null
            ? plannedProductForecast_
            : plannedProductForecastBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.PlannedProductReachForecast) {
        return mergeFrom((com.google.ads.googleads.v12.services.PlannedProductReachForecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.PlannedProductReachForecast other) {
      if (other == com.google.ads.googleads.v12.services.PlannedProductReachForecast.getDefaultInstance()) return this;
      if (!other.getPlannableProductCode().isEmpty()) {
        plannableProductCode_ = other.plannableProductCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getCostMicros() != 0L) {
        setCostMicros(other.getCostMicros());
      }
      if (other.hasPlannedProductForecast()) {
        mergePlannedProductForecast(other.getPlannedProductForecast());
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
              plannableProductCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              costMicros_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getPlannedProductForecastFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private java.lang.Object plannableProductCode_ = "";
    /**
     * <pre>
     * Selected product for planning. The product codes returned are within the
     * set of the ones returned by ListPlannableProducts when using the same
     * location ID.
     * </pre>
     *
     * <code>string plannable_product_code = 1;</code>
     * @return The plannableProductCode.
     */
    public java.lang.String getPlannableProductCode() {
      java.lang.Object ref = plannableProductCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plannableProductCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Selected product for planning. The product codes returned are within the
     * set of the ones returned by ListPlannableProducts when using the same
     * location ID.
     * </pre>
     *
     * <code>string plannable_product_code = 1;</code>
     * @return The bytes for plannableProductCode.
     */
    public com.google.protobuf.ByteString
        getPlannableProductCodeBytes() {
      java.lang.Object ref = plannableProductCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plannableProductCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Selected product for planning. The product codes returned are within the
     * set of the ones returned by ListPlannableProducts when using the same
     * location ID.
     * </pre>
     *
     * <code>string plannable_product_code = 1;</code>
     * @param value The plannableProductCode to set.
     * @return This builder for chaining.
     */
    public Builder setPlannableProductCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      plannableProductCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selected product for planning. The product codes returned are within the
     * set of the ones returned by ListPlannableProducts when using the same
     * location ID.
     * </pre>
     *
     * <code>string plannable_product_code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlannableProductCode() {
      plannableProductCode_ = getDefaultInstance().getPlannableProductCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selected product for planning. The product codes returned are within the
     * set of the ones returned by ListPlannableProducts when using the same
     * location ID.
     * </pre>
     *
     * <code>string plannable_product_code = 1;</code>
     * @param value The bytes for plannableProductCode to set.
     * @return This builder for chaining.
     */
    public Builder setPlannableProductCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      plannableProductCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long costMicros_ ;
    /**
     * <pre>
     * The cost in micros. This may differ from the product's input allocation
     * if one or more planned products cannot fulfill the budget because of
     * limited inventory.
     * </pre>
     *
     * <code>int64 cost_micros = 2;</code>
     * @return The costMicros.
     */
    @java.lang.Override
    public long getCostMicros() {
      return costMicros_;
    }
    /**
     * <pre>
     * The cost in micros. This may differ from the product's input allocation
     * if one or more planned products cannot fulfill the budget because of
     * limited inventory.
     * </pre>
     *
     * <code>int64 cost_micros = 2;</code>
     * @param value The costMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCostMicros(long value) {

      costMicros_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The cost in micros. This may differ from the product's input allocation
     * if one or more planned products cannot fulfill the budget because of
     * limited inventory.
     * </pre>
     *
     * <code>int64 cost_micros = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCostMicros() {
      bitField0_ = (bitField0_ & ~0x00000002);
      costMicros_ = 0L;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v12.services.PlannedProductForecast plannedProductForecast_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.PlannedProductForecast, com.google.ads.googleads.v12.services.PlannedProductForecast.Builder, com.google.ads.googleads.v12.services.PlannedProductForecastOrBuilder> plannedProductForecastBuilder_;
    /**
     * <pre>
     * Forecasted traffic metrics for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
     * @return Whether the plannedProductForecast field is set.
     */
    public boolean hasPlannedProductForecast() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Forecasted traffic metrics for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
     * @return The plannedProductForecast.
     */
    public com.google.ads.googleads.v12.services.PlannedProductForecast getPlannedProductForecast() {
      if (plannedProductForecastBuilder_ == null) {
        return plannedProductForecast_ == null ? com.google.ads.googleads.v12.services.PlannedProductForecast.getDefaultInstance() : plannedProductForecast_;
      } else {
        return plannedProductForecastBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Forecasted traffic metrics for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
     */
    public Builder setPlannedProductForecast(com.google.ads.googleads.v12.services.PlannedProductForecast value) {
      if (plannedProductForecastBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        plannedProductForecast_ = value;
      } else {
        plannedProductForecastBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Forecasted traffic metrics for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
     */
    public Builder setPlannedProductForecast(
        com.google.ads.googleads.v12.services.PlannedProductForecast.Builder builderForValue) {
      if (plannedProductForecastBuilder_ == null) {
        plannedProductForecast_ = builderForValue.build();
      } else {
        plannedProductForecastBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Forecasted traffic metrics for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
     */
    public Builder mergePlannedProductForecast(com.google.ads.googleads.v12.services.PlannedProductForecast value) {
      if (plannedProductForecastBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          plannedProductForecast_ != null &&
          plannedProductForecast_ != com.google.ads.googleads.v12.services.PlannedProductForecast.getDefaultInstance()) {
          getPlannedProductForecastBuilder().mergeFrom(value);
        } else {
          plannedProductForecast_ = value;
        }
      } else {
        plannedProductForecastBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Forecasted traffic metrics for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
     */
    public Builder clearPlannedProductForecast() {
      bitField0_ = (bitField0_ & ~0x00000004);
      plannedProductForecast_ = null;
      if (plannedProductForecastBuilder_ != null) {
        plannedProductForecastBuilder_.dispose();
        plannedProductForecastBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Forecasted traffic metrics for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
     */
    public com.google.ads.googleads.v12.services.PlannedProductForecast.Builder getPlannedProductForecastBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPlannedProductForecastFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Forecasted traffic metrics for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
     */
    public com.google.ads.googleads.v12.services.PlannedProductForecastOrBuilder getPlannedProductForecastOrBuilder() {
      if (plannedProductForecastBuilder_ != null) {
        return plannedProductForecastBuilder_.getMessageOrBuilder();
      } else {
        return plannedProductForecast_ == null ?
            com.google.ads.googleads.v12.services.PlannedProductForecast.getDefaultInstance() : plannedProductForecast_;
      }
    }
    /**
     * <pre>
     * Forecasted traffic metrics for this product.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.PlannedProductForecast planned_product_forecast = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.PlannedProductForecast, com.google.ads.googleads.v12.services.PlannedProductForecast.Builder, com.google.ads.googleads.v12.services.PlannedProductForecastOrBuilder> 
        getPlannedProductForecastFieldBuilder() {
      if (plannedProductForecastBuilder_ == null) {
        plannedProductForecastBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.services.PlannedProductForecast, com.google.ads.googleads.v12.services.PlannedProductForecast.Builder, com.google.ads.googleads.v12.services.PlannedProductForecastOrBuilder>(
                getPlannedProductForecast(),
                getParentForChildren(),
                isClean());
        plannedProductForecast_ = null;
      }
      return plannedProductForecastBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.PlannedProductReachForecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.PlannedProductReachForecast)
  private static final com.google.ads.googleads.v12.services.PlannedProductReachForecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.PlannedProductReachForecast();
  }

  public static com.google.ads.googleads.v12.services.PlannedProductReachForecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlannedProductReachForecast>
      PARSER = new com.google.protobuf.AbstractParser<PlannedProductReachForecast>() {
    @java.lang.Override
    public PlannedProductReachForecast parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlannedProductReachForecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlannedProductReachForecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.PlannedProductReachForecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

