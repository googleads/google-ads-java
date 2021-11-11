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

package com.google.ads.googleads.v9.services;

import com.google.ads.googleads.v9.resources.ConversionValueRuleSet;
import com.google.ads.googleads.v9.resources.ConversionValueRuleSetName;
import com.google.ads.googleads.v9.services.stub.ConversionValueRuleSetServiceStub;
import com.google.ads.googleads.v9.services.stub.ConversionValueRuleSetServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage conversion value rule sets.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
 *     ConversionValueRuleSetServiceClient.create()) {
 *   ConversionValueRuleSetName resourceName =
 *       ConversionValueRuleSetName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_SET_ID]");
 *   ConversionValueRuleSet response =
 *       conversionValueRuleSetServiceClient.getConversionValueRuleSet(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ConversionValueRuleSetServiceClient object to clean up
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
 * ConversionValueRuleSetServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * ConversionValueRuleSetServiceSettings conversionValueRuleSetServiceSettings =
 *     ConversionValueRuleSetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
 *     ConversionValueRuleSetServiceClient.create(conversionValueRuleSetServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * ConversionValueRuleSetServiceSettings conversionValueRuleSetServiceSettings =
 *     ConversionValueRuleSetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
 *     ConversionValueRuleSetServiceClient.create(conversionValueRuleSetServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ConversionValueRuleSetServiceClient implements BackgroundResource {
  private final ConversionValueRuleSetServiceSettings settings;
  private final ConversionValueRuleSetServiceStub stub;

  /** Constructs an instance of ConversionValueRuleSetServiceClient with default settings. */
  public static final ConversionValueRuleSetServiceClient create() throws IOException {
    return create(ConversionValueRuleSetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ConversionValueRuleSetServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ConversionValueRuleSetServiceClient create(
      ConversionValueRuleSetServiceSettings settings) throws IOException {
    return new ConversionValueRuleSetServiceClient(settings);
  }

  /**
   * Constructs an instance of ConversionValueRuleSetServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(ConversionValueRuleSetServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ConversionValueRuleSetServiceClient create(
      ConversionValueRuleSetServiceStub stub) {
    return new ConversionValueRuleSetServiceClient(stub);
  }

  /**
   * Constructs an instance of ConversionValueRuleSetServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ConversionValueRuleSetServiceClient(ConversionValueRuleSetServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((ConversionValueRuleSetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ConversionValueRuleSetServiceClient(ConversionValueRuleSetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ConversionValueRuleSetServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ConversionValueRuleSetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion value rule set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
   *     ConversionValueRuleSetServiceClient.create()) {
   *   ConversionValueRuleSetName resourceName =
   *       ConversionValueRuleSetName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_SET_ID]");
   *   ConversionValueRuleSet response =
   *       conversionValueRuleSetServiceClient.getConversionValueRuleSet(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the conversion value rule set to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionValueRuleSet getConversionValueRuleSet(
      ConversionValueRuleSetName resourceName) {
    GetConversionValueRuleSetRequest request =
        GetConversionValueRuleSetRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getConversionValueRuleSet(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion value rule set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
   *     ConversionValueRuleSetServiceClient.create()) {
   *   String resourceName =
   *       ConversionValueRuleSetName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_SET_ID]")
   *           .toString();
   *   ConversionValueRuleSet response =
   *       conversionValueRuleSetServiceClient.getConversionValueRuleSet(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the conversion value rule set to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionValueRuleSet getConversionValueRuleSet(String resourceName) {
    GetConversionValueRuleSetRequest request =
        GetConversionValueRuleSetRequest.newBuilder().setResourceName(resourceName).build();
    return getConversionValueRuleSet(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion value rule set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
   *     ConversionValueRuleSetServiceClient.create()) {
   *   GetConversionValueRuleSetRequest request =
   *       GetConversionValueRuleSetRequest.newBuilder()
   *           .setResourceName(
   *               ConversionValueRuleSetName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_SET_ID]")
   *                   .toString())
   *           .build();
   *   ConversionValueRuleSet response =
   *       conversionValueRuleSetServiceClient.getConversionValueRuleSet(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionValueRuleSet getConversionValueRuleSet(
      GetConversionValueRuleSetRequest request) {
    return getConversionValueRuleSetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion value rule set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
   *     ConversionValueRuleSetServiceClient.create()) {
   *   GetConversionValueRuleSetRequest request =
   *       GetConversionValueRuleSetRequest.newBuilder()
   *           .setResourceName(
   *               ConversionValueRuleSetName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_SET_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<ConversionValueRuleSet> future =
   *       conversionValueRuleSetServiceClient
   *           .getConversionValueRuleSetCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConversionValueRuleSet response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetConversionValueRuleSetRequest, ConversionValueRuleSet>
      getConversionValueRuleSetCallable() {
    return stub.getConversionValueRuleSetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes conversion value rule sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
   *     ConversionValueRuleSetServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<ConversionValueRuleSetOperation> operations = new ArrayList<>();
   *   MutateConversionValueRuleSetsResponse response =
   *       conversionValueRuleSetServiceClient.mutateConversionValueRuleSets(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose conversion value rule sets are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual conversion value
   *     rule sets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateConversionValueRuleSetsResponse mutateConversionValueRuleSets(
      String customerId, List<ConversionValueRuleSetOperation> operations) {
    MutateConversionValueRuleSetsRequest request =
        MutateConversionValueRuleSetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateConversionValueRuleSets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes conversion value rule sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
   *     ConversionValueRuleSetServiceClient.create()) {
   *   MutateConversionValueRuleSetsRequest request =
   *       MutateConversionValueRuleSetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ConversionValueRuleSetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateConversionValueRuleSetsResponse response =
   *       conversionValueRuleSetServiceClient.mutateConversionValueRuleSets(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateConversionValueRuleSetsResponse mutateConversionValueRuleSets(
      MutateConversionValueRuleSetsRequest request) {
    return mutateConversionValueRuleSetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates or removes conversion value rule sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
   *     ConversionValueRuleSetServiceClient.create()) {
   *   MutateConversionValueRuleSetsRequest request =
   *       MutateConversionValueRuleSetsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ConversionValueRuleSetOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateConversionValueRuleSetsResponse> future =
   *       conversionValueRuleSetServiceClient
   *           .mutateConversionValueRuleSetsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateConversionValueRuleSetsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateConversionValueRuleSetsRequest, MutateConversionValueRuleSetsResponse>
      mutateConversionValueRuleSetsCallable() {
    return stub.mutateConversionValueRuleSetsCallable();
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
