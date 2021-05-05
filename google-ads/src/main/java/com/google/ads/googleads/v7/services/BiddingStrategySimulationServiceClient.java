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

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.resources.BiddingStrategySimulation;
import com.google.ads.googleads.v7.resources.BiddingStrategySimulationName;
import com.google.ads.googleads.v7.services.stub.BiddingStrategySimulationServiceStub;
import com.google.ads.googleads.v7.services.stub.BiddingStrategySimulationServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch bidding strategy simulations.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (BiddingStrategySimulationServiceClient biddingStrategySimulationServiceClient =
 *     BiddingStrategySimulationServiceClient.create()) {
 *   BiddingStrategySimulationName resourceName =
 *       BiddingStrategySimulationName.of(
 *           "[CUSTOMER_ID]",
 *           "[BIDDING_STRATEGY_ID]",
 *           "[TYPE]",
 *           "[MODIFICATION_METHOD]",
 *           "[START_DATE]",
 *           "[END_DATE]");
 *   BiddingStrategySimulation response =
 *       biddingStrategySimulationServiceClient.getBiddingStrategySimulation(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the BiddingStrategySimulationServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
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
 * BiddingStrategySimulationServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * BiddingStrategySimulationServiceSettings biddingStrategySimulationServiceSettings =
 *     BiddingStrategySimulationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BiddingStrategySimulationServiceClient biddingStrategySimulationServiceClient =
 *     BiddingStrategySimulationServiceClient.create(biddingStrategySimulationServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * BiddingStrategySimulationServiceSettings biddingStrategySimulationServiceSettings =
 *     BiddingStrategySimulationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BiddingStrategySimulationServiceClient biddingStrategySimulationServiceClient =
 *     BiddingStrategySimulationServiceClient.create(biddingStrategySimulationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class BiddingStrategySimulationServiceClient implements BackgroundResource {
  private final BiddingStrategySimulationServiceSettings settings;
  private final BiddingStrategySimulationServiceStub stub;

  /** Constructs an instance of BiddingStrategySimulationServiceClient with default settings. */
  public static final BiddingStrategySimulationServiceClient create() throws IOException {
    return create(BiddingStrategySimulationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BiddingStrategySimulationServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final BiddingStrategySimulationServiceClient create(
      BiddingStrategySimulationServiceSettings settings) throws IOException {
    return new BiddingStrategySimulationServiceClient(settings);
  }

  /**
   * Constructs an instance of BiddingStrategySimulationServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(BiddingStrategySimulationServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final BiddingStrategySimulationServiceClient create(
      BiddingStrategySimulationServiceStub stub) {
    return new BiddingStrategySimulationServiceClient(stub);
  }

  /**
   * Constructs an instance of BiddingStrategySimulationServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected BiddingStrategySimulationServiceClient(
      BiddingStrategySimulationServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((BiddingStrategySimulationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected BiddingStrategySimulationServiceClient(BiddingStrategySimulationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BiddingStrategySimulationServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BiddingStrategySimulationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested bidding strategy simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingStrategySimulationServiceClient biddingStrategySimulationServiceClient =
   *     BiddingStrategySimulationServiceClient.create()) {
   *   BiddingStrategySimulationName resourceName =
   *       BiddingStrategySimulationName.of(
   *           "[CUSTOMER_ID]",
   *           "[BIDDING_STRATEGY_ID]",
   *           "[TYPE]",
   *           "[MODIFICATION_METHOD]",
   *           "[START_DATE]",
   *           "[END_DATE]");
   *   BiddingStrategySimulation response =
   *       biddingStrategySimulationServiceClient.getBiddingStrategySimulation(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the bidding strategy simulation to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BiddingStrategySimulation getBiddingStrategySimulation(
      BiddingStrategySimulationName resourceName) {
    GetBiddingStrategySimulationRequest request =
        GetBiddingStrategySimulationRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getBiddingStrategySimulation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested bidding strategy simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingStrategySimulationServiceClient biddingStrategySimulationServiceClient =
   *     BiddingStrategySimulationServiceClient.create()) {
   *   String resourceName =
   *       BiddingStrategySimulationName.of(
   *               "[CUSTOMER_ID]",
   *               "[BIDDING_STRATEGY_ID]",
   *               "[TYPE]",
   *               "[MODIFICATION_METHOD]",
   *               "[START_DATE]",
   *               "[END_DATE]")
   *           .toString();
   *   BiddingStrategySimulation response =
   *       biddingStrategySimulationServiceClient.getBiddingStrategySimulation(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the bidding strategy simulation to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BiddingStrategySimulation getBiddingStrategySimulation(String resourceName) {
    GetBiddingStrategySimulationRequest request =
        GetBiddingStrategySimulationRequest.newBuilder().setResourceName(resourceName).build();
    return getBiddingStrategySimulation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested bidding strategy simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingStrategySimulationServiceClient biddingStrategySimulationServiceClient =
   *     BiddingStrategySimulationServiceClient.create()) {
   *   GetBiddingStrategySimulationRequest request =
   *       GetBiddingStrategySimulationRequest.newBuilder()
   *           .setResourceName(
   *               BiddingStrategySimulationName.of(
   *                       "[CUSTOMER_ID]",
   *                       "[BIDDING_STRATEGY_ID]",
   *                       "[TYPE]",
   *                       "[MODIFICATION_METHOD]",
   *                       "[START_DATE]",
   *                       "[END_DATE]")
   *                   .toString())
   *           .build();
   *   BiddingStrategySimulation response =
   *       biddingStrategySimulationServiceClient.getBiddingStrategySimulation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BiddingStrategySimulation getBiddingStrategySimulation(
      GetBiddingStrategySimulationRequest request) {
    return getBiddingStrategySimulationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested bidding strategy simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingStrategySimulationServiceClient biddingStrategySimulationServiceClient =
   *     BiddingStrategySimulationServiceClient.create()) {
   *   GetBiddingStrategySimulationRequest request =
   *       GetBiddingStrategySimulationRequest.newBuilder()
   *           .setResourceName(
   *               BiddingStrategySimulationName.of(
   *                       "[CUSTOMER_ID]",
   *                       "[BIDDING_STRATEGY_ID]",
   *                       "[TYPE]",
   *                       "[MODIFICATION_METHOD]",
   *                       "[START_DATE]",
   *                       "[END_DATE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<BiddingStrategySimulation> future =
   *       biddingStrategySimulationServiceClient
   *           .getBiddingStrategySimulationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   BiddingStrategySimulation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetBiddingStrategySimulationRequest, BiddingStrategySimulation>
      getBiddingStrategySimulationCallable() {
    return stub.getBiddingStrategySimulationCallable();
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
