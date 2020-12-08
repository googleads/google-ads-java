/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.KeywordPlan;
import com.google.ads.googleads.v6.resources.KeywordPlanName;
import com.google.ads.googleads.v6.services.stub.KeywordPlanServiceStub;
import com.google.ads.googleads.v6.services.stub.KeywordPlanServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage keyword plans.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the KeywordPlanServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of KeywordPlanServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * KeywordPlanServiceSettings keywordPlanServiceSettings =
 *     KeywordPlanServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanServiceClient keywordPlanServiceClient =
 *     KeywordPlanServiceClient.create(keywordPlanServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * KeywordPlanServiceSettings keywordPlanServiceSettings =
 *     KeywordPlanServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanServiceClient keywordPlanServiceClient =
 *     KeywordPlanServiceClient.create(keywordPlanServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class KeywordPlanServiceClient implements BackgroundResource {
  private final KeywordPlanServiceSettings settings;
  private final KeywordPlanServiceStub stub;

  /** Constructs an instance of KeywordPlanServiceClient with default settings. */
  public static final KeywordPlanServiceClient create() throws IOException {
    return create(KeywordPlanServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final KeywordPlanServiceClient create(KeywordPlanServiceSettings settings)
      throws IOException {
    return new KeywordPlanServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(KeywordPlanServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordPlanServiceClient create(KeywordPlanServiceStub stub) {
    return new KeywordPlanServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected KeywordPlanServiceClient(KeywordPlanServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((KeywordPlanServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanServiceClient(KeywordPlanServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested plan in full detail.
   *
   * @param resource_name Required. The resource name of the plan to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlan getKeywordPlan(KeywordPlanName resourceName) {
    GetKeywordPlanRequest request =
        GetKeywordPlanRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getKeywordPlan(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested plan in full detail.
   *
   * @param resource_name Required. The resource name of the plan to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlan getKeywordPlan(String resourceName) {
    GetKeywordPlanRequest request =
        GetKeywordPlanRequest.newBuilder().setResourceName(resourceName).build();
    return getKeywordPlan(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested plan in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlan getKeywordPlan(GetKeywordPlanRequest request) {
    return getKeywordPlanCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetKeywordPlanRequest, KeywordPlan> getKeywordPlanCallable() {
    return stub.getKeywordPlanCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * @param customer_id Required. The ID of the customer whose keyword plans are being modified.
   * @param operations Required. The list of operations to perform on individual keyword plans.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlansResponse mutateKeywordPlans(
      String customerId, List<KeywordPlanOperation> operations) {
    MutateKeywordPlansRequest request =
        MutateKeywordPlansRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlans(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlansResponse mutateKeywordPlans(MutateKeywordPlansRequest request) {
    return mutateKeywordPlansCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansCallable() {
    return stub.mutateKeywordPlansCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan forecast curve. Only the bidding strategy is considered for
   * generating forecast curve. The bidding strategy value specified in the plan is ignored.
   *
   * <p>To generate a forecast at a value specified in the plan, use
   * KeywordPlanService.GenerateForecastMetrics.
   *
   * @param keyword_plan Required. The resource name of the keyword plan to be forecasted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastCurveResponse generateForecastCurve(KeywordPlanName keywordPlan) {
    GenerateForecastCurveRequest request =
        GenerateForecastCurveRequest.newBuilder()
            .setKeywordPlan(keywordPlan == null ? null : keywordPlan.toString())
            .build();
    return generateForecastCurve(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan forecast curve. Only the bidding strategy is considered for
   * generating forecast curve. The bidding strategy value specified in the plan is ignored.
   *
   * <p>To generate a forecast at a value specified in the plan, use
   * KeywordPlanService.GenerateForecastMetrics.
   *
   * @param keyword_plan Required. The resource name of the keyword plan to be forecasted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastCurveResponse generateForecastCurve(String keywordPlan) {
    GenerateForecastCurveRequest request =
        GenerateForecastCurveRequest.newBuilder().setKeywordPlan(keywordPlan).build();
    return generateForecastCurve(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan forecast curve. Only the bidding strategy is considered for
   * generating forecast curve. The bidding strategy value specified in the plan is ignored.
   *
   * <p>To generate a forecast at a value specified in the plan, use
   * KeywordPlanService.GenerateForecastMetrics.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastCurveResponse generateForecastCurve(
      GenerateForecastCurveRequest request) {
    return generateForecastCurveCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan forecast curve. Only the bidding strategy is considered for
   * generating forecast curve. The bidding strategy value specified in the plan is ignored.
   *
   * <p>To generate a forecast at a value specified in the plan, use
   * KeywordPlanService.GenerateForecastMetrics.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
      generateForecastCurveCallable() {
    return stub.generateForecastCurveCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a forecast in the form of a time series for the Keyword Plan over the next 52 weeks.
   * (1) Forecasts closer to the current date are generally more accurate than further out.
   *
   * <p>(2) The forecast reflects seasonal trends using current and prior traffic patterns. The
   * forecast period of the plan is ignored.
   *
   * @param keyword_plan Required. The resource name of the keyword plan to be forecasted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastTimeSeriesResponse generateForecastTimeSeries(
      KeywordPlanName keywordPlan) {
    GenerateForecastTimeSeriesRequest request =
        GenerateForecastTimeSeriesRequest.newBuilder()
            .setKeywordPlan(keywordPlan == null ? null : keywordPlan.toString())
            .build();
    return generateForecastTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a forecast in the form of a time series for the Keyword Plan over the next 52 weeks.
   * (1) Forecasts closer to the current date are generally more accurate than further out.
   *
   * <p>(2) The forecast reflects seasonal trends using current and prior traffic patterns. The
   * forecast period of the plan is ignored.
   *
   * @param keyword_plan Required. The resource name of the keyword plan to be forecasted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastTimeSeriesResponse generateForecastTimeSeries(String keywordPlan) {
    GenerateForecastTimeSeriesRequest request =
        GenerateForecastTimeSeriesRequest.newBuilder().setKeywordPlan(keywordPlan).build();
    return generateForecastTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a forecast in the form of a time series for the Keyword Plan over the next 52 weeks.
   * (1) Forecasts closer to the current date are generally more accurate than further out.
   *
   * <p>(2) The forecast reflects seasonal trends using current and prior traffic patterns. The
   * forecast period of the plan is ignored.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastTimeSeriesResponse generateForecastTimeSeries(
      GenerateForecastTimeSeriesRequest request) {
    return generateForecastTimeSeriesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a forecast in the form of a time series for the Keyword Plan over the next 52 weeks.
   * (1) Forecasts closer to the current date are generally more accurate than further out.
   *
   * <p>(2) The forecast reflects seasonal trends using current and prior traffic patterns. The
   * forecast period of the plan is ignored.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
      generateForecastTimeSeriesCallable() {
    return stub.generateForecastTimeSeriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan forecasts.
   *
   * @param keyword_plan Required. The resource name of the keyword plan to be forecasted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastMetricsResponse generateForecastMetrics(
      KeywordPlanName keywordPlan) {
    GenerateForecastMetricsRequest request =
        GenerateForecastMetricsRequest.newBuilder()
            .setKeywordPlan(keywordPlan == null ? null : keywordPlan.toString())
            .build();
    return generateForecastMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan forecasts.
   *
   * @param keyword_plan Required. The resource name of the keyword plan to be forecasted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastMetricsResponse generateForecastMetrics(String keywordPlan) {
    GenerateForecastMetricsRequest request =
        GenerateForecastMetricsRequest.newBuilder().setKeywordPlan(keywordPlan).build();
    return generateForecastMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan forecasts.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastMetricsResponse generateForecastMetrics(
      GenerateForecastMetricsRequest request) {
    return generateForecastMetricsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan forecasts.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
      generateForecastMetricsCallable() {
    return stub.generateForecastMetricsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan historical metrics.
   *
   * @param keyword_plan Required. The resource name of the keyword plan of which historical metrics
   *     are requested.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateHistoricalMetricsResponse generateHistoricalMetrics(
      KeywordPlanName keywordPlan) {
    GenerateHistoricalMetricsRequest request =
        GenerateHistoricalMetricsRequest.newBuilder()
            .setKeywordPlan(keywordPlan == null ? null : keywordPlan.toString())
            .build();
    return generateHistoricalMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan historical metrics.
   *
   * @param keyword_plan Required. The resource name of the keyword plan of which historical metrics
   *     are requested.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateHistoricalMetricsResponse generateHistoricalMetrics(String keywordPlan) {
    GenerateHistoricalMetricsRequest request =
        GenerateHistoricalMetricsRequest.newBuilder().setKeywordPlan(keywordPlan).build();
    return generateHistoricalMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan historical metrics.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateHistoricalMetricsResponse generateHistoricalMetrics(
      GenerateHistoricalMetricsRequest request) {
    return generateHistoricalMetricsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan historical metrics.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
      generateHistoricalMetricsCallable() {
    return stub.generateHistoricalMetricsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
