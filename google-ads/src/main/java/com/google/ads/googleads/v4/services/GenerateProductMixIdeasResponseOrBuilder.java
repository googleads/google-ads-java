// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/reach_plan_service.proto

package com.google.ads.googleads.v4.services;

public interface GenerateProductMixIdeasResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.services.GenerateProductMixIdeasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of products (ad formats) and the associated budget allocation idea.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.ProductAllocation product_allocation = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v4.services.ProductAllocation> 
      getProductAllocationList();
  /**
   * <pre>
   * A list of products (ad formats) and the associated budget allocation idea.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.ProductAllocation product_allocation = 1;</code>
   */
  com.google.ads.googleads.v4.services.ProductAllocation getProductAllocation(int index);
  /**
   * <pre>
   * A list of products (ad formats) and the associated budget allocation idea.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.ProductAllocation product_allocation = 1;</code>
   */
  int getProductAllocationCount();
  /**
   * <pre>
   * A list of products (ad formats) and the associated budget allocation idea.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.ProductAllocation product_allocation = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v4.services.ProductAllocationOrBuilder> 
      getProductAllocationOrBuilderList();
  /**
   * <pre>
   * A list of products (ad formats) and the associated budget allocation idea.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.services.ProductAllocation product_allocation = 1;</code>
   */
  com.google.ads.googleads.v4.services.ProductAllocationOrBuilder getProductAllocationOrBuilder(
      int index);
}
