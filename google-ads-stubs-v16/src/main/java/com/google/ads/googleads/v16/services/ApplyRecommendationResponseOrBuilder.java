// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/recommendation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

public interface ApplyRecommendationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.ApplyRecommendationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Results of operations to apply recommendations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.ApplyRecommendationResult results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v16.services.ApplyRecommendationResult> 
      getResultsList();
  /**
   * <pre>
   * Results of operations to apply recommendations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.ApplyRecommendationResult results = 1;</code>
   */
  com.google.ads.googleads.v16.services.ApplyRecommendationResult getResults(int index);
  /**
   * <pre>
   * Results of operations to apply recommendations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.ApplyRecommendationResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * Results of operations to apply recommendations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.ApplyRecommendationResult results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v16.services.ApplyRecommendationResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * Results of operations to apply recommendations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.ApplyRecommendationResult results = 1;</code>
   */
  com.google.ads.googleads.v16.services.ApplyRecommendationResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors) we return the RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return Whether the partialFailureError field is set.
   */
  boolean hasPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors) we return the RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return The partialFailureError.
   */
  com.google.rpc.Status getPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors) we return the RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();
}
