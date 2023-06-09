// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/asset_group.proto

package com.google.ads.googleads.v14.resources;

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
    internal_static_google_ads_googleads_v14_resources_AssetGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_AssetGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v14/resources/ass" +
      "et_group.proto\022\"google.ads.googleads.v14" +
      ".resources\0320google/ads/googleads/v14/enu" +
      "ms/ad_strength.proto\0327google/ads/googlea" +
      "ds/v14/enums/asset_group_status.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\"\217\004\n\nAssetGroup\022C\n\rreso" +
      "urce_name\030\001 \001(\tB,\342A\001\005\372A%\n#googleads.goog" +
      "leapis.com/AssetGroup\022\020\n\002id\030\t \001(\003B\004\342A\001\003\022" +
      "<\n\010campaign\030\002 \001(\tB*\342A\001\005\372A#\n!googleads.go" +
      "ogleapis.com/Campaign\022\022\n\004name\030\003 \001(\tB\004\342A\001" +
      "\002\022\022\n\nfinal_urls\030\004 \003(\t\022\031\n\021final_mobile_ur" +
      "ls\030\005 \003(\t\022U\n\006status\030\006 \001(\0162E.google.ads.go" +
      "ogleads.v14.enums.AssetGroupStatusEnum.A" +
      "ssetGroupStatus\022\r\n\005path1\030\007 \001(\t\022\r\n\005path2\030" +
      "\010 \001(\t\022T\n\013ad_strength\030\n \001(\01629.google.ads." +
      "googleads.v14.enums.AdStrengthEnum.AdStr" +
      "engthB\004\342A\001\003:^\352A[\n#googleads.googleapis.c" +
      "om/AssetGroup\0224customers/{customer_id}/a" +
      "ssetGroups/{asset_group_id}B\201\002\n&com.goog" +
      "le.ads.googleads.v14.resourcesB\017AssetGro" +
      "upProtoP\001ZKgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v14/resources;res" +
      "ources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V14." +
      "Resources\312\002\"Google\\Ads\\GoogleAds\\V14\\Res" +
      "ources\352\002&Google::Ads::GoogleAds::V14::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.AdStrengthProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AssetGroupStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_AssetGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_AssetGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_AssetGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Campaign", "Name", "FinalUrls", "FinalMobileUrls", "Status", "Path1", "Path2", "AdStrength", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.AdStrengthProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AssetGroupStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
