// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/customer_extension_setting.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public interface CustomerExtensionSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.CustomerExtensionSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer extension setting.
   * CustomerExtensionSetting resource names have the form:
   *
   * `customers/{customer_id}/customerExtensionSettings/{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer extension setting.
   * CustomerExtensionSetting resource names have the form:
   *
   * `customers/{customer_id}/customerExtensionSettings/{extension_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The extension type of the customer extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ExtensionTypeEnum.ExtensionType extension_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for extensionType.
   */
  int getExtensionTypeValue();
  /**
   * <pre>
   * Immutable. The extension type of the customer extension setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ExtensionTypeEnum.ExtensionType extension_type = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The extensionType.
   */
  com.google.ads.googleads.v18.enums.ExtensionTypeEnum.ExtensionType getExtensionType();

  /**
   * <pre>
   * The resource names of the extension feed items to serve under the customer.
   * ExtensionFeedItem resource names have the form:
   *
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated string extension_feed_items = 5 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the extensionFeedItems.
   */
  java.util.List<java.lang.String>
      getExtensionFeedItemsList();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the customer.
   * ExtensionFeedItem resource names have the form:
   *
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated string extension_feed_items = 5 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of extensionFeedItems.
   */
  int getExtensionFeedItemsCount();
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the customer.
   * ExtensionFeedItem resource names have the form:
   *
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated string extension_feed_items = 5 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The extensionFeedItems at the given index.
   */
  java.lang.String getExtensionFeedItems(int index);
  /**
   * <pre>
   * The resource names of the extension feed items to serve under the customer.
   * ExtensionFeedItem resource names have the form:
   *
   * `customers/{customer_id}/extensionFeedItems/{feed_item_id}`
   * </pre>
   *
   * <code>repeated string extension_feed_items = 5 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the extensionFeedItems at the given index.
   */
  com.google.protobuf.ByteString
      getExtensionFeedItemsBytes(int index);

  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 4;</code>
   * @return The enum numeric value on the wire for device.
   */
  int getDeviceValue();
  /**
   * <pre>
   * The device for which the extensions will serve. Optional.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice device = 4;</code>
   * @return The device.
   */
  com.google.ads.googleads.v18.enums.ExtensionSettingDeviceEnum.ExtensionSettingDevice getDevice();
}
