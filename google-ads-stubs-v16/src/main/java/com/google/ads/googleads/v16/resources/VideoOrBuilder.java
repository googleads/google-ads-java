// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/video.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface VideoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.Video)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the video.
   * Video resource names have the form:
   *
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
   *
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
   * <code>optional string id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the video.
   * </pre>
   *
   * <code>optional string id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Output only. The ID of the video.
   * </pre>
   *
   * <code>optional string id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. The owner channel id of the video.
   * </pre>
   *
   * <code>optional string channel_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the channelId field is set.
   */
  boolean hasChannelId();
  /**
   * <pre>
   * Output only. The owner channel id of the video.
   * </pre>
   *
   * <code>optional string channel_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <pre>
   * Output only. The owner channel id of the video.
   * </pre>
   *
   * <code>optional string channel_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <pre>
   * Output only. The duration of the video in milliseconds.
   * </pre>
   *
   * <code>optional int64 duration_millis = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the durationMillis field is set.
   */
  boolean hasDurationMillis();
  /**
   * <pre>
   * Output only. The duration of the video in milliseconds.
   * </pre>
   *
   * <code>optional int64 duration_millis = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The durationMillis.
   */
  long getDurationMillis();

  /**
   * <pre>
   * Output only. The title of the video.
   * </pre>
   *
   * <code>optional string title = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   * Output only. The title of the video.
   * </pre>
   *
   * <code>optional string title = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Output only. The title of the video.
   * </pre>
   *
   * <code>optional string title = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();
}
