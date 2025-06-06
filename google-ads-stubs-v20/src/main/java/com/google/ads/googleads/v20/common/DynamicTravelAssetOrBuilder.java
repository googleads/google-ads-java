// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/asset_types.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface DynamicTravelAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.DynamicTravelAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Destination ID which can be any sequence of letters and digits,
   * and must be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string destination_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The destinationId.
   */
  java.lang.String getDestinationId();
  /**
   * <pre>
   * Required. Destination ID which can be any sequence of letters and digits,
   * and must be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string destination_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for destinationId.
   */
  com.google.protobuf.ByteString
      getDestinationIdBytes();

  /**
   * <pre>
   * Origin ID which can be any sequence of letters and digits. The ID sequence
   * (destination ID + origin ID) must be unique.
   * </pre>
   *
   * <code>string origin_id = 2;</code>
   * @return The originId.
   */
  java.lang.String getOriginId();
  /**
   * <pre>
   * Origin ID which can be any sequence of letters and digits. The ID sequence
   * (destination ID + origin ID) must be unique.
   * </pre>
   *
   * <code>string origin_id = 2;</code>
   * @return The bytes for originId.
   */
  com.google.protobuf.ByteString
      getOriginIdBytes();

  /**
   * <pre>
   * Required. Title, for example, Book your train ticket. Required.
   * </pre>
   *
   * <code>string title = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Required. Title, for example, Book your train ticket. Required.
   * </pre>
   *
   * <code>string title = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Destination name, for example, Paris.
   * </pre>
   *
   * <code>string destination_name = 4;</code>
   * @return The destinationName.
   */
  java.lang.String getDestinationName();
  /**
   * <pre>
   * Destination name, for example, Paris.
   * </pre>
   *
   * <code>string destination_name = 4;</code>
   * @return The bytes for destinationName.
   */
  com.google.protobuf.ByteString
      getDestinationNameBytes();

  /**
   * <pre>
   * Destination address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403.
   * </pre>
   *
   * <code>string destination_address = 5;</code>
   * @return The destinationAddress.
   */
  java.lang.String getDestinationAddress();
  /**
   * <pre>
   * Destination address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403.
   * </pre>
   *
   * <code>string destination_address = 5;</code>
   * @return The bytes for destinationAddress.
   */
  com.google.protobuf.ByteString
      getDestinationAddressBytes();

  /**
   * <pre>
   * Origin name, for example, London.
   * </pre>
   *
   * <code>string origin_name = 6;</code>
   * @return The originName.
   */
  java.lang.String getOriginName();
  /**
   * <pre>
   * Origin name, for example, London.
   * </pre>
   *
   * <code>string origin_name = 6;</code>
   * @return The bytes for originName.
   */
  com.google.protobuf.ByteString
      getOriginNameBytes();

  /**
   * <pre>
   * Price which can be a number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 100.00 USD.
   * </pre>
   *
   * <code>string price = 7;</code>
   * @return The price.
   */
  java.lang.String getPrice();
  /**
   * <pre>
   * Price which can be a number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 100.00 USD.
   * </pre>
   *
   * <code>string price = 7;</code>
   * @return The bytes for price.
   */
  com.google.protobuf.ByteString
      getPriceBytes();

  /**
   * <pre>
   * Sale price which can be a number followed by the alphabetic currency
   * code, ISO 4217 standard. Use '.' as the decimal mark, for example, 80.00
   * USD. Must be less than the 'price' field.
   * </pre>
   *
   * <code>string sale_price = 8;</code>
   * @return The salePrice.
   */
  java.lang.String getSalePrice();
  /**
   * <pre>
   * Sale price which can be a number followed by the alphabetic currency
   * code, ISO 4217 standard. Use '.' as the decimal mark, for example, 80.00
   * USD. Must be less than the 'price' field.
   * </pre>
   *
   * <code>string sale_price = 8;</code>
   * @return The bytes for salePrice.
   */
  com.google.protobuf.ByteString
      getSalePriceBytes();

  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $100.00.
   * </pre>
   *
   * <code>string formatted_price = 9;</code>
   * @return The formattedPrice.
   */
  java.lang.String getFormattedPrice();
  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $100.00.
   * </pre>
   *
   * <code>string formatted_price = 9;</code>
   * @return The bytes for formattedPrice.
   */
  com.google.protobuf.ByteString
      getFormattedPriceBytes();

  /**
   * <pre>
   * Formatted sale price which can be any characters. If set, this attribute
   * will be used instead of 'sale price', for example, On sale for $80.00.
   * </pre>
   *
   * <code>string formatted_sale_price = 10;</code>
   * @return The formattedSalePrice.
   */
  java.lang.String getFormattedSalePrice();
  /**
   * <pre>
   * Formatted sale price which can be any characters. If set, this attribute
   * will be used instead of 'sale price', for example, On sale for $80.00.
   * </pre>
   *
   * <code>string formatted_sale_price = 10;</code>
   * @return The bytes for formattedSalePrice.
   */
  com.google.protobuf.ByteString
      getFormattedSalePriceBytes();

  /**
   * <pre>
   * Category, for example, Express.
   * </pre>
   *
   * <code>string category = 11;</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <pre>
   * Category, for example, Express.
   * </pre>
   *
   * <code>string category = 11;</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <pre>
   * Contextual keywords, for example, Paris trains.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 12;</code>
   * @return A list containing the contextualKeywords.
   */
  java.util.List<java.lang.String>
      getContextualKeywordsList();
  /**
   * <pre>
   * Contextual keywords, for example, Paris trains.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 12;</code>
   * @return The count of contextualKeywords.
   */
  int getContextualKeywordsCount();
  /**
   * <pre>
   * Contextual keywords, for example, Paris trains.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 12;</code>
   * @param index The index of the element to return.
   * @return The contextualKeywords at the given index.
   */
  java.lang.String getContextualKeywords(int index);
  /**
   * <pre>
   * Contextual keywords, for example, Paris trains.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 12;</code>
   * @param index The index of the value to return.
   * @return The bytes of the contextualKeywords at the given index.
   */
  com.google.protobuf.ByteString
      getContextualKeywordsBytes(int index);

  /**
   * <pre>
   * Similar destination IDs, for example, NYC.
   * </pre>
   *
   * <code>repeated string similar_destination_ids = 13;</code>
   * @return A list containing the similarDestinationIds.
   */
  java.util.List<java.lang.String>
      getSimilarDestinationIdsList();
  /**
   * <pre>
   * Similar destination IDs, for example, NYC.
   * </pre>
   *
   * <code>repeated string similar_destination_ids = 13;</code>
   * @return The count of similarDestinationIds.
   */
  int getSimilarDestinationIdsCount();
  /**
   * <pre>
   * Similar destination IDs, for example, NYC.
   * </pre>
   *
   * <code>repeated string similar_destination_ids = 13;</code>
   * @param index The index of the element to return.
   * @return The similarDestinationIds at the given index.
   */
  java.lang.String getSimilarDestinationIds(int index);
  /**
   * <pre>
   * Similar destination IDs, for example, NYC.
   * </pre>
   *
   * <code>repeated string similar_destination_ids = 13;</code>
   * @param index The index of the value to return.
   * @return The bytes of the similarDestinationIds at the given index.
   */
  com.google.protobuf.ByteString
      getSimilarDestinationIdsBytes(int index);

  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 14;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 14;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 15;</code>
   * @return The androidAppLink.
   */
  java.lang.String getAndroidAppLink();
  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 15;</code>
   * @return The bytes for androidAppLink.
   */
  com.google.protobuf.ByteString
      getAndroidAppLinkBytes();

  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 16;</code>
   * @return The iosAppLink.
   */
  java.lang.String getIosAppLink();
  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 16;</code>
   * @return The bytes for iosAppLink.
   */
  com.google.protobuf.ByteString
      getIosAppLinkBytes();

  /**
   * <pre>
   * iOS app store ID. This is used to check if the user has the app installed
   * on their device before deep linking. If this field is set, then the
   * ios_app_link field must also be present.
   * </pre>
   *
   * <code>int64 ios_app_store_id = 17;</code>
   * @return The iosAppStoreId.
   */
  long getIosAppStoreId();
}
