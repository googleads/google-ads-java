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

import com.google.ads.googleads.v8.resources.AdGroupAdLabel;
import com.google.ads.googleads.v8.resources.AdGroupAdLabelName;
import com.google.ads.googleads.v8.services.stub.AdGroupAdLabelServiceStub;
import com.google.ads.googleads.v8.services.stub.AdGroupAdLabelServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage labels on ad group ads.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
 *     AdGroupAdLabelServiceClient.create()) {
 *   AdGroupAdLabelName resourceName =
 *       AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]");
 *   AdGroupAdLabel response = adGroupAdLabelServiceClient.getAdGroupAdLabel(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AdGroupAdLabelServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of AdGroupAdLabelServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * AdGroupAdLabelServiceSettings adGroupAdLabelServiceSettings =
 *     AdGroupAdLabelServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
 *     AdGroupAdLabelServiceClient.create(adGroupAdLabelServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * AdGroupAdLabelServiceSettings adGroupAdLabelServiceSettings =
 *     AdGroupAdLabelServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
 *     AdGroupAdLabelServiceClient.create(adGroupAdLabelServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AdGroupAdLabelServiceClient implements BackgroundResource {
  private final AdGroupAdLabelServiceSettings settings;
  private final AdGroupAdLabelServiceStub stub;

  /** Constructs an instance of AdGroupAdLabelServiceClient with default settings. */
  public static final AdGroupAdLabelServiceClient create() throws IOException {
    return create(AdGroupAdLabelServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupAdLabelServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdGroupAdLabelServiceClient create(AdGroupAdLabelServiceSettings settings)
      throws IOException {
    return new AdGroupAdLabelServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupAdLabelServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AdGroupAdLabelServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupAdLabelServiceClient create(AdGroupAdLabelServiceStub stub) {
    return new AdGroupAdLabelServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupAdLabelServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupAdLabelServiceClient(AdGroupAdLabelServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupAdLabelServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupAdLabelServiceClient(AdGroupAdLabelServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupAdLabelServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupAdLabelServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group ad label in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
   *     AdGroupAdLabelServiceClient.create()) {
   *   AdGroupAdLabelName resourceName =
   *       AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]");
   *   AdGroupAdLabel response = adGroupAdLabelServiceClient.getAdGroupAdLabel(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the ad group ad label to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAdLabel getAdGroupAdLabel(AdGroupAdLabelName resourceName) {
    GetAdGroupAdLabelRequest request =
        GetAdGroupAdLabelRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAdGroupAdLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group ad label in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
   *     AdGroupAdLabelServiceClient.create()) {
   *   String resourceName =
   *       AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]")
   *           .toString();
   *   AdGroupAdLabel response = adGroupAdLabelServiceClient.getAdGroupAdLabel(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the ad group ad label to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAdLabel getAdGroupAdLabel(String resourceName) {
    GetAdGroupAdLabelRequest request =
        GetAdGroupAdLabelRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupAdLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group ad label in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
   *     AdGroupAdLabelServiceClient.create()) {
   *   GetAdGroupAdLabelRequest request =
   *       GetAdGroupAdLabelRequest.newBuilder()
   *           .setResourceName(
   *               AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]")
   *                   .toString())
   *           .build();
   *   AdGroupAdLabel response = adGroupAdLabelServiceClient.getAdGroupAdLabel(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAdLabel getAdGroupAdLabel(GetAdGroupAdLabelRequest request) {
    return getAdGroupAdLabelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group ad label in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
   *     AdGroupAdLabelServiceClient.create()) {
   *   GetAdGroupAdLabelRequest request =
   *       GetAdGroupAdLabelRequest.newBuilder()
   *           .setResourceName(
   *               AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<AdGroupAdLabel> future =
   *       adGroupAdLabelServiceClient.getAdGroupAdLabelCallable().futureCall(request);
   *   // Do something.
   *   AdGroupAdLabel response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAdGroupAdLabelRequest, AdGroupAdLabel> getAdGroupAdLabelCallable() {
    return stub.getAdGroupAdLabelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates and removes ad group ad labels. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [HeaderError]() [InternalError]() [LabelError]() [MutateError]() [NewResourceCreationError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
   *     AdGroupAdLabelServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AdGroupAdLabelOperation> operations = new ArrayList<>();
   *   MutateAdGroupAdLabelsResponse response =
   *       adGroupAdLabelServiceClient.mutateAdGroupAdLabels(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. ID of the customer whose ad group ad labels are being modified.
   * @param operations Required. The list of operations to perform on ad group ad labels.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupAdLabelsResponse mutateAdGroupAdLabels(
      String customerId, List<AdGroupAdLabelOperation> operations) {
    MutateAdGroupAdLabelsRequest request =
        MutateAdGroupAdLabelsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupAdLabels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates and removes ad group ad labels. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [HeaderError]() [InternalError]() [LabelError]() [MutateError]() [NewResourceCreationError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
   *     AdGroupAdLabelServiceClient.create()) {
   *   MutateAdGroupAdLabelsRequest request =
   *       MutateAdGroupAdLabelsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupAdLabelOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAdGroupAdLabelsResponse response =
   *       adGroupAdLabelServiceClient.mutateAdGroupAdLabels(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupAdLabelsResponse mutateAdGroupAdLabels(
      MutateAdGroupAdLabelsRequest request) {
    return mutateAdGroupAdLabelsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates and removes ad group ad labels. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [HeaderError]() [InternalError]() [LabelError]() [MutateError]() [NewResourceCreationError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
   *     AdGroupAdLabelServiceClient.create()) {
   *   MutateAdGroupAdLabelsRequest request =
   *       MutateAdGroupAdLabelsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupAdLabelOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAdGroupAdLabelsResponse> future =
   *       adGroupAdLabelServiceClient.mutateAdGroupAdLabelsCallable().futureCall(request);
   *   // Do something.
   *   MutateAdGroupAdLabelsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateAdGroupAdLabelsRequest, MutateAdGroupAdLabelsResponse>
      mutateAdGroupAdLabelsCallable() {
    return stub.mutateAdGroupAdLabelsCallable();
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
