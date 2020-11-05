// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/bidding.proto

package com.google.ads.googleads.v5.common;

public final class BiddingProto {
  private BiddingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_Commission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_Commission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_EnhancedCpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_EnhancedCpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_ManualCpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_ManualCpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_ManualCpm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_ManualCpm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_ManualCpv_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_ManualCpv_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_MaximizeConversions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_MaximizeConversions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_MaximizeConversionValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_MaximizeConversionValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_TargetCpa_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_TargetCpa_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_TargetCpm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_TargetCpm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_TargetImpressionShare_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_TargetImpressionShare_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_TargetRoas_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_TargetRoas_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_TargetSpend_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_TargetSpend_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_PercentCpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_PercentCpc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v5/common/bidding" +
      ".proto\022\036google.ads.googleads.v5.common\032D" +
      "google/ads/googleads/v5/enums/target_imp" +
      "ression_share_location.proto\032\036google/pro" +
      "tobuf/wrappers.proto\032\034google/api/annotat" +
      "ions.proto\"L\n\nCommission\022#\n\026commission_r" +
      "ate_micros\030\002 \001(\003H\000\210\001\001B\031\n\027_commission_rat" +
      "e_micros\"\r\n\013EnhancedCpc\"G\n\tManualCpc\022!\n\024" +
      "enhanced_cpc_enabled\030\002 \001(\010H\000\210\001\001B\027\n\025_enha" +
      "nced_cpc_enabled\"\013\n\tManualCpm\"\013\n\tManualC" +
      "pv\"\025\n\023MaximizeConversions\"C\n\027MaximizeCon" +
      "versionValue\022\030\n\013target_roas\030\002 \001(\001H\000\210\001\001B\016" +
      "\n\014_target_roas\"\275\001\n\tTargetCpa\022\036\n\021target_c" +
      "pa_micros\030\004 \001(\003H\000\210\001\001\022#\n\026cpc_bid_ceiling_" +
      "micros\030\005 \001(\003H\001\210\001\001\022!\n\024cpc_bid_floor_micro" +
      "s\030\006 \001(\003H\002\210\001\001B\024\n\022_target_cpa_microsB\031\n\027_c" +
      "pc_bid_ceiling_microsB\027\n\025_cpc_bid_floor_" +
      "micros\"\013\n\tTargetCpm\"\215\002\n\025TargetImpression" +
      "Share\022p\n\010location\030\001 \001(\0162^.google.ads.goo" +
      "gleads.v5.enums.TargetImpressionShareLoc" +
      "ationEnum.TargetImpressionShareLocation\022" +
      "%\n\030location_fraction_micros\030\004 \001(\003H\000\210\001\001\022#" +
      "\n\026cpc_bid_ceiling_micros\030\005 \001(\003H\001\210\001\001B\033\n\031_" +
      "location_fraction_microsB\031\n\027_cpc_bid_cei" +
      "ling_micros\"\262\001\n\nTargetRoas\022\030\n\013target_roa" +
      "s\030\004 \001(\001H\000\210\001\001\022#\n\026cpc_bid_ceiling_micros\030\005" +
      " \001(\003H\001\210\001\001\022!\n\024cpc_bid_floor_micros\030\006 \001(\003H" +
      "\002\210\001\001B\016\n\014_target_roasB\031\n\027_cpc_bid_ceiling" +
      "_microsB\027\n\025_cpc_bid_floor_micros\"\207\001\n\013Tar" +
      "getSpend\022 \n\023target_spend_micros\030\003 \001(\003H\000\210" +
      "\001\001\022#\n\026cpc_bid_ceiling_micros\030\004 \001(\003H\001\210\001\001B" +
      "\026\n\024_target_spend_microsB\031\n\027_cpc_bid_ceil" +
      "ing_micros\"\210\001\n\nPercentCpc\022#\n\026cpc_bid_cei" +
      "ling_micros\030\003 \001(\003H\000\210\001\001\022!\n\024enhanced_cpc_e" +
      "nabled\030\004 \001(\010H\001\210\001\001B\031\n\027_cpc_bid_ceiling_mi" +
      "crosB\027\n\025_enhanced_cpc_enabledB\347\001\n\"com.go" +
      "ogle.ads.googleads.v5.commonB\014BiddingPro" +
      "toP\001ZDgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v5/common;common\242\002\003GAA" +
      "\252\002\036Google.Ads.GoogleAds.V5.Common\312\002\036Goog" +
      "le\\Ads\\GoogleAds\\V5\\Common\352\002\"Google::Ads" +
      "::GoogleAds::V5::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.TargetImpressionShareLocationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_common_Commission_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_common_Commission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_Commission_descriptor,
        new java.lang.String[] { "CommissionRateMicros", "CommissionRateMicros", });
    internal_static_google_ads_googleads_v5_common_EnhancedCpc_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_common_EnhancedCpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_EnhancedCpc_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v5_common_ManualCpc_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v5_common_ManualCpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_ManualCpc_descriptor,
        new java.lang.String[] { "EnhancedCpcEnabled", "EnhancedCpcEnabled", });
    internal_static_google_ads_googleads_v5_common_ManualCpm_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v5_common_ManualCpm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_ManualCpm_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v5_common_ManualCpv_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v5_common_ManualCpv_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_ManualCpv_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v5_common_MaximizeConversions_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v5_common_MaximizeConversions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_MaximizeConversions_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v5_common_MaximizeConversionValue_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v5_common_MaximizeConversionValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_MaximizeConversionValue_descriptor,
        new java.lang.String[] { "TargetRoas", "TargetRoas", });
    internal_static_google_ads_googleads_v5_common_TargetCpa_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v5_common_TargetCpa_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_TargetCpa_descriptor,
        new java.lang.String[] { "TargetCpaMicros", "CpcBidCeilingMicros", "CpcBidFloorMicros", "TargetCpaMicros", "CpcBidCeilingMicros", "CpcBidFloorMicros", });
    internal_static_google_ads_googleads_v5_common_TargetCpm_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v5_common_TargetCpm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_TargetCpm_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v5_common_TargetImpressionShare_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v5_common_TargetImpressionShare_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_TargetImpressionShare_descriptor,
        new java.lang.String[] { "Location", "LocationFractionMicros", "CpcBidCeilingMicros", "LocationFractionMicros", "CpcBidCeilingMicros", });
    internal_static_google_ads_googleads_v5_common_TargetRoas_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v5_common_TargetRoas_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_TargetRoas_descriptor,
        new java.lang.String[] { "TargetRoas", "CpcBidCeilingMicros", "CpcBidFloorMicros", "TargetRoas", "CpcBidCeilingMicros", "CpcBidFloorMicros", });
    internal_static_google_ads_googleads_v5_common_TargetSpend_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v5_common_TargetSpend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_TargetSpend_descriptor,
        new java.lang.String[] { "TargetSpendMicros", "CpcBidCeilingMicros", "TargetSpendMicros", "CpcBidCeilingMicros", });
    internal_static_google_ads_googleads_v5_common_PercentCpc_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_ads_googleads_v5_common_PercentCpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_PercentCpc_descriptor,
        new java.lang.String[] { "CpcBidCeilingMicros", "EnhancedCpcEnabled", "CpcBidCeilingMicros", "EnhancedCpcEnabled", });
    com.google.ads.googleads.v5.enums.TargetImpressionShareLocationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
