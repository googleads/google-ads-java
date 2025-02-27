/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v19.services;

import com.google.ads.googleads.v19.services.stub.KeywordPlanAdGroupKeywordServiceStub;
import com.google.ads.googleads.v19.services.stub.KeywordPlanAdGroupKeywordServiceStubSettings;
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
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
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
 * <p>Note: close() needs to be called on the KeywordPlanAdGroupKeywordServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateKeywordPlanAdGroupKeywords</td>
 *      <td><p> Creates, updates, or removes Keyword Plan ad group keywords. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [DatabaseError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [KeywordPlanAdGroupKeywordError]()   [KeywordPlanError]()   [MutateError]()   [QuotaError]()   [RequestError]()   [ResourceCountLimitExceededError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateKeywordPlanAdGroupKeywords(MutateKeywordPlanAdGroupKeywordsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateKeywordPlanAdGroupKeywords(String customerId, List&lt;KeywordPlanAdGroupKeywordOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateKeywordPlanAdGroupKeywordsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
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
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
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
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
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

  protected KeywordPlanAdGroupKeywordServiceClient(KeywordPlanAdGroupKeywordServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanAdGroupKeywordServiceSettings getSettings() {
    return settings;
  }

  public KeywordPlanAdGroupKeywordServiceStub getStub() {
    return stub;
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
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
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
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
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
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
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
