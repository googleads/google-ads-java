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
package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.services.stub.KeywordPlanIdeaServiceStub;
import com.google.ads.googleads.v6.services.stub.KeywordPlanIdeaServiceStubSettings;
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

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to generate keyword ideas.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient = KeywordPlanIdeaServiceClient.create()) {
 *   GenerateKeywordIdeasRequest request = GenerateKeywordIdeasRequest.newBuilder().build();
 *   ApiFuture&lt;GenerateKeywordIdeasPagedResponse&gt; future = keywordPlanIdeaServiceClient.generateKeywordIdeasPagedCallable().futureCall(request);
 *   // Do something
 *   for (GenerateKeywordIdeaResult element : future.get().iterateAll()) {
 *     // doThingsWith(element);
 *   }
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the keywordPlanIdeaServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of KeywordPlanIdeaServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * KeywordPlanIdeaServiceSettings keywordPlanIdeaServiceSettings =
 *     KeywordPlanIdeaServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
 *     KeywordPlanIdeaServiceClient.create(keywordPlanIdeaServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * KeywordPlanIdeaServiceSettings keywordPlanIdeaServiceSettings =
 *     KeywordPlanIdeaServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
 *     KeywordPlanIdeaServiceClient.create(keywordPlanIdeaServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordPlanIdeaServiceClient implements BackgroundResource {
  private final KeywordPlanIdeaServiceSettings settings;
  private final KeywordPlanIdeaServiceStub stub;

  /** Constructs an instance of KeywordPlanIdeaServiceClient with default settings. */
  public static final KeywordPlanIdeaServiceClient create() throws IOException {
    return create(KeywordPlanIdeaServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanIdeaServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final KeywordPlanIdeaServiceClient create(KeywordPlanIdeaServiceSettings settings)
      throws IOException {
    return new KeywordPlanIdeaServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanIdeaServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use KeywordPlanIdeaServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordPlanIdeaServiceClient create(KeywordPlanIdeaServiceStub stub) {
    return new KeywordPlanIdeaServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanIdeaServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected KeywordPlanIdeaServiceClient(KeywordPlanIdeaServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((KeywordPlanIdeaServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanIdeaServiceClient(KeywordPlanIdeaServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanIdeaServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanIdeaServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of keyword ideas.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient = KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordIdeasRequest request = GenerateKeywordIdeasRequest.newBuilder().build();
   *   for (GenerateKeywordIdeaResult element : keywordPlanIdeaServiceClient.generateKeywordIdeas(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateKeywordIdeasPagedResponse generateKeywordIdeas(
      GenerateKeywordIdeasRequest request) {
    return generateKeywordIdeasPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of keyword ideas.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient = KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordIdeasRequest request = GenerateKeywordIdeasRequest.newBuilder().build();
   *   ApiFuture&lt;GenerateKeywordIdeasPagedResponse&gt; future = keywordPlanIdeaServiceClient.generateKeywordIdeasPagedCallable().futureCall(request);
   *   // Do something
   *   for (GenerateKeywordIdeaResult element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeasPagedResponse>
      generateKeywordIdeasPagedCallable() {
    return stub.generateKeywordIdeasPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of keyword ideas.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient = KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordIdeasRequest request = GenerateKeywordIdeasRequest.newBuilder().build();
   *   while (true) {
   *     GenerateKeywordIdeaResponse response = keywordPlanIdeaServiceClient.generateKeywordIdeasCallable().call(request);
   *     for (GenerateKeywordIdeaResult element : response.getResultsList()) {
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
  public final UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
      generateKeywordIdeasCallable() {
    return stub.generateKeywordIdeasCallable();
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

  public static class GenerateKeywordIdeasPagedResponse
      extends AbstractPagedListResponse<
          GenerateKeywordIdeasRequest,
          GenerateKeywordIdeaResponse,
          GenerateKeywordIdeaResult,
          GenerateKeywordIdeasPage,
          GenerateKeywordIdeasFixedSizeCollection> {

    public static ApiFuture<GenerateKeywordIdeasPagedResponse> createAsync(
        PageContext<
                GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse, GenerateKeywordIdeaResult>
            context,
        ApiFuture<GenerateKeywordIdeaResponse> futureResponse) {
      ApiFuture<GenerateKeywordIdeasPage> futurePage =
          GenerateKeywordIdeasPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<GenerateKeywordIdeasPage, GenerateKeywordIdeasPagedResponse>() {
            @Override
            public GenerateKeywordIdeasPagedResponse apply(GenerateKeywordIdeasPage input) {
              return new GenerateKeywordIdeasPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private GenerateKeywordIdeasPagedResponse(GenerateKeywordIdeasPage page) {
      super(page, GenerateKeywordIdeasFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class GenerateKeywordIdeasPage
      extends AbstractPage<
          GenerateKeywordIdeasRequest,
          GenerateKeywordIdeaResponse,
          GenerateKeywordIdeaResult,
          GenerateKeywordIdeasPage> {

    private GenerateKeywordIdeasPage(
        PageContext<
                GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse, GenerateKeywordIdeaResult>
            context,
        GenerateKeywordIdeaResponse response) {
      super(context, response);
    }

    private static GenerateKeywordIdeasPage createEmptyPage() {
      return new GenerateKeywordIdeasPage(null, null);
    }

    @Override
    protected GenerateKeywordIdeasPage createPage(
        PageContext<
                GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse, GenerateKeywordIdeaResult>
            context,
        GenerateKeywordIdeaResponse response) {
      return new GenerateKeywordIdeasPage(context, response);
    }

    @Override
    public ApiFuture<GenerateKeywordIdeasPage> createPageAsync(
        PageContext<
                GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse, GenerateKeywordIdeaResult>
            context,
        ApiFuture<GenerateKeywordIdeaResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class GenerateKeywordIdeasFixedSizeCollection
      extends AbstractFixedSizeCollection<
          GenerateKeywordIdeasRequest,
          GenerateKeywordIdeaResponse,
          GenerateKeywordIdeaResult,
          GenerateKeywordIdeasPage,
          GenerateKeywordIdeasFixedSizeCollection> {

    private GenerateKeywordIdeasFixedSizeCollection(
        List<GenerateKeywordIdeasPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static GenerateKeywordIdeasFixedSizeCollection createEmptyCollection() {
      return new GenerateKeywordIdeasFixedSizeCollection(null, 0);
    }

    @Override
    protected GenerateKeywordIdeasFixedSizeCollection createCollection(
        List<GenerateKeywordIdeasPage> pages, int collectionSize) {
      return new GenerateKeywordIdeasFixedSizeCollection(pages, collectionSize);
    }
  }
}
