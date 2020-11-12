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
package com.google.ads.googleads.v5.services;

import com.google.ads.googleads.v5.resources.PaidOrganicSearchTermView;
import com.google.ads.googleads.v5.services.stub.PaidOrganicSearchTermViewServiceStub;
import com.google.ads.googleads.v5.services.stub.PaidOrganicSearchTermViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch paid organic search term views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (PaidOrganicSearchTermViewServiceClient paidOrganicSearchTermViewServiceClient = PaidOrganicSearchTermViewServiceClient.create()) {
 *   PaidOrganicSearchTermViewName resourceName = PaidOrganicSearchTermViewName.of("[CUSTOMER]", "[PAID_ORGANIC_SEARCH_TERM_VIEW]");
 *   PaidOrganicSearchTermView response = paidOrganicSearchTermViewServiceClient.getPaidOrganicSearchTermView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the paidOrganicSearchTermViewServiceClient object to clean
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
 * PaidOrganicSearchTermViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * PaidOrganicSearchTermViewServiceSettings paidOrganicSearchTermViewServiceSettings =
 *     PaidOrganicSearchTermViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * PaidOrganicSearchTermViewServiceClient paidOrganicSearchTermViewServiceClient =
 *     PaidOrganicSearchTermViewServiceClient.create(paidOrganicSearchTermViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * PaidOrganicSearchTermViewServiceSettings paidOrganicSearchTermViewServiceSettings =
 *     PaidOrganicSearchTermViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * PaidOrganicSearchTermViewServiceClient paidOrganicSearchTermViewServiceClient =
 *     PaidOrganicSearchTermViewServiceClient.create(paidOrganicSearchTermViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class PaidOrganicSearchTermViewServiceClient implements BackgroundResource {
  private final PaidOrganicSearchTermViewServiceSettings settings;
  private final PaidOrganicSearchTermViewServiceStub stub;

  /** Constructs an instance of PaidOrganicSearchTermViewServiceClient with default settings. */
  public static final PaidOrganicSearchTermViewServiceClient create() throws IOException {
    return create(PaidOrganicSearchTermViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of PaidOrganicSearchTermViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final PaidOrganicSearchTermViewServiceClient create(
      PaidOrganicSearchTermViewServiceSettings settings) throws IOException {
    return new PaidOrganicSearchTermViewServiceClient(settings);
  }

  /**
   * Constructs an instance of PaidOrganicSearchTermViewServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer to use
   * PaidOrganicSearchTermViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final PaidOrganicSearchTermViewServiceClient create(
      PaidOrganicSearchTermViewServiceStub stub) {
    return new PaidOrganicSearchTermViewServiceClient(stub);
  }

  /**
   * Constructs an instance of PaidOrganicSearchTermViewServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected PaidOrganicSearchTermViewServiceClient(
      PaidOrganicSearchTermViewServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((PaidOrganicSearchTermViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected PaidOrganicSearchTermViewServiceClient(PaidOrganicSearchTermViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final PaidOrganicSearchTermViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public PaidOrganicSearchTermViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested paid organic search term view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PaidOrganicSearchTermViewServiceClient paidOrganicSearchTermViewServiceClient = PaidOrganicSearchTermViewServiceClient.create()) {
   *   PaidOrganicSearchTermViewName resourceName = PaidOrganicSearchTermViewName.of("[CUSTOMER]", "[PAID_ORGANIC_SEARCH_TERM_VIEW]");
   *   PaidOrganicSearchTermView response = paidOrganicSearchTermViewServiceClient.getPaidOrganicSearchTermView(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the paid organic search term view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PaidOrganicSearchTermView getPaidOrganicSearchTermView(
      PaidOrganicSearchTermViewName resourceName) {
    GetPaidOrganicSearchTermViewRequest request =
        GetPaidOrganicSearchTermViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getPaidOrganicSearchTermView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested paid organic search term view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PaidOrganicSearchTermViewServiceClient paidOrganicSearchTermViewServiceClient = PaidOrganicSearchTermViewServiceClient.create()) {
   *   PaidOrganicSearchTermViewName resourceName = PaidOrganicSearchTermViewName.of("[CUSTOMER]", "[PAID_ORGANIC_SEARCH_TERM_VIEW]");
   *   PaidOrganicSearchTermView response = paidOrganicSearchTermViewServiceClient.getPaidOrganicSearchTermView(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the paid organic search term view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PaidOrganicSearchTermView getPaidOrganicSearchTermView(String resourceName) {
    GetPaidOrganicSearchTermViewRequest request =
        GetPaidOrganicSearchTermViewRequest.newBuilder().setResourceName(resourceName).build();
    return getPaidOrganicSearchTermView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested paid organic search term view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PaidOrganicSearchTermViewServiceClient paidOrganicSearchTermViewServiceClient = PaidOrganicSearchTermViewServiceClient.create()) {
   *   PaidOrganicSearchTermViewName resourceName = PaidOrganicSearchTermViewName.of("[CUSTOMER]", "[PAID_ORGANIC_SEARCH_TERM_VIEW]");
   *   GetPaidOrganicSearchTermViewRequest request = GetPaidOrganicSearchTermViewRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   PaidOrganicSearchTermView response = paidOrganicSearchTermViewServiceClient.getPaidOrganicSearchTermView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PaidOrganicSearchTermView getPaidOrganicSearchTermView(
      GetPaidOrganicSearchTermViewRequest request) {
    return getPaidOrganicSearchTermViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested paid organic search term view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PaidOrganicSearchTermViewServiceClient paidOrganicSearchTermViewServiceClient = PaidOrganicSearchTermViewServiceClient.create()) {
   *   PaidOrganicSearchTermViewName resourceName = PaidOrganicSearchTermViewName.of("[CUSTOMER]", "[PAID_ORGANIC_SEARCH_TERM_VIEW]");
   *   GetPaidOrganicSearchTermViewRequest request = GetPaidOrganicSearchTermViewRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;PaidOrganicSearchTermView&gt; future = paidOrganicSearchTermViewServiceClient.getPaidOrganicSearchTermViewCallable().futureCall(request);
   *   // Do something
   *   PaidOrganicSearchTermView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetPaidOrganicSearchTermViewRequest, PaidOrganicSearchTermView>
      getPaidOrganicSearchTermViewCallable() {
    return stub.getPaidOrganicSearchTermViewCallable();
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
