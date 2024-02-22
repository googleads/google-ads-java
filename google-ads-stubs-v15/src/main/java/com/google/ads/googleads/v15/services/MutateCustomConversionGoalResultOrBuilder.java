// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/custom_conversion_goal_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface MutateCustomConversionGoalResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateCustomConversionGoalResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated CustomConversionGoal with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomConversionGoal custom_conversion_goal = 2;</code>
   * @return Whether the customConversionGoal field is set.
   */
  boolean hasCustomConversionGoal();
  /**
   * <pre>
   * The mutated CustomConversionGoal with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomConversionGoal custom_conversion_goal = 2;</code>
   * @return The customConversionGoal.
   */
  com.google.ads.googleads.v15.resources.CustomConversionGoal getCustomConversionGoal();
  /**
   * <pre>
   * The mutated CustomConversionGoal with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomConversionGoal custom_conversion_goal = 2;</code>
   */
  com.google.ads.googleads.v15.resources.CustomConversionGoalOrBuilder getCustomConversionGoalOrBuilder();
}
