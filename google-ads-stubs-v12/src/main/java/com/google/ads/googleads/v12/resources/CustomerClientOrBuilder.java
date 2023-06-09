// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/customer_client.proto

package com.google.ads.googleads.v12.resources;

public interface CustomerClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.CustomerClient)
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
   * <code>optional string client_customer = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the clientCustomer field is set.
   */
  boolean hasClientCustomer();
  /**
   * <pre>
   * Output only. The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>optional string client_customer = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The clientCustomer.
   */
  java.lang.String getClientCustomer();
  /**
   * <pre>
   * Output only. The resource name of the client-customer which is linked to
   * the given customer. Read only.
   * </pre>
   *
   * <code>optional string client_customer = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for clientCustomer.
   */
  com.google.protobuf.ByteString
      getClientCustomerBytes();

  /**
   * <pre>
   * Output only. Specifies whether this is a
   * [hidden account](https://support.google.com/google-ads/answer/7519830).
   * Read only.
   * </pre>
   *
   * <code>optional bool hidden = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * <code>optional bool hidden = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hidden.
   */
  boolean getHidden();

  /**
   * <pre>
   * Output only. Distance between given customer and client. For self link, the
   * level value will be 0. Read only.
   * </pre>
   *
   * <code>optional int64 level = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the level field is set.
   */
  boolean hasLevel();
  /**
   * <pre>
   * Output only. Distance between given customer and client. For self link, the
   * level value will be 0. Read only.
   * </pre>
   *
   * <code>optional int64 level = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The level.
   */
  long getLevel();

  /**
   * <pre>
   * Output only. Common Locale Data Repository (CLDR) string representation of
   * the time zone of the client, for example, America/Los_Angeles. Read only.
   * </pre>
   *
   * <code>optional string time_zone = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();
  /**
   * <pre>
   * Output only. Common Locale Data Repository (CLDR) string representation of
   * the time zone of the client, for example, America/Los_Angeles. Read only.
   * </pre>
   *
   * <code>optional string time_zone = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   * <pre>
   * Output only. Common Locale Data Repository (CLDR) string representation of
   * the time zone of the client, for example, America/Los_Angeles. Read only.
   * </pre>
   *
   * <code>optional string time_zone = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString
      getTimeZoneBytes();

  /**
   * <pre>
   * Output only. Identifies if the client is a test account. Read only.
   * </pre>
   *
   * <code>optional bool test_account = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the testAccount field is set.
   */
  boolean hasTestAccount();
  /**
   * <pre>
   * Output only. Identifies if the client is a test account. Read only.
   * </pre>
   *
   * <code>optional bool test_account = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The testAccount.
   */
  boolean getTestAccount();

  /**
   * <pre>
   * Output only. Identifies if the client is a manager. Read only.
   * </pre>
   *
   * <code>optional bool manager = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the manager field is set.
   */
  boolean hasManager();
  /**
   * <pre>
   * Output only. Identifies if the client is a manager. Read only.
   * </pre>
   *
   * <code>optional bool manager = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The manager.
   */
  boolean getManager();

  /**
   * <pre>
   * Output only. Descriptive name for the client. Read only.
   * </pre>
   *
   * <code>optional string descriptive_name = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the descriptiveName field is set.
   */
  boolean hasDescriptiveName();
  /**
   * <pre>
   * Output only. Descriptive name for the client. Read only.
   * </pre>
   *
   * <code>optional string descriptive_name = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The descriptiveName.
   */
  java.lang.String getDescriptiveName();
  /**
   * <pre>
   * Output only. Descriptive name for the client. Read only.
   * </pre>
   *
   * <code>optional string descriptive_name = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for descriptiveName.
   */
  com.google.protobuf.ByteString
      getDescriptiveNameBytes();

  /**
   * <pre>
   * Output only. Currency code (for example, 'USD', 'EUR') for the client. Read
   * only.
   * </pre>
   *
   * <code>optional string currency_code = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Output only. Currency code (for example, 'USD', 'EUR') for the client. Read
   * only.
   * </pre>
   *
   * <code>optional string currency_code = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Output only. Currency code (for example, 'USD', 'EUR') for the client. Read
   * only.
   * </pre>
   *
   * <code>optional string currency_code = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * Output only. The ID of the client customer. Read only.
   * </pre>
   *
   * <code>optional int64 id = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the client customer. Read only.
   * </pre>
   *
   * <code>optional int64 id = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The resource names of the labels owned by the requesting
   * customer that are applied to the client customer. Label resource names have
   * the form:
   *
   * `customers/{customer_id}/labels/{label_id}`
   * </pre>
   *
   * <code>repeated string applied_labels = 21 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return A list containing the appliedLabels.
   */
  java.util.List<java.lang.String>
      getAppliedLabelsList();
  /**
   * <pre>
   * Output only. The resource names of the labels owned by the requesting
   * customer that are applied to the client customer. Label resource names have
   * the form:
   *
   * `customers/{customer_id}/labels/{label_id}`
   * </pre>
   *
   * <code>repeated string applied_labels = 21 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The count of appliedLabels.
   */
  int getAppliedLabelsCount();
  /**
   * <pre>
   * Output only. The resource names of the labels owned by the requesting
   * customer that are applied to the client customer. Label resource names have
   * the form:
   *
   * `customers/{customer_id}/labels/{label_id}`
   * </pre>
   *
   * <code>repeated string applied_labels = 21 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The appliedLabels at the given index.
   */
  java.lang.String getAppliedLabels(int index);
  /**
   * <pre>
   * Output only. The resource names of the labels owned by the requesting
   * customer that are applied to the client customer. Label resource names have
   * the form:
   *
   * `customers/{customer_id}/labels/{label_id}`
   * </pre>
   *
   * <code>repeated string applied_labels = 21 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the appliedLabels at the given index.
   */
  com.google.protobuf.ByteString
      getAppliedLabelsBytes(int index);

  /**
   * <pre>
   * Output only. The status of the client customer. Read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CustomerStatusEnum.CustomerStatus status = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the client customer. Read only.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CustomerStatusEnum.CustomerStatus status = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v12.enums.CustomerStatusEnum.CustomerStatus getStatus();
}
