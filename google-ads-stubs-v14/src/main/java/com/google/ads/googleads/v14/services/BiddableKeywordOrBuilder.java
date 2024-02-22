// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface BiddableKeywordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.BiddableKeyword)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Keyword. Must have text and match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.KeywordInfo keyword = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the keyword field is set.
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Required. Keyword. Must have text and match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.KeywordInfo keyword = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The keyword.
   */
  com.google.ads.googleads.v14.common.KeywordInfo getKeyword();
  /**
   * <pre>
   * Required. Keyword. Must have text and match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.KeywordInfo keyword = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v14.common.KeywordInfoOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * A max cpc bid in micros that overrides the ad group level max cpc bid in
   * forecast simulation. This value will override the max cpc value set in the
   * bidding strategy and ad group. Only specify this field for bidding
   * strategies that support max cpc values.
   * </pre>
   *
   * <code>optional int64 max_cpc_bid_micros = 2;</code>
   * @return Whether the maxCpcBidMicros field is set.
   */
  boolean hasMaxCpcBidMicros();
  /**
   * <pre>
   * A max cpc bid in micros that overrides the ad group level max cpc bid in
   * forecast simulation. This value will override the max cpc value set in the
   * bidding strategy and ad group. Only specify this field for bidding
   * strategies that support max cpc values.
   * </pre>
   *
   * <code>optional int64 max_cpc_bid_micros = 2;</code>
   * @return The maxCpcBidMicros.
   */
  long getMaxCpcBidMicros();
}
