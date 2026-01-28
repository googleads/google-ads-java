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

import com.google.ads.googleads.v23.services.stub.IncentiveServiceStub;
import com.google.ads.googleads.v23.services.stub.IncentiveServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to support incentive related operations.
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
 * try (IncentiveServiceClient incentiveServiceClient = IncentiveServiceClient.create()) {
 *   FetchIncentiveRequest request =
 *       FetchIncentiveRequest.newBuilder()
 *           .setLanguageCode("languageCode-2092349083")
 *           .setCountryCode("countryCode-1477067101")
 *           .setEmail("email96619420")
 *           .build();
 *   FetchIncentiveResponse response = incentiveServiceClient.fetchIncentive(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the IncentiveServiceClient object to clean up resources
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
 *      <td><p> FetchIncentive</td>
 *      <td><p> Returns incentives for a given user.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> fetchIncentive(FetchIncentiveRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> fetchIncentiveCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ApplyIncentive</td>
 *      <td><p> Applies the incentive for the ads customer.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> applyIncentive(ApplyIncentiveRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> applyIncentive(String countryCode)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> applyIncentiveCallable()
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
 * <p>This class can be customized by passing in a custom instance of IncentiveServiceSettings to
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
 * IncentiveServiceSettings incentiveServiceSettings =
 *     IncentiveServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * IncentiveServiceClient incentiveServiceClient =
 *     IncentiveServiceClient.create(incentiveServiceSettings);
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
 * IncentiveServiceSettings incentiveServiceSettings =
 *     IncentiveServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * IncentiveServiceClient incentiveServiceClient =
 *     IncentiveServiceClient.create(incentiveServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class IncentiveServiceClient implements BackgroundResource {
  private final IncentiveServiceSettings settings;
  private final IncentiveServiceStub stub;

  /** Constructs an instance of IncentiveServiceClient with default settings. */
  public static final IncentiveServiceClient create() throws IOException {
    return create(IncentiveServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of IncentiveServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final IncentiveServiceClient create(IncentiveServiceSettings settings)
      throws IOException {
    return new IncentiveServiceClient(settings);
  }

  /**
   * Constructs an instance of IncentiveServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(IncentiveServiceSettings).
   */
  public static final IncentiveServiceClient create(IncentiveServiceStub stub) {
    return new IncentiveServiceClient(stub);
  }

  /**
   * Constructs an instance of IncentiveServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected IncentiveServiceClient(IncentiveServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((IncentiveServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected IncentiveServiceClient(IncentiveServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final IncentiveServiceSettings getSettings() {
    return settings;
  }

  public IncentiveServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns incentives for a given user.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IncentiveServiceClient incentiveServiceClient = IncentiveServiceClient.create()) {
   *   FetchIncentiveRequest request =
   *       FetchIncentiveRequest.newBuilder()
   *           .setLanguageCode("languageCode-2092349083")
   *           .setCountryCode("countryCode-1477067101")
   *           .setEmail("email96619420")
   *           .build();
   *   FetchIncentiveResponse response = incentiveServiceClient.fetchIncentive(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchIncentiveResponse fetchIncentive(FetchIncentiveRequest request) {
    return fetchIncentiveCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns incentives for a given user.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IncentiveServiceClient incentiveServiceClient = IncentiveServiceClient.create()) {
   *   FetchIncentiveRequest request =
   *       FetchIncentiveRequest.newBuilder()
   *           .setLanguageCode("languageCode-2092349083")
   *           .setCountryCode("countryCode-1477067101")
   *           .setEmail("email96619420")
   *           .build();
   *   ApiFuture<FetchIncentiveResponse> future =
   *       incentiveServiceClient.fetchIncentiveCallable().futureCall(request);
   *   // Do something.
   *   FetchIncentiveResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<FetchIncentiveRequest, FetchIncentiveResponse>
      fetchIncentiveCallable() {
    return stub.fetchIncentiveCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Applies the incentive for the ads customer.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IncentiveServiceClient incentiveServiceClient = IncentiveServiceClient.create()) {
   *   String countryCode = "countryCode-1477067101";
   *   ApplyIncentiveResponse response = incentiveServiceClient.applyIncentive(countryCode);
   * }
   * }</pre>
   *
   * @param countryCode Required. User's country code. Required. This field must be equal to the
   *     Google Ads account's billing country. Incentive eligibility, terms of service, and reward
   *     values are often country-specific. This country code is used to ensure the selected
   *     incentive is applicable to the user. Possible country codes:
   *     https://developers.google.com/google-ads/api/data/codes-formats#country_codes
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ApplyIncentiveResponse applyIncentive(String countryCode) {
    ApplyIncentiveRequest request =
        ApplyIncentiveRequest.newBuilder().setCountryCode(countryCode).build();
    return applyIncentive(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Applies the incentive for the ads customer.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IncentiveServiceClient incentiveServiceClient = IncentiveServiceClient.create()) {
   *   ApplyIncentiveRequest request =
   *       ApplyIncentiveRequest.newBuilder()
   *           .setSelectedIncentiveId(1678975891)
   *           .setCustomerId("customerId-1581184615")
   *           .setCountryCode("countryCode-1477067101")
   *           .build();
   *   ApplyIncentiveResponse response = incentiveServiceClient.applyIncentive(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ApplyIncentiveResponse applyIncentive(ApplyIncentiveRequest request) {
    return applyIncentiveCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Applies the incentive for the ads customer.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IncentiveServiceClient incentiveServiceClient = IncentiveServiceClient.create()) {
   *   ApplyIncentiveRequest request =
   *       ApplyIncentiveRequest.newBuilder()
   *           .setSelectedIncentiveId(1678975891)
   *           .setCustomerId("customerId-1581184615")
   *           .setCountryCode("countryCode-1477067101")
   *           .build();
   *   ApiFuture<ApplyIncentiveResponse> future =
   *       incentiveServiceClient.applyIncentiveCallable().futureCall(request);
   *   // Do something.
   *   ApplyIncentiveResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ApplyIncentiveRequest, ApplyIncentiveResponse>
      applyIncentiveCallable() {
    return stub.applyIncentiveCallable();
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
