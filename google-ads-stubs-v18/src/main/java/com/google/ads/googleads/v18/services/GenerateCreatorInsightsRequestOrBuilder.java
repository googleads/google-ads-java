// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/content_creator_insights_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface GenerateCreatorInsightsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.GenerateCreatorInsightsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The name of the customer being planned for.  This is a
   * user-defined value.
   * </pre>
   *
   * <code>string customer_insights_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerInsightsGroup.
   */
  java.lang.String getCustomerInsightsGroup();
  /**
   * <pre>
   * Required. The name of the customer being planned for.  This is a
   * user-defined value.
   * </pre>
   *
   * <code>string customer_insights_group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerInsightsGroup.
   */
  com.google.protobuf.ByteString
      getCustomerInsightsGroupBytes();

  /**
   * <pre>
   * The list of attributes to search for top creators in.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.SearchAttributes search_attributes = 3;</code>
   * @return Whether the searchAttributes field is set.
   */
  boolean hasSearchAttributes();
  /**
   * <pre>
   * The list of attributes to search for top creators in.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.SearchAttributes search_attributes = 3;</code>
   * @return The searchAttributes.
   */
  com.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.SearchAttributes getSearchAttributes();
  /**
   * <pre>
   * The list of attributes to search for top creators in.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.SearchAttributes search_attributes = 3;</code>
   */
  com.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.SearchAttributesOrBuilder getSearchAttributesOrBuilder();

  /**
   * <pre>
   * The list of YouTube Channel IDs to fetch creator insights for.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.YouTubeChannels search_channels = 4;</code>
   * @return Whether the searchChannels field is set.
   */
  boolean hasSearchChannels();
  /**
   * <pre>
   * The list of YouTube Channel IDs to fetch creator insights for.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.YouTubeChannels search_channels = 4;</code>
   * @return The searchChannels.
   */
  com.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.YouTubeChannels getSearchChannels();
  /**
   * <pre>
   * The list of YouTube Channel IDs to fetch creator insights for.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.YouTubeChannels search_channels = 4;</code>
   */
  com.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.YouTubeChannelsOrBuilder getSearchChannelsOrBuilder();

  com.google.ads.googleads.v18.services.GenerateCreatorInsightsRequest.CriteriaCase getCriteriaCase();
}
