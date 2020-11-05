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

import com.google.ads.googleads.v3.resources.CustomerFeed;
import com.google.ads.googleads.v3.services.stub.CustomerFeedServiceStub;
import com.google.ads.googleads.v3.services.stub.CustomerFeedServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage customer feeds.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
 *   CustomerFeedName resourceName = CustomerFeedName.of("[CUSTOMER]", "[CUSTOMER_FEED]");
 *   CustomerFeed response = customerFeedServiceClient.getCustomerFeed(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the customerFeedServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of CustomerFeedServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CustomerFeedServiceSettings customerFeedServiceSettings =
 *     CustomerFeedServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerFeedServiceClient customerFeedServiceClient =
 *     CustomerFeedServiceClient.create(customerFeedServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CustomerFeedServiceSettings customerFeedServiceSettings =
 *     CustomerFeedServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerFeedServiceClient customerFeedServiceClient =
 *     CustomerFeedServiceClient.create(customerFeedServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CustomerFeedServiceClient implements BackgroundResource {
  private final CustomerFeedServiceSettings settings;
  private final CustomerFeedServiceStub stub;

  /** Constructs an instance of CustomerFeedServiceClient with default settings. */
  public static final CustomerFeedServiceClient create() throws IOException {
    return create(CustomerFeedServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerFeedServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CustomerFeedServiceClient create(CustomerFeedServiceSettings settings)
      throws IOException {
    return new CustomerFeedServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerFeedServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use CustomerFeedServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerFeedServiceClient create(CustomerFeedServiceStub stub) {
    return new CustomerFeedServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerFeedServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomerFeedServiceClient(CustomerFeedServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CustomerFeedServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerFeedServiceClient(CustomerFeedServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerFeedServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerFeedServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested customer feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
   *   CustomerFeedName resourceName = CustomerFeedName.of("[CUSTOMER]", "[CUSTOMER_FEED]");
   *   CustomerFeed response = customerFeedServiceClient.getCustomerFeed(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the customer feed to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerFeed getCustomerFeed(CustomerFeedName resourceName) {
    GetCustomerFeedRequest request =
        GetCustomerFeedRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomerFeed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested customer feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
   *   CustomerFeedName resourceName = CustomerFeedName.of("[CUSTOMER]", "[CUSTOMER_FEED]");
   *   CustomerFeed response = customerFeedServiceClient.getCustomerFeed(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the customer feed to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerFeed getCustomerFeed(String resourceName) {
    GetCustomerFeedRequest request =
        GetCustomerFeedRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomerFeed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested customer feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
   *   CustomerFeedName resourceName = CustomerFeedName.of("[CUSTOMER]", "[CUSTOMER_FEED]");
   *   GetCustomerFeedRequest request = GetCustomerFeedRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   CustomerFeed response = customerFeedServiceClient.getCustomerFeed(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerFeed getCustomerFeed(GetCustomerFeedRequest request) {
    return getCustomerFeedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested customer feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
   *   CustomerFeedName resourceName = CustomerFeedName.of("[CUSTOMER]", "[CUSTOMER_FEED]");
   *   GetCustomerFeedRequest request = GetCustomerFeedRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;CustomerFeed&gt; future = customerFeedServiceClient.getCustomerFeedCallable().futureCall(request);
   *   // Do something
   *   CustomerFeed response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCustomerFeedRequest, CustomerFeed> getCustomerFeedCallable() {
    return stub.getCustomerFeedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes customer feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerFeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerFeedsResponse response = customerFeedServiceClient.mutateCustomerFeeds(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose customer feeds are being modified.
   * @param operations Required. The list of operations to perform on individual customer feeds.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerFeedsResponse mutateCustomerFeeds(
      String customerId, List<CustomerFeedOperation> operations) {
    MutateCustomerFeedsRequest request =
        MutateCustomerFeedsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCustomerFeeds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes customer feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerFeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerFeedsRequest request = MutateCustomerFeedsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCustomerFeedsResponse response = customerFeedServiceClient.mutateCustomerFeeds(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerFeedsResponse mutateCustomerFeeds(MutateCustomerFeedsRequest request) {
    return mutateCustomerFeedsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes customer feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomerFeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomerFeedsRequest request = MutateCustomerFeedsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCustomerFeedsResponse&gt; future = customerFeedServiceClient.mutateCustomerFeedsCallable().futureCall(request);
   *   // Do something
   *   MutateCustomerFeedsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCustomerFeedsRequest, MutateCustomerFeedsResponse>
      mutateCustomerFeedsCallable() {
    return stub.mutateCustomerFeedsCallable();
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
