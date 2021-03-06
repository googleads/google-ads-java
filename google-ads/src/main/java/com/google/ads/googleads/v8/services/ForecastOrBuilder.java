// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/services/reach_plan_service.proto

package com.google.ads.googleads.v8.services;

public interface ForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.services.Forecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times that exactly
   * matches the Targeting.
   * </pre>
   *
   * <code>int64 on_target_reach = 5;</code>
   * @return Whether the onTargetReach field is set.
   */
  boolean hasOnTargetReach();
  /**
   * <pre>
   * Number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times that exactly
   * matches the Targeting.
   * </pre>
   *
   * <code>int64 on_target_reach = 5;</code>
   * @return The onTargetReach.
   */
  long getOnTargetReach();

  /**
   * <pre>
   * Total number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times. This includes
   * people that may fall outside the specified Targeting.
   * </pre>
   *
   * <code>int64 total_reach = 6;</code>
   * @return Whether the totalReach field is set.
   */
  boolean hasTotalReach();
  /**
   * <pre>
   * Total number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency times. This includes
   * people that may fall outside the specified Targeting.
   * </pre>
   *
   * <code>int64 total_reach = 6;</code>
   * @return The totalReach.
   */
  long getTotalReach();

  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>int64 on_target_impressions = 7;</code>
   * @return Whether the onTargetImpressions field is set.
   */
  boolean hasOnTargetImpressions();
  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>int64 on_target_impressions = 7;</code>
   * @return The onTargetImpressions.
   */
  long getOnTargetImpressions();

  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>int64 total_impressions = 8;</code>
   * @return Whether the totalImpressions field is set.
   */
  boolean hasTotalImpressions();
  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>int64 total_impressions = 8;</code>
   * @return The totalImpressions.
   */
  long getTotalImpressions();

  /**
   * <pre>
   * Number of times the ad's impressions were considered viewable.
   * See https://support.google.com/google-ads/answer/7029393 for
   * more information about what makes an ad viewable and how
   * viewability is measured.
   * </pre>
   *
   * <code>int64 viewable_impressions = 9;</code>
   * @return Whether the viewableImpressions field is set.
   */
  boolean hasViewableImpressions();
  /**
   * <pre>
   * Number of times the ad's impressions were considered viewable.
   * See https://support.google.com/google-ads/answer/7029393 for
   * more information about what makes an ad viewable and how
   * viewability is measured.
   * </pre>
   *
   * <code>int64 viewable_impressions = 9;</code>
   * @return The viewableImpressions.
   */
  long getViewableImpressions();
}
