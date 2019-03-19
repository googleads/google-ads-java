// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/recommendation_error.proto

package com.google.ads.googleads.v1.errors;

public final class RecommendationErrorProto {
  private RecommendationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v1/errors/recomme" +
      "ndation_error.proto\022\036google.ads.googlead" +
      "s.v1.errors\032\034google/api/annotations.prot" +
      "o\"\277\003\n\027RecommendationErrorEnum\"\243\003\n\023Recomm" +
      "endationError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOW" +
      "N\020\001\022\033\n\027BUDGET_AMOUNT_TOO_SMALL\020\002\022\033\n\027BUDG" +
      "ET_AMOUNT_TOO_LARGE\020\003\022\031\n\025INVALID_BUDGET_" +
      "AMOUNT\020\004\022\020\n\014POLICY_ERROR\020\005\022\026\n\022INVALID_BI" +
      "D_AMOUNT\020\006\022\031\n\025ADGROUP_KEYWORD_LIMIT\020\007\022\"\n" +
      "\036RECOMMENDATION_ALREADY_APPLIED\020\010\022\036\n\032REC" +
      "OMMENDATION_INVALIDATED\020\t\022\027\n\023TOO_MANY_OP" +
      "ERATIONS\020\n\022\021\n\rNO_OPERATIONS\020\013\022!\n\035DIFFERE" +
      "NT_TYPES_NOT_SUPPORTED\020\014\022\033\n\027DUPLICATE_RE" +
      "SOURCE_NAME\020\r\022$\n RECOMMENDATION_ALREADY_" +
      "DISMISSED\020\016B\363\001\n\"com.google.ads.googleads" +
      ".v1.errorsB\030RecommendationErrorProtoP\001ZD" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v1/errors;errors\242\002\003GAA\252\002\036Goo" +
      "gle.Ads.GoogleAds.V1.Errors\312\002\036Google\\Ads" +
      "\\GoogleAds\\V1\\Errors\352\002\"Google::Ads::Goog" +
      "leAds::V1::Errorsb\006proto3"
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
    internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
