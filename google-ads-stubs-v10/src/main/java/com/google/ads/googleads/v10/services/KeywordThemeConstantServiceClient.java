/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v10.services;

import com.google.ads.googleads.v10.services.stub.KeywordThemeConstantServiceStub;
import com.google.ads.googleads.v10.services.stub.KeywordThemeConstantServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch Smart Campaign keyword themes.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (KeywordThemeConstantServiceClient keywordThemeConstantServiceClient =
 *     KeywordThemeConstantServiceClient.create()) {
 *   SuggestKeywordThemeConstantsRequest request =
 *       SuggestKeywordThemeConstantsRequest.newBuilder()
 *           .setQueryText("queryText-1806881259")
 *           .setCountryCode("countryCode-1477067101")
 *           .setLanguageCode("languageCode-2092349083")
 *           .build();
 *   SuggestKeywordThemeConstantsResponse response =
 *       keywordThemeConstantServiceClient.suggestKeywordThemeConstants(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the KeywordThemeConstantServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of
 * KeywordThemeConstantServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * KeywordThemeConstantServiceSettings keywordThemeConstantServiceSettings =
 *     KeywordThemeConstantServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordThemeConstantServiceClient keywordThemeConstantServiceClient =
 *     KeywordThemeConstantServiceClient.create(keywordThemeConstantServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * KeywordThemeConstantServiceSettings keywordThemeConstantServiceSettings =
 *     KeywordThemeConstantServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordThemeConstantServiceClient keywordThemeConstantServiceClient =
 *     KeywordThemeConstantServiceClient.create(keywordThemeConstantServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class KeywordThemeConstantServiceClient implements BackgroundResource {
  private final KeywordThemeConstantServiceSettings settings;
  private final KeywordThemeConstantServiceStub stub;

  /** Constructs an instance of KeywordThemeConstantServiceClient with default settings. */
  public static final KeywordThemeConstantServiceClient create() throws IOException {
    return create(KeywordThemeConstantServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordThemeConstantServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final KeywordThemeConstantServiceClient create(
      KeywordThemeConstantServiceSettings settings) throws IOException {
    return new KeywordThemeConstantServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordThemeConstantServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(KeywordThemeConstantServiceSettings).
   */
  public static final KeywordThemeConstantServiceClient create(
      KeywordThemeConstantServiceStub stub) {
    return new KeywordThemeConstantServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordThemeConstantServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected KeywordThemeConstantServiceClient(KeywordThemeConstantServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((KeywordThemeConstantServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected KeywordThemeConstantServiceClient(KeywordThemeConstantServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordThemeConstantServiceSettings getSettings() {
    return settings;
  }

  public KeywordThemeConstantServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns KeywordThemeConstant suggestions by keyword themes.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordThemeConstantServiceClient keywordThemeConstantServiceClient =
   *     KeywordThemeConstantServiceClient.create()) {
   *   SuggestKeywordThemeConstantsRequest request =
   *       SuggestKeywordThemeConstantsRequest.newBuilder()
   *           .setQueryText("queryText-1806881259")
   *           .setCountryCode("countryCode-1477067101")
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   SuggestKeywordThemeConstantsResponse response =
   *       keywordThemeConstantServiceClient.suggestKeywordThemeConstants(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestKeywordThemeConstantsResponse suggestKeywordThemeConstants(
      SuggestKeywordThemeConstantsRequest request) {
    return suggestKeywordThemeConstantsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns KeywordThemeConstant suggestions by keyword themes.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordThemeConstantServiceClient keywordThemeConstantServiceClient =
   *     KeywordThemeConstantServiceClient.create()) {
   *   SuggestKeywordThemeConstantsRequest request =
   *       SuggestKeywordThemeConstantsRequest.newBuilder()
   *           .setQueryText("queryText-1806881259")
   *           .setCountryCode("countryCode-1477067101")
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   ApiFuture<SuggestKeywordThemeConstantsResponse> future =
   *       keywordThemeConstantServiceClient
   *           .suggestKeywordThemeConstantsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   SuggestKeywordThemeConstantsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          SuggestKeywordThemeConstantsRequest, SuggestKeywordThemeConstantsResponse>
      suggestKeywordThemeConstantsCallable() {
    return stub.suggestKeywordThemeConstantsCallable();
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
