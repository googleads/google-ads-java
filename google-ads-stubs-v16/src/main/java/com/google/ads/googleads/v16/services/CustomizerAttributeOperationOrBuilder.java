// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/customizer_attribute_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

public interface CustomizerAttributeOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.CustomizerAttributeOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new customizer
   * attribute
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CustomizerAttribute create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customizer
   * attribute
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CustomizerAttribute create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v16.resources.CustomizerAttribute getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customizer
   * attribute
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CustomizerAttribute create = 1;</code>
   */
  com.google.ads.googleads.v16.resources.CustomizerAttributeOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed customizer attribute is
   * expected, in this format:
   * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed customizer attribute is
   * expected, in this format:
   * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed customizer attribute is
   * expected, in this format:
   * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v16.services.CustomizerAttributeOperation.OperationCase getOperationCase();
}
