// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/income_range_view.proto

package com.google.ads.googleads.v13.resources;

public final class IncomeRangeViewProto {
  private IncomeRangeViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_IncomeRangeView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_IncomeRangeView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v13/resources/inc" +
      "ome_range_view.proto\022\"google.ads.googlea" +
      "ds.v13.resources\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\321\001\n" +
      "\017IncomeRangeView\022H\n\rresource_name\030\001 \001(\tB" +
      "1\342A\001\003\372A*\n(googleads.googleapis.com/Incom" +
      "eRangeView:t\352Aq\n(googleads.googleapis.co" +
      "m/IncomeRangeView\022Ecustomers/{customer_i" +
      "d}/incomeRangeViews/{ad_group_id}~{crite" +
      "rion_id}B\206\002\n&com.google.ads.googleads.v1" +
      "3.resourcesB\024IncomeRangeViewProtoP\001ZKgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v13/resources;resources\242\002\003GAA\252\002" +
      "\"Google.Ads.GoogleAds.V13.Resources\312\002\"Go" +
      "ogle\\Ads\\GoogleAds\\V13\\Resources\352\002&Googl" +
      "e::Ads::GoogleAds::V13::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_IncomeRangeView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_IncomeRangeView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_IncomeRangeView_descriptor,
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
