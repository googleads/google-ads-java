// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v3.services;

public final class ConversionAdjustmentUploadServiceProto {
  private ConversionAdjustmentUploadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_ConversionAdjustment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_ConversionAdjustment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_RestatementValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_RestatementValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GclidDateTimePair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GclidDateTimePair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKgoogle/ads/googleads/v3/services/conve" +
      "rsion_adjustment_upload_service.proto\022 g" +
      "oogle.ads.googleads.v3.services\032>google/" +
      "ads/googleads/v3/enums/conversion_adjust" +
      "ment_type.proto\032\034google/api/annotations." +
      "proto\032\027google/api/client.proto\032\037google/a" +
      "pi/field_behavior.proto\032\036google/protobuf" +
      "/wrappers.proto\032\027google/rpc/status.proto" +
      "\"\320\001\n\"UploadConversionAdjustmentsRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022[\n\026conversion_" +
      "adjustments\030\002 \003(\01326.google.ads.googleads" +
      ".v3.services.ConversionAdjustmentB\003\340A\002\022\034" +
      "\n\017partial_failure\030\003 \001(\010B\003\340A\002\022\025\n\rvalidate" +
      "_only\030\004 \001(\010\"\247\001\n#UploadConversionAdjustme" +
      "ntsResponse\0221\n\025partial_failure_error\030\001 \001" +
      "(\0132\022.google.rpc.Status\022M\n\007results\030\002 \003(\0132" +
      "<.google.ads.googleads.v3.services.Conve" +
      "rsionAdjustmentResult\"\351\003\n\024ConversionAdju" +
      "stment\0227\n\021conversion_action\030\003 \001(\0132\034.goog" +
      "le.protobuf.StringValue\022:\n\024adjustment_da" +
      "te_time\030\004 \001(\0132\034.google.protobuf.StringVa" +
      "lue\022m\n\017adjustment_type\030\005 \001(\0162T.google.ad" +
      "s.googleads.v3.enums.ConversionAdjustmen" +
      "tTypeEnum.ConversionAdjustmentType\022M\n\021re" +
      "statement_value\030\006 \001(\01322.google.ads.googl" +
      "eads.v3.services.RestatementValue\022S\n\024gcl" +
      "id_date_time_pair\030\001 \001(\01323.google.ads.goo" +
      "gleads.v3.services.GclidDateTimePairH\000\0220" +
      "\n\010order_id\030\002 \001(\0132\034.google.protobuf.Strin" +
      "gValueH\000B\027\n\025conversion_identifier\"}\n\020Res" +
      "tatementValue\0224\n\016adjusted_value\030\001 \001(\0132\034." +
      "google.protobuf.DoubleValue\0223\n\rcurrency_" +
      "code\030\002 \001(\0132\034.google.protobuf.StringValue" +
      "\"|\n\021GclidDateTimePair\022+\n\005gclid\030\001 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\022:\n\024conversion" +
      "_date_time\030\002 \001(\0132\034.google.protobuf.Strin" +
      "gValue\"\240\003\n\032ConversionAdjustmentResult\0227\n" +
      "\021conversion_action\030\003 \001(\0132\034.google.protob" +
      "uf.StringValue\022:\n\024adjustment_date_time\030\004" +
      " \001(\0132\034.google.protobuf.StringValue\022m\n\017ad" +
      "justment_type\030\005 \001(\0162T.google.ads.googlea" +
      "ds.v3.enums.ConversionAdjustmentTypeEnum" +
      ".ConversionAdjustmentType\022S\n\024gclid_date_" +
      "time_pair\030\001 \001(\01323.google.ads.googleads.v" +
      "3.services.GclidDateTimePairH\000\0220\n\010order_" +
      "id\030\002 \001(\0132\034.google.protobuf.StringValueH\000" +
      "B\027\n\025conversion_identifier2\350\002\n!Conversion" +
      "AdjustmentUploadService\022\245\002\n\033UploadConver" +
      "sionAdjustments\022D.google.ads.googleads.v" +
      "3.services.UploadConversionAdjustmentsRe" +
      "quest\032E.google.ads.googleads.v3.services" +
      ".UploadConversionAdjustmentsResponse\"y\202\323" +
      "\344\223\002>\"9/v3/customers/{customer_id=*}:uplo" +
      "adConversionAdjustments:\001*\332A2customer_id" +
      ",conversion_adjustments,partial_failure\032" +
      "\033\312A\030googleads.googleapis.comB\215\002\n$com.goo" +
      "gle.ads.googleads.v3.servicesB&Conversio" +
      "nAdjustmentUploadServiceProtoP\001ZHgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v3/services;services\242\002\003GAA\252\002 Google" +
      ".Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\" +
      "GoogleAds\\V3\\Services\352\002$Google::Ads::Goo" +
      "gleAds::V3::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.enums.ConversionAdjustmentTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "ConversionAdjustments", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_ConversionAdjustment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_ConversionAdjustment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_ConversionAdjustment_descriptor,
        new java.lang.String[] { "ConversionAction", "AdjustmentDateTime", "AdjustmentType", "RestatementValue", "GclidDateTimePair", "OrderId", "ConversionIdentifier", });
    internal_static_google_ads_googleads_v3_services_RestatementValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_RestatementValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_RestatementValue_descriptor,
        new java.lang.String[] { "AdjustedValue", "CurrencyCode", });
    internal_static_google_ads_googleads_v3_services_GclidDateTimePair_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_GclidDateTimePair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GclidDateTimePair_descriptor,
        new java.lang.String[] { "Gclid", "ConversionDateTime", });
    internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_descriptor,
        new java.lang.String[] { "ConversionAction", "AdjustmentDateTime", "AdjustmentType", "GclidDateTimePair", "OrderId", "ConversionIdentifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.ConversionAdjustmentTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
