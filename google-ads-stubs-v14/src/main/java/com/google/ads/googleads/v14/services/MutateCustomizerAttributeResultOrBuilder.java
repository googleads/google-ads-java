// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/customizer_attribute_service.proto

package com.google.ads.googleads.v14.services;

public interface MutateCustomizerAttributeResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.MutateCustomizerAttributeResult)
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
   * The mutated CustomizerAttribute with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.CustomizerAttribute customizer_attribute = 2;</code>
   * @return Whether the customizerAttribute field is set.
   */
  boolean hasCustomizerAttribute();
  /**
   * <pre>
   * The mutated CustomizerAttribute with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.CustomizerAttribute customizer_attribute = 2;</code>
   * @return The customizerAttribute.
   */
  com.google.ads.googleads.v14.resources.CustomizerAttribute getCustomizerAttribute();
  /**
   * <pre>
   * The mutated CustomizerAttribute with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.CustomizerAttribute customizer_attribute = 2;</code>
   */
  com.google.ads.googleads.v14.resources.CustomizerAttributeOrBuilder getCustomizerAttributeOrBuilder();
}
