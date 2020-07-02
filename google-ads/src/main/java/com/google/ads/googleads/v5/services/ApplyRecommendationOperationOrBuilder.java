// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/recommendation_service.proto

package com.google.ads.googleads.v5.services;

public interface ApplyRecommendationOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.services.ApplyRecommendationOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the recommendation to apply.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the recommendation to apply.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Optional parameters to use when applying a campaign budget
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.CampaignBudgetParameters campaign_budget = 2;</code>
   * @return Whether the campaignBudget field is set.
   */
  boolean hasCampaignBudget();
  /**
   * <pre>
   * Optional parameters to use when applying a campaign budget
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.CampaignBudgetParameters campaign_budget = 2;</code>
   * @return The campaignBudget.
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.CampaignBudgetParameters getCampaignBudget();
  /**
   * <pre>
   * Optional parameters to use when applying a campaign budget
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.CampaignBudgetParameters campaign_budget = 2;</code>
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.CampaignBudgetParametersOrBuilder getCampaignBudgetOrBuilder();

  /**
   * <pre>
   * Optional parameters to use when applying a text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.TextAdParameters text_ad = 3;</code>
   * @return Whether the textAd field is set.
   */
  boolean hasTextAd();
  /**
   * <pre>
   * Optional parameters to use when applying a text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.TextAdParameters text_ad = 3;</code>
   * @return The textAd.
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.TextAdParameters getTextAd();
  /**
   * <pre>
   * Optional parameters to use when applying a text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.TextAdParameters text_ad = 3;</code>
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.TextAdParametersOrBuilder getTextAdOrBuilder();

  /**
   * <pre>
   * Optional parameters to use when applying keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.KeywordParameters keyword = 4;</code>
   * @return Whether the keyword field is set.
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Optional parameters to use when applying keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.KeywordParameters keyword = 4;</code>
   * @return The keyword.
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.KeywordParameters getKeyword();
  /**
   * <pre>
   * Optional parameters to use when applying keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.KeywordParameters keyword = 4;</code>
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.KeywordParametersOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * Optional parameters to use when applying target CPA opt-in
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.TargetCpaOptInParameters target_cpa_opt_in = 5;</code>
   * @return Whether the targetCpaOptIn field is set.
   */
  boolean hasTargetCpaOptIn();
  /**
   * <pre>
   * Optional parameters to use when applying target CPA opt-in
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.TargetCpaOptInParameters target_cpa_opt_in = 5;</code>
   * @return The targetCpaOptIn.
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.TargetCpaOptInParameters getTargetCpaOptIn();
  /**
   * <pre>
   * Optional parameters to use when applying target CPA opt-in
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.TargetCpaOptInParameters target_cpa_opt_in = 5;</code>
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.TargetCpaOptInParametersOrBuilder getTargetCpaOptInOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.CalloutExtensionParameters callout_extension = 6;</code>
   * @return Whether the calloutExtension field is set.
   */
  boolean hasCalloutExtension();
  /**
   * <pre>
   * Parameters to use when applying callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.CalloutExtensionParameters callout_extension = 6;</code>
   * @return The calloutExtension.
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.CalloutExtensionParameters getCalloutExtension();
  /**
   * <pre>
   * Parameters to use when applying callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.CalloutExtensionParameters callout_extension = 6;</code>
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.CalloutExtensionParametersOrBuilder getCalloutExtensionOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.CallExtensionParameters call_extension = 7;</code>
   * @return Whether the callExtension field is set.
   */
  boolean hasCallExtension();
  /**
   * <pre>
   * Parameters to use when applying call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.CallExtensionParameters call_extension = 7;</code>
   * @return The callExtension.
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.CallExtensionParameters getCallExtension();
  /**
   * <pre>
   * Parameters to use when applying call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.CallExtensionParameters call_extension = 7;</code>
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.CallExtensionParametersOrBuilder getCallExtensionOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.SitelinkExtensionParameters sitelink_extension = 8;</code>
   * @return Whether the sitelinkExtension field is set.
   */
  boolean hasSitelinkExtension();
  /**
   * <pre>
   * Parameters to use when applying sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.SitelinkExtensionParameters sitelink_extension = 8;</code>
   * @return The sitelinkExtension.
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.SitelinkExtensionParameters getSitelinkExtension();
  /**
   * <pre>
   * Parameters to use when applying sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.SitelinkExtensionParameters sitelink_extension = 8;</code>
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.SitelinkExtensionParametersOrBuilder getSitelinkExtensionOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.MoveUnusedBudgetParameters move_unused_budget = 9;</code>
   * @return Whether the moveUnusedBudget field is set.
   */
  boolean hasMoveUnusedBudget();
  /**
   * <pre>
   * Parameters to use when applying move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.MoveUnusedBudgetParameters move_unused_budget = 9;</code>
   * @return The moveUnusedBudget.
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.MoveUnusedBudgetParameters getMoveUnusedBudget();
  /**
   * <pre>
   * Parameters to use when applying move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.ApplyRecommendationOperation.MoveUnusedBudgetParameters move_unused_budget = 9;</code>
   */
  com.google.ads.googleads.v5.services.ApplyRecommendationOperation.MoveUnusedBudgetParametersOrBuilder getMoveUnusedBudgetOrBuilder();

  public com.google.ads.googleads.v5.services.ApplyRecommendationOperation.ApplyParametersCase getApplyParametersCase();
}
