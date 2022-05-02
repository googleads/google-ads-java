// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/asset_group.proto

package com.google.ads.googleads.v10.resources;

public final class AssetGroupProto {
  private AssetGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AssetGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AssetGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v10/resources/ass" +
      "et_group.proto\022\"google.ads.googleads.v10" +
      ".resources\0327google/ads/googleads/v10/enu" +
      "ms/asset_group_status.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\"\265\003\n\nAssetGroup\022B\n\rresource_name\030" +
      "\001 \001(\tB+\340A\005\372A%\n#googleads.googleapis.com/" +
      "AssetGroup\022\017\n\002id\030\t \001(\003B\003\340A\003\022;\n\010campaign\030" +
      "\002 \001(\tB)\340A\005\372A#\n!googleads.googleapis.com/" +
      "Campaign\022\021\n\004name\030\003 \001(\tB\003\340A\002\022\022\n\nfinal_url" +
      "s\030\004 \003(\t\022\031\n\021final_mobile_urls\030\005 \003(\t\022U\n\006st" +
      "atus\030\006 \001(\0162E.google.ads.googleads.v10.en" +
      "ums.AssetGroupStatusEnum.AssetGroupStatu" +
      "s\022\r\n\005path1\030\007 \001(\t\022\r\n\005path2\030\010 \001(\t:^\352A[\n#go" +
      "ogleads.googleapis.com/AssetGroup\0224custo" +
      "mers/{customer_id}/assetGroups/{asset_gr" +
      "oup_id}B\201\002\n&com.google.ads.googleads.v10" +
      ".resourcesB\017AssetGroupProtoP\001ZKgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v10/resources;resources\242\002\003GAA\252\002\"Googl" +
      "e.Ads.GoogleAds.V10.Resources\312\002\"Google\\A" +
      "ds\\GoogleAds\\V10\\Resources\352\002&Google::Ads" +
      "::GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.AssetGroupStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_AssetGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_AssetGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AssetGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Campaign", "Name", "FinalUrls", "FinalMobileUrls", "Status", "Path1", "Path2", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.AssetGroupStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
