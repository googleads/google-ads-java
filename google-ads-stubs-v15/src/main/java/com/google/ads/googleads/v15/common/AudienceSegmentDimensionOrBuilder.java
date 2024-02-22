// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/audiences.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.common;

public interface AudienceSegmentDimensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.AudienceSegmentDimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AudienceSegment segments = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AudienceSegment> 
      getSegmentsList();
  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AudienceSegment segments = 1;</code>
   */
  com.google.ads.googleads.v15.common.AudienceSegment getSegments(int index);
  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AudienceSegment segments = 1;</code>
   */
  int getSegmentsCount();
  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AudienceSegment segments = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AudienceSegmentOrBuilder> 
      getSegmentsOrBuilderList();
  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AudienceSegment segments = 1;</code>
   */
  com.google.ads.googleads.v15.common.AudienceSegmentOrBuilder getSegmentsOrBuilder(
      int index);
}
