// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/asset_set_type_view.proto

package com.google.ads.googleads.v13.resources;

public final class AssetSetTypeViewProto {
  private AssetSetTypeViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_AssetSetTypeView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_AssetSetTypeView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v13/resources/ass" +
      "et_set_type_view.proto\022\"google.ads.googl" +
      "eads.v13.resources\0323google/ads/googleads" +
      "/v13/enums/asset_set_type.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\"\246\002\n\020AssetSetTypeView\022I\n\rreso" +
      "urce_name\030\001 \001(\tB2\342A\001\003\372A+\n)googleads.goog" +
      "leapis.com/AssetSetTypeView\022[\n\016asset_set" +
      "_type\030\003 \001(\0162=.google.ads.googleads.v13.e" +
      "nums.AssetSetTypeEnum.AssetSetTypeB\004\342A\001\003" +
      ":j\352Ag\n)googleads.googleapis.com/AssetSet" +
      "TypeView\022:customers/{customer_id}/assetS" +
      "etTypeViews/{asset_set_type}B\207\002\n&com.goo" +
      "gle.ads.googleads.v13.resourcesB\025AssetSe" +
      "tTypeViewProtoP\001ZKgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v13/resour" +
      "ces;resources\242\002\003GAA\252\002\"Google.Ads.GoogleA" +
      "ds.V13.Resources\312\002\"Google\\Ads\\GoogleAds\\" +
      "V13\\Resources\352\002&Google::Ads::GoogleAds::" +
      "V13::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.AssetSetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_AssetSetTypeView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_AssetSetTypeView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_AssetSetTypeView_descriptor,
        new java.lang.String[] { "ResourceName", "AssetSetType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.AssetSetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
