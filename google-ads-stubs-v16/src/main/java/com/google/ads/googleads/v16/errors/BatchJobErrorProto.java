// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/errors/batch_job_error.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.errors;

public final class BatchJobErrorProto {
  private BatchJobErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_errors_BatchJobErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_errors_BatchJobErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v16/errors/batch_" +
      "job_error.proto\022\037google.ads.googleads.v1" +
      "6.errors\"\215\002\n\021BatchJobErrorEnum\"\367\001\n\rBatch" +
      "JobError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022." +
      "\n*CANNOT_MODIFY_JOB_AFTER_JOB_STARTS_RUN" +
      "NING\020\002\022\024\n\020EMPTY_OPERATIONS\020\003\022\032\n\026INVALID_" +
      "SEQUENCE_TOKEN\020\004\022\025\n\021RESULTS_NOT_READY\020\005\022" +
      "\025\n\021INVALID_PAGE_SIZE\020\006\022\037\n\033CAN_ONLY_REMOV" +
      "E_PENDING_JOB\020\007\022\027\n\023CANNOT_LIST_RESULTS\020\010" +
      "B\362\001\n#com.google.ads.googleads.v16.errors" +
      "B\022BatchJobErrorProtoP\001ZEgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v16/" +
      "errors;errors\242\002\003GAA\252\002\037Google.Ads.GoogleA" +
      "ds.V16.Errors\312\002\037Google\\Ads\\GoogleAds\\V16" +
      "\\Errors\352\002#Google::Ads::GoogleAds::V16::E" +
      "rrorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v16_errors_BatchJobErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_errors_BatchJobErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_errors_BatchJobErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
