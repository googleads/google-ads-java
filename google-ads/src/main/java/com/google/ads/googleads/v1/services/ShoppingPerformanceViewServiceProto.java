// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/shopping_performance_view_service.proto

package com.google.ads.googleads.v1.services;

public final class ShoppingPerformanceViewServiceProto {
  private ShoppingPerformanceViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetShoppingPerformanceViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetShoppingPerformanceViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/ads/googleads/v1/services/shopp" +
      "ing_performance_view_service.proto\022 goog" +
      "le.ads.googleads.v1.services\032Agoogle/ads" +
      "/googleads/v1/resources/shopping_perform" +
      "ance_view.proto\032\034google/api/annotations." +
      "proto\":\n!GetShoppingPerformanceViewReque" +
      "st\022\025\n\rresource_name\030\001 \001(\t2\203\002\n\036ShoppingPe" +
      "rformanceViewService\022\340\001\n\032GetShoppingPerf" +
      "ormanceView\022C.google.ads.googleads.v1.se" +
      "rvices.GetShoppingPerformanceViewRequest" +
      "\032:.google.ads.googleads.v1.resources.Sho" +
      "ppingPerformanceView\"A\202\323\344\223\002;\0229/v1/{resou" +
      "rce_name=customers/*/shoppingPerformance" +
      "View/*}B\212\002\n$com.google.ads.googleads.v1." +
      "servicesB#ShoppingPerformanceViewService" +
      "ProtoP\001ZHgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v1/services;service" +
      "s\242\002\003GAA\252\002 Google.Ads.GoogleAds.V1.Servic" +
      "es\312\002 Google\\Ads\\GoogleAds\\V1\\Services\352\002$" +
      "Google::Ads::GoogleAds::V1::Servicesb\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.ShoppingPerformanceViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetShoppingPerformanceViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetShoppingPerformanceViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetShoppingPerformanceViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.ShoppingPerformanceViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
