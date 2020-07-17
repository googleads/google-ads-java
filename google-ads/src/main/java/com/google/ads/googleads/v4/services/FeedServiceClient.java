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
package com.google.ads.googleads.v4.services;

import com.google.ads.googleads.v4.resources.Feed;
import com.google.ads.googleads.v4.services.stub.FeedServiceStub;
import com.google.ads.googleads.v4.services.stub.FeedServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage feeds.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
 *   String formattedResourceName = FeedServiceClient.formatFeedName("[CUSTOMER]", "[FEED]");
 *   Feed response = feedServiceClient.getFeed(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the feedServiceClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of FeedServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * FeedServiceSettings feedServiceSettings =
 *     FeedServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeedServiceClient feedServiceClient =
 *     FeedServiceClient.create(feedServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * FeedServiceSettings feedServiceSettings =
 *     FeedServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeedServiceClient feedServiceClient =
 *     FeedServiceClient.create(feedServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class FeedServiceClient implements BackgroundResource {
  private final FeedServiceSettings settings;
  private final FeedServiceStub stub;

  private static final PathTemplate FEED_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/feeds/{feed}");

  /**
   * Formats a string containing the fully-qualified path to represent a feed resource.
   *
   * @deprecated Use the {@link FeedName} class instead.
   */
  @Deprecated
  public static final String formatFeedName(String customer, String feed) {
    return FEED_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "feed", feed);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a feed resource.
   *
   * @deprecated Use the {@link FeedName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromFeedName(String feedName) {
    return FEED_PATH_TEMPLATE.parse(feedName).get("customer");
  }

  /**
   * Parses the feed from the given fully-qualified path which represents a feed resource.
   *
   * @deprecated Use the {@link FeedName} class instead.
   */
  @Deprecated
  public static final String parseFeedFromFeedName(String feedName) {
    return FEED_PATH_TEMPLATE.parse(feedName).get("feed");
  }

  /** Constructs an instance of FeedServiceClient with default settings. */
  public static final FeedServiceClient create() throws IOException {
    return create(FeedServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeedServiceClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeedServiceClient create(FeedServiceSettings settings) throws IOException {
    return new FeedServiceClient(settings);
  }

  /**
   * Constructs an instance of FeedServiceClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use FeedServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final FeedServiceClient create(FeedServiceStub stub) {
    return new FeedServiceClient(stub);
  }

  /**
   * Constructs an instance of FeedServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected FeedServiceClient(FeedServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((FeedServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected FeedServiceClient(FeedServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FeedServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   String formattedResourceName = FeedServiceClient.formatFeedName("[CUSTOMER]", "[FEED]");
   *   Feed response = feedServiceClient.getFeed(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the feed to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feed getFeed(String resourceName) {
    FEED_PATH_TEMPLATE.validate(resourceName, "getFeed");
    GetFeedRequest request = GetFeedRequest.newBuilder().setResourceName(resourceName).build();
    return getFeed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   String formattedResourceName = FeedServiceClient.formatFeedName("[CUSTOMER]", "[FEED]");
   *   GetFeedRequest request = GetFeedRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   Feed response = feedServiceClient.getFeed(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Feed getFeed(GetFeedRequest request) {
    return getFeedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   String formattedResourceName = FeedServiceClient.formatFeedName("[CUSTOMER]", "[FEED]");
   *   GetFeedRequest request = GetFeedRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;Feed&gt; future = feedServiceClient.getFeedCallable().futureCall(request);
   *   // Do something
   *   Feed response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetFeedRequest, Feed> getFeedCallable() {
    return stub.getFeedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateFeedsResponse response = feedServiceClient.mutateFeeds(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose feeds are being modified.
   * @param operations Required. The list of operations to perform on individual feeds.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedsResponse mutateFeeds(
      String customerId,
      List<FeedOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {
    MutateFeedsRequest request =
        MutateFeedsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateFeeds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedsResponse response = feedServiceClient.mutateFeeds(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose feeds are being modified.
   * @param operations Required. The list of operations to perform on individual feeds.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedsResponse mutateFeeds(String customerId, List<FeedOperation> operations) {
    MutateFeedsRequest request =
        MutateFeedsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateFeeds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedsRequest request = MutateFeedsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateFeedsResponse response = feedServiceClient.mutateFeeds(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedsResponse mutateFeeds(MutateFeedsRequest request) {
    return mutateFeedsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedsRequest request = MutateFeedsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateFeedsResponse&gt; future = feedServiceClient.mutateFeedsCallable().futureCall(request);
   *   // Do something
   *   MutateFeedsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateFeedsRequest, MutateFeedsResponse> mutateFeedsCallable() {
    return stub.mutateFeedsCallable();
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
