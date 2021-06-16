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

import com.google.ads.googleads.v8.resources.CustomerAsset;
import com.google.ads.googleads.v8.resources.CustomerAssetName;
import com.google.ads.googleads.v8.services.stub.CustomerAssetServiceStub;
import com.google.ads.googleads.v8.services.stub.CustomerAssetServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage customer assets.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (CustomerAssetServiceClient customerAssetServiceClient =
 *     CustomerAssetServiceClient.create()) {
 *   CustomerAssetName resourceName =
 *       CustomerAssetName.of("[CUSTOMER_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
 *   CustomerAsset response = customerAssetServiceClient.getCustomerAsset(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CustomerAssetServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of CustomerAssetServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CustomerAssetServiceSettings customerAssetServiceSettings =
 *     CustomerAssetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerAssetServiceClient customerAssetServiceClient =
 *     CustomerAssetServiceClient.create(customerAssetServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CustomerAssetServiceSettings customerAssetServiceSettings =
 *     CustomerAssetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerAssetServiceClient customerAssetServiceClient =
 *     CustomerAssetServiceClient.create(customerAssetServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CustomerAssetServiceClient implements BackgroundResource {
  private final CustomerAssetServiceSettings settings;
  private final CustomerAssetServiceStub stub;

  /** Constructs an instance of CustomerAssetServiceClient with default settings. */
  public static final CustomerAssetServiceClient create() throws IOException {
    return create(CustomerAssetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerAssetServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CustomerAssetServiceClient create(CustomerAssetServiceSettings settings)
      throws IOException {
    return new CustomerAssetServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerAssetServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(CustomerAssetServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomerAssetServiceClient create(CustomerAssetServiceStub stub) {
    return new CustomerAssetServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerAssetServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomerAssetServiceClient(CustomerAssetServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CustomerAssetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomerAssetServiceClient(CustomerAssetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomerAssetServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomerAssetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer asset in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerAssetServiceClient customerAssetServiceClient =
   *     CustomerAssetServiceClient.create()) {
   *   CustomerAssetName resourceName =
   *       CustomerAssetName.of("[CUSTOMER_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
   *   CustomerAsset response = customerAssetServiceClient.getCustomerAsset(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the customer asset to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerAsset getCustomerAsset(CustomerAssetName resourceName) {
    GetCustomerAssetRequest request =
        GetCustomerAssetRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomerAsset(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer asset in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerAssetServiceClient customerAssetServiceClient =
   *     CustomerAssetServiceClient.create()) {
   *   String resourceName =
   *       CustomerAssetName.of("[CUSTOMER_ID]", "[ASSET_ID]", "[FIELD_TYPE]").toString();
   *   CustomerAsset response = customerAssetServiceClient.getCustomerAsset(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the customer asset to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerAsset getCustomerAsset(String resourceName) {
    GetCustomerAssetRequest request =
        GetCustomerAssetRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomerAsset(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer asset in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerAssetServiceClient customerAssetServiceClient =
   *     CustomerAssetServiceClient.create()) {
   *   GetCustomerAssetRequest request =
   *       GetCustomerAssetRequest.newBuilder()
   *           .setResourceName(
   *               CustomerAssetName.of("[CUSTOMER_ID]", "[ASSET_ID]", "[FIELD_TYPE]").toString())
   *           .build();
   *   CustomerAsset response = customerAssetServiceClient.getCustomerAsset(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomerAsset getCustomerAsset(GetCustomerAssetRequest request) {
    return getCustomerAssetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested customer asset in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerAssetServiceClient customerAssetServiceClient =
   *     CustomerAssetServiceClient.create()) {
   *   GetCustomerAssetRequest request =
   *       GetCustomerAssetRequest.newBuilder()
   *           .setResourceName(
   *               CustomerAssetName.of("[CUSTOMER_ID]", "[ASSET_ID]", "[FIELD_TYPE]").toString())
   *           .build();
   *   ApiFuture<CustomerAsset> future =
   *       customerAssetServiceClient.getCustomerAssetCallable().futureCall(request);
   *   // Do something.
   *   CustomerAsset response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetCustomerAssetRequest, CustomerAsset> getCustomerAssetCallable() {
    return stub.getCustomerAssetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes customer assets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AssetLinkError]() [AuthenticationError]() [AuthorizationError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerAssetServiceClient customerAssetServiceClient =
   *     CustomerAssetServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CustomerAssetOperation> operations = new ArrayList<>();
   *   MutateCustomerAssetsResponse response =
   *       customerAssetServiceClient.mutateCustomerAssets(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose customer assets are being modified.
   * @param operations Required. The list of operations to perform on individual customer assets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerAssetsResponse mutateCustomerAssets(
      String customerId, List<CustomerAssetOperation> operations) {
    MutateCustomerAssetsRequest request =
        MutateCustomerAssetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCustomerAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes customer assets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AssetLinkError]() [AuthenticationError]() [AuthorizationError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerAssetServiceClient customerAssetServiceClient =
   *     CustomerAssetServiceClient.create()) {
   *   MutateCustomerAssetsRequest request =
   *       MutateCustomerAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CustomerAssetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCustomerAssetsResponse response =
   *       customerAssetServiceClient.mutateCustomerAssets(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerAssetsResponse mutateCustomerAssets(
      MutateCustomerAssetsRequest request) {
    return mutateCustomerAssetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes customer assets. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AssetLinkError]() [AuthenticationError]() [AuthorizationError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CustomerAssetServiceClient customerAssetServiceClient =
   *     CustomerAssetServiceClient.create()) {
   *   MutateCustomerAssetsRequest request =
   *       MutateCustomerAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CustomerAssetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCustomerAssetsResponse> future =
   *       customerAssetServiceClient.mutateCustomerAssetsCallable().futureCall(request);
   *   // Do something.
   *   MutateCustomerAssetsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateCustomerAssetsRequest, MutateCustomerAssetsResponse>
      mutateCustomerAssetsCallable() {
    return stub.mutateCustomerAssetsCallable();
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
