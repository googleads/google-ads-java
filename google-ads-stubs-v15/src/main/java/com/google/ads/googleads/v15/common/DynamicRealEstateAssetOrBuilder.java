// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.common;

public interface DynamicRealEstateAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.DynamicRealEstateAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Listing ID which can be any sequence of letters and digits, and
   * must be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string listing_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The listingId.
   */
  java.lang.String getListingId();
  /**
   * <pre>
   * Required. Listing ID which can be any sequence of letters and digits, and
   * must be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string listing_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for listingId.
   */
  com.google.protobuf.ByteString
      getListingIdBytes();

  /**
   * <pre>
   * Required. Listing name, for example, Boulevard Bungalow. Required.
   * </pre>
   *
   * <code>string listing_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The listingName.
   */
  java.lang.String getListingName();
  /**
   * <pre>
   * Required. Listing name, for example, Boulevard Bungalow. Required.
   * </pre>
   *
   * <code>string listing_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for listingName.
   */
  com.google.protobuf.ByteString
      getListingNameBytes();

  /**
   * <pre>
   * City name, for example, Mountain View, California.
   * </pre>
   *
   * <code>string city_name = 3;</code>
   * @return The cityName.
   */
  java.lang.String getCityName();
  /**
   * <pre>
   * City name, for example, Mountain View, California.
   * </pre>
   *
   * <code>string city_name = 3;</code>
   * @return The bytes for cityName.
   */
  com.google.protobuf.ByteString
      getCityNameBytes();

  /**
   * <pre>
   * Description, for example, 3 beds, 2 baths, 1568 sq. ft.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description, for example, 3 beds, 2 baths, 1568 sq. ft.
   * </pre>
   *
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403
   * </pre>
   *
   * <code>string address = 5;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * Address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403
   * </pre>
   *
   * <code>string address = 5;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * Price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 200,000.00
   * USD.
   * </pre>
   *
   * <code>string price = 6;</code>
   * @return The price.
   */
  java.lang.String getPrice();
  /**
   * <pre>
   * Price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 200,000.00
   * USD.
   * </pre>
   *
   * <code>string price = 6;</code>
   * @return The bytes for price.
   */
  com.google.protobuf.ByteString
      getPriceBytes();

  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 7;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 7;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * Property type, for example, House.
   * </pre>
   *
   * <code>string property_type = 8;</code>
   * @return The propertyType.
   */
  java.lang.String getPropertyType();
  /**
   * <pre>
   * Property type, for example, House.
   * </pre>
   *
   * <code>string property_type = 8;</code>
   * @return The bytes for propertyType.
   */
  com.google.protobuf.ByteString
      getPropertyTypeBytes();

  /**
   * <pre>
   * Listing type, for example, For sale.
   * </pre>
   *
   * <code>string listing_type = 9;</code>
   * @return The listingType.
   */
  java.lang.String getListingType();
  /**
   * <pre>
   * Listing type, for example, For sale.
   * </pre>
   *
   * <code>string listing_type = 9;</code>
   * @return The bytes for listingType.
   */
  com.google.protobuf.ByteString
      getListingTypeBytes();

  /**
   * <pre>
   * Contextual keywords, for example, For sale; Houses for sale.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 10;</code>
   * @return A list containing the contextualKeywords.
   */
  java.util.List<java.lang.String>
      getContextualKeywordsList();
  /**
   * <pre>
   * Contextual keywords, for example, For sale; Houses for sale.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 10;</code>
   * @return The count of contextualKeywords.
   */
  int getContextualKeywordsCount();
  /**
   * <pre>
   * Contextual keywords, for example, For sale; Houses for sale.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 10;</code>
   * @param index The index of the element to return.
   * @return The contextualKeywords at the given index.
   */
  java.lang.String getContextualKeywords(int index);
  /**
   * <pre>
   * Contextual keywords, for example, For sale; Houses for sale.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the contextualKeywords at the given index.
   */
  com.google.protobuf.ByteString
      getContextualKeywordsBytes(int index);

  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $200,000.00.
   * </pre>
   *
   * <code>string formatted_price = 11;</code>
   * @return The formattedPrice.
   */
  java.lang.String getFormattedPrice();
  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $200,000.00.
   * </pre>
   *
   * <code>string formatted_price = 11;</code>
   * @return The bytes for formattedPrice.
   */
  com.google.protobuf.ByteString
      getFormattedPriceBytes();

  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 12;</code>
   * @return The androidAppLink.
   */
  java.lang.String getAndroidAppLink();
  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 12;</code>
   * @return The bytes for androidAppLink.
   */
  com.google.protobuf.ByteString
      getAndroidAppLinkBytes();

  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 13;</code>
   * @return The iosAppLink.
   */
  java.lang.String getIosAppLink();
  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 13;</code>
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
   * <code>int64 ios_app_store_id = 14;</code>
   * @return The iosAppStoreId.
   */
  long getIosAppStoreId();

  /**
   * <pre>
   * Similar listing IDs.
   * </pre>
   *
   * <code>repeated string similar_listing_ids = 15;</code>
   * @return A list containing the similarListingIds.
   */
  java.util.List<java.lang.String>
      getSimilarListingIdsList();
  /**
   * <pre>
   * Similar listing IDs.
   * </pre>
   *
   * <code>repeated string similar_listing_ids = 15;</code>
   * @return The count of similarListingIds.
   */
  int getSimilarListingIdsCount();
  /**
   * <pre>
   * Similar listing IDs.
   * </pre>
   *
   * <code>repeated string similar_listing_ids = 15;</code>
   * @param index The index of the element to return.
   * @return The similarListingIds at the given index.
   */
  java.lang.String getSimilarListingIds(int index);
  /**
   * <pre>
   * Similar listing IDs.
   * </pre>
   *
   * <code>repeated string similar_listing_ids = 15;</code>
   * @param index The index of the value to return.
   * @return The bytes of the similarListingIds at the given index.
   */
  com.google.protobuf.ByteString
      getSimilarListingIdsBytes(int index);
}
