// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/parental_status_view_service.proto

package com.google.ads.googleads.v1.services;

public final class ParentalStatusViewServiceProto {
  private ParentalStatusViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetParentalStatusViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetParentalStatusViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v1/services/paren" +
      "tal_status_view_service.proto\022 google.ad" +
      "s.googleads.v1.services\032<google/ads/goog" +
      "leads/v1/resources/parental_status_view." +
      "proto\032\034google/api/annotations.proto\"5\n\034G" +
      "etParentalStatusViewRequest\022\025\n\rresource_" +
      "name\030\001 \001(\t2\353\001\n\031ParentalStatusViewService" +
      "\022\315\001\n\025GetParentalStatusView\022>.google.ads." +
      "googleads.v1.services.GetParentalStatusV" +
      "iewRequest\0325.google.ads.googleads.v1.res" +
      "ources.ParentalStatusView\"=\202\323\344\223\0027\0225/v1/{" +
      "resource_name=customers/*/parentalStatus" +
      "Views/*}B\205\002\n$com.google.ads.googleads.v1" +
      ".servicesB\036ParentalStatusViewServiceProt" +
      "oP\001ZHgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v1/services;services\242\002\003" +
      "GAA\252\002 Google.Ads.GoogleAds.V1.Services\312\002" +
      " Google\\Ads\\GoogleAds\\V1\\Services\352\002$Goog" +
      "le::Ads::GoogleAds::V1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.ParentalStatusViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetParentalStatusViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetParentalStatusViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetParentalStatusViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.ParentalStatusViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
