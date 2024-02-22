// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/criteria.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.common;

public interface LocationGroupInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.LocationGroupInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Feed specifying locations for targeting. Cannot be set with AssetSet
   * fields. This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional string feed = 5;</code>
   * @return Whether the feed field is set.
   */
  boolean hasFeed();
  /**
   * <pre>
   * Feed specifying locations for targeting. Cannot be set with AssetSet
   * fields. This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional string feed = 5;</code>
   * @return The feed.
   */
  java.lang.String getFeed();
  /**
   * <pre>
   * Feed specifying locations for targeting. Cannot be set with AssetSet
   * fields. This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional string feed = 5;</code>
   * @return The bytes for feed.
   */
  com.google.protobuf.ByteString
      getFeedBytes();

  /**
   * <pre>
   * Geo target constant(s) restricting the scope of the geographic area within
   * the feed. Currently only one geo target constant is allowed. Cannot be set
   * with AssetSet fields.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 6;</code>
   * @return A list containing the geoTargetConstants.
   */
  java.util.List<java.lang.String>
      getGeoTargetConstantsList();
  /**
   * <pre>
   * Geo target constant(s) restricting the scope of the geographic area within
   * the feed. Currently only one geo target constant is allowed. Cannot be set
   * with AssetSet fields.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 6;</code>
   * @return The count of geoTargetConstants.
   */
  int getGeoTargetConstantsCount();
  /**
   * <pre>
   * Geo target constant(s) restricting the scope of the geographic area within
   * the feed. Currently only one geo target constant is allowed. Cannot be set
   * with AssetSet fields.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 6;</code>
   * @param index The index of the element to return.
   * @return The geoTargetConstants at the given index.
   */
  java.lang.String getGeoTargetConstants(int index);
  /**
   * <pre>
   * Geo target constant(s) restricting the scope of the geographic area within
   * the feed. Currently only one geo target constant is allowed. Cannot be set
   * with AssetSet fields.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the geoTargetConstants at the given index.
   */
  com.google.protobuf.ByteString
      getGeoTargetConstantsBytes(int index);

  /**
   * <pre>
   * Distance in units specifying the radius around targeted locations.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional int64 radius = 7;</code>
   * @return Whether the radius field is set.
   */
  boolean hasRadius();
  /**
   * <pre>
   * Distance in units specifying the radius around targeted locations.
   * This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional int64 radius = 7;</code>
   * @return The radius.
   */
  long getRadius();

  /**
   * <pre>
   * Unit of the radius. Miles and meters are supported for geo target
   * constants. Milli miles and meters are supported for feed item sets and
   * asset sets. This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.LocationGroupRadiusUnitsEnum.LocationGroupRadiusUnits radius_units = 4;</code>
   * @return The enum numeric value on the wire for radiusUnits.
   */
  int getRadiusUnitsValue();
  /**
   * <pre>
   * Unit of the radius. Miles and meters are supported for geo target
   * constants. Milli miles and meters are supported for feed item sets and
   * asset sets. This is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.LocationGroupRadiusUnitsEnum.LocationGroupRadiusUnits radius_units = 4;</code>
   * @return The radiusUnits.
   */
  com.google.ads.googleads.v14.enums.LocationGroupRadiusUnitsEnum.LocationGroupRadiusUnits getRadiusUnits();

  /**
   * <pre>
   * FeedItemSets whose FeedItems are targeted. If multiple IDs are specified,
   * then all items that appear in at least one set are targeted. This field
   * cannot be used with geo_target_constants. This is optional and can only be
   * set in CREATE operations. Cannot be set with AssetSet fields.
   * </pre>
   *
   * <code>repeated string feed_item_sets = 8;</code>
   * @return A list containing the feedItemSets.
   */
  java.util.List<java.lang.String>
      getFeedItemSetsList();
  /**
   * <pre>
   * FeedItemSets whose FeedItems are targeted. If multiple IDs are specified,
   * then all items that appear in at least one set are targeted. This field
   * cannot be used with geo_target_constants. This is optional and can only be
   * set in CREATE operations. Cannot be set with AssetSet fields.
   * </pre>
   *
   * <code>repeated string feed_item_sets = 8;</code>
   * @return The count of feedItemSets.
   */
  int getFeedItemSetsCount();
  /**
   * <pre>
   * FeedItemSets whose FeedItems are targeted. If multiple IDs are specified,
   * then all items that appear in at least one set are targeted. This field
   * cannot be used with geo_target_constants. This is optional and can only be
   * set in CREATE operations. Cannot be set with AssetSet fields.
   * </pre>
   *
   * <code>repeated string feed_item_sets = 8;</code>
   * @param index The index of the element to return.
   * @return The feedItemSets at the given index.
   */
  java.lang.String getFeedItemSets(int index);
  /**
   * <pre>
   * FeedItemSets whose FeedItems are targeted. If multiple IDs are specified,
   * then all items that appear in at least one set are targeted. This field
   * cannot be used with geo_target_constants. This is optional and can only be
   * set in CREATE operations. Cannot be set with AssetSet fields.
   * </pre>
   *
   * <code>repeated string feed_item_sets = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the feedItemSets at the given index.
   */
  com.google.protobuf.ByteString
      getFeedItemSetsBytes(int index);

  /**
   * <pre>
   * Denotes that the latest customer level asset set is used for targeting.
   * Used with radius and radius_units. Cannot be used with
   * feed, geo target constants or feed item sets. When using asset sets, either
   * this field or location_group_asset_sets should be specified. Both cannot be
   * used at the same time. This can only be set in CREATE operations.
   * </pre>
   *
   * <code>optional bool enable_customer_level_location_asset_set = 9;</code>
   * @return Whether the enableCustomerLevelLocationAssetSet field is set.
   */
  boolean hasEnableCustomerLevelLocationAssetSet();
  /**
   * <pre>
   * Denotes that the latest customer level asset set is used for targeting.
   * Used with radius and radius_units. Cannot be used with
   * feed, geo target constants or feed item sets. When using asset sets, either
   * this field or location_group_asset_sets should be specified. Both cannot be
   * used at the same time. This can only be set in CREATE operations.
   * </pre>
   *
   * <code>optional bool enable_customer_level_location_asset_set = 9;</code>
   * @return The enableCustomerLevelLocationAssetSet.
   */
  boolean getEnableCustomerLevelLocationAssetSet();

  /**
   * <pre>
   * AssetSets whose Assets are targeted. If multiple IDs are specified, then
   * all items that appear in at least one set are targeted. This field cannot
   * be used with feed, geo target constants or feed item sets. When using asset
   * sets, either this field or enable_customer_level_location_asset_set should
   * be specified. Both cannot be used at the same time. This can only be set
   * in CREATE operations.
   * </pre>
   *
   * <code>repeated string location_group_asset_sets = 10;</code>
   * @return A list containing the locationGroupAssetSets.
   */
  java.util.List<java.lang.String>
      getLocationGroupAssetSetsList();
  /**
   * <pre>
   * AssetSets whose Assets are targeted. If multiple IDs are specified, then
   * all items that appear in at least one set are targeted. This field cannot
   * be used with feed, geo target constants or feed item sets. When using asset
   * sets, either this field or enable_customer_level_location_asset_set should
   * be specified. Both cannot be used at the same time. This can only be set
   * in CREATE operations.
   * </pre>
   *
   * <code>repeated string location_group_asset_sets = 10;</code>
   * @return The count of locationGroupAssetSets.
   */
  int getLocationGroupAssetSetsCount();
  /**
   * <pre>
   * AssetSets whose Assets are targeted. If multiple IDs are specified, then
   * all items that appear in at least one set are targeted. This field cannot
   * be used with feed, geo target constants or feed item sets. When using asset
   * sets, either this field or enable_customer_level_location_asset_set should
   * be specified. Both cannot be used at the same time. This can only be set
   * in CREATE operations.
   * </pre>
   *
   * <code>repeated string location_group_asset_sets = 10;</code>
   * @param index The index of the element to return.
   * @return The locationGroupAssetSets at the given index.
   */
  java.lang.String getLocationGroupAssetSets(int index);
  /**
   * <pre>
   * AssetSets whose Assets are targeted. If multiple IDs are specified, then
   * all items that appear in at least one set are targeted. This field cannot
   * be used with feed, geo target constants or feed item sets. When using asset
   * sets, either this field or enable_customer_level_location_asset_set should
   * be specified. Both cannot be used at the same time. This can only be set
   * in CREATE operations.
   * </pre>
   *
   * <code>repeated string location_group_asset_sets = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the locationGroupAssetSets at the given index.
   */
  com.google.protobuf.ByteString
      getLocationGroupAssetSetsBytes(int index);
}
