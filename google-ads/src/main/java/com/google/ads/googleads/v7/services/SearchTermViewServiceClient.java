/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.resources.SearchTermView;
import com.google.ads.googleads.v7.resources.SearchTermViewName;
import com.google.ads.googleads.v7.services.stub.SearchTermViewServiceStub;
import com.google.ads.googleads.v7.services.stub.SearchTermViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage search term views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (SearchTermViewServiceClient searchTermViewServiceClient =
 *     SearchTermViewServiceClient.create()) {
 *   SearchTermViewName resourceName =
 *       SearchTermViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[AD_GROUP_ID]", "[QUERY]");
 *   SearchTermView response = searchTermViewServiceClient.getSearchTermView(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the SearchTermViewServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of SearchTermViewServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * SearchTermViewServiceSettings searchTermViewServiceSettings =
 *     SearchTermViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SearchTermViewServiceClient searchTermViewServiceClient =
 *     SearchTermViewServiceClient.create(searchTermViewServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * SearchTermViewServiceSettings searchTermViewServiceSettings =
 *     SearchTermViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SearchTermViewServiceClient searchTermViewServiceClient =
 *     SearchTermViewServiceClient.create(searchTermViewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class SearchTermViewServiceClient implements BackgroundResource {
  private final SearchTermViewServiceSettings settings;
  private final SearchTermViewServiceStub stub;

  /** Constructs an instance of SearchTermViewServiceClient with default settings. */
  public static final SearchTermViewServiceClient create() throws IOException {
    return create(SearchTermViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SearchTermViewServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SearchTermViewServiceClient create(SearchTermViewServiceSettings settings)
      throws IOException {
    return new SearchTermViewServiceClient(settings);
  }

  /**
   * Constructs an instance of SearchTermViewServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(SearchTermViewServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SearchTermViewServiceClient create(SearchTermViewServiceStub stub) {
    return new SearchTermViewServiceClient(stub);
  }

  /**
   * Constructs an instance of SearchTermViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected SearchTermViewServiceClient(SearchTermViewServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SearchTermViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SearchTermViewServiceClient(SearchTermViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SearchTermViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SearchTermViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the attributes of the requested search term view.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SearchTermViewServiceClient searchTermViewServiceClient =
   *     SearchTermViewServiceClient.create()) {
   *   SearchTermViewName resourceName =
   *       SearchTermViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[AD_GROUP_ID]", "[QUERY]");
   *   SearchTermView response = searchTermViewServiceClient.getSearchTermView(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the search term view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchTermView getSearchTermView(SearchTermViewName resourceName) {
    GetSearchTermViewRequest request =
        GetSearchTermViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getSearchTermView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the attributes of the requested search term view.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SearchTermViewServiceClient searchTermViewServiceClient =
   *     SearchTermViewServiceClient.create()) {
   *   String resourceName =
   *       SearchTermViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[AD_GROUP_ID]", "[QUERY]")
   *           .toString();
   *   SearchTermView response = searchTermViewServiceClient.getSearchTermView(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the search term view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchTermView getSearchTermView(String resourceName) {
    GetSearchTermViewRequest request =
        GetSearchTermViewRequest.newBuilder().setResourceName(resourceName).build();
    return getSearchTermView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the attributes of the requested search term view.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SearchTermViewServiceClient searchTermViewServiceClient =
   *     SearchTermViewServiceClient.create()) {
   *   GetSearchTermViewRequest request =
   *       GetSearchTermViewRequest.newBuilder()
   *           .setResourceName(
   *               SearchTermViewName.of(
   *                       "[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[AD_GROUP_ID]", "[QUERY]")
   *                   .toString())
   *           .build();
   *   SearchTermView response = searchTermViewServiceClient.getSearchTermView(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchTermView getSearchTermView(GetSearchTermViewRequest request) {
    return getSearchTermViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the attributes of the requested search term view.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SearchTermViewServiceClient searchTermViewServiceClient =
   *     SearchTermViewServiceClient.create()) {
   *   GetSearchTermViewRequest request =
   *       GetSearchTermViewRequest.newBuilder()
   *           .setResourceName(
   *               SearchTermViewName.of(
   *                       "[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[AD_GROUP_ID]", "[QUERY]")
   *                   .toString())
   *           .build();
   *   ApiFuture<SearchTermView> future =
   *       searchTermViewServiceClient.getSearchTermViewCallable().futureCall(request);
   *   // Do something.
   *   SearchTermView response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetSearchTermViewRequest, SearchTermView> getSearchTermViewCallable() {
    return stub.getSearchTermViewCallable();
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
