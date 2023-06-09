/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v14.services;

import com.google.ads.googleads.v14.services.stub.AdGroupCriterionLabelServiceStub;
import com.google.ads.googleads.v14.services.stub.AdGroupCriterionLabelServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage labels on ad group criteria.
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
 * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
 *     AdGroupCriterionLabelServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupCriterionLabelOperation> operations = new ArrayList<>();
 *   MutateAdGroupCriterionLabelsResponse response =
 *       adGroupCriterionLabelServiceClient.mutateAdGroupCriterionLabels(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AdGroupCriterionLabelServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
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
 * <p>This class can be customized by passing in a custom instance of
 * AdGroupCriterionLabelServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AdGroupCriterionLabelServiceSettings adGroupCriterionLabelServiceSettings =
 *     AdGroupCriterionLabelServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
 *     AdGroupCriterionLabelServiceClient.create(adGroupCriterionLabelServiceSettings);
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
 * AdGroupCriterionLabelServiceSettings adGroupCriterionLabelServiceSettings =
 *     AdGroupCriterionLabelServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
 *     AdGroupCriterionLabelServiceClient.create(adGroupCriterionLabelServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AdGroupCriterionLabelServiceClient implements BackgroundResource {
  private final AdGroupCriterionLabelServiceSettings settings;
  private final AdGroupCriterionLabelServiceStub stub;

  /** Constructs an instance of AdGroupCriterionLabelServiceClient with default settings. */
  public static final AdGroupCriterionLabelServiceClient create() throws IOException {
    return create(AdGroupCriterionLabelServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupCriterionLabelServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final AdGroupCriterionLabelServiceClient create(
      AdGroupCriterionLabelServiceSettings settings) throws IOException {
    return new AdGroupCriterionLabelServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupCriterionLabelServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(AdGroupCriterionLabelServiceSettings).
   */
  public static final AdGroupCriterionLabelServiceClient create(
      AdGroupCriterionLabelServiceStub stub) {
    return new AdGroupCriterionLabelServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupCriterionLabelServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupCriterionLabelServiceClient(AdGroupCriterionLabelServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((AdGroupCriterionLabelServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AdGroupCriterionLabelServiceClient(AdGroupCriterionLabelServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupCriterionLabelServiceSettings getSettings() {
    return settings;
  }

  public AdGroupCriterionLabelServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates and removes ad group criterion labels. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
   *     AdGroupCriterionLabelServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AdGroupCriterionLabelOperation> operations = new ArrayList<>();
   *   MutateAdGroupCriterionLabelsResponse response =
   *       adGroupCriterionLabelServiceClient.mutateAdGroupCriterionLabels(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. ID of the customer whose ad group criterion labels are being
   *     modified.
   * @param operations Required. The list of operations to perform on ad group criterion labels.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupCriterionLabelsResponse mutateAdGroupCriterionLabels(
      String customerId, List<AdGroupCriterionLabelOperation> operations) {
    MutateAdGroupCriterionLabelsRequest request =
        MutateAdGroupCriterionLabelsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupCriterionLabels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates and removes ad group criterion labels. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
   *     AdGroupCriterionLabelServiceClient.create()) {
   *   MutateAdGroupCriterionLabelsRequest request =
   *       MutateAdGroupCriterionLabelsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupCriterionLabelOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAdGroupCriterionLabelsResponse response =
   *       adGroupCriterionLabelServiceClient.mutateAdGroupCriterionLabels(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupCriterionLabelsResponse mutateAdGroupCriterionLabels(
      MutateAdGroupCriterionLabelsRequest request) {
    return mutateAdGroupCriterionLabelsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates and removes ad group criterion labels. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
   *     AdGroupCriterionLabelServiceClient.create()) {
   *   MutateAdGroupCriterionLabelsRequest request =
   *       MutateAdGroupCriterionLabelsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupCriterionLabelOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAdGroupCriterionLabelsResponse> future =
   *       adGroupCriterionLabelServiceClient
   *           .mutateAdGroupCriterionLabelsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateAdGroupCriterionLabelsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
      mutateAdGroupCriterionLabelsCallable() {
    return stub.mutateAdGroupCriterionLabelsCallable();
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
