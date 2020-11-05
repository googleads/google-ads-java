// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/conversion_upload_service.proto

package com.google.ads.googleads.v5.services;

public final class ConversionUploadServiceProto {
  private ConversionUploadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_UploadClickConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_UploadClickConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_UploadClickConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_UploadClickConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_UploadCallConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_UploadCallConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_UploadCallConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_UploadCallConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_ClickConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_ClickConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_CallConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_CallConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_ExternalAttributionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_ExternalAttributionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_ClickConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_ClickConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_CallConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_CallConversionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v5/services/conve" +
      "rsion_upload_service.proto\022 google.ads.g" +
      "oogleads.v5.services\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\027google/rpc" +
      "/status.proto\"\273\001\n\035UploadClickConversions" +
      "Request\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022K\n\013con" +
      "versions\030\002 \003(\01321.google.ads.googleads.v5" +
      ".services.ClickConversionB\003\340A\002\022\034\n\017partia" +
      "l_failure\030\003 \001(\010B\003\340A\002\022\025\n\rvalidate_only\030\004 " +
      "\001(\010\"\235\001\n\036UploadClickConversionsResponse\0221" +
      "\n\025partial_failure_error\030\001 \001(\0132\022.google.r" +
      "pc.Status\022H\n\007results\030\002 \003(\01327.google.ads." +
      "googleads.v5.services.ClickConversionRes" +
      "ult\"\271\001\n\034UploadCallConversionsRequest\022\030\n\013" +
      "customer_id\030\001 \001(\tB\003\340A\002\022J\n\013conversions\030\002 " +
      "\003(\01320.google.ads.googleads.v5.services.C" +
      "allConversionB\003\340A\002\022\034\n\017partial_failure\030\003 " +
      "\001(\010B\003\340A\002\022\025\n\rvalidate_only\030\004 \001(\010\"\233\001\n\035Uplo" +
      "adCallConversionsResponse\0221\n\025partial_fai" +
      "lure_error\030\001 \001(\0132\022.google.rpc.Status\022G\n\007" +
      "results\030\002 \003(\01326.google.ads.googleads.v5." +
      "services.CallConversionResult\"\205\003\n\017ClickC" +
      "onversion\022\022\n\005gclid\030\t \001(\tH\000\210\001\001\022\036\n\021convers" +
      "ion_action\030\n \001(\tH\001\210\001\001\022!\n\024conversion_date" +
      "_time\030\013 \001(\tH\002\210\001\001\022\035\n\020conversion_value\030\014 \001" +
      "(\001H\003\210\001\001\022\032\n\rcurrency_code\030\r \001(\tH\004\210\001\001\022\025\n\010o" +
      "rder_id\030\016 \001(\tH\005\210\001\001\022\\\n\031external_attributi" +
      "on_data\030\007 \001(\01329.google.ads.googleads.v5." +
      "services.ExternalAttributionDataB\010\n\006_gcl" +
      "idB\024\n\022_conversion_actionB\027\n\025_conversion_" +
      "date_timeB\023\n\021_conversion_valueB\020\n\016_curre" +
      "ncy_codeB\013\n\t_order_id\"\306\002\n\016CallConversion" +
      "\022\026\n\tcaller_id\030\007 \001(\tH\000\210\001\001\022!\n\024call_start_d" +
      "ate_time\030\010 \001(\tH\001\210\001\001\022\036\n\021conversion_action" +
      "\030\t \001(\tH\002\210\001\001\022!\n\024conversion_date_time\030\n \001(" +
      "\tH\003\210\001\001\022\035\n\020conversion_value\030\013 \001(\001H\004\210\001\001\022\032\n" +
      "\rcurrency_code\030\014 \001(\tH\005\210\001\001B\014\n\n_caller_idB" +
      "\027\n\025_call_start_date_timeB\024\n\022_conversion_" +
      "actionB\027\n\025_conversion_date_timeB\023\n\021_conv" +
      "ersion_valueB\020\n\016_currency_code\"\253\001\n\027Exter" +
      "nalAttributionData\022(\n\033external_attributi" +
      "on_credit\030\003 \001(\001H\000\210\001\001\022\'\n\032external_attribu" +
      "tion_model\030\004 \001(\tH\001\210\001\001B\036\n\034_external_attri" +
      "bution_creditB\035\n\033_external_attribution_m" +
      "odel\"\247\001\n\025ClickConversionResult\022\022\n\005gclid\030" +
      "\004 \001(\tH\000\210\001\001\022\036\n\021conversion_action\030\005 \001(\tH\001\210" +
      "\001\001\022!\n\024conversion_date_time\030\006 \001(\tH\002\210\001\001B\010\n" +
      "\006_gclidB\024\n\022_conversion_actionB\027\n\025_conver" +
      "sion_date_time\"\352\001\n\024CallConversionResult\022" +
      "\026\n\tcaller_id\030\005 \001(\tH\000\210\001\001\022!\n\024call_start_da" +
      "te_time\030\006 \001(\tH\001\210\001\001\022\036\n\021conversion_action\030" +
      "\007 \001(\tH\002\210\001\001\022!\n\024conversion_date_time\030\010 \001(\t" +
      "H\003\210\001\001B\014\n\n_caller_idB\027\n\025_call_start_date_" +
      "timeB\024\n\022_conversion_actionB\027\n\025_conversio" +
      "n_date_time2\304\004\n\027ConversionUploadService\022" +
      "\206\002\n\026UploadClickConversions\022?.google.ads." +
      "googleads.v5.services.UploadClickConvers" +
      "ionsRequest\032@.google.ads.googleads.v5.se" +
      "rvices.UploadClickConversionsResponse\"i\202" +
      "\323\344\223\0029\"4/v5/customers/{customer_id=*}:upl" +
      "oadClickConversions:\001*\332A\'customer_id,con" +
      "versions,partial_failure\022\202\002\n\025UploadCallC" +
      "onversions\022>.google.ads.googleads.v5.ser" +
      "vices.UploadCallConversionsRequest\032?.goo" +
      "gle.ads.googleads.v5.services.UploadCall" +
      "ConversionsResponse\"h\202\323\344\223\0028\"3/v5/custome" +
      "rs/{customer_id=*}:uploadCallConversions" +
      ":\001*\332A\'customer_id,conversions,partial_fa" +
      "ilure\032\033\312A\030googleads.googleapis.comB\203\002\n$c" +
      "om.google.ads.googleads.v5.servicesB\034Con" +
      "versionUploadServiceProtoP\001ZHgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v5/services;services\242\002\003GAA\252\002 Google.Ads" +
      ".GoogleAds.V5.Services\312\002 Google\\Ads\\Goog" +
      "leAds\\V5\\Services\352\002$Google::Ads::GoogleA" +
      "ds::V5::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_services_UploadClickConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_services_UploadClickConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_UploadClickConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v5_services_UploadClickConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_services_UploadClickConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_UploadClickConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v5_services_UploadCallConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v5_services_UploadCallConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_UploadCallConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v5_services_UploadCallConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v5_services_UploadCallConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_UploadCallConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v5_services_ClickConversion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v5_services_ClickConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_ClickConversion_descriptor,
        new java.lang.String[] { "Gclid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", "ExternalAttributionData", "Gclid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", });
    internal_static_google_ads_googleads_v5_services_CallConversion_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v5_services_CallConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_CallConversion_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", });
    internal_static_google_ads_googleads_v5_services_ExternalAttributionData_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v5_services_ExternalAttributionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_ExternalAttributionData_descriptor,
        new java.lang.String[] { "ExternalAttributionCredit", "ExternalAttributionModel", "ExternalAttributionCredit", "ExternalAttributionModel", });
    internal_static_google_ads_googleads_v5_services_ClickConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v5_services_ClickConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_ClickConversionResult_descriptor,
        new java.lang.String[] { "Gclid", "ConversionAction", "ConversionDateTime", "Gclid", "ConversionAction", "ConversionDateTime", });
    internal_static_google_ads_googleads_v5_services_CallConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v5_services_CallConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_CallConversionResult_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
