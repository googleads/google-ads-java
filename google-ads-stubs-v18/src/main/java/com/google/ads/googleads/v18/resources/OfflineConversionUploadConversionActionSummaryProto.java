// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/offline_conversion_upload_conversion_action_summary.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public final class OfflineConversionUploadConversionActionSummaryProto {
  private OfflineConversionUploadConversionActionSummaryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadConversionActionSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadConversionActionSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\\google/ads/googleads/v18/resources/off" +
      "line_conversion_upload_conversion_action" +
      "_summary.proto\022\"google.ads.googleads.v18" +
      ".resources\032Ngoogle/ads/googleads/v18/enu" +
      "ms/offline_conversion_diagnostic_status_" +
      "enum.proto\032Egoogle/ads/googleads/v18/enu" +
      "ms/offline_event_upload_client_enum.prot" +
      "o\032Qgoogle/ads/googleads/v18/resources/of" +
      "fline_conversion_upload_client_summary.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\"\224\010\n.OfflineConv" +
      "ersionUploadConversionActionSummary\022f\n\rr" +
      "esource_name\030\001 \001(\tBO\340A\003\372AI\nGgoogleads.go" +
      "ogleapis.com/OfflineConversionUploadConv" +
      "ersionActionSummary\022j\n\006client\030\002 \001(\0162U.go" +
      "ogle.ads.googleads.v18.enums.OfflineEven" +
      "tUploadClientEnum.OfflineEventUploadClie" +
      "ntB\003\340A\003\022!\n\024conversion_action_id\030\003 \001(\003B\003\340" +
      "A\003\022#\n\026conversion_action_name\030\004 \001(\tB\003\340A\003\022" +
      "|\n\006status\030\005 \001(\0162g.google.ads.googleads.v" +
      "18.enums.OfflineConversionDiagnosticStat" +
      "usEnum.OfflineConversionDiagnosticStatus" +
      "B\003\340A\003\022\036\n\021total_event_count\030\006 \001(\003B\003\340A\003\022#\n" +
      "\026successful_event_count\030\007 \001(\003B\003\340A\003\022 \n\023pe" +
      "nding_event_count\030\010 \001(\003B\003\340A\003\022\"\n\025last_upl" +
      "oad_date_time\030\t \001(\tB\003\340A\003\022Z\n\017daily_summar" +
      "ies\030\n \003(\0132<.google.ads.googleads.v18.res" +
      "ources.OfflineConversionSummaryB\003\340A\003\022X\n\r" +
      "job_summaries\030\013 \003(\0132<.google.ads.googlea" +
      "ds.v18.resources.OfflineConversionSummar" +
      "yB\003\340A\003\022O\n\006alerts\030\014 \003(\0132:.google.ads.goog" +
      "leads.v18.resources.OfflineConversionAle" +
      "rtB\003\340A\003:\265\001\352A\261\001\nGgoogleads.googleapis.com" +
      "/OfflineConversionUploadConversionAction" +
      "Summary\022fcustomers/{customer_id}/offline" +
      "ConversionUploadConversionActionSummarie" +
      "s/{conversion_type_id}~{client}B\245\002\n&com." +
      "google.ads.googleads.v18.resourcesB3Offl" +
      "ineConversionUploadConversionActionSumma" +
      "ryProtoP\001ZKgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v18/resources;res" +
      "ources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V18." +
      "Resources\312\002\"Google\\Ads\\GoogleAds\\V18\\Res" +
      "ources\352\002&Google::Ads::GoogleAds::V18::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.OfflineConversionDiagnosticStatusEnumProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.OfflineEventUploadClientEnumProto.getDescriptor(),
          com.google.ads.googleads.v18.resources.OfflineConversionUploadClientSummaryProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadConversionActionSummary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadConversionActionSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadConversionActionSummary_descriptor,
        new java.lang.String[] { "ResourceName", "Client", "ConversionActionId", "ConversionActionName", "Status", "TotalEventCount", "SuccessfulEventCount", "PendingEventCount", "LastUploadDateTime", "DailySummaries", "JobSummaries", "Alerts", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.enums.OfflineConversionDiagnosticStatusEnumProto.getDescriptor();
    com.google.ads.googleads.v18.enums.OfflineEventUploadClientEnumProto.getDescriptor();
    com.google.ads.googleads.v18.resources.OfflineConversionUploadClientSummaryProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
