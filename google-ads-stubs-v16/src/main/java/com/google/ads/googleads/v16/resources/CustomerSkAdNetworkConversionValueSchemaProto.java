// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/customer_sk_ad_network_conversion_value_schema.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

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
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nWgoogle/ads/googleads/v16/resources/cus" +
      "tomer_sk_ad_network_conversion_value_sch" +
      "ema.proto\022\"google.ads.googleads.v16.reso" +
      "urces\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\205\017\n(CustomerSk" +
      "AdNetworkConversionValueSchema\022`\n\rresour" +
      "ce_name\030\001 \001(\tBI\340A\003\372AC\nAgoogleads.googlea" +
      "pis.com/CustomerSkAdNetworkConversionVal" +
      "ueSchema\022\202\001\n\006schema\030\002 \001(\0132m.google.ads.g" +
      "oogleads.v16.resources.CustomerSkAdNetwo" +
      "rkConversionValueSchema.SkAdNetworkConve" +
      "rsionValueSchemaB\003\340A\003\032\322\013\n SkAdNetworkCon" +
      "versionValueSchema\022\026\n\006app_id\030\001 \001(\tB\006\340A\002\340" +
      "A\003\022%\n\030measurement_window_hours\030\002 \001(\005B\003\340A" +
      "\003\022\306\001\n&fine_grained_conversion_value_mapp" +
      "ings\030\003 \003(\0132\220\001.google.ads.googleads.v16.r" +
      "esources.CustomerSkAdNetworkConversionVa" +
      "lueSchema.SkAdNetworkConversionValueSche" +
      "ma.FineGrainedConversionValueMappingsB\003\340" +
      "A\003\032\377\001\n\"FineGrainedConversionValueMapping" +
      "s\022*\n\035fine_grained_conversion_value\030\001 \001(\005" +
      "B\003\340A\003\022\254\001\n\030conversion_value_mapping\030\002 \001(\013" +
      "2\204\001.google.ads.googleads.v16.resources.C" +
      "ustomerSkAdNetworkConversionValueSchema." +
      "SkAdNetworkConversionValueSchema.Convers" +
      "ionValueMappingB\003\340A\003\032\376\001\n\026ConversionValue" +
      "Mapping\022(\n\033min_time_post_install_hours\030\001" +
      " \001(\003B\003\340A\003\022(\n\033max_time_post_install_hours" +
      "\030\002 \001(\003B\003\340A\003\022\217\001\n\rmapped_events\030\003 \003(\0132s.go" +
      "ogle.ads.googleads.v16.resources.Custome" +
      "rSkAdNetworkConversionValueSchema.SkAdNe" +
      "tworkConversionValueSchema.EventB\003\340A\003\032\242\005" +
      "\n\005Event\022\036\n\021mapped_event_name\030\001 \001(\tB\003\340A\003\022" +
      "\032\n\rcurrency_code\030\002 \001(\tB\003\340A\003\022\245\001\n\023event_re" +
      "venue_range\030\003 \001(\0132\200\001.google.ads.googlead" +
      "s.v16.resources.CustomerSkAdNetworkConve" +
      "rsionValueSchema.SkAdNetworkConversionVa" +
      "lueSchema.Event.RevenueRangeB\003\340A\003H\000\022\"\n\023e" +
      "vent_revenue_value\030\004 \001(\001B\003\340A\003H\000\022\260\001\n\026even" +
      "t_occurrence_range\030\005 \001(\0132\210\001.google.ads.g" +
      "oogleads.v16.resources.CustomerSkAdNetwo" +
      "rkConversionValueSchema.SkAdNetworkConve" +
      "rsionValueSchema.Event.EventOccurrenceRa" +
      "ngeB\003\340A\003H\001\022\034\n\revent_counter\030\006 \001(\003B\003\340A\003H\001" +
      "\032N\n\014RevenueRange\022\036\n\021min_event_revenue\030\003 " +
      "\001(\001B\003\340A\003\022\036\n\021max_event_revenue\030\004 \001(\001B\003\340A\003" +
      "\032R\n\024EventOccurrenceRange\022\034\n\017min_event_co" +
      "unt\030\001 \001(\003B\003\340A\003\022\034\n\017max_event_count\030\002 \001(\003B" +
      "\003\340A\003B\016\n\014revenue_rateB\014\n\nevent_rate:\234\001\352A\230" +
      "\001\nAgoogleads.googleapis.com/CustomerSkAd" +
      "NetworkConversionValueSchema\022Scustomers/" +
      "{customer_id}/customerSkAdNetworkConvers" +
      "ionValueSchemas/{account_link_id}B\237\002\n&co" +
      "m.google.ads.googleads.v16.resourcesB-Cu" +
      "stomerSkAdNetworkConversionValueSchemaPr" +
      "otoP\001ZKgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v16/resources;resourc" +
      "es\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V16.Reso" +
      "urces\312\002\"Google\\Ads\\GoogleAds\\V16\\Resourc" +
      "es\352\002&Google::Ads::GoogleAds::V16::Resour" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_descriptor,
        new java.lang.String[] { "ResourceName", "Schema", });
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor =
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor,
        new java.lang.String[] { "AppId", "MeasurementWindowHours", "FineGrainedConversionValueMappings", });
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_descriptor =
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_FineGrainedConversionValueMappings_descriptor,
        new java.lang.String[] { "FineGrainedConversionValue", "ConversionValueMapping", });
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_descriptor =
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_ConversionValueMapping_descriptor,
        new java.lang.String[] { "MinTimePostInstallHours", "MaxTimePostInstallHours", "MappedEvents", });
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor =
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor,
        new java.lang.String[] { "MappedEventName", "CurrencyCode", "EventRevenueRange", "EventRevenueValue", "EventOccurrenceRange", "EventCounter", "RevenueRate", "EventRate", });
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_descriptor =
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_RevenueRange_descriptor,
        new java.lang.String[] { "MinEventRevenue", "MaxEventRevenue", });
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_descriptor =
      internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_CustomerSkAdNetworkConversionValueSchema_SkAdNetworkConversionValueSchema_Event_EventOccurrenceRange_descriptor,
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
