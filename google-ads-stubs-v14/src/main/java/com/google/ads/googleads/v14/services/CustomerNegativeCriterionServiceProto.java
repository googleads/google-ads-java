// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/customer_negative_criterion_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public final class CustomerNegativeCriterionServiceProto {
  private CustomerNegativeCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_CustomerNegativeCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_CustomerNegativeCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKgoogle/ads/googleads/v14/services/cust" +
      "omer_negative_criterion_service.proto\022!g" +
      "oogle.ads.googleads.v14.services\032:google" +
      "/ads/googleads/v14/enums/response_conten" +
      "t_type.proto\032Dgoogle/ads/googleads/v14/r" +
      "esources/customer_negative_criterion.pro" +
      "to\032\034google/api/annotations.proto\032\027google" +
      "/api/client.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032\027g" +
      "oogle/rpc/status.proto\"\275\002\n%MutateCustome" +
      "rNegativeCriteriaRequest\022\030\n\013customer_id\030" +
      "\001 \001(\tB\003\340A\002\022^\n\noperations\030\002 \003(\0132E.google." +
      "ads.googleads.v14.services.CustomerNegat" +
      "iveCriterionOperationB\003\340A\002\022\027\n\017partial_fa" +
      "ilure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025re" +
      "sponse_content_type\030\005 \001(\0162K.google.ads.g" +
      "oogleads.v14.enums.ResponseContentTypeEn" +
      "um.ResponseContentType\"\315\001\n\"CustomerNegat" +
      "iveCriterionOperation\022O\n\006create\030\001 \001(\0132=." +
      "google.ads.googleads.v14.resources.Custo" +
      "merNegativeCriterionH\000\022I\n\006remove\030\002 \001(\tB7" +
      "\372A4\n2googleads.googleapis.com/CustomerNe" +
      "gativeCriterionH\000B\013\n\toperation\"\265\001\n&Mutat" +
      "eCustomerNegativeCriteriaResponse\0221\n\025par" +
      "tial_failure_error\030\003 \001(\0132\022.google.rpc.St" +
      "atus\022X\n\007results\030\002 \003(\0132G.google.ads.googl" +
      "eads.v14.services.MutateCustomerNegative" +
      "CriteriaResult\"\332\001\n$MutateCustomerNegativ" +
      "eCriteriaResult\022N\n\rresource_name\030\001 \001(\tB7" +
      "\372A4\n2googleads.googleapis.com/CustomerNe" +
      "gativeCriterion\022b\n\033customer_negative_cri" +
      "terion\030\002 \001(\0132=.google.ads.googleads.v14." +
      "resources.CustomerNegativeCriterion2\205\003\n " +
      "CustomerNegativeCriterionService\022\231\002\n\036Mut" +
      "ateCustomerNegativeCriteria\022H.google.ads" +
      ".googleads.v14.services.MutateCustomerNe" +
      "gativeCriteriaRequest\032I.google.ads.googl" +
      "eads.v14.services.MutateCustomerNegative" +
      "CriteriaResponse\"b\332A\026customer_id,operati" +
      "ons\202\323\344\223\002C\">/v14/customers/{customer_id=*" +
      "}/customerNegativeCriteria:mutate:\001*\032E\312A" +
      "\030googleads.googleapis.com\322A\'https://www." +
      "googleapis.com/auth/adwordsB\221\002\n%com.goog" +
      "le.ads.googleads.v14.servicesB%CustomerN" +
      "egativeCriterionServiceProtoP\001ZIgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v14/services;services\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V14.Services\312\002!Google\\Ads" +
      "\\GoogleAds\\V14\\Services\352\002%Google::Ads::G" +
      "oogleAds::V14::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.resources.CustomerNegativeCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v14_services_CustomerNegativeCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_CustomerNegativeCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_CustomerNegativeCriterionOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCustomerNegativeCriteriaResult_descriptor,
        new java.lang.String[] { "ResourceName", "CustomerNegativeCriterion", });
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
    com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v14.resources.CustomerNegativeCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
