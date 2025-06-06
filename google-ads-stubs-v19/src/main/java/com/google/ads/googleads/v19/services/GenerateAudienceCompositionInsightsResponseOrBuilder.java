// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface GenerateAudienceCompositionInsightsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.GenerateAudienceCompositionInsightsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AudienceCompositionSection sections = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v19.services.AudienceCompositionSection> 
      getSectionsList();
  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AudienceCompositionSection sections = 1;</code>
   */
  com.google.ads.googleads.v19.services.AudienceCompositionSection getSections(int index);
  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AudienceCompositionSection sections = 1;</code>
   */
  int getSectionsCount();
  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AudienceCompositionSection sections = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.services.AudienceCompositionSectionOrBuilder> 
      getSectionsOrBuilderList();
  /**
   * <pre>
   * The contents of the insights report, organized into sections.
   * Each section is associated with one of the AudienceInsightsDimension values
   * in the request. There may be more than one section per dimension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AudienceCompositionSection sections = 1;</code>
   */
  com.google.ads.googleads.v19.services.AudienceCompositionSectionOrBuilder getSectionsOrBuilder(
      int index);
}
