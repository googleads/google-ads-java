// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/group_placement_view.proto

package com.google.ads.googleads.v5.resources;

public final class GroupPlacementViewProto {
  private GroupPlacementViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_GroupPlacementView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_GroupPlacementView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v5/resources/grou" +
      "p_placement_view.proto\022!google.ads.googl" +
      "eads.v5.resources\0322google/ads/googleads/" +
      "v5/enums/placement_type.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\032\036google/protobuf/wrappers.prot" +
      "o\032\034google/api/annotations.proto\"\326\003\n\022Grou" +
      "pPlacementView\022J\n\rresource_name\030\001 \001(\tB3\340" +
      "A\003\372A-\n+googleads.googleapis.com/GroupPla" +
      "cementView\0224\n\tplacement\030\002 \001(\0132\034.google.p" +
      "rotobuf.StringValueB\003\340A\003\0227\n\014display_name" +
      "\030\003 \001(\0132\034.google.protobuf.StringValueB\003\340A" +
      "\003\0225\n\ntarget_url\030\004 \001(\0132\034.google.protobuf." +
      "StringValueB\003\340A\003\022[\n\016placement_type\030\005 \001(\016" +
      "2>.google.ads.googleads.v5.enums.Placeme" +
      "ntTypeEnum.PlacementTypeB\003\340A\003:q\352An\n+goog" +
      "leads.googleapis.com/GroupPlacementView\022" +
      "?customers/{customer}/groupPlacementView" +
      "s/{group_placement_view}B\204\002\n%com.google." +
      "ads.googleads.v5.resourcesB\027GroupPlaceme" +
      "ntViewProtoP\001ZJgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v5/resources;" +
      "resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V" +
      "5.Resources\312\002!Google\\Ads\\GoogleAds\\V5\\Re" +
      "sources\352\002%Google::Ads::GoogleAds::V5::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.PlacementTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_GroupPlacementView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_GroupPlacementView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_GroupPlacementView_descriptor,
        new java.lang.String[] { "ResourceName", "Placement", "DisplayName", "TargetUrl", "PlacementType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.enums.PlacementTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
