// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/domain_category.proto

package com.google.ads.googleads.v13.resources;

public final class DomainCategoryProto {
  private DomainCategoryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_DomainCategory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_DomainCategory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v13/resources/dom" +
      "ain_category.proto\022\"google.ads.googleads" +
      ".v13.resources\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\"\247\005\n\016D" +
      "omainCategory\022G\n\rresource_name\030\001 \001(\tB0\342A" +
      "\001\003\372A)\n\'googleads.googleapis.com/DomainCa" +
      "tegory\022A\n\010campaign\030\n \001(\tB*\342A\001\003\372A#\n!googl" +
      "eads.googleapis.com/CampaignH\000\210\001\001\022\033\n\010cat" +
      "egory\030\013 \001(\tB\004\342A\001\003H\001\210\001\001\022 \n\rlanguage_code\030" +
      "\014 \001(\tB\004\342A\001\003H\002\210\001\001\022\031\n\006domain\030\r \001(\tB\004\342A\001\003H\003" +
      "\210\001\001\022$\n\021coverage_fraction\030\016 \001(\001B\004\342A\001\003H\004\210\001" +
      "\001\022 \n\rcategory_rank\030\017 \001(\003B\004\342A\001\003H\005\210\001\001\022\037\n\014h" +
      "as_children\030\020 \001(\010B\004\342A\001\003H\006\210\001\001\022-\n\032recommen" +
      "ded_cpc_bid_micros\030\021 \001(\003B\004\342A\001\003H\007\210\001\001:\207\001\352A" +
      "\203\001\n\'googleads.googleapis.com/DomainCateg" +
      "ory\022Xcustomers/{customer_id}/domainCateg" +
      "ories/{campaign_id}~{base64_category}~{l" +
      "anguage_code}B\013\n\t_campaignB\013\n\t_categoryB" +
      "\020\n\016_language_codeB\t\n\007_domainB\024\n\022_coverag" +
      "e_fractionB\020\n\016_category_rankB\017\n\r_has_chi" +
      "ldrenB\035\n\033_recommended_cpc_bid_microsB\205\002\n" +
      "&com.google.ads.googleads.v13.resourcesB" +
      "\023DomainCategoryProtoP\001ZKgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v13/" +
      "resources;resources\242\002\003GAA\252\002\"Google.Ads.G" +
      "oogleAds.V13.Resources\312\002\"Google\\Ads\\Goog" +
      "leAds\\V13\\Resources\352\002&Google::Ads::Googl" +
      "eAds::V13::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_DomainCategory_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_DomainCategory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_DomainCategory_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "Category", "LanguageCode", "Domain", "CoverageFraction", "CategoryRank", "HasChildren", "RecommendedCpcBidMicros", "Campaign", "Category", "LanguageCode", "Domain", "CoverageFraction", "CategoryRank", "HasChildren", "RecommendedCpcBidMicros", });
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
