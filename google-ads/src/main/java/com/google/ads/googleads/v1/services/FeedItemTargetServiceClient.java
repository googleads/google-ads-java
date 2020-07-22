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
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.FeedItemTarget;
import com.google.ads.googleads.v1.services.stub.FeedItemTargetServiceStub;
import com.google.ads.googleads.v1.services.stub.FeedItemTargetServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage feed item targets.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (FeedItemTargetServiceClient feedItemTargetServiceClient = FeedItemTargetServiceClient.create()) {
 *   FeedItemTargetName resourceName = FeedItemTargetName.of("[CUSTOMER]", "[FEED_ITEM_TARGET]");
 *   FeedItemTarget response = feedItemTargetServiceClient.getFeedItemTarget(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the feedItemTargetServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of FeedItemTargetServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * FeedItemTargetServiceSettings feedItemTargetServiceSettings =
 *     FeedItemTargetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeedItemTargetServiceClient feedItemTargetServiceClient =
 *     FeedItemTargetServiceClient.create(feedItemTargetServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * FeedItemTargetServiceSettings feedItemTargetServiceSettings =
 *     FeedItemTargetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeedItemTargetServiceClient feedItemTargetServiceClient =
 *     FeedItemTargetServiceClient.create(feedItemTargetServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class FeedItemTargetServiceClient implements BackgroundResource {
  private final FeedItemTargetServiceSettings settings;
  private final FeedItemTargetServiceStub stub;

  /** Constructs an instance of FeedItemTargetServiceClient with default settings. */
  public static final FeedItemTargetServiceClient create() throws IOException {
    return create(FeedItemTargetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeedItemTargetServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeedItemTargetServiceClient create(FeedItemTargetServiceSettings settings)
      throws IOException {
    return new FeedItemTargetServiceClient(settings);
  }

  /**
   * Constructs an instance of FeedItemTargetServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use FeedItemTargetServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final FeedItemTargetServiceClient create(FeedItemTargetServiceStub stub) {
    return new FeedItemTargetServiceClient(stub);
  }

  /**
   * Constructs an instance of FeedItemTargetServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected FeedItemTargetServiceClient(FeedItemTargetServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((FeedItemTargetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected FeedItemTargetServiceClient(FeedItemTargetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedItemTargetServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FeedItemTargetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item targets in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient = FeedItemTargetServiceClient.create()) {
   *   FeedItemTargetName resourceName = FeedItemTargetName.of("[CUSTOMER]", "[FEED_ITEM_TARGET]");
   *   FeedItemTarget response = feedItemTargetServiceClient.getFeedItemTarget(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the feed item targets to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItemTarget getFeedItemTarget(FeedItemTargetName resourceName) {
    GetFeedItemTargetRequest request =
        GetFeedItemTargetRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getFeedItemTarget(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item targets in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient = FeedItemTargetServiceClient.create()) {
   *   FeedItemTargetName resourceName = FeedItemTargetName.of("[CUSTOMER]", "[FEED_ITEM_TARGET]");
   *   FeedItemTarget response = feedItemTargetServiceClient.getFeedItemTarget(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the feed item targets to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItemTarget getFeedItemTarget(String resourceName) {
    GetFeedItemTargetRequest request =
        GetFeedItemTargetRequest.newBuilder().setResourceName(resourceName).build();
    return getFeedItemTarget(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item targets in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient = FeedItemTargetServiceClient.create()) {
   *   FeedItemTargetName resourceName = FeedItemTargetName.of("[CUSTOMER]", "[FEED_ITEM_TARGET]");
   *   GetFeedItemTargetRequest request = GetFeedItemTargetRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   FeedItemTarget response = feedItemTargetServiceClient.getFeedItemTarget(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItemTarget getFeedItemTarget(GetFeedItemTargetRequest request) {
    return getFeedItemTargetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item targets in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient = FeedItemTargetServiceClient.create()) {
   *   FeedItemTargetName resourceName = FeedItemTargetName.of("[CUSTOMER]", "[FEED_ITEM_TARGET]");
   *   GetFeedItemTargetRequest request = GetFeedItemTargetRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;FeedItemTarget&gt; future = feedItemTargetServiceClient.getFeedItemTargetCallable().futureCall(request);
   *   // Do something
   *   FeedItemTarget response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetFeedItemTargetRequest, FeedItemTarget> getFeedItemTargetCallable() {
    return stub.getFeedItemTargetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes feed item targets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient = FeedItemTargetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemTargetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedItemTargetsResponse response = feedItemTargetServiceClient.mutateFeedItemTargets(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose feed item targets are being modified.
   * @param operations Required. The list of operations to perform on individual feed item targets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemTargetsResponse mutateFeedItemTargets(
      String customerId, List<FeedItemTargetOperation> operations) {
    MutateFeedItemTargetsRequest request =
        MutateFeedItemTargetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateFeedItemTargets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes feed item targets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient = FeedItemTargetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemTargetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedItemTargetsRequest request = MutateFeedItemTargetsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateFeedItemTargetsResponse response = feedItemTargetServiceClient.mutateFeedItemTargets(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemTargetsResponse mutateFeedItemTargets(
      MutateFeedItemTargetsRequest request) {
    return mutateFeedItemTargetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes feed item targets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient = FeedItemTargetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemTargetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedItemTargetsRequest request = MutateFeedItemTargetsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateFeedItemTargetsResponse&gt; future = feedItemTargetServiceClient.mutateFeedItemTargetsCallable().futureCall(request);
   *   // Do something
   *   MutateFeedItemTargetsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateFeedItemTargetsRequest, MutateFeedItemTargetsResponse>
      mutateFeedItemTargetsCallable() {
    return stub.mutateFeedItemTargetsCallable();
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
