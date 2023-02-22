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

package com.google.ads.googleads.v13.services;

import com.google.ads.googleads.v13.services.stub.TravelAssetSuggestionServiceStub;
import com.google.ads.googleads.v13.services.stub.TravelAssetSuggestionServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to retrieve Travel asset suggestions.
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
 * try (TravelAssetSuggestionServiceClient travelAssetSuggestionServiceClient =
 *     TravelAssetSuggestionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   String languageOption = "languageOption-357816851";
 *   SuggestTravelAssetsResponse response =
 *       travelAssetSuggestionServiceClient.suggestTravelAssets(customerId, languageOption);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the TravelAssetSuggestionServiceClient object to clean up
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
 * TravelAssetSuggestionServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * TravelAssetSuggestionServiceSettings travelAssetSuggestionServiceSettings =
 *     TravelAssetSuggestionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TravelAssetSuggestionServiceClient travelAssetSuggestionServiceClient =
 *     TravelAssetSuggestionServiceClient.create(travelAssetSuggestionServiceSettings);
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
 * TravelAssetSuggestionServiceSettings travelAssetSuggestionServiceSettings =
 *     TravelAssetSuggestionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * TravelAssetSuggestionServiceClient travelAssetSuggestionServiceClient =
 *     TravelAssetSuggestionServiceClient.create(travelAssetSuggestionServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class TravelAssetSuggestionServiceClient implements BackgroundResource {
  private final TravelAssetSuggestionServiceSettings settings;
  private final TravelAssetSuggestionServiceStub stub;

  /** Constructs an instance of TravelAssetSuggestionServiceClient with default settings. */
  public static final TravelAssetSuggestionServiceClient create() throws IOException {
    return create(TravelAssetSuggestionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TravelAssetSuggestionServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final TravelAssetSuggestionServiceClient create(
      TravelAssetSuggestionServiceSettings settings) throws IOException {
    return new TravelAssetSuggestionServiceClient(settings);
  }

  /**
   * Constructs an instance of TravelAssetSuggestionServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(TravelAssetSuggestionServiceSettings).
   */
  public static final TravelAssetSuggestionServiceClient create(
      TravelAssetSuggestionServiceStub stub) {
    return new TravelAssetSuggestionServiceClient(stub);
  }

  /**
   * Constructs an instance of TravelAssetSuggestionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected TravelAssetSuggestionServiceClient(TravelAssetSuggestionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((TravelAssetSuggestionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected TravelAssetSuggestionServiceClient(TravelAssetSuggestionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TravelAssetSuggestionServiceSettings getSettings() {
    return settings;
  }

  public TravelAssetSuggestionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns Travel Asset suggestions. Asset suggestions are returned on a best-effort basis. There
   * are no guarantees that all possible asset types will be returned for any given hotel property.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TravelAssetSuggestionServiceClient travelAssetSuggestionServiceClient =
   *     TravelAssetSuggestionServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   String languageOption = "languageOption-357816851";
   *   SuggestTravelAssetsResponse response =
   *       travelAssetSuggestionServiceClient.suggestTravelAssets(customerId, languageOption);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer.
   * @param languageOption Required. The language specifications in BCP 47 format (for example,
   *     en-US, zh-CN, etc.) for the asset suggestions. Text will be in this language. Usually
   *     matches one of the campaign target languages.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestTravelAssetsResponse suggestTravelAssets(
      String customerId, String languageOption) {
    SuggestTravelAssetsRequest request =
        SuggestTravelAssetsRequest.newBuilder()
            .setCustomerId(customerId)
            .setLanguageOption(languageOption)
            .build();
    return suggestTravelAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns Travel Asset suggestions. Asset suggestions are returned on a best-effort basis. There
   * are no guarantees that all possible asset types will be returned for any given hotel property.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TravelAssetSuggestionServiceClient travelAssetSuggestionServiceClient =
   *     TravelAssetSuggestionServiceClient.create()) {
   *   SuggestTravelAssetsRequest request =
   *       SuggestTravelAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setLanguageOption("languageOption-357816851")
   *           .addAllPlaceId(new ArrayList<String>())
   *           .build();
   *   SuggestTravelAssetsResponse response =
   *       travelAssetSuggestionServiceClient.suggestTravelAssets(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestTravelAssetsResponse suggestTravelAssets(SuggestTravelAssetsRequest request) {
    return suggestTravelAssetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns Travel Asset suggestions. Asset suggestions are returned on a best-effort basis. There
   * are no guarantees that all possible asset types will be returned for any given hotel property.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TravelAssetSuggestionServiceClient travelAssetSuggestionServiceClient =
   *     TravelAssetSuggestionServiceClient.create()) {
   *   SuggestTravelAssetsRequest request =
   *       SuggestTravelAssetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setLanguageOption("languageOption-357816851")
   *           .addAllPlaceId(new ArrayList<String>())
   *           .build();
   *   ApiFuture<SuggestTravelAssetsResponse> future =
   *       travelAssetSuggestionServiceClient.suggestTravelAssetsCallable().futureCall(request);
   *   // Do something.
   *   SuggestTravelAssetsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SuggestTravelAssetsRequest, SuggestTravelAssetsResponse>
      suggestTravelAssetsCallable() {
    return stub.suggestTravelAssetsCallable();
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
