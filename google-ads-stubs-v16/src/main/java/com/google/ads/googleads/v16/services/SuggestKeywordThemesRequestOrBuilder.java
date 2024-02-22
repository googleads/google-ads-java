// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/smart_campaign_suggest_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

public interface SuggestKeywordThemesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.SuggestKeywordThemesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. Information to get keyword theme suggestions.
   * Required fields:
   *
   * * suggestion_info.final_url
   * * suggestion_info.language_code
   * * suggestion_info.geo_target
   *
   * Recommended fields:
   *
   * * suggestion_info.business_setting
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the suggestionInfo field is set.
   */
  boolean hasSuggestionInfo();
  /**
   * <pre>
   * Required. Information to get keyword theme suggestions.
   * Required fields:
   *
   * * suggestion_info.final_url
   * * suggestion_info.language_code
   * * suggestion_info.geo_target
   *
   * Recommended fields:
   *
   * * suggestion_info.business_setting
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The suggestionInfo.
   */
  com.google.ads.googleads.v16.services.SmartCampaignSuggestionInfo getSuggestionInfo();
  /**
   * <pre>
   * Required. Information to get keyword theme suggestions.
   * Required fields:
   *
   * * suggestion_info.final_url
   * * suggestion_info.language_code
   * * suggestion_info.geo_target
   *
   * Recommended fields:
   *
   * * suggestion_info.business_setting
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.SmartCampaignSuggestionInfo suggestion_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v16.services.SmartCampaignSuggestionInfoOrBuilder getSuggestionInfoOrBuilder();
}
