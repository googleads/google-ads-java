// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/campaign_bid_modifier.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

public final class CampaignBidModifierProto {
  private CampaignBidModifierProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_CampaignBidModifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_CampaignBidModifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v15/resources/cam" +
      "paign_bid_modifier.proto\022\"google.ads.goo" +
      "gleads.v15.resources\032.google/ads/googlea" +
      "ds/v15/common/criteria.proto\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\"\360\003\n\023CampaignBidModifier\022K\n\rreso" +
      "urce_name\030\001 \001(\tB4\340A\005\372A.\n,googleads.googl" +
      "eapis.com/CampaignBidModifier\022@\n\010campaig" +
      "n\030\006 \001(\tB)\340A\003\372A#\n!googleads.googleapis.co" +
      "m/CampaignH\001\210\001\001\022\036\n\014criterion_id\030\007 \001(\003B\003\340" +
      "A\003H\002\210\001\001\022\031\n\014bid_modifier\030\010 \001(\001H\003\210\001\001\022U\n\020in" +
      "teraction_type\030\005 \001(\01324.google.ads.google" +
      "ads.v15.common.InteractionTypeInfoB\003\340A\005H" +
      "\000:|\352Ay\n,googleads.googleapis.com/Campaig" +
      "nBidModifier\022Icustomers/{customer_id}/ca" +
      "mpaignBidModifiers/{campaign_id}~{criter" +
      "ion_id}B\013\n\tcriterionB\013\n\t_campaignB\017\n\r_cr" +
      "iterion_idB\017\n\r_bid_modifierB\212\002\n&com.goog" +
      "le.ads.googleads.v15.resourcesB\030Campaign" +
      "BidModifierProtoP\001ZKgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v15/reso" +
      "urces;resources\242\002\003GAA\252\002\"Google.Ads.Googl" +
      "eAds.V15.Resources\312\002\"Google\\Ads\\GoogleAd" +
      "s\\V15\\Resources\352\002&Google::Ads::GoogleAds" +
      "::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.CriteriaProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_CampaignBidModifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_CampaignBidModifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_CampaignBidModifier_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "BidModifier", "InteractionType", "Criterion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.CriteriaProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
