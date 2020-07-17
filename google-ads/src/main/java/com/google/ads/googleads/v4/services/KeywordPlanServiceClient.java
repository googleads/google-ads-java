/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v4.services;

import com.google.ads.googleads.v4.resources.KeywordPlan;
import com.google.ads.googleads.v4.services.stub.KeywordPlanServiceStub;
import com.google.ads.googleads.v4.services.stub.KeywordPlanServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage keyword plans.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
 *   String formattedResourceName = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
 *   KeywordPlan response = keywordPlanServiceClient.getKeywordPlan(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the keywordPlanServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of KeywordPlanServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * KeywordPlanServiceSettings keywordPlanServiceSettings =
 *     KeywordPlanServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanServiceClient keywordPlanServiceClient =
 *     KeywordPlanServiceClient.create(keywordPlanServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * KeywordPlanServiceSettings keywordPlanServiceSettings =
 *     KeywordPlanServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanServiceClient keywordPlanServiceClient =
 *     KeywordPlanServiceClient.create(keywordPlanServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordPlanServiceClient implements BackgroundResource {
  private final KeywordPlanServiceSettings settings;
  private final KeywordPlanServiceStub stub;

  private static final PathTemplate KEYWORD_PLAN_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/keywordPlans/{keyword_plan}");

  /**
   * Formats a string containing the fully-qualified path to represent a keyword_plan resource.
   *
   * @deprecated Use the {@link KeywordPlanName} class instead.
   */
  @Deprecated
  public static final String formatKeywordPlanName(String customer, String keywordPlan) {
    return KEYWORD_PLAN_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "keyword_plan", keywordPlan);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a keyword_plan
   * resource.
   *
   * @deprecated Use the {@link KeywordPlanName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromKeywordPlanName(String keywordPlanName) {
    return KEYWORD_PLAN_PATH_TEMPLATE.parse(keywordPlanName).get("customer");
  }

  /**
   * Parses the keyword_plan from the given fully-qualified path which represents a keyword_plan
   * resource.
   *
   * @deprecated Use the {@link KeywordPlanName} class instead.
   */
  @Deprecated
  public static final String parseKeywordPlanFromKeywordPlanName(String keywordPlanName) {
    return KEYWORD_PLAN_PATH_TEMPLATE.parse(keywordPlanName).get("keyword_plan");
  }

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
   * is for advanced usage - prefer to use KeywordPlanServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanServiceClient(KeywordPlanServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   KeywordPlan response = keywordPlanServiceClient.getKeywordPlan(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the plan to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlan getKeywordPlan(String resourceName) {
    KEYWORD_PLAN_PATH_TEMPLATE.validate(resourceName, "getKeywordPlan");
    GetKeywordPlanRequest request =
        GetKeywordPlanRequest.newBuilder().setResourceName(resourceName).build();
    return getKeywordPlan(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GetKeywordPlanRequest request = GetKeywordPlanRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   KeywordPlan response = keywordPlanServiceClient.getKeywordPlan(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlan getKeywordPlan(GetKeywordPlanRequest request) {
    return getKeywordPlanCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GetKeywordPlanRequest request = GetKeywordPlanRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;KeywordPlan&gt; future = keywordPlanServiceClient.getKeywordPlanCallable().futureCall(request);
   *   // Do something
   *   KeywordPlan response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetKeywordPlanRequest, KeywordPlan> getKeywordPlanCallable() {
    return stub.getKeywordPlanCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateKeywordPlansResponse response = keywordPlanServiceClient.mutateKeywordPlans(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose keyword plans are being modified.
   * @param operations Required. The list of operations to perform on individual keyword plans.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlansResponse mutateKeywordPlans(
      String customerId,
      List<KeywordPlanOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {
    MutateKeywordPlansRequest request =
        MutateKeywordPlansRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateKeywordPlans(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlansResponse response = keywordPlanServiceClient.mutateKeywordPlans(customerId, operations);
   * }
   * </code></pre>
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlansRequest request = MutateKeywordPlansRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateKeywordPlansResponse response = keywordPlanServiceClient.mutateKeywordPlans(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlansResponse mutateKeywordPlans(MutateKeywordPlansRequest request) {
    return mutateKeywordPlansCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes keyword plans. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlansRequest request = MutateKeywordPlansRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateKeywordPlansResponse&gt; future = keywordPlanServiceClient.mutateKeywordPlansCallable().futureCall(request);
   *   // Do something
   *   MutateKeywordPlansResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansCallable() {
    return stub.mutateKeywordPlansCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan forecast curve. Only the bidding strategy is considered for
   * generating forecast curve. The bidding strategy value (eg: max_cpc_bid_micros in maximize cpc
   * bidding strategy) specified in the plan is ignored.
   *
   * <p>To generate a forecast at a value specified in the plan, use
   * KeywordPlanService.GenerateForecastMetrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedKeywordPlan = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GenerateForecastCurveResponse response = keywordPlanServiceClient.generateForecastCurve(formattedKeywordPlan);
   * }
   * </code></pre>
   *
   * @param keywordPlan Required. The resource name of the keyword plan to be forecasted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastCurveResponse generateForecastCurve(String keywordPlan) {
    KEYWORD_PLAN_PATH_TEMPLATE.validate(keywordPlan, "generateForecastCurve");
    GenerateForecastCurveRequest request =
        GenerateForecastCurveRequest.newBuilder().setKeywordPlan(keywordPlan).build();
    return generateForecastCurve(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan forecast curve. Only the bidding strategy is considered for
   * generating forecast curve. The bidding strategy value (eg: max_cpc_bid_micros in maximize cpc
   * bidding strategy) specified in the plan is ignored.
   *
   * <p>To generate a forecast at a value specified in the plan, use
   * KeywordPlanService.GenerateForecastMetrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedKeywordPlan = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GenerateForecastCurveRequest request = GenerateForecastCurveRequest.newBuilder()
   *     .setKeywordPlan(formattedKeywordPlan)
   *     .build();
   *   GenerateForecastCurveResponse response = keywordPlanServiceClient.generateForecastCurve(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastCurveResponse generateForecastCurve(
      GenerateForecastCurveRequest request) {
    return generateForecastCurveCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan forecast curve. Only the bidding strategy is considered for
   * generating forecast curve. The bidding strategy value (eg: max_cpc_bid_micros in maximize cpc
   * bidding strategy) specified in the plan is ignored.
   *
   * <p>To generate a forecast at a value specified in the plan, use
   * KeywordPlanService.GenerateForecastMetrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedKeywordPlan = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GenerateForecastCurveRequest request = GenerateForecastCurveRequest.newBuilder()
   *     .setKeywordPlan(formattedKeywordPlan)
   *     .build();
   *   ApiFuture&lt;GenerateForecastCurveResponse&gt; future = keywordPlanServiceClient.generateForecastCurveCallable().futureCall(request);
   *   // Do something
   *   GenerateForecastCurveResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
      generateForecastCurveCallable() {
    return stub.generateForecastCurveCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan forecasts.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedKeywordPlan = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GenerateForecastMetricsResponse response = keywordPlanServiceClient.generateForecastMetrics(formattedKeywordPlan);
   * }
   * </code></pre>
   *
   * @param keywordPlan Required. The resource name of the keyword plan to be forecasted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastMetricsResponse generateForecastMetrics(String keywordPlan) {
    KEYWORD_PLAN_PATH_TEMPLATE.validate(keywordPlan, "generateForecastMetrics");
    GenerateForecastMetricsRequest request =
        GenerateForecastMetricsRequest.newBuilder().setKeywordPlan(keywordPlan).build();
    return generateForecastMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan forecasts.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedKeywordPlan = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GenerateForecastMetricsRequest request = GenerateForecastMetricsRequest.newBuilder()
   *     .setKeywordPlan(formattedKeywordPlan)
   *     .build();
   *   GenerateForecastMetricsResponse response = keywordPlanServiceClient.generateForecastMetrics(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateForecastMetricsResponse generateForecastMetrics(
      GenerateForecastMetricsRequest request) {
    return generateForecastMetricsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan forecasts.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedKeywordPlan = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GenerateForecastMetricsRequest request = GenerateForecastMetricsRequest.newBuilder()
   *     .setKeywordPlan(formattedKeywordPlan)
   *     .build();
   *   ApiFuture&lt;GenerateForecastMetricsResponse&gt; future = keywordPlanServiceClient.generateForecastMetricsCallable().futureCall(request);
   *   // Do something
   *   GenerateForecastMetricsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
      generateForecastMetricsCallable() {
    return stub.generateForecastMetricsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan historical metrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedKeywordPlan = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GenerateHistoricalMetricsResponse response = keywordPlanServiceClient.generateHistoricalMetrics(formattedKeywordPlan);
   * }
   * </code></pre>
   *
   * @param keywordPlan Required. The resource name of the keyword plan of which historical metrics
   *     are requested.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateHistoricalMetricsResponse generateHistoricalMetrics(String keywordPlan) {
    KEYWORD_PLAN_PATH_TEMPLATE.validate(keywordPlan, "generateHistoricalMetrics");
    GenerateHistoricalMetricsRequest request =
        GenerateHistoricalMetricsRequest.newBuilder().setKeywordPlan(keywordPlan).build();
    return generateHistoricalMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan historical metrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedKeywordPlan = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GenerateHistoricalMetricsRequest request = GenerateHistoricalMetricsRequest.newBuilder()
   *     .setKeywordPlan(formattedKeywordPlan)
   *     .build();
   *   GenerateHistoricalMetricsResponse response = keywordPlanServiceClient.generateHistoricalMetrics(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateHistoricalMetricsResponse generateHistoricalMetrics(
      GenerateHistoricalMetricsRequest request) {
    return generateHistoricalMetricsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan historical metrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
   *   String formattedKeywordPlan = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
   *   GenerateHistoricalMetricsRequest request = GenerateHistoricalMetricsRequest.newBuilder()
   *     .setKeywordPlan(formattedKeywordPlan)
   *     .build();
   *   ApiFuture&lt;GenerateHistoricalMetricsResponse&gt; future = keywordPlanServiceClient.generateHistoricalMetricsCallable().futureCall(request);
   *   // Do something
   *   GenerateHistoricalMetricsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
      generateHistoricalMetricsCallable() {
    return stub.generateHistoricalMetricsCallable();
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
