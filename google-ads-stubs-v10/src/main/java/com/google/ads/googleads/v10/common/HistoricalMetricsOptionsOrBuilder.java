// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/keyword_plan_common.proto

package com.google.ads.googleads.v10.common;

public interface HistoricalMetricsOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.common.HistoricalMetricsOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The year month range for historical metrics. If not specified the searches
   * will be returned for past 12 months.
   * Searches data is available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available will be returned.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v10.common.YearMonthRange year_month_range = 1;</code>
   * @return Whether the yearMonthRange field is set.
   */
  boolean hasYearMonthRange();
  /**
   * <pre>
   * The year month range for historical metrics. If not specified the searches
   * will be returned for past 12 months.
   * Searches data is available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available will be returned.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v10.common.YearMonthRange year_month_range = 1;</code>
   * @return The yearMonthRange.
   */
  com.google.ads.googleads.v10.common.YearMonthRange getYearMonthRange();
  /**
   * <pre>
   * The year month range for historical metrics. If not specified the searches
   * will be returned for past 12 months.
   * Searches data is available for the past 4 years. If the search volume is
   * not available for the entire year_month_range provided, the subset of the
   * year month range for which search volume is available will be returned.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v10.common.YearMonthRange year_month_range = 1;</code>
   */
  com.google.ads.googleads.v10.common.YearMonthRangeOrBuilder getYearMonthRangeOrBuilder();

  /**
   * <pre>
   * Indicates whether to include average cost per click value.
   * Average CPC is a legacy value that will be removed and replaced in the
   * future, and as such we are including it as an optioanl value so clients
   * only use it when strictly necessary and to better track clients that use
   * this value.
   * </pre>
   *
   * <code>bool include_average_cpc = 2;</code>
   * @return The includeAverageCpc.
   */
  boolean getIncludeAverageCpc();
}
