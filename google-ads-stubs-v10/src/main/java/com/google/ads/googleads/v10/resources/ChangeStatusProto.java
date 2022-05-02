// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/change_status.proto

package com.google.ads.googleads.v10.resources;

public final class ChangeStatusProto {
  private ChangeStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ChangeStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ChangeStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v10/resources/cha" +
      "nge_status.proto\022\"google.ads.googleads.v" +
      "10.resources\032<google/ads/googleads/v10/e" +
      "nums/change_status_operation.proto\032@goog" +
      "le/ads/googleads/v10/enums/change_status" +
      "_resource_type.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\"\207\016\n\014ChangeStatus\022D\n\rresource_name\030\001 \001(\t" +
      "B-\340A\003\372A\'\n%googleads.googleapis.com/Chang" +
      "eStatus\022\'\n\025last_change_date_time\030\030 \001(\tB\003" +
      "\340A\003H\000\210\001\001\022q\n\rresource_type\030\004 \001(\0162U.google" +
      ".ads.googleads.v10.enums.ChangeStatusRes" +
      "ourceTypeEnum.ChangeStatusResourceTypeB\003" +
      "\340A\003\022@\n\010campaign\030\021 \001(\tB)\340A\003\372A#\n!googleads" +
      ".googleapis.com/CampaignH\001\210\001\001\022?\n\010ad_grou" +
      "p\030\022 \001(\tB(\340A\003\372A\"\n googleads.googleapis.co" +
      "m/AdGroupH\002\210\001\001\022m\n\017resource_status\030\010 \001(\0162" +
      "O.google.ads.googleads.v10.enums.ChangeS" +
      "tatusOperationEnum.ChangeStatusOperation" +
      "B\003\340A\003\022D\n\013ad_group_ad\030\031 \001(\tB*\340A\003\372A$\n\"goog" +
      "leads.googleapis.com/AdGroupAdH\003\210\001\001\022R\n\022a" +
      "d_group_criterion\030\032 \001(\tB1\340A\003\372A+\n)googlea" +
      "ds.googleapis.com/AdGroupCriterionH\004\210\001\001\022" +
      "S\n\022campaign_criterion\030\033 \001(\tB2\340A\003\372A,\n*goo" +
      "gleads.googleapis.com/CampaignCriterionH" +
      "\005\210\001\001\0228\n\004feed\030\034 \001(\tB%\340A\003\372A\037\n\035googleads.go" +
      "ogleapis.com/FeedH\006\210\001\001\022A\n\tfeed_item\030\035 \001(" +
      "\tB)\340A\003\372A#\n!googleads.googleapis.com/Feed" +
      "ItemH\007\210\001\001\022H\n\rad_group_feed\030\036 \001(\tB,\340A\003\372A&" +
      "\n$googleads.googleapis.com/AdGroupFeedH\010" +
      "\210\001\001\022I\n\rcampaign_feed\030\037 \001(\tB-\340A\003\372A\'\n%goog" +
      "leads.googleapis.com/CampaignFeedH\t\210\001\001\022W" +
      "\n\025ad_group_bid_modifier\030  \001(\tB3\340A\003\372A-\n+g" +
      "oogleads.googleapis.com/AdGroupBidModifi" +
      "erH\n\210\001\001\022>\n\nshared_set\030! \001(\tB*\340A\003\372A$\n\"goo" +
      "gleads.googleapis.com/SharedSet\022O\n\023campa" +
      "ign_shared_set\030\" \001(\tB2\340A\003\372A,\n*googleads." +
      "googleapis.com/CampaignSharedSet\0225\n\005asse" +
      "t\030# \001(\tB&\340A\003\372A \n\036googleads.googleapis.co" +
      "m/Asset\022F\n\016customer_asset\030$ \001(\tB.\340A\003\372A(\n" +
      "&googleads.googleapis.com/CustomerAsset\022" +
      "F\n\016campaign_asset\030% \001(\tB.\340A\003\372A(\n&googlea" +
      "ds.googleapis.com/CampaignAsset\022E\n\016ad_gr" +
      "oup_asset\030& \001(\tB-\340A\003\372A\'\n%googleads.googl" +
      "eapis.com/AdGroupAsset:c\352A`\n%googleads.g" +
      "oogleapis.com/ChangeStatus\0227customers/{c" +
      "ustomer_id}/changeStatus/{change_status_" +
      "id}B\030\n\026_last_change_date_timeB\013\n\t_campai" +
      "gnB\013\n\t_ad_groupB\016\n\014_ad_group_adB\025\n\023_ad_g" +
      "roup_criterionB\025\n\023_campaign_criterionB\007\n" +
      "\005_feedB\014\n\n_feed_itemB\020\n\016_ad_group_feedB\020" +
      "\n\016_campaign_feedB\030\n\026_ad_group_bid_modifi" +
      "erB\203\002\n&com.google.ads.googleads.v10.reso" +
      "urcesB\021ChangeStatusProtoP\001ZKgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v10/resources;resources\242\002\003GAA\252\002\"Google.A" +
      "ds.GoogleAds.V10.Resources\312\002\"Google\\Ads\\" +
      "GoogleAds\\V10\\Resources\352\002&Google::Ads::G" +
      "oogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ChangeStatusOperationProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ChangeStatusResourceTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ChangeStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ChangeStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ChangeStatus_descriptor,
        new java.lang.String[] { "ResourceName", "LastChangeDateTime", "ResourceType", "Campaign", "AdGroup", "ResourceStatus", "AdGroupAd", "AdGroupCriterion", "CampaignCriterion", "Feed", "FeedItem", "AdGroupFeed", "CampaignFeed", "AdGroupBidModifier", "SharedSet", "CampaignSharedSet", "Asset", "CustomerAsset", "CampaignAsset", "AdGroupAsset", "LastChangeDateTime", "Campaign", "AdGroup", "AdGroupAd", "AdGroupCriterion", "CampaignCriterion", "Feed", "FeedItem", "AdGroupFeed", "CampaignFeed", "AdGroupBidModifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.ChangeStatusOperationProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ChangeStatusResourceTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
