/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.resources.CustomerUserAccess;
import com.google.ads.googleads.v8.resources.CustomerUserAccessName;
import com.google.ads.googleads.v8.services.stub.CustomerUserAccessServiceStub;
import com.google.ads.googleads.v8.services.stub.CustomerUserAccessServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service manages the permissions of a user on a given customer.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (CustomerUserAccessServiceClient customerUserAccessServiceClient =
 *     CustomerUserAccessServiceClient.create()) {
 *   CustomerUserAccessName resourceName = CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]");
 *   CustomerUserAccess response =
 *       customerUserAccessServiceClient.getCustomerUserAccess(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CustomerUserAccessServiceClient object to clean up
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
 * CustomerUserAccessServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CustomerUserAccessServiceSettings customerUserAccessServiceSettings =
 *     CustomerUserAccessServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerUserAccessServiceClient customerUserAccessServiceClient =
 *     CustomerUserAccessServiceClient.create(customerUserAccessServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CustomerUserAccessServiceSettings customerUserAccessServiceSettings =
 *     CustomerUserAccessServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerUserAccessServiceClient customerUserAccessServiceClient =
 *     CustomerUserAccessServiceClient.create(customerUserAccessServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CustomerUserAccessServiceClient implements BackgroundResource {
  private final CustomerUserAccessServiceSettings settings;
  private final CustomerUserAccessServiceStub stub;

  /** Constructs an instance of CustomerUserAccessServiceClient with default settings. */
  public static final CustomerUserAccessServiceClient create() throws IOException {
    return create(CustomerUserAccessServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerUserAccessServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CustomerUserAccessServiceClient create(
      CustomerUserAccessServiceSettings settings) throws IOException {
    return new CustomerUserAccessServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerUserAccessServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(CustomerUserAccessServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerUserAccessServiceClient create(CustomerUserAccessServiceStub stub) {
    return new CustomerUserAccessServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerUserAccessServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomerUserAccessServiceClient(CustomerUserAccessServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((CustomerUserAccessServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerUserAccessServiceClient(CustomerUserAccessServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerUserAccessServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerUserAccessServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the CustomerUserAccess in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerUserAccessServiceClient customerUserAccessServiceClient =
   *     CustomerUserAccessServiceClient.create()) {
   *   CustomerUserAccessName resourceName = CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]");
   *   CustomerUserAccess response =
   *       customerUserAccessServiceClient.getCustomerUserAccess(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. Resource name of the customer user access.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerUserAccess getCustomerUserAccess(CustomerUserAccessName resourceName) {
    GetCustomerUserAccessRequest request =
        GetCustomerUserAccessRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomerUserAccess(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the CustomerUserAccess in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerUserAccessServiceClient customerUserAccessServiceClient =
   *     CustomerUserAccessServiceClient.create()) {
   *   String resourceName = CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]").toString();
   *   CustomerUserAccess response =
   *       customerUserAccessServiceClient.getCustomerUserAccess(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. Resource name of the customer user access.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerUserAccess getCustomerUserAccess(String resourceName) {
    GetCustomerUserAccessRequest request =
        GetCustomerUserAccessRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomerUserAccess(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the CustomerUserAccess in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerUserAccessServiceClient customerUserAccessServiceClient =
   *     CustomerUserAccessServiceClient.create()) {
   *   GetCustomerUserAccessRequest request =
   *       GetCustomerUserAccessRequest.newBuilder()
   *           .setResourceName(CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]").toString())
   *           .build();
   *   CustomerUserAccess response = customerUserAccessServiceClient.getCustomerUserAccess(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerUserAccess getCustomerUserAccess(GetCustomerUserAccessRequest request) {
    return getCustomerUserAccessCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the CustomerUserAccess in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerUserAccessServiceClient customerUserAccessServiceClient =
   *     CustomerUserAccessServiceClient.create()) {
   *   GetCustomerUserAccessRequest request =
   *       GetCustomerUserAccessRequest.newBuilder()
   *           .setResourceName(CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]").toString())
   *           .build();
   *   ApiFuture<CustomerUserAccess> future =
   *       customerUserAccessServiceClient.getCustomerUserAccessCallable().futureCall(request);
   *   // Do something.
   *   CustomerUserAccess response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetCustomerUserAccessRequest, CustomerUserAccess>
      getCustomerUserAccessCallable() {
    return stub.getCustomerUserAccessCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates, removes permission of a user on a given customer. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CustomerUserAccessError]() [FieldMaskError]() [HeaderError]() [InternalError]()
   * [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerUserAccessServiceClient customerUserAccessServiceClient =
   *     CustomerUserAccessServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   CustomerUserAccessOperation operation = CustomerUserAccessOperation.newBuilder().build();
   *   MutateCustomerUserAccessResponse response =
   *       customerUserAccessServiceClient.mutateCustomerUserAccess(customerId, operation);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer being modified.
   * @param operation Required. The operation to perform on the customer
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerUserAccessResponse mutateCustomerUserAccess(
      String customerId, CustomerUserAccessOperation operation) {
    MutateCustomerUserAccessRequest request =
        MutateCustomerUserAccessRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateCustomerUserAccess(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates, removes permission of a user on a given customer. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CustomerUserAccessError]() [FieldMaskError]() [HeaderError]() [InternalError]()
   * [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerUserAccessServiceClient customerUserAccessServiceClient =
   *     CustomerUserAccessServiceClient.create()) {
   *   MutateCustomerUserAccessRequest request =
   *       MutateCustomerUserAccessRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerUserAccessOperation.newBuilder().build())
   *           .build();
   *   MutateCustomerUserAccessResponse response =
   *       customerUserAccessServiceClient.mutateCustomerUserAccess(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerUserAccessResponse mutateCustomerUserAccess(
      MutateCustomerUserAccessRequest request) {
    return mutateCustomerUserAccessCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates, removes permission of a user on a given customer. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CustomerUserAccessError]() [FieldMaskError]() [HeaderError]() [InternalError]()
   * [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerUserAccessServiceClient customerUserAccessServiceClient =
   *     CustomerUserAccessServiceClient.create()) {
   *   MutateCustomerUserAccessRequest request =
   *       MutateCustomerUserAccessRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerUserAccessOperation.newBuilder().build())
   *           .build();
   *   ApiFuture<MutateCustomerUserAccessResponse> future =
   *       customerUserAccessServiceClient.mutateCustomerUserAccessCallable().futureCall(request);
   *   // Do something.
   *   MutateCustomerUserAccessResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateCustomerUserAccessRequest, MutateCustomerUserAccessResponse>
      mutateCustomerUserAccessCallable() {
    return stub.mutateCustomerUserAccessCallable();
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
