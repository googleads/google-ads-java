/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.LandingPageView;
import com.google.ads.googleads.v6.resources.LandingPageViewName;
import com.google.ads.googleads.v6.services.stub.LandingPageViewServiceStub;
import com.google.ads.googleads.v6.services.stub.LandingPageViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch landing page views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the LandingPageViewServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of LandingPageViewServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * LandingPageViewServiceSettings landingPageViewServiceSettings =
 *     LandingPageViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LandingPageViewServiceClient landingPageViewServiceClient =
 *     LandingPageViewServiceClient.create(landingPageViewServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * LandingPageViewServiceSettings landingPageViewServiceSettings =
 *     LandingPageViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * LandingPageViewServiceClient landingPageViewServiceClient =
 *     LandingPageViewServiceClient.create(landingPageViewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class LandingPageViewServiceClient implements BackgroundResource {
  private final LandingPageViewServiceSettings settings;
  private final LandingPageViewServiceStub stub;

  /** Constructs an instance of LandingPageViewServiceClient with default settings. */
  public static final LandingPageViewServiceClient create() throws IOException {
    return create(LandingPageViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of LandingPageViewServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final LandingPageViewServiceClient create(LandingPageViewServiceSettings settings)
      throws IOException {
    return new LandingPageViewServiceClient(settings);
  }

  /**
   * Constructs an instance of LandingPageViewServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(LandingPageViewServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final LandingPageViewServiceClient create(LandingPageViewServiceStub stub) {
    return new LandingPageViewServiceClient(stub);
  }

  /**
   * Constructs an instance of LandingPageViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected LandingPageViewServiceClient(LandingPageViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((LandingPageViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected LandingPageViewServiceClient(LandingPageViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final LandingPageViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public LandingPageViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested landing page view in full detail.
   *
   * @param resource_name Required. The resource name of the landing page view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LandingPageView getLandingPageView(LandingPageViewName resourceName) {
    GetLandingPageViewRequest request =
        GetLandingPageViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getLandingPageView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested landing page view in full detail.
   *
   * @param resource_name Required. The resource name of the landing page view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LandingPageView getLandingPageView(String resourceName) {
    GetLandingPageViewRequest request =
        GetLandingPageViewRequest.newBuilder().setResourceName(resourceName).build();
    return getLandingPageView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested landing page view in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LandingPageView getLandingPageView(GetLandingPageViewRequest request) {
    return getLandingPageViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested landing page view in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetLandingPageViewRequest, LandingPageView>
      getLandingPageViewCallable() {
    return stub.getLandingPageViewCallable();
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
