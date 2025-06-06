/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v18.services;

import com.google.ads.googleads.v18.services.stub.CustomerUserAccessInvitationServiceStub;
import com.google.ads.googleads.v18.services.stub.CustomerUserAccessInvitationServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service manages the access invitation extended to users for a given
 * customer.
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
 * try (CustomerUserAccessInvitationServiceClient customerUserAccessInvitationServiceClient =
 *     CustomerUserAccessInvitationServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   CustomerUserAccessInvitationOperation operation =
 *       CustomerUserAccessInvitationOperation.newBuilder().build();
 *   MutateCustomerUserAccessInvitationResponse response =
 *       customerUserAccessInvitationServiceClient.mutateCustomerUserAccessInvitation(
 *           customerId, operation);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CustomerUserAccessInvitationServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateCustomerUserAccessInvitation</td>
 *      <td><p> Creates or removes an access invitation.
 * <p>  List of thrown errors:   [AccessInvitationError]()   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateCustomerUserAccessInvitation(MutateCustomerUserAccessInvitationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateCustomerUserAccessInvitation(String customerId, CustomerUserAccessInvitationOperation operation)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateCustomerUserAccessInvitationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * CustomerUserAccessInvitationServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CustomerUserAccessInvitationServiceSettings customerUserAccessInvitationServiceSettings =
 *     CustomerUserAccessInvitationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerUserAccessInvitationServiceClient customerUserAccessInvitationServiceClient =
 *     CustomerUserAccessInvitationServiceClient.create(
 *         customerUserAccessInvitationServiceSettings);
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
 * CustomerUserAccessInvitationServiceSettings customerUserAccessInvitationServiceSettings =
 *     CustomerUserAccessInvitationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerUserAccessInvitationServiceClient customerUserAccessInvitationServiceClient =
 *     CustomerUserAccessInvitationServiceClient.create(
 *         customerUserAccessInvitationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CustomerUserAccessInvitationServiceClient implements BackgroundResource {
  private final CustomerUserAccessInvitationServiceSettings settings;
  private final CustomerUserAccessInvitationServiceStub stub;

  /** Constructs an instance of CustomerUserAccessInvitationServiceClient with default settings. */
  public static final CustomerUserAccessInvitationServiceClient create() throws IOException {
    return create(CustomerUserAccessInvitationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerUserAccessInvitationServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final CustomerUserAccessInvitationServiceClient create(
      CustomerUserAccessInvitationServiceSettings settings) throws IOException {
    return new CustomerUserAccessInvitationServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerUserAccessInvitationServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(CustomerUserAccessInvitationServiceSettings).
   */
  public static final CustomerUserAccessInvitationServiceClient create(
      CustomerUserAccessInvitationServiceStub stub) {
    return new CustomerUserAccessInvitationServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerUserAccessInvitationServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected CustomerUserAccessInvitationServiceClient(
      CustomerUserAccessInvitationServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((CustomerUserAccessInvitationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected CustomerUserAccessInvitationServiceClient(
      CustomerUserAccessInvitationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerUserAccessInvitationServiceSettings getSettings() {
    return settings;
  }

  public CustomerUserAccessInvitationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes an access invitation.
   *
   * <p>List of thrown errors: [AccessInvitationError]() [AuthenticationError]()
   * [AuthorizationError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerUserAccessInvitationServiceClient customerUserAccessInvitationServiceClient =
   *     CustomerUserAccessInvitationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   CustomerUserAccessInvitationOperation operation =
   *       CustomerUserAccessInvitationOperation.newBuilder().build();
   *   MutateCustomerUserAccessInvitationResponse response =
   *       customerUserAccessInvitationServiceClient.mutateCustomerUserAccessInvitation(
   *           customerId, operation);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose access invitation is being modified.
   * @param operation Required. The operation to perform on the access invitation
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerUserAccessInvitationResponse mutateCustomerUserAccessInvitation(
      String customerId, CustomerUserAccessInvitationOperation operation) {
    MutateCustomerUserAccessInvitationRequest request =
        MutateCustomerUserAccessInvitationRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateCustomerUserAccessInvitation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes an access invitation.
   *
   * <p>List of thrown errors: [AccessInvitationError]() [AuthenticationError]()
   * [AuthorizationError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerUserAccessInvitationServiceClient customerUserAccessInvitationServiceClient =
   *     CustomerUserAccessInvitationServiceClient.create()) {
   *   MutateCustomerUserAccessInvitationRequest request =
   *       MutateCustomerUserAccessInvitationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerUserAccessInvitationOperation.newBuilder().build())
   *           .build();
   *   MutateCustomerUserAccessInvitationResponse response =
   *       customerUserAccessInvitationServiceClient.mutateCustomerUserAccessInvitation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerUserAccessInvitationResponse mutateCustomerUserAccessInvitation(
      MutateCustomerUserAccessInvitationRequest request) {
    return mutateCustomerUserAccessInvitationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes an access invitation.
   *
   * <p>List of thrown errors: [AccessInvitationError]() [AuthenticationError]()
   * [AuthorizationError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerUserAccessInvitationServiceClient customerUserAccessInvitationServiceClient =
   *     CustomerUserAccessInvitationServiceClient.create()) {
   *   MutateCustomerUserAccessInvitationRequest request =
   *       MutateCustomerUserAccessInvitationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerUserAccessInvitationOperation.newBuilder().build())
   *           .build();
   *   ApiFuture<MutateCustomerUserAccessInvitationResponse> future =
   *       customerUserAccessInvitationServiceClient
   *           .mutateCustomerUserAccessInvitationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateCustomerUserAccessInvitationResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateCustomerUserAccessInvitationRequest, MutateCustomerUserAccessInvitationResponse>
      mutateCustomerUserAccessInvitationCallable() {
    return stub.mutateCustomerUserAccessInvitationCallable();
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
