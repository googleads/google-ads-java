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

package com.google.ads.googleads.v12.services;

import com.google.ads.googleads.v12.services.stub.KeywordPlanCampaignKeywordServiceStub;
import com.google.ads.googleads.v12.services.stub.KeywordPlanCampaignKeywordServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage Keyword Plan campaign keywords. KeywordPlanCampaign is
 * required to add the campaign keywords. Only negative keywords are supported. A maximum of 1000
 * negative keywords are allowed per plan. This includes both campaign negative keywords and ad
 * group negative keywords.
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
 * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient =
 *     KeywordPlanCampaignKeywordServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<KeywordPlanCampaignKeywordOperation> operations = new ArrayList<>();
 *   MutateKeywordPlanCampaignKeywordsResponse response =
 *       keywordPlanCampaignKeywordServiceClient.mutateKeywordPlanCampaignKeywords(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the KeywordPlanCampaignKeywordServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
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
 * KeywordPlanCampaignKeywordServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * KeywordPlanCampaignKeywordServiceSettings keywordPlanCampaignKeywordServiceSettings =
 *     KeywordPlanCampaignKeywordServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient =
 *     KeywordPlanCampaignKeywordServiceClient.create(keywordPlanCampaignKeywordServiceSettings);
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
 * KeywordPlanCampaignKeywordServiceSettings keywordPlanCampaignKeywordServiceSettings =
 *     KeywordPlanCampaignKeywordServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient =
 *     KeywordPlanCampaignKeywordServiceClient.create(keywordPlanCampaignKeywordServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class KeywordPlanCampaignKeywordServiceClient implements BackgroundResource {
  private final KeywordPlanCampaignKeywordServiceSettings settings;
  private final KeywordPlanCampaignKeywordServiceStub stub;

  /** Constructs an instance of KeywordPlanCampaignKeywordServiceClient with default settings. */
  public static final KeywordPlanCampaignKeywordServiceClient create() throws IOException {
    return create(KeywordPlanCampaignKeywordServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanCampaignKeywordServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final KeywordPlanCampaignKeywordServiceClient create(
      KeywordPlanCampaignKeywordServiceSettings settings) throws IOException {
    return new KeywordPlanCampaignKeywordServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanCampaignKeywordServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(KeywordPlanCampaignKeywordServiceSettings).
   */
  public static final KeywordPlanCampaignKeywordServiceClient create(
      KeywordPlanCampaignKeywordServiceStub stub) {
    return new KeywordPlanCampaignKeywordServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanCampaignKeywordServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected KeywordPlanCampaignKeywordServiceClient(
      KeywordPlanCampaignKeywordServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((KeywordPlanCampaignKeywordServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected KeywordPlanCampaignKeywordServiceClient(KeywordPlanCampaignKeywordServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanCampaignKeywordServiceSettings getSettings() {
    return settings;
  }

  public KeywordPlanCampaignKeywordServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes Keyword Plan campaign keywords. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [KeywordPlanAdGroupKeywordError]()
   * [KeywordPlanCampaignKeywordError]() [QuotaError]() [RequestError]()
   * [ResourceCountLimitExceededError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient =
   *     KeywordPlanCampaignKeywordServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<KeywordPlanCampaignKeywordOperation> operations = new ArrayList<>();
   *   MutateKeywordPlanCampaignKeywordsResponse response =
   *       keywordPlanCampaignKeywordServiceClient.mutateKeywordPlanCampaignKeywords(
   *           customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose campaign keywords are being modified.
   * @param operations Required. The list of operations to perform on individual Keyword Plan
   *     campaign keywords.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignKeywordsResponse mutateKeywordPlanCampaignKeywords(
      String customerId, List<KeywordPlanCampaignKeywordOperation> operations) {
    MutateKeywordPlanCampaignKeywordsRequest request =
        MutateKeywordPlanCampaignKeywordsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlanCampaignKeywords(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes Keyword Plan campaign keywords. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [KeywordPlanAdGroupKeywordError]()
   * [KeywordPlanCampaignKeywordError]() [QuotaError]() [RequestError]()
   * [ResourceCountLimitExceededError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient =
   *     KeywordPlanCampaignKeywordServiceClient.create()) {
   *   MutateKeywordPlanCampaignKeywordsRequest request =
   *       MutateKeywordPlanCampaignKeywordsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<KeywordPlanCampaignKeywordOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateKeywordPlanCampaignKeywordsResponse response =
   *       keywordPlanCampaignKeywordServiceClient.mutateKeywordPlanCampaignKeywords(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignKeywordsResponse mutateKeywordPlanCampaignKeywords(
      MutateKeywordPlanCampaignKeywordsRequest request) {
    return mutateKeywordPlanCampaignKeywordsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes Keyword Plan campaign keywords. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [KeywordPlanAdGroupKeywordError]()
   * [KeywordPlanCampaignKeywordError]() [QuotaError]() [RequestError]()
   * [ResourceCountLimitExceededError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient =
   *     KeywordPlanCampaignKeywordServiceClient.create()) {
   *   MutateKeywordPlanCampaignKeywordsRequest request =
   *       MutateKeywordPlanCampaignKeywordsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<KeywordPlanCampaignKeywordOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateKeywordPlanCampaignKeywordsResponse> future =
   *       keywordPlanCampaignKeywordServiceClient
   *           .mutateKeywordPlanCampaignKeywordsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateKeywordPlanCampaignKeywordsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateKeywordPlanCampaignKeywordsRequest, MutateKeywordPlanCampaignKeywordsResponse>
      mutateKeywordPlanCampaignKeywordsCallable() {
    return stub.mutateKeywordPlanCampaignKeywordsCallable();
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
