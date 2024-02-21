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

import com.google.ads.googleads.v16.services.stub.AdGroupLabelServiceStub;
import com.google.ads.googleads.v16.services.stub.AdGroupLabelServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage labels on ad groups.
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
 * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupLabelOperation> operations = new ArrayList<>();
 *   MutateAdGroupLabelsResponse response =
 *       adGroupLabelServiceClient.mutateAdGroupLabels(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AdGroupLabelServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateAdGroupLabels</td>
 *      <td><p> Creates and removes ad group labels. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [DatabaseError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [LabelError]()   [MutateError]()   [NewResourceCreationError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateAdGroupLabels(MutateAdGroupLabelsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateAdGroupLabels(String customerId, List&lt;AdGroupLabelOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateAdGroupLabelsCallable()
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
 * <p>This class can be customized by passing in a custom instance of AdGroupLabelServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AdGroupLabelServiceSettings adGroupLabelServiceSettings =
 *     AdGroupLabelServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupLabelServiceClient adGroupLabelServiceClient =
 *     AdGroupLabelServiceClient.create(adGroupLabelServiceSettings);
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
 * AdGroupLabelServiceSettings adGroupLabelServiceSettings =
 *     AdGroupLabelServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupLabelServiceClient adGroupLabelServiceClient =
 *     AdGroupLabelServiceClient.create(adGroupLabelServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AdGroupLabelServiceClient implements BackgroundResource {
  private final AdGroupLabelServiceSettings settings;
  private final AdGroupLabelServiceStub stub;

  /** Constructs an instance of AdGroupLabelServiceClient with default settings. */
  public static final AdGroupLabelServiceClient create() throws IOException {
    return create(AdGroupLabelServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupLabelServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdGroupLabelServiceClient create(AdGroupLabelServiceSettings settings)
      throws IOException {
    return new AdGroupLabelServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupLabelServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AdGroupLabelServiceSettings).
   */
  public static final AdGroupLabelServiceClient create(AdGroupLabelServiceStub stub) {
    return new AdGroupLabelServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupLabelServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupLabelServiceClient(AdGroupLabelServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupLabelServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AdGroupLabelServiceClient(AdGroupLabelServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupLabelServiceSettings getSettings() {
    return settings;
  }

  public AdGroupLabelServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates and removes ad group labels. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [LabelError]() [MutateError]()
   * [NewResourceCreationError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AdGroupLabelOperation> operations = new ArrayList<>();
   *   MutateAdGroupLabelsResponse response =
   *       adGroupLabelServiceClient.mutateAdGroupLabels(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. ID of the customer whose ad group labels are being modified.
   * @param operations Required. The list of operations to perform on ad group labels.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupLabelsResponse mutateAdGroupLabels(
      String customerId, List<AdGroupLabelOperation> operations) {
    MutateAdGroupLabelsRequest request =
        MutateAdGroupLabelsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupLabels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates and removes ad group labels. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [LabelError]() [MutateError]()
   * [NewResourceCreationError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   MutateAdGroupLabelsRequest request =
   *       MutateAdGroupLabelsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupLabelOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAdGroupLabelsResponse response = adGroupLabelServiceClient.mutateAdGroupLabels(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupLabelsResponse mutateAdGroupLabels(MutateAdGroupLabelsRequest request) {
    return mutateAdGroupLabelsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates and removes ad group labels. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [LabelError]() [MutateError]()
   * [NewResourceCreationError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   MutateAdGroupLabelsRequest request =
   *       MutateAdGroupLabelsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupLabelOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAdGroupLabelsResponse> future =
   *       adGroupLabelServiceClient.mutateAdGroupLabelsCallable().futureCall(request);
   *   // Do something.
   *   MutateAdGroupLabelsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateAdGroupLabelsRequest, MutateAdGroupLabelsResponse>
      mutateAdGroupLabelsCallable() {
    return stub.mutateAdGroupLabelsCallable();
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
