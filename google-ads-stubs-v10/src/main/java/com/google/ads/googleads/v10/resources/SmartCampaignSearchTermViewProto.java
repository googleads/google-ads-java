// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/smart_campaign_search_term_view.proto

package com.google.ads.googleads.v10.resources;

public final class SmartCampaignSearchTermViewProto {
  private SmartCampaignSearchTermViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_SmartCampaignSearchTermView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_SmartCampaignSearchTermView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/ads/googleads/v10/resources/sma" +
      "rt_campaign_search_term_view.proto\022\"goog" +
      "le.ads.googleads.v10.resources\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\"\322\002\n\033SmartCampaignSearchTermVi" +
      "ew\022S\n\rresource_name\030\001 \001(\tB<\340A\003\372A6\n4googl" +
      "eads.googleapis.com/SmartCampaignSearchT" +
      "ermView\022\030\n\013search_term\030\002 \001(\tB\003\340A\003\022;\n\010cam" +
      "paign\030\003 \001(\tB)\340A\003\372A#\n!googleads.googleapi" +
      "s.com/Campaign:\206\001\352A\202\001\n4googleads.googlea" +
      "pis.com/SmartCampaignSearchTermView\022Jcus" +
      "tomers/{customer_id}/smartCampaignSearch" +
      "TermViews/{campaign_id}~{query}B\222\002\n&com." +
      "google.ads.googleads.v10.resourcesB Smar" +
      "tCampaignSearchTermViewProtoP\001ZKgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v10/resources;resources\242\002\003GAA\252\002\"Goog" +
      "le.Ads.GoogleAds.V10.Resources\312\002\"Google\\" +
      "Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ad" +
      "s::GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_SmartCampaignSearchTermView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_SmartCampaignSearchTermView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_SmartCampaignSearchTermView_descriptor,
        new java.lang.String[] { "ResourceName", "SearchTerm", "Campaign", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
