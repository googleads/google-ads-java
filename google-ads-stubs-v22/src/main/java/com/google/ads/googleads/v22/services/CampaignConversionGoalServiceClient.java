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

import com.google.ads.googleads.v22.services.stub.CampaignConversionGoalServiceStub;
import com.google.ads.googleads.v22.services.stub.CampaignConversionGoalServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage campaign conversion goal.
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
 * try (CampaignConversionGoalServiceClient campaignConversionGoalServiceClient =
 *     CampaignConversionGoalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignConversionGoalOperation> operations = new ArrayList<>();
 *   MutateCampaignConversionGoalsResponse response =
 *       campaignConversionGoalServiceClient.mutateCampaignConversionGoals(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CampaignConversionGoalServiceClient object to clean up
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
 *      <td><p> MutateCampaignConversionGoals</td>
 *      <td><p> Creates, updates or removes campaign conversion goals. Operation statuses are returned.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateCampaignConversionGoals(MutateCampaignConversionGoalsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateCampaignConversionGoals(String customerId, List&lt;CampaignConversionGoalOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateCampaignConversionGoalsCallable()
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
 * CampaignConversionGoalServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CampaignConversionGoalServiceSettings campaignConversionGoalServiceSettings =
 *     CampaignConversionGoalServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignConversionGoalServiceClient campaignConversionGoalServiceClient =
 *     CampaignConversionGoalServiceClient.create(campaignConversionGoalServiceSettings);
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
 * CampaignConversionGoalServiceSettings campaignConversionGoalServiceSettings =
 *     CampaignConversionGoalServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignConversionGoalServiceClient campaignConversionGoalServiceClient =
 *     CampaignConversionGoalServiceClient.create(campaignConversionGoalServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CampaignConversionGoalServiceClient implements BackgroundResource {
  private final CampaignConversionGoalServiceSettings settings;
  private final CampaignConversionGoalServiceStub stub;

  /** Constructs an instance of CampaignConversionGoalServiceClient with default settings. */
  public static final CampaignConversionGoalServiceClient create() throws IOException {
    return create(CampaignConversionGoalServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignConversionGoalServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CampaignConversionGoalServiceClient create(
      CampaignConversionGoalServiceSettings settings) throws IOException {
    return new CampaignConversionGoalServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignConversionGoalServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(CampaignConversionGoalServiceSettings).
   */
  public static final CampaignConversionGoalServiceClient create(
      CampaignConversionGoalServiceStub stub) {
    return new CampaignConversionGoalServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignConversionGoalServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignConversionGoalServiceClient(CampaignConversionGoalServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((CampaignConversionGoalServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected CampaignConversionGoalServiceClient(CampaignConversionGoalServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignConversionGoalServiceSettings getSettings() {
    return settings;
  }

  public CampaignConversionGoalServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes campaign conversion goals. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignConversionGoalServiceClient campaignConversionGoalServiceClient =
   *     CampaignConversionGoalServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CampaignConversionGoalOperation> operations = new ArrayList<>();
   *   MutateCampaignConversionGoalsResponse response =
   *       campaignConversionGoalServiceClient.mutateCampaignConversionGoals(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose campaign conversion goals are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual campaign conversion
   *     goal.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignConversionGoalsResponse mutateCampaignConversionGoals(
      String customerId, List<CampaignConversionGoalOperation> operations) {
    MutateCampaignConversionGoalsRequest request =
        MutateCampaignConversionGoalsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignConversionGoals(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes campaign conversion goals. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignConversionGoalServiceClient campaignConversionGoalServiceClient =
   *     CampaignConversionGoalServiceClient.create()) {
   *   MutateCampaignConversionGoalsRequest request =
   *       MutateCampaignConversionGoalsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignConversionGoalOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCampaignConversionGoalsResponse response =
   *       campaignConversionGoalServiceClient.mutateCampaignConversionGoals(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignConversionGoalsResponse mutateCampaignConversionGoals(
      MutateCampaignConversionGoalsRequest request) {
    return mutateCampaignConversionGoalsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes campaign conversion goals. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignConversionGoalServiceClient campaignConversionGoalServiceClient =
   *     CampaignConversionGoalServiceClient.create()) {
   *   MutateCampaignConversionGoalsRequest request =
   *       MutateCampaignConversionGoalsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignConversionGoalOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCampaignConversionGoalsResponse> future =
   *       campaignConversionGoalServiceClient
   *           .mutateCampaignConversionGoalsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateCampaignConversionGoalsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateCampaignConversionGoalsRequest, MutateCampaignConversionGoalsResponse>
      mutateCampaignConversionGoalsCallable() {
    return stub.mutateCampaignConversionGoalsCallable();
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
