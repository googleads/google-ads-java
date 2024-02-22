// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/asset_set_type_view.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

public interface AssetSetTypeViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.AssetSetTypeView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the asset set type view.
   * Asset set type view resource names have the form:
   *
   * `customers/{customer_id}/assetSetTypeViews/{asset_set_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the asset set type view.
   * Asset set type view resource names have the form:
   *
   * `customers/{customer_id}/assetSetTypeViews/{asset_set_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The asset set type of the asset set type view.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetSetTypeEnum.AssetSetType asset_set_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for assetSetType.
   */
  int getAssetSetTypeValue();
  /**
   * <pre>
   * Output only. The asset set type of the asset set type view.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetSetTypeEnum.AssetSetType asset_set_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The assetSetType.
   */
  com.google.ads.googleads.v15.enums.AssetSetTypeEnum.AssetSetType getAssetSetType();
}
