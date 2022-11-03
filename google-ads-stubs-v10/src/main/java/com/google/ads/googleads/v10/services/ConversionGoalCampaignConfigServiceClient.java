/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v10.services;

import com.google.ads.googleads.v10.services.stub.ConversionGoalCampaignConfigServiceStub;
import com.google.ads.googleads.v10.services.stub.ConversionGoalCampaignConfigServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage conversion goal campaign config.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ConversionGoalCampaignConfigServiceClient conversionGoalCampaignConfigServiceClient =
 *     ConversionGoalCampaignConfigServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ConversionGoalCampaignConfigOperation> operations = new ArrayList<>();
 *   MutateConversionGoalCampaignConfigsResponse response =
 *       conversionGoalCampaignConfigServiceClient.mutateConversionGoalCampaignConfigs(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ConversionGoalCampaignConfigServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
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
 * ConversionGoalCampaignConfigServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ConversionGoalCampaignConfigServiceSettings conversionGoalCampaignConfigServiceSettings =
 *     ConversionGoalCampaignConfigServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ConversionGoalCampaignConfigServiceClient conversionGoalCampaignConfigServiceClient =
 *     ConversionGoalCampaignConfigServiceClient.create(
 *         conversionGoalCampaignConfigServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ConversionGoalCampaignConfigServiceSettings conversionGoalCampaignConfigServiceSettings =
 *     ConversionGoalCampaignConfigServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ConversionGoalCampaignConfigServiceClient conversionGoalCampaignConfigServiceClient =
 *     ConversionGoalCampaignConfigServiceClient.create(
 *         conversionGoalCampaignConfigServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ConversionGoalCampaignConfigServiceClient implements BackgroundResource {
  private final ConversionGoalCampaignConfigServiceSettings settings;
  private final ConversionGoalCampaignConfigServiceStub stub;

  /** Constructs an instance of ConversionGoalCampaignConfigServiceClient with default settings. */
  public static final ConversionGoalCampaignConfigServiceClient create() throws IOException {
    return create(ConversionGoalCampaignConfigServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ConversionGoalCampaignConfigServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final ConversionGoalCampaignConfigServiceClient create(
      ConversionGoalCampaignConfigServiceSettings settings) throws IOException {
    return new ConversionGoalCampaignConfigServiceClient(settings);
  }

  /**
   * Constructs an instance of ConversionGoalCampaignConfigServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(ConversionGoalCampaignConfigServiceSettings).
   */
  public static final ConversionGoalCampaignConfigServiceClient create(
      ConversionGoalCampaignConfigServiceStub stub) {
    return new ConversionGoalCampaignConfigServiceClient(stub);
  }

  /**
   * Constructs an instance of ConversionGoalCampaignConfigServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected ConversionGoalCampaignConfigServiceClient(
      ConversionGoalCampaignConfigServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((ConversionGoalCampaignConfigServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ConversionGoalCampaignConfigServiceClient(
      ConversionGoalCampaignConfigServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ConversionGoalCampaignConfigServiceSettings getSettings() {
    return settings;
  }

  public ConversionGoalCampaignConfigServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes conversion goal campaign config. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ConversionGoalCampaignConfigServiceClient conversionGoalCampaignConfigServiceClient =
   *     ConversionGoalCampaignConfigServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<ConversionGoalCampaignConfigOperation> operations = new ArrayList<>();
   *   MutateConversionGoalCampaignConfigsResponse response =
   *       conversionGoalCampaignConfigServiceClient.mutateConversionGoalCampaignConfigs(
   *           customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose custom conversion goals are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual conversion goal
   *     campaign config.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateConversionGoalCampaignConfigsResponse mutateConversionGoalCampaignConfigs(
      String customerId, List<ConversionGoalCampaignConfigOperation> operations) {
    MutateConversionGoalCampaignConfigsRequest request =
        MutateConversionGoalCampaignConfigsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateConversionGoalCampaignConfigs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes conversion goal campaign config. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ConversionGoalCampaignConfigServiceClient conversionGoalCampaignConfigServiceClient =
   *     ConversionGoalCampaignConfigServiceClient.create()) {
   *   MutateConversionGoalCampaignConfigsRequest request =
   *       MutateConversionGoalCampaignConfigsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ConversionGoalCampaignConfigOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   MutateConversionGoalCampaignConfigsResponse response =
   *       conversionGoalCampaignConfigServiceClient.mutateConversionGoalCampaignConfigs(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateConversionGoalCampaignConfigsResponse mutateConversionGoalCampaignConfigs(
      MutateConversionGoalCampaignConfigsRequest request) {
    return mutateConversionGoalCampaignConfigsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes conversion goal campaign config. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ConversionGoalCampaignConfigServiceClient conversionGoalCampaignConfigServiceClient =
   *     ConversionGoalCampaignConfigServiceClient.create()) {
   *   MutateConversionGoalCampaignConfigsRequest request =
   *       MutateConversionGoalCampaignConfigsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ConversionGoalCampaignConfigOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateConversionGoalCampaignConfigsResponse> future =
   *       conversionGoalCampaignConfigServiceClient
   *           .mutateConversionGoalCampaignConfigsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateConversionGoalCampaignConfigsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateConversionGoalCampaignConfigsRequest, MutateConversionGoalCampaignConfigsResponse>
      mutateConversionGoalCampaignConfigsCallable() {
    return stub.mutateConversionGoalCampaignConfigsCallable();
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
