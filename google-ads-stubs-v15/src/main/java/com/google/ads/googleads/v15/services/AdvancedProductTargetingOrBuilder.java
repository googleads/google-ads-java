// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface AdvancedProductTargetingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.AdvancedProductTargeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Surface targeting settings for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.SurfaceTargeting surface_targeting_settings = 2;</code>
   * @return Whether the surfaceTargetingSettings field is set.
   */
  boolean hasSurfaceTargetingSettings();
  /**
   * <pre>
   * Surface targeting settings for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.SurfaceTargeting surface_targeting_settings = 2;</code>
   * @return The surfaceTargetingSettings.
   */
  com.google.ads.googleads.v15.services.SurfaceTargeting getSurfaceTargetingSettings();
  /**
   * <pre>
   * Surface targeting settings for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.SurfaceTargeting surface_targeting_settings = 2;</code>
   */
  com.google.ads.googleads.v15.services.SurfaceTargetingOrBuilder getSurfaceTargetingSettingsOrBuilder();

  /**
   * <pre>
   * Settings for a Target frequency campaign. Must be set when selecting the
   * TARGET_FREQUENCY product.
   *
   * See https://support.google.com/google-ads/answer/12400225 for more
   * information about Target Frequency campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.TargetFrequencySettings target_frequency_settings = 3;</code>
   * @return Whether the targetFrequencySettings field is set.
   */
  boolean hasTargetFrequencySettings();
  /**
   * <pre>
   * Settings for a Target frequency campaign. Must be set when selecting the
   * TARGET_FREQUENCY product.
   *
   * See https://support.google.com/google-ads/answer/12400225 for more
   * information about Target Frequency campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.TargetFrequencySettings target_frequency_settings = 3;</code>
   * @return The targetFrequencySettings.
   */
  com.google.ads.googleads.v15.services.TargetFrequencySettings getTargetFrequencySettings();
  /**
   * <pre>
   * Settings for a Target frequency campaign. Must be set when selecting the
   * TARGET_FREQUENCY product.
   *
   * See https://support.google.com/google-ads/answer/12400225 for more
   * information about Target Frequency campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.TargetFrequencySettings target_frequency_settings = 3;</code>
   */
  com.google.ads.googleads.v15.services.TargetFrequencySettingsOrBuilder getTargetFrequencySettingsOrBuilder();

  /**
   * <pre>
   * Settings for YouTube Select targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
   * @return Whether the youtubeSelectSettings field is set.
   */
  boolean hasYoutubeSelectSettings();
  /**
   * <pre>
   * Settings for YouTube Select targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
   * @return The youtubeSelectSettings.
   */
  com.google.ads.googleads.v15.services.YouTubeSelectSettings getYoutubeSelectSettings();
  /**
   * <pre>
   * Settings for YouTube Select targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.YouTubeSelectSettings youtube_select_settings = 1;</code>
   */
  com.google.ads.googleads.v15.services.YouTubeSelectSettingsOrBuilder getYoutubeSelectSettingsOrBuilder();

  com.google.ads.googleads.v15.services.AdvancedProductTargeting.AdvancedTargetingCase getAdvancedTargetingCase();
}
