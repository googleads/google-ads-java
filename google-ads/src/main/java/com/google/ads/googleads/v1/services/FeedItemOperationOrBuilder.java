// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/feed_item_service.proto

package com.google.ads.googleads.v1.services;

public interface FeedItemOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.FeedItemOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
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
   * Create operation: No resource name is expected for the new feed item.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedItem create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed item.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedItem create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.FeedItem getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed item.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedItem create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.FeedItemOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The feed item is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedItem update = 2;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The feed item is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedItem update = 2;</code>
   */
  com.google.ads.googleads.v1.resources.FeedItem getUpdate();
  /**
   * <pre>
   * Update operation: The feed item is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.FeedItem update = 2;</code>
   */
  com.google.ads.googleads.v1.resources.FeedItemOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed feed item is
   * expected, in this format:
   * `customers/{customer_id}/feedItems/{feed_id}~{feed_item_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed feed item is
   * expected, in this format:
   * `customers/{customer_id}/feedItems/{feed_id}~{feed_item_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v1.services.FeedItemOperation.OperationCase getOperationCase();
}
