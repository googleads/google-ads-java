/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v17.services;

import com.google.ads.googleads.v17.services.stub.BrandSuggestionServiceStub;
import com.google.ads.googleads.v17.services.stub.BrandSuggestionServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service will suggest brands based on a prefix.
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
 * try (BrandSuggestionServiceClient brandSuggestionServiceClient =
 *     BrandSuggestionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   String brandPrefix = "brandPrefix-774313735";
 *   SuggestBrandsResponse response =
 *       brandSuggestionServiceClient.suggestBrands(customerId, brandPrefix);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the BrandSuggestionServiceClient object to clean up
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
 *      <td><p> SuggestBrands</td>
 *      <td><p> Rpc to return a list of matching brands based on a prefix for this customer.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> suggestBrands(SuggestBrandsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> suggestBrands(String customerId, String brandPrefix)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> suggestBrandsCallable()
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
 * <p>This class can be customized by passing in a custom instance of BrandSuggestionServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BrandSuggestionServiceSettings brandSuggestionServiceSettings =
 *     BrandSuggestionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BrandSuggestionServiceClient brandSuggestionServiceClient =
 *     BrandSuggestionServiceClient.create(brandSuggestionServiceSettings);
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
 * BrandSuggestionServiceSettings brandSuggestionServiceSettings =
 *     BrandSuggestionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BrandSuggestionServiceClient brandSuggestionServiceClient =
 *     BrandSuggestionServiceClient.create(brandSuggestionServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class BrandSuggestionServiceClient implements BackgroundResource {
  private final BrandSuggestionServiceSettings settings;
  private final BrandSuggestionServiceStub stub;

  /** Constructs an instance of BrandSuggestionServiceClient with default settings. */
  public static final BrandSuggestionServiceClient create() throws IOException {
    return create(BrandSuggestionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BrandSuggestionServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BrandSuggestionServiceClient create(BrandSuggestionServiceSettings settings)
      throws IOException {
    return new BrandSuggestionServiceClient(settings);
  }

  /**
   * Constructs an instance of BrandSuggestionServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(BrandSuggestionServiceSettings).
   */
  public static final BrandSuggestionServiceClient create(BrandSuggestionServiceStub stub) {
    return new BrandSuggestionServiceClient(stub);
  }

  /**
   * Constructs an instance of BrandSuggestionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected BrandSuggestionServiceClient(BrandSuggestionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((BrandSuggestionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected BrandSuggestionServiceClient(BrandSuggestionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BrandSuggestionServiceSettings getSettings() {
    return settings;
  }

  public BrandSuggestionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Rpc to return a list of matching brands based on a prefix for this customer.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BrandSuggestionServiceClient brandSuggestionServiceClient =
   *     BrandSuggestionServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   String brandPrefix = "brandPrefix-774313735";
   *   SuggestBrandsResponse response =
   *       brandSuggestionServiceClient.suggestBrands(customerId, brandPrefix);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer onto which to apply the brand suggestion
   *     operation.
   * @param brandPrefix Required. The prefix of a brand name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestBrandsResponse suggestBrands(String customerId, String brandPrefix) {
    SuggestBrandsRequest request =
        SuggestBrandsRequest.newBuilder()
            .setCustomerId(customerId)
            .setBrandPrefix(brandPrefix)
            .build();
    return suggestBrands(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Rpc to return a list of matching brands based on a prefix for this customer.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BrandSuggestionServiceClient brandSuggestionServiceClient =
   *     BrandSuggestionServiceClient.create()) {
   *   SuggestBrandsRequest request =
   *       SuggestBrandsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setBrandPrefix("brandPrefix-774313735")
   *           .addAllSelectedBrands(new ArrayList<String>())
   *           .build();
   *   SuggestBrandsResponse response = brandSuggestionServiceClient.suggestBrands(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestBrandsResponse suggestBrands(SuggestBrandsRequest request) {
    return suggestBrandsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Rpc to return a list of matching brands based on a prefix for this customer.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BrandSuggestionServiceClient brandSuggestionServiceClient =
   *     BrandSuggestionServiceClient.create()) {
   *   SuggestBrandsRequest request =
   *       SuggestBrandsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setBrandPrefix("brandPrefix-774313735")
   *           .addAllSelectedBrands(new ArrayList<String>())
   *           .build();
   *   ApiFuture<SuggestBrandsResponse> future =
   *       brandSuggestionServiceClient.suggestBrandsCallable().futureCall(request);
   *   // Do something.
   *   SuggestBrandsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SuggestBrandsRequest, SuggestBrandsResponse> suggestBrandsCallable() {
    return stub.suggestBrandsCallable();
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
