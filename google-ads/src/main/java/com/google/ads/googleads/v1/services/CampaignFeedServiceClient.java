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

import com.google.ads.googleads.v1.resources.CampaignFeed;
import com.google.ads.googleads.v1.services.stub.CampaignFeedServiceStub;
import com.google.ads.googleads.v1.services.stub.CampaignFeedServiceStubSettings;
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
 * Service Description: Service to manage campaign feeds.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
 *   String formattedResourceName = CampaignFeedServiceClient.formatCampaignFeedName("[CUSTOMER]", "[CAMPAIGN_FEED]");
 *   CampaignFeed response = campaignFeedServiceClient.getCampaignFeed(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the campaignFeedServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of CampaignFeedServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CampaignFeedServiceSettings campaignFeedServiceSettings =
 *     CampaignFeedServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignFeedServiceClient campaignFeedServiceClient =
 *     CampaignFeedServiceClient.create(campaignFeedServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CampaignFeedServiceSettings campaignFeedServiceSettings =
 *     CampaignFeedServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignFeedServiceClient campaignFeedServiceClient =
 *     CampaignFeedServiceClient.create(campaignFeedServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignFeedServiceClient implements BackgroundResource {
  private final CampaignFeedServiceSettings settings;
  private final CampaignFeedServiceStub stub;

  private static final PathTemplate CAMPAIGN_FEED_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaignFeeds/{campaign_feed}");

  /** Formats a string containing the fully-qualified path to represent a campaign_feed resource. */
  public static final String formatCampaignFeedName(String customer, String campaignFeed) {
    return CAMPAIGN_FEED_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "campaign_feed", campaignFeed);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a campaign_feed
   * resource.
   */
  public static final String parseCustomerFromCampaignFeedName(String campaignFeedName) {
    return CAMPAIGN_FEED_PATH_TEMPLATE.parse(campaignFeedName).get("customer");
  }

  /**
   * Parses the campaign_feed from the given fully-qualified path which represents a campaign_feed
   * resource.
   */
  public static final String parseCampaignFeedFromCampaignFeedName(String campaignFeedName) {
    return CAMPAIGN_FEED_PATH_TEMPLATE.parse(campaignFeedName).get("campaign_feed");
  }

  /** Constructs an instance of CampaignFeedServiceClient with default settings. */
  public static final CampaignFeedServiceClient create() throws IOException {
    return create(CampaignFeedServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignFeedServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CampaignFeedServiceClient create(CampaignFeedServiceSettings settings)
      throws IOException {
    return new CampaignFeedServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignFeedServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use CampaignFeedServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CampaignFeedServiceClient create(CampaignFeedServiceStub stub) {
    return new CampaignFeedServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignFeedServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignFeedServiceClient(CampaignFeedServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CampaignFeedServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignFeedServiceClient(CampaignFeedServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignFeedServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignFeedServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
   *   String formattedResourceName = CampaignFeedServiceClient.formatCampaignFeedName("[CUSTOMER]", "[CAMPAIGN_FEED]");
   *   CampaignFeed response = campaignFeedServiceClient.getCampaignFeed(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the campaign feed to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignFeed getCampaignFeed(String resourceName) {
    CAMPAIGN_FEED_PATH_TEMPLATE.validate(resourceName, "getCampaignFeed");
    GetCampaignFeedRequest request =
        GetCampaignFeedRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignFeed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
   *   String formattedResourceName = CampaignFeedServiceClient.formatCampaignFeedName("[CUSTOMER]", "[CAMPAIGN_FEED]");
   *   GetCampaignFeedRequest request = GetCampaignFeedRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CampaignFeed response = campaignFeedServiceClient.getCampaignFeed(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignFeed getCampaignFeed(GetCampaignFeedRequest request) {
    return getCampaignFeedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign feed in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
   *   String formattedResourceName = CampaignFeedServiceClient.formatCampaignFeedName("[CUSTOMER]", "[CAMPAIGN_FEED]");
   *   GetCampaignFeedRequest request = GetCampaignFeedRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CampaignFeed&gt; future = campaignFeedServiceClient.getCampaignFeedCallable().futureCall(request);
   *   // Do something
   *   CampaignFeed response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCampaignFeedRequest, CampaignFeed> getCampaignFeedCallable() {
    return stub.getCampaignFeedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignFeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateCampaignFeedsResponse response = campaignFeedServiceClient.mutateCampaignFeeds(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign feeds are being modified.
   * @param operations The list of operations to perform on individual campaign feeds.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignFeedsResponse mutateCampaignFeeds(
      String customerId,
      List<CampaignFeedOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateCampaignFeedsRequest request =
        MutateCampaignFeedsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateCampaignFeeds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignFeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignFeedsResponse response = campaignFeedServiceClient.mutateCampaignFeeds(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign feeds are being modified.
   * @param operations The list of operations to perform on individual campaign feeds.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignFeedsResponse mutateCampaignFeeds(
      String customerId, List<CampaignFeedOperation> operations) {

    MutateCampaignFeedsRequest request =
        MutateCampaignFeedsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignFeeds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignFeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignFeedsRequest request = MutateCampaignFeedsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCampaignFeedsResponse response = campaignFeedServiceClient.mutateCampaignFeeds(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignFeedsResponse mutateCampaignFeeds(MutateCampaignFeedsRequest request) {
    return mutateCampaignFeedsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign feeds. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignFeedOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignFeedsRequest request = MutateCampaignFeedsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCampaignFeedsResponse&gt; future = campaignFeedServiceClient.mutateCampaignFeedsCallable().futureCall(request);
   *   // Do something
   *   MutateCampaignFeedsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCampaignFeedsRequest, MutateCampaignFeedsResponse>
      mutateCampaignFeedsCallable() {
    return stub.mutateCampaignFeedsCallable();
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
