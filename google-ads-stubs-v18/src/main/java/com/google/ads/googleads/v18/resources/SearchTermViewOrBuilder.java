// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/search_term_view.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public interface SearchTermViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.SearchTermView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the search term view.
   * Search term view resource names have the form:
   *
   * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the search term view.
   * Search term view resource names have the form:
   *
   * `customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{URL-base64_search_term}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>optional string search_term = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the searchTerm field is set.
   */
  boolean hasSearchTerm();
  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>optional string search_term = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The searchTerm.
   */
  java.lang.String getSearchTerm();
  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>optional string search_term = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for searchTerm.
   */
  com.google.protobuf.ByteString
      getSearchTermBytes();

  /**
   * <pre>
   * Output only. The ad group the search term served in.
   * </pre>
   *
   * <code>optional string ad_group = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Output only. The ad group the search term served in.
   * </pre>
   *
   * <code>optional string ad_group = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * Output only. The ad group the search term served in.
   * </pre>
   *
   * <code>optional string ad_group = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * Output only. Indicates whether the search term is currently one of your
   * targeted or excluded keywords.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Indicates whether the search term is currently one of your
   * targeted or excluded keywords.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v18.enums.SearchTermTargetingStatusEnum.SearchTermTargetingStatus getStatus();
}
