// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v9/resources/distance_view.proto

package com.google.ads.googleads.v9.resources;

public interface DistanceViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v9.resources.DistanceView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the distance view.
   * Distance view resource names have the form:
   * `customers/{customer_id}/distanceViews/1~{distance_bucket}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the distance view.
   * Distance view resource names have the form:
   * `customers/{customer_id}/distanceViews/1~{distance_bucket}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Grouping of user distance from location extensions.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.DistanceBucketEnum.DistanceBucket distance_bucket = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for distanceBucket.
   */
  int getDistanceBucketValue();
  /**
   * <pre>
   * Output only. Grouping of user distance from location extensions.
   * </pre>
   *
   * <code>.google.ads.googleads.v9.enums.DistanceBucketEnum.DistanceBucket distance_bucket = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The distanceBucket.
   */
  com.google.ads.googleads.v9.enums.DistanceBucketEnum.DistanceBucket getDistanceBucket();

  /**
   * <pre>
   * Output only. True if the DistanceBucket is using the metric system, false otherwise.
   * </pre>
   *
   * <code>optional bool metric_system = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the metricSystem field is set.
   */
  boolean hasMetricSystem();
  /**
   * <pre>
   * Output only. True if the DistanceBucket is using the metric system, false otherwise.
   * </pre>
   *
   * <code>optional bool metric_system = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The metricSystem.
   */
  boolean getMetricSystem();
}