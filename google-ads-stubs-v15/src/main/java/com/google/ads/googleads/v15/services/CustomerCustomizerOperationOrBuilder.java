// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/customer_customizer_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface CustomerCustomizerOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.CustomerCustomizerOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer
   * customizer
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerCustomizer create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer
   * customizer
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerCustomizer create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v15.resources.CustomerCustomizer getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer
   * customizer
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerCustomizer create = 1;</code>
   */
  com.google.ads.googleads.v15.resources.CustomerCustomizerOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed customer customizer is
   * expected, in this format:
   * `customers/{customer_id}/customerCustomizers/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed customer customizer is
   * expected, in this format:
   * `customers/{customer_id}/customerCustomizers/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed customer customizer is
   * expected, in this format:
   * `customers/{customer_id}/customerCustomizers/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v15.services.CustomerCustomizerOperation.OperationCase getOperationCase();
}
