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

import com.google.ads.googleads.v4.resources.AdGroupLabel;
import com.google.ads.googleads.v4.services.stub.AdGroupLabelServiceStub;
import com.google.ads.googleads.v4.services.stub.AdGroupLabelServiceStubSettings;
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
 * Service Description: Service to manage labels on ad groups.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
 *   String formattedResourceName = AdGroupLabelServiceClient.formatAdGroupLabelName("[CUSTOMER]", "[AD_GROUP_LABEL]");
 *   AdGroupLabel response = adGroupLabelServiceClient.getAdGroupLabel(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the adGroupLabelServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of AdGroupLabelServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AdGroupLabelServiceSettings adGroupLabelServiceSettings =
 *     AdGroupLabelServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupLabelServiceClient adGroupLabelServiceClient =
 *     AdGroupLabelServiceClient.create(adGroupLabelServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AdGroupLabelServiceSettings adGroupLabelServiceSettings =
 *     AdGroupLabelServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupLabelServiceClient adGroupLabelServiceClient =
 *     AdGroupLabelServiceClient.create(adGroupLabelServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdGroupLabelServiceClient implements BackgroundResource {
  private final AdGroupLabelServiceSettings settings;
  private final AdGroupLabelServiceStub stub;

  private static final PathTemplate AD_GROUP_LABEL_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/adGroupLabels/{ad_group_label}");

  /**
   * Formats a string containing the fully-qualified path to represent a ad_group_label resource.
   *
   * @deprecated Use the {@link AdGroupLabelName} class instead.
   */
  @Deprecated
  public static final String formatAdGroupLabelName(String customer, String adGroupLabel) {
    return AD_GROUP_LABEL_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "ad_group_label", adGroupLabel);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a ad_group_label
   * resource.
   *
   * @deprecated Use the {@link AdGroupLabelName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromAdGroupLabelName(String adGroupLabelName) {
    return AD_GROUP_LABEL_PATH_TEMPLATE.parse(adGroupLabelName).get("customer");
  }

  /**
   * Parses the ad_group_label from the given fully-qualified path which represents a ad_group_label
   * resource.
   *
   * @deprecated Use the {@link AdGroupLabelName} class instead.
   */
  @Deprecated
  public static final String parseAdGroupLabelFromAdGroupLabelName(String adGroupLabelName) {
    return AD_GROUP_LABEL_PATH_TEMPLATE.parse(adGroupLabelName).get("ad_group_label");
  }

  /** Constructs an instance of AdGroupLabelServiceClient with default settings. */
  public static final AdGroupLabelServiceClient create() throws IOException {
    return create(AdGroupLabelServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupLabelServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdGroupLabelServiceClient create(AdGroupLabelServiceSettings settings)
      throws IOException {
    return new AdGroupLabelServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupLabelServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use AdGroupLabelServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupLabelServiceClient create(AdGroupLabelServiceStub stub) {
    return new AdGroupLabelServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupLabelServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupLabelServiceClient(AdGroupLabelServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupLabelServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupLabelServiceClient(AdGroupLabelServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupLabelServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupLabelServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group label in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   String formattedResourceName = AdGroupLabelServiceClient.formatAdGroupLabelName("[CUSTOMER]", "[AD_GROUP_LABEL]");
   *   AdGroupLabel response = adGroupLabelServiceClient.getAdGroupLabel(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the ad group label to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupLabel getAdGroupLabel(String resourceName) {
    AD_GROUP_LABEL_PATH_TEMPLATE.validate(resourceName, "getAdGroupLabel");
    GetAdGroupLabelRequest request =
        GetAdGroupLabelRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupLabel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group label in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   String formattedResourceName = AdGroupLabelServiceClient.formatAdGroupLabelName("[CUSTOMER]", "[AD_GROUP_LABEL]");
   *   GetAdGroupLabelRequest request = GetAdGroupLabelRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   AdGroupLabel response = adGroupLabelServiceClient.getAdGroupLabel(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupLabel getAdGroupLabel(GetAdGroupLabelRequest request) {
    return getAdGroupLabelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group label in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   String formattedResourceName = AdGroupLabelServiceClient.formatAdGroupLabelName("[CUSTOMER]", "[AD_GROUP_LABEL]");
   *   GetAdGroupLabelRequest request = GetAdGroupLabelRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;AdGroupLabel&gt; future = adGroupLabelServiceClient.getAdGroupLabelCallable().futureCall(request);
   *   // Do something
   *   AdGroupLabel response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAdGroupLabelRequest, AdGroupLabel> getAdGroupLabelCallable() {
    return stub.getAdGroupLabelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes ad group labels. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateAdGroupLabelsResponse response = adGroupLabelServiceClient.mutateAdGroupLabels(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId Required. ID of the customer whose ad group labels are being modified.
   * @param operations Required. The list of operations to perform on ad group labels.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupLabelsResponse mutateAdGroupLabels(
      String customerId,
      List<AdGroupLabelOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {
    MutateAdGroupLabelsRequest request =
        MutateAdGroupLabelsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateAdGroupLabels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes ad group labels. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupLabelsResponse response = adGroupLabelServiceClient.mutateAdGroupLabels(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. ID of the customer whose ad group labels are being modified.
   * @param operations Required. The list of operations to perform on ad group labels.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupLabelsResponse mutateAdGroupLabels(
      String customerId, List<AdGroupLabelOperation> operations) {
    MutateAdGroupLabelsRequest request =
        MutateAdGroupLabelsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupLabels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes ad group labels. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupLabelsRequest request = MutateAdGroupLabelsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateAdGroupLabelsResponse response = adGroupLabelServiceClient.mutateAdGroupLabels(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupLabelsResponse mutateAdGroupLabels(MutateAdGroupLabelsRequest request) {
    return mutateAdGroupLabelsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates and removes ad group labels. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupLabelOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupLabelsRequest request = MutateAdGroupLabelsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateAdGroupLabelsResponse&gt; future = adGroupLabelServiceClient.mutateAdGroupLabelsCallable().futureCall(request);
   *   // Do something
   *   MutateAdGroupLabelsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateAdGroupLabelsRequest, MutateAdGroupLabelsResponse>
      mutateAdGroupLabelsCallable() {
    return stub.mutateAdGroupLabelsCallable();
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
