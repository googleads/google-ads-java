// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/campaign_search_term_insight.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public final class CampaignSearchTermInsightProto {
  private CampaignSearchTermInsightProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v19/resources/cam" +
      "paign_search_term_insight.proto\022\"google." +
      "ads.googleads.v19.resources\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\"\371\002\n\031CampaignSearchTermInsight\022Q\n" +
      "\rresource_name\030\001 \001(\tB:\340A\003\372A4\n2googleads." +
      "googleapis.com/CampaignSearchTermInsight" +
      "\022 \n\016category_label\030\002 \001(\tB\003\340A\003H\000\210\001\001\022\024\n\002id" +
      "\030\003 \001(\003B\003\340A\003H\001\210\001\001\022\035\n\013campaign_id\030\004 \001(\003B\003\340" +
      "A\003H\002\210\001\001:\207\001\352A\203\001\n2googleads.googleapis.com" +
      "/CampaignSearchTermInsight\022Mcustomers/{c" +
      "ustomer_id}/campaignSearchTermInsights/{" +
      "campaign_id}~{cluster_id}B\021\n\017_category_l" +
      "abelB\005\n\003_idB\016\n\014_campaign_idB\220\002\n&com.goog" +
      "le.ads.googleads.v19.resourcesB\036Campaign" +
      "SearchTermInsightProtoP\001ZKgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "9/resources;resources\242\002\003GAA\252\002\"Google.Ads" +
      ".GoogleAds.V19.Resources\312\002\"Google\\Ads\\Go" +
      "ogleAds\\V19\\Resources\352\002&Google::Ads::Goo" +
      "gleAds::V19::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_descriptor,
        new java.lang.String[] { "ResourceName", "CategoryLabel", "Id", "CampaignId", });
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
