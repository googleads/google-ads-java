// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/currency_constant_service.proto

package com.google.ads.googleads.v4.services;

public final class CurrencyConstantServiceProto {
  private CurrencyConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetCurrencyConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetCurrencyConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v4/services/curre" +
      "ncy_constant_service.proto\022 google.ads.g" +
      "oogleads.v4.services\0329google/ads/googlea" +
      "ds/v4/resources/currency_constant.proto\032" +
      "\034google/api/annotations.proto\032\027google/ap" +
      "i/client.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\"f\n\032Ge" +
      "tCurrencyConstantRequest\022H\n\rresource_nam" +
      "e\030\001 \001(\tB1\340A\002\372A+\n)googleads.googleapis.co" +
      "m/CurrencyConstant2\202\002\n\027CurrencyConstantS" +
      "ervice\022\311\001\n\023GetCurrencyConstant\022<.google." +
      "ads.googleads.v4.services.GetCurrencyCon" +
      "stantRequest\0323.google.ads.googleads.v4.r" +
      "esources.CurrencyConstant\"?\202\323\344\223\002)\022\'/v4/{" +
      "resource_name=currencyConstants/*}\332A\rres" +
      "ource_name\032\033\312A\030googleads.googleapis.comB" +
      "\203\002\n$com.google.ads.googleads.v4.services" +
      "B\034CurrencyConstantServiceProtoP\001ZHgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v4/services;services\242\002\003GAA\252\002 Googl" +
      "e.Ads.GoogleAds.V4.Services\312\002 Google\\Ads" +
      "\\GoogleAds\\V4\\Services\352\002$Google::Ads::Go" +
      "ogleAds::V4::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.CurrencyConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetCurrencyConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetCurrencyConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetCurrencyConstantRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.resources.CurrencyConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
