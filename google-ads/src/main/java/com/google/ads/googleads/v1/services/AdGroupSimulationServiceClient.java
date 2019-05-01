/*
 * Copyright 2019 Google LLC
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

import com.google.ads.googleads.v1.resources.AdGroupSimulation;
import com.google.ads.googleads.v1.services.stub.AdGroupSimulationServiceStub;
import com.google.ads.googleads.v1.services.stub.AdGroupSimulationServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch ad group simulations.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AdGroupSimulationServiceClient adGroupSimulationServiceClient = AdGroupSimulationServiceClient.create()) {
 *   String formattedResourceName = AdGroupSimulationServiceClient.formatAdGroupSimulationName("[CUSTOMER]", "[AD_GROUP_SIMULATION]");
 *   AdGroupSimulation response = adGroupSimulationServiceClient.getAdGroupSimulation(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the adGroupSimulationServiceClient object to clean up
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
 * AdGroupSimulationServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AdGroupSimulationServiceSettings adGroupSimulationServiceSettings =
 *     AdGroupSimulationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupSimulationServiceClient adGroupSimulationServiceClient =
 *     AdGroupSimulationServiceClient.create(adGroupSimulationServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AdGroupSimulationServiceSettings adGroupSimulationServiceSettings =
 *     AdGroupSimulationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupSimulationServiceClient adGroupSimulationServiceClient =
 *     AdGroupSimulationServiceClient.create(adGroupSimulationServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdGroupSimulationServiceClient implements BackgroundResource {
  private final AdGroupSimulationServiceSettings settings;
  private final AdGroupSimulationServiceStub stub;

  private static final PathTemplate AD_GROUP_SIMULATION_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/adGroupSimulations/{ad_group_simulation}");

  /**
   * Formats a string containing the fully-qualified path to represent a ad_group_simulation
   * resource.
   */
  public static final String formatAdGroupSimulationName(
      String customer, String adGroupSimulation) {
    return AD_GROUP_SIMULATION_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "ad_group_simulation", adGroupSimulation);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a ad_group_simulation
   * resource.
   */
  public static final String parseCustomerFromAdGroupSimulationName(String adGroupSimulationName) {
    return AD_GROUP_SIMULATION_PATH_TEMPLATE.parse(adGroupSimulationName).get("customer");
  }

  /**
   * Parses the ad_group_simulation from the given fully-qualified path which represents a
   * ad_group_simulation resource.
   */
  public static final String parseAdGroupSimulationFromAdGroupSimulationName(
      String adGroupSimulationName) {
    return AD_GROUP_SIMULATION_PATH_TEMPLATE
        .parse(adGroupSimulationName)
        .get("ad_group_simulation");
  }

  /** Constructs an instance of AdGroupSimulationServiceClient with default settings. */
  public static final AdGroupSimulationServiceClient create() throws IOException {
    return create(AdGroupSimulationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupSimulationServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final AdGroupSimulationServiceClient create(
      AdGroupSimulationServiceSettings settings) throws IOException {
    return new AdGroupSimulationServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupSimulationServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use AdGroupSimulationServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupSimulationServiceClient create(AdGroupSimulationServiceStub stub) {
    return new AdGroupSimulationServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupSimulationServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupSimulationServiceClient(AdGroupSimulationServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupSimulationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupSimulationServiceClient(AdGroupSimulationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupSimulationServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupSimulationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupSimulationServiceClient adGroupSimulationServiceClient = AdGroupSimulationServiceClient.create()) {
   *   String formattedResourceName = AdGroupSimulationServiceClient.formatAdGroupSimulationName("[CUSTOMER]", "[AD_GROUP_SIMULATION]");
   *   AdGroupSimulation response = adGroupSimulationServiceClient.getAdGroupSimulation(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the ad group simulation to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupSimulation getAdGroupSimulation(String resourceName) {
    AD_GROUP_SIMULATION_PATH_TEMPLATE.validate(resourceName, "getAdGroupSimulation");
    GetAdGroupSimulationRequest request =
        GetAdGroupSimulationRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupSimulation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupSimulationServiceClient adGroupSimulationServiceClient = AdGroupSimulationServiceClient.create()) {
   *   String formattedResourceName = AdGroupSimulationServiceClient.formatAdGroupSimulationName("[CUSTOMER]", "[AD_GROUP_SIMULATION]");
   *   GetAdGroupSimulationRequest request = GetAdGroupSimulationRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   AdGroupSimulation response = adGroupSimulationServiceClient.getAdGroupSimulation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupSimulation getAdGroupSimulation(GetAdGroupSimulationRequest request) {
    return getAdGroupSimulationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group simulation in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupSimulationServiceClient adGroupSimulationServiceClient = AdGroupSimulationServiceClient.create()) {
   *   String formattedResourceName = AdGroupSimulationServiceClient.formatAdGroupSimulationName("[CUSTOMER]", "[AD_GROUP_SIMULATION]");
   *   GetAdGroupSimulationRequest request = GetAdGroupSimulationRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;AdGroupSimulation&gt; future = adGroupSimulationServiceClient.getAdGroupSimulationCallable().futureCall(request);
   *   // Do something
   *   AdGroupSimulation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAdGroupSimulationRequest, AdGroupSimulation>
      getAdGroupSimulationCallable() {
    return stub.getAdGroupSimulationCallable();
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
