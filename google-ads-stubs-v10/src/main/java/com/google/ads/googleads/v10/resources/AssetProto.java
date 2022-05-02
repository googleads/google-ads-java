// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/asset.proto

package com.google.ads.googleads.v10.resources;

public final class AssetProto {
  private AssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v10/resources/ass" +
      "et.proto\022\"google.ads.googleads.v10.resou" +
      "rces\0321google/ads/googleads/v10/common/as" +
      "set_types.proto\0326google/ads/googleads/v1" +
      "0/common/custom_parameter.proto\032,google/" +
      "ads/googleads/v10/common/policy.proto\032/g" +
      "oogle/ads/googleads/v10/enums/asset_type" +
      ".proto\032;google/ads/googleads/v10/enums/p" +
      "olicy_approval_status.proto\0329google/ads/" +
      "googleads/v10/enums/policy_review_status" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\206\025\n\005Asset\022=\n\r" +
      "resource_name\030\001 \001(\tB&\340A\005\372A \n\036googleads.g" +
      "oogleapis.com/Asset\022\024\n\002id\030\013 \001(\003B\003\340A\003H\001\210\001" +
      "\001\022\021\n\004name\030\014 \001(\tH\002\210\001\001\022J\n\004type\030\004 \001(\01627.goo" +
      "gle.ads.googleads.v10.enums.AssetTypeEnu" +
      "m.AssetTypeB\003\340A\003\022\022\n\nfinal_urls\030\016 \003(\t\022\031\n\021" +
      "final_mobile_urls\030\020 \003(\t\022\"\n\025tracking_url_" +
      "template\030\021 \001(\tH\003\210\001\001\022O\n\025url_custom_parame" +
      "ters\030\022 \003(\01320.google.ads.googleads.v10.co" +
      "mmon.CustomParameter\022\035\n\020final_url_suffix" +
      "\030\023 \001(\tH\004\210\001\001\022S\n\016policy_summary\030\r \001(\01326.go" +
      "ogle.ads.googleads.v10.resources.AssetPo" +
      "licySummaryB\003\340A\003\022V\n\023youtube_video_asset\030" +
      "\005 \001(\01322.google.ads.googleads.v10.common." +
      "YoutubeVideoAssetB\003\340A\005H\000\022T\n\022media_bundle" +
      "_asset\030\006 \001(\01321.google.ads.googleads.v10." +
      "common.MediaBundleAssetB\003\340A\005H\000\022G\n\013image_" +
      "asset\030\007 \001(\0132+.google.ads.googleads.v10.c" +
      "ommon.ImageAssetB\003\340A\003H\000\022E\n\ntext_asset\030\010 " +
      "\001(\0132*.google.ads.googleads.v10.common.Te" +
      "xtAssetB\003\340A\005H\000\022I\n\017lead_form_asset\030\t \001(\0132" +
      "..google.ads.googleads.v10.common.LeadFo" +
      "rmAssetH\000\022R\n\024book_on_google_asset\030\n \001(\0132" +
      "2.google.ads.googleads.v10.common.BookOn" +
      "GoogleAssetH\000\022J\n\017promotion_asset\030\017 \001(\0132/" +
      ".google.ads.googleads.v10.common.Promoti" +
      "onAssetH\000\022F\n\rcallout_asset\030\024 \001(\0132-.googl" +
      "e.ads.googleads.v10.common.CalloutAssetH" +
      "\000\022[\n\030structured_snippet_asset\030\025 \001(\01327.go" +
      "ogle.ads.googleads.v10.common.Structured" +
      "SnippetAssetH\000\022H\n\016sitelink_asset\030\026 \001(\0132." +
      ".google.ads.googleads.v10.common.Sitelin" +
      "kAssetH\000\022I\n\017page_feed_asset\030\027 \001(\0132..goog" +
      "le.ads.googleads.v10.common.PageFeedAsse" +
      "tH\000\022Y\n\027dynamic_education_asset\030\030 \001(\01326.g" +
      "oogle.ads.googleads.v10.common.DynamicEd" +
      "ucationAssetH\000\022K\n\020mobile_app_asset\030\031 \001(\013" +
      "2/.google.ads.googleads.v10.common.Mobil" +
      "eAppAssetH\000\022Q\n\023hotel_callout_asset\030\032 \001(\013" +
      "22.google.ads.googleads.v10.common.Hotel" +
      "CalloutAssetH\000\022@\n\ncall_asset\030\033 \001(\0132*.goo" +
      "gle.ads.googleads.v10.common.CallAssetH\000" +
      "\022B\n\013price_asset\030\034 \001(\0132+.google.ads.googl" +
      "eads.v10.common.PriceAssetH\000\022W\n\024call_to_" +
      "action_asset\030\035 \001(\01322.google.ads.googlead" +
      "s.v10.common.CallToActionAssetB\003\340A\005H\000\022\\\n" +
      "\031dynamic_real_estate_asset\030\036 \001(\01327.googl" +
      "e.ads.googleads.v10.common.DynamicRealEs" +
      "tateAssetH\000\022S\n\024dynamic_custom_asset\030\037 \001(" +
      "\01323.google.ads.googleads.v10.common.Dyna" +
      "micCustomAssetH\000\022i\n dynamic_hotels_and_r" +
      "entals_asset\030  \001(\0132=.google.ads.googlead" +
      "s.v10.common.DynamicHotelsAndRentalsAsse" +
      "tH\000\022U\n\025dynamic_flights_asset\030! \001(\01324.goo" +
      "gle.ads.googleads.v10.common.DynamicFlig" +
      "htsAssetH\000\022i\n\035discovery_carousel_card_as" +
      "set\030\" \001(\0132;.google.ads.googleads.v10.com" +
      "mon.DiscoveryCarouselCardAssetB\003\340A\005H\000\022S\n" +
      "\024dynamic_travel_asset\030# \001(\01323.google.ads" +
      ".googleads.v10.common.DynamicTravelAsset" +
      "H\000\022Q\n\023dynamic_local_asset\030$ \001(\01322.google" +
      ".ads.googleads.v10.common.DynamicLocalAs" +
      "setH\000\022O\n\022dynamic_jobs_asset\030% \001(\01321.goog" +
      "le.ads.googleads.v10.common.DynamicJobsA" +
      "ssetH\000:N\352AK\n\036googleads.googleapis.com/As" +
      "set\022)customers/{customer_id}/assets/{ass" +
      "et_id}B\014\n\nasset_dataB\005\n\003_idB\007\n\005_nameB\030\n\026" +
      "_tracking_url_templateB\023\n\021_final_url_suf" +
      "fix\"\276\002\n\022AssetPolicySummary\022T\n\024policy_top" +
      "ic_entries\030\001 \003(\01321.google.ads.googleads." +
      "v10.common.PolicyTopicEntryB\003\340A\003\022e\n\rrevi" +
      "ew_status\030\002 \001(\0162I.google.ads.googleads.v" +
      "10.enums.PolicyReviewStatusEnum.PolicyRe" +
      "viewStatusB\003\340A\003\022k\n\017approval_status\030\003 \001(\016" +
      "2M.google.ads.googleads.v10.enums.Policy" +
      "ApprovalStatusEnum.PolicyApprovalStatusB" +
      "\003\340A\003B\374\001\n&com.google.ads.googleads.v10.re" +
      "sourcesB\nAssetProtoP\001ZKgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v10/r" +
      "esources;resources\242\002\003GAA\252\002\"Google.Ads.Go" +
      "ogleAds.V10.Resources\312\002\"Google\\Ads\\Googl" +
      "eAds\\V10\\Resources\352\002&Google::Ads::Google" +
      "Ads::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.AssetTypesProto.getDescriptor(),
          com.google.ads.googleads.v10.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v10.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AssetTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_Asset_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Type", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "PolicySummary", "YoutubeVideoAsset", "MediaBundleAsset", "ImageAsset", "TextAsset", "LeadFormAsset", "BookOnGoogleAsset", "PromotionAsset", "CalloutAsset", "StructuredSnippetAsset", "SitelinkAsset", "PageFeedAsset", "DynamicEducationAsset", "MobileAppAsset", "HotelCalloutAsset", "CallAsset", "PriceAsset", "CallToActionAsset", "DynamicRealEstateAsset", "DynamicCustomAsset", "DynamicHotelsAndRentalsAsset", "DynamicFlightsAsset", "DiscoveryCarouselCardAsset", "DynamicTravelAsset", "DynamicLocalAsset", "DynamicJobsAsset", "AssetData", "Id", "Name", "TrackingUrlTemplate", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v10_resources_AssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_AssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.AssetTypesProto.getDescriptor();
    com.google.ads.googleads.v10.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v10.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AssetTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
