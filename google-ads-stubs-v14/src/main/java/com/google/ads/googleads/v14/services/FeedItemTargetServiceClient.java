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

package com.google.ads.googleads.v14.services;

import com.google.ads.googleads.v14.services.stub.FeedItemTargetServiceStub;
import com.google.ads.googleads.v14.services.stub.FeedItemTargetServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage feed item targets.
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
 * try (FeedItemTargetServiceClient feedItemTargetServiceClient =
 *     FeedItemTargetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<FeedItemTargetOperation> operations = new ArrayList<>();
 *   MutateFeedItemTargetsResponse response =
 *       feedItemTargetServiceClient.mutateFeedItemTargets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the FeedItemTargetServiceClient object to clean up
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
 *      <td><p> MutateFeedItemTargets</td>
 *      <td><p> Creates or removes feed item targets. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CriterionError]()   [DatabaseError]()   [DistinctError]()   [FeedItemTargetError]()   [FieldError]()   [HeaderError]()   [IdError]()   [InternalError]()   [MutateError]()   [NotEmptyError]()   [OperatorError]()   [QuotaError]()   [RangeError]()   [RequestError]()   [SizeLimitError]()   [StringFormatError]()   [StringLengthError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateFeedItemTargets(MutateFeedItemTargetsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateFeedItemTargets(String customerId, List&lt;FeedItemTargetOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateFeedItemTargetsCallable()
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
 * <p>This class can be customized by passing in a custom instance of FeedItemTargetServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * FeedItemTargetServiceSettings feedItemTargetServiceSettings =
 *     FeedItemTargetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeedItemTargetServiceClient feedItemTargetServiceClient =
 *     FeedItemTargetServiceClient.create(feedItemTargetServiceSettings);
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
 * FeedItemTargetServiceSettings feedItemTargetServiceSettings =
 *     FeedItemTargetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeedItemTargetServiceClient feedItemTargetServiceClient =
 *     FeedItemTargetServiceClient.create(feedItemTargetServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class FeedItemTargetServiceClient implements BackgroundResource {
  private final FeedItemTargetServiceSettings settings;
  private final FeedItemTargetServiceStub stub;

  /** Constructs an instance of FeedItemTargetServiceClient with default settings. */
  public static final FeedItemTargetServiceClient create() throws IOException {
    return create(FeedItemTargetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeedItemTargetServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeedItemTargetServiceClient create(FeedItemTargetServiceSettings settings)
      throws IOException {
    return new FeedItemTargetServiceClient(settings);
  }

  /**
   * Constructs an instance of FeedItemTargetServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(FeedItemTargetServiceSettings).
   */
  public static final FeedItemTargetServiceClient create(FeedItemTargetServiceStub stub) {
    return new FeedItemTargetServiceClient(stub);
  }

  /**
   * Constructs an instance of FeedItemTargetServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected FeedItemTargetServiceClient(FeedItemTargetServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((FeedItemTargetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected FeedItemTargetServiceClient(FeedItemTargetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedItemTargetServiceSettings getSettings() {
    return settings;
  }

  public FeedItemTargetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes feed item targets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CriterionError]()
   * [DatabaseError]() [DistinctError]() [FeedItemTargetError]() [FieldError]() [HeaderError]()
   * [IdError]() [InternalError]() [MutateError]() [NotEmptyError]() [OperatorError]()
   * [QuotaError]() [RangeError]() [RequestError]() [SizeLimitError]() [StringFormatError]()
   * [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient =
   *     FeedItemTargetServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<FeedItemTargetOperation> operations = new ArrayList<>();
   *   MutateFeedItemTargetsResponse response =
   *       feedItemTargetServiceClient.mutateFeedItemTargets(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose feed item targets are being modified.
   * @param operations Required. The list of operations to perform on individual feed item targets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemTargetsResponse mutateFeedItemTargets(
      String customerId, List<FeedItemTargetOperation> operations) {
    MutateFeedItemTargetsRequest request =
        MutateFeedItemTargetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateFeedItemTargets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes feed item targets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CriterionError]()
   * [DatabaseError]() [DistinctError]() [FeedItemTargetError]() [FieldError]() [HeaderError]()
   * [IdError]() [InternalError]() [MutateError]() [NotEmptyError]() [OperatorError]()
   * [QuotaError]() [RangeError]() [RequestError]() [SizeLimitError]() [StringFormatError]()
   * [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient =
   *     FeedItemTargetServiceClient.create()) {
   *   MutateFeedItemTargetsRequest request =
   *       MutateFeedItemTargetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<FeedItemTargetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateFeedItemTargetsResponse response =
   *       feedItemTargetServiceClient.mutateFeedItemTargets(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemTargetsResponse mutateFeedItemTargets(
      MutateFeedItemTargetsRequest request) {
    return mutateFeedItemTargetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes feed item targets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CriterionError]()
   * [DatabaseError]() [DistinctError]() [FeedItemTargetError]() [FieldError]() [HeaderError]()
   * [IdError]() [InternalError]() [MutateError]() [NotEmptyError]() [OperatorError]()
   * [QuotaError]() [RangeError]() [RequestError]() [SizeLimitError]() [StringFormatError]()
   * [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeedItemTargetServiceClient feedItemTargetServiceClient =
   *     FeedItemTargetServiceClient.create()) {
   *   MutateFeedItemTargetsRequest request =
   *       MutateFeedItemTargetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<FeedItemTargetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateFeedItemTargetsResponse> future =
   *       feedItemTargetServiceClient.mutateFeedItemTargetsCallable().futureCall(request);
   *   // Do something.
   *   MutateFeedItemTargetsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateFeedItemTargetsRequest, MutateFeedItemTargetsResponse>
      mutateFeedItemTargetsCallable() {
    return stub.mutateFeedItemTargetsCallable();
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
