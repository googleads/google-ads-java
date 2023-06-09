// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/keyword_plan_campaign_service.proto

package com.google.ads.googleads.v12.services;

public final class KeywordPlanCampaignServiceProto {
  private KeywordPlanCampaignServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v12/services/keyw" +
      "ord_plan_campaign_service.proto\022!google." +
      "ads.googleads.v12.services\032>google/ads/g" +
      "oogleads/v12/resources/keyword_plan_camp" +
      "aign.proto\032\034google/api/annotations.proto" +
      "\032\027google/api/client.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\032 google/protobuf/field_mask.proto\032" +
      "\027google/rpc/status.proto\"\311\001\n!MutateKeywo" +
      "rdPlanCampaignsRequest\022\031\n\013customer_id\030\001 " +
      "\001(\tB\004\342A\001\002\022Y\n\noperations\030\002 \003(\0132?.google.a" +
      "ds.googleads.v12.services.KeywordPlanCam" +
      "paignOperationB\004\342A\001\002\022\027\n\017partial_failure\030" +
      "\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\267\002\n\034Keyword" +
      "PlanCampaignOperation\022/\n\013update_mask\030\004 \001" +
      "(\0132\032.google.protobuf.FieldMask\022I\n\006create" +
      "\030\001 \001(\01327.google.ads.googleads.v12.resour" +
      "ces.KeywordPlanCampaignH\000\022I\n\006update\030\002 \001(" +
      "\01327.google.ads.googleads.v12.resources.K" +
      "eywordPlanCampaignH\000\022C\n\006remove\030\003 \001(\tB1\372A" +
      ".\n,googleads.googleapis.com/KeywordPlanC" +
      "ampaignH\000B\013\n\toperation\"\254\001\n\"MutateKeyword" +
      "PlanCampaignsResponse\0221\n\025partial_failure" +
      "_error\030\003 \001(\0132\022.google.rpc.Status\022S\n\007resu" +
      "lts\030\002 \003(\0132B.google.ads.googleads.v12.ser" +
      "vices.MutateKeywordPlanCampaignResult\"k\n" +
      "\037MutateKeywordPlanCampaignResult\022H\n\rreso" +
      "urce_name\030\001 \001(\tB1\372A.\n,googleads.googleap" +
      "is.com/KeywordPlanCampaign2\357\002\n\032KeywordPl" +
      "anCampaignService\022\211\002\n\032MutateKeywordPlanC" +
      "ampaigns\022D.google.ads.googleads.v12.serv" +
      "ices.MutateKeywordPlanCampaignsRequest\032E" +
      ".google.ads.googleads.v12.services.Mutat" +
      "eKeywordPlanCampaignsResponse\"^\332A\026custom" +
      "er_id,operations\202\323\344\223\002?\":/v12/customers/{" +
      "customer_id=*}/keywordPlanCampaigns:muta" +
      "te:\001*\032E\312A\030googleads.googleapis.com\322A\'htt" +
      "ps://www.googleapis.com/auth/adwordsB\213\002\n" +
      "%com.google.ads.googleads.v12.servicesB\037" +
      "KeywordPlanCampaignServiceProtoP\001ZIgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v12/services;services\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V12.Services\312\002!Google\\" +
      "Ads\\GoogleAds\\V12\\Services\352\002%Google::Ads" +
      "::GoogleAds::V12::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.resources.KeywordPlanCampaignProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateKeywordPlanCampaignResult_descriptor,
        new java.lang.String[] { "ResourceName", });
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
    com.google.ads.googleads.v12.resources.KeywordPlanCampaignProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
