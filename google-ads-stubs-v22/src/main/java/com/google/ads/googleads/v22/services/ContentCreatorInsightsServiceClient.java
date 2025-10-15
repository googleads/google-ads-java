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

package com.google.ads.googleads.v22.services;

import com.google.ads.googleads.v22.services.stub.ContentCreatorInsightsServiceStub;
import com.google.ads.googleads.v22.services.stub.ContentCreatorInsightsServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Content Creator Insights Service helps users find information about YouTube
 * Creators and their content and how these creators and their audiences can be reached with Google
 * Ads. Accessible to allowlisted customers only.
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
 * try (ContentCreatorInsightsServiceClient contentCreatorInsightsServiceClient =
 *     ContentCreatorInsightsServiceClient.create()) {
 *   GenerateCreatorInsightsRequest request =
 *       GenerateCreatorInsightsRequest.newBuilder()
 *           .setCustomerId("customerId-1581184615")
 *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
 *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
 *           .addAllCountryLocations(new ArrayList<LocationInfo>())
 *           .addAllSubCountryLocations(new ArrayList<LocationInfo>())
 *           .build();
 *   GenerateCreatorInsightsResponse response =
 *       contentCreatorInsightsServiceClient.generateCreatorInsights(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ContentCreatorInsightsServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateCreatorInsights</td>
 *      <td><p> Returns insights for a collection of YouTube Creators and Channels.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateCreatorInsights(GenerateCreatorInsightsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateCreatorInsightsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateTrendingInsights</td>
 *      <td><p> Returns insights for trending content on YouTube.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateTrendingInsights(GenerateTrendingInsightsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateTrendingInsightsCallable()
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
 * <p>This class can be customized by passing in a custom instance of
 * ContentCreatorInsightsServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ContentCreatorInsightsServiceSettings contentCreatorInsightsServiceSettings =
 *     ContentCreatorInsightsServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ContentCreatorInsightsServiceClient contentCreatorInsightsServiceClient =
 *     ContentCreatorInsightsServiceClient.create(contentCreatorInsightsServiceSettings);
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
 * ContentCreatorInsightsServiceSettings contentCreatorInsightsServiceSettings =
 *     ContentCreatorInsightsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ContentCreatorInsightsServiceClient contentCreatorInsightsServiceClient =
 *     ContentCreatorInsightsServiceClient.create(contentCreatorInsightsServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ContentCreatorInsightsServiceClient implements BackgroundResource {
  private final ContentCreatorInsightsServiceSettings settings;
  private final ContentCreatorInsightsServiceStub stub;

  /** Constructs an instance of ContentCreatorInsightsServiceClient with default settings. */
  public static final ContentCreatorInsightsServiceClient create() throws IOException {
    return create(ContentCreatorInsightsServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ContentCreatorInsightsServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ContentCreatorInsightsServiceClient create(
      ContentCreatorInsightsServiceSettings settings) throws IOException {
    return new ContentCreatorInsightsServiceClient(settings);
  }

  /**
   * Constructs an instance of ContentCreatorInsightsServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(ContentCreatorInsightsServiceSettings).
   */
  public static final ContentCreatorInsightsServiceClient create(
      ContentCreatorInsightsServiceStub stub) {
    return new ContentCreatorInsightsServiceClient(stub);
  }

  /**
   * Constructs an instance of ContentCreatorInsightsServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ContentCreatorInsightsServiceClient(ContentCreatorInsightsServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((ContentCreatorInsightsServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ContentCreatorInsightsServiceClient(ContentCreatorInsightsServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ContentCreatorInsightsServiceSettings getSettings() {
    return settings;
  }

  public ContentCreatorInsightsServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns insights for a collection of YouTube Creators and Channels.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ContentCreatorInsightsServiceClient contentCreatorInsightsServiceClient =
   *     ContentCreatorInsightsServiceClient.create()) {
   *   GenerateCreatorInsightsRequest request =
   *       GenerateCreatorInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .addAllCountryLocations(new ArrayList<LocationInfo>())
   *           .addAllSubCountryLocations(new ArrayList<LocationInfo>())
   *           .build();
   *   GenerateCreatorInsightsResponse response =
   *       contentCreatorInsightsServiceClient.generateCreatorInsights(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateCreatorInsightsResponse generateCreatorInsights(
      GenerateCreatorInsightsRequest request) {
    return generateCreatorInsightsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns insights for a collection of YouTube Creators and Channels.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ContentCreatorInsightsServiceClient contentCreatorInsightsServiceClient =
   *     ContentCreatorInsightsServiceClient.create()) {
   *   GenerateCreatorInsightsRequest request =
   *       GenerateCreatorInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .addAllCountryLocations(new ArrayList<LocationInfo>())
   *           .addAllSubCountryLocations(new ArrayList<LocationInfo>())
   *           .build();
   *   ApiFuture<GenerateCreatorInsightsResponse> future =
   *       contentCreatorInsightsServiceClient.generateCreatorInsightsCallable().futureCall(request);
   *   // Do something.
   *   GenerateCreatorInsightsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateCreatorInsightsRequest, GenerateCreatorInsightsResponse>
      generateCreatorInsightsCallable() {
    return stub.generateCreatorInsightsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns insights for trending content on YouTube.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ContentCreatorInsightsServiceClient contentCreatorInsightsServiceClient =
   *     ContentCreatorInsightsServiceClient.create()) {
   *   GenerateTrendingInsightsRequest request =
   *       GenerateTrendingInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .setCountryLocation(LocationInfo.newBuilder().build())
   *           .build();
   *   GenerateTrendingInsightsResponse response =
   *       contentCreatorInsightsServiceClient.generateTrendingInsights(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateTrendingInsightsResponse generateTrendingInsights(
      GenerateTrendingInsightsRequest request) {
    return generateTrendingInsightsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns insights for trending content on YouTube.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ContentCreatorInsightsServiceClient contentCreatorInsightsServiceClient =
   *     ContentCreatorInsightsServiceClient.create()) {
   *   GenerateTrendingInsightsRequest request =
   *       GenerateTrendingInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .setCountryLocation(LocationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateTrendingInsightsResponse> future =
   *       contentCreatorInsightsServiceClient
   *           .generateTrendingInsightsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   GenerateTrendingInsightsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateTrendingInsightsRequest, GenerateTrendingInsightsResponse>
      generateTrendingInsightsCallable() {
    return stub.generateTrendingInsightsCallable();
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
