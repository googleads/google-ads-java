// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/ad_type_infos.proto

package com.google.ads.googleads.v1.common;

public interface LegacyAppInstallAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.LegacyAppInstallAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the mobile app.
   * </pre>
   *
   * <code>.google.protobuf.StringValue app_id = 1;</code>
   * @return Whether the appId field is set.
   */
  boolean hasAppId();
  /**
   * <pre>
   * The id of the mobile app.
   * </pre>
   *
   * <code>.google.protobuf.StringValue app_id = 1;</code>
   * @return The appId.
   */
  com.google.protobuf.StringValue getAppId();
  /**
   * <pre>
   * The id of the mobile app.
   * </pre>
   *
   * <code>.google.protobuf.StringValue app_id = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAppIdOrBuilder();

  /**
   * <pre>
   * The app store the mobile app is available in.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.LegacyAppInstallAdAppStoreEnum.LegacyAppInstallAdAppStore app_store = 2;</code>
   * @return The enum numeric value on the wire for appStore.
   */
  int getAppStoreValue();
  /**
   * <pre>
   * The app store the mobile app is available in.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.LegacyAppInstallAdAppStoreEnum.LegacyAppInstallAdAppStore app_store = 2;</code>
   * @return The appStore.
   */
  com.google.ads.googleads.v1.enums.LegacyAppInstallAdAppStoreEnum.LegacyAppInstallAdAppStore getAppStore();

  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 3;</code>
   * @return Whether the headline field is set.
   */
  boolean hasHeadline();
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 3;</code>
   * @return The headline.
   */
  com.google.protobuf.StringValue getHeadline();
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder();

  /**
   * <pre>
   * The first description line of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description1 = 4;</code>
   * @return Whether the description1 field is set.
   */
  boolean hasDescription1();
  /**
   * <pre>
   * The first description line of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description1 = 4;</code>
   * @return The description1.
   */
  com.google.protobuf.StringValue getDescription1();
  /**
   * <pre>
   * The first description line of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description1 = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescription1OrBuilder();

  /**
   * <pre>
   * The second description line of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description2 = 5;</code>
   * @return Whether the description2 field is set.
   */
  boolean hasDescription2();
  /**
   * <pre>
   * The second description line of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description2 = 5;</code>
   * @return The description2.
   */
  com.google.protobuf.StringValue getDescription2();
  /**
   * <pre>
   * The second description line of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description2 = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescription2OrBuilder();
}