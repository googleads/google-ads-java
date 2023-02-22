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

package com.google.ads.googleads.v13.services;

import com.google.ads.googleads.v13.services.stub.AssetGroupAssetServiceStub;
import com.google.ads.googleads.v13.services.stub.AssetGroupAssetServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage asset group asset.
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
 * try (AssetGroupAssetServiceClient assetGroupAssetServiceClient =
 *     AssetGroupAssetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AssetGroupAssetOperation> operations = new ArrayList<>();
 *   MutateAssetGroupAssetsResponse response =
 *       assetGroupAssetServiceClient.mutateAssetGroupAssets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AssetGroupAssetServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of AssetGroupAssetServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AssetGroupAssetServiceSettings assetGroupAssetServiceSettings =
 *     AssetGroupAssetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AssetGroupAssetServiceClient assetGroupAssetServiceClient =
 *     AssetGroupAssetServiceClient.create(assetGroupAssetServiceSettings);
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
 * AssetGroupAssetServiceSettings assetGroupAssetServiceSettings =
 *     AssetGroupAssetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AssetGroupAssetServiceClient assetGroupAssetServiceClient =
 *     AssetGroupAssetServiceClient.create(assetGroupAssetServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AssetGroupAssetServiceClient implements BackgroundResource {
  private final AssetGroupAssetServiceSettings settings;
  private final AssetGroupAssetServiceStub stub;

  /** Constructs an instance of AssetGroupAssetServiceClient with default settings. */
  public static final AssetGroupAssetServiceClient create() throws IOException {
    return create(AssetGroupAssetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AssetGroupAssetServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AssetGroupAssetServiceClient create(AssetGroupAssetServiceSettings settings)
      throws IOException {
    return new AssetGroupAssetServiceClient(settings);
  }

  /**
   * Constructs an instance of AssetGroupAssetServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AssetGroupAssetServiceSettings).
   */
  public static final AssetGroupAssetServiceClient create(AssetGroupAssetServiceStub stub) {
    return new AssetGroupAssetServiceClient(stub);
  }

  /**
   * Constructs an instance of AssetGroupAssetServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AssetGroupAssetServiceClient(AssetGroupAssetServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((AssetGroupAssetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AssetGroupAssetServiceClient(AssetGroupAssetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AssetGroupAssetServiceSettings getSettings() {
    return settings;
  }

  public AssetGroupAssetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes asset group assets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetGroupAssetServiceClient assetGroupAssetServiceClient =
   *     AssetGroupAssetServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AssetGroupAssetOperation> operations = new ArrayList<>();
   *   MutateAssetGroupAssetsResponse response =
   *       assetGroupAssetServiceClient.mutateAssetGroupAssets(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose asset group assets are being modified.
   * @param operations Required. The list of operations to perform on individual asset group assets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAssetGroupAssetsResponse mutateAssetGroupAssets(
      String customerId, List<AssetGroupAssetOperation> operations) {
    MutateAssetGroupAssetsRequest request =
        MutateAssetGroupAssetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAssetGroupAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes asset group assets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetGroupAssetServiceClient assetGroupAssetServiceClient =
   *     AssetGroupAssetServiceClient.create()) {
   *   MutateAssetGroupAssetsRequest request =
   *       MutateAssetGroupAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AssetGroupAssetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAssetGroupAssetsResponse response =
   *       assetGroupAssetServiceClient.mutateAssetGroupAssets(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAssetGroupAssetsResponse mutateAssetGroupAssets(
      MutateAssetGroupAssetsRequest request) {
    return mutateAssetGroupAssetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes asset group assets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetGroupAssetServiceClient assetGroupAssetServiceClient =
   *     AssetGroupAssetServiceClient.create()) {
   *   MutateAssetGroupAssetsRequest request =
   *       MutateAssetGroupAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AssetGroupAssetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAssetGroupAssetsResponse> future =
   *       assetGroupAssetServiceClient.mutateAssetGroupAssetsCallable().futureCall(request);
   *   // Do something.
   *   MutateAssetGroupAssetsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateAssetGroupAssetsRequest, MutateAssetGroupAssetsResponse>
      mutateAssetGroupAssetsCallable() {
    return stub.mutateAssetGroupAssetsCallable();
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
