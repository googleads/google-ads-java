/*
 * Copyright 2018 Google LLC
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
package com.google.ads.googleads.v0.services;

import com.google.ads.googleads.v0.services.stub.GoogleAdsServiceStub;
import com.google.ads.googleads.v0.services.stub.GoogleAdsServiceStubSettings;
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
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch data and metrics across resources.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
 *   String customerId = "";
 *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
 *   MutateGoogleAdsResponse response = googleAdsServiceClient.mutate(customerId, mutateOperations);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the googleAdsServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of GoogleAdsServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * GoogleAdsServiceSettings googleAdsServiceSettings =
 *     GoogleAdsServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GoogleAdsServiceClient googleAdsServiceClient =
 *     GoogleAdsServiceClient.create(googleAdsServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * GoogleAdsServiceSettings googleAdsServiceSettings =
 *     GoogleAdsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * GoogleAdsServiceClient googleAdsServiceClient =
 *     GoogleAdsServiceClient.create(googleAdsServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class GoogleAdsServiceClient implements BackgroundResource {
  private final GoogleAdsServiceSettings settings;
  private final GoogleAdsServiceStub stub;

  /** Constructs an instance of GoogleAdsServiceClient with default settings. */
  public static final GoogleAdsServiceClient create() throws IOException {
    return create(GoogleAdsServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of GoogleAdsServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final GoogleAdsServiceClient create(GoogleAdsServiceSettings settings)
      throws IOException {
    return new GoogleAdsServiceClient(settings);
  }

  /**
   * Constructs an instance of GoogleAdsServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use GoogleAdsServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final GoogleAdsServiceClient create(GoogleAdsServiceStub stub) {
    return new GoogleAdsServiceClient(stub);
  }

  /**
   * Constructs an instance of GoogleAdsServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GoogleAdsServiceClient(GoogleAdsServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((GoogleAdsServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected GoogleAdsServiceClient(GoogleAdsServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GoogleAdsServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public GoogleAdsServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all rows that match the search query.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   String customerId = "";
   *   String query = "";
   *   for (GoogleAdsRow element : googleAdsServiceClient.search(customerId, query).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer being queried.
   * @param query The query string.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchPagedResponse search(String customerId, String query) {
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder().setCustomerId(customerId).setQuery(query).build();
    return search(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all rows that match the search query.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   String customerId = "";
   *   String query = "";
   *   SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setQuery(query)
   *     .build();
   *   for (GoogleAdsRow element : googleAdsServiceClient.search(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchPagedResponse search(SearchGoogleAdsRequest request) {
    return searchPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all rows that match the search query.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   String customerId = "";
   *   String query = "";
   *   SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setQuery(query)
   *     .build();
   *   ApiFuture&lt;SearchPagedResponse&gt; future = googleAdsServiceClient.searchPagedCallable().futureCall(request);
   *   // Do something
   *   for (GoogleAdsRow element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<SearchGoogleAdsRequest, SearchPagedResponse> searchPagedCallable() {
    return stub.searchPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all rows that match the search query.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   String customerId = "";
   *   String query = "";
   *   SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setQuery(query)
   *     .build();
   *   while (true) {
   *     SearchGoogleAdsResponse response = googleAdsServiceClient.searchCallable().call(request);
   *     for (GoogleAdsRow element : response.getResultsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<SearchGoogleAdsRequest, SearchGoogleAdsResponse> searchCallable() {
    return stub.searchCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes resources. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
   *   MutateGoogleAdsResponse response = googleAdsServiceClient.mutate(customerId, mutateOperations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose resources are being modified.
   * @param mutateOperations The list of operations to perform on individual resources.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateGoogleAdsResponse mutate(
      String customerId, List<MutateOperation> mutateOperations) {

    MutateGoogleAdsRequest request =
        MutateGoogleAdsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllMutateOperations(mutateOperations)
            .build();
    return mutate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes resources. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
   *   MutateGoogleAdsRequest request = MutateGoogleAdsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllMutateOperations(mutateOperations)
   *     .build();
   *   MutateGoogleAdsResponse response = googleAdsServiceClient.mutate(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateGoogleAdsResponse mutate(MutateGoogleAdsRequest request) {
    return mutateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes resources. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
   *   MutateGoogleAdsRequest request = MutateGoogleAdsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllMutateOperations(mutateOperations)
   *     .build();
   *   ApiFuture&lt;MutateGoogleAdsResponse&gt; future = googleAdsServiceClient.mutateCallable().futureCall(request);
   *   // Do something
   *   MutateGoogleAdsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateCallable() {
    return stub.mutateCallable();
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

  public static class SearchPagedResponse
      extends AbstractPagedListResponse<
          SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow, SearchPage,
          SearchFixedSizeCollection> {

    public static ApiFuture<SearchPagedResponse> createAsync(
        PageContext<SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow> context,
        ApiFuture<SearchGoogleAdsResponse> futureResponse) {
      ApiFuture<SearchPage> futurePage =
          SearchPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<SearchPage, SearchPagedResponse>() {
            @Override
            public SearchPagedResponse apply(SearchPage input) {
              return new SearchPagedResponse(input);
            }
          });
    }

    private SearchPagedResponse(SearchPage page) {
      super(page, SearchFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchPage
      extends AbstractPage<
          SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow, SearchPage> {

    private SearchPage(
        PageContext<SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow> context,
        SearchGoogleAdsResponse response) {
      super(context, response);
    }

    private static SearchPage createEmptyPage() {
      return new SearchPage(null, null);
    }

    @Override
    protected SearchPage createPage(
        PageContext<SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow> context,
        SearchGoogleAdsResponse response) {
      return new SearchPage(context, response);
    }

    @Override
    public ApiFuture<SearchPage> createPageAsync(
        PageContext<SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow> context,
        ApiFuture<SearchGoogleAdsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow, SearchPage,
          SearchFixedSizeCollection> {

    private SearchFixedSizeCollection(List<SearchPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchFixedSizeCollection createEmptyCollection() {
      return new SearchFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchFixedSizeCollection createCollection(
        List<SearchPage> pages, int collectionSize) {
      return new SearchFixedSizeCollection(pages, collectionSize);
    }
  }
}
