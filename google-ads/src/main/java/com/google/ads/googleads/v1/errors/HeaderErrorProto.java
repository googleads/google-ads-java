// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/header_error.proto

package com.google.ads.googleads.v1.errors;

public final class HeaderErrorProto {
  private HeaderErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_HeaderErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_HeaderErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v1/errors/header_" +
      "error.proto\022\036google.ads.googleads.v1.err" +
      "ors\032\034google/api/annotations.proto\"]\n\017Hea" +
      "derErrorEnum\"J\n\013HeaderError\022\017\n\013UNSPECIFI" +
      "ED\020\000\022\013\n\007UNKNOWN\020\001\022\035\n\031INVALID_LOGIN_CUSTO" +
      "MER_ID\020\003B\353\001\n\"com.google.ads.googleads.v1" +
      ".errorsB\020HeaderErrorProtoP\001ZDgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v1/errors;errors\242\002\003GAA\252\002\036Google.Ads.Goo" +
      "gleAds.V1.Errors\312\002\036Google\\Ads\\GoogleAds\\" +
      "V1\\Errors\352\002\"Google::Ads::GoogleAds::V1::" +
      "Errorsb\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_errors_HeaderErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_HeaderErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_HeaderErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
