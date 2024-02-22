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

import com.google.ads.googleads.v16.services.stub.KeywordPlanIdeaServiceStub;
import com.google.ads.googleads.v16.services.stub.KeywordPlanIdeaServiceStubSettings;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to generate keyword ideas.
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
 * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
 *     KeywordPlanIdeaServiceClient.create()) {
 *   GenerateKeywordHistoricalMetricsRequest request =
 *       GenerateKeywordHistoricalMetricsRequest.newBuilder()
 *           .setCustomerId("customerId-1581184615")
 *           .addAllKeywords(new ArrayList<String>())
 *           .setLanguage("language-1613589672")
 *           .setIncludeAdultKeywords(true)
 *           .addAllGeoTargetConstants(new ArrayList<String>())
 *           .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
 *           .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
 *           .build();
 *   GenerateKeywordHistoricalMetricsResponse response =
 *       keywordPlanIdeaServiceClient.generateKeywordHistoricalMetrics(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the KeywordPlanIdeaServiceClient object to clean up
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
 *      <td><p> GenerateKeywordIdeas</td>
 *      <td><p> Returns a list of keyword ideas.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CollectionSizeError]()   [HeaderError]()   [InternalError]()   [KeywordPlanIdeaError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateKeywordIdeas(GenerateKeywordIdeasRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateKeywordIdeasPagedCallable()
 *           <li><p> generateKeywordIdeasCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateKeywordHistoricalMetrics</td>
 *      <td><p> Returns a list of keyword historical metrics.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CollectionSizeError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateKeywordHistoricalMetrics(GenerateKeywordHistoricalMetricsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateKeywordHistoricalMetricsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateAdGroupThemes</td>
 *      <td><p> Returns a list of suggested AdGroups and suggested modifications (text, match type) for the given keywords.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CollectionSizeError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateAdGroupThemes(GenerateAdGroupThemesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateAdGroupThemesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateKeywordForecastMetrics</td>
 *      <td><p> Returns metrics (such as impressions, clicks, total cost) of a keyword forecast for the given campaign.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CollectionSizeError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateKeywordForecastMetrics(GenerateKeywordForecastMetricsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateKeywordForecastMetricsCallable()
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
 * <p>This class can be customized by passing in a custom instance of KeywordPlanIdeaServiceSettings
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
 * KeywordPlanIdeaServiceSettings keywordPlanIdeaServiceSettings =
 *     KeywordPlanIdeaServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
 *     KeywordPlanIdeaServiceClient.create(keywordPlanIdeaServiceSettings);
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
 * KeywordPlanIdeaServiceSettings keywordPlanIdeaServiceSettings =
 *     KeywordPlanIdeaServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
 *     KeywordPlanIdeaServiceClient.create(keywordPlanIdeaServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class KeywordPlanIdeaServiceClient implements BackgroundResource {
  private final KeywordPlanIdeaServiceSettings settings;
  private final KeywordPlanIdeaServiceStub stub;

  /** Constructs an instance of KeywordPlanIdeaServiceClient with default settings. */
  public static final KeywordPlanIdeaServiceClient create() throws IOException {
    return create(KeywordPlanIdeaServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanIdeaServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final KeywordPlanIdeaServiceClient create(KeywordPlanIdeaServiceSettings settings)
      throws IOException {
    return new KeywordPlanIdeaServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanIdeaServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(KeywordPlanIdeaServiceSettings).
   */
  public static final KeywordPlanIdeaServiceClient create(KeywordPlanIdeaServiceStub stub) {
    return new KeywordPlanIdeaServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanIdeaServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected KeywordPlanIdeaServiceClient(KeywordPlanIdeaServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((KeywordPlanIdeaServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected KeywordPlanIdeaServiceClient(KeywordPlanIdeaServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanIdeaServiceSettings getSettings() {
    return settings;
  }

  public KeywordPlanIdeaServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of keyword ideas.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [HeaderError]() [InternalError]() [KeywordPlanIdeaError]()
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
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
   *     KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordIdeasRequest request =
   *       GenerateKeywordIdeasRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setLanguage("language-1613589672")
   *           .addAllGeoTargetConstants(new ArrayList<String>())
   *           .setIncludeAdultKeywords(true)
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .addAllKeywordAnnotation(
   *               new ArrayList<KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation>())
   *           .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
   *           .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
   *           .build();
   *   for (GenerateKeywordIdeaResult element :
   *       keywordPlanIdeaServiceClient.generateKeywordIdeas(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateKeywordIdeasPagedResponse generateKeywordIdeas(
      GenerateKeywordIdeasRequest request) {
    return generateKeywordIdeasPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of keyword ideas.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [HeaderError]() [InternalError]() [KeywordPlanIdeaError]()
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
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
   *     KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordIdeasRequest request =
   *       GenerateKeywordIdeasRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setLanguage("language-1613589672")
   *           .addAllGeoTargetConstants(new ArrayList<String>())
   *           .setIncludeAdultKeywords(true)
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .addAllKeywordAnnotation(
   *               new ArrayList<KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation>())
   *           .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
   *           .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateKeywordIdeaResult> future =
   *       keywordPlanIdeaServiceClient.generateKeywordIdeasPagedCallable().futureCall(request);
   *   // Do something.
   *   for (GenerateKeywordIdeaResult element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeasPagedResponse>
      generateKeywordIdeasPagedCallable() {
    return stub.generateKeywordIdeasPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of keyword ideas.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [HeaderError]() [InternalError]() [KeywordPlanIdeaError]()
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
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
   *     KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordIdeasRequest request =
   *       GenerateKeywordIdeasRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setLanguage("language-1613589672")
   *           .addAllGeoTargetConstants(new ArrayList<String>())
   *           .setIncludeAdultKeywords(true)
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .addAllKeywordAnnotation(
   *               new ArrayList<KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation>())
   *           .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
   *           .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
   *           .build();
   *   while (true) {
   *     GenerateKeywordIdeaResponse response =
   *         keywordPlanIdeaServiceClient.generateKeywordIdeasCallable().call(request);
   *     for (GenerateKeywordIdeaResult element : response.getResultsList()) {
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
  public final UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
      generateKeywordIdeasCallable() {
    return stub.generateKeywordIdeasCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of keyword historical metrics.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
   *     KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordHistoricalMetricsRequest request =
   *       GenerateKeywordHistoricalMetricsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllKeywords(new ArrayList<String>())
   *           .setLanguage("language-1613589672")
   *           .setIncludeAdultKeywords(true)
   *           .addAllGeoTargetConstants(new ArrayList<String>())
   *           .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
   *           .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
   *           .build();
   *   GenerateKeywordHistoricalMetricsResponse response =
   *       keywordPlanIdeaServiceClient.generateKeywordHistoricalMetrics(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateKeywordHistoricalMetricsResponse generateKeywordHistoricalMetrics(
      GenerateKeywordHistoricalMetricsRequest request) {
    return generateKeywordHistoricalMetricsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of keyword historical metrics.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
   *     KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordHistoricalMetricsRequest request =
   *       GenerateKeywordHistoricalMetricsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllKeywords(new ArrayList<String>())
   *           .setLanguage("language-1613589672")
   *           .setIncludeAdultKeywords(true)
   *           .addAllGeoTargetConstants(new ArrayList<String>())
   *           .setAggregateMetrics(KeywordPlanAggregateMetrics.newBuilder().build())
   *           .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateKeywordHistoricalMetricsResponse> future =
   *       keywordPlanIdeaServiceClient
   *           .generateKeywordHistoricalMetricsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   GenerateKeywordHistoricalMetricsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GenerateKeywordHistoricalMetricsRequest, GenerateKeywordHistoricalMetricsResponse>
      generateKeywordHistoricalMetricsCallable() {
    return stub.generateKeywordHistoricalMetricsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of suggested AdGroups and suggested modifications (text, match type) for the
   * given keywords.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
   *     KeywordPlanIdeaServiceClient.create()) {
   *   GenerateAdGroupThemesRequest request =
   *       GenerateAdGroupThemesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllKeywords(new ArrayList<String>())
   *           .addAllAdGroups(new ArrayList<String>())
   *           .build();
   *   GenerateAdGroupThemesResponse response =
   *       keywordPlanIdeaServiceClient.generateAdGroupThemes(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateAdGroupThemesResponse generateAdGroupThemes(
      GenerateAdGroupThemesRequest request) {
    return generateAdGroupThemesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of suggested AdGroups and suggested modifications (text, match type) for the
   * given keywords.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
   *     KeywordPlanIdeaServiceClient.create()) {
   *   GenerateAdGroupThemesRequest request =
   *       GenerateAdGroupThemesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllKeywords(new ArrayList<String>())
   *           .addAllAdGroups(new ArrayList<String>())
   *           .build();
   *   ApiFuture<GenerateAdGroupThemesResponse> future =
   *       keywordPlanIdeaServiceClient.generateAdGroupThemesCallable().futureCall(request);
   *   // Do something.
   *   GenerateAdGroupThemesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateAdGroupThemesRequest, GenerateAdGroupThemesResponse>
      generateAdGroupThemesCallable() {
    return stub.generateAdGroupThemesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns metrics (such as impressions, clicks, total cost) of a keyword forecast for the given
   * campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
   *     KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordForecastMetricsRequest request =
   *       GenerateKeywordForecastMetricsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCurrencyCode("currencyCode1004773790")
   *           .setForecastPeriod(DateRange.newBuilder().build())
   *           .setCampaign(CampaignToForecast.newBuilder().build())
   *           .build();
   *   GenerateKeywordForecastMetricsResponse response =
   *       keywordPlanIdeaServiceClient.generateKeywordForecastMetrics(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateKeywordForecastMetricsResponse generateKeywordForecastMetrics(
      GenerateKeywordForecastMetricsRequest request) {
    return generateKeywordForecastMetricsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns metrics (such as impressions, clicks, total cost) of a keyword forecast for the given
   * campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
   *     KeywordPlanIdeaServiceClient.create()) {
   *   GenerateKeywordForecastMetricsRequest request =
   *       GenerateKeywordForecastMetricsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setCurrencyCode("currencyCode1004773790")
   *           .setForecastPeriod(DateRange.newBuilder().build())
   *           .setCampaign(CampaignToForecast.newBuilder().build())
   *           .build();
   *   ApiFuture<GenerateKeywordForecastMetricsResponse> future =
   *       keywordPlanIdeaServiceClient.generateKeywordForecastMetricsCallable().futureCall(request);
   *   // Do something.
   *   GenerateKeywordForecastMetricsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GenerateKeywordForecastMetricsRequest, GenerateKeywordForecastMetricsResponse>
      generateKeywordForecastMetricsCallable() {
    return stub.generateKeywordForecastMetricsCallable();
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

  public static class GenerateKeywordIdeasPagedResponse
      extends AbstractPagedListResponse<
          GenerateKeywordIdeasRequest,
          GenerateKeywordIdeaResponse,
          GenerateKeywordIdeaResult,
          GenerateKeywordIdeasPage,
          GenerateKeywordIdeasFixedSizeCollection> {

    public static ApiFuture<GenerateKeywordIdeasPagedResponse> createAsync(
        PageContext<
                GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse, GenerateKeywordIdeaResult>
            context,
        ApiFuture<GenerateKeywordIdeaResponse> futureResponse) {
      ApiFuture<GenerateKeywordIdeasPage> futurePage =
          GenerateKeywordIdeasPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new GenerateKeywordIdeasPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private GenerateKeywordIdeasPagedResponse(GenerateKeywordIdeasPage page) {
      super(page, GenerateKeywordIdeasFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class GenerateKeywordIdeasPage
      extends AbstractPage<
          GenerateKeywordIdeasRequest,
          GenerateKeywordIdeaResponse,
          GenerateKeywordIdeaResult,
          GenerateKeywordIdeasPage> {

    private GenerateKeywordIdeasPage(
        PageContext<
                GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse, GenerateKeywordIdeaResult>
            context,
        GenerateKeywordIdeaResponse response) {
      super(context, response);
    }

    private static GenerateKeywordIdeasPage createEmptyPage() {
      return new GenerateKeywordIdeasPage(null, null);
    }

    @Override
    protected GenerateKeywordIdeasPage createPage(
        PageContext<
                GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse, GenerateKeywordIdeaResult>
            context,
        GenerateKeywordIdeaResponse response) {
      return new GenerateKeywordIdeasPage(context, response);
    }

    @Override
    public ApiFuture<GenerateKeywordIdeasPage> createPageAsync(
        PageContext<
                GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse, GenerateKeywordIdeaResult>
            context,
        ApiFuture<GenerateKeywordIdeaResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class GenerateKeywordIdeasFixedSizeCollection
      extends AbstractFixedSizeCollection<
          GenerateKeywordIdeasRequest,
          GenerateKeywordIdeaResponse,
          GenerateKeywordIdeaResult,
          GenerateKeywordIdeasPage,
          GenerateKeywordIdeasFixedSizeCollection> {

    private GenerateKeywordIdeasFixedSizeCollection(
        List<GenerateKeywordIdeasPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static GenerateKeywordIdeasFixedSizeCollection createEmptyCollection() {
      return new GenerateKeywordIdeasFixedSizeCollection(null, 0);
    }

    @Override
    protected GenerateKeywordIdeasFixedSizeCollection createCollection(
        List<GenerateKeywordIdeasPage> pages, int collectionSize) {
      return new GenerateKeywordIdeasFixedSizeCollection(pages, collectionSize);
    }
  }
}
