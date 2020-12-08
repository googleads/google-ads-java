/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.GoogleAdsField;
import com.google.ads.googleads.v6.resources.GoogleAdsFieldName;
import com.google.ads.googleads.v6.services.stub.GoogleAdsFieldServiceStub;
import com.google.ads.googleads.v6.services.stub.GoogleAdsFieldServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch Google Ads API fields.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the GoogleAdsFieldServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of GoogleAdsFieldServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * GoogleAdsFieldServiceSettings googleAdsFieldServiceSettings =
 *     GoogleAdsFieldServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GoogleAdsFieldServiceClient googleAdsFieldServiceClient =
 *     GoogleAdsFieldServiceClient.create(googleAdsFieldServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * GoogleAdsFieldServiceSettings googleAdsFieldServiceSettings =
 *     GoogleAdsFieldServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * GoogleAdsFieldServiceClient googleAdsFieldServiceClient =
 *     GoogleAdsFieldServiceClient.create(googleAdsFieldServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class GoogleAdsFieldServiceClient implements BackgroundResource {
  private final GoogleAdsFieldServiceSettings settings;
  private final GoogleAdsFieldServiceStub stub;

  /** Constructs an instance of GoogleAdsFieldServiceClient with default settings. */
  public static final GoogleAdsFieldServiceClient create() throws IOException {
    return create(GoogleAdsFieldServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of GoogleAdsFieldServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final GoogleAdsFieldServiceClient create(GoogleAdsFieldServiceSettings settings)
      throws IOException {
    return new GoogleAdsFieldServiceClient(settings);
  }

  /**
   * Constructs an instance of GoogleAdsFieldServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(GoogleAdsFieldServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final GoogleAdsFieldServiceClient create(GoogleAdsFieldServiceStub stub) {
    return new GoogleAdsFieldServiceClient(stub);
  }

  /**
   * Constructs an instance of GoogleAdsFieldServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GoogleAdsFieldServiceClient(GoogleAdsFieldServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((GoogleAdsFieldServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected GoogleAdsFieldServiceClient(GoogleAdsFieldServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GoogleAdsFieldServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public GoogleAdsFieldServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns just the requested field.
   *
   * @param resource_name Required. The resource name of the field to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GoogleAdsField getGoogleAdsField(GoogleAdsFieldName resourceName) {
    GetGoogleAdsFieldRequest request =
        GetGoogleAdsFieldRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getGoogleAdsField(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns just the requested field.
   *
   * @param resource_name Required. The resource name of the field to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GoogleAdsField getGoogleAdsField(String resourceName) {
    GetGoogleAdsFieldRequest request =
        GetGoogleAdsFieldRequest.newBuilder().setResourceName(resourceName).build();
    return getGoogleAdsField(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns just the requested field.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GoogleAdsField getGoogleAdsField(GetGoogleAdsFieldRequest request) {
    return getGoogleAdsFieldCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns just the requested field.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetGoogleAdsFieldRequest, GoogleAdsField> getGoogleAdsFieldCallable() {
    return stub.getGoogleAdsFieldCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all fields that match the search query.
   *
   * @param query Required. The query string.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchGoogleAdsFieldsPagedResponse searchGoogleAdsFields(String query) {
    SearchGoogleAdsFieldsRequest request =
        SearchGoogleAdsFieldsRequest.newBuilder().setQuery(query).build();
    return searchGoogleAdsFields(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all fields that match the search query.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchGoogleAdsFieldsPagedResponse searchGoogleAdsFields(
      SearchGoogleAdsFieldsRequest request) {
    return searchGoogleAdsFieldsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all fields that match the search query.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsPagedResponse>
      searchGoogleAdsFieldsPagedCallable() {
    return stub.searchGoogleAdsFieldsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all fields that match the search query.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse>
      searchGoogleAdsFieldsCallable() {
    return stub.searchGoogleAdsFieldsCallable();
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

  public static class SearchGoogleAdsFieldsPagedResponse
      extends AbstractPagedListResponse<
          SearchGoogleAdsFieldsRequest,
          SearchGoogleAdsFieldsResponse,
          GoogleAdsField,
          SearchGoogleAdsFieldsPage,
          SearchGoogleAdsFieldsFixedSizeCollection> {

    public static ApiFuture<SearchGoogleAdsFieldsPagedResponse> createAsync(
        PageContext<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse, GoogleAdsField>
            context,
        ApiFuture<SearchGoogleAdsFieldsResponse> futureResponse) {
      ApiFuture<SearchGoogleAdsFieldsPage> futurePage =
          SearchGoogleAdsFieldsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<SearchGoogleAdsFieldsPage, SearchGoogleAdsFieldsPagedResponse>() {
            @Override
            public SearchGoogleAdsFieldsPagedResponse apply(SearchGoogleAdsFieldsPage input) {
              return new SearchGoogleAdsFieldsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private SearchGoogleAdsFieldsPagedResponse(SearchGoogleAdsFieldsPage page) {
      super(page, SearchGoogleAdsFieldsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchGoogleAdsFieldsPage
      extends AbstractPage<
          SearchGoogleAdsFieldsRequest,
          SearchGoogleAdsFieldsResponse,
          GoogleAdsField,
          SearchGoogleAdsFieldsPage> {

    private SearchGoogleAdsFieldsPage(
        PageContext<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse, GoogleAdsField>
            context,
        SearchGoogleAdsFieldsResponse response) {
      super(context, response);
    }

    private static SearchGoogleAdsFieldsPage createEmptyPage() {
      return new SearchGoogleAdsFieldsPage(null, null);
    }

    @Override
    protected SearchGoogleAdsFieldsPage createPage(
        PageContext<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse, GoogleAdsField>
            context,
        SearchGoogleAdsFieldsResponse response) {
      return new SearchGoogleAdsFieldsPage(context, response);
    }

    @Override
    public ApiFuture<SearchGoogleAdsFieldsPage> createPageAsync(
        PageContext<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse, GoogleAdsField>
            context,
        ApiFuture<SearchGoogleAdsFieldsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchGoogleAdsFieldsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchGoogleAdsFieldsRequest,
          SearchGoogleAdsFieldsResponse,
          GoogleAdsField,
          SearchGoogleAdsFieldsPage,
          SearchGoogleAdsFieldsFixedSizeCollection> {

    private SearchGoogleAdsFieldsFixedSizeCollection(
        List<SearchGoogleAdsFieldsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchGoogleAdsFieldsFixedSizeCollection createEmptyCollection() {
      return new SearchGoogleAdsFieldsFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchGoogleAdsFieldsFixedSizeCollection createCollection(
        List<SearchGoogleAdsFieldsPage> pages, int collectionSize) {
      return new SearchGoogleAdsFieldsFixedSizeCollection(pages, collectionSize);
    }
  }
}
