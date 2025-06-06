// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/resources/asset_group_listing_group_filter.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.resources;

public interface ListingGroupFilterDimensionPathOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.resources.ListingGroupFilterDimensionPath)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The complete path of dimensions through the listing group
   * filter hierarchy (excluding the root node) to this listing group filter.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.ListingGroupFilterDimension dimensions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v20.resources.ListingGroupFilterDimension> 
      getDimensionsList();
  /**
   * <pre>
   * Output only. The complete path of dimensions through the listing group
   * filter hierarchy (excluding the root node) to this listing group filter.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.ListingGroupFilterDimension dimensions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v20.resources.ListingGroupFilterDimension getDimensions(int index);
  /**
   * <pre>
   * Output only. The complete path of dimensions through the listing group
   * filter hierarchy (excluding the root node) to this listing group filter.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.ListingGroupFilterDimension dimensions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getDimensionsCount();
  /**
   * <pre>
   * Output only. The complete path of dimensions through the listing group
   * filter hierarchy (excluding the root node) to this listing group filter.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.ListingGroupFilterDimension dimensions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v20.resources.ListingGroupFilterDimensionOrBuilder> 
      getDimensionsOrBuilderList();
  /**
   * <pre>
   * Output only. The complete path of dimensions through the listing group
   * filter hierarchy (excluding the root node) to this listing group filter.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.ListingGroupFilterDimension dimensions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v20.resources.ListingGroupFilterDimensionOrBuilder getDimensionsOrBuilder(
      int index);
}
