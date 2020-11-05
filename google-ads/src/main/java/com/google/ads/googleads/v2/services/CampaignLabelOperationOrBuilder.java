// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_label_service.proto

package com.google.ads.googleads.v2.services;

public interface CampaignLabelOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.CampaignLabelOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign-label
   * relationship.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignLabel create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign-label
   * relationship.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignLabel create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v2.resources.CampaignLabel getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new campaign-label
   * relationship.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.CampaignLabel create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.CampaignLabelOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the campaign-label relationship
   * being removed, in this format:
   * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the campaign-label relationship
   * being removed, in this format:
   * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
   * </pre>
   *
   * <code>string remove = 2;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v2.services.CampaignLabelOperation.OperationCase getOperationCase();
}
