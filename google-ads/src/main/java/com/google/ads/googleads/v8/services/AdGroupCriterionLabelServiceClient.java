/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.resources.AdGroupCriterionLabel;
import com.google.ads.googleads.v8.resources.AdGroupCriterionLabelName;
import com.google.ads.googleads.v8.services.stub.AdGroupCriterionLabelServiceStub;
import com.google.ads.googleads.v8.services.stub.AdGroupCriterionLabelServiceStubSettings;
import com.google.api.core.BetaApi;
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
 * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
 *     AdGroupCriterionLabelServiceClient.create()) {
 *   AdGroupCriterionLabelName resourceName =
 *       AdGroupCriterionLabelName.of(
 *           "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]");
 *   AdGroupCriterionLabel response =
 *       adGroupCriterionLabelServiceClient.getAdGroupCriterionLabel(resourceName);
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
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
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
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupCriterionLabelServiceClient(AdGroupCriterionLabelServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupCriterionLabelServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupCriterionLabelServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group criterion label in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
   *     AdGroupCriterionLabelServiceClient.create()) {
   *   AdGroupCriterionLabelName resourceName =
   *       AdGroupCriterionLabelName.of(
   *           "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]");
   *   AdGroupCriterionLabel response =
   *       adGroupCriterionLabelServiceClient.getAdGroupCriterionLabel(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the ad group criterion label to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupCriterionLabel getAdGroupCriterionLabel(
      AdGroupCriterionLabelName resourceName) {
    GetAdGroupCriterionLabelRequest request =
        GetAdGroupCriterionLabelRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAdGroupCriterionLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group criterion label in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
   *     AdGroupCriterionLabelServiceClient.create()) {
   *   String resourceName =
   *       AdGroupCriterionLabelName.of(
   *               "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]")
   *           .toString();
   *   AdGroupCriterionLabel response =
   *       adGroupCriterionLabelServiceClient.getAdGroupCriterionLabel(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the ad group criterion label to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupCriterionLabel getAdGroupCriterionLabel(String resourceName) {
    GetAdGroupCriterionLabelRequest request =
        GetAdGroupCriterionLabelRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupCriterionLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group criterion label in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
   *     AdGroupCriterionLabelServiceClient.create()) {
   *   GetAdGroupCriterionLabelRequest request =
   *       GetAdGroupCriterionLabelRequest.newBuilder()
   *           .setResourceName(
   *               AdGroupCriterionLabelName.of(
   *                       "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]")
   *                   .toString())
   *           .build();
   *   AdGroupCriterionLabel response =
   *       adGroupCriterionLabelServiceClient.getAdGroupCriterionLabel(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupCriterionLabel getAdGroupCriterionLabel(
      GetAdGroupCriterionLabelRequest request) {
    return getAdGroupCriterionLabelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group criterion label in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
   *     AdGroupCriterionLabelServiceClient.create()) {
   *   GetAdGroupCriterionLabelRequest request =
   *       GetAdGroupCriterionLabelRequest.newBuilder()
   *           .setResourceName(
   *               AdGroupCriterionLabelName.of(
   *                       "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<AdGroupCriterionLabel> future =
   *       adGroupCriterionLabelServiceClient.getAdGroupCriterionLabelCallable().futureCall(request);
   *   // Do something.
   *   AdGroupCriterionLabel response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
      getAdGroupCriterionLabelCallable() {
    return stub.getAdGroupCriterionLabelCallable();
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
