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

import com.google.ads.googleads.v1.resources.CustomerClientLink;
import com.google.ads.googleads.v1.services.stub.CustomerClientLinkServiceStub;
import com.google.ads.googleads.v1.services.stub.CustomerClientLinkServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage customer client links.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CustomerClientLinkServiceClient customerClientLinkServiceClient = CustomerClientLinkServiceClient.create()) {
 *   String formattedResourceName = CustomerClientLinkServiceClient.formatCustomerClientLinkName("[CUSTOMER]", "[CUSTOMER_CLIENT_LINK]");
 *   CustomerClientLink response = customerClientLinkServiceClient.getCustomerClientLink(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the customerClientLinkServiceClient object to clean up
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
 * CustomerClientLinkServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CustomerClientLinkServiceSettings customerClientLinkServiceSettings =
 *     CustomerClientLinkServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerClientLinkServiceClient customerClientLinkServiceClient =
 *     CustomerClientLinkServiceClient.create(customerClientLinkServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CustomerClientLinkServiceSettings customerClientLinkServiceSettings =
 *     CustomerClientLinkServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerClientLinkServiceClient customerClientLinkServiceClient =
 *     CustomerClientLinkServiceClient.create(customerClientLinkServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CustomerClientLinkServiceClient implements BackgroundResource {
  private final CustomerClientLinkServiceSettings settings;
  private final CustomerClientLinkServiceStub stub;

  private static final PathTemplate CUSTOMER_CLIENT_LINK_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/customerClientLinks/{customer_client_link}");

  /**
   * Formats a string containing the fully-qualified path to represent a customer_client_link
   * resource.
   */
  public static final String formatCustomerClientLinkName(
      String customer, String customerClientLink) {
    return CUSTOMER_CLIENT_LINK_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "customer_client_link", customerClientLink);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a customer_client_link
   * resource.
   */
  public static final String parseCustomerFromCustomerClientLinkName(
      String customerClientLinkName) {
    return CUSTOMER_CLIENT_LINK_PATH_TEMPLATE.parse(customerClientLinkName).get("customer");
  }

  /**
   * Parses the customer_client_link from the given fully-qualified path which represents a
   * customer_client_link resource.
   */
  public static final String parseCustomerClientLinkFromCustomerClientLinkName(
      String customerClientLinkName) {
    return CUSTOMER_CLIENT_LINK_PATH_TEMPLATE
        .parse(customerClientLinkName)
        .get("customer_client_link");
  }

  /** Constructs an instance of CustomerClientLinkServiceClient with default settings. */
  public static final CustomerClientLinkServiceClient create() throws IOException {
    return create(CustomerClientLinkServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerClientLinkServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CustomerClientLinkServiceClient create(
      CustomerClientLinkServiceSettings settings) throws IOException {
    return new CustomerClientLinkServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerClientLinkServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use CustomerClientLinkServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerClientLinkServiceClient create(CustomerClientLinkServiceStub stub) {
    return new CustomerClientLinkServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerClientLinkServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomerClientLinkServiceClient(CustomerClientLinkServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((CustomerClientLinkServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerClientLinkServiceClient(CustomerClientLinkServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerClientLinkServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerClientLinkServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested CustomerClientLink in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerClientLinkServiceClient customerClientLinkServiceClient = CustomerClientLinkServiceClient.create()) {
   *   String formattedResourceName = CustomerClientLinkServiceClient.formatCustomerClientLinkName("[CUSTOMER]", "[CUSTOMER_CLIENT_LINK]");
   *   CustomerClientLink response = customerClientLinkServiceClient.getCustomerClientLink(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the customer client link to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerClientLink getCustomerClientLink(String resourceName) {
    CUSTOMER_CLIENT_LINK_PATH_TEMPLATE.validate(resourceName, "getCustomerClientLink");
    GetCustomerClientLinkRequest request =
        GetCustomerClientLinkRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomerClientLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested CustomerClientLink in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerClientLinkServiceClient customerClientLinkServiceClient = CustomerClientLinkServiceClient.create()) {
   *   String formattedResourceName = CustomerClientLinkServiceClient.formatCustomerClientLinkName("[CUSTOMER]", "[CUSTOMER_CLIENT_LINK]");
   *   GetCustomerClientLinkRequest request = GetCustomerClientLinkRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CustomerClientLink response = customerClientLinkServiceClient.getCustomerClientLink(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerClientLink getCustomerClientLink(GetCustomerClientLinkRequest request) {
    return getCustomerClientLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested CustomerClientLink in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerClientLinkServiceClient customerClientLinkServiceClient = CustomerClientLinkServiceClient.create()) {
   *   String formattedResourceName = CustomerClientLinkServiceClient.formatCustomerClientLinkName("[CUSTOMER]", "[CUSTOMER_CLIENT_LINK]");
   *   GetCustomerClientLinkRequest request = GetCustomerClientLinkRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CustomerClientLink&gt; future = customerClientLinkServiceClient.getCustomerClientLinkCallable().futureCall(request);
   *   // Do something
   *   CustomerClientLink response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCustomerClientLinkRequest, CustomerClientLink>
      getCustomerClientLinkCallable() {
    return stub.getCustomerClientLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates a customer client link. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerClientLinkServiceClient customerClientLinkServiceClient = CustomerClientLinkServiceClient.create()) {
   *   String customerId = "";
   *   CustomerClientLinkOperation operation = CustomerClientLinkOperation.newBuilder().build();
   *   MutateCustomerClientLinkResponse response = customerClientLinkServiceClient.mutateCustomerClientLink(customerId, operation);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose customer link are being modified.
   * @param operation The operation to perform on the individual CustomerClientLink.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerClientLinkResponse mutateCustomerClientLink(
      String customerId, CustomerClientLinkOperation operation) {

    MutateCustomerClientLinkRequest request =
        MutateCustomerClientLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateCustomerClientLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates a customer client link. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerClientLinkServiceClient customerClientLinkServiceClient = CustomerClientLinkServiceClient.create()) {
   *   String customerId = "";
   *   CustomerClientLinkOperation operation = CustomerClientLinkOperation.newBuilder().build();
   *   MutateCustomerClientLinkRequest request = MutateCustomerClientLinkRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setOperation(operation)
   *     .build();
   *   MutateCustomerClientLinkResponse response = customerClientLinkServiceClient.mutateCustomerClientLink(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerClientLinkResponse mutateCustomerClientLink(
      MutateCustomerClientLinkRequest request) {
    return mutateCustomerClientLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates a customer client link. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomerClientLinkServiceClient customerClientLinkServiceClient = CustomerClientLinkServiceClient.create()) {
   *   String customerId = "";
   *   CustomerClientLinkOperation operation = CustomerClientLinkOperation.newBuilder().build();
   *   MutateCustomerClientLinkRequest request = MutateCustomerClientLinkRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setOperation(operation)
   *     .build();
   *   ApiFuture&lt;MutateCustomerClientLinkResponse&gt; future = customerClientLinkServiceClient.mutateCustomerClientLinkCallable().futureCall(request);
   *   // Do something
   *   MutateCustomerClientLinkResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCustomerClientLinkRequest, MutateCustomerClientLinkResponse>
      mutateCustomerClientLinkCallable() {
    return stub.mutateCustomerClientLinkCallable();
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
