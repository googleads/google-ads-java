// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/bidding_strategy_service.proto

package com.google.ads.googleads.v12.services;

public final class BiddingStrategyServiceProto {
  private BiddingStrategyServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_BiddingStrategyOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_BiddingStrategyOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateBiddingStrategyResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateBiddingStrategyResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v12/services/bidd" +
      "ing_strategy_service.proto\022!google.ads.g" +
      "oogleads.v12.services\032:google/ads/google" +
      "ads/v12/enums/response_content_type.prot" +
      "o\0329google/ads/googleads/v12/resources/bi" +
      "dding_strategy.proto\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032 google/protobuf/field_m" +
      "ask.proto\032\027google/rpc/status.proto\"\256\002\n\036M" +
      "utateBiddingStrategiesRequest\022\031\n\013custome" +
      "r_id\030\001 \001(\tB\004\342A\001\002\022U\n\noperations\030\002 \003(\0132;.g" +
      "oogle.ads.googleads.v12.services.Bidding" +
      "StrategyOperationB\004\342A\001\002\022\027\n\017partial_failu" +
      "re\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025respo" +
      "nse_content_type\030\005 \001(\0162K.google.ads.goog" +
      "leads.v12.enums.ResponseContentTypeEnum." +
      "ResponseContentType\"\247\002\n\030BiddingStrategyO" +
      "peration\022/\n\013update_mask\030\004 \001(\0132\032.google.p" +
      "rotobuf.FieldMask\022E\n\006create\030\001 \001(\01323.goog" +
      "le.ads.googleads.v12.resources.BiddingSt" +
      "rategyH\000\022E\n\006update\030\002 \001(\01323.google.ads.go" +
      "ogleads.v12.resources.BiddingStrategyH\000\022" +
      "?\n\006remove\030\003 \001(\tB-\372A*\n(googleads.googleap" +
      "is.com/BiddingStrategyH\000B\013\n\toperation\"\245\001" +
      "\n\037MutateBiddingStrategiesResponse\0221\n\025par" +
      "tial_failure_error\030\003 \001(\0132\022.google.rpc.St" +
      "atus\022O\n\007results\030\002 \003(\0132>.google.ads.googl" +
      "eads.v12.services.MutateBiddingStrategyR" +
      "esult\"\262\001\n\033MutateBiddingStrategyResult\022D\n" +
      "\rresource_name\030\001 \001(\tB-\372A*\n(googleads.goo" +
      "gleapis.com/BiddingStrategy\022M\n\020bidding_s" +
      "trategy\030\002 \001(\01323.google.ads.googleads.v12" +
      ".resources.BiddingStrategy2\337\002\n\026BiddingSt" +
      "rategyService\022\375\001\n\027MutateBiddingStrategie" +
      "s\022A.google.ads.googleads.v12.services.Mu" +
      "tateBiddingStrategiesRequest\032B.google.ad" +
      "s.googleads.v12.services.MutateBiddingSt" +
      "rategiesResponse\"[\332A\026customer_id,operati" +
      "ons\202\323\344\223\002<\"7/v12/customers/{customer_id=*" +
      "}/biddingStrategies:mutate:\001*\032E\312A\030google" +
      "ads.googleapis.com\322A\'https://www.googlea" +
      "pis.com/auth/adwordsB\207\002\n%com.google.ads." +
      "googleads.v12.servicesB\033BiddingStrategyS" +
      "erviceProtoP\001ZIgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v12/services;" +
      "services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1" +
      "2.Services\312\002!Google\\Ads\\GoogleAds\\V12\\Se" +
      "rvices\352\002%Google::Ads::GoogleAds::V12::Se" +
      "rvicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.resources.BiddingStrategyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v12_services_BiddingStrategyOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_BiddingStrategyOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_BiddingStrategyOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateBiddingStrategiesResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v12_services_MutateBiddingStrategyResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_MutateBiddingStrategyResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateBiddingStrategyResult_descriptor,
        new java.lang.String[] { "ResourceName", "BiddingStrategy", });
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
    com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v12.resources.BiddingStrategyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
