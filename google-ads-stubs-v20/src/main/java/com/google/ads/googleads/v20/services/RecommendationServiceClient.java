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

package com.google.ads.googleads.v20.services;

import com.google.ads.googleads.v20.enums.AdvertisingChannelTypeEnum;
import com.google.ads.googleads.v20.enums.RecommendationTypeEnum;
import com.google.ads.googleads.v20.services.stub.RecommendationServiceStub;
import com.google.ads.googleads.v20.services.stub.RecommendationServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage recommendations.
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
 * try (RecommendationServiceClient recommendationServiceClient =
 *     RecommendationServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ApplyRecommendationOperation> operations = new ArrayList<>();
 *   ApplyRecommendationResponse response =
 *       recommendationServiceClient.applyRecommendation(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the RecommendationServiceClient object to clean up
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
 *      <td><p> ApplyRecommendation</td>
 *      <td><p> Applies given recommendations with corresponding apply parameters.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [DatabaseError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RecommendationError]()   [RequestError]()   [UrlFieldError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> applyRecommendation(ApplyRecommendationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> applyRecommendation(String customerId, List&lt;ApplyRecommendationOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> applyRecommendationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DismissRecommendation</td>
 *      <td><p> Dismisses given recommendations.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RecommendationError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> dismissRecommendation(DismissRecommendationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> dismissRecommendation(String customerId, List&lt;DismissRecommendationRequest.DismissRecommendationOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> dismissRecommendationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateRecommendations</td>
 *      <td><p> Generates Recommendations based off the requested recommendation_types.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RecommendationError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateRecommendations(GenerateRecommendationsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateRecommendations(String customerId, List&lt;RecommendationTypeEnum.RecommendationType&gt; recommendationTypes, AdvertisingChannelTypeEnum.AdvertisingChannelType advertisingChannelType)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateRecommendationsCallable()
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
 * <p>This class can be customized by passing in a custom instance of RecommendationServiceSettings
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
 * RecommendationServiceSettings recommendationServiceSettings =
 *     RecommendationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RecommendationServiceClient recommendationServiceClient =
 *     RecommendationServiceClient.create(recommendationServiceSettings);
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
 * RecommendationServiceSettings recommendationServiceSettings =
 *     RecommendationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RecommendationServiceClient recommendationServiceClient =
 *     RecommendationServiceClient.create(recommendationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class RecommendationServiceClient implements BackgroundResource {
  private final RecommendationServiceSettings settings;
  private final RecommendationServiceStub stub;

  /** Constructs an instance of RecommendationServiceClient with default settings. */
  public static final RecommendationServiceClient create() throws IOException {
    return create(RecommendationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RecommendationServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RecommendationServiceClient create(RecommendationServiceSettings settings)
      throws IOException {
    return new RecommendationServiceClient(settings);
  }

  /**
   * Constructs an instance of RecommendationServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(RecommendationServiceSettings).
   */
  public static final RecommendationServiceClient create(RecommendationServiceStub stub) {
    return new RecommendationServiceClient(stub);
  }

  /**
   * Constructs an instance of RecommendationServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected RecommendationServiceClient(RecommendationServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RecommendationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected RecommendationServiceClient(RecommendationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RecommendationServiceSettings getSettings() {
    return settings;
  }

  public RecommendationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Applies given recommendations with corresponding apply parameters.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
   * [RecommendationError]() [RequestError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommendationServiceClient recommendationServiceClient =
   *     RecommendationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<ApplyRecommendationOperation> operations = new ArrayList<>();
   *   ApplyRecommendationResponse response =
   *       recommendationServiceClient.applyRecommendation(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer with the recommendation.
   * @param operations Required. The list of operations to apply recommendations. If
   *     partial_failure=false all recommendations should be of the same type There is a limit of
   *     100 operations per request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ApplyRecommendationResponse applyRecommendation(
      String customerId, List<ApplyRecommendationOperation> operations) {
    ApplyRecommendationRequest request =
        ApplyRecommendationRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return applyRecommendation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Applies given recommendations with corresponding apply parameters.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
   * [RecommendationError]() [RequestError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommendationServiceClient recommendationServiceClient =
   *     RecommendationServiceClient.create()) {
   *   ApplyRecommendationRequest request =
   *       ApplyRecommendationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ApplyRecommendationOperation>())
   *           .setPartialFailure(true)
   *           .build();
   *   ApplyRecommendationResponse response =
   *       recommendationServiceClient.applyRecommendation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ApplyRecommendationResponse applyRecommendation(ApplyRecommendationRequest request) {
    return applyRecommendationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Applies given recommendations with corresponding apply parameters.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
   * [RecommendationError]() [RequestError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommendationServiceClient recommendationServiceClient =
   *     RecommendationServiceClient.create()) {
   *   ApplyRecommendationRequest request =
   *       ApplyRecommendationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ApplyRecommendationOperation>())
   *           .setPartialFailure(true)
   *           .build();
   *   ApiFuture<ApplyRecommendationResponse> future =
   *       recommendationServiceClient.applyRecommendationCallable().futureCall(request);
   *   // Do something.
   *   ApplyRecommendationResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ApplyRecommendationRequest, ApplyRecommendationResponse>
      applyRecommendationCallable() {
    return stub.applyRecommendationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Dismisses given recommendations.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RecommendationError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommendationServiceClient recommendationServiceClient =
   *     RecommendationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<DismissRecommendationRequest.DismissRecommendationOperation> operations =
   *       new ArrayList<>();
   *   DismissRecommendationResponse response =
   *       recommendationServiceClient.dismissRecommendation(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer with the recommendation.
   * @param operations Required. The list of operations to dismiss recommendations. If
   *     partial_failure=false all recommendations should be of the same type There is a limit of
   *     100 operations per request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DismissRecommendationResponse dismissRecommendation(
      String customerId,
      List<DismissRecommendationRequest.DismissRecommendationOperation> operations) {
    DismissRecommendationRequest request =
        DismissRecommendationRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return dismissRecommendation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Dismisses given recommendations.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RecommendationError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommendationServiceClient recommendationServiceClient =
   *     RecommendationServiceClient.create()) {
   *   DismissRecommendationRequest request =
   *       DismissRecommendationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(
   *               new ArrayList<DismissRecommendationRequest.DismissRecommendationOperation>())
   *           .setPartialFailure(true)
   *           .build();
   *   DismissRecommendationResponse response =
   *       recommendationServiceClient.dismissRecommendation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DismissRecommendationResponse dismissRecommendation(
      DismissRecommendationRequest request) {
    return dismissRecommendationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Dismisses given recommendations.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RecommendationError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommendationServiceClient recommendationServiceClient =
   *     RecommendationServiceClient.create()) {
   *   DismissRecommendationRequest request =
   *       DismissRecommendationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(
   *               new ArrayList<DismissRecommendationRequest.DismissRecommendationOperation>())
   *           .setPartialFailure(true)
   *           .build();
   *   ApiFuture<DismissRecommendationResponse> future =
   *       recommendationServiceClient.dismissRecommendationCallable().futureCall(request);
   *   // Do something.
   *   DismissRecommendationResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DismissRecommendationRequest, DismissRecommendationResponse>
      dismissRecommendationCallable() {
    return stub.dismissRecommendationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates Recommendations based off the requested recommendation_types.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RecommendationError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommendationServiceClient recommendationServiceClient =
   *     RecommendationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<RecommendationTypeEnum.RecommendationType> recommendationTypes = new ArrayList<>();
   *   AdvertisingChannelTypeEnum.AdvertisingChannelType advertisingChannelType =
   *       AdvertisingChannelTypeEnum.AdvertisingChannelType.forNumber(0);
   *   GenerateRecommendationsResponse response =
   *       recommendationServiceClient.generateRecommendations(
   *           customerId, recommendationTypes, advertisingChannelType);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer generating recommendations.
   * @param recommendationTypes Required. List of eligible recommendation_types to generate. If the
   *     uploaded criteria isn't sufficient to make a recommendation, or the campaign is already in
   *     the recommended state, no recommendation will be returned for that type. Generally, a
   *     recommendation is returned if all required fields for that recommendation_type are
   *     uploaded, but there are cases where this is still not sufficient.
   *     <p>The following recommendation_types are supported for recommendation generation:
   *     CAMPAIGN_BUDGET, KEYWORD, MAXIMIZE_CLICKS_OPT_IN, MAXIMIZE_CONVERSIONS_OPT_IN,
   *     MAXIMIZE_CONVERSION_VALUE_OPT_IN, SET_TARGET_CPA, SET_TARGET_ROAS, SITELINK_ASSET,
   *     TARGET_CPA_OPT_IN, TARGET_ROAS_OPT_IN
   * @param advertisingChannelType Required. Advertising channel type of the campaign. The following
   *     advertising_channel_types are supported for recommendation generation: PERFORMANCE_MAX and
   *     SEARCH
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateRecommendationsResponse generateRecommendations(
      String customerId,
      List<RecommendationTypeEnum.RecommendationType> recommendationTypes,
      AdvertisingChannelTypeEnum.AdvertisingChannelType advertisingChannelType) {
    GenerateRecommendationsRequest request =
        GenerateRecommendationsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllRecommendationTypes(recommendationTypes)
            .setAdvertisingChannelType(advertisingChannelType)
            .build();
    return generateRecommendations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates Recommendations based off the requested recommendation_types.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RecommendationError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommendationServiceClient recommendationServiceClient =
   *     RecommendationServiceClient.create()) {
   *   GenerateRecommendationsRequest request =
   *       GenerateRecommendationsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllRecommendationTypes(new ArrayList<RecommendationTypeEnum.RecommendationType>())
   *           .setCampaignSitelinkCount(1870978592)
   *           .setBiddingInfo(GenerateRecommendationsRequest.BiddingInfo.newBuilder().build())
   *           .addAllAdGroupInfo(new ArrayList<GenerateRecommendationsRequest.AdGroupInfo>())
   *           .setSeedInfo(GenerateRecommendationsRequest.SeedInfo.newBuilder().build())
   *           .setBudgetInfo(GenerateRecommendationsRequest.BudgetInfo.newBuilder().build())
   *           .setCampaignImageAssetCount(-1767290707)
   *           .setCampaignCallAssetCount(1663142382)
   *           .addAllCountryCodes(new ArrayList<String>())
   *           .addAllLanguageCodes(new ArrayList<String>())
   *           .addAllPositiveLocationsIds(new ArrayList<Long>())
   *           .addAllNegativeLocationsIds(new ArrayList<Long>())
   *           .addAllAssetGroupInfo(new ArrayList<GenerateRecommendationsRequest.AssetGroupInfo>())
   *           .setTargetPartnerSearchNetwork(true)
   *           .setTargetContentNetwork(true)
   *           .setMerchantCenterAccountId(-1368465440)
   *           .build();
   *   GenerateRecommendationsResponse response =
   *       recommendationServiceClient.generateRecommendations(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateRecommendationsResponse generateRecommendations(
      GenerateRecommendationsRequest request) {
    return generateRecommendationsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates Recommendations based off the requested recommendation_types.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RecommendationError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommendationServiceClient recommendationServiceClient =
   *     RecommendationServiceClient.create()) {
   *   GenerateRecommendationsRequest request =
   *       GenerateRecommendationsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllRecommendationTypes(new ArrayList<RecommendationTypeEnum.RecommendationType>())
   *           .setCampaignSitelinkCount(1870978592)
   *           .setBiddingInfo(GenerateRecommendationsRequest.BiddingInfo.newBuilder().build())
   *           .addAllAdGroupInfo(new ArrayList<GenerateRecommendationsRequest.AdGroupInfo>())
   *           .setSeedInfo(GenerateRecommendationsRequest.SeedInfo.newBuilder().build())
   *           .setBudgetInfo(GenerateRecommendationsRequest.BudgetInfo.newBuilder().build())
   *           .setCampaignImageAssetCount(-1767290707)
   *           .setCampaignCallAssetCount(1663142382)
   *           .addAllCountryCodes(new ArrayList<String>())
   *           .addAllLanguageCodes(new ArrayList<String>())
   *           .addAllPositiveLocationsIds(new ArrayList<Long>())
   *           .addAllNegativeLocationsIds(new ArrayList<Long>())
   *           .addAllAssetGroupInfo(new ArrayList<GenerateRecommendationsRequest.AssetGroupInfo>())
   *           .setTargetPartnerSearchNetwork(true)
   *           .setTargetContentNetwork(true)
   *           .setMerchantCenterAccountId(-1368465440)
   *           .build();
   *   ApiFuture<GenerateRecommendationsResponse> future =
   *       recommendationServiceClient.generateRecommendationsCallable().futureCall(request);
   *   // Do something.
   *   GenerateRecommendationsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateRecommendationsRequest, GenerateRecommendationsResponse>
      generateRecommendationsCallable() {
    return stub.generateRecommendationsCallable();
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
