// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/enums/campaign_primary_status_reason.proto

package com.google.ads.googleads.v14.enums;

/**
 * <pre>
 * Container for enum describing possible campaign primary status reasons.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum}
 */
public final class CampaignPrimaryStatusReasonEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum)
    CampaignPrimaryStatusReasonEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignPrimaryStatusReasonEnum.newBuilder() to construct.
  private CampaignPrimaryStatusReasonEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignPrimaryStatusReasonEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignPrimaryStatusReasonEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonProto.internal_static_google_ads_googleads_v14_enums_CampaignPrimaryStatusReasonEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonProto.internal_static_google_ads_googleads_v14_enums_CampaignPrimaryStatusReasonEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.class, com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the possible campaign primary status reasons.  Provides
   * insight into why a campaign is not serving or not serving optimally. These
   * reasons are aggregated to determine an overall campaign primary status.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.CampaignPrimaryStatusReason}
   */
  public enum CampaignPrimaryStatusReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The user-specified campaign status is removed.
     * </pre>
     *
     * <code>CAMPAIGN_REMOVED = 2;</code>
     */
    CAMPAIGN_REMOVED(2),
    /**
     * <pre>
     * The user-specified campaign status is paused.
     * </pre>
     *
     * <code>CAMPAIGN_PAUSED = 3;</code>
     */
    CAMPAIGN_PAUSED(3),
    /**
     * <pre>
     * The user-specified time for this campaign to start is in the future.
     * </pre>
     *
     * <code>CAMPAIGN_PENDING = 4;</code>
     */
    CAMPAIGN_PENDING(4),
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed.
     * </pre>
     *
     * <code>CAMPAIGN_ENDED = 5;</code>
     */
    CAMPAIGN_ENDED(5),
    /**
     * <pre>
     * The campaign is a draft.
     * </pre>
     *
     * <code>CAMPAIGN_DRAFT = 6;</code>
     */
    CAMPAIGN_DRAFT(6),
    /**
     * <pre>
     * The bidding strategy has incorrect user-specified settings.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_MISCONFIGURED = 7;</code>
     */
    BIDDING_STRATEGY_MISCONFIGURED(7),
    /**
     * <pre>
     * The bidding strategy is limited by user-specified settings such as lack
     * of data or similar.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_LIMITED = 8;</code>
     */
    BIDDING_STRATEGY_LIMITED(8),
    /**
     * <pre>
     * The automated bidding system is adjusting to user-specified changes to
     * the bidding strategy.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_LEARNING = 9;</code>
     */
    BIDDING_STRATEGY_LEARNING(9),
    /**
     * <pre>
     * Campaign could capture more conversion value by adjusting CPA/ROAS
     * targets.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_CONSTRAINED = 10;</code>
     */
    BIDDING_STRATEGY_CONSTRAINED(10),
    /**
     * <pre>
     * The budget is limiting the campaign's ability to serve.
     * </pre>
     *
     * <code>BUDGET_CONSTRAINED = 11;</code>
     */
    BUDGET_CONSTRAINED(11),
    /**
     * <pre>
     * The budget has incorrect user-specified settings.
     * </pre>
     *
     * <code>BUDGET_MISCONFIGURED = 12;</code>
     */
    BUDGET_MISCONFIGURED(12),
    /**
     * <pre>
     * Campaign is not targeting all relevant queries.
     * </pre>
     *
     * <code>SEARCH_VOLUME_LIMITED = 13;</code>
     */
    SEARCH_VOLUME_LIMITED(13),
    /**
     * <pre>
     * The user-specified ad group statuses are all paused.
     * </pre>
     *
     * <code>AD_GROUPS_PAUSED = 14;</code>
     */
    AD_GROUPS_PAUSED(14),
    /**
     * <pre>
     * No eligible ad groups exist in this campaign.
     * </pre>
     *
     * <code>NO_AD_GROUPS = 15;</code>
     */
    NO_AD_GROUPS(15),
    /**
     * <pre>
     * The user-specified keyword statuses are all paused.
     * </pre>
     *
     * <code>KEYWORDS_PAUSED = 16;</code>
     */
    KEYWORDS_PAUSED(16),
    /**
     * <pre>
     * No eligible keywords exist in this campaign.
     * </pre>
     *
     * <code>NO_KEYWORDS = 17;</code>
     */
    NO_KEYWORDS(17),
    /**
     * <pre>
     * The user-specified ad group ad statuses are all paused.
     * </pre>
     *
     * <code>AD_GROUP_ADS_PAUSED = 18;</code>
     */
    AD_GROUP_ADS_PAUSED(18),
    /**
     * <pre>
     * No eligible ad group ads exist in this campaign.
     * </pre>
     *
     * <code>NO_AD_GROUP_ADS = 19;</code>
     */
    NO_AD_GROUP_ADS(19),
    /**
     * <pre>
     * At least one ad in this campaign is limited by policy.
     * </pre>
     *
     * <code>HAS_ADS_LIMITED_BY_POLICY = 20;</code>
     */
    HAS_ADS_LIMITED_BY_POLICY(20),
    /**
     * <pre>
     * At least one ad in this campaign is disapproved.
     * </pre>
     *
     * <code>HAS_ADS_DISAPPROVED = 21;</code>
     */
    HAS_ADS_DISAPPROVED(21),
    /**
     * <pre>
     * Most ads in this campaign are pending review.
     * </pre>
     *
     * <code>MOST_ADS_UNDER_REVIEW = 22;</code>
     */
    MOST_ADS_UNDER_REVIEW(22),
    /**
     * <pre>
     * The campaign has a lead form goal, and the lead form extension is
     * missing.
     * </pre>
     *
     * <code>MISSING_LEAD_FORM_EXTENSION = 23;</code>
     */
    MISSING_LEAD_FORM_EXTENSION(23),
    /**
     * <pre>
     * The campaign has a call goal, and the call extension is missing.
     * </pre>
     *
     * <code>MISSING_CALL_EXTENSION = 24;</code>
     */
    MISSING_CALL_EXTENSION(24),
    /**
     * <pre>
     * The lead form extension is under review.
     * </pre>
     *
     * <code>LEAD_FORM_EXTENSION_UNDER_REVIEW = 25;</code>
     */
    LEAD_FORM_EXTENSION_UNDER_REVIEW(25),
    /**
     * <pre>
     * The lead extension is disapproved.
     * </pre>
     *
     * <code>LEAD_FORM_EXTENSION_DISAPPROVED = 26;</code>
     */
    LEAD_FORM_EXTENSION_DISAPPROVED(26),
    /**
     * <pre>
     * The call extension is under review.
     * </pre>
     *
     * <code>CALL_EXTENSION_UNDER_REVIEW = 27;</code>
     */
    CALL_EXTENSION_UNDER_REVIEW(27),
    /**
     * <pre>
     * The call extension is disapproved.
     * </pre>
     *
     * <code>CALL_EXTENSION_DISAPPROVED = 28;</code>
     */
    CALL_EXTENSION_DISAPPROVED(28),
    /**
     * <pre>
     * No eligible mobile application ad group criteria exist in this campaign.
     * </pre>
     *
     * <code>NO_MOBILE_APPLICATION_AD_GROUP_CRITERIA = 29;</code>
     */
    NO_MOBILE_APPLICATION_AD_GROUP_CRITERIA(29),
    /**
     * <pre>
     * The user-specified campaign group status is paused.
     * </pre>
     *
     * <code>CAMPAIGN_GROUP_PAUSED = 30;</code>
     */
    CAMPAIGN_GROUP_PAUSED(30),
    /**
     * <pre>
     * The user-specified times of all group budgets associated with the parent
     * campaign group has passed.
     * </pre>
     *
     * <code>CAMPAIGN_GROUP_ALL_GROUP_BUDGETS_ENDED = 31;</code>
     */
    CAMPAIGN_GROUP_ALL_GROUP_BUDGETS_ENDED(31),
    /**
     * <pre>
     * The app associated with this ACi campaign is not released in the target
     * countries of the campaign.
     * </pre>
     *
     * <code>APP_NOT_RELEASED = 32;</code>
     */
    APP_NOT_RELEASED(32),
    /**
     * <pre>
     * The app associated with this ACi campaign is partially released in the
     * target countries of the campaign.
     * </pre>
     *
     * <code>APP_PARTIALLY_RELEASED = 33;</code>
     */
    APP_PARTIALLY_RELEASED(33),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The user-specified campaign status is removed.
     * </pre>
     *
     * <code>CAMPAIGN_REMOVED = 2;</code>
     */
    public static final int CAMPAIGN_REMOVED_VALUE = 2;
    /**
     * <pre>
     * The user-specified campaign status is paused.
     * </pre>
     *
     * <code>CAMPAIGN_PAUSED = 3;</code>
     */
    public static final int CAMPAIGN_PAUSED_VALUE = 3;
    /**
     * <pre>
     * The user-specified time for this campaign to start is in the future.
     * </pre>
     *
     * <code>CAMPAIGN_PENDING = 4;</code>
     */
    public static final int CAMPAIGN_PENDING_VALUE = 4;
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed.
     * </pre>
     *
     * <code>CAMPAIGN_ENDED = 5;</code>
     */
    public static final int CAMPAIGN_ENDED_VALUE = 5;
    /**
     * <pre>
     * The campaign is a draft.
     * </pre>
     *
     * <code>CAMPAIGN_DRAFT = 6;</code>
     */
    public static final int CAMPAIGN_DRAFT_VALUE = 6;
    /**
     * <pre>
     * The bidding strategy has incorrect user-specified settings.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_MISCONFIGURED = 7;</code>
     */
    public static final int BIDDING_STRATEGY_MISCONFIGURED_VALUE = 7;
    /**
     * <pre>
     * The bidding strategy is limited by user-specified settings such as lack
     * of data or similar.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_LIMITED = 8;</code>
     */
    public static final int BIDDING_STRATEGY_LIMITED_VALUE = 8;
    /**
     * <pre>
     * The automated bidding system is adjusting to user-specified changes to
     * the bidding strategy.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_LEARNING = 9;</code>
     */
    public static final int BIDDING_STRATEGY_LEARNING_VALUE = 9;
    /**
     * <pre>
     * Campaign could capture more conversion value by adjusting CPA/ROAS
     * targets.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_CONSTRAINED = 10;</code>
     */
    public static final int BIDDING_STRATEGY_CONSTRAINED_VALUE = 10;
    /**
     * <pre>
     * The budget is limiting the campaign's ability to serve.
     * </pre>
     *
     * <code>BUDGET_CONSTRAINED = 11;</code>
     */
    public static final int BUDGET_CONSTRAINED_VALUE = 11;
    /**
     * <pre>
     * The budget has incorrect user-specified settings.
     * </pre>
     *
     * <code>BUDGET_MISCONFIGURED = 12;</code>
     */
    public static final int BUDGET_MISCONFIGURED_VALUE = 12;
    /**
     * <pre>
     * Campaign is not targeting all relevant queries.
     * </pre>
     *
     * <code>SEARCH_VOLUME_LIMITED = 13;</code>
     */
    public static final int SEARCH_VOLUME_LIMITED_VALUE = 13;
    /**
     * <pre>
     * The user-specified ad group statuses are all paused.
     * </pre>
     *
     * <code>AD_GROUPS_PAUSED = 14;</code>
     */
    public static final int AD_GROUPS_PAUSED_VALUE = 14;
    /**
     * <pre>
     * No eligible ad groups exist in this campaign.
     * </pre>
     *
     * <code>NO_AD_GROUPS = 15;</code>
     */
    public static final int NO_AD_GROUPS_VALUE = 15;
    /**
     * <pre>
     * The user-specified keyword statuses are all paused.
     * </pre>
     *
     * <code>KEYWORDS_PAUSED = 16;</code>
     */
    public static final int KEYWORDS_PAUSED_VALUE = 16;
    /**
     * <pre>
     * No eligible keywords exist in this campaign.
     * </pre>
     *
     * <code>NO_KEYWORDS = 17;</code>
     */
    public static final int NO_KEYWORDS_VALUE = 17;
    /**
     * <pre>
     * The user-specified ad group ad statuses are all paused.
     * </pre>
     *
     * <code>AD_GROUP_ADS_PAUSED = 18;</code>
     */
    public static final int AD_GROUP_ADS_PAUSED_VALUE = 18;
    /**
     * <pre>
     * No eligible ad group ads exist in this campaign.
     * </pre>
     *
     * <code>NO_AD_GROUP_ADS = 19;</code>
     */
    public static final int NO_AD_GROUP_ADS_VALUE = 19;
    /**
     * <pre>
     * At least one ad in this campaign is limited by policy.
     * </pre>
     *
     * <code>HAS_ADS_LIMITED_BY_POLICY = 20;</code>
     */
    public static final int HAS_ADS_LIMITED_BY_POLICY_VALUE = 20;
    /**
     * <pre>
     * At least one ad in this campaign is disapproved.
     * </pre>
     *
     * <code>HAS_ADS_DISAPPROVED = 21;</code>
     */
    public static final int HAS_ADS_DISAPPROVED_VALUE = 21;
    /**
     * <pre>
     * Most ads in this campaign are pending review.
     * </pre>
     *
     * <code>MOST_ADS_UNDER_REVIEW = 22;</code>
     */
    public static final int MOST_ADS_UNDER_REVIEW_VALUE = 22;
    /**
     * <pre>
     * The campaign has a lead form goal, and the lead form extension is
     * missing.
     * </pre>
     *
     * <code>MISSING_LEAD_FORM_EXTENSION = 23;</code>
     */
    public static final int MISSING_LEAD_FORM_EXTENSION_VALUE = 23;
    /**
     * <pre>
     * The campaign has a call goal, and the call extension is missing.
     * </pre>
     *
     * <code>MISSING_CALL_EXTENSION = 24;</code>
     */
    public static final int MISSING_CALL_EXTENSION_VALUE = 24;
    /**
     * <pre>
     * The lead form extension is under review.
     * </pre>
     *
     * <code>LEAD_FORM_EXTENSION_UNDER_REVIEW = 25;</code>
     */
    public static final int LEAD_FORM_EXTENSION_UNDER_REVIEW_VALUE = 25;
    /**
     * <pre>
     * The lead extension is disapproved.
     * </pre>
     *
     * <code>LEAD_FORM_EXTENSION_DISAPPROVED = 26;</code>
     */
    public static final int LEAD_FORM_EXTENSION_DISAPPROVED_VALUE = 26;
    /**
     * <pre>
     * The call extension is under review.
     * </pre>
     *
     * <code>CALL_EXTENSION_UNDER_REVIEW = 27;</code>
     */
    public static final int CALL_EXTENSION_UNDER_REVIEW_VALUE = 27;
    /**
     * <pre>
     * The call extension is disapproved.
     * </pre>
     *
     * <code>CALL_EXTENSION_DISAPPROVED = 28;</code>
     */
    public static final int CALL_EXTENSION_DISAPPROVED_VALUE = 28;
    /**
     * <pre>
     * No eligible mobile application ad group criteria exist in this campaign.
     * </pre>
     *
     * <code>NO_MOBILE_APPLICATION_AD_GROUP_CRITERIA = 29;</code>
     */
    public static final int NO_MOBILE_APPLICATION_AD_GROUP_CRITERIA_VALUE = 29;
    /**
     * <pre>
     * The user-specified campaign group status is paused.
     * </pre>
     *
     * <code>CAMPAIGN_GROUP_PAUSED = 30;</code>
     */
    public static final int CAMPAIGN_GROUP_PAUSED_VALUE = 30;
    /**
     * <pre>
     * The user-specified times of all group budgets associated with the parent
     * campaign group has passed.
     * </pre>
     *
     * <code>CAMPAIGN_GROUP_ALL_GROUP_BUDGETS_ENDED = 31;</code>
     */
    public static final int CAMPAIGN_GROUP_ALL_GROUP_BUDGETS_ENDED_VALUE = 31;
    /**
     * <pre>
     * The app associated with this ACi campaign is not released in the target
     * countries of the campaign.
     * </pre>
     *
     * <code>APP_NOT_RELEASED = 32;</code>
     */
    public static final int APP_NOT_RELEASED_VALUE = 32;
    /**
     * <pre>
     * The app associated with this ACi campaign is partially released in the
     * target countries of the campaign.
     * </pre>
     *
     * <code>APP_PARTIALLY_RELEASED = 33;</code>
     */
    public static final int APP_PARTIALLY_RELEASED_VALUE = 33;


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
    public static CampaignPrimaryStatusReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CampaignPrimaryStatusReason forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CAMPAIGN_REMOVED;
        case 3: return CAMPAIGN_PAUSED;
        case 4: return CAMPAIGN_PENDING;
        case 5: return CAMPAIGN_ENDED;
        case 6: return CAMPAIGN_DRAFT;
        case 7: return BIDDING_STRATEGY_MISCONFIGURED;
        case 8: return BIDDING_STRATEGY_LIMITED;
        case 9: return BIDDING_STRATEGY_LEARNING;
        case 10: return BIDDING_STRATEGY_CONSTRAINED;
        case 11: return BUDGET_CONSTRAINED;
        case 12: return BUDGET_MISCONFIGURED;
        case 13: return SEARCH_VOLUME_LIMITED;
        case 14: return AD_GROUPS_PAUSED;
        case 15: return NO_AD_GROUPS;
        case 16: return KEYWORDS_PAUSED;
        case 17: return NO_KEYWORDS;
        case 18: return AD_GROUP_ADS_PAUSED;
        case 19: return NO_AD_GROUP_ADS;
        case 20: return HAS_ADS_LIMITED_BY_POLICY;
        case 21: return HAS_ADS_DISAPPROVED;
        case 22: return MOST_ADS_UNDER_REVIEW;
        case 23: return MISSING_LEAD_FORM_EXTENSION;
        case 24: return MISSING_CALL_EXTENSION;
        case 25: return LEAD_FORM_EXTENSION_UNDER_REVIEW;
        case 26: return LEAD_FORM_EXTENSION_DISAPPROVED;
        case 27: return CALL_EXTENSION_UNDER_REVIEW;
        case 28: return CALL_EXTENSION_DISAPPROVED;
        case 29: return NO_MOBILE_APPLICATION_AD_GROUP_CRITERIA;
        case 30: return CAMPAIGN_GROUP_PAUSED;
        case 31: return CAMPAIGN_GROUP_ALL_GROUP_BUDGETS_ENDED;
        case 32: return APP_NOT_RELEASED;
        case 33: return APP_PARTIALLY_RELEASED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CampaignPrimaryStatusReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CampaignPrimaryStatusReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CampaignPrimaryStatusReason>() {
            public CampaignPrimaryStatusReason findValueByNumber(int number) {
              return CampaignPrimaryStatusReason.forNumber(number);
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
      return com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CampaignPrimaryStatusReason[] VALUES = values();

    public static CampaignPrimaryStatusReason valueOf(
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

    private CampaignPrimaryStatusReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.CampaignPrimaryStatusReason)
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
    if (!(obj instanceof com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum other = (com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum) obj;

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

  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum prototype) {
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
   * Container for enum describing possible campaign primary status reasons.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum)
      com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonProto.internal_static_google_ads_googleads_v14_enums_CampaignPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonProto.internal_static_google_ads_googleads_v14_enums_CampaignPrimaryStatusReasonEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.class, com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.newBuilder()
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
      return com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonProto.internal_static_google_ads_googleads_v14_enums_CampaignPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum build() {
      com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum buildPartial() {
      com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum result = new com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum(this);
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
      if (other instanceof com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum) {
        return mergeFrom((com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum other) {
      if (other == com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum)
  private static final com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum();
  }

  public static com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignPrimaryStatusReasonEnum>
      PARSER = new com.google.protobuf.AbstractParser<CampaignPrimaryStatusReasonEnum>() {
    @java.lang.Override
    public CampaignPrimaryStatusReasonEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignPrimaryStatusReasonEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignPrimaryStatusReasonEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.enums.CampaignPrimaryStatusReasonEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

