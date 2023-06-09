// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/ad_group_asset_set_service.proto

package com.google.ads.googleads.v13.services;

public final class AdGroupAssetSetServiceProto {
  private AdGroupAssetSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v13/services/ad_g" +
      "roup_asset_set_service.proto\022!google.ads" +
      ".googleads.v13.services\032:google/ads/goog" +
      "leads/v13/enums/response_content_type.pr" +
      "oto\032;google/ads/googleads/v13/resources/" +
      "ad_group_asset_set.proto\032\034google/api/ann" +
      "otations.proto\032\027google/api/client.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032\027google/rpc/status.p" +
      "roto\"\255\002\n\035MutateAdGroupAssetSetsRequest\022\031" +
      "\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022U\n\noperations\030" +
      "\002 \003(\0132;.google.ads.googleads.v13.service" +
      "s.AdGroupAssetSetOperationB\004\342A\001\002\022\027\n\017part" +
      "ial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010" +
      "\022j\n\025response_content_type\030\005 \001(\0162K.google" +
      ".ads.googleads.v13.enums.ResponseContent" +
      "TypeEnum.ResponseContentType\"\257\001\n\030AdGroup" +
      "AssetSetOperation\022E\n\006create\030\001 \001(\01323.goog" +
      "le.ads.googleads.v13.resources.AdGroupAs" +
      "setSetH\000\022?\n\006remove\030\002 \001(\tB-\372A*\n(googleads" +
      ".googleapis.com/AdGroupAssetSetH\000B\013\n\tope" +
      "ration\"\244\001\n\036MutateAdGroupAssetSetsRespons" +
      "e\022O\n\007results\030\001 \003(\0132>.google.ads.googlead" +
      "s.v13.services.MutateAdGroupAssetSetResu" +
      "lt\0221\n\025partial_failure_error\030\002 \001(\0132\022.goog" +
      "le.rpc.Status\"\264\001\n\033MutateAdGroupAssetSetR" +
      "esult\022D\n\rresource_name\030\001 \001(\tB-\372A*\n(googl" +
      "eads.googleapis.com/AdGroupAssetSet\022O\n\022a" +
      "d_group_asset_set\030\002 \001(\01323.google.ads.goo" +
      "gleads.v13.resources.AdGroupAssetSet2\333\002\n" +
      "\026AdGroupAssetSetService\022\371\001\n\026MutateAdGrou" +
      "pAssetSets\022@.google.ads.googleads.v13.se" +
      "rvices.MutateAdGroupAssetSetsRequest\032A.g" +
      "oogle.ads.googleads.v13.services.MutateA" +
      "dGroupAssetSetsResponse\"Z\332A\026customer_id," +
      "operations\202\323\344\223\002;\"6/v13/customers/{custom" +
      "er_id=*}/adGroupAssetSets:mutate:\001*\032E\312A\030" +
      "googleads.googleapis.com\322A\'https://www.g" +
      "oogleapis.com/auth/adwordsB\207\002\n%com.googl" +
      "e.ads.googleads.v13.servicesB\033AdGroupAss" +
      "etSetServiceProtoP\001ZIgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v13/ser" +
      "vices;services\242\002\003GAA\252\002!Google.Ads.Google" +
      "Ads.V13.Services\312\002!Google\\Ads\\GoogleAds\\" +
      "V13\\Services\352\002%Google::Ads::GoogleAds::V" +
      "13::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.resources.AdGroupAssetSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_AdGroupAssetSetOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetsResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupAssetSetResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAssetSet", });
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
    com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v13.resources.AdGroupAssetSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
