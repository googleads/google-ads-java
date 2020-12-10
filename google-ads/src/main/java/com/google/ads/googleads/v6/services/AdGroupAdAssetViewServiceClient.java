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

import com.google.ads.googleads.v6.resources.AdGroupAdAssetView;
import com.google.ads.googleads.v6.resources.AdGroupAdAssetViewName;
import com.google.ads.googleads.v6.services.stub.AdGroupAdAssetViewServiceStub;
import com.google.ads.googleads.v6.services.stub.AdGroupAdAssetViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch ad group ad asset views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the AdGroupAdAssetViewServiceClient object to clean up
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
 * AdGroupAdAssetViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * AdGroupAdAssetViewServiceSettings adGroupAdAssetViewServiceSettings =
 *     AdGroupAdAssetViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupAdAssetViewServiceClient adGroupAdAssetViewServiceClient =
 *     AdGroupAdAssetViewServiceClient.create(adGroupAdAssetViewServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * AdGroupAdAssetViewServiceSettings adGroupAdAssetViewServiceSettings =
 *     AdGroupAdAssetViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupAdAssetViewServiceClient adGroupAdAssetViewServiceClient =
 *     AdGroupAdAssetViewServiceClient.create(adGroupAdAssetViewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class AdGroupAdAssetViewServiceClient implements BackgroundResource {
  private final AdGroupAdAssetViewServiceSettings settings;
  private final AdGroupAdAssetViewServiceStub stub;

  /** Constructs an instance of AdGroupAdAssetViewServiceClient with default settings. */
  public static final AdGroupAdAssetViewServiceClient create() throws IOException {
    return create(AdGroupAdAssetViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupAdAssetViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final AdGroupAdAssetViewServiceClient create(
      AdGroupAdAssetViewServiceSettings settings) throws IOException {
    return new AdGroupAdAssetViewServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupAdAssetViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(AdGroupAdAssetViewServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupAdAssetViewServiceClient create(AdGroupAdAssetViewServiceStub stub) {
    return new AdGroupAdAssetViewServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupAdAssetViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupAdAssetViewServiceClient(AdGroupAdAssetViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupAdAssetViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupAdAssetViewServiceClient(AdGroupAdAssetViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupAdAssetViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupAdAssetViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group ad asset view in full detail.
   *
   * @param resource_name Required. The resource name of the ad group ad asset view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAdAssetView getAdGroupAdAssetView(AdGroupAdAssetViewName resourceName) {
    GetAdGroupAdAssetViewRequest request =
        GetAdGroupAdAssetViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAdGroupAdAssetView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group ad asset view in full detail.
   *
   * @param resource_name Required. The resource name of the ad group ad asset view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAdAssetView getAdGroupAdAssetView(String resourceName) {
    GetAdGroupAdAssetViewRequest request =
        GetAdGroupAdAssetViewRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupAdAssetView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group ad asset view in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAdAssetView getAdGroupAdAssetView(GetAdGroupAdAssetViewRequest request) {
    return getAdGroupAdAssetViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad group ad asset view in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetAdGroupAdAssetViewRequest, AdGroupAdAssetView>
      getAdGroupAdAssetViewCallable() {
    return stub.getAdGroupAdAssetViewCallable();
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
