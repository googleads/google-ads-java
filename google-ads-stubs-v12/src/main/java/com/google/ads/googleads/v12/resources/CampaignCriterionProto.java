// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/campaign_criterion.proto

package com.google.ads.googleads.v12.resources;

public final class CampaignCriterionProto {
  private CampaignCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_CampaignCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_CampaignCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v12/resources/cam" +
      "paign_criterion.proto\022\"google.ads.google" +
      "ads.v12.resources\032.google/ads/googleads/" +
      "v12/common/criteria.proto\032>google/ads/go" +
      "ogleads/v12/enums/campaign_criterion_sta" +
      "tus.proto\0323google/ads/googleads/v12/enum" +
      "s/criterion_type.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\"\350\027\n\021CampaignCriterion\022J\n\rresource_nam" +
      "e\030\001 \001(\tB3\342A\001\005\372A,\n*googleads.googleapis.c" +
      "om/CampaignCriterion\022A\n\010campaign\030% \001(\tB*" +
      "\342A\001\005\372A#\n!googleads.googleapis.com/Campai" +
      "gnH\001\210\001\001\022\037\n\014criterion_id\030& \001(\003B\004\342A\001\003H\002\210\001\001" +
      "\022\032\n\014display_name\030+ \001(\tB\004\342A\001\003\022\031\n\014bid_modi" +
      "fier\030\' \001(\002H\003\210\001\001\022\033\n\010negative\030( \001(\010B\004\342A\001\005H" +
      "\004\210\001\001\022S\n\004type\030\006 \001(\0162?.google.ads.googlead" +
      "s.v12.enums.CriterionTypeEnum.CriterionT" +
      "ypeB\004\342A\001\003\022c\n\006status\030# \001(\0162S.google.ads.g" +
      "oogleads.v12.enums.CampaignCriterionStat" +
      "usEnum.CampaignCriterionStatus\022E\n\007keywor" +
      "d\030\010 \001(\0132,.google.ads.googleads.v12.commo" +
      "n.KeywordInfoB\004\342A\001\005H\000\022I\n\tplacement\030\t \001(\013" +
      "2..google.ads.googleads.v12.common.Place" +
      "mentInfoB\004\342A\001\005H\000\022[\n\023mobile_app_category\030" +
      "\n \001(\01326.google.ads.googleads.v12.common." +
      "MobileAppCategoryInfoB\004\342A\001\005H\000\022Z\n\022mobile_" +
      "application\030\013 \001(\01326.google.ads.googleads" +
      ".v12.common.MobileApplicationInfoB\004\342A\001\005H" +
      "\000\022G\n\010location\030\014 \001(\0132-.google.ads.googlea" +
      "ds.v12.common.LocationInfoB\004\342A\001\005H\000\022C\n\006de" +
      "vice\030\r \001(\0132+.google.ads.googleads.v12.co" +
      "mmon.DeviceInfoB\004\342A\001\005H\000\022L\n\013ad_schedule\030\017" +
      " \001(\0132/.google.ads.googleads.v12.common.A" +
      "dScheduleInfoB\004\342A\001\005H\000\022H\n\tage_range\030\020 \001(\013" +
      "2-.google.ads.googleads.v12.common.AgeRa" +
      "ngeInfoB\004\342A\001\005H\000\022C\n\006gender\030\021 \001(\0132+.google" +
      ".ads.googleads.v12.common.GenderInfoB\004\342A" +
      "\001\005H\000\022N\n\014income_range\030\022 \001(\01320.google.ads." +
      "googleads.v12.common.IncomeRangeInfoB\004\342A" +
      "\001\005H\000\022T\n\017parental_status\030\023 \001(\01323.google.a" +
      "ds.googleads.v12.common.ParentalStatusIn" +
      "foB\004\342A\001\005H\000\022H\n\tuser_list\030\026 \001(\0132-.google.a" +
      "ds.googleads.v12.common.UserListInfoB\004\342A" +
      "\001\005H\000\022P\n\ryoutube_video\030\024 \001(\01321.google.ads" +
      ".googleads.v12.common.YouTubeVideoInfoB\004" +
      "\342A\001\005H\000\022T\n\017youtube_channel\030\025 \001(\01323.google" +
      ".ads.googleads.v12.common.YouTubeChannel" +
      "InfoB\004\342A\001\005H\000\022I\n\tproximity\030\027 \001(\0132..google" +
      ".ads.googleads.v12.common.ProximityInfoB" +
      "\004\342A\001\005H\000\022A\n\005topic\030\030 \001(\0132*.google.ads.goog" +
      "leads.v12.common.TopicInfoB\004\342A\001\005H\000\022P\n\rli" +
      "sting_scope\030\031 \001(\01321.google.ads.googleads" +
      ".v12.common.ListingScopeInfoB\004\342A\001\005H\000\022G\n\010" +
      "language\030\032 \001(\0132-.google.ads.googleads.v1" +
      "2.common.LanguageInfoB\004\342A\001\005H\000\022F\n\010ip_bloc" +
      "k\030\033 \001(\0132,.google.ads.googleads.v12.commo" +
      "n.IpBlockInfoB\004\342A\001\005H\000\022P\n\rcontent_label\030\034" +
      " \001(\01321.google.ads.googleads.v12.common.C" +
      "ontentLabelInfoB\004\342A\001\005H\000\022E\n\007carrier\030\035 \001(\013" +
      "2,.google.ads.googleads.v12.common.Carri" +
      "erInfoB\004\342A\001\005H\000\022P\n\ruser_interest\030\036 \001(\01321." +
      "google.ads.googleads.v12.common.UserInte" +
      "restInfoB\004\342A\001\005H\000\022E\n\007webpage\030\037 \001(\0132,.goog" +
      "le.ads.googleads.v12.common.WebpageInfoB" +
      "\004\342A\001\005H\000\022e\n\030operating_system_version\030  \001(" +
      "\0132;.google.ads.googleads.v12.common.Oper" +
      "atingSystemVersionInfoB\004\342A\001\005H\000\022P\n\rmobile" +
      "_device\030! \001(\01321.google.ads.googleads.v12" +
      ".common.MobileDeviceInfoB\004\342A\001\005H\000\022R\n\016loca" +
      "tion_group\030\" \001(\01322.google.ads.googleads." +
      "v12.common.LocationGroupInfoB\004\342A\001\005H\000\022T\n\017" +
      "custom_affinity\030$ \001(\01323.google.ads.googl" +
      "eads.v12.common.CustomAffinityInfoB\004\342A\001\005" +
      "H\000\022T\n\017custom_audience\030) \001(\01323.google.ads" +
      ".googleads.v12.common.CustomAudienceInfo" +
      "B\004\342A\001\005H\000\022X\n\021combined_audience\030* \001(\01325.go" +
      "ogle.ads.googleads.v12.common.CombinedAu" +
      "dienceInfoB\004\342A\001\005H\000\022P\n\rkeyword_theme\030- \001(" +
      "\01321.google.ads.googleads.v12.common.Keyw" +
      "ordThemeInfoB\004\342A\001\005H\000:v\352As\n*googleads.goo" +
      "gleapis.com/CampaignCriterion\022Ecustomers" +
      "/{customer_id}/campaignCriteria/{campaig" +
      "n_id}~{criterion_id}B\013\n\tcriterionB\013\n\t_ca" +
      "mpaignB\017\n\r_criterion_idB\017\n\r_bid_modifier" +
      "B\013\n\t_negativeB\210\002\n&com.google.ads.googlea" +
      "ds.v12.resourcesB\026CampaignCriterionProto" +
      "P\001ZKgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v12/resources;resources\242" +
      "\002\003GAA\252\002\"Google.Ads.GoogleAds.V12.Resourc" +
      "es\312\002\"Google\\Ads\\GoogleAds\\V12\\Resources\352" +
      "\002&Google::Ads::GoogleAds::V12::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.CampaignCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.CriterionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_CampaignCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_CampaignCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_CampaignCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "DisplayName", "BidModifier", "Negative", "Type", "Status", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "Location", "Device", "AdSchedule", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Proximity", "Topic", "ListingScope", "Language", "IpBlock", "ContentLabel", "Carrier", "UserInterest", "Webpage", "OperatingSystemVersion", "MobileDevice", "LocationGroup", "CustomAffinity", "CustomAudience", "CombinedAudience", "KeywordTheme", "Criterion", "Campaign", "CriterionId", "BidModifier", "Negative", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v12.enums.CampaignCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v12.enums.CriterionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
