// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/android_privacy_shared_key_google_ad_group.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

public interface AndroidPrivacySharedKeyGoogleAdGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.AndroidPrivacySharedKeyGoogleAdGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the Android privacy shared key.
   * Android privacy shared key resource names have the form:
   *
   * `customers/{customer_id}/androidPrivacySharedKeyGoogleAdGroups/{campaign_id}~{ad_group_id}~{android_privacy_interaction_type}~{android_privacy_network_type}~{android_privacy_interaction_date(yyyy-mm-dd)}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the Android privacy shared key.
   * Android privacy shared key resource names have the form:
   *
   * `customers/{customer_id}/androidPrivacySharedKeyGoogleAdGroups/{campaign_id}~{ad_group_id}~{android_privacy_interaction_type}~{android_privacy_network_type}~{android_privacy_interaction_date(yyyy-mm-dd)}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The campaign ID used in the share key encoding.
   * </pre>
   *
   * <code>int64 campaign_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The campaignId.
   */
  long getCampaignId();

  /**
   * <pre>
   * Output only. The interaction type enum used in the share key encoding.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AndroidPrivacyInteractionTypeEnum.AndroidPrivacyInteractionType android_privacy_interaction_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for androidPrivacyInteractionType.
   */
  int getAndroidPrivacyInteractionTypeValue();
  /**
   * <pre>
   * Output only. The interaction type enum used in the share key encoding.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AndroidPrivacyInteractionTypeEnum.AndroidPrivacyInteractionType android_privacy_interaction_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The androidPrivacyInteractionType.
   */
  com.google.ads.googleads.v15.enums.AndroidPrivacyInteractionTypeEnum.AndroidPrivacyInteractionType getAndroidPrivacyInteractionType();

  /**
   * <pre>
   * Output only. The interaction date used in the shared key encoding in the
   * format of "YYYY-MM-DD" in UTC timezone.
   * </pre>
   *
   * <code>string android_privacy_interaction_date = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The androidPrivacyInteractionDate.
   */
  java.lang.String getAndroidPrivacyInteractionDate();
  /**
   * <pre>
   * Output only. The interaction date used in the shared key encoding in the
   * format of "YYYY-MM-DD" in UTC timezone.
   * </pre>
   *
   * <code>string android_privacy_interaction_date = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for androidPrivacyInteractionDate.
   */
  com.google.protobuf.ByteString
      getAndroidPrivacyInteractionDateBytes();

  /**
   * <pre>
   * Output only. The network type enum used in the share key encoding.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AndroidPrivacyNetworkTypeEnum.AndroidPrivacyNetworkType android_privacy_network_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for androidPrivacyNetworkType.
   */
  int getAndroidPrivacyNetworkTypeValue();
  /**
   * <pre>
   * Output only. The network type enum used in the share key encoding.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AndroidPrivacyNetworkTypeEnum.AndroidPrivacyNetworkType android_privacy_network_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The androidPrivacyNetworkType.
   */
  com.google.ads.googleads.v15.enums.AndroidPrivacyNetworkTypeEnum.AndroidPrivacyNetworkType getAndroidPrivacyNetworkType();

  /**
   * <pre>
   * Output only. The ad group ID used in the share key encoding.
   * </pre>
   *
   * <code>int64 ad_group_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adGroupId.
   */
  long getAdGroupId();

  /**
   * <pre>
   * Output only. 128 bit hex string of the encoded shared ad group key,
   * including a '0x' prefix. This key can be used to do a bitwise OR operator
   * with the aggregate conversion key to create a full aggregation key to
   * retrieve the Aggregate API Report in Android Privacy Sandbox.
   * </pre>
   *
   * <code>string shared_ad_group_key = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The sharedAdGroupKey.
   */
  java.lang.String getSharedAdGroupKey();
  /**
   * <pre>
   * Output only. 128 bit hex string of the encoded shared ad group key,
   * including a '0x' prefix. This key can be used to do a bitwise OR operator
   * with the aggregate conversion key to create a full aggregation key to
   * retrieve the Aggregate API Report in Android Privacy Sandbox.
   * </pre>
   *
   * <code>string shared_ad_group_key = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for sharedAdGroupKey.
   */
  com.google.protobuf.ByteString
      getSharedAdGroupKeyBytes();
}
