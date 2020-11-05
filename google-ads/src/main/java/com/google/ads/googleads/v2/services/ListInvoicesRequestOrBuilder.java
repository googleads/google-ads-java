// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/invoice_service.proto

package com.google.ads.googleads.v2.services;

public interface ListInvoicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.ListInvoicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer to fetch invoices for.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer to fetch invoices for.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The billing setup resource name of the requested invoices.
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string billing_setup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The billingSetup.
   */
  java.lang.String getBillingSetup();
  /**
   * <pre>
   * Required. The billing setup resource name of the requested invoices.
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string billing_setup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for billingSetup.
   */
  com.google.protobuf.ByteString
      getBillingSetupBytes();

  /**
   * <pre>
   * Required. The issue year to retrieve invoices, in yyyy format. Only
   * invoices issued in 2019 or later can be retrieved.
   * </pre>
   *
   * <code>string issue_year = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The issueYear.
   */
  java.lang.String getIssueYear();
  /**
   * <pre>
   * Required. The issue year to retrieve invoices, in yyyy format. Only
   * invoices issued in 2019 or later can be retrieved.
   * </pre>
   *
   * <code>string issue_year = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for issueYear.
   */
  com.google.protobuf.ByteString
      getIssueYearBytes();

  /**
   * <pre>
   * Required. The issue month to retrieve invoices.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MonthOfYearEnum.MonthOfYear issue_month = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for issueMonth.
   */
  int getIssueMonthValue();
  /**
   * <pre>
   * Required. The issue month to retrieve invoices.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.MonthOfYearEnum.MonthOfYear issue_month = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The issueMonth.
   */
  com.google.ads.googleads.v2.enums.MonthOfYearEnum.MonthOfYear getIssueMonth();
}
