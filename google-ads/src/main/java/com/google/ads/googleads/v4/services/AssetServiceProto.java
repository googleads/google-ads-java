// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/asset_service.proto

package com.google.ads.googleads.v4.services;

public final class AssetServiceProto {
  private AssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetAssetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetAssetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_AssetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_AssetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAssetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAssetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v4/services/asset" +
      "_service.proto\022 google.ads.googleads.v4." +
      "services\032-google/ads/googleads/v4/resour" +
      "ces/asset.proto\032\034google/api/annotations." +
      "proto\032\027google/api/client.proto\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\"P\n\017GetAssetRequest\022=\n\rresourc" +
      "e_name\030\001 \001(\tB&\340A\002\372A \n\036googleads.googleap" +
      "is.com/Asset\"z\n\023MutateAssetsRequest\022\030\n\013c" +
      "ustomer_id\030\001 \001(\tB\003\340A\002\022I\n\noperations\030\002 \003(" +
      "\01320.google.ads.googleads.v4.services.Ass" +
      "etOperationB\003\340A\002\"Y\n\016AssetOperation\022:\n\006cr" +
      "eate\030\001 \001(\0132(.google.ads.googleads.v4.res" +
      "ources.AssetH\000B\013\n\toperation\"\\\n\024MutateAss" +
      "etsResponse\022D\n\007results\030\002 \003(\01323.google.ad" +
      "s.googleads.v4.services.MutateAssetResul" +
      "t\"*\n\021MutateAssetResult\022\025\n\rresource_name\030" +
      "\001 \001(\t2\250\003\n\014AssetService\022\251\001\n\010GetAsset\0221.go" +
      "ogle.ads.googleads.v4.services.GetAssetR" +
      "equest\032(.google.ads.googleads.v4.resourc" +
      "es.Asset\"@\202\323\344\223\002*\022(/v4/{resource_name=cus" +
      "tomers/*/assets/*}\332A\rresource_name\022\316\001\n\014M" +
      "utateAssets\0225.google.ads.googleads.v4.se" +
      "rvices.MutateAssetsRequest\0326.google.ads." +
      "googleads.v4.services.MutateAssetsRespon" +
      "se\"O\202\323\344\223\0020\"+/v4/customers/{customer_id=*" +
      "}/assets:mutate:\001*\332A\026customer_id,operati" +
      "ons\032\033\312A\030googleads.googleapis.comB\370\001\n$com" +
      ".google.ads.googleads.v4.servicesB\021Asset" +
      "ServiceProtoP\001ZHgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v4/services;" +
      "services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V4" +
      ".Services\312\002 Google\\Ads\\GoogleAds\\V4\\Serv" +
      "ices\352\002$Google::Ads::GoogleAds::V4::Servi" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.AssetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetAssetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetAssetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetAssetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_MutateAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v4_services_AssetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_AssetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_AssetOperation_descriptor,
        new java.lang.String[] { "Create", "Operation", });
    internal_static_google_ads_googleads_v4_services_MutateAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_MutateAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAssetsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v4_services_MutateAssetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_MutateAssetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAssetResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.resources.AssetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
