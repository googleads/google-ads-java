// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/offline_user_data_job.proto

package com.google.ads.googleads.v14.resources;

public interface OfflineUserDataJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.OfflineUserDataJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the offline user data job.
   * Offline user data job resource names have the form:
   *
   * `customers/{customer_id}/offlineUserDataJobs/{offline_user_data_job_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the offline user data job.
   * Offline user data job resource names have the form:
   *
   * `customers/{customer_id}/offlineUserDataJobs/{offline_user_data_job_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ID of this offline user data job.
   * </pre>
   *
   * <code>optional int64 id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. ID of this offline user data job.
   * </pre>
   *
   * <code>optional int64 id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Immutable. User specified job ID.
   * </pre>
   *
   * <code>optional int64 external_id = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the externalId field is set.
   */
  boolean hasExternalId();
  /**
   * <pre>
   * Immutable. User specified job ID.
   * </pre>
   *
   * <code>optional int64 external_id = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The externalId.
   */
  long getExternalId();

  /**
   * <pre>
   * Immutable. Type of the job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineUserDataJobTypeEnum.OfflineUserDataJobType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Immutable. Type of the job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineUserDataJobTypeEnum.OfflineUserDataJobType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v14.enums.OfflineUserDataJobTypeEnum.OfflineUserDataJobType getType();

  /**
   * <pre>
   * Output only. Status of the job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineUserDataJobStatusEnum.OfflineUserDataJobStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineUserDataJobStatusEnum.OfflineUserDataJobStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v14.enums.OfflineUserDataJobStatusEnum.OfflineUserDataJobStatus getStatus();

  /**
   * <pre>
   * Output only. Reason for the processing failure, if status is FAILED.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineUserDataJobFailureReasonEnum.OfflineUserDataJobFailureReason failure_reason = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for failureReason.
   */
  int getFailureReasonValue();
  /**
   * <pre>
   * Output only. Reason for the processing failure, if status is FAILED.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.OfflineUserDataJobFailureReasonEnum.OfflineUserDataJobFailureReason failure_reason = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The failureReason.
   */
  com.google.ads.googleads.v14.enums.OfflineUserDataJobFailureReasonEnum.OfflineUserDataJobFailureReason getFailureReason();

  /**
   * <pre>
   * Output only. Metadata of offline user data job depicting match rate range.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.OfflineUserDataJobMetadata operation_metadata = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the operationMetadata field is set.
   */
  boolean hasOperationMetadata();
  /**
   * <pre>
   * Output only. Metadata of offline user data job depicting match rate range.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.OfflineUserDataJobMetadata operation_metadata = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The operationMetadata.
   */
  com.google.ads.googleads.v14.resources.OfflineUserDataJobMetadata getOperationMetadata();
  /**
   * <pre>
   * Output only. Metadata of offline user data job depicting match rate range.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.OfflineUserDataJobMetadata operation_metadata = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.OfflineUserDataJobMetadataOrBuilder getOperationMetadataOrBuilder();

  /**
   * <pre>
   * Immutable. Metadata for data updates to a CRM-based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CustomerMatchUserListMetadata customer_match_user_list_metadata = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the customerMatchUserListMetadata field is set.
   */
  boolean hasCustomerMatchUserListMetadata();
  /**
   * <pre>
   * Immutable. Metadata for data updates to a CRM-based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CustomerMatchUserListMetadata customer_match_user_list_metadata = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The customerMatchUserListMetadata.
   */
  com.google.ads.googleads.v14.common.CustomerMatchUserListMetadata getCustomerMatchUserListMetadata();
  /**
   * <pre>
   * Immutable. Metadata for data updates to a CRM-based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.CustomerMatchUserListMetadata customer_match_user_list_metadata = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v14.common.CustomerMatchUserListMetadataOrBuilder getCustomerMatchUserListMetadataOrBuilder();

  /**
   * <pre>
   * Immutable. Metadata for store sales data update.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.StoreSalesMetadata store_sales_metadata = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the storeSalesMetadata field is set.
   */
  boolean hasStoreSalesMetadata();
  /**
   * <pre>
   * Immutable. Metadata for store sales data update.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.StoreSalesMetadata store_sales_metadata = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The storeSalesMetadata.
   */
  com.google.ads.googleads.v14.common.StoreSalesMetadata getStoreSalesMetadata();
  /**
   * <pre>
   * Immutable. Metadata for store sales data update.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.StoreSalesMetadata store_sales_metadata = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v14.common.StoreSalesMetadataOrBuilder getStoreSalesMetadataOrBuilder();

  com.google.ads.googleads.v14.resources.OfflineUserDataJob.MetadataCase getMetadataCase();
}
