// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/content_creator_insights_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface SearchTopicsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.SearchTopics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A list of knowledge graph entities to retrieve trend information
   * for. Supported entities are tagged with
   * [InsightsKnowledgeGraphEntityCapabilities.CONTENT_TRENDING_INSIGHTS][].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsEntity entities = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.AudienceInsightsEntity> 
      getEntitiesList();
  /**
   * <pre>
   * Required. A list of knowledge graph entities to retrieve trend information
   * for. Supported entities are tagged with
   * [InsightsKnowledgeGraphEntityCapabilities.CONTENT_TRENDING_INSIGHTS][].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsEntity entities = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.common.AudienceInsightsEntity getEntities(int index);
  /**
   * <pre>
   * Required. A list of knowledge graph entities to retrieve trend information
   * for. Supported entities are tagged with
   * [InsightsKnowledgeGraphEntityCapabilities.CONTENT_TRENDING_INSIGHTS][].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsEntity entities = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getEntitiesCount();
  /**
   * <pre>
   * Required. A list of knowledge graph entities to retrieve trend information
   * for. Supported entities are tagged with
   * [InsightsKnowledgeGraphEntityCapabilities.CONTENT_TRENDING_INSIGHTS][].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsEntity entities = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.AudienceInsightsEntityOrBuilder> 
      getEntitiesOrBuilderList();
  /**
   * <pre>
   * Required. A list of knowledge graph entities to retrieve trend information
   * for. Supported entities are tagged with
   * [InsightsKnowledgeGraphEntityCapabilities.CONTENT_TRENDING_INSIGHTS][].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsEntity entities = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.common.AudienceInsightsEntityOrBuilder getEntitiesOrBuilder(
      int index);
}
