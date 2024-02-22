// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/experiment_error.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.errors;

/**
 * <pre>
 * Container for enum describing possible experiment error.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.errors.ExperimentErrorEnum}
 */
public final class ExperimentErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.errors.ExperimentErrorEnum)
    ExperimentErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExperimentErrorEnum.newBuilder() to construct.
  private ExperimentErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExperimentErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExperimentErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.errors.ExperimentErrorProto.internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.errors.ExperimentErrorProto.internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.errors.ExperimentErrorEnum.class, com.google.ads.googleads.v15.errors.ExperimentErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible experiment errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.errors.ExperimentErrorEnum.ExperimentError}
   */
  public enum ExperimentError
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
     * The start date of an experiment cannot be set in the past.
     * Use a start date in the future.
     * </pre>
     *
     * <code>CANNOT_SET_START_DATE_IN_PAST = 2;</code>
     */
    CANNOT_SET_START_DATE_IN_PAST(2),
    /**
     * <pre>
     * The end date of an experiment is before its start date.
     * Use an end date after the start date.
     * </pre>
     *
     * <code>END_DATE_BEFORE_START_DATE = 3;</code>
     */
    END_DATE_BEFORE_START_DATE(3),
    /**
     * <pre>
     * The start date of an experiment is too far in the future.
     * Use a start date no more than 1 year in the future.
     * </pre>
     *
     * <code>START_DATE_TOO_FAR_IN_FUTURE = 4;</code>
     */
    START_DATE_TOO_FAR_IN_FUTURE(4),
    /**
     * <pre>
     * The experiment has the same name as an existing active experiment.
     * </pre>
     *
     * <code>DUPLICATE_EXPERIMENT_NAME = 5;</code>
     */
    DUPLICATE_EXPERIMENT_NAME(5),
    /**
     * <pre>
     * Experiments can only be modified when they are ENABLED.
     * </pre>
     *
     * <code>CANNOT_MODIFY_REMOVED_EXPERIMENT = 6;</code>
     */
    CANNOT_MODIFY_REMOVED_EXPERIMENT(6),
    /**
     * <pre>
     * The start date of an experiment cannot be modified if the existing start
     * date has already passed.
     * </pre>
     *
     * <code>START_DATE_ALREADY_PASSED = 7;</code>
     */
    START_DATE_ALREADY_PASSED(7),
    /**
     * <pre>
     * The end date of an experiment cannot be set in the past.
     * </pre>
     *
     * <code>CANNOT_SET_END_DATE_IN_PAST = 8;</code>
     */
    CANNOT_SET_END_DATE_IN_PAST(8),
    /**
     * <pre>
     * The status of an experiment cannot be set to REMOVED.
     * </pre>
     *
     * <code>CANNOT_SET_STATUS_TO_REMOVED = 9;</code>
     */
    CANNOT_SET_STATUS_TO_REMOVED(9),
    /**
     * <pre>
     * The end date of an expired experiment cannot be modified.
     * </pre>
     *
     * <code>CANNOT_MODIFY_PAST_END_DATE = 10;</code>
     */
    CANNOT_MODIFY_PAST_END_DATE(10),
    /**
     * <pre>
     * The status is invalid.
     * </pre>
     *
     * <code>INVALID_STATUS = 11;</code>
     */
    INVALID_STATUS(11),
    /**
     * <pre>
     * Experiment arm contains campaigns with invalid advertising channel type.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN_CHANNEL_TYPE = 12;</code>
     */
    INVALID_CAMPAIGN_CHANNEL_TYPE(12),
    /**
     * <pre>
     * A pair of trials share members and have overlapping date ranges.
     * </pre>
     *
     * <code>OVERLAPPING_MEMBERS_AND_DATE_RANGE = 13;</code>
     */
    OVERLAPPING_MEMBERS_AND_DATE_RANGE(13),
    /**
     * <pre>
     * Experiment arm contains invalid traffic split.
     * </pre>
     *
     * <code>INVALID_TRIAL_ARM_TRAFFIC_SPLIT = 14;</code>
     */
    INVALID_TRIAL_ARM_TRAFFIC_SPLIT(14),
    /**
     * <pre>
     * Experiment contains trial arms with overlapping traffic split.
     * </pre>
     *
     * <code>TRAFFIC_SPLIT_OVERLAPPING = 15;</code>
     */
    TRAFFIC_SPLIT_OVERLAPPING(15),
    /**
     * <pre>
     * The total traffic split of trial arms is not equal to 100.
     * </pre>
     *
     * <code>SUM_TRIAL_ARM_TRAFFIC_UNEQUALS_TO_TRIAL_TRAFFIC_SPLIT_DENOMINATOR = 16;</code>
     */
    SUM_TRIAL_ARM_TRAFFIC_UNEQUALS_TO_TRIAL_TRAFFIC_SPLIT_DENOMINATOR(16),
    /**
     * <pre>
     * Traffic split related settings (like traffic share bounds) can't be
     * modified after the experiment has started.
     * </pre>
     *
     * <code>CANNOT_MODIFY_TRAFFIC_SPLIT_AFTER_START = 17;</code>
     */
    CANNOT_MODIFY_TRAFFIC_SPLIT_AFTER_START(17),
    /**
     * <pre>
     * The experiment could not be found.
     * </pre>
     *
     * <code>EXPERIMENT_NOT_FOUND = 18;</code>
     */
    EXPERIMENT_NOT_FOUND(18),
    /**
     * <pre>
     * Experiment has not begun.
     * </pre>
     *
     * <code>EXPERIMENT_NOT_YET_STARTED = 19;</code>
     */
    EXPERIMENT_NOT_YET_STARTED(19),
    /**
     * <pre>
     * The experiment cannot have more than one control arm.
     * </pre>
     *
     * <code>CANNOT_HAVE_MULTIPLE_CONTROL_ARMS = 20;</code>
     */
    CANNOT_HAVE_MULTIPLE_CONTROL_ARMS(20),
    /**
     * <pre>
     * The experiment doesn't set in-design campaigns.
     * </pre>
     *
     * <code>IN_DESIGN_CAMPAIGNS_NOT_SET = 21;</code>
     */
    IN_DESIGN_CAMPAIGNS_NOT_SET(21),
    /**
     * <pre>
     * Clients must use the graduate action to graduate experiments and cannot
     * set the status to GRADUATED directly.
     * </pre>
     *
     * <code>CANNOT_SET_STATUS_TO_GRADUATED = 22;</code>
     */
    CANNOT_SET_STATUS_TO_GRADUATED(22),
    /**
     * <pre>
     * Cannot use shared budget on base campaign when scheduling an experiment.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_SHARED_BUDGET = 23;</code>
     */
    CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_SHARED_BUDGET(23),
    /**
     * <pre>
     * Cannot use custom budget on base campaign when scheduling an experiment.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_CUSTOM_BUDGET = 24;</code>
     */
    CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_CUSTOM_BUDGET(24),
    /**
     * <pre>
     * Invalid status transition.
     * </pre>
     *
     * <code>STATUS_TRANSITION_INVALID = 25;</code>
     */
    STATUS_TRANSITION_INVALID(25),
    /**
     * <pre>
     * The experiment campaign name conflicts with a pre-existing campaign.
     * </pre>
     *
     * <code>DUPLICATE_EXPERIMENT_CAMPAIGN_NAME = 26;</code>
     */
    DUPLICATE_EXPERIMENT_CAMPAIGN_NAME(26),
    /**
     * <pre>
     * Cannot remove in creation experiments.
     * </pre>
     *
     * <code>CANNOT_REMOVE_IN_CREATION_EXPERIMENT = 27;</code>
     */
    CANNOT_REMOVE_IN_CREATION_EXPERIMENT(27),
    /**
     * <pre>
     * Cannot add campaign with deprecated ad types. Deprecated ad types:
     * ENHANCED_DISPLAY, GALLERY, GMAIL, KEYWORDLESS, TEXT.
     * </pre>
     *
     * <code>CANNOT_ADD_CAMPAIGN_WITH_DEPRECATED_AD_TYPES = 28;</code>
     */
    CANNOT_ADD_CAMPAIGN_WITH_DEPRECATED_AD_TYPES(28),
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
     * The start date of an experiment cannot be set in the past.
     * Use a start date in the future.
     * </pre>
     *
     * <code>CANNOT_SET_START_DATE_IN_PAST = 2;</code>
     */
    public static final int CANNOT_SET_START_DATE_IN_PAST_VALUE = 2;
    /**
     * <pre>
     * The end date of an experiment is before its start date.
     * Use an end date after the start date.
     * </pre>
     *
     * <code>END_DATE_BEFORE_START_DATE = 3;</code>
     */
    public static final int END_DATE_BEFORE_START_DATE_VALUE = 3;
    /**
     * <pre>
     * The start date of an experiment is too far in the future.
     * Use a start date no more than 1 year in the future.
     * </pre>
     *
     * <code>START_DATE_TOO_FAR_IN_FUTURE = 4;</code>
     */
    public static final int START_DATE_TOO_FAR_IN_FUTURE_VALUE = 4;
    /**
     * <pre>
     * The experiment has the same name as an existing active experiment.
     * </pre>
     *
     * <code>DUPLICATE_EXPERIMENT_NAME = 5;</code>
     */
    public static final int DUPLICATE_EXPERIMENT_NAME_VALUE = 5;
    /**
     * <pre>
     * Experiments can only be modified when they are ENABLED.
     * </pre>
     *
     * <code>CANNOT_MODIFY_REMOVED_EXPERIMENT = 6;</code>
     */
    public static final int CANNOT_MODIFY_REMOVED_EXPERIMENT_VALUE = 6;
    /**
     * <pre>
     * The start date of an experiment cannot be modified if the existing start
     * date has already passed.
     * </pre>
     *
     * <code>START_DATE_ALREADY_PASSED = 7;</code>
     */
    public static final int START_DATE_ALREADY_PASSED_VALUE = 7;
    /**
     * <pre>
     * The end date of an experiment cannot be set in the past.
     * </pre>
     *
     * <code>CANNOT_SET_END_DATE_IN_PAST = 8;</code>
     */
    public static final int CANNOT_SET_END_DATE_IN_PAST_VALUE = 8;
    /**
     * <pre>
     * The status of an experiment cannot be set to REMOVED.
     * </pre>
     *
     * <code>CANNOT_SET_STATUS_TO_REMOVED = 9;</code>
     */
    public static final int CANNOT_SET_STATUS_TO_REMOVED_VALUE = 9;
    /**
     * <pre>
     * The end date of an expired experiment cannot be modified.
     * </pre>
     *
     * <code>CANNOT_MODIFY_PAST_END_DATE = 10;</code>
     */
    public static final int CANNOT_MODIFY_PAST_END_DATE_VALUE = 10;
    /**
     * <pre>
     * The status is invalid.
     * </pre>
     *
     * <code>INVALID_STATUS = 11;</code>
     */
    public static final int INVALID_STATUS_VALUE = 11;
    /**
     * <pre>
     * Experiment arm contains campaigns with invalid advertising channel type.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN_CHANNEL_TYPE = 12;</code>
     */
    public static final int INVALID_CAMPAIGN_CHANNEL_TYPE_VALUE = 12;
    /**
     * <pre>
     * A pair of trials share members and have overlapping date ranges.
     * </pre>
     *
     * <code>OVERLAPPING_MEMBERS_AND_DATE_RANGE = 13;</code>
     */
    public static final int OVERLAPPING_MEMBERS_AND_DATE_RANGE_VALUE = 13;
    /**
     * <pre>
     * Experiment arm contains invalid traffic split.
     * </pre>
     *
     * <code>INVALID_TRIAL_ARM_TRAFFIC_SPLIT = 14;</code>
     */
    public static final int INVALID_TRIAL_ARM_TRAFFIC_SPLIT_VALUE = 14;
    /**
     * <pre>
     * Experiment contains trial arms with overlapping traffic split.
     * </pre>
     *
     * <code>TRAFFIC_SPLIT_OVERLAPPING = 15;</code>
     */
    public static final int TRAFFIC_SPLIT_OVERLAPPING_VALUE = 15;
    /**
     * <pre>
     * The total traffic split of trial arms is not equal to 100.
     * </pre>
     *
     * <code>SUM_TRIAL_ARM_TRAFFIC_UNEQUALS_TO_TRIAL_TRAFFIC_SPLIT_DENOMINATOR = 16;</code>
     */
    public static final int SUM_TRIAL_ARM_TRAFFIC_UNEQUALS_TO_TRIAL_TRAFFIC_SPLIT_DENOMINATOR_VALUE = 16;
    /**
     * <pre>
     * Traffic split related settings (like traffic share bounds) can't be
     * modified after the experiment has started.
     * </pre>
     *
     * <code>CANNOT_MODIFY_TRAFFIC_SPLIT_AFTER_START = 17;</code>
     */
    public static final int CANNOT_MODIFY_TRAFFIC_SPLIT_AFTER_START_VALUE = 17;
    /**
     * <pre>
     * The experiment could not be found.
     * </pre>
     *
     * <code>EXPERIMENT_NOT_FOUND = 18;</code>
     */
    public static final int EXPERIMENT_NOT_FOUND_VALUE = 18;
    /**
     * <pre>
     * Experiment has not begun.
     * </pre>
     *
     * <code>EXPERIMENT_NOT_YET_STARTED = 19;</code>
     */
    public static final int EXPERIMENT_NOT_YET_STARTED_VALUE = 19;
    /**
     * <pre>
     * The experiment cannot have more than one control arm.
     * </pre>
     *
     * <code>CANNOT_HAVE_MULTIPLE_CONTROL_ARMS = 20;</code>
     */
    public static final int CANNOT_HAVE_MULTIPLE_CONTROL_ARMS_VALUE = 20;
    /**
     * <pre>
     * The experiment doesn't set in-design campaigns.
     * </pre>
     *
     * <code>IN_DESIGN_CAMPAIGNS_NOT_SET = 21;</code>
     */
    public static final int IN_DESIGN_CAMPAIGNS_NOT_SET_VALUE = 21;
    /**
     * <pre>
     * Clients must use the graduate action to graduate experiments and cannot
     * set the status to GRADUATED directly.
     * </pre>
     *
     * <code>CANNOT_SET_STATUS_TO_GRADUATED = 22;</code>
     */
    public static final int CANNOT_SET_STATUS_TO_GRADUATED_VALUE = 22;
    /**
     * <pre>
     * Cannot use shared budget on base campaign when scheduling an experiment.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_SHARED_BUDGET = 23;</code>
     */
    public static final int CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_SHARED_BUDGET_VALUE = 23;
    /**
     * <pre>
     * Cannot use custom budget on base campaign when scheduling an experiment.
     * </pre>
     *
     * <code>CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_CUSTOM_BUDGET = 24;</code>
     */
    public static final int CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_CUSTOM_BUDGET_VALUE = 24;
    /**
     * <pre>
     * Invalid status transition.
     * </pre>
     *
     * <code>STATUS_TRANSITION_INVALID = 25;</code>
     */
    public static final int STATUS_TRANSITION_INVALID_VALUE = 25;
    /**
     * <pre>
     * The experiment campaign name conflicts with a pre-existing campaign.
     * </pre>
     *
     * <code>DUPLICATE_EXPERIMENT_CAMPAIGN_NAME = 26;</code>
     */
    public static final int DUPLICATE_EXPERIMENT_CAMPAIGN_NAME_VALUE = 26;
    /**
     * <pre>
     * Cannot remove in creation experiments.
     * </pre>
     *
     * <code>CANNOT_REMOVE_IN_CREATION_EXPERIMENT = 27;</code>
     */
    public static final int CANNOT_REMOVE_IN_CREATION_EXPERIMENT_VALUE = 27;
    /**
     * <pre>
     * Cannot add campaign with deprecated ad types. Deprecated ad types:
     * ENHANCED_DISPLAY, GALLERY, GMAIL, KEYWORDLESS, TEXT.
     * </pre>
     *
     * <code>CANNOT_ADD_CAMPAIGN_WITH_DEPRECATED_AD_TYPES = 28;</code>
     */
    public static final int CANNOT_ADD_CAMPAIGN_WITH_DEPRECATED_AD_TYPES_VALUE = 28;


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
    public static ExperimentError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExperimentError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CANNOT_SET_START_DATE_IN_PAST;
        case 3: return END_DATE_BEFORE_START_DATE;
        case 4: return START_DATE_TOO_FAR_IN_FUTURE;
        case 5: return DUPLICATE_EXPERIMENT_NAME;
        case 6: return CANNOT_MODIFY_REMOVED_EXPERIMENT;
        case 7: return START_DATE_ALREADY_PASSED;
        case 8: return CANNOT_SET_END_DATE_IN_PAST;
        case 9: return CANNOT_SET_STATUS_TO_REMOVED;
        case 10: return CANNOT_MODIFY_PAST_END_DATE;
        case 11: return INVALID_STATUS;
        case 12: return INVALID_CAMPAIGN_CHANNEL_TYPE;
        case 13: return OVERLAPPING_MEMBERS_AND_DATE_RANGE;
        case 14: return INVALID_TRIAL_ARM_TRAFFIC_SPLIT;
        case 15: return TRAFFIC_SPLIT_OVERLAPPING;
        case 16: return SUM_TRIAL_ARM_TRAFFIC_UNEQUALS_TO_TRIAL_TRAFFIC_SPLIT_DENOMINATOR;
        case 17: return CANNOT_MODIFY_TRAFFIC_SPLIT_AFTER_START;
        case 18: return EXPERIMENT_NOT_FOUND;
        case 19: return EXPERIMENT_NOT_YET_STARTED;
        case 20: return CANNOT_HAVE_MULTIPLE_CONTROL_ARMS;
        case 21: return IN_DESIGN_CAMPAIGNS_NOT_SET;
        case 22: return CANNOT_SET_STATUS_TO_GRADUATED;
        case 23: return CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_SHARED_BUDGET;
        case 24: return CANNOT_CREATE_EXPERIMENT_CAMPAIGN_WITH_CUSTOM_BUDGET;
        case 25: return STATUS_TRANSITION_INVALID;
        case 26: return DUPLICATE_EXPERIMENT_CAMPAIGN_NAME;
        case 27: return CANNOT_REMOVE_IN_CREATION_EXPERIMENT;
        case 28: return CANNOT_ADD_CAMPAIGN_WITH_DEPRECATED_AD_TYPES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExperimentError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExperimentError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExperimentError>() {
            public ExperimentError findValueByNumber(int number) {
              return ExperimentError.forNumber(number);
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
      return com.google.ads.googleads.v15.errors.ExperimentErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExperimentError[] VALUES = values();

    public static ExperimentError valueOf(
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

    private ExperimentError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.errors.ExperimentErrorEnum.ExperimentError)
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
    if (!(obj instanceof com.google.ads.googleads.v15.errors.ExperimentErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.errors.ExperimentErrorEnum other = (com.google.ads.googleads.v15.errors.ExperimentErrorEnum) obj;

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

  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.errors.ExperimentErrorEnum prototype) {
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
   * Container for enum describing possible experiment error.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.errors.ExperimentErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.errors.ExperimentErrorEnum)
      com.google.ads.googleads.v15.errors.ExperimentErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.errors.ExperimentErrorProto.internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.errors.ExperimentErrorProto.internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.errors.ExperimentErrorEnum.class, com.google.ads.googleads.v15.errors.ExperimentErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.errors.ExperimentErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v15.errors.ExperimentErrorProto.internal_static_google_ads_googleads_v15_errors_ExperimentErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.ExperimentErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.errors.ExperimentErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.ExperimentErrorEnum build() {
      com.google.ads.googleads.v15.errors.ExperimentErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.ExperimentErrorEnum buildPartial() {
      com.google.ads.googleads.v15.errors.ExperimentErrorEnum result = new com.google.ads.googleads.v15.errors.ExperimentErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.errors.ExperimentErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v15.errors.ExperimentErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.errors.ExperimentErrorEnum other) {
      if (other == com.google.ads.googleads.v15.errors.ExperimentErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.errors.ExperimentErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.errors.ExperimentErrorEnum)
  private static final com.google.ads.googleads.v15.errors.ExperimentErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.errors.ExperimentErrorEnum();
  }

  public static com.google.ads.googleads.v15.errors.ExperimentErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExperimentErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ExperimentErrorEnum>() {
    @java.lang.Override
    public ExperimentErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExperimentErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExperimentErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.errors.ExperimentErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

