// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/performance_max_placement_view.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public final class PerformanceMaxPlacementViewProto {
  private PerformanceMaxPlacementViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_PerformanceMaxPlacementView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_PerformanceMaxPlacementView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v18/resources/per" +
      "formance_max_placement_view.proto\022\"googl" +
      "e.ads.googleads.v18.resources\0323google/ad" +
      "s/googleads/v18/enums/placement_type.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\"\233\004\n\033PerformanceMa" +
      "xPlacementView\022S\n\rresource_name\030\001 \001(\tB<\340" +
      "A\003\372A6\n4googleads.googleapis.com/Performa" +
      "nceMaxPlacementView\022\033\n\tplacement\030\002 \001(\tB\003" +
      "\340A\003H\000\210\001\001\022\036\n\014display_name\030\003 \001(\tB\003\340A\003H\001\210\001\001" +
      "\022\034\n\ntarget_url\030\004 \001(\tB\003\340A\003H\002\210\001\001\022\\\n\016placem" +
      "ent_type\030\005 \001(\0162?.google.ads.googleads.v1" +
      "8.enums.PlacementTypeEnum.PlacementTypeB" +
      "\003\340A\003:\277\001\352A\273\001\n4googleads.googleapis.com/Pe" +
      "rformanceMaxPlacementView\022Hcustomers/{cu" +
      "stomer_id}/performanceMaxPlacementViews/" +
      "{base_64_placement}*\034performanceMaxPlace" +
      "mentViews2\033performanceMaxPlacementViewB\014" +
      "\n\n_placementB\017\n\r_display_nameB\r\n\013_target" +
      "_urlB\222\002\n&com.google.ads.googleads.v18.re" +
      "sourcesB PerformanceMaxPlacementViewProt" +
      "oP\001ZKgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v18/resources;resources" +
      "\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V18.Resour" +
      "ces\312\002\"Google\\Ads\\GoogleAds\\V18\\Resources" +
      "\352\002&Google::Ads::GoogleAds::V18::Resource" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.PlacementTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_PerformanceMaxPlacementView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_PerformanceMaxPlacementView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_PerformanceMaxPlacementView_descriptor,
        new java.lang.String[] { "ResourceName", "Placement", "DisplayName", "TargetUrl", "PlacementType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.enums.PlacementTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
