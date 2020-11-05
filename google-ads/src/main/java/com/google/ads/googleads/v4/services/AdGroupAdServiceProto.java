// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/ad_group_ad_service.proto

package com.google.ads.googleads.v4.services;

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
    internal_static_google_ads_googleads_v4_services_GetAdGroupAdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetAdGroupAdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_AdGroupAdOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_AdGroupAdOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAdGroupAdResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAdGroupAdResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v4/services/ad_gr" +
      "oup_ad_service.proto\022 google.ads.googlea" +
      "ds.v4.services\032+google/ads/googleads/v4/" +
      "common/policy.proto\0323google/ads/googlead" +
      "s/v4/resources/ad_group_ad.proto\032\034google" +
      "/api/annotations.proto\032\027google/api/clien" +
      "t.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032 google/prot" +
      "obuf/field_mask.proto\032\027google/rpc/status" +
      ".proto\"X\n\023GetAdGroupAdRequest\022A\n\rresourc" +
      "e_name\030\001 \001(\tB*\340A\002\372A$\n\"googleads.googleap" +
      "is.com/AdGroupAd\"\262\001\n\027MutateAdGroupAdsReq" +
      "uest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022M\n\noperat" +
      "ions\030\002 \003(\01324.google.ads.googleads.v4.ser" +
      "vices.AdGroupAdOperationB\003\340A\002\022\027\n\017partial" +
      "_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\304\002" +
      "\n\022AdGroupAdOperation\022/\n\013update_mask\030\004 \001(" +
      "\0132\032.google.protobuf.FieldMask\022^\n\033policy_" +
      "validation_parameter\030\005 \001(\01329.google.ads." +
      "googleads.v4.common.PolicyValidationPara" +
      "meter\022>\n\006create\030\001 \001(\0132,.google.ads.googl" +
      "eads.v4.resources.AdGroupAdH\000\022>\n\006update\030" +
      "\002 \001(\0132,.google.ads.googleads.v4.resource" +
      "s.AdGroupAdH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\topera" +
      "tion\"\227\001\n\030MutateAdGroupAdsResponse\0221\n\025par" +
      "tial_failure_error\030\003 \001(\0132\022.google.rpc.St" +
      "atus\022H\n\007results\030\002 \003(\01327.google.ads.googl" +
      "eads.v4.services.MutateAdGroupAdResult\"." +
      "\n\025MutateAdGroupAdResult\022\025\n\rresource_name" +
      "\030\001 \001(\t2\314\003\n\020AdGroupAdService\022\271\001\n\014GetAdGro" +
      "upAd\0225.google.ads.googleads.v4.services." +
      "GetAdGroupAdRequest\032,.google.ads.googlea" +
      "ds.v4.resources.AdGroupAd\"D\202\323\344\223\002.\022,/v4/{" +
      "resource_name=customers/*/adGroupAds/*}\332" +
      "A\rresource_name\022\336\001\n\020MutateAdGroupAds\0229.g" +
      "oogle.ads.googleads.v4.services.MutateAd" +
      "GroupAdsRequest\032:.google.ads.googleads.v" +
      "4.services.MutateAdGroupAdsResponse\"S\202\323\344" +
      "\223\0024\"//v4/customers/{customer_id=*}/adGro" +
      "upAds:mutate:\001*\332A\026customer_id,operations" +
      "\032\033\312A\030googleads.googleapis.comB\374\001\n$com.go" +
      "ogle.ads.googleads.v4.servicesB\025AdGroupA" +
      "dServiceProtoP\001ZHgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v4/services" +
      ";services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V" +
      "4.Services\312\002 Google\\Ads\\GoogleAds\\V4\\Ser" +
      "vices\352\002$Google::Ads::GoogleAds::V4::Serv" +
      "icesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v4.resources.AdGroupAdProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetAdGroupAdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetAdGroupAdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetAdGroupAdRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v4_services_AdGroupAdOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_AdGroupAdOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_AdGroupAdOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "PolicyValidationParameter", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAdGroupAdsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v4_services_MutateAdGroupAdResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_MutateAdGroupAdResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAdGroupAdResult_descriptor,
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
    com.google.ads.googleads.v4.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v4.resources.AdGroupAdProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
