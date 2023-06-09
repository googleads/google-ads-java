// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/domain_category.proto

package com.google.ads.googleads.v12.resources;

public interface DomainCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.DomainCategory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the domain category.
   * Domain category resource names have the form:
   *
   * `customers/{customer_id}/domainCategories/{campaign_id}~{category_base64}~{language_code}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the domain category.
   * Domain category resource names have the form:
   *
   * `customers/{customer_id}/domainCategories/{campaign_id}~{category_base64}~{language_code}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The campaign this category is recommended for.
   * </pre>
   *
   * <code>optional string campaign = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Output only. The campaign this category is recommended for.
   * </pre>
   *
   * <code>optional string campaign = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Output only. The campaign this category is recommended for.
   * </pre>
   *
   * <code>optional string campaign = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Output only. Recommended category for the website domain, for example, if
   * you have a website about electronics, the categories could be "cameras",
   * "televisions", etc.
   * </pre>
   *
   * <code>optional string category = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <pre>
   * Output only. Recommended category for the website domain, for example, if
   * you have a website about electronics, the categories could be "cameras",
   * "televisions", etc.
   * </pre>
   *
   * <code>optional string category = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <pre>
   * Output only. Recommended category for the website domain, for example, if
   * you have a website about electronics, the categories could be "cameras",
   * "televisions", etc.
   * </pre>
   *
   * <code>optional string category = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <pre>
   * Output only. The language code specifying the language of the website, for
   * example, "en" for English. The language can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads. This is the
   * language of the pages from your website that you want Google Ads to find,
   * create ads for, and match searches with.
   * </pre>
   *
   * <code>optional string language_code = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * Output only. The language code specifying the language of the website, for
   * example, "en" for English. The language can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads. This is the
   * language of the pages from your website that you want Google Ads to find,
   * create ads for, and match searches with.
   * </pre>
   *
   * <code>optional string language_code = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Output only. The language code specifying the language of the website, for
   * example, "en" for English. The language can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads. This is the
   * language of the pages from your website that you want Google Ads to find,
   * create ads for, and match searches with.
   * </pre>
   *
   * <code>optional string language_code = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Output only. The domain for the website. The domain can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads.
   * </pre>
   *
   * <code>optional string domain = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the domain field is set.
   */
  boolean hasDomain();
  /**
   * <pre>
   * Output only. The domain for the website. The domain can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads.
   * </pre>
   *
   * <code>optional string domain = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * Output only. The domain for the website. The domain can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads.
   * </pre>
   *
   * <code>optional string domain = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * Output only. Fraction of pages on your site that this category matches.
   * </pre>
   *
   * <code>optional double coverage_fraction = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the coverageFraction field is set.
   */
  boolean hasCoverageFraction();
  /**
   * <pre>
   * Output only. Fraction of pages on your site that this category matches.
   * </pre>
   *
   * <code>optional double coverage_fraction = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The coverageFraction.
   */
  double getCoverageFraction();

  /**
   * <pre>
   * Output only. The position of this category in the set of categories. Lower
   * numbers indicate a better match for the domain. null indicates not
   * recommended.
   * </pre>
   *
   * <code>optional int64 category_rank = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the categoryRank field is set.
   */
  boolean hasCategoryRank();
  /**
   * <pre>
   * Output only. The position of this category in the set of categories. Lower
   * numbers indicate a better match for the domain. null indicates not
   * recommended.
   * </pre>
   *
   * <code>optional int64 category_rank = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The categoryRank.
   */
  long getCategoryRank();

  /**
   * <pre>
   * Output only. Indicates whether this category has sub-categories.
   * </pre>
   *
   * <code>optional bool has_children = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasChildren field is set.
   */
  boolean hasHasChildren();
  /**
   * <pre>
   * Output only. Indicates whether this category has sub-categories.
   * </pre>
   *
   * <code>optional bool has_children = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasChildren.
   */
  boolean getHasChildren();

  /**
   * <pre>
   * Output only. The recommended cost per click for the category.
   * </pre>
   *
   * <code>optional int64 recommended_cpc_bid_micros = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the recommendedCpcBidMicros field is set.
   */
  boolean hasRecommendedCpcBidMicros();
  /**
   * <pre>
   * Output only. The recommended cost per click for the category.
   * </pre>
   *
   * <code>optional int64 recommended_cpc_bid_micros = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The recommendedCpcBidMicros.
   */
  long getRecommendedCpcBidMicros();
}
