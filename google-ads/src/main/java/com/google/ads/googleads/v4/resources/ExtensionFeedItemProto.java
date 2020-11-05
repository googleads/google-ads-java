// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/extension_feed_item.proto

package com.google.ads.googleads.v4.resources;

public final class ExtensionFeedItemProto {
  private ExtensionFeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_ExtensionFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_ExtensionFeedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v4/resources/exte" +
      "nsion_feed_item.proto\022!google.ads.google" +
      "ads.v4.resources\032-google/ads/googleads/v" +
      "4/common/criteria.proto\032/google/ads/goog" +
      "leads/v4/common/extensions.proto\0322google" +
      "/ads/googleads/v4/enums/extension_type.p" +
      "roto\0324google/ads/googleads/v4/enums/feed" +
      "_item_status.proto\032;google/ads/googleads" +
      "/v4/enums/feed_item_target_device.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032\036google/protobuf/wra" +
      "ppers.proto\032\034google/api/annotations.prot" +
      "o\"\204\020\n\021ExtensionFeedItem\022I\n\rresource_name" +
      "\030\001 \001(\tB2\340A\005\372A,\n*googleads.googleapis.com" +
      "/ExtensionFeedItem\022,\n\002id\030\030 \001(\0132\033.google." +
      "protobuf.Int64ValueB\003\340A\003\022[\n\016extension_ty" +
      "pe\030\r \001(\0162>.google.ads.googleads.v4.enums" +
      ".ExtensionTypeEnum.ExtensionTypeB\003\340A\003\0225\n" +
      "\017start_date_time\030\005 \001(\0132\034.google.protobuf" +
      ".StringValue\0223\n\rend_date_time\030\006 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\022D\n\014ad_schedule" +
      "s\030\020 \003(\0132..google.ads.googleads.v4.common" +
      ".AdScheduleInfo\022\\\n\006device\030\021 \001(\0162L.google" +
      ".ads.googleads.v4.enums.FeedItemTargetDe" +
      "viceEnum.FeedItemTargetDevice\022s\n\034targete" +
      "d_geo_target_constant\030\024 \001(\0132\034.google.pro" +
      "tobuf.StringValueB/\372A,\n*googleads.google" +
      "apis.com/GeoTargetConstant\022E\n\020targeted_k" +
      "eyword\030\026 \001(\0132+.google.ads.googleads.v4.c" +
      "ommon.KeywordInfo\022U\n\006status\030\004 \001(\0162@.goog" +
      "le.ads.googleads.v4.enums.FeedItemStatus" +
      "Enum.FeedItemStatusB\003\340A\003\022N\n\022sitelink_fee" +
      "d_item\030\002 \001(\01320.google.ads.googleads.v4.c" +
      "ommon.SitelinkFeedItemH\000\022a\n\034structured_s" +
      "nippet_feed_item\030\003 \001(\01329.google.ads.goog" +
      "leads.v4.common.StructuredSnippetFeedIte" +
      "mH\000\022D\n\rapp_feed_item\030\007 \001(\0132+.google.ads." +
      "googleads.v4.common.AppFeedItemH\000\022F\n\016cal" +
      "l_feed_item\030\010 \001(\0132,.google.ads.googleads" +
      ".v4.common.CallFeedItemH\000\022L\n\021callout_fee" +
      "d_item\030\t \001(\0132/.google.ads.googleads.v4.c" +
      "ommon.CalloutFeedItemH\000\022U\n\026text_message_" +
      "feed_item\030\n \001(\01323.google.ads.googleads.v" +
      "4.common.TextMessageFeedItemH\000\022H\n\017price_" +
      "feed_item\030\013 \001(\0132-.google.ads.googleads.v" +
      "4.common.PriceFeedItemH\000\022P\n\023promotion_fe" +
      "ed_item\030\014 \001(\01321.google.ads.googleads.v4." +
      "common.PromotionFeedItemH\000\022S\n\022location_f" +
      "eed_item\030\016 \001(\01320.google.ads.googleads.v4" +
      ".common.LocationFeedItemB\003\340A\003H\000\022f\n\034affil" +
      "iate_location_feed_item\030\017 \001(\01329.google.a" +
      "ds.googleads.v4.common.AffiliateLocation" +
      "FeedItemB\003\340A\003H\000\022W\n\027hotel_callout_feed_it" +
      "em\030\027 \001(\01324.google.ads.googleads.v4.commo" +
      "n.HotelCalloutFeedItemH\000\022a\n\021targeted_cam" +
      "paign\030\022 \001(\0132\034.google.protobuf.StringValu" +
      "eB&\372A#\n!googleads.googleapis.com/Campaig" +
      "nH\001\022`\n\021targeted_ad_group\030\023 \001(\0132\034.google." +
      "protobuf.StringValueB%\372A\"\n googleads.goo" +
      "gleapis.com/AdGroupH\001:n\352Ak\n*googleads.go" +
      "ogleapis.com/ExtensionFeedItem\022=customer" +
      "s/{customer}/extensionFeedItems/{extensi" +
      "on_feed_item}B\013\n\textensionB\034\n\032serving_re" +
      "source_targetingB\203\002\n%com.google.ads.goog" +
      "leads.v4.resourcesB\026ExtensionFeedItemPro" +
      "toP\001ZJgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v4/resources;resources" +
      "\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4.Resourc" +
      "es\312\002!Google\\Ads\\GoogleAds\\V4\\Resources\352\002" +
      "%Google::Ads::GoogleAds::V4::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v4.common.ExtensionsProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.ExtensionTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.FeedItemTargetDeviceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_ExtensionFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_ExtensionFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_ExtensionFeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ExtensionType", "StartDateTime", "EndDateTime", "AdSchedules", "Device", "TargetedGeoTargetConstant", "TargetedKeyword", "Status", "SitelinkFeedItem", "StructuredSnippetFeedItem", "AppFeedItem", "CallFeedItem", "CalloutFeedItem", "TextMessageFeedItem", "PriceFeedItem", "PromotionFeedItem", "LocationFeedItem", "AffiliateLocationFeedItem", "HotelCalloutFeedItem", "TargetedCampaign", "TargetedAdGroup", "Extension", "ServingResourceTargeting", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v4.common.ExtensionsProto.getDescriptor();
    com.google.ads.googleads.v4.enums.ExtensionTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.FeedItemTargetDeviceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
