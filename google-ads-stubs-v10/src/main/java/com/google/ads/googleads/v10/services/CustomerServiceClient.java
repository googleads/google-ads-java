/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v10.services;

import com.google.ads.googleads.v10.resources.Customer;
import com.google.ads.googleads.v10.services.stub.CustomerServiceStub;
import com.google.ads.googleads.v10.services.stub.CustomerServiceStubSettings;
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
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   CustomerOperation operation = CustomerOperation.newBuilder().build();
 *   MutateCustomerResponse response = customerServiceClient.mutateCustomer(customerId, operation);
 * }
 * }</pre>
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
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
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
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CustomerServiceSettings customerServiceSettings =
 *     CustomerServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerServiceClient customerServiceClient =
 *     CustomerServiceClient.create(customerServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
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

  protected CustomerServiceClient(CustomerServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerServiceSettings getSettings() {
    return settings;
  }

  public CustomerServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a customer. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldMaskError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   * [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   CustomerOperation operation = CustomerOperation.newBuilder().build();
   *   MutateCustomerResponse response = customerServiceClient.mutateCustomer(customerId, operation);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer being modified.
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
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldMaskError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   * [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
   *   MutateCustomerRequest request =
   *       MutateCustomerRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCustomerResponse response = customerServiceClient.mutateCustomer(request);
   * }
   * }</pre>
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
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldMaskError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   * [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
   *   MutateCustomerRequest request =
   *       MutateCustomerRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCustomerResponse> future =
   *       customerServiceClient.mutateCustomerCallable().futureCall(request);
   *   // Do something.
   *   MutateCustomerResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateCustomerRequest, MutateCustomerResponse>
      mutateCustomerCallable() {
    return stub.mutateCustomerCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns resource names of customers directly accessible by the user authenticating the call.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
   *   ListAccessibleCustomersRequest request = ListAccessibleCustomersRequest.newBuilder().build();
   *   ListAccessibleCustomersResponse response =
   *       customerServiceClient.listAccessibleCustomers(request);
   * }
   * }</pre>
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
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
   *   ListAccessibleCustomersRequest request = ListAccessibleCustomersRequest.newBuilder().build();
   *   ApiFuture<ListAccessibleCustomersResponse> future =
   *       customerServiceClient.listAccessibleCustomersCallable().futureCall(request);
   *   // Do something.
   *   ListAccessibleCustomersResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>
      listAccessibleCustomersCallable() {
    return stub.listAccessibleCustomersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new client under manager. The new client customer is returned.
   *
   * <p>List of thrown errors: [AccessInvitationError]() [AuthenticationError]()
   * [AuthorizationError]() [CurrencyCodeError]() [HeaderError]() [InternalError]()
   * [ManagerLinkError]() [QuotaError]() [RequestError]() [StringLengthError]() [TimeZoneError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   Customer customerClient = Customer.newBuilder().build();
   *   CreateCustomerClientResponse response =
   *       customerServiceClient.createCustomerClient(customerId, customerClient);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the Manager under whom client customer is being created.
   * @param customerClient Required. The new client customer to create. The resource name on this
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
   * <p>List of thrown errors: [AccessInvitationError]() [AuthenticationError]()
   * [AuthorizationError]() [CurrencyCodeError]() [HeaderError]() [InternalError]()
   * [ManagerLinkError]() [QuotaError]() [RequestError]() [StringLengthError]() [TimeZoneError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
   *   CreateCustomerClientRequest request =
   *       CreateCustomerClientRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCustomerClient(Customer.newBuilder().build())
   *           .setEmailAddress("emailAddress-1070931784")
   *           .setValidateOnly(true)
   *           .build();
   *   CreateCustomerClientResponse response = customerServiceClient.createCustomerClient(request);
   * }
   * }</pre>
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
   * <p>List of thrown errors: [AccessInvitationError]() [AuthenticationError]()
   * [AuthorizationError]() [CurrencyCodeError]() [HeaderError]() [InternalError]()
   * [ManagerLinkError]() [QuotaError]() [RequestError]() [StringLengthError]() [TimeZoneError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
   *   CreateCustomerClientRequest request =
   *       CreateCustomerClientRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCustomerClient(Customer.newBuilder().build())
   *           .setEmailAddress("emailAddress-1070931784")
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<CreateCustomerClientResponse> future =
   *       customerServiceClient.createCustomerClientCallable().futureCall(request);
   *   // Do something.
   *   CreateCustomerClientResponse response = future.get();
   * }
   * }</pre>
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
