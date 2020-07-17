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
package com.google.ads.googleads.v4.services;

import com.google.ads.googleads.v4.resources.ManagedPlacementView;
import com.google.ads.googleads.v4.services.stub.ManagedPlacementViewServiceStub;
import com.google.ads.googleads.v4.services.stub.ManagedPlacementViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage Managed Placement views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ManagedPlacementViewServiceClient managedPlacementViewServiceClient = ManagedPlacementViewServiceClient.create()) {
 *   String formattedResourceName = ManagedPlacementViewServiceClient.formatManagedPlacementViewName("[CUSTOMER]", "[MANAGED_PLACEMENT_VIEW]");
 *   ManagedPlacementView response = managedPlacementViewServiceClient.getManagedPlacementView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the managedPlacementViewServiceClient object to clean up
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
 * ManagedPlacementViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ManagedPlacementViewServiceSettings managedPlacementViewServiceSettings =
 *     ManagedPlacementViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ManagedPlacementViewServiceClient managedPlacementViewServiceClient =
 *     ManagedPlacementViewServiceClient.create(managedPlacementViewServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ManagedPlacementViewServiceSettings managedPlacementViewServiceSettings =
 *     ManagedPlacementViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ManagedPlacementViewServiceClient managedPlacementViewServiceClient =
 *     ManagedPlacementViewServiceClient.create(managedPlacementViewServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ManagedPlacementViewServiceClient implements BackgroundResource {
  private final ManagedPlacementViewServiceSettings settings;
  private final ManagedPlacementViewServiceStub stub;

  private static final PathTemplate MANAGED_PLACEMENT_VIEW_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/managedPlacementViews/{managed_placement_view}");

  /**
   * Formats a string containing the fully-qualified path to represent a managed_placement_view
   * resource.
   *
   * @deprecated Use the {@link ManagedPlacementViewName} class instead.
   */
  @Deprecated
  public static final String formatManagedPlacementViewName(
      String customer, String managedPlacementView) {
    return MANAGED_PLACEMENT_VIEW_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "managed_placement_view", managedPlacementView);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a
   * managed_placement_view resource.
   *
   * @deprecated Use the {@link ManagedPlacementViewName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromManagedPlacementViewName(
      String managedPlacementViewName) {
    return MANAGED_PLACEMENT_VIEW_PATH_TEMPLATE.parse(managedPlacementViewName).get("customer");
  }

  /**
   * Parses the managed_placement_view from the given fully-qualified path which represents a
   * managed_placement_view resource.
   *
   * @deprecated Use the {@link ManagedPlacementViewName} class instead.
   */
  @Deprecated
  public static final String parseManagedPlacementViewFromManagedPlacementViewName(
      String managedPlacementViewName) {
    return MANAGED_PLACEMENT_VIEW_PATH_TEMPLATE
        .parse(managedPlacementViewName)
        .get("managed_placement_view");
  }

  /** Constructs an instance of ManagedPlacementViewServiceClient with default settings. */
  public static final ManagedPlacementViewServiceClient create() throws IOException {
    return create(ManagedPlacementViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ManagedPlacementViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ManagedPlacementViewServiceClient create(
      ManagedPlacementViewServiceSettings settings) throws IOException {
    return new ManagedPlacementViewServiceClient(settings);
  }

  /**
   * Constructs an instance of ManagedPlacementViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use ManagedPlacementViewServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ManagedPlacementViewServiceClient create(
      ManagedPlacementViewServiceStub stub) {
    return new ManagedPlacementViewServiceClient(stub);
  }

  /**
   * Constructs an instance of ManagedPlacementViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ManagedPlacementViewServiceClient(ManagedPlacementViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((ManagedPlacementViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ManagedPlacementViewServiceClient(ManagedPlacementViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ManagedPlacementViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ManagedPlacementViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Managed Placement view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedPlacementViewServiceClient managedPlacementViewServiceClient = ManagedPlacementViewServiceClient.create()) {
   *   String formattedResourceName = ManagedPlacementViewServiceClient.formatManagedPlacementViewName("[CUSTOMER]", "[MANAGED_PLACEMENT_VIEW]");
   *   ManagedPlacementView response = managedPlacementViewServiceClient.getManagedPlacementView(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the Managed Placement View to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ManagedPlacementView getManagedPlacementView(String resourceName) {
    MANAGED_PLACEMENT_VIEW_PATH_TEMPLATE.validate(resourceName, "getManagedPlacementView");
    GetManagedPlacementViewRequest request =
        GetManagedPlacementViewRequest.newBuilder().setResourceName(resourceName).build();
    return getManagedPlacementView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Managed Placement view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedPlacementViewServiceClient managedPlacementViewServiceClient = ManagedPlacementViewServiceClient.create()) {
   *   String formattedResourceName = ManagedPlacementViewServiceClient.formatManagedPlacementViewName("[CUSTOMER]", "[MANAGED_PLACEMENT_VIEW]");
   *   GetManagedPlacementViewRequest request = GetManagedPlacementViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ManagedPlacementView response = managedPlacementViewServiceClient.getManagedPlacementView(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ManagedPlacementView getManagedPlacementView(
      GetManagedPlacementViewRequest request) {
    return getManagedPlacementViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Managed Placement view in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedPlacementViewServiceClient managedPlacementViewServiceClient = ManagedPlacementViewServiceClient.create()) {
   *   String formattedResourceName = ManagedPlacementViewServiceClient.formatManagedPlacementViewName("[CUSTOMER]", "[MANAGED_PLACEMENT_VIEW]");
   *   GetManagedPlacementViewRequest request = GetManagedPlacementViewRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;ManagedPlacementView&gt; future = managedPlacementViewServiceClient.getManagedPlacementViewCallable().futureCall(request);
   *   // Do something
   *   ManagedPlacementView response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetManagedPlacementViewRequest, ManagedPlacementView>
      getManagedPlacementViewCallable() {
    return stub.getManagedPlacementViewCallable();
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
