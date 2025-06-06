// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface AdGroupKeywordSuggestionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.AdGroupKeywordSuggestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The original keyword text.
   * </pre>
   *
   * <code>string keyword_text = 1;</code>
   * @return The keywordText.
   */
  java.lang.String getKeywordText();
  /**
   * <pre>
   * The original keyword text.
   * </pre>
   *
   * <code>string keyword_text = 1;</code>
   * @return The bytes for keywordText.
   */
  com.google.protobuf.ByteString
      getKeywordTextBytes();

  /**
   * <pre>
   * The normalized version of keyword_text for BROAD/EXACT/PHRASE suggestions.
   * </pre>
   *
   * <code>string suggested_keyword_text = 2;</code>
   * @return The suggestedKeywordText.
   */
  java.lang.String getSuggestedKeywordText();
  /**
   * <pre>
   * The normalized version of keyword_text for BROAD/EXACT/PHRASE suggestions.
   * </pre>
   *
   * <code>string suggested_keyword_text = 2;</code>
   * @return The bytes for suggestedKeywordText.
   */
  com.google.protobuf.ByteString
      getSuggestedKeywordTextBytes();

  /**
   * <pre>
   * The suggested keyword match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.KeywordMatchTypeEnum.KeywordMatchType suggested_match_type = 3;</code>
   * @return The enum numeric value on the wire for suggestedMatchType.
   */
  int getSuggestedMatchTypeValue();
  /**
   * <pre>
   * The suggested keyword match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.KeywordMatchTypeEnum.KeywordMatchType suggested_match_type = 3;</code>
   * @return The suggestedMatchType.
   */
  com.google.ads.googleads.v19.enums.KeywordMatchTypeEnum.KeywordMatchType getSuggestedMatchType();

  /**
   * <pre>
   * The suggested AdGroup for the keyword.
   * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string suggested_ad_group = 4;</code>
   * @return The suggestedAdGroup.
   */
  java.lang.String getSuggestedAdGroup();
  /**
   * <pre>
   * The suggested AdGroup for the keyword.
   * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string suggested_ad_group = 4;</code>
   * @return The bytes for suggestedAdGroup.
   */
  com.google.protobuf.ByteString
      getSuggestedAdGroupBytes();

  /**
   * <pre>
   * The suggested Campaign for the keyword.
   * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>string suggested_campaign = 5;</code>
   * @return The suggestedCampaign.
   */
  java.lang.String getSuggestedCampaign();
  /**
   * <pre>
   * The suggested Campaign for the keyword.
   * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>string suggested_campaign = 5;</code>
   * @return The bytes for suggestedCampaign.
   */
  com.google.protobuf.ByteString
      getSuggestedCampaignBytes();
}
