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

import com.google.ads.googleads.v6.resources.AccountLink;
import com.google.ads.googleads.v6.resources.AccountLinkName;
import com.google.ads.googleads.v6.services.stub.AccountLinkServiceStub;
import com.google.ads.googleads.v6.services.stub.AccountLinkServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service allows management of links between Google Ads accounts and
 * other accounts.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the AccountLinkServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of AccountLinkServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * AccountLinkServiceSettings accountLinkServiceSettings =
 *     AccountLinkServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AccountLinkServiceClient accountLinkServiceClient =
 *     AccountLinkServiceClient.create(accountLinkServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * AccountLinkServiceSettings accountLinkServiceSettings =
 *     AccountLinkServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AccountLinkServiceClient accountLinkServiceClient =
 *     AccountLinkServiceClient.create(accountLinkServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AccountLinkServiceClient implements BackgroundResource {
  private final AccountLinkServiceSettings settings;
  private final AccountLinkServiceStub stub;

  /** Constructs an instance of AccountLinkServiceClient with default settings. */
  public static final AccountLinkServiceClient create() throws IOException {
    return create(AccountLinkServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AccountLinkServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AccountLinkServiceClient create(AccountLinkServiceSettings settings)
      throws IOException {
    return new AccountLinkServiceClient(settings);
  }

  /**
   * Constructs an instance of AccountLinkServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(AccountLinkServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AccountLinkServiceClient create(AccountLinkServiceStub stub) {
    return new AccountLinkServiceClient(stub);
  }

  /**
   * Constructs an instance of AccountLinkServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected AccountLinkServiceClient(AccountLinkServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AccountLinkServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AccountLinkServiceClient(AccountLinkServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AccountLinkServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AccountLinkServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the account link in full detail.
   *
   * @param resourceName Required. Resource name of the account link.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccountLink getAccountLink(AccountLinkName resourceName) {
    GetAccountLinkRequest request =
        GetAccountLinkRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAccountLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the account link in full detail.
   *
   * @param resourceName Required. Resource name of the account link.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccountLink getAccountLink(String resourceName) {
    GetAccountLinkRequest request =
        GetAccountLinkRequest.newBuilder().setResourceName(resourceName).build();
    return getAccountLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the account link in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccountLink getAccountLink(GetAccountLinkRequest request) {
    return getAccountLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the account link in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetAccountLinkRequest, AccountLink> getAccountLinkCallable() {
    return stub.getAccountLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an account link.
   *
   * @param customerId Required. The ID of the customer for which the account link is created.
   * @param accountLink Required. The account link to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateAccountLinkResponse createAccountLink(
      String customerId, AccountLink accountLink) {
    CreateAccountLinkRequest request =
        CreateAccountLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setAccountLink(accountLink)
            .build();
    return createAccountLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an account link.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateAccountLinkResponse createAccountLink(CreateAccountLinkRequest request) {
    return createAccountLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an account link.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateAccountLinkRequest, CreateAccountLinkResponse>
      createAccountLinkCallable() {
    return stub.createAccountLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes an account link. From V5, create is not supported through
   * AccountLinkService.MutateAccountLink. Please use AccountLinkService.CreateAccountLink instead.
   *
   * @param customerId Required. The ID of the customer being modified.
   * @param operation Required. The operation to perform on the link.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAccountLinkResponse mutateAccountLink(
      String customerId, AccountLinkOperation operation) {
    MutateAccountLinkRequest request =
        MutateAccountLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateAccountLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes an account link. From V5, create is not supported through
   * AccountLinkService.MutateAccountLink. Please use AccountLinkService.CreateAccountLink instead.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAccountLinkResponse mutateAccountLink(MutateAccountLinkRequest request) {
    return mutateAccountLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes an account link. From V5, create is not supported through
   * AccountLinkService.MutateAccountLink. Please use AccountLinkService.CreateAccountLink instead.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<MutateAccountLinkRequest, MutateAccountLinkResponse>
      mutateAccountLinkCallable() {
    return stub.mutateAccountLinkCallable();
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
