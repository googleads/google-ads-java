// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/batch_job.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

public interface BatchJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.BatchJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the batch job.
   * Batch job resource names have the form:
   *
   * `customers/{customer_id}/batchJobs/{batch_job_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the batch job.
   * Batch job resource names have the form:
   *
   * `customers/{customer_id}/batchJobs/{batch_job_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ID of this batch job.
   * </pre>
   *
   * <code>optional int64 id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. ID of this batch job.
   * </pre>
   *
   * <code>optional int64 id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The next sequence token to use when adding operations. Only
   * set when the batch job status is PENDING.
   * </pre>
   *
   * <code>optional string next_add_sequence_token = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the nextAddSequenceToken field is set.
   */
  boolean hasNextAddSequenceToken();
  /**
   * <pre>
   * Output only. The next sequence token to use when adding operations. Only
   * set when the batch job status is PENDING.
   * </pre>
   *
   * <code>optional string next_add_sequence_token = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nextAddSequenceToken.
   */
  java.lang.String getNextAddSequenceToken();
  /**
   * <pre>
   * Output only. The next sequence token to use when adding operations. Only
   * set when the batch job status is PENDING.
   * </pre>
   *
   * <code>optional string next_add_sequence_token = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for nextAddSequenceToken.
   */
  com.google.protobuf.ByteString
      getNextAddSequenceTokenBytes();

  /**
   * <pre>
   * Output only. Contains additional information about this batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.BatchJob.BatchJobMetadata metadata = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Output only. Contains additional information about this batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.BatchJob.BatchJobMetadata metadata = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The metadata.
   */
  com.google.ads.googleads.v15.resources.BatchJob.BatchJobMetadata getMetadata();
  /**
   * <pre>
   * Output only. Contains additional information about this batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.BatchJob.BatchJobMetadata metadata = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v15.resources.BatchJob.BatchJobMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Output only. Status of this batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BatchJobStatusEnum.BatchJobStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of this batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BatchJobStatusEnum.BatchJobStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v15.enums.BatchJobStatusEnum.BatchJobStatus getStatus();

  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be
   * used to poll for completion. Only set when the batch job status is RUNNING
   * or DONE.
   * </pre>
   *
   * <code>optional string long_running_operation = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the longRunningOperation field is set.
   */
  boolean hasLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be
   * used to poll for completion. Only set when the batch job status is RUNNING
   * or DONE.
   * </pre>
   *
   * <code>optional string long_running_operation = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The longRunningOperation.
   */
  java.lang.String getLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be
   * used to poll for completion. Only set when the batch job status is RUNNING
   * or DONE.
   * </pre>
   *
   * <code>optional string long_running_operation = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for longRunningOperation.
   */
  com.google.protobuf.ByteString
      getLongRunningOperationBytes();
}
