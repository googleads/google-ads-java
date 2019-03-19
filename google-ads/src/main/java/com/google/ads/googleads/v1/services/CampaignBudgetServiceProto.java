// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/campaign_budget_service.proto

package com.google.ads.googleads.v1.services;

public final class CampaignBudgetServiceProto {
  private CampaignBudgetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetCampaignBudgetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetCampaignBudgetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_CampaignBudgetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_CampaignBudgetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v1/services/campa" +
      "ign_budget_service.proto\022 google.ads.goo" +
      "gleads.v1.services\0327google/ads/googleads" +
      "/v1/resources/campaign_budget.proto\032\034goo" +
      "gle/api/annotations.proto\032 google/protob" +
      "uf/field_mask.proto\032\036google/protobuf/wra" +
      "ppers.proto\032\027google/rpc/status.proto\"1\n\030" +
      "GetCampaignBudgetRequest\022\025\n\rresource_nam" +
      "e\030\001 \001(\t\"\262\001\n\034MutateCampaignBudgetsRequest" +
      "\022\023\n\013customer_id\030\001 \001(\t\022M\n\noperations\030\002 \003(" +
      "\01329.google.ads.googleads.v1.services.Cam" +
      "paignBudgetOperation\022\027\n\017partial_failure\030" +
      "\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\363\001\n\027Campaig" +
      "nBudgetOperation\022/\n\013update_mask\030\004 \001(\0132\032." +
      "google.protobuf.FieldMask\022C\n\006create\030\001 \001(" +
      "\01321.google.ads.googleads.v1.resources.Ca" +
      "mpaignBudgetH\000\022C\n\006update\030\002 \001(\01321.google." +
      "ads.googleads.v1.resources.CampaignBudge" +
      "tH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\241\001\n\035M" +
      "utateCampaignBudgetsResponse\0221\n\025partial_" +
      "failure_error\030\003 \001(\0132\022.google.rpc.Status\022" +
      "M\n\007results\030\002 \003(\0132<.google.ads.googleads." +
      "v1.services.MutateCampaignBudgetResult\"3" +
      "\n\032MutateCampaignBudgetResult\022\025\n\rresource" +
      "_name\030\001 \001(\t2\263\003\n\025CampaignBudgetService\022\275\001" +
      "\n\021GetCampaignBudget\022:.google.ads.googlea" +
      "ds.v1.services.GetCampaignBudgetRequest\032" +
      "1.google.ads.googleads.v1.resources.Camp" +
      "aignBudget\"9\202\323\344\223\0023\0221/v1/{resource_name=c" +
      "ustomers/*/campaignBudgets/*}\022\331\001\n\025Mutate" +
      "CampaignBudgets\022>.google.ads.googleads.v" +
      "1.services.MutateCampaignBudgetsRequest\032" +
      "?.google.ads.googleads.v1.services.Mutat" +
      "eCampaignBudgetsResponse\"?\202\323\344\223\0029\"4/v1/cu" +
      "stomers/{customer_id=*}/campaignBudgets:" +
      "mutate:\001*B\201\002\n$com.google.ads.googleads.v" +
      "1.servicesB\032CampaignBudgetServiceProtoP\001" +
      "ZHgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v1/services;services\242\002\003GAA" +
      "\252\002 Google.Ads.GoogleAds.V1.Services\312\002 Go" +
      "ogle\\Ads\\GoogleAds\\V1\\Services\352\002$Google:" +
      ":Ads::GoogleAds::V1::Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.CampaignBudgetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetCampaignBudgetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetCampaignBudgetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetCampaignBudgetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_CampaignBudgetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_CampaignBudgetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_CampaignBudgetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCampaignBudgetResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.CampaignBudgetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
