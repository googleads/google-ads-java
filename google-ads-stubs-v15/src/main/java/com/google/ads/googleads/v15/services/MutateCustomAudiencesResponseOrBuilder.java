// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/custom_audience_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface MutateCustomAudiencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateCustomAudiencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomAudienceResult results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.MutateCustomAudienceResult> 
      getResultsList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomAudienceResult results = 1;</code>
   */
  com.google.ads.googleads.v15.services.MutateCustomAudienceResult getResults(int index);
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomAudienceResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomAudienceResult results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.MutateCustomAudienceResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomAudienceResult results = 1;</code>
   */
  com.google.ads.googleads.v15.services.MutateCustomAudienceResultOrBuilder getResultsOrBuilder(
      int index);
}
