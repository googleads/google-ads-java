// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/asset_types.proto

package com.google.ads.googleads.v14.common;

public interface SitelinkAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.SitelinkAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. URL display text for the sitelink.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string link_text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The linkText.
   */
  java.lang.String getLinkText();
  /**
   * <pre>
   * Required. URL display text for the sitelink.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string link_text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for linkText.
   */
  com.google.protobuf.ByteString
      getLinkTextBytes();

  /**
   * <pre>
   * First line of the description for the sitelink.
   * If set, the length should be between 1 and 35, inclusive, and description2
   * must also be set.
   * </pre>
   *
   * <code>string description1 = 2;</code>
   * @return The description1.
   */
  java.lang.String getDescription1();
  /**
   * <pre>
   * First line of the description for the sitelink.
   * If set, the length should be between 1 and 35, inclusive, and description2
   * must also be set.
   * </pre>
   *
   * <code>string description1 = 2;</code>
   * @return The bytes for description1.
   */
  com.google.protobuf.ByteString
      getDescription1Bytes();

  /**
   * <pre>
   * Second line of the description for the sitelink.
   * If set, the length should be between 1 and 35, inclusive, and description1
   * must also be set.
   * </pre>
   *
   * <code>string description2 = 3;</code>
   * @return The description2.
   */
  java.lang.String getDescription2();
  /**
   * <pre>
   * Second line of the description for the sitelink.
   * If set, the length should be between 1 and 35, inclusive, and description1
   * must also be set.
   * </pre>
   *
   * <code>string description2 = 3;</code>
   * @return The bytes for description2.
   */
  com.google.protobuf.ByteString
      getDescription2Bytes();

  /**
   * <pre>
   * Start date of when this asset is effective and can begin serving, in
   * yyyy-MM-dd format.
   * </pre>
   *
   * <code>string start_date = 4;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * Start date of when this asset is effective and can begin serving, in
   * yyyy-MM-dd format.
   * </pre>
   *
   * <code>string start_date = 4;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * Last date of when this asset is effective and still serving, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string end_date = 5;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * Last date of when this asset is effective and still serving, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string end_date = 5;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();

  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdScheduleInfo ad_schedule_targets = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.AdScheduleInfo> 
      getAdScheduleTargetsList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdScheduleInfo ad_schedule_targets = 6;</code>
   */
  com.google.ads.googleads.v14.common.AdScheduleInfo getAdScheduleTargets(int index);
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdScheduleInfo ad_schedule_targets = 6;</code>
   */
  int getAdScheduleTargetsCount();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdScheduleInfo ad_schedule_targets = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.AdScheduleInfoOrBuilder> 
      getAdScheduleTargetsOrBuilderList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdScheduleInfo ad_schedule_targets = 6;</code>
   */
  com.google.ads.googleads.v14.common.AdScheduleInfoOrBuilder getAdScheduleTargetsOrBuilder(
      int index);
}
