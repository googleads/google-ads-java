// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/change_status.proto

package com.google.ads.googleads.v13.resources;

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
    internal_static_google_ads_googleads_v13_resources_ChangeStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_ChangeStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v13/resources/cha" +
      "nge_status.proto\022\"google.ads.googleads.v" +
      "13.resources\032<google/ads/googleads/v13/e" +
      "nums/change_status_operation.proto\032@goog" +
      "le/ads/googleads/v13/enums/change_status" +
      "_resource_type.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\"\352\016\n\014ChangeStatus\022E\n\rresource_name\030\001 \001(\t" +
      "B.\342A\001\003\372A\'\n%googleads.googleapis.com/Chan" +
      "geStatus\022(\n\025last_change_date_time\030\030 \001(\tB" +
      "\004\342A\001\003H\000\210\001\001\022r\n\rresource_type\030\004 \001(\0162U.goog" +
      "le.ads.googleads.v13.enums.ChangeStatusR" +
      "esourceTypeEnum.ChangeStatusResourceType" +
      "B\004\342A\001\003\022A\n\010campaign\030\021 \001(\tB*\342A\001\003\372A#\n!googl" +
      "eads.googleapis.com/CampaignH\001\210\001\001\022@\n\010ad_" +
      "group\030\022 \001(\tB)\342A\001\003\372A\"\n googleads.googleap" +
      "is.com/AdGroupH\002\210\001\001\022n\n\017resource_status\030\010" +
      " \001(\0162O.google.ads.googleads.v13.enums.Ch" +
      "angeStatusOperationEnum.ChangeStatusOper" +
      "ationB\004\342A\001\003\022E\n\013ad_group_ad\030\031 \001(\tB+\342A\001\003\372A" +
      "$\n\"googleads.googleapis.com/AdGroupAdH\003\210" +
      "\001\001\022S\n\022ad_group_criterion\030\032 \001(\tB2\342A\001\003\372A+\n" +
      ")googleads.googleapis.com/AdGroupCriteri" +
      "onH\004\210\001\001\022T\n\022campaign_criterion\030\033 \001(\tB3\342A\001" +
      "\003\372A,\n*googleads.googleapis.com/CampaignC" +
      "riterionH\005\210\001\001\0229\n\004feed\030\034 \001(\tB&\342A\001\003\372A\037\n\035go" +
      "ogleads.googleapis.com/FeedH\006\210\001\001\022B\n\tfeed" +
      "_item\030\035 \001(\tB*\342A\001\003\372A#\n!googleads.googleap" +
      "is.com/FeedItemH\007\210\001\001\022I\n\rad_group_feed\030\036 " +
      "\001(\tB-\342A\001\003\372A&\n$googleads.googleapis.com/A" +
      "dGroupFeedH\010\210\001\001\022J\n\rcampaign_feed\030\037 \001(\tB." +
      "\342A\001\003\372A\'\n%googleads.googleapis.com/Campai" +
      "gnFeedH\t\210\001\001\022X\n\025ad_group_bid_modifier\030  \001" +
      "(\tB4\342A\001\003\372A-\n+googleads.googleapis.com/Ad" +
      "GroupBidModifierH\n\210\001\001\022?\n\nshared_set\030! \001(" +
      "\tB+\342A\001\003\372A$\n\"googleads.googleapis.com/Sha" +
      "redSet\022P\n\023campaign_shared_set\030\" \001(\tB3\342A\001" +
      "\003\372A,\n*googleads.googleapis.com/CampaignS" +
      "haredSet\0226\n\005asset\030# \001(\tB\'\342A\001\003\372A \n\036google" +
      "ads.googleapis.com/Asset\022G\n\016customer_ass" +
      "et\030$ \001(\tB/\342A\001\003\372A(\n&googleads.googleapis." +
      "com/CustomerAsset\022G\n\016campaign_asset\030% \001(" +
      "\tB/\342A\001\003\372A(\n&googleads.googleapis.com/Cam" +
      "paignAsset\022F\n\016ad_group_asset\030& \001(\tB.\342A\001\003" +
      "\372A\'\n%googleads.googleapis.com/AdGroupAss" +
      "et\022M\n\021combined_audience\030( \001(\tB2\342A\001\003\372A+\n)" +
      "googleads.googleapis.com/CombinedAudienc" +
      "e:c\352A`\n%googleads.googleapis.com/ChangeS" +
      "tatus\0227customers/{customer_id}/changeSta" +
      "tus/{change_status_id}B\030\n\026_last_change_d" +
      "ate_timeB\013\n\t_campaignB\013\n\t_ad_groupB\016\n\014_a" +
      "d_group_adB\025\n\023_ad_group_criterionB\025\n\023_ca" +
      "mpaign_criterionB\007\n\005_feedB\014\n\n_feed_itemB" +
      "\020\n\016_ad_group_feedB\020\n\016_campaign_feedB\030\n\026_" +
      "ad_group_bid_modifierB\203\002\n&com.google.ads" +
      ".googleads.v13.resourcesB\021ChangeStatusPr" +
      "otoP\001ZKgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v13/resources;resourc" +
      "es\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V13.Reso" +
      "urces\312\002\"Google\\Ads\\GoogleAds\\V13\\Resourc" +
      "es\352\002&Google::Ads::GoogleAds::V13::Resour" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ChangeStatusOperationProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.ChangeStatusResourceTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_ChangeStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_ChangeStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_ChangeStatus_descriptor,
        new java.lang.String[] { "ResourceName", "LastChangeDateTime", "ResourceType", "Campaign", "AdGroup", "ResourceStatus", "AdGroupAd", "AdGroupCriterion", "CampaignCriterion", "Feed", "FeedItem", "AdGroupFeed", "CampaignFeed", "AdGroupBidModifier", "SharedSet", "CampaignSharedSet", "Asset", "CustomerAsset", "CampaignAsset", "AdGroupAsset", "CombinedAudience", "LastChangeDateTime", "Campaign", "AdGroup", "AdGroupAd", "AdGroupCriterion", "CampaignCriterion", "Feed", "FeedItem", "AdGroupFeed", "CampaignFeed", "AdGroupBidModifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.ChangeStatusOperationProto.getDescriptor();
    com.google.ads.googleads.v13.enums.ChangeStatusResourceTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
