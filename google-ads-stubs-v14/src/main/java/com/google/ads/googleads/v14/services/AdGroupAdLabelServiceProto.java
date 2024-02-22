// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/ad_group_ad_label_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public final class AdGroupAdLabelServiceProto {
  private AdGroupAdLabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_AdGroupAdLabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_AdGroupAdLabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v14/services/ad_g" +
      "roup_ad_label_service.proto\022!google.ads." +
      "googleads.v14.services\032:google/ads/googl" +
      "eads/v14/resources/ad_group_ad_label.pro" +
      "to\032\034google/api/annotations.proto\032\027google" +
      "/api/client.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\027g" +
      "oogle/rpc/status.proto\"\275\001\n\034MutateAdGroup" +
      "AdLabelsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A" +
      "\002\022S\n\noperations\030\002 \003(\0132:.google.ads.googl" +
      "eads.v14.services.AdGroupAdLabelOperatio" +
      "nB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalid" +
      "ate_only\030\004 \001(\010\"\254\001\n\027AdGroupAdLabelOperati" +
      "on\022D\n\006create\030\001 \001(\01322.google.ads.googlead" +
      "s.v14.resources.AdGroupAdLabelH\000\022>\n\006remo" +
      "ve\030\002 \001(\tB,\372A)\n\'googleads.googleapis.com/" +
      "AdGroupAdLabelH\000B\013\n\toperation\"\242\001\n\035Mutate" +
      "AdGroupAdLabelsResponse\0221\n\025partial_failu" +
      "re_error\030\003 \001(\0132\022.google.rpc.Status\022N\n\007re" +
      "sults\030\002 \003(\0132=.google.ads.googleads.v14.s" +
      "ervices.MutateAdGroupAdLabelResult\"a\n\032Mu" +
      "tateAdGroupAdLabelResult\022C\n\rresource_nam" +
      "e\030\001 \001(\tB,\372A)\n\'googleads.googleapis.com/A" +
      "dGroupAdLabel2\326\002\n\025AdGroupAdLabelService\022" +
      "\365\001\n\025MutateAdGroupAdLabels\022?.google.ads.g" +
      "oogleads.v14.services.MutateAdGroupAdLab" +
      "elsRequest\032@.google.ads.googleads.v14.se" +
      "rvices.MutateAdGroupAdLabelsResponse\"Y\332A" +
      "\026customer_id,operations\202\323\344\223\002:\"5/v14/cust" +
      "omers/{customer_id=*}/adGroupAdLabels:mu" +
      "tate:\001*\032E\312A\030googleads.googleapis.com\322A\'h" +
      "ttps://www.googleapis.com/auth/adwordsB\206" +
      "\002\n%com.google.ads.googleads.v14.services" +
      "B\032AdGroupAdLabelServiceProtoP\001ZIgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v14/services;services\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V14.Services\312\002!Google\\Ads" +
      "\\GoogleAds\\V14\\Services\352\002%Google::Ads::G" +
      "oogleAds::V14::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.resources.AdGroupAdLabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v14_services_AdGroupAdLabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_AdGroupAdLabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_AdGroupAdLabelOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateAdGroupAdLabelResult_descriptor,
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
    com.google.ads.googleads.v14.resources.AdGroupAdLabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
