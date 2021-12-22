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

import com.google.ads.googleads.v9.resources.FeedItem;
import com.google.ads.googleads.v9.resources.FeedItemName;
import com.google.ads.googleads.v9.services.stub.FeedItemServiceStub;
import com.google.ads.googleads.v9.services.stub.FeedItemServiceStubSettings;
import com.google.api.core.BetaApi;
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
 * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
 *   FeedItemName resourceName = FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]");
 *   FeedItem response = feedItemServiceClient.getFeedItem(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the FeedItemServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of FeedItemServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
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
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected FeedItemServiceClient(FeedItemServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedItemServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FeedItemServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested feed item in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   FeedItemName resourceName = FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]");
   *   FeedItem response = feedItemServiceClient.getFeedItem(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the feed item to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItem getFeedItem(FeedItemName resourceName) {
    GetFeedItemRequest request =
        GetFeedItemRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getFeedItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested feed item in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   String resourceName =
   *       FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]").toString();
   *   FeedItem response = feedItemServiceClient.getFeedItem(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the feed item to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItem getFeedItem(String resourceName) {
    GetFeedItemRequest request =
        GetFeedItemRequest.newBuilder().setResourceName(resourceName).build();
    return getFeedItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested feed item in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   GetFeedItemRequest request =
   *       GetFeedItemRequest.newBuilder()
   *           .setResourceName(
   *               FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]").toString())
   *           .build();
   *   FeedItem response = feedItemServiceClient.getFeedItem(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedItem getFeedItem(GetFeedItemRequest request) {
    return getFeedItemCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested feed item in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
   *   GetFeedItemRequest request =
   *       GetFeedItemRequest.newBuilder()
   *           .setResourceName(
   *               FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]").toString())
   *           .build();
   *   ApiFuture<FeedItem> future = feedItemServiceClient.getFeedItemCallable().futureCall(request);
   *   // Do something.
   *   FeedItem response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFeedItemRequest, FeedItem> getFeedItemCallable() {
    return stub.getFeedItemCallable();
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
