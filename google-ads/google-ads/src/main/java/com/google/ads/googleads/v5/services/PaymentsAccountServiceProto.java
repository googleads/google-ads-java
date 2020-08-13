// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/payments_account_service.proto

package com.google.ads.googleads.v5.services;

public final class PaymentsAccountServiceProto {
  private PaymentsAccountServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v5/services/payme" +
      "nts_account_service.proto\022 google.ads.go" +
      "ogleads.v5.services\0328google/ads/googlead" +
      "s/v5/resources/payments_account.proto\032\034g" +
      "oogle/api/annotations.proto\032\027google/api/" +
      "client.proto\032\037google/api/field_behavior." +
      "proto\"7\n\033ListPaymentsAccountsRequest\022\030\n\013" +
      "customer_id\030\001 \001(\tB\003\340A\002\"m\n\034ListPaymentsAc" +
      "countsResponse\022M\n\021payments_accounts\030\001 \003(" +
      "\01322.google.ads.googleads.v5.resources.Pa" +
      "ymentsAccount2\223\002\n\026PaymentsAccountService" +
      "\022\333\001\n\024ListPaymentsAccounts\022=.google.ads.g" +
      "oogleads.v5.services.ListPaymentsAccount" +
      "sRequest\032>.google.ads.googleads.v5.servi" +
      "ces.ListPaymentsAccountsResponse\"D\202\323\344\223\0020" +
      "\022./v5/customers/{customer_id=*}/payments" +
      "Accounts\332A\013customer_id\032\033\312A\030googleads.goo" +
      "gleapis.comB\202\002\n$com.google.ads.googleads" +
      ".v5.servicesB\033PaymentsAccountServiceProt" +
      "oP\001ZHgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v5/services;services\242\002\003" +
      "GAA\252\002 Google.Ads.GoogleAds.V5.Services\312\002" +
      " Google\\Ads\\GoogleAds\\V5\\Services\352\002$Goog" +
      "le::Ads::GoogleAds::V5::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.resources.PaymentsAccountProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsRequest_descriptor,
        new java.lang.String[] { "CustomerId", });
    internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_ListPaymentsAccountsResponse_descriptor,
        new java.lang.String[] { "PaymentsAccounts", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.resources.PaymentsAccountProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
