// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/errors/label_error.proto

package com.google.ads.googleads.v14.errors;

public final class LabelErrorProto {
  private LabelErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_errors_LabelErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_errors_LabelErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v14/errors/label_" +
      "error.proto\022\037google.ads.googleads.v14.er" +
      "rors\"\226\003\n\016LabelErrorEnum\"\203\003\n\nLabelError\022\017" +
      "\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\037\n\033CANNOT_A" +
      "PPLY_INACTIVE_LABEL\020\002\0225\n1CANNOT_APPLY_LA" +
      "BEL_TO_DISABLED_AD_GROUP_CRITERION\020\003\0225\n1" +
      "CANNOT_APPLY_LABEL_TO_NEGATIVE_AD_GROUP_" +
      "CRITERION\020\004\022!\n\035EXCEEDED_LABEL_LIMIT_PER_" +
      "TYPE\020\005\022&\n\"INVALID_RESOURCE_FOR_MANAGER_L" +
      "ABEL\020\006\022\022\n\016DUPLICATE_NAME\020\007\022\026\n\022INVALID_LA" +
      "BEL_NAME\020\010\022 \n\034CANNOT_ATTACH_LABEL_TO_DRA" +
      "FT\020\t\022/\n+CANNOT_ATTACH_NON_MANAGER_LABEL_" +
      "TO_CUSTOMER\020\nB\357\001\n#com.google.ads.googlea" +
      "ds.v14.errorsB\017LabelErrorProtoP\001ZEgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v14/errors;errors\242\002\003GAA\252\002\037Google.A" +
      "ds.GoogleAds.V14.Errors\312\002\037Google\\Ads\\Goo" +
      "gleAds\\V14\\Errors\352\002#Google::Ads::GoogleA" +
      "ds::V14::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v14_errors_LabelErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_errors_LabelErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_errors_LabelErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
