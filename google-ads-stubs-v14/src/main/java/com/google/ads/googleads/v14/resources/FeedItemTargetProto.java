// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/feed_item_target.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.resources;

public final class FeedItemTargetProto {
  private FeedItemTargetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_FeedItemTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_FeedItemTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v14/resources/fee" +
      "d_item_target.proto\022\"google.ads.googlead" +
      "s.v14.resources\032.google/ads/googleads/v1" +
      "4/common/criteria.proto\032<google/ads/goog" +
      "leads/v14/enums/feed_item_target_device." +
      "proto\032<google/ads/googleads/v14/enums/fe" +
      "ed_item_target_status.proto\032:google/ads/" +
      "googleads/v14/enums/feed_item_target_typ" +
      "e.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\"\256\010\n\016FeedItem" +
      "Target\022F\n\rresource_name\030\001 \001(\tB/\340A\005\372A)\n\'g" +
      "oogleads.googleapis.com/FeedItemTarget\022A" +
      "\n\tfeed_item\030\014 \001(\tB)\340A\005\372A#\n!googleads.goo" +
      "gleapis.com/FeedItemH\001\210\001\001\022m\n\025feed_item_t" +
      "arget_type\030\003 \001(\0162I.google.ads.googleads." +
      "v14.enums.FeedItemTargetTypeEnum.FeedIte" +
      "mTargetTypeB\003\340A\003\022%\n\023feed_item_target_id\030" +
      "\r \001(\003B\003\340A\003H\002\210\001\001\022b\n\006status\030\013 \001(\0162M.google" +
      ".ads.googleads.v14.enums.FeedItemTargetS" +
      "tatusEnum.FeedItemTargetStatusB\003\340A\003\022=\n\010c" +
      "ampaign\030\016 \001(\tB)\340A\005\372A#\n!googleads.googlea" +
      "pis.com/CampaignH\000\022<\n\010ad_group\030\017 \001(\tB(\340A" +
      "\005\372A\"\n googleads.googleapis.com/AdGroupH\000" +
      "\022D\n\007keyword\030\007 \001(\0132,.google.ads.googleads" +
      ".v14.common.KeywordInfoB\003\340A\005H\000\022Q\n\023geo_ta" +
      "rget_constant\030\020 \001(\tB2\340A\005\372A,\n*googleads.g" +
      "oogleapis.com/GeoTargetConstantH\000\022d\n\006dev" +
      "ice\030\t \001(\0162M.google.ads.googleads.v14.enu" +
      "ms.FeedItemTargetDeviceEnum.FeedItemTarg" +
      "etDeviceB\003\340A\005H\000\022K\n\013ad_schedule\030\n \001(\0132/.g" +
      "oogle.ads.googleads.v14.common.AdSchedul" +
      "eInfoB\003\340A\005H\000:\235\001\352A\231\001\n\'googleads.googleapi" +
      "s.com/FeedItemTarget\022ncustomers/{custome" +
      "r_id}/feedItemTargets/{feed_id}~{feed_it" +
      "em_id}~{feed_item_target_type}~{feed_ite" +
      "m_target_id}B\010\n\006targetB\014\n\n_feed_itemB\026\n\024" +
      "_feed_item_target_idB\205\002\n&com.google.ads." +
      "googleads.v14.resourcesB\023FeedItemTargetP" +
      "rotoP\001ZKgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v14/resources;resour" +
      "ces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V14.Res" +
      "ources\312\002\"Google\\Ads\\GoogleAds\\V14\\Resour" +
      "ces\352\002&Google::Ads::GoogleAds::V14::Resou" +
      "rcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.FeedItemTargetDeviceProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.FeedItemTargetStatusProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.FeedItemTargetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_FeedItemTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_FeedItemTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_FeedItemTarget_descriptor,
        new java.lang.String[] { "ResourceName", "FeedItem", "FeedItemTargetType", "FeedItemTargetId", "Status", "Campaign", "AdGroup", "Keyword", "GeoTargetConstant", "Device", "AdSchedule", "Target", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v14.enums.FeedItemTargetDeviceProto.getDescriptor();
    com.google.ads.googleads.v14.enums.FeedItemTargetStatusProto.getDescriptor();
    com.google.ads.googleads.v14.enums.FeedItemTargetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
