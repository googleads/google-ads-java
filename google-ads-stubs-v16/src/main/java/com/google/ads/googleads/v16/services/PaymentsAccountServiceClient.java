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

package com.google.ads.googleads.v16.services;

import com.google.ads.googleads.v16.services.stub.PaymentsAccountServiceStub;
import com.google.ads.googleads.v16.services.stub.PaymentsAccountServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to provide payments accounts that can be used to set up consolidated
 * billing.
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
 * try (PaymentsAccountServiceClient paymentsAccountServiceClient =
 *     PaymentsAccountServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   ListPaymentsAccountsResponse response =
 *       paymentsAccountServiceClient.listPaymentsAccounts(customerId);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the PaymentsAccountServiceClient object to clean up
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
 *      <td><p> ListPaymentsAccounts</td>
 *      <td><p> Returns all payments accounts associated with all managers between the login customer ID and specified serving customer in the hierarchy, inclusive.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [PaymentsAccountError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listPaymentsAccounts(ListPaymentsAccountsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listPaymentsAccounts(String customerId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listPaymentsAccountsCallable()
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
 * <p>This class can be customized by passing in a custom instance of PaymentsAccountServiceSettings
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
 * PaymentsAccountServiceSettings paymentsAccountServiceSettings =
 *     PaymentsAccountServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * PaymentsAccountServiceClient paymentsAccountServiceClient =
 *     PaymentsAccountServiceClient.create(paymentsAccountServiceSettings);
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
 * PaymentsAccountServiceSettings paymentsAccountServiceSettings =
 *     PaymentsAccountServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * PaymentsAccountServiceClient paymentsAccountServiceClient =
 *     PaymentsAccountServiceClient.create(paymentsAccountServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class PaymentsAccountServiceClient implements BackgroundResource {
  private final PaymentsAccountServiceSettings settings;
  private final PaymentsAccountServiceStub stub;

  /** Constructs an instance of PaymentsAccountServiceClient with default settings. */
  public static final PaymentsAccountServiceClient create() throws IOException {
    return create(PaymentsAccountServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of PaymentsAccountServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final PaymentsAccountServiceClient create(PaymentsAccountServiceSettings settings)
      throws IOException {
    return new PaymentsAccountServiceClient(settings);
  }

  /**
   * Constructs an instance of PaymentsAccountServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(PaymentsAccountServiceSettings).
   */
  public static final PaymentsAccountServiceClient create(PaymentsAccountServiceStub stub) {
    return new PaymentsAccountServiceClient(stub);
  }

  /**
   * Constructs an instance of PaymentsAccountServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected PaymentsAccountServiceClient(PaymentsAccountServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((PaymentsAccountServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected PaymentsAccountServiceClient(PaymentsAccountServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final PaymentsAccountServiceSettings getSettings() {
    return settings;
  }

  public PaymentsAccountServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all payments accounts associated with all managers between the login customer ID and
   * specified serving customer in the hierarchy, inclusive.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [PaymentsAccountError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PaymentsAccountServiceClient paymentsAccountServiceClient =
   *     PaymentsAccountServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   ListPaymentsAccountsResponse response =
   *       paymentsAccountServiceClient.listPaymentsAccounts(customerId);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer to apply the PaymentsAccount list operation
   *     to.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPaymentsAccountsResponse listPaymentsAccounts(String customerId) {
    ListPaymentsAccountsRequest request =
        ListPaymentsAccountsRequest.newBuilder().setCustomerId(customerId).build();
    return listPaymentsAccounts(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all payments accounts associated with all managers between the login customer ID and
   * specified serving customer in the hierarchy, inclusive.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [PaymentsAccountError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PaymentsAccountServiceClient paymentsAccountServiceClient =
   *     PaymentsAccountServiceClient.create()) {
   *   ListPaymentsAccountsRequest request =
   *       ListPaymentsAccountsRequest.newBuilder().setCustomerId("customerId-1581184615").build();
   *   ListPaymentsAccountsResponse response =
   *       paymentsAccountServiceClient.listPaymentsAccounts(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPaymentsAccountsResponse listPaymentsAccounts(
      ListPaymentsAccountsRequest request) {
    return listPaymentsAccountsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all payments accounts associated with all managers between the login customer ID and
   * specified serving customer in the hierarchy, inclusive.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [PaymentsAccountError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PaymentsAccountServiceClient paymentsAccountServiceClient =
   *     PaymentsAccountServiceClient.create()) {
   *   ListPaymentsAccountsRequest request =
   *       ListPaymentsAccountsRequest.newBuilder().setCustomerId("customerId-1581184615").build();
   *   ApiFuture<ListPaymentsAccountsResponse> future =
   *       paymentsAccountServiceClient.listPaymentsAccountsCallable().futureCall(request);
   *   // Do something.
   *   ListPaymentsAccountsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListPaymentsAccountsRequest, ListPaymentsAccountsResponse>
      listPaymentsAccountsCallable() {
    return stub.listPaymentsAccountsCallable();
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
