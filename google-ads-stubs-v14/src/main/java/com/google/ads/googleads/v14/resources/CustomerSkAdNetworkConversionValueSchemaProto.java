// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/customer_sk_ad_network_conversion_value_schema.proto

package com.google.ads.googleads.v14.resources;

public final class CustomerSkAdNetworkConversionValueSchemaProto {
  private CustomerSkAdNetworkConversionValueSchemaProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nWgoogle/ads/googleads/v14/resources/cus" +
      "tomer_sk_ad_network_conversion_value_sch" +
      "ema.proto\022\"google.ads.googleads.v14.reso" +
      "urces\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\227\017\n(CustomerSk" +
      "AdNetworkConversionValueSchema\022a\n\rresour" +
      "ce_name\030\001 \001(\tBJ\342A\001\003\372AC\nAgoogleads.google" +
      "apis.com/CustomerSkAdNetworkConversionVa" +
      "lueSchema\022\203\001\n\006schema\030\002 \001(\0132m.google.ads." +
      "googleads.v14.resources.CustomerSkAdNetw" +
      "orkConversionValueSchema.SkAdNetworkConv" +
      "ersionValueSchemaB\004\342A\001\003\032\342\013\n SkAdNetworkC" +
      "onversionValueSchema\022\025\n\006app_id\030\001 \001(\tB\005\342A" +
      "\002\002\003\022&\n\030measurement_window_hours\030\002 \001(\005B\004\342" +
      "A\001\003\022\307\001\n&fine_grained_conversion_value_ma" +
      "ppings\030\003 \003(\0132\220\001.google.ads.googleads.v14" +
      ".resources.CustomerSkAdNetworkConversion" +
      "ValueSchema.SkAdNetworkConversionValueSc" +
      "hema.FineGrainedConversionValueMappingsB" +
      "\004\342A\001\003\032\201\002\n\"FineGrainedConversionValueMapp" +
      "ings\022+\n\035fine_grained_conversion_value\030\001 " +
      "\001(\005B\004\342A\001\003\022\255\001\n\030conversion_value_mapping\030\002" +
      " \001(\0132\204\001.google.ads.googleads.v14.resourc" +
      "es.CustomerSkAdNetworkConversionValueSch" +
      "ema.SkAdNetworkConversionValueSchema.Con" +
      "versionValueMappingB\004\342A\001\003\032\201\002\n\026Conversion" +
      "ValueMapping\022)\n\033min_time_post_install_ho" +
      "urs\030\001 \001(\003B\004\342A\001\003\022)\n\033max_time_post_install" +
      "_hours\030\002 \001(\003B\004\342A\001\003\022\220\001\n\rmapped_events\030\003 \003" +
      "(\0132s.google.ads.googleads.v14.resources." +
      "CustomerSkAdNetworkConversionValueSchema" +
      ".SkAdNetworkConversionValueSchema.EventB" +
      "\004\342A\001\003\032\254\005\n\005Event\022\037\n\021mapped_event_name\030\001 \001" +
      "(\tB\004\342A\001\003\022\033\n\rcurrency_code\030\002 \001(\tB\004\342A\001\003\022\246\001" +
      "\n\023event_revenue_range\030\003 \001(\0132\200\001.google.ad" +
      "s.googleads.v14.resources.CustomerSkAdNe" +
      "tworkConversionValueSchema.SkAdNetworkCo" +
      "nversionValueSchema.Event.RevenueRangeB\004" +
      "\342A\001\003H\000\022#\n\023event_revenue_value\030\004 \001(\001B\004\342A\001" +
      "\003H\000\022\261\001\n\026event_occurrence_range\030\005 \001(\0132\210\001." +
      "google.ads.googleads.v14.resources.Custo" +
      "merSkAdNetworkConversionValueSchema.SkAd" +
      "NetworkConversionValueSchema.Event.Event" +
      "OccurrenceRangeB\004\342A\001\003H\001\022\035\n\revent_counter" +
      "\030\006 \001(\003B\004\342A\001\003H\001\032P\n\014RevenueRange\022\037\n\021min_ev" +
      "ent_revenue\030\003 \001(\001B\004\342A\001\003\022\037\n\021max_event_rev" +
      "enue\030\004 \001(\001B\004\342A\001\003\032T\n\024EventOccurrenceRange" +
      "\022\035\n\017min_event_count\030\001 \001(\003B\004\342A\001\003\022\035\n\017max_e" +
      "vent_count\030\002 \001(\003B\004\342A\001\003B\016\n\014revenue_rateB\014" +
      "\n\nevent_rate:\234\001\352A\230\001\nAgoogleads.googleapi" +
      "s.com/CustomerSkAdNetworkConversionValue" +
      "Schema\022Scustomers/{customer_id}/customer" +
      "SkAdNetworkConversionValueSchemas/{accou" +
      "nt_link_id}B\237\002\n&com.google.ads.googleads" +
      ".v14.resourcesB-CustomerSkAdNetworkConve" +
      "rsionValueSchemaProtoP\001ZKgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v14" +
      "/resources;resources\242\002\003GAA\252\002\"Google.Ads." +
      "GoogleAds.V14.Resources\312\002\"Google\\Ads\\Goo" +
      "gleAds\\V14\\Resources\352\002&Google::Ads::Goog" +
      "leAds::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_descriptor,
        new java.lang.String[] { "ResourceName", "Schema", });
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor =
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor,
        new java.lang.String[] { "AppId", "MeasurementWindowHours", "FineGrainedConversionValueMappings", });
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_descriptor =
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_descriptor,
        new java.lang.String[] { "FineGrainedConversionValue", "ConversionValueMapping", });
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_descriptor =
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_descriptor,
        new java.lang.String[] { "MinTimePostInstallHours", "MaxTimePostInstallHours", "MappedEvents", });
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor =
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor,
        new java.lang.String[] { "MappedEventName", "CurrencyCode", "EventRevenueRange", "EventRevenueValue", "EventOccurrenceRange", "EventCounter", "RevenueRate", "EventRate", });
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_descriptor =
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_descriptor,
        new java.lang.String[] { "MinEventRevenue", "MaxEventRevenue", });
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_descriptor =
      internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_descriptor,
        new java.lang.String[] { "MinEventCount", "MaxEventCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
