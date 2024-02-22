// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface AudienceCompositionMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.AudienceCompositionMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fraction (from 0 to 1 inclusive) of the baseline audience that match
   * the attribute.
   * </pre>
   *
   * <code>double baseline_audience_share = 1;</code>
   * @return The baselineAudienceShare.
   */
  double getBaselineAudienceShare();

  /**
   * <pre>
   * The fraction (from 0 to 1 inclusive) of the specific audience that match
   * the attribute.
   * </pre>
   *
   * <code>double audience_share = 2;</code>
   * @return The audienceShare.
   */
  double getAudienceShare();

  /**
   * <pre>
   * The ratio of audience_share to baseline_audience_share, or zero if this
   * ratio is undefined or is not meaningful.
   * </pre>
   *
   * <code>double index = 3;</code>
   * @return The index.
   */
  double getIndex();

  /**
   * <pre>
   * A relevance score from 0 to 1 inclusive.
   * </pre>
   *
   * <code>double score = 4;</code>
   * @return The score.
   */
  double getScore();
}
