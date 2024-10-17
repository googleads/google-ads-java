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

package com.google.ads.googleads.v18.services;

import com.google.ads.googleads.v18.services.stub.FeedItemServiceStub;
import com.google.ads.googleads.v18.services.stub.FeedItemServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage feed items.
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
 * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<FeedItemOperation> operations = new ArrayList<>();
 *   MutateFeedItemsResponse response =
 *       feedItemServiceClient.mutateFeedItems(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the FeedItemServiceClient object to clean up resources
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
 *      <td><p> MutateFeedItems</td>
 *      <td><p> Creates, updates, or removes feed items. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CollectionSizeError]()   [CriterionError]()   [DatabaseError]()   [DateError]()   [DistinctError]()   [FeedItemError]()   [FieldError]()   [FieldMaskError]()   [HeaderError]()   [IdError]()   [InternalError]()   [ListOperationError]()   [MutateError]()   [NotEmptyError]()   [NullError]()   [OperatorError]()   [QuotaError]()   [RangeError]()   [RequestError]()   [SizeLimitError]()   [StringFormatError]()   [StringLengthError]()   [UrlFieldError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateFeedItems(MutateFeedItemsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateFeedItems(String customerId, List&lt;FeedItemOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateFeedItemsCallable()
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
 * <p>This class can be customized by passing in a custom instance of FeedItemServiceSettings to
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
 * FeedItemServiceSettings feedItemServiceSettings =
 *     FeedItemServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeedItemServiceClient feedItemServiceClient =
 *     FeedItemServiceClient.create(feedItemServiceSettings);
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
 * FeedItemServiceSettings feedItemServiceSettings =
 *     FeedItemServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeedItemServiceClient feedItemServiceClient =
 *     FeedItemServiceClient.create(feedItemServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class FeedItemServiceClient implements BackgroundResource {
  private final FeedItemServiceSettings settings;
  private final FeedItemServiceStub stub;

  /** Constructs an instance of FeedItemServiceClient with default settings. */
  public static final FeedItemServiceClient create() throws IOException {
    return create(FeedItemServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeedItemServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeedItemServiceClient create(FeedItemServiceSettings settings)
      throws IOException {
    return new FeedItemServiceClient(settings);
  }

  /**
   * Constructs an instance of FeedItemServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(FeedItemServiceSettings).
   */
  public static final FeedItemServiceClient create(FeedItemServiceStub stub) {
    return new FeedItemServiceClient(stub);
  }

  /**
   * Constructs an instance of FeedItemServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected FeedItemServiceClient(FeedItemServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((FeedItemServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected FeedItemServiceClient(FeedItemServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedItemServiceSettings getSettings() {
    return settings;
  }

  public FeedItemServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes feed items. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [CriterionError]() [DatabaseError]() [DateError]() [DistinctError]()
   * [FeedItemError]() [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]()
   * [InternalError]() [ListOperationError]() [MutateError]() [NotEmptyError]() [NullError]()
   * [OperatorError]() [QuotaError]() [RangeError]() [RequestError]() [SizeLimitError]()
   * [StringFormatError]() [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<FeedItemOperation> operations = new ArrayList<>();
   *   MutateFeedItemsResponse response =
   *       feedItemServiceClient.mutateFeedItems(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose feed items are being modified.
   * @param operations Required. The list of operations to perform on individual feed items.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemsResponse mutateFeedItems(
      String customerId, List<FeedItemOperation> operations) {
    MutateFeedItemsRequest request =
        MutateFeedItemsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateFeedItems(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes feed items. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [CriterionError]() [DatabaseError]() [DateError]() [DistinctError]()
   * [FeedItemError]() [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]()
   * [InternalError]() [ListOperationError]() [MutateError]() [NotEmptyError]() [NullError]()
   * [OperatorError]() [QuotaError]() [RangeError]() [RequestError]() [SizeLimitError]()
   * [StringFormatError]() [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   MutateFeedItemsRequest request =
   *       MutateFeedItemsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<FeedItemOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateFeedItemsResponse response = feedItemServiceClient.mutateFeedItems(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedItemsResponse mutateFeedItems(MutateFeedItemsRequest request) {
    return mutateFeedItemsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes feed items. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [CriterionError]() [DatabaseError]() [DateError]() [DistinctError]()
   * [FeedItemError]() [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]()
   * [InternalError]() [ListOperationError]() [MutateError]() [NotEmptyError]() [NullError]()
   * [OperatorError]() [QuotaError]() [RangeError]() [RequestError]() [SizeLimitError]()
   * [StringFormatError]() [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   MutateFeedItemsRequest request =
   *       MutateFeedItemsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<FeedItemOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateFeedItemsResponse> future =
   *       feedItemServiceClient.mutateFeedItemsCallable().futureCall(request);
   *   // Do something.
   *   MutateFeedItemsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateFeedItemsRequest, MutateFeedItemsResponse>
      mutateFeedItemsCallable() {
    return stub.mutateFeedItemsCallable();
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
