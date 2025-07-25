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

package com.google.ads.googleads.v21.services;

import com.google.ads.googleads.v21.services.stub.AccountBudgetProposalServiceStub;
import com.google.ads.googleads.v21.services.stub.AccountBudgetProposalServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service for managing account-level budgets through proposals.
 *
 * <p>A proposal is a request to create a new budget or make changes to an existing one.
 *
 * <p>Mutates: The CREATE operation creates a new proposal. UPDATE operations aren't supported. The
 * REMOVE operation cancels a pending proposal.
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
 * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
 *     AccountBudgetProposalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   AccountBudgetProposalOperation operation =
 *       AccountBudgetProposalOperation.newBuilder().build();
 *   MutateAccountBudgetProposalResponse response =
 *       accountBudgetProposalServiceClient.mutateAccountBudgetProposal(customerId, operation);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AccountBudgetProposalServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateAccountBudgetProposal</td>
 *      <td><p> Creates, updates, or removes account budget proposals.  Operation statuses are returned.
 * <p>  List of thrown errors:   [AccountBudgetProposalError]()   [AuthenticationError]()   [AuthorizationError]()   [DatabaseError]()   [DateError]()   [FieldError]()   [FieldMaskError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RequestError]()   [StringLengthError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateAccountBudgetProposal(MutateAccountBudgetProposalRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateAccountBudgetProposal(String customerId, AccountBudgetProposalOperation operation)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateAccountBudgetProposalCallable()
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
 * AccountBudgetProposalServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AccountBudgetProposalServiceSettings accountBudgetProposalServiceSettings =
 *     AccountBudgetProposalServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
 *     AccountBudgetProposalServiceClient.create(accountBudgetProposalServiceSettings);
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
 * AccountBudgetProposalServiceSettings accountBudgetProposalServiceSettings =
 *     AccountBudgetProposalServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
 *     AccountBudgetProposalServiceClient.create(accountBudgetProposalServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AccountBudgetProposalServiceClient implements BackgroundResource {
  private final AccountBudgetProposalServiceSettings settings;
  private final AccountBudgetProposalServiceStub stub;

  /** Constructs an instance of AccountBudgetProposalServiceClient with default settings. */
  public static final AccountBudgetProposalServiceClient create() throws IOException {
    return create(AccountBudgetProposalServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AccountBudgetProposalServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final AccountBudgetProposalServiceClient create(
      AccountBudgetProposalServiceSettings settings) throws IOException {
    return new AccountBudgetProposalServiceClient(settings);
  }

  /**
   * Constructs an instance of AccountBudgetProposalServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(AccountBudgetProposalServiceSettings).
   */
  public static final AccountBudgetProposalServiceClient create(
      AccountBudgetProposalServiceStub stub) {
    return new AccountBudgetProposalServiceClient(stub);
  }

  /**
   * Constructs an instance of AccountBudgetProposalServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AccountBudgetProposalServiceClient(AccountBudgetProposalServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((AccountBudgetProposalServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AccountBudgetProposalServiceClient(AccountBudgetProposalServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AccountBudgetProposalServiceSettings getSettings() {
    return settings;
  }

  public AccountBudgetProposalServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes account budget proposals. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AccountBudgetProposalError]() [AuthenticationError]()
   * [AuthorizationError]() [DatabaseError]() [DateError]() [FieldError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [QuotaError]() [RequestError]()
   * [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
   *     AccountBudgetProposalServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   AccountBudgetProposalOperation operation =
   *       AccountBudgetProposalOperation.newBuilder().build();
   *   MutateAccountBudgetProposalResponse response =
   *       accountBudgetProposalServiceClient.mutateAccountBudgetProposal(customerId, operation);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer.
   * @param operation Required. The operation to perform on an individual account-level budget
   *     proposal.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAccountBudgetProposalResponse mutateAccountBudgetProposal(
      String customerId, AccountBudgetProposalOperation operation) {
    MutateAccountBudgetProposalRequest request =
        MutateAccountBudgetProposalRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateAccountBudgetProposal(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes account budget proposals. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AccountBudgetProposalError]() [AuthenticationError]()
   * [AuthorizationError]() [DatabaseError]() [DateError]() [FieldError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [QuotaError]() [RequestError]()
   * [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
   *     AccountBudgetProposalServiceClient.create()) {
   *   MutateAccountBudgetProposalRequest request =
   *       MutateAccountBudgetProposalRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(AccountBudgetProposalOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAccountBudgetProposalResponse response =
   *       accountBudgetProposalServiceClient.mutateAccountBudgetProposal(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAccountBudgetProposalResponse mutateAccountBudgetProposal(
      MutateAccountBudgetProposalRequest request) {
    return mutateAccountBudgetProposalCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes account budget proposals. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AccountBudgetProposalError]() [AuthenticationError]()
   * [AuthorizationError]() [DatabaseError]() [DateError]() [FieldError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [QuotaError]() [RequestError]()
   * [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
   *     AccountBudgetProposalServiceClient.create()) {
   *   MutateAccountBudgetProposalRequest request =
   *       MutateAccountBudgetProposalRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(AccountBudgetProposalOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAccountBudgetProposalResponse> future =
   *       accountBudgetProposalServiceClient
   *           .mutateAccountBudgetProposalCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateAccountBudgetProposalResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateAccountBudgetProposalRequest, MutateAccountBudgetProposalResponse>
      mutateAccountBudgetProposalCallable() {
    return stub.mutateAccountBudgetProposalCallable();
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
