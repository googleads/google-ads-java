// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/customer.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.resources;

public interface OfflineConversionClientSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.OfflineConversionClientSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Client type of the upload event.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineEventUploadClientEnum.OfflineEventUploadClient client = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for client.
   */
  int getClientValue();
  /**
   * <pre>
   * Output only. Client type of the upload event.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineEventUploadClientEnum.OfflineEventUploadClient client = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The client.
   */
  com.google.ads.googleads.v14.enums.OfflineEventUploadClientEnum.OfflineEventUploadClient getClient();

  /**
   * <pre>
   * Output only. Overall status for offline conversion client summary. Status
   * is generated from most recent calendar day with upload stats.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineConversionDiagnosticStatusEnum.OfflineConversionDiagnosticStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Overall status for offline conversion client summary. Status
   * is generated from most recent calendar day with upload stats.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineConversionDiagnosticStatusEnum.OfflineConversionDiagnosticStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v14.enums.OfflineConversionDiagnosticStatusEnum.OfflineConversionDiagnosticStatus getStatus();

  /**
   * <pre>
   * Output only. Total count of uploaded events.
   * </pre>
   *
   * <code>int64 total_event_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The totalEventCount.
   */
  long getTotalEventCount();

  /**
   * <pre>
   * Output only. Total count of successful uploaded events.
   * </pre>
   *
   * <code>int64 successful_event_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The successfulEventCount.
   */
  long getSuccessfulEventCount();

  /**
   * <pre>
   * Output only. Successful rate.
   * </pre>
   *
   * <code>double success_rate = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The successRate.
   */
  double getSuccessRate();

  /**
   * <pre>
   * Output only. Date for the latest upload batch.
   * </pre>
   *
   * <code>string last_upload_date_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lastUploadDateTime.
   */
  java.lang.String getLastUploadDateTime();
  /**
   * <pre>
   * Output only. Date for the latest upload batch.
   * </pre>
   *
   * <code>string last_upload_date_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for lastUploadDateTime.
   */
  com.google.protobuf.ByteString
      getLastUploadDateTimeBytes();

  /**
   * <pre>
   * Output only. Summary of history stats by last N days.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary daily_summaries = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v14.resources.OfflineConversionUploadSummary> 
      getDailySummariesList();
  /**
   * <pre>
   * Output only. Summary of history stats by last N days.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary daily_summaries = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.OfflineConversionUploadSummary getDailySummaries(int index);
  /**
   * <pre>
   * Output only. Summary of history stats by last N days.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary daily_summaries = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getDailySummariesCount();
  /**
   * <pre>
   * Output only. Summary of history stats by last N days.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary daily_summaries = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.resources.OfflineConversionUploadSummaryOrBuilder> 
      getDailySummariesOrBuilderList();
  /**
   * <pre>
   * Output only. Summary of history stats by last N days.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary daily_summaries = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.OfflineConversionUploadSummaryOrBuilder getDailySummariesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Summary of history stats by last N jobs.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary job_summaries = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v14.resources.OfflineConversionUploadSummary> 
      getJobSummariesList();
  /**
   * <pre>
   * Output only. Summary of history stats by last N jobs.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary job_summaries = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.OfflineConversionUploadSummary getJobSummaries(int index);
  /**
   * <pre>
   * Output only. Summary of history stats by last N jobs.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary job_summaries = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getJobSummariesCount();
  /**
   * <pre>
   * Output only. Summary of history stats by last N jobs.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary job_summaries = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.resources.OfflineConversionUploadSummaryOrBuilder> 
      getJobSummariesOrBuilderList();
  /**
   * <pre>
   * Output only. Summary of history stats by last N jobs.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadSummary job_summaries = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.OfflineConversionUploadSummaryOrBuilder getJobSummariesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Details for each error code. Alerts are generated from most
   * recent calendar day with upload stats.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadAlert alerts = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v14.resources.OfflineConversionUploadAlert> 
      getAlertsList();
  /**
   * <pre>
   * Output only. Details for each error code. Alerts are generated from most
   * recent calendar day with upload stats.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadAlert alerts = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.OfflineConversionUploadAlert getAlerts(int index);
  /**
   * <pre>
   * Output only. Details for each error code. Alerts are generated from most
   * recent calendar day with upload stats.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadAlert alerts = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAlertsCount();
  /**
   * <pre>
   * Output only. Details for each error code. Alerts are generated from most
   * recent calendar day with upload stats.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadAlert alerts = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.resources.OfflineConversionUploadAlertOrBuilder> 
      getAlertsOrBuilderList();
  /**
   * <pre>
   * Output only. Details for each error code. Alerts are generated from most
   * recent calendar day with upload stats.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.OfflineConversionUploadAlert alerts = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.OfflineConversionUploadAlertOrBuilder getAlertsOrBuilder(
      int index);
}
