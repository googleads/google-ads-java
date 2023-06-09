// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/ad_group_ad_service.proto

package com.google.ads.googleads.v13.services;

public final class AdGroupAdServiceProto {
  private AdGroupAdServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_AdGroupAdOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_AdGroupAdOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAdResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateAdGroupAdResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v13/services/ad_g" +
      "roup_ad_service.proto\022!google.ads.google" +
      "ads.v13.services\032,google/ads/googleads/v" +
      "13/common/policy.proto\032:google/ads/googl" +
      "eads/v13/enums/response_content_type.pro" +
      "to\0324google/ads/googleads/v13/resources/a" +
      "d_group_ad.proto\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032 google/protobuf/field_mask." +
      "proto\032\027google/rpc/status.proto\"\241\002\n\027Mutat" +
      "eAdGroupAdsRequest\022\031\n\013customer_id\030\001 \001(\tB" +
      "\004\342A\001\002\022O\n\noperations\030\002 \003(\01325.google.ads.g" +
      "oogleads.v13.services.AdGroupAdOperation" +
      "B\004\342A\001\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalid" +
      "ate_only\030\004 \001(\010\022j\n\025response_content_type\030" +
      "\005 \001(\0162K.google.ads.googleads.v13.enums.R" +
      "esponseContentTypeEnum.ResponseContentTy" +
      "pe\"\360\002\n\022AdGroupAdOperation\022/\n\013update_mask" +
      "\030\004 \001(\0132\032.google.protobuf.FieldMask\022_\n\033po" +
      "licy_validation_parameter\030\005 \001(\0132:.google" +
      ".ads.googleads.v13.common.PolicyValidati" +
      "onParameter\022?\n\006create\030\001 \001(\0132-.google.ads" +
      ".googleads.v13.resources.AdGroupAdH\000\022?\n\006" +
      "update\030\002 \001(\0132-.google.ads.googleads.v13." +
      "resources.AdGroupAdH\000\0229\n\006remove\030\003 \001(\tB\'\372" +
      "A$\n\"googleads.googleapis.com/AdGroupAdH\000" +
      "B\013\n\toperation\"\230\001\n\030MutateAdGroupAdsRespon" +
      "se\0221\n\025partial_failure_error\030\003 \001(\0132\022.goog" +
      "le.rpc.Status\022I\n\007results\030\002 \003(\01328.google." +
      "ads.googleads.v13.services.MutateAdGroup" +
      "AdResult\"\233\001\n\025MutateAdGroupAdResult\022>\n\rre" +
      "source_name\030\001 \001(\tB\'\372A$\n\"googleads.google" +
      "apis.com/AdGroupAd\022B\n\013ad_group_ad\030\002 \001(\0132" +
      "-.google.ads.googleads.v13.resources.AdG" +
      "roupAd2\275\002\n\020AdGroupAdService\022\341\001\n\020MutateAd" +
      "GroupAds\022:.google.ads.googleads.v13.serv" +
      "ices.MutateAdGroupAdsRequest\032;.google.ad" +
      "s.googleads.v13.services.MutateAdGroupAd" +
      "sResponse\"T\332A\026customer_id,operations\202\323\344\223" +
      "\0025\"0/v13/customers/{customer_id=*}/adGro" +
      "upAds:mutate:\001*\032E\312A\030googleads.googleapis" +
      ".com\322A\'https://www.googleapis.com/auth/a" +
      "dwordsB\201\002\n%com.google.ads.googleads.v13." +
      "servicesB\025AdGroupAdServiceProtoP\001ZIgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v13/services;services\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V13.Services\312\002!Google\\" +
      "Ads\\GoogleAds\\V13\\Services\352\002%Google::Ads" +
      "::GoogleAds::V13::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.resources.AdGroupAdProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v13_services_AdGroupAdOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_AdGroupAdOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_AdGroupAdOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "PolicyValidationParameter", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupAdsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAdResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_MutateAdGroupAdResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateAdGroupAdResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAd", });
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
    com.google.ads.googleads.v13.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v13.resources.AdGroupAdProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
