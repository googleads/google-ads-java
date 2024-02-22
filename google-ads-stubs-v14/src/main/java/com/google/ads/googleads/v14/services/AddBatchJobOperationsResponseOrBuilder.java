// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/batch_job_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface AddBatchJobOperationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.AddBatchJobOperationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The total number of operations added so far for this batch job.
   * </pre>
   *
   * <code>int64 total_operations = 1;</code>
   * @return The totalOperations.
   */
  long getTotalOperations();

  /**
   * <pre>
   * The sequence token to be used when calling AddBatchJobOperations again if
   * more operations need to be added. The next AddBatchJobOperations request
   * must set the sequence_token field to the value of this field.
   * </pre>
   *
   * <code>string next_sequence_token = 2;</code>
   * @return The nextSequenceToken.
   */
  java.lang.String getNextSequenceToken();
  /**
   * <pre>
   * The sequence token to be used when calling AddBatchJobOperations again if
   * more operations need to be added. The next AddBatchJobOperations request
   * must set the sequence_token field to the value of this field.
   * </pre>
   *
   * <code>string next_sequence_token = 2;</code>
   * @return The bytes for nextSequenceToken.
   */
  com.google.protobuf.ByteString
      getNextSequenceTokenBytes();
}
