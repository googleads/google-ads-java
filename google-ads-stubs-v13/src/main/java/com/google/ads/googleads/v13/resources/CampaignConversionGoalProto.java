// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/campaign_conversion_goal.proto

package com.google.ads.googleads.v13.resources;

public final class CampaignConversionGoalProto {
  private CampaignConversionGoalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_CampaignConversionGoal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_CampaignConversionGoal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v13/resources/cam" +
      "paign_conversion_goal.proto\022\"google.ads." +
      "googleads.v13.resources\032?google/ads/goog" +
      "leads/v13/enums/conversion_action_catego" +
      "ry.proto\0326google/ads/googleads/v13/enums" +
      "/conversion_origin.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"\204\004\n\026CampaignConversionGoal\022O\n\rresou" +
      "rce_name\030\001 \001(\tB8\342A\001\005\372A1\n/googleads.googl" +
      "eapis.com/CampaignConversionGoal\022<\n\010camp" +
      "aign\030\002 \001(\tB*\342A\001\005\372A#\n!googleads.googleapi" +
      "s.com/Campaign\022g\n\010category\030\003 \001(\0162U.googl" +
      "e.ads.googleads.v13.enums.ConversionActi" +
      "onCategoryEnum.ConversionActionCategory\022" +
      "U\n\006origin\030\004 \001(\0162E.google.ads.googleads.v" +
      "13.enums.ConversionOriginEnum.Conversion" +
      "Origin\022\020\n\010biddable\030\005 \001(\010:\210\001\352A\204\001\n/googlea" +
      "ds.googleapis.com/CampaignConversionGoal" +
      "\022Qcustomers/{customer_id}/campaignConver" +
      "sionGoals/{campaign_id}~{category}~{sour" +
      "ce}B\215\002\n&com.google.ads.googleads.v13.res" +
      "ourcesB\033CampaignConversionGoalProtoP\001ZKg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v13/resources;resources\242\002\003GAA" +
      "\252\002\"Google.Ads.GoogleAds.V13.Resources\312\002\"" +
      "Google\\Ads\\GoogleAds\\V13\\Resources\352\002&Goo" +
      "gle::Ads::GoogleAds::V13::Resourcesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.ConversionOriginProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_CampaignConversionGoal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_CampaignConversionGoal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_CampaignConversionGoal_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "Category", "Origin", "Biddable", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v13.enums.ConversionOriginProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
