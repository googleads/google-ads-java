// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/ad_group_criterion_customizer_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface MutateAdGroupCriterionCustomizerResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.MutateAdGroupCriterionCustomizerResult)
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
   * The mutated AdGroupCriterionCustomizer with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AdGroupCriterionCustomizer ad_group_criterion_customizer = 2;</code>
   * @return Whether the adGroupCriterionCustomizer field is set.
   */
  boolean hasAdGroupCriterionCustomizer();
  /**
   * <pre>
   * The mutated AdGroupCriterionCustomizer with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AdGroupCriterionCustomizer ad_group_criterion_customizer = 2;</code>
   * @return The adGroupCriterionCustomizer.
   */
  com.google.ads.googleads.v19.resources.AdGroupCriterionCustomizer getAdGroupCriterionCustomizer();
  /**
   * <pre>
   * The mutated AdGroupCriterionCustomizer with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AdGroupCriterionCustomizer ad_group_criterion_customizer = 2;</code>
   */
  com.google.ads.googleads.v19.resources.AdGroupCriterionCustomizerOrBuilder getAdGroupCriterionCustomizerOrBuilder();
}
