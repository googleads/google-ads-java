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

import com.google.ads.googleads.v1.resources.KeywordView;
import com.google.ads.googleads.v1.services.stub.KeywordViewServiceStub;
import com.google.ads.googleads.v1.services.stub.KeywordViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage keyword views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (KeywordViewServiceClient keywordViewServiceClient = KeywordViewServiceClient.create()) {
 *   String formattedResourceName = KeywordViewServiceClient.formatKeywordViewName("[CUSTOMER]", "[KEYWORD_VIEW]");
 *   KeywordView response = keywordViewServiceClient.getKeywordView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the keywordViewServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of KeywordViewServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * KeywordViewServiceSettings keywordViewServiceSettings =
 *     KeywordViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordViewServiceClient keywordViewServiceClient =
 *     KeywordViewServiceClient.create(keywordViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * KeywordViewServiceSettings keywordViewServiceSettings =
 *     KeywordViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordViewServiceClient keywordViewServiceClient =
 *     KeywordViewServiceClient.create(keywordViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordViewServiceClient implements BackgroundResource {
  private final KeywordViewServiceSettings settings;
  private final KeywordViewServiceStub stub;

  private static final PathTemplate KEYWORD_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/keywordViews/{keyword_view}");

  /** Formats a string containing the fully-qualified path to represent a keyword_view resource. */
  public static final String formatKeywordViewName(String customer, String keywordView) {
    return KEYWORD_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "keyword_view", keywordView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a keyword_view
   * resource.
   */
  public static final String parseCustomerFromKeywordViewName(String keywordViewName) {
    return KEYWORD_VIEW_PATH_TEMPLATE.parse(keywordViewName).get("customer");
  }

  /**
   * Parses the keyword_view from the given fully-qualified path which represents a keyword_view
   * resource.
   */
  public static final String parseKeywordViewFromKeywordViewName(String keywordViewName) {
    return KEYWORD_VIEW_PATH_TEMPLATE.parse(keywordViewName).get("keyword_view");
  }

  /** Constructs an instance of KeywordViewServiceClient with default settings. */
  public static final KeywordViewServiceClient create() throws IOException {
    return create(KeywordViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordViewServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final KeywordViewServiceClient create(KeywordViewServiceSettings settings)
      throws IOException {
    return new KeywordViewServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordViewServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use KeywordViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordViewServiceClient create(KeywordViewServiceStub stub) {
    return new KeywordViewServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordViewServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected KeywordViewServiceClient(KeywordViewServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((KeywordViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordViewServiceClient(KeywordViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested keyword view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordViewServiceClient keywordViewServiceClient = KeywordViewServiceClient.create()) {
   *   String formattedResourceName = KeywordViewServiceClient.formatKeywordViewName("[CUSTOMER]", "[KEYWORD_VIEW]");
   *   KeywordView response = keywordViewServiceClient.getKeywordView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the keyword view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordView getKeywordView(String resourceName) {
    KEYWORD_VIEW_PATH_TEMPLATE.validate(resourceName, "getKeywordView");
    GetKeywordViewRequest request =
        GetKeywordViewRequest.newBuilder().setResourceName(resourceName).build();
    return getKeywordView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested keyword view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordViewServiceClient keywordViewServiceClient = KeywordViewServiceClient.create()) {
   *   String formattedResourceName = KeywordViewServiceClient.formatKeywordViewName("[CUSTOMER]", "[KEYWORD_VIEW]");
   *   GetKeywordViewRequest request = GetKeywordViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   KeywordView response = keywordViewServiceClient.getKeywordView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordView getKeywordView(GetKeywordViewRequest request) {
    return getKeywordViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested keyword view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordViewServiceClient keywordViewServiceClient = KeywordViewServiceClient.create()) {
   *   String formattedResourceName = KeywordViewServiceClient.formatKeywordViewName("[CUSTOMER]", "[KEYWORD_VIEW]");
   *   GetKeywordViewRequest request = GetKeywordViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;KeywordView&gt; future = keywordViewServiceClient.getKeywordViewCallable().futureCall(request);
   *   // Do something
   *   KeywordView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetKeywordViewRequest, KeywordView> getKeywordViewCallable() {
    return stub.getKeywordViewCallable();
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
