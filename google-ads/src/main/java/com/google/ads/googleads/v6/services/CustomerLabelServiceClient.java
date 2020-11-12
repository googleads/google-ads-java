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
package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.CustomerLabel;
import com.google.ads.googleads.v6.services.stub.CustomerLabelServiceStub;
import com.google.ads.googleads.v6.services.stub.CustomerLabelServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage labels on customers.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CustomerLabelServiceClient customerLabelServiceClient = CustomerLabelServiceClient.create()) {
 *   CustomerLabelName resourceName = CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");
 *   CustomerLabel response = customerLabelServiceClient.getCustomerLabel(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the customerLabelServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of CustomerLabelServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CustomerLabelServiceSettings customerLabelServiceSettings =
 *     CustomerLabelServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerLabelServiceClient customerLabelServiceClient =
 *     CustomerLabelServiceClient.create(customerLabelServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CustomerLabelServiceSettings customerLabelServiceSettings =
 *     CustomerLabelServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerLabelServiceClient customerLabelServiceClient =
 *     CustomerLabelServiceClient.create(customerLabelServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CustomerLabelServiceClient implements BackgroundResource {
  private final CustomerLabelServiceSettings settings;
  private final CustomerLabelServiceStub stub;

  /** Constructs an instance of CustomerLabelServiceClient with default settings. */
  public static final CustomerLabelServiceClient create() throws IOException {
    return create(CustomerLabelServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerLabelServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CustomerLabelServiceClient create(CustomerLabelServiceSettings settings)
      throws IOException {
    return new CustomerLabelServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerLabelServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use CustomerLabelServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerLabelServiceClient create(CustomerLabelServiceStub stub) {
    return new CustomerLabelServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerLabelServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomerLabelServiceClient(CustomerLabelServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CustomerLabelServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerLabelServiceClient(CustomerLabelServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerLabelServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerLabelServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested customer-label relationship in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerLabelServiceClient customerLabelServiceClient = CustomerLabelServiceClient.create()) {
   *   CustomerLabelName resourceName = CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");
   *   CustomerLabel response = customerLabelServiceClient.getCustomerLabel(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the customer-label relationship to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerLabel getCustomerLabel(CustomerLabelName resourceName) {
    GetCustomerLabelRequest request =
        GetCustomerLabelRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomerLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested customer-label relationship in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerLabelServiceClient customerLabelServiceClient = CustomerLabelServiceClient.create()) {
   *   CustomerLabelName resourceName = CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");
   *   CustomerLabel response = customerLabelServiceClient.getCustomerLabel(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the customer-label relationship to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerLabel getCustomerLabel(String resourceName) {
    GetCustomerLabelRequest request =
        GetCustomerLabelRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomerLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested customer-label relationship in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerLabelServiceClient customerLabelServiceClient = CustomerLabelServiceClient.create()) {
   *   CustomerLabelName resourceName = CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");
   *   GetCustomerLabelRequest request = GetCustomerLabelRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   CustomerLabel response = customerLabelServiceClient.getCustomerLabel(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerLabel getCustomerLabel(GetCustomerLabelRequest request) {
    return getCustomerLabelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested customer-label relationship in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerLabelServiceClient customerLabelServiceClient = CustomerLabelServiceClient.create()) {
   *   CustomerLabelName resourceName = CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");
   *   GetCustomerLabelRequest request = GetCustomerLabelRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;CustomerLabel&gt; future = customerLabelServiceClient.getCustomerLabelCallable().futureCall(request);
   *   // Do something
   *   CustomerLabel response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCustomerLabelRequest, CustomerLabel> getCustomerLabelCallable() {
    return stub.getCustomerLabelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes customer-label relationships. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerLabelServiceClient customerLabelServiceClient = CustomerLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerLabelsResponse response = customerLabelServiceClient.mutateCustomerLabels(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. ID of the customer whose customer-label relationships are being
   *     modified.
   * @param operations Required. The list of operations to perform on customer-label relationships.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerLabelsResponse mutateCustomerLabels(
      String customerId, List<CustomerLabelOperation> operations) {
    MutateCustomerLabelsRequest request =
        MutateCustomerLabelsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCustomerLabels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes customer-label relationships. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerLabelServiceClient customerLabelServiceClient = CustomerLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerLabelsRequest request = MutateCustomerLabelsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCustomerLabelsResponse response = customerLabelServiceClient.mutateCustomerLabels(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerLabelsResponse mutateCustomerLabels(
      MutateCustomerLabelsRequest request) {
    return mutateCustomerLabelsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes customer-label relationships. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerLabelServiceClient customerLabelServiceClient = CustomerLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerLabelsRequest request = MutateCustomerLabelsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCustomerLabelsResponse&gt; future = customerLabelServiceClient.mutateCustomerLabelsCallable().futureCall(request);
   *   // Do something
   *   MutateCustomerLabelsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCustomerLabelsRequest, MutateCustomerLabelsResponse>
      mutateCustomerLabelsCallable() {
    return stub.mutateCustomerLabelsCallable();
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
