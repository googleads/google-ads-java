/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v19.services;

import com.google.ads.googleads.v19.services.stub.ReachPlanServiceStub;
import com.google.ads.googleads.v19.services.stub.ReachPlanServiceStubSettings;
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
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
 *   ListPlannableLocationsRequest request = ListPlannableLocationsRequest.newBuilder().build();
 *   ListPlannableLocationsResponse response =
 *       reachPlanServiceClient.listPlannableLocations(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ReachPlanServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListPlannableLocations</td>
 *      <td><p> Returns the list of plannable locations (for example, countries).
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listPlannableLocations(ListPlannableLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listPlannableLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListPlannableProducts</td>
 *      <td><p> Returns the list of per-location plannable YouTube ad formats with allowed targeting.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listPlannableProducts(ListPlannableProductsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listPlannableProducts(String plannableLocationId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listPlannableProductsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateReachForecast</td>
 *      <td><p> Generates a reach forecast for a given targeting / product mix.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [ReachPlanError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateReachForecast(GenerateReachForecastRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateReachForecast(String customerId, CampaignDuration campaignDuration, List&lt;PlannedProduct&gt; plannedProducts)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateReachForecastCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
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
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
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
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
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

  protected ReachPlanServiceClient(ReachPlanServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ReachPlanServiceSettings getSettings() {
    return settings;
  }

  public ReachPlanServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of plannable locations (for example, countries).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
   *   ListPlannableLocationsRequest request = ListPlannableLocationsRequest.newBuilder().build();
   *   ListPlannableLocationsResponse response =
   *       reachPlanServiceClient.listPlannableLocations(request);
   * }
   * }</pre>
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
   * Returns the list of plannable locations (for example, countries).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
   *   ListPlannableLocationsRequest request = ListPlannableLocationsRequest.newBuilder().build();
   *   ApiFuture<ListPlannableLocationsResponse> future =
   *       reachPlanServiceClient.listPlannableLocationsCallable().futureCall(request);
   *   // Do something.
   *   ListPlannableLocationsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsCallable() {
    return stub.listPlannableLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of per-location plannable YouTube ad formats with allowed targeting.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
   *   String plannableLocationId = "plannableLocationId-1266753969";
   *   ListPlannableProductsResponse response =
   *       reachPlanServiceClient.listPlannableProducts(plannableLocationId);
   * }
   * }</pre>
   *
   * @param plannableLocationId Required. The ID of the selected location for planning. To list the
   *     available plannable location IDs use
   *     [ReachPlanService.ListPlannableLocations][google.ads.googleads.v19.services.ReachPlanService.ListPlannableLocations].
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
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
   *   ListPlannableProductsRequest request =
   *       ListPlannableProductsRequest.newBuilder()
   *           .setPlannableLocationId("plannableLocationId-1266753969")
   *           .build();
   *   ListPlannableProductsResponse response =
   *       reachPlanServiceClient.listPlannableProducts(request);
   * }
   * }</pre>
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
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
   *   ListPlannableProductsRequest request =
   *       ListPlannableProductsRequest.newBuilder()
   *           .setPlannableLocationId("plannableLocationId-1266753969")
   *           .build();
   *   ApiFuture<ListPlannableProductsResponse> future =
   *       reachPlanServiceClient.listPlannableProductsCallable().futureCall(request);
   *   // Do something.
   *   ListPlannableProductsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsCallable() {
    return stub.listPlannableProductsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a reach forecast for a given targeting / product mix.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [ReachPlanError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   CampaignDuration campaignDuration = CampaignDuration.newBuilder().build();
   *   List<PlannedProduct> plannedProducts = new ArrayList<>();
   *   GenerateReachForecastResponse response =
   *       reachPlanServiceClient.generateReachForecast(
   *           customerId, campaignDuration, plannedProducts);
   * }
   * }</pre>
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
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [ReachPlanError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
   *   GenerateReachForecastRequest request =
   *       GenerateReachForecastRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCurrencyCode("currencyCode1004773790")
   *           .setCampaignDuration(CampaignDuration.newBuilder().build())
   *           .setCookieFrequencyCap(-1372585004)
   *           .setCookieFrequencyCapSetting(FrequencyCap.newBuilder().build())
   *           .setMinEffectiveFrequency(-1801725097)
   *           .setEffectiveFrequencyLimit(EffectiveFrequencyLimit.newBuilder().build())
   *           .setTargeting(Targeting.newBuilder().build())
   *           .addAllPlannedProducts(new ArrayList<PlannedProduct>())
   *           .setForecastMetricOptions(ForecastMetricOptions.newBuilder().build())
   *           .setCustomerReachGroup("customerReachGroup123255626")
   *           .build();
   *   GenerateReachForecastResponse response =
   *       reachPlanServiceClient.generateReachForecast(request);
   * }
   * }</pre>
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
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [ReachPlanError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
   *   GenerateReachForecastRequest request =
   *       GenerateReachForecastRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCurrencyCode("currencyCode1004773790")
   *           .setCampaignDuration(CampaignDuration.newBuilder().build())
   *           .setCookieFrequencyCap(-1372585004)
   *           .setCookieFrequencyCapSetting(FrequencyCap.newBuilder().build())
   *           .setMinEffectiveFrequency(-1801725097)
   *           .setEffectiveFrequencyLimit(EffectiveFrequencyLimit.newBuilder().build())
   *           .setTargeting(Targeting.newBuilder().build())
   *           .addAllPlannedProducts(new ArrayList<PlannedProduct>())
   *           .setForecastMetricOptions(ForecastMetricOptions.newBuilder().build())
   *           .setCustomerReachGroup("customerReachGroup123255626")
   *           .build();
   *   ApiFuture<GenerateReachForecastResponse> future =
   *       reachPlanServiceClient.generateReachForecastCallable().futureCall(request);
   *   // Do something.
   *   GenerateReachForecastResponse response = future.get();
   * }
   * }</pre>
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
