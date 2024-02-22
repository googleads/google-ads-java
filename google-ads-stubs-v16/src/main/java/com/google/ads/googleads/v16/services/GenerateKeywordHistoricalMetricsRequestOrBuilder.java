// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

public interface GenerateKeywordHistoricalMetricsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.GenerateKeywordHistoricalMetricsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer with the recommendation.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer with the recommendation.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * A list of keywords to get historical metrics.
   * Not all inputs will be returned as a result of near-exact deduplication.
   * For example, if stats for "car" and "cars" are requested, only "car" will
   * be returned.
   * A maximum of 10,000 keywords can be used.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @return A list containing the keywords.
   */
  java.util.List<java.lang.String>
      getKeywordsList();
  /**
   * <pre>
   * A list of keywords to get historical metrics.
   * Not all inputs will be returned as a result of near-exact deduplication.
   * For example, if stats for "car" and "cars" are requested, only "car" will
   * be returned.
   * A maximum of 10,000 keywords can be used.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @return The count of keywords.
   */
  int getKeywordsCount();
  /**
   * <pre>
   * A list of keywords to get historical metrics.
   * Not all inputs will be returned as a result of near-exact deduplication.
   * For example, if stats for "car" and "cars" are requested, only "car" will
   * be returned.
   * A maximum of 10,000 keywords can be used.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @param index The index of the element to return.
   * @return The keywords at the given index.
   */
  java.lang.String getKeywords(int index);
  /**
   * <pre>
   * A list of keywords to get historical metrics.
   * Not all inputs will be returned as a result of near-exact deduplication.
   * For example, if stats for "car" and "cars" are requested, only "car" will
   * be returned.
   * A maximum of 10,000 keywords can be used.
   * </pre>
   *
   * <code>repeated string keywords = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the keywords at the given index.
   */
  com.google.protobuf.ByteString
      getKeywordsBytes(int index);

  /**
   * <pre>
   * The resource name of the language to target.
   * Each keyword belongs to some set of languages; a keyword is included if
   * language is one of its languages.
   * If not set, all keywords will be included.
   * </pre>
   *
   * <code>optional string language = 4;</code>
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   * <pre>
   * The resource name of the language to target.
   * Each keyword belongs to some set of languages; a keyword is included if
   * language is one of its languages.
   * If not set, all keywords will be included.
   * </pre>
   *
   * <code>optional string language = 4;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * The resource name of the language to target.
   * Each keyword belongs to some set of languages; a keyword is included if
   * language is one of its languages.
   * If not set, all keywords will be included.
   * </pre>
   *
   * <code>optional string language = 4;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <pre>
   * If true, adult keywords will be included in response.
   * The default value is false.
   * </pre>
   *
   * <code>bool include_adult_keywords = 5;</code>
   * @return The includeAdultKeywords.
   */
  boolean getIncludeAdultKeywords();

  /**
   * <pre>
   * The resource names of the location to target. Maximum is 10.
   * An empty list MAY be used to specify all targeting geos.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 6;</code>
   * @return A list containing the geoTargetConstants.
   */
  java.util.List<java.lang.String>
      getGeoTargetConstantsList();
  /**
   * <pre>
   * The resource names of the location to target. Maximum is 10.
   * An empty list MAY be used to specify all targeting geos.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 6;</code>
   * @return The count of geoTargetConstants.
   */
  int getGeoTargetConstantsCount();
  /**
   * <pre>
   * The resource names of the location to target. Maximum is 10.
   * An empty list MAY be used to specify all targeting geos.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 6;</code>
   * @param index The index of the element to return.
   * @return The geoTargetConstants at the given index.
   */
  java.lang.String getGeoTargetConstants(int index);
  /**
   * <pre>
   * The resource names of the location to target. Maximum is 10.
   * An empty list MAY be used to specify all targeting geos.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the geoTargetConstants at the given index.
   */
  com.google.protobuf.ByteString
      getGeoTargetConstantsBytes(int index);

  /**
   * <pre>
   * Targeting network.
   * If not set, Google Search And Partners Network will be used.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 7;</code>
   * @return The enum numeric value on the wire for keywordPlanNetwork.
   */
  int getKeywordPlanNetworkValue();
  /**
   * <pre>
   * Targeting network.
   * If not set, Google Search And Partners Network will be used.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 7;</code>
   * @return The keywordPlanNetwork.
   */
  com.google.ads.googleads.v16.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork getKeywordPlanNetwork();

  /**
   * <pre>
   * The aggregate fields to include in response.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.KeywordPlanAggregateMetrics aggregate_metrics = 8;</code>
   * @return Whether the aggregateMetrics field is set.
   */
  boolean hasAggregateMetrics();
  /**
   * <pre>
   * The aggregate fields to include in response.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.KeywordPlanAggregateMetrics aggregate_metrics = 8;</code>
   * @return The aggregateMetrics.
   */
  com.google.ads.googleads.v16.common.KeywordPlanAggregateMetrics getAggregateMetrics();
  /**
   * <pre>
   * The aggregate fields to include in response.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.KeywordPlanAggregateMetrics aggregate_metrics = 8;</code>
   */
  com.google.ads.googleads.v16.common.KeywordPlanAggregateMetricsOrBuilder getAggregateMetricsOrBuilder();

  /**
   * <pre>
   * The options for historical metrics data.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.HistoricalMetricsOptions historical_metrics_options = 3;</code>
   * @return Whether the historicalMetricsOptions field is set.
   */
  boolean hasHistoricalMetricsOptions();
  /**
   * <pre>
   * The options for historical metrics data.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.HistoricalMetricsOptions historical_metrics_options = 3;</code>
   * @return The historicalMetricsOptions.
   */
  com.google.ads.googleads.v16.common.HistoricalMetricsOptions getHistoricalMetricsOptions();
  /**
   * <pre>
   * The options for historical metrics data.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.HistoricalMetricsOptions historical_metrics_options = 3;</code>
   */
  com.google.ads.googleads.v16.common.HistoricalMetricsOptionsOrBuilder getHistoricalMetricsOptionsOrBuilder();
}
