// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/errors/experiment_arm_error.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.errors;

/**
 * <pre>
 * Container for enum describing possible experiment arm error.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.errors.ExperimentArmErrorEnum}
 */
public final class ExperimentArmErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.errors.ExperimentArmErrorEnum)
    ExperimentArmErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExperimentArmErrorEnum.newBuilder() to construct.
  private ExperimentArmErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExperimentArmErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExperimentArmErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.errors.ExperimentArmErrorProto.internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.errors.ExperimentArmErrorProto.internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum.class, com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible experiment arm errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v20.errors.ExperimentArmErrorEnum.ExperimentArmError}
   */
  public enum ExperimentArmError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Number of experiment arms is above limit.
     * </pre>
     *
     * <code>EXPERIMENT_ARM_COUNT_LIMIT_EXCEEDED = 2;</code>
     */
    EXPERIMENT_ARM_COUNT_LIMIT_EXCEEDED(2),
    /**
     * <pre>
     * Cannot add campaign with invalid status to the experiment arm.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN_STATUS = 3;</code>
     */
    INVALID_CAMPAIGN_STATUS(3),
    /**
     * <pre>
     * Cannot add duplicate experiment arm name in one experiment.
     * </pre>
     *
     * <code>DUPLICATE_EXPERIMENT_ARM_NAME = 4;</code>
     */
    DUPLICATE_EXPERIMENT_ARM_NAME(4),
    /**
     * <pre>
     * Cannot set campaigns of treatment experiment arm.
     * </pre>
     *
     * <code>CANNOT_SET_TREATMENT_ARM_CAMPAIGN = 5;</code>
     */
    CANNOT_SET_TREATMENT_ARM_CAMPAIGN(5),
    /**
     * <pre>
     * Cannot edit campaign ids in trial arms in non SETUP experiment.
     * </pre>
     *
     * <code>CANNOT_MODIFY_CAMPAIGN_IDS = 6;</code>
     */
    CANNOT_MODIFY_CAMPAIGN_IDS(6),
    /**
     * <pre>
     * Cannot modify the campaigns in the control arm
     * if there is not a suffix set in the trial.
     * </pre>
     *
     * <code>CANNOT_MODIFY_CAMPAIGN_WITHOUT_SUFFIX_SET = 7;</code>
     */
    CANNOT_MODIFY_CAMPAIGN_WITHOUT_SUFFIX_SET(7),
    /**
     * <pre>
     * Traffic split related settings (like traffic share bounds) can't be
     * modified after the trial has started.
     * </pre>
     *
     * <code>CANNOT_MUTATE_TRAFFIC_SPLIT_AFTER_START = 8;</code>
     */
    CANNOT_MUTATE_TRAFFIC_SPLIT_AFTER_START(8),
    /**
     * <pre>
     * Cannot use shared budget on experiment's control campaign.
     * </pre>
     *
     * <code>CANNOT_ADD_CAMPAIGN_WITH_SHARED_BUDGET = 9;</code>
     */
    CANNOT_ADD_CAMPAIGN_WITH_SHARED_BUDGET(9),
    /**
     * <pre>
     * Cannot use custom budget on experiment's control campaigns.
     * </pre>
     *
     * <code>CANNOT_ADD_CAMPAIGN_WITH_CUSTOM_BUDGET = 10;</code>
     */
    CANNOT_ADD_CAMPAIGN_WITH_CUSTOM_BUDGET(10),
    /**
     * <pre>
     * Cannot have enable_dynamic_assets turned on in experiment's campaigns.
     * </pre>
     *
     * <code>CANNOT_ADD_CAMPAIGNS_WITH_DYNAMIC_ASSETS_ENABLED = 11;</code>
     */
    CANNOT_ADD_CAMPAIGNS_WITH_DYNAMIC_ASSETS_ENABLED(11),
    /**
     * <pre>
     * Cannot use campaign's advertising channel sub type in experiment.
     * </pre>
     *
     * <code>UNSUPPORTED_CAMPAIGN_ADVERTISING_CHANNEL_SUB_TYPE = 12;</code>
     */
    UNSUPPORTED_CAMPAIGN_ADVERTISING_CHANNEL_SUB_TYPE(12),
    /**
     * <pre>
     * Experiment date range must be within base campaign's date range.
     * </pre>
     *
     * <code>CANNOT_ADD_BASE_CAMPAIGN_WITH_DATE_RANGE = 13;</code>
     */
    CANNOT_ADD_BASE_CAMPAIGN_WITH_DATE_RANGE(13),
    /**
     * <pre>
     * Bidding strategy is not supported in experiments.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_SUPPORTED_IN_EXPERIMENTS = 14;</code>
     */
    BIDDING_STRATEGY_NOT_SUPPORTED_IN_EXPERIMENTS(14),
    /**
     * <pre>
     * Traffic split is not supported for some channel types.
     * </pre>
     *
     * <code>TRAFFIC_SPLIT_NOT_SUPPORTED_FOR_CHANNEL_TYPE = 15;</code>
     */
    TRAFFIC_SPLIT_NOT_SUPPORTED_FOR_CHANNEL_TYPE(15),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Number of experiment arms is above limit.
     * </pre>
     *
     * <code>EXPERIMENT_ARM_COUNT_LIMIT_EXCEEDED = 2;</code>
     */
    public static final int EXPERIMENT_ARM_COUNT_LIMIT_EXCEEDED_VALUE = 2;
    /**
     * <pre>
     * Cannot add campaign with invalid status to the experiment arm.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN_STATUS = 3;</code>
     */
    public static final int INVALID_CAMPAIGN_STATUS_VALUE = 3;
    /**
     * <pre>
     * Cannot add duplicate experiment arm name in one experiment.
     * </pre>
     *
     * <code>DUPLICATE_EXPERIMENT_ARM_NAME = 4;</code>
     */
    public static final int DUPLICATE_EXPERIMENT_ARM_NAME_VALUE = 4;
    /**
     * <pre>
     * Cannot set campaigns of treatment experiment arm.
     * </pre>
     *
     * <code>CANNOT_SET_TREATMENT_ARM_CAMPAIGN = 5;</code>
     */
    public static final int CANNOT_SET_TREATMENT_ARM_CAMPAIGN_VALUE = 5;
    /**
     * <pre>
     * Cannot edit campaign ids in trial arms in non SETUP experiment.
     * </pre>
     *
     * <code>CANNOT_MODIFY_CAMPAIGN_IDS = 6;</code>
     */
    public static final int CANNOT_MODIFY_CAMPAIGN_IDS_VALUE = 6;
    /**
     * <pre>
     * Cannot modify the campaigns in the control arm
     * if there is not a suffix set in the trial.
     * </pre>
     *
     * <code>CANNOT_MODIFY_CAMPAIGN_WITHOUT_SUFFIX_SET = 7;</code>
     */
    public static final int CANNOT_MODIFY_CAMPAIGN_WITHOUT_SUFFIX_SET_VALUE = 7;
    /**
     * <pre>
     * Traffic split related settings (like traffic share bounds) can't be
     * modified after the trial has started.
     * </pre>
     *
     * <code>CANNOT_MUTATE_TRAFFIC_SPLIT_AFTER_START = 8;</code>
     */
    public static final int CANNOT_MUTATE_TRAFFIC_SPLIT_AFTER_START_VALUE = 8;
    /**
     * <pre>
     * Cannot use shared budget on experiment's control campaign.
     * </pre>
     *
     * <code>CANNOT_ADD_CAMPAIGN_WITH_SHARED_BUDGET = 9;</code>
     */
    public static final int CANNOT_ADD_CAMPAIGN_WITH_SHARED_BUDGET_VALUE = 9;
    /**
     * <pre>
     * Cannot use custom budget on experiment's control campaigns.
     * </pre>
     *
     * <code>CANNOT_ADD_CAMPAIGN_WITH_CUSTOM_BUDGET = 10;</code>
     */
    public static final int CANNOT_ADD_CAMPAIGN_WITH_CUSTOM_BUDGET_VALUE = 10;
    /**
     * <pre>
     * Cannot have enable_dynamic_assets turned on in experiment's campaigns.
     * </pre>
     *
     * <code>CANNOT_ADD_CAMPAIGNS_WITH_DYNAMIC_ASSETS_ENABLED = 11;</code>
     */
    public static final int CANNOT_ADD_CAMPAIGNS_WITH_DYNAMIC_ASSETS_ENABLED_VALUE = 11;
    /**
     * <pre>
     * Cannot use campaign's advertising channel sub type in experiment.
     * </pre>
     *
     * <code>UNSUPPORTED_CAMPAIGN_ADVERTISING_CHANNEL_SUB_TYPE = 12;</code>
     */
    public static final int UNSUPPORTED_CAMPAIGN_ADVERTISING_CHANNEL_SUB_TYPE_VALUE = 12;
    /**
     * <pre>
     * Experiment date range must be within base campaign's date range.
     * </pre>
     *
     * <code>CANNOT_ADD_BASE_CAMPAIGN_WITH_DATE_RANGE = 13;</code>
     */
    public static final int CANNOT_ADD_BASE_CAMPAIGN_WITH_DATE_RANGE_VALUE = 13;
    /**
     * <pre>
     * Bidding strategy is not supported in experiments.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_SUPPORTED_IN_EXPERIMENTS = 14;</code>
     */
    public static final int BIDDING_STRATEGY_NOT_SUPPORTED_IN_EXPERIMENTS_VALUE = 14;
    /**
     * <pre>
     * Traffic split is not supported for some channel types.
     * </pre>
     *
     * <code>TRAFFIC_SPLIT_NOT_SUPPORTED_FOR_CHANNEL_TYPE = 15;</code>
     */
    public static final int TRAFFIC_SPLIT_NOT_SUPPORTED_FOR_CHANNEL_TYPE_VALUE = 15;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ExperimentArmError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExperimentArmError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return EXPERIMENT_ARM_COUNT_LIMIT_EXCEEDED;
        case 3: return INVALID_CAMPAIGN_STATUS;
        case 4: return DUPLICATE_EXPERIMENT_ARM_NAME;
        case 5: return CANNOT_SET_TREATMENT_ARM_CAMPAIGN;
        case 6: return CANNOT_MODIFY_CAMPAIGN_IDS;
        case 7: return CANNOT_MODIFY_CAMPAIGN_WITHOUT_SUFFIX_SET;
        case 8: return CANNOT_MUTATE_TRAFFIC_SPLIT_AFTER_START;
        case 9: return CANNOT_ADD_CAMPAIGN_WITH_SHARED_BUDGET;
        case 10: return CANNOT_ADD_CAMPAIGN_WITH_CUSTOM_BUDGET;
        case 11: return CANNOT_ADD_CAMPAIGNS_WITH_DYNAMIC_ASSETS_ENABLED;
        case 12: return UNSUPPORTED_CAMPAIGN_ADVERTISING_CHANNEL_SUB_TYPE;
        case 13: return CANNOT_ADD_BASE_CAMPAIGN_WITH_DATE_RANGE;
        case 14: return BIDDING_STRATEGY_NOT_SUPPORTED_IN_EXPERIMENTS;
        case 15: return TRAFFIC_SPLIT_NOT_SUPPORTED_FOR_CHANNEL_TYPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExperimentArmError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExperimentArmError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExperimentArmError>() {
            public ExperimentArmError findValueByNumber(int number) {
              return ExperimentArmError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExperimentArmError[] VALUES = values();

    public static ExperimentArmError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ExperimentArmError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v20.errors.ExperimentArmErrorEnum.ExperimentArmError)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum other = (com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum prototype) {
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
   * Container for enum describing possible experiment arm error.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.errors.ExperimentArmErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.errors.ExperimentArmErrorEnum)
      com.google.ads.googleads.v20.errors.ExperimentArmErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.errors.ExperimentArmErrorProto.internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.errors.ExperimentArmErrorProto.internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum.class, com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.errors.ExperimentArmErrorProto.internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum build() {
      com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum buildPartial() {
      com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum result = new com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum other) {
      if (other == com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.errors.ExperimentArmErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.errors.ExperimentArmErrorEnum)
  private static final com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum();
  }

  public static com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExperimentArmErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ExperimentArmErrorEnum>() {
    @java.lang.Override
    public ExperimentArmErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExperimentArmErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExperimentArmErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.errors.ExperimentArmErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

