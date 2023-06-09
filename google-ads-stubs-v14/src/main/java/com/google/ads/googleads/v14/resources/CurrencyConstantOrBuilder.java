// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/currency_constant.proto

package com.google.ads.googleads.v14.resources;

public interface CurrencyConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.CurrencyConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the currency constant.
   * Currency constant resource names have the form:
   *
   * `currencyConstants/{code}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the currency constant.
   * Currency constant resource names have the form:
   *
   * `currencyConstants/{code}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ISO 4217 three-letter currency code, for example, "USD"
   * </pre>
   *
   * <code>optional string code = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * Output only. ISO 4217 three-letter currency code, for example, "USD"
   * </pre>
   *
   * <code>optional string code = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <pre>
   * Output only. ISO 4217 three-letter currency code, for example, "USD"
   * </pre>
   *
   * <code>optional string code = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <pre>
   * Output only. Full English name of the currency.
   * </pre>
   *
   * <code>optional string name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. Full English name of the currency.
   * </pre>
   *
   * <code>optional string name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Full English name of the currency.
   * </pre>
   *
   * <code>optional string name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Standard symbol for describing this currency, for example, '$'
   * for US Dollars.
   * </pre>
   *
   * <code>optional string symbol = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the symbol field is set.
   */
  boolean hasSymbol();
  /**
   * <pre>
   * Output only. Standard symbol for describing this currency, for example, '$'
   * for US Dollars.
   * </pre>
   *
   * <code>optional string symbol = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <pre>
   * Output only. Standard symbol for describing this currency, for example, '$'
   * for US Dollars.
   * </pre>
   *
   * <code>optional string symbol = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <pre>
   * Output only. The billable unit for this currency. Billed amounts should be
   * multiples of this value.
   * </pre>
   *
   * <code>optional int64 billable_unit_micros = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the billableUnitMicros field is set.
   */
  boolean hasBillableUnitMicros();
  /**
   * <pre>
   * Output only. The billable unit for this currency. Billed amounts should be
   * multiples of this value.
   * </pre>
   *
   * <code>optional int64 billable_unit_micros = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The billableUnitMicros.
   */
  long getBillableUnitMicros();
}
