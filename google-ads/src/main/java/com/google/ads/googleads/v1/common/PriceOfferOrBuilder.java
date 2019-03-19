// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/extensions.proto

package com.google.ads.googleads.v1.common;

public interface PriceOfferOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.PriceOffer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Header text of this offer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <pre>
   * Header text of this offer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue header = 1;</code>
   */
  com.google.protobuf.StringValue getHeader();
  /**
   * <pre>
   * Header text of this offer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue header = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Description text of this offer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  boolean hasDescription();
  /**
   * <pre>
   * Description text of this offer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   * Description text of this offer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Price value of this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.Money price = 3;</code>
   */
  boolean hasPrice();
  /**
   * <pre>
   * Price value of this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.Money price = 3;</code>
   */
  com.google.ads.googleads.v1.common.Money getPrice();
  /**
   * <pre>
   * Price value of this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.Money price = 3;</code>
   */
  com.google.ads.googleads.v1.common.MoneyOrBuilder getPriceOrBuilder();

  /**
   * <pre>
   * Price unit for this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit unit = 4;</code>
   */
  int getUnitValue();
  /**
   * <pre>
   * Price unit for this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit unit = 4;</code>
   */
  com.google.ads.googleads.v1.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit getUnit();

  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 5;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalUrlsList();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 5;</code>
   */
  com.google.protobuf.StringValue getFinalUrls(int index);
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 5;</code>
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 5;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalUrlsOrBuilderList();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 6;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 6;</code>
   */
  com.google.protobuf.StringValue getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 6;</code>
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalMobileUrlsOrBuilderList();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalMobileUrlsOrBuilder(
      int index);
}
