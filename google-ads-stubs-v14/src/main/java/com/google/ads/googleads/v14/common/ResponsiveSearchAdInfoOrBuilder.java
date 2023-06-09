// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/ad_type_infos.proto

package com.google.ads.googleads.v14.common;

public interface ResponsiveSearchAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.ResponsiveSearchAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset headlines = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.AdTextAsset> 
      getHeadlinesList();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset headlines = 1;</code>
   */
  com.google.ads.googleads.v14.common.AdTextAsset getHeadlines(int index);
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset headlines = 1;</code>
   */
  int getHeadlinesCount();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset headlines = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.AdTextAssetOrBuilder> 
      getHeadlinesOrBuilderList();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset headlines = 1;</code>
   */
  com.google.ads.googleads.v14.common.AdTextAssetOrBuilder getHeadlinesOrBuilder(
      int index);

  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset descriptions = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.AdTextAsset> 
      getDescriptionsList();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset descriptions = 2;</code>
   */
  com.google.ads.googleads.v14.common.AdTextAsset getDescriptions(int index);
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset descriptions = 2;</code>
   */
  int getDescriptionsCount();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset descriptions = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.AdTextAssetOrBuilder> 
      getDescriptionsOrBuilderList();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.AdTextAsset descriptions = 2;</code>
   */
  com.google.ads.googleads.v14.common.AdTextAssetOrBuilder getDescriptionsOrBuilder(
      int index);

  /**
   * <pre>
   * First part of text that can be appended to the URL in the ad.
   * </pre>
   *
   * <code>optional string path1 = 5;</code>
   * @return Whether the path1 field is set.
   */
  boolean hasPath1();
  /**
   * <pre>
   * First part of text that can be appended to the URL in the ad.
   * </pre>
   *
   * <code>optional string path1 = 5;</code>
   * @return The path1.
   */
  java.lang.String getPath1();
  /**
   * <pre>
   * First part of text that can be appended to the URL in the ad.
   * </pre>
   *
   * <code>optional string path1 = 5;</code>
   * @return The bytes for path1.
   */
  com.google.protobuf.ByteString
      getPath1Bytes();

  /**
   * <pre>
   * Second part of text that can be appended to the URL in the ad. This field
   * can only be set when `path1` is also set.
   * </pre>
   *
   * <code>optional string path2 = 6;</code>
   * @return Whether the path2 field is set.
   */
  boolean hasPath2();
  /**
   * <pre>
   * Second part of text that can be appended to the URL in the ad. This field
   * can only be set when `path1` is also set.
   * </pre>
   *
   * <code>optional string path2 = 6;</code>
   * @return The path2.
   */
  java.lang.String getPath2();
  /**
   * <pre>
   * Second part of text that can be appended to the URL in the ad. This field
   * can only be set when `path1` is also set.
   * </pre>
   *
   * <code>optional string path2 = 6;</code>
   * @return The bytes for path2.
   */
  com.google.protobuf.ByteString
      getPath2Bytes();
}
