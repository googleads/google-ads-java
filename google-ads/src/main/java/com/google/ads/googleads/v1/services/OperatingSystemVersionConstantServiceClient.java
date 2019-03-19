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

import com.google.ads.googleads.v1.resources.OperatingSystemVersionConstant;
import com.google.ads.googleads.v1.services.stub.OperatingSystemVersionConstantServiceStub;
import com.google.ads.googleads.v1.services.stub.OperatingSystemVersionConstantServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch Operating System Version constants.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (OperatingSystemVersionConstantServiceClient operatingSystemVersionConstantServiceClient = OperatingSystemVersionConstantServiceClient.create()) {
 *   String formattedResourceName = OperatingSystemVersionConstantServiceClient.formatOperatingSystemVersionConstantName("[OPERATING_SYSTEM_VERSION_CONSTANT]");
 *   OperatingSystemVersionConstant response = operatingSystemVersionConstantServiceClient.getOperatingSystemVersionConstant(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the operatingSystemVersionConstantServiceClient object to
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
 * OperatingSystemVersionConstantServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * OperatingSystemVersionConstantServiceSettings operatingSystemVersionConstantServiceSettings =
 *     OperatingSystemVersionConstantServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * OperatingSystemVersionConstantServiceClient operatingSystemVersionConstantServiceClient =
 *     OperatingSystemVersionConstantServiceClient.create(operatingSystemVersionConstantServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * OperatingSystemVersionConstantServiceSettings operatingSystemVersionConstantServiceSettings =
 *     OperatingSystemVersionConstantServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * OperatingSystemVersionConstantServiceClient operatingSystemVersionConstantServiceClient =
 *     OperatingSystemVersionConstantServiceClient.create(operatingSystemVersionConstantServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class OperatingSystemVersionConstantServiceClient implements BackgroundResource {
  private final OperatingSystemVersionConstantServiceSettings settings;
  private final OperatingSystemVersionConstantServiceStub stub;

  private static final PathTemplate OPERATING_SYSTEM_VERSION_CONSTANT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "operatingSystemVersionConstants/{operating_system_version_constant}");

  /**
   * Formats a string containing the fully-qualified path to represent a
   * operating_system_version_constant resource.
   */
  public static final String formatOperatingSystemVersionConstantName(
      String operatingSystemVersionConstant) {
    return OPERATING_SYSTEM_VERSION_CONSTANT_PATH_TEMPLATE.instantiate(
        "operating_system_version_constant", operatingSystemVersionConstant);
  }

  /**
   * Parses the operating_system_version_constant from the given fully-qualified path which
   * represents a operating_system_version_constant resource.
   */
  public static final String
      parseOperatingSystemVersionConstantFromOperatingSystemVersionConstantName(
          String operatingSystemVersionConstantName) {
    return OPERATING_SYSTEM_VERSION_CONSTANT_PATH_TEMPLATE
        .parse(operatingSystemVersionConstantName)
        .get("operating_system_version_constant");
  }

  /**
   * Constructs an instance of OperatingSystemVersionConstantServiceClient with default settings.
   */
  public static final OperatingSystemVersionConstantServiceClient create() throws IOException {
    return create(OperatingSystemVersionConstantServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of OperatingSystemVersionConstantServiceClient, using the given
   * settings. The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final OperatingSystemVersionConstantServiceClient create(
      OperatingSystemVersionConstantServiceSettings settings) throws IOException {
    return new OperatingSystemVersionConstantServiceClient(settings);
  }

  /**
   * Constructs an instance of OperatingSystemVersionConstantServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer to use
   * OperatingSystemVersionConstantServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final OperatingSystemVersionConstantServiceClient create(
      OperatingSystemVersionConstantServiceStub stub) {
    return new OperatingSystemVersionConstantServiceClient(stub);
  }

  /**
   * Constructs an instance of OperatingSystemVersionConstantServiceClient, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected OperatingSystemVersionConstantServiceClient(
      OperatingSystemVersionConstantServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((OperatingSystemVersionConstantServiceStubSettings) settings.getStubSettings())
            .createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected OperatingSystemVersionConstantServiceClient(
      OperatingSystemVersionConstantServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final OperatingSystemVersionConstantServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public OperatingSystemVersionConstantServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested OS version constant in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OperatingSystemVersionConstantServiceClient operatingSystemVersionConstantServiceClient = OperatingSystemVersionConstantServiceClient.create()) {
   *   String formattedResourceName = OperatingSystemVersionConstantServiceClient.formatOperatingSystemVersionConstantName("[OPERATING_SYSTEM_VERSION_CONSTANT]");
   *   OperatingSystemVersionConstant response = operatingSystemVersionConstantServiceClient.getOperatingSystemVersionConstant(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Resource name of the OS version to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperatingSystemVersionConstant getOperatingSystemVersionConstant(
      String resourceName) {
    OPERATING_SYSTEM_VERSION_CONSTANT_PATH_TEMPLATE.validate(
        resourceName, "getOperatingSystemVersionConstant");
    GetOperatingSystemVersionConstantRequest request =
        GetOperatingSystemVersionConstantRequest.newBuilder().setResourceName(resourceName).build();
    return getOperatingSystemVersionConstant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested OS version constant in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OperatingSystemVersionConstantServiceClient operatingSystemVersionConstantServiceClient = OperatingSystemVersionConstantServiceClient.create()) {
   *   String formattedResourceName = OperatingSystemVersionConstantServiceClient.formatOperatingSystemVersionConstantName("[OPERATING_SYSTEM_VERSION_CONSTANT]");
   *   GetOperatingSystemVersionConstantRequest request = GetOperatingSystemVersionConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   OperatingSystemVersionConstant response = operatingSystemVersionConstantServiceClient.getOperatingSystemVersionConstant(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperatingSystemVersionConstant getOperatingSystemVersionConstant(
      GetOperatingSystemVersionConstantRequest request) {
    return getOperatingSystemVersionConstantCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested OS version constant in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OperatingSystemVersionConstantServiceClient operatingSystemVersionConstantServiceClient = OperatingSystemVersionConstantServiceClient.create()) {
   *   String formattedResourceName = OperatingSystemVersionConstantServiceClient.formatOperatingSystemVersionConstantName("[OPERATING_SYSTEM_VERSION_CONSTANT]");
   *   GetOperatingSystemVersionConstantRequest request = GetOperatingSystemVersionConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;OperatingSystemVersionConstant&gt; future = operatingSystemVersionConstantServiceClient.getOperatingSystemVersionConstantCallable().futureCall(request);
   *   // Do something
   *   OperatingSystemVersionConstant response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          GetOperatingSystemVersionConstantRequest, OperatingSystemVersionConstant>
      getOperatingSystemVersionConstantCallable() {
    return stub.getOperatingSystemVersionConstantCallable();
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
