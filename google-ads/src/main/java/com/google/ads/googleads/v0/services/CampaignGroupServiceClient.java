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

import com.google.ads.googleads.v0.resources.CampaignGroup;
import com.google.ads.googleads.v0.services.stub.CampaignGroupServiceStub;
import com.google.ads.googleads.v0.services.stub.CampaignGroupServiceStubSettings;
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
 * Service Description: Service to manage campaign groups.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CampaignGroupServiceClient campaignGroupServiceClient = CampaignGroupServiceClient.create()) {
 *   String formattedResourceName = CampaignGroupServiceClient.formatCampaignGroupName("[CUSTOMER]", "[CAMPAIGN_GROUP]");
 *   CampaignGroup response = campaignGroupServiceClient.getCampaignGroup(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the campaignGroupServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of CampaignGroupServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CampaignGroupServiceSettings campaignGroupServiceSettings =
 *     CampaignGroupServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignGroupServiceClient campaignGroupServiceClient =
 *     CampaignGroupServiceClient.create(campaignGroupServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CampaignGroupServiceSettings campaignGroupServiceSettings =
 *     CampaignGroupServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignGroupServiceClient campaignGroupServiceClient =
 *     CampaignGroupServiceClient.create(campaignGroupServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignGroupServiceClient implements BackgroundResource {
  private final CampaignGroupServiceSettings settings;
  private final CampaignGroupServiceStub stub;

  private static final PathTemplate CAMPAIGN_GROUP_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaignGroups/{campaign_group}");

  /**
   * Formats a string containing the fully-qualified path to represent a campaign_group resource.
   */
  public static final String formatCampaignGroupName(String customer, String campaignGroup) {
    return CAMPAIGN_GROUP_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "campaign_group", campaignGroup);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a campaign_group
   * resource.
   */
  public static final String parseCustomerFromCampaignGroupName(String campaignGroupName) {
    return CAMPAIGN_GROUP_PATH_TEMPLATE.parse(campaignGroupName).get("customer");
  }

  /**
   * Parses the campaign_group from the given fully-qualified path which represents a campaign_group
   * resource.
   */
  public static final String parseCampaignGroupFromCampaignGroupName(String campaignGroupName) {
    return CAMPAIGN_GROUP_PATH_TEMPLATE.parse(campaignGroupName).get("campaign_group");
  }

  /** Constructs an instance of CampaignGroupServiceClient with default settings. */
  public static final CampaignGroupServiceClient create() throws IOException {
    return create(CampaignGroupServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignGroupServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CampaignGroupServiceClient create(CampaignGroupServiceSettings settings)
      throws IOException {
    return new CampaignGroupServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignGroupServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use CampaignGroupServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CampaignGroupServiceClient create(CampaignGroupServiceStub stub) {
    return new CampaignGroupServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignGroupServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignGroupServiceClient(CampaignGroupServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CampaignGroupServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignGroupServiceClient(CampaignGroupServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignGroupServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignGroupServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignGroupServiceClient campaignGroupServiceClient = CampaignGroupServiceClient.create()) {
   *   String formattedResourceName = CampaignGroupServiceClient.formatCampaignGroupName("[CUSTOMER]", "[CAMPAIGN_GROUP]");
   *   CampaignGroup response = campaignGroupServiceClient.getCampaignGroup(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the campaign group to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignGroup getCampaignGroup(String resourceName) {
    CAMPAIGN_GROUP_PATH_TEMPLATE.validate(resourceName, "getCampaignGroup");
    GetCampaignGroupRequest request =
        GetCampaignGroupRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignGroupServiceClient campaignGroupServiceClient = CampaignGroupServiceClient.create()) {
   *   String formattedResourceName = CampaignGroupServiceClient.formatCampaignGroupName("[CUSTOMER]", "[CAMPAIGN_GROUP]");
   *   GetCampaignGroupRequest request = GetCampaignGroupRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CampaignGroup response = campaignGroupServiceClient.getCampaignGroup(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final CampaignGroup getCampaignGroup(GetCampaignGroupRequest request) {
    return getCampaignGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignGroupServiceClient campaignGroupServiceClient = CampaignGroupServiceClient.create()) {
   *   String formattedResourceName = CampaignGroupServiceClient.formatCampaignGroupName("[CUSTOMER]", "[CAMPAIGN_GROUP]");
   *   GetCampaignGroupRequest request = GetCampaignGroupRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CampaignGroup&gt; future = campaignGroupServiceClient.getCampaignGroupCallable().futureCall(request);
   *   // Do something
   *   CampaignGroup response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCampaignGroupRequest, CampaignGroup> getCampaignGroupCallable() {
    return stub.getCampaignGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignGroupServiceClient campaignGroupServiceClient = CampaignGroupServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignGroupOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignGroupsResponse response = campaignGroupServiceClient.mutateCampaignGroups(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign groups are being modified.
   * @param operations The list of operations to perform on individual campaign groups.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignGroupsResponse mutateCampaignGroups(
      String customerId, List<CampaignGroupOperation> operations) {

    MutateCampaignGroupsRequest request =
        MutateCampaignGroupsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignGroupServiceClient campaignGroupServiceClient = CampaignGroupServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignGroupOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignGroupsRequest request = MutateCampaignGroupsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCampaignGroupsResponse response = campaignGroupServiceClient.mutateCampaignGroups(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignGroupsResponse mutateCampaignGroups(
      MutateCampaignGroupsRequest request) {
    return mutateCampaignGroupsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignGroupServiceClient campaignGroupServiceClient = CampaignGroupServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignGroupOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignGroupsRequest request = MutateCampaignGroupsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCampaignGroupsResponse&gt; future = campaignGroupServiceClient.mutateCampaignGroupsCallable().futureCall(request);
   *   // Do something
   *   MutateCampaignGroupsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCampaignGroupsRequest, MutateCampaignGroupsResponse>
      mutateCampaignGroupsCallable() {
    return stub.mutateCampaignGroupsCallable();
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
