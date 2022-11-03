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

import com.google.ads.googleads.v10.services.stub.GoogleAdsServiceStub;
import com.google.ads.googleads.v10.services.stub.GoogleAdsServiceStubSettings;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch data and metrics across resources.
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
 * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<MutateOperation> mutateOperations = new ArrayList<>();
 *   MutateGoogleAdsResponse response =
 *       googleAdsServiceClient.mutate(customerId, mutateOperations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the GoogleAdsServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of GoogleAdsServiceSettings to
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
 * GoogleAdsServiceSettings googleAdsServiceSettings =
 *     GoogleAdsServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GoogleAdsServiceClient googleAdsServiceClient =
 *     GoogleAdsServiceClient.create(googleAdsServiceSettings);
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
 * GoogleAdsServiceSettings googleAdsServiceSettings =
 *     GoogleAdsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * GoogleAdsServiceClient googleAdsServiceClient =
 *     GoogleAdsServiceClient.create(googleAdsServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class GoogleAdsServiceClient implements BackgroundResource {
  private final GoogleAdsServiceSettings settings;
  private final GoogleAdsServiceStub stub;

  /** Constructs an instance of GoogleAdsServiceClient with default settings. */
  public static final GoogleAdsServiceClient create() throws IOException {
    return create(GoogleAdsServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of GoogleAdsServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final GoogleAdsServiceClient create(GoogleAdsServiceSettings settings)
      throws IOException {
    return new GoogleAdsServiceClient(settings);
  }

  /**
   * Constructs an instance of GoogleAdsServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(GoogleAdsServiceSettings).
   */
  public static final GoogleAdsServiceClient create(GoogleAdsServiceStub stub) {
    return new GoogleAdsServiceClient(stub);
  }

  /**
   * Constructs an instance of GoogleAdsServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GoogleAdsServiceClient(GoogleAdsServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((GoogleAdsServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected GoogleAdsServiceClient(GoogleAdsServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GoogleAdsServiceSettings getSettings() {
    return settings;
  }

  public GoogleAdsServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all rows that match the search query.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ChangeEventError]()
   * [ChangeStatusError]() [ClickViewError]() [HeaderError]() [InternalError]() [QueryError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   String query = "query107944136";
   *   for (GoogleAdsRow element : googleAdsServiceClient.search(customerId, query).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer being queried.
   * @param query Required. The query string.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchPagedResponse search(String customerId, String query) {
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder().setCustomerId(customerId).setQuery(query).build();
    return search(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all rows that match the search query.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ChangeEventError]()
   * [ChangeStatusError]() [ClickViewError]() [HeaderError]() [InternalError]() [QueryError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   SearchGoogleAdsRequest request =
   *       SearchGoogleAdsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setQuery("query107944136")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .setValidateOnly(true)
   *           .setReturnTotalResultsCount(true)
   *           .build();
   *   for (GoogleAdsRow element : googleAdsServiceClient.search(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchPagedResponse search(SearchGoogleAdsRequest request) {
    return searchPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all rows that match the search query.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ChangeEventError]()
   * [ChangeStatusError]() [ClickViewError]() [HeaderError]() [InternalError]() [QueryError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   SearchGoogleAdsRequest request =
   *       SearchGoogleAdsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setQuery("query107944136")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .setValidateOnly(true)
   *           .setReturnTotalResultsCount(true)
   *           .build();
   *   ApiFuture<GoogleAdsRow> future =
   *       googleAdsServiceClient.searchPagedCallable().futureCall(request);
   *   // Do something.
   *   for (GoogleAdsRow element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchGoogleAdsRequest, SearchPagedResponse> searchPagedCallable() {
    return stub.searchPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all rows that match the search query.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ChangeEventError]()
   * [ChangeStatusError]() [ClickViewError]() [HeaderError]() [InternalError]() [QueryError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   SearchGoogleAdsRequest request =
   *       SearchGoogleAdsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setQuery("query107944136")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .setValidateOnly(true)
   *           .setReturnTotalResultsCount(true)
   *           .build();
   *   while (true) {
   *     SearchGoogleAdsResponse response = googleAdsServiceClient.searchCallable().call(request);
   *     for (GoogleAdsRow element : response.getResultsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchGoogleAdsRequest, SearchGoogleAdsResponse> searchCallable() {
    return stub.searchCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all rows that match the search stream query.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ChangeEventError]()
   * [ChangeStatusError]() [ClickViewError]() [HeaderError]() [InternalError]() [QueryError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   SearchGoogleAdsStreamRequest request =
   *       SearchGoogleAdsStreamRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setQuery("query107944136")
   *           .build();
   *   ServerStream<SearchGoogleAdsStreamResponse> stream =
   *       googleAdsServiceClient.searchStreamCallable().call(request);
   *   for (SearchGoogleAdsStreamResponse response : stream) {
   *     // Do something when a response is received.
   *   }
   * }
   * }</pre>
   */
  public final ServerStreamingCallable<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>
      searchStreamCallable() {
    return stub.searchStreamCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes resources. This method supports atomic transactions with multiple
   * types of resources. For example, you can atomically create a campaign and a campaign budget, or
   * perform up to thousands of mutates atomically.
   *
   * <p>This method is essentially a wrapper around a series of mutate methods. The only features it
   * offers over calling those methods directly are:
   *
   * <p>- Atomic transactions - Temp resource names (described below) - Somewhat reduced latency
   * over making a series of mutate calls
   *
   * <p>Note: Only resources that support atomic transactions are included, so this method can't
   * replace all calls to individual services.
   *
   * <p>## Atomic Transaction Benefits
   *
   * <p>Atomicity makes error handling much easier. If you're making a series of changes and one
   * fails, it can leave your account in an inconsistent state. With atomicity, you either reach the
   * chosen state directly, or the request fails and you can retry.
   *
   * <p>## Temp Resource Names
   *
   * <p>Temp resource names are a special type of resource name used to create a resource and
   * reference that resource in the same request. For example, if a campaign budget is created with
   * `resource_name` equal to `customers/123/campaignBudgets/-1`, that resource name can be reused
   * in the `Campaign.budget` field in the same request. That way, the two resources are created and
   * linked atomically.
   *
   * <p>To create a temp resource name, put a negative number in the part of the name that the
   * server would normally allocate.
   *
   * <p>Note:
   *
   * <p>- Resources must be created with a temp name before the name can be reused. For example, the
   * previous CampaignBudget+Campaign example would fail if the mutate order was reversed. - Temp
   * names are not remembered across requests. - There's no limit to the number of temp names in a
   * request. - Each temp name must use a unique negative number, even if the resource types differ.
   *
   * <p>## Latency
   *
   * <p>It's important to group mutates by resource type or the request may time out and fail.
   * Latency is roughly equal to a series of calls to individual mutate methods, where each change
   * in resource type is a new call. For example, mutating 10 campaigns then 10 ad groups is like 2
   * calls, while mutating 1 campaign, 1 ad group, 1 campaign, 1 ad group is like 4 calls.
   *
   * <p>List of thrown errors: [AdCustomizerError]() [AdError]() [AdGroupAdError]()
   * [AdGroupCriterionError]() [AdGroupError]() [AssetError]() [AuthenticationError]()
   * [AuthorizationError]() [BiddingError]() [CampaignBudgetError]() [CampaignCriterionError]()
   * [CampaignError]() [CampaignExperimentError]() [CampaignSharedSetError]()
   * [CollectionSizeError]() [ContextError]() [ConversionActionError]() [CriterionError]()
   * [CustomerFeedError]() [DatabaseError]() [DateError]() [DateRangeError]() [DistinctError]()
   * [ExtensionFeedItemError]() [ExtensionSettingError]() [FeedAttributeReferenceError]()
   * [FeedError]() [FeedItemError]() [FeedItemSetError]() [FieldError]() [FieldMaskError]()
   * [FunctionParsingError]() [HeaderError]() [ImageError]() [InternalError]()
   * [KeywordPlanAdGroupKeywordError]() [KeywordPlanCampaignError]() [KeywordPlanError]()
   * [LabelError]() [ListOperationError]() [MediaUploadError]() [MutateError]()
   * [NewResourceCreationError]() [NullError]() [OperationAccessDeniedError]()
   * [PolicyFindingError]() [PolicyViolationError]() [QuotaError]() [RangeError]() [RequestError]()
   * [ResourceCountLimitExceededError]() [SettingError]() [SharedSetError]() [SizeLimitError]()
   * [StringFormatError]() [StringLengthError]() [UrlFieldError]() [UserListError]()
   * [YoutubeVideoRegistrationError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<MutateOperation> mutateOperations = new ArrayList<>();
   *   MutateGoogleAdsResponse response =
   *       googleAdsServiceClient.mutate(customerId, mutateOperations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose resources are being modified.
   * @param mutateOperations Required. The list of operations to perform on individual resources.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateGoogleAdsResponse mutate(
      String customerId, List<MutateOperation> mutateOperations) {
    MutateGoogleAdsRequest request =
        MutateGoogleAdsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllMutateOperations(mutateOperations)
            .build();
    return mutate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes resources. This method supports atomic transactions with multiple
   * types of resources. For example, you can atomically create a campaign and a campaign budget, or
   * perform up to thousands of mutates atomically.
   *
   * <p>This method is essentially a wrapper around a series of mutate methods. The only features it
   * offers over calling those methods directly are:
   *
   * <p>- Atomic transactions - Temp resource names (described below) - Somewhat reduced latency
   * over making a series of mutate calls
   *
   * <p>Note: Only resources that support atomic transactions are included, so this method can't
   * replace all calls to individual services.
   *
   * <p>## Atomic Transaction Benefits
   *
   * <p>Atomicity makes error handling much easier. If you're making a series of changes and one
   * fails, it can leave your account in an inconsistent state. With atomicity, you either reach the
   * chosen state directly, or the request fails and you can retry.
   *
   * <p>## Temp Resource Names
   *
   * <p>Temp resource names are a special type of resource name used to create a resource and
   * reference that resource in the same request. For example, if a campaign budget is created with
   * `resource_name` equal to `customers/123/campaignBudgets/-1`, that resource name can be reused
   * in the `Campaign.budget` field in the same request. That way, the two resources are created and
   * linked atomically.
   *
   * <p>To create a temp resource name, put a negative number in the part of the name that the
   * server would normally allocate.
   *
   * <p>Note:
   *
   * <p>- Resources must be created with a temp name before the name can be reused. For example, the
   * previous CampaignBudget+Campaign example would fail if the mutate order was reversed. - Temp
   * names are not remembered across requests. - There's no limit to the number of temp names in a
   * request. - Each temp name must use a unique negative number, even if the resource types differ.
   *
   * <p>## Latency
   *
   * <p>It's important to group mutates by resource type or the request may time out and fail.
   * Latency is roughly equal to a series of calls to individual mutate methods, where each change
   * in resource type is a new call. For example, mutating 10 campaigns then 10 ad groups is like 2
   * calls, while mutating 1 campaign, 1 ad group, 1 campaign, 1 ad group is like 4 calls.
   *
   * <p>List of thrown errors: [AdCustomizerError]() [AdError]() [AdGroupAdError]()
   * [AdGroupCriterionError]() [AdGroupError]() [AssetError]() [AuthenticationError]()
   * [AuthorizationError]() [BiddingError]() [CampaignBudgetError]() [CampaignCriterionError]()
   * [CampaignError]() [CampaignExperimentError]() [CampaignSharedSetError]()
   * [CollectionSizeError]() [ContextError]() [ConversionActionError]() [CriterionError]()
   * [CustomerFeedError]() [DatabaseError]() [DateError]() [DateRangeError]() [DistinctError]()
   * [ExtensionFeedItemError]() [ExtensionSettingError]() [FeedAttributeReferenceError]()
   * [FeedError]() [FeedItemError]() [FeedItemSetError]() [FieldError]() [FieldMaskError]()
   * [FunctionParsingError]() [HeaderError]() [ImageError]() [InternalError]()
   * [KeywordPlanAdGroupKeywordError]() [KeywordPlanCampaignError]() [KeywordPlanError]()
   * [LabelError]() [ListOperationError]() [MediaUploadError]() [MutateError]()
   * [NewResourceCreationError]() [NullError]() [OperationAccessDeniedError]()
   * [PolicyFindingError]() [PolicyViolationError]() [QuotaError]() [RangeError]() [RequestError]()
   * [ResourceCountLimitExceededError]() [SettingError]() [SharedSetError]() [SizeLimitError]()
   * [StringFormatError]() [StringLengthError]() [UrlFieldError]() [UserListError]()
   * [YoutubeVideoRegistrationError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   MutateGoogleAdsRequest request =
   *       MutateGoogleAdsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllMutateOperations(new ArrayList<MutateOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateGoogleAdsResponse response = googleAdsServiceClient.mutate(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateGoogleAdsResponse mutate(MutateGoogleAdsRequest request) {
    return mutateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes resources. This method supports atomic transactions with multiple
   * types of resources. For example, you can atomically create a campaign and a campaign budget, or
   * perform up to thousands of mutates atomically.
   *
   * <p>This method is essentially a wrapper around a series of mutate methods. The only features it
   * offers over calling those methods directly are:
   *
   * <p>- Atomic transactions - Temp resource names (described below) - Somewhat reduced latency
   * over making a series of mutate calls
   *
   * <p>Note: Only resources that support atomic transactions are included, so this method can't
   * replace all calls to individual services.
   *
   * <p>## Atomic Transaction Benefits
   *
   * <p>Atomicity makes error handling much easier. If you're making a series of changes and one
   * fails, it can leave your account in an inconsistent state. With atomicity, you either reach the
   * chosen state directly, or the request fails and you can retry.
   *
   * <p>## Temp Resource Names
   *
   * <p>Temp resource names are a special type of resource name used to create a resource and
   * reference that resource in the same request. For example, if a campaign budget is created with
   * `resource_name` equal to `customers/123/campaignBudgets/-1`, that resource name can be reused
   * in the `Campaign.budget` field in the same request. That way, the two resources are created and
   * linked atomically.
   *
   * <p>To create a temp resource name, put a negative number in the part of the name that the
   * server would normally allocate.
   *
   * <p>Note:
   *
   * <p>- Resources must be created with a temp name before the name can be reused. For example, the
   * previous CampaignBudget+Campaign example would fail if the mutate order was reversed. - Temp
   * names are not remembered across requests. - There's no limit to the number of temp names in a
   * request. - Each temp name must use a unique negative number, even if the resource types differ.
   *
   * <p>## Latency
   *
   * <p>It's important to group mutates by resource type or the request may time out and fail.
   * Latency is roughly equal to a series of calls to individual mutate methods, where each change
   * in resource type is a new call. For example, mutating 10 campaigns then 10 ad groups is like 2
   * calls, while mutating 1 campaign, 1 ad group, 1 campaign, 1 ad group is like 4 calls.
   *
   * <p>List of thrown errors: [AdCustomizerError]() [AdError]() [AdGroupAdError]()
   * [AdGroupCriterionError]() [AdGroupError]() [AssetError]() [AuthenticationError]()
   * [AuthorizationError]() [BiddingError]() [CampaignBudgetError]() [CampaignCriterionError]()
   * [CampaignError]() [CampaignExperimentError]() [CampaignSharedSetError]()
   * [CollectionSizeError]() [ContextError]() [ConversionActionError]() [CriterionError]()
   * [CustomerFeedError]() [DatabaseError]() [DateError]() [DateRangeError]() [DistinctError]()
   * [ExtensionFeedItemError]() [ExtensionSettingError]() [FeedAttributeReferenceError]()
   * [FeedError]() [FeedItemError]() [FeedItemSetError]() [FieldError]() [FieldMaskError]()
   * [FunctionParsingError]() [HeaderError]() [ImageError]() [InternalError]()
   * [KeywordPlanAdGroupKeywordError]() [KeywordPlanCampaignError]() [KeywordPlanError]()
   * [LabelError]() [ListOperationError]() [MediaUploadError]() [MutateError]()
   * [NewResourceCreationError]() [NullError]() [OperationAccessDeniedError]()
   * [PolicyFindingError]() [PolicyViolationError]() [QuotaError]() [RangeError]() [RequestError]()
   * [ResourceCountLimitExceededError]() [SettingError]() [SharedSetError]() [SizeLimitError]()
   * [StringFormatError]() [StringLengthError]() [UrlFieldError]() [UserListError]()
   * [YoutubeVideoRegistrationError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
   *   MutateGoogleAdsRequest request =
   *       MutateGoogleAdsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllMutateOperations(new ArrayList<MutateOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateGoogleAdsResponse> future =
   *       googleAdsServiceClient.mutateCallable().futureCall(request);
   *   // Do something.
   *   MutateGoogleAdsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateCallable() {
    return stub.mutateCallable();
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

  public static class SearchPagedResponse
      extends AbstractPagedListResponse<
          SearchGoogleAdsRequest,
          SearchGoogleAdsResponse,
          GoogleAdsRow,
          SearchPage,
          SearchFixedSizeCollection> {

    public static ApiFuture<SearchPagedResponse> createAsync(
        PageContext<SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow> context,
        ApiFuture<SearchGoogleAdsResponse> futureResponse) {
      ApiFuture<SearchPage> futurePage =
          SearchPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new SearchPagedResponse(input), MoreExecutors.directExecutor());
    }

    private SearchPagedResponse(SearchPage page) {
      super(page, SearchFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchPage
      extends AbstractPage<
          SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow, SearchPage> {

    private SearchPage(
        PageContext<SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow> context,
        SearchGoogleAdsResponse response) {
      super(context, response);
    }

    private static SearchPage createEmptyPage() {
      return new SearchPage(null, null);
    }

    @Override
    protected SearchPage createPage(
        PageContext<SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow> context,
        SearchGoogleAdsResponse response) {
      return new SearchPage(context, response);
    }

    @Override
    public ApiFuture<SearchPage> createPageAsync(
        PageContext<SearchGoogleAdsRequest, SearchGoogleAdsResponse, GoogleAdsRow> context,
        ApiFuture<SearchGoogleAdsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchGoogleAdsRequest,
          SearchGoogleAdsResponse,
          GoogleAdsRow,
          SearchPage,
          SearchFixedSizeCollection> {

    private SearchFixedSizeCollection(List<SearchPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchFixedSizeCollection createEmptyCollection() {
      return new SearchFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchFixedSizeCollection createCollection(
        List<SearchPage> pages, int collectionSize) {
      return new SearchFixedSizeCollection(pages, collectionSize);
    }
  }
}
