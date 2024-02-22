// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/customizer_attribute.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface CustomizerAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.CustomizerAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customizer attribute.
   * Customizer Attribute resource names have the form:
   *
   * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customizer attribute.
   * Customizer Attribute resource names have the form:
   *
   * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the customizer attribute.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Required. Immutable. Name of the customizer attribute. Required. It must
   * have a minimum length of 1 and maximum length of 40. Name of an enabled
   * customizer attribute must be unique (case insensitive).
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Immutable. Name of the customizer attribute. Required. It must
   * have a minimum length of 1 and maximum length of 40. Name of an enabled
   * customizer attribute must be unique (case insensitive).
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Immutable. The type of the customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Immutable. The type of the customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v16.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType getType();

  /**
   * <pre>
   * Output only. The status of the customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v16.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus getStatus();
}
