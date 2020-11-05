// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/campaign_extension_setting_service.proto

package com.google.ads.googleads.v4.services;

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
    internal_static_google_ads_googleads_v4_services_GetCampaignExtensionSettingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetCampaignExtensionSettingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_CampaignExtensionSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_CampaignExtensionSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v4/services/campa" +
      "ign_extension_setting_service.proto\022 goo" +
      "gle.ads.googleads.v4.services\032Bgoogle/ad" +
      "s/googleads/v4/resources/campaign_extens" +
      "ion_setting.proto\032\034google/api/annotation" +
      "s.proto\032\027google/api/client.proto\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\032 google/protobuf/field_mask" +
      ".proto\032\027google/rpc/status.proto\"v\n\"GetCa" +
      "mpaignExtensionSettingRequest\022P\n\rresourc" +
      "e_name\030\001 \001(\tB9\340A\002\372A3\n1googleads.googleap" +
      "is.com/CampaignExtensionSetting\"\320\001\n&Muta" +
      "teCampaignExtensionSettingsRequest\022\030\n\013cu" +
      "stomer_id\030\001 \001(\tB\003\340A\002\022\\\n\noperations\030\002 \003(\013" +
      "2C.google.ads.googleads.v4.services.Camp" +
      "aignExtensionSettingOperationB\003\340A\002\022\027\n\017pa" +
      "rtial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001" +
      "(\010\"\221\002\n!CampaignExtensionSettingOperation" +
      "\022/\n\013update_mask\030\004 \001(\0132\032.google.protobuf." +
      "FieldMask\022M\n\006create\030\001 \001(\0132;.google.ads.g" +
      "oogleads.v4.resources.CampaignExtensionS" +
      "ettingH\000\022M\n\006update\030\002 \001(\0132;.google.ads.go" +
      "ogleads.v4.resources.CampaignExtensionSe" +
      "ttingH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\265" +
      "\001\n\'MutateCampaignExtensionSettingsRespon" +
      "se\0221\n\025partial_failure_error\030\003 \001(\0132\022.goog" +
      "le.rpc.Status\022W\n\007results\030\002 \003(\0132F.google." +
      "ads.googleads.v4.services.MutateCampaign" +
      "ExtensionSettingResult\"=\n$MutateCampaign" +
      "ExtensionSettingResult\022\025\n\rresource_name\030" +
      "\001 \001(\t2\323\004\n\037CampaignExtensionSettingServic" +
      "e\022\365\001\n\033GetCampaignExtensionSetting\022D.goog" +
      "le.ads.googleads.v4.services.GetCampaign" +
      "ExtensionSettingRequest\032;.google.ads.goo" +
      "gleads.v4.resources.CampaignExtensionSet" +
      "ting\"S\202\323\344\223\002=\022;/v4/{resource_name=custome" +
      "rs/*/campaignExtensionSettings/*}\332A\rreso" +
      "urce_name\022\232\002\n\037MutateCampaignExtensionSet" +
      "tings\022H.google.ads.googleads.v4.services" +
      ".MutateCampaignExtensionSettingsRequest\032" +
      "I.google.ads.googleads.v4.services.Mutat" +
      "eCampaignExtensionSettingsResponse\"b\202\323\344\223" +
      "\002C\">/v4/customers/{customer_id=*}/campai" +
      "gnExtensionSettings:mutate:\001*\332A\026customer" +
      "_id,operations\032\033\312A\030googleads.googleapis." +
      "comB\213\002\n$com.google.ads.googleads.v4.serv" +
      "icesB$CampaignExtensionSettingServicePro" +
      "toP\001ZHgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v4/services;services\242\002" +
      "\003GAA\252\002 Google.Ads.GoogleAds.V4.Services\312" +
      "\002 Google\\Ads\\GoogleAds\\V4\\Services\352\002$Goo" +
      "gle::Ads::GoogleAds::V4::Servicesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.CampaignExtensionSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetCampaignExtensionSettingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetCampaignExtensionSettingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetCampaignExtensionSettingRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v4_services_CampaignExtensionSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_CampaignExtensionSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_CampaignExtensionSettingOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCampaignExtensionSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.resources.CampaignExtensionSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
