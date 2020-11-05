/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v4.services;

import com.google.ads.googleads.v4.resources.ShoppingPerformanceView;
import com.google.ads.googleads.v4.services.stub.ShoppingPerformanceViewServiceStub;
import com.google.ads.googleads.v4.services.stub.ShoppingPerformanceViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch Shopping performance views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ShoppingPerformanceViewServiceClient shoppingPerformanceViewServiceClient = ShoppingPerformanceViewServiceClient.create()) {
 *   ShoppingPerformanceViewName resourceName = ShoppingPerformanceViewName.of("[CUSTOMER]");
 *   ShoppingPerformanceView response = shoppingPerformanceViewServiceClient.getShoppingPerformanceView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the shoppingPerformanceViewServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
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
 * ShoppingPerformanceViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ShoppingPerformanceViewServiceSettings shoppingPerformanceViewServiceSettings =
 *     ShoppingPerformanceViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ShoppingPerformanceViewServiceClient shoppingPerformanceViewServiceClient =
 *     ShoppingPerformanceViewServiceClient.create(shoppingPerformanceViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ShoppingPerformanceViewServiceSettings shoppingPerformanceViewServiceSettings =
 *     ShoppingPerformanceViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ShoppingPerformanceViewServiceClient shoppingPerformanceViewServiceClient =
 *     ShoppingPerformanceViewServiceClient.create(shoppingPerformanceViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ShoppingPerformanceViewServiceClient implements BackgroundResource {
  private final ShoppingPerformanceViewServiceSettings settings;
  private final ShoppingPerformanceViewServiceStub stub;

  /** Constructs an instance of ShoppingPerformanceViewServiceClient with default settings. */
  public static final ShoppingPerformanceViewServiceClient create() throws IOException {
    return create(ShoppingPerformanceViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ShoppingPerformanceViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ShoppingPerformanceViewServiceClient create(
      ShoppingPerformanceViewServiceSettings settings) throws IOException {
    return new ShoppingPerformanceViewServiceClient(settings);
  }

  /**
   * Constructs an instance of ShoppingPerformanceViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use ShoppingPerformanceViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ShoppingPerformanceViewServiceClient create(
      ShoppingPerformanceViewServiceStub stub) {
    return new ShoppingPerformanceViewServiceClient(stub);
  }

  /**
   * Constructs an instance of ShoppingPerformanceViewServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ShoppingPerformanceViewServiceClient(ShoppingPerformanceViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((ShoppingPerformanceViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ShoppingPerformanceViewServiceClient(ShoppingPerformanceViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ShoppingPerformanceViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ShoppingPerformanceViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Shopping performance view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ShoppingPerformanceViewServiceClient shoppingPerformanceViewServiceClient = ShoppingPerformanceViewServiceClient.create()) {
   *   ShoppingPerformanceViewName resourceName = ShoppingPerformanceViewName.of("[CUSTOMER]");
   *   ShoppingPerformanceView response = shoppingPerformanceViewServiceClient.getShoppingPerformanceView(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the Shopping performance view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ShoppingPerformanceView getShoppingPerformanceView(
      ShoppingPerformanceViewName resourceName) {
    GetShoppingPerformanceViewRequest request =
        GetShoppingPerformanceViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getShoppingPerformanceView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Shopping performance view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ShoppingPerformanceViewServiceClient shoppingPerformanceViewServiceClient = ShoppingPerformanceViewServiceClient.create()) {
   *   ShoppingPerformanceViewName resourceName = ShoppingPerformanceViewName.of("[CUSTOMER]");
   *   ShoppingPerformanceView response = shoppingPerformanceViewServiceClient.getShoppingPerformanceView(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the Shopping performance view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ShoppingPerformanceView getShoppingPerformanceView(String resourceName) {
    GetShoppingPerformanceViewRequest request =
        GetShoppingPerformanceViewRequest.newBuilder().setResourceName(resourceName).build();
    return getShoppingPerformanceView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Shopping performance view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ShoppingPerformanceViewServiceClient shoppingPerformanceViewServiceClient = ShoppingPerformanceViewServiceClient.create()) {
   *   ShoppingPerformanceViewName resourceName = ShoppingPerformanceViewName.of("[CUSTOMER]");
   *   GetShoppingPerformanceViewRequest request = GetShoppingPerformanceViewRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ShoppingPerformanceView response = shoppingPerformanceViewServiceClient.getShoppingPerformanceView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ShoppingPerformanceView getShoppingPerformanceView(
      GetShoppingPerformanceViewRequest request) {
    return getShoppingPerformanceViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Shopping performance view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ShoppingPerformanceViewServiceClient shoppingPerformanceViewServiceClient = ShoppingPerformanceViewServiceClient.create()) {
   *   ShoppingPerformanceViewName resourceName = ShoppingPerformanceViewName.of("[CUSTOMER]");
   *   GetShoppingPerformanceViewRequest request = GetShoppingPerformanceViewRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;ShoppingPerformanceView&gt; future = shoppingPerformanceViewServiceClient.getShoppingPerformanceViewCallable().futureCall(request);
   *   // Do something
   *   ShoppingPerformanceView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetShoppingPerformanceViewRequest, ShoppingPerformanceView>
      getShoppingPerformanceViewCallable() {
    return stub.getShoppingPerformanceViewCallable();
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
