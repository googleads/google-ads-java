// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/campaign_shared_set_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public final class CampaignSharedSetServiceProto {
  private CampaignSharedSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_services_CampaignSharedSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_services_CampaignSharedSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v20/services/camp" +
      "aign_shared_set_service.proto\022!google.ad" +
      "s.googleads.v20.services\032:google/ads/goo" +
      "gleads/v20/enums/response_content_type.p" +
      "roto\032<google/ads/googleads/v20/resources" +
      "/campaign_shared_set.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032\027google/rpc/status" +
      ".proto\"\257\002\n\037MutateCampaignSharedSetsReque" +
      "st\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022V\n\noperatio" +
      "ns\030\002 \003(\0132=.google.ads.googleads.v20.serv" +
      "ices.CampaignSharedSetOperationB\003\340A\002\022\027\n\017" +
      "partial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004" +
      " \001(\010\022j\n\025response_content_type\030\005 \001(\0162K.go" +
      "ogle.ads.googleads.v20.enums.ResponseCon" +
      "tentTypeEnum.ResponseContentType\"\265\001\n\032Cam" +
      "paignSharedSetOperation\022G\n\006create\030\001 \001(\0132" +
      "5.google.ads.googleads.v20.resources.Cam" +
      "paignSharedSetH\000\022A\n\006remove\030\003 \001(\tB/\372A,\n*g" +
      "oogleads.googleapis.com/CampaignSharedSe" +
      "tH\000B\013\n\toperation\"\250\001\n MutateCampaignShare" +
      "dSetsResponse\0221\n\025partial_failure_error\030\003" +
      " \001(\0132\022.google.rpc.Status\022Q\n\007results\030\002 \003(" +
      "\0132@.google.ads.googleads.v20.services.Mu" +
      "tateCampaignSharedSetResult\"\273\001\n\035MutateCa" +
      "mpaignSharedSetResult\022F\n\rresource_name\030\001" +
      " \001(\tB/\372A,\n*googleads.googleapis.com/Camp" +
      "aignSharedSet\022R\n\023campaign_shared_set\030\002 \001" +
      "(\01325.google.ads.googleads.v20.resources." +
      "CampaignSharedSet2\345\002\n\030CampaignSharedSetS" +
      "ervice\022\201\002\n\030MutateCampaignSharedSets\022B.go" +
      "ogle.ads.googleads.v20.services.MutateCa" +
      "mpaignSharedSetsRequest\032C.google.ads.goo" +
      "gleads.v20.services.MutateCampaignShared" +
      "SetsResponse\"\\\332A\026customer_id,operations\202" +
      "\323\344\223\002=\"8/v20/customers/{customer_id=*}/ca" +
      "mpaignSharedSets:mutate:\001*\032E\312A\030googleads" +
      ".googleapis.com\322A\'https://www.googleapis" +
      ".com/auth/adwordsB\211\002\n%com.google.ads.goo" +
      "gleads.v20.servicesB\035CampaignSharedSetSe" +
      "rviceProtoP\001ZIgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v20/services;s" +
      "ervices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V20" +
      ".Services\312\002!Google\\Ads\\GoogleAds\\V20\\Ser" +
      "vices\352\002%Google::Ads::GoogleAds::V20::Ser" +
      "vicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v20.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v20.resources.CampaignSharedSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v20_services_CampaignSharedSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v20_services_CampaignSharedSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_services_CampaignSharedSetOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_services_MutateCampaignSharedSetResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignSharedSet", });
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
    com.google.ads.googleads.v20.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v20.resources.CampaignSharedSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
