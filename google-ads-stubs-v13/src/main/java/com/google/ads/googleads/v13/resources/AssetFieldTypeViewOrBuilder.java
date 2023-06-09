// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/asset_field_type_view.proto

package com.google.ads.googleads.v13.resources;

public interface AssetFieldTypeViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.resources.AssetFieldTypeView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the asset field type view.
   * Asset field type view resource names have the form:
   *
   * `customers/{customer_id}/assetFieldTypeViews/{field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the asset field type view.
   * Asset field type view resource names have the form:
   *
   * `customers/{customer_id}/assetFieldTypeViews/{field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The asset field type of the asset field type view.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.AssetFieldTypeEnum.AssetFieldType field_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  int getFieldTypeValue();
  /**
   * <pre>
   * Output only. The asset field type of the asset field type view.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.AssetFieldTypeEnum.AssetFieldType field_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldType.
   */
  com.google.ads.googleads.v13.enums.AssetFieldTypeEnum.AssetFieldType getFieldType();
}
