// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/feed_item_target_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public final class FeedItemTargetServiceProto {
  private FeedItemTargetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_FeedItemTargetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_FeedItemTargetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v15/services/feed" +
      "_item_target_service.proto\022!google.ads.g" +
      "oogleads.v15.services\032:google/ads/google" +
      "ads/v15/enums/response_content_type.prot" +
      "o\0329google/ads/googleads/v15/resources/fe" +
      "ed_item_target.proto\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\027google/rpc/status.proto" +
      "\"\251\002\n\034MutateFeedItemTargetsRequest\022\030\n\013cus" +
      "tomer_id\030\001 \001(\tB\003\340A\002\022S\n\noperations\030\002 \003(\0132" +
      ":.google.ads.googleads.v15.services.Feed" +
      "ItemTargetOperationB\003\340A\002\022\027\n\017partial_fail" +
      "ure\030\004 \001(\010\022j\n\025response_content_type\030\005 \001(\016" +
      "2K.google.ads.googleads.v15.enums.Respon" +
      "seContentTypeEnum.ResponseContentType\022\025\n" +
      "\rvalidate_only\030\003 \001(\010\"\254\001\n\027FeedItemTargetO" +
      "peration\022D\n\006create\030\001 \001(\01322.google.ads.go" +
      "ogleads.v15.resources.FeedItemTargetH\000\022>" +
      "\n\006remove\030\002 \001(\tB,\372A)\n\'googleads.googleapi" +
      "s.com/FeedItemTargetH\000B\013\n\toperation\"\242\001\n\035" +
      "MutateFeedItemTargetsResponse\0221\n\025partial" +
      "_failure_error\030\003 \001(\0132\022.google.rpc.Status" +
      "\022N\n\007results\030\002 \003(\0132=.google.ads.googleads" +
      ".v15.services.MutateFeedItemTargetResult" +
      "\"\257\001\n\032MutateFeedItemTargetResult\022C\n\rresou" +
      "rce_name\030\001 \001(\tB,\372A)\n\'googleads.googleapi" +
      "s.com/FeedItemTarget\022L\n\020feed_item_target" +
      "\030\002 \001(\01322.google.ads.googleads.v15.resour" +
      "ces.FeedItemTarget2\326\002\n\025FeedItemTargetSer" +
      "vice\022\365\001\n\025MutateFeedItemTargets\022?.google." +
      "ads.googleads.v15.services.MutateFeedIte" +
      "mTargetsRequest\032@.google.ads.googleads.v" +
      "15.services.MutateFeedItemTargetsRespons" +
      "e\"Y\332A\026customer_id,operations\202\323\344\223\002:\"5/v15" +
      "/customers/{customer_id=*}/feedItemTarge" +
      "ts:mutate:\001*\032E\312A\030googleads.googleapis.co" +
      "m\322A\'https://www.googleapis.com/auth/adwo" +
      "rdsB\206\002\n%com.google.ads.googleads.v15.ser" +
      "vicesB\032FeedItemTargetServiceProtoP\001ZIgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v15/services;services\242\002\003GAA\252\002!G" +
      "oogle.Ads.GoogleAds.V15.Services\312\002!Googl" +
      "e\\Ads\\GoogleAds\\V15\\Services\352\002%Google::A" +
      "ds::GoogleAds::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.FeedItemTargetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ResponseContentType", "ValidateOnly", });
    internal_static_google_ads_googleads_v15_services_FeedItemTargetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_FeedItemTargetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_FeedItemTargetOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateFeedItemTargetResult_descriptor,
        new java.lang.String[] { "ResourceName", "FeedItemTarget", });
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
    com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v15.resources.FeedItemTargetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
