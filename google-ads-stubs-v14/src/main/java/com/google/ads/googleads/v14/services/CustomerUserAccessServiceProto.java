// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/customer_user_access_service.proto

package com.google.ads.googleads.v14.services;

public final class CustomerUserAccessServiceProto {
  private CustomerUserAccessServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_CustomerUserAccessOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_CustomerUserAccessOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v14/services/cust" +
      "omer_user_access_service.proto\022!google.a" +
      "ds.googleads.v14.services\032=google/ads/go" +
      "ogleads/v14/resources/customer_user_acce" +
      "ss.proto\032\034google/api/annotations.proto\032\027" +
      "google/api/client.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032 google/protobuf/field_mask.proto\"\225\001" +
      "\n\037MutateCustomerUserAccessRequest\022\031\n\013cus" +
      "tomer_id\030\001 \001(\tB\004\342A\001\002\022W\n\toperation\030\002 \001(\0132" +
      ">.google.ads.googleads.v14.services.Cust" +
      "omerUserAccessOperationB\004\342A\001\002\"\351\001\n\033Custom" +
      "erUserAccessOperation\022/\n\013update_mask\030\003 \001" +
      "(\0132\032.google.protobuf.FieldMask\022H\n\006update" +
      "\030\001 \001(\01326.google.ads.googleads.v14.resour" +
      "ces.CustomerUserAccessH\000\022B\n\006remove\030\002 \001(\t" +
      "B0\372A-\n+googleads.googleapis.com/Customer" +
      "UserAccessH\000B\013\n\toperation\"u\n MutateCusto" +
      "merUserAccessResponse\022Q\n\006result\030\001 \001(\0132A." +
      "google.ads.googleads.v14.services.Mutate" +
      "CustomerUserAccessResult\"i\n\036MutateCustom" +
      "erUserAccessResult\022G\n\rresource_name\030\001 \001(" +
      "\tB0\372A-\n+googleads.googleapis.com/Custome" +
      "rUserAccess2\347\002\n\031CustomerUserAccessServic" +
      "e\022\202\002\n\030MutateCustomerUserAccess\022B.google." +
      "ads.googleads.v14.services.MutateCustome" +
      "rUserAccessRequest\032C.google.ads.googlead" +
      "s.v14.services.MutateCustomerUserAccessR" +
      "esponse\"]\332A\025customer_id,operation\202\323\344\223\002?\"" +
      ":/v14/customers/{customer_id=*}/customer" +
      "UserAccesses:mutate:\001*\032E\312A\030googleads.goo" +
      "gleapis.com\322A\'https://www.googleapis.com" +
      "/auth/adwordsB\212\002\n%com.google.ads.googlea" +
      "ds.v14.servicesB\036CustomerUserAccessServi" +
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
          com.google.ads.googleads.v14.resources.CustomerUserAccessProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v14_services_CustomerUserAccessOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_CustomerUserAccessOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_CustomerUserAccessOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomerUserAccessResult_descriptor,
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
    com.google.ads.googleads.v14.resources.CustomerUserAccessProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
