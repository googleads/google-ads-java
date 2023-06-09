// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/ad_group.proto

package com.google.ads.googleads.v14.resources;

public final class AdGroupProto {
  private AdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_AdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_AdGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_AdGroup_AudienceSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_AdGroup_AudienceSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v14/resources/ad_" +
      "group.proto\022\"google.ads.googleads.v14.re" +
      "sources\0326google/ads/googleads/v14/common" +
      "/custom_parameter.proto\0327google/ads/goog" +
      "leads/v14/common/targeting_setting.proto" +
      "\032>google/ads/googleads/v14/enums/ad_grou" +
      "p_ad_rotation_mode.proto\0324google/ads/goo" +
      "gleads/v14/enums/ad_group_status.proto\0322" +
      "google/ads/googleads/v14/enums/ad_group_" +
      "type.proto\0325google/ads/googleads/v14/enu" +
      "ms/asset_field_type.proto\0323google/ads/go" +
      "ogleads/v14/enums/asset_set_type.proto\0323" +
      "google/ads/googleads/v14/enums/bidding_s" +
      "ource.proto\0328google/ads/googleads/v14/en" +
      "ums/targeting_dimension.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\200\022\n\007AdGroup\022@\n\rresource_name\030\001" +
      " \001(\tB)\342A\001\005\372A\"\n googleads.googleapis.com/" +
      "AdGroup\022\025\n\002id\030\" \001(\003B\004\342A\001\003H\000\210\001\001\022\021\n\004name\030#" +
      " \001(\tH\001\210\001\001\022O\n\006status\030\005 \001(\0162?.google.ads.g" +
      "oogleads.v14.enums.AdGroupStatusEnum.AdG" +
      "roupStatus\022O\n\004type\030\014 \001(\0162;.google.ads.go" +
      "ogleads.v14.enums.AdGroupTypeEnum.AdGrou" +
      "pTypeB\004\342A\001\005\022i\n\020ad_rotation_mode\030\026 \001(\0162O." +
      "google.ads.googleads.v14.enums.AdGroupAd" +
      "RotationModeEnum.AdGroupAdRotationMode\022E" +
      "\n\rbase_ad_group\030$ \001(\tB)\342A\001\003\372A\"\n googlead" +
      "s.googleapis.com/AdGroupH\002\210\001\001\022\"\n\025trackin" +
      "g_url_template\030% \001(\tH\003\210\001\001\022O\n\025url_custom_" +
      "parameters\030\006 \003(\01320.google.ads.googleads." +
      "v14.common.CustomParameter\022A\n\010campaign\030&" +
      " \001(\tB*\342A\001\005\372A#\n!googleads.googleapis.com/" +
      "CampaignH\004\210\001\001\022\033\n\016cpc_bid_micros\030\' \001(\003H\005\210" +
      "\001\001\022+\n\030effective_cpc_bid_micros\0309 \001(\003B\004\342A" +
      "\001\003H\006\210\001\001\022\033\n\016cpm_bid_micros\030( \001(\003H\007\210\001\001\022\036\n\021" +
      "target_cpa_micros\030) \001(\003H\010\210\001\001\022\033\n\016cpv_bid_" +
      "micros\030* \001(\003H\t\210\001\001\022\036\n\021target_cpm_micros\030+" +
      " \001(\003H\n\210\001\001\022\030\n\013target_roas\030, \001(\001H\013\210\001\001\022#\n\026p" +
      "ercent_cpc_bid_micros\030- \001(\003H\014\210\001\001\022#\n\033opti" +
      "mized_targeting_enabled\030; \001(\010\022o\n\034display" +
      "_custom_bid_dimension\030\027 \001(\0162I.google.ads" +
      ".googleads.v14.enums.TargetingDimensionE" +
      "num.TargetingDimension\022\035\n\020final_url_suff" +
      "ix\030. \001(\tH\r\210\001\001\022L\n\021targeting_setting\030\031 \001(\013" +
      "21.google.ads.googleads.v14.common.Targe" +
      "tingSetting\022[\n\020audience_setting\0308 \001(\0132;." +
      "google.ads.googleads.v14.resources.AdGro" +
      "up.AudienceSettingB\004\342A\001\005\022.\n\033effective_ta" +
      "rget_cpa_micros\030/ \001(\003B\004\342A\001\003H\016\210\001\001\022j\n\033effe" +
      "ctive_target_cpa_source\030\035 \001(\0162?.google.a" +
      "ds.googleads.v14.enums.BiddingSourceEnum" +
      ".BiddingSourceB\004\342A\001\003\022(\n\025effective_target" +
      "_roas\0300 \001(\001B\004\342A\001\003H\017\210\001\001\022k\n\034effective_targ" +
      "et_roas_source\030  \001(\0162?.google.ads.google" +
      "ads.v14.enums.BiddingSourceEnum.BiddingS" +
      "ourceB\004\342A\001\003\022>\n\006labels\0301 \003(\tB.\342A\001\003\372A\'\n%go" +
      "ogleads.googleapis.com/AdGroupLabel\022l\n!e" +
      "xcluded_parent_asset_field_types\0306 \003(\0162A" +
      ".google.ads.googleads.v14.enums.AssetFie" +
      "ldTypeEnum.AssetFieldType\022f\n\037excluded_pa" +
      "rent_asset_set_types\030: \003(\0162=.google.ads." +
      "googleads.v14.enums.AssetSetTypeEnum.Ass" +
      "etSetType\0325\n\017AudienceSetting\022\"\n\024use_audi" +
      "ence_grouped\030\001 \001(\010B\004\342A\001\005:U\352AR\n googleads" +
      ".googleapis.com/AdGroup\022.customers/{cust" +
      "omer_id}/adGroups/{ad_group_id}B\005\n\003_idB\007" +
      "\n\005_nameB\020\n\016_base_ad_groupB\030\n\026_tracking_u" +
      "rl_templateB\013\n\t_campaignB\021\n\017_cpc_bid_mic" +
      "rosB\033\n\031_effective_cpc_bid_microsB\021\n\017_cpm" +
      "_bid_microsB\024\n\022_target_cpa_microsB\021\n\017_cp" +
      "v_bid_microsB\024\n\022_target_cpm_microsB\016\n\014_t" +
      "arget_roasB\031\n\027_percent_cpc_bid_microsB\023\n" +
      "\021_final_url_suffixB\036\n\034_effective_target_" +
      "cpa_microsB\030\n\026_effective_target_roasB\376\001\n" +
      "&com.google.ads.googleads.v14.resourcesB" +
      "\014AdGroupProtoP\001ZKgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v14/resourc" +
      "es;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAd" +
      "s.V14.Resources\312\002\"Google\\Ads\\GoogleAds\\V" +
      "14\\Resources\352\002&Google::Ads::GoogleAds::V" +
      "14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v14.common.TargetingSettingProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AdGroupAdRotationModeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AdGroupStatusProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AdGroupTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AssetSetTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.TargetingDimensionProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_AdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_AdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_AdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "AdRotationMode", "BaseAdGroup", "TrackingUrlTemplate", "UrlCustomParameters", "Campaign", "CpcBidMicros", "EffectiveCpcBidMicros", "CpmBidMicros", "TargetCpaMicros", "CpvBidMicros", "TargetCpmMicros", "TargetRoas", "PercentCpcBidMicros", "OptimizedTargetingEnabled", "DisplayCustomBidDimension", "FinalUrlSuffix", "TargetingSetting", "AudienceSetting", "EffectiveTargetCpaMicros", "EffectiveTargetCpaSource", "EffectiveTargetRoas", "EffectiveTargetRoasSource", "Labels", "ExcludedParentAssetFieldTypes", "ExcludedParentAssetSetTypes", "Id", "Name", "BaseAdGroup", "TrackingUrlTemplate", "Campaign", "CpcBidMicros", "EffectiveCpcBidMicros", "CpmBidMicros", "TargetCpaMicros", "CpvBidMicros", "TargetCpmMicros", "TargetRoas", "PercentCpcBidMicros", "FinalUrlSuffix", "EffectiveTargetCpaMicros", "EffectiveTargetRoas", });
    internal_static_google_ads_googleads_v14_resources_AdGroup_AudienceSetting_descriptor =
      internal_static_google_ads_googleads_v14_resources_AdGroup_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_AdGroup_AudienceSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_AdGroup_AudienceSetting_descriptor,
        new java.lang.String[] { "UseAudienceGrouped", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v14.common.TargetingSettingProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AdGroupAdRotationModeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AdGroupStatusProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AdGroupTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AssetSetTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v14.enums.TargetingDimensionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
