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

import com.google.ads.googleads.v8.resources.AgeRangeView;
import com.google.ads.googleads.v8.resources.AgeRangeViewName;
import com.google.ads.googleads.v8.services.stub.AgeRangeViewServiceStub;
import com.google.ads.googleads.v8.services.stub.AgeRangeViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage age range views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (AgeRangeViewServiceClient ageRangeViewServiceClient = AgeRangeViewServiceClient.create()) {
 *   AgeRangeViewName resourceName =
 *       AgeRangeViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   AgeRangeView response = ageRangeViewServiceClient.getAgeRangeView(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AgeRangeViewServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of AgeRangeViewServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * AgeRangeViewServiceSettings ageRangeViewServiceSettings =
 *     AgeRangeViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AgeRangeViewServiceClient ageRangeViewServiceClient =
 *     AgeRangeViewServiceClient.create(ageRangeViewServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * AgeRangeViewServiceSettings ageRangeViewServiceSettings =
 *     AgeRangeViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AgeRangeViewServiceClient ageRangeViewServiceClient =
 *     AgeRangeViewServiceClient.create(ageRangeViewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AgeRangeViewServiceClient implements BackgroundResource {
  private final AgeRangeViewServiceSettings settings;
  private final AgeRangeViewServiceStub stub;

  /** Constructs an instance of AgeRangeViewServiceClient with default settings. */
  public static final AgeRangeViewServiceClient create() throws IOException {
    return create(AgeRangeViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AgeRangeViewServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AgeRangeViewServiceClient create(AgeRangeViewServiceSettings settings)
      throws IOException {
    return new AgeRangeViewServiceClient(settings);
  }

  /**
   * Constructs an instance of AgeRangeViewServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AgeRangeViewServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AgeRangeViewServiceClient create(AgeRangeViewServiceStub stub) {
    return new AgeRangeViewServiceClient(stub);
  }

  /**
   * Constructs an instance of AgeRangeViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AgeRangeViewServiceClient(AgeRangeViewServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AgeRangeViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AgeRangeViewServiceClient(AgeRangeViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AgeRangeViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AgeRangeViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested age range view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AgeRangeViewServiceClient ageRangeViewServiceClient = AgeRangeViewServiceClient.create()) {
   *   AgeRangeViewName resourceName =
   *       AgeRangeViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
   *   AgeRangeView response = ageRangeViewServiceClient.getAgeRangeView(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the age range view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AgeRangeView getAgeRangeView(AgeRangeViewName resourceName) {
    GetAgeRangeViewRequest request =
        GetAgeRangeViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAgeRangeView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested age range view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AgeRangeViewServiceClient ageRangeViewServiceClient = AgeRangeViewServiceClient.create()) {
   *   String resourceName =
   *       AgeRangeViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]").toString();
   *   AgeRangeView response = ageRangeViewServiceClient.getAgeRangeView(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the age range view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AgeRangeView getAgeRangeView(String resourceName) {
    GetAgeRangeViewRequest request =
        GetAgeRangeViewRequest.newBuilder().setResourceName(resourceName).build();
    return getAgeRangeView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested age range view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AgeRangeViewServiceClient ageRangeViewServiceClient = AgeRangeViewServiceClient.create()) {
   *   GetAgeRangeViewRequest request =
   *       GetAgeRangeViewRequest.newBuilder()
   *           .setResourceName(
   *               AgeRangeViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
   *                   .toString())
   *           .build();
   *   AgeRangeView response = ageRangeViewServiceClient.getAgeRangeView(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AgeRangeView getAgeRangeView(GetAgeRangeViewRequest request) {
    return getAgeRangeViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested age range view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AgeRangeViewServiceClient ageRangeViewServiceClient = AgeRangeViewServiceClient.create()) {
   *   GetAgeRangeViewRequest request =
   *       GetAgeRangeViewRequest.newBuilder()
   *           .setResourceName(
   *               AgeRangeViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<AgeRangeView> future =
   *       ageRangeViewServiceClient.getAgeRangeViewCallable().futureCall(request);
   *   // Do something.
   *   AgeRangeView response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAgeRangeViewRequest, AgeRangeView> getAgeRangeViewCallable() {
    return stub.getAgeRangeViewCallable();
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
