// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/hotel_performance_view.proto

package com.google.ads.googleads.v12.resources;

public final class HotelPerformanceViewProto {
  private HotelPerformanceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_HotelPerformanceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_HotelPerformanceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v12/resources/hot" +
      "el_performance_view.proto\022\"google.ads.go" +
      "ogleads.v12.resources\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\307\001\n\024HotelPerformanceView\022M\n\rresource_n" +
      "ame\030\001 \001(\tB6\342A\001\003\372A/\n-googleads.googleapis" +
      ".com/HotelPerformanceView:`\352A]\n-googlead" +
      "s.googleapis.com/HotelPerformanceView\022,c" +
      "ustomers/{customer_id}/hotelPerformanceV" +
      "iewB\213\002\n&com.google.ads.googleads.v12.res" +
      "ourcesB\031HotelPerformanceViewProtoP\001ZKgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v12/resources;resources\242\002\003GAA\252\002" +
      "\"Google.Ads.GoogleAds.V12.Resources\312\002\"Go" +
      "ogle\\Ads\\GoogleAds\\V12\\Resources\352\002&Googl" +
      "e::Ads::GoogleAds::V12::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_HotelPerformanceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_HotelPerformanceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_HotelPerformanceView_descriptor,
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
