/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v20.services;

import com.google.ads.googleads.v20.services.stub.CampaignGroupServiceStub;
import com.google.ads.googleads.v20.services.stub.CampaignGroupServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage campaign groups.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CampaignGroupServiceClient campaignGroupServiceClient =
 *     CampaignGroupServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignGroupOperation> operations = new ArrayList<>();
 *   MutateCampaignGroupsResponse response =
 *       campaignGroupServiceClient.mutateCampaignGroups(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CampaignGroupServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateCampaignGroups</td>
 *      <td><p> Creates, updates, or removes campaign groups. Operation statuses are returned.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateCampaignGroups(MutateCampaignGroupsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateCampaignGroups(String customerId, List&lt;CampaignGroupOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateCampaignGroupsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
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
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CampaignGroupServiceSettings campaignGroupServiceSettings =
 *     CampaignGroupServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignGroupServiceClient campaignGroupServiceClient =
 *     CampaignGroupServiceClient.create(campaignGroupServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CampaignGroupServiceSettings campaignGroupServiceSettings =
 *     CampaignGroupServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignGroupServiceClient campaignGroupServiceClient =
 *     CampaignGroupServiceClient.create(campaignGroupServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CampaignGroupServiceClient implements BackgroundResource {
  private final CampaignGroupServiceSettings settings;
  private final CampaignGroupServiceStub stub;

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
   * This is for advanced usage - prefer using create(CampaignGroupServiceSettings).
   */
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

  protected CampaignGroupServiceClient(CampaignGroupServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignGroupServiceSettings getSettings() {
    return settings;
  }

  public CampaignGroupServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignGroupServiceClient campaignGroupServiceClient =
   *     CampaignGroupServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CampaignGroupOperation> operations = new ArrayList<>();
   *   MutateCampaignGroupsResponse response =
   *       campaignGroupServiceClient.mutateCampaignGroups(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose campaign groups are being modified.
   * @param operations Required. The list of operations to perform on individual campaign groups.
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignGroupServiceClient campaignGroupServiceClient =
   *     CampaignGroupServiceClient.create()) {
   *   MutateCampaignGroupsRequest request =
   *       MutateCampaignGroupsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignGroupOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCampaignGroupsResponse response =
   *       campaignGroupServiceClient.mutateCampaignGroups(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignGroupsResponse mutateCampaignGroups(
      MutateCampaignGroupsRequest request) {
    return mutateCampaignGroupsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignGroupServiceClient campaignGroupServiceClient =
   *     CampaignGroupServiceClient.create()) {
   *   MutateCampaignGroupsRequest request =
   *       MutateCampaignGroupsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignGroupOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCampaignGroupsResponse> future =
   *       campaignGroupServiceClient.mutateCampaignGroupsCallable().futureCall(request);
   *   // Do something.
   *   MutateCampaignGroupsResponse response = future.get();
   * }
   * }</pre>
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
