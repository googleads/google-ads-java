// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/keyword_plan_ad_group.proto

package com.google.ads.googleads.v2.resources;

public final class KeywordPlanAdGroupProto {
  private KeywordPlanAdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v2/resources/keyw" +
      "ord_plan_ad_group.proto\022!google.ads.goog" +
      "leads.v2.resources\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032\036" +
      "google/protobuf/wrappers.proto\032\034google/a" +
      "pi/annotations.proto\"\323\003\n\022KeywordPlanAdGr" +
      "oup\022J\n\rresource_name\030\001 \001(\tB3\340A\005\372A-\n+goog" +
      "leads.googleapis.com/KeywordPlanAdGroup\022" +
      "n\n\025keyword_plan_campaign\030\002 \001(\0132\034.google." +
      "protobuf.StringValueB1\372A.\n,googleads.goo" +
      "gleapis.com/KeywordPlanCampaign\022,\n\002id\030\003 " +
      "\001(\0132\033.google.protobuf.Int64ValueB\003\340A\003\022*\n" +
      "\004name\030\004 \001(\0132\034.google.protobuf.StringValu" +
      "e\0223\n\016cpc_bid_micros\030\005 \001(\0132\033.google.proto" +
      "buf.Int64Value:r\352Ao\n+googleads.googleapi" +
      "s.com/KeywordPlanAdGroup\022@customers/{cus" +
      "tomer}/keywordPlanAdGroups/{keyword_plan" +
      "_ad_group}B\204\002\n%com.google.ads.googleads." +
      "v2.resourcesB\027KeywordPlanAdGroupProtoP\001Z" +
      "Jgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v2/resources;resources\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V2.Resources\312\002!" +
      "Google\\Ads\\GoogleAds\\V2\\Resources\352\002%Goog" +
      "le::Ads::GoogleAds::V2::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_KeywordPlanAdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlanCampaign", "Id", "Name", "CpcBidMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
