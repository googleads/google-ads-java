// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/campaign_group.proto

package com.google.ads.googleads.v10.resources;

public final class CampaignGroupProto {
  private CampaignGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_CampaignGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CampaignGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v10/resources/cam" +
      "paign_group.proto\022\"google.ads.googleads." +
      "v10.resources\032:google/ads/googleads/v10/" +
      "enums/campaign_group_status.proto\032\037googl" +
      "e/api/field_behavior.proto\032\031google/api/r" +
      "esource.proto\"\273\002\n\rCampaignGroup\022E\n\rresou" +
      "rce_name\030\001 \001(\tB.\340A\005\372A(\n&googleads.google" +
      "apis.com/CampaignGroup\022\017\n\002id\030\003 \001(\003B\003\340A\003\022" +
      "\014\n\004name\030\004 \001(\t\022[\n\006status\030\005 \001(\0162K.google.a" +
      "ds.googleads.v10.enums.CampaignGroupStat" +
      "usEnum.CampaignGroupStatus:g\352Ad\n&googlea" +
      "ds.googleapis.com/CampaignGroup\022:custome" +
      "rs/{customer_id}/campaignGroups/{campaig" +
      "n_group_id}B\204\002\n&com.google.ads.googleads" +
      ".v10.resourcesB\022CampaignGroupProtoP\001ZKgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v10/resources;resources\242\002\003GAA\252" +
      "\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"G" +
      "oogle\\Ads\\GoogleAds\\V10\\Resources\352\002&Goog" +
      "le::Ads::GoogleAds::V10::Resourcesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.CampaignGroupStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_CampaignGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_CampaignGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CampaignGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.CampaignGroupStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
