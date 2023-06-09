// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/batch_job_service.proto

package com.google.ads.googleads.v14.services;

public interface MutateBatchJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.MutateBatchJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer for which to create a batch job.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer for which to create a batch job.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The operation to perform on an individual batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * Required. The operation to perform on an individual batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  com.google.ads.googleads.v14.services.BatchJobOperation getOperation();
  /**
   * <pre>
   * Required. The operation to perform on an individual batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v14.services.BatchJobOperationOrBuilder getOperationOrBuilder();
}
