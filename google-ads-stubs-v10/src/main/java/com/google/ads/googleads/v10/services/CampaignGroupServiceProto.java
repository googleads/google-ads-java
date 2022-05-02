// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/campaign_group_service.proto

package com.google.ads.googleads.v10.services;

public final class CampaignGroupServiceProto {
  private CampaignGroupServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_CampaignGroupOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_CampaignGroupOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateCampaignGroupResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateCampaignGroupResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v10/services/camp" +
      "aign_group_service.proto\022!google.ads.goo" +
      "gleads.v10.services\032:google/ads/googlead" +
      "s/v10/enums/response_content_type.proto\032" +
      "7google/ads/googleads/v10/resources/camp" +
      "aign_group.proto\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032 google/protobuf/field_mask." +
      "proto\032\027google/rpc/status.proto\"\247\002\n\033Mutat" +
      "eCampaignGroupsRequest\022\030\n\013customer_id\030\001 " +
      "\001(\tB\003\340A\002\022R\n\noperations\030\002 \003(\01329.google.ad" +
      "s.googleads.v10.services.CampaignGroupOp" +
      "erationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n" +
      "\rvalidate_only\030\004 \001(\010\022j\n\025response_content" +
      "_type\030\005 \001(\0162K.google.ads.googleads.v10.e" +
      "nums.ResponseContentTypeEnum.ResponseCon" +
      "tentType\"\237\002\n\026CampaignGroupOperation\022/\n\013u" +
      "pdate_mask\030\004 \001(\0132\032.google.protobuf.Field" +
      "Mask\022C\n\006create\030\001 \001(\01321.google.ads.google" +
      "ads.v10.resources.CampaignGroupH\000\022C\n\006upd" +
      "ate\030\002 \001(\01321.google.ads.googleads.v10.res" +
      "ources.CampaignGroupH\000\022=\n\006remove\030\003 \001(\tB+" +
      "\372A(\n&googleads.googleapis.com/CampaignGr" +
      "oupH\000B\013\n\toperation\"\240\001\n\034MutateCampaignGro" +
      "upsResponse\022M\n\007results\030\002 \003(\0132<.google.ad" +
      "s.googleads.v10.services.MutateCampaignG" +
      "roupResult\0221\n\025partial_failure_error\030\003 \001(" +
      "\0132\022.google.rpc.Status\"\255\001\n\031MutateCampaign" +
      "GroupResult\022E\n\rresource_name\030\001 \001(\tB.\340A\002\372" +
      "A(\n&googleads.googleapis.com/CampaignGro" +
      "up\022I\n\016campaign_group\030\002 \001(\01321.google.ads." +
      "googleads.v10.resources.CampaignGroup2\321\002" +
      "\n\024CampaignGroupService\022\361\001\n\024MutateCampaig" +
      "nGroups\022>.google.ads.googleads.v10.servi" +
      "ces.MutateCampaignGroupsRequest\032?.google" +
      ".ads.googleads.v10.services.MutateCampai" +
      "gnGroupsResponse\"X\202\323\344\223\0029\"4/v10/customers" +
      "/{customer_id=*}/campaignGroups:mutate:\001" +
      "*\332A\026customer_id,operations\032E\312A\030googleads" +
      ".googleapis.com\322A\'https://www.googleapis" +
      ".com/auth/adwordsB\205\002\n%com.google.ads.goo" +
      "gleads.v10.servicesB\031CampaignGroupServic" +
      "eProtoP\001ZIgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v10/services;servi" +
      "ces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Ser" +
      "vices\312\002!Google\\Ads\\GoogleAds\\V10\\Service" +
      "s\352\002%Google::Ads::GoogleAds::V10::Service" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.resources.CampaignGroupProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v10_services_CampaignGroupOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_services_CampaignGroupOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_CampaignGroupOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateCampaignGroupsResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v10_services_MutateCampaignGroupResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_services_MutateCampaignGroupResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateCampaignGroupResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignGroup", });
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
    com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v10.resources.CampaignGroupProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
