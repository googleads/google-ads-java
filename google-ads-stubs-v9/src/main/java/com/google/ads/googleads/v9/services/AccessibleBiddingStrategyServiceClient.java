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

package com.google.ads.googleads.v9.services;

import com.google.ads.googleads.v9.resources.AccessibleBiddingStrategy;
import com.google.ads.googleads.v9.resources.AccessibleBiddingStrategyName;
import com.google.ads.googleads.v9.services.stub.AccessibleBiddingStrategyServiceStub;
import com.google.ads.googleads.v9.services.stub.AccessibleBiddingStrategyServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to read accessible bidding strategies.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (AccessibleBiddingStrategyServiceClient accessibleBiddingStrategyServiceClient =
 *     AccessibleBiddingStrategyServiceClient.create()) {
 *   AccessibleBiddingStrategyName resourceName =
 *       AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]");
 *   AccessibleBiddingStrategy response =
 *       accessibleBiddingStrategyServiceClient.getAccessibleBiddingStrategy(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AccessibleBiddingStrategyServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
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
 * AccessibleBiddingStrategyServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * AccessibleBiddingStrategyServiceSettings accessibleBiddingStrategyServiceSettings =
 *     AccessibleBiddingStrategyServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AccessibleBiddingStrategyServiceClient accessibleBiddingStrategyServiceClient =
 *     AccessibleBiddingStrategyServiceClient.create(accessibleBiddingStrategyServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * AccessibleBiddingStrategyServiceSettings accessibleBiddingStrategyServiceSettings =
 *     AccessibleBiddingStrategyServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AccessibleBiddingStrategyServiceClient accessibleBiddingStrategyServiceClient =
 *     AccessibleBiddingStrategyServiceClient.create(accessibleBiddingStrategyServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AccessibleBiddingStrategyServiceClient implements BackgroundResource {
  private final AccessibleBiddingStrategyServiceSettings settings;
  private final AccessibleBiddingStrategyServiceStub stub;

  /** Constructs an instance of AccessibleBiddingStrategyServiceClient with default settings. */
  public static final AccessibleBiddingStrategyServiceClient create() throws IOException {
    return create(AccessibleBiddingStrategyServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AccessibleBiddingStrategyServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final AccessibleBiddingStrategyServiceClient create(
      AccessibleBiddingStrategyServiceSettings settings) throws IOException {
    return new AccessibleBiddingStrategyServiceClient(settings);
  }

  /**
   * Constructs an instance of AccessibleBiddingStrategyServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(AccessibleBiddingStrategyServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AccessibleBiddingStrategyServiceClient create(
      AccessibleBiddingStrategyServiceStub stub) {
    return new AccessibleBiddingStrategyServiceClient(stub);
  }

  /**
   * Constructs an instance of AccessibleBiddingStrategyServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected AccessibleBiddingStrategyServiceClient(
      AccessibleBiddingStrategyServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((AccessibleBiddingStrategyServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AccessibleBiddingStrategyServiceClient(AccessibleBiddingStrategyServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AccessibleBiddingStrategyServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AccessibleBiddingStrategyServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested accessible bidding strategy in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AccessibleBiddingStrategyServiceClient accessibleBiddingStrategyServiceClient =
   *     AccessibleBiddingStrategyServiceClient.create()) {
   *   AccessibleBiddingStrategyName resourceName =
   *       AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]");
   *   AccessibleBiddingStrategy response =
   *       accessibleBiddingStrategyServiceClient.getAccessibleBiddingStrategy(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the accessible bidding strategy to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccessibleBiddingStrategy getAccessibleBiddingStrategy(
      AccessibleBiddingStrategyName resourceName) {
    GetAccessibleBiddingStrategyRequest request =
        GetAccessibleBiddingStrategyRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAccessibleBiddingStrategy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested accessible bidding strategy in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AccessibleBiddingStrategyServiceClient accessibleBiddingStrategyServiceClient =
   *     AccessibleBiddingStrategyServiceClient.create()) {
   *   String resourceName =
   *       AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]").toString();
   *   AccessibleBiddingStrategy response =
   *       accessibleBiddingStrategyServiceClient.getAccessibleBiddingStrategy(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the accessible bidding strategy to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccessibleBiddingStrategy getAccessibleBiddingStrategy(String resourceName) {
    GetAccessibleBiddingStrategyRequest request =
        GetAccessibleBiddingStrategyRequest.newBuilder().setResourceName(resourceName).build();
    return getAccessibleBiddingStrategy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested accessible bidding strategy in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AccessibleBiddingStrategyServiceClient accessibleBiddingStrategyServiceClient =
   *     AccessibleBiddingStrategyServiceClient.create()) {
   *   GetAccessibleBiddingStrategyRequest request =
   *       GetAccessibleBiddingStrategyRequest.newBuilder()
   *           .setResourceName(
   *               AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]")
   *                   .toString())
   *           .build();
   *   AccessibleBiddingStrategy response =
   *       accessibleBiddingStrategyServiceClient.getAccessibleBiddingStrategy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AccessibleBiddingStrategy getAccessibleBiddingStrategy(
      GetAccessibleBiddingStrategyRequest request) {
    return getAccessibleBiddingStrategyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested accessible bidding strategy in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AccessibleBiddingStrategyServiceClient accessibleBiddingStrategyServiceClient =
   *     AccessibleBiddingStrategyServiceClient.create()) {
   *   GetAccessibleBiddingStrategyRequest request =
   *       GetAccessibleBiddingStrategyRequest.newBuilder()
   *           .setResourceName(
   *               AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<AccessibleBiddingStrategy> future =
   *       accessibleBiddingStrategyServiceClient
   *           .getAccessibleBiddingStrategyCallable()
   *           .futureCall(request);
   *   // Do something.
   *   AccessibleBiddingStrategy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAccessibleBiddingStrategyRequest, AccessibleBiddingStrategy>
      getAccessibleBiddingStrategyCallable() {
    return stub.getAccessibleBiddingStrategyCallable();
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
