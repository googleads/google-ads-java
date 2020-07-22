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
package com.google.ads.googleads.v2.services;

import com.google.ads.googleads.v2.resources.CustomerManagerLink;
import com.google.ads.googleads.v2.services.stub.CustomerManagerLinkServiceStub;
import com.google.ads.googleads.v2.services.stub.CustomerManagerLinkServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage customer-manager links.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
 *   CustomerManagerLinkName resourceName = CustomerManagerLinkName.of("[CUSTOMER]", "[CUSTOMER_MANAGER_LINK]");
 *   CustomerManagerLink response = customerManagerLinkServiceClient.getCustomerManagerLink(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the customerManagerLinkServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of
 * CustomerManagerLinkServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CustomerManagerLinkServiceSettings customerManagerLinkServiceSettings =
 *     CustomerManagerLinkServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
 *     CustomerManagerLinkServiceClient.create(customerManagerLinkServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CustomerManagerLinkServiceSettings customerManagerLinkServiceSettings =
 *     CustomerManagerLinkServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
 *     CustomerManagerLinkServiceClient.create(customerManagerLinkServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CustomerManagerLinkServiceClient implements BackgroundResource {
  private final CustomerManagerLinkServiceSettings settings;
  private final CustomerManagerLinkServiceStub stub;

  /** Constructs an instance of CustomerManagerLinkServiceClient with default settings. */
  public static final CustomerManagerLinkServiceClient create() throws IOException {
    return create(CustomerManagerLinkServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerManagerLinkServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CustomerManagerLinkServiceClient create(
      CustomerManagerLinkServiceSettings settings) throws IOException {
    return new CustomerManagerLinkServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerManagerLinkServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use CustomerManagerLinkServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerManagerLinkServiceClient create(CustomerManagerLinkServiceStub stub) {
    return new CustomerManagerLinkServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerManagerLinkServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomerManagerLinkServiceClient(CustomerManagerLinkServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((CustomerManagerLinkServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerManagerLinkServiceClient(CustomerManagerLinkServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerManagerLinkServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerManagerLinkServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested CustomerManagerLink in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
   *   CustomerManagerLinkName resourceName = CustomerManagerLinkName.of("[CUSTOMER]", "[CUSTOMER_MANAGER_LINK]");
   *   CustomerManagerLink response = customerManagerLinkServiceClient.getCustomerManagerLink(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the CustomerManagerLink to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerManagerLink getCustomerManagerLink(CustomerManagerLinkName resourceName) {
    GetCustomerManagerLinkRequest request =
        GetCustomerManagerLinkRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomerManagerLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested CustomerManagerLink in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
   *   CustomerManagerLinkName resourceName = CustomerManagerLinkName.of("[CUSTOMER]", "[CUSTOMER_MANAGER_LINK]");
   *   CustomerManagerLink response = customerManagerLinkServiceClient.getCustomerManagerLink(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the CustomerManagerLink to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerManagerLink getCustomerManagerLink(String resourceName) {
    GetCustomerManagerLinkRequest request =
        GetCustomerManagerLinkRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomerManagerLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested CustomerManagerLink in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
   *   CustomerManagerLinkName resourceName = CustomerManagerLinkName.of("[CUSTOMER]", "[CUSTOMER_MANAGER_LINK]");
   *   GetCustomerManagerLinkRequest request = GetCustomerManagerLinkRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   CustomerManagerLink response = customerManagerLinkServiceClient.getCustomerManagerLink(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerManagerLink getCustomerManagerLink(GetCustomerManagerLinkRequest request) {
    return getCustomerManagerLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested CustomerManagerLink in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
   *   CustomerManagerLinkName resourceName = CustomerManagerLinkName.of("[CUSTOMER]", "[CUSTOMER_MANAGER_LINK]");
   *   GetCustomerManagerLinkRequest request = GetCustomerManagerLinkRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;CustomerManagerLink&gt; future = customerManagerLinkServiceClient.getCustomerManagerLinkCallable().futureCall(request);
   *   // Do something
   *   CustomerManagerLink response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCustomerManagerLinkRequest, CustomerManagerLink>
      getCustomerManagerLinkCallable() {
    return stub.getCustomerManagerLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates customer manager links. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerManagerLinkOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerManagerLinkResponse response = customerManagerLinkServiceClient.mutateCustomerManagerLink(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose customer manager links are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual customer manager
   *     links.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerManagerLinkResponse mutateCustomerManagerLink(
      String customerId, List<CustomerManagerLinkOperation> operations) {
    MutateCustomerManagerLinkRequest request =
        MutateCustomerManagerLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCustomerManagerLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates customer manager links. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerManagerLinkOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerManagerLinkRequest request = MutateCustomerManagerLinkRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCustomerManagerLinkResponse response = customerManagerLinkServiceClient.mutateCustomerManagerLink(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerManagerLinkResponse mutateCustomerManagerLink(
      MutateCustomerManagerLinkRequest request) {
    return mutateCustomerManagerLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates customer manager links. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerManagerLinkOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerManagerLinkRequest request = MutateCustomerManagerLinkRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCustomerManagerLinkResponse&gt; future = customerManagerLinkServiceClient.mutateCustomerManagerLinkCallable().futureCall(request);
   *   // Do something
   *   MutateCustomerManagerLinkResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCustomerManagerLinkRequest, MutateCustomerManagerLinkResponse>
      mutateCustomerManagerLinkCallable() {
    return stub.mutateCustomerManagerLinkCallable();
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
