// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/campaign_asset_set_service.proto

package com.google.ads.googleads.v12.services;

public interface CampaignAssetSetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.CampaignAssetSetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign asset
   * set.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CampaignAssetSet create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign asset
   * set.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CampaignAssetSet create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v12.resources.CampaignAssetSet getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign asset
   * set.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CampaignAssetSet create = 1;</code>
   */
  com.google.ads.googleads.v12.resources.CampaignAssetSetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign asset set is
   * expected, in this format:
   * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign asset set is
   * expected, in this format:
   * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign asset set is
   * expected, in this format:
   * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v12.services.CampaignAssetSetOperation.OperationCase getOperationCase();
}
