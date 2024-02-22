// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface GenerateKeywordHistoricalMetricsResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.GenerateKeywordHistoricalMetricsResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The text of the query associated with one or more keywords.
   * Note that we de-dupe your keywords list, eliminating close variants
   * before returning the keywords as text. For example, if your request
   * originally contained the keywords "car" and "cars", the returned search
   * query will only contain "cars". The list of de-duped queries will be
   * included in close_variants field.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The text of the query associated with one or more keywords.
   * Note that we de-dupe your keywords list, eliminating close variants
   * before returning the keywords as text. For example, if your request
   * originally contained the keywords "car" and "cars", the returned search
   * query will only contain "cars". The list of de-duped queries will be
   * included in close_variants field.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The text of the query associated with one or more keywords.
   * Note that we de-dupe your keywords list, eliminating close variants
   * before returning the keywords as text. For example, if your request
   * originally contained the keywords "car" and "cars", the returned search
   * query will only contain "cars". The list of de-duped queries will be
   * included in close_variants field.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The list of close variants from the requested keywords whose stats
   * are combined into this GenerateKeywordHistoricalMetricsResult.
   * </pre>
   *
   * <code>repeated string close_variants = 3;</code>
   * @return A list containing the closeVariants.
   */
  java.util.List<java.lang.String>
      getCloseVariantsList();
  /**
   * <pre>
   * The list of close variants from the requested keywords whose stats
   * are combined into this GenerateKeywordHistoricalMetricsResult.
   * </pre>
   *
   * <code>repeated string close_variants = 3;</code>
   * @return The count of closeVariants.
   */
  int getCloseVariantsCount();
  /**
   * <pre>
   * The list of close variants from the requested keywords whose stats
   * are combined into this GenerateKeywordHistoricalMetricsResult.
   * </pre>
   *
   * <code>repeated string close_variants = 3;</code>
   * @param index The index of the element to return.
   * @return The closeVariants at the given index.
   */
  java.lang.String getCloseVariants(int index);
  /**
   * <pre>
   * The list of close variants from the requested keywords whose stats
   * are combined into this GenerateKeywordHistoricalMetricsResult.
   * </pre>
   *
   * <code>repeated string close_variants = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the closeVariants at the given index.
   */
  com.google.protobuf.ByteString
      getCloseVariantsBytes(int index);

  /**
   * <pre>
   * The historical metrics for text and its close variants
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.KeywordPlanHistoricalMetrics keyword_metrics = 2;</code>
   * @return Whether the keywordMetrics field is set.
   */
  boolean hasKeywordMetrics();
  /**
   * <pre>
   * The historical metrics for text and its close variants
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.KeywordPlanHistoricalMetrics keyword_metrics = 2;</code>
   * @return The keywordMetrics.
   */
  com.google.ads.googleads.v15.common.KeywordPlanHistoricalMetrics getKeywordMetrics();
  /**
   * <pre>
   * The historical metrics for text and its close variants
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.KeywordPlanHistoricalMetrics keyword_metrics = 2;</code>
   */
  com.google.ads.googleads.v15.common.KeywordPlanHistoricalMetricsOrBuilder getKeywordMetricsOrBuilder();
}
