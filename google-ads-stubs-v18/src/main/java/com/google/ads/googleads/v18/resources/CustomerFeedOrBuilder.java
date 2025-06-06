// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/customer_feed.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public interface CustomerFeedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.CustomerFeed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer feed.
   * Customer feed resource names have the form:
   *
   * `customers/{customer_id}/customerFeeds/{feed_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer feed.
   * Customer feed resource names have the form:
   *
   * `customers/{customer_id}/customerFeeds/{feed_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The feed being linked to the customer.
   * </pre>
   *
   * <code>optional string feed = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the feed field is set.
   */
  boolean hasFeed();
  /**
   * <pre>
   * Immutable. The feed being linked to the customer.
   * </pre>
   *
   * <code>optional string feed = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The feed.
   */
  java.lang.String getFeed();
  /**
   * <pre>
   * Immutable. The feed being linked to the customer.
   * </pre>
   *
   * <code>optional string feed = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feed.
   */
  com.google.protobuf.ByteString
      getFeedBytes();

  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * customer. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 3;</code>
   * @return A list containing the placeholderTypes.
   */
  java.util.List<com.google.ads.googleads.v18.enums.PlaceholderTypeEnum.PlaceholderType> getPlaceholderTypesList();
  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * customer. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 3;</code>
   * @return The count of placeholderTypes.
   */
  int getPlaceholderTypesCount();
  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * customer. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 3;</code>
   * @param index The index of the element to return.
   * @return The placeholderTypes at the given index.
   */
  com.google.ads.googleads.v18.enums.PlaceholderTypeEnum.PlaceholderType getPlaceholderTypes(int index);
  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * customer. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 3;</code>
   * @return A list containing the enum numeric values on the wire for placeholderTypes.
   */
  java.util.List<java.lang.Integer>
  getPlaceholderTypesValueList();
  /**
   * <pre>
   * Indicates which placeholder types the feed may populate under the connected
   * customer. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.PlaceholderTypeEnum.PlaceholderType placeholder_types = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of placeholderTypes at the given index.
   */
  int getPlaceholderTypesValue(int index);

  /**
   * <pre>
   * Matching function associated with the CustomerFeed.
   * The matching function is used to filter the set of feed items selected.
   * Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.MatchingFunction matching_function = 4;</code>
   * @return Whether the matchingFunction field is set.
   */
  boolean hasMatchingFunction();
  /**
   * <pre>
   * Matching function associated with the CustomerFeed.
   * The matching function is used to filter the set of feed items selected.
   * Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.MatchingFunction matching_function = 4;</code>
   * @return The matchingFunction.
   */
  com.google.ads.googleads.v18.common.MatchingFunction getMatchingFunction();
  /**
   * <pre>
   * Matching function associated with the CustomerFeed.
   * The matching function is used to filter the set of feed items selected.
   * Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.MatchingFunction matching_function = 4;</code>
   */
  com.google.ads.googleads.v18.common.MatchingFunctionOrBuilder getMatchingFunctionOrBuilder();

  /**
   * <pre>
   * Output only. Status of the customer feed.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.FeedLinkStatusEnum.FeedLinkStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the customer feed.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.FeedLinkStatusEnum.FeedLinkStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v18.enums.FeedLinkStatusEnum.FeedLinkStatus getStatus();
}
