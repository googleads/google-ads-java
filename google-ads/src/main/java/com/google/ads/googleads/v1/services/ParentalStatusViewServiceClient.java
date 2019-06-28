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

import com.google.ads.googleads.v1.resources.ParentalStatusView;
import com.google.ads.googleads.v1.services.stub.ParentalStatusViewServiceStub;
import com.google.ads.googleads.v1.services.stub.ParentalStatusViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage parental status views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ParentalStatusViewServiceClient parentalStatusViewServiceClient = ParentalStatusViewServiceClient.create()) {
 *   String formattedResourceName = ParentalStatusViewServiceClient.formatParentalStatusViewName("[CUSTOMER]", "[PARENTAL_STATUS_VIEW]");
 *   ParentalStatusView response = parentalStatusViewServiceClient.getParentalStatusView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the parentalStatusViewServiceClient object to clean up
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
 * ParentalStatusViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ParentalStatusViewServiceSettings parentalStatusViewServiceSettings =
 *     ParentalStatusViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ParentalStatusViewServiceClient parentalStatusViewServiceClient =
 *     ParentalStatusViewServiceClient.create(parentalStatusViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ParentalStatusViewServiceSettings parentalStatusViewServiceSettings =
 *     ParentalStatusViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ParentalStatusViewServiceClient parentalStatusViewServiceClient =
 *     ParentalStatusViewServiceClient.create(parentalStatusViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ParentalStatusViewServiceClient implements BackgroundResource {
  private final ParentalStatusViewServiceSettings settings;
  private final ParentalStatusViewServiceStub stub;

  private static final PathTemplate PARENTAL_STATUS_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/parentalStatusViews/{parental_status_view}");

  /**
   * Formats a string containing the fully-qualified path to represent a parental_status_view
   * resource.
   */
  public static final String formatParentalStatusViewName(
      String customer, String parentalStatusView) {
    return PARENTAL_STATUS_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "parental_status_view", parentalStatusView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a parental_status_view
   * resource.
   */
  public static final String parseCustomerFromParentalStatusViewName(
      String parentalStatusViewName) {
    return PARENTAL_STATUS_VIEW_PATH_TEMPLATE.parse(parentalStatusViewName).get("customer");
  }

  /**
   * Parses the parental_status_view from the given fully-qualified path which represents a
   * parental_status_view resource.
   */
  public static final String parseParentalStatusViewFromParentalStatusViewName(
      String parentalStatusViewName) {
    return PARENTAL_STATUS_VIEW_PATH_TEMPLATE
        .parse(parentalStatusViewName)
        .get("parental_status_view");
  }

  /** Constructs an instance of ParentalStatusViewServiceClient with default settings. */
  public static final ParentalStatusViewServiceClient create() throws IOException {
    return create(ParentalStatusViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ParentalStatusViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ParentalStatusViewServiceClient create(
      ParentalStatusViewServiceSettings settings) throws IOException {
    return new ParentalStatusViewServiceClient(settings);
  }

  /**
   * Constructs an instance of ParentalStatusViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use ParentalStatusViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ParentalStatusViewServiceClient create(ParentalStatusViewServiceStub stub) {
    return new ParentalStatusViewServiceClient(stub);
  }

  /**
   * Constructs an instance of ParentalStatusViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ParentalStatusViewServiceClient(ParentalStatusViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((ParentalStatusViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ParentalStatusViewServiceClient(ParentalStatusViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ParentalStatusViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ParentalStatusViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested parental status view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ParentalStatusViewServiceClient parentalStatusViewServiceClient = ParentalStatusViewServiceClient.create()) {
   *   String formattedResourceName = ParentalStatusViewServiceClient.formatParentalStatusViewName("[CUSTOMER]", "[PARENTAL_STATUS_VIEW]");
   *   ParentalStatusView response = parentalStatusViewServiceClient.getParentalStatusView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the parental status view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ParentalStatusView getParentalStatusView(String resourceName) {
    PARENTAL_STATUS_VIEW_PATH_TEMPLATE.validate(resourceName, "getParentalStatusView");
    GetParentalStatusViewRequest request =
        GetParentalStatusViewRequest.newBuilder().setResourceName(resourceName).build();
    return getParentalStatusView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested parental status view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ParentalStatusViewServiceClient parentalStatusViewServiceClient = ParentalStatusViewServiceClient.create()) {
   *   String formattedResourceName = ParentalStatusViewServiceClient.formatParentalStatusViewName("[CUSTOMER]", "[PARENTAL_STATUS_VIEW]");
   *   GetParentalStatusViewRequest request = GetParentalStatusViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ParentalStatusView response = parentalStatusViewServiceClient.getParentalStatusView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ParentalStatusView getParentalStatusView(GetParentalStatusViewRequest request) {
    return getParentalStatusViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested parental status view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ParentalStatusViewServiceClient parentalStatusViewServiceClient = ParentalStatusViewServiceClient.create()) {
   *   String formattedResourceName = ParentalStatusViewServiceClient.formatParentalStatusViewName("[CUSTOMER]", "[PARENTAL_STATUS_VIEW]");
   *   GetParentalStatusViewRequest request = GetParentalStatusViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;ParentalStatusView&gt; future = parentalStatusViewServiceClient.getParentalStatusViewCallable().futureCall(request);
   *   // Do something
   *   ParentalStatusView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetParentalStatusViewRequest, ParentalStatusView>
      getParentalStatusViewCallable() {
    return stub.getParentalStatusViewCallable();
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
