// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/reach_plan_service.proto

package com.google.ads.googleads.v14.services;

/**
 * <pre>
 * Response message containing the generated reach curve.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.services.GenerateReachForecastResponse}
 */
public final class GenerateReachForecastResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.services.GenerateReachForecastResponse)
    GenerateReachForecastResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateReachForecastResponse.newBuilder() to construct.
  private GenerateReachForecastResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateReachForecastResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateReachForecastResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_GenerateReachForecastResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_GenerateReachForecastResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.services.GenerateReachForecastResponse.class, com.google.ads.googleads.v14.services.GenerateReachForecastResponse.Builder.class);
  }

  public static final int ON_TARGET_AUDIENCE_METRICS_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v14.services.OnTargetAudienceMetrics onTargetAudienceMetrics_;
  /**
   * <pre>
   * Reference on target audiences for this curve.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
   * @return Whether the onTargetAudienceMetrics field is set.
   */
  @java.lang.Override
  public boolean hasOnTargetAudienceMetrics() {
    return onTargetAudienceMetrics_ != null;
  }
  /**
   * <pre>
   * Reference on target audiences for this curve.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
   * @return The onTargetAudienceMetrics.
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.services.OnTargetAudienceMetrics getOnTargetAudienceMetrics() {
    return onTargetAudienceMetrics_ == null ? com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.getDefaultInstance() : onTargetAudienceMetrics_;
  }
  /**
   * <pre>
   * Reference on target audiences for this curve.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.services.OnTargetAudienceMetricsOrBuilder getOnTargetAudienceMetricsOrBuilder() {
    return onTargetAudienceMetrics_ == null ? com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.getDefaultInstance() : onTargetAudienceMetrics_;
  }

  public static final int REACH_CURVE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v14.services.ReachCurve reachCurve_;
  /**
   * <pre>
   * The generated reach curve for the planned product mix.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
   * @return Whether the reachCurve field is set.
   */
  @java.lang.Override
  public boolean hasReachCurve() {
    return reachCurve_ != null;
  }
  /**
   * <pre>
   * The generated reach curve for the planned product mix.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
   * @return The reachCurve.
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.services.ReachCurve getReachCurve() {
    return reachCurve_ == null ? com.google.ads.googleads.v14.services.ReachCurve.getDefaultInstance() : reachCurve_;
  }
  /**
   * <pre>
   * The generated reach curve for the planned product mix.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.services.ReachCurveOrBuilder getReachCurveOrBuilder() {
    return reachCurve_ == null ? com.google.ads.googleads.v14.services.ReachCurve.getDefaultInstance() : reachCurve_;
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
    if (onTargetAudienceMetrics_ != null) {
      output.writeMessage(1, getOnTargetAudienceMetrics());
    }
    if (reachCurve_ != null) {
      output.writeMessage(2, getReachCurve());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (onTargetAudienceMetrics_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOnTargetAudienceMetrics());
    }
    if (reachCurve_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReachCurve());
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
    if (!(obj instanceof com.google.ads.googleads.v14.services.GenerateReachForecastResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.services.GenerateReachForecastResponse other = (com.google.ads.googleads.v14.services.GenerateReachForecastResponse) obj;

    if (hasOnTargetAudienceMetrics() != other.hasOnTargetAudienceMetrics()) return false;
    if (hasOnTargetAudienceMetrics()) {
      if (!getOnTargetAudienceMetrics()
          .equals(other.getOnTargetAudienceMetrics())) return false;
    }
    if (hasReachCurve() != other.hasReachCurve()) return false;
    if (hasReachCurve()) {
      if (!getReachCurve()
          .equals(other.getReachCurve())) return false;
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
    if (hasOnTargetAudienceMetrics()) {
      hash = (37 * hash) + ON_TARGET_AUDIENCE_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getOnTargetAudienceMetrics().hashCode();
    }
    if (hasReachCurve()) {
      hash = (37 * hash) + REACH_CURVE_FIELD_NUMBER;
      hash = (53 * hash) + getReachCurve().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.services.GenerateReachForecastResponse prototype) {
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
   * Response message containing the generated reach curve.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.services.GenerateReachForecastResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.services.GenerateReachForecastResponse)
      com.google.ads.googleads.v14.services.GenerateReachForecastResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_GenerateReachForecastResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_GenerateReachForecastResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.services.GenerateReachForecastResponse.class, com.google.ads.googleads.v14.services.GenerateReachForecastResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.services.GenerateReachForecastResponse.newBuilder()
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
      onTargetAudienceMetrics_ = null;
      if (onTargetAudienceMetricsBuilder_ != null) {
        onTargetAudienceMetricsBuilder_.dispose();
        onTargetAudienceMetricsBuilder_ = null;
      }
      reachCurve_ = null;
      if (reachCurveBuilder_ != null) {
        reachCurveBuilder_.dispose();
        reachCurveBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_GenerateReachForecastResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.GenerateReachForecastResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.services.GenerateReachForecastResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.GenerateReachForecastResponse build() {
      com.google.ads.googleads.v14.services.GenerateReachForecastResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.GenerateReachForecastResponse buildPartial() {
      com.google.ads.googleads.v14.services.GenerateReachForecastResponse result = new com.google.ads.googleads.v14.services.GenerateReachForecastResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.services.GenerateReachForecastResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.onTargetAudienceMetrics_ = onTargetAudienceMetricsBuilder_ == null
            ? onTargetAudienceMetrics_
            : onTargetAudienceMetricsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reachCurve_ = reachCurveBuilder_ == null
            ? reachCurve_
            : reachCurveBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v14.services.GenerateReachForecastResponse) {
        return mergeFrom((com.google.ads.googleads.v14.services.GenerateReachForecastResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.services.GenerateReachForecastResponse other) {
      if (other == com.google.ads.googleads.v14.services.GenerateReachForecastResponse.getDefaultInstance()) return this;
      if (other.hasOnTargetAudienceMetrics()) {
        mergeOnTargetAudienceMetrics(other.getOnTargetAudienceMetrics());
      }
      if (other.hasReachCurve()) {
        mergeReachCurve(other.getReachCurve());
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
              input.readMessage(
                  getOnTargetAudienceMetricsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getReachCurveFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.ads.googleads.v14.services.OnTargetAudienceMetrics onTargetAudienceMetrics_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.services.OnTargetAudienceMetrics, com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.Builder, com.google.ads.googleads.v14.services.OnTargetAudienceMetricsOrBuilder> onTargetAudienceMetricsBuilder_;
    /**
     * <pre>
     * Reference on target audiences for this curve.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
     * @return Whether the onTargetAudienceMetrics field is set.
     */
    public boolean hasOnTargetAudienceMetrics() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Reference on target audiences for this curve.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
     * @return The onTargetAudienceMetrics.
     */
    public com.google.ads.googleads.v14.services.OnTargetAudienceMetrics getOnTargetAudienceMetrics() {
      if (onTargetAudienceMetricsBuilder_ == null) {
        return onTargetAudienceMetrics_ == null ? com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.getDefaultInstance() : onTargetAudienceMetrics_;
      } else {
        return onTargetAudienceMetricsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Reference on target audiences for this curve.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
     */
    public Builder setOnTargetAudienceMetrics(com.google.ads.googleads.v14.services.OnTargetAudienceMetrics value) {
      if (onTargetAudienceMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        onTargetAudienceMetrics_ = value;
      } else {
        onTargetAudienceMetricsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reference on target audiences for this curve.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
     */
    public Builder setOnTargetAudienceMetrics(
        com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.Builder builderForValue) {
      if (onTargetAudienceMetricsBuilder_ == null) {
        onTargetAudienceMetrics_ = builderForValue.build();
      } else {
        onTargetAudienceMetricsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reference on target audiences for this curve.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
     */
    public Builder mergeOnTargetAudienceMetrics(com.google.ads.googleads.v14.services.OnTargetAudienceMetrics value) {
      if (onTargetAudienceMetricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          onTargetAudienceMetrics_ != null &&
          onTargetAudienceMetrics_ != com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.getDefaultInstance()) {
          getOnTargetAudienceMetricsBuilder().mergeFrom(value);
        } else {
          onTargetAudienceMetrics_ = value;
        }
      } else {
        onTargetAudienceMetricsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reference on target audiences for this curve.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
     */
    public Builder clearOnTargetAudienceMetrics() {
      bitField0_ = (bitField0_ & ~0x00000001);
      onTargetAudienceMetrics_ = null;
      if (onTargetAudienceMetricsBuilder_ != null) {
        onTargetAudienceMetricsBuilder_.dispose();
        onTargetAudienceMetricsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reference on target audiences for this curve.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
     */
    public com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.Builder getOnTargetAudienceMetricsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOnTargetAudienceMetricsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Reference on target audiences for this curve.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
     */
    public com.google.ads.googleads.v14.services.OnTargetAudienceMetricsOrBuilder getOnTargetAudienceMetricsOrBuilder() {
      if (onTargetAudienceMetricsBuilder_ != null) {
        return onTargetAudienceMetricsBuilder_.getMessageOrBuilder();
      } else {
        return onTargetAudienceMetrics_ == null ?
            com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.getDefaultInstance() : onTargetAudienceMetrics_;
      }
    }
    /**
     * <pre>
     * Reference on target audiences for this curve.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.OnTargetAudienceMetrics on_target_audience_metrics = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.services.OnTargetAudienceMetrics, com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.Builder, com.google.ads.googleads.v14.services.OnTargetAudienceMetricsOrBuilder> 
        getOnTargetAudienceMetricsFieldBuilder() {
      if (onTargetAudienceMetricsBuilder_ == null) {
        onTargetAudienceMetricsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v14.services.OnTargetAudienceMetrics, com.google.ads.googleads.v14.services.OnTargetAudienceMetrics.Builder, com.google.ads.googleads.v14.services.OnTargetAudienceMetricsOrBuilder>(
                getOnTargetAudienceMetrics(),
                getParentForChildren(),
                isClean());
        onTargetAudienceMetrics_ = null;
      }
      return onTargetAudienceMetricsBuilder_;
    }

    private com.google.ads.googleads.v14.services.ReachCurve reachCurve_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.services.ReachCurve, com.google.ads.googleads.v14.services.ReachCurve.Builder, com.google.ads.googleads.v14.services.ReachCurveOrBuilder> reachCurveBuilder_;
    /**
     * <pre>
     * The generated reach curve for the planned product mix.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
     * @return Whether the reachCurve field is set.
     */
    public boolean hasReachCurve() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The generated reach curve for the planned product mix.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
     * @return The reachCurve.
     */
    public com.google.ads.googleads.v14.services.ReachCurve getReachCurve() {
      if (reachCurveBuilder_ == null) {
        return reachCurve_ == null ? com.google.ads.googleads.v14.services.ReachCurve.getDefaultInstance() : reachCurve_;
      } else {
        return reachCurveBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The generated reach curve for the planned product mix.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
     */
    public Builder setReachCurve(com.google.ads.googleads.v14.services.ReachCurve value) {
      if (reachCurveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reachCurve_ = value;
      } else {
        reachCurveBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The generated reach curve for the planned product mix.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
     */
    public Builder setReachCurve(
        com.google.ads.googleads.v14.services.ReachCurve.Builder builderForValue) {
      if (reachCurveBuilder_ == null) {
        reachCurve_ = builderForValue.build();
      } else {
        reachCurveBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The generated reach curve for the planned product mix.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
     */
    public Builder mergeReachCurve(com.google.ads.googleads.v14.services.ReachCurve value) {
      if (reachCurveBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          reachCurve_ != null &&
          reachCurve_ != com.google.ads.googleads.v14.services.ReachCurve.getDefaultInstance()) {
          getReachCurveBuilder().mergeFrom(value);
        } else {
          reachCurve_ = value;
        }
      } else {
        reachCurveBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The generated reach curve for the planned product mix.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
     */
    public Builder clearReachCurve() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reachCurve_ = null;
      if (reachCurveBuilder_ != null) {
        reachCurveBuilder_.dispose();
        reachCurveBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The generated reach curve for the planned product mix.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
     */
    public com.google.ads.googleads.v14.services.ReachCurve.Builder getReachCurveBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReachCurveFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The generated reach curve for the planned product mix.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
     */
    public com.google.ads.googleads.v14.services.ReachCurveOrBuilder getReachCurveOrBuilder() {
      if (reachCurveBuilder_ != null) {
        return reachCurveBuilder_.getMessageOrBuilder();
      } else {
        return reachCurve_ == null ?
            com.google.ads.googleads.v14.services.ReachCurve.getDefaultInstance() : reachCurve_;
      }
    }
    /**
     * <pre>
     * The generated reach curve for the planned product mix.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.ReachCurve reach_curve = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.services.ReachCurve, com.google.ads.googleads.v14.services.ReachCurve.Builder, com.google.ads.googleads.v14.services.ReachCurveOrBuilder> 
        getReachCurveFieldBuilder() {
      if (reachCurveBuilder_ == null) {
        reachCurveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v14.services.ReachCurve, com.google.ads.googleads.v14.services.ReachCurve.Builder, com.google.ads.googleads.v14.services.ReachCurveOrBuilder>(
                getReachCurve(),
                getParentForChildren(),
                isClean());
        reachCurve_ = null;
      }
      return reachCurveBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.services.GenerateReachForecastResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.services.GenerateReachForecastResponse)
  private static final com.google.ads.googleads.v14.services.GenerateReachForecastResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.services.GenerateReachForecastResponse();
  }

  public static com.google.ads.googleads.v14.services.GenerateReachForecastResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateReachForecastResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateReachForecastResponse>() {
    @java.lang.Override
    public GenerateReachForecastResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateReachForecastResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateReachForecastResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.services.GenerateReachForecastResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

