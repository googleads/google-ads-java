// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/ad_type_infos.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.common;

public interface AppPreRegistrationAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.AppPreRegistrationAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdTextAsset> 
      getHeadlinesList();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 1;</code>
   */
  com.google.ads.googleads.v15.common.AdTextAsset getHeadlines(int index);
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 1;</code>
   */
  int getHeadlinesCount();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdTextAssetOrBuilder> 
      getHeadlinesOrBuilderList();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 1;</code>
   */
  com.google.ads.googleads.v15.common.AdTextAssetOrBuilder getHeadlinesOrBuilder(
      int index);

  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdTextAsset> 
      getDescriptionsList();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 2;</code>
   */
  com.google.ads.googleads.v15.common.AdTextAsset getDescriptions(int index);
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 2;</code>
   */
  int getDescriptionsCount();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdTextAssetOrBuilder> 
      getDescriptionsOrBuilderList();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 2;</code>
   */
  com.google.ads.googleads.v15.common.AdTextAssetOrBuilder getDescriptionsOrBuilder(
      int index);

  /**
   * <pre>
   * List of image asset IDs whose images may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset images = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdImageAsset> 
      getImagesList();
  /**
   * <pre>
   * List of image asset IDs whose images may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset images = 3;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAsset getImages(int index);
  /**
   * <pre>
   * List of image asset IDs whose images may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset images = 3;</code>
   */
  int getImagesCount();
  /**
   * <pre>
   * List of image asset IDs whose images may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset images = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdImageAssetOrBuilder> 
      getImagesOrBuilderList();
  /**
   * <pre>
   * List of image asset IDs whose images may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset images = 3;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAssetOrBuilder getImagesOrBuilder(
      int index);

  /**
   * <pre>
   * List of YouTube video asset IDs whose videos may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdVideoAsset> 
      getYoutubeVideosList();
  /**
   * <pre>
   * List of YouTube video asset IDs whose videos may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 4;</code>
   */
  com.google.ads.googleads.v15.common.AdVideoAsset getYoutubeVideos(int index);
  /**
   * <pre>
   * List of YouTube video asset IDs whose videos may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 4;</code>
   */
  int getYoutubeVideosCount();
  /**
   * <pre>
   * List of YouTube video asset IDs whose videos may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdVideoAssetOrBuilder> 
      getYoutubeVideosOrBuilderList();
  /**
   * <pre>
   * List of YouTube video asset IDs whose videos may be displayed with the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 4;</code>
   */
  com.google.ads.googleads.v15.common.AdVideoAssetOrBuilder getYoutubeVideosOrBuilder(
      int index);
}
