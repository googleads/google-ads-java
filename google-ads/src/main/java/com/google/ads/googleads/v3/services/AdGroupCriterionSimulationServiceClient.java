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
package com.google.ads.googleads.v3.services;

import com.google.ads.googleads.v3.resources.AdGroupCriterionSimulation;
import com.google.ads.googleads.v3.services.stub.AdGroupCriterionSimulationServiceStub;
import com.google.ads.googleads.v3.services.stub.AdGroupCriterionSimulationServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch ad group criterion simulations.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AdGroupCriterionSimulationServiceClient adGroupCriterionSimulationServiceClient = AdGroupCriterionSimulationServiceClient.create()) {
 *   AdGroupCriterionSimulationName resourceName = AdGroupCriterionSimulationName.of("[CUSTOMER]", "[AD_GROUP_CRITERION_SIMULATION]");
 *   AdGroupCriterionSimulation response = adGroupCriterionSimulationServiceClient.getAdGroupCriterionSimulation(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the adGroupCriterionSimulationServiceClient object to
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
 * AdGroupCriterionSimulationServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AdGroupCriterionSimulationServiceSettings adGroupCriterionSimulationServiceSettings =
 *     AdGroupCriterionSimulationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupCriterionSimulationServiceClient adGroupCriterionSimulationServiceClient =
 *     AdGroupCriterionSimulationServiceClient.create(adGroupCriterionSimulationServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AdGroupCriterionSimulationServiceSettings adGroupCriterionSimulationServiceSettings =
 *     AdGroupCriterionSimulationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupCriterionSimulationServiceClient adGroupCriterionSimulationServiceClient =
 *     AdGroupCriterionSimulationServiceClient.create(adGroupCriterionSimulationServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdGroupCriterionSimulationServiceClient implements BackgroundResource {
  private final AdGroupCriterionSimulationServiceSettings settings;
  private final AdGroupCriterionSimulationServiceStub stub;

  /** Constructs an instance of AdGroupCriterionSimulationServiceClient with default settings. */
  public static final AdGroupCriterionSimulationServiceClient create() throws IOException {
    return create(AdGroupCriterionSimulationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupCriterionSimulationServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final AdGroupCriterionSimulationServiceClient create(
      AdGroupCriterionSimulationServiceSettings settings) throws IOException {
    return new AdGroupCriterionSimulationServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupCriterionSimulationServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer to use
   * AdGroupCriterionSimulationServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupCriterionSimulationServiceClient create(
      AdGroupCriterionSimulationServiceStub stub) {
    return new AdGroupCriterionSimulationServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupCriterionSimulationServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected AdGroupCriterionSimulationServiceClient(
      AdGroupCriterionSimulationServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((AdGroupCriterionSimulationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupCriterionSimulationServiceClient(AdGroupCriterionSimulationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupCriterionSimulationServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupCriterionSimulationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group criterion simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionSimulationServiceClient adGroupCriterionSimulationServiceClient = AdGroupCriterionSimulationServiceClient.create()) {
   *   AdGroupCriterionSimulationName resourceName = AdGroupCriterionSimulationName.of("[CUSTOMER]", "[AD_GROUP_CRITERION_SIMULATION]");
   *   AdGroupCriterionSimulation response = adGroupCriterionSimulationServiceClient.getAdGroupCriterionSimulation(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the ad group criterion simulation to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupCriterionSimulation getAdGroupCriterionSimulation(
      AdGroupCriterionSimulationName resourceName) {
    GetAdGroupCriterionSimulationRequest request =
        GetAdGroupCriterionSimulationRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAdGroupCriterionSimulation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group criterion simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionSimulationServiceClient adGroupCriterionSimulationServiceClient = AdGroupCriterionSimulationServiceClient.create()) {
   *   AdGroupCriterionSimulationName resourceName = AdGroupCriterionSimulationName.of("[CUSTOMER]", "[AD_GROUP_CRITERION_SIMULATION]");
   *   AdGroupCriterionSimulation response = adGroupCriterionSimulationServiceClient.getAdGroupCriterionSimulation(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the ad group criterion simulation to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupCriterionSimulation getAdGroupCriterionSimulation(String resourceName) {
    GetAdGroupCriterionSimulationRequest request =
        GetAdGroupCriterionSimulationRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupCriterionSimulation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group criterion simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionSimulationServiceClient adGroupCriterionSimulationServiceClient = AdGroupCriterionSimulationServiceClient.create()) {
   *   AdGroupCriterionSimulationName resourceName = AdGroupCriterionSimulationName.of("[CUSTOMER]", "[AD_GROUP_CRITERION_SIMULATION]");
   *   GetAdGroupCriterionSimulationRequest request = GetAdGroupCriterionSimulationRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   AdGroupCriterionSimulation response = adGroupCriterionSimulationServiceClient.getAdGroupCriterionSimulation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupCriterionSimulation getAdGroupCriterionSimulation(
      GetAdGroupCriterionSimulationRequest request) {
    return getAdGroupCriterionSimulationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group criterion simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupCriterionSimulationServiceClient adGroupCriterionSimulationServiceClient = AdGroupCriterionSimulationServiceClient.create()) {
   *   AdGroupCriterionSimulationName resourceName = AdGroupCriterionSimulationName.of("[CUSTOMER]", "[AD_GROUP_CRITERION_SIMULATION]");
   *   GetAdGroupCriterionSimulationRequest request = GetAdGroupCriterionSimulationRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;AdGroupCriterionSimulation&gt; future = adGroupCriterionSimulationServiceClient.getAdGroupCriterionSimulationCallable().futureCall(request);
   *   // Do something
   *   AdGroupCriterionSimulation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAdGroupCriterionSimulationRequest, AdGroupCriterionSimulation>
      getAdGroupCriterionSimulationCallable() {
    return stub.getAdGroupCriterionSimulationCallable();
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
