/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.services.stub.SmartCampaignSuggestServiceStub;
import com.google.ads.googleads.v8.services.stub.SmartCampaignSuggestServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to get suggestions for Smart Campaigns.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
 *     SmartCampaignSuggestServiceClient.create()) {
 *   SuggestSmartCampaignBudgetOptionsRequest request =
 *       SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
 *           .setCustomerId("customerId-1581184615")
 *           .build();
 *   SuggestSmartCampaignBudgetOptionsResponse response =
 *       smartCampaignSuggestServiceClient.suggestSmartCampaignBudgetOptions(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the SmartCampaignSuggestServiceClient object to clean up
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
 * SmartCampaignSuggestServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * SmartCampaignSuggestServiceSettings smartCampaignSuggestServiceSettings =
 *     SmartCampaignSuggestServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
 *     SmartCampaignSuggestServiceClient.create(smartCampaignSuggestServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * SmartCampaignSuggestServiceSettings smartCampaignSuggestServiceSettings =
 *     SmartCampaignSuggestServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
 *     SmartCampaignSuggestServiceClient.create(smartCampaignSuggestServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class SmartCampaignSuggestServiceClient implements BackgroundResource {
  private final SmartCampaignSuggestServiceSettings settings;
  private final SmartCampaignSuggestServiceStub stub;

  /** Constructs an instance of SmartCampaignSuggestServiceClient with default settings. */
  public static final SmartCampaignSuggestServiceClient create() throws IOException {
    return create(SmartCampaignSuggestServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SmartCampaignSuggestServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final SmartCampaignSuggestServiceClient create(
      SmartCampaignSuggestServiceSettings settings) throws IOException {
    return new SmartCampaignSuggestServiceClient(settings);
  }

  /**
   * Constructs an instance of SmartCampaignSuggestServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(SmartCampaignSuggestServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SmartCampaignSuggestServiceClient create(
      SmartCampaignSuggestServiceStub stub) {
    return new SmartCampaignSuggestServiceClient(stub);
  }

  /**
   * Constructs an instance of SmartCampaignSuggestServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected SmartCampaignSuggestServiceClient(SmartCampaignSuggestServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((SmartCampaignSuggestServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SmartCampaignSuggestServiceClient(SmartCampaignSuggestServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SmartCampaignSuggestServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SmartCampaignSuggestServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns BudgetOption suggestions.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestSmartCampaignBudgetOptionsRequest request =
   *       SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   SuggestSmartCampaignBudgetOptionsResponse response =
   *       smartCampaignSuggestServiceClient.suggestSmartCampaignBudgetOptions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestSmartCampaignBudgetOptionsResponse suggestSmartCampaignBudgetOptions(
      SuggestSmartCampaignBudgetOptionsRequest request) {
    return suggestSmartCampaignBudgetOptionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns BudgetOption suggestions.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestSmartCampaignBudgetOptionsRequest request =
   *       SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   ApiFuture<SuggestSmartCampaignBudgetOptionsResponse> future =
   *       smartCampaignSuggestServiceClient
   *           .suggestSmartCampaignBudgetOptionsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   SuggestSmartCampaignBudgetOptionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          SuggestSmartCampaignBudgetOptionsRequest, SuggestSmartCampaignBudgetOptionsResponse>
      suggestSmartCampaignBudgetOptionsCallable() {
    return stub.suggestSmartCampaignBudgetOptionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Suggests a Smart campaign ad compatible with the Ad family of resources, based on data points
   * such as targeting and the business to advertise.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestSmartCampaignAdRequest request =
   *       SuggestSmartCampaignAdRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setSuggestionInfo(SmartCampaignSuggestionInfo.newBuilder().build())
   *           .build();
   *   SuggestSmartCampaignAdResponse response =
   *       smartCampaignSuggestServiceClient.suggestSmartCampaignAd(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestSmartCampaignAdResponse suggestSmartCampaignAd(
      SuggestSmartCampaignAdRequest request) {
    return suggestSmartCampaignAdCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Suggests a Smart campaign ad compatible with the Ad family of resources, based on data points
   * such as targeting and the business to advertise.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestSmartCampaignAdRequest request =
   *       SuggestSmartCampaignAdRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setSuggestionInfo(SmartCampaignSuggestionInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<SuggestSmartCampaignAdResponse> future =
   *       smartCampaignSuggestServiceClient.suggestSmartCampaignAdCallable().futureCall(request);
   *   // Do something.
   *   SuggestSmartCampaignAdResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>
      suggestSmartCampaignAdCallable() {
    return stub.suggestSmartCampaignAdCallable();
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
