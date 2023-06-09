// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/shared_criterion_service.proto

package com.google.ads.googleads.v13.services;

public final class SharedCriterionServiceProto {
  private SharedCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_SharedCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_SharedCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_services_MutateSharedCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_services_MutateSharedCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v13/services/shar" +
      "ed_criterion_service.proto\022!google.ads.g" +
      "oogleads.v13.services\032:google/ads/google" +
      "ads/v13/enums/response_content_type.prot" +
      "o\0329google/ads/googleads/v13/resources/sh" +
      "ared_criterion.proto\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\027google/rpc/status.proto" +
      "\"\253\002\n\033MutateSharedCriteriaRequest\022\031\n\013cust" +
      "omer_id\030\001 \001(\tB\004\342A\001\002\022U\n\noperations\030\002 \003(\0132" +
      ";.google.ads.googleads.v13.services.Shar" +
      "edCriterionOperationB\004\342A\001\002\022\027\n\017partial_fa" +
      "ilure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025re" +
      "sponse_content_type\030\005 \001(\0162K.google.ads.g" +
      "oogleads.v13.enums.ResponseContentTypeEn" +
      "um.ResponseContentType\"\257\001\n\030SharedCriteri" +
      "onOperation\022E\n\006create\030\001 \001(\01323.google.ads" +
      ".googleads.v13.resources.SharedCriterion" +
      "H\000\022?\n\006remove\030\003 \001(\tB-\372A*\n(googleads.googl" +
      "eapis.com/SharedCriterionH\000B\013\n\toperation" +
      "\"\242\001\n\034MutateSharedCriteriaResponse\0221\n\025par" +
      "tial_failure_error\030\003 \001(\0132\022.google.rpc.St" +
      "atus\022O\n\007results\030\002 \003(\0132>.google.ads.googl" +
      "eads.v13.services.MutateSharedCriterionR" +
      "esult\"\262\001\n\033MutateSharedCriterionResult\022D\n" +
      "\rresource_name\030\001 \001(\tB-\372A*\n(googleads.goo" +
      "gleapis.com/SharedCriterion\022M\n\020shared_cr" +
      "iterion\030\002 \001(\01323.google.ads.googleads.v13" +
      ".resources.SharedCriterion2\323\002\n\026SharedCri" +
      "terionService\022\361\001\n\024MutateSharedCriteria\022>" +
      ".google.ads.googleads.v13.services.Mutat" +
      "eSharedCriteriaRequest\032?.google.ads.goog" +
      "leads.v13.services.MutateSharedCriteriaR" +
      "esponse\"X\332A\026customer_id,operations\202\323\344\223\0029" +
      "\"4/v13/customers/{customer_id=*}/sharedC" +
      "riteria:mutate:\001*\032E\312A\030googleads.googleap" +
      "is.com\322A\'https://www.googleapis.com/auth" +
      "/adwordsB\207\002\n%com.google.ads.googleads.v1" +
      "3.servicesB\033SharedCriterionServiceProtoP" +
      "\001ZIgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v13/services;services\242\002\003G" +
      "AA\252\002!Google.Ads.GoogleAds.V13.Services\312\002" +
      "!Google\\Ads\\GoogleAds\\V13\\Services\352\002%Goo" +
      "gle::Ads::GoogleAds::V13::Servicesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v13.resources.SharedCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v13_services_SharedCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v13_services_SharedCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_SharedCriterionOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateSharedCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v13_services_MutateSharedCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v13_services_MutateSharedCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_services_MutateSharedCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", "SharedCriterion", });
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
    com.google.ads.googleads.v13.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v13.resources.SharedCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
