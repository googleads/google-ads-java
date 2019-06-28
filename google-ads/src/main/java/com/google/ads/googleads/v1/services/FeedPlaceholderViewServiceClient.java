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
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.FeedPlaceholderView;
import com.google.ads.googleads.v1.services.stub.FeedPlaceholderViewServiceStub;
import com.google.ads.googleads.v1.services.stub.FeedPlaceholderViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch feed placeholder views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (FeedPlaceholderViewServiceClient feedPlaceholderViewServiceClient = FeedPlaceholderViewServiceClient.create()) {
 *   String formattedResourceName = FeedPlaceholderViewServiceClient.formatFeedPlaceholderViewName("[CUSTOMER]", "[FEED_PLACEHOLDER_VIEW]");
 *   FeedPlaceholderView response = feedPlaceholderViewServiceClient.getFeedPlaceholderView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the feedPlaceholderViewServiceClient object to clean up
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
 * FeedPlaceholderViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * FeedPlaceholderViewServiceSettings feedPlaceholderViewServiceSettings =
 *     FeedPlaceholderViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeedPlaceholderViewServiceClient feedPlaceholderViewServiceClient =
 *     FeedPlaceholderViewServiceClient.create(feedPlaceholderViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * FeedPlaceholderViewServiceSettings feedPlaceholderViewServiceSettings =
 *     FeedPlaceholderViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeedPlaceholderViewServiceClient feedPlaceholderViewServiceClient =
 *     FeedPlaceholderViewServiceClient.create(feedPlaceholderViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class FeedPlaceholderViewServiceClient implements BackgroundResource {
  private final FeedPlaceholderViewServiceSettings settings;
  private final FeedPlaceholderViewServiceStub stub;

  private static final PathTemplate FEED_PLACEHOLDER_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/feedPlaceholderViews/{feed_placeholder_view}");

  /**
   * Formats a string containing the fully-qualified path to represent a feed_placeholder_view
   * resource.
   */
  public static final String formatFeedPlaceholderViewName(
      String customer, String feedPlaceholderView) {
    return FEED_PLACEHOLDER_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "feed_placeholder_view", feedPlaceholderView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a
   * feed_placeholder_view resource.
   */
  public static final String parseCustomerFromFeedPlaceholderViewName(
      String feedPlaceholderViewName) {
    return FEED_PLACEHOLDER_VIEW_PATH_TEMPLATE.parse(feedPlaceholderViewName).get("customer");
  }

  /**
   * Parses the feed_placeholder_view from the given fully-qualified path which represents a
   * feed_placeholder_view resource.
   */
  public static final String parseFeedPlaceholderViewFromFeedPlaceholderViewName(
      String feedPlaceholderViewName) {
    return FEED_PLACEHOLDER_VIEW_PATH_TEMPLATE
        .parse(feedPlaceholderViewName)
        .get("feed_placeholder_view");
  }

  /** Constructs an instance of FeedPlaceholderViewServiceClient with default settings. */
  public static final FeedPlaceholderViewServiceClient create() throws IOException {
    return create(FeedPlaceholderViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeedPlaceholderViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final FeedPlaceholderViewServiceClient create(
      FeedPlaceholderViewServiceSettings settings) throws IOException {
    return new FeedPlaceholderViewServiceClient(settings);
  }

  /**
   * Constructs an instance of FeedPlaceholderViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use FeedPlaceholderViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final FeedPlaceholderViewServiceClient create(FeedPlaceholderViewServiceStub stub) {
    return new FeedPlaceholderViewServiceClient(stub);
  }

  /**
   * Constructs an instance of FeedPlaceholderViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected FeedPlaceholderViewServiceClient(FeedPlaceholderViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((FeedPlaceholderViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected FeedPlaceholderViewServiceClient(FeedPlaceholderViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedPlaceholderViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FeedPlaceholderViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed placeholder view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedPlaceholderViewServiceClient feedPlaceholderViewServiceClient = FeedPlaceholderViewServiceClient.create()) {
   *   String formattedResourceName = FeedPlaceholderViewServiceClient.formatFeedPlaceholderViewName("[CUSTOMER]", "[FEED_PLACEHOLDER_VIEW]");
   *   FeedPlaceholderView response = feedPlaceholderViewServiceClient.getFeedPlaceholderView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the feed placeholder view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedPlaceholderView getFeedPlaceholderView(String resourceName) {
    FEED_PLACEHOLDER_VIEW_PATH_TEMPLATE.validate(resourceName, "getFeedPlaceholderView");
    GetFeedPlaceholderViewRequest request =
        GetFeedPlaceholderViewRequest.newBuilder().setResourceName(resourceName).build();
    return getFeedPlaceholderView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed placeholder view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedPlaceholderViewServiceClient feedPlaceholderViewServiceClient = FeedPlaceholderViewServiceClient.create()) {
   *   String formattedResourceName = FeedPlaceholderViewServiceClient.formatFeedPlaceholderViewName("[CUSTOMER]", "[FEED_PLACEHOLDER_VIEW]");
   *   GetFeedPlaceholderViewRequest request = GetFeedPlaceholderViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   FeedPlaceholderView response = feedPlaceholderViewServiceClient.getFeedPlaceholderView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedPlaceholderView getFeedPlaceholderView(GetFeedPlaceholderViewRequest request) {
    return getFeedPlaceholderViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed placeholder view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedPlaceholderViewServiceClient feedPlaceholderViewServiceClient = FeedPlaceholderViewServiceClient.create()) {
   *   String formattedResourceName = FeedPlaceholderViewServiceClient.formatFeedPlaceholderViewName("[CUSTOMER]", "[FEED_PLACEHOLDER_VIEW]");
   *   GetFeedPlaceholderViewRequest request = GetFeedPlaceholderViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;FeedPlaceholderView&gt; future = feedPlaceholderViewServiceClient.getFeedPlaceholderViewCallable().futureCall(request);
   *   // Do something
   *   FeedPlaceholderView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetFeedPlaceholderViewRequest, FeedPlaceholderView>
      getFeedPlaceholderViewCallable() {
    return stub.getFeedPlaceholderViewCallable();
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
