// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/tag_snippet.proto

package com.google.ads.googleads.v14.common;

public interface TagSnippetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.TagSnippet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of the generated tag snippets for tracking conversions.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the generated tag snippets for tracking conversions.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
   * @return The type.
   */
  com.google.ads.googleads.v14.enums.TrackingCodeTypeEnum.TrackingCodeType getType();

  /**
   * <pre>
   * The format of the web page where the tracking tag and snippet will be
   * installed, for example, HTML.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
   * @return The enum numeric value on the wire for pageFormat.
   */
  int getPageFormatValue();
  /**
   * <pre>
   * The format of the web page where the tracking tag and snippet will be
   * installed, for example, HTML.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
   * @return The pageFormat.
   */
  com.google.ads.googleads.v14.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat getPageFormat();

  /**
   * <pre>
   * The site tag that adds visitors to your basic remarketing lists and sets
   * new cookies on your domain.
   * </pre>
   *
   * <code>optional string global_site_tag = 5;</code>
   * @return Whether the globalSiteTag field is set.
   */
  boolean hasGlobalSiteTag();
  /**
   * <pre>
   * The site tag that adds visitors to your basic remarketing lists and sets
   * new cookies on your domain.
   * </pre>
   *
   * <code>optional string global_site_tag = 5;</code>
   * @return The globalSiteTag.
   */
  java.lang.String getGlobalSiteTag();
  /**
   * <pre>
   * The site tag that adds visitors to your basic remarketing lists and sets
   * new cookies on your domain.
   * </pre>
   *
   * <code>optional string global_site_tag = 5;</code>
   * @return The bytes for globalSiteTag.
   */
  com.google.protobuf.ByteString
      getGlobalSiteTagBytes();

  /**
   * <pre>
   * The event snippet that works with the site tag to track actions that
   * should be counted as conversions.
   * </pre>
   *
   * <code>optional string event_snippet = 6;</code>
   * @return Whether the eventSnippet field is set.
   */
  boolean hasEventSnippet();
  /**
   * <pre>
   * The event snippet that works with the site tag to track actions that
   * should be counted as conversions.
   * </pre>
   *
   * <code>optional string event_snippet = 6;</code>
   * @return The eventSnippet.
   */
  java.lang.String getEventSnippet();
  /**
   * <pre>
   * The event snippet that works with the site tag to track actions that
   * should be counted as conversions.
   * </pre>
   *
   * <code>optional string event_snippet = 6;</code>
   * @return The bytes for eventSnippet.
   */
  com.google.protobuf.ByteString
      getEventSnippetBytes();
}
