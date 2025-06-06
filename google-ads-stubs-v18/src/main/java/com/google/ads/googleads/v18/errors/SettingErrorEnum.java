// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/errors/setting_error.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.errors;

/**
 * <pre>
 * Container for enum describing possible setting errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.errors.SettingErrorEnum}
 */
public final class SettingErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.errors.SettingErrorEnum)
    SettingErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SettingErrorEnum.newBuilder() to construct.
  private SettingErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SettingErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SettingErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.errors.SettingErrorProto.internal_static_google_ads_googleads_v18_errors_SettingErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.errors.SettingErrorProto.internal_static_google_ads_googleads_v18_errors_SettingErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.errors.SettingErrorEnum.class, com.google.ads.googleads.v18.errors.SettingErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible setting errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v18.errors.SettingErrorEnum.SettingError}
   */
  public enum SettingError
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
     * The campaign setting is not available for this Google Ads account.
     * </pre>
     *
     * <code>SETTING_TYPE_IS_NOT_AVAILABLE = 3;</code>
     */
    SETTING_TYPE_IS_NOT_AVAILABLE(3),
    /**
     * <pre>
     * The setting is not compatible with the campaign.
     * </pre>
     *
     * <code>SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN = 4;</code>
     */
    SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN(4),
    /**
     * <pre>
     * The supplied TargetingSetting contains an invalid CriterionTypeGroup. See
     * CriterionTypeGroup documentation for CriterionTypeGroups allowed
     * in Campaign or AdGroup TargetingSettings.
     * </pre>
     *
     * <code>TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP = 5;</code>
     */
    TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP(5),
    /**
     * <pre>
     * TargetingSetting must not explicitly
     * set any of the Demographic CriterionTypeGroups (AGE_RANGE, GENDER,
     * PARENT, INCOME_RANGE) to false (it's okay to not set them at all, in
     * which case the system will set them to true automatically).
     * </pre>
     *
     * <code>TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL = 6;</code>
     */
    TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL(6),
    /**
     * <pre>
     * TargetingSetting cannot change any of
     * the Demographic CriterionTypeGroups (AGE_RANGE, GENDER, PARENT,
     * INCOME_RANGE) from true to false.
     * </pre>
     *
     * <code>TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP = 7;</code>
     */
    TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP(7),
    /**
     * <pre>
     * At least one feed id should be present.
     * </pre>
     *
     * <code>DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT = 8;</code>
     */
    DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT(8),
    /**
     * <pre>
     * The supplied DynamicSearchAdsSetting contains an invalid domain name.
     * </pre>
     *
     * <code>DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME = 9;</code>
     */
    DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME(9),
    /**
     * <pre>
     * The supplied DynamicSearchAdsSetting contains a subdomain name.
     * </pre>
     *
     * <code>DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME = 10;</code>
     */
    DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME(10),
    /**
     * <pre>
     * The supplied DynamicSearchAdsSetting contains an invalid language code.
     * </pre>
     *
     * <code>DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE = 11;</code>
     */
    DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE(11),
    /**
     * <pre>
     * TargetingSettings in search campaigns should not have
     * CriterionTypeGroup.PLACEMENT set to targetAll.
     * </pre>
     *
     * <code>TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN = 12;</code>
     */
    TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN(12),
    /**
     * <pre>
     * The setting value is not compatible with the campaign type.
     * </pre>
     *
     * <code>SETTING_VALUE_NOT_COMPATIBLE_WITH_CAMPAIGN = 20;</code>
     */
    SETTING_VALUE_NOT_COMPATIBLE_WITH_CAMPAIGN(20),
    /**
     * <pre>
     * Switching from observation setting to targeting setting is not allowed
     * for Customer Match lists. See
     * https://support.google.com/google-ads/answer/6299717.
     * </pre>
     *
     * <code>BID_ONLY_IS_NOT_ALLOWED_TO_BE_MODIFIED_WITH_CUSTOMER_MATCH_TARGETING = 21;</code>
     */
    BID_ONLY_IS_NOT_ALLOWED_TO_BE_MODIFIED_WITH_CUSTOMER_MATCH_TARGETING(21),
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
     * The campaign setting is not available for this Google Ads account.
     * </pre>
     *
     * <code>SETTING_TYPE_IS_NOT_AVAILABLE = 3;</code>
     */
    public static final int SETTING_TYPE_IS_NOT_AVAILABLE_VALUE = 3;
    /**
     * <pre>
     * The setting is not compatible with the campaign.
     * </pre>
     *
     * <code>SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN = 4;</code>
     */
    public static final int SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN_VALUE = 4;
    /**
     * <pre>
     * The supplied TargetingSetting contains an invalid CriterionTypeGroup. See
     * CriterionTypeGroup documentation for CriterionTypeGroups allowed
     * in Campaign or AdGroup TargetingSettings.
     * </pre>
     *
     * <code>TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP = 5;</code>
     */
    public static final int TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP_VALUE = 5;
    /**
     * <pre>
     * TargetingSetting must not explicitly
     * set any of the Demographic CriterionTypeGroups (AGE_RANGE, GENDER,
     * PARENT, INCOME_RANGE) to false (it's okay to not set them at all, in
     * which case the system will set them to true automatically).
     * </pre>
     *
     * <code>TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL = 6;</code>
     */
    public static final int TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL_VALUE = 6;
    /**
     * <pre>
     * TargetingSetting cannot change any of
     * the Demographic CriterionTypeGroups (AGE_RANGE, GENDER, PARENT,
     * INCOME_RANGE) from true to false.
     * </pre>
     *
     * <code>TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP = 7;</code>
     */
    public static final int TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP_VALUE = 7;
    /**
     * <pre>
     * At least one feed id should be present.
     * </pre>
     *
     * <code>DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT = 8;</code>
     */
    public static final int DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT_VALUE = 8;
    /**
     * <pre>
     * The supplied DynamicSearchAdsSetting contains an invalid domain name.
     * </pre>
     *
     * <code>DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME = 9;</code>
     */
    public static final int DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME_VALUE = 9;
    /**
     * <pre>
     * The supplied DynamicSearchAdsSetting contains a subdomain name.
     * </pre>
     *
     * <code>DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME = 10;</code>
     */
    public static final int DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME_VALUE = 10;
    /**
     * <pre>
     * The supplied DynamicSearchAdsSetting contains an invalid language code.
     * </pre>
     *
     * <code>DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE = 11;</code>
     */
    public static final int DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE_VALUE = 11;
    /**
     * <pre>
     * TargetingSettings in search campaigns should not have
     * CriterionTypeGroup.PLACEMENT set to targetAll.
     * </pre>
     *
     * <code>TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN = 12;</code>
     */
    public static final int TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN_VALUE = 12;
    /**
     * <pre>
     * The setting value is not compatible with the campaign type.
     * </pre>
     *
     * <code>SETTING_VALUE_NOT_COMPATIBLE_WITH_CAMPAIGN = 20;</code>
     */
    public static final int SETTING_VALUE_NOT_COMPATIBLE_WITH_CAMPAIGN_VALUE = 20;
    /**
     * <pre>
     * Switching from observation setting to targeting setting is not allowed
     * for Customer Match lists. See
     * https://support.google.com/google-ads/answer/6299717.
     * </pre>
     *
     * <code>BID_ONLY_IS_NOT_ALLOWED_TO_BE_MODIFIED_WITH_CUSTOMER_MATCH_TARGETING = 21;</code>
     */
    public static final int BID_ONLY_IS_NOT_ALLOWED_TO_BE_MODIFIED_WITH_CUSTOMER_MATCH_TARGETING_VALUE = 21;


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
    public static SettingError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SettingError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 3: return SETTING_TYPE_IS_NOT_AVAILABLE;
        case 4: return SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN;
        case 5: return TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP;
        case 6: return TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL;
        case 7: return TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP;
        case 8: return DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT;
        case 9: return DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME;
        case 10: return DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME;
        case 11: return DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE;
        case 12: return TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN;
        case 20: return SETTING_VALUE_NOT_COMPATIBLE_WITH_CAMPAIGN;
        case 21: return BID_ONLY_IS_NOT_ALLOWED_TO_BE_MODIFIED_WITH_CUSTOMER_MATCH_TARGETING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SettingError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SettingError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SettingError>() {
            public SettingError findValueByNumber(int number) {
              return SettingError.forNumber(number);
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
      return com.google.ads.googleads.v18.errors.SettingErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final SettingError[] VALUES = values();

    public static SettingError valueOf(
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

    private SettingError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v18.errors.SettingErrorEnum.SettingError)
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
    if (!(obj instanceof com.google.ads.googleads.v18.errors.SettingErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.errors.SettingErrorEnum other = (com.google.ads.googleads.v18.errors.SettingErrorEnum) obj;

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

  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.SettingErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.errors.SettingErrorEnum prototype) {
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
   * Container for enum describing possible setting errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.errors.SettingErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.errors.SettingErrorEnum)
      com.google.ads.googleads.v18.errors.SettingErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.errors.SettingErrorProto.internal_static_google_ads_googleads_v18_errors_SettingErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.errors.SettingErrorProto.internal_static_google_ads_googleads_v18_errors_SettingErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.errors.SettingErrorEnum.class, com.google.ads.googleads.v18.errors.SettingErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.errors.SettingErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v18.errors.SettingErrorProto.internal_static_google_ads_googleads_v18_errors_SettingErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.SettingErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.errors.SettingErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.SettingErrorEnum build() {
      com.google.ads.googleads.v18.errors.SettingErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.SettingErrorEnum buildPartial() {
      com.google.ads.googleads.v18.errors.SettingErrorEnum result = new com.google.ads.googleads.v18.errors.SettingErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v18.errors.SettingErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v18.errors.SettingErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.errors.SettingErrorEnum other) {
      if (other == com.google.ads.googleads.v18.errors.SettingErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.errors.SettingErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.errors.SettingErrorEnum)
  private static final com.google.ads.googleads.v18.errors.SettingErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.errors.SettingErrorEnum();
  }

  public static com.google.ads.googleads.v18.errors.SettingErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SettingErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<SettingErrorEnum>() {
    @java.lang.Override
    public SettingErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<SettingErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SettingErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.errors.SettingErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

