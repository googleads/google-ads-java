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
package com.google.ads.googleads.v2.services;

import com.google.ads.googleads.v2.resources.AccountBudget;
import com.google.ads.googleads.v2.services.stub.AccountBudgetServiceStub;
import com.google.ads.googleads.v2.services.stub.AccountBudgetServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: A service for fetching an account-level budget.
 *
 * <p>Account-level budgets are mutated by creating proposal resources.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AccountBudgetServiceClient accountBudgetServiceClient = AccountBudgetServiceClient.create()) {
 *   String formattedResourceName = AccountBudgetServiceClient.formatAccountBudgetName("[CUSTOMER]", "[ACCOUNT_BUDGET]");
 *   AccountBudget response = accountBudgetServiceClient.getAccountBudget(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the accountBudgetServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of AccountBudgetServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AccountBudgetServiceSettings accountBudgetServiceSettings =
 *     AccountBudgetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AccountBudgetServiceClient accountBudgetServiceClient =
 *     AccountBudgetServiceClient.create(accountBudgetServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AccountBudgetServiceSettings accountBudgetServiceSettings =
 *     AccountBudgetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AccountBudgetServiceClient accountBudgetServiceClient =
 *     AccountBudgetServiceClient.create(accountBudgetServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AccountBudgetServiceClient implements BackgroundResource {
  private final AccountBudgetServiceSettings settings;
  private final AccountBudgetServiceStub stub;

  private static final PathTemplate ACCOUNT_BUDGET_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/accountBudgets/{account_budget}");

  /**
   * Formats a string containing the fully-qualified path to represent a account_budget resource.
   *
   * @deprecated Use the {@link AccountBudgetName} class instead.
   */
  @Deprecated
  public static final String formatAccountBudgetName(String customer, String accountBudget) {
    return ACCOUNT_BUDGET_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "account_budget", accountBudget);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a account_budget
   * resource.
   *
   * @deprecated Use the {@link AccountBudgetName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromAccountBudgetName(String accountBudgetName) {
    return ACCOUNT_BUDGET_PATH_TEMPLATE.parse(accountBudgetName).get("customer");
  }

  /**
   * Parses the account_budget from the given fully-qualified path which represents a account_budget
   * resource.
   *
   * @deprecated Use the {@link AccountBudgetName} class instead.
   */
  @Deprecated
  public static final String parseAccountBudgetFromAccountBudgetName(String accountBudgetName) {
    return ACCOUNT_BUDGET_PATH_TEMPLATE.parse(accountBudgetName).get("account_budget");
  }

  /** Constructs an instance of AccountBudgetServiceClient with default settings. */
  public static final AccountBudgetServiceClient create() throws IOException {
    return create(AccountBudgetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AccountBudgetServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AccountBudgetServiceClient create(AccountBudgetServiceSettings settings)
      throws IOException {
    return new AccountBudgetServiceClient(settings);
  }

  /**
   * Constructs an instance of AccountBudgetServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use AccountBudgetServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AccountBudgetServiceClient create(AccountBudgetServiceStub stub) {
    return new AccountBudgetServiceClient(stub);
  }

  /**
   * Constructs an instance of AccountBudgetServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AccountBudgetServiceClient(AccountBudgetServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AccountBudgetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AccountBudgetServiceClient(AccountBudgetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AccountBudgetServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AccountBudgetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an account-level budget in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetServiceClient accountBudgetServiceClient = AccountBudgetServiceClient.create()) {
   *   String formattedResourceName = AccountBudgetServiceClient.formatAccountBudgetName("[CUSTOMER]", "[ACCOUNT_BUDGET]");
   *   AccountBudget response = accountBudgetServiceClient.getAccountBudget(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the account-level budget to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccountBudget getAccountBudget(String resourceName) {
    ACCOUNT_BUDGET_PATH_TEMPLATE.validate(resourceName, "getAccountBudget");
    GetAccountBudgetRequest request =
        GetAccountBudgetRequest.newBuilder().setResourceName(resourceName).build();
    return getAccountBudget(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an account-level budget in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetServiceClient accountBudgetServiceClient = AccountBudgetServiceClient.create()) {
   *   String formattedResourceName = AccountBudgetServiceClient.formatAccountBudgetName("[CUSTOMER]", "[ACCOUNT_BUDGET]");
   *   GetAccountBudgetRequest request = GetAccountBudgetRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   AccountBudget response = accountBudgetServiceClient.getAccountBudget(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccountBudget getAccountBudget(GetAccountBudgetRequest request) {
    return getAccountBudgetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns an account-level budget in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AccountBudgetServiceClient accountBudgetServiceClient = AccountBudgetServiceClient.create()) {
   *   String formattedResourceName = AccountBudgetServiceClient.formatAccountBudgetName("[CUSTOMER]", "[ACCOUNT_BUDGET]");
   *   GetAccountBudgetRequest request = GetAccountBudgetRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;AccountBudget&gt; future = accountBudgetServiceClient.getAccountBudgetCallable().futureCall(request);
   *   // Do something
   *   AccountBudget response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAccountBudgetRequest, AccountBudget> getAccountBudgetCallable() {
    return stub.getAccountBudgetCallable();
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
