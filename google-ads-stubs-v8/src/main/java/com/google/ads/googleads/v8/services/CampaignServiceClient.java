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

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.resources.Campaign;
import com.google.ads.googleads.v8.resources.CampaignName;
import com.google.ads.googleads.v8.services.stub.CampaignServiceStub;
import com.google.ads.googleads.v8.services.stub.CampaignServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage campaigns.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
 *   CampaignName resourceName = CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]");
 *   Campaign response = campaignServiceClient.getCampaign(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CampaignServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of CampaignServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CampaignServiceSettings campaignServiceSettings =
 *     CampaignServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignServiceClient campaignServiceClient =
 *     CampaignServiceClient.create(campaignServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CampaignServiceSettings campaignServiceSettings =
 *     CampaignServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignServiceClient campaignServiceClient =
 *     CampaignServiceClient.create(campaignServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CampaignServiceClient implements BackgroundResource {
  private final CampaignServiceSettings settings;
  private final CampaignServiceStub stub;

  /** Constructs an instance of CampaignServiceClient with default settings. */
  public static final CampaignServiceClient create() throws IOException {
    return create(CampaignServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CampaignServiceClient create(CampaignServiceSettings settings)
      throws IOException {
    return new CampaignServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(CampaignServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CampaignServiceClient create(CampaignServiceStub stub) {
    return new CampaignServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected CampaignServiceClient(CampaignServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CampaignServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignServiceClient(CampaignServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   CampaignName resourceName = CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]");
   *   Campaign response = campaignServiceClient.getCampaign(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the campaign to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Campaign getCampaign(CampaignName resourceName) {
    GetCampaignRequest request =
        GetCampaignRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCampaign(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   String resourceName = CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString();
   *   Campaign response = campaignServiceClient.getCampaign(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the campaign to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Campaign getCampaign(String resourceName) {
    GetCampaignRequest request =
        GetCampaignRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaign(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   GetCampaignRequest request =
   *       GetCampaignRequest.newBuilder()
   *           .setResourceName(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
   *           .build();
   *   Campaign response = campaignServiceClient.getCampaign(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Campaign getCampaign(GetCampaignRequest request) {
    return getCampaignCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   GetCampaignRequest request =
   *       GetCampaignRequest.newBuilder()
   *           .setResourceName(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
   *           .build();
   *   ApiFuture<Campaign> future = campaignServiceClient.getCampaignCallable().futureCall(request);
   *   // Do something.
   *   Campaign response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetCampaignRequest, Campaign> getCampaignCallable() {
    return stub.getCampaignCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaigns. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdxError]() [AuthenticationError]() [AuthorizationError]()
   * [BiddingError]() [BiddingStrategyError]() [CampaignBudgetError]() [CampaignError]()
   * [ContextError]() [DatabaseError]() [DateError]() [DateRangeError]() [DistinctError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]() [InternalError]()
   * [ListOperationError]() [MutateError]() [NewResourceCreationError]() [NotAllowlistedError]()
   * [NotEmptyError]() [NullError]() [OperationAccessDeniedError]() [OperatorError]() [QuotaError]()
   * [RangeError]() [RegionCodeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SettingError]() [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   * [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CampaignOperation> operations = new ArrayList<>();
   *   MutateCampaignsResponse response =
   *       campaignServiceClient.mutateCampaigns(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose campaigns are being modified.
   * @param operations Required. The list of operations to perform on individual campaigns.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignsResponse mutateCampaigns(
      String customerId, List<CampaignOperation> operations) {
    MutateCampaignsRequest request =
        MutateCampaignsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaigns(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaigns. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdxError]() [AuthenticationError]() [AuthorizationError]()
   * [BiddingError]() [BiddingStrategyError]() [CampaignBudgetError]() [CampaignError]()
   * [ContextError]() [DatabaseError]() [DateError]() [DateRangeError]() [DistinctError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]() [InternalError]()
   * [ListOperationError]() [MutateError]() [NewResourceCreationError]() [NotAllowlistedError]()
   * [NotEmptyError]() [NullError]() [OperationAccessDeniedError]() [OperatorError]() [QuotaError]()
   * [RangeError]() [RegionCodeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SettingError]() [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   * [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   MutateCampaignsRequest request =
   *       MutateCampaignsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCampaignsResponse response = campaignServiceClient.mutateCampaigns(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignsResponse mutateCampaigns(MutateCampaignsRequest request) {
    return mutateCampaignsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaigns. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdxError]() [AuthenticationError]() [AuthorizationError]()
   * [BiddingError]() [BiddingStrategyError]() [CampaignBudgetError]() [CampaignError]()
   * [ContextError]() [DatabaseError]() [DateError]() [DateRangeError]() [DistinctError]()
   * [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]() [InternalError]()
   * [ListOperationError]() [MutateError]() [NewResourceCreationError]() [NotAllowlistedError]()
   * [NotEmptyError]() [NullError]() [OperationAccessDeniedError]() [OperatorError]() [QuotaError]()
   * [RangeError]() [RegionCodeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SettingError]() [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   * [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   MutateCampaignsRequest request =
   *       MutateCampaignsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCampaignsResponse> future =
   *       campaignServiceClient.mutateCampaignsCallable().futureCall(request);
   *   // Do something.
   *   MutateCampaignsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateCampaignsRequest, MutateCampaignsResponse>
      mutateCampaignsCallable() {
    return stub.mutateCampaignsCallable();
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
