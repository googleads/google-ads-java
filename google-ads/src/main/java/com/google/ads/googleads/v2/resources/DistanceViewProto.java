// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/distance_view.proto

package com.google.ads.googleads.v2.resources;

public final class DistanceViewProto {
  private DistanceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_DistanceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_DistanceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v2/resources/dist" +
      "ance_view.proto\022!google.ads.googleads.v2" +
      ".resources\0323google/ads/googleads/v2/enum" +
      "s/distance_bucket.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032\036google/protobuf/wrappers.proto\032\034goo" +
      "gle/api/annotations.proto\"\314\002\n\014DistanceVi" +
      "ew\022D\n\rresource_name\030\001 \001(\tB-\340A\003\372A\'\n%googl" +
      "eads.googleapis.com/DistanceView\022^\n\017dist" +
      "ance_bucket\030\002 \001(\0162@.google.ads.googleads" +
      ".v2.enums.DistanceBucketEnum.DistanceBuc" +
      "ketB\003\340A\003\0226\n\rmetric_system\030\003 \001(\0132\032.google" +
      ".protobuf.BoolValueB\003\340A\003:^\352A[\n%googleads" +
      ".googleapis.com/DistanceView\0222customers/" +
      "{customer}/distanceViews/{distance_view}" +
      "B\376\001\n%com.google.ads.googleads.v2.resourc" +
      "esB\021DistanceViewProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v2/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V2.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V2\\Resources\352\002%Google::Ads::GoogleA" +
      "ds::V2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.enums.DistanceBucketProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_DistanceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_DistanceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_DistanceView_descriptor,
        new java.lang.String[] { "ResourceName", "DistanceBucket", "MetricSystem", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.enums.DistanceBucketProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
