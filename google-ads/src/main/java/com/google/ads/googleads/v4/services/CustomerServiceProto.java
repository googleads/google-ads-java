// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/customer_service.proto

package com.google.ads.googleads.v4.services;

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
    internal_static_google_ads_googleads_v4_services_GetCustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_CreateCustomerClientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_CreateCustomerClientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_CustomerOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_CustomerOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_CreateCustomerClientResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_CreateCustomerClientResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCustomerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCustomerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCustomerResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCustomerResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v4/services/custo" +
      "mer_service.proto\022 google.ads.googleads." +
      "v4.services\032/google/ads/googleads/v4/enu" +
      "ms/access_role.proto\0320google/ads/googlea" +
      "ds/v4/resources/customer.proto\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032 google/protob" +
      "uf/field_mask.proto\032\036google/protobuf/wra" +
      "ppers.proto\"V\n\022GetCustomerRequest\022@\n\rres" +
      "ource_name\030\001 \001(\tB)\340A\002\372A#\n!googleads.goog" +
      "leapis.com/Customer\"\225\001\n\025MutateCustomerRe" +
      "quest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022K\n\topera" +
      "tion\030\004 \001(\01323.google.ads.googleads.v4.ser" +
      "vices.CustomerOperationB\003\340A\002\022\025\n\rvalidate" +
      "_only\030\005 \001(\010\"\206\002\n\033CreateCustomerClientRequ" +
      "est\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022I\n\017custome" +
      "r_client\030\002 \001(\0132+.google.ads.googleads.v4" +
      ".resources.CustomerB\003\340A\002\0223\n\remail_addres" +
      "s\030\003 \001(\0132\034.google.protobuf.StringValue\022M\n" +
      "\013access_role\030\004 \001(\01628.google.ads.googlead" +
      "s.v4.enums.AccessRoleEnum.AccessRole\"\201\001\n" +
      "\021CustomerOperation\022;\n\006update\030\001 \001(\0132+.goo" +
      "gle.ads.googleads.v4.resources.Customer\022" +
      "/\n\013update_mask\030\002 \001(\0132\032.google.protobuf.F" +
      "ieldMask\"N\n\034CreateCustomerClientResponse" +
      "\022\025\n\rresource_name\030\002 \001(\t\022\027\n\017invitation_li" +
      "nk\030\003 \001(\t\"`\n\026MutateCustomerResponse\022F\n\006re" +
      "sult\030\002 \001(\01326.google.ads.googleads.v4.ser" +
      "vices.MutateCustomerResult\"-\n\024MutateCust" +
      "omerResult\022\025\n\rresource_name\030\001 \001(\t\" \n\036Lis" +
      "tAccessibleCustomersRequest\"9\n\037ListAcces" +
      "sibleCustomersResponse\022\026\n\016resource_names" +
      "\030\001 \003(\t2\356\006\n\017CustomerService\022\251\001\n\013GetCustom" +
      "er\0224.google.ads.googleads.v4.services.Ge" +
      "tCustomerRequest\032+.google.ads.googleads." +
      "v4.resources.Customer\"7\202\323\344\223\002!\022\037/v4/{reso" +
      "urce_name=customers/*}\332A\rresource_name\022\314" +
      "\001\n\016MutateCustomer\0227.google.ads.googleads" +
      ".v4.services.MutateCustomerRequest\0328.goo" +
      "gle.ads.googleads.v4.services.MutateCust" +
      "omerResponse\"G\202\323\344\223\002)\"$/v4/customers/{cus" +
      "tomer_id=*}:mutate:\001*\332A\025customer_id,oper" +
      "ation\022\315\001\n\027ListAccessibleCustomers\022@.goog" +
      "le.ads.googleads.v4.services.ListAccessi" +
      "bleCustomersRequest\032A.google.ads.googlea" +
      "ds.v4.services.ListAccessibleCustomersRe" +
      "sponse\"-\202\323\344\223\002\'\022%/v4/customers:listAccess" +
      "ibleCustomers\022\362\001\n\024CreateCustomerClient\022=" +
      ".google.ads.googleads.v4.services.Create" +
      "CustomerClientRequest\032>.google.ads.googl" +
      "eads.v4.services.CreateCustomerClientRes" +
      "ponse\"[\202\323\344\223\0027\"2/v4/customers/{customer_i" +
      "d=*}:createCustomerClient:\001*\332A\033customer_" +
      "id,customer_client\032\033\312A\030googleads.googlea" +
      "pis.comB\373\001\n$com.google.ads.googleads.v4." +
      "servicesB\024CustomerServiceProtoP\001ZHgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v4/services;services\242\002\003GAA\252\002 Googl" +
      "e.Ads.GoogleAds.V4.Services\312\002 Google\\Ads" +
      "\\GoogleAds\\V4\\Services\352\002$Google::Ads::Go" +
      "ogleAds::V4::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.enums.AccessRoleProto.getDescriptor(),
          com.google.ads.googleads.v4.resources.CustomerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetCustomerRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_MutateCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCustomerRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "ValidateOnly", });
    internal_static_google_ads_googleads_v4_services_CreateCustomerClientRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_CreateCustomerClientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_CreateCustomerClientRequest_descriptor,
        new java.lang.String[] { "CustomerId", "CustomerClient", "EmailAddress", "AccessRole", });
    internal_static_google_ads_googleads_v4_services_CustomerOperation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_CustomerOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_CustomerOperation_descriptor,
        new java.lang.String[] { "Update", "UpdateMask", });
    internal_static_google_ads_googleads_v4_services_CreateCustomerClientResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_CreateCustomerClientResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_CreateCustomerClientResponse_descriptor,
        new java.lang.String[] { "ResourceName", "InvitationLink", });
    internal_static_google_ads_googleads_v4_services_MutateCustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v4_services_MutateCustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCustomerResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v4_services_MutateCustomerResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v4_services_MutateCustomerResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCustomerResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersRequest_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_ListAccessibleCustomersResponse_descriptor,
        new java.lang.String[] { "ResourceNames", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.enums.AccessRoleProto.getDescriptor();
    com.google.ads.googleads.v4.resources.CustomerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
