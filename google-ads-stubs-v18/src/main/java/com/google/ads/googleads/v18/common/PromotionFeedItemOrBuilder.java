// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/extensions.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

public interface PromotionFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.PromotionFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A freeform description of what the promotion is targeting.
   * This field is required.
   * </pre>
   *
   * <code>optional string promotion_target = 16;</code>
   * @return Whether the promotionTarget field is set.
   */
  boolean hasPromotionTarget();
  /**
   * <pre>
   * A freeform description of what the promotion is targeting.
   * This field is required.
   * </pre>
   *
   * <code>optional string promotion_target = 16;</code>
   * @return The promotionTarget.
   */
  java.lang.String getPromotionTarget();
  /**
   * <pre>
   * A freeform description of what the promotion is targeting.
   * This field is required.
   * </pre>
   *
   * <code>optional string promotion_target = 16;</code>
   * @return The bytes for promotionTarget.
   */
  com.google.protobuf.ByteString
      getPromotionTargetBytes();

  /**
   * <pre>
   * Enum that modifies the qualification of the discount.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.PromotionExtensionDiscountModifierEnum.PromotionExtensionDiscountModifier discount_modifier = 2;</code>
   * @return The enum numeric value on the wire for discountModifier.
   */
  int getDiscountModifierValue();
  /**
   * <pre>
   * Enum that modifies the qualification of the discount.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.PromotionExtensionDiscountModifierEnum.PromotionExtensionDiscountModifier discount_modifier = 2;</code>
   * @return The discountModifier.
   */
  com.google.ads.googleads.v18.enums.PromotionExtensionDiscountModifierEnum.PromotionExtensionDiscountModifier getDiscountModifier();

  /**
   * <pre>
   * Start date of when the promotion is eligible to be redeemed.
   * </pre>
   *
   * <code>optional string promotion_start_date = 19;</code>
   * @return Whether the promotionStartDate field is set.
   */
  boolean hasPromotionStartDate();
  /**
   * <pre>
   * Start date of when the promotion is eligible to be redeemed.
   * </pre>
   *
   * <code>optional string promotion_start_date = 19;</code>
   * @return The promotionStartDate.
   */
  java.lang.String getPromotionStartDate();
  /**
   * <pre>
   * Start date of when the promotion is eligible to be redeemed.
   * </pre>
   *
   * <code>optional string promotion_start_date = 19;</code>
   * @return The bytes for promotionStartDate.
   */
  com.google.protobuf.ByteString
      getPromotionStartDateBytes();

  /**
   * <pre>
   * Last date when the promotion is eligible to be redeemed.
   * </pre>
   *
   * <code>optional string promotion_end_date = 20;</code>
   * @return Whether the promotionEndDate field is set.
   */
  boolean hasPromotionEndDate();
  /**
   * <pre>
   * Last date when the promotion is eligible to be redeemed.
   * </pre>
   *
   * <code>optional string promotion_end_date = 20;</code>
   * @return The promotionEndDate.
   */
  java.lang.String getPromotionEndDate();
  /**
   * <pre>
   * Last date when the promotion is eligible to be redeemed.
   * </pre>
   *
   * <code>optional string promotion_end_date = 20;</code>
   * @return The bytes for promotionEndDate.
   */
  com.google.protobuf.ByteString
      getPromotionEndDateBytes();

  /**
   * <pre>
   * The occasion the promotion was intended for.
   * If an occasion is set, the redemption window will need to fall within
   * the date range associated with the occasion.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.PromotionExtensionOccasionEnum.PromotionExtensionOccasion occasion = 9;</code>
   * @return The enum numeric value on the wire for occasion.
   */
  int getOccasionValue();
  /**
   * <pre>
   * The occasion the promotion was intended for.
   * If an occasion is set, the redemption window will need to fall within
   * the date range associated with the occasion.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.PromotionExtensionOccasionEnum.PromotionExtensionOccasion occasion = 9;</code>
   * @return The occasion.
   */
  com.google.ads.googleads.v18.enums.PromotionExtensionOccasionEnum.PromotionExtensionOccasion getOccasion();

  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * This field is required.
   * </pre>
   *
   * <code>repeated string final_urls = 21;</code>
   * @return A list containing the finalUrls.
   */
  java.util.List<java.lang.String>
      getFinalUrlsList();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * This field is required.
   * </pre>
   *
   * <code>repeated string final_urls = 21;</code>
   * @return The count of finalUrls.
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * This field is required.
   * </pre>
   *
   * <code>repeated string final_urls = 21;</code>
   * @param index The index of the element to return.
   * @return The finalUrls at the given index.
   */
  java.lang.String getFinalUrls(int index);
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * This field is required.
   * </pre>
   *
   * <code>repeated string final_urls = 21;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalUrlsBytes(int index);

  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 22;</code>
   * @return A list containing the finalMobileUrls.
   */
  java.util.List<java.lang.String>
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 22;</code>
   * @return The count of finalMobileUrls.
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 22;</code>
   * @param index The index of the element to return.
   * @return The finalMobileUrls at the given index.
   */
  java.lang.String getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 22;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalMobileUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalMobileUrlsBytes(int index);

  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 23;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 23;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 23;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();

  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.CustomParameter url_custom_parameters = 13;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.CustomParameter url_custom_parameters = 13;</code>
   */
  com.google.ads.googleads.v18.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.CustomParameter url_custom_parameters = 13;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.CustomParameter url_custom_parameters = 13;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.CustomParameter url_custom_parameters = 13;</code>
   */
  com.google.ads.googleads.v18.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>optional string final_url_suffix = 24;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>optional string final_url_suffix = 24;</code>
   * @return The finalUrlSuffix.
   */
  java.lang.String getFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>optional string final_url_suffix = 24;</code>
   * @return The bytes for finalUrlSuffix.
   */
  com.google.protobuf.ByteString
      getFinalUrlSuffixBytes();

  /**
   * <pre>
   * The language of the promotion.
   * Represented as BCP 47 language tag.
   * </pre>
   *
   * <code>optional string language_code = 25;</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * The language of the promotion.
   * Represented as BCP 47 language tag.
   * </pre>
   *
   * <code>optional string language_code = 25;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The language of the promotion.
   * Represented as BCP 47 language tag.
   * </pre>
   *
   * <code>optional string language_code = 25;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Percentage off discount in the promotion in micros.
   * One million is equivalent to one percent.
   * Either this or money_off_amount is required.
   * </pre>
   *
   * <code>int64 percent_off = 17;</code>
   * @return Whether the percentOff field is set.
   */
  boolean hasPercentOff();
  /**
   * <pre>
   * Percentage off discount in the promotion in micros.
   * One million is equivalent to one percent.
   * Either this or money_off_amount is required.
   * </pre>
   *
   * <code>int64 percent_off = 17;</code>
   * @return The percentOff.
   */
  long getPercentOff();

  /**
   * <pre>
   * Money amount off for discount in the promotion.
   * Either this or percent_off is required.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.Money money_amount_off = 4;</code>
   * @return Whether the moneyAmountOff field is set.
   */
  boolean hasMoneyAmountOff();
  /**
   * <pre>
   * Money amount off for discount in the promotion.
   * Either this or percent_off is required.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.Money money_amount_off = 4;</code>
   * @return The moneyAmountOff.
   */
  com.google.ads.googleads.v18.common.Money getMoneyAmountOff();
  /**
   * <pre>
   * Money amount off for discount in the promotion.
   * Either this or percent_off is required.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.Money money_amount_off = 4;</code>
   */
  com.google.ads.googleads.v18.common.MoneyOrBuilder getMoneyAmountOffOrBuilder();

  /**
   * <pre>
   * A code the user should use in order to be eligible for the promotion.
   * </pre>
   *
   * <code>string promotion_code = 18;</code>
   * @return Whether the promotionCode field is set.
   */
  boolean hasPromotionCode();
  /**
   * <pre>
   * A code the user should use in order to be eligible for the promotion.
   * </pre>
   *
   * <code>string promotion_code = 18;</code>
   * @return The promotionCode.
   */
  java.lang.String getPromotionCode();
  /**
   * <pre>
   * A code the user should use in order to be eligible for the promotion.
   * </pre>
   *
   * <code>string promotion_code = 18;</code>
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
   * <code>.google.ads.googleads.v18.common.Money orders_over_amount = 6;</code>
   * @return Whether the ordersOverAmount field is set.
   */
  boolean hasOrdersOverAmount();
  /**
   * <pre>
   * The amount the total order needs to be for the user to be eligible for
   * the promotion.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.Money orders_over_amount = 6;</code>
   * @return The ordersOverAmount.
   */
  com.google.ads.googleads.v18.common.Money getOrdersOverAmount();
  /**
   * <pre>
   * The amount the total order needs to be for the user to be eligible for
   * the promotion.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.Money orders_over_amount = 6;</code>
   */
  com.google.ads.googleads.v18.common.MoneyOrBuilder getOrdersOverAmountOrBuilder();

  com.google.ads.googleads.v18.common.PromotionFeedItem.DiscountTypeCase getDiscountTypeCase();

  com.google.ads.googleads.v18.common.PromotionFeedItem.PromotionTriggerCase getPromotionTriggerCase();
}
