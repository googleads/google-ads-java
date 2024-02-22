// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/ad_group_ad.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface AdGroupAdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.AdGroupAd)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad.
   * Ad group ad resource names have the form:
   *
   * `customers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad.
   * Ad group ad resource names have the form:
   *
   * `customers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The status of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AdGroupAdStatusEnum.AdGroupAdStatus status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AdGroupAdStatusEnum.AdGroupAdStatus status = 3;</code>
   * @return The status.
   */
  com.google.ads.googleads.v16.enums.AdGroupAdStatusEnum.AdGroupAdStatus getStatus();

  /**
   * <pre>
   * Immutable. The ad group to which the ad belongs.
   * </pre>
   *
   * <code>optional string ad_group = 9 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Immutable. The ad group to which the ad belongs.
   * </pre>
   *
   * <code>optional string ad_group = 9 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * Immutable. The ad group to which the ad belongs.
   * </pre>
   *
   * <code>optional string ad_group = 9 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * Immutable. The ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.Ad ad = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the ad field is set.
   */
  boolean hasAd();
  /**
   * <pre>
   * Immutable. The ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.Ad ad = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The ad.
   */
  com.google.ads.googleads.v16.resources.Ad getAd();
  /**
   * <pre>
   * Immutable. The ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.Ad ad = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v16.resources.AdOrBuilder getAdOrBuilder();

  /**
   * <pre>
   * Output only. Policy information for the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.AdGroupAdPolicySummary policy_summary = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the policySummary field is set.
   */
  boolean hasPolicySummary();
  /**
   * <pre>
   * Output only. Policy information for the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.AdGroupAdPolicySummary policy_summary = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The policySummary.
   */
  com.google.ads.googleads.v16.resources.AdGroupAdPolicySummary getPolicySummary();
  /**
   * <pre>
   * Output only. Policy information for the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.AdGroupAdPolicySummary policy_summary = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v16.resources.AdGroupAdPolicySummaryOrBuilder getPolicySummaryOrBuilder();

  /**
   * <pre>
   * Output only. Overall ad strength for this ad group ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AdStrengthEnum.AdStrength ad_strength = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for adStrength.
   */
  int getAdStrengthValue();
  /**
   * <pre>
   * Output only. Overall ad strength for this ad group ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AdStrengthEnum.AdStrength ad_strength = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adStrength.
   */
  com.google.ads.googleads.v16.enums.AdStrengthEnum.AdStrength getAdStrength();

  /**
   * <pre>
   * Output only. A list of recommendations to improve the ad strength. For
   * example, a recommendation could be "Try adding a few more unique headlines
   * or unpinning some assets.".
   * </pre>
   *
   * <code>repeated string action_items = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the actionItems.
   */
  java.util.List<java.lang.String>
      getActionItemsList();
  /**
   * <pre>
   * Output only. A list of recommendations to improve the ad strength. For
   * example, a recommendation could be "Try adding a few more unique headlines
   * or unpinning some assets.".
   * </pre>
   *
   * <code>repeated string action_items = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of actionItems.
   */
  int getActionItemsCount();
  /**
   * <pre>
   * Output only. A list of recommendations to improve the ad strength. For
   * example, a recommendation could be "Try adding a few more unique headlines
   * or unpinning some assets.".
   * </pre>
   *
   * <code>repeated string action_items = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The actionItems at the given index.
   */
  java.lang.String getActionItems(int index);
  /**
   * <pre>
   * Output only. A list of recommendations to improve the ad strength. For
   * example, a recommendation could be "Try adding a few more unique headlines
   * or unpinning some assets.".
   * </pre>
   *
   * <code>repeated string action_items = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the actionItems at the given index.
   */
  com.google.protobuf.ByteString
      getActionItemsBytes(int index);

  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group ad.
   * </pre>
   *
   * <code>repeated string labels = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return A list containing the labels.
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group ad.
   * </pre>
   *
   * <code>repeated string labels = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The count of labels.
   */
  int getLabelsCount();
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group ad.
   * </pre>
   *
   * <code>repeated string labels = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  java.lang.String getLabels(int index);
  /**
   * <pre>
   * Output only. The resource names of labels attached to this ad group ad.
   * </pre>
   *
   * <code>repeated string labels = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the labels at the given index.
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);

  /**
   * <pre>
   * Output only. Provides aggregated view into why an ad group ad is not
   * serving or not serving optimally.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusEnum.AdGroupAdPrimaryStatus primary_status = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for primaryStatus.
   */
  int getPrimaryStatusValue();
  /**
   * <pre>
   * Output only. Provides aggregated view into why an ad group ad is not
   * serving or not serving optimally.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusEnum.AdGroupAdPrimaryStatus primary_status = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The primaryStatus.
   */
  com.google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusEnum.AdGroupAdPrimaryStatus getPrimaryStatus();

  /**
   * <pre>
   * Output only. Provides reasons for why an ad group ad is not serving or not
   * serving optimally.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusReasonEnum.AdGroupAdPrimaryStatusReason primary_status_reasons = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the primaryStatusReasons.
   */
  java.util.List<com.google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusReasonEnum.AdGroupAdPrimaryStatusReason> getPrimaryStatusReasonsList();
  /**
   * <pre>
   * Output only. Provides reasons for why an ad group ad is not serving or not
   * serving optimally.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusReasonEnum.AdGroupAdPrimaryStatusReason primary_status_reasons = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of primaryStatusReasons.
   */
  int getPrimaryStatusReasonsCount();
  /**
   * <pre>
   * Output only. Provides reasons for why an ad group ad is not serving or not
   * serving optimally.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusReasonEnum.AdGroupAdPrimaryStatusReason primary_status_reasons = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The primaryStatusReasons at the given index.
   */
  com.google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusReasonEnum.AdGroupAdPrimaryStatusReason getPrimaryStatusReasons(int index);
  /**
   * <pre>
   * Output only. Provides reasons for why an ad group ad is not serving or not
   * serving optimally.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusReasonEnum.AdGroupAdPrimaryStatusReason primary_status_reasons = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the enum numeric values on the wire for primaryStatusReasons.
   */
  java.util.List<java.lang.Integer>
  getPrimaryStatusReasonsValueList();
  /**
   * <pre>
   * Output only. Provides reasons for why an ad group ad is not serving or not
   * serving optimally.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.enums.AdGroupAdPrimaryStatusReasonEnum.AdGroupAdPrimaryStatusReason primary_status_reasons = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of primaryStatusReasons at the given index.
   */
  int getPrimaryStatusReasonsValue(int index);
}
