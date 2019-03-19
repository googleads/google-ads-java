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

import com.google.ads.googleads.v1.resources.CampaignSharedSet;
import com.google.ads.googleads.v1.services.stub.CampaignSharedSetServiceStub;
import com.google.ads.googleads.v1.services.stub.CampaignSharedSetServiceStubSettings;
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
 * Service Description: Service to manage campaign shared sets.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
 *   String formattedResourceName = CampaignSharedSetServiceClient.formatCampaignSharedSetName("[CUSTOMER]", "[CAMPAIGN_SHARED_SET]");
 *   CampaignSharedSet response = campaignSharedSetServiceClient.getCampaignSharedSet(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the campaignSharedSetServiceClient object to clean up
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
 * CampaignSharedSetServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CampaignSharedSetServiceSettings campaignSharedSetServiceSettings =
 *     CampaignSharedSetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignSharedSetServiceClient campaignSharedSetServiceClient =
 *     CampaignSharedSetServiceClient.create(campaignSharedSetServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CampaignSharedSetServiceSettings campaignSharedSetServiceSettings =
 *     CampaignSharedSetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignSharedSetServiceClient campaignSharedSetServiceClient =
 *     CampaignSharedSetServiceClient.create(campaignSharedSetServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignSharedSetServiceClient implements BackgroundResource {
  private final CampaignSharedSetServiceSettings settings;
  private final CampaignSharedSetServiceStub stub;

  private static final PathTemplate CAMPAIGN_SHARED_SET_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/campaignSharedSets/{campaign_shared_set}");

  /**
   * Formats a string containing the fully-qualified path to represent a campaign_shared_set
   * resource.
   */
  public static final String formatCampaignSharedSetName(
      String customer, String campaignSharedSet) {
    return CAMPAIGN_SHARED_SET_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "campaign_shared_set", campaignSharedSet);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a campaign_shared_set
   * resource.
   */
  public static final String parseCustomerFromCampaignSharedSetName(String campaignSharedSetName) {
    return CAMPAIGN_SHARED_SET_PATH_TEMPLATE.parse(campaignSharedSetName).get("customer");
  }

  /**
   * Parses the campaign_shared_set from the given fully-qualified path which represents a
   * campaign_shared_set resource.
   */
  public static final String parseCampaignSharedSetFromCampaignSharedSetName(
      String campaignSharedSetName) {
    return CAMPAIGN_SHARED_SET_PATH_TEMPLATE
        .parse(campaignSharedSetName)
        .get("campaign_shared_set");
  }

  /** Constructs an instance of CampaignSharedSetServiceClient with default settings. */
  public static final CampaignSharedSetServiceClient create() throws IOException {
    return create(CampaignSharedSetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignSharedSetServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CampaignSharedSetServiceClient create(
      CampaignSharedSetServiceSettings settings) throws IOException {
    return new CampaignSharedSetServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignSharedSetServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use CampaignSharedSetServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CampaignSharedSetServiceClient create(CampaignSharedSetServiceStub stub) {
    return new CampaignSharedSetServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignSharedSetServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignSharedSetServiceClient(CampaignSharedSetServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((CampaignSharedSetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignSharedSetServiceClient(CampaignSharedSetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignSharedSetServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignSharedSetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign shared set in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
   *   String formattedResourceName = CampaignSharedSetServiceClient.formatCampaignSharedSetName("[CUSTOMER]", "[CAMPAIGN_SHARED_SET]");
   *   CampaignSharedSet response = campaignSharedSetServiceClient.getCampaignSharedSet(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the campaign shared set to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignSharedSet getCampaignSharedSet(String resourceName) {
    CAMPAIGN_SHARED_SET_PATH_TEMPLATE.validate(resourceName, "getCampaignSharedSet");
    GetCampaignSharedSetRequest request =
        GetCampaignSharedSetRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignSharedSet(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign shared set in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
   *   String formattedResourceName = CampaignSharedSetServiceClient.formatCampaignSharedSetName("[CUSTOMER]", "[CAMPAIGN_SHARED_SET]");
   *   GetCampaignSharedSetRequest request = GetCampaignSharedSetRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CampaignSharedSet response = campaignSharedSetServiceClient.getCampaignSharedSet(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignSharedSet getCampaignSharedSet(GetCampaignSharedSetRequest request) {
    return getCampaignSharedSetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign shared set in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
   *   String formattedResourceName = CampaignSharedSetServiceClient.formatCampaignSharedSetName("[CUSTOMER]", "[CAMPAIGN_SHARED_SET]");
   *   GetCampaignSharedSetRequest request = GetCampaignSharedSetRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CampaignSharedSet&gt; future = campaignSharedSetServiceClient.getCampaignSharedSetCallable().futureCall(request);
   *   // Do something
   *   CampaignSharedSet response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCampaignSharedSetRequest, CampaignSharedSet>
      getCampaignSharedSetCallable() {
    return stub.getCampaignSharedSetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes campaign shared sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignSharedSetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateCampaignSharedSetsResponse response = campaignSharedSetServiceClient.mutateCampaignSharedSets(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign shared sets are being modified.
   * @param operations The list of operations to perform on individual campaign shared sets.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignSharedSetsResponse mutateCampaignSharedSets(
      String customerId,
      List<CampaignSharedSetOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateCampaignSharedSetsRequest request =
        MutateCampaignSharedSetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateCampaignSharedSets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes campaign shared sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignSharedSetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignSharedSetsResponse response = campaignSharedSetServiceClient.mutateCampaignSharedSets(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign shared sets are being modified.
   * @param operations The list of operations to perform on individual campaign shared sets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignSharedSetsResponse mutateCampaignSharedSets(
      String customerId, List<CampaignSharedSetOperation> operations) {

    MutateCampaignSharedSetsRequest request =
        MutateCampaignSharedSetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignSharedSets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes campaign shared sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignSharedSetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignSharedSetsRequest request = MutateCampaignSharedSetsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCampaignSharedSetsResponse response = campaignSharedSetServiceClient.mutateCampaignSharedSets(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignSharedSetsResponse mutateCampaignSharedSets(
      MutateCampaignSharedSetsRequest request) {
    return mutateCampaignSharedSetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes campaign shared sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignSharedSetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignSharedSetsRequest request = MutateCampaignSharedSetsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCampaignSharedSetsResponse&gt; future = campaignSharedSetServiceClient.mutateCampaignSharedSetsCallable().futureCall(request);
   *   // Do something
   *   MutateCampaignSharedSetsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCampaignSharedSetsRequest, MutateCampaignSharedSetsResponse>
      mutateCampaignSharedSetsCallable() {
    return stub.mutateCampaignSharedSetsCallable();
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
