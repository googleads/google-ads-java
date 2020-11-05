// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/recommendation.proto

package com.google.ads.googleads.v3.resources;

public interface RecommendationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.Recommendation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the recommendation.
   * `customers/{customer_id}/recommendations/{recommendation_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the recommendation.
   * `customers/{customer_id}/recommendations/{recommendation_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The type of recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.RecommendationTypeEnum.RecommendationType type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.RecommendationTypeEnum.RecommendationType type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v3.enums.RecommendationTypeEnum.RecommendationType getType();

  /**
   * <pre>
   * Output only. The impact on account performance as a result of applying the
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.RecommendationImpact impact = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the impact field is set.
   */
  boolean hasImpact();
  /**
   * <pre>
   * Output only. The impact on account performance as a result of applying the
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.RecommendationImpact impact = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The impact.
   */
  com.google.ads.googleads.v3.resources.Recommendation.RecommendationImpact getImpact();
  /**
   * <pre>
   * Output only. The impact on account performance as a result of applying the
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.RecommendationImpact impact = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.RecommendationImpactOrBuilder getImpactOrBuilder();

  /**
   * <pre>
   * Output only. The budget targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign budget.
   * This field will be set for the following recommendation types:
   * CAMPAIGN_BUDGET, FORECASTING_CAMPAIGN_BUDGET, MOVE_UNUSED_BUDGET
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_budget = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaignBudget field is set.
   */
  boolean hasCampaignBudget();
  /**
   * <pre>
   * Output only. The budget targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign budget.
   * This field will be set for the following recommendation types:
   * CAMPAIGN_BUDGET, FORECASTING_CAMPAIGN_BUDGET, MOVE_UNUSED_BUDGET
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_budget = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignBudget.
   */
  com.google.protobuf.StringValue getCampaignBudget();
  /**
   * <pre>
   * Output only. The budget targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign budget.
   * This field will be set for the following recommendation types:
   * CAMPAIGN_BUDGET, FORECASTING_CAMPAIGN_BUDGET, MOVE_UNUSED_BUDGET
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign_budget = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignBudgetOrBuilder();

  /**
   * <pre>
   * Output only. The campaign targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign.
   * This field will be set for the following recommendation types:
   * CALL_EXTENSION, CALLOUT_EXTENSION, ENHANCED_CPC_OPT_IN, KEYWORD,
   * KEYWORD_MATCH_TYPE, MAXIMIZE_CLICKS_OPT_IN, MAXIMIZE_CONVERSIONS_OPT_IN,
   * OPTIMIZE_AD_ROTATION, SEARCH_PARTNERS_OPT_IN, SITELINK_EXTENSION,
   * TARGET_CPA_OPT_IN, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Output only. The campaign targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign.
   * This field will be set for the following recommendation types:
   * CALL_EXTENSION, CALLOUT_EXTENSION, ENHANCED_CPC_OPT_IN, KEYWORD,
   * KEYWORD_MATCH_TYPE, MAXIMIZE_CLICKS_OPT_IN, MAXIMIZE_CONVERSIONS_OPT_IN,
   * OPTIMIZE_AD_ROTATION, SEARCH_PARTNERS_OPT_IN, SITELINK_EXTENSION,
   * TARGET_CPA_OPT_IN, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * Output only. The campaign targeted by this recommendation. This will be set only when
   * the recommendation affects a single campaign.
   * This field will be set for the following recommendation types:
   * CALL_EXTENSION, CALLOUT_EXTENSION, ENHANCED_CPC_OPT_IN, KEYWORD,
   * KEYWORD_MATCH_TYPE, MAXIMIZE_CLICKS_OPT_IN, MAXIMIZE_CONVERSIONS_OPT_IN,
   * OPTIMIZE_AD_ROTATION, SEARCH_PARTNERS_OPT_IN, SITELINK_EXTENSION,
   * TARGET_CPA_OPT_IN, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * Output only. The ad group targeted by this recommendation. This will be set only when
   * the recommendation affects a single ad group.
   * This field will be set for the following recommendation types:
   * KEYWORD, OPTIMIZE_AD_ROTATION, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Output only. The ad group targeted by this recommendation. This will be set only when
   * the recommendation affects a single ad group.
   * This field will be set for the following recommendation types:
   * KEYWORD, OPTIMIZE_AD_ROTATION, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * Output only. The ad group targeted by this recommendation. This will be set only when
   * the recommendation affects a single ad group.
   * This field will be set for the following recommendation types:
   * KEYWORD, OPTIMIZE_AD_ROTATION, TEXT_AD
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * Output only. Whether the recommendation is dismissed or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue dismissed = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the dismissed field is set.
   */
  boolean hasDismissed();
  /**
   * <pre>
   * Output only. Whether the recommendation is dismissed or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue dismissed = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dismissed.
   */
  com.google.protobuf.BoolValue getDismissed();
  /**
   * <pre>
   * Output only. Whether the recommendation is dismissed or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue dismissed = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getDismissedOrBuilder();

  /**
   * <pre>
   * Output only. The campaign budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.CampaignBudgetRecommendation campaign_budget_recommendation = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the campaignBudgetRecommendation field is set.
   */
  boolean hasCampaignBudgetRecommendation();
  /**
   * <pre>
   * Output only. The campaign budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.CampaignBudgetRecommendation campaign_budget_recommendation = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The campaignBudgetRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.CampaignBudgetRecommendation getCampaignBudgetRecommendation();
  /**
   * <pre>
   * Output only. The campaign budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.CampaignBudgetRecommendation campaign_budget_recommendation = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.CampaignBudgetRecommendationOrBuilder getCampaignBudgetRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.KeywordRecommendation keyword_recommendation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the keywordRecommendation field is set.
   */
  boolean hasKeywordRecommendation();
  /**
   * <pre>
   * Output only. The keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.KeywordRecommendation keyword_recommendation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The keywordRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.KeywordRecommendation getKeywordRecommendation();
  /**
   * <pre>
   * Output only. The keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.KeywordRecommendation keyword_recommendation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.KeywordRecommendationOrBuilder getKeywordRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. Add expanded text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.TextAdRecommendation text_ad_recommendation = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the textAdRecommendation field is set.
   */
  boolean hasTextAdRecommendation();
  /**
   * <pre>
   * Output only. Add expanded text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.TextAdRecommendation text_ad_recommendation = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The textAdRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.TextAdRecommendation getTextAdRecommendation();
  /**
   * <pre>
   * Output only. Add expanded text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.TextAdRecommendation text_ad_recommendation = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.TextAdRecommendationOrBuilder getTextAdRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The TargetCPA opt-in recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.TargetCpaOptInRecommendation target_cpa_opt_in_recommendation = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetCpaOptInRecommendation field is set.
   */
  boolean hasTargetCpaOptInRecommendation();
  /**
   * <pre>
   * Output only. The TargetCPA opt-in recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.TargetCpaOptInRecommendation target_cpa_opt_in_recommendation = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetCpaOptInRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.TargetCpaOptInRecommendation getTargetCpaOptInRecommendation();
  /**
   * <pre>
   * Output only. The TargetCPA opt-in recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.TargetCpaOptInRecommendation target_cpa_opt_in_recommendation = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.TargetCpaOptInRecommendationOrBuilder getTargetCpaOptInRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The MaximizeConversions Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.MaximizeConversionsOptInRecommendation maximize_conversions_opt_in_recommendation = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the maximizeConversionsOptInRecommendation field is set.
   */
  boolean hasMaximizeConversionsOptInRecommendation();
  /**
   * <pre>
   * Output only. The MaximizeConversions Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.MaximizeConversionsOptInRecommendation maximize_conversions_opt_in_recommendation = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The maximizeConversionsOptInRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.MaximizeConversionsOptInRecommendation getMaximizeConversionsOptInRecommendation();
  /**
   * <pre>
   * Output only. The MaximizeConversions Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.MaximizeConversionsOptInRecommendation maximize_conversions_opt_in_recommendation = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.MaximizeConversionsOptInRecommendationOrBuilder getMaximizeConversionsOptInRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The Enhanced Cost-Per-Click Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.EnhancedCpcOptInRecommendation enhanced_cpc_opt_in_recommendation = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the enhancedCpcOptInRecommendation field is set.
   */
  boolean hasEnhancedCpcOptInRecommendation();
  /**
   * <pre>
   * Output only. The Enhanced Cost-Per-Click Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.EnhancedCpcOptInRecommendation enhanced_cpc_opt_in_recommendation = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enhancedCpcOptInRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.EnhancedCpcOptInRecommendation getEnhancedCpcOptInRecommendation();
  /**
   * <pre>
   * Output only. The Enhanced Cost-Per-Click Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.EnhancedCpcOptInRecommendation enhanced_cpc_opt_in_recommendation = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.EnhancedCpcOptInRecommendationOrBuilder getEnhancedCpcOptInRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The Search Partners Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.SearchPartnersOptInRecommendation search_partners_opt_in_recommendation = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the searchPartnersOptInRecommendation field is set.
   */
  boolean hasSearchPartnersOptInRecommendation();
  /**
   * <pre>
   * Output only. The Search Partners Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.SearchPartnersOptInRecommendation search_partners_opt_in_recommendation = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The searchPartnersOptInRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.SearchPartnersOptInRecommendation getSearchPartnersOptInRecommendation();
  /**
   * <pre>
   * Output only. The Search Partners Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.SearchPartnersOptInRecommendation search_partners_opt_in_recommendation = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.SearchPartnersOptInRecommendationOrBuilder getSearchPartnersOptInRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The MaximizeClicks Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.MaximizeClicksOptInRecommendation maximize_clicks_opt_in_recommendation = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the maximizeClicksOptInRecommendation field is set.
   */
  boolean hasMaximizeClicksOptInRecommendation();
  /**
   * <pre>
   * Output only. The MaximizeClicks Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.MaximizeClicksOptInRecommendation maximize_clicks_opt_in_recommendation = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The maximizeClicksOptInRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.MaximizeClicksOptInRecommendation getMaximizeClicksOptInRecommendation();
  /**
   * <pre>
   * Output only. The MaximizeClicks Opt-In recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.MaximizeClicksOptInRecommendation maximize_clicks_opt_in_recommendation = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.MaximizeClicksOptInRecommendationOrBuilder getMaximizeClicksOptInRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The Optimize Ad Rotation recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.OptimizeAdRotationRecommendation optimize_ad_rotation_recommendation = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the optimizeAdRotationRecommendation field is set.
   */
  boolean hasOptimizeAdRotationRecommendation();
  /**
   * <pre>
   * Output only. The Optimize Ad Rotation recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.OptimizeAdRotationRecommendation optimize_ad_rotation_recommendation = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The optimizeAdRotationRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.OptimizeAdRotationRecommendation getOptimizeAdRotationRecommendation();
  /**
   * <pre>
   * Output only. The Optimize Ad Rotation recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.OptimizeAdRotationRecommendation optimize_ad_rotation_recommendation = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.OptimizeAdRotationRecommendationOrBuilder getOptimizeAdRotationRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The Callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.CalloutExtensionRecommendation callout_extension_recommendation = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the calloutExtensionRecommendation field is set.
   */
  boolean hasCalloutExtensionRecommendation();
  /**
   * <pre>
   * Output only. The Callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.CalloutExtensionRecommendation callout_extension_recommendation = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The calloutExtensionRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.CalloutExtensionRecommendation getCalloutExtensionRecommendation();
  /**
   * <pre>
   * Output only. The Callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.CalloutExtensionRecommendation callout_extension_recommendation = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.CalloutExtensionRecommendationOrBuilder getCalloutExtensionRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The Sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.SitelinkExtensionRecommendation sitelink_extension_recommendation = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the sitelinkExtensionRecommendation field is set.
   */
  boolean hasSitelinkExtensionRecommendation();
  /**
   * <pre>
   * Output only. The Sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.SitelinkExtensionRecommendation sitelink_extension_recommendation = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The sitelinkExtensionRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.SitelinkExtensionRecommendation getSitelinkExtensionRecommendation();
  /**
   * <pre>
   * Output only. The Sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.SitelinkExtensionRecommendation sitelink_extension_recommendation = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.SitelinkExtensionRecommendationOrBuilder getSitelinkExtensionRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The Call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.CallExtensionRecommendation call_extension_recommendation = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the callExtensionRecommendation field is set.
   */
  boolean hasCallExtensionRecommendation();
  /**
   * <pre>
   * Output only. The Call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.CallExtensionRecommendation call_extension_recommendation = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The callExtensionRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.CallExtensionRecommendation getCallExtensionRecommendation();
  /**
   * <pre>
   * Output only. The Call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.CallExtensionRecommendation call_extension_recommendation = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.CallExtensionRecommendationOrBuilder getCallExtensionRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The keyword match type recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.KeywordMatchTypeRecommendation keyword_match_type_recommendation = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the keywordMatchTypeRecommendation field is set.
   */
  boolean hasKeywordMatchTypeRecommendation();
  /**
   * <pre>
   * Output only. The keyword match type recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.KeywordMatchTypeRecommendation keyword_match_type_recommendation = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The keywordMatchTypeRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.KeywordMatchTypeRecommendation getKeywordMatchTypeRecommendation();
  /**
   * <pre>
   * Output only. The keyword match type recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.KeywordMatchTypeRecommendation keyword_match_type_recommendation = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.KeywordMatchTypeRecommendationOrBuilder getKeywordMatchTypeRecommendationOrBuilder();

  /**
   * <pre>
   * Output only. The move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.MoveUnusedBudgetRecommendation move_unused_budget_recommendation = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the moveUnusedBudgetRecommendation field is set.
   */
  boolean hasMoveUnusedBudgetRecommendation();
  /**
   * <pre>
   * Output only. The move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.MoveUnusedBudgetRecommendation move_unused_budget_recommendation = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The moveUnusedBudgetRecommendation.
   */
  com.google.ads.googleads.v3.resources.Recommendation.MoveUnusedBudgetRecommendation getMoveUnusedBudgetRecommendation();
  /**
   * <pre>
   * Output only. The move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.Recommendation.MoveUnusedBudgetRecommendation move_unused_budget_recommendation = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v3.resources.Recommendation.MoveUnusedBudgetRecommendationOrBuilder getMoveUnusedBudgetRecommendationOrBuilder();

  public com.google.ads.googleads.v3.resources.Recommendation.RecommendationCase getRecommendationCase();
}
