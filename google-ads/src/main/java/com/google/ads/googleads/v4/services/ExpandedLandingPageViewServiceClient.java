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

import com.google.ads.googleads.v4.resources.ExpandedLandingPageView;
import com.google.ads.googleads.v4.services.stub.ExpandedLandingPageViewServiceStub;
import com.google.ads.googleads.v4.services.stub.ExpandedLandingPageViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch expanded landing page views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ExpandedLandingPageViewServiceClient expandedLandingPageViewServiceClient = ExpandedLandingPageViewServiceClient.create()) {
 *   String formattedResourceName = ExpandedLandingPageViewServiceClient.formatExpandedLandingPageViewName("[CUSTOMER]", "[EXPANDED_LANDING_PAGE_VIEW]");
 *   ExpandedLandingPageView response = expandedLandingPageViewServiceClient.getExpandedLandingPageView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the expandedLandingPageViewServiceClient object to clean
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
 * ExpandedLandingPageViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ExpandedLandingPageViewServiceSettings expandedLandingPageViewServiceSettings =
 *     ExpandedLandingPageViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ExpandedLandingPageViewServiceClient expandedLandingPageViewServiceClient =
 *     ExpandedLandingPageViewServiceClient.create(expandedLandingPageViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ExpandedLandingPageViewServiceSettings expandedLandingPageViewServiceSettings =
 *     ExpandedLandingPageViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ExpandedLandingPageViewServiceClient expandedLandingPageViewServiceClient =
 *     ExpandedLandingPageViewServiceClient.create(expandedLandingPageViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ExpandedLandingPageViewServiceClient implements BackgroundResource {
  private final ExpandedLandingPageViewServiceSettings settings;
  private final ExpandedLandingPageViewServiceStub stub;

  private static final PathTemplate EXPANDED_LANDING_PAGE_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/expandedLandingPageViews/{expanded_landing_page_view}");

  /**
   * Formats a string containing the fully-qualified path to represent a expanded_landing_page_view
   * resource.
   *
   * @deprecated Use the {@link ExpandedLandingPageViewName} class instead.
   */
  @Deprecated
  public static final String formatExpandedLandingPageViewName(
      String customer, String expandedLandingPageView) {
    return EXPANDED_LANDING_PAGE_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "expanded_landing_page_view", expandedLandingPageView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a
   * expanded_landing_page_view resource.
   *
   * @deprecated Use the {@link ExpandedLandingPageViewName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromExpandedLandingPageViewName(
      String expandedLandingPageViewName) {
    return EXPANDED_LANDING_PAGE_VIEW_PATH_TEMPLATE
        .parse(expandedLandingPageViewName)
        .get("customer");
  }

  /**
   * Parses the expanded_landing_page_view from the given fully-qualified path which represents a
   * expanded_landing_page_view resource.
   *
   * @deprecated Use the {@link ExpandedLandingPageViewName} class instead.
   */
  @Deprecated
  public static final String parseExpandedLandingPageViewFromExpandedLandingPageViewName(
      String expandedLandingPageViewName) {
    return EXPANDED_LANDING_PAGE_VIEW_PATH_TEMPLATE
        .parse(expandedLandingPageViewName)
        .get("expanded_landing_page_view");
  }

  /** Constructs an instance of ExpandedLandingPageViewServiceClient with default settings. */
  public static final ExpandedLandingPageViewServiceClient create() throws IOException {
    return create(ExpandedLandingPageViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ExpandedLandingPageViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ExpandedLandingPageViewServiceClient create(
      ExpandedLandingPageViewServiceSettings settings) throws IOException {
    return new ExpandedLandingPageViewServiceClient(settings);
  }

  /**
   * Constructs an instance of ExpandedLandingPageViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use ExpandedLandingPageViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ExpandedLandingPageViewServiceClient create(
      ExpandedLandingPageViewServiceStub stub) {
    return new ExpandedLandingPageViewServiceClient(stub);
  }

  /**
   * Constructs an instance of ExpandedLandingPageViewServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ExpandedLandingPageViewServiceClient(ExpandedLandingPageViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((ExpandedLandingPageViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ExpandedLandingPageViewServiceClient(ExpandedLandingPageViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ExpandedLandingPageViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ExpandedLandingPageViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested expanded landing page view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExpandedLandingPageViewServiceClient expandedLandingPageViewServiceClient = ExpandedLandingPageViewServiceClient.create()) {
   *   String formattedResourceName = ExpandedLandingPageViewServiceClient.formatExpandedLandingPageViewName("[CUSTOMER]", "[EXPANDED_LANDING_PAGE_VIEW]");
   *   ExpandedLandingPageView response = expandedLandingPageViewServiceClient.getExpandedLandingPageView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the expanded landing page view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ExpandedLandingPageView getExpandedLandingPageView(String resourceName) {
    EXPANDED_LANDING_PAGE_VIEW_PATH_TEMPLATE.validate(resourceName, "getExpandedLandingPageView");
    GetExpandedLandingPageViewRequest request =
        GetExpandedLandingPageViewRequest.newBuilder().setResourceName(resourceName).build();
    return getExpandedLandingPageView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested expanded landing page view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExpandedLandingPageViewServiceClient expandedLandingPageViewServiceClient = ExpandedLandingPageViewServiceClient.create()) {
   *   String formattedResourceName = ExpandedLandingPageViewServiceClient.formatExpandedLandingPageViewName("[CUSTOMER]", "[EXPANDED_LANDING_PAGE_VIEW]");
   *   GetExpandedLandingPageViewRequest request = GetExpandedLandingPageViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ExpandedLandingPageView response = expandedLandingPageViewServiceClient.getExpandedLandingPageView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ExpandedLandingPageView getExpandedLandingPageView(
      GetExpandedLandingPageViewRequest request) {
    return getExpandedLandingPageViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested expanded landing page view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExpandedLandingPageViewServiceClient expandedLandingPageViewServiceClient = ExpandedLandingPageViewServiceClient.create()) {
   *   String formattedResourceName = ExpandedLandingPageViewServiceClient.formatExpandedLandingPageViewName("[CUSTOMER]", "[EXPANDED_LANDING_PAGE_VIEW]");
   *   GetExpandedLandingPageViewRequest request = GetExpandedLandingPageViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;ExpandedLandingPageView&gt; future = expandedLandingPageViewServiceClient.getExpandedLandingPageViewCallable().futureCall(request);
   *   // Do something
   *   ExpandedLandingPageView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetExpandedLandingPageViewRequest, ExpandedLandingPageView>
      getExpandedLandingPageViewCallable() {
    return stub.getExpandedLandingPageViewCallable();
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
