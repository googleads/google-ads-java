// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/group_placement_view.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.resources;

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
    internal_static_google_ads_googleads_v14_resources_GroupPlacementView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_GroupPlacementView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v14/resources/gro" +
      "up_placement_view.proto\022\"google.ads.goog" +
      "leads.v14.resources\0323google/ads/googlead" +
      "s/v14/enums/placement_type.proto\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\"\307\003\n\022GroupPlacementView\022J\n\rr" +
      "esource_name\030\001 \001(\tB3\340A\003\372A-\n+googleads.go" +
      "ogleapis.com/GroupPlacementView\022\033\n\tplace" +
      "ment\030\006 \001(\tB\003\340A\003H\000\210\001\001\022\036\n\014display_name\030\007 \001" +
      "(\tB\003\340A\003H\001\210\001\001\022\034\n\ntarget_url\030\010 \001(\tB\003\340A\003H\002\210" +
      "\001\001\022\\\n\016placement_type\030\005 \001(\0162?.google.ads." +
      "googleads.v14.enums.PlacementTypeEnum.Pl" +
      "acementTypeB\003\340A\003:~\352A{\n+googleads.googlea" +
      "pis.com/GroupPlacementView\022Lcustomers/{c" +
      "ustomer_id}/groupPlacementViews/{ad_grou" +
      "p_id}~{base64_placement}B\014\n\n_placementB\017" +
      "\n\r_display_nameB\r\n\013_target_urlB\211\002\n&com.g" +
      "oogle.ads.googleads.v14.resourcesB\027Group" +
      "PlacementViewProtoP\001ZKgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v14/re" +
      "sources;resources\242\002\003GAA\252\002\"Google.Ads.Goo" +
      "gleAds.V14.Resources\312\002\"Google\\Ads\\Google" +
      "Ads\\V14\\Resources\352\002&Google::Ads::GoogleA" +
      "ds::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.PlacementTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_GroupPlacementView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_GroupPlacementView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_GroupPlacementView_descriptor,
        new java.lang.String[] { "ResourceName", "Placement", "DisplayName", "TargetUrl", "PlacementType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.PlacementTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
