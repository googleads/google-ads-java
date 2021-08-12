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

import com.google.ads.googleads.v8.resources.BiddingSeasonalityAdjustment;
import com.google.ads.googleads.v8.resources.BiddingSeasonalityAdjustmentName;
import com.google.ads.googleads.v8.services.stub.BiddingSeasonalityAdjustmentServiceStub;
import com.google.ads.googleads.v8.services.stub.BiddingSeasonalityAdjustmentServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage bidding seasonality adjustments.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
 *     BiddingSeasonalityAdjustmentServiceClient.create()) {
 *   BiddingSeasonalityAdjustmentName resourceName =
 *       BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]");
 *   BiddingSeasonalityAdjustment response =
 *       biddingSeasonalityAdjustmentServiceClient.getBiddingSeasonalityAdjustment(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the BiddingSeasonalityAdjustmentServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
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
 * BiddingSeasonalityAdjustmentServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * BiddingSeasonalityAdjustmentServiceSettings biddingSeasonalityAdjustmentServiceSettings =
 *     BiddingSeasonalityAdjustmentServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
 *     BiddingSeasonalityAdjustmentServiceClient.create(
 *         biddingSeasonalityAdjustmentServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * BiddingSeasonalityAdjustmentServiceSettings biddingSeasonalityAdjustmentServiceSettings =
 *     BiddingSeasonalityAdjustmentServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
 *     BiddingSeasonalityAdjustmentServiceClient.create(
 *         biddingSeasonalityAdjustmentServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class BiddingSeasonalityAdjustmentServiceClient implements BackgroundResource {
  private final BiddingSeasonalityAdjustmentServiceSettings settings;
  private final BiddingSeasonalityAdjustmentServiceStub stub;

  /** Constructs an instance of BiddingSeasonalityAdjustmentServiceClient with default settings. */
  public static final BiddingSeasonalityAdjustmentServiceClient create() throws IOException {
    return create(BiddingSeasonalityAdjustmentServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BiddingSeasonalityAdjustmentServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final BiddingSeasonalityAdjustmentServiceClient create(
      BiddingSeasonalityAdjustmentServiceSettings settings) throws IOException {
    return new BiddingSeasonalityAdjustmentServiceClient(settings);
  }

  /**
   * Constructs an instance of BiddingSeasonalityAdjustmentServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(BiddingSeasonalityAdjustmentServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final BiddingSeasonalityAdjustmentServiceClient create(
      BiddingSeasonalityAdjustmentServiceStub stub) {
    return new BiddingSeasonalityAdjustmentServiceClient(stub);
  }

  /**
   * Constructs an instance of BiddingSeasonalityAdjustmentServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected BiddingSeasonalityAdjustmentServiceClient(
      BiddingSeasonalityAdjustmentServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((BiddingSeasonalityAdjustmentServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected BiddingSeasonalityAdjustmentServiceClient(
      BiddingSeasonalityAdjustmentServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BiddingSeasonalityAdjustmentServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BiddingSeasonalityAdjustmentServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested seasonality adjustment in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
   *     BiddingSeasonalityAdjustmentServiceClient.create()) {
   *   BiddingSeasonalityAdjustmentName resourceName =
   *       BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]");
   *   BiddingSeasonalityAdjustment response =
   *       biddingSeasonalityAdjustmentServiceClient.getBiddingSeasonalityAdjustment(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the seasonality adjustment to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BiddingSeasonalityAdjustment getBiddingSeasonalityAdjustment(
      BiddingSeasonalityAdjustmentName resourceName) {
    GetBiddingSeasonalityAdjustmentRequest request =
        GetBiddingSeasonalityAdjustmentRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getBiddingSeasonalityAdjustment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested seasonality adjustment in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
   *     BiddingSeasonalityAdjustmentServiceClient.create()) {
   *   String resourceName =
   *       BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]").toString();
   *   BiddingSeasonalityAdjustment response =
   *       biddingSeasonalityAdjustmentServiceClient.getBiddingSeasonalityAdjustment(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the seasonality adjustment to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BiddingSeasonalityAdjustment getBiddingSeasonalityAdjustment(String resourceName) {
    GetBiddingSeasonalityAdjustmentRequest request =
        GetBiddingSeasonalityAdjustmentRequest.newBuilder().setResourceName(resourceName).build();
    return getBiddingSeasonalityAdjustment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested seasonality adjustment in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
   *     BiddingSeasonalityAdjustmentServiceClient.create()) {
   *   GetBiddingSeasonalityAdjustmentRequest request =
   *       GetBiddingSeasonalityAdjustmentRequest.newBuilder()
   *           .setResourceName(
   *               BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]")
   *                   .toString())
   *           .build();
   *   BiddingSeasonalityAdjustment response =
   *       biddingSeasonalityAdjustmentServiceClient.getBiddingSeasonalityAdjustment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BiddingSeasonalityAdjustment getBiddingSeasonalityAdjustment(
      GetBiddingSeasonalityAdjustmentRequest request) {
    return getBiddingSeasonalityAdjustmentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested seasonality adjustment in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
   *     BiddingSeasonalityAdjustmentServiceClient.create()) {
   *   GetBiddingSeasonalityAdjustmentRequest request =
   *       GetBiddingSeasonalityAdjustmentRequest.newBuilder()
   *           .setResourceName(
   *               BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<BiddingSeasonalityAdjustment> future =
   *       biddingSeasonalityAdjustmentServiceClient
   *           .getBiddingSeasonalityAdjustmentCallable()
   *           .futureCall(request);
   *   // Do something.
   *   BiddingSeasonalityAdjustment response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetBiddingSeasonalityAdjustmentRequest, BiddingSeasonalityAdjustment>
      getBiddingSeasonalityAdjustmentCallable() {
    return stub.getBiddingSeasonalityAdjustmentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes seasonality adjustments. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
   *     BiddingSeasonalityAdjustmentServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<BiddingSeasonalityAdjustmentOperation> operations = new ArrayList<>();
   *   MutateBiddingSeasonalityAdjustmentsResponse response =
   *       biddingSeasonalityAdjustmentServiceClient.mutateBiddingSeasonalityAdjustments(
   *           customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. ID of the customer whose seasonality adjustments are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual seasonality
   *     adjustments.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBiddingSeasonalityAdjustmentsResponse mutateBiddingSeasonalityAdjustments(
      String customerId, List<BiddingSeasonalityAdjustmentOperation> operations) {
    MutateBiddingSeasonalityAdjustmentsRequest request =
        MutateBiddingSeasonalityAdjustmentsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateBiddingSeasonalityAdjustments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes seasonality adjustments. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
   *     BiddingSeasonalityAdjustmentServiceClient.create()) {
   *   MutateBiddingSeasonalityAdjustmentsRequest request =
   *       MutateBiddingSeasonalityAdjustmentsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<BiddingSeasonalityAdjustmentOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateBiddingSeasonalityAdjustmentsResponse response =
   *       biddingSeasonalityAdjustmentServiceClient.mutateBiddingSeasonalityAdjustments(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBiddingSeasonalityAdjustmentsResponse mutateBiddingSeasonalityAdjustments(
      MutateBiddingSeasonalityAdjustmentsRequest request) {
    return mutateBiddingSeasonalityAdjustmentsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes seasonality adjustments. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
   *     BiddingSeasonalityAdjustmentServiceClient.create()) {
   *   MutateBiddingSeasonalityAdjustmentsRequest request =
   *       MutateBiddingSeasonalityAdjustmentsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<BiddingSeasonalityAdjustmentOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateBiddingSeasonalityAdjustmentsResponse> future =
   *       biddingSeasonalityAdjustmentServiceClient
   *           .mutateBiddingSeasonalityAdjustmentsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateBiddingSeasonalityAdjustmentsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateBiddingSeasonalityAdjustmentsRequest, MutateBiddingSeasonalityAdjustmentsResponse>
      mutateBiddingSeasonalityAdjustmentsCallable() {
    return stub.mutateBiddingSeasonalityAdjustmentsCallable();
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
