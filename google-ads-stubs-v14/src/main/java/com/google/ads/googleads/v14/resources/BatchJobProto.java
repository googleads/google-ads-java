// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/batch_job.proto

package com.google.ads.googleads.v14.resources;

public final class BatchJobProto {
  private BatchJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_BatchJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_BatchJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_BatchJob_BatchJobMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_BatchJob_BatchJobMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v14/resources/bat" +
      "ch_job.proto\022\"google.ads.googleads.v14.r" +
      "esources\0325google/ads/googleads/v14/enums" +
      "/batch_job_status.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\"\350\007\n\010BatchJob\022A\n\rresource_name\030\001 \001(\tB" +
      "*\342A\001\005\372A#\n!googleads.googleapis.com/Batch" +
      "Job\022\025\n\002id\030\007 \001(\003B\004\342A\001\003H\000\210\001\001\022*\n\027next_add_s" +
      "equence_token\030\010 \001(\tB\004\342A\001\003H\001\210\001\001\022U\n\010metada" +
      "ta\030\004 \001(\0132=.google.ads.googleads.v14.reso" +
      "urces.BatchJob.BatchJobMetadataB\004\342A\001\003\022W\n" +
      "\006status\030\005 \001(\0162A.google.ads.googleads.v14" +
      ".enums.BatchJobStatusEnum.BatchJobStatus" +
      "B\004\342A\001\003\022)\n\026long_running_operation\030\t \001(\tB\004" +
      "\342A\001\003H\002\210\001\001\032\342\003\n\020BatchJobMetadata\022%\n\022creati" +
      "on_date_time\030\010 \001(\tB\004\342A\001\003H\000\210\001\001\022\"\n\017start_d" +
      "ate_time\030\007 \001(\tB\004\342A\001\003H\001\210\001\001\022\'\n\024completion_" +
      "date_time\030\t \001(\tB\004\342A\001\003H\002\210\001\001\022-\n\032estimated_" +
      "completion_ratio\030\n \001(\001B\004\342A\001\003H\003\210\001\001\022\"\n\017ope" +
      "ration_count\030\013 \001(\003B\004\342A\001\003H\004\210\001\001\022+\n\030execute" +
      "d_operation_count\030\014 \001(\003B\004\342A\001\003H\005\210\001\001\022*\n\027ex" +
      "ecution_limit_seconds\030\r \001(\005B\004\342A\001\005H\006\210\001\001B\025" +
      "\n\023_creation_date_timeB\022\n\020_start_date_tim" +
      "eB\027\n\025_completion_date_timeB\035\n\033_estimated" +
      "_completion_ratioB\022\n\020_operation_countB\033\n" +
      "\031_executed_operation_countB\032\n\030_execution" +
      "_limit_seconds:X\352AU\n!googleads.googleapi" +
      "s.com/BatchJob\0220customers/{customer_id}/" +
      "batchJobs/{batch_job_id}B\005\n\003_idB\032\n\030_next" +
      "_add_sequence_tokenB\031\n\027_long_running_ope" +
      "rationB\377\001\n&com.google.ads.googleads.v14." +
      "resourcesB\rBatchJobProtoP\001ZKgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v14/resources;resources\242\002\003GAA\252\002\"Google.A" +
      "ds.GoogleAds.V14.Resources\312\002\"Google\\Ads\\" +
      "GoogleAds\\V14\\Resources\352\002&Google::Ads::G" +
      "oogleAds::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.BatchJobStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_BatchJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_BatchJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_BatchJob_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "NextAddSequenceToken", "Metadata", "Status", "LongRunningOperation", "Id", "NextAddSequenceToken", "LongRunningOperation", });
    internal_static_google_ads_googleads_v14_resources_BatchJob_BatchJobMetadata_descriptor =
      internal_static_google_ads_googleads_v14_resources_BatchJob_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_BatchJob_BatchJobMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_BatchJob_BatchJobMetadata_descriptor,
        new java.lang.String[] { "CreationDateTime", "StartDateTime", "CompletionDateTime", "EstimatedCompletionRatio", "OperationCount", "ExecutedOperationCount", "ExecutionLimitSeconds", "CreationDateTime", "StartDateTime", "CompletionDateTime", "EstimatedCompletionRatio", "OperationCount", "ExecutedOperationCount", "ExecutionLimitSeconds", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.BatchJobStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
