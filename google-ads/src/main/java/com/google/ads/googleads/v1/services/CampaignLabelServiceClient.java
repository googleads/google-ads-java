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
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.CampaignLabel;
import com.google.ads.googleads.v1.services.stub.CampaignLabelServiceStub;
import com.google.ads.googleads.v1.services.stub.CampaignLabelServiceStubSettings;
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
 * Service Description: Service to manage labels on campaigns.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CampaignLabelServiceClient campaignLabelServiceClient = CampaignLabelServiceClient.create()) {
 *   String formattedResourceName = CampaignLabelServiceClient.formatCampaignLabelName("[CUSTOMER]", "[CAMPAIGN_LABEL]");
 *   CampaignLabel response = campaignLabelServiceClient.getCampaignLabel(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the campaignLabelServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of CampaignLabelServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CampaignLabelServiceSettings campaignLabelServiceSettings =
 *     CampaignLabelServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignLabelServiceClient campaignLabelServiceClient =
 *     CampaignLabelServiceClient.create(campaignLabelServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CampaignLabelServiceSettings campaignLabelServiceSettings =
 *     CampaignLabelServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignLabelServiceClient campaignLabelServiceClient =
 *     CampaignLabelServiceClient.create(campaignLabelServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignLabelServiceClient implements BackgroundResource {
  private final CampaignLabelServiceSettings settings;
  private final CampaignLabelServiceStub stub;

  private static final PathTemplate CAMPAIGN_LABEL_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaignLabels/{campaign_label}");

  /**
   * Formats a string containing the fully-qualified path to represent a campaign_label resource.
   */
  public static final String formatCampaignLabelName(String customer, String campaignLabel) {
    return CAMPAIGN_LABEL_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "campaign_label", campaignLabel);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a campaign_label
   * resource.
   */
  public static final String parseCustomerFromCampaignLabelName(String campaignLabelName) {
    return CAMPAIGN_LABEL_PATH_TEMPLATE.parse(campaignLabelName).get("customer");
  }

  /**
   * Parses the campaign_label from the given fully-qualified path which represents a campaign_label
   * resource.
   */
  public static final String parseCampaignLabelFromCampaignLabelName(String campaignLabelName) {
    return CAMPAIGN_LABEL_PATH_TEMPLATE.parse(campaignLabelName).get("campaign_label");
  }

  /** Constructs an instance of CampaignLabelServiceClient with default settings. */
  public static final CampaignLabelServiceClient create() throws IOException {
    return create(CampaignLabelServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignLabelServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CampaignLabelServiceClient create(CampaignLabelServiceSettings settings)
      throws IOException {
    return new CampaignLabelServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignLabelServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use CampaignLabelServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CampaignLabelServiceClient create(CampaignLabelServiceStub stub) {
    return new CampaignLabelServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignLabelServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignLabelServiceClient(CampaignLabelServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CampaignLabelServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignLabelServiceClient(CampaignLabelServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignLabelServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignLabelServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign-label relationship in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignLabelServiceClient campaignLabelServiceClient = CampaignLabelServiceClient.create()) {
   *   String formattedResourceName = CampaignLabelServiceClient.formatCampaignLabelName("[CUSTOMER]", "[CAMPAIGN_LABEL]");
   *   CampaignLabel response = campaignLabelServiceClient.getCampaignLabel(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the campaign-label relationship to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignLabel getCampaignLabel(String resourceName) {
    CAMPAIGN_LABEL_PATH_TEMPLATE.validate(resourceName, "getCampaignLabel");
    GetCampaignLabelRequest request =
        GetCampaignLabelRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign-label relationship in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignLabelServiceClient campaignLabelServiceClient = CampaignLabelServiceClient.create()) {
   *   String formattedResourceName = CampaignLabelServiceClient.formatCampaignLabelName("[CUSTOMER]", "[CAMPAIGN_LABEL]");
   *   GetCampaignLabelRequest request = GetCampaignLabelRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CampaignLabel response = campaignLabelServiceClient.getCampaignLabel(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignLabel getCampaignLabel(GetCampaignLabelRequest request) {
    return getCampaignLabelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign-label relationship in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignLabelServiceClient campaignLabelServiceClient = CampaignLabelServiceClient.create()) {
   *   String formattedResourceName = CampaignLabelServiceClient.formatCampaignLabelName("[CUSTOMER]", "[CAMPAIGN_LABEL]");
   *   GetCampaignLabelRequest request = GetCampaignLabelRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CampaignLabel&gt; future = campaignLabelServiceClient.getCampaignLabelCallable().futureCall(request);
   *   // Do something
   *   CampaignLabel response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCampaignLabelRequest, CampaignLabel> getCampaignLabelCallable() {
    return stub.getCampaignLabelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes campaign-label relationships. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignLabelServiceClient campaignLabelServiceClient = CampaignLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateCampaignLabelsResponse response = campaignLabelServiceClient.mutateCampaignLabels(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId ID of the customer whose campaign-label relationships are being modified.
   * @param operations The list of operations to perform on campaign-label relationships.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignLabelsResponse mutateCampaignLabels(
      String customerId,
      List<CampaignLabelOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateCampaignLabelsRequest request =
        MutateCampaignLabelsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateCampaignLabels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes campaign-label relationships. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignLabelServiceClient campaignLabelServiceClient = CampaignLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignLabelsResponse response = campaignLabelServiceClient.mutateCampaignLabels(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId ID of the customer whose campaign-label relationships are being modified.
   * @param operations The list of operations to perform on campaign-label relationships.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignLabelsResponse mutateCampaignLabels(
      String customerId, List<CampaignLabelOperation> operations) {

    MutateCampaignLabelsRequest request =
        MutateCampaignLabelsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignLabels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes campaign-label relationships. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignLabelServiceClient campaignLabelServiceClient = CampaignLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignLabelsRequest request = MutateCampaignLabelsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCampaignLabelsResponse response = campaignLabelServiceClient.mutateCampaignLabels(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignLabelsResponse mutateCampaignLabels(
      MutateCampaignLabelsRequest request) {
    return mutateCampaignLabelsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes campaign-label relationships. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignLabelServiceClient campaignLabelServiceClient = CampaignLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignLabelsRequest request = MutateCampaignLabelsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCampaignLabelsResponse&gt; future = campaignLabelServiceClient.mutateCampaignLabelsCallable().futureCall(request);
   *   // Do something
   *   MutateCampaignLabelsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCampaignLabelsRequest, MutateCampaignLabelsResponse>
      mutateCampaignLabelsCallable() {
    return stub.mutateCampaignLabelsCallable();
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
