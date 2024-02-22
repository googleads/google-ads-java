// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/campaign_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public final class CampaignServiceProto {
  private CampaignServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCampaignsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCampaignsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_CampaignOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_CampaignOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCampaignsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCampaignsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCampaignResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCampaignResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v15/services/camp" +
      "aign_service.proto\022!google.ads.googleads" +
      ".v15.services\032:google/ads/googleads/v15/" +
      "enums/response_content_type.proto\0321googl" +
      "e/ads/googleads/v15/resources/campaign.p" +
      "roto\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      " google/protobuf/field_mask.proto\032\027googl" +
      "e/rpc/status.proto\"\235\002\n\026MutateCampaignsRe" +
      "quest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022M\n\nopera" +
      "tions\030\002 \003(\01324.google.ads.googleads.v15.s" +
      "ervices.CampaignOperationB\003\340A\002\022\027\n\017partia" +
      "l_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j" +
      "\n\025response_content_type\030\005 \001(\0162K.google.a" +
      "ds.googleads.v15.enums.ResponseContentTy" +
      "peEnum.ResponseContentType\"\213\002\n\021CampaignO" +
      "peration\022/\n\013update_mask\030\004 \001(\0132\032.google.p" +
      "rotobuf.FieldMask\022>\n\006create\030\001 \001(\0132,.goog" +
      "le.ads.googleads.v15.resources.CampaignH" +
      "\000\022>\n\006update\030\002 \001(\0132,.google.ads.googleads" +
      ".v15.resources.CampaignH\000\0228\n\006remove\030\003 \001(" +
      "\tB&\372A#\n!googleads.googleapis.com/Campaig" +
      "nH\000B\013\n\toperation\"\226\001\n\027MutateCampaignsResp" +
      "onse\0221\n\025partial_failure_error\030\003 \001(\0132\022.go" +
      "ogle.rpc.Status\022H\n\007results\030\002 \003(\01327.googl" +
      "e.ads.googleads.v15.services.MutateCampa" +
      "ignResult\"\225\001\n\024MutateCampaignResult\022=\n\rre" +
      "source_name\030\001 \001(\tB&\372A#\n!googleads.google" +
      "apis.com/Campaign\022>\n\010campaign\030\002 \001(\0132,.go" +
      "ogle.ads.googleads.v15.resources.Campaig" +
      "n2\270\002\n\017CampaignService\022\335\001\n\017MutateCampaign" +
      "s\0229.google.ads.googleads.v15.services.Mu" +
      "tateCampaignsRequest\032:.google.ads.google" +
      "ads.v15.services.MutateCampaignsResponse" +
      "\"S\332A\026customer_id,operations\202\323\344\223\0024\"//v15/" +
      "customers/{customer_id=*}/campaigns:muta" +
      "te:\001*\032E\312A\030googleads.googleapis.com\322A\'htt" +
      "ps://www.googleapis.com/auth/adwordsB\200\002\n" +
      "%com.google.ads.googleads.v15.servicesB\024" +
      "CampaignServiceProtoP\001ZIgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v15/" +
      "services;services\242\002\003GAA\252\002!Google.Ads.Goo" +
      "gleAds.V15.Services\312\002!Google\\Ads\\GoogleA" +
      "ds\\V15\\Services\352\002%Google::Ads::GoogleAds" +
      "::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.CampaignProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateCampaignsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateCampaignsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCampaignsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v15_services_CampaignOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_CampaignOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_CampaignOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateCampaignsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateCampaignsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCampaignsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v15_services_MutateCampaignResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateCampaignResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCampaignResult_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v15.resources.CampaignProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
