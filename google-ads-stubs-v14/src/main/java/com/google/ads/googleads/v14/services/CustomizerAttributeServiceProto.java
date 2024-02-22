// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/customizer_attribute_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public final class CustomizerAttributeServiceProto {
  private CustomizerAttributeServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_CustomizerAttributeOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_CustomizerAttributeOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributeResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributeResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v14/services/cust" +
      "omizer_attribute_service.proto\022!google.a" +
      "ds.googleads.v14.services\032:google/ads/go" +
      "ogleads/v14/enums/response_content_type." +
      "proto\032=google/ads/googleads/v14/resource" +
      "s/customizer_attribute.proto\032\034google/api" +
      "/annotations.proto\032\027google/api/client.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\032 google/protobuf" +
      "/field_mask.proto\032\027google/rpc/status.pro" +
      "to\"\263\002\n!MutateCustomizerAttributesRequest" +
      "\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022X\n\noperations" +
      "\030\002 \003(\0132?.google.ads.googleads.v14.servic" +
      "es.CustomizerAttributeOperationB\003\340A\002\022\027\n\017" +
      "partial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004" +
      " \001(\010\022j\n\025response_content_type\030\005 \001(\0162K.go" +
      "ogle.ads.googleads.v14.enums.ResponseCon" +
      "tentTypeEnum.ResponseContentType\"\354\001\n\034Cus" +
      "tomizerAttributeOperation\022/\n\013update_mask" +
      "\030\004 \001(\0132\032.google.protobuf.FieldMask\022I\n\006cr" +
      "eate\030\001 \001(\01327.google.ads.googleads.v14.re" +
      "sources.CustomizerAttributeH\000\022C\n\006remove\030" +
      "\002 \001(\tB1\372A.\n,googleads.googleapis.com/Cus" +
      "tomizerAttributeH\000B\013\n\toperation\"\254\001\n\"Muta" +
      "teCustomizerAttributesResponse\022S\n\007result" +
      "s\030\001 \003(\0132B.google.ads.googleads.v14.servi" +
      "ces.MutateCustomizerAttributeResult\0221\n\025p" +
      "artial_failure_error\030\002 \001(\0132\022.google.rpc." +
      "Status\"\302\001\n\037MutateCustomizerAttributeResu" +
      "lt\022H\n\rresource_name\030\001 \001(\tB1\372A.\n,googlead" +
      "s.googleapis.com/CustomizerAttribute\022U\n\024" +
      "customizer_attribute\030\002 \001(\01327.google.ads." +
      "googleads.v14.resources.CustomizerAttrib" +
      "ute2\357\002\n\032CustomizerAttributeService\022\211\002\n\032M" +
      "utateCustomizerAttributes\022D.google.ads.g" +
      "oogleads.v14.services.MutateCustomizerAt" +
      "tributesRequest\032E.google.ads.googleads.v" +
      "14.services.MutateCustomizerAttributesRe" +
      "sponse\"^\332A\026customer_id,operations\202\323\344\223\002?\"" +
      ":/v14/customers/{customer_id=*}/customiz" +
      "erAttributes:mutate:\001*\032E\312A\030googleads.goo" +
      "gleapis.com\322A\'https://www.googleapis.com" +
      "/auth/adwordsB\213\002\n%com.google.ads.googlea" +
      "ds.v14.servicesB\037CustomizerAttributeServ" +
      "iceProtoP\001ZIgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v14/services;ser" +
      "vices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V14.S" +
      "ervices\312\002!Google\\Ads\\GoogleAds\\V14\\Servi" +
      "ces\352\002%Google::Ads::GoogleAds::V14::Servi" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.resources.CustomizerAttributeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v14_services_CustomizerAttributeOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_CustomizerAttributeOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_CustomizerAttributeOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributesResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributeResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributeResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomizerAttributeResult_descriptor,
        new java.lang.String[] { "ResourceName", "CustomizerAttribute", });
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
    com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v14.resources.CustomizerAttributeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
