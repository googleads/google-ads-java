// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/ad_group_bid_modifier_service.proto

package com.google.ads.googleads.v2.services;

public interface AdGroupBidModifierOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.AdGroupBidModifierOperation)
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
   * Create operation: No resource name is expected for the new ad group bid
   * modifier.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.AdGroupBidModifier create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group bid
   * modifier.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.AdGroupBidModifier create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v2.resources.AdGroupBidModifier getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group bid
   * modifier.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.AdGroupBidModifier create = 1;</code>
   */
  com.google.ads.googleads.v2.resources.AdGroupBidModifierOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The ad group bid modifier is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.AdGroupBidModifier update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The ad group bid modifier is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.AdGroupBidModifier update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v2.resources.AdGroupBidModifier getUpdate();
  /**
   * <pre>
   * Update operation: The ad group bid modifier is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.AdGroupBidModifier update = 2;</code>
   */
  com.google.ads.googleads.v2.resources.AdGroupBidModifierOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group bid modifier
   * is expected, in this format:
   * `customers/{customer_id}/adGroupBidModifiers/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed ad group bid modifier
   * is expected, in this format:
   * `customers/{customer_id}/adGroupBidModifiers/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v2.services.AdGroupBidModifierOperation.OperationCase getOperationCase();
}
