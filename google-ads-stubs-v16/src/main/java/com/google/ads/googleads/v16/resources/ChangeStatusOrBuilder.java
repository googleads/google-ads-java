// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/change_status.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface ChangeStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.ChangeStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the change status.
   * Change status resource names have the form:
   *
   * `customers/{customer_id}/changeStatus/{change_status_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the change status.
   * Change status resource names have the form:
   *
   * `customers/{customer_id}/changeStatus/{change_status_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Time at which the most recent change has occurred on this
   * resource.
   * </pre>
   *
   * <code>optional string last_change_date_time = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the lastChangeDateTime field is set.
   */
  boolean hasLastChangeDateTime();
  /**
   * <pre>
   * Output only. Time at which the most recent change has occurred on this
   * resource.
   * </pre>
   *
   * <code>optional string last_change_date_time = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lastChangeDateTime.
   */
  java.lang.String getLastChangeDateTime();
  /**
   * <pre>
   * Output only. Time at which the most recent change has occurred on this
   * resource.
   * </pre>
   *
   * <code>optional string last_change_date_time = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for lastChangeDateTime.
   */
  com.google.protobuf.ByteString
      getLastChangeDateTimeBytes();

  /**
   * <pre>
   * Output only. Represents the type of the changed resource. This dictates
   * what fields will be set. For example, for AD_GROUP, campaign and ad_group
   * fields will be set.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ChangeStatusResourceTypeEnum.ChangeStatusResourceType resource_type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for resourceType.
   */
  int getResourceTypeValue();
  /**
   * <pre>
   * Output only. Represents the type of the changed resource. This dictates
   * what fields will be set. For example, for AD_GROUP, campaign and ad_group
   * fields will be set.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ChangeStatusResourceTypeEnum.ChangeStatusResourceType resource_type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The resourceType.
   */
  com.google.ads.googleads.v16.enums.ChangeStatusResourceTypeEnum.ChangeStatusResourceType getResourceType();

  /**
   * <pre>
   * Output only. The Campaign affected by this change.
   * </pre>
   *
   * <code>optional string campaign = 17 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Output only. The Campaign affected by this change.
   * </pre>
   *
   * <code>optional string campaign = 17 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Output only. The Campaign affected by this change.
   * </pre>
   *
   * <code>optional string campaign = 17 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Output only. The AdGroup affected by this change.
   * </pre>
   *
   * <code>optional string ad_group = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Output only. The AdGroup affected by this change.
   * </pre>
   *
   * <code>optional string ad_group = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * Output only. The AdGroup affected by this change.
   * </pre>
   *
   * <code>optional string ad_group = 18 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * Output only. Represents the status of the changed resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ChangeStatusOperationEnum.ChangeStatusOperation resource_status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for resourceStatus.
   */
  int getResourceStatusValue();
  /**
   * <pre>
   * Output only. Represents the status of the changed resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ChangeStatusOperationEnum.ChangeStatusOperation resource_status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The resourceStatus.
   */
  com.google.ads.googleads.v16.enums.ChangeStatusOperationEnum.ChangeStatusOperation getResourceStatus();

  /**
   * <pre>
   * Output only. The AdGroupAd affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_ad = 25 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupAd field is set.
   */
  boolean hasAdGroupAd();
  /**
   * <pre>
   * Output only. The AdGroupAd affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_ad = 25 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupAd.
   */
  java.lang.String getAdGroupAd();
  /**
   * <pre>
   * Output only. The AdGroupAd affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_ad = 25 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupAd.
   */
  com.google.protobuf.ByteString
      getAdGroupAdBytes();

  /**
   * <pre>
   * Output only. The AdGroupCriterion affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 26 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupCriterion field is set.
   */
  boolean hasAdGroupCriterion();
  /**
   * <pre>
   * Output only. The AdGroupCriterion affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 26 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupCriterion.
   */
  java.lang.String getAdGroupCriterion();
  /**
   * <pre>
   * Output only. The AdGroupCriterion affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 26 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupCriterion.
   */
  com.google.protobuf.ByteString
      getAdGroupCriterionBytes();

  /**
   * <pre>
   * Output only. The CampaignCriterion affected by this change.
   * </pre>
   *
   * <code>optional string campaign_criterion = 27 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaignCriterion field is set.
   */
  boolean hasCampaignCriterion();
  /**
   * <pre>
   * Output only. The CampaignCriterion affected by this change.
   * </pre>
   *
   * <code>optional string campaign_criterion = 27 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignCriterion.
   */
  java.lang.String getCampaignCriterion();
  /**
   * <pre>
   * Output only. The CampaignCriterion affected by this change.
   * </pre>
   *
   * <code>optional string campaign_criterion = 27 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaignCriterion.
   */
  com.google.protobuf.ByteString
      getCampaignCriterionBytes();

  /**
   * <pre>
   * Output only. The Feed affected by this change.
   * </pre>
   *
   * <code>optional string feed = 28 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the feed field is set.
   */
  boolean hasFeed();
  /**
   * <pre>
   * Output only. The Feed affected by this change.
   * </pre>
   *
   * <code>optional string feed = 28 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The feed.
   */
  java.lang.String getFeed();
  /**
   * <pre>
   * Output only. The Feed affected by this change.
   * </pre>
   *
   * <code>optional string feed = 28 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feed.
   */
  com.google.protobuf.ByteString
      getFeedBytes();

  /**
   * <pre>
   * Output only. The FeedItem affected by this change.
   * </pre>
   *
   * <code>optional string feed_item = 29 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the feedItem field is set.
   */
  boolean hasFeedItem();
  /**
   * <pre>
   * Output only. The FeedItem affected by this change.
   * </pre>
   *
   * <code>optional string feed_item = 29 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The feedItem.
   */
  java.lang.String getFeedItem();
  /**
   * <pre>
   * Output only. The FeedItem affected by this change.
   * </pre>
   *
   * <code>optional string feed_item = 29 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feedItem.
   */
  com.google.protobuf.ByteString
      getFeedItemBytes();

  /**
   * <pre>
   * Output only. The AdGroupFeed affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_feed = 30 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupFeed field is set.
   */
  boolean hasAdGroupFeed();
  /**
   * <pre>
   * Output only. The AdGroupFeed affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_feed = 30 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupFeed.
   */
  java.lang.String getAdGroupFeed();
  /**
   * <pre>
   * Output only. The AdGroupFeed affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_feed = 30 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupFeed.
   */
  com.google.protobuf.ByteString
      getAdGroupFeedBytes();

  /**
   * <pre>
   * Output only. The CampaignFeed affected by this change.
   * </pre>
   *
   * <code>optional string campaign_feed = 31 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaignFeed field is set.
   */
  boolean hasCampaignFeed();
  /**
   * <pre>
   * Output only. The CampaignFeed affected by this change.
   * </pre>
   *
   * <code>optional string campaign_feed = 31 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignFeed.
   */
  java.lang.String getCampaignFeed();
  /**
   * <pre>
   * Output only. The CampaignFeed affected by this change.
   * </pre>
   *
   * <code>optional string campaign_feed = 31 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaignFeed.
   */
  com.google.protobuf.ByteString
      getCampaignFeedBytes();

  /**
   * <pre>
   * Output only. The AdGroupBidModifier affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_bid_modifier = 32 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupBidModifier field is set.
   */
  boolean hasAdGroupBidModifier();
  /**
   * <pre>
   * Output only. The AdGroupBidModifier affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_bid_modifier = 32 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupBidModifier.
   */
  java.lang.String getAdGroupBidModifier();
  /**
   * <pre>
   * Output only. The AdGroupBidModifier affected by this change.
   * </pre>
   *
   * <code>optional string ad_group_bid_modifier = 32 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupBidModifier.
   */
  com.google.protobuf.ByteString
      getAdGroupBidModifierBytes();

  /**
   * <pre>
   * Output only. The SharedSet affected by this change.
   * </pre>
   *
   * <code>string shared_set = 33 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The sharedSet.
   */
  java.lang.String getSharedSet();
  /**
   * <pre>
   * Output only. The SharedSet affected by this change.
   * </pre>
   *
   * <code>string shared_set = 33 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for sharedSet.
   */
  com.google.protobuf.ByteString
      getSharedSetBytes();

  /**
   * <pre>
   * Output only. The CampaignSharedSet affected by this change.
   * </pre>
   *
   * <code>string campaign_shared_set = 34 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignSharedSet.
   */
  java.lang.String getCampaignSharedSet();
  /**
   * <pre>
   * Output only. The CampaignSharedSet affected by this change.
   * </pre>
   *
   * <code>string campaign_shared_set = 34 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaignSharedSet.
   */
  com.google.protobuf.ByteString
      getCampaignSharedSetBytes();

  /**
   * <pre>
   * Output only. The Asset affected by this change.
   * </pre>
   *
   * <code>string asset = 35 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * Output only. The Asset affected by this change.
   * </pre>
   *
   * <code>string asset = 35 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * Output only. The CustomerAsset affected by this change.
   * </pre>
   *
   * <code>string customer_asset = 36 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The customerAsset.
   */
  java.lang.String getCustomerAsset();
  /**
   * <pre>
   * Output only. The CustomerAsset affected by this change.
   * </pre>
   *
   * <code>string customer_asset = 36 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customerAsset.
   */
  com.google.protobuf.ByteString
      getCustomerAssetBytes();

  /**
   * <pre>
   * Output only. The CampaignAsset affected by this change.
   * </pre>
   *
   * <code>string campaign_asset = 37 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignAsset.
   */
  java.lang.String getCampaignAsset();
  /**
   * <pre>
   * Output only. The CampaignAsset affected by this change.
   * </pre>
   *
   * <code>string campaign_asset = 37 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaignAsset.
   */
  com.google.protobuf.ByteString
      getCampaignAssetBytes();

  /**
   * <pre>
   * Output only. The AdGroupAsset affected by this change.
   * </pre>
   *
   * <code>string ad_group_asset = 38 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupAsset.
   */
  java.lang.String getAdGroupAsset();
  /**
   * <pre>
   * Output only. The AdGroupAsset affected by this change.
   * </pre>
   *
   * <code>string ad_group_asset = 38 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupAsset.
   */
  com.google.protobuf.ByteString
      getAdGroupAssetBytes();

  /**
   * <pre>
   * Output only. The CombinedAudience affected by this change.
   * </pre>
   *
   * <code>string combined_audience = 40 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The combinedAudience.
   */
  java.lang.String getCombinedAudience();
  /**
   * <pre>
   * Output only. The CombinedAudience affected by this change.
   * </pre>
   *
   * <code>string combined_audience = 40 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for combinedAudience.
   */
  com.google.protobuf.ByteString
      getCombinedAudienceBytes();
}
