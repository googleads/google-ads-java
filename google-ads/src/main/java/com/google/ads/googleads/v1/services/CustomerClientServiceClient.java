/*
 * Copyright 2019 Google LLC
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
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.CustomerClient;
import com.google.ads.googleads.v1.services.stub.CustomerClientServiceStub;
import com.google.ads.googleads.v1.services.stub.CustomerClientServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to get clients in a customer's hierarchy.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CustomerClientServiceClient customerClientServiceClient = CustomerClientServiceClient.create()) {
 *   String formattedResourceName = CustomerClientServiceClient.formatCustomerClientName("[CUSTOMER]", "[CUSTOMER_CLIENT]");
 *   CustomerClient response = customerClientServiceClient.getCustomerClient(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the customerClientServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of CustomerClientServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CustomerClientServiceSettings customerClientServiceSettings =
 *     CustomerClientServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerClientServiceClient customerClientServiceClient =
 *     CustomerClientServiceClient.create(customerClientServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CustomerClientServiceSettings customerClientServiceSettings =
 *     CustomerClientServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerClientServiceClient customerClientServiceClient =
 *     CustomerClientServiceClient.create(customerClientServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CustomerClientServiceClient implements BackgroundResource {
  private final CustomerClientServiceSettings settings;
  private final CustomerClientServiceStub stub;

  private static final PathTemplate CUSTOMER_CLIENT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/customerClients/{customer_client}");

  /**
   * Formats a string containing the fully-qualified path to represent a customer_client resource.
   *
   * @deprecated Use the {@link CustomerClientName} class instead.
   */
  @Deprecated
  public static final String formatCustomerClientName(String customer, String customerClient) {
    return CUSTOMER_CLIENT_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "customer_client", customerClient);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a customer_client
   * resource.
   *
   * @deprecated Use the {@link CustomerClientName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromCustomerClientName(String customerClientName) {
    return CUSTOMER_CLIENT_PATH_TEMPLATE.parse(customerClientName).get("customer");
  }

  /**
   * Parses the customer_client from the given fully-qualified path which represents a
   * customer_client resource.
   *
   * @deprecated Use the {@link CustomerClientName} class instead.
   */
  @Deprecated
  public static final String parseCustomerClientFromCustomerClientName(String customerClientName) {
    return CUSTOMER_CLIENT_PATH_TEMPLATE.parse(customerClientName).get("customer_client");
  }

  /** Constructs an instance of CustomerClientServiceClient with default settings. */
  public static final CustomerClientServiceClient create() throws IOException {
    return create(CustomerClientServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerClientServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CustomerClientServiceClient create(CustomerClientServiceSettings settings)
      throws IOException {
    return new CustomerClientServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerClientServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use CustomerClientServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerClientServiceClient create(CustomerClientServiceStub stub) {
    return new CustomerClientServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerClientServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomerClientServiceClient(CustomerClientServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CustomerClientServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerClientServiceClient(CustomerClientServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerClientServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerClientServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested client in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerClientServiceClient customerClientServiceClient = CustomerClientServiceClient.create()) {
   *   String formattedResourceName = CustomerClientServiceClient.formatCustomerClientName("[CUSTOMER]", "[CUSTOMER_CLIENT]");
   *   CustomerClient response = customerClientServiceClient.getCustomerClient(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the client to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerClient getCustomerClient(String resourceName) {
    CUSTOMER_CLIENT_PATH_TEMPLATE.validate(resourceName, "getCustomerClient");
    GetCustomerClientRequest request =
        GetCustomerClientRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomerClient(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested client in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerClientServiceClient customerClientServiceClient = CustomerClientServiceClient.create()) {
   *   String formattedResourceName = CustomerClientServiceClient.formatCustomerClientName("[CUSTOMER]", "[CUSTOMER_CLIENT]");
   *   GetCustomerClientRequest request = GetCustomerClientRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CustomerClient response = customerClientServiceClient.getCustomerClient(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerClient getCustomerClient(GetCustomerClientRequest request) {
    return getCustomerClientCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested client in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerClientServiceClient customerClientServiceClient = CustomerClientServiceClient.create()) {
   *   String formattedResourceName = CustomerClientServiceClient.formatCustomerClientName("[CUSTOMER]", "[CUSTOMER_CLIENT]");
   *   GetCustomerClientRequest request = GetCustomerClientRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CustomerClient&gt; future = customerClientServiceClient.getCustomerClientCallable().futureCall(request);
   *   // Do something
   *   CustomerClient response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCustomerClientRequest, CustomerClient> getCustomerClientCallable() {
    return stub.getCustomerClientCallable();
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
