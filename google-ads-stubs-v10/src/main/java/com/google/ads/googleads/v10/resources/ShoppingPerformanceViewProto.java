// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/shopping_performance_view.proto

package com.google.ads.googleads.v10.resources;

public final class ShoppingPerformanceViewProto {
  private ShoppingPerformanceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ShoppingPerformanceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ShoppingPerformanceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v10/resources/sho" +
      "pping_performance_view.proto\022\"google.ads" +
      ".googleads.v10.resources\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"\322\001\n\027ShoppingPerformanceView\022O\n\rreso" +
      "urce_name\030\001 \001(\tB8\340A\003\372A2\n0googleads.googl" +
      "eapis.com/ShoppingPerformanceView:f\352Ac\n0" +
      "googleads.googleapis.com/ShoppingPerform" +
      "anceView\022/customers/{customer_id}/shoppi" +
      "ngPerformanceViewB\216\002\n&com.google.ads.goo" +
      "gleads.v10.resourcesB\034ShoppingPerformanc" +
      "eViewProtoP\001ZKgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v10/resources;" +
      "resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V" +
      "10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\" +
      "Resources\352\002&Google::Ads::GoogleAds::V10:" +
      ":Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ShoppingPerformanceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ShoppingPerformanceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ShoppingPerformanceView_descriptor,
        new java.lang.String[] { "ResourceName", });
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
