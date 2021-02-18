/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.CampaignFeed;
import com.google.ads.googleads.v6.resources.CampaignFeedName;
import com.google.ads.googleads.v6.services.stub.CampaignFeedServiceStub;
import com.google.ads.googleads.v6.services.stub.CampaignFeedServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage campaign feeds.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the CampaignFeedServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
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
 * <pre>{@code
 * CampaignFeedServiceSettings campaignFeedServiceSettings =
 *     CampaignFeedServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignFeedServiceClient campaignFeedServiceClient =
 *     CampaignFeedServiceClient.create(campaignFeedServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CampaignFeedServiceSettings campaignFeedServiceSettings =
 *     CampaignFeedServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignFeedServiceClient campaignFeedServiceClient =
 *     CampaignFeedServiceClient.create(campaignFeedServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CampaignFeedServiceClient implements BackgroundResource {
  private final CampaignFeedServiceSettings settings;
  private final CampaignFeedServiceStub stub;

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
   * This is for advanced usage - prefer using create(CampaignFeedServiceSettings).
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign feed in full detail.
   *
   * @param resourceName Required. The resource name of the campaign feed to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignFeed getCampaignFeed(CampaignFeedName resourceName) {
    GetCampaignFeedRequest request =
        GetCampaignFeedRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCampaignFeed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign feed in full detail.
   *
   * @param resourceName Required. The resource name of the campaign feed to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignFeed getCampaignFeed(String resourceName) {
    GetCampaignFeedRequest request =
        GetCampaignFeedRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignFeed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign feed in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignFeed getCampaignFeed(GetCampaignFeedRequest request) {
    return getCampaignFeedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign feed in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetCampaignFeedRequest, CampaignFeed> getCampaignFeedCallable() {
    return stub.getCampaignFeedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign feeds. Operation statuses are returned.
   *
   * @param customerId Required. The ID of the customer whose campaign feeds are being modified.
   * @param operations Required. The list of operations to perform on individual campaign feeds.
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign feeds. Operation statuses are returned.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignFeedsResponse mutateCampaignFeeds(MutateCampaignFeedsRequest request) {
    return mutateCampaignFeedsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign feeds. Operation statuses are returned.
   *
   * <p>Sample code:
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
