// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/customer_service.proto

package com.google.ads.googleads.v3.services;

public interface MutateCustomerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.MutateCustomerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The operation to perform on the customer
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.CustomerOperation operation = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * Required. The operation to perform on the customer
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.CustomerOperation operation = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  com.google.ads.googleads.v3.services.CustomerOperation getOperation();
  /**
   * <pre>
   * Required. The operation to perform on the customer
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.CustomerOperation operation = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v3.services.CustomerOperationOrBuilder getOperationOrBuilder();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 5;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
