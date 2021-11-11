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

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.resources.ConversionCustomVariable;
import com.google.ads.googleads.v7.resources.ConversionCustomVariableName;
import com.google.ads.googleads.v7.services.stub.ConversionCustomVariableServiceStub;
import com.google.ads.googleads.v7.services.stub.ConversionCustomVariableServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage conversion custom variables.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
 *     ConversionCustomVariableServiceClient.create()) {
 *   ConversionCustomVariableName resourceName =
 *       ConversionCustomVariableName.of("[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]");
 *   ConversionCustomVariable response =
 *       conversionCustomVariableServiceClient.getConversionCustomVariable(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ConversionCustomVariableServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
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
 * ConversionCustomVariableServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * ConversionCustomVariableServiceSettings conversionCustomVariableServiceSettings =
 *     ConversionCustomVariableServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
 *     ConversionCustomVariableServiceClient.create(conversionCustomVariableServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * ConversionCustomVariableServiceSettings conversionCustomVariableServiceSettings =
 *     ConversionCustomVariableServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
 *     ConversionCustomVariableServiceClient.create(conversionCustomVariableServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ConversionCustomVariableServiceClient implements BackgroundResource {
  private final ConversionCustomVariableServiceSettings settings;
  private final ConversionCustomVariableServiceStub stub;

  /** Constructs an instance of ConversionCustomVariableServiceClient with default settings. */
  public static final ConversionCustomVariableServiceClient create() throws IOException {
    return create(ConversionCustomVariableServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ConversionCustomVariableServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ConversionCustomVariableServiceClient create(
      ConversionCustomVariableServiceSettings settings) throws IOException {
    return new ConversionCustomVariableServiceClient(settings);
  }

  /**
   * Constructs an instance of ConversionCustomVariableServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(ConversionCustomVariableServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ConversionCustomVariableServiceClient create(
      ConversionCustomVariableServiceStub stub) {
    return new ConversionCustomVariableServiceClient(stub);
  }

  /**
   * Constructs an instance of ConversionCustomVariableServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ConversionCustomVariableServiceClient(ConversionCustomVariableServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((ConversionCustomVariableServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ConversionCustomVariableServiceClient(ConversionCustomVariableServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ConversionCustomVariableServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ConversionCustomVariableServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion custom variable.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
   *     ConversionCustomVariableServiceClient.create()) {
   *   ConversionCustomVariableName resourceName =
   *       ConversionCustomVariableName.of("[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]");
   *   ConversionCustomVariable response =
   *       conversionCustomVariableServiceClient.getConversionCustomVariable(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the conversion custom variable to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionCustomVariable getConversionCustomVariable(
      ConversionCustomVariableName resourceName) {
    GetConversionCustomVariableRequest request =
        GetConversionCustomVariableRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getConversionCustomVariable(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion custom variable.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
   *     ConversionCustomVariableServiceClient.create()) {
   *   String resourceName =
   *       ConversionCustomVariableName.of("[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]")
   *           .toString();
   *   ConversionCustomVariable response =
   *       conversionCustomVariableServiceClient.getConversionCustomVariable(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the conversion custom variable to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionCustomVariable getConversionCustomVariable(String resourceName) {
    GetConversionCustomVariableRequest request =
        GetConversionCustomVariableRequest.newBuilder().setResourceName(resourceName).build();
    return getConversionCustomVariable(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion custom variable.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
   *     ConversionCustomVariableServiceClient.create()) {
   *   GetConversionCustomVariableRequest request =
   *       GetConversionCustomVariableRequest.newBuilder()
   *           .setResourceName(
   *               ConversionCustomVariableName.of(
   *                       "[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]")
   *                   .toString())
   *           .build();
   *   ConversionCustomVariable response =
   *       conversionCustomVariableServiceClient.getConversionCustomVariable(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionCustomVariable getConversionCustomVariable(
      GetConversionCustomVariableRequest request) {
    return getConversionCustomVariableCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested conversion custom variable.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
   *     ConversionCustomVariableServiceClient.create()) {
   *   GetConversionCustomVariableRequest request =
   *       GetConversionCustomVariableRequest.newBuilder()
   *           .setResourceName(
   *               ConversionCustomVariableName.of(
   *                       "[CUSTOMER_ID]", "[CONVERSION_CUSTOM_VARIABLE_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<ConversionCustomVariable> future =
   *       conversionCustomVariableServiceClient
   *           .getConversionCustomVariableCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConversionCustomVariable response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetConversionCustomVariableRequest, ConversionCustomVariable>
      getConversionCustomVariableCallable() {
    return stub.getConversionCustomVariableCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates conversion custom variables. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [ConversionCustomVariableError]() [DatabaseError]() [HeaderError]() [InternalError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
   *     ConversionCustomVariableServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<ConversionCustomVariableOperation> operations = new ArrayList<>();
   *   MutateConversionCustomVariablesResponse response =
   *       conversionCustomVariableServiceClient.mutateConversionCustomVariables(
   *           customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose conversion custom variables are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual conversion custom
   *     variables.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateConversionCustomVariablesResponse mutateConversionCustomVariables(
      String customerId, List<ConversionCustomVariableOperation> operations) {
    MutateConversionCustomVariablesRequest request =
        MutateConversionCustomVariablesRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateConversionCustomVariables(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates conversion custom variables. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [ConversionCustomVariableError]() [DatabaseError]() [HeaderError]() [InternalError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
   *     ConversionCustomVariableServiceClient.create()) {
   *   MutateConversionCustomVariablesRequest request =
   *       MutateConversionCustomVariablesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ConversionCustomVariableOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateConversionCustomVariablesResponse response =
   *       conversionCustomVariableServiceClient.mutateConversionCustomVariables(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateConversionCustomVariablesResponse mutateConversionCustomVariables(
      MutateConversionCustomVariablesRequest request) {
    return mutateConversionCustomVariablesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates conversion custom variables. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [ConversionCustomVariableError]() [DatabaseError]() [HeaderError]() [InternalError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
   *     ConversionCustomVariableServiceClient.create()) {
   *   MutateConversionCustomVariablesRequest request =
   *       MutateConversionCustomVariablesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ConversionCustomVariableOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateConversionCustomVariablesResponse> future =
   *       conversionCustomVariableServiceClient
   *           .mutateConversionCustomVariablesCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateConversionCustomVariablesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateConversionCustomVariablesRequest, MutateConversionCustomVariablesResponse>
      mutateConversionCustomVariablesCallable() {
    return stub.mutateConversionCustomVariablesCallable();
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
