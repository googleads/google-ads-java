/*
 * Copyright 2018 Google LLC
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
package com.google.ads.googleads.v0.services;

import com.google.ads.googleads.v0.resources.Recommendation;
import com.google.ads.googleads.v0.services.DismissRecommendationRequest.DismissRecommendationOperation;
import com.google.ads.googleads.v0.services.stub.RecommendationServiceStub;
import com.google.ads.googleads.v0.services.stub.RecommendationServiceStubSettings;
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
 * Service Description: Service to manage recommendations.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
 *   String formattedResourceName = RecommendationServiceClient.formatRecommendationName("[CUSTOMER]", "[RECOMMENDATION]");
 *   Recommendation response = recommendationServiceClient.getRecommendation(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the recommendationServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
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
 * <p>This class can be customized by passing in a custom instance of RecommendationServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * RecommendationServiceSettings recommendationServiceSettings =
 *     RecommendationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RecommendationServiceClient recommendationServiceClient =
 *     RecommendationServiceClient.create(recommendationServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RecommendationServiceSettings recommendationServiceSettings =
 *     RecommendationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RecommendationServiceClient recommendationServiceClient =
 *     RecommendationServiceClient.create(recommendationServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RecommendationServiceClient implements BackgroundResource {
  private final RecommendationServiceSettings settings;
  private final RecommendationServiceStub stub;

  private static final PathTemplate RECOMMENDATION_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/recommendations/{recommendation}");

  /**
   * Formats a string containing the fully-qualified path to represent a recommendation resource.
   */
  public static final String formatRecommendationName(String customer, String recommendation) {
    return RECOMMENDATION_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "recommendation", recommendation);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a recommendation
   * resource.
   */
  public static final String parseCustomerFromRecommendationName(String recommendationName) {
    return RECOMMENDATION_PATH_TEMPLATE.parse(recommendationName).get("customer");
  }

  /**
   * Parses the recommendation from the given fully-qualified path which represents a recommendation
   * resource.
   */
  public static final String parseRecommendationFromRecommendationName(String recommendationName) {
    return RECOMMENDATION_PATH_TEMPLATE.parse(recommendationName).get("recommendation");
  }

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
   * This is for advanced usage - prefer to use RecommendationServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected RecommendationServiceClient(RecommendationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RecommendationServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RecommendationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested recommendation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
   *   String formattedResourceName = RecommendationServiceClient.formatRecommendationName("[CUSTOMER]", "[RECOMMENDATION]");
   *   Recommendation response = recommendationServiceClient.getRecommendation(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the recommendation to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation getRecommendation(String resourceName) {
    RECOMMENDATION_PATH_TEMPLATE.validate(resourceName, "getRecommendation");
    GetRecommendationRequest request =
        GetRecommendationRequest.newBuilder().setResourceName(resourceName).build();
    return getRecommendation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested recommendation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
   *   String formattedResourceName = RecommendationServiceClient.formatRecommendationName("[CUSTOMER]", "[RECOMMENDATION]");
   *   GetRecommendationRequest request = GetRecommendationRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   Recommendation response = recommendationServiceClient.getRecommendation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final Recommendation getRecommendation(GetRecommendationRequest request) {
    return getRecommendationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested recommendation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
   *   String formattedResourceName = RecommendationServiceClient.formatRecommendationName("[CUSTOMER]", "[RECOMMENDATION]");
   *   GetRecommendationRequest request = GetRecommendationRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;Recommendation&gt; future = recommendationServiceClient.getRecommendationCallable().futureCall(request);
   *   // Do something
   *   Recommendation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetRecommendationRequest, Recommendation> getRecommendationCallable() {
    return stub.getRecommendationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Applies given recommendations with corresponding apply parameters.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
   *   String customerId = "";
   *   boolean partialFailure = false;
   *   List&lt;ApplyRecommendationOperation&gt; operations = new ArrayList&lt;&gt;();
   *   ApplyRecommendationResponse response = recommendationServiceClient.applyRecommendation(customerId, partialFailure, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer with the recommendation.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, operations will be carried out as a transaction if and only
   *     if they are all valid. Default is false.
   * @param operations The list of operations to apply recommendations. If partial_failure=false all
   *     recommendations should be of the same type There is a limit of 100 operations per request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ApplyRecommendationResponse applyRecommendation(
      String customerId, boolean partialFailure, List<ApplyRecommendationOperation> operations) {

    ApplyRecommendationRequest request =
        ApplyRecommendationRequest.newBuilder()
            .setCustomerId(customerId)
            .setPartialFailure(partialFailure)
            .addAllOperations(operations)
            .build();
    return applyRecommendation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Applies given recommendations with corresponding apply parameters.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
   *   String customerId = "";
   *   boolean partialFailure = false;
   *   List&lt;ApplyRecommendationOperation&gt; operations = new ArrayList&lt;&gt;();
   *   ApplyRecommendationRequest request = ApplyRecommendationRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setPartialFailure(partialFailure)
   *     .addAllOperations(operations)
   *     .build();
   *   ApplyRecommendationResponse response = recommendationServiceClient.applyRecommendation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ApplyRecommendationResponse applyRecommendation(ApplyRecommendationRequest request) {
    return applyRecommendationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Applies given recommendations with corresponding apply parameters.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
   *   String customerId = "";
   *   boolean partialFailure = false;
   *   List&lt;ApplyRecommendationOperation&gt; operations = new ArrayList&lt;&gt;();
   *   ApplyRecommendationRequest request = ApplyRecommendationRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setPartialFailure(partialFailure)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;ApplyRecommendationResponse&gt; future = recommendationServiceClient.applyRecommendationCallable().futureCall(request);
   *   // Do something
   *   ApplyRecommendationResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ApplyRecommendationRequest, ApplyRecommendationResponse>
      applyRecommendationCallable() {
    return stub.applyRecommendationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Dismisses given recommendations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
   *   String customerId = "";
   *   boolean partialFailure = false;
   *   List&lt;DismissRecommendationRequest.DismissRecommendationOperation&gt; operations = new ArrayList&lt;&gt;();
   *   DismissRecommendationResponse response = recommendationServiceClient.dismissRecommendation(customerId, partialFailure, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer with the recommendation.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, operations will be carried in a single transaction if and
   *     only if they are all valid. Default is false.
   * @param operations The list of operations to dismiss recommendations. If partial_failure=false
   *     all recommendations should be of the same type There is a limit of 100 operations per
   *     request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DismissRecommendationResponse dismissRecommendation(
      String customerId,
      boolean partialFailure,
      List<DismissRecommendationRequest.DismissRecommendationOperation> operations) {

    DismissRecommendationRequest request =
        DismissRecommendationRequest.newBuilder()
            .setCustomerId(customerId)
            .setPartialFailure(partialFailure)
            .addAllOperations(operations)
            .build();
    return dismissRecommendation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Dismisses given recommendations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
   *   String customerId = "";
   *   boolean partialFailure = false;
   *   List&lt;DismissRecommendationRequest.DismissRecommendationOperation&gt; operations = new ArrayList&lt;&gt;();
   *   DismissRecommendationRequest request = DismissRecommendationRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setPartialFailure(partialFailure)
   *     .addAllOperations(operations)
   *     .build();
   *   DismissRecommendationResponse response = recommendationServiceClient.dismissRecommendation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DismissRecommendationResponse dismissRecommendation(
      DismissRecommendationRequest request) {
    return dismissRecommendationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Dismisses given recommendations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
   *   String customerId = "";
   *   boolean partialFailure = false;
   *   List&lt;DismissRecommendationRequest.DismissRecommendationOperation&gt; operations = new ArrayList&lt;&gt;();
   *   DismissRecommendationRequest request = DismissRecommendationRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setPartialFailure(partialFailure)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;DismissRecommendationResponse&gt; future = recommendationServiceClient.dismissRecommendationCallable().futureCall(request);
   *   // Do something
   *   DismissRecommendationResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DismissRecommendationRequest, DismissRecommendationResponse>
      dismissRecommendationCallable() {
    return stub.dismissRecommendationCallable();
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
