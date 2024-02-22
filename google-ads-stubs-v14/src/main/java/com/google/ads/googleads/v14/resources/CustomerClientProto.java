// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/customer_client.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.resources;

public final class CustomerClientProto {
  private CustomerClientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_CustomerClient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_CustomerClient_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v14/resources/cus" +
      "tomer_client.proto\022\"google.ads.googleads" +
      ".v14.resources\0324google/ads/googleads/v14" +
      "/enums/customer_status.proto\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\"\215\006\n\016CustomerClient\022F\n\rresource_" +
      "name\030\001 \001(\tB/\340A\003\372A)\n\'googleads.googleapis" +
      ".com/CustomerClient\022G\n\017client_customer\030\014" +
      " \001(\tB)\340A\003\372A#\n!googleads.googleapis.com/C" +
      "ustomerH\000\210\001\001\022\030\n\006hidden\030\r \001(\010B\003\340A\003H\001\210\001\001\022\027" +
      "\n\005level\030\016 \001(\003B\003\340A\003H\002\210\001\001\022\033\n\ttime_zone\030\017 \001" +
      "(\tB\003\340A\003H\003\210\001\001\022\036\n\014test_account\030\020 \001(\010B\003\340A\003H" +
      "\004\210\001\001\022\031\n\007manager\030\021 \001(\010B\003\340A\003H\005\210\001\001\022\"\n\020descr" +
      "iptive_name\030\022 \001(\tB\003\340A\003H\006\210\001\001\022\037\n\rcurrency_" +
      "code\030\023 \001(\tB\003\340A\003H\007\210\001\001\022\024\n\002id\030\024 \001(\003B\003\340A\003H\010\210" +
      "\001\001\022>\n\016applied_labels\030\025 \003(\tB&\340A\003\372A \n\036goog" +
      "leads.googleapis.com/Label\022V\n\006status\030\026 \001" +
      "(\0162A.google.ads.googleads.v14.enums.Cust" +
      "omerStatusEnum.CustomerStatusB\003\340A\003:j\352Ag\n" +
      "\'googleads.googleapis.com/CustomerClient" +
      "\022<customers/{customer_id}/customerClient" +
      "s/{client_customer_id}B\022\n\020_client_custom" +
      "erB\t\n\007_hiddenB\010\n\006_levelB\014\n\n_time_zoneB\017\n" +
      "\r_test_accountB\n\n\010_managerB\023\n\021_descripti" +
      "ve_nameB\020\n\016_currency_codeB\005\n\003_idB\205\002\n&com" +
      ".google.ads.googleads.v14.resourcesB\023Cus" +
      "tomerClientProtoP\001ZKgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v14/reso" +
      "urces;resources\242\002\003GAA\252\002\"Google.Ads.Googl" +
      "eAds.V14.Resources\312\002\"Google\\Ads\\GoogleAd" +
      "s\\V14\\Resources\352\002&Google::Ads::GoogleAds" +
      "::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.CustomerStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_CustomerClient_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_CustomerClient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_CustomerClient_descriptor,
        new java.lang.String[] { "ResourceName", "ClientCustomer", "Hidden", "Level", "TimeZone", "TestAccount", "Manager", "DescriptiveName", "CurrencyCode", "Id", "AppliedLabels", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.CustomerStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
