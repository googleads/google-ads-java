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

package com.google.ads.googleads.v15.services;

import com.google.ads.googleads.v15.services.stub.CustomerLifecycleGoalServiceStub;
import com.google.ads.googleads.v15.services.stub.CustomerLifecycleGoalServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to configure customer lifecycle goals.
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
 * try (CustomerLifecycleGoalServiceClient customerLifecycleGoalServiceClient =
 *     CustomerLifecycleGoalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   CustomerLifecycleGoalOperation operation =
 *       CustomerLifecycleGoalOperation.newBuilder().build();
 *   ConfigureCustomerLifecycleGoalsResponse response =
 *       customerLifecycleGoalServiceClient.configureCustomerLifecycleGoals(customerId, operation);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CustomerLifecycleGoalServiceClient object to clean up
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
 *      <td><p> ConfigureCustomerLifecycleGoals</td>
 *      <td><p> Process the given customer lifecycle configurations.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CustomerLifecycleGoalConfigError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> configureCustomerLifecycleGoals(ConfigureCustomerLifecycleGoalsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> configureCustomerLifecycleGoals(String customerId, CustomerLifecycleGoalOperation operation)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> configureCustomerLifecycleGoalsCallable()
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
 * CustomerLifecycleGoalServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CustomerLifecycleGoalServiceSettings customerLifecycleGoalServiceSettings =
 *     CustomerLifecycleGoalServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerLifecycleGoalServiceClient customerLifecycleGoalServiceClient =
 *     CustomerLifecycleGoalServiceClient.create(customerLifecycleGoalServiceSettings);
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
 * CustomerLifecycleGoalServiceSettings customerLifecycleGoalServiceSettings =
 *     CustomerLifecycleGoalServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerLifecycleGoalServiceClient customerLifecycleGoalServiceClient =
 *     CustomerLifecycleGoalServiceClient.create(customerLifecycleGoalServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CustomerLifecycleGoalServiceClient implements BackgroundResource {
  private final CustomerLifecycleGoalServiceSettings settings;
  private final CustomerLifecycleGoalServiceStub stub;

  /** Constructs an instance of CustomerLifecycleGoalServiceClient with default settings. */
  public static final CustomerLifecycleGoalServiceClient create() throws IOException {
    return create(CustomerLifecycleGoalServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerLifecycleGoalServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CustomerLifecycleGoalServiceClient create(
      CustomerLifecycleGoalServiceSettings settings) throws IOException {
    return new CustomerLifecycleGoalServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerLifecycleGoalServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(CustomerLifecycleGoalServiceSettings).
   */
  public static final CustomerLifecycleGoalServiceClient create(
      CustomerLifecycleGoalServiceStub stub) {
    return new CustomerLifecycleGoalServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerLifecycleGoalServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomerLifecycleGoalServiceClient(CustomerLifecycleGoalServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((CustomerLifecycleGoalServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected CustomerLifecycleGoalServiceClient(CustomerLifecycleGoalServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerLifecycleGoalServiceSettings getSettings() {
    return settings;
  }

  public CustomerLifecycleGoalServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Process the given customer lifecycle configurations.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CustomerLifecycleGoalConfigError]() [HeaderError]() [InternalError]() [QuotaError]()
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
   * try (CustomerLifecycleGoalServiceClient customerLifecycleGoalServiceClient =
   *     CustomerLifecycleGoalServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   CustomerLifecycleGoalOperation operation =
   *       CustomerLifecycleGoalOperation.newBuilder().build();
   *   ConfigureCustomerLifecycleGoalsResponse response =
   *       customerLifecycleGoalServiceClient.configureCustomerLifecycleGoals(customerId, operation);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer performing the upload.
   * @param operation Required. The operation to perform customer lifecycle goal update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConfigureCustomerLifecycleGoalsResponse configureCustomerLifecycleGoals(
      String customerId, CustomerLifecycleGoalOperation operation) {
    ConfigureCustomerLifecycleGoalsRequest request =
        ConfigureCustomerLifecycleGoalsRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return configureCustomerLifecycleGoals(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Process the given customer lifecycle configurations.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CustomerLifecycleGoalConfigError]() [HeaderError]() [InternalError]() [QuotaError]()
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
   * try (CustomerLifecycleGoalServiceClient customerLifecycleGoalServiceClient =
   *     CustomerLifecycleGoalServiceClient.create()) {
   *   ConfigureCustomerLifecycleGoalsRequest request =
   *       ConfigureCustomerLifecycleGoalsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerLifecycleGoalOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ConfigureCustomerLifecycleGoalsResponse response =
   *       customerLifecycleGoalServiceClient.configureCustomerLifecycleGoals(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConfigureCustomerLifecycleGoalsResponse configureCustomerLifecycleGoals(
      ConfigureCustomerLifecycleGoalsRequest request) {
    return configureCustomerLifecycleGoalsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Process the given customer lifecycle configurations.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CustomerLifecycleGoalConfigError]() [HeaderError]() [InternalError]() [QuotaError]()
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
   * try (CustomerLifecycleGoalServiceClient customerLifecycleGoalServiceClient =
   *     CustomerLifecycleGoalServiceClient.create()) {
   *   ConfigureCustomerLifecycleGoalsRequest request =
   *       ConfigureCustomerLifecycleGoalsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerLifecycleGoalOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<ConfigureCustomerLifecycleGoalsResponse> future =
   *       customerLifecycleGoalServiceClient
   *           .configureCustomerLifecycleGoalsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConfigureCustomerLifecycleGoalsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ConfigureCustomerLifecycleGoalsRequest, ConfigureCustomerLifecycleGoalsResponse>
      configureCustomerLifecycleGoalsCallable() {
    return stub.configureCustomerLifecycleGoalsCallable();
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
