// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/segments.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.common;

public interface BudgetCampaignAssociationStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.BudgetCampaignAssociationStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The campaign resource name.
   * </pre>
   *
   * <code>optional string campaign = 1;</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The campaign resource name.
   * </pre>
   *
   * <code>optional string campaign = 1;</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * The campaign resource name.
   * </pre>
   *
   * <code>optional string campaign = 1;</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Budget campaign association status.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Budget campaign association status.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus status = 2;</code>
   * @return The status.
   */
  com.google.ads.googleads.v15.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus getStatus();
}
