// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v10.services;

public interface GenerateKeywordIdeaResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.GenerateKeywordIdeaResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Text of the keyword idea.
   * As in Keyword Plan historical metrics, this text may not be an actual
   * keyword, but the canonical form of multiple keywords.
   * See KeywordPlanKeywordHistoricalMetrics message in KeywordPlanService.
   * </pre>
   *
   * <code>optional string text = 5;</code>
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
   * <code>optional string text = 5;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Text of the keyword idea.
   * As in Keyword Plan historical metrics, this text may not be an actual
   * keyword, but the canonical form of multiple keywords.
   * See KeywordPlanKeywordHistoricalMetrics message in KeywordPlanService.
   * </pre>
   *
   * <code>optional string text = 5;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The historical metrics for the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.KeywordPlanHistoricalMetrics keyword_idea_metrics = 3;</code>
   * @return Whether the keywordIdeaMetrics field is set.
   */
  boolean hasKeywordIdeaMetrics();
  /**
   * <pre>
   * The historical metrics for the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.KeywordPlanHistoricalMetrics keyword_idea_metrics = 3;</code>
   * @return The keywordIdeaMetrics.
   */
  com.google.ads.googleads.v10.common.KeywordPlanHistoricalMetrics getKeywordIdeaMetrics();
  /**
   * <pre>
   * The historical metrics for the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.KeywordPlanHistoricalMetrics keyword_idea_metrics = 3;</code>
   */
  com.google.ads.googleads.v10.common.KeywordPlanHistoricalMetricsOrBuilder getKeywordIdeaMetricsOrBuilder();

  /**
   * <pre>
   * The annotations for the keyword.
   * The annotation data is only provided if requested.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.KeywordAnnotations keyword_annotations = 6;</code>
   * @return Whether the keywordAnnotations field is set.
   */
  boolean hasKeywordAnnotations();
  /**
   * <pre>
   * The annotations for the keyword.
   * The annotation data is only provided if requested.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.KeywordAnnotations keyword_annotations = 6;</code>
   * @return The keywordAnnotations.
   */
  com.google.ads.googleads.v10.common.KeywordAnnotations getKeywordAnnotations();
  /**
   * <pre>
   * The annotations for the keyword.
   * The annotation data is only provided if requested.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.KeywordAnnotations keyword_annotations = 6;</code>
   */
  com.google.ads.googleads.v10.common.KeywordAnnotationsOrBuilder getKeywordAnnotationsOrBuilder();

  /**
   * <pre>
   * The list of close variants from the requested keywords that
   * are combined into this GenerateKeywordIdeaResult. See
   * https://support.google.com/google-ads/answer/9342105 for the
   * definition of "close variants".
   * </pre>
   *
   * <code>repeated string close_variants = 7;</code>
   * @return A list containing the closeVariants.
   */
  java.util.List<java.lang.String>
      getCloseVariantsList();
  /**
   * <pre>
   * The list of close variants from the requested keywords that
   * are combined into this GenerateKeywordIdeaResult. See
   * https://support.google.com/google-ads/answer/9342105 for the
   * definition of "close variants".
   * </pre>
   *
   * <code>repeated string close_variants = 7;</code>
   * @return The count of closeVariants.
   */
  int getCloseVariantsCount();
  /**
   * <pre>
   * The list of close variants from the requested keywords that
   * are combined into this GenerateKeywordIdeaResult. See
   * https://support.google.com/google-ads/answer/9342105 for the
   * definition of "close variants".
   * </pre>
   *
   * <code>repeated string close_variants = 7;</code>
   * @param index The index of the element to return.
   * @return The closeVariants at the given index.
   */
  java.lang.String getCloseVariants(int index);
  /**
   * <pre>
   * The list of close variants from the requested keywords that
   * are combined into this GenerateKeywordIdeaResult. See
   * https://support.google.com/google-ads/answer/9342105 for the
   * definition of "close variants".
   * </pre>
   *
   * <code>repeated string close_variants = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the closeVariants at the given index.
   */
  com.google.protobuf.ByteString
      getCloseVariantsBytes(int index);
}
