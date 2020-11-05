// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v3.services;

public interface GenerateKeywordIdeaResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.GenerateKeywordIdeaResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Text of the keyword idea.
   * As in Keyword Plan historical metrics, this text may not be an actual
   * keyword, but the canonical form of multiple keywords.
   * See KeywordPlanKeywordHistoricalMetrics message in KeywordPlanService.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 2;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Text of the keyword idea.
   * As in Keyword Plan historical metrics, this text may not be an actual
   * keyword, but the canonical form of multiple keywords.
   * See KeywordPlanKeywordHistoricalMetrics message in KeywordPlanService.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 2;</code>
   * @return The text.
   */
  com.google.protobuf.StringValue getText();
  /**
   * <pre>
   * Text of the keyword idea.
   * As in Keyword Plan historical metrics, this text may not be an actual
   * keyword, but the canonical form of multiple keywords.
   * See KeywordPlanKeywordHistoricalMetrics message in KeywordPlanService.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * The historical metrics for the keyword
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics keyword_idea_metrics = 3;</code>
   * @return Whether the keywordIdeaMetrics field is set.
   */
  boolean hasKeywordIdeaMetrics();
  /**
   * <pre>
   * The historical metrics for the keyword
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics keyword_idea_metrics = 3;</code>
   * @return The keywordIdeaMetrics.
   */
  com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics getKeywordIdeaMetrics();
  /**
   * <pre>
   * The historical metrics for the keyword
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.KeywordPlanHistoricalMetrics keyword_idea_metrics = 3;</code>
   */
  com.google.ads.googleads.v3.common.KeywordPlanHistoricalMetricsOrBuilder getKeywordIdeaMetricsOrBuilder();
}
