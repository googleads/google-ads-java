/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.services;

import com.google.ads.googleads.v23.common.LocationInfo;
import com.google.ads.googleads.v23.enums.BenchmarksSourceTypeEnum;
import com.google.ads.googleads.v23.services.stub.BenchmarksServiceStub;
import com.google.ads.googleads.v23.services.stub.BenchmarksServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: BenchmarksService helps users compare YouTube advertisement data against
 * industry benchmarks. Accessible to allowlisted customers only.
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
 * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
 *   ListBenchmarksAvailableDatesRequest request =
 *       ListBenchmarksAvailableDatesRequest.newBuilder()
 *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
 *           .build();
 *   ListBenchmarksAvailableDatesResponse response =
 *       benchmarksServiceClient.listBenchmarksAvailableDates(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the BenchmarksServiceClient object to clean up resources
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
 *      <td><p> ListBenchmarksAvailableDates</td>
 *      <td><p> Returns a date range that supports benchmarks.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listBenchmarksAvailableDates(ListBenchmarksAvailableDatesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listBenchmarksAvailableDatesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListBenchmarksLocations</td>
 *      <td><p> Returns the list of locations that support benchmarks (for example, countries).
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listBenchmarksLocations(ListBenchmarksLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listBenchmarksLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListBenchmarksProducts</td>
 *      <td><p> Returns the list of products that supports benchmarks.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listBenchmarksProducts(ListBenchmarksProductsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listBenchmarksProductsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListBenchmarksSources</td>
 *      <td><p> Returns the list of benchmarks sources (for example, Industry Verticals).
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listBenchmarksSources(ListBenchmarksSourcesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listBenchmarksSources(List&lt;BenchmarksSourceTypeEnum.BenchmarksSourceType&gt; benchmarksSources)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listBenchmarksSourcesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateBenchmarksMetrics</td>
 *      <td><p> Returns YouTube advertisement metrics for the given client against industry benchmarks.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [BenchmarksError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateBenchmarksMetrics(GenerateBenchmarksMetricsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateBenchmarksMetrics(String customerId, LocationInfo location, BenchmarksSource benchmarksSource, ProductFilter productFilter)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateBenchmarksMetricsCallable()
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
 * <p>This class can be customized by passing in a custom instance of BenchmarksServiceSettings to
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
 * BenchmarksServiceSettings benchmarksServiceSettings =
 *     BenchmarksServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BenchmarksServiceClient benchmarksServiceClient =
 *     BenchmarksServiceClient.create(benchmarksServiceSettings);
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
 * BenchmarksServiceSettings benchmarksServiceSettings =
 *     BenchmarksServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BenchmarksServiceClient benchmarksServiceClient =
 *     BenchmarksServiceClient.create(benchmarksServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class BenchmarksServiceClient implements BackgroundResource {
  private final BenchmarksServiceSettings settings;
  private final BenchmarksServiceStub stub;

  /** Constructs an instance of BenchmarksServiceClient with default settings. */
  public static final BenchmarksServiceClient create() throws IOException {
    return create(BenchmarksServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BenchmarksServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BenchmarksServiceClient create(BenchmarksServiceSettings settings)
      throws IOException {
    return new BenchmarksServiceClient(settings);
  }

  /**
   * Constructs an instance of BenchmarksServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(BenchmarksServiceSettings).
   */
  public static final BenchmarksServiceClient create(BenchmarksServiceStub stub) {
    return new BenchmarksServiceClient(stub);
  }

  /**
   * Constructs an instance of BenchmarksServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected BenchmarksServiceClient(BenchmarksServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((BenchmarksServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected BenchmarksServiceClient(BenchmarksServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BenchmarksServiceSettings getSettings() {
    return settings;
  }

  public BenchmarksServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a date range that supports benchmarks.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   ListBenchmarksAvailableDatesRequest request =
   *       ListBenchmarksAvailableDatesRequest.newBuilder()
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ListBenchmarksAvailableDatesResponse response =
   *       benchmarksServiceClient.listBenchmarksAvailableDates(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBenchmarksAvailableDatesResponse listBenchmarksAvailableDates(
      ListBenchmarksAvailableDatesRequest request) {
    return listBenchmarksAvailableDatesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a date range that supports benchmarks.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   ListBenchmarksAvailableDatesRequest request =
   *       ListBenchmarksAvailableDatesRequest.newBuilder()
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<ListBenchmarksAvailableDatesResponse> future =
   *       benchmarksServiceClient.listBenchmarksAvailableDatesCallable().futureCall(request);
   *   // Do something.
   *   ListBenchmarksAvailableDatesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
      listBenchmarksAvailableDatesCallable() {
    return stub.listBenchmarksAvailableDatesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of locations that support benchmarks (for example, countries).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   ListBenchmarksLocationsRequest request =
   *       ListBenchmarksLocationsRequest.newBuilder()
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ListBenchmarksLocationsResponse response =
   *       benchmarksServiceClient.listBenchmarksLocations(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBenchmarksLocationsResponse listBenchmarksLocations(
      ListBenchmarksLocationsRequest request) {
    return listBenchmarksLocationsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of locations that support benchmarks (for example, countries).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   ListBenchmarksLocationsRequest request =
   *       ListBenchmarksLocationsRequest.newBuilder()
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<ListBenchmarksLocationsResponse> future =
   *       benchmarksServiceClient.listBenchmarksLocationsCallable().futureCall(request);
   *   // Do something.
   *   ListBenchmarksLocationsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
      listBenchmarksLocationsCallable() {
    return stub.listBenchmarksLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of products that supports benchmarks.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   ListBenchmarksProductsRequest request =
   *       ListBenchmarksProductsRequest.newBuilder()
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ListBenchmarksProductsResponse response =
   *       benchmarksServiceClient.listBenchmarksProducts(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBenchmarksProductsResponse listBenchmarksProducts(
      ListBenchmarksProductsRequest request) {
    return listBenchmarksProductsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of products that supports benchmarks.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   ListBenchmarksProductsRequest request =
   *       ListBenchmarksProductsRequest.newBuilder()
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<ListBenchmarksProductsResponse> future =
   *       benchmarksServiceClient.listBenchmarksProductsCallable().futureCall(request);
   *   // Do something.
   *   ListBenchmarksProductsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
      listBenchmarksProductsCallable() {
    return stub.listBenchmarksProductsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of benchmarks sources (for example, Industry Verticals).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   List<BenchmarksSourceTypeEnum.BenchmarksSourceType> benchmarksSources = new ArrayList<>();
   *   ListBenchmarksSourcesResponse response =
   *       benchmarksServiceClient.listBenchmarksSources(benchmarksSources);
   * }
   * }</pre>
   *
   * @param benchmarksSources Required. The types of benchmarks sources to be returned (for example,
   *     INDUSTRY_VERTICAL).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBenchmarksSourcesResponse listBenchmarksSources(
      List<BenchmarksSourceTypeEnum.BenchmarksSourceType> benchmarksSources) {
    ListBenchmarksSourcesRequest request =
        ListBenchmarksSourcesRequest.newBuilder()
            .addAllBenchmarksSources(benchmarksSources)
            .build();
    return listBenchmarksSources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of benchmarks sources (for example, Industry Verticals).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   ListBenchmarksSourcesRequest request =
   *       ListBenchmarksSourcesRequest.newBuilder()
   *           .addAllBenchmarksSources(
   *               new ArrayList<BenchmarksSourceTypeEnum.BenchmarksSourceType>())
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ListBenchmarksSourcesResponse response =
   *       benchmarksServiceClient.listBenchmarksSources(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBenchmarksSourcesResponse listBenchmarksSources(
      ListBenchmarksSourcesRequest request) {
    return listBenchmarksSourcesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of benchmarks sources (for example, Industry Verticals).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   ListBenchmarksSourcesRequest request =
   *       ListBenchmarksSourcesRequest.newBuilder()
   *           .addAllBenchmarksSources(
   *               new ArrayList<BenchmarksSourceTypeEnum.BenchmarksSourceType>())
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<ListBenchmarksSourcesResponse> future =
   *       benchmarksServiceClient.listBenchmarksSourcesCallable().futureCall(request);
   *   // Do something.
   *   ListBenchmarksSourcesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
      listBenchmarksSourcesCallable() {
    return stub.listBenchmarksSourcesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns YouTube advertisement metrics for the given client against industry benchmarks.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [BenchmarksError]()
   * [FieldError]() [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   LocationInfo location = LocationInfo.newBuilder().build();
   *   BenchmarksSource benchmarksSource = BenchmarksSource.newBuilder().build();
   *   ProductFilter productFilter = ProductFilter.newBuilder().build();
   *   GenerateBenchmarksMetricsResponse response =
   *       benchmarksServiceClient.generateBenchmarksMetrics(
   *           customerId, location, benchmarksSource, productFilter);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer. Supply a client customer ID to generate
   *     metrics for the customer. A manager account customer ID will not return customer metrics
   *     since it does not have any associated direct ad campaigns.
   * @param location Required. The location to generate benchmarks metrics for.
   * @param benchmarksSource Required. The source used to generate benchmarks metrics for.
   * @param productFilter Required. The products to aggregate metrics over. Product filter settings
   *     support a list of product IDs or a list of marketing objectives.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateBenchmarksMetricsResponse generateBenchmarksMetrics(
      String customerId,
      LocationInfo location,
      BenchmarksSource benchmarksSource,
      ProductFilter productFilter) {
    GenerateBenchmarksMetricsRequest request =
        GenerateBenchmarksMetricsRequest.newBuilder()
            .setCustomerId(customerId)
            .setLocation(location)
            .setBenchmarksSource(benchmarksSource)
            .setProductFilter(productFilter)
            .build();
    return generateBenchmarksMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns YouTube advertisement metrics for the given client against industry benchmarks.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [BenchmarksError]()
   * [FieldError]() [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   GenerateBenchmarksMetricsRequest request =
   *       GenerateBenchmarksMetricsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setDateRange(DateRange.newBuilder().build())
   *           .setLocation(LocationInfo.newBuilder().build())
   *           .setBenchmarksSource(BenchmarksSource.newBuilder().build())
   *           .setProductFilter(ProductFilter.newBuilder().build())
   *           .setCurrencyCode("currencyCode1004773790")
   *           .setCustomerBenchmarksGroup("customerBenchmarksGroup-2124896949")
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   GenerateBenchmarksMetricsResponse response =
   *       benchmarksServiceClient.generateBenchmarksMetrics(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateBenchmarksMetricsResponse generateBenchmarksMetrics(
      GenerateBenchmarksMetricsRequest request) {
    return generateBenchmarksMetricsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns YouTube advertisement metrics for the given client against industry benchmarks.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [BenchmarksError]()
   * [FieldError]() [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BenchmarksServiceClient benchmarksServiceClient = BenchmarksServiceClient.create()) {
   *   GenerateBenchmarksMetricsRequest request =
   *       GenerateBenchmarksMetricsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setDateRange(DateRange.newBuilder().build())
   *           .setLocation(LocationInfo.newBuilder().build())
   *           .setBenchmarksSource(BenchmarksSource.newBuilder().build())
   *           .setProductFilter(ProductFilter.newBuilder().build())
   *           .setCurrencyCode("currencyCode1004773790")
   *           .setCustomerBenchmarksGroup("customerBenchmarksGroup-2124896949")
   *           .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateBenchmarksMetricsResponse> future =
   *       benchmarksServiceClient.generateBenchmarksMetricsCallable().futureCall(request);
   *   // Do something.
   *   GenerateBenchmarksMetricsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
      generateBenchmarksMetricsCallable() {
    return stub.generateBenchmarksMetricsCallable();
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
