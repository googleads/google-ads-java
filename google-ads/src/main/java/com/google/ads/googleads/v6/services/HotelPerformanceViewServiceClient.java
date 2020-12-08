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

import com.google.ads.googleads.v6.resources.HotelPerformanceView;
import com.google.ads.googleads.v6.resources.HotelPerformanceViewName;
import com.google.ads.googleads.v6.services.stub.HotelPerformanceViewServiceStub;
import com.google.ads.googleads.v6.services.stub.HotelPerformanceViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage Hotel Performance Views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the HotelPerformanceViewServiceClient object to clean up
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
 * HotelPerformanceViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * HotelPerformanceViewServiceSettings hotelPerformanceViewServiceSettings =
 *     HotelPerformanceViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * HotelPerformanceViewServiceClient hotelPerformanceViewServiceClient =
 *     HotelPerformanceViewServiceClient.create(hotelPerformanceViewServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * HotelPerformanceViewServiceSettings hotelPerformanceViewServiceSettings =
 *     HotelPerformanceViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * HotelPerformanceViewServiceClient hotelPerformanceViewServiceClient =
 *     HotelPerformanceViewServiceClient.create(hotelPerformanceViewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class HotelPerformanceViewServiceClient implements BackgroundResource {
  private final HotelPerformanceViewServiceSettings settings;
  private final HotelPerformanceViewServiceStub stub;

  /** Constructs an instance of HotelPerformanceViewServiceClient with default settings. */
  public static final HotelPerformanceViewServiceClient create() throws IOException {
    return create(HotelPerformanceViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of HotelPerformanceViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final HotelPerformanceViewServiceClient create(
      HotelPerformanceViewServiceSettings settings) throws IOException {
    return new HotelPerformanceViewServiceClient(settings);
  }

  /**
   * Constructs an instance of HotelPerformanceViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(HotelPerformanceViewServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final HotelPerformanceViewServiceClient create(
      HotelPerformanceViewServiceStub stub) {
    return new HotelPerformanceViewServiceClient(stub);
  }

  /**
   * Constructs an instance of HotelPerformanceViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HotelPerformanceViewServiceClient(HotelPerformanceViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((HotelPerformanceViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected HotelPerformanceViewServiceClient(HotelPerformanceViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final HotelPerformanceViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public HotelPerformanceViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Hotel Performance View in full detail.
   *
   * @param resource_name Required. Resource name of the Hotel Performance View to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HotelPerformanceView getHotelPerformanceView(HotelPerformanceViewName resourceName) {
    GetHotelPerformanceViewRequest request =
        GetHotelPerformanceViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getHotelPerformanceView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Hotel Performance View in full detail.
   *
   * @param resource_name Required. Resource name of the Hotel Performance View to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HotelPerformanceView getHotelPerformanceView(String resourceName) {
    GetHotelPerformanceViewRequest request =
        GetHotelPerformanceViewRequest.newBuilder().setResourceName(resourceName).build();
    return getHotelPerformanceView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Hotel Performance View in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HotelPerformanceView getHotelPerformanceView(
      GetHotelPerformanceViewRequest request) {
    return getHotelPerformanceViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Hotel Performance View in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetHotelPerformanceViewRequest, HotelPerformanceView>
      getHotelPerformanceViewCallable() {
    return stub.getHotelPerformanceViewCallable();
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
