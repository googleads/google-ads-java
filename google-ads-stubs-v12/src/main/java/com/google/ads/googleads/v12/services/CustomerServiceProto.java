// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/customer_service.proto

package com.google.ads.googleads.v12.services;

public final class CustomerServiceProto {
  private CustomerServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateCustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_CreateCustomerClientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_CreateCustomerClientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_CustomerOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_CustomerOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_CreateCustomerClientResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_CreateCustomerClientResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateCustomerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateCustomerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateCustomerResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateCustomerResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v12/services/cust" +
      "omer_service.proto\022!google.ads.googleads" +
      ".v12.services\0320google/ads/googleads/v12/" +
      "enums/access_role.proto\032:google/ads/goog" +
      "leads/v12/enums/response_content_type.pr" +
      "oto\0321google/ads/googleads/v12/resources/" +
      "customer.proto\032\034google/api/annotations.p" +
      "roto\032\027google/api/client.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\032 google/protobuf/field_mask.pr" +
      "oto\"\204\002\n\025MutateCustomerRequest\022\031\n\013custome" +
      "r_id\030\001 \001(\tB\004\342A\001\002\022M\n\toperation\030\004 \001(\01324.go" +
      "ogle.ads.googleads.v12.services.Customer" +
      "OperationB\004\342A\001\002\022\025\n\rvalidate_only\030\005 \001(\010\022j" +
      "\n\025response_content_type\030\006 \001(\0162K.google.a" +
      "ds.googleads.v12.enums.ResponseContentTy" +
      "peEnum.ResponseContentType\"\232\002\n\033CreateCus" +
      "tomerClientRequest\022\031\n\013customer_id\030\001 \001(\tB" +
      "\004\342A\001\002\022K\n\017customer_client\030\002 \001(\0132,.google." +
      "ads.googleads.v12.resources.CustomerB\004\342A" +
      "\001\002\022\032\n\remail_address\030\005 \001(\tH\000\210\001\001\022N\n\013access" +
      "_role\030\004 \001(\01629.google.ads.googleads.v12.e" +
      "nums.AccessRoleEnum.AccessRole\022\025\n\rvalida" +
      "te_only\030\006 \001(\010B\020\n\016_email_address\"\202\001\n\021Cust" +
      "omerOperation\022<\n\006update\030\001 \001(\0132,.google.a" +
      "ds.googleads.v12.resources.Customer\022/\n\013u" +
      "pdate_mask\030\002 \001(\0132\032.google.protobuf.Field" +
      "Mask\"v\n\034CreateCustomerClientResponse\022=\n\r" +
      "resource_name\030\002 \001(\tB&\372A#\n!googleads.goog" +
      "leapis.com/Customer\022\027\n\017invitation_link\030\003" +
      " \001(\t\"a\n\026MutateCustomerResponse\022G\n\006result" +
      "\030\002 \001(\01327.google.ads.googleads.v12.servic" +
      "es.MutateCustomerResult\"\225\001\n\024MutateCustom" +
      "erResult\022=\n\rresource_name\030\001 \001(\tB&\372A#\n!go" +
      "ogleads.googleapis.com/Customer\022>\n\010custo" +
      "mer\030\002 \001(\0132,.google.ads.googleads.v12.res" +
      "ources.Customer\" \n\036ListAccessibleCustome" +
      "rsRequest\"9\n\037ListAccessibleCustomersResp" +
      "onse\022\026\n\016resource_names\030\001 \003(\t2\365\005\n\017Custome" +
      "rService\022\317\001\n\016MutateCustomer\0228.google.ads" +
      ".googleads.v12.services.MutateCustomerRe" +
      "quest\0329.google.ads.googleads.v12.service" +
      "s.MutateCustomerResponse\"H\332A\025customer_id" +
      ",operation\202\323\344\223\002*\"%/v12/customers/{custom" +
      "er_id=*}:mutate:\001*\022\320\001\n\027ListAccessibleCus" +
      "tomers\022A.google.ads.googleads.v12.servic" +
      "es.ListAccessibleCustomersRequest\032B.goog" +
      "le.ads.googleads.v12.services.ListAccess" +
      "ibleCustomersResponse\".\202\323\344\223\002(\022&/v12/cust" +
      "omers:listAccessibleCustomers\022\365\001\n\024Create" +
      "CustomerClient\022>.google.ads.googleads.v1" +
      "2.services.CreateCustomerClientRequest\032?" +
      ".google.ads.googleads.v12.services.Creat" +
      "eCustomerClientResponse\"\\\332A\033customer_id," +
      "customer_client\202\323\344\223\0028\"3/v12/customers/{c" +
      "ustomer_id=*}:createCustomerClient:\001*\032E\312" +
      "A\030googleads.googleapis.com\322A\'https://www" +
      ".googleapis.com/auth/adwordsB\200\002\n%com.goo" +
      "gle.ads.googleads.v12.servicesB\024Customer" +
      "ServiceProtoP\001ZIgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v12/services" +
      ";services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V" +
      "12.Services\312\002!Google\\Ads\\GoogleAds\\V12\\S" +
      "ervices\352\002%Google::Ads::GoogleAds::V12::S" +
      "ervicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.AccessRoleProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.resources.CustomerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateCustomerRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v12_services_CreateCustomerClientRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_CreateCustomerClientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_CreateCustomerClientRequest_descriptor,
        new java.lang.String[] { "CustomerId", "CustomerClient", "EmailAddress", "AccessRole", "ValidateOnly", "EmailAddress", });
    internal_static_google_ads_googleads_v12_services_CustomerOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_CustomerOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_CustomerOperation_descriptor,
        new java.lang.String[] { "Update", "UpdateMask", });
    internal_static_google_ads_googleads_v12_services_CreateCustomerClientResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_CreateCustomerClientResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_CreateCustomerClientResponse_descriptor,
        new java.lang.String[] { "ResourceName", "InvitationLink", });
    internal_static_google_ads_googleads_v12_services_MutateCustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v12_services_MutateCustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateCustomerResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v12_services_MutateCustomerResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v12_services_MutateCustomerResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateCustomerResult_descriptor,
        new java.lang.String[] { "ResourceName", "Customer", });
    internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersRequest_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_ListAccessibleCustomersResponse_descriptor,
        new java.lang.String[] { "ResourceNames", });
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
    com.google.ads.googleads.v12.enums.AccessRoleProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v12.resources.CustomerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
