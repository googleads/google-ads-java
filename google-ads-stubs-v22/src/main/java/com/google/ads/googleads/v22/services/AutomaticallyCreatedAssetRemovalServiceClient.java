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

import com.google.ads.googleads.v22.services.stub.AutomaticallyCreatedAssetRemovalServiceStub;
import com.google.ads.googleads.v22.services.stub.AutomaticallyCreatedAssetRemovalServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to remove automatically created assets.
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
 * try (AutomaticallyCreatedAssetRemovalServiceClient
 *     automaticallyCreatedAssetRemovalServiceClient =
 *         AutomaticallyCreatedAssetRemovalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<RemoveCampaignAutomaticallyCreatedAssetOperation> operations = new ArrayList<>();
 *   boolean partialFailure = true;
 *   RemoveCampaignAutomaticallyCreatedAssetResponse response =
 *       automaticallyCreatedAssetRemovalServiceClient.removeCampaignAutomaticallyCreatedAsset(
 *           customerId, operations, partialFailure);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AutomaticallyCreatedAssetRemovalServiceClient object
 * to clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> RemoveCampaignAutomaticallyCreatedAsset</td>
 *      <td><p> Removes automatically created assets from a campaign.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [ContextError]()   [FieldError]()   [InternalError]()   [MutateError]()   [PartialFailureError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> removeCampaignAutomaticallyCreatedAsset(RemoveCampaignAutomaticallyCreatedAssetRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> removeCampaignAutomaticallyCreatedAsset(String customerId, List&lt;RemoveCampaignAutomaticallyCreatedAssetOperation&gt; operations, boolean partialFailure)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> removeCampaignAutomaticallyCreatedAssetCallable()
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
 * AutomaticallyCreatedAssetRemovalServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AutomaticallyCreatedAssetRemovalServiceSettings
 *     automaticallyCreatedAssetRemovalServiceSettings =
 *         AutomaticallyCreatedAssetRemovalServiceSettings.newBuilder()
 *             .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *             .build();
 * AutomaticallyCreatedAssetRemovalServiceClient automaticallyCreatedAssetRemovalServiceClient =
 *     AutomaticallyCreatedAssetRemovalServiceClient.create(
 *         automaticallyCreatedAssetRemovalServiceSettings);
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
 * AutomaticallyCreatedAssetRemovalServiceSettings
 *     automaticallyCreatedAssetRemovalServiceSettings =
 *         AutomaticallyCreatedAssetRemovalServiceSettings.newBuilder()
 *             .setEndpoint(myEndpoint)
 *             .build();
 * AutomaticallyCreatedAssetRemovalServiceClient automaticallyCreatedAssetRemovalServiceClient =
 *     AutomaticallyCreatedAssetRemovalServiceClient.create(
 *         automaticallyCreatedAssetRemovalServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AutomaticallyCreatedAssetRemovalServiceClient implements BackgroundResource {
  private final AutomaticallyCreatedAssetRemovalServiceSettings settings;
  private final AutomaticallyCreatedAssetRemovalServiceStub stub;

  /**
   * Constructs an instance of AutomaticallyCreatedAssetRemovalServiceClient with default settings.
   */
  public static final AutomaticallyCreatedAssetRemovalServiceClient create() throws IOException {
    return create(AutomaticallyCreatedAssetRemovalServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AutomaticallyCreatedAssetRemovalServiceClient, using the given
   * settings. The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final AutomaticallyCreatedAssetRemovalServiceClient create(
      AutomaticallyCreatedAssetRemovalServiceSettings settings) throws IOException {
    return new AutomaticallyCreatedAssetRemovalServiceClient(settings);
  }

  /**
   * Constructs an instance of AutomaticallyCreatedAssetRemovalServiceClient, using the given stub
   * for making calls. This is for advanced usage - prefer using
   * create(AutomaticallyCreatedAssetRemovalServiceSettings).
   */
  public static final AutomaticallyCreatedAssetRemovalServiceClient create(
      AutomaticallyCreatedAssetRemovalServiceStub stub) {
    return new AutomaticallyCreatedAssetRemovalServiceClient(stub);
  }

  /**
   * Constructs an instance of AutomaticallyCreatedAssetRemovalServiceClient, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected AutomaticallyCreatedAssetRemovalServiceClient(
      AutomaticallyCreatedAssetRemovalServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((AutomaticallyCreatedAssetRemovalServiceStubSettings) settings.getStubSettings())
            .createStub();
  }

  protected AutomaticallyCreatedAssetRemovalServiceClient(
      AutomaticallyCreatedAssetRemovalServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AutomaticallyCreatedAssetRemovalServiceSettings getSettings() {
    return settings;
  }

  public AutomaticallyCreatedAssetRemovalServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes automatically created assets from a campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ContextError]()
   * [FieldError]() [InternalError]() [MutateError]() [PartialFailureError]() [QuotaError]()
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
   * try (AutomaticallyCreatedAssetRemovalServiceClient
   *     automaticallyCreatedAssetRemovalServiceClient =
   *         AutomaticallyCreatedAssetRemovalServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<RemoveCampaignAutomaticallyCreatedAssetOperation> operations = new ArrayList<>();
   *   boolean partialFailure = true;
   *   RemoveCampaignAutomaticallyCreatedAssetResponse response =
   *       automaticallyCreatedAssetRemovalServiceClient.removeCampaignAutomaticallyCreatedAsset(
   *           customerId, operations, partialFailure);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose assets are being removed.
   * @param operations Required. The list of operations.
   * @param partialFailure Required. If true, successful operations will be carried out and invalid
   *     operations will return errors. If false, all operations will be carried out in one
   *     transaction if and only if they are all valid.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveCampaignAutomaticallyCreatedAssetResponse
      removeCampaignAutomaticallyCreatedAsset(
          String customerId,
          List<RemoveCampaignAutomaticallyCreatedAssetOperation> operations,
          boolean partialFailure) {
    RemoveCampaignAutomaticallyCreatedAssetRequest request =
        RemoveCampaignAutomaticallyCreatedAssetRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .build();
    return removeCampaignAutomaticallyCreatedAsset(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes automatically created assets from a campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ContextError]()
   * [FieldError]() [InternalError]() [MutateError]() [PartialFailureError]() [QuotaError]()
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
   * try (AutomaticallyCreatedAssetRemovalServiceClient
   *     automaticallyCreatedAssetRemovalServiceClient =
   *         AutomaticallyCreatedAssetRemovalServiceClient.create()) {
   *   RemoveCampaignAutomaticallyCreatedAssetRequest request =
   *       RemoveCampaignAutomaticallyCreatedAssetRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<RemoveCampaignAutomaticallyCreatedAssetOperation>())
   *           .setPartialFailure(true)
   *           .build();
   *   RemoveCampaignAutomaticallyCreatedAssetResponse response =
   *       automaticallyCreatedAssetRemovalServiceClient.removeCampaignAutomaticallyCreatedAsset(
   *           request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveCampaignAutomaticallyCreatedAssetResponse
      removeCampaignAutomaticallyCreatedAsset(
          RemoveCampaignAutomaticallyCreatedAssetRequest request) {
    return removeCampaignAutomaticallyCreatedAssetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes automatically created assets from a campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ContextError]()
   * [FieldError]() [InternalError]() [MutateError]() [PartialFailureError]() [QuotaError]()
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
   * try (AutomaticallyCreatedAssetRemovalServiceClient
   *     automaticallyCreatedAssetRemovalServiceClient =
   *         AutomaticallyCreatedAssetRemovalServiceClient.create()) {
   *   RemoveCampaignAutomaticallyCreatedAssetRequest request =
   *       RemoveCampaignAutomaticallyCreatedAssetRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<RemoveCampaignAutomaticallyCreatedAssetOperation>())
   *           .setPartialFailure(true)
   *           .build();
   *   ApiFuture<RemoveCampaignAutomaticallyCreatedAssetResponse> future =
   *       automaticallyCreatedAssetRemovalServiceClient
   *           .removeCampaignAutomaticallyCreatedAssetCallable()
   *           .futureCall(request);
   *   // Do something.
   *   RemoveCampaignAutomaticallyCreatedAssetResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          RemoveCampaignAutomaticallyCreatedAssetRequest,
          RemoveCampaignAutomaticallyCreatedAssetResponse>
      removeCampaignAutomaticallyCreatedAssetCallable() {
    return stub.removeCampaignAutomaticallyCreatedAssetCallable();
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
