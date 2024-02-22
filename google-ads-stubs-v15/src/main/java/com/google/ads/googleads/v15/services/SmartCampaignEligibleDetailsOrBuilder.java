// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/smart_campaign_setting_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface SmartCampaignEligibleDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.SmartCampaignEligibleDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The timestamp of the last impression observed in the last 48 hours for this
   * campaign.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string last_impression_date_time = 1;</code>
   * @return Whether the lastImpressionDateTime field is set.
   */
  boolean hasLastImpressionDateTime();
  /**
   * <pre>
   * The timestamp of the last impression observed in the last 48 hours for this
   * campaign.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string last_impression_date_time = 1;</code>
   * @return The lastImpressionDateTime.
   */
  java.lang.String getLastImpressionDateTime();
  /**
   * <pre>
   * The timestamp of the last impression observed in the last 48 hours for this
   * campaign.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string last_impression_date_time = 1;</code>
   * @return The bytes for lastImpressionDateTime.
   */
  com.google.protobuf.ByteString
      getLastImpressionDateTimeBytes();

  /**
   * <pre>
   * The timestamp of when the campaign will end, if applicable.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string end_date_time = 2;</code>
   * @return Whether the endDateTime field is set.
   */
  boolean hasEndDateTime();
  /**
   * <pre>
   * The timestamp of when the campaign will end, if applicable.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string end_date_time = 2;</code>
   * @return The endDateTime.
   */
  java.lang.String getEndDateTime();
  /**
   * <pre>
   * The timestamp of when the campaign will end, if applicable.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string end_date_time = 2;</code>
   * @return The bytes for endDateTime.
   */
  com.google.protobuf.ByteString
      getEndDateTimeBytes();
}
