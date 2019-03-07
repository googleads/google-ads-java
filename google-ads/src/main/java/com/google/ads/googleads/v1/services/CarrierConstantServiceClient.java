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

import com.google.ads.googleads.v1.resources.CarrierConstant;
import com.google.ads.googleads.v1.services.stub.CarrierConstantServiceStub;
import com.google.ads.googleads.v1.services.stub.CarrierConstantServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch carrier constants.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CarrierConstantServiceClient carrierConstantServiceClient = CarrierConstantServiceClient.create()) {
 *   String formattedResourceName = CarrierConstantServiceClient.formatCarrierConstantName("[CARRIER_CONSTANT]");
 *   CarrierConstant response = carrierConstantServiceClient.getCarrierConstant(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the carrierConstantServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of CarrierConstantServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CarrierConstantServiceSettings carrierConstantServiceSettings =
 *     CarrierConstantServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CarrierConstantServiceClient carrierConstantServiceClient =
 *     CarrierConstantServiceClient.create(carrierConstantServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CarrierConstantServiceSettings carrierConstantServiceSettings =
 *     CarrierConstantServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CarrierConstantServiceClient carrierConstantServiceClient =
 *     CarrierConstantServiceClient.create(carrierConstantServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CarrierConstantServiceClient implements BackgroundResource {
  private final CarrierConstantServiceSettings settings;
  private final CarrierConstantServiceStub stub;

  private static final PathTemplate CARRIER_CONSTANT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("carrierConstants/{carrier_constant}");

  /**
   * Formats a string containing the fully-qualified path to represent a carrier_constant resource.
   */
  public static final String formatCarrierConstantName(String carrierConstant) {
    return CARRIER_CONSTANT_PATH_TEMPLATE.instantiate("carrier_constant", carrierConstant);
  }

  /**
   * Parses the carrier_constant from the given fully-qualified path which represents a
   * carrier_constant resource.
   */
  public static final String parseCarrierConstantFromCarrierConstantName(
      String carrierConstantName) {
    return CARRIER_CONSTANT_PATH_TEMPLATE.parse(carrierConstantName).get("carrier_constant");
  }

  /** Constructs an instance of CarrierConstantServiceClient with default settings. */
  public static final CarrierConstantServiceClient create() throws IOException {
    return create(CarrierConstantServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CarrierConstantServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CarrierConstantServiceClient create(CarrierConstantServiceSettings settings)
      throws IOException {
    return new CarrierConstantServiceClient(settings);
  }

  /**
   * Constructs an instance of CarrierConstantServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use CarrierConstantServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CarrierConstantServiceClient create(CarrierConstantServiceStub stub) {
    return new CarrierConstantServiceClient(stub);
  }

  /**
   * Constructs an instance of CarrierConstantServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CarrierConstantServiceClient(CarrierConstantServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((CarrierConstantServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CarrierConstantServiceClient(CarrierConstantServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CarrierConstantServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CarrierConstantServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested carrier constant in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CarrierConstantServiceClient carrierConstantServiceClient = CarrierConstantServiceClient.create()) {
   *   String formattedResourceName = CarrierConstantServiceClient.formatCarrierConstantName("[CARRIER_CONSTANT]");
   *   CarrierConstant response = carrierConstantServiceClient.getCarrierConstant(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Resource name of the carrier constant to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CarrierConstant getCarrierConstant(String resourceName) {
    CARRIER_CONSTANT_PATH_TEMPLATE.validate(resourceName, "getCarrierConstant");
    GetCarrierConstantRequest request =
        GetCarrierConstantRequest.newBuilder().setResourceName(resourceName).build();
    return getCarrierConstant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested carrier constant in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CarrierConstantServiceClient carrierConstantServiceClient = CarrierConstantServiceClient.create()) {
   *   String formattedResourceName = CarrierConstantServiceClient.formatCarrierConstantName("[CARRIER_CONSTANT]");
   *   GetCarrierConstantRequest request = GetCarrierConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CarrierConstant response = carrierConstantServiceClient.getCarrierConstant(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CarrierConstant getCarrierConstant(GetCarrierConstantRequest request) {
    return getCarrierConstantCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested carrier constant in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CarrierConstantServiceClient carrierConstantServiceClient = CarrierConstantServiceClient.create()) {
   *   String formattedResourceName = CarrierConstantServiceClient.formatCarrierConstantName("[CARRIER_CONSTANT]");
   *   GetCarrierConstantRequest request = GetCarrierConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CarrierConstant&gt; future = carrierConstantServiceClient.getCarrierConstantCallable().futureCall(request);
   *   // Do something
   *   CarrierConstant response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCarrierConstantRequest, CarrierConstant>
      getCarrierConstantCallable() {
    return stub.getCarrierConstantCallable();
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
