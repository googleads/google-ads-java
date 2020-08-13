/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v5.services;

import com.google.ads.googleads.v5.services.stub.PaymentsAccountServiceStub;
import com.google.ads.googleads.v5.services.stub.PaymentsAccountServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to provide payments accounts that can be used to set up consolidated
 * billing.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (PaymentsAccountServiceClient paymentsAccountServiceClient = PaymentsAccountServiceClient.create()) {
 *   String customerId = "";
 *   ListPaymentsAccountsResponse response = paymentsAccountServiceClient.listPaymentsAccounts(customerId);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the paymentsAccountServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
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
 * <pre>
 * <code>
 * PaymentsAccountServiceSettings paymentsAccountServiceSettings =
 *     PaymentsAccountServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * PaymentsAccountServiceClient paymentsAccountServiceClient =
 *     PaymentsAccountServiceClient.create(paymentsAccountServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * PaymentsAccountServiceSettings paymentsAccountServiceSettings =
 *     PaymentsAccountServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * PaymentsAccountServiceClient paymentsAccountServiceClient =
 *     PaymentsAccountServiceClient.create(paymentsAccountServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
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
   * This is for advanced usage - prefer to use PaymentsAccountServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected PaymentsAccountServiceClient(PaymentsAccountServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final PaymentsAccountServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public PaymentsAccountServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all payments accounts associated with all managers between the login customer ID and
   * specified serving customer in the hierarchy, inclusive.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PaymentsAccountServiceClient paymentsAccountServiceClient = PaymentsAccountServiceClient.create()) {
   *   String customerId = "";
   *   ListPaymentsAccountsResponse response = paymentsAccountServiceClient.listPaymentsAccounts(customerId);
   * }
   * </code></pre>
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all payments accounts associated with all managers between the login customer ID and
   * specified serving customer in the hierarchy, inclusive.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PaymentsAccountServiceClient paymentsAccountServiceClient = PaymentsAccountServiceClient.create()) {
   *   String customerId = "";
   *   ListPaymentsAccountsRequest request = ListPaymentsAccountsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .build();
   *   ListPaymentsAccountsResponse response = paymentsAccountServiceClient.listPaymentsAccounts(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPaymentsAccountsResponse listPaymentsAccounts(
      ListPaymentsAccountsRequest request) {
    return listPaymentsAccountsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all payments accounts associated with all managers between the login customer ID and
   * specified serving customer in the hierarchy, inclusive.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PaymentsAccountServiceClient paymentsAccountServiceClient = PaymentsAccountServiceClient.create()) {
   *   String customerId = "";
   *   ListPaymentsAccountsRequest request = ListPaymentsAccountsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .build();
   *   ApiFuture&lt;ListPaymentsAccountsResponse&gt; future = paymentsAccountServiceClient.listPaymentsAccountsCallable().futureCall(request);
   *   // Do something
   *   ListPaymentsAccountsResponse response = future.get();
   * }
   * </code></pre>
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
