// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/asset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface AssetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.AssetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Asset create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Asset create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v15.resources.Asset getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Asset create = 1;</code>
   */
  com.google.ads.googleads.v15.resources.AssetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The asset is expected to have a valid resource name in
   * this format:
   *
   * `customers/{customer_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Asset update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The asset is expected to have a valid resource name in
   * this format:
   *
   * `customers/{customer_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Asset update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v15.resources.Asset getUpdate();
  /**
   * <pre>
   * Update operation: The asset is expected to have a valid resource name in
   * this format:
   *
   * `customers/{customer_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Asset update = 2;</code>
   */
  com.google.ads.googleads.v15.resources.AssetOrBuilder getUpdateOrBuilder();

  com.google.ads.googleads.v15.services.AssetOperation.OperationCase getOperationCase();
}
