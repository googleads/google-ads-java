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

package com.google.ads.googleads.v9.services;

import com.google.ads.googleads.v9.resources.AssetFieldTypeView;
import com.google.ads.googleads.v9.resources.AssetFieldTypeViewName;
import com.google.ads.googleads.v9.services.stub.AssetFieldTypeViewServiceStub;
import com.google.ads.googleads.v9.services.stub.AssetFieldTypeViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch asset field type views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (AssetFieldTypeViewServiceClient assetFieldTypeViewServiceClient =
 *     AssetFieldTypeViewServiceClient.create()) {
 *   AssetFieldTypeViewName resourceName =
 *       AssetFieldTypeViewName.of("[CUSTOMER_ID]", "[FIELD_TYPE]");
 *   AssetFieldTypeView response =
 *       assetFieldTypeViewServiceClient.getAssetFieldTypeView(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AssetFieldTypeViewServiceClient object to clean up
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
 * AssetFieldTypeViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * AssetFieldTypeViewServiceSettings assetFieldTypeViewServiceSettings =
 *     AssetFieldTypeViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AssetFieldTypeViewServiceClient assetFieldTypeViewServiceClient =
 *     AssetFieldTypeViewServiceClient.create(assetFieldTypeViewServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * AssetFieldTypeViewServiceSettings assetFieldTypeViewServiceSettings =
 *     AssetFieldTypeViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AssetFieldTypeViewServiceClient assetFieldTypeViewServiceClient =
 *     AssetFieldTypeViewServiceClient.create(assetFieldTypeViewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AssetFieldTypeViewServiceClient implements BackgroundResource {
  private final AssetFieldTypeViewServiceSettings settings;
  private final AssetFieldTypeViewServiceStub stub;

  /** Constructs an instance of AssetFieldTypeViewServiceClient with default settings. */
  public static final AssetFieldTypeViewServiceClient create() throws IOException {
    return create(AssetFieldTypeViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AssetFieldTypeViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final AssetFieldTypeViewServiceClient create(
      AssetFieldTypeViewServiceSettings settings) throws IOException {
    return new AssetFieldTypeViewServiceClient(settings);
  }

  /**
   * Constructs an instance of AssetFieldTypeViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(AssetFieldTypeViewServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AssetFieldTypeViewServiceClient create(AssetFieldTypeViewServiceStub stub) {
    return new AssetFieldTypeViewServiceClient(stub);
  }

  /**
   * Constructs an instance of AssetFieldTypeViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AssetFieldTypeViewServiceClient(AssetFieldTypeViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((AssetFieldTypeViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AssetFieldTypeViewServiceClient(AssetFieldTypeViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AssetFieldTypeViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AssetFieldTypeViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested asset field type view in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AssetFieldTypeViewServiceClient assetFieldTypeViewServiceClient =
   *     AssetFieldTypeViewServiceClient.create()) {
   *   AssetFieldTypeViewName resourceName =
   *       AssetFieldTypeViewName.of("[CUSTOMER_ID]", "[FIELD_TYPE]");
   *   AssetFieldTypeView response =
   *       assetFieldTypeViewServiceClient.getAssetFieldTypeView(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the asset field type view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AssetFieldTypeView getAssetFieldTypeView(AssetFieldTypeViewName resourceName) {
    GetAssetFieldTypeViewRequest request =
        GetAssetFieldTypeViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAssetFieldTypeView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested asset field type view in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AssetFieldTypeViewServiceClient assetFieldTypeViewServiceClient =
   *     AssetFieldTypeViewServiceClient.create()) {
   *   String resourceName = AssetFieldTypeViewName.of("[CUSTOMER_ID]", "[FIELD_TYPE]").toString();
   *   AssetFieldTypeView response =
   *       assetFieldTypeViewServiceClient.getAssetFieldTypeView(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the asset field type view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AssetFieldTypeView getAssetFieldTypeView(String resourceName) {
    GetAssetFieldTypeViewRequest request =
        GetAssetFieldTypeViewRequest.newBuilder().setResourceName(resourceName).build();
    return getAssetFieldTypeView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested asset field type view in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AssetFieldTypeViewServiceClient assetFieldTypeViewServiceClient =
   *     AssetFieldTypeViewServiceClient.create()) {
   *   GetAssetFieldTypeViewRequest request =
   *       GetAssetFieldTypeViewRequest.newBuilder()
   *           .setResourceName(
   *               AssetFieldTypeViewName.of("[CUSTOMER_ID]", "[FIELD_TYPE]").toString())
   *           .build();
   *   AssetFieldTypeView response = assetFieldTypeViewServiceClient.getAssetFieldTypeView(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AssetFieldTypeView getAssetFieldTypeView(GetAssetFieldTypeViewRequest request) {
    return getAssetFieldTypeViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested asset field type view in full detail.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AssetFieldTypeViewServiceClient assetFieldTypeViewServiceClient =
   *     AssetFieldTypeViewServiceClient.create()) {
   *   GetAssetFieldTypeViewRequest request =
   *       GetAssetFieldTypeViewRequest.newBuilder()
   *           .setResourceName(
   *               AssetFieldTypeViewName.of("[CUSTOMER_ID]", "[FIELD_TYPE]").toString())
   *           .build();
   *   ApiFuture<AssetFieldTypeView> future =
   *       assetFieldTypeViewServiceClient.getAssetFieldTypeViewCallable().futureCall(request);
   *   // Do something.
   *   AssetFieldTypeView response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAssetFieldTypeViewRequest, AssetFieldTypeView>
      getAssetFieldTypeViewCallable() {
    return stub.getAssetFieldTypeViewCallable();
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
