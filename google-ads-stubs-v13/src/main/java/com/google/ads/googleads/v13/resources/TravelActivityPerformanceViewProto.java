// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/travel_activity_performance_view.proto

package com.google.ads.googleads.v13.resources;

public final class TravelActivityPerformanceViewProto {
  private TravelActivityPerformanceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_TravelActivityPerformanceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_TravelActivityPerformanceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v13/resources/tra" +
      "vel_activity_performance_view.proto\022\"goo" +
      "gle.ads.googleads.v13.resources\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\"\354\001\n\035TravelActivityPerformanc" +
      "eView\022V\n\rresource_name\030\001 \001(\tB?\342A\001\003\372A8\n6g" +
      "oogleads.googleapis.com/TravelActivityPe" +
      "rformanceView:s\352Ap\n6googleads.googleapis" +
      ".com/TravelActivityPerformanceView\0226cust" +
      "omers/{customer_id}/travelActivityPerfor" +
      "manceViewsB\224\002\n&com.google.ads.googleads." +
      "v13.resourcesB\"TravelActivityPerformance" +
      "ViewProtoP\001ZKgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v13/resources;r" +
      "esources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V1" +
      "3.Resources\312\002\"Google\\Ads\\GoogleAds\\V13\\R" +
      "esources\352\002&Google::Ads::GoogleAds::V13::" +
      "Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_TravelActivityPerformanceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_TravelActivityPerformanceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_TravelActivityPerformanceView_descriptor,
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
