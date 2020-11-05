// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/extensions.proto

package com.google.ads.googleads.v2.common;

public interface StructuredSnippetFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.StructuredSnippetFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue header = 1;</code>
   * @return The header.
   */
  com.google.protobuf.StringValue getHeader();
  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue header = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getValuesList();
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  com.google.protobuf.StringValue getValues(int index);
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getValuesOrBuilder(
      int index);
}
