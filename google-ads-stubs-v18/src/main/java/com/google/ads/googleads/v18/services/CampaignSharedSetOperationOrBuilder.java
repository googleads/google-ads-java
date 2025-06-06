// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/campaign_shared_set_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface CampaignSharedSetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.CampaignSharedSetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign
   * shared set.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CampaignSharedSet create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign
   * shared set.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CampaignSharedSet create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v18.resources.CampaignSharedSet getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign
   * shared set.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CampaignSharedSet create = 1;</code>
   */
  com.google.ads.googleads.v18.resources.CampaignSharedSetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign shared set is
   * expected, in this format:
   *
   * `customers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign shared set is
   * expected, in this format:
   *
   * `customers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed campaign shared set is
   * expected, in this format:
   *
   * `customers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v18.services.CampaignSharedSetOperation.OperationCase getOperationCase();
}
