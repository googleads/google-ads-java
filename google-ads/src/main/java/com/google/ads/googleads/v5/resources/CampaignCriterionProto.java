// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/campaign_criterion.proto

package com.google.ads.googleads.v5.resources;

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
    internal_static_google_ads_googleads_v5_resources_CampaignCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_CampaignCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v5/resources/camp" +
      "aign_criterion.proto\022!google.ads.googlea" +
      "ds.v5.resources\032-google/ads/googleads/v5" +
      "/common/criteria.proto\032=google/ads/googl" +
      "eads/v5/enums/campaign_criterion_status." +
      "proto\0322google/ads/googleads/v5/enums/cri" +
      "terion_type.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\034g" +
      "oogle/api/annotations.proto\"\202\025\n\021Campaign" +
      "Criterion\022I\n\rresource_name\030\001 \001(\tB2\340A\005\372A," +
      "\n*googleads.googleapis.com/CampaignCrite" +
      "rion\022@\n\010campaign\030% \001(\tB)\340A\005\372A#\n!googlead" +
      "s.googleapis.com/CampaignH\001\210\001\001\022\036\n\014criter" +
      "ion_id\030& \001(\003B\003\340A\003H\002\210\001\001\022\031\n\014bid_modifier\030\'" +
      " \001(\002H\003\210\001\001\022\032\n\010negative\030( \001(\010B\003\340A\005H\004\210\001\001\022Q\n" +
      "\004type\030\006 \001(\0162>.google.ads.googleads.v5.en" +
      "ums.CriterionTypeEnum.CriterionTypeB\003\340A\003" +
      "\022b\n\006status\030# \001(\0162R.google.ads.googleads." +
      "v5.enums.CampaignCriterionStatusEnum.Cam" +
      "paignCriterionStatus\022C\n\007keyword\030\010 \001(\0132+." +
      "google.ads.googleads.v5.common.KeywordIn" +
      "foB\003\340A\005H\000\022G\n\tplacement\030\t \001(\0132-.google.ad" +
      "s.googleads.v5.common.PlacementInfoB\003\340A\005" +
      "H\000\022Y\n\023mobile_app_category\030\n \001(\01325.google" +
      ".ads.googleads.v5.common.MobileAppCatego" +
      "ryInfoB\003\340A\005H\000\022X\n\022mobile_application\030\013 \001(" +
      "\01325.google.ads.googleads.v5.common.Mobil" +
      "eApplicationInfoB\003\340A\005H\000\022E\n\010location\030\014 \001(" +
      "\0132,.google.ads.googleads.v5.common.Locat" +
      "ionInfoB\003\340A\005H\000\022A\n\006device\030\r \001(\0132*.google." +
      "ads.googleads.v5.common.DeviceInfoB\003\340A\005H" +
      "\000\022J\n\013ad_schedule\030\017 \001(\0132..google.ads.goog" +
      "leads.v5.common.AdScheduleInfoB\003\340A\005H\000\022F\n" +
      "\tage_range\030\020 \001(\0132,.google.ads.googleads." +
      "v5.common.AgeRangeInfoB\003\340A\005H\000\022A\n\006gender\030" +
      "\021 \001(\0132*.google.ads.googleads.v5.common.G" +
      "enderInfoB\003\340A\005H\000\022L\n\014income_range\030\022 \001(\0132/" +
      ".google.ads.googleads.v5.common.IncomeRa" +
      "ngeInfoB\003\340A\005H\000\022R\n\017parental_status\030\023 \001(\0132" +
      "2.google.ads.googleads.v5.common.Parenta" +
      "lStatusInfoB\003\340A\005H\000\022F\n\tuser_list\030\026 \001(\0132,." +
      "google.ads.googleads.v5.common.UserListI" +
      "nfoB\003\340A\005H\000\022N\n\ryoutube_video\030\024 \001(\01320.goog" +
      "le.ads.googleads.v5.common.YouTubeVideoI" +
      "nfoB\003\340A\005H\000\022R\n\017youtube_channel\030\025 \001(\01322.go" +
      "ogle.ads.googleads.v5.common.YouTubeChan" +
      "nelInfoB\003\340A\005H\000\022G\n\tproximity\030\027 \001(\0132-.goog" +
      "le.ads.googleads.v5.common.ProximityInfo" +
      "B\003\340A\005H\000\022?\n\005topic\030\030 \001(\0132).google.ads.goog" +
      "leads.v5.common.TopicInfoB\003\340A\005H\000\022N\n\rlist" +
      "ing_scope\030\031 \001(\01320.google.ads.googleads.v" +
      "5.common.ListingScopeInfoB\003\340A\005H\000\022E\n\010lang" +
      "uage\030\032 \001(\0132,.google.ads.googleads.v5.com" +
      "mon.LanguageInfoB\003\340A\005H\000\022D\n\010ip_block\030\033 \001(" +
      "\0132+.google.ads.googleads.v5.common.IpBlo" +
      "ckInfoB\003\340A\005H\000\022N\n\rcontent_label\030\034 \001(\01320.g" +
      "oogle.ads.googleads.v5.common.ContentLab" +
      "elInfoB\003\340A\005H\000\022C\n\007carrier\030\035 \001(\0132+.google." +
      "ads.googleads.v5.common.CarrierInfoB\003\340A\005" +
      "H\000\022N\n\ruser_interest\030\036 \001(\01320.google.ads.g" +
      "oogleads.v5.common.UserInterestInfoB\003\340A\005" +
      "H\000\022C\n\007webpage\030\037 \001(\0132+.google.ads.googlea" +
      "ds.v5.common.WebpageInfoB\003\340A\005H\000\022c\n\030opera" +
      "ting_system_version\030  \001(\0132:.google.ads.g" +
      "oogleads.v5.common.OperatingSystemVersio" +
      "nInfoB\003\340A\005H\000\022N\n\rmobile_device\030! \001(\01320.go" +
      "ogle.ads.googleads.v5.common.MobileDevic" +
      "eInfoB\003\340A\005H\000\022P\n\016location_group\030\" \001(\01321.g" +
      "oogle.ads.googleads.v5.common.LocationGr" +
      "oupInfoB\003\340A\005H\000\022R\n\017custom_affinity\030$ \001(\0132" +
      "2.google.ads.googleads.v5.common.CustomA" +
      "ffinityInfoB\003\340A\005H\000:k\352Ah\n*googleads.googl" +
      "eapis.com/CampaignCriterion\022:customers/{" +
      "customer}/campaignCriteria/{campaign_cri" +
      "terion}B\013\n\tcriterionB\013\n\t_campaignB\017\n\r_cr" +
      "iterion_idB\017\n\r_bid_modifierB\013\n\t_negative" +
      "B\203\002\n%com.google.ads.googleads.v5.resourc" +
      "esB\026CampaignCriterionProtoP\001ZJgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v5/resources;resources\242\002\003GAA\252\002!Google." +
      "Ads.GoogleAds.V5.Resources\312\002!Google\\Ads\\" +
      "GoogleAds\\V5\\Resources\352\002%Google::Ads::Go" +
      "ogleAds::V5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.CampaignCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.CriterionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_CampaignCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_CampaignCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_CampaignCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "BidModifier", "Negative", "Type", "Status", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "Location", "Device", "AdSchedule", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Proximity", "Topic", "ListingScope", "Language", "IpBlock", "ContentLabel", "Carrier", "UserInterest", "Webpage", "OperatingSystemVersion", "MobileDevice", "LocationGroup", "CustomAffinity", "Criterion", "Campaign", "CriterionId", "BidModifier", "Negative", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v5.enums.CampaignCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v5.enums.CriterionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
