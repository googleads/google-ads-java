// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/parental_status_view.proto

package com.google.ads.googleads.v12.resources;

public final class ParentalStatusViewProto {
  private ParentalStatusViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_ParentalStatusView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_ParentalStatusView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v12/resources/par" +
      "ental_status_view.proto\022\"google.ads.goog" +
      "leads.v12.resources\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\"" +
      "\335\001\n\022ParentalStatusView\022K\n\rresource_name\030" +
      "\001 \001(\tB4\342A\001\003\372A-\n+googleads.googleapis.com" +
      "/ParentalStatusView:z\352Aw\n+googleads.goog" +
      "leapis.com/ParentalStatusView\022Hcustomers" +
      "/{customer_id}/parentalStatusViews/{ad_g" +
      "roup_id}~{criterion_id}B\211\002\n&com.google.a" +
      "ds.googleads.v12.resourcesB\027ParentalStat" +
      "usViewProtoP\001ZKgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v12/resources" +
      ";resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds." +
      "V12.Resources\312\002\"Google\\Ads\\GoogleAds\\V12" +
      "\\Resources\352\002&Google::Ads::GoogleAds::V12" +
      "::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_ParentalStatusView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_ParentalStatusView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_ParentalStatusView_descriptor,
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
