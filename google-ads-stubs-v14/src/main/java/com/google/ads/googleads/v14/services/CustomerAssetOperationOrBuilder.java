// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/customer_asset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface CustomerAssetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.CustomerAssetOperation)
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
   * Create operation: No resource name is expected for the new customer
   * asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.CustomerAsset create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer
   * asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.CustomerAsset create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v14.resources.CustomerAsset getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new customer
   * asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.CustomerAsset create = 1;</code>
   */
  com.google.ads.googleads.v14.resources.CustomerAssetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The customer asset is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.CustomerAsset update = 3;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The customer asset is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.CustomerAsset update = 3;</code>
   * @return The update.
   */
  com.google.ads.googleads.v14.resources.CustomerAsset getUpdate();
  /**
   * <pre>
   * Update operation: The customer asset is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.CustomerAsset update = 3;</code>
   */
  com.google.ads.googleads.v14.resources.CustomerAssetOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed customer asset is
   * expected, in this format:
   *
   * `customers/{customer_id}/customerAssets/{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed customer asset is
   * expected, in this format:
   *
   * `customers/{customer_id}/customerAssets/{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed customer asset is
   * expected, in this format:
   *
   * `customers/{customer_id}/customerAssets/{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v14.services.CustomerAssetOperation.OperationCase getOperationCase();
}
