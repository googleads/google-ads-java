// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/keyword_plan_service.proto

package com.google.ads.googleads.v13.services;

public interface KeywordPlanWeeklyTimeSeriesForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.services.KeywordPlanWeeklyTimeSeriesForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   *
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 1;</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  boolean hasKeywordPlanCampaign();
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   *
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 1;</code>
   * @return The keywordPlanCampaign.
   */
  java.lang.String getKeywordPlanCampaign();
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   *
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 1;</code>
   * @return The bytes for keywordPlanCampaign.
   */
  com.google.protobuf.ByteString
      getKeywordPlanCampaignBytes();

  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyForecast weekly_forecasts = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v13.services.KeywordPlanWeeklyForecast> 
      getWeeklyForecastsList();
  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyForecast weekly_forecasts = 2;</code>
   */
  com.google.ads.googleads.v13.services.KeywordPlanWeeklyForecast getWeeklyForecasts(int index);
  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyForecast weekly_forecasts = 2;</code>
   */
  int getWeeklyForecastsCount();
  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyForecast weekly_forecasts = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v13.services.KeywordPlanWeeklyForecastOrBuilder> 
      getWeeklyForecastsOrBuilderList();
  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.KeywordPlanWeeklyForecast weekly_forecasts = 2;</code>
   */
  com.google.ads.googleads.v13.services.KeywordPlanWeeklyForecastOrBuilder getWeeklyForecastsOrBuilder(
      int index);
}
