// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface ListPlannableProductsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.ListPlannableProductsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.ProductMetadata product_metadata = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.ProductMetadata> 
      getProductMetadataList();
  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.ProductMetadata product_metadata = 1;</code>
   */
  com.google.ads.googleads.v15.services.ProductMetadata getProductMetadata(int index);
  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.ProductMetadata product_metadata = 1;</code>
   */
  int getProductMetadataCount();
  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.ProductMetadata product_metadata = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.ProductMetadataOrBuilder> 
      getProductMetadataOrBuilderList();
  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.ProductMetadata product_metadata = 1;</code>
   */
  com.google.ads.googleads.v15.services.ProductMetadataOrBuilder getProductMetadataOrBuilder(
      int index);
}
