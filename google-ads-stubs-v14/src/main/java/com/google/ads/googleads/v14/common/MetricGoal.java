// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/metric_goal.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.common;

/**
 * <pre>
 * A metric goal for an experiment.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.common.MetricGoal}
 */
public final class MetricGoal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.common.MetricGoal)
    MetricGoalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetricGoal.newBuilder() to construct.
  private MetricGoal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetricGoal() {
    metric_ = 0;
    direction_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetricGoal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.common.MetricGoalProto.internal_static_google_ads_googleads_v14_common_MetricGoal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.common.MetricGoalProto.internal_static_google_ads_googleads_v14_common_MetricGoal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.common.MetricGoal.class, com.google.ads.googleads.v14.common.MetricGoal.Builder.class);
  }

  public static final int METRIC_FIELD_NUMBER = 1;
  private int metric_ = 0;
  /**
   * <pre>
   * The metric of the goal. For example, clicks, impressions, cost,
   * conversions, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric metric = 1;</code>
   * @return The enum numeric value on the wire for metric.
   */
  @java.lang.Override public int getMetricValue() {
    return metric_;
  }
  /**
   * <pre>
   * The metric of the goal. For example, clicks, impressions, cost,
   * conversions, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric metric = 1;</code>
   * @return The metric.
   */
  @java.lang.Override public com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric getMetric() {
    com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric result = com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric.forNumber(metric_);
    return result == null ? com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric.UNRECOGNIZED : result;
  }

  public static final int DIRECTION_FIELD_NUMBER = 2;
  private int direction_ = 0;
  /**
   * <pre>
   * The metric direction of the goal. For example, increase, decrease, no
   * change.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection direction = 2;</code>
   * @return The enum numeric value on the wire for direction.
   */
  @java.lang.Override public int getDirectionValue() {
    return direction_;
  }
  /**
   * <pre>
   * The metric direction of the goal. For example, increase, decrease, no
   * change.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection direction = 2;</code>
   * @return The direction.
   */
  @java.lang.Override public com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection getDirection() {
    com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection result = com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection.forNumber(direction_);
    return result == null ? com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection.UNRECOGNIZED : result;
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
    if (metric_ != com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, metric_);
    }
    if (direction_ != com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, direction_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metric_ != com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, metric_);
    }
    if (direction_ != com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, direction_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.common.MetricGoal)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.common.MetricGoal other = (com.google.ads.googleads.v14.common.MetricGoal) obj;

    if (metric_ != other.metric_) return false;
    if (direction_ != other.direction_) return false;
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
    hash = (37 * hash) + METRIC_FIELD_NUMBER;
    hash = (53 * hash) + metric_;
    hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
    hash = (53 * hash) + direction_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.common.MetricGoal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.common.MetricGoal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.MetricGoal parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.common.MetricGoal prototype) {
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
   * A metric goal for an experiment.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.common.MetricGoal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.common.MetricGoal)
      com.google.ads.googleads.v14.common.MetricGoalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.common.MetricGoalProto.internal_static_google_ads_googleads_v14_common_MetricGoal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.common.MetricGoalProto.internal_static_google_ads_googleads_v14_common_MetricGoal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.common.MetricGoal.class, com.google.ads.googleads.v14.common.MetricGoal.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.common.MetricGoal.newBuilder()
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
      metric_ = 0;
      direction_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.common.MetricGoalProto.internal_static_google_ads_googleads_v14_common_MetricGoal_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.MetricGoal getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.common.MetricGoal.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.MetricGoal build() {
      com.google.ads.googleads.v14.common.MetricGoal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.MetricGoal buildPartial() {
      com.google.ads.googleads.v14.common.MetricGoal result = new com.google.ads.googleads.v14.common.MetricGoal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.common.MetricGoal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metric_ = metric_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.direction_ = direction_;
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
      if (other instanceof com.google.ads.googleads.v14.common.MetricGoal) {
        return mergeFrom((com.google.ads.googleads.v14.common.MetricGoal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.common.MetricGoal other) {
      if (other == com.google.ads.googleads.v14.common.MetricGoal.getDefaultInstance()) return this;
      if (other.metric_ != 0) {
        setMetricValue(other.getMetricValue());
      }
      if (other.direction_ != 0) {
        setDirectionValue(other.getDirectionValue());
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
              metric_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              direction_ = input.readEnum();
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

    private int metric_ = 0;
    /**
     * <pre>
     * The metric of the goal. For example, clicks, impressions, cost,
     * conversions, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric metric = 1;</code>
     * @return The enum numeric value on the wire for metric.
     */
    @java.lang.Override public int getMetricValue() {
      return metric_;
    }
    /**
     * <pre>
     * The metric of the goal. For example, clicks, impressions, cost,
     * conversions, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric metric = 1;</code>
     * @param value The enum numeric value on the wire for metric to set.
     * @return This builder for chaining.
     */
    public Builder setMetricValue(int value) {
      metric_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metric of the goal. For example, clicks, impressions, cost,
     * conversions, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric metric = 1;</code>
     * @return The metric.
     */
    @java.lang.Override
    public com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric getMetric() {
      com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric result = com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric.forNumber(metric_);
      return result == null ? com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The metric of the goal. For example, clicks, impressions, cost,
     * conversions, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric metric = 1;</code>
     * @param value The metric to set.
     * @return This builder for chaining.
     */
    public Builder setMetric(com.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      metric_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metric of the goal. For example, clicks, impressions, cost,
     * conversions, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricEnum.ExperimentMetric metric = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetric() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metric_ = 0;
      onChanged();
      return this;
    }

    private int direction_ = 0;
    /**
     * <pre>
     * The metric direction of the goal. For example, increase, decrease, no
     * change.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection direction = 2;</code>
     * @return The enum numeric value on the wire for direction.
     */
    @java.lang.Override public int getDirectionValue() {
      return direction_;
    }
    /**
     * <pre>
     * The metric direction of the goal. For example, increase, decrease, no
     * change.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection direction = 2;</code>
     * @param value The enum numeric value on the wire for direction to set.
     * @return This builder for chaining.
     */
    public Builder setDirectionValue(int value) {
      direction_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metric direction of the goal. For example, increase, decrease, no
     * change.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection direction = 2;</code>
     * @return The direction.
     */
    @java.lang.Override
    public com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection getDirection() {
      com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection result = com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection.forNumber(direction_);
      return result == null ? com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The metric direction of the goal. For example, increase, decrease, no
     * change.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection direction = 2;</code>
     * @param value The direction to set.
     * @return This builder for chaining.
     */
    public Builder setDirection(com.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      direction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metric direction of the goal. For example, increase, decrease, no
     * change.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.ExperimentMetricDirectionEnum.ExperimentMetricDirection direction = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDirection() {
      bitField0_ = (bitField0_ & ~0x00000002);
      direction_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.common.MetricGoal)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.common.MetricGoal)
  private static final com.google.ads.googleads.v14.common.MetricGoal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.common.MetricGoal();
  }

  public static com.google.ads.googleads.v14.common.MetricGoal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricGoal>
      PARSER = new com.google.protobuf.AbstractParser<MetricGoal>() {
    @java.lang.Override
    public MetricGoal parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetricGoal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricGoal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.common.MetricGoal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

