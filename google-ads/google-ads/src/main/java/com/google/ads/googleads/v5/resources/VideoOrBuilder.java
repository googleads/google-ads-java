// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/video.proto

package com.google.ads.googleads.v5.resources;

public interface VideoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.resources.Video)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the video.
   * Video resource names have the form:
   * `customers/{customer_id}/videos/{video_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the video.
   * Video resource names have the form:
   * `customers/{customer_id}/videos/{video_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.StringValue getId();
  /**
   * <pre>
   * Output only. The ID of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Output only. The owner channel id of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue channel_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the channelId field is set.
   */
  boolean hasChannelId();
  /**
   * <pre>
   * Output only. The owner channel id of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue channel_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The channelId.
   */
  com.google.protobuf.StringValue getChannelId();
  /**
   * <pre>
   * Output only. The owner channel id of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue channel_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getChannelIdOrBuilder();

  /**
   * <pre>
   * Output only. The duration of the video in milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value duration_millis = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the durationMillis field is set.
   */
  boolean hasDurationMillis();
  /**
   * <pre>
   * Output only. The duration of the video in milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value duration_millis = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The durationMillis.
   */
  com.google.protobuf.Int64Value getDurationMillis();
  /**
   * <pre>
   * Output only. The duration of the video in milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value duration_millis = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDurationMillisOrBuilder();

  /**
   * <pre>
   * Output only. The title of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue title = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   * Output only. The title of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue title = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The title.
   */
  com.google.protobuf.StringValue getTitle();
  /**
   * <pre>
   * Output only. The title of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue title = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getTitleOrBuilder();
}
