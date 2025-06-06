// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/policy.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

public interface PolicyTopicEvidenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.PolicyTopicEvidence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of websites linked with this resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.WebsiteList website_list = 3;</code>
   * @return Whether the websiteList field is set.
   */
  boolean hasWebsiteList();
  /**
   * <pre>
   * List of websites linked with this resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.WebsiteList website_list = 3;</code>
   * @return The websiteList.
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.WebsiteList getWebsiteList();
  /**
   * <pre>
   * List of websites linked with this resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.WebsiteList website_list = 3;</code>
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.WebsiteListOrBuilder getWebsiteListOrBuilder();

  /**
   * <pre>
   * List of evidence found in the text of a resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.TextList text_list = 4;</code>
   * @return Whether the textList field is set.
   */
  boolean hasTextList();
  /**
   * <pre>
   * List of evidence found in the text of a resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.TextList text_list = 4;</code>
   * @return The textList.
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.TextList getTextList();
  /**
   * <pre>
   * List of evidence found in the text of a resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.TextList text_list = 4;</code>
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.TextListOrBuilder getTextListOrBuilder();

  /**
   * <pre>
   * The language the resource was detected to be written in.
   * This is an IETF language tag such as "en-US".
   * </pre>
   *
   * <code>string language_code = 9;</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * The language the resource was detected to be written in.
   * This is an IETF language tag such as "en-US".
   * </pre>
   *
   * <code>string language_code = 9;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The language the resource was detected to be written in.
   * This is an IETF language tag such as "en-US".
   * </pre>
   *
   * <code>string language_code = 9;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * The text in the destination of the resource that is causing a policy
   * finding.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationTextList destination_text_list = 6;</code>
   * @return Whether the destinationTextList field is set.
   */
  boolean hasDestinationTextList();
  /**
   * <pre>
   * The text in the destination of the resource that is causing a policy
   * finding.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationTextList destination_text_list = 6;</code>
   * @return The destinationTextList.
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationTextList getDestinationTextList();
  /**
   * <pre>
   * The text in the destination of the resource that is causing a policy
   * finding.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationTextList destination_text_list = 6;</code>
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationTextListOrBuilder getDestinationTextListOrBuilder();

  /**
   * <pre>
   * Mismatch between the destinations of a resource's URLs.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationMismatch destination_mismatch = 7;</code>
   * @return Whether the destinationMismatch field is set.
   */
  boolean hasDestinationMismatch();
  /**
   * <pre>
   * Mismatch between the destinations of a resource's URLs.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationMismatch destination_mismatch = 7;</code>
   * @return The destinationMismatch.
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationMismatch getDestinationMismatch();
  /**
   * <pre>
   * Mismatch between the destinations of a resource's URLs.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationMismatch destination_mismatch = 7;</code>
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationMismatchOrBuilder getDestinationMismatchOrBuilder();

  /**
   * <pre>
   * Details when the destination is returning an HTTP error code or isn't
   * functional in all locations for commonly used devices.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationNotWorking destination_not_working = 8;</code>
   * @return Whether the destinationNotWorking field is set.
   */
  boolean hasDestinationNotWorking();
  /**
   * <pre>
   * Details when the destination is returning an HTTP error code or isn't
   * functional in all locations for commonly used devices.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationNotWorking destination_not_working = 8;</code>
   * @return The destinationNotWorking.
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationNotWorking getDestinationNotWorking();
  /**
   * <pre>
   * Details when the destination is returning an HTTP error code or isn't
   * functional in all locations for commonly used devices.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationNotWorking destination_not_working = 8;</code>
   */
  com.google.ads.googleads.v18.common.PolicyTopicEvidence.DestinationNotWorkingOrBuilder getDestinationNotWorkingOrBuilder();

  com.google.ads.googleads.v18.common.PolicyTopicEvidence.ValueCase getValueCase();
}
