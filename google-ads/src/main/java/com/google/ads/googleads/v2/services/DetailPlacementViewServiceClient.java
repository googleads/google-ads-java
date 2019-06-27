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
package com.google.ads.googleads.v2.services;

import com.google.ads.googleads.v2.resources.DetailPlacementView;
import com.google.ads.googleads.v2.services.stub.DetailPlacementViewServiceStub;
import com.google.ads.googleads.v2.services.stub.DetailPlacementViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch Detail Placement views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (DetailPlacementViewServiceClient detailPlacementViewServiceClient = DetailPlacementViewServiceClient.create()) {
 *   String formattedResourceName = DetailPlacementViewServiceClient.formatDetailPlacementViewName("[CUSTOMER]", "[DETAIL_PLACEMENT_VIEW]");
 *   DetailPlacementView response = detailPlacementViewServiceClient.getDetailPlacementView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the detailPlacementViewServiceClient object to clean up
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
 * DetailPlacementViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * DetailPlacementViewServiceSettings detailPlacementViewServiceSettings =
 *     DetailPlacementViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DetailPlacementViewServiceClient detailPlacementViewServiceClient =
 *     DetailPlacementViewServiceClient.create(detailPlacementViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * DetailPlacementViewServiceSettings detailPlacementViewServiceSettings =
 *     DetailPlacementViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DetailPlacementViewServiceClient detailPlacementViewServiceClient =
 *     DetailPlacementViewServiceClient.create(detailPlacementViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class DetailPlacementViewServiceClient implements BackgroundResource {
  private final DetailPlacementViewServiceSettings settings;
  private final DetailPlacementViewServiceStub stub;

  private static final PathTemplate DETAIL_PLACEMENT_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/detailPlacementViews/{detail_placement_view}");

  /**
   * Formats a string containing the fully-qualified path to represent a detail_placement_view
   * resource.
   *
   * @deprecated Use the {@link DetailPlacementViewName} class instead.
   */
  @Deprecated
  public static final String formatDetailPlacementViewName(
      String customer, String detailPlacementView) {
    return DETAIL_PLACEMENT_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "detail_placement_view", detailPlacementView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a
   * detail_placement_view resource.
   *
   * @deprecated Use the {@link DetailPlacementViewName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromDetailPlacementViewName(
      String detailPlacementViewName) {
    return DETAIL_PLACEMENT_VIEW_PATH_TEMPLATE.parse(detailPlacementViewName).get("customer");
  }

  /**
   * Parses the detail_placement_view from the given fully-qualified path which represents a
   * detail_placement_view resource.
   *
   * @deprecated Use the {@link DetailPlacementViewName} class instead.
   */
  @Deprecated
  public static final String parseDetailPlacementViewFromDetailPlacementViewName(
      String detailPlacementViewName) {
    return DETAIL_PLACEMENT_VIEW_PATH_TEMPLATE
        .parse(detailPlacementViewName)
        .get("detail_placement_view");
  }

  /** Constructs an instance of DetailPlacementViewServiceClient with default settings. */
  public static final DetailPlacementViewServiceClient create() throws IOException {
    return create(DetailPlacementViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DetailPlacementViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final DetailPlacementViewServiceClient create(
      DetailPlacementViewServiceSettings settings) throws IOException {
    return new DetailPlacementViewServiceClient(settings);
  }

  /**
   * Constructs an instance of DetailPlacementViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use DetailPlacementViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final DetailPlacementViewServiceClient create(DetailPlacementViewServiceStub stub) {
    return new DetailPlacementViewServiceClient(stub);
  }

  /**
   * Constructs an instance of DetailPlacementViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected DetailPlacementViewServiceClient(DetailPlacementViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((DetailPlacementViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected DetailPlacementViewServiceClient(DetailPlacementViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DetailPlacementViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DetailPlacementViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Detail Placement view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DetailPlacementViewServiceClient detailPlacementViewServiceClient = DetailPlacementViewServiceClient.create()) {
   *   String formattedResourceName = DetailPlacementViewServiceClient.formatDetailPlacementViewName("[CUSTOMER]", "[DETAIL_PLACEMENT_VIEW]");
   *   DetailPlacementView response = detailPlacementViewServiceClient.getDetailPlacementView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the Detail Placement view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DetailPlacementView getDetailPlacementView(String resourceName) {
    DETAIL_PLACEMENT_VIEW_PATH_TEMPLATE.validate(resourceName, "getDetailPlacementView");
    GetDetailPlacementViewRequest request =
        GetDetailPlacementViewRequest.newBuilder().setResourceName(resourceName).build();
    return getDetailPlacementView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Detail Placement view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DetailPlacementViewServiceClient detailPlacementViewServiceClient = DetailPlacementViewServiceClient.create()) {
   *   String formattedResourceName = DetailPlacementViewServiceClient.formatDetailPlacementViewName("[CUSTOMER]", "[DETAIL_PLACEMENT_VIEW]");
   *   GetDetailPlacementViewRequest request = GetDetailPlacementViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   DetailPlacementView response = detailPlacementViewServiceClient.getDetailPlacementView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DetailPlacementView getDetailPlacementView(GetDetailPlacementViewRequest request) {
    return getDetailPlacementViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Detail Placement view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DetailPlacementViewServiceClient detailPlacementViewServiceClient = DetailPlacementViewServiceClient.create()) {
   *   String formattedResourceName = DetailPlacementViewServiceClient.formatDetailPlacementViewName("[CUSTOMER]", "[DETAIL_PLACEMENT_VIEW]");
   *   GetDetailPlacementViewRequest request = GetDetailPlacementViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;DetailPlacementView&gt; future = detailPlacementViewServiceClient.getDetailPlacementViewCallable().futureCall(request);
   *   // Do something
   *   DetailPlacementView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetDetailPlacementViewRequest, DetailPlacementView>
      getDetailPlacementViewCallable() {
    return stub.getDetailPlacementViewCallable();
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
