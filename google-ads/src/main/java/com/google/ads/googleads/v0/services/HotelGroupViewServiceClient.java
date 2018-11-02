/*
 * Copyright 2018 Google LLC
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
package com.google.ads.googleads.v0.services;

import com.google.ads.googleads.v0.resources.HotelGroupView;
import com.google.ads.googleads.v0.services.stub.HotelGroupViewServiceStub;
import com.google.ads.googleads.v0.services.stub.HotelGroupViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage Hotel Group Views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (HotelGroupViewServiceClient hotelGroupViewServiceClient = HotelGroupViewServiceClient.create()) {
 *   String formattedResourceName = HotelGroupViewServiceClient.formatHotelGroupViewName("[CUSTOMER]", "[HOTEL_GROUP_VIEW]");
 *   HotelGroupView response = hotelGroupViewServiceClient.getHotelGroupView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the hotelGroupViewServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of HotelGroupViewServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * HotelGroupViewServiceSettings hotelGroupViewServiceSettings =
 *     HotelGroupViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * HotelGroupViewServiceClient hotelGroupViewServiceClient =
 *     HotelGroupViewServiceClient.create(hotelGroupViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * HotelGroupViewServiceSettings hotelGroupViewServiceSettings =
 *     HotelGroupViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * HotelGroupViewServiceClient hotelGroupViewServiceClient =
 *     HotelGroupViewServiceClient.create(hotelGroupViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class HotelGroupViewServiceClient implements BackgroundResource {
  private final HotelGroupViewServiceSettings settings;
  private final HotelGroupViewServiceStub stub;

  private static final PathTemplate HOTEL_GROUP_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/hotelGroupViews/{hotel_group_view}");

  /**
   * Formats a string containing the fully-qualified path to represent a hotel_group_view resource.
   */
  public static final String formatHotelGroupViewName(String customer, String hotelGroupView) {
    return HOTEL_GROUP_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "hotel_group_view", hotelGroupView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a hotel_group_view
   * resource.
   */
  public static final String parseCustomerFromHotelGroupViewName(String hotelGroupViewName) {
    return HOTEL_GROUP_VIEW_PATH_TEMPLATE.parse(hotelGroupViewName).get("customer");
  }

  /**
   * Parses the hotel_group_view from the given fully-qualified path which represents a
   * hotel_group_view resource.
   */
  public static final String parseHotelGroupViewFromHotelGroupViewName(String hotelGroupViewName) {
    return HOTEL_GROUP_VIEW_PATH_TEMPLATE.parse(hotelGroupViewName).get("hotel_group_view");
  }

  /** Constructs an instance of HotelGroupViewServiceClient with default settings. */
  public static final HotelGroupViewServiceClient create() throws IOException {
    return create(HotelGroupViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of HotelGroupViewServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final HotelGroupViewServiceClient create(HotelGroupViewServiceSettings settings)
      throws IOException {
    return new HotelGroupViewServiceClient(settings);
  }

  /**
   * Constructs an instance of HotelGroupViewServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use HotelGroupViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final HotelGroupViewServiceClient create(HotelGroupViewServiceStub stub) {
    return new HotelGroupViewServiceClient(stub);
  }

  /**
   * Constructs an instance of HotelGroupViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HotelGroupViewServiceClient(HotelGroupViewServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((HotelGroupViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected HotelGroupViewServiceClient(HotelGroupViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final HotelGroupViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public HotelGroupViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Hotel Group View in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HotelGroupViewServiceClient hotelGroupViewServiceClient = HotelGroupViewServiceClient.create()) {
   *   String formattedResourceName = HotelGroupViewServiceClient.formatHotelGroupViewName("[CUSTOMER]", "[HOTEL_GROUP_VIEW]");
   *   HotelGroupView response = hotelGroupViewServiceClient.getHotelGroupView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Resource name of the Hotel Group View to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final HotelGroupView getHotelGroupView(String resourceName) {
    HOTEL_GROUP_VIEW_PATH_TEMPLATE.validate(resourceName, "getHotelGroupView");
    GetHotelGroupViewRequest request =
        GetHotelGroupViewRequest.newBuilder().setResourceName(resourceName).build();
    return getHotelGroupView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Hotel Group View in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HotelGroupViewServiceClient hotelGroupViewServiceClient = HotelGroupViewServiceClient.create()) {
   *   String formattedResourceName = HotelGroupViewServiceClient.formatHotelGroupViewName("[CUSTOMER]", "[HOTEL_GROUP_VIEW]");
   *   GetHotelGroupViewRequest request = GetHotelGroupViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   HotelGroupView response = hotelGroupViewServiceClient.getHotelGroupView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final HotelGroupView getHotelGroupView(GetHotelGroupViewRequest request) {
    return getHotelGroupViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Hotel Group View in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HotelGroupViewServiceClient hotelGroupViewServiceClient = HotelGroupViewServiceClient.create()) {
   *   String formattedResourceName = HotelGroupViewServiceClient.formatHotelGroupViewName("[CUSTOMER]", "[HOTEL_GROUP_VIEW]");
   *   GetHotelGroupViewRequest request = GetHotelGroupViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;HotelGroupView&gt; future = hotelGroupViewServiceClient.getHotelGroupViewCallable().futureCall(request);
   *   // Do something
   *   HotelGroupView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetHotelGroupViewRequest, HotelGroupView> getHotelGroupViewCallable() {
    return stub.getHotelGroupViewCallable();
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
