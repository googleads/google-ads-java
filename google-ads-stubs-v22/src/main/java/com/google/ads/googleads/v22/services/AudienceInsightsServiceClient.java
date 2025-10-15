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

package com.google.ads.googleads.v22.services;

import com.google.ads.googleads.v22.common.AudienceInsightsAttribute;
import com.google.ads.googleads.v22.common.LocationInfo;
import com.google.ads.googleads.v22.enums.AudienceInsightsDimensionEnum;
import com.google.ads.googleads.v22.services.stub.AudienceInsightsServiceStub;
import com.google.ads.googleads.v22.services.stub.AudienceInsightsServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Audience Insights Service helps users find information about groups of
 * people and how they can be reached with Google Ads. Accessible to allowlisted customers only.
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
 * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
 *     AudienceInsightsServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   InsightsAudience baselineAudience = InsightsAudience.newBuilder().build();
 *   InsightsAudience specificAudience = InsightsAudience.newBuilder().build();
 *   GenerateInsightsFinderReportResponse response =
 *       audienceInsightsServiceClient.generateInsightsFinderReport(
 *           customerId, baselineAudience, specificAudience);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AudienceInsightsServiceClient object to clean up
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
 *      <td><p> GenerateInsightsFinderReport</td>
 *      <td><p> Creates a saved report that can be viewed in the Insights Finder tool.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateInsightsFinderReport(GenerateInsightsFinderReportRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateInsightsFinderReport(String customerId, InsightsAudience baselineAudience, InsightsAudience specificAudience)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateInsightsFinderReportCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListAudienceInsightsAttributes</td>
 *      <td><p> Searches for audience attributes that can be used to generate insights.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listAudienceInsightsAttributes(ListAudienceInsightsAttributesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listAudienceInsightsAttributes(String customerId, List&lt;AudienceInsightsDimensionEnum.AudienceInsightsDimension&gt; dimensions, String queryText)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listAudienceInsightsAttributesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListInsightsEligibleDates</td>
 *      <td><p> Lists date ranges for which audience insights data can be requested.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listInsightsEligibleDates(ListInsightsEligibleDatesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listInsightsEligibleDatesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateAudienceCompositionInsights</td>
 *      <td><p> Returns a collection of attributes that are represented in an audience of interest, with metrics that compare each attribute's share of the audience with its share of a baseline audience.
 * <p>  List of thrown errors:   [AudienceInsightsError]()   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateAudienceCompositionInsights(GenerateAudienceCompositionInsightsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateAudienceCompositionInsights(String customerId, InsightsAudience audience, List&lt;AudienceInsightsDimensionEnum.AudienceInsightsDimension&gt; dimensions)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateAudienceCompositionInsightsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateSuggestedTargetingInsights</td>
 *      <td><p> Returns a collection of targeting insights (e.g. targetable audiences) that are relevant to the requested audience.
 * <p>  List of thrown errors:   [AudienceInsightsError]()   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateSuggestedTargetingInsights(GenerateSuggestedTargetingInsightsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateSuggestedTargetingInsightsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateAudienceOverlapInsights</td>
 *      <td><p> Returns a collection of audience attributes along with estimates of the overlap between their potential YouTube reach and that of a given input attribute.
 * <p>  List of thrown errors:   [AudienceInsightsError]()   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateAudienceOverlapInsights(GenerateAudienceOverlapInsightsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateAudienceOverlapInsights(String customerId, LocationInfo countryLocation, AudienceInsightsAttribute primaryAttribute, List&lt;AudienceInsightsDimensionEnum.AudienceInsightsDimension&gt; dimensions)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateAudienceOverlapInsightsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateTargetingSuggestionMetrics</td>
 *      <td><p> Returns potential reach metrics for targetable audiences.
 * <p>  This method helps answer questions like "How many Men aged 18+ interested in Camping can be reached on YouTube?"
 * <p>  List of thrown errors:   [AudienceInsightsError]()   [AuthenticationError]()   [AuthorizationError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateTargetingSuggestionMetrics(GenerateTargetingSuggestionMetricsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateTargetingSuggestionMetrics(String customerId, List&lt;InsightsAudience&gt; audiences)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateTargetingSuggestionMetricsCallable()
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
 * AudienceInsightsServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AudienceInsightsServiceSettings audienceInsightsServiceSettings =
 *     AudienceInsightsServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AudienceInsightsServiceClient audienceInsightsServiceClient =
 *     AudienceInsightsServiceClient.create(audienceInsightsServiceSettings);
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
 * AudienceInsightsServiceSettings audienceInsightsServiceSettings =
 *     AudienceInsightsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AudienceInsightsServiceClient audienceInsightsServiceClient =
 *     AudienceInsightsServiceClient.create(audienceInsightsServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AudienceInsightsServiceClient implements BackgroundResource {
  private final AudienceInsightsServiceSettings settings;
  private final AudienceInsightsServiceStub stub;

  /** Constructs an instance of AudienceInsightsServiceClient with default settings. */
  public static final AudienceInsightsServiceClient create() throws IOException {
    return create(AudienceInsightsServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AudienceInsightsServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AudienceInsightsServiceClient create(AudienceInsightsServiceSettings settings)
      throws IOException {
    return new AudienceInsightsServiceClient(settings);
  }

  /**
   * Constructs an instance of AudienceInsightsServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AudienceInsightsServiceSettings).
   */
  public static final AudienceInsightsServiceClient create(AudienceInsightsServiceStub stub) {
    return new AudienceInsightsServiceClient(stub);
  }

  /**
   * Constructs an instance of AudienceInsightsServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AudienceInsightsServiceClient(AudienceInsightsServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((AudienceInsightsServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AudienceInsightsServiceClient(AudienceInsightsServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AudienceInsightsServiceSettings getSettings() {
    return settings;
  }

  public AudienceInsightsServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a saved report that can be viewed in the Insights Finder tool.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   InsightsAudience baselineAudience = InsightsAudience.newBuilder().build();
   *   InsightsAudience specificAudience = InsightsAudience.newBuilder().build();
   *   GenerateInsightsFinderReportResponse response =
   *       audienceInsightsServiceClient.generateInsightsFinderReport(
   *           customerId, baselineAudience, specificAudience);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer.
   * @param baselineAudience Required. A baseline audience for this report, typically all people in
   *     a region.
   * @param specificAudience Required. The specific audience of interest for this report. The
   *     insights in the report will be based on attributes more prevalent in this audience than in
   *     the report's baseline audience.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateInsightsFinderReportResponse generateInsightsFinderReport(
      String customerId, InsightsAudience baselineAudience, InsightsAudience specificAudience) {
    GenerateInsightsFinderReportRequest request =
        GenerateInsightsFinderReportRequest.newBuilder()
            .setCustomerId(customerId)
            .setBaselineAudience(baselineAudience)
            .setSpecificAudience(specificAudience)
            .build();
    return generateInsightsFinderReport(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a saved report that can be viewed in the Insights Finder tool.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateInsightsFinderReportRequest request =
   *       GenerateInsightsFinderReportRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setBaselineAudience(InsightsAudience.newBuilder().build())
   *           .setSpecificAudience(InsightsAudience.newBuilder().build())
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   GenerateInsightsFinderReportResponse response =
   *       audienceInsightsServiceClient.generateInsightsFinderReport(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateInsightsFinderReportResponse generateInsightsFinderReport(
      GenerateInsightsFinderReportRequest request) {
    return generateInsightsFinderReportCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a saved report that can be viewed in the Insights Finder tool.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateInsightsFinderReportRequest request =
   *       GenerateInsightsFinderReportRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setBaselineAudience(InsightsAudience.newBuilder().build())
   *           .setSpecificAudience(InsightsAudience.newBuilder().build())
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateInsightsFinderReportResponse> future =
   *       audienceInsightsServiceClient.generateInsightsFinderReportCallable().futureCall(request);
   *   // Do something.
   *   GenerateInsightsFinderReportResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
      generateInsightsFinderReportCallable() {
    return stub.generateInsightsFinderReportCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches for audience attributes that can be used to generate insights.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions = new ArrayList<>();
   *   String queryText = "queryText-1806881259";
   *   ListAudienceInsightsAttributesResponse response =
   *       audienceInsightsServiceClient.listAudienceInsightsAttributes(
   *           customerId, dimensions, queryText);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer.
   * @param dimensions Required. The types of attributes to be returned. Supported dimensions are
   *     CATEGORY, KNOWLEDGE_GRAPH, DEVICE, GEO_TARGET_COUNTRY, SUB_COUNTRY_LOCATION,
   *     YOUTUBE_LINEUP, AFFINITY_USER_INTEREST, IN_MARKET_USER_INTEREST, PARENTAL_STATUS,
   *     INCOME_RANGE, AGE_RANGE, and GENDER.
   * @param queryText Required. A free text query. If the requested dimensions include Attributes
   *     CATEGORY or KNOWLEDGE_GRAPH, then the attributes returned for those dimensions will match
   *     or be related to this string. For other dimensions, this field is ignored and all available
   *     attributes are returned.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAudienceInsightsAttributesResponse listAudienceInsightsAttributes(
      String customerId,
      List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions,
      String queryText) {
    ListAudienceInsightsAttributesRequest request =
        ListAudienceInsightsAttributesRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllDimensions(dimensions)
            .setQueryText(queryText)
            .build();
    return listAudienceInsightsAttributes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches for audience attributes that can be used to generate insights.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   ListAudienceInsightsAttributesRequest request =
   *       ListAudienceInsightsAttributesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllDimensions(
   *               new ArrayList<AudienceInsightsDimensionEnum.AudienceInsightsDimension>())
   *           .setQueryText("queryText-1806881259")
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .addAllLocationCountryFilters(new ArrayList<LocationInfo>())
   *           .setYoutubeReachLocation(LocationInfo.newBuilder().build())
   *           .build();
   *   ListAudienceInsightsAttributesResponse response =
   *       audienceInsightsServiceClient.listAudienceInsightsAttributes(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAudienceInsightsAttributesResponse listAudienceInsightsAttributes(
      ListAudienceInsightsAttributesRequest request) {
    return listAudienceInsightsAttributesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches for audience attributes that can be used to generate insights.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   ListAudienceInsightsAttributesRequest request =
   *       ListAudienceInsightsAttributesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllDimensions(
   *               new ArrayList<AudienceInsightsDimensionEnum.AudienceInsightsDimension>())
   *           .setQueryText("queryText-1806881259")
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .addAllLocationCountryFilters(new ArrayList<LocationInfo>())
   *           .setYoutubeReachLocation(LocationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<ListAudienceInsightsAttributesResponse> future =
   *       audienceInsightsServiceClient
   *           .listAudienceInsightsAttributesCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ListAudienceInsightsAttributesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
      listAudienceInsightsAttributesCallable() {
    return stub.listAudienceInsightsAttributesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists date ranges for which audience insights data can be requested.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   ListInsightsEligibleDatesRequest request =
   *       ListInsightsEligibleDatesRequest.newBuilder()
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ListInsightsEligibleDatesResponse response =
   *       audienceInsightsServiceClient.listInsightsEligibleDates(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInsightsEligibleDatesResponse listInsightsEligibleDates(
      ListInsightsEligibleDatesRequest request) {
    return listInsightsEligibleDatesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists date ranges for which audience insights data can be requested.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   ListInsightsEligibleDatesRequest request =
   *       ListInsightsEligibleDatesRequest.newBuilder()
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<ListInsightsEligibleDatesResponse> future =
   *       audienceInsightsServiceClient.listInsightsEligibleDatesCallable().futureCall(request);
   *   // Do something.
   *   ListInsightsEligibleDatesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
      listInsightsEligibleDatesCallable() {
    return stub.listInsightsEligibleDatesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a collection of attributes that are represented in an audience of interest, with
   * metrics that compare each attribute's share of the audience with its share of a baseline
   * audience.
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   InsightsAudience audience = InsightsAudience.newBuilder().build();
   *   List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions = new ArrayList<>();
   *   GenerateAudienceCompositionInsightsResponse response =
   *       audienceInsightsServiceClient.generateAudienceCompositionInsights(
   *           customerId, audience, dimensions);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer.
   * @param audience Required. The audience of interest for which insights are being requested.
   * @param dimensions Required. The audience dimensions for which composition insights should be
   *     returned. Supported dimensions are KNOWLEDGE_GRAPH, GEO_TARGET_COUNTRY,
   *     SUB_COUNTRY_LOCATION, YOUTUBE_CHANNEL, YOUTUBE_LINEUP, AFFINITY_USER_INTEREST,
   *     IN_MARKET_USER_INTEREST, PARENTAL_STATUS, INCOME_RANGE, AGE_RANGE, and GENDER.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateAudienceCompositionInsightsResponse generateAudienceCompositionInsights(
      String customerId,
      InsightsAudience audience,
      List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions) {
    GenerateAudienceCompositionInsightsRequest request =
        GenerateAudienceCompositionInsightsRequest.newBuilder()
            .setCustomerId(customerId)
            .setAudience(audience)
            .addAllDimensions(dimensions)
            .build();
    return generateAudienceCompositionInsights(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a collection of attributes that are represented in an audience of interest, with
   * metrics that compare each attribute's share of the audience with its share of a baseline
   * audience.
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateAudienceCompositionInsightsRequest request =
   *       GenerateAudienceCompositionInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setAudience(InsightsAudience.newBuilder().build())
   *           .setBaselineAudience(InsightsAudience.newBuilder().build())
   *           .setDataMonth("dataMonth-380142346")
   *           .addAllDimensions(
   *               new ArrayList<AudienceInsightsDimensionEnum.AudienceInsightsDimension>())
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   GenerateAudienceCompositionInsightsResponse response =
   *       audienceInsightsServiceClient.generateAudienceCompositionInsights(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateAudienceCompositionInsightsResponse generateAudienceCompositionInsights(
      GenerateAudienceCompositionInsightsRequest request) {
    return generateAudienceCompositionInsightsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a collection of attributes that are represented in an audience of interest, with
   * metrics that compare each attribute's share of the audience with its share of a baseline
   * audience.
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateAudienceCompositionInsightsRequest request =
   *       GenerateAudienceCompositionInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setAudience(InsightsAudience.newBuilder().build())
   *           .setBaselineAudience(InsightsAudience.newBuilder().build())
   *           .setDataMonth("dataMonth-380142346")
   *           .addAllDimensions(
   *               new ArrayList<AudienceInsightsDimensionEnum.AudienceInsightsDimension>())
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateAudienceCompositionInsightsResponse> future =
   *       audienceInsightsServiceClient
   *           .generateAudienceCompositionInsightsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   GenerateAudienceCompositionInsightsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
      generateAudienceCompositionInsightsCallable() {
    return stub.generateAudienceCompositionInsightsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a collection of targeting insights (e.g. targetable audiences) that are relevant to the
   * requested audience.
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateSuggestedTargetingInsightsRequest request =
   *       GenerateSuggestedTargetingInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   GenerateSuggestedTargetingInsightsResponse response =
   *       audienceInsightsServiceClient.generateSuggestedTargetingInsights(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateSuggestedTargetingInsightsResponse generateSuggestedTargetingInsights(
      GenerateSuggestedTargetingInsightsRequest request) {
    return generateSuggestedTargetingInsightsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a collection of targeting insights (e.g. targetable audiences) that are relevant to the
   * requested audience.
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateSuggestedTargetingInsightsRequest request =
   *       GenerateSuggestedTargetingInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateSuggestedTargetingInsightsResponse> future =
   *       audienceInsightsServiceClient
   *           .generateSuggestedTargetingInsightsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   GenerateSuggestedTargetingInsightsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
      generateSuggestedTargetingInsightsCallable() {
    return stub.generateSuggestedTargetingInsightsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a collection of audience attributes along with estimates of the overlap between their
   * potential YouTube reach and that of a given input attribute.
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   LocationInfo countryLocation = LocationInfo.newBuilder().build();
   *   AudienceInsightsAttribute primaryAttribute = AudienceInsightsAttribute.newBuilder().build();
   *   List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions = new ArrayList<>();
   *   GenerateAudienceOverlapInsightsResponse response =
   *       audienceInsightsServiceClient.generateAudienceOverlapInsights(
   *           customerId, countryLocation, primaryAttribute, dimensions);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer.
   * @param countryLocation Required. The country in which to calculate the sizes and overlaps of
   *     audiences.
   * @param primaryAttribute Required. The audience attribute that should be intersected with all
   *     other eligible audiences. This must be an Affinity or In-Market UserInterest, an AgeRange
   *     or a Gender.
   * @param dimensions Required. The types of attributes of which to calculate the overlap with the
   *     primary_attribute. The values must be a subset of AFFINITY_USER_INTEREST,
   *     IN_MARKET_USER_INTEREST, AGE_RANGE and GENDER.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateAudienceOverlapInsightsResponse generateAudienceOverlapInsights(
      String customerId,
      LocationInfo countryLocation,
      AudienceInsightsAttribute primaryAttribute,
      List<AudienceInsightsDimensionEnum.AudienceInsightsDimension> dimensions) {
    GenerateAudienceOverlapInsightsRequest request =
        GenerateAudienceOverlapInsightsRequest.newBuilder()
            .setCustomerId(customerId)
            .setCountryLocation(countryLocation)
            .setPrimaryAttribute(primaryAttribute)
            .addAllDimensions(dimensions)
            .build();
    return generateAudienceOverlapInsights(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a collection of audience attributes along with estimates of the overlap between their
   * potential YouTube reach and that of a given input attribute.
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateAudienceOverlapInsightsRequest request =
   *       GenerateAudienceOverlapInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCountryLocation(LocationInfo.newBuilder().build())
   *           .setPrimaryAttribute(AudienceInsightsAttribute.newBuilder().build())
   *           .addAllDimensions(
   *               new ArrayList<AudienceInsightsDimensionEnum.AudienceInsightsDimension>())
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   GenerateAudienceOverlapInsightsResponse response =
   *       audienceInsightsServiceClient.generateAudienceOverlapInsights(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateAudienceOverlapInsightsResponse generateAudienceOverlapInsights(
      GenerateAudienceOverlapInsightsRequest request) {
    return generateAudienceOverlapInsightsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a collection of audience attributes along with estimates of the overlap between their
   * potential YouTube reach and that of a given input attribute.
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateAudienceOverlapInsightsRequest request =
   *       GenerateAudienceOverlapInsightsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCountryLocation(LocationInfo.newBuilder().build())
   *           .setPrimaryAttribute(AudienceInsightsAttribute.newBuilder().build())
   *           .addAllDimensions(
   *               new ArrayList<AudienceInsightsDimensionEnum.AudienceInsightsDimension>())
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateAudienceOverlapInsightsResponse> future =
   *       audienceInsightsServiceClient
   *           .generateAudienceOverlapInsightsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   GenerateAudienceOverlapInsightsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
      generateAudienceOverlapInsightsCallable() {
    return stub.generateAudienceOverlapInsightsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns potential reach metrics for targetable audiences.
   *
   * <p>This method helps answer questions like "How many Men aged 18+ interested in Camping can be
   * reached on YouTube?"
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<InsightsAudience> audiences = new ArrayList<>();
   *   GenerateTargetingSuggestionMetricsResponse response =
   *       audienceInsightsServiceClient.generateTargetingSuggestionMetrics(customerId, audiences);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer.
   * @param audiences Required. Audiences to request metrics for.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateTargetingSuggestionMetricsResponse generateTargetingSuggestionMetrics(
      String customerId, List<InsightsAudience> audiences) {
    GenerateTargetingSuggestionMetricsRequest request =
        GenerateTargetingSuggestionMetricsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllAudiences(audiences)
            .build();
    return generateTargetingSuggestionMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns potential reach metrics for targetable audiences.
   *
   * <p>This method helps answer questions like "How many Men aged 18+ interested in Camping can be
   * reached on YouTube?"
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateTargetingSuggestionMetricsRequest request =
   *       GenerateTargetingSuggestionMetricsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllAudiences(new ArrayList<InsightsAudience>())
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   GenerateTargetingSuggestionMetricsResponse response =
   *       audienceInsightsServiceClient.generateTargetingSuggestionMetrics(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateTargetingSuggestionMetricsResponse generateTargetingSuggestionMetrics(
      GenerateTargetingSuggestionMetricsRequest request) {
    return generateTargetingSuggestionMetricsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns potential reach metrics for targetable audiences.
   *
   * <p>This method helps answer questions like "How many Men aged 18+ interested in Camping can be
   * reached on YouTube?"
   *
   * <p>List of thrown errors: [AudienceInsightsError]() [AuthenticationError]()
   * [AuthorizationError]() [FieldError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AudienceInsightsServiceClient audienceInsightsServiceClient =
   *     AudienceInsightsServiceClient.create()) {
   *   GenerateTargetingSuggestionMetricsRequest request =
   *       GenerateTargetingSuggestionMetricsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllAudiences(new ArrayList<InsightsAudience>())
   *           .setCustomerInsightsGroup("customerInsightsGroup1092118566")
   *           .setInsightsApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateTargetingSuggestionMetricsResponse> future =
   *       audienceInsightsServiceClient
   *           .generateTargetingSuggestionMetricsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   GenerateTargetingSuggestionMetricsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
      generateTargetingSuggestionMetricsCallable() {
    return stub.generateTargetingSuggestionMetricsCallable();
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
