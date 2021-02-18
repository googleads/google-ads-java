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

import com.google.ads.googleads.v6.resources.AdParameter;
import com.google.ads.googleads.v6.resources.AdParameterName;
import com.google.ads.googleads.v6.services.stub.AdParameterServiceStub;
import com.google.ads.googleads.v6.services.stub.AdParameterServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage ad parameters.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the AdParameterServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of AdParameterServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * AdParameterServiceSettings adParameterServiceSettings =
 *     AdParameterServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdParameterServiceClient adParameterServiceClient =
 *     AdParameterServiceClient.create(adParameterServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * AdParameterServiceSettings adParameterServiceSettings =
 *     AdParameterServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdParameterServiceClient adParameterServiceClient =
 *     AdParameterServiceClient.create(adParameterServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AdParameterServiceClient implements BackgroundResource {
  private final AdParameterServiceSettings settings;
  private final AdParameterServiceStub stub;

  /** Constructs an instance of AdParameterServiceClient with default settings. */
  public static final AdParameterServiceClient create() throws IOException {
    return create(AdParameterServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdParameterServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdParameterServiceClient create(AdParameterServiceSettings settings)
      throws IOException {
    return new AdParameterServiceClient(settings);
  }

  /**
   * Constructs an instance of AdParameterServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(AdParameterServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdParameterServiceClient create(AdParameterServiceStub stub) {
    return new AdParameterServiceClient(stub);
  }

  /**
   * Constructs an instance of AdParameterServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected AdParameterServiceClient(AdParameterServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdParameterServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdParameterServiceClient(AdParameterServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdParameterServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdParameterServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad parameter in full detail.
   *
   * @param resourceName Required. The resource name of the ad parameter to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdParameter getAdParameter(AdParameterName resourceName) {
    GetAdParameterRequest request =
        GetAdParameterRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getAdParameter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad parameter in full detail.
   *
   * @param resourceName Required. The resource name of the ad parameter to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdParameter getAdParameter(String resourceName) {
    GetAdParameterRequest request =
        GetAdParameterRequest.newBuilder().setResourceName(resourceName).build();
    return getAdParameter(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad parameter in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdParameter getAdParameter(GetAdParameterRequest request) {
    return getAdParameterCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested ad parameter in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetAdParameterRequest, AdParameter> getAdParameterCallable() {
    return stub.getAdParameterCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ad parameters. Operation statuses are returned.
   *
   * @param customerId Required. The ID of the customer whose ad parameters are being modified.
   * @param operations Required. The list of operations to perform on individual ad parameters.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdParametersResponse mutateAdParameters(
      String customerId, List<AdParameterOperation> operations) {
    MutateAdParametersRequest request =
        MutateAdParametersRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdParameters(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ad parameters. Operation statuses are returned.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdParametersResponse mutateAdParameters(MutateAdParametersRequest request) {
    return mutateAdParametersCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ad parameters. Operation statuses are returned.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<MutateAdParametersRequest, MutateAdParametersResponse>
      mutateAdParametersCallable() {
    return stub.mutateAdParametersCallable();
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
