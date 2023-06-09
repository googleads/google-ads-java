// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/payments_account.proto

package com.google.ads.googleads.v14.resources;

public final class PaymentsAccountProto {
  private PaymentsAccountProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_PaymentsAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_PaymentsAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v14/resources/pay" +
      "ments_account.proto\022\"google.ads.googlead" +
      "s.v14.resources\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\"\342\004\n\017" +
      "PaymentsAccount\022H\n\rresource_name\030\001 \001(\tB1" +
      "\342A\001\003\372A*\n(googleads.googleapis.com/Paymen" +
      "tsAccount\022&\n\023payments_account_id\030\010 \001(\tB\004" +
      "\342A\001\003H\000\210\001\001\022\027\n\004name\030\t \001(\tB\004\342A\001\003H\001\210\001\001\022 \n\rcu" +
      "rrency_code\030\n \001(\tB\004\342A\001\003H\002\210\001\001\022&\n\023payments" +
      "_profile_id\030\013 \001(\tB\004\342A\001\003H\003\210\001\001\0220\n\035secondar" +
      "y_payments_profile_id\030\014 \001(\tB\004\342A\001\003H\004\210\001\001\022P" +
      "\n\027paying_manager_customer\030\r \001(\tB*\342A\001\003\372A#" +
      "\n!googleads.googleapis.com/CustomerH\005\210\001\001" +
      ":m\352Aj\n(googleads.googleapis.com/Payments" +
      "Account\022>customers/{customer_id}/payment" +
      "sAccounts/{payments_account_id}B\026\n\024_paym" +
      "ents_account_idB\007\n\005_nameB\020\n\016_currency_co" +
      "deB\026\n\024_payments_profile_idB \n\036_secondary" +
      "_payments_profile_idB\032\n\030_paying_manager_" +
      "customerB\206\002\n&com.google.ads.googleads.v1" +
      "4.resourcesB\024PaymentsAccountProtoP\001ZKgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v14/resources;resources\242\002\003GAA\252\002" +
      "\"Google.Ads.GoogleAds.V14.Resources\312\002\"Go" +
      "ogle\\Ads\\GoogleAds\\V14\\Resources\352\002&Googl" +
      "e::Ads::GoogleAds::V14::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_PaymentsAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_PaymentsAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_PaymentsAccount_descriptor,
        new java.lang.String[] { "ResourceName", "PaymentsAccountId", "Name", "CurrencyCode", "PaymentsProfileId", "SecondaryPaymentsProfileId", "PayingManagerCustomer", "PaymentsAccountId", "Name", "CurrencyCode", "PaymentsProfileId", "SecondaryPaymentsProfileId", "PayingManagerCustomer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
