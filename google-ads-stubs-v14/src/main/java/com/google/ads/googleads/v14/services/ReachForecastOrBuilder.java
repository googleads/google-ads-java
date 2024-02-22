// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface ReachForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.ReachForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The cost in micros.
   * </pre>
   *
   * <code>int64 cost_micros = 5;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Forecasted traffic metrics for this point.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.Forecast forecast = 2;</code>
   * @return Whether the forecast field is set.
   */
  boolean hasForecast();
  /**
   * <pre>
   * Forecasted traffic metrics for this point.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.Forecast forecast = 2;</code>
   * @return The forecast.
   */
  com.google.ads.googleads.v14.services.Forecast getForecast();
  /**
   * <pre>
   * Forecasted traffic metrics for this point.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.Forecast forecast = 2;</code>
   */
  com.google.ads.googleads.v14.services.ForecastOrBuilder getForecastOrBuilder();

  /**
   * <pre>
   * The forecasted allocation and traffic metrics for each planned product
   * at this point on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.PlannedProductReachForecast planned_product_reach_forecasts = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v14.services.PlannedProductReachForecast> 
      getPlannedProductReachForecastsList();
  /**
   * <pre>
   * The forecasted allocation and traffic metrics for each planned product
   * at this point on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.PlannedProductReachForecast planned_product_reach_forecasts = 4;</code>
   */
  com.google.ads.googleads.v14.services.PlannedProductReachForecast getPlannedProductReachForecasts(int index);
  /**
   * <pre>
   * The forecasted allocation and traffic metrics for each planned product
   * at this point on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.PlannedProductReachForecast planned_product_reach_forecasts = 4;</code>
   */
  int getPlannedProductReachForecastsCount();
  /**
   * <pre>
   * The forecasted allocation and traffic metrics for each planned product
   * at this point on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.PlannedProductReachForecast planned_product_reach_forecasts = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.services.PlannedProductReachForecastOrBuilder> 
      getPlannedProductReachForecastsOrBuilderList();
  /**
   * <pre>
   * The forecasted allocation and traffic metrics for each planned product
   * at this point on the reach curve.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.services.PlannedProductReachForecast planned_product_reach_forecasts = 4;</code>
   */
  com.google.ads.googleads.v14.services.PlannedProductReachForecastOrBuilder getPlannedProductReachForecastsOrBuilder(
      int index);
}
