// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/conversion_value_rule_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface MutateConversionValueRuleResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.MutateConversionValueRuleResult)
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
   * The mutated conversion value rule with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ConversionValueRule conversion_value_rule = 2;</code>
   * @return Whether the conversionValueRule field is set.
   */
  boolean hasConversionValueRule();
  /**
   * <pre>
   * The mutated conversion value rule with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ConversionValueRule conversion_value_rule = 2;</code>
   * @return The conversionValueRule.
   */
  com.google.ads.googleads.v14.resources.ConversionValueRule getConversionValueRule();
  /**
   * <pre>
   * The mutated conversion value rule with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ConversionValueRule conversion_value_rule = 2;</code>
   */
  com.google.ads.googleads.v14.resources.ConversionValueRuleOrBuilder getConversionValueRuleOrBuilder();
}
