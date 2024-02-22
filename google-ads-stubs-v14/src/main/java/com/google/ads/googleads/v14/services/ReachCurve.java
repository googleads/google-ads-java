// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

/**
 * <pre>
 * The reach curve for the planned products.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.services.ReachCurve}
 */
public final class ReachCurve extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.services.ReachCurve)
    ReachCurveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReachCurve.newBuilder() to construct.
  private ReachCurve(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReachCurve() {
    reachForecasts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReachCurve();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_ReachCurve_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_ReachCurve_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.services.ReachCurve.class, com.google.ads.googleads.v14.services.ReachCurve.Builder.class);
  }

  public static final int REACH_FORECASTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v14.services.ReachForecast> reachForecasts_;
  /**
   * <pre>
   * All points on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v14.services.ReachForecast> getReachForecastsList() {
    return reachForecasts_;
  }
  /**
   * <pre>
   * All points on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v14.services.ReachForecastOrBuilder> 
      getReachForecastsOrBuilderList() {
    return reachForecasts_;
  }
  /**
   * <pre>
   * All points on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
   */
  @java.lang.Override
  public int getReachForecastsCount() {
    return reachForecasts_.size();
  }
  /**
   * <pre>
   * All points on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.services.ReachForecast getReachForecasts(int index) {
    return reachForecasts_.get(index);
  }
  /**
   * <pre>
   * All points on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.services.ReachForecastOrBuilder getReachForecastsOrBuilder(
      int index) {
    return reachForecasts_.get(index);
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
    for (int i = 0; i < reachForecasts_.size(); i++) {
      output.writeMessage(1, reachForecasts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < reachForecasts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, reachForecasts_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v14.services.ReachCurve)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.services.ReachCurve other = (com.google.ads.googleads.v14.services.ReachCurve) obj;

    if (!getReachForecastsList()
        .equals(other.getReachForecastsList())) return false;
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
    if (getReachForecastsCount() > 0) {
      hash = (37 * hash) + REACH_FORECASTS_FIELD_NUMBER;
      hash = (53 * hash) + getReachForecastsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.services.ReachCurve parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.services.ReachCurve parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.ReachCurve parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.services.ReachCurve prototype) {
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
   * The reach curve for the planned products.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.services.ReachCurve}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.services.ReachCurve)
      com.google.ads.googleads.v14.services.ReachCurveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_ReachCurve_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_ReachCurve_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.services.ReachCurve.class, com.google.ads.googleads.v14.services.ReachCurve.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.services.ReachCurve.newBuilder()
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
      if (reachForecastsBuilder_ == null) {
        reachForecasts_ = java.util.Collections.emptyList();
      } else {
        reachForecasts_ = null;
        reachForecastsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v14_services_ReachCurve_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.ReachCurve getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.services.ReachCurve.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.ReachCurve build() {
      com.google.ads.googleads.v14.services.ReachCurve result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.ReachCurve buildPartial() {
      com.google.ads.googleads.v14.services.ReachCurve result = new com.google.ads.googleads.v14.services.ReachCurve(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v14.services.ReachCurve result) {
      if (reachForecastsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          reachForecasts_ = java.util.Collections.unmodifiableList(reachForecasts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reachForecasts_ = reachForecasts_;
      } else {
        result.reachForecasts_ = reachForecastsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v14.services.ReachCurve result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v14.services.ReachCurve) {
        return mergeFrom((com.google.ads.googleads.v14.services.ReachCurve)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.services.ReachCurve other) {
      if (other == com.google.ads.googleads.v14.services.ReachCurve.getDefaultInstance()) return this;
      if (reachForecastsBuilder_ == null) {
        if (!other.reachForecasts_.isEmpty()) {
          if (reachForecasts_.isEmpty()) {
            reachForecasts_ = other.reachForecasts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReachForecastsIsMutable();
            reachForecasts_.addAll(other.reachForecasts_);
          }
          onChanged();
        }
      } else {
        if (!other.reachForecasts_.isEmpty()) {
          if (reachForecastsBuilder_.isEmpty()) {
            reachForecastsBuilder_.dispose();
            reachForecastsBuilder_ = null;
            reachForecasts_ = other.reachForecasts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            reachForecastsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReachForecastsFieldBuilder() : null;
          } else {
            reachForecastsBuilder_.addAllMessages(other.reachForecasts_);
          }
        }
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
              com.google.ads.googleads.v14.services.ReachForecast m =
                  input.readMessage(
                      com.google.ads.googleads.v14.services.ReachForecast.parser(),
                      extensionRegistry);
              if (reachForecastsBuilder_ == null) {
                ensureReachForecastsIsMutable();
                reachForecasts_.add(m);
              } else {
                reachForecastsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ads.googleads.v14.services.ReachForecast> reachForecasts_ =
      java.util.Collections.emptyList();
    private void ensureReachForecastsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reachForecasts_ = new java.util.ArrayList<com.google.ads.googleads.v14.services.ReachForecast>(reachForecasts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v14.services.ReachForecast, com.google.ads.googleads.v14.services.ReachForecast.Builder, com.google.ads.googleads.v14.services.ReachForecastOrBuilder> reachForecastsBuilder_;

    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v14.services.ReachForecast> getReachForecastsList() {
      if (reachForecastsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reachForecasts_);
      } else {
        return reachForecastsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public int getReachForecastsCount() {
      if (reachForecastsBuilder_ == null) {
        return reachForecasts_.size();
      } else {
        return reachForecastsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v14.services.ReachForecast getReachForecasts(int index) {
      if (reachForecastsBuilder_ == null) {
        return reachForecasts_.get(index);
      } else {
        return reachForecastsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public Builder setReachForecasts(
        int index, com.google.ads.googleads.v14.services.ReachForecast value) {
      if (reachForecastsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReachForecastsIsMutable();
        reachForecasts_.set(index, value);
        onChanged();
      } else {
        reachForecastsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public Builder setReachForecasts(
        int index, com.google.ads.googleads.v14.services.ReachForecast.Builder builderForValue) {
      if (reachForecastsBuilder_ == null) {
        ensureReachForecastsIsMutable();
        reachForecasts_.set(index, builderForValue.build());
        onChanged();
      } else {
        reachForecastsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public Builder addReachForecasts(com.google.ads.googleads.v14.services.ReachForecast value) {
      if (reachForecastsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReachForecastsIsMutable();
        reachForecasts_.add(value);
        onChanged();
      } else {
        reachForecastsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public Builder addReachForecasts(
        int index, com.google.ads.googleads.v14.services.ReachForecast value) {
      if (reachForecastsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReachForecastsIsMutable();
        reachForecasts_.add(index, value);
        onChanged();
      } else {
        reachForecastsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public Builder addReachForecasts(
        com.google.ads.googleads.v14.services.ReachForecast.Builder builderForValue) {
      if (reachForecastsBuilder_ == null) {
        ensureReachForecastsIsMutable();
        reachForecasts_.add(builderForValue.build());
        onChanged();
      } else {
        reachForecastsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public Builder addReachForecasts(
        int index, com.google.ads.googleads.v14.services.ReachForecast.Builder builderForValue) {
      if (reachForecastsBuilder_ == null) {
        ensureReachForecastsIsMutable();
        reachForecasts_.add(index, builderForValue.build());
        onChanged();
      } else {
        reachForecastsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public Builder addAllReachForecasts(
        java.lang.Iterable<? extends com.google.ads.googleads.v14.services.ReachForecast> values) {
      if (reachForecastsBuilder_ == null) {
        ensureReachForecastsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reachForecasts_);
        onChanged();
      } else {
        reachForecastsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public Builder clearReachForecasts() {
      if (reachForecastsBuilder_ == null) {
        reachForecasts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        reachForecastsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public Builder removeReachForecasts(int index) {
      if (reachForecastsBuilder_ == null) {
        ensureReachForecastsIsMutable();
        reachForecasts_.remove(index);
        onChanged();
      } else {
        reachForecastsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v14.services.ReachForecast.Builder getReachForecastsBuilder(
        int index) {
      return getReachForecastsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v14.services.ReachForecastOrBuilder getReachForecastsOrBuilder(
        int index) {
      if (reachForecastsBuilder_ == null) {
        return reachForecasts_.get(index);  } else {
        return reachForecastsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v14.services.ReachForecastOrBuilder> 
         getReachForecastsOrBuilderList() {
      if (reachForecastsBuilder_ != null) {
        return reachForecastsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reachForecasts_);
      }
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v14.services.ReachForecast.Builder addReachForecastsBuilder() {
      return getReachForecastsFieldBuilder().addBuilder(
          com.google.ads.googleads.v14.services.ReachForecast.getDefaultInstance());
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v14.services.ReachForecast.Builder addReachForecastsBuilder(
        int index) {
      return getReachForecastsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v14.services.ReachForecast.getDefaultInstance());
    }
    /**
     * <pre>
     * All points on the reach curve.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.services.ReachForecast reach_forecasts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v14.services.ReachForecast.Builder> 
         getReachForecastsBuilderList() {
      return getReachForecastsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v14.services.ReachForecast, com.google.ads.googleads.v14.services.ReachForecast.Builder, com.google.ads.googleads.v14.services.ReachForecastOrBuilder> 
        getReachForecastsFieldBuilder() {
      if (reachForecastsBuilder_ == null) {
        reachForecastsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v14.services.ReachForecast, com.google.ads.googleads.v14.services.ReachForecast.Builder, com.google.ads.googleads.v14.services.ReachForecastOrBuilder>(
                reachForecasts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        reachForecasts_ = null;
      }
      return reachForecastsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.services.ReachCurve)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.services.ReachCurve)
  private static final com.google.ads.googleads.v14.services.ReachCurve DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.services.ReachCurve();
  }

  public static com.google.ads.googleads.v14.services.ReachCurve getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReachCurve>
      PARSER = new com.google.protobuf.AbstractParser<ReachCurve>() {
    @java.lang.Override
    public ReachCurve parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReachCurve> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReachCurve> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.services.ReachCurve getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

