// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/ad_group_customizer_service.proto

package com.google.ads.googleads.v13.services;

public final class AdGroupCustomizerServiceProto {
  private AdGroupCustomizerServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_AdGroupCustomizerOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_AdGroupCustomizerOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizerResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizerResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v13/services/ad_g" +
      "roup_customizer_service.proto\022!google.ad" +
      "s.googleads.v13.services\032:google/ads/goo" +
      "gleads/v13/enums/response_content_type.p" +
      "roto\032<google/ads/googleads/v13/resources" +
      "/ad_group_customizer.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032\027google/rpc/status" +
      ".proto\"\261\002\n\037MutateAdGroupCustomizersReque" +
      "st\022\031\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022W\n\noperati" +
      "ons\030\002 \003(\0132=.google.ads.googleads.v13.ser" +
      "vices.AdGroupCustomizerOperationB\004\342A\001\002\022\027" +
      "\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_only" +
      "\030\004 \001(\010\022j\n\025response_content_type\030\005 \001(\0162K." +
      "google.ads.googleads.v13.enums.ResponseC" +
      "ontentTypeEnum.ResponseContentType\"\265\001\n\032A" +
      "dGroupCustomizerOperation\022G\n\006create\030\001 \001(" +
      "\01325.google.ads.googleads.v13.resources.A" +
      "dGroupCustomizerH\000\022A\n\006remove\030\002 \001(\tB/\372A,\n" +
      "*googleads.googleapis.com/AdGroupCustomi" +
      "zerH\000B\013\n\toperation\"\250\001\n MutateAdGroupCust" +
      "omizersResponse\022Q\n\007results\030\001 \003(\0132@.googl" +
      "e.ads.googleads.v13.services.MutateAdGro" +
      "upCustomizerResult\0221\n\025partial_failure_er" +
      "ror\030\002 \001(\0132\022.google.rpc.Status\"\273\001\n\035Mutate" +
      "AdGroupCustomizerResult\022F\n\rresource_name" +
      "\030\001 \001(\tB/\372A,\n*googleads.googleapis.com/Ad" +
      "GroupCustomizer\022R\n\023ad_group_customizer\030\002" +
      " \001(\01325.google.ads.googleads.v13.resource" +
      "s.AdGroupCustomizer2\345\002\n\030AdGroupCustomize" +
      "rService\022\201\002\n\030MutateAdGroupCustomizers\022B." +
      "google.ads.googleads.v13.services.Mutate" +
      "AdGroupCustomizersRequest\032C.google.ads.g" +
      "oogleads.v13.services.MutateAdGroupCusto" +
      "mizersResponse\"\\\332A\026customer_id,operation" +
      "s\202\323\344\223\002=\"8/v13/customers/{customer_id=*}/" +
      "adGroupCustomizers:mutate:\001*\032E\312A\030googlea" +
      "ds.googleapis.com\322A\'https://www.googleap" +
      "is.com/auth/adwordsB\211\002\n%com.google.ads.g" +
      "oogleads.v13.servicesB\035AdGroupCustomizer" +
      "ServiceProtoP\001ZIgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v13/services" +
      ";services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V" +
      "13.Services\312\002!Google\\Ads\\GoogleAds\\V13\\S" +
      "ervices\352\002%Google::Ads::GoogleAds::V13::S" +
      "ervicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.resources.AdGroupCustomizerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v13_services_AdGroupCustomizerOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_AdGroupCustomizerOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_AdGroupCustomizerOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizersResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizerResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizerResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupCustomizerResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCustomizer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v13.resources.AdGroupCustomizerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
