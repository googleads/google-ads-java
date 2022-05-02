// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v10.services;

public interface GenerateKeywordHistoricalMetricsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest)
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
   * The options for historical metrics data.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.HistoricalMetricsOptions historical_metrics_options = 3;</code>
   * @return Whether the historicalMetricsOptions field is set.
   */
  boolean hasHistoricalMetricsOptions();
  /**
   * <pre>
   * The options for historical metrics data.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.HistoricalMetricsOptions historical_metrics_options = 3;</code>
   * @return The historicalMetricsOptions.
   */
  com.google.ads.googleads.v10.common.HistoricalMetricsOptions getHistoricalMetricsOptions();
  /**
   * <pre>
   * The options for historical metrics data.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.HistoricalMetricsOptions historical_metrics_options = 3;</code>
   */
  com.google.ads.googleads.v10.common.HistoricalMetricsOptionsOrBuilder getHistoricalMetricsOptionsOrBuilder();
}
