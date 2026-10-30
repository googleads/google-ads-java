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

package com.google.ads.googleads.v26.services;

import com.google.ads.googleads.v26.services.stub.LocalServicesEligibilityServiceStub;
import com.google.ads.googleads.v26.services.stub.LocalServicesEligibilityServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service allows eligibility checking and discovery of category/job type
 * details for Local Services.
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
 * try (LocalServicesEligibilityServiceClient localServicesEligibilityServiceClient =
 *     LocalServicesEligibilityServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   String listingId = "listingId-1215024449";
 *   CheckLocalServicesEligibilityResponse response =
 *       localServicesEligibilityServiceClient.checkLocalServicesEligibility(
 *           customerId, listingId);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the LocalServicesEligibilityServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CheckLocalServicesEligibility</td>
 *      <td><p> Returns the Local Services eligibility status and valid categories for a given Customer and GBP Listing ID.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> checkLocalServicesEligibility(CheckLocalServicesEligibilityRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> checkLocalServicesEligibility(String customerId, String listingId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> checkLocalServicesEligibilityCallable()
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
 * LocalServicesEligibilityServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * LocalServicesEligibilityServiceSettings localServicesEligibilityServiceSettings =
 *     LocalServicesEligibilityServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LocalServicesEligibilityServiceClient localServicesEligibilityServiceClient =
 *     LocalServicesEligibilityServiceClient.create(localServicesEligibilityServiceSettings);
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
 * LocalServicesEligibilityServiceSettings localServicesEligibilityServiceSettings =
 *     LocalServicesEligibilityServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * LocalServicesEligibilityServiceClient localServicesEligibilityServiceClient =
 *     LocalServicesEligibilityServiceClient.create(localServicesEligibilityServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@NullMarked
@Generated("by gapic-generator-java")
public class LocalServicesEligibilityServiceClient implements BackgroundResource {
  private final @Nullable LocalServicesEligibilityServiceSettings settings;
  private final LocalServicesEligibilityServiceStub stub;

  /** Constructs an instance of LocalServicesEligibilityServiceClient with default settings. */
  public static final LocalServicesEligibilityServiceClient create() throws IOException {
    return create(LocalServicesEligibilityServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of LocalServicesEligibilityServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final LocalServicesEligibilityServiceClient create(
      LocalServicesEligibilityServiceSettings settings) throws IOException {
    return new LocalServicesEligibilityServiceClient(settings);
  }

  /**
   * Constructs an instance of LocalServicesEligibilityServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(LocalServicesEligibilityServiceSettings).
   */
  public static final LocalServicesEligibilityServiceClient create(
      LocalServicesEligibilityServiceStub stub) {
    return new LocalServicesEligibilityServiceClient(stub);
  }

  /**
   * Constructs an instance of LocalServicesEligibilityServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected LocalServicesEligibilityServiceClient(LocalServicesEligibilityServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((LocalServicesEligibilityServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected LocalServicesEligibilityServiceClient(LocalServicesEligibilityServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final @Nullable LocalServicesEligibilityServiceSettings getSettings() {
    return settings;
  }

  public LocalServicesEligibilityServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the Local Services eligibility status and valid categories for a given Customer and GBP
   * Listing ID.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (LocalServicesEligibilityServiceClient localServicesEligibilityServiceClient =
   *     LocalServicesEligibilityServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   String listingId = "listingId-1215024449";
   *   CheckLocalServicesEligibilityResponse response =
   *       localServicesEligibilityServiceClient.checkLocalServicesEligibility(
   *           customerId, listingId);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose eligibility is being checked.
   * @param listingId Required. The Google Business Profile listing ID to check eligibility for.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CheckLocalServicesEligibilityResponse checkLocalServicesEligibility(
      String customerId, String listingId) {
    CheckLocalServicesEligibilityRequest request =
        CheckLocalServicesEligibilityRequest.newBuilder()
            .setCustomerId(customerId)
            .setListingId(listingId)
            .build();
    return checkLocalServicesEligibility(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the Local Services eligibility status and valid categories for a given Customer and GBP
   * Listing ID.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (LocalServicesEligibilityServiceClient localServicesEligibilityServiceClient =
   *     LocalServicesEligibilityServiceClient.create()) {
   *   CheckLocalServicesEligibilityRequest request =
   *       CheckLocalServicesEligibilityRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setListingId("listingId-1215024449")
   *           .build();
   *   CheckLocalServicesEligibilityResponse response =
   *       localServicesEligibilityServiceClient.checkLocalServicesEligibility(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CheckLocalServicesEligibilityResponse checkLocalServicesEligibility(
      CheckLocalServicesEligibilityRequest request) {
    return checkLocalServicesEligibilityCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the Local Services eligibility status and valid categories for a given Customer and GBP
   * Listing ID.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (LocalServicesEligibilityServiceClient localServicesEligibilityServiceClient =
   *     LocalServicesEligibilityServiceClient.create()) {
   *   CheckLocalServicesEligibilityRequest request =
   *       CheckLocalServicesEligibilityRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setListingId("listingId-1215024449")
   *           .build();
   *   ApiFuture<CheckLocalServicesEligibilityResponse> future =
   *       localServicesEligibilityServiceClient
   *           .checkLocalServicesEligibilityCallable()
   *           .futureCall(request);
   *   // Do something.
   *   CheckLocalServicesEligibilityResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          CheckLocalServicesEligibilityRequest, CheckLocalServicesEligibilityResponse>
      checkLocalServicesEligibilityCallable() {
    return stub.checkLocalServicesEligibilityCallable();
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
