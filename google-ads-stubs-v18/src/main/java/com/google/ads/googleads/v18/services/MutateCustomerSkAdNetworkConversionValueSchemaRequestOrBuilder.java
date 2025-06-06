// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/customer_sk_ad_network_conversion_value_schema_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface MutateCustomerSkAdNetworkConversionValueSchemaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer whose shared sets are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer whose shared sets are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.CustomerSkAdNetworkConversionValueSchemaOperation operation = 2;</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * The operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.CustomerSkAdNetworkConversionValueSchemaOperation operation = 2;</code>
   * @return The operation.
   */
  com.google.ads.googleads.v18.services.CustomerSkAdNetworkConversionValueSchemaOperation getOperation();
  /**
   * <pre>
   * The operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.CustomerSkAdNetworkConversionValueSchemaOperation operation = 2;</code>
   */
  com.google.ads.googleads.v18.services.CustomerSkAdNetworkConversionValueSchemaOperationOrBuilder getOperationOrBuilder();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * Optional. If true, enables returning warnings. Warnings return error
   * messages and error codes without blocking the execution of the mutate
   * operation.
   * </pre>
   *
   * <code>bool enable_warnings = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enableWarnings.
   */
  boolean getEnableWarnings();
}
