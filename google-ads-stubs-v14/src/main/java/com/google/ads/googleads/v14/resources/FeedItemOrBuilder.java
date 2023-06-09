// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/feed_item.proto

package com.google.ads.googleads.v14.resources;

public interface FeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.FeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the feed item.
   * Feed item resource names have the form:
   *
   * `customers/{customer_id}/feedItems/{feed_id}~{feed_item_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the feed item.
   * Feed item resource names have the form:
   *
   * `customers/{customer_id}/feedItems/{feed_id}~{feed_item_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The feed to which this feed item belongs.
   * </pre>
   *
   * <code>optional string feed = 11 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the feed field is set.
   */
  boolean hasFeed();
  /**
   * <pre>
   * Immutable. The feed to which this feed item belongs.
   * </pre>
   *
   * <code>optional string feed = 11 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The feed.
   */
  java.lang.String getFeed();
  /**
   * <pre>
   * Immutable. The feed to which this feed item belongs.
   * </pre>
   *
   * <code>optional string feed = 11 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feed.
   */
  com.google.protobuf.ByteString
      getFeedBytes();

  /**
   * <pre>
   * Output only. The ID of this feed item.
   * </pre>
   *
   * <code>optional int64 id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of this feed item.
   * </pre>
   *
   * <code>optional int64 id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Start time in which this feed item is effective and can begin serving. The
   * time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string start_date_time = 13;</code>
   * @return Whether the startDateTime field is set.
   */
  boolean hasStartDateTime();
  /**
   * <pre>
   * Start time in which this feed item is effective and can begin serving. The
   * time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string start_date_time = 13;</code>
   * @return The startDateTime.
   */
  java.lang.String getStartDateTime();
  /**
   * <pre>
   * Start time in which this feed item is effective and can begin serving. The
   * time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string start_date_time = 13;</code>
   * @return The bytes for startDateTime.
   */
  com.google.protobuf.ByteString
      getStartDateTimeBytes();

  /**
   * <pre>
   * End time in which this feed item is no longer effective and will stop
   * serving. The time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string end_date_time = 14;</code>
   * @return Whether the endDateTime field is set.
   */
  boolean hasEndDateTime();
  /**
   * <pre>
   * End time in which this feed item is no longer effective and will stop
   * serving. The time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string end_date_time = 14;</code>
   * @return The endDateTime.
   */
  java.lang.String getEndDateTime();
  /**
   * <pre>
   * End time in which this feed item is no longer effective and will stop
   * serving. The time is in the customer's time zone.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string end_date_time = 14;</code>
   * @return The bytes for endDateTime.
   */
  com.google.protobuf.ByteString
      getEndDateTimeBytes();

  /**
   * <pre>
   * The feed item's attribute values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemAttributeValue attribute_values = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v14.resources.FeedItemAttributeValue> 
      getAttributeValuesList();
  /**
   * <pre>
   * The feed item's attribute values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemAttributeValue attribute_values = 6;</code>
   */
  com.google.ads.googleads.v14.resources.FeedItemAttributeValue getAttributeValues(int index);
  /**
   * <pre>
   * The feed item's attribute values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemAttributeValue attribute_values = 6;</code>
   */
  int getAttributeValuesCount();
  /**
   * <pre>
   * The feed item's attribute values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemAttributeValue attribute_values = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.resources.FeedItemAttributeValueOrBuilder> 
      getAttributeValuesOrBuilderList();
  /**
   * <pre>
   * The feed item's attribute values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemAttributeValue attribute_values = 6;</code>
   */
  com.google.ads.googleads.v14.resources.FeedItemAttributeValueOrBuilder getAttributeValuesOrBuilder(
      int index);

  /**
   * <pre>
   * Geo targeting restriction specifies the type of location that can be used
   * for targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.GeoTargetingRestrictionEnum.GeoTargetingRestriction geo_targeting_restriction = 7;</code>
   * @return The enum numeric value on the wire for geoTargetingRestriction.
   */
  int getGeoTargetingRestrictionValue();
  /**
   * <pre>
   * Geo targeting restriction specifies the type of location that can be used
   * for targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.GeoTargetingRestrictionEnum.GeoTargetingRestriction geo_targeting_restriction = 7;</code>
   * @return The geoTargetingRestriction.
   */
  com.google.ads.googleads.v14.enums.GeoTargetingRestrictionEnum.GeoTargetingRestriction getGeoTargetingRestriction();

  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 8;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 8;</code>
   */
  com.google.ads.googleads.v14.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 8;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 8;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * The list of mappings used to substitute custom parameter tags in a
   * `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CustomParameter url_custom_parameters = 8;</code>
   */
  com.google.ads.googleads.v14.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Status of the feed item.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.FeedItemStatusEnum.FeedItemStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the feed item.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.FeedItemStatusEnum.FeedItemStatus status = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v14.enums.FeedItemStatusEnum.FeedItemStatus getStatus();

  /**
   * <pre>
   * Output only. List of info about a feed item's validation and approval state
   * for active feed mappings. There will be an entry in the list for each type
   * of feed mapping associated with the feed, for example, a feed with a
   * sitelink and a call feed mapping would cause every feed item associated
   * with that feed to have an entry in this list for both sitelink and call.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemPlaceholderPolicyInfo policy_infos = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v14.resources.FeedItemPlaceholderPolicyInfo> 
      getPolicyInfosList();
  /**
   * <pre>
   * Output only. List of info about a feed item's validation and approval state
   * for active feed mappings. There will be an entry in the list for each type
   * of feed mapping associated with the feed, for example, a feed with a
   * sitelink and a call feed mapping would cause every feed item associated
   * with that feed to have an entry in this list for both sitelink and call.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemPlaceholderPolicyInfo policy_infos = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.FeedItemPlaceholderPolicyInfo getPolicyInfos(int index);
  /**
   * <pre>
   * Output only. List of info about a feed item's validation and approval state
   * for active feed mappings. There will be an entry in the list for each type
   * of feed mapping associated with the feed, for example, a feed with a
   * sitelink and a call feed mapping would cause every feed item associated
   * with that feed to have an entry in this list for both sitelink and call.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemPlaceholderPolicyInfo policy_infos = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPolicyInfosCount();
  /**
   * <pre>
   * Output only. List of info about a feed item's validation and approval state
   * for active feed mappings. There will be an entry in the list for each type
   * of feed mapping associated with the feed, for example, a feed with a
   * sitelink and a call feed mapping would cause every feed item associated
   * with that feed to have an entry in this list for both sitelink and call.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemPlaceholderPolicyInfo policy_infos = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.resources.FeedItemPlaceholderPolicyInfoOrBuilder> 
      getPolicyInfosOrBuilderList();
  /**
   * <pre>
   * Output only. List of info about a feed item's validation and approval state
   * for active feed mappings. There will be an entry in the list for each type
   * of feed mapping associated with the feed, for example, a feed with a
   * sitelink and a call feed mapping would cause every feed item associated
   * with that feed to have an entry in this list for both sitelink and call.
   * This field is read-only.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.FeedItemPlaceholderPolicyInfo policy_infos = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.resources.FeedItemPlaceholderPolicyInfoOrBuilder getPolicyInfosOrBuilder(
      int index);
}
