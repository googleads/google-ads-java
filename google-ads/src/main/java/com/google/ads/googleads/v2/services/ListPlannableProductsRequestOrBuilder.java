// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/reach_plan_service.proto

package com.google.ads.googleads.v2.services;

public interface ListPlannableProductsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.ListPlannableProductsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the selected location for planning. To list the available
   * plannable location ids use ListPlannableLocations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the plannableLocationId field is set.
   */
  boolean hasPlannableLocationId();
  /**
   * <pre>
   * Required. The ID of the selected location for planning. To list the available
   * plannable location ids use ListPlannableLocations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The plannableLocationId.
   */
  com.google.protobuf.StringValue getPlannableLocationId();
  /**
   * <pre>
   * Required. The ID of the selected location for planning. To list the available
   * plannable location ids use ListPlannableLocations.
   * </pre>
   *
   * <code>.google.protobuf.StringValue plannable_location_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.StringValueOrBuilder getPlannableLocationIdOrBuilder();
}
