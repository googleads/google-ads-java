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

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.resources.AdGroupAsset;
import com.google.ads.googleads.v7.resources.AdGroupAssetName;
import com.google.ads.googleads.v7.services.stub.AdGroupAssetServiceStub;
import com.google.ads.googleads.v7.services.stub.AdGroupAssetServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage ad group assets.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (AdGroupAssetServiceClient adGroupAssetServiceClient = AdGroupAssetServiceClient.create()) {
 *   AdGroupAssetName resourceName =
 *       AdGroupAssetName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
 *   AdGroupAsset response = adGroupAssetServiceClient.getAdGroupAsset(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AdGroupAssetServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of AdGroupAssetServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * AdGroupAssetServiceSettings adGroupAssetServiceSettings =
 *     AdGroupAssetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupAssetServiceClient adGroupAssetServiceClient =
 *     AdGroupAssetServiceClient.create(adGroupAssetServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * AdGroupAssetServiceSettings adGroupAssetServiceSettings =
 *     AdGroupAssetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupAssetServiceClient adGroupAssetServiceClient =
 *     AdGroupAssetServiceClient.create(adGroupAssetServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AdGroupAssetServiceClient implements BackgroundResource {
  private final AdGroupAssetServiceSettings settings;
  private final AdGroupAssetServiceStub stub;

  /** Constructs an instance of AdGroupAssetServiceClient with default settings. */
  public static final AdGroupAssetServiceClient create() throws IOException {
    return create(AdGroupAssetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupAssetServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdGroupAssetServiceClient create(AdGroupAssetServiceSettings settings)
      throws IOException {
    return new AdGroupAssetServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupAssetServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AdGroupAssetServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupAssetServiceClient create(AdGroupAssetServiceStub stub) {
    return new AdGroupAssetServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupAssetServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupAssetServiceClient(AdGroupAssetServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupAssetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupAssetServiceClient(AdGroupAssetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupAssetServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupAssetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group asset in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAssetServiceClient adGroupAssetServiceClient = AdGroupAssetServiceClient.create()) {
   *   AdGroupAssetName resourceName =
   *       AdGroupAssetName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
   *   AdGroupAsset response = adGroupAssetServiceClient.getAdGroupAsset(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the ad group asset to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAsset getAdGroupAsset(AdGroupAssetName resourceName) {
    GetAdGroupAssetRequest request =
        GetAdGroupAssetRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAdGroupAsset(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group asset in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAssetServiceClient adGroupAssetServiceClient = AdGroupAssetServiceClient.create()) {
   *   String resourceName =
   *       AdGroupAssetName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
   *           .toString();
   *   AdGroupAsset response = adGroupAssetServiceClient.getAdGroupAsset(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the ad group asset to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAsset getAdGroupAsset(String resourceName) {
    GetAdGroupAssetRequest request =
        GetAdGroupAssetRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupAsset(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group asset in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAssetServiceClient adGroupAssetServiceClient = AdGroupAssetServiceClient.create()) {
   *   GetAdGroupAssetRequest request =
   *       GetAdGroupAssetRequest.newBuilder()
   *           .setResourceName(
   *               AdGroupAssetName.of(
   *                       "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
   *                   .toString())
   *           .build();
   *   AdGroupAsset response = adGroupAssetServiceClient.getAdGroupAsset(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAsset getAdGroupAsset(GetAdGroupAssetRequest request) {
    return getAdGroupAssetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group asset in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAssetServiceClient adGroupAssetServiceClient = AdGroupAssetServiceClient.create()) {
   *   GetAdGroupAssetRequest request =
   *       GetAdGroupAssetRequest.newBuilder()
   *           .setResourceName(
   *               AdGroupAssetName.of(
   *                       "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<AdGroupAsset> future =
   *       adGroupAssetServiceClient.getAdGroupAssetCallable().futureCall(request);
   *   // Do something.
   *   AdGroupAsset response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAdGroupAssetRequest, AdGroupAsset> getAdGroupAssetCallable() {
    return stub.getAdGroupAssetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ad group assets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AssetLinkError]() [AuthenticationError]() [AuthorizationError]()
   * [ContextError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
   * [NotAllowlistedError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAssetServiceClient adGroupAssetServiceClient = AdGroupAssetServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AdGroupAssetOperation> operations = new ArrayList<>();
   *   MutateAdGroupAssetsResponse response =
   *       adGroupAssetServiceClient.mutateAdGroupAssets(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose ad group assets are being modified.
   * @param operations Required. The list of operations to perform on individual ad group assets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupAssetsResponse mutateAdGroupAssets(
      String customerId, List<AdGroupAssetOperation> operations) {
    MutateAdGroupAssetsRequest request =
        MutateAdGroupAssetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ad group assets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AssetLinkError]() [AuthenticationError]() [AuthorizationError]()
   * [ContextError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
   * [NotAllowlistedError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAssetServiceClient adGroupAssetServiceClient = AdGroupAssetServiceClient.create()) {
   *   MutateAdGroupAssetsRequest request =
   *       MutateAdGroupAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupAssetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAdGroupAssetsResponse response = adGroupAssetServiceClient.mutateAdGroupAssets(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupAssetsResponse mutateAdGroupAssets(MutateAdGroupAssetsRequest request) {
    return mutateAdGroupAssetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ad group assets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AssetLinkError]() [AuthenticationError]() [AuthorizationError]()
   * [ContextError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
   * [NotAllowlistedError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AdGroupAssetServiceClient adGroupAssetServiceClient = AdGroupAssetServiceClient.create()) {
   *   MutateAdGroupAssetsRequest request =
   *       MutateAdGroupAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupAssetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAdGroupAssetsResponse> future =
   *       adGroupAssetServiceClient.mutateAdGroupAssetsCallable().futureCall(request);
   *   // Do something.
   *   MutateAdGroupAssetsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateAdGroupAssetsRequest, MutateAdGroupAssetsResponse>
      mutateAdGroupAssetsCallable() {
    return stub.mutateAdGroupAssetsCallable();
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
