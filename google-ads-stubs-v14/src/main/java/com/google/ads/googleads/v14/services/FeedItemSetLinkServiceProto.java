// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/feed_item_set_link_service.proto

package com.google.ads.googleads.v14.services;

public final class FeedItemSetLinkServiceProto {
  private FeedItemSetLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_FeedItemSetLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_FeedItemSetLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v14/services/feed" +
      "_item_set_link_service.proto\022!google.ads" +
      ".googleads.v14.services\032;google/ads/goog" +
      "leads/v14/resources/feed_item_set_link.p" +
      "roto\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "\027google/rpc/status.proto\"\301\001\n\035MutateFeedI" +
      "temSetLinksRequest\022\031\n\013customer_id\030\001 \001(\tB" +
      "\004\342A\001\002\022U\n\noperations\030\002 \003(\0132;.google.ads.g" +
      "oogleads.v14.services.FeedItemSetLinkOpe" +
      "rationB\004\342A\001\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n" +
      "\rvalidate_only\030\004 \001(\010\"\257\001\n\030FeedItemSetLink" +
      "Operation\022E\n\006create\030\001 \001(\01323.google.ads.g" +
      "oogleads.v14.resources.FeedItemSetLinkH\000" +
      "\022?\n\006remove\030\002 \001(\tB-\372A*\n(googleads.googlea" +
      "pis.com/FeedItemSetLinkH\000B\013\n\toperation\"\244" +
      "\001\n\036MutateFeedItemSetLinksResponse\022O\n\007res" +
      "ults\030\001 \003(\0132>.google.ads.googleads.v14.se" +
      "rvices.MutateFeedItemSetLinkResult\0221\n\025pa" +
      "rtial_failure_error\030\002 \001(\0132\022.google.rpc.S" +
      "tatus\"c\n\033MutateFeedItemSetLinkResult\022D\n\r" +
      "resource_name\030\001 \001(\tB-\372A*\n(googleads.goog" +
      "leapis.com/FeedItemSetLink2\333\002\n\026FeedItemS" +
      "etLinkService\022\371\001\n\026MutateFeedItemSetLinks" +
      "\022@.google.ads.googleads.v14.services.Mut" +
      "ateFeedItemSetLinksRequest\032A.google.ads." +
      "googleads.v14.services.MutateFeedItemSet" +
      "LinksResponse\"Z\332A\026customer_id,operations" +
      "\202\323\344\223\002;\"6/v14/customers/{customer_id=*}/f" +
      "eedItemSetLinks:mutate:\001*\032E\312A\030googleads." +
      "googleapis.com\322A\'https://www.googleapis." +
      "com/auth/adwordsB\207\002\n%com.google.ads.goog" +
      "leads.v14.servicesB\033FeedItemSetLinkServi" +
      "ceProtoP\001ZIgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v14/services;serv" +
      "ices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V14.Se" +
      "rvices\312\002!Google\\Ads\\GoogleAds\\V14\\Servic" +
      "es\352\002%Google::Ads::GoogleAds::V14::Servic" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.resources.FeedItemSetLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v14_services_FeedItemSetLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_FeedItemSetLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_FeedItemSetLinkOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinksResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateFeedItemSetLinkResult_descriptor,
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
    com.google.ads.googleads.v14.resources.FeedItemSetLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
