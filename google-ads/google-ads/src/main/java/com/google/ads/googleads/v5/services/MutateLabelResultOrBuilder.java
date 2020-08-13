// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/label_service.proto

package com.google.ads.googleads.v5.services;

public interface MutateLabelResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.services.MutateLabelResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated label with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v5.resources.Label label = 2;</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * The mutated label with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v5.resources.Label label = 2;</code>
   * @return The label.
   */
  com.google.ads.googleads.v5.resources.Label getLabel();
  /**
   * <pre>
   * The mutated label with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v5.resources.Label label = 2;</code>
   */
  com.google.ads.googleads.v5.resources.LabelOrBuilder getLabelOrBuilder();
}
