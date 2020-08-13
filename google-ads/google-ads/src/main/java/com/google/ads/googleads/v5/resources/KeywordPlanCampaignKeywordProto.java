// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/keyword_plan_campaign_keyword.proto

package com.google.ads.googleads.v5.resources;

public final class KeywordPlanCampaignKeywordProto {
  private KeywordPlanCampaignKeywordProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_KeywordPlanCampaignKeyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_KeywordPlanCampaignKeyword_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v5/resources/keyw" +
      "ord_plan_campaign_keyword.proto\022!google." +
      "ads.googleads.v5.resources\0326google/ads/g" +
      "oogleads/v5/enums/keyword_match_type.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032\036google/protobuf/" +
      "wrappers.proto\032\034google/api/annotations.p" +
      "roto\"\325\004\n\032KeywordPlanCampaignKeyword\022R\n\rr" +
      "esource_name\030\001 \001(\tB;\340A\005\372A5\n3googleads.go" +
      "ogleapis.com/KeywordPlanCampaignKeyword\022" +
      "n\n\025keyword_plan_campaign\030\002 \001(\0132\034.google." +
      "protobuf.StringValueB1\372A.\n,googleads.goo" +
      "gleapis.com/KeywordPlanCampaign\022,\n\002id\030\003 " +
      "\001(\0132\033.google.protobuf.Int64ValueB\003\340A\003\022*\n" +
      "\004text\030\004 \001(\0132\034.google.protobuf.StringValu" +
      "e\022X\n\nmatch_type\030\005 \001(\0162D.google.ads.googl" +
      "eads.v5.enums.KeywordMatchTypeEnum.Keywo" +
      "rdMatchType\0221\n\010negative\030\007 \001(\0132\032.google.p" +
      "rotobuf.BoolValueB\003\340A\005:\213\001\352A\207\001\n3googleads" +
      ".googleapis.com/KeywordPlanCampaignKeywo" +
      "rd\022Pcustomers/{customer}/keywordPlanCamp" +
      "aignKeywords/{keyword_plan_campaign_keyw" +
      "ord}B\214\002\n%com.google.ads.googleads.v5.res" +
      "ourcesB\037KeywordPlanCampaignKeywordProtoP" +
      "\001ZJgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v5/resources;resources\242\002\003" +
      "GAA\252\002!Google.Ads.GoogleAds.V5.Resources\312" +
      "\002!Google\\Ads\\GoogleAds\\V5\\Resources\352\002%Go" +
      "ogle::Ads::GoogleAds::V5::Resourcesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.KeywordMatchTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_KeywordPlanCampaignKeyword_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_KeywordPlanCampaignKeyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_KeywordPlanCampaignKeyword_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlanCampaign", "Id", "Text", "MatchType", "Negative", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.enums.KeywordMatchTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
