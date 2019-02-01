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

import com.google.ads.googleads.v0.resources.CampaignCriterion;
import com.google.ads.googleads.v0.services.stub.CampaignCriterionServiceStub;
import com.google.ads.googleads.v0.services.stub.CampaignCriterionServiceStubSettings;
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
 * Service Description: Service to manage campaign criteria.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
 *   String formattedResourceName = CampaignCriterionServiceClient.formatCampaignCriteriaName("[CUSTOMER]", "[CAMPAIGN_CRITERIA]");
 *   CampaignCriterion response = campaignCriterionServiceClient.getCampaignCriterion(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the campaignCriterionServiceClient object to clean up
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
 * CampaignCriterionServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CampaignCriterionServiceSettings campaignCriterionServiceSettings =
 *     CampaignCriterionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignCriterionServiceClient campaignCriterionServiceClient =
 *     CampaignCriterionServiceClient.create(campaignCriterionServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CampaignCriterionServiceSettings campaignCriterionServiceSettings =
 *     CampaignCriterionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignCriterionServiceClient campaignCriterionServiceClient =
 *     CampaignCriterionServiceClient.create(campaignCriterionServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignCriterionServiceClient implements BackgroundResource {
  private final CampaignCriterionServiceSettings settings;
  private final CampaignCriterionServiceStub stub;

  private static final PathTemplate CAMPAIGN_CRITERIA_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/campaignCriteria/{campaign_criteria}");

  /**
   * Formats a string containing the fully-qualified path to represent a campaign_criteria resource.
   */
  public static final String formatCampaignCriteriaName(String customer, String campaignCriteria) {
    return CAMPAIGN_CRITERIA_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "campaign_criteria", campaignCriteria);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a campaign_criteria
   * resource.
   */
  public static final String parseCustomerFromCampaignCriteriaName(String campaignCriteriaName) {
    return CAMPAIGN_CRITERIA_PATH_TEMPLATE.parse(campaignCriteriaName).get("customer");
  }

  /**
   * Parses the campaign_criteria from the given fully-qualified path which represents a
   * campaign_criteria resource.
   */
  public static final String parseCampaignCriteriaFromCampaignCriteriaName(
      String campaignCriteriaName) {
    return CAMPAIGN_CRITERIA_PATH_TEMPLATE.parse(campaignCriteriaName).get("campaign_criteria");
  }

  /** Constructs an instance of CampaignCriterionServiceClient with default settings. */
  public static final CampaignCriterionServiceClient create() throws IOException {
    return create(CampaignCriterionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignCriterionServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CampaignCriterionServiceClient create(
      CampaignCriterionServiceSettings settings) throws IOException {
    return new CampaignCriterionServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignCriterionServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use CampaignCriterionServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CampaignCriterionServiceClient create(CampaignCriterionServiceStub stub) {
    return new CampaignCriterionServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignCriterionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignCriterionServiceClient(CampaignCriterionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((CampaignCriterionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignCriterionServiceClient(CampaignCriterionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignCriterionServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignCriterionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
   *   String formattedResourceName = CampaignCriterionServiceClient.formatCampaignCriteriaName("[CUSTOMER]", "[CAMPAIGN_CRITERIA]");
   *   CampaignCriterion response = campaignCriterionServiceClient.getCampaignCriterion(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the criterion to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignCriterion getCampaignCriterion(String resourceName) {
    CAMPAIGN_CRITERIA_PATH_TEMPLATE.validate(resourceName, "getCampaignCriterion");
    GetCampaignCriterionRequest request =
        GetCampaignCriterionRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignCriterion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
   *   String formattedResourceName = CampaignCriterionServiceClient.formatCampaignCriteriaName("[CUSTOMER]", "[CAMPAIGN_CRITERIA]");
   *   GetCampaignCriterionRequest request = GetCampaignCriterionRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CampaignCriterion response = campaignCriterionServiceClient.getCampaignCriterion(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignCriterion getCampaignCriterion(GetCampaignCriterionRequest request) {
    return getCampaignCriterionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested criterion in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
   *   String formattedResourceName = CampaignCriterionServiceClient.formatCampaignCriteriaName("[CUSTOMER]", "[CAMPAIGN_CRITERIA]");
   *   GetCampaignCriterionRequest request = GetCampaignCriterionRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CampaignCriterion&gt; future = campaignCriterionServiceClient.getCampaignCriterionCallable().futureCall(request);
   *   // Do something
   *   CampaignCriterion response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCampaignCriterionRequest, CampaignCriterion>
      getCampaignCriterionCallable() {
    return stub.getCampaignCriterionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateCampaignCriteriaResponse response = campaignCriterionServiceClient.mutateCampaignCriteria(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose criteria are being modified.
   * @param operations The list of operations to perform on individual criteria.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignCriteriaResponse mutateCampaignCriteria(
      String customerId,
      List<CampaignCriterionOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateCampaignCriteriaRequest request =
        MutateCampaignCriteriaRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateCampaignCriteria(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignCriteriaResponse response = campaignCriterionServiceClient.mutateCampaignCriteria(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose criteria are being modified.
   * @param operations The list of operations to perform on individual criteria.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignCriteriaResponse mutateCampaignCriteria(
      String customerId, List<CampaignCriterionOperation> operations) {

    MutateCampaignCriteriaRequest request =
        MutateCampaignCriteriaRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignCriteria(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignCriteriaRequest request = MutateCampaignCriteriaRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCampaignCriteriaResponse response = campaignCriterionServiceClient.mutateCampaignCriteria(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignCriteriaResponse mutateCampaignCriteria(
      MutateCampaignCriteriaRequest request) {
    return mutateCampaignCriteriaCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignCriterionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignCriteriaRequest request = MutateCampaignCriteriaRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCampaignCriteriaResponse&gt; future = campaignCriterionServiceClient.mutateCampaignCriteriaCallable().futureCall(request);
   *   // Do something
   *   MutateCampaignCriteriaResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCampaignCriteriaRequest, MutateCampaignCriteriaResponse>
      mutateCampaignCriteriaCallable() {
    return stub.mutateCampaignCriteriaCallable();
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
