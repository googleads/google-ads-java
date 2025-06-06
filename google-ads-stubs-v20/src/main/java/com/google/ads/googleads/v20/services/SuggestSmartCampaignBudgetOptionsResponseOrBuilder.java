// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/smart_campaign_suggest_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public interface SuggestSmartCampaignBudgetOptionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The lowest budget option.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption low = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the low field is set.
   */
  boolean hasLow();
  /**
   * <pre>
   * Optional. The lowest budget option.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption low = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The low.
   */
  com.google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption getLow();
  /**
   * <pre>
   * Optional. The lowest budget option.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption low = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOptionOrBuilder getLowOrBuilder();

  /**
   * <pre>
   * Optional. The recommended budget option.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption recommended = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the recommended field is set.
   */
  boolean hasRecommended();
  /**
   * <pre>
   * Optional. The recommended budget option.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption recommended = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The recommended.
   */
  com.google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption getRecommended();
  /**
   * <pre>
   * Optional. The recommended budget option.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption recommended = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOptionOrBuilder getRecommendedOrBuilder();

  /**
   * <pre>
   * Optional. The highest budget option.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption high = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the high field is set.
   */
  boolean hasHigh();
  /**
   * <pre>
   * Optional. The highest budget option.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption high = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The high.
   */
  com.google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption getHigh();
  /**
   * <pre>
   * Optional. The highest budget option.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption high = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v20.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOptionOrBuilder getHighOrBuilder();
}
