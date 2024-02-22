// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/feed_placeholder_view.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface FeedPlaceholderViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.FeedPlaceholderView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the feed placeholder view.
   * Feed placeholder view resource names have the form:
   *
   * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the feed placeholder view.
   * Feed placeholder view resource names have the form:
   *
   * `customers/{customer_id}/feedPlaceholderViews/{placeholder_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The placeholder type of the feed placeholder view.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for placeholderType.
   */
  int getPlaceholderTypeValue();
  /**
   * <pre>
   * Output only. The placeholder type of the feed placeholder view.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The placeholderType.
   */
  com.google.ads.googleads.v16.enums.PlaceholderTypeEnum.PlaceholderType getPlaceholderType();
}
