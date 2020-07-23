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
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.CustomInterest;
import com.google.ads.googleads.v1.services.stub.CustomInterestServiceStub;
import com.google.ads.googleads.v1.services.stub.CustomInterestServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage custom interests.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CustomInterestServiceClient customInterestServiceClient = CustomInterestServiceClient.create()) {
 *   CustomInterestName resourceName = CustomInterestName.of("[CUSTOMER]", "[CUSTOM_INTEREST]");
 *   CustomInterest response = customInterestServiceClient.getCustomInterest(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the customInterestServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of CustomInterestServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CustomInterestServiceSettings customInterestServiceSettings =
 *     CustomInterestServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomInterestServiceClient customInterestServiceClient =
 *     CustomInterestServiceClient.create(customInterestServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CustomInterestServiceSettings customInterestServiceSettings =
 *     CustomInterestServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomInterestServiceClient customInterestServiceClient =
 *     CustomInterestServiceClient.create(customInterestServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CustomInterestServiceClient implements BackgroundResource {
  private final CustomInterestServiceSettings settings;
  private final CustomInterestServiceStub stub;

  /** Constructs an instance of CustomInterestServiceClient with default settings. */
  public static final CustomInterestServiceClient create() throws IOException {
    return create(CustomInterestServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomInterestServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CustomInterestServiceClient create(CustomInterestServiceSettings settings)
      throws IOException {
    return new CustomInterestServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomInterestServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use CustomInterestServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CustomInterestServiceClient create(CustomInterestServiceStub stub) {
    return new CustomInterestServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomInterestServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CustomInterestServiceClient(CustomInterestServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CustomInterestServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CustomInterestServiceClient(CustomInterestServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CustomInterestServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CustomInterestServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested custom interest in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomInterestServiceClient customInterestServiceClient = CustomInterestServiceClient.create()) {
   *   CustomInterestName resourceName = CustomInterestName.of("[CUSTOMER]", "[CUSTOM_INTEREST]");
   *   CustomInterest response = customInterestServiceClient.getCustomInterest(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the custom interest to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomInterest getCustomInterest(CustomInterestName resourceName) {
    GetCustomInterestRequest request =
        GetCustomInterestRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCustomInterest(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested custom interest in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomInterestServiceClient customInterestServiceClient = CustomInterestServiceClient.create()) {
   *   CustomInterestName resourceName = CustomInterestName.of("[CUSTOMER]", "[CUSTOM_INTEREST]");
   *   CustomInterest response = customInterestServiceClient.getCustomInterest(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the custom interest to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomInterest getCustomInterest(String resourceName) {
    GetCustomInterestRequest request =
        GetCustomInterestRequest.newBuilder().setResourceName(resourceName).build();
    return getCustomInterest(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested custom interest in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomInterestServiceClient customInterestServiceClient = CustomInterestServiceClient.create()) {
   *   CustomInterestName resourceName = CustomInterestName.of("[CUSTOMER]", "[CUSTOM_INTEREST]");
   *   GetCustomInterestRequest request = GetCustomInterestRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   CustomInterest response = customInterestServiceClient.getCustomInterest(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CustomInterest getCustomInterest(GetCustomInterestRequest request) {
    return getCustomInterestCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested custom interest in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomInterestServiceClient customInterestServiceClient = CustomInterestServiceClient.create()) {
   *   CustomInterestName resourceName = CustomInterestName.of("[CUSTOMER]", "[CUSTOM_INTEREST]");
   *   GetCustomInterestRequest request = GetCustomInterestRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;CustomInterest&gt; future = customInterestServiceClient.getCustomInterestCallable().futureCall(request);
   *   // Do something
   *   CustomInterest response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCustomInterestRequest, CustomInterest> getCustomInterestCallable() {
    return stub.getCustomInterestCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates custom interests. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomInterestServiceClient customInterestServiceClient = CustomInterestServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomInterestOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomInterestsResponse response = customInterestServiceClient.mutateCustomInterests(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose custom interests are being modified.
   * @param operations Required. The list of operations to perform on individual custom interests.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomInterestsResponse mutateCustomInterests(
      String customerId, List<CustomInterestOperation> operations) {
    MutateCustomInterestsRequest request =
        MutateCustomInterestsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCustomInterests(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates custom interests. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomInterestServiceClient customInterestServiceClient = CustomInterestServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomInterestOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomInterestsRequest request = MutateCustomInterestsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCustomInterestsResponse response = customInterestServiceClient.mutateCustomInterests(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomInterestsResponse mutateCustomInterests(
      MutateCustomInterestsRequest request) {
    return mutateCustomInterestsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates custom interests. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CustomInterestServiceClient customInterestServiceClient = CustomInterestServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CustomInterestOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCustomInterestsRequest request = MutateCustomInterestsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCustomInterestsResponse&gt; future = customInterestServiceClient.mutateCustomInterestsCallable().futureCall(request);
   *   // Do something
   *   MutateCustomInterestsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCustomInterestsRequest, MutateCustomInterestsResponse>
      mutateCustomInterestsCallable() {
    return stub.mutateCustomInterestsCallable();
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
