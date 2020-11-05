// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad_schedule_view.proto

package com.google.ads.googleads.v3.resources;

public interface AdScheduleViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.AdScheduleView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the ad schedule view.
   * AdSchedule view resource names have the form:
   * `customers/{customer_id}/adScheduleViews/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the ad schedule view.
   * AdSchedule view resource names have the form:
   * `customers/{customer_id}/adScheduleViews/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();
}
