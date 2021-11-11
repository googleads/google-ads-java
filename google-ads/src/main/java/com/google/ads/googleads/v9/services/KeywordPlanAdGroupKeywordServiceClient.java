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

package com.google.ads.googleads.v9.services;

import com.google.ads.googleads.v9.resources.KeywordPlanAdGroupKeyword;
import com.google.ads.googleads.v9.resources.KeywordPlanAdGroupKeywordName;
import com.google.ads.googleads.v9.services.stub.KeywordPlanAdGroupKeywordServiceStub;
import com.google.ads.googleads.v9.services.stub.KeywordPlanAdGroupKeywordServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage Keyword Plan ad group keywords. KeywordPlanAdGroup is
 * required to add ad group keywords. Positive and negative keywords are supported. A maximum of
 * 10,000 positive keywords are allowed per keyword plan. A maximum of 1,000 negative keywords are
 * allower per keyword plan. This includes campaign negative keywords and ad group negative
 * keywords.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
 *     KeywordPlanAdGroupKeywordServiceClient.create()) {
 *   KeywordPlanAdGroupKeywordName resourceName =
 *       KeywordPlanAdGroupKeywordName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]");
 *   KeywordPlanAdGroupKeyword response =
 *       keywordPlanAdGroupKeywordServiceClient.getKeywordPlanAdGroupKeyword(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the KeywordPlanAdGroupKeywordServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
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
 * KeywordPlanAdGroupKeywordServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * KeywordPlanAdGroupKeywordServiceSettings keywordPlanAdGroupKeywordServiceSettings =
 *     KeywordPlanAdGroupKeywordServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
 *     KeywordPlanAdGroupKeywordServiceClient.create(keywordPlanAdGroupKeywordServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * KeywordPlanAdGroupKeywordServiceSettings keywordPlanAdGroupKeywordServiceSettings =
 *     KeywordPlanAdGroupKeywordServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
 *     KeywordPlanAdGroupKeywordServiceClient.create(keywordPlanAdGroupKeywordServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class KeywordPlanAdGroupKeywordServiceClient implements BackgroundResource {
  private final KeywordPlanAdGroupKeywordServiceSettings settings;
  private final KeywordPlanAdGroupKeywordServiceStub stub;

  /** Constructs an instance of KeywordPlanAdGroupKeywordServiceClient with default settings. */
  public static final KeywordPlanAdGroupKeywordServiceClient create() throws IOException {
    return create(KeywordPlanAdGroupKeywordServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanAdGroupKeywordServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final KeywordPlanAdGroupKeywordServiceClient create(
      KeywordPlanAdGroupKeywordServiceSettings settings) throws IOException {
    return new KeywordPlanAdGroupKeywordServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanAdGroupKeywordServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(KeywordPlanAdGroupKeywordServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordPlanAdGroupKeywordServiceClient create(
      KeywordPlanAdGroupKeywordServiceStub stub) {
    return new KeywordPlanAdGroupKeywordServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanAdGroupKeywordServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected KeywordPlanAdGroupKeywordServiceClient(
      KeywordPlanAdGroupKeywordServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((KeywordPlanAdGroupKeywordServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanAdGroupKeywordServiceClient(KeywordPlanAdGroupKeywordServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanAdGroupKeywordServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanAdGroupKeywordServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan ad group keyword in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
   *     KeywordPlanAdGroupKeywordServiceClient.create()) {
   *   KeywordPlanAdGroupKeywordName resourceName =
   *       KeywordPlanAdGroupKeywordName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]");
   *   KeywordPlanAdGroupKeyword response =
   *       keywordPlanAdGroupKeywordServiceClient.getKeywordPlanAdGroupKeyword(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the ad group keyword to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanAdGroupKeyword getKeywordPlanAdGroupKeyword(
      KeywordPlanAdGroupKeywordName resourceName) {
    GetKeywordPlanAdGroupKeywordRequest request =
        GetKeywordPlanAdGroupKeywordRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getKeywordPlanAdGroupKeyword(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan ad group keyword in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
   *     KeywordPlanAdGroupKeywordServiceClient.create()) {
   *   String resourceName =
   *       KeywordPlanAdGroupKeywordName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]")
   *           .toString();
   *   KeywordPlanAdGroupKeyword response =
   *       keywordPlanAdGroupKeywordServiceClient.getKeywordPlanAdGroupKeyword(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the ad group keyword to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanAdGroupKeyword getKeywordPlanAdGroupKeyword(String resourceName) {
    GetKeywordPlanAdGroupKeywordRequest request =
        GetKeywordPlanAdGroupKeywordRequest.newBuilder().setResourceName(resourceName).build();
    return getKeywordPlanAdGroupKeyword(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan ad group keyword in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
   *     KeywordPlanAdGroupKeywordServiceClient.create()) {
   *   GetKeywordPlanAdGroupKeywordRequest request =
   *       GetKeywordPlanAdGroupKeywordRequest.newBuilder()
   *           .setResourceName(
   *               KeywordPlanAdGroupKeywordName.of(
   *                       "[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]")
   *                   .toString())
   *           .build();
   *   KeywordPlanAdGroupKeyword response =
   *       keywordPlanAdGroupKeywordServiceClient.getKeywordPlanAdGroupKeyword(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanAdGroupKeyword getKeywordPlanAdGroupKeyword(
      GetKeywordPlanAdGroupKeywordRequest request) {
    return getKeywordPlanAdGroupKeywordCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Keyword Plan ad group keyword in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
   *     KeywordPlanAdGroupKeywordServiceClient.create()) {
   *   GetKeywordPlanAdGroupKeywordRequest request =
   *       GetKeywordPlanAdGroupKeywordRequest.newBuilder()
   *           .setResourceName(
   *               KeywordPlanAdGroupKeywordName.of(
   *                       "[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<KeywordPlanAdGroupKeyword> future =
   *       keywordPlanAdGroupKeywordServiceClient
   *           .getKeywordPlanAdGroupKeywordCallable()
   *           .futureCall(request);
   *   // Do something.
   *   KeywordPlanAdGroupKeyword response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetKeywordPlanAdGroupKeywordRequest, KeywordPlanAdGroupKeyword>
      getKeywordPlanAdGroupKeywordCallable() {
    return stub.getKeywordPlanAdGroupKeywordCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes Keyword Plan ad group keywords. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [KeywordPlanAdGroupKeywordError]()
   * [KeywordPlanError]() [MutateError]() [QuotaError]() [RequestError]()
   * [ResourceCountLimitExceededError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
   *     KeywordPlanAdGroupKeywordServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<KeywordPlanAdGroupKeywordOperation> operations = new ArrayList<>();
   *   MutateKeywordPlanAdGroupKeywordsResponse response =
   *       keywordPlanAdGroupKeywordServiceClient.mutateKeywordPlanAdGroupKeywords(
   *           customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose Keyword Plan ad group keywords are
   *     being modified.
   * @param operations Required. The list of operations to perform on individual Keyword Plan ad
   *     group keywords.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanAdGroupKeywordsResponse mutateKeywordPlanAdGroupKeywords(
      String customerId, List<KeywordPlanAdGroupKeywordOperation> operations) {
    MutateKeywordPlanAdGroupKeywordsRequest request =
        MutateKeywordPlanAdGroupKeywordsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlanAdGroupKeywords(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes Keyword Plan ad group keywords. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [KeywordPlanAdGroupKeywordError]()
   * [KeywordPlanError]() [MutateError]() [QuotaError]() [RequestError]()
   * [ResourceCountLimitExceededError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
   *     KeywordPlanAdGroupKeywordServiceClient.create()) {
   *   MutateKeywordPlanAdGroupKeywordsRequest request =
   *       MutateKeywordPlanAdGroupKeywordsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<KeywordPlanAdGroupKeywordOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateKeywordPlanAdGroupKeywordsResponse response =
   *       keywordPlanAdGroupKeywordServiceClient.mutateKeywordPlanAdGroupKeywords(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanAdGroupKeywordsResponse mutateKeywordPlanAdGroupKeywords(
      MutateKeywordPlanAdGroupKeywordsRequest request) {
    return mutateKeywordPlanAdGroupKeywordsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes Keyword Plan ad group keywords. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [KeywordPlanAdGroupKeywordError]()
   * [KeywordPlanError]() [MutateError]() [QuotaError]() [RequestError]()
   * [ResourceCountLimitExceededError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
   *     KeywordPlanAdGroupKeywordServiceClient.create()) {
   *   MutateKeywordPlanAdGroupKeywordsRequest request =
   *       MutateKeywordPlanAdGroupKeywordsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<KeywordPlanAdGroupKeywordOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateKeywordPlanAdGroupKeywordsResponse> future =
   *       keywordPlanAdGroupKeywordServiceClient
   *           .mutateKeywordPlanAdGroupKeywordsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateKeywordPlanAdGroupKeywordsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateKeywordPlanAdGroupKeywordsRequest, MutateKeywordPlanAdGroupKeywordsResponse>
      mutateKeywordPlanAdGroupKeywordsCallable() {
    return stub.mutateKeywordPlanAdGroupKeywordsCallable();
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
