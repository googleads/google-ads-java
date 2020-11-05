// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/ad_group.proto

package com.google.ads.googleads.v4.resources;

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
    internal_static_google_ads_googleads_v4_resources_AdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_AdGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v4/resources/ad_g" +
      "roup.proto\022!google.ads.googleads.v4.reso" +
      "urces\0325google/ads/googleads/v4/common/cu" +
      "stom_parameter.proto\032Dgoogle/ads/googlea" +
      "ds/v4/common/explorer_auto_optimizer_set" +
      "ting.proto\0326google/ads/googleads/v4/comm" +
      "on/targeting_setting.proto\032=google/ads/g" +
      "oogleads/v4/enums/ad_group_ad_rotation_m" +
      "ode.proto\0323google/ads/googleads/v4/enums" +
      "/ad_group_status.proto\0321google/ads/googl" +
      "eads/v4/enums/ad_group_type.proto\0322googl" +
      "e/ads/googleads/v4/enums/bidding_source." +
      "proto\0327google/ads/googleads/v4/enums/tar" +
      "geting_dimension.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032\036google/protobuf/wrappers.proto\032\034goog" +
      "le/api/annotations.proto\"\340\017\n\007AdGroup\022?\n\r" +
      "resource_name\030\001 \001(\tB(\340A\005\372A\"\n googleads.g" +
      "oogleapis.com/AdGroup\022,\n\002id\030\003 \001(\0132\033.goog" +
      "le.protobuf.Int64ValueB\003\340A\003\022*\n\004name\030\004 \001(" +
      "\0132\034.google.protobuf.StringValue\022N\n\006statu" +
      "s\030\005 \001(\0162>.google.ads.googleads.v4.enums." +
      "AdGroupStatusEnum.AdGroupStatus\022M\n\004type\030" +
      "\014 \001(\0162:.google.ads.googleads.v4.enums.Ad" +
      "GroupTypeEnum.AdGroupTypeB\003\340A\005\022h\n\020ad_rot" +
      "ation_mode\030\026 \001(\0162N.google.ads.googleads." +
      "v4.enums.AdGroupAdRotationModeEnum.AdGro" +
      "upAdRotationMode\022]\n\rbase_ad_group\030\022 \001(\0132" +
      "\034.google.protobuf.StringValueB(\340A\003\372A\"\n g" +
      "oogleads.googleapis.com/AdGroup\022;\n\025track" +
      "ing_url_template\030\r \001(\0132\034.google.protobuf" +
      ".StringValue\022N\n\025url_custom_parameters\030\006 " +
      "\003(\0132/.google.ads.googleads.v4.common.Cus" +
      "tomParameter\022Y\n\010campaign\030\n \001(\0132\034.google." +
      "protobuf.StringValueB)\340A\005\372A#\n!googleads." +
      "googleapis.com/Campaign\0223\n\016cpc_bid_micro" +
      "s\030\016 \001(\0132\033.google.protobuf.Int64Value\0223\n\016" +
      "cpm_bid_micros\030\017 \001(\0132\033.google.protobuf.I" +
      "nt64Value\0226\n\021target_cpa_micros\030\033 \001(\0132\033.g" +
      "oogle.protobuf.Int64Value\0228\n\016cpv_bid_mic" +
      "ros\030\021 \001(\0132\033.google.protobuf.Int64ValueB\003" +
      "\340A\003\0226\n\021target_cpm_micros\030\032 \001(\0132\033.google." +
      "protobuf.Int64Value\0221\n\013target_roas\030\036 \001(\013" +
      "2\034.google.protobuf.DoubleValue\022;\n\026percen" +
      "t_cpc_bid_micros\030\024 \001(\0132\033.google.protobuf" +
      ".Int64Value\022e\n\037explorer_auto_optimizer_s" +
      "etting\030\025 \001(\0132<.google.ads.googleads.v4.c" +
      "ommon.ExplorerAutoOptimizerSetting\022n\n\034di" +
      "splay_custom_bid_dimension\030\027 \001(\0162H.googl" +
      "e.ads.googleads.v4.enums.TargetingDimens" +
      "ionEnum.TargetingDimension\0226\n\020final_url_" +
      "suffix\030\030 \001(\0132\034.google.protobuf.StringVal" +
      "ue\022K\n\021targeting_setting\030\031 \001(\01320.google.a" +
      "ds.googleads.v4.common.TargetingSetting\022" +
      "E\n\033effective_target_cpa_micros\030\034 \001(\0132\033.g" +
      "oogle.protobuf.Int64ValueB\003\340A\003\022h\n\033effect" +
      "ive_target_cpa_source\030\035 \001(\0162>.google.ads" +
      ".googleads.v4.enums.BiddingSourceEnum.Bi" +
      "ddingSourceB\003\340A\003\022@\n\025effective_target_roa" +
      "s\030\037 \001(\0132\034.google.protobuf.DoubleValueB\003\340" +
      "A\003\022i\n\034effective_target_roas_source\030  \001(\016" +
      "2>.google.ads.googleads.v4.enums.Bidding" +
      "SourceEnum.BiddingSourceB\003\340A\003\022[\n\006labels\030" +
      "! \003(\0132\034.google.protobuf.StringValueB-\340A\003" +
      "\372A\'\n%googleads.googleapis.com/AdGroupLab" +
      "el:O\352AL\n googleads.googleapis.com/AdGrou" +
      "p\022(customers/{customer}/adGroups/{ad_gro" +
      "up}B\371\001\n%com.google.ads.googleads.v4.reso" +
      "urcesB\014AdGroupProtoP\001ZJgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v4/re" +
      "sources;resources\242\002\003GAA\252\002!Google.Ads.Goo" +
      "gleAds.V4.Resources\312\002!Google\\Ads\\GoogleA" +
      "ds\\V4\\Resources\352\002%Google::Ads::GoogleAds" +
      "::V4::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v4.common.ExplorerAutoOptimizerSettingProto.getDescriptor(),
          com.google.ads.googleads.v4.common.TargetingSettingProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.AdGroupAdRotationModeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.AdGroupStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.AdGroupTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.TargetingDimensionProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_AdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_AdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_AdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "AdRotationMode", "BaseAdGroup", "TrackingUrlTemplate", "UrlCustomParameters", "Campaign", "CpcBidMicros", "CpmBidMicros", "TargetCpaMicros", "CpvBidMicros", "TargetCpmMicros", "TargetRoas", "PercentCpcBidMicros", "ExplorerAutoOptimizerSetting", "DisplayCustomBidDimension", "FinalUrlSuffix", "TargetingSetting", "EffectiveTargetCpaMicros", "EffectiveTargetCpaSource", "EffectiveTargetRoas", "EffectiveTargetRoasSource", "Labels", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v4.common.ExplorerAutoOptimizerSettingProto.getDescriptor();
    com.google.ads.googleads.v4.common.TargetingSettingProto.getDescriptor();
    com.google.ads.googleads.v4.enums.AdGroupAdRotationModeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.AdGroupStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.AdGroupTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v4.enums.TargetingDimensionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
