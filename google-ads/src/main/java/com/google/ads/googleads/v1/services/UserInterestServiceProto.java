// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/user_interest_service.proto

package com.google.ads.googleads.v1.services;

public final class UserInterestServiceProto {
  private UserInterestServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetUserInterestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetUserInterestRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v1/services/user_" +
      "interest_service.proto\022 google.ads.googl" +
      "eads.v1.services\0325google/ads/googleads/v" +
      "1/resources/user_interest.proto\032\034google/" +
      "api/annotations.proto\"/\n\026GetUserInterest" +
      "Request\022\025\n\rresource_name\030\001 \001(\t2\315\001\n\023UserI" +
      "nterestService\022\265\001\n\017GetUserInterest\0228.goo" +
      "gle.ads.googleads.v1.services.GetUserInt" +
      "erestRequest\032/.google.ads.googleads.v1.r" +
      "esources.UserInterest\"7\202\323\344\223\0021\022//v1/{reso" +
      "urce_name=customers/*/userInterests/*}B\377" +
      "\001\n$com.google.ads.googleads.v1.servicesB" +
      "\030UserInterestServiceProtoP\001ZHgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v1/services;services\242\002\003GAA\252\002 Google.Ads" +
      ".GoogleAds.V1.Services\312\002 Google\\Ads\\Goog" +
      "leAds\\V1\\Services\352\002$Google::Ads::GoogleA" +
      "ds::V1::Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.UserInterestProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetUserInterestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetUserInterestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetUserInterestRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.UserInterestProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
