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
package com.google.ads.googleads.v3.services;

import com.google.ads.googleads.v3.resources.Ad;
import com.google.ads.googleads.v3.services.stub.AdServiceStub;
import com.google.ads.googleads.v3.services.stub.AdServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage ads.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AdServiceClient adServiceClient = AdServiceClient.create()) {
 *   String formattedResourceName = AdServiceClient.formatAdName("[CUSTOMER]", "[AD]");
 *   Ad response = adServiceClient.getAd(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the adServiceClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of AdServiceSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AdServiceSettings adServiceSettings =
 *     AdServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdServiceClient adServiceClient =
 *     AdServiceClient.create(adServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AdServiceSettings adServiceSettings =
 *     AdServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdServiceClient adServiceClient =
 *     AdServiceClient.create(adServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdServiceClient implements BackgroundResource {
  private final AdServiceSettings settings;
  private final AdServiceStub stub;

  private static final PathTemplate AD_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/ads/{ad}");

  /**
   * Formats a string containing the fully-qualified path to represent a ad resource.
   *
   * @deprecated Use the {@link AdName} class instead.
   */
  @Deprecated
  public static final String formatAdName(String customer, String ad) {
    return AD_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "ad", ad);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a ad resource.
   *
   * @deprecated Use the {@link AdName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromAdName(String adName) {
    return AD_PATH_TEMPLATE.parse(adName).get("customer");
  }

  /**
   * Parses the ad from the given fully-qualified path which represents a ad resource.
   *
   * @deprecated Use the {@link AdName} class instead.
   */
  @Deprecated
  public static final String parseAdFromAdName(String adName) {
    return AD_PATH_TEMPLATE.parse(adName).get("ad");
  }

  /** Constructs an instance of AdServiceClient with default settings. */
  public static final AdServiceClient create() throws IOException {
    return create(AdServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdServiceClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdServiceClient create(AdServiceSettings settings) throws IOException {
    return new AdServiceClient(settings);
  }

  /**
   * Constructs an instance of AdServiceClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use AdServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdServiceClient create(AdServiceStub stub) {
    return new AdServiceClient(stub);
  }

  /**
   * Constructs an instance of AdServiceClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected AdServiceClient(AdServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdServiceClient(AdServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdServiceClient adServiceClient = AdServiceClient.create()) {
   *   String formattedResourceName = AdServiceClient.formatAdName("[CUSTOMER]", "[AD]");
   *   Ad response = adServiceClient.getAd(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the ad to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Ad getAd(String resourceName) {
    AD_PATH_TEMPLATE.validate(resourceName, "getAd");
    GetAdRequest request = GetAdRequest.newBuilder().setResourceName(resourceName).build();
    return getAd(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdServiceClient adServiceClient = AdServiceClient.create()) {
   *   String formattedResourceName = AdServiceClient.formatAdName("[CUSTOMER]", "[AD]");
   *   GetAdRequest request = GetAdRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   Ad response = adServiceClient.getAd(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Ad getAd(GetAdRequest request) {
    return getAdCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdServiceClient adServiceClient = AdServiceClient.create()) {
   *   String formattedResourceName = AdServiceClient.formatAdName("[CUSTOMER]", "[AD]");
   *   GetAdRequest request = GetAdRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;Ad&gt; future = adServiceClient.getAdCallable().futureCall(request);
   *   // Do something
   *   Ad response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAdRequest, Ad> getAdCallable() {
    return stub.getAdCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates ads. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdServiceClient adServiceClient = AdServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdsResponse response = adServiceClient.mutateAds(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose ads are being modified.
   * @param operations Required. The list of operations to perform on individual ads.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdsResponse mutateAds(String customerId, List<AdOperation> operations) {

    MutateAdsRequest request =
        MutateAdsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates ads. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdServiceClient adServiceClient = AdServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdsRequest request = MutateAdsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateAdsResponse response = adServiceClient.mutateAds(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdsResponse mutateAds(MutateAdsRequest request) {
    return mutateAdsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates ads. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdServiceClient adServiceClient = AdServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdsRequest request = MutateAdsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateAdsResponse&gt; future = adServiceClient.mutateAdsCallable().futureCall(request);
   *   // Do something
   *   MutateAdsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateAdsRequest, MutateAdsResponse> mutateAdsCallable() {
    return stub.mutateAdsCallable();
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
