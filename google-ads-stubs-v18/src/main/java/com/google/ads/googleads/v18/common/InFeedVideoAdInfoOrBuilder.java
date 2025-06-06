// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/ad_type_infos.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

public interface InFeedVideoAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.InFeedVideoAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>string headline = 1;</code>
   * @return The headline.
   */
  java.lang.String getHeadline();
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>string headline = 1;</code>
   * @return The bytes for headline.
   */
  com.google.protobuf.ByteString
      getHeadlineBytes();

  /**
   * <pre>
   * First text line for the ad.
   * </pre>
   *
   * <code>string description1 = 2;</code>
   * @return The description1.
   */
  java.lang.String getDescription1();
  /**
   * <pre>
   * First text line for the ad.
   * </pre>
   *
   * <code>string description1 = 2;</code>
   * @return The bytes for description1.
   */
  com.google.protobuf.ByteString
      getDescription1Bytes();

  /**
   * <pre>
   * Second text line for the ad.
   * </pre>
   *
   * <code>string description2 = 3;</code>
   * @return The description2.
   */
  java.lang.String getDescription2();
  /**
   * <pre>
   * Second text line for the ad.
   * </pre>
   *
   * <code>string description2 = 3;</code>
   * @return The bytes for description2.
   */
  com.google.protobuf.ByteString
      getDescription2Bytes();

  /**
   * <pre>
   * Video thumbnail image to use.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.VideoThumbnailEnum.VideoThumbnail thumbnail = 4;</code>
   * @return The enum numeric value on the wire for thumbnail.
   */
  int getThumbnailValue();
  /**
   * <pre>
   * Video thumbnail image to use.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.VideoThumbnailEnum.VideoThumbnail thumbnail = 4;</code>
   * @return The thumbnail.
   */
  com.google.ads.googleads.v18.enums.VideoThumbnailEnum.VideoThumbnail getThumbnail();
}
