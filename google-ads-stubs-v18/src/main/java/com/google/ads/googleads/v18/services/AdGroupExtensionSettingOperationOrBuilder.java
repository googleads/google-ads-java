// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/ad_group_extension_setting_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface AdGroupExtensionSettingOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.AdGroupExtensionSettingOperation)
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
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned post mutation.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 5;</code>
   * @return The enum numeric value on the wire for responseContentType.
   */
  int getResponseContentTypeValue();
  /**
   * <pre>
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned post mutation.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 5;</code>
   * @return The responseContentType.
   */
  com.google.ads.googleads.v18.enums.ResponseContentTypeEnum.ResponseContentType getResponseContentType();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupExtensionSetting create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupExtensionSetting create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v18.resources.AdGroupExtensionSetting getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupExtensionSetting create = 1;</code>
   */
  com.google.ads.googleads.v18.resources.AdGroupExtensionSettingOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The ad group extension setting is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupExtensionSetting update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The ad group extension setting is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupExtensionSetting update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v18.resources.AdGroupExtensionSetting getUpdate();
  /**
   * <pre>
   * Update operation: The ad group extension setting is expected to have a
   * valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupExtensionSetting update = 2;</code>
   */
  com.google.ads.googleads.v18.resources.AdGroupExtensionSettingOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group extension
   * setting is expected, in this format:
   *
   * `customers/{customer_id}/adGroupExtensionSettings/{ad_group_id}~{extension_type}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group extension
   * setting is expected, in this format:
   *
   * `customers/{customer_id}/adGroupExtensionSettings/{ad_group_id}~{extension_type}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group extension
   * setting is expected, in this format:
   *
   * `customers/{customer_id}/adGroupExtensionSettings/{ad_group_id}~{extension_type}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v18.services.AdGroupExtensionSettingOperation.OperationCase getOperationCase();
}
