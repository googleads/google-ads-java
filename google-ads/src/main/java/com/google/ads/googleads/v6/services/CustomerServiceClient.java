/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.Customer;
import com.google.ads.googleads.v6.resources.CustomerName;
import com.google.ads.googleads.v6.services.stub.CustomerServiceStub;
import com.google.ads.googleads.v6.services.stub.CustomerServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage customers.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the CustomerServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of CustomerServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CustomerServiceSettings customerServiceSettings =
 *     CustomerServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerServiceClient customerServiceClient =
 *     CustomerServiceClient.create(customerServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CustomerServiceSettings customerServiceSettings =
 *     CustomerServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerServiceClient customerServiceClient =
 *     CustomerServiceClient.create(customerServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class CustomerServiceClient implements BackgroundResource {
  private final CustomerServiceSettings settings;
  private final CustomerServiceStub stub;

  /** Constructs an instance of CustomerServiceClient with default settings. */
  public static final CustomerServiceClient create() throws IOException {
    return create(CustomerServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CustomerServiceClient create(CustomerServiceSettings settings)
      throws IOException {
    return new CustomerServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(CustomerServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerServiceClient create(CustomerServiceStub stub) {
    return new CustomerServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected CustomerServiceClient(CustomerServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CustomerServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerServiceClient(CustomerServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer in full detail.
   *
   * @param resource_name Required. The resource name of the customer to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Customer getCustomer(CustomerName resourceName) {
    GetCustomerRequest request =
        GetCustomerRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomer(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer in full detail.
   *
   * @param resource_name Required. The resource name of the customer to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Customer getCustomer(String resourceName) {
    GetCustomerRequest request =
        GetCustomerRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomer(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Customer getCustomer(GetCustomerRequest request) {
    return getCustomerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetCustomerRequest, Customer> getCustomerCallable() {
    return stub.getCustomerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a customer. Operation statuses are returned.
   *
   * @param customer_id Required. The ID of the customer being modified.
   * @param operation Required. The operation to perform on the customer
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerResponse mutateCustomer(
      String customerId, CustomerOperation operation) {
    MutateCustomerRequest request =
        MutateCustomerRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateCustomer(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a customer. Operation statuses are returned.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerResponse mutateCustomer(MutateCustomerRequest request) {
    return mutateCustomerCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a customer. Operation statuses are returned.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<MutateCustomerRequest, MutateCustomerResponse>
      mutateCustomerCallable() {
    return stub.mutateCustomerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns resource names of customers directly accessible by the user authenticating the call.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAccessibleCustomersResponse listAccessibleCustomers(
      ListAccessibleCustomersRequest request) {
    return listAccessibleCustomersCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns resource names of customers directly accessible by the user authenticating the call.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>
      listAccessibleCustomersCallable() {
    return stub.listAccessibleCustomersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new client under manager. The new client customer is returned.
   *
   * @param customer_id Required. The ID of the Manager under whom client customer is being created.
   * @param customer_client Required. The new client customer to create. The resource name on this
   *     customer will be ignored.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateCustomerClientResponse createCustomerClient(
      String customerId, Customer customerClient) {
    CreateCustomerClientRequest request =
        CreateCustomerClientRequest.newBuilder()
            .setCustomerId(customerId)
            .setCustomerClient(customerClient)
            .build();
    return createCustomerClient(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new client under manager. The new client customer is returned.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateCustomerClientResponse createCustomerClient(
      CreateCustomerClientRequest request) {
    return createCustomerClientCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new client under manager. The new client customer is returned.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateCustomerClientRequest, CreateCustomerClientResponse>
      createCustomerClientCallable() {
    return stub.createCustomerClientCallable();
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
