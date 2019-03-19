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

import com.google.ads.googleads.v1.resources.AdGroupAd;
import com.google.ads.googleads.v1.services.stub.AdGroupAdServiceStub;
import com.google.ads.googleads.v1.services.stub.AdGroupAdServiceStubSettings;
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
 * Service Description: Service to manage ads in an ad group.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
 *   String formattedResourceName = AdGroupAdServiceClient.formatAdGroupAdName("[CUSTOMER]", "[AD_GROUP_AD]");
 *   AdGroupAd response = adGroupAdServiceClient.getAdGroupAd(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the adGroupAdServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of AdGroupAdServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AdGroupAdServiceSettings adGroupAdServiceSettings =
 *     AdGroupAdServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupAdServiceClient adGroupAdServiceClient =
 *     AdGroupAdServiceClient.create(adGroupAdServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AdGroupAdServiceSettings adGroupAdServiceSettings =
 *     AdGroupAdServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupAdServiceClient adGroupAdServiceClient =
 *     AdGroupAdServiceClient.create(adGroupAdServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdGroupAdServiceClient implements BackgroundResource {
  private final AdGroupAdServiceSettings settings;
  private final AdGroupAdServiceStub stub;

  private static final PathTemplate AD_GROUP_AD_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/adGroupAds/{ad_group_ad}");

  /** Formats a string containing the fully-qualified path to represent a ad_group_ad resource. */
  public static final String formatAdGroupAdName(String customer, String adGroupAd) {
    return AD_GROUP_AD_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "ad_group_ad", adGroupAd);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a ad_group_ad
   * resource.
   */
  public static final String parseCustomerFromAdGroupAdName(String adGroupAdName) {
    return AD_GROUP_AD_PATH_TEMPLATE.parse(adGroupAdName).get("customer");
  }

  /**
   * Parses the ad_group_ad from the given fully-qualified path which represents a ad_group_ad
   * resource.
   */
  public static final String parseAdGroupAdFromAdGroupAdName(String adGroupAdName) {
    return AD_GROUP_AD_PATH_TEMPLATE.parse(adGroupAdName).get("ad_group_ad");
  }

  /** Constructs an instance of AdGroupAdServiceClient with default settings. */
  public static final AdGroupAdServiceClient create() throws IOException {
    return create(AdGroupAdServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupAdServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdGroupAdServiceClient create(AdGroupAdServiceSettings settings)
      throws IOException {
    return new AdGroupAdServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupAdServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use AdGroupAdServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupAdServiceClient create(AdGroupAdServiceStub stub) {
    return new AdGroupAdServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupAdServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected AdGroupAdServiceClient(AdGroupAdServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupAdServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupAdServiceClient(AdGroupAdServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupAdServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupAdServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   String formattedResourceName = AdGroupAdServiceClient.formatAdGroupAdName("[CUSTOMER]", "[AD_GROUP_AD]");
   *   AdGroupAd response = adGroupAdServiceClient.getAdGroupAd(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the ad to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAd getAdGroupAd(String resourceName) {
    AD_GROUP_AD_PATH_TEMPLATE.validate(resourceName, "getAdGroupAd");
    GetAdGroupAdRequest request =
        GetAdGroupAdRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupAd(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   String formattedResourceName = AdGroupAdServiceClient.formatAdGroupAdName("[CUSTOMER]", "[AD_GROUP_AD]");
   *   GetAdGroupAdRequest request = GetAdGroupAdRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   AdGroupAd response = adGroupAdServiceClient.getAdGroupAd(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupAd getAdGroupAd(GetAdGroupAdRequest request) {
    return getAdGroupAdCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   String formattedResourceName = AdGroupAdServiceClient.formatAdGroupAdName("[CUSTOMER]", "[AD_GROUP_AD]");
   *   GetAdGroupAdRequest request = GetAdGroupAdRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;AdGroupAd&gt; future = adGroupAdServiceClient.getAdGroupAdCallable().futureCall(request);
   *   // Do something
   *   AdGroupAd response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAdGroupAdRequest, AdGroupAd> getAdGroupAdCallable() {
    return stub.getAdGroupAdCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ads. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupAdOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateAdGroupAdsResponse response = adGroupAdServiceClient.mutateAdGroupAds(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose ads are being modified.
   * @param operations The list of operations to perform on individual ads.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupAdsResponse mutateAdGroupAds(
      String customerId,
      List<AdGroupAdOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateAdGroupAdsRequest request =
        MutateAdGroupAdsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateAdGroupAds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ads. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupAdOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupAdsResponse response = adGroupAdServiceClient.mutateAdGroupAds(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose ads are being modified.
   * @param operations The list of operations to perform on individual ads.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupAdsResponse mutateAdGroupAds(
      String customerId, List<AdGroupAdOperation> operations) {

    MutateAdGroupAdsRequest request =
        MutateAdGroupAdsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupAds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ads. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupAdOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupAdsRequest request = MutateAdGroupAdsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateAdGroupAdsResponse response = adGroupAdServiceClient.mutateAdGroupAds(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupAdsResponse mutateAdGroupAds(MutateAdGroupAdsRequest request) {
    return mutateAdGroupAdsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ads. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupAdOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupAdsRequest request = MutateAdGroupAdsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateAdGroupAdsResponse&gt; future = adGroupAdServiceClient.mutateAdGroupAdsCallable().futureCall(request);
   *   // Do something
   *   MutateAdGroupAdsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateAdGroupAdsRequest, MutateAdGroupAdsResponse>
      mutateAdGroupAdsCallable() {
    return stub.mutateAdGroupAdsCallable();
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
