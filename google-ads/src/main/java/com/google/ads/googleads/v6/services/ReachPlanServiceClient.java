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

import com.google.ads.googleads.v6.services.stub.ReachPlanServiceStub;
import com.google.ads.googleads.v6.services.stub.ReachPlanServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Reach Plan Service gives users information about audience size that can be
 * reached through advertisement on YouTube. In particular, GenerateReachForecast provides estimated
 * number of people of specified demographics that can be reached by an ad in a given market by a
 * campaign of certain duration with a defined budget.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the ReachPlanServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of ReachPlanServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * ReachPlanServiceSettings reachPlanServiceSettings =
 *     ReachPlanServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ReachPlanServiceClient reachPlanServiceClient =
 *     ReachPlanServiceClient.create(reachPlanServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * ReachPlanServiceSettings reachPlanServiceSettings =
 *     ReachPlanServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ReachPlanServiceClient reachPlanServiceClient =
 *     ReachPlanServiceClient.create(reachPlanServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ReachPlanServiceClient implements BackgroundResource {
  private final ReachPlanServiceSettings settings;
  private final ReachPlanServiceStub stub;

  /** Constructs an instance of ReachPlanServiceClient with default settings. */
  public static final ReachPlanServiceClient create() throws IOException {
    return create(ReachPlanServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ReachPlanServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ReachPlanServiceClient create(ReachPlanServiceSettings settings)
      throws IOException {
    return new ReachPlanServiceClient(settings);
  }

  /**
   * Constructs an instance of ReachPlanServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(ReachPlanServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ReachPlanServiceClient create(ReachPlanServiceStub stub) {
    return new ReachPlanServiceClient(stub);
  }

  /**
   * Constructs an instance of ReachPlanServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ReachPlanServiceClient(ReachPlanServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ReachPlanServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ReachPlanServiceClient(ReachPlanServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ReachPlanServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ReachPlanServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of plannable locations (for example, countries &amp; DMAs).
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPlannableLocationsResponse listPlannableLocations(
      ListPlannableLocationsRequest request) {
    return listPlannableLocationsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of plannable locations (for example, countries &amp; DMAs).
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsCallable() {
    return stub.listPlannableLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of per-location plannable YouTube ad formats with allowed targeting.
   *
   * @param plannableLocationId Required. The ID of the selected location for planning. To list the
   *     available plannable location ids use ListPlannableLocations.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPlannableProductsResponse listPlannableProducts(String plannableLocationId) {
    ListPlannableProductsRequest request =
        ListPlannableProductsRequest.newBuilder()
            .setPlannableLocationId(plannableLocationId)
            .build();
    return listPlannableProducts(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of per-location plannable YouTube ad formats with allowed targeting.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPlannableProductsResponse listPlannableProducts(
      ListPlannableProductsRequest request) {
    return listPlannableProductsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of per-location plannable YouTube ad formats with allowed targeting.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsCallable() {
    return stub.listPlannableProductsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a product mix ideas given a set of preferences. This method helps the advertiser to
   * obtain a good mix of ad formats and budget allocations based on its preferences.
   *
   * @param customerId Required. The ID of the customer.
   * @param plannableLocationId Required. The ID of the location, this is one of the ids returned by
   *     ListPlannableLocations.
   * @param currencyCode Required. Currency code. Three-character ISO 4217 currency code.
   * @param budgetMicros Required. Total budget. Amount in micros. One million is equivalent to one
   *     unit.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateProductMixIdeasResponse generateProductMixIdeas(
      String customerId, String plannableLocationId, String currencyCode, long budgetMicros) {
    GenerateProductMixIdeasRequest request =
        GenerateProductMixIdeasRequest.newBuilder()
            .setCustomerId(customerId)
            .setPlannableLocationId(plannableLocationId)
            .setCurrencyCode(currencyCode)
            .setBudgetMicros(budgetMicros)
            .build();
    return generateProductMixIdeas(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a product mix ideas given a set of preferences. This method helps the advertiser to
   * obtain a good mix of ad formats and budget allocations based on its preferences.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateProductMixIdeasResponse generateProductMixIdeas(
      GenerateProductMixIdeasRequest request) {
    return generateProductMixIdeasCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a product mix ideas given a set of preferences. This method helps the advertiser to
   * obtain a good mix of ad formats and budget allocations based on its preferences.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GenerateProductMixIdeasRequest, GenerateProductMixIdeasResponse>
      generateProductMixIdeasCallable() {
    return stub.generateProductMixIdeasCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a reach forecast for a given targeting / product mix.
   *
   * @param customerId Required. The ID of the customer.
   * @param campaignDuration Required. Campaign duration.
   * @param plannedProducts Required. The products to be forecast. The max number of allowed planned
   *     products is 15.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateReachForecastResponse generateReachForecast(
      String customerId, CampaignDuration campaignDuration, List<PlannedProduct> plannedProducts) {
    GenerateReachForecastRequest request =
        GenerateReachForecastRequest.newBuilder()
            .setCustomerId(customerId)
            .setCampaignDuration(campaignDuration)
            .addAllPlannedProducts(plannedProducts)
            .build();
    return generateReachForecast(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a reach forecast for a given targeting / product mix.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateReachForecastResponse generateReachForecast(
      GenerateReachForecastRequest request) {
    return generateReachForecastCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a reach forecast for a given targeting / product mix.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastCallable() {
    return stub.generateReachForecastCallable();
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
