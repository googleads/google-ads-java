/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v16.services;

import com.google.ads.googleads.v16.services.stub.CampaignLifecycleGoalServiceStub;
import com.google.ads.googleads.v16.services.stub.CampaignLifecycleGoalServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to configure campaign lifecycle goals.
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
 * try (CampaignLifecycleGoalServiceClient campaignLifecycleGoalServiceClient =
 *     CampaignLifecycleGoalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   CampaignLifecycleGoalOperation operation =
 *       CampaignLifecycleGoalOperation.newBuilder().build();
 *   ConfigureCampaignLifecycleGoalsResponse response =
 *       campaignLifecycleGoalServiceClient.configureCampaignLifecycleGoals(customerId, operation);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CampaignLifecycleGoalServiceClient object to clean up
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
 *      <td><p> ConfigureCampaignLifecycleGoals</td>
 *      <td><p> Process the given campaign lifecycle configurations.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CampaignLifecycleGoalConfigError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> configureCampaignLifecycleGoals(ConfigureCampaignLifecycleGoalsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> configureCampaignLifecycleGoals(String customerId, CampaignLifecycleGoalOperation operation)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> configureCampaignLifecycleGoalsCallable()
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
 * CampaignLifecycleGoalServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CampaignLifecycleGoalServiceSettings campaignLifecycleGoalServiceSettings =
 *     CampaignLifecycleGoalServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignLifecycleGoalServiceClient campaignLifecycleGoalServiceClient =
 *     CampaignLifecycleGoalServiceClient.create(campaignLifecycleGoalServiceSettings);
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
 * CampaignLifecycleGoalServiceSettings campaignLifecycleGoalServiceSettings =
 *     CampaignLifecycleGoalServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignLifecycleGoalServiceClient campaignLifecycleGoalServiceClient =
 *     CampaignLifecycleGoalServiceClient.create(campaignLifecycleGoalServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CampaignLifecycleGoalServiceClient implements BackgroundResource {
  private final CampaignLifecycleGoalServiceSettings settings;
  private final CampaignLifecycleGoalServiceStub stub;

  /** Constructs an instance of CampaignLifecycleGoalServiceClient with default settings. */
  public static final CampaignLifecycleGoalServiceClient create() throws IOException {
    return create(CampaignLifecycleGoalServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignLifecycleGoalServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CampaignLifecycleGoalServiceClient create(
      CampaignLifecycleGoalServiceSettings settings) throws IOException {
    return new CampaignLifecycleGoalServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignLifecycleGoalServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(CampaignLifecycleGoalServiceSettings).
   */
  public static final CampaignLifecycleGoalServiceClient create(
      CampaignLifecycleGoalServiceStub stub) {
    return new CampaignLifecycleGoalServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignLifecycleGoalServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignLifecycleGoalServiceClient(CampaignLifecycleGoalServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((CampaignLifecycleGoalServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected CampaignLifecycleGoalServiceClient(CampaignLifecycleGoalServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignLifecycleGoalServiceSettings getSettings() {
    return settings;
  }

  public CampaignLifecycleGoalServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Process the given campaign lifecycle configurations.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CampaignLifecycleGoalConfigError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignLifecycleGoalServiceClient campaignLifecycleGoalServiceClient =
   *     CampaignLifecycleGoalServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   CampaignLifecycleGoalOperation operation =
   *       CampaignLifecycleGoalOperation.newBuilder().build();
   *   ConfigureCampaignLifecycleGoalsResponse response =
   *       campaignLifecycleGoalServiceClient.configureCampaignLifecycleGoals(customerId, operation);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer performing the upload.
   * @param operation Required. The operation to perform campaign lifecycle goal update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConfigureCampaignLifecycleGoalsResponse configureCampaignLifecycleGoals(
      String customerId, CampaignLifecycleGoalOperation operation) {
    ConfigureCampaignLifecycleGoalsRequest request =
        ConfigureCampaignLifecycleGoalsRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return configureCampaignLifecycleGoals(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Process the given campaign lifecycle configurations.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CampaignLifecycleGoalConfigError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignLifecycleGoalServiceClient campaignLifecycleGoalServiceClient =
   *     CampaignLifecycleGoalServiceClient.create()) {
   *   ConfigureCampaignLifecycleGoalsRequest request =
   *       ConfigureCampaignLifecycleGoalsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CampaignLifecycleGoalOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ConfigureCampaignLifecycleGoalsResponse response =
   *       campaignLifecycleGoalServiceClient.configureCampaignLifecycleGoals(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConfigureCampaignLifecycleGoalsResponse configureCampaignLifecycleGoals(
      ConfigureCampaignLifecycleGoalsRequest request) {
    return configureCampaignLifecycleGoalsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Process the given campaign lifecycle configurations.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CampaignLifecycleGoalConfigError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignLifecycleGoalServiceClient campaignLifecycleGoalServiceClient =
   *     CampaignLifecycleGoalServiceClient.create()) {
   *   ConfigureCampaignLifecycleGoalsRequest request =
   *       ConfigureCampaignLifecycleGoalsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CampaignLifecycleGoalOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<ConfigureCampaignLifecycleGoalsResponse> future =
   *       campaignLifecycleGoalServiceClient
   *           .configureCampaignLifecycleGoalsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConfigureCampaignLifecycleGoalsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ConfigureCampaignLifecycleGoalsRequest, ConfigureCampaignLifecycleGoalsResponse>
      configureCampaignLifecycleGoalsCallable() {
    return stub.configureCampaignLifecycleGoalsCallable();
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
