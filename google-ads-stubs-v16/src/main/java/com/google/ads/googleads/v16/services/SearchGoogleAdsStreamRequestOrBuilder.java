// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/google_ads_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

public interface SearchGoogleAdsStreamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.SearchGoogleAdsStreamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer being queried.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer being queried.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The query string.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Required. The query string.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Determines whether a summary row will be returned. By default, summary row
   * is not returned. If requested, the summary row will be sent in a response
   * by itself after all other query results are returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 3;</code>
   * @return The enum numeric value on the wire for summaryRowSetting.
   */
  int getSummaryRowSettingValue();
  /**
   * <pre>
   * Determines whether a summary row will be returned. By default, summary row
   * is not returned. If requested, the summary row will be sent in a response
   * by itself after all other query results are returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.SummaryRowSettingEnum.SummaryRowSetting summary_row_setting = 3;</code>
   * @return The summaryRowSetting.
   */
  com.google.ads.googleads.v16.enums.SummaryRowSettingEnum.SummaryRowSetting getSummaryRowSetting();
}
