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

import com.google.ads.googleads.v4.resources.IncomeRangeView;
import com.google.ads.googleads.v4.services.stub.IncomeRangeViewServiceStub;
import com.google.ads.googleads.v4.services.stub.IncomeRangeViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage income range views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (IncomeRangeViewServiceClient incomeRangeViewServiceClient = IncomeRangeViewServiceClient.create()) {
 *   String formattedResourceName = IncomeRangeViewServiceClient.formatIncomeRangeViewName("[CUSTOMER]", "[INCOME_RANGE_VIEW]");
 *   IncomeRangeView response = incomeRangeViewServiceClient.getIncomeRangeView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the incomeRangeViewServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of IncomeRangeViewServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * IncomeRangeViewServiceSettings incomeRangeViewServiceSettings =
 *     IncomeRangeViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * IncomeRangeViewServiceClient incomeRangeViewServiceClient =
 *     IncomeRangeViewServiceClient.create(incomeRangeViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * IncomeRangeViewServiceSettings incomeRangeViewServiceSettings =
 *     IncomeRangeViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * IncomeRangeViewServiceClient incomeRangeViewServiceClient =
 *     IncomeRangeViewServiceClient.create(incomeRangeViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class IncomeRangeViewServiceClient implements BackgroundResource {
  private final IncomeRangeViewServiceSettings settings;
  private final IncomeRangeViewServiceStub stub;

  private static final PathTemplate INCOME_RANGE_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/incomeRangeViews/{income_range_view}");

  /**
   * Formats a string containing the fully-qualified path to represent a income_range_view resource.
   *
   * @deprecated Use the {@link IncomeRangeViewName} class instead.
   */
  @Deprecated
  public static final String formatIncomeRangeViewName(String customer, String incomeRangeView) {
    return INCOME_RANGE_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "income_range_view", incomeRangeView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a income_range_view
   * resource.
   *
   * @deprecated Use the {@link IncomeRangeViewName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromIncomeRangeViewName(String incomeRangeViewName) {
    return INCOME_RANGE_VIEW_PATH_TEMPLATE.parse(incomeRangeViewName).get("customer");
  }

  /**
   * Parses the income_range_view from the given fully-qualified path which represents a
   * income_range_view resource.
   *
   * @deprecated Use the {@link IncomeRangeViewName} class instead.
   */
  @Deprecated
  public static final String parseIncomeRangeViewFromIncomeRangeViewName(
      String incomeRangeViewName) {
    return INCOME_RANGE_VIEW_PATH_TEMPLATE.parse(incomeRangeViewName).get("income_range_view");
  }

  /** Constructs an instance of IncomeRangeViewServiceClient with default settings. */
  public static final IncomeRangeViewServiceClient create() throws IOException {
    return create(IncomeRangeViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of IncomeRangeViewServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final IncomeRangeViewServiceClient create(IncomeRangeViewServiceSettings settings)
      throws IOException {
    return new IncomeRangeViewServiceClient(settings);
  }

  /**
   * Constructs an instance of IncomeRangeViewServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use IncomeRangeViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final IncomeRangeViewServiceClient create(IncomeRangeViewServiceStub stub) {
    return new IncomeRangeViewServiceClient(stub);
  }

  /**
   * Constructs an instance of IncomeRangeViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected IncomeRangeViewServiceClient(IncomeRangeViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((IncomeRangeViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected IncomeRangeViewServiceClient(IncomeRangeViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final IncomeRangeViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public IncomeRangeViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested income range view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncomeRangeViewServiceClient incomeRangeViewServiceClient = IncomeRangeViewServiceClient.create()) {
   *   String formattedResourceName = IncomeRangeViewServiceClient.formatIncomeRangeViewName("[CUSTOMER]", "[INCOME_RANGE_VIEW]");
   *   IncomeRangeView response = incomeRangeViewServiceClient.getIncomeRangeView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the income range view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncomeRangeView getIncomeRangeView(String resourceName) {
    INCOME_RANGE_VIEW_PATH_TEMPLATE.validate(resourceName, "getIncomeRangeView");
    GetIncomeRangeViewRequest request =
        GetIncomeRangeViewRequest.newBuilder().setResourceName(resourceName).build();
    return getIncomeRangeView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested income range view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncomeRangeViewServiceClient incomeRangeViewServiceClient = IncomeRangeViewServiceClient.create()) {
   *   String formattedResourceName = IncomeRangeViewServiceClient.formatIncomeRangeViewName("[CUSTOMER]", "[INCOME_RANGE_VIEW]");
   *   GetIncomeRangeViewRequest request = GetIncomeRangeViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   IncomeRangeView response = incomeRangeViewServiceClient.getIncomeRangeView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final IncomeRangeView getIncomeRangeView(GetIncomeRangeViewRequest request) {
    return getIncomeRangeViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested income range view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (IncomeRangeViewServiceClient incomeRangeViewServiceClient = IncomeRangeViewServiceClient.create()) {
   *   String formattedResourceName = IncomeRangeViewServiceClient.formatIncomeRangeViewName("[CUSTOMER]", "[INCOME_RANGE_VIEW]");
   *   GetIncomeRangeViewRequest request = GetIncomeRangeViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;IncomeRangeView&gt; future = incomeRangeViewServiceClient.getIncomeRangeViewCallable().futureCall(request);
   *   // Do something
   *   IncomeRangeView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetIncomeRangeViewRequest, IncomeRangeView>
      getIncomeRangeViewCallable() {
    return stub.getIncomeRangeViewCallable();
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
