// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/asset_service.proto

package com.google.ads.googleads.v2.services;

public interface AssetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.AssetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Asset create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Asset create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v2.resources.Asset getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.Asset create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.AssetOrBuilder getCreateOrBuilder();

  public com.google.ads.googleads.v2.services.AssetOperation.OperationCase getOperationCase();
}
