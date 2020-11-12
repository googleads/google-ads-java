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
package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.FeedItemSetLink;
import com.google.ads.googleads.v6.services.stub.FeedItemSetLinkServiceStub;
import com.google.ads.googleads.v6.services.stub.FeedItemSetLinkServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage feed item set links.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient = FeedItemSetLinkServiceClient.create()) {
 *   FeedItemSetLinkName resourceName = FeedItemSetLinkName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]");
 *   FeedItemSetLink response = feedItemSetLinkServiceClient.getFeedItemSetLink(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the feedItemSetLinkServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
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
 * <p>This class can be customized by passing in a custom instance of FeedItemSetLinkServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * FeedItemSetLinkServiceSettings feedItemSetLinkServiceSettings =
 *     FeedItemSetLinkServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeedItemSetLinkServiceClient feedItemSetLinkServiceClient =
 *     FeedItemSetLinkServiceClient.create(feedItemSetLinkServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * FeedItemSetLinkServiceSettings feedItemSetLinkServiceSettings =
 *     FeedItemSetLinkServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeedItemSetLinkServiceClient feedItemSetLinkServiceClient =
 *     FeedItemSetLinkServiceClient.create(feedItemSetLinkServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class FeedItemSetLinkServiceClient implements BackgroundResource {
  private final FeedItemSetLinkServiceSettings settings;
  private final FeedItemSetLinkServiceStub stub;

  /** Constructs an instance of FeedItemSetLinkServiceClient with default settings. */
  public static final FeedItemSetLinkServiceClient create() throws IOException {
    return create(FeedItemSetLinkServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeedItemSetLinkServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeedItemSetLinkServiceClient create(FeedItemSetLinkServiceSettings settings)
      throws IOException {
    return new FeedItemSetLinkServiceClient(settings);
  }

  /**
   * Constructs an instance of FeedItemSetLinkServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use FeedItemSetLinkServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final FeedItemSetLinkServiceClient create(FeedItemSetLinkServiceStub stub) {
    return new FeedItemSetLinkServiceClient(stub);
  }

  /**
   * Constructs an instance of FeedItemSetLinkServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected FeedItemSetLinkServiceClient(FeedItemSetLinkServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((FeedItemSetLinkServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected FeedItemSetLinkServiceClient(FeedItemSetLinkServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedItemSetLinkServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FeedItemSetLinkServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item set link in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient = FeedItemSetLinkServiceClient.create()) {
   *   FeedItemSetLinkName resourceName = FeedItemSetLinkName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]");
   *   FeedItemSetLink response = feedItemSetLinkServiceClient.getFeedItemSetLink(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the feed item set link to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItemSetLink getFeedItemSetLink(FeedItemSetLinkName resourceName) {
    GetFeedItemSetLinkRequest request =
        GetFeedItemSetLinkRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getFeedItemSetLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item set link in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient = FeedItemSetLinkServiceClient.create()) {
   *   FeedItemSetLinkName resourceName = FeedItemSetLinkName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]");
   *   FeedItemSetLink response = feedItemSetLinkServiceClient.getFeedItemSetLink(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the feed item set link to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItemSetLink getFeedItemSetLink(String resourceName) {
    GetFeedItemSetLinkRequest request =
        GetFeedItemSetLinkRequest.newBuilder().setResourceName(resourceName).build();
    return getFeedItemSetLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item set link in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient = FeedItemSetLinkServiceClient.create()) {
   *   FeedItemSetLinkName resourceName = FeedItemSetLinkName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]");
   *   GetFeedItemSetLinkRequest request = GetFeedItemSetLinkRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   FeedItemSetLink response = feedItemSetLinkServiceClient.getFeedItemSetLink(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItemSetLink getFeedItemSetLink(GetFeedItemSetLinkRequest request) {
    return getFeedItemSetLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed item set link in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient = FeedItemSetLinkServiceClient.create()) {
   *   FeedItemSetLinkName resourceName = FeedItemSetLinkName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]");
   *   GetFeedItemSetLinkRequest request = GetFeedItemSetLinkRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;FeedItemSetLink&gt; future = feedItemSetLinkServiceClient.getFeedItemSetLinkCallable().futureCall(request);
   *   // Do something
   *   FeedItemSetLink response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetFeedItemSetLinkRequest, FeedItemSetLink>
      getFeedItemSetLinkCallable() {
    return stub.getFeedItemSetLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feed item set links.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient = FeedItemSetLinkServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemSetLinkOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedItemSetLinksResponse response = feedItemSetLinkServiceClient.mutateFeedItemSetLinks(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose feed item set links are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual feed item set
   *     links.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemSetLinksResponse mutateFeedItemSetLinks(
      String customerId, List<FeedItemSetLinkOperation> operations) {
    MutateFeedItemSetLinksRequest request =
        MutateFeedItemSetLinksRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateFeedItemSetLinks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feed item set links.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient = FeedItemSetLinkServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemSetLinkOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedItemSetLinksRequest request = MutateFeedItemSetLinksRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateFeedItemSetLinksResponse response = feedItemSetLinkServiceClient.mutateFeedItemSetLinks(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemSetLinksResponse mutateFeedItemSetLinks(
      MutateFeedItemSetLinksRequest request) {
    return mutateFeedItemSetLinksCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feed item set links.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient = FeedItemSetLinkServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedItemSetLinkOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedItemSetLinksRequest request = MutateFeedItemSetLinksRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateFeedItemSetLinksResponse&gt; future = feedItemSetLinkServiceClient.mutateFeedItemSetLinksCallable().futureCall(request);
   *   // Do something
   *   MutateFeedItemSetLinksResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateFeedItemSetLinksRequest, MutateFeedItemSetLinksResponse>
      mutateFeedItemSetLinksCallable() {
    return stub.mutateFeedItemSetLinksCallable();
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
