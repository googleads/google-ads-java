// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/per_store_view.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface PerStoreViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.PerStoreView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the per store view.
   * Per Store view resource names have the form:
   *
   * `customers/{customer_id}/perStoreViews/{place_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the per store view.
   * Per Store view resource names have the form:
   *
   * `customers/{customer_id}/perStoreViews/{place_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The place ID of the per store view.
   * </pre>
   *
   * <code>string place_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The placeId.
   */
  java.lang.String getPlaceId();
  /**
   * <pre>
   * Output only. The place ID of the per store view.
   * </pre>
   *
   * <code>string place_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for placeId.
   */
  com.google.protobuf.ByteString
      getPlaceIdBytes();
}
