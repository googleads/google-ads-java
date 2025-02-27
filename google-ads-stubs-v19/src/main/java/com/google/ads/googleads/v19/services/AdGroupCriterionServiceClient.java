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

import com.google.ads.googleads.v19.services.stub.AdGroupCriterionServiceStub;
import com.google.ads.googleads.v19.services.stub.AdGroupCriterionServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage ad group criteria.
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
 * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
 *     AdGroupCriterionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupCriterionOperation> operations = new ArrayList<>();
 *   MutateAdGroupCriteriaResponse response =
 *       adGroupCriterionServiceClient.mutateAdGroupCriteria(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AdGroupCriterionServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateAdGroupCriteria</td>
 *      <td><p> Creates, updates, or removes criteria. Operation statuses are returned.
 * <p>  List of thrown errors:   [AdGroupCriterionError]()   [AdxError]()   [AuthenticationError]()   [AuthorizationError]()   [BiddingError]()   [BiddingStrategyError]()   [CollectionSizeError]()   [ContextError]()   [CriterionError]()   [DatabaseError]()   [DateError]()   [DistinctError]()   [FieldError]()   [FieldMaskError]()   [HeaderError]()   [IdError]()   [InternalError]()   [MultiplierError]()   [MutateError]()   [NewResourceCreationError]()   [NotEmptyError]()   [NullError]()   [OperationAccessDeniedError]()   [OperatorError]()   [PolicyViolationError]()   [QuotaError]()   [RangeError]()   [RequestError]()   [ResourceCountLimitExceededError]()   [SizeLimitError]()   [StringFormatError]()   [StringLengthError]()   [UrlFieldError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateAdGroupCriteria(MutateAdGroupCriteriaRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateAdGroupCriteria(String customerId, List&lt;AdGroupCriterionOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateAdGroupCriteriaCallable()
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
 * AdGroupCriterionServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AdGroupCriterionServiceSettings adGroupCriterionServiceSettings =
 *     AdGroupCriterionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupCriterionServiceClient adGroupCriterionServiceClient =
 *     AdGroupCriterionServiceClient.create(adGroupCriterionServiceSettings);
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
 * AdGroupCriterionServiceSettings adGroupCriterionServiceSettings =
 *     AdGroupCriterionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupCriterionServiceClient adGroupCriterionServiceClient =
 *     AdGroupCriterionServiceClient.create(adGroupCriterionServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AdGroupCriterionServiceClient implements BackgroundResource {
  private final AdGroupCriterionServiceSettings settings;
  private final AdGroupCriterionServiceStub stub;

  /** Constructs an instance of AdGroupCriterionServiceClient with default settings. */
  public static final AdGroupCriterionServiceClient create() throws IOException {
    return create(AdGroupCriterionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupCriterionServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdGroupCriterionServiceClient create(AdGroupCriterionServiceSettings settings)
      throws IOException {
    return new AdGroupCriterionServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupCriterionServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AdGroupCriterionServiceSettings).
   */
  public static final AdGroupCriterionServiceClient create(AdGroupCriterionServiceStub stub) {
    return new AdGroupCriterionServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupCriterionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupCriterionServiceClient(AdGroupCriterionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupCriterionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AdGroupCriterionServiceClient(AdGroupCriterionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupCriterionServiceSettings getSettings() {
    return settings;
  }

  public AdGroupCriterionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdGroupCriterionError]() [AdxError]() [AuthenticationError]()
   * [AuthorizationError]() [BiddingError]() [BiddingStrategyError]() [CollectionSizeError]()
   * [ContextError]() [CriterionError]() [DatabaseError]() [DateError]() [DistinctError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]() [InternalError]()
   * [MultiplierError]() [MutateError]() [NewResourceCreationError]() [NotEmptyError]()
   * [NullError]() [OperationAccessDeniedError]() [OperatorError]() [PolicyViolationError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
   *     AdGroupCriterionServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AdGroupCriterionOperation> operations = new ArrayList<>();
   *   MutateAdGroupCriteriaResponse response =
   *       adGroupCriterionServiceClient.mutateAdGroupCriteria(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. ID of the customer whose criteria are being modified.
   * @param operations Required. The list of operations to perform on individual criteria.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupCriteriaResponse mutateAdGroupCriteria(
      String customerId, List<AdGroupCriterionOperation> operations) {
    MutateAdGroupCriteriaRequest request =
        MutateAdGroupCriteriaRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupCriteria(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdGroupCriterionError]() [AdxError]() [AuthenticationError]()
   * [AuthorizationError]() [BiddingError]() [BiddingStrategyError]() [CollectionSizeError]()
   * [ContextError]() [CriterionError]() [DatabaseError]() [DateError]() [DistinctError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]() [InternalError]()
   * [MultiplierError]() [MutateError]() [NewResourceCreationError]() [NotEmptyError]()
   * [NullError]() [OperationAccessDeniedError]() [OperatorError]() [PolicyViolationError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
   *     AdGroupCriterionServiceClient.create()) {
   *   MutateAdGroupCriteriaRequest request =
   *       MutateAdGroupCriteriaRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupCriterionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAdGroupCriteriaResponse response =
   *       adGroupCriterionServiceClient.mutateAdGroupCriteria(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupCriteriaResponse mutateAdGroupCriteria(
      MutateAdGroupCriteriaRequest request) {
    return mutateAdGroupCriteriaCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdGroupCriterionError]() [AdxError]() [AuthenticationError]()
   * [AuthorizationError]() [BiddingError]() [BiddingStrategyError]() [CollectionSizeError]()
   * [ContextError]() [CriterionError]() [DatabaseError]() [DateError]() [DistinctError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]() [InternalError]()
   * [MultiplierError]() [MutateError]() [NewResourceCreationError]() [NotEmptyError]()
   * [NullError]() [OperationAccessDeniedError]() [OperatorError]() [PolicyViolationError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
   *     AdGroupCriterionServiceClient.create()) {
   *   MutateAdGroupCriteriaRequest request =
   *       MutateAdGroupCriteriaRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupCriterionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAdGroupCriteriaResponse> future =
   *       adGroupCriterionServiceClient.mutateAdGroupCriteriaCallable().futureCall(request);
   *   // Do something.
   *   MutateAdGroupCriteriaResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateAdGroupCriteriaRequest, MutateAdGroupCriteriaResponse>
      mutateAdGroupCriteriaCallable() {
    return stub.mutateAdGroupCriteriaCallable();
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
