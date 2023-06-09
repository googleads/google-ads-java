// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/smart_campaign_setting_service.proto

package com.google.ads.googleads.v14.services;

public interface SmartCampaignPausedDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.SmartCampaignPausedDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The timestamp of when the campaign was last paused.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string paused_date_time = 1;</code>
   * @return Whether the pausedDateTime field is set.
   */
  boolean hasPausedDateTime();
  /**
   * <pre>
   * The timestamp of when the campaign was last paused.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string paused_date_time = 1;</code>
   * @return The pausedDateTime.
   */
  java.lang.String getPausedDateTime();
  /**
   * <pre>
   * The timestamp of when the campaign was last paused.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string paused_date_time = 1;</code>
   * @return The bytes for pausedDateTime.
   */
  com.google.protobuf.ByteString
      getPausedDateTimeBytes();
}
