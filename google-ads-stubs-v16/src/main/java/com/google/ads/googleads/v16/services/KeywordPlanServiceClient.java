/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v16.services;

import com.google.ads.googleads.v16.services.stub.KeywordPlanServiceStub;
import com.google.ads.googleads.v16.services.stub.KeywordPlanServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage keyword plans.
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
 * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<KeywordPlanOperation> operations = new ArrayList<>();
 *   MutateKeywordPlansResponse response =
 *       keywordPlanServiceClient.mutateKeywordPlans(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the KeywordPlanServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateKeywordPlans</td>
 *      <td><p> Creates, updates, or removes keyword plans. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [DatabaseError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [KeywordPlanError]()   [MutateError]()   [NewResourceCreationError]()   [QuotaError]()   [RequestError]()   [ResourceCountLimitExceededError]()   [StringLengthError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateKeywordPlans(MutateKeywordPlansRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateKeywordPlans(String customerId, List&lt;KeywordPlanOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateKeywordPlansCallable()
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
 * <p>This class can be customized by passing in a custom instance of KeywordPlanServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * KeywordPlanServiceSettings keywordPlanServiceSettings =
 *     KeywordPlanServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanServiceClient keywordPlanServiceClient =
 *     KeywordPlanServiceClient.create(keywordPlanServiceSettings);
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
 * KeywordPlanServiceSettings keywordPlanServiceSettings =
 *     KeywordPlanServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanServiceClient keywordPlanServiceClient =
 *     KeywordPlanServiceClient.create(keywordPlanServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class KeywordPlanServiceClient implements BackgroundResource {
  private final KeywordPlanServiceSettings settings;
  private final KeywordPlanServiceStub stub;

  /** Constructs an instance of KeywordPlanServiceClient with default settings. */
  public static final KeywordPlanServiceClient create() throws IOException {
    return create(KeywordPlanServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final KeywordPlanServiceClient create(KeywordPlanServiceSettings settings)
      throws IOException {
    return new KeywordPlanServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(KeywordPlanServiceSettings).
   */
  public static final KeywordPlanServiceClient create(KeywordPlanServiceStub stub) {
    return new KeywordPlanServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected KeywordPlanServiceClient(KeywordPlanServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((KeywordPlanServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected KeywordPlanServiceClient(KeywordPlanServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanServiceSettings getSettings() {
    return settings;
  }

  public KeywordPlanServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [KeywordPlanError]() [MutateError]()
   * [NewResourceCreationError]() [QuotaError]() [RequestError]()
   * [ResourceCountLimitExceededError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<KeywordPlanOperation> operations = new ArrayList<>();
   *   MutateKeywordPlansResponse response =
   *       keywordPlanServiceClient.mutateKeywordPlans(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose keyword plans are being modified.
   * @param operations Required. The list of operations to perform on individual keyword plans.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlansResponse mutateKeywordPlans(
      String customerId, List<KeywordPlanOperation> operations) {
    MutateKeywordPlansRequest request =
        MutateKeywordPlansRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlans(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [KeywordPlanError]() [MutateError]()
   * [NewResourceCreationError]() [QuotaError]() [RequestError]()
   * [ResourceCountLimitExceededError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   MutateKeywordPlansRequest request =
   *       MutateKeywordPlansRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<KeywordPlanOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateKeywordPlansResponse response = keywordPlanServiceClient.mutateKeywordPlans(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlansResponse mutateKeywordPlans(MutateKeywordPlansRequest request) {
    return mutateKeywordPlansCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [KeywordPlanError]() [MutateError]()
   * [NewResourceCreationError]() [QuotaError]() [RequestError]()
   * [ResourceCountLimitExceededError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   MutateKeywordPlansRequest request =
   *       MutateKeywordPlansRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<KeywordPlanOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateKeywordPlansResponse> future =
   *       keywordPlanServiceClient.mutateKeywordPlansCallable().futureCall(request);
   *   // Do something.
   *   MutateKeywordPlansResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansCallable() {
    return stub.mutateKeywordPlansCallable();
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
