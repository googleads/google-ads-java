// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/criteria.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

public interface ListingDimensionPathOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.ListingDimensionPath)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The complete path of dimensions through the listing group hierarchy, from
   * the root (excluding the root itself) to this listing group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.ListingDimensionInfo> 
      getDimensionsList();
  /**
   * <pre>
   * The complete path of dimensions through the listing group hierarchy, from
   * the root (excluding the root itself) to this listing group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 1;</code>
   */
  com.google.ads.googleads.v19.common.ListingDimensionInfo getDimensions(int index);
  /**
   * <pre>
   * The complete path of dimensions through the listing group hierarchy, from
   * the root (excluding the root itself) to this listing group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 1;</code>
   */
  int getDimensionsCount();
  /**
   * <pre>
   * The complete path of dimensions through the listing group hierarchy, from
   * the root (excluding the root itself) to this listing group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.ListingDimensionInfoOrBuilder> 
      getDimensionsOrBuilderList();
  /**
   * <pre>
   * The complete path of dimensions through the listing group hierarchy, from
   * the root (excluding the root itself) to this listing group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 1;</code>
   */
  com.google.ads.googleads.v19.common.ListingDimensionInfoOrBuilder getDimensionsOrBuilder(
      int index);
}
