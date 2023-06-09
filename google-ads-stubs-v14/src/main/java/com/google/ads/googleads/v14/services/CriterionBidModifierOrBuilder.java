// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v14.services;

public interface CriterionBidModifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.CriterionBidModifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the geo location to target. The resource name is of
   * the format "geoTargetConstants/{criterion_id}".
   * </pre>
   *
   * <code>string geo_target_constant = 1;</code>
   * @return The geoTargetConstant.
   */
  java.lang.String getGeoTargetConstant();
  /**
   * <pre>
   * The resource name of the geo location to target. The resource name is of
   * the format "geoTargetConstants/{criterion_id}".
   * </pre>
   *
   * <code>string geo_target_constant = 1;</code>
   * @return The bytes for geoTargetConstant.
   */
  com.google.protobuf.ByteString
      getGeoTargetConstantBytes();

  /**
   * <pre>
   * The associated multiplier for the criterion_id. If set, this value cannot
   * be 0.
   * </pre>
   *
   * <code>optional double bid_modifier = 2;</code>
   * @return Whether the bidModifier field is set.
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The associated multiplier for the criterion_id. If set, this value cannot
   * be 0.
   * </pre>
   *
   * <code>optional double bid_modifier = 2;</code>
   * @return The bidModifier.
   */
  double getBidModifier();
}
