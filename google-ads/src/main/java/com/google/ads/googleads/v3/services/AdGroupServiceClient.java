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
package com.google.ads.googleads.v3.services;

import com.google.ads.googleads.v3.resources.AdGroup;
import com.google.ads.googleads.v3.services.stub.AdGroupServiceStub;
import com.google.ads.googleads.v3.services.stub.AdGroupServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage ad groups.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
 *   AdGroupName resourceName = AdGroupName.of("[CUSTOMER]", "[AD_GROUP]");
 *   AdGroup response = adGroupServiceClient.getAdGroup(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the adGroupServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of AdGroupServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AdGroupServiceSettings adGroupServiceSettings =
 *     AdGroupServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupServiceClient adGroupServiceClient =
 *     AdGroupServiceClient.create(adGroupServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AdGroupServiceSettings adGroupServiceSettings =
 *     AdGroupServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupServiceClient adGroupServiceClient =
 *     AdGroupServiceClient.create(adGroupServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdGroupServiceClient implements BackgroundResource {
  private final AdGroupServiceSettings settings;
  private final AdGroupServiceStub stub;

  /** Constructs an instance of AdGroupServiceClient with default settings. */
  public static final AdGroupServiceClient create() throws IOException {
    return create(AdGroupServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdGroupServiceClient create(AdGroupServiceSettings settings)
      throws IOException {
    return new AdGroupServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use AdGroupServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupServiceClient create(AdGroupServiceStub stub) {
    return new AdGroupServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected AdGroupServiceClient(AdGroupServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupServiceClient(AdGroupServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
   *   AdGroupName resourceName = AdGroupName.of("[CUSTOMER]", "[AD_GROUP]");
   *   AdGroup response = adGroupServiceClient.getAdGroup(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the ad group to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroup getAdGroup(AdGroupName resourceName) {
    GetAdGroupRequest request =
        GetAdGroupRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAdGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
   *   AdGroupName resourceName = AdGroupName.of("[CUSTOMER]", "[AD_GROUP]");
   *   AdGroup response = adGroupServiceClient.getAdGroup(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the ad group to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroup getAdGroup(String resourceName) {
    GetAdGroupRequest request =
        GetAdGroupRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
   *   AdGroupName resourceName = AdGroupName.of("[CUSTOMER]", "[AD_GROUP]");
   *   GetAdGroupRequest request = GetAdGroupRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   AdGroup response = adGroupServiceClient.getAdGroup(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroup getAdGroup(GetAdGroupRequest request) {
    return getAdGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
   *   AdGroupName resourceName = AdGroupName.of("[CUSTOMER]", "[AD_GROUP]");
   *   GetAdGroupRequest request = GetAdGroupRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;AdGroup&gt; future = adGroupServiceClient.getAdGroupCallable().futureCall(request);
   *   // Do something
   *   AdGroup response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAdGroupRequest, AdGroup> getAdGroupCallable() {
    return stub.getAdGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ad groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupsResponse response = adGroupServiceClient.mutateAdGroups(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose ad groups are being modified.
   * @param operations Required. The list of operations to perform on individual ad groups.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupsResponse mutateAdGroups(
      String customerId, List<AdGroupOperation> operations) {
    MutateAdGroupsRequest request =
        MutateAdGroupsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ad groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupsRequest request = MutateAdGroupsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateAdGroupsResponse response = adGroupServiceClient.mutateAdGroups(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupsResponse mutateAdGroups(MutateAdGroupsRequest request) {
    return mutateAdGroupsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ad groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupsRequest request = MutateAdGroupsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateAdGroupsResponse&gt; future = adGroupServiceClient.mutateAdGroupsCallable().futureCall(request);
   *   // Do something
   *   MutateAdGroupsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateAdGroupsRequest, MutateAdGroupsResponse>
      mutateAdGroupsCallable() {
    return stub.mutateAdGroupsCallable();
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
