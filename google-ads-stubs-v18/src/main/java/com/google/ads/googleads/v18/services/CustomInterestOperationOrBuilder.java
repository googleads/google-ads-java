// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/custom_interest_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface CustomInterestOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.CustomInterestOperation)
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
   * interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CustomInterest create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new custom
   * interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CustomInterest create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v18.resources.CustomInterest getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new custom
   * interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CustomInterest create = 1;</code>
   */
  com.google.ads.googleads.v18.resources.CustomInterestOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The custom interest is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CustomInterest update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The custom interest is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CustomInterest update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v18.resources.CustomInterest getUpdate();
  /**
   * <pre>
   * Update operation: The custom interest is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CustomInterest update = 2;</code>
   */
  com.google.ads.googleads.v18.resources.CustomInterestOrBuilder getUpdateOrBuilder();

  com.google.ads.googleads.v18.services.CustomInterestOperation.OperationCase getOperationCase();
}
