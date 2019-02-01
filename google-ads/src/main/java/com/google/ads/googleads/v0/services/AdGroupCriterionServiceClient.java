/*
 * Copyright 2019 Google LLC
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

import com.google.ads.googleads.v0.resources.AdGroupCriterion;
import com.google.ads.googleads.v0.services.stub.AdGroupCriterionServiceStub;
import com.google.ads.googleads.v0.services.stub.AdGroupCriterionServiceStubSettings;
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
 * Service Description: Service to manage ad group criteria.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
 *   String formattedResourceName = AdGroupCriterionServiceClient.formatAdGroupCriteriaName("[CUSTOMER]", "[AD_GROUP_CRITERIA]");
 *   AdGroupCriterion response = adGroupCriterionServiceClient.getAdGroupCriterion(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the adGroupCriterionServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of
 * AdGroupCriterionServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AdGroupCriterionServiceSettings adGroupCriterionServiceSettings =
 *     AdGroupCriterionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupCriterionServiceClient adGroupCriterionServiceClient =
 *     AdGroupCriterionServiceClient.create(adGroupCriterionServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AdGroupCriterionServiceSettings adGroupCriterionServiceSettings =
 *     AdGroupCriterionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupCriterionServiceClient adGroupCriterionServiceClient =
 *     AdGroupCriterionServiceClient.create(adGroupCriterionServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdGroupCriterionServiceClient implements BackgroundResource {
  private final AdGroupCriterionServiceSettings settings;
  private final AdGroupCriterionServiceStub stub;

  private static final PathTemplate AD_GROUP_CRITERIA_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/adGroupCriteria/{ad_group_criteria}");

  /**
   * Formats a string containing the fully-qualified path to represent a ad_group_criteria resource.
   */
  public static final String formatAdGroupCriteriaName(String customer, String adGroupCriteria) {
    return AD_GROUP_CRITERIA_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "ad_group_criteria", adGroupCriteria);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a ad_group_criteria
   * resource.
   */
  public static final String parseCustomerFromAdGroupCriteriaName(String adGroupCriteriaName) {
    return AD_GROUP_CRITERIA_PATH_TEMPLATE.parse(adGroupCriteriaName).get("customer");
  }

  /**
   * Parses the ad_group_criteria from the given fully-qualified path which represents a
   * ad_group_criteria resource.
   */
  public static final String parseAdGroupCriteriaFromAdGroupCriteriaName(
      String adGroupCriteriaName) {
    return AD_GROUP_CRITERIA_PATH_TEMPLATE.parse(adGroupCriteriaName).get("ad_group_criteria");
  }

  /** Constructs an instance of AdGroupCriterionServiceClient with default settings. */
  public static final AdGroupCriterionServiceClient create() throws IOException {
    return create(AdGroupCriterionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupCriterionServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdGroupCriterionServiceClient create(AdGroupCriterionServiceSettings settings)
      throws IOException {
    return new AdGroupCriterionServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupCriterionServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use AdGroupCriterionServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupCriterionServiceClient create(AdGroupCriterionServiceStub stub) {
    return new AdGroupCriterionServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupCriterionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupCriterionServiceClient(AdGroupCriterionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupCriterionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupCriterionServiceClient(AdGroupCriterionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupCriterionServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupCriterionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
   *   String formattedResourceName = AdGroupCriterionServiceClient.formatAdGroupCriteriaName("[CUSTOMER]", "[AD_GROUP_CRITERIA]");
   *   AdGroupCriterion response = adGroupCriterionServiceClient.getAdGroupCriterion(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the criterion to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupCriterion getAdGroupCriterion(String resourceName) {
    AD_GROUP_CRITERIA_PATH_TEMPLATE.validate(resourceName, "getAdGroupCriterion");
    GetAdGroupCriterionRequest request =
        GetAdGroupCriterionRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupCriterion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
   *   String formattedResourceName = AdGroupCriterionServiceClient.formatAdGroupCriteriaName("[CUSTOMER]", "[AD_GROUP_CRITERIA]");
   *   GetAdGroupCriterionRequest request = GetAdGroupCriterionRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   AdGroupCriterion response = adGroupCriterionServiceClient.getAdGroupCriterion(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupCriterion getAdGroupCriterion(GetAdGroupCriterionRequest request) {
    return getAdGroupCriterionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
   *   String formattedResourceName = AdGroupCriterionServiceClient.formatAdGroupCriteriaName("[CUSTOMER]", "[AD_GROUP_CRITERIA]");
   *   GetAdGroupCriterionRequest request = GetAdGroupCriterionRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;AdGroupCriterion&gt; future = adGroupCriterionServiceClient.getAdGroupCriterionCallable().futureCall(request);
   *   // Do something
   *   AdGroupCriterion response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAdGroupCriterionRequest, AdGroupCriterion>
      getAdGroupCriterionCallable() {
    return stub.getAdGroupCriterionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateAdGroupCriteriaResponse response = adGroupCriterionServiceClient.mutateAdGroupCriteria(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId ID of the customer whose criteria are being modified.
   * @param operations The list of operations to perform on individual criteria.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupCriteriaResponse mutateAdGroupCriteria(
      String customerId,
      List<AdGroupCriterionOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateAdGroupCriteriaRequest request =
        MutateAdGroupCriteriaRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateAdGroupCriteria(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupCriteriaResponse response = adGroupCriterionServiceClient.mutateAdGroupCriteria(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId ID of the customer whose criteria are being modified.
   * @param operations The list of operations to perform on individual criteria.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupCriteriaResponse mutateAdGroupCriteria(
      String customerId, List<AdGroupCriterionOperation> operations) {

    MutateAdGroupCriteriaRequest request =
        MutateAdGroupCriteriaRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupCriteria(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupCriteriaRequest request = MutateAdGroupCriteriaRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateAdGroupCriteriaResponse response = adGroupCriterionServiceClient.mutateAdGroupCriteria(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupCriteriaResponse mutateAdGroupCriteria(
      MutateAdGroupCriteriaRequest request) {
    return mutateAdGroupCriteriaCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupCriteriaRequest request = MutateAdGroupCriteriaRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateAdGroupCriteriaResponse&gt; future = adGroupCriterionServiceClient.mutateAdGroupCriteriaCallable().futureCall(request);
   *   // Do something
   *   MutateAdGroupCriteriaResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateAdGroupCriteriaRequest, MutateAdGroupCriteriaResponse>
      mutateAdGroupCriteriaCallable() {
    return stub.mutateAdGroupCriteriaCallable();
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
