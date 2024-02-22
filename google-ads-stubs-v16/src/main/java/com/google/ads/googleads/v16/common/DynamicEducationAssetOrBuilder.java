// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/asset_types.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.common;

public interface DynamicEducationAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.common.DynamicEducationAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Program ID which can be any sequence of letters and digits, and
   * must be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string program_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The programId.
   */
  java.lang.String getProgramId();
  /**
   * <pre>
   * Required. Program ID which can be any sequence of letters and digits, and
   * must be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string program_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for programId.
   */
  com.google.protobuf.ByteString
      getProgramIdBytes();

  /**
   * <pre>
   * Location ID which can be any sequence of letters and digits and must be
   * unique.
   * </pre>
   *
   * <code>string location_id = 2;</code>
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   * <pre>
   * Location ID which can be any sequence of letters and digits and must be
   * unique.
   * </pre>
   *
   * <code>string location_id = 2;</code>
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString
      getLocationIdBytes();

  /**
   * <pre>
   * Required. Program name, for example, Nursing. Required.
   * </pre>
   *
   * <code>string program_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The programName.
   */
  java.lang.String getProgramName();
  /**
   * <pre>
   * Required. Program name, for example, Nursing. Required.
   * </pre>
   *
   * <code>string program_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for programName.
   */
  com.google.protobuf.ByteString
      getProgramNameBytes();

  /**
   * <pre>
   * Subject of study, for example, Health.
   * </pre>
   *
   * <code>string subject = 4;</code>
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   * <pre>
   * Subject of study, for example, Health.
   * </pre>
   *
   * <code>string subject = 4;</code>
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <pre>
   * Program description, for example, Nursing Certification.
   * </pre>
   *
   * <code>string program_description = 5;</code>
   * @return The programDescription.
   */
  java.lang.String getProgramDescription();
  /**
   * <pre>
   * Program description, for example, Nursing Certification.
   * </pre>
   *
   * <code>string program_description = 5;</code>
   * @return The bytes for programDescription.
   */
  com.google.protobuf.ByteString
      getProgramDescriptionBytes();

  /**
   * <pre>
   * School name, for example, Mountain View School of Nursing.
   * </pre>
   *
   * <code>string school_name = 6;</code>
   * @return The schoolName.
   */
  java.lang.String getSchoolName();
  /**
   * <pre>
   * School name, for example, Mountain View School of Nursing.
   * </pre>
   *
   * <code>string school_name = 6;</code>
   * @return The bytes for schoolName.
   */
  com.google.protobuf.ByteString
      getSchoolNameBytes();

  /**
   * <pre>
   * School address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403
   * </pre>
   *
   * <code>string address = 7;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * School address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403
   * </pre>
   *
   * <code>string address = 7;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * Contextual keywords, for example, Nursing certification, Health, Mountain
   * View.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 8;</code>
   * @return A list containing the contextualKeywords.
   */
  java.util.List<java.lang.String>
      getContextualKeywordsList();
  /**
   * <pre>
   * Contextual keywords, for example, Nursing certification, Health, Mountain
   * View.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 8;</code>
   * @return The count of contextualKeywords.
   */
  int getContextualKeywordsCount();
  /**
   * <pre>
   * Contextual keywords, for example, Nursing certification, Health, Mountain
   * View.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 8;</code>
   * @param index The index of the element to return.
   * @return The contextualKeywords at the given index.
   */
  java.lang.String getContextualKeywords(int index);
  /**
   * <pre>
   * Contextual keywords, for example, Nursing certification, Health, Mountain
   * View.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the contextualKeywords at the given index.
   */
  com.google.protobuf.ByteString
      getContextualKeywordsBytes(int index);

  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 9;</code>
   * @return The androidAppLink.
   */
  java.lang.String getAndroidAppLink();
  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 9;</code>
   * @return The bytes for androidAppLink.
   */
  com.google.protobuf.ByteString
      getAndroidAppLinkBytes();

  /**
   * <pre>
   * Similar program IDs.
   * </pre>
   *
   * <code>repeated string similar_program_ids = 10;</code>
   * @return A list containing the similarProgramIds.
   */
  java.util.List<java.lang.String>
      getSimilarProgramIdsList();
  /**
   * <pre>
   * Similar program IDs.
   * </pre>
   *
   * <code>repeated string similar_program_ids = 10;</code>
   * @return The count of similarProgramIds.
   */
  int getSimilarProgramIdsCount();
  /**
   * <pre>
   * Similar program IDs.
   * </pre>
   *
   * <code>repeated string similar_program_ids = 10;</code>
   * @param index The index of the element to return.
   * @return The similarProgramIds at the given index.
   */
  java.lang.String getSimilarProgramIds(int index);
  /**
   * <pre>
   * Similar program IDs.
   * </pre>
   *
   * <code>repeated string similar_program_ids = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the similarProgramIds at the given index.
   */
  com.google.protobuf.ByteString
      getSimilarProgramIdsBytes(int index);

  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 11;</code>
   * @return The iosAppLink.
   */
  java.lang.String getIosAppLink();
  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 11;</code>
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
   * <code>int64 ios_app_store_id = 12;</code>
   * @return The iosAppStoreId.
   */
  long getIosAppStoreId();

  /**
   * <pre>
   * Thumbnail image url, for example, http://www.example.com/thumbnail.png. The
   * thumbnail image will not be uploaded as image asset.
   * </pre>
   *
   * <code>string thumbnail_image_url = 13;</code>
   * @return The thumbnailImageUrl.
   */
  java.lang.String getThumbnailImageUrl();
  /**
   * <pre>
   * Thumbnail image url, for example, http://www.example.com/thumbnail.png. The
   * thumbnail image will not be uploaded as image asset.
   * </pre>
   *
   * <code>string thumbnail_image_url = 13;</code>
   * @return The bytes for thumbnailImageUrl.
   */
  com.google.protobuf.ByteString
      getThumbnailImageUrlBytes();

  /**
   * <pre>
   * Image url, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 14;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * Image url, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 14;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();
}
