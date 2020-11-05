// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/ad_parameter.proto

package com.google.ads.googleads.v2.resources;

public interface AdParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.resources.AdParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad parameter.
   * Ad parameter resource names have the form:
   * `customers/{customer_id}/adParameters/{ad_group_id}~{criterion_id}~{parameter_index}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad parameter.
   * Ad parameter resource names have the form:
   * `customers/{customer_id}/adParameters/{ad_group_id}~{criterion_id}~{parameter_index}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The ad group criterion that this ad parameter belongs to.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_criterion = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupCriterion field is set.
   */
  boolean hasAdGroupCriterion();
  /**
   * <pre>
   * Immutable. The ad group criterion that this ad parameter belongs to.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_criterion = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupCriterion.
   */
  com.google.protobuf.StringValue getAdGroupCriterion();
  /**
   * <pre>
   * Immutable. The ad group criterion that this ad parameter belongs to.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_criterion = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupCriterionOrBuilder();

  /**
   * <pre>
   * Immutable. The unique index of this ad parameter. Must be either 1 or 2.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parameter_index = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the parameterIndex field is set.
   */
  boolean hasParameterIndex();
  /**
   * <pre>
   * Immutable. The unique index of this ad parameter. Must be either 1 or 2.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parameter_index = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The parameterIndex.
   */
  com.google.protobuf.Int64Value getParameterIndex();
  /**
   * <pre>
   * Immutable. The unique index of this ad parameter. Must be either 1 or 2.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parameter_index = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParameterIndexOrBuilder();

  /**
   * <pre>
   * Numeric value to insert into the ad text. The following restrictions
   *  apply:
   *  - Can use comma or period as a separator, with an optional period or
   *    comma (respectively) for fractional values. For example, 1,000,000.00
   *    and 2.000.000,10 are valid.
   *  - Can be prepended or appended with a currency symbol. For example,
   *    $99.99 is valid.
   *  - Can be prepended or appended with a currency code. For example, 99.99USD
   *    and EUR200 are valid.
   *  - Can use '%'. For example, 1.0% and 1,0% are valid.
   *  - Can use plus or minus. For example, -10.99 and 25+ are valid.
   *  - Can use '/' between two numbers. For example 4/1 and 0.95/0.45 are
   *    valid.
   * </pre>
   *
   * <code>.google.protobuf.StringValue insertion_text = 4;</code>
   * @return Whether the insertionText field is set.
   */
  boolean hasInsertionText();
  /**
   * <pre>
   * Numeric value to insert into the ad text. The following restrictions
   *  apply:
   *  - Can use comma or period as a separator, with an optional period or
   *    comma (respectively) for fractional values. For example, 1,000,000.00
   *    and 2.000.000,10 are valid.
   *  - Can be prepended or appended with a currency symbol. For example,
   *    $99.99 is valid.
   *  - Can be prepended or appended with a currency code. For example, 99.99USD
   *    and EUR200 are valid.
   *  - Can use '%'. For example, 1.0% and 1,0% are valid.
   *  - Can use plus or minus. For example, -10.99 and 25+ are valid.
   *  - Can use '/' between two numbers. For example 4/1 and 0.95/0.45 are
   *    valid.
   * </pre>
   *
   * <code>.google.protobuf.StringValue insertion_text = 4;</code>
   * @return The insertionText.
   */
  com.google.protobuf.StringValue getInsertionText();
  /**
   * <pre>
   * Numeric value to insert into the ad text. The following restrictions
   *  apply:
   *  - Can use comma or period as a separator, with an optional period or
   *    comma (respectively) for fractional values. For example, 1,000,000.00
   *    and 2.000.000,10 are valid.
   *  - Can be prepended or appended with a currency symbol. For example,
   *    $99.99 is valid.
   *  - Can be prepended or appended with a currency code. For example, 99.99USD
   *    and EUR200 are valid.
   *  - Can use '%'. For example, 1.0% and 1,0% are valid.
   *  - Can use plus or minus. For example, -10.99 and 25+ are valid.
   *  - Can use '/' between two numbers. For example 4/1 and 0.95/0.45 are
   *    valid.
   * </pre>
   *
   * <code>.google.protobuf.StringValue insertion_text = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getInsertionTextOrBuilder();
}
