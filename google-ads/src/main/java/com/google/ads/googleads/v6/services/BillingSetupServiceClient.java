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

import com.google.ads.googleads.v6.resources.BillingSetup;
import com.google.ads.googleads.v6.resources.BillingSetupName;
import com.google.ads.googleads.v6.services.stub.BillingSetupServiceStub;
import com.google.ads.googleads.v6.services.stub.BillingSetupServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service for designating the business entity responsible for accrued costs.
 *
 * <p>A billing setup is associated with a payments account. Billing-related activity for all
 * billing setups associated with a particular payments account will appear on a single invoice
 * generated monthly.
 *
 * <p>Mutates: The REMOVE operation cancels a pending billing setup. The CREATE operation creates a
 * new billing setup.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the BillingSetupServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of BillingSetupServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * BillingSetupServiceSettings billingSetupServiceSettings =
 *     BillingSetupServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BillingSetupServiceClient billingSetupServiceClient =
 *     BillingSetupServiceClient.create(billingSetupServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * BillingSetupServiceSettings billingSetupServiceSettings =
 *     BillingSetupServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BillingSetupServiceClient billingSetupServiceClient =
 *     BillingSetupServiceClient.create(billingSetupServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class BillingSetupServiceClient implements BackgroundResource {
  private final BillingSetupServiceSettings settings;
  private final BillingSetupServiceStub stub;

  /** Constructs an instance of BillingSetupServiceClient with default settings. */
  public static final BillingSetupServiceClient create() throws IOException {
    return create(BillingSetupServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BillingSetupServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BillingSetupServiceClient create(BillingSetupServiceSettings settings)
      throws IOException {
    return new BillingSetupServiceClient(settings);
  }

  /**
   * Constructs an instance of BillingSetupServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(BillingSetupServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final BillingSetupServiceClient create(BillingSetupServiceStub stub) {
    return new BillingSetupServiceClient(stub);
  }

  /**
   * Constructs an instance of BillingSetupServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected BillingSetupServiceClient(BillingSetupServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((BillingSetupServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected BillingSetupServiceClient(BillingSetupServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BillingSetupServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BillingSetupServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a billing setup.
   *
   * @param resource_name Required. The resource name of the billing setup to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BillingSetup getBillingSetup(BillingSetupName resourceName) {
    GetBillingSetupRequest request =
        GetBillingSetupRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getBillingSetup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a billing setup.
   *
   * @param resource_name Required. The resource name of the billing setup to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BillingSetup getBillingSetup(String resourceName) {
    GetBillingSetupRequest request =
        GetBillingSetupRequest.newBuilder().setResourceName(resourceName).build();
    return getBillingSetup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a billing setup.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BillingSetup getBillingSetup(GetBillingSetupRequest request) {
    return getBillingSetupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a billing setup.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetBillingSetupRequest, BillingSetup> getBillingSetupCallable() {
    return stub.getBillingSetupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a billing setup, or cancels an existing billing setup.
   *
   * @param customer_id Required. Id of the customer to apply the billing setup mutate operation to.
   * @param operation Required. The operation to perform.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBillingSetupResponse mutateBillingSetup(
      String customerId, BillingSetupOperation operation) {
    MutateBillingSetupRequest request =
        MutateBillingSetupRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateBillingSetup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a billing setup, or cancels an existing billing setup.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBillingSetupResponse mutateBillingSetup(MutateBillingSetupRequest request) {
    return mutateBillingSetupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a billing setup, or cancels an existing billing setup.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<MutateBillingSetupRequest, MutateBillingSetupResponse>
      mutateBillingSetupCallable() {
    return stub.mutateBillingSetupCallable();
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
