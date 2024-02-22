// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/conversion_value_rule_set_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

public interface ConversionValueRuleSetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.ConversionValueRuleSetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new conversion
   * value rule set.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionValueRuleSet create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new conversion
   * value rule set.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionValueRuleSet create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v16.resources.ConversionValueRuleSet getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new conversion
   * value rule set.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionValueRuleSet create = 1;</code>
   */
  com.google.ads.googleads.v16.resources.ConversionValueRuleSetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The conversion value rule set is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionValueRuleSet update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The conversion value rule set is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionValueRuleSet update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v16.resources.ConversionValueRuleSet getUpdate();
  /**
   * <pre>
   * Update operation: The conversion value rule set is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.ConversionValueRuleSet update = 2;</code>
   */
  com.google.ads.googleads.v16.resources.ConversionValueRuleSetOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed conversion value rule
   * set is expected, in this format:
   *
   * `customers/{customer_id}/conversionValueRuleSets/{conversion_value_rule_set_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed conversion value rule
   * set is expected, in this format:
   *
   * `customers/{customer_id}/conversionValueRuleSets/{conversion_value_rule_set_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed conversion value rule
   * set is expected, in this format:
   *
   * `customers/{customer_id}/conversionValueRuleSets/{conversion_value_rule_set_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v16.services.ConversionValueRuleSetOperation.OperationCase getOperationCase();
}
