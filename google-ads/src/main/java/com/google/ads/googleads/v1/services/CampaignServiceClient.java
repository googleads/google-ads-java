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

import com.google.ads.googleads.v1.resources.Campaign;
import com.google.ads.googleads.v1.services.stub.CampaignServiceStub;
import com.google.ads.googleads.v1.services.stub.CampaignServiceStubSettings;
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
 * Service Description: Service to manage campaigns.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
 *   String formattedResourceName = CampaignServiceClient.formatCampaignName("[CUSTOMER]", "[CAMPAIGN]");
 *   Campaign response = campaignServiceClient.getCampaign(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the campaignServiceClient object to clean up resources
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
 * <pre>
 * <code>
 * CampaignServiceSettings campaignServiceSettings =
 *     CampaignServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignServiceClient campaignServiceClient =
 *     CampaignServiceClient.create(campaignServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CampaignServiceSettings campaignServiceSettings =
 *     CampaignServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignServiceClient campaignServiceClient =
 *     CampaignServiceClient.create(campaignServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignServiceClient implements BackgroundResource {
  private final CampaignServiceSettings settings;
  private final CampaignServiceStub stub;

  private static final PathTemplate CAMPAIGN_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaigns/{campaign}");

  /** Formats a string containing the fully-qualified path to represent a campaign resource. */
  public static final String formatCampaignName(String customer, String campaign) {
    return CAMPAIGN_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "campaign", campaign);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a campaign resource.
   */
  public static final String parseCustomerFromCampaignName(String campaignName) {
    return CAMPAIGN_PATH_TEMPLATE.parse(campaignName).get("customer");
  }

  /**
   * Parses the campaign from the given fully-qualified path which represents a campaign resource.
   */
  public static final String parseCampaignFromCampaignName(String campaignName) {
    return CAMPAIGN_PATH_TEMPLATE.parse(campaignName).get("campaign");
  }

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
   * for advanced usage - prefer to use CampaignServiceSettings}.
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   String formattedResourceName = CampaignServiceClient.formatCampaignName("[CUSTOMER]", "[CAMPAIGN]");
   *   Campaign response = campaignServiceClient.getCampaign(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the campaign to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Campaign getCampaign(String resourceName) {
    CAMPAIGN_PATH_TEMPLATE.validate(resourceName, "getCampaign");
    GetCampaignRequest request =
        GetCampaignRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaign(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   String formattedResourceName = CampaignServiceClient.formatCampaignName("[CUSTOMER]", "[CAMPAIGN]");
   *   GetCampaignRequest request = GetCampaignRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   Campaign response = campaignServiceClient.getCampaign(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Campaign getCampaign(GetCampaignRequest request) {
    return getCampaignCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   String formattedResourceName = CampaignServiceClient.formatCampaignName("[CUSTOMER]", "[CAMPAIGN]");
   *   GetCampaignRequest request = GetCampaignRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;Campaign&gt; future = campaignServiceClient.getCampaignCallable().futureCall(request);
   *   // Do something
   *   Campaign response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCampaignRequest, Campaign> getCampaignCallable() {
    return stub.getCampaignCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaigns. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateCampaignsResponse response = campaignServiceClient.mutateCampaigns(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaigns are being modified.
   * @param operations The list of operations to perform on individual campaigns.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignsResponse mutateCampaigns(
      String customerId,
      List<CampaignOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateCampaignsRequest request =
        MutateCampaignsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateCampaigns(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaigns. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignsResponse response = campaignServiceClient.mutateCampaigns(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaigns are being modified.
   * @param operations The list of operations to perform on individual campaigns.
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaigns. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignsRequest request = MutateCampaignsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCampaignsResponse response = campaignServiceClient.mutateCampaigns(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignsResponse mutateCampaigns(MutateCampaignsRequest request) {
    return mutateCampaignsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaigns. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignsRequest request = MutateCampaignsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCampaignsResponse&gt; future = campaignServiceClient.mutateCampaignsCallable().futureCall(request);
   *   // Do something
   *   MutateCampaignsResponse response = future.get();
   * }
   * </code></pre>
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
