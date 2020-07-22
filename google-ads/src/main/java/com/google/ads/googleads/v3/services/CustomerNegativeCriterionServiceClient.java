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
package com.google.ads.googleads.v3.services;

import com.google.ads.googleads.v3.resources.CustomerNegativeCriterion;
import com.google.ads.googleads.v3.services.stub.CustomerNegativeCriterionServiceStub;
import com.google.ads.googleads.v3.services.stub.CustomerNegativeCriterionServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage customer negative criteria.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient = CustomerNegativeCriterionServiceClient.create()) {
 *   CustomerNegativeCriterionName resourceName = CustomerNegativeCriterionName.of("[CUSTOMER]", "[CUSTOMER_NEGATIVE_CRITERION]");
 *   CustomerNegativeCriterion response = customerNegativeCriterionServiceClient.getCustomerNegativeCriterion(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the customerNegativeCriterionServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of
 * CustomerNegativeCriterionServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CustomerNegativeCriterionServiceSettings customerNegativeCriterionServiceSettings =
 *     CustomerNegativeCriterionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient =
 *     CustomerNegativeCriterionServiceClient.create(customerNegativeCriterionServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CustomerNegativeCriterionServiceSettings customerNegativeCriterionServiceSettings =
 *     CustomerNegativeCriterionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient =
 *     CustomerNegativeCriterionServiceClient.create(customerNegativeCriterionServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CustomerNegativeCriterionServiceClient implements BackgroundResource {
  private final CustomerNegativeCriterionServiceSettings settings;
  private final CustomerNegativeCriterionServiceStub stub;

  /** Constructs an instance of CustomerNegativeCriterionServiceClient with default settings. */
  public static final CustomerNegativeCriterionServiceClient create() throws IOException {
    return create(CustomerNegativeCriterionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerNegativeCriterionServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CustomerNegativeCriterionServiceClient create(
      CustomerNegativeCriterionServiceSettings settings) throws IOException {
    return new CustomerNegativeCriterionServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerNegativeCriterionServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer to use
   * CustomerNegativeCriterionServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerNegativeCriterionServiceClient create(
      CustomerNegativeCriterionServiceStub stub) {
    return new CustomerNegativeCriterionServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerNegativeCriterionServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected CustomerNegativeCriterionServiceClient(
      CustomerNegativeCriterionServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((CustomerNegativeCriterionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerNegativeCriterionServiceClient(CustomerNegativeCriterionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerNegativeCriterionServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerNegativeCriterionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient = CustomerNegativeCriterionServiceClient.create()) {
   *   CustomerNegativeCriterionName resourceName = CustomerNegativeCriterionName.of("[CUSTOMER]", "[CUSTOMER_NEGATIVE_CRITERION]");
   *   CustomerNegativeCriterion response = customerNegativeCriterionServiceClient.getCustomerNegativeCriterion(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the criterion to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerNegativeCriterion getCustomerNegativeCriterion(
      CustomerNegativeCriterionName resourceName) {
    GetCustomerNegativeCriterionRequest request =
        GetCustomerNegativeCriterionRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomerNegativeCriterion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient = CustomerNegativeCriterionServiceClient.create()) {
   *   CustomerNegativeCriterionName resourceName = CustomerNegativeCriterionName.of("[CUSTOMER]", "[CUSTOMER_NEGATIVE_CRITERION]");
   *   CustomerNegativeCriterion response = customerNegativeCriterionServiceClient.getCustomerNegativeCriterion(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the criterion to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerNegativeCriterion getCustomerNegativeCriterion(String resourceName) {
    GetCustomerNegativeCriterionRequest request =
        GetCustomerNegativeCriterionRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomerNegativeCriterion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient = CustomerNegativeCriterionServiceClient.create()) {
   *   CustomerNegativeCriterionName resourceName = CustomerNegativeCriterionName.of("[CUSTOMER]", "[CUSTOMER_NEGATIVE_CRITERION]");
   *   GetCustomerNegativeCriterionRequest request = GetCustomerNegativeCriterionRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   CustomerNegativeCriterion response = customerNegativeCriterionServiceClient.getCustomerNegativeCriterion(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerNegativeCriterion getCustomerNegativeCriterion(
      GetCustomerNegativeCriterionRequest request) {
    return getCustomerNegativeCriterionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient = CustomerNegativeCriterionServiceClient.create()) {
   *   CustomerNegativeCriterionName resourceName = CustomerNegativeCriterionName.of("[CUSTOMER]", "[CUSTOMER_NEGATIVE_CRITERION]");
   *   GetCustomerNegativeCriterionRequest request = GetCustomerNegativeCriterionRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;CustomerNegativeCriterion&gt; future = customerNegativeCriterionServiceClient.getCustomerNegativeCriterionCallable().futureCall(request);
   *   // Do something
   *   CustomerNegativeCriterion response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCustomerNegativeCriterionRequest, CustomerNegativeCriterion>
      getCustomerNegativeCriterionCallable() {
    return stub.getCustomerNegativeCriterionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient = CustomerNegativeCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerNegativeCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerNegativeCriteriaResponse response = customerNegativeCriterionServiceClient.mutateCustomerNegativeCriteria(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose criteria are being modified.
   * @param operations Required. The list of operations to perform on individual criteria.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerNegativeCriteriaResponse mutateCustomerNegativeCriteria(
      String customerId, List<CustomerNegativeCriterionOperation> operations) {
    MutateCustomerNegativeCriteriaRequest request =
        MutateCustomerNegativeCriteriaRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCustomerNegativeCriteria(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient = CustomerNegativeCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerNegativeCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerNegativeCriteriaRequest request = MutateCustomerNegativeCriteriaRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCustomerNegativeCriteriaResponse response = customerNegativeCriterionServiceClient.mutateCustomerNegativeCriteria(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerNegativeCriteriaResponse mutateCustomerNegativeCriteria(
      MutateCustomerNegativeCriteriaRequest request) {
    return mutateCustomerNegativeCriteriaCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient = CustomerNegativeCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerNegativeCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerNegativeCriteriaRequest request = MutateCustomerNegativeCriteriaRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCustomerNegativeCriteriaResponse&gt; future = customerNegativeCriterionServiceClient.mutateCustomerNegativeCriteriaCallable().futureCall(request);
   *   // Do something
   *   MutateCustomerNegativeCriteriaResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          MutateCustomerNegativeCriteriaRequest, MutateCustomerNegativeCriteriaResponse>
      mutateCustomerNegativeCriteriaCallable() {
    return stub.mutateCustomerNegativeCriteriaCallable();
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
