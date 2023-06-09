// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/feed_item_set_service.proto

package com.google.ads.googleads.v12.services;

public final class FeedItemSetServiceProto {
  private FeedItemSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_FeedItemSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_FeedItemSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateFeedItemSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateFeedItemSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v12/services/feed" +
      "_item_set_service.proto\022!google.ads.goog" +
      "leads.v12.services\0326google/ads/googleads" +
      "/v12/resources/feed_item_set.proto\032\034goog" +
      "le/api/annotations.proto\032\027google/api/cli" +
      "ent.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032 google/pr" +
      "otobuf/field_mask.proto\032\027google/rpc/stat" +
      "us.proto\"\271\001\n\031MutateFeedItemSetsRequest\022\031" +
      "\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022Q\n\noperations\030" +
      "\002 \003(\01327.google.ads.googleads.v12.service" +
      "s.FeedItemSetOperationB\004\342A\001\002\022\027\n\017partial_" +
      "failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\227\002\n" +
      "\024FeedItemSetOperation\022/\n\013update_mask\030\004 \001" +
      "(\0132\032.google.protobuf.FieldMask\022A\n\006create" +
      "\030\001 \001(\0132/.google.ads.googleads.v12.resour" +
      "ces.FeedItemSetH\000\022A\n\006update\030\002 \001(\0132/.goog" +
      "le.ads.googleads.v12.resources.FeedItemS" +
      "etH\000\022;\n\006remove\030\003 \001(\tB)\372A&\n$googleads.goo" +
      "gleapis.com/FeedItemSetH\000B\013\n\toperation\"\234" +
      "\001\n\032MutateFeedItemSetsResponse\022K\n\007results" +
      "\030\001 \003(\0132:.google.ads.googleads.v12.servic" +
      "es.MutateFeedItemSetResult\0221\n\025partial_fa" +
      "ilure_error\030\002 \001(\0132\022.google.rpc.Status\"[\n" +
      "\027MutateFeedItemSetResult\022@\n\rresource_nam" +
      "e\030\001 \001(\tB)\372A&\n$googleads.googleapis.com/F" +
      "eedItemSet2\307\002\n\022FeedItemSetService\022\351\001\n\022Mu" +
      "tateFeedItemSets\022<.google.ads.googleads." +
      "v12.services.MutateFeedItemSetsRequest\032=" +
      ".google.ads.googleads.v12.services.Mutat" +
      "eFeedItemSetsResponse\"V\332A\026customer_id,op" +
      "erations\202\323\344\223\0027\"2/v12/customers/{customer" +
      "_id=*}/feedItemSets:mutate:\001*\032E\312A\030google" +
      "ads.googleapis.com\322A\'https://www.googlea" +
      "pis.com/auth/adwordsB\203\002\n%com.google.ads." +
      "googleads.v12.servicesB\027FeedItemSetServi" +
      "ceProtoP\001ZIgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v12/services;serv" +
      "ices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V12.Se" +
      "rvices\312\002!Google\\Ads\\GoogleAds\\V12\\Servic" +
      "es\352\002%Google::Ads::GoogleAds::V12::Servic" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.resources.FeedItemSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v12_services_FeedItemSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_FeedItemSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_FeedItemSetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateFeedItemSetsResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v12_services_MutateFeedItemSetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_MutateFeedItemSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateFeedItemSetResult_descriptor,
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
    com.google.ads.googleads.v12.resources.FeedItemSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
