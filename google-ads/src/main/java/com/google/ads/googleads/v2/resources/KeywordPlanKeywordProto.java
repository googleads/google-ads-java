// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/keyword_plan_keyword.proto

package com.google.ads.googleads.v2.resources;

public final class KeywordPlanKeywordProto {
  private KeywordPlanKeywordProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v2/resources/keyw" +
      "ord_plan_keyword.proto\022!google.ads.googl" +
      "eads.v2.resources\0326google/ads/googleads/" +
      "v2/enums/keyword_match_type.proto\032\037googl" +
      "e/api/field_behavior.proto\032\031google/api/r" +
      "esource.proto\032\036google/protobuf/wrappers." +
      "proto\032\034google/api/annotations.proto\"\253\004\n\022" +
      "KeywordPlanKeyword\022J\n\rresource_name\030\001 \001(" +
      "\tB3\340A\005\372A-\n+googleads.googleapis.com/Keyw" +
      "ordPlanKeyword\022m\n\025keyword_plan_ad_group\030" +
      "\002 \001(\0132\034.google.protobuf.StringValueB0\372A-" +
      "\n+googleads.googleapis.com/KeywordPlanAd" +
      "Group\022,\n\002id\030\003 \001(\0132\033.google.protobuf.Int6" +
      "4ValueB\003\340A\003\022*\n\004text\030\004 \001(\0132\034.google.proto" +
      "buf.StringValue\022X\n\nmatch_type\030\005 \001(\0162D.go" +
      "ogle.ads.googleads.v2.enums.KeywordMatch" +
      "TypeEnum.KeywordMatchType\0223\n\016cpc_bid_mic" +
      "ros\030\006 \001(\0132\033.google.protobuf.Int64Value:q" +
      "\352An\n+googleads.googleapis.com/KeywordPla" +
      "nKeyword\022?customers/{customer}/keywordPl" +
      "anKeywords/{keyword_plan_keyword}B\204\002\n%co" +
      "m.google.ads.googleads.v2.resourcesB\027Key" +
      "wordPlanKeywordProtoP\001ZJgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v2/r" +
      "esources;resources\242\002\003GAA\252\002!Google.Ads.Go" +
      "ogleAds.V2.Resources\312\002!Google\\Ads\\Google" +
      "Ads\\V2\\Resources\352\002%Google::Ads::GoogleAd" +
      "s::V2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.enums.KeywordMatchTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_KeywordPlanKeyword_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlanAdGroup", "Id", "Text", "MatchType", "CpcBidMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.enums.KeywordMatchTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
