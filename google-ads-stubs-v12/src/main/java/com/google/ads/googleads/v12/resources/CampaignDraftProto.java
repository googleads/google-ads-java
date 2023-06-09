// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/campaign_draft.proto

package com.google.ads.googleads.v12.resources;

public final class CampaignDraftProto {
  private CampaignDraftProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_CampaignDraft_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_CampaignDraft_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v12/resources/cam" +
      "paign_draft.proto\022\"google.ads.googleads." +
      "v12.resources\032:google/ads/googleads/v12/" +
      "enums/campaign_draft_status.proto\032\037googl" +
      "e/api/field_behavior.proto\032\031google/api/r" +
      "esource.proto\"\265\005\n\rCampaignDraft\022F\n\rresou" +
      "rce_name\030\001 \001(\tB/\342A\001\005\372A(\n&googleads.googl" +
      "eapis.com/CampaignDraft\022\033\n\010draft_id\030\t \001(" +
      "\003B\004\342A\001\003H\000\210\001\001\022F\n\rbase_campaign\030\n \001(\tB*\342A\001" +
      "\005\372A#\n!googleads.googleapis.com/CampaignH" +
      "\001\210\001\001\022\021\n\004name\030\013 \001(\tH\002\210\001\001\022G\n\016draft_campaig" +
      "n\030\014 \001(\tB*\342A\001\003\372A#\n!googleads.googleapis.c" +
      "om/CampaignH\003\210\001\001\022a\n\006status\030\006 \001(\0162K.googl" +
      "e.ads.googleads.v12.enums.CampaignDraftS" +
      "tatusEnum.CampaignDraftStatusB\004\342A\001\003\022)\n\026h" +
      "as_experiment_running\030\r \001(\010B\004\342A\001\003H\004\210\001\001\022)" +
      "\n\026long_running_operation\030\016 \001(\tB\004\342A\001\003H\005\210\001" +
      "\001:q\352An\n&googleads.googleapis.com/Campaig" +
      "nDraft\022Dcustomers/{customer_id}/campaign" +
      "Drafts/{base_campaign_id}~{draft_id}B\013\n\t" +
      "_draft_idB\020\n\016_base_campaignB\007\n\005_nameB\021\n\017" +
      "_draft_campaignB\031\n\027_has_experiment_runni" +
      "ngB\031\n\027_long_running_operationB\204\002\n&com.go" +
      "ogle.ads.googleads.v12.resourcesB\022Campai" +
      "gnDraftProtoP\001ZKgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v12/resource" +
      "s;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds" +
      ".V12.Resources\312\002\"Google\\Ads\\GoogleAds\\V1" +
      "2\\Resources\352\002&Google::Ads::GoogleAds::V1" +
      "2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.CampaignDraftStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_CampaignDraft_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_CampaignDraft_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_CampaignDraft_descriptor,
        new java.lang.String[] { "ResourceName", "DraftId", "BaseCampaign", "Name", "DraftCampaign", "Status", "HasExperimentRunning", "LongRunningOperation", "DraftId", "BaseCampaign", "Name", "DraftCampaign", "HasExperimentRunning", "LongRunningOperation", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.enums.CampaignDraftStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
