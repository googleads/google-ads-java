// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/asset_types.proto

package com.google.ads.googleads.v13.common;

public interface PromotionAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.common.PromotionAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A freeform description of what the promotion is targeting.
   * </pre>
   *
   * <code>string promotion_target = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The promotionTarget.
   */
  java.lang.String getPromotionTarget();
  /**
   * <pre>
   * Required. A freeform description of what the promotion is targeting.
   * </pre>
   *
   * <code>string promotion_target = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for promotionTarget.
   */
  com.google.protobuf.ByteString
      getPromotionTargetBytes();

  /**
   * <pre>
   * A modifier for qualification of the discount.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.PromotionExtensionDiscountModifierEnum.PromotionExtensionDiscountModifier discount_modifier = 2;</code>
   * @return The enum numeric value on the wire for discountModifier.
   */
  int getDiscountModifierValue();
  /**
   * <pre>
   * A modifier for qualification of the discount.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.PromotionExtensionDiscountModifierEnum.PromotionExtensionDiscountModifier discount_modifier = 2;</code>
   * @return The discountModifier.
   */
  com.google.ads.googleads.v13.enums.PromotionExtensionDiscountModifierEnum.PromotionExtensionDiscountModifier getDiscountModifier();

  /**
   * <pre>
   * Start date of when the promotion is eligible to be redeemed, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string redemption_start_date = 7;</code>
   * @return The redemptionStartDate.
   */
  java.lang.String getRedemptionStartDate();
  /**
   * <pre>
   * Start date of when the promotion is eligible to be redeemed, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string redemption_start_date = 7;</code>
   * @return The bytes for redemptionStartDate.
   */
  com.google.protobuf.ByteString
      getRedemptionStartDateBytes();

  /**
   * <pre>
   * Last date of when the promotion is eligible to be redeemed, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string redemption_end_date = 8;</code>
   * @return The redemptionEndDate.
   */
  java.lang.String getRedemptionEndDate();
  /**
   * <pre>
   * Last date of when the promotion is eligible to be redeemed, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string redemption_end_date = 8;</code>
   * @return The bytes for redemptionEndDate.
   */
  com.google.protobuf.ByteString
      getRedemptionEndDateBytes();

  /**
   * <pre>
   * The occasion the promotion was intended for.
   * If an occasion is set, the redemption window will need to fall within the
   * date range associated with the occasion.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.PromotionExtensionOccasionEnum.PromotionExtensionOccasion occasion = 9;</code>
   * @return The enum numeric value on the wire for occasion.
   */
  int getOccasionValue();
  /**
   * <pre>
   * The occasion the promotion was intended for.
   * If an occasion is set, the redemption window will need to fall within the
   * date range associated with the occasion.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.PromotionExtensionOccasionEnum.PromotionExtensionOccasion occasion = 9;</code>
   * @return The occasion.
   */
  com.google.ads.googleads.v13.enums.PromotionExtensionOccasionEnum.PromotionExtensionOccasion getOccasion();

  /**
   * <pre>
   * The language of the promotion.
   * Represented as BCP 47 language tag.
   * </pre>
   *
   * <code>string language_code = 10;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The language of the promotion.
   * Represented as BCP 47 language tag.
   * </pre>
   *
   * <code>string language_code = 10;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Start date of when this asset is effective and can begin serving, in
   * yyyy-MM-dd format.
   * </pre>
   *
   * <code>string start_date = 11;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * Start date of when this asset is effective and can begin serving, in
   * yyyy-MM-dd format.
   * </pre>
   *
   * <code>string start_date = 11;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * Last date of when this asset is effective and still serving, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string end_date = 12;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * Last date of when this asset is effective and still serving, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string end_date = 12;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();

  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedule_targets = 13;</code>
   */
  java.util.List<com.google.ads.googleads.v13.common.AdScheduleInfo> 
      getAdScheduleTargetsList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedule_targets = 13;</code>
   */
  com.google.ads.googleads.v13.common.AdScheduleInfo getAdScheduleTargets(int index);
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedule_targets = 13;</code>
   */
  int getAdScheduleTargetsCount();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedule_targets = 13;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v13.common.AdScheduleInfoOrBuilder> 
      getAdScheduleTargetsOrBuilderList();
  /**
   * <pre>
   * List of non-overlapping schedules specifying all time intervals for which
   * the asset may serve. There can be a maximum of 6 schedules per day, 42 in
   * total.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.AdScheduleInfo ad_schedule_targets = 13;</code>
   */
  com.google.ads.googleads.v13.common.AdScheduleInfoOrBuilder getAdScheduleTargetsOrBuilder(
      int index);

  /**
   * <pre>
   * Percentage off discount in the promotion. 1,000,000 = 100%.
   * Either this or money_amount_off is required.
   * </pre>
   *
   * <code>int64 percent_off = 3;</code>
   * @return Whether the percentOff field is set.
   */
  boolean hasPercentOff();
  /**
   * <pre>
   * Percentage off discount in the promotion. 1,000,000 = 100%.
   * Either this or money_amount_off is required.
   * </pre>
   *
   * <code>int64 percent_off = 3;</code>
   * @return The percentOff.
   */
  long getPercentOff();

  /**
   * <pre>
   * Money amount off for discount in the promotion.
   * Either this or percent_off is required.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.Money money_amount_off = 4;</code>
   * @return Whether the moneyAmountOff field is set.
   */
  boolean hasMoneyAmountOff();
  /**
   * <pre>
   * Money amount off for discount in the promotion.
   * Either this or percent_off is required.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.Money money_amount_off = 4;</code>
   * @return The moneyAmountOff.
   */
  com.google.ads.googleads.v13.common.Money getMoneyAmountOff();
  /**
   * <pre>
   * Money amount off for discount in the promotion.
   * Either this or percent_off is required.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.Money money_amount_off = 4;</code>
   */
  com.google.ads.googleads.v13.common.MoneyOrBuilder getMoneyAmountOffOrBuilder();

  /**
   * <pre>
   * A code the user should use in order to be eligible for the promotion.
   * </pre>
   *
   * <code>string promotion_code = 5;</code>
   * @return Whether the promotionCode field is set.
   */
  boolean hasPromotionCode();
  /**
   * <pre>
   * A code the user should use in order to be eligible for the promotion.
   * </pre>
   *
   * <code>string promotion_code = 5;</code>
   * @return The promotionCode.
   */
  java.lang.String getPromotionCode();
  /**
   * <pre>
   * A code the user should use in order to be eligible for the promotion.
   * </pre>
   *
   * <code>string promotion_code = 5;</code>
   * @return The bytes for promotionCode.
   */
  com.google.protobuf.ByteString
      getPromotionCodeBytes();

  /**
   * <pre>
   * The amount the total order needs to be for the user to be eligible for
   * the promotion.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.Money orders_over_amount = 6;</code>
   * @return Whether the ordersOverAmount field is set.
   */
  boolean hasOrdersOverAmount();
  /**
   * <pre>
   * The amount the total order needs to be for the user to be eligible for
   * the promotion.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.Money orders_over_amount = 6;</code>
   * @return The ordersOverAmount.
   */
  com.google.ads.googleads.v13.common.Money getOrdersOverAmount();
  /**
   * <pre>
   * The amount the total order needs to be for the user to be eligible for
   * the promotion.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.Money orders_over_amount = 6;</code>
   */
  com.google.ads.googleads.v13.common.MoneyOrBuilder getOrdersOverAmountOrBuilder();

  com.google.ads.googleads.v13.common.PromotionAsset.DiscountTypeCase getDiscountTypeCase();

  com.google.ads.googleads.v13.common.PromotionAsset.PromotionTriggerCase getPromotionTriggerCase();
}
