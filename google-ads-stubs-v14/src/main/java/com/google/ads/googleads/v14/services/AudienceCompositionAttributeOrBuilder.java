// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/audience_insights_service.proto

package com.google.ads.googleads.v14.services;

public interface AudienceCompositionAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.AudienceCompositionAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The attribute with its metadata.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AudienceInsightsAttributeMetadata attribute_metadata = 1;</code>
   * @return Whether the attributeMetadata field is set.
   */
  boolean hasAttributeMetadata();
  /**
   * <pre>
   * The attribute with its metadata.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AudienceInsightsAttributeMetadata attribute_metadata = 1;</code>
   * @return The attributeMetadata.
   */
  com.google.ads.googleads.v14.services.AudienceInsightsAttributeMetadata getAttributeMetadata();
  /**
   * <pre>
   * The attribute with its metadata.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AudienceInsightsAttributeMetadata attribute_metadata = 1;</code>
   */
  com.google.ads.googleads.v14.services.AudienceInsightsAttributeMetadataOrBuilder getAttributeMetadataOrBuilder();

  /**
   * <pre>
   * Share and index metrics for the attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AudienceCompositionMetrics metrics = 2;</code>
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   * <pre>
   * Share and index metrics for the attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AudienceCompositionMetrics metrics = 2;</code>
   * @return The metrics.
   */
  com.google.ads.googleads.v14.services.AudienceCompositionMetrics getMetrics();
  /**
   * <pre>
   * Share and index metrics for the attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AudienceCompositionMetrics metrics = 2;</code>
   */
  com.google.ads.googleads.v14.services.AudienceCompositionMetricsOrBuilder getMetricsOrBuilder();
}
