// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/resources/campaign_shared_set.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.resources;

public final class CampaignSharedSetProto {
  private CampaignSharedSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_resources_CampaignSharedSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_resources_CampaignSharedSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v20/resources/cam" +
      "paign_shared_set.proto\022\"google.ads.googl" +
      "eads.v20.resources\032?google/ads/googleads" +
      "/v20/enums/campaign_shared_set_status.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\"\346\003\n\021CampaignShar" +
      "edSet\022I\n\rresource_name\030\001 \001(\tB2\340A\005\372A,\n*go" +
      "ogleads.googleapis.com/CampaignSharedSet" +
      "\022@\n\010campaign\030\005 \001(\tB)\340A\005\372A#\n!googleads.go" +
      "ogleapis.com/CampaignH\000\210\001\001\022C\n\nshared_set" +
      "\030\006 \001(\tB*\340A\005\372A$\n\"googleads.googleapis.com" +
      "/SharedSetH\001\210\001\001\022h\n\006status\030\002 \001(\0162S.google" +
      ".ads.googleads.v20.enums.CampaignSharedS" +
      "etStatusEnum.CampaignSharedSetStatusB\003\340A" +
      "\003:y\352Av\n*googleads.googleapis.com/Campaig" +
      "nSharedSet\022Hcustomers/{customer_id}/camp" +
      "aignSharedSets/{campaign_id}~{shared_set" +
      "_id}B\013\n\t_campaignB\r\n\013_shared_setB\210\002\n&com" +
      ".google.ads.googleads.v20.resourcesB\026Cam" +
      "paignSharedSetProtoP\001ZKgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v20/r" +
      "esources;resources\242\002\003GAA\252\002\"Google.Ads.Go" +
      "ogleAds.V20.Resources\312\002\"Google\\Ads\\Googl" +
      "eAds\\V20\\Resources\352\002&Google::Ads::Google" +
      "Ads::V20::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v20.enums.CampaignSharedSetStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v20_resources_CampaignSharedSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v20_resources_CampaignSharedSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_resources_CampaignSharedSet_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "SharedSet", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v20.enums.CampaignSharedSetStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
