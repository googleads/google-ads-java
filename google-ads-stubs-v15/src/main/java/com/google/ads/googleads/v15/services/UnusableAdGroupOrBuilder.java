// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface UnusableAdGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.UnusableAdGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The AdGroup resource name.
   * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string ad_group = 1;</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * The AdGroup resource name.
   * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string ad_group = 1;</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * The Campaign resource name.
   * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>string campaign = 2;</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * The Campaign resource name.
   * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>string campaign = 2;</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();
}
