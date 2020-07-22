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

import com.google.ads.googleads.v2.resources.AccountBudgetProposal;
import com.google.ads.googleads.v2.services.stub.AccountBudgetProposalServiceStub;
import com.google.ads.googleads.v2.services.stub.AccountBudgetProposalServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: A service for managing account-level budgets via proposals.
 *
 * <p>A proposal is a request to create a new budget or make changes to an existing one.
 *
 * <p>Reads for account-level budgets managed by these proposals will be supported in a future
 * version. Until then, please use the BudgetOrderService from the AdWords API. Learn more at
 * https://developers.google.com/adwords/api/docs/guides/budget-order
 *
 * <p>Mutates: The CREATE operation creates a new proposal. UPDATE operations aren't supported. The
 * REMOVE operation cancels a pending proposal.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
 *   AccountBudgetProposalName resourceName = AccountBudgetProposalName.of("[CUSTOMER]", "[ACCOUNT_BUDGET_PROPOSAL]");
 *   AccountBudgetProposal response = accountBudgetProposalServiceClient.getAccountBudgetProposal(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the accountBudgetProposalServiceClient object to clean up
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
 * AccountBudgetProposalServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AccountBudgetProposalServiceSettings accountBudgetProposalServiceSettings =
 *     AccountBudgetProposalServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
 *     AccountBudgetProposalServiceClient.create(accountBudgetProposalServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AccountBudgetProposalServiceSettings accountBudgetProposalServiceSettings =
 *     AccountBudgetProposalServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
 *     AccountBudgetProposalServiceClient.create(accountBudgetProposalServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
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
   * calls. This is for advanced usage - prefer to use AccountBudgetProposalServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AccountBudgetProposalServiceClient(AccountBudgetProposalServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AccountBudgetProposalServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AccountBudgetProposalServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an account-level budget proposal in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
   *   AccountBudgetProposalName resourceName = AccountBudgetProposalName.of("[CUSTOMER]", "[ACCOUNT_BUDGET_PROPOSAL]");
   *   AccountBudgetProposal response = accountBudgetProposalServiceClient.getAccountBudgetProposal(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the account-level budget proposal to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccountBudgetProposal getAccountBudgetProposal(
      AccountBudgetProposalName resourceName) {
    GetAccountBudgetProposalRequest request =
        GetAccountBudgetProposalRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAccountBudgetProposal(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an account-level budget proposal in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
   *   AccountBudgetProposalName resourceName = AccountBudgetProposalName.of("[CUSTOMER]", "[ACCOUNT_BUDGET_PROPOSAL]");
   *   AccountBudgetProposal response = accountBudgetProposalServiceClient.getAccountBudgetProposal(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the account-level budget proposal to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccountBudgetProposal getAccountBudgetProposal(String resourceName) {
    GetAccountBudgetProposalRequest request =
        GetAccountBudgetProposalRequest.newBuilder().setResourceName(resourceName).build();
    return getAccountBudgetProposal(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an account-level budget proposal in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
   *   AccountBudgetProposalName resourceName = AccountBudgetProposalName.of("[CUSTOMER]", "[ACCOUNT_BUDGET_PROPOSAL]");
   *   GetAccountBudgetProposalRequest request = GetAccountBudgetProposalRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   AccountBudgetProposal response = accountBudgetProposalServiceClient.getAccountBudgetProposal(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccountBudgetProposal getAccountBudgetProposal(
      GetAccountBudgetProposalRequest request) {
    return getAccountBudgetProposalCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an account-level budget proposal in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
   *   AccountBudgetProposalName resourceName = AccountBudgetProposalName.of("[CUSTOMER]", "[ACCOUNT_BUDGET_PROPOSAL]");
   *   GetAccountBudgetProposalRequest request = GetAccountBudgetProposalRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;AccountBudgetProposal&gt; future = accountBudgetProposalServiceClient.getAccountBudgetProposalCallable().futureCall(request);
   *   // Do something
   *   AccountBudgetProposal response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAccountBudgetProposalRequest, AccountBudgetProposal>
      getAccountBudgetProposalCallable() {
    return stub.getAccountBudgetProposalCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes account budget proposals. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
   *   String customerId = "";
   *   AccountBudgetProposalOperation operation = AccountBudgetProposalOperation.newBuilder().build();
   *   MutateAccountBudgetProposalResponse response = accountBudgetProposalServiceClient.mutateAccountBudgetProposal(customerId, operation);
   * }
   * </code></pre>
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes account budget proposals. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
   *   String customerId = "";
   *   AccountBudgetProposalOperation operation = AccountBudgetProposalOperation.newBuilder().build();
   *   MutateAccountBudgetProposalRequest request = MutateAccountBudgetProposalRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setOperation(operation)
   *     .build();
   *   MutateAccountBudgetProposalResponse response = accountBudgetProposalServiceClient.mutateAccountBudgetProposal(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAccountBudgetProposalResponse mutateAccountBudgetProposal(
      MutateAccountBudgetProposalRequest request) {
    return mutateAccountBudgetProposalCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes account budget proposals. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
   *   String customerId = "";
   *   AccountBudgetProposalOperation operation = AccountBudgetProposalOperation.newBuilder().build();
   *   MutateAccountBudgetProposalRequest request = MutateAccountBudgetProposalRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setOperation(operation)
   *     .build();
   *   ApiFuture&lt;MutateAccountBudgetProposalResponse&gt; future = accountBudgetProposalServiceClient.mutateAccountBudgetProposalCallable().futureCall(request);
   *   // Do something
   *   MutateAccountBudgetProposalResponse response = future.get();
   * }
   * </code></pre>
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
