// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/asset_group_service.proto

package com.google.ads.googleads.v13.services;

public final class AssetGroupServiceProto {
  private AssetGroupServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAssetGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAssetGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_AssetGroupOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_AssetGroupOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAssetGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAssetGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAssetGroupResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAssetGroupResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v13/services/asse" +
      "t_group_service.proto\022!google.ads.google" +
      "ads.v13.services\0324google/ads/googleads/v" +
      "13/resources/asset_group.proto\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032 google/protob" +
      "uf/field_mask.proto\032\027google/rpc/status.p" +
      "roto\"\236\001\n\030MutateAssetGroupsRequest\022\031\n\013cus" +
      "tomer_id\030\001 \001(\tB\004\342A\001\002\022P\n\noperations\030\002 \003(\013" +
      "26.google.ads.googleads.v13.services.Ass" +
      "etGroupOperationB\004\342A\001\002\022\025\n\rvalidate_only\030" +
      "\004 \001(\010\"\223\002\n\023AssetGroupOperation\022/\n\013update_" +
      "mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022@" +
      "\n\006create\030\001 \001(\0132..google.ads.googleads.v1" +
      "3.resources.AssetGroupH\000\022@\n\006update\030\002 \001(\013" +
      "2..google.ads.googleads.v13.resources.As" +
      "setGroupH\000\022:\n\006remove\030\003 \001(\tB(\372A%\n#googlea" +
      "ds.googleapis.com/AssetGroupH\000B\013\n\toperat" +
      "ion\"\232\001\n\031MutateAssetGroupsResponse\022J\n\007res" +
      "ults\030\001 \003(\01329.google.ads.googleads.v13.se" +
      "rvices.MutateAssetGroupResult\0221\n\025partial" +
      "_failure_error\030\002 \001(\0132\022.google.rpc.Status" +
      "\"Y\n\026MutateAssetGroupResult\022?\n\rresource_n" +
      "ame\030\001 \001(\tB(\372A%\n#googleads.googleapis.com" +
      "/AssetGroup2\302\002\n\021AssetGroupService\022\345\001\n\021Mu" +
      "tateAssetGroups\022;.google.ads.googleads.v" +
      "13.services.MutateAssetGroupsRequest\032<.g" +
      "oogle.ads.googleads.v13.services.MutateA" +
      "ssetGroupsResponse\"U\332A\026customer_id,opera" +
      "tions\202\323\344\223\0026\"1/v13/customers/{customer_id" +
      "=*}/assetGroups:mutate:\001*\032E\312A\030googleads." +
      "googleapis.com\322A\'https://www.googleapis." +
      "com/auth/adwordsB\202\002\n%com.google.ads.goog" +
      "leads.v13.servicesB\026AssetGroupServicePro" +
      "toP\001ZIgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v13/services;services\242" +
      "\002\003GAA\252\002!Google.Ads.GoogleAds.V13.Service" +
      "s\312\002!Google\\Ads\\GoogleAds\\V13\\Services\352\002%" +
      "Google::Ads::GoogleAds::V13::Servicesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.resources.AssetGroupProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_MutateAssetGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_MutateAssetGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAssetGroupsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", });
    internal_static_google_ads_googleads_v13_services_AssetGroupOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_AssetGroupOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_AssetGroupOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v13_services_MutateAssetGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_MutateAssetGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAssetGroupsResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v13_services_MutateAssetGroupResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_MutateAssetGroupResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAssetGroupResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.resources.AssetGroupProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
