// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/feed_item_set_link.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public interface FeedItemSetLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.FeedItemSetLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the feed item set link.
   * Feed item set link resource names have the form:
   * `customers/{customer_id}/feedItemSetLinks/{feed_id}~{feed_item_set_id}~{feed_item_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the feed item set link.
   * Feed item set link resource names have the form:
   * `customers/{customer_id}/feedItemSetLinks/{feed_id}~{feed_item_set_id}~{feed_item_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The linked FeedItem.
   * </pre>
   *
   * <code>string feed_item = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The feedItem.
   */
  java.lang.String getFeedItem();
  /**
   * <pre>
   * Immutable. The linked FeedItem.
   * </pre>
   *
   * <code>string feed_item = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feedItem.
   */
  com.google.protobuf.ByteString
      getFeedItemBytes();

  /**
   * <pre>
   * Immutable. The linked FeedItemSet.
   * </pre>
   *
   * <code>string feed_item_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The feedItemSet.
   */
  java.lang.String getFeedItemSet();
  /**
   * <pre>
   * Immutable. The linked FeedItemSet.
   * </pre>
   *
   * <code>string feed_item_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feedItemSet.
   */
  com.google.protobuf.ByteString
      getFeedItemSetBytes();
}
