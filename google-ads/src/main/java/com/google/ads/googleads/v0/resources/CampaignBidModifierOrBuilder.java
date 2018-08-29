// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/campaign_bid_modifier.proto

package com.google.ads.googleads.v0.resources;

public interface CampaignBidModifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.resources.CampaignBidModifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the campaign bid modifier.
   * Campaign bid modifier resource names have the form:
   * `customers/{customer_id}/campaignBidModifiers/{campaign_id}_{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the campaign bid modifier.
   * Campaign bid modifier resource names have the form:
   * `customers/{customer_id}/campaignBidModifiers/{campaign_id}_{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The campaign to which this criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 2;</code>
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The campaign to which this criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 2;</code>
   */
  com.google.protobuf.StringValue getCampaign();
  /**
   * <pre>
   * The campaign to which this criterion belongs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue campaign = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCampaignOrBuilder();

  /**
   * <pre>
   * The ID of the criterion to bid modify.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3;</code>
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * The ID of the criterion to bid modify.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3;</code>
   */
  com.google.protobuf.Int64Value getCriterionId();
  /**
   * <pre>
   * The ID of the criterion to bid modify.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCriterionIdOrBuilder();

  /**
   * <pre>
   * The modifier for the bid when the criterion matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 4;</code>
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The modifier for the bid when the criterion matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 4;</code>
   */
  com.google.protobuf.DoubleValue getBidModifier();
  /**
   * <pre>
   * The modifier for the bid when the criterion matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 4;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBidModifierOrBuilder();

  /**
   * <pre>
   * Criterion for interaction type. Only supported for search campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.InteractionTypeInfo interaction_type = 5;</code>
   */
  boolean hasInteractionType();
  /**
   * <pre>
   * Criterion for interaction type. Only supported for search campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.InteractionTypeInfo interaction_type = 5;</code>
   */
  com.google.ads.googleads.v0.common.InteractionTypeInfo getInteractionType();
  /**
   * <pre>
   * Criterion for interaction type. Only supported for search campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.InteractionTypeInfo interaction_type = 5;</code>
   */
  com.google.ads.googleads.v0.common.InteractionTypeInfoOrBuilder getInteractionTypeOrBuilder();

  public com.google.ads.googleads.v0.resources.CampaignBidModifier.CriterionCase getCriterionCase();
}
