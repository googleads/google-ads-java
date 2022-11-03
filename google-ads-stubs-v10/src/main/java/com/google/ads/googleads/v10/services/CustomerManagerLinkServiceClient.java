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

import com.google.ads.googleads.v10.services.stub.CustomerManagerLinkServiceStub;
import com.google.ads.googleads.v10.services.stub.CustomerManagerLinkServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage customer-manager links.
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
 * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
 *     CustomerManagerLinkServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomerManagerLinkOperation> operations = new ArrayList<>();
 *   MutateCustomerManagerLinkResponse response =
 *       customerManagerLinkServiceClient.mutateCustomerManagerLink(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CustomerManagerLinkServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of
 * CustomerManagerLinkServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CustomerManagerLinkServiceSettings customerManagerLinkServiceSettings =
 *     CustomerManagerLinkServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
 *     CustomerManagerLinkServiceClient.create(customerManagerLinkServiceSettings);
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
 * CustomerManagerLinkServiceSettings customerManagerLinkServiceSettings =
 *     CustomerManagerLinkServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
 *     CustomerManagerLinkServiceClient.create(customerManagerLinkServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
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
   * calls. This is for advanced usage - prefer using create(CustomerManagerLinkServiceSettings).
   */
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

  protected CustomerManagerLinkServiceClient(CustomerManagerLinkServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerManagerLinkServiceSettings getSettings() {
    return settings;
  }

  public CustomerManagerLinkServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates customer manager links. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [InternalError]() [ManagerLinkError]()
   * [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
   *     CustomerManagerLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CustomerManagerLinkOperation> operations = new ArrayList<>();
   *   MutateCustomerManagerLinkResponse response =
   *       customerManagerLinkServiceClient.mutateCustomerManagerLink(customerId, operations);
   * }
   * }</pre>
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates customer manager links. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [InternalError]() [ManagerLinkError]()
   * [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
   *     CustomerManagerLinkServiceClient.create()) {
   *   MutateCustomerManagerLinkRequest request =
   *       MutateCustomerManagerLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CustomerManagerLinkOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCustomerManagerLinkResponse response =
   *       customerManagerLinkServiceClient.mutateCustomerManagerLink(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerManagerLinkResponse mutateCustomerManagerLink(
      MutateCustomerManagerLinkRequest request) {
    return mutateCustomerManagerLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates customer manager links. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [InternalError]() [ManagerLinkError]()
   * [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
   *     CustomerManagerLinkServiceClient.create()) {
   *   MutateCustomerManagerLinkRequest request =
   *       MutateCustomerManagerLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CustomerManagerLinkOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCustomerManagerLinkResponse> future =
   *       customerManagerLinkServiceClient.mutateCustomerManagerLinkCallable().futureCall(request);
   *   // Do something.
   *   MutateCustomerManagerLinkResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateCustomerManagerLinkRequest, MutateCustomerManagerLinkResponse>
      mutateCustomerManagerLinkCallable() {
    return stub.mutateCustomerManagerLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Moves a client customer to a new manager customer. This simplifies the complex request that
   * requires two operations to move a client customer to a new manager, for example: 1. Update
   * operation with Status INACTIVE (previous manager) and, 2. Update operation with Status ACTIVE
   * (new manager).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
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
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
   *     CustomerManagerLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   String previousCustomerManagerLink = "previousCustomerManagerLink-222598638";
   *   String newManager = "newManager1429989869";
   *   MoveManagerLinkResponse response =
   *       customerManagerLinkServiceClient.moveManagerLink(
   *           customerId, previousCustomerManagerLink, newManager);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the client customer that is being moved.
   * @param previousCustomerManagerLink Required. The resource name of the previous
   *     CustomerManagerLink. The resource name has the form:
   *     `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * @param newManager Required. The resource name of the new manager customer that the client wants
   *     to move to. Customer resource names have the format: "customers/{customer_id}"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MoveManagerLinkResponse moveManagerLink(
      String customerId, String previousCustomerManagerLink, String newManager) {
    MoveManagerLinkRequest request =
        MoveManagerLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setPreviousCustomerManagerLink(previousCustomerManagerLink)
            .setNewManager(newManager)
            .build();
    return moveManagerLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Moves a client customer to a new manager customer. This simplifies the complex request that
   * requires two operations to move a client customer to a new manager, for example: 1. Update
   * operation with Status INACTIVE (previous manager) and, 2. Update operation with Status ACTIVE
   * (new manager).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
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
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
   *     CustomerManagerLinkServiceClient.create()) {
   *   MoveManagerLinkRequest request =
   *       MoveManagerLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setPreviousCustomerManagerLink("previousCustomerManagerLink-222598638")
   *           .setNewManager("newManager1429989869")
   *           .setValidateOnly(true)
   *           .build();
   *   MoveManagerLinkResponse response = customerManagerLinkServiceClient.moveManagerLink(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MoveManagerLinkResponse moveManagerLink(MoveManagerLinkRequest request) {
    return moveManagerLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Moves a client customer to a new manager customer. This simplifies the complex request that
   * requires two operations to move a client customer to a new manager, for example: 1. Update
   * operation with Status INACTIVE (previous manager) and, 2. Update operation with Status ACTIVE
   * (new manager).
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
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
   * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
   *     CustomerManagerLinkServiceClient.create()) {
   *   MoveManagerLinkRequest request =
   *       MoveManagerLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setPreviousCustomerManagerLink("previousCustomerManagerLink-222598638")
   *           .setNewManager("newManager1429989869")
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MoveManagerLinkResponse> future =
   *       customerManagerLinkServiceClient.moveManagerLinkCallable().futureCall(request);
   *   // Do something.
   *   MoveManagerLinkResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MoveManagerLinkRequest, MoveManagerLinkResponse>
      moveManagerLinkCallable() {
    return stub.moveManagerLinkCallable();
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
