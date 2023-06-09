// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/campaign_extension_setting_service.proto

package com.google.ads.googleads.v14.services;

public final class CampaignExtensionSettingServiceProto {
  private CampaignExtensionSettingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_CampaignExtensionSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_CampaignExtensionSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v14/services/camp" +
      "aign_extension_setting_service.proto\022!go" +
      "ogle.ads.googleads.v14.services\032:google/" +
      "ads/googleads/v14/enums/response_content" +
      "_type.proto\032Cgoogle/ads/googleads/v14/re" +
      "sources/campaign_extension_setting.proto" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\027google/rp" +
      "c/status.proto\"\277\002\n&MutateCampaignExtensi" +
      "onSettingsRequest\022\031\n\013customer_id\030\001 \001(\tB\004" +
      "\342A\001\002\022^\n\noperations\030\002 \003(\0132D.google.ads.go" +
      "ogleads.v14.services.CampaignExtensionSe" +
      "ttingOperationB\004\342A\001\002\022\027\n\017partial_failure\030" +
      "\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025response" +
      "_content_type\030\005 \001(\0162K.google.ads.googlea" +
      "ds.v14.enums.ResponseContentTypeEnum.Res" +
      "ponseContentType\"\313\002\n!CampaignExtensionSe" +
      "ttingOperation\022/\n\013update_mask\030\004 \001(\0132\032.go" +
      "ogle.protobuf.FieldMask\022N\n\006create\030\001 \001(\0132" +
      "<.google.ads.googleads.v14.resources.Cam" +
      "paignExtensionSettingH\000\022N\n\006update\030\002 \001(\0132" +
      "<.google.ads.googleads.v14.resources.Cam" +
      "paignExtensionSettingH\000\022H\n\006remove\030\003 \001(\tB" +
      "6\372A3\n1googleads.googleapis.com/CampaignE" +
      "xtensionSettingH\000B\013\n\toperation\"\266\001\n\'Mutat" +
      "eCampaignExtensionSettingsResponse\0221\n\025pa" +
      "rtial_failure_error\030\003 \001(\0132\022.google.rpc.S" +
      "tatus\022X\n\007results\030\002 \003(\0132G.google.ads.goog" +
      "leads.v14.services.MutateCampaignExtensi" +
      "onSettingResult\"\327\001\n$MutateCampaignExtens" +
      "ionSettingResult\022M\n\rresource_name\030\001 \001(\tB" +
      "6\372A3\n1googleads.googleapis.com/CampaignE" +
      "xtensionSetting\022`\n\032campaign_extension_se" +
      "tting\030\002 \001(\0132<.google.ads.googleads.v14.r" +
      "esources.CampaignExtensionSetting2\210\003\n\037Ca" +
      "mpaignExtensionSettingService\022\235\002\n\037Mutate" +
      "CampaignExtensionSettings\022I.google.ads.g" +
      "oogleads.v14.services.MutateCampaignExte" +
      "nsionSettingsRequest\032J.google.ads.google" +
      "ads.v14.services.MutateCampaignExtension" +
      "SettingsResponse\"c\332A\026customer_id,operati" +
      "ons\202\323\344\223\002D\"?/v14/customers/{customer_id=*" +
      "}/campaignExtensionSettings:mutate:\001*\032E\312" +
      "A\030googleads.googleapis.com\322A\'https://www" +
      ".googleapis.com/auth/adwordsB\220\002\n%com.goo" +
      "gle.ads.googleads.v14.servicesB$Campaign" +
      "ExtensionSettingServiceProtoP\001ZIgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v14/services;services\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V14.Services\312\002!Google\\Ads" +
      "\\GoogleAds\\V14\\Services\352\002%Google::Ads::G" +
      "oogleAds::V14::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.resources.CampaignExtensionSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v14_services_CampaignExtensionSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_CampaignExtensionSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_CampaignExtensionSettingOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCampaignExtensionSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignExtensionSetting", });
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
    com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v14.resources.CampaignExtensionSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
