// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/reach_plan_service.proto

package com.google.ads.googleads.v14.services;

public interface PlannedProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.PlannedProduct)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Selected product for planning.
   * The code associated with the ad product (for example: Trueview, Bumper).
   * To list the available plannable product codes use
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>optional string plannable_product_code = 3;</code>
   * @return Whether the plannableProductCode field is set.
   */
  boolean hasPlannableProductCode();
  /**
   * <pre>
   * Required. Selected product for planning.
   * The code associated with the ad product (for example: Trueview, Bumper).
   * To list the available plannable product codes use
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>optional string plannable_product_code = 3;</code>
   * @return The plannableProductCode.
   */
  java.lang.String getPlannableProductCode();
  /**
   * <pre>
   * Required. Selected product for planning.
   * The code associated with the ad product (for example: Trueview, Bumper).
   * To list the available plannable product codes use
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>optional string plannable_product_code = 3;</code>
   * @return The bytes for plannableProductCode.
   */
  com.google.protobuf.ByteString
      getPlannableProductCodeBytes();

  /**
   * <pre>
   * Required. Maximum budget allocation in micros for the selected product.
   * The value is specified in the selected planning currency_code.
   * For example: 1 000 000$ = 1 000 000 000 000 micros.
   * </pre>
   *
   * <code>optional int64 budget_micros = 4;</code>
   * @return Whether the budgetMicros field is set.
   */
  boolean hasBudgetMicros();
  /**
   * <pre>
   * Required. Maximum budget allocation in micros for the selected product.
   * The value is specified in the selected planning currency_code.
   * For example: 1 000 000$ = 1 000 000 000 000 micros.
   * </pre>
   *
   * <code>optional int64 budget_micros = 4;</code>
   * @return The budgetMicros.
   */
  long getBudgetMicros();

  /**
   * <pre>
   * Targeting settings for the selected product.
   * To list the available targeting for each product use
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AdvancedProductTargeting advanced_product_targeting = 5;</code>
   * @return Whether the advancedProductTargeting field is set.
   */
  boolean hasAdvancedProductTargeting();
  /**
   * <pre>
   * Targeting settings for the selected product.
   * To list the available targeting for each product use
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AdvancedProductTargeting advanced_product_targeting = 5;</code>
   * @return The advancedProductTargeting.
   */
  com.google.ads.googleads.v14.services.AdvancedProductTargeting getAdvancedProductTargeting();
  /**
   * <pre>
   * Targeting settings for the selected product.
   * To list the available targeting for each product use
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AdvancedProductTargeting advanced_product_targeting = 5;</code>
   */
  com.google.ads.googleads.v14.services.AdvancedProductTargetingOrBuilder getAdvancedProductTargetingOrBuilder();
}
