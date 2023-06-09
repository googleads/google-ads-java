// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/account_link_service.proto

package com.google.ads.googleads.v12.services;

public final class AccountLinkServiceProto {
  private AccountLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_CreateAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_CreateAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_CreateAccountLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_CreateAccountLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_AccountLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_AccountLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateAccountLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateAccountLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateAccountLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateAccountLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v12/services/acco" +
      "unt_link_service.proto\022!google.ads.googl" +
      "eads.v12.services\0325google/ads/googleads/" +
      "v12/resources/account_link.proto\032\034google" +
      "/api/annotations.proto\032\027google/api/clien" +
      "t.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032 google/prot" +
      "obuf/field_mask.proto\032\027google/rpc/status" +
      ".proto\"\202\001\n\030CreateAccountLinkRequest\022\031\n\013c" +
      "ustomer_id\030\001 \001(\tB\004\342A\001\002\022K\n\014account_link\030\002" +
      " \001(\0132/.google.ads.googleads.v12.resource" +
      "s.AccountLinkB\004\342A\001\002\"]\n\031CreateAccountLink" +
      "Response\022@\n\rresource_name\030\001 \001(\tB)\372A&\n$go" +
      "ogleads.googleapis.com/AccountLink\"\267\001\n\030M" +
      "utateAccountLinkRequest\022\031\n\013customer_id\030\001" +
      " \001(\tB\004\342A\001\002\022P\n\toperation\030\002 \001(\01327.google.a" +
      "ds.googleads.v12.services.AccountLinkOpe" +
      "rationB\004\342A\001\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n" +
      "\rvalidate_only\030\004 \001(\010\"\324\001\n\024AccountLinkOper" +
      "ation\022/\n\013update_mask\030\004 \001(\0132\032.google.prot" +
      "obuf.FieldMask\022A\n\006update\030\002 \001(\0132/.google." +
      "ads.googleads.v12.resources.AccountLinkH" +
      "\000\022;\n\006remove\030\003 \001(\tB)\372A&\n$googleads.google" +
      "apis.com/AccountLinkH\000B\013\n\toperation\"\232\001\n\031" +
      "MutateAccountLinkResponse\022J\n\006result\030\001 \001(" +
      "\0132:.google.ads.googleads.v12.services.Mu" +
      "tateAccountLinkResult\0221\n\025partial_failure" +
      "_error\030\002 \001(\0132\022.google.rpc.Status\"[\n\027Muta" +
      "teAccountLinkResult\022@\n\rresource_name\030\001 \001" +
      "(\tB)\372A&\n$googleads.googleapis.com/Accoun" +
      "tLink2\256\004\n\022AccountLinkService\022\350\001\n\021CreateA" +
      "ccountLink\022;.google.ads.googleads.v12.se" +
      "rvices.CreateAccountLinkRequest\032<.google" +
      ".ads.googleads.v12.services.CreateAccoun" +
      "tLinkResponse\"X\332A\030customer_id,account_li" +
      "nk\202\323\344\223\0027\"2/v12/customers/{customer_id=*}" +
      "/accountLinks:create:\001*\022\345\001\n\021MutateAccoun" +
      "tLink\022;.google.ads.googleads.v12.service" +
      "s.MutateAccountLinkRequest\032<.google.ads." +
      "googleads.v12.services.MutateAccountLink" +
      "Response\"U\332A\025customer_id,operation\202\323\344\223\0027" +
      "\"2/v12/customers/{customer_id=*}/account" +
      "Links:mutate:\001*\032E\312A\030googleads.googleapis" +
      ".com\322A\'https://www.googleapis.com/auth/a" +
      "dwordsB\203\002\n%com.google.ads.googleads.v12." +
      "servicesB\027AccountLinkServiceProtoP\001ZIgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v12/services;services\242\002\003GAA\252\002!G" +
      "oogle.Ads.GoogleAds.V12.Services\312\002!Googl" +
      "e\\Ads\\GoogleAds\\V12\\Services\352\002%Google::A" +
      "ds::GoogleAds::V12::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.resources.AccountLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_CreateAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_CreateAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_CreateAccountLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "AccountLink", });
    internal_static_google_ads_googleads_v12_services_CreateAccountLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_CreateAccountLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_CreateAccountLinkResponse_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v12_services_MutateAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateAccountLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v12_services_AccountLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_AccountLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_AccountLinkOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateAccountLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v12_services_MutateAccountLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateAccountLinkResponse_descriptor,
        new java.lang.String[] { "Result", "PartialFailureError", });
    internal_static_google_ads_googleads_v12_services_MutateAccountLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v12_services_MutateAccountLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateAccountLinkResult_descriptor,
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
    com.google.ads.googleads.v12.resources.AccountLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
