// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/ad_group_ad_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface MutateAdGroupAdResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.MutateAdGroupAdResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated ad group ad with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AdGroupAd ad_group_ad = 2;</code>
   * @return Whether the adGroupAd field is set.
   */
  boolean hasAdGroupAd();
  /**
   * <pre>
   * The mutated ad group ad with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AdGroupAd ad_group_ad = 2;</code>
   * @return The adGroupAd.
   */
  com.google.ads.googleads.v14.resources.AdGroupAd getAdGroupAd();
  /**
   * <pre>
   * The mutated ad group ad with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AdGroupAd ad_group_ad = 2;</code>
   */
  com.google.ads.googleads.v14.resources.AdGroupAdOrBuilder getAdGroupAdOrBuilder();
}
