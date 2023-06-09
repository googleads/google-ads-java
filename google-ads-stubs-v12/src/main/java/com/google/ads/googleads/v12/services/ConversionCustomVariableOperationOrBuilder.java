// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/conversion_custom_variable_service.proto

package com.google.ads.googleads.v12.services;

public interface ConversionCustomVariableOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.ConversionCustomVariableOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new conversion
   * custom variable.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.ConversionCustomVariable create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new conversion
   * custom variable.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.ConversionCustomVariable create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v12.resources.ConversionCustomVariable getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new conversion
   * custom variable.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.ConversionCustomVariable create = 1;</code>
   */
  com.google.ads.googleads.v12.resources.ConversionCustomVariableOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The conversion custom variable is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.ConversionCustomVariable update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The conversion custom variable is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.ConversionCustomVariable update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v12.resources.ConversionCustomVariable getUpdate();
  /**
   * <pre>
   * Update operation: The conversion custom variable is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.ConversionCustomVariable update = 2;</code>
   */
  com.google.ads.googleads.v12.resources.ConversionCustomVariableOrBuilder getUpdateOrBuilder();

  com.google.ads.googleads.v12.services.ConversionCustomVariableOperation.OperationCase getOperationCase();
}
