// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/domain_category.proto

package com.google.ads.googleads.v3.resources;

public interface DomainCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.DomainCategory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the domain category.
   * Domain category resource names have the form:
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
   * <code>.google.protobuf.StringValue campaign = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Output only. The campaign this category is recommended for.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * Output only. The campaign this category is recommended for.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * Output only. Recommended category for the website domain. e.g. if you have a website
   * about electronics, the categories could be "cameras", "televisions", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue category = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <pre>
   * Output only. Recommended category for the website domain. e.g. if you have a website
   * about electronics, the categories could be "cameras", "televisions", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue category = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The category.
   */
  com.google.protobuf.StringValue getCategory();
  /**
   * <pre>
   * Output only. Recommended category for the website domain. e.g. if you have a website
   * about electronics, the categories could be "cameras", "televisions", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue category = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getCategoryOrBuilder();

  /**
   * <pre>
   * Output only. The language code specifying the language of the website. e.g. "en" for
   * English. The language can be specified in the DynamicSearchAdsSetting
   * required for dynamic search ads. This is the language of the pages from
   * your website that you want Google Ads to find, create ads for,
   * and match searches with.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * Output only. The language code specifying the language of the website. e.g. "en" for
   * English. The language can be specified in the DynamicSearchAdsSetting
   * required for dynamic search ads. This is the language of the pages from
   * your website that you want Google Ads to find, create ads for,
   * and match searches with.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The languageCode.
   */
  com.google.protobuf.StringValue getLanguageCode();
  /**
   * <pre>
   * Output only. The language code specifying the language of the website. e.g. "en" for
   * English. The language can be specified in the DynamicSearchAdsSetting
   * required for dynamic search ads. This is the language of the pages from
   * your website that you want Google Ads to find, create ads for,
   * and match searches with.
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getLanguageCodeOrBuilder();

  /**
   * <pre>
   * Output only. The domain for the website. The domain can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads.
   * </pre>
   *
   * <code>.google.protobuf.StringValue domain = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the domain field is set.
   */
  boolean hasDomain();
  /**
   * <pre>
   * Output only. The domain for the website. The domain can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads.
   * </pre>
   *
   * <code>.google.protobuf.StringValue domain = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The domain.
   */
  com.google.protobuf.StringValue getDomain();
  /**
   * <pre>
   * Output only. The domain for the website. The domain can be specified in the
   * DynamicSearchAdsSetting required for dynamic search ads.
   * </pre>
   *
   * <code>.google.protobuf.StringValue domain = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getDomainOrBuilder();

  /**
   * <pre>
   * Output only. Fraction of pages on your site that this category matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue coverage_fraction = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the coverageFraction field is set.
   */
  boolean hasCoverageFraction();
  /**
   * <pre>
   * Output only. Fraction of pages on your site that this category matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue coverage_fraction = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The coverageFraction.
   */
  com.google.protobuf.DoubleValue getCoverageFraction();
  /**
   * <pre>
   * Output only. Fraction of pages on your site that this category matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue coverage_fraction = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getCoverageFractionOrBuilder();

  /**
   * <pre>
   * Output only. The position of this category in the set of categories. Lower numbers
   * indicate a better match for the domain. null indicates not recommended.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value category_rank = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the categoryRank field is set.
   */
  boolean hasCategoryRank();
  /**
   * <pre>
   * Output only. The position of this category in the set of categories. Lower numbers
   * indicate a better match for the domain. null indicates not recommended.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value category_rank = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The categoryRank.
   */
  com.google.protobuf.Int64Value getCategoryRank();
  /**
   * <pre>
   * Output only. The position of this category in the set of categories. Lower numbers
   * indicate a better match for the domain. null indicates not recommended.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value category_rank = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCategoryRankOrBuilder();

  /**
   * <pre>
   * Output only. Indicates whether this category has sub-categories.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_children = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasChildren field is set.
   */
  boolean hasHasChildren();
  /**
   * <pre>
   * Output only. Indicates whether this category has sub-categories.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_children = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasChildren.
   */
  com.google.protobuf.BoolValue getHasChildren();
  /**
   * <pre>
   * Output only. Indicates whether this category has sub-categories.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue has_children = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHasChildrenOrBuilder();

  /**
   * <pre>
   * Output only. The recommended cost per click for the category.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_cpc_bid_micros = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the recommendedCpcBidMicros field is set.
   */
  boolean hasRecommendedCpcBidMicros();
  /**
   * <pre>
   * Output only. The recommended cost per click for the category.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_cpc_bid_micros = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The recommendedCpcBidMicros.
   */
  com.google.protobuf.Int64Value getRecommendedCpcBidMicros();
  /**
   * <pre>
   * Output only. The recommended cost per click for the category.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value recommended_cpc_bid_micros = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecommendedCpcBidMicrosOrBuilder();
}
