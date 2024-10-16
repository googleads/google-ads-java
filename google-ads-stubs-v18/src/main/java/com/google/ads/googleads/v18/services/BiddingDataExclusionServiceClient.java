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

package com.google.ads.googleads.v18.services;

import com.google.ads.googleads.v18.services.stub.BiddingDataExclusionServiceStub;
import com.google.ads.googleads.v18.services.stub.BiddingDataExclusionServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage bidding data exclusions.
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
 * try (BiddingDataExclusionServiceClient biddingDataExclusionServiceClient =
 *     BiddingDataExclusionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<BiddingDataExclusionOperation> operations = new ArrayList<>();
 *   MutateBiddingDataExclusionsResponse response =
 *       biddingDataExclusionServiceClient.mutateBiddingDataExclusions(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the BiddingDataExclusionServiceClient object to clean up
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
 *      <td><p> MutateBiddingDataExclusions</td>
 *      <td><p> Creates, updates, or removes data exclusions. Operation statuses are returned.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateBiddingDataExclusions(MutateBiddingDataExclusionsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateBiddingDataExclusions(String customerId, List&lt;BiddingDataExclusionOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateBiddingDataExclusionsCallable()
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
 * BiddingDataExclusionServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BiddingDataExclusionServiceSettings biddingDataExclusionServiceSettings =
 *     BiddingDataExclusionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BiddingDataExclusionServiceClient biddingDataExclusionServiceClient =
 *     BiddingDataExclusionServiceClient.create(biddingDataExclusionServiceSettings);
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
 * BiddingDataExclusionServiceSettings biddingDataExclusionServiceSettings =
 *     BiddingDataExclusionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BiddingDataExclusionServiceClient biddingDataExclusionServiceClient =
 *     BiddingDataExclusionServiceClient.create(biddingDataExclusionServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class BiddingDataExclusionServiceClient implements BackgroundResource {
  private final BiddingDataExclusionServiceSettings settings;
  private final BiddingDataExclusionServiceStub stub;

  /** Constructs an instance of BiddingDataExclusionServiceClient with default settings. */
  public static final BiddingDataExclusionServiceClient create() throws IOException {
    return create(BiddingDataExclusionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BiddingDataExclusionServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final BiddingDataExclusionServiceClient create(
      BiddingDataExclusionServiceSettings settings) throws IOException {
    return new BiddingDataExclusionServiceClient(settings);
  }

  /**
   * Constructs an instance of BiddingDataExclusionServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(BiddingDataExclusionServiceSettings).
   */
  public static final BiddingDataExclusionServiceClient create(
      BiddingDataExclusionServiceStub stub) {
    return new BiddingDataExclusionServiceClient(stub);
  }

  /**
   * Constructs an instance of BiddingDataExclusionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected BiddingDataExclusionServiceClient(BiddingDataExclusionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((BiddingDataExclusionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected BiddingDataExclusionServiceClient(BiddingDataExclusionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BiddingDataExclusionServiceSettings getSettings() {
    return settings;
  }

  public BiddingDataExclusionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes data exclusions. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BiddingDataExclusionServiceClient biddingDataExclusionServiceClient =
   *     BiddingDataExclusionServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<BiddingDataExclusionOperation> operations = new ArrayList<>();
   *   MutateBiddingDataExclusionsResponse response =
   *       biddingDataExclusionServiceClient.mutateBiddingDataExclusions(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. ID of the customer whose data exclusions are being modified.
   * @param operations Required. The list of operations to perform on individual data exclusions.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBiddingDataExclusionsResponse mutateBiddingDataExclusions(
      String customerId, List<BiddingDataExclusionOperation> operations) {
    MutateBiddingDataExclusionsRequest request =
        MutateBiddingDataExclusionsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateBiddingDataExclusions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes data exclusions. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BiddingDataExclusionServiceClient biddingDataExclusionServiceClient =
   *     BiddingDataExclusionServiceClient.create()) {
   *   MutateBiddingDataExclusionsRequest request =
   *       MutateBiddingDataExclusionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<BiddingDataExclusionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateBiddingDataExclusionsResponse response =
   *       biddingDataExclusionServiceClient.mutateBiddingDataExclusions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBiddingDataExclusionsResponse mutateBiddingDataExclusions(
      MutateBiddingDataExclusionsRequest request) {
    return mutateBiddingDataExclusionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes data exclusions. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BiddingDataExclusionServiceClient biddingDataExclusionServiceClient =
   *     BiddingDataExclusionServiceClient.create()) {
   *   MutateBiddingDataExclusionsRequest request =
   *       MutateBiddingDataExclusionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<BiddingDataExclusionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateBiddingDataExclusionsResponse> future =
   *       biddingDataExclusionServiceClient
   *           .mutateBiddingDataExclusionsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateBiddingDataExclusionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateBiddingDataExclusionsRequest, MutateBiddingDataExclusionsResponse>
      mutateBiddingDataExclusionsCallable() {
    return stub.mutateBiddingDataExclusionsCallable();
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
