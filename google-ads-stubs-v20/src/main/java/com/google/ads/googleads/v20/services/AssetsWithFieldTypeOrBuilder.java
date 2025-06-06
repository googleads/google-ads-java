// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/ad_group_ad_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public interface AssetsWithFieldTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.services.AssetsWithFieldType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the asset to be removed.
   * </pre>
   *
   * <code>string asset = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * Required. The resource name of the asset to be removed.
   * </pre>
   *
   * <code>string asset = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * Required. The asset field type.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for assetFieldType.
   */
  int getAssetFieldTypeValue();
  /**
   * <pre>
   * Required. The asset field type.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The assetFieldType.
   */
  com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType getAssetFieldType();
}
