// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/offline_user_data.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.common;

public interface TransactionAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.common.TransactionAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp when transaction occurred. Required.
   * The format is "YYYY-MM-DD HH:MM:SS[+/-HH:MM]", where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30+03:00"
   * </pre>
   *
   * <code>optional string transaction_date_time = 8;</code>
   * @return Whether the transactionDateTime field is set.
   */
  boolean hasTransactionDateTime();
  /**
   * <pre>
   * Timestamp when transaction occurred. Required.
   * The format is "YYYY-MM-DD HH:MM:SS[+/-HH:MM]", where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30+03:00"
   * </pre>
   *
   * <code>optional string transaction_date_time = 8;</code>
   * @return The transactionDateTime.
   */
  java.lang.String getTransactionDateTime();
  /**
   * <pre>
   * Timestamp when transaction occurred. Required.
   * The format is "YYYY-MM-DD HH:MM:SS[+/-HH:MM]", where [+/-HH:MM] is an
   * optional timezone offset from UTC. If the offset is absent, the API will
   * use the account's timezone as default.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30+03:00"
   * </pre>
   *
   * <code>optional string transaction_date_time = 8;</code>
   * @return The bytes for transactionDateTime.
   */
  com.google.protobuf.ByteString
      getTransactionDateTimeBytes();

  /**
   * <pre>
   * Transaction amount in micros. Required.
   * Transaction amount in micros needs to be greater than 1000.
   * If item Attributes are provided, it represents the total value of the
   * items, after multiplying the unit price per item by the quantity provided
   * in the ItemAttributes.
   * </pre>
   *
   * <code>optional double transaction_amount_micros = 9;</code>
   * @return Whether the transactionAmountMicros field is set.
   */
  boolean hasTransactionAmountMicros();
  /**
   * <pre>
   * Transaction amount in micros. Required.
   * Transaction amount in micros needs to be greater than 1000.
   * If item Attributes are provided, it represents the total value of the
   * items, after multiplying the unit price per item by the quantity provided
   * in the ItemAttributes.
   * </pre>
   *
   * <code>optional double transaction_amount_micros = 9;</code>
   * @return The transactionAmountMicros.
   */
  double getTransactionAmountMicros();

  /**
   * <pre>
   * Transaction currency code. ISO 4217 three-letter code is used. Required.
   * </pre>
   *
   * <code>optional string currency_code = 10;</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Transaction currency code. ISO 4217 three-letter code is used. Required.
   * </pre>
   *
   * <code>optional string currency_code = 10;</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Transaction currency code. ISO 4217 three-letter code is used. Required.
   * </pre>
   *
   * <code>optional string currency_code = 10;</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * The resource name of conversion action to report conversions to.
   * Required.
   * </pre>
   *
   * <code>optional string conversion_action = 11;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * The resource name of conversion action to report conversions to.
   * Required.
   * </pre>
   *
   * <code>optional string conversion_action = 11;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * The resource name of conversion action to report conversions to.
   * Required.
   * </pre>
   *
   * <code>optional string conversion_action = 11;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * Transaction order id.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>optional string order_id = 12;</code>
   * @return Whether the orderId field is set.
   */
  boolean hasOrderId();
  /**
   * <pre>
   * Transaction order id.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>optional string order_id = 12;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <pre>
   * Transaction order id.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>optional string order_id = 12;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <pre>
   * Store attributes of the transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.StoreAttribute store_attribute = 6;</code>
   * @return Whether the storeAttribute field is set.
   */
  boolean hasStoreAttribute();
  /**
   * <pre>
   * Store attributes of the transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.StoreAttribute store_attribute = 6;</code>
   * @return The storeAttribute.
   */
  com.google.ads.googleads.v16.common.StoreAttribute getStoreAttribute();
  /**
   * <pre>
   * Store attributes of the transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.StoreAttribute store_attribute = 6;</code>
   */
  com.google.ads.googleads.v16.common.StoreAttributeOrBuilder getStoreAttributeOrBuilder();

  /**
   * <pre>
   * Value of the custom variable for each transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>optional string custom_value = 13;</code>
   * @return Whether the customValue field is set.
   */
  boolean hasCustomValue();
  /**
   * <pre>
   * Value of the custom variable for each transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>optional string custom_value = 13;</code>
   * @return The customValue.
   */
  java.lang.String getCustomValue();
  /**
   * <pre>
   * Value of the custom variable for each transaction.
   * Accessible only to customers on the allow-list.
   * </pre>
   *
   * <code>optional string custom_value = 13;</code>
   * @return The bytes for customValue.
   */
  com.google.protobuf.ByteString
      getCustomValueBytes();

  /**
   * <pre>
   * Item attributes of the transaction.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.ItemAttribute item_attribute = 14;</code>
   * @return Whether the itemAttribute field is set.
   */
  boolean hasItemAttribute();
  /**
   * <pre>
   * Item attributes of the transaction.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.ItemAttribute item_attribute = 14;</code>
   * @return The itemAttribute.
   */
  com.google.ads.googleads.v16.common.ItemAttribute getItemAttribute();
  /**
   * <pre>
   * Item attributes of the transaction.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.common.ItemAttribute item_attribute = 14;</code>
   */
  com.google.ads.googleads.v16.common.ItemAttributeOrBuilder getItemAttributeOrBuilder();
}
