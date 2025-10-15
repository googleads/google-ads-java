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

package com.google.ads.googleads.v22.services;

import com.google.ads.googleads.v22.resources.SmartCampaignSettingName;
import com.google.ads.googleads.v22.services.stub.SmartCampaignSettingServiceStub;
import com.google.ads.googleads.v22.services.stub.SmartCampaignSettingServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage Smart campaign settings.
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
 * try (SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
 *     SmartCampaignSettingServiceClient.create()) {
 *   SmartCampaignSettingName resourceName =
 *       SmartCampaignSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]");
 *   GetSmartCampaignStatusResponse response =
 *       smartCampaignSettingServiceClient.getSmartCampaignStatus(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the SmartCampaignSettingServiceClient object to clean up
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
 *      <td><p> GetSmartCampaignStatus</td>
 *      <td><p> Returns the status of the requested Smart campaign.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getSmartCampaignStatus(GetSmartCampaignStatusRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getSmartCampaignStatus(SmartCampaignSettingName resourceName)
 *           <li><p> getSmartCampaignStatus(String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getSmartCampaignStatusCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> MutateSmartCampaignSettings</td>
 *      <td><p> Updates Smart campaign settings for campaigns.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateSmartCampaignSettings(MutateSmartCampaignSettingsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateSmartCampaignSettings(String customerId, List&lt;SmartCampaignSettingOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateSmartCampaignSettingsCallable()
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
 * <p>This class can be customized by passing in a custom instance of
 * SmartCampaignSettingServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SmartCampaignSettingServiceSettings smartCampaignSettingServiceSettings =
 *     SmartCampaignSettingServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
 *     SmartCampaignSettingServiceClient.create(smartCampaignSettingServiceSettings);
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
 * SmartCampaignSettingServiceSettings smartCampaignSettingServiceSettings =
 *     SmartCampaignSettingServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
 *     SmartCampaignSettingServiceClient.create(smartCampaignSettingServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class SmartCampaignSettingServiceClient implements BackgroundResource {
  private final SmartCampaignSettingServiceSettings settings;
  private final SmartCampaignSettingServiceStub stub;

  /** Constructs an instance of SmartCampaignSettingServiceClient with default settings. */
  public static final SmartCampaignSettingServiceClient create() throws IOException {
    return create(SmartCampaignSettingServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SmartCampaignSettingServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final SmartCampaignSettingServiceClient create(
      SmartCampaignSettingServiceSettings settings) throws IOException {
    return new SmartCampaignSettingServiceClient(settings);
  }

  /**
   * Constructs an instance of SmartCampaignSettingServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(SmartCampaignSettingServiceSettings).
   */
  public static final SmartCampaignSettingServiceClient create(
      SmartCampaignSettingServiceStub stub) {
    return new SmartCampaignSettingServiceClient(stub);
  }

  /**
   * Constructs an instance of SmartCampaignSettingServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected SmartCampaignSettingServiceClient(SmartCampaignSettingServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((SmartCampaignSettingServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected SmartCampaignSettingServiceClient(SmartCampaignSettingServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SmartCampaignSettingServiceSettings getSettings() {
    return settings;
  }

  public SmartCampaignSettingServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the status of the requested Smart campaign.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
   *     SmartCampaignSettingServiceClient.create()) {
   *   SmartCampaignSettingName resourceName =
   *       SmartCampaignSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]");
   *   GetSmartCampaignStatusResponse response =
   *       smartCampaignSettingServiceClient.getSmartCampaignStatus(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the Smart campaign setting belonging to the
   *     Smart campaign to fetch the status of.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GetSmartCampaignStatusResponse getSmartCampaignStatus(
      SmartCampaignSettingName resourceName) {
    GetSmartCampaignStatusRequest request =
        GetSmartCampaignStatusRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getSmartCampaignStatus(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the status of the requested Smart campaign.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
   *     SmartCampaignSettingServiceClient.create()) {
   *   String resourceName =
   *       SmartCampaignSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString();
   *   GetSmartCampaignStatusResponse response =
   *       smartCampaignSettingServiceClient.getSmartCampaignStatus(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the Smart campaign setting belonging to the
   *     Smart campaign to fetch the status of.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GetSmartCampaignStatusResponse getSmartCampaignStatus(String resourceName) {
    GetSmartCampaignStatusRequest request =
        GetSmartCampaignStatusRequest.newBuilder().setResourceName(resourceName).build();
    return getSmartCampaignStatus(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the status of the requested Smart campaign.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
   *     SmartCampaignSettingServiceClient.create()) {
   *   GetSmartCampaignStatusRequest request =
   *       GetSmartCampaignStatusRequest.newBuilder()
   *           .setResourceName(
   *               SmartCampaignSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
   *           .build();
   *   GetSmartCampaignStatusResponse response =
   *       smartCampaignSettingServiceClient.getSmartCampaignStatus(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GetSmartCampaignStatusResponse getSmartCampaignStatus(
      GetSmartCampaignStatusRequest request) {
    return getSmartCampaignStatusCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the status of the requested Smart campaign.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
   *     SmartCampaignSettingServiceClient.create()) {
   *   GetSmartCampaignStatusRequest request =
   *       GetSmartCampaignStatusRequest.newBuilder()
   *           .setResourceName(
   *               SmartCampaignSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
   *           .build();
   *   ApiFuture<GetSmartCampaignStatusResponse> future =
   *       smartCampaignSettingServiceClient.getSmartCampaignStatusCallable().futureCall(request);
   *   // Do something.
   *   GetSmartCampaignStatusResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetSmartCampaignStatusRequest, GetSmartCampaignStatusResponse>
      getSmartCampaignStatusCallable() {
    return stub.getSmartCampaignStatusCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates Smart campaign settings for campaigns.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
   *     SmartCampaignSettingServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<SmartCampaignSettingOperation> operations = new ArrayList<>();
   *   MutateSmartCampaignSettingsResponse response =
   *       smartCampaignSettingServiceClient.mutateSmartCampaignSettings(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose Smart campaign settings are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual Smart campaign
   *     settings.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateSmartCampaignSettingsResponse mutateSmartCampaignSettings(
      String customerId, List<SmartCampaignSettingOperation> operations) {
    MutateSmartCampaignSettingsRequest request =
        MutateSmartCampaignSettingsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateSmartCampaignSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates Smart campaign settings for campaigns.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
   *     SmartCampaignSettingServiceClient.create()) {
   *   MutateSmartCampaignSettingsRequest request =
   *       MutateSmartCampaignSettingsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<SmartCampaignSettingOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateSmartCampaignSettingsResponse response =
   *       smartCampaignSettingServiceClient.mutateSmartCampaignSettings(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateSmartCampaignSettingsResponse mutateSmartCampaignSettings(
      MutateSmartCampaignSettingsRequest request) {
    return mutateSmartCampaignSettingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates Smart campaign settings for campaigns.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
   *     SmartCampaignSettingServiceClient.create()) {
   *   MutateSmartCampaignSettingsRequest request =
   *       MutateSmartCampaignSettingsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<SmartCampaignSettingOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateSmartCampaignSettingsResponse> future =
   *       smartCampaignSettingServiceClient
   *           .mutateSmartCampaignSettingsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateSmartCampaignSettingsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateSmartCampaignSettingsRequest, MutateSmartCampaignSettingsResponse>
      mutateSmartCampaignSettingsCallable() {
    return stub.mutateSmartCampaignSettingsCallable();
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
