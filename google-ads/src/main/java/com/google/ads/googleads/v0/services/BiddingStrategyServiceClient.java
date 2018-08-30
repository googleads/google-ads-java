/*
 * Copyright 2018 Google LLC
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
package com.google.ads.googleads.v0.services;

import com.google.ads.googleads.v0.resources.BiddingStrategy;
import com.google.ads.googleads.v0.services.BiddingStrategyOperation;
import com.google.ads.googleads.v0.services.GetBiddingStrategyRequest;
import com.google.ads.googleads.v0.services.MutateBiddingStrategiesRequest;
import com.google.ads.googleads.v0.services.MutateBiddingStrategiesResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.ads.googleads.v0.services.stub.BiddingStrategyServiceStub;
import com.google.ads.googleads.v0.services.stub.BiddingStrategyServiceStubSettings;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage bidding strategies.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (BiddingStrategyServiceClient biddingStrategyServiceClient = BiddingStrategyServiceClient.create()) {
 *   String formattedResourceName = BiddingStrategyServiceClient.formatBiddingStrategyName("[CUSTOMER]", "[BIDDING_STRATEGY]");
 *   BiddingStrategy response = biddingStrategyServiceClient.getBiddingStrategy(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the biddingStrategyServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of BiddingStrategyServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * BiddingStrategyServiceSettings biddingStrategyServiceSettings =
 *     BiddingStrategyServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BiddingStrategyServiceClient biddingStrategyServiceClient =
 *     BiddingStrategyServiceClient.create(biddingStrategyServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * BiddingStrategyServiceSettings biddingStrategyServiceSettings =
 *     BiddingStrategyServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BiddingStrategyServiceClient biddingStrategyServiceClient =
 *     BiddingStrategyServiceClient.create(biddingStrategyServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class BiddingStrategyServiceClient implements BackgroundResource {
  private final BiddingStrategyServiceSettings settings;
  private final BiddingStrategyServiceStub stub;

  private static final PathTemplate BIDDING_STRATEGY_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/biddingStrategies/{bidding_strategy}");

  /**
   * Formats a string containing the fully-qualified path to represent a bidding_strategy resource.
   */
  public static final String formatBiddingStrategyName(String customer, String biddingStrategy) {
    return BIDDING_STRATEGY_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "bidding_strategy", biddingStrategy);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a bidding_strategy
   * resource.
   */
  public static final String parseCustomerFromBiddingStrategyName(String biddingStrategyName) {
    return BIDDING_STRATEGY_PATH_TEMPLATE.parse(biddingStrategyName).get("customer");
  }

  /**
   * Parses the bidding_strategy from the given fully-qualified path which represents a
   * bidding_strategy resource.
   */
  public static final String parseBiddingStrategyFromBiddingStrategyName(
      String biddingStrategyName) {
    return BIDDING_STRATEGY_PATH_TEMPLATE.parse(biddingStrategyName).get("bidding_strategy");
  }

  /** Constructs an instance of BiddingStrategyServiceClient with default settings. */
  public static final BiddingStrategyServiceClient create() throws IOException {
    return create(BiddingStrategyServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BiddingStrategyServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BiddingStrategyServiceClient create(BiddingStrategyServiceSettings settings)
      throws IOException {
    return new BiddingStrategyServiceClient(settings);
  }

  /**
   * Constructs an instance of BiddingStrategyServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use BiddingStrategyServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final BiddingStrategyServiceClient create(BiddingStrategyServiceStub stub) {
    return new BiddingStrategyServiceClient(stub);
  }

  /**
   * Constructs an instance of BiddingStrategyServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected BiddingStrategyServiceClient(BiddingStrategyServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((BiddingStrategyServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected BiddingStrategyServiceClient(BiddingStrategyServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BiddingStrategyServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BiddingStrategyServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested bidding strategy in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BiddingStrategyServiceClient biddingStrategyServiceClient = BiddingStrategyServiceClient.create()) {
   *   String formattedResourceName = BiddingStrategyServiceClient.formatBiddingStrategyName("[CUSTOMER]", "[BIDDING_STRATEGY]");
   *   BiddingStrategy response = biddingStrategyServiceClient.getBiddingStrategy(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the bidding strategy to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BiddingStrategy getBiddingStrategy(String resourceName) {
    BIDDING_STRATEGY_PATH_TEMPLATE.validate(resourceName, "getBiddingStrategy");
    GetBiddingStrategyRequest request =
        GetBiddingStrategyRequest.newBuilder().setResourceName(resourceName).build();
    return getBiddingStrategy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested bidding strategy in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BiddingStrategyServiceClient biddingStrategyServiceClient = BiddingStrategyServiceClient.create()) {
   *   String formattedResourceName = BiddingStrategyServiceClient.formatBiddingStrategyName("[CUSTOMER]", "[BIDDING_STRATEGY]");
   *   GetBiddingStrategyRequest request = GetBiddingStrategyRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   BiddingStrategy response = biddingStrategyServiceClient.getBiddingStrategy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final BiddingStrategy getBiddingStrategy(GetBiddingStrategyRequest request) {
    return getBiddingStrategyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested bidding strategy in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BiddingStrategyServiceClient biddingStrategyServiceClient = BiddingStrategyServiceClient.create()) {
   *   String formattedResourceName = BiddingStrategyServiceClient.formatBiddingStrategyName("[CUSTOMER]", "[BIDDING_STRATEGY]");
   *   GetBiddingStrategyRequest request = GetBiddingStrategyRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;BiddingStrategy&gt; future = biddingStrategyServiceClient.getBiddingStrategyCallable().futureCall(request);
   *   // Do something
   *   BiddingStrategy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetBiddingStrategyRequest, BiddingStrategy>
      getBiddingStrategyCallable() {
    return stub.getBiddingStrategyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes bidding strategies. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BiddingStrategyServiceClient biddingStrategyServiceClient = BiddingStrategyServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;BiddingStrategyOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateBiddingStrategiesResponse response = biddingStrategyServiceClient.mutateBiddingStrategies(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose bidding strategies are being modified.
   * @param operations The list of operations to perform on individual bidding strategies.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBiddingStrategiesResponse mutateBiddingStrategies(
      String customerId, List<BiddingStrategyOperation> operations) {

    MutateBiddingStrategiesRequest request =
        MutateBiddingStrategiesRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateBiddingStrategies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes bidding strategies. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BiddingStrategyServiceClient biddingStrategyServiceClient = BiddingStrategyServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;BiddingStrategyOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateBiddingStrategiesRequest request = MutateBiddingStrategiesRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateBiddingStrategiesResponse response = biddingStrategyServiceClient.mutateBiddingStrategies(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBiddingStrategiesResponse mutateBiddingStrategies(
      MutateBiddingStrategiesRequest request) {
    return mutateBiddingStrategiesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes bidding strategies. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BiddingStrategyServiceClient biddingStrategyServiceClient = BiddingStrategyServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;BiddingStrategyOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateBiddingStrategiesRequest request = MutateBiddingStrategiesRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateBiddingStrategiesResponse&gt; future = biddingStrategyServiceClient.mutateBiddingStrategiesCallable().futureCall(request);
   *   // Do something
   *   MutateBiddingStrategiesResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateBiddingStrategiesRequest, MutateBiddingStrategiesResponse>
      mutateBiddingStrategiesCallable() {
    return stub.mutateBiddingStrategiesCallable();
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
