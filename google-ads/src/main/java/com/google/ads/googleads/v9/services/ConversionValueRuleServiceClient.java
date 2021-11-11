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

import com.google.ads.googleads.v9.resources.ConversionValueRule;
import com.google.ads.googleads.v9.resources.ConversionValueRuleName;
import com.google.ads.googleads.v9.services.stub.ConversionValueRuleServiceStub;
import com.google.ads.googleads.v9.services.stub.ConversionValueRuleServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage conversion value rules.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (ConversionValueRuleServiceClient conversionValueRuleServiceClient =
 *     ConversionValueRuleServiceClient.create()) {
 *   ConversionValueRuleName resourceName =
 *       ConversionValueRuleName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_ID]");
 *   ConversionValueRule response =
 *       conversionValueRuleServiceClient.getConversionValueRule(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ConversionValueRuleServiceClient object to clean up
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
 * ConversionValueRuleServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * ConversionValueRuleServiceSettings conversionValueRuleServiceSettings =
 *     ConversionValueRuleServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ConversionValueRuleServiceClient conversionValueRuleServiceClient =
 *     ConversionValueRuleServiceClient.create(conversionValueRuleServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * ConversionValueRuleServiceSettings conversionValueRuleServiceSettings =
 *     ConversionValueRuleServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ConversionValueRuleServiceClient conversionValueRuleServiceClient =
 *     ConversionValueRuleServiceClient.create(conversionValueRuleServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ConversionValueRuleServiceClient implements BackgroundResource {
  private final ConversionValueRuleServiceSettings settings;
  private final ConversionValueRuleServiceStub stub;

  /** Constructs an instance of ConversionValueRuleServiceClient with default settings. */
  public static final ConversionValueRuleServiceClient create() throws IOException {
    return create(ConversionValueRuleServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ConversionValueRuleServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ConversionValueRuleServiceClient create(
      ConversionValueRuleServiceSettings settings) throws IOException {
    return new ConversionValueRuleServiceClient(settings);
  }

  /**
   * Constructs an instance of ConversionValueRuleServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(ConversionValueRuleServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ConversionValueRuleServiceClient create(ConversionValueRuleServiceStub stub) {
    return new ConversionValueRuleServiceClient(stub);
  }

  /**
   * Constructs an instance of ConversionValueRuleServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ConversionValueRuleServiceClient(ConversionValueRuleServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((ConversionValueRuleServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ConversionValueRuleServiceClient(ConversionValueRuleServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ConversionValueRuleServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ConversionValueRuleServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion value rule.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleServiceClient conversionValueRuleServiceClient =
   *     ConversionValueRuleServiceClient.create()) {
   *   ConversionValueRuleName resourceName =
   *       ConversionValueRuleName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_ID]");
   *   ConversionValueRule response =
   *       conversionValueRuleServiceClient.getConversionValueRule(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the conversion value rule to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionValueRule getConversionValueRule(ConversionValueRuleName resourceName) {
    GetConversionValueRuleRequest request =
        GetConversionValueRuleRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getConversionValueRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion value rule.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleServiceClient conversionValueRuleServiceClient =
   *     ConversionValueRuleServiceClient.create()) {
   *   String resourceName =
   *       ConversionValueRuleName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_ID]").toString();
   *   ConversionValueRule response =
   *       conversionValueRuleServiceClient.getConversionValueRule(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the conversion value rule to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionValueRule getConversionValueRule(String resourceName) {
    GetConversionValueRuleRequest request =
        GetConversionValueRuleRequest.newBuilder().setResourceName(resourceName).build();
    return getConversionValueRule(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion value rule.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleServiceClient conversionValueRuleServiceClient =
   *     ConversionValueRuleServiceClient.create()) {
   *   GetConversionValueRuleRequest request =
   *       GetConversionValueRuleRequest.newBuilder()
   *           .setResourceName(
   *               ConversionValueRuleName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_ID]")
   *                   .toString())
   *           .build();
   *   ConversionValueRule response =
   *       conversionValueRuleServiceClient.getConversionValueRule(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionValueRule getConversionValueRule(GetConversionValueRuleRequest request) {
    return getConversionValueRuleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion value rule.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleServiceClient conversionValueRuleServiceClient =
   *     ConversionValueRuleServiceClient.create()) {
   *   GetConversionValueRuleRequest request =
   *       GetConversionValueRuleRequest.newBuilder()
   *           .setResourceName(
   *               ConversionValueRuleName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<ConversionValueRule> future =
   *       conversionValueRuleServiceClient.getConversionValueRuleCallable().futureCall(request);
   *   // Do something.
   *   ConversionValueRule response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetConversionValueRuleRequest, ConversionValueRule>
      getConversionValueRuleCallable() {
    return stub.getConversionValueRuleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes conversion value rules. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleServiceClient conversionValueRuleServiceClient =
   *     ConversionValueRuleServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<ConversionValueRuleOperation> operations = new ArrayList<>();
   *   MutateConversionValueRulesResponse response =
   *       conversionValueRuleServiceClient.mutateConversionValueRules(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose conversion value rules are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual conversion value
   *     rules.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateConversionValueRulesResponse mutateConversionValueRules(
      String customerId, List<ConversionValueRuleOperation> operations) {
    MutateConversionValueRulesRequest request =
        MutateConversionValueRulesRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateConversionValueRules(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes conversion value rules. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleServiceClient conversionValueRuleServiceClient =
   *     ConversionValueRuleServiceClient.create()) {
   *   MutateConversionValueRulesRequest request =
   *       MutateConversionValueRulesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ConversionValueRuleOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateConversionValueRulesResponse response =
   *       conversionValueRuleServiceClient.mutateConversionValueRules(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateConversionValueRulesResponse mutateConversionValueRules(
      MutateConversionValueRulesRequest request) {
    return mutateConversionValueRulesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes conversion value rules. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionValueRuleServiceClient conversionValueRuleServiceClient =
   *     ConversionValueRuleServiceClient.create()) {
   *   MutateConversionValueRulesRequest request =
   *       MutateConversionValueRulesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ConversionValueRuleOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateConversionValueRulesResponse> future =
   *       conversionValueRuleServiceClient.mutateConversionValueRulesCallable().futureCall(request);
   *   // Do something.
   *   MutateConversionValueRulesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateConversionValueRulesRequest, MutateConversionValueRulesResponse>
      mutateConversionValueRulesCallable() {
    return stub.mutateConversionValueRulesCallable();
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
