// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/keyword_plan_common.proto

package com.google.ads.googleads.v10.common;

public final class KeywordPlanCommonProto {
  private KeywordPlanCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordAnnotations_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordAnnotations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_KeywordConcept_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_KeywordConcept_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_ConceptGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_ConceptGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v10/common/keywor" +
      "d_plan_common.proto\022\037google.ads.googlead" +
      "s.v10.common\032+google/ads/googleads/v10/c" +
      "ommon/dates.proto\032+google/ads/googleads/" +
      "v10/enums/device.proto\032Ggoogle/ads/googl" +
      "eads/v10/enums/keyword_plan_aggregate_me" +
      "tric_type.proto\032Cgoogle/ads/googleads/v1" +
      "0/enums/keyword_plan_competition_level.p" +
      "roto\032Dgoogle/ads/googleads/v10/enums/key" +
      "word_plan_concept_group_type.proto\0322goog" +
      "le/ads/googleads/v10/enums/month_of_year" +
      ".proto\"\242\004\n\034KeywordPlanHistoricalMetrics\022" +
      "!\n\024avg_monthly_searches\030\007 \001(\003H\000\210\001\001\022T\n\026mo" +
      "nthly_search_volumes\030\006 \003(\01324.google.ads." +
      "googleads.v10.common.MonthlySearchVolume" +
      "\022p\n\013competition\030\002 \001(\0162[.google.ads.googl" +
      "eads.v10.enums.KeywordPlanCompetitionLev" +
      "elEnum.KeywordPlanCompetitionLevel\022\036\n\021co" +
      "mpetition_index\030\010 \001(\003H\001\210\001\001\022\'\n\032low_top_of" +
      "_page_bid_micros\030\t \001(\003H\002\210\001\001\022(\n\033high_top_" +
      "of_page_bid_micros\030\n \001(\003H\003\210\001\001\022\037\n\022average" +
      "_cpc_micros\030\013 \001(\003H\004\210\001\001B\027\n\025_avg_monthly_s" +
      "earchesB\024\n\022_competition_indexB\035\n\033_low_to" +
      "p_of_page_bid_microsB\036\n\034_high_top_of_pag" +
      "e_bid_microsB\025\n\023_average_cpc_micros\"\234\001\n\030" +
      "HistoricalMetricsOptions\022N\n\020year_month_r" +
      "ange\030\001 \001(\0132/.google.ads.googleads.v10.co" +
      "mmon.YearMonthRangeH\000\210\001\001\022\033\n\023include_aver" +
      "age_cpc\030\002 \001(\010B\023\n\021_year_month_range\"\261\001\n\023M" +
      "onthlySearchVolume\022\021\n\004year\030\004 \001(\003H\000\210\001\001\022J\n" +
      "\005month\030\002 \001(\0162;.google.ads.googleads.v10." +
      "enums.MonthOfYearEnum.MonthOfYear\022\035\n\020mon" +
      "thly_searches\030\005 \001(\003H\001\210\001\001B\007\n\005_yearB\023\n\021_mo" +
      "nthly_searches\"\241\001\n\033KeywordPlanAggregateM" +
      "etrics\022\201\001\n\026aggregate_metric_types\030\001 \003(\0162" +
      "a.google.ads.googleads.v10.enums.Keyword" +
      "PlanAggregateMetricTypeEnum.KeywordPlanA" +
      "ggregateMetricType\"x\n!KeywordPlanAggrega" +
      "teMetricResults\022S\n\017device_searches\030\001 \003(\013" +
      "2:.google.ads.googleads.v10.common.Keywo" +
      "rdPlanDeviceSearches\"\212\001\n\031KeywordPlanDevi" +
      "ceSearches\022A\n\006device\030\001 \001(\01621.google.ads." +
      "googleads.v10.enums.DeviceEnum.Device\022\031\n" +
      "\014search_count\030\002 \001(\003H\000\210\001\001B\017\n\r_search_coun" +
      "t\"W\n\022KeywordAnnotations\022A\n\010concepts\030\001 \003(" +
      "\0132/.google.ads.googleads.v10.common.Keyw" +
      "ordConcept\"d\n\016KeywordConcept\022\014\n\004name\030\001 \001" +
      "(\t\022D\n\rconcept_group\030\002 \001(\0132-.google.ads.g" +
      "oogleads.v10.common.ConceptGroup\"\207\001\n\014Con" +
      "ceptGroup\022\014\n\004name\030\001 \001(\t\022i\n\004type\030\002 \001(\0162[." +
      "google.ads.googleads.v10.enums.KeywordPl" +
      "anConceptGroupTypeEnum.KeywordPlanConcep" +
      "tGroupTypeB\366\001\n#com.google.ads.googleads." +
      "v10.commonB\026KeywordPlanCommonProtoP\001ZEgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v10/common;common\242\002\003GAA\252\002\037Goog" +
      "le.Ads.GoogleAds.V10.Common\312\002\037Google\\Ads" +
      "\\GoogleAds\\V10\\Common\352\002#Google::Ads::Goo" +
      "gleAds::V10::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.DatesProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.KeywordPlanAggregateMetricTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.KeywordPlanCompetitionLevelProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.KeywordPlanConceptGroupTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.MonthOfYearProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordPlanHistoricalMetrics_descriptor,
        new java.lang.String[] { "AvgMonthlySearches", "MonthlySearchVolumes", "Competition", "CompetitionIndex", "LowTopOfPageBidMicros", "HighTopOfPageBidMicros", "AverageCpcMicros", "AvgMonthlySearches", "CompetitionIndex", "LowTopOfPageBidMicros", "HighTopOfPageBidMicros", "AverageCpcMicros", });
    internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_HistoricalMetricsOptions_descriptor,
        new java.lang.String[] { "YearMonthRange", "IncludeAverageCpc", "YearMonthRange", });
    internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_MonthlySearchVolume_descriptor,
        new java.lang.String[] { "Year", "Month", "MonthlySearches", "Year", "MonthlySearches", });
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetrics_descriptor,
        new java.lang.String[] { "AggregateMetricTypes", });
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordPlanAggregateMetricResults_descriptor,
        new java.lang.String[] { "DeviceSearches", });
    internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordPlanDeviceSearches_descriptor,
        new java.lang.String[] { "Device", "SearchCount", "SearchCount", });
    internal_static_google_ads_googleads_v10_common_KeywordAnnotations_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v10_common_KeywordAnnotations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordAnnotations_descriptor,
        new java.lang.String[] { "Concepts", });
    internal_static_google_ads_googleads_v10_common_KeywordConcept_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v10_common_KeywordConcept_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_KeywordConcept_descriptor,
        new java.lang.String[] { "Name", "ConceptGroup", });
    internal_static_google_ads_googleads_v10_common_ConceptGroup_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v10_common_ConceptGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_ConceptGroup_descriptor,
        new java.lang.String[] { "Name", "Type", });
    com.google.ads.googleads.v10.common.DatesProto.getDescriptor();
    com.google.ads.googleads.v10.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v10.enums.KeywordPlanAggregateMetricTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.KeywordPlanCompetitionLevelProto.getDescriptor();
    com.google.ads.googleads.v10.enums.KeywordPlanConceptGroupTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.MonthOfYearProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
