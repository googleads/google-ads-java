// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/smart_campaign_setting_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface SmartCampaignNotEligibleDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.SmartCampaignNotEligibleDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The reason why the Smart campaign is not eligible to serve.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v14.enums.SmartCampaignNotEligibleReasonEnum.SmartCampaignNotEligibleReason not_eligible_reason = 1;</code>
   * @return Whether the notEligibleReason field is set.
   */
  boolean hasNotEligibleReason();
  /**
   * <pre>
   * The reason why the Smart campaign is not eligible to serve.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v14.enums.SmartCampaignNotEligibleReasonEnum.SmartCampaignNotEligibleReason not_eligible_reason = 1;</code>
   * @return The enum numeric value on the wire for notEligibleReason.
   */
  int getNotEligibleReasonValue();
  /**
   * <pre>
   * The reason why the Smart campaign is not eligible to serve.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v14.enums.SmartCampaignNotEligibleReasonEnum.SmartCampaignNotEligibleReason not_eligible_reason = 1;</code>
   * @return The notEligibleReason.
   */
  com.google.ads.googleads.v14.enums.SmartCampaignNotEligibleReasonEnum.SmartCampaignNotEligibleReason getNotEligibleReason();
}
