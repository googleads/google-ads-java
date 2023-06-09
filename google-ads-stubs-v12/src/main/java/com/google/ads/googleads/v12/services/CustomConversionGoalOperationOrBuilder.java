// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/custom_conversion_goal_service.proto

package com.google.ads.googleads.v12.services;

public interface CustomConversionGoalOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.CustomConversionGoalOperation)
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
   * Create operation: No resource name is expected for the new custom
   * conversion goal
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CustomConversionGoal create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new custom
   * conversion goal
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CustomConversionGoal create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v12.resources.CustomConversionGoal getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new custom
   * conversion goal
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CustomConversionGoal create = 1;</code>
   */
  com.google.ads.googleads.v12.resources.CustomConversionGoalOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The custom conversion goal is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CustomConversionGoal update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The custom conversion goal is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CustomConversionGoal update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v12.resources.CustomConversionGoal getUpdate();
  /**
   * <pre>
   * Update operation: The custom conversion goal is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CustomConversionGoal update = 2;</code>
   */
  com.google.ads.googleads.v12.resources.CustomConversionGoalOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed custom conversion goal
   * is expected, in this format:
   *
   * 'customers/{customer_id}/conversionActions/{ConversionGoal.custom_goal_config.conversion_type_ids}'
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed custom conversion goal
   * is expected, in this format:
   *
   * 'customers/{customer_id}/conversionActions/{ConversionGoal.custom_goal_config.conversion_type_ids}'
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed custom conversion goal
   * is expected, in this format:
   *
   * 'customers/{customer_id}/conversionActions/{ConversionGoal.custom_goal_config.conversion_type_ids}'
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v12.services.CustomConversionGoalOperation.OperationCase getOperationCase();
}
