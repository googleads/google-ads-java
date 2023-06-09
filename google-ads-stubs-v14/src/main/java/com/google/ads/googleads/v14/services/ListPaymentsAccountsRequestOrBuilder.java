// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/payments_account_service.proto

package com.google.ads.googleads.v14.services;

public interface ListPaymentsAccountsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.ListPaymentsAccountsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer to apply the PaymentsAccount list
   * operation to.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer to apply the PaymentsAccount list
   * operation to.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();
}
