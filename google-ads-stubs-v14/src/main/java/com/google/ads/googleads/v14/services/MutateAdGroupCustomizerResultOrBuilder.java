// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/ad_group_customizer_service.proto

package com.google.ads.googleads.v14.services;

public interface MutateAdGroupCustomizerResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.MutateAdGroupCustomizerResult)
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
   * The mutated AdGroupCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AdGroupCustomizer ad_group_customizer = 2;</code>
   * @return Whether the adGroupCustomizer field is set.
   */
  boolean hasAdGroupCustomizer();
  /**
   * <pre>
   * The mutated AdGroupCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AdGroupCustomizer ad_group_customizer = 2;</code>
   * @return The adGroupCustomizer.
   */
  com.google.ads.googleads.v14.resources.AdGroupCustomizer getAdGroupCustomizer();
  /**
   * <pre>
   * The mutated AdGroupCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AdGroupCustomizer ad_group_customizer = 2;</code>
   */
  com.google.ads.googleads.v14.resources.AdGroupCustomizerOrBuilder getAdGroupCustomizerOrBuilder();
}
