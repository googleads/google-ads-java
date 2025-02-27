// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/offline_user_data.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

public interface ItemAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.ItemAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique identifier of a product. It can be either the Merchant Center Item
   * ID or GTIN (Global Trade Item Number).
   * </pre>
   *
   * <code>string item_id = 1;</code>
   * @return The itemId.
   */
  java.lang.String getItemId();
  /**
   * <pre>
   * A unique identifier of a product. It can be either the Merchant Center Item
   * ID or GTIN (Global Trade Item Number).
   * </pre>
   *
   * <code>string item_id = 1;</code>
   * @return The bytes for itemId.
   */
  com.google.protobuf.ByteString
      getItemIdBytes();

  /**
   * <pre>
   * ID of the Merchant Center Account.
   * </pre>
   *
   * <code>optional int64 merchant_id = 2;</code>
   * @return Whether the merchantId field is set.
   */
  boolean hasMerchantId();
  /**
   * <pre>
   * ID of the Merchant Center Account.
   * </pre>
   *
   * <code>optional int64 merchant_id = 2;</code>
   * @return The merchantId.
   */
  long getMerchantId();

  /**
   * <pre>
   * Common Locale Data Repository (CLDR) territory code of the country
   * associated with the feed where your items are uploaded. See
   * https://developers.google.com/google-ads/api/reference/data/codes-formats#country-codes
   * for more information.
   * </pre>
   *
   * <code>string country_code = 3;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Common Locale Data Repository (CLDR) territory code of the country
   * associated with the feed where your items are uploaded. See
   * https://developers.google.com/google-ads/api/reference/data/codes-formats#country-codes
   * for more information.
   * </pre>
   *
   * <code>string country_code = 3;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * ISO 639-1 code of the language associated with the feed where your items
   * are uploaded
   * </pre>
   *
   * <code>string language_code = 4;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * ISO 639-1 code of the language associated with the feed where your items
   * are uploaded
   * </pre>
   *
   * <code>string language_code = 4;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * The number of items sold. Defaults to 1 if not set.
   * </pre>
   *
   * <code>int64 quantity = 5;</code>
   * @return The quantity.
   */
  long getQuantity();
}
