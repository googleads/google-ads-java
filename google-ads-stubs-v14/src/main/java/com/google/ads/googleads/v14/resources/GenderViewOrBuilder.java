// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/gender_view.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.resources;

public interface GenderViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.GenderView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the gender view.
   * Gender view resource names have the form:
   *
   * `customers/{customer_id}/genderViews/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the gender view.
   * Gender view resource names have the form:
   *
   * `customers/{customer_id}/genderViews/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();
}
