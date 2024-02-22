// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/asset_group_product_group_view.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

public interface AssetGroupProductGroupViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.AssetGroupProductGroupView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the asset group product group view.
   * Asset group product group view resource names have the form:
   *
   * `customers/{customer_id}/assetGroupProductGroupViews/{asset_group_id}~{listing_group_filter_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the asset group product group view.
   * Asset group product group view resource names have the form:
   *
   * `customers/{customer_id}/assetGroupProductGroupViews/{asset_group_id}~{listing_group_filter_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The asset group associated with the listing group filter.
   * </pre>
   *
   * <code>string asset_group = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The assetGroup.
   */
  java.lang.String getAssetGroup();
  /**
   * <pre>
   * Output only. The asset group associated with the listing group filter.
   * </pre>
   *
   * <code>string asset_group = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetGroup.
   */
  com.google.protobuf.ByteString
      getAssetGroupBytes();

  /**
   * <pre>
   * Output only. The resource name of the asset group listing group filter.
   * </pre>
   *
   * <code>string asset_group_listing_group_filter = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The assetGroupListingGroupFilter.
   */
  java.lang.String getAssetGroupListingGroupFilter();
  /**
   * <pre>
   * Output only. The resource name of the asset group listing group filter.
   * </pre>
   *
   * <code>string asset_group_listing_group_filter = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetGroupListingGroupFilter.
   */
  com.google.protobuf.ByteString
      getAssetGroupListingGroupFilterBytes();
}
