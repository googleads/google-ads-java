// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/campaign_extension_setting.proto

package com.google.ads.googleads.v4.resources;

public final class CampaignExtensionSettingProto {
  private CampaignExtensionSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_CampaignExtensionSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_CampaignExtensionSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v4/resources/camp" +
      "aign_extension_setting.proto\022!google.ads" +
      ".googleads.v4.resources\032<google/ads/goog" +
      "leads/v4/enums/extension_setting_device." +
      "proto\0322google/ads/googleads/v4/enums/ext" +
      "ension_type.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\036g" +
      "oogle/protobuf/wrappers.proto\032\034google/ap" +
      "i/annotations.proto\"\372\004\n\030CampaignExtensio" +
      "nSetting\022P\n\rresource_name\030\001 \001(\tB9\340A\005\372A3\n" +
      "1googleads.googleapis.com/CampaignExtens" +
      "ionSetting\022[\n\016extension_type\030\002 \001(\0162>.goo" +
      "gle.ads.googleads.v4.enums.ExtensionType" +
      "Enum.ExtensionTypeB\003\340A\005\022Y\n\010campaign\030\003 \001(" +
      "\0132\034.google.protobuf.StringValueB)\340A\005\372A#\n" +
      "!googleads.googleapis.com/Campaign\022k\n\024ex" +
      "tension_feed_items\030\004 \003(\0132\034.google.protob" +
      "uf.StringValueB/\372A,\n*googleads.googleapi" +
      "s.com/ExtensionFeedItem\022`\n\006device\030\005 \001(\0162" +
      "P.google.ads.googleads.v4.enums.Extensio" +
      "nSettingDeviceEnum.ExtensionSettingDevic" +
      "e:\204\001\352A\200\001\n1googleads.googleapis.com/Campa" +
      "ignExtensionSetting\022Kcustomers/{customer" +
      "}/campaignExtensionSettings/{campaign_ex" +
      "tension_setting}B\212\002\n%com.google.ads.goog" +
      "leads.v4.resourcesB\035CampaignExtensionSet" +
      "tingProtoP\001ZJgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v4/resources;re" +
      "sources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4." +
      "Resources\312\002!Google\\Ads\\GoogleAds\\V4\\Reso" +
      "urces\352\002%Google::Ads::GoogleAds::V4::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.enums.ExtensionSettingDeviceProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.ExtensionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_CampaignExtensionSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_CampaignExtensionSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_CampaignExtensionSetting_descriptor,
        new java.lang.String[] { "ResourceName", "ExtensionType", "Campaign", "ExtensionFeedItems", "Device", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.enums.ExtensionSettingDeviceProto.getDescriptor();
    com.google.ads.googleads.v4.enums.ExtensionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}