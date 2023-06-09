// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/billing_setup_service.proto

package com.google.ads.googleads.v14.services;

public final class BillingSetupServiceProto {
  private BillingSetupServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateBillingSetupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateBillingSetupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_BillingSetupOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_BillingSetupOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateBillingSetupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateBillingSetupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateBillingSetupResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateBillingSetupResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v14/services/bill" +
      "ing_setup_service.proto\022!google.ads.goog" +
      "leads.v14.services\0326google/ads/googleads" +
      "/v14/resources/billing_setup.proto\032\034goog" +
      "le/api/annotations.proto\032\027google/api/cli" +
      "ent.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\"\211\001\n\031Mutate" +
      "BillingSetupRequest\022\031\n\013customer_id\030\001 \001(\t" +
      "B\004\342A\001\002\022Q\n\toperation\030\002 \001(\01328.google.ads.g" +
      "oogleads.v14.services.BillingSetupOperat" +
      "ionB\004\342A\001\002\"\246\001\n\025BillingSetupOperation\022B\n\006c" +
      "reate\030\002 \001(\01320.google.ads.googleads.v14.r" +
      "esources.BillingSetupH\000\022<\n\006remove\030\001 \001(\tB" +
      "*\372A\'\n%googleads.googleapis.com/BillingSe" +
      "tupH\000B\013\n\toperation\"i\n\032MutateBillingSetup" +
      "Response\022K\n\006result\030\001 \001(\0132;.google.ads.go" +
      "ogleads.v14.services.MutateBillingSetupR" +
      "esult\"]\n\030MutateBillingSetupResult\022A\n\rres" +
      "ource_name\030\001 \001(\tB*\372A\'\n%googleads.googlea" +
      "pis.com/BillingSetup2\310\002\n\023BillingSetupSer" +
      "vice\022\351\001\n\022MutateBillingSetup\022<.google.ads" +
      ".googleads.v14.services.MutateBillingSet" +
      "upRequest\032=.google.ads.googleads.v14.ser" +
      "vices.MutateBillingSetupResponse\"V\332A\025cus" +
      "tomer_id,operation\202\323\344\223\0028\"3/v14/customers" +
      "/{customer_id=*}/billingSetups:mutate:\001*" +
      "\032E\312A\030googleads.googleapis.com\322A\'https://" +
      "www.googleapis.com/auth/adwordsB\204\002\n%com." +
      "google.ads.googleads.v14.servicesB\030Billi" +
      "ngSetupServiceProtoP\001ZIgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v14/s" +
      "ervices;services\242\002\003GAA\252\002!Google.Ads.Goog" +
      "leAds.V14.Services\312\002!Google\\Ads\\GoogleAd" +
      "s\\V14\\Services\352\002%Google::Ads::GoogleAds:" +
      ":V14::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.resources.BillingSetupProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateBillingSetupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateBillingSetupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateBillingSetupRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v14_services_BillingSetupOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_BillingSetupOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_BillingSetupOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateBillingSetupResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateBillingSetupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateBillingSetupResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v14_services_MutateBillingSetupResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateBillingSetupResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateBillingSetupResult_descriptor,
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
    com.google.ads.googleads.v14.resources.BillingSetupProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
