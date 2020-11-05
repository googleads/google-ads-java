// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/customer_client.proto

package com.google.ads.googleads.v5.resources;

public interface CustomerClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.resources.CustomerClient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the customer client.
   * CustomerClient resource names have the form:
   * `customers/{customer_id}/customerClients/{client_customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the customer client.
   * CustomerClient resource names have the form:
   * `customers/{customer_id}/customerClients/{client_customer_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the clientCustomer field is set.
   */
  boolean hasClientCustomer();
  /**
   * <pre>
   * Output only. The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The clientCustomer.
   */
  com.google.protobuf.StringValue getClientCustomer();
  /**
   * <pre>
   * Output only. The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getClientCustomerOrBuilder();

  /**
   * <pre>
   * Output only. Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hidden field is set.
   */
  boolean hasHidden();
  /**
   * <pre>
   * Output only. Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hidden.
   */
  com.google.protobuf.BoolValue getHidden();
  /**
   * <pre>
   * Output only. Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHiddenOrBuilder();

  /**
   * <pre>
   * Output only. Distance between given customer and client. For self link, the level value
   * will be 0. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value level = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the level field is set.
   */
  boolean hasLevel();
  /**
   * <pre>
   * Output only. Distance between given customer and client. For self link, the level value
   * will be 0. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value level = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The level.
   */
  com.google.protobuf.Int64Value getLevel();
  /**
   * <pre>
   * Output only. Distance between given customer and client. For self link, the level value
   * will be 0. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value level = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLevelOrBuilder();

  /**
   * <pre>
   * Output only. Common Locale Data Repository (CLDR) string representation of the
   * time zone of the client, e.g. America/Los_Angeles. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * Output only. Common Locale Data Repository (CLDR) string representation of the
   * time zone of the client, e.g. America/Los_Angeles. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The timeZone.
   */
  com.google.protobuf.StringValue getTimeZone();
  /**
   * <pre>
   * Output only. Common Locale Data Repository (CLDR) string representation of the
   * time zone of the client, e.g. America/Los_Angeles. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue time_zone = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getTimeZoneOrBuilder();

  /**
   * <pre>
   * Output only. Identifies if the client is a test account. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the testAccount field is set.
   */
  boolean hasTestAccount();
  /**
   * <pre>
   * Output only. Identifies if the client is a test account. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The testAccount.
   */
  com.google.protobuf.BoolValue getTestAccount();
  /**
   * <pre>
   * Output only. Identifies if the client is a test account. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue test_account = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getTestAccountOrBuilder();

  /**
   * <pre>
   * Output only. Identifies if the client is a manager. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the manager field is set.
   */
  boolean hasManager();
  /**
   * <pre>
   * Output only. Identifies if the client is a manager. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The manager.
   */
  com.google.protobuf.BoolValue getManager();
  /**
   * <pre>
   * Output only. Identifies if the client is a manager. Read only.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue manager = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getManagerOrBuilder();

  /**
   * <pre>
   * Output only. Descriptive name for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the descriptiveName field is set.
   */
  boolean hasDescriptiveName();
  /**
   * <pre>
   * Output only. Descriptive name for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The descriptiveName.
   */
  com.google.protobuf.StringValue getDescriptiveName();
  /**
   * <pre>
   * Output only. Descriptive name for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue descriptive_name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptiveNameOrBuilder();

  /**
   * <pre>
   * Output only. Currency code (e.g. 'USD', 'EUR') for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Output only. Currency code (e.g. 'USD', 'EUR') for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The currencyCode.
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * Output only. Currency code (e.g. 'USD', 'EUR') for the client. Read only.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();

  /**
   * <pre>
   * Output only. The ID of the client customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the client customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the client customer. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();
}
