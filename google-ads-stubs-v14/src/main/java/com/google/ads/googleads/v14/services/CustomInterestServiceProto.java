// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/custom_interest_service.proto

package com.google.ads.googleads.v14.services;

public final class CustomInterestServiceProto {
  private CustomInterestServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomInterestsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomInterestsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_CustomInterestOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_CustomInterestOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomInterestsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomInterestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomInterestResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomInterestResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v14/services/cust" +
      "om_interest_service.proto\022!google.ads.go" +
      "ogleads.v14.services\0328google/ads/googlea" +
      "ds/v14/resources/custom_interest.proto\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032 googl" +
      "e/protobuf/field_mask.proto\"\246\001\n\034MutateCu" +
      "stomInterestsRequest\022\031\n\013customer_id\030\001 \001(" +
      "\tB\004\342A\001\002\022T\n\noperations\030\002 \003(\0132:.google.ads" +
      ".googleads.v14.services.CustomInterestOp" +
      "erationB\004\342A\001\002\022\025\n\rvalidate_only\030\004 \001(\010\"\343\001\n" +
      "\027CustomInterestOperation\022/\n\013update_mask\030" +
      "\004 \001(\0132\032.google.protobuf.FieldMask\022D\n\006cre" +
      "ate\030\001 \001(\01322.google.ads.googleads.v14.res" +
      "ources.CustomInterestH\000\022D\n\006update\030\002 \001(\0132" +
      "2.google.ads.googleads.v14.resources.Cus" +
      "tomInterestH\000B\013\n\toperation\"o\n\035MutateCust" +
      "omInterestsResponse\022N\n\007results\030\002 \003(\0132=.g" +
      "oogle.ads.googleads.v14.services.MutateC" +
      "ustomInterestResult\"a\n\032MutateCustomInter" +
      "estResult\022C\n\rresource_name\030\001 \001(\tB,\372A)\n\'g" +
      "oogleads.googleapis.com/CustomInterest2\326" +
      "\002\n\025CustomInterestService\022\365\001\n\025MutateCusto" +
      "mInterests\022?.google.ads.googleads.v14.se" +
      "rvices.MutateCustomInterestsRequest\032@.go" +
      "ogle.ads.googleads.v14.services.MutateCu" +
      "stomInterestsResponse\"Y\332A\026customer_id,op" +
      "erations\202\323\344\223\002:\"5/v14/customers/{customer" +
      "_id=*}/customInterests:mutate:\001*\032E\312A\030goo" +
      "gleads.googleapis.com\322A\'https://www.goog" +
      "leapis.com/auth/adwordsB\206\002\n%com.google.a" +
      "ds.googleads.v14.servicesB\032CustomInteres" +
      "tServiceProtoP\001ZIgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v14/service" +
      "s;services\242\002\003GAA\252\002!Google.Ads.GoogleAds." +
      "V14.Services\312\002!Google\\Ads\\GoogleAds\\V14\\" +
      "Services\352\002%Google::Ads::GoogleAds::V14::" +
      "Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.resources.CustomInterestProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateCustomInterestsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateCustomInterestsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomInterestsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", });
    internal_static_google_ads_googleads_v14_services_CustomInterestOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_CustomInterestOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_CustomInterestOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateCustomInterestsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateCustomInterestsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomInterestsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v14_services_MutateCustomInterestResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateCustomInterestResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomInterestResult_descriptor,
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
    com.google.ads.googleads.v14.resources.CustomInterestProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
