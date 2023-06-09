// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/campaign_extension_setting.proto

package com.google.ads.googleads.v14.resources;

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
    internal_static_google_ads_googleads_v14_resources_CampaignExtensionSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CampaignExtensionSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v14/resources/cam" +
      "paign_extension_setting.proto\022\"google.ad" +
      "s.googleads.v14.resources\032=google/ads/go" +
      "ogleads/v14/enums/extension_setting_devi" +
      "ce.proto\0323google/ads/googleads/v14/enums" +
      "/extension_type.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\332\004\n\030CampaignExtensionSetting\022Q\n\rresour" +
      "ce_name\030\001 \001(\tB:\342A\001\005\372A3\n1googleads.google" +
      "apis.com/CampaignExtensionSetting\022]\n\016ext" +
      "ension_type\030\002 \001(\0162?.google.ads.googleads" +
      ".v14.enums.ExtensionTypeEnum.ExtensionTy" +
      "peB\004\342A\001\005\022A\n\010campaign\030\006 \001(\tB*\342A\001\005\372A#\n!goo" +
      "gleads.googleapis.com/CampaignH\000\210\001\001\022M\n\024e" +
      "xtension_feed_items\030\007 \003(\tB/\372A,\n*googlead" +
      "s.googleapis.com/ExtensionFeedItem\022a\n\006de" +
      "vice\030\005 \001(\0162Q.google.ads.googleads.v14.en" +
      "ums.ExtensionSettingDeviceEnum.Extension" +
      "SettingDevice:\211\001\352A\205\001\n1googleads.googleap" +
      "is.com/CampaignExtensionSetting\022Pcustome" +
      "rs/{customer_id}/campaignExtensionSettin" +
      "gs/{campaign_id}~{extension_type}B\013\n\t_ca" +
      "mpaignB\217\002\n&com.google.ads.googleads.v14." +
      "resourcesB\035CampaignExtensionSettingProto" +
      "P\001ZKgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v14/resources;resources\242" +
      "\002\003GAA\252\002\"Google.Ads.GoogleAds.V14.Resourc" +
      "es\312\002\"Google\\Ads\\GoogleAds\\V14\\Resources\352" +
      "\002&Google::Ads::GoogleAds::V14::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.ExtensionSettingDeviceProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.ExtensionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_CampaignExtensionSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_CampaignExtensionSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CampaignExtensionSetting_descriptor,
        new java.lang.String[] { "ResourceName", "ExtensionType", "Campaign", "ExtensionFeedItems", "Device", "Campaign", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.ExtensionSettingDeviceProto.getDescriptor();
    com.google.ads.googleads.v14.enums.ExtensionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
