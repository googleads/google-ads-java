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

package com.google.ads.googleads.v21.services;

import com.google.ads.googleads.v21.services.stub.CampaignAssetServiceStub;
import com.google.ads.googleads.v21.services.stub.CampaignAssetServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage campaign assets.
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
 * try (CampaignAssetServiceClient campaignAssetServiceClient =
 *     CampaignAssetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignAssetOperation> operations = new ArrayList<>();
 *   MutateCampaignAssetsResponse response =
 *       campaignAssetServiceClient.mutateCampaignAssets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CampaignAssetServiceClient object to clean up
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
 *      <td><p> MutateCampaignAssets</td>
 *      <td><p> Creates, updates, or removes campaign assets. Operation statuses are returned.
 * <p>  List of thrown errors:   [AssetLinkError]()   [AuthenticationError]()   [AuthorizationError]()   [ContextError]()   [DatabaseError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [NotAllowlistedError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateCampaignAssets(MutateCampaignAssetsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateCampaignAssets(String customerId, List&lt;CampaignAssetOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateCampaignAssetsCallable()
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
 * <p>This class can be customized by passing in a custom instance of CampaignAssetServiceSettings
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
 * CampaignAssetServiceSettings campaignAssetServiceSettings =
 *     CampaignAssetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignAssetServiceClient campaignAssetServiceClient =
 *     CampaignAssetServiceClient.create(campaignAssetServiceSettings);
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
 * CampaignAssetServiceSettings campaignAssetServiceSettings =
 *     CampaignAssetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignAssetServiceClient campaignAssetServiceClient =
 *     CampaignAssetServiceClient.create(campaignAssetServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CampaignAssetServiceClient implements BackgroundResource {
  private final CampaignAssetServiceSettings settings;
  private final CampaignAssetServiceStub stub;

  /** Constructs an instance of CampaignAssetServiceClient with default settings. */
  public static final CampaignAssetServiceClient create() throws IOException {
    return create(CampaignAssetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignAssetServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CampaignAssetServiceClient create(CampaignAssetServiceSettings settings)
      throws IOException {
    return new CampaignAssetServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignAssetServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(CampaignAssetServiceSettings).
   */
  public static final CampaignAssetServiceClient create(CampaignAssetServiceStub stub) {
    return new CampaignAssetServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignAssetServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignAssetServiceClient(CampaignAssetServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CampaignAssetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected CampaignAssetServiceClient(CampaignAssetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignAssetServiceSettings getSettings() {
    return settings;
  }

  public CampaignAssetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign assets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AssetLinkError]() [AuthenticationError]() [AuthorizationError]()
   * [ContextError]() [DatabaseError]() [FieldError]() [HeaderError]() [InternalError]()
   * [MutateError]() [NotAllowlistedError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignAssetServiceClient campaignAssetServiceClient =
   *     CampaignAssetServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CampaignAssetOperation> operations = new ArrayList<>();
   *   MutateCampaignAssetsResponse response =
   *       campaignAssetServiceClient.mutateCampaignAssets(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose campaign assets are being modified.
   * @param operations Required. The list of operations to perform on individual campaign assets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignAssetsResponse mutateCampaignAssets(
      String customerId, List<CampaignAssetOperation> operations) {
    MutateCampaignAssetsRequest request =
        MutateCampaignAssetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign assets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AssetLinkError]() [AuthenticationError]() [AuthorizationError]()
   * [ContextError]() [DatabaseError]() [FieldError]() [HeaderError]() [InternalError]()
   * [MutateError]() [NotAllowlistedError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignAssetServiceClient campaignAssetServiceClient =
   *     CampaignAssetServiceClient.create()) {
   *   MutateCampaignAssetsRequest request =
   *       MutateCampaignAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignAssetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCampaignAssetsResponse response =
   *       campaignAssetServiceClient.mutateCampaignAssets(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignAssetsResponse mutateCampaignAssets(
      MutateCampaignAssetsRequest request) {
    return mutateCampaignAssetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign assets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AssetLinkError]() [AuthenticationError]() [AuthorizationError]()
   * [ContextError]() [DatabaseError]() [FieldError]() [HeaderError]() [InternalError]()
   * [MutateError]() [NotAllowlistedError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignAssetServiceClient campaignAssetServiceClient =
   *     CampaignAssetServiceClient.create()) {
   *   MutateCampaignAssetsRequest request =
   *       MutateCampaignAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignAssetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCampaignAssetsResponse> future =
   *       campaignAssetServiceClient.mutateCampaignAssetsCallable().futureCall(request);
   *   // Do something.
   *   MutateCampaignAssetsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateCampaignAssetsRequest, MutateCampaignAssetsResponse>
      mutateCampaignAssetsCallable() {
    return stub.mutateCampaignAssetsCallable();
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
