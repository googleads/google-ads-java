// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/keyword_plan_common.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

public interface HistoricalMetricsOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.HistoricalMetricsOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The year month range for historical metrics. If not specified, metrics
   * for the past 12 months are returned.
   * Search metrics are available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available are returned.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.common.YearMonthRange year_month_range = 1;</code>
   * @return Whether the yearMonthRange field is set.
   */
  boolean hasYearMonthRange();
  /**
   * <pre>
   * The year month range for historical metrics. If not specified, metrics
   * for the past 12 months are returned.
   * Search metrics are available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available are returned.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.common.YearMonthRange year_month_range = 1;</code>
   * @return The yearMonthRange.
   */
  com.google.ads.googleads.v19.common.YearMonthRange getYearMonthRange();
  /**
   * <pre>
   * The year month range for historical metrics. If not specified, metrics
   * for the past 12 months are returned.
   * Search metrics are available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available are returned.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.common.YearMonthRange year_month_range = 1;</code>
   */
  com.google.ads.googleads.v19.common.YearMonthRangeOrBuilder getYearMonthRangeOrBuilder();

  /**
   * <pre>
   * Indicates whether to include average cost per click value.
   * Average CPC is provided only for legacy support.
   * </pre>
   *
   * <code>bool include_average_cpc = 2;</code>
   * @return The includeAverageCpc.
   */
  boolean getIncludeAverageCpc();
}
