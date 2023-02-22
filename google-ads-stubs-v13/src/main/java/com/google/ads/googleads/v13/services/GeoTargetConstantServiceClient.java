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

import com.google.ads.googleads.v13.services.stub.GeoTargetConstantServiceStub;
import com.google.ads.googleads.v13.services.stub.GeoTargetConstantServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch geo target constants.
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
 * try (GeoTargetConstantServiceClient geoTargetConstantServiceClient =
 *     GeoTargetConstantServiceClient.create()) {
 *   SuggestGeoTargetConstantsRequest request =
 *       SuggestGeoTargetConstantsRequest.newBuilder()
 *           .setLocale("locale-1097462182")
 *           .setCountryCode("countryCode-1477067101")
 *           .build();
 *   SuggestGeoTargetConstantsResponse response =
 *       geoTargetConstantServiceClient.suggestGeoTargetConstants(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the GeoTargetConstantServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of
 * GeoTargetConstantServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * GeoTargetConstantServiceSettings geoTargetConstantServiceSettings =
 *     GeoTargetConstantServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GeoTargetConstantServiceClient geoTargetConstantServiceClient =
 *     GeoTargetConstantServiceClient.create(geoTargetConstantServiceSettings);
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
 * GeoTargetConstantServiceSettings geoTargetConstantServiceSettings =
 *     GeoTargetConstantServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * GeoTargetConstantServiceClient geoTargetConstantServiceClient =
 *     GeoTargetConstantServiceClient.create(geoTargetConstantServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class GeoTargetConstantServiceClient implements BackgroundResource {
  private final GeoTargetConstantServiceSettings settings;
  private final GeoTargetConstantServiceStub stub;

  /** Constructs an instance of GeoTargetConstantServiceClient with default settings. */
  public static final GeoTargetConstantServiceClient create() throws IOException {
    return create(GeoTargetConstantServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of GeoTargetConstantServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final GeoTargetConstantServiceClient create(
      GeoTargetConstantServiceSettings settings) throws IOException {
    return new GeoTargetConstantServiceClient(settings);
  }

  /**
   * Constructs an instance of GeoTargetConstantServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(GeoTargetConstantServiceSettings).
   */
  public static final GeoTargetConstantServiceClient create(GeoTargetConstantServiceStub stub) {
    return new GeoTargetConstantServiceClient(stub);
  }

  /**
   * Constructs an instance of GeoTargetConstantServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GeoTargetConstantServiceClient(GeoTargetConstantServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((GeoTargetConstantServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected GeoTargetConstantServiceClient(GeoTargetConstantServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GeoTargetConstantServiceSettings getSettings() {
    return settings;
  }

  public GeoTargetConstantServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns GeoTargetConstant suggestions by location name or by resource name.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [GeoTargetConstantSuggestionError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GeoTargetConstantServiceClient geoTargetConstantServiceClient =
   *     GeoTargetConstantServiceClient.create()) {
   *   SuggestGeoTargetConstantsRequest request =
   *       SuggestGeoTargetConstantsRequest.newBuilder()
   *           .setLocale("locale-1097462182")
   *           .setCountryCode("countryCode-1477067101")
   *           .build();
   *   SuggestGeoTargetConstantsResponse response =
   *       geoTargetConstantServiceClient.suggestGeoTargetConstants(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestGeoTargetConstantsResponse suggestGeoTargetConstants(
      SuggestGeoTargetConstantsRequest request) {
    return suggestGeoTargetConstantsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns GeoTargetConstant suggestions by location name or by resource name.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [GeoTargetConstantSuggestionError]() [HeaderError]() [InternalError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (GeoTargetConstantServiceClient geoTargetConstantServiceClient =
   *     GeoTargetConstantServiceClient.create()) {
   *   SuggestGeoTargetConstantsRequest request =
   *       SuggestGeoTargetConstantsRequest.newBuilder()
   *           .setLocale("locale-1097462182")
   *           .setCountryCode("countryCode-1477067101")
   *           .build();
   *   ApiFuture<SuggestGeoTargetConstantsResponse> future =
   *       geoTargetConstantServiceClient.suggestGeoTargetConstantsCallable().futureCall(request);
   *   // Do something.
   *   SuggestGeoTargetConstantsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SuggestGeoTargetConstantsRequest, SuggestGeoTargetConstantsResponse>
      suggestGeoTargetConstantsCallable() {
    return stub.suggestGeoTargetConstantsCallable();
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
