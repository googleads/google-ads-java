// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/keyword_plan_ad_group_keyword.proto

package com.google.ads.googleads.v14.resources;

public final class KeywordPlanAdGroupKeywordProto {
  private KeywordPlanAdGroupKeywordProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_KeywordPlanAdGroupKeyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_KeywordPlanAdGroupKeyword_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v14/resources/key" +
      "word_plan_ad_group_keyword.proto\022\"google" +
      ".ads.googleads.v14.resources\0327google/ads" +
      "/googleads/v14/enums/keyword_match_type." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\340\004\n\031KeywordPla" +
      "nAdGroupKeyword\022R\n\rresource_name\030\001 \001(\tB;" +
      "\342A\001\005\372A4\n2googleads.googleapis.com/Keywor" +
      "dPlanAdGroupKeyword\022T\n\025keyword_plan_ad_g" +
      "roup\030\010 \001(\tB0\372A-\n+googleads.googleapis.co" +
      "m/KeywordPlanAdGroupH\000\210\001\001\022\025\n\002id\030\t \001(\003B\004\342" +
      "A\001\003H\001\210\001\001\022\021\n\004text\030\n \001(\tH\002\210\001\001\022Y\n\nmatch_typ" +
      "e\030\005 \001(\0162E.google.ads.googleads.v14.enums" +
      ".KeywordMatchTypeEnum.KeywordMatchType\022\033" +
      "\n\016cpc_bid_micros\030\013 \001(\003H\003\210\001\001\022\033\n\010negative\030" +
      "\014 \001(\010B\004\342A\001\005H\004\210\001\001:\217\001\352A\213\001\n2googleads.googl" +
      "eapis.com/KeywordPlanAdGroupKeyword\022Ucus" +
      "tomers/{customer_id}/keywordPlanAdGroupK" +
      "eywords/{keyword_plan_ad_group_keyword_i" +
      "d}B\030\n\026_keyword_plan_ad_groupB\005\n\003_idB\007\n\005_" +
      "textB\021\n\017_cpc_bid_microsB\013\n\t_negativeB\220\002\n" +
      "&com.google.ads.googleads.v14.resourcesB" +
      "\036KeywordPlanAdGroupKeywordProtoP\001ZKgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v14/resources;resources\242\002\003GAA\252\002\"G" +
      "oogle.Ads.GoogleAds.V14.Resources\312\002\"Goog" +
      "le\\Ads\\GoogleAds\\V14\\Resources\352\002&Google:" +
      ":Ads::GoogleAds::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.KeywordMatchTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_KeywordPlanAdGroupKeyword_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_KeywordPlanAdGroupKeyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_KeywordPlanAdGroupKeyword_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlanAdGroup", "Id", "Text", "MatchType", "CpcBidMicros", "Negative", "KeywordPlanAdGroup", "Id", "Text", "CpcBidMicros", "Negative", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.KeywordMatchTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
