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

import com.google.ads.googleads.v7.resources.RemarketingAction;
import com.google.ads.googleads.v7.resources.RemarketingActionName;
import com.google.ads.googleads.v7.services.stub.RemarketingActionServiceStub;
import com.google.ads.googleads.v7.services.stub.RemarketingActionServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage remarketing actions.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (RemarketingActionServiceClient remarketingActionServiceClient =
 *     RemarketingActionServiceClient.create()) {
 *   RemarketingActionName resourceName =
 *       RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]");
 *   RemarketingAction response =
 *       remarketingActionServiceClient.getRemarketingAction(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the RemarketingActionServiceClient object to clean up
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
 * RemarketingActionServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * RemarketingActionServiceSettings remarketingActionServiceSettings =
 *     RemarketingActionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RemarketingActionServiceClient remarketingActionServiceClient =
 *     RemarketingActionServiceClient.create(remarketingActionServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * RemarketingActionServiceSettings remarketingActionServiceSettings =
 *     RemarketingActionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RemarketingActionServiceClient remarketingActionServiceClient =
 *     RemarketingActionServiceClient.create(remarketingActionServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class RemarketingActionServiceClient implements BackgroundResource {
  private final RemarketingActionServiceSettings settings;
  private final RemarketingActionServiceStub stub;

  /** Constructs an instance of RemarketingActionServiceClient with default settings. */
  public static final RemarketingActionServiceClient create() throws IOException {
    return create(RemarketingActionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RemarketingActionServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final RemarketingActionServiceClient create(
      RemarketingActionServiceSettings settings) throws IOException {
    return new RemarketingActionServiceClient(settings);
  }

  /**
   * Constructs an instance of RemarketingActionServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(RemarketingActionServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final RemarketingActionServiceClient create(RemarketingActionServiceStub stub) {
    return new RemarketingActionServiceClient(stub);
  }

  /**
   * Constructs an instance of RemarketingActionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected RemarketingActionServiceClient(RemarketingActionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((RemarketingActionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected RemarketingActionServiceClient(RemarketingActionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RemarketingActionServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RemarketingActionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested remarketing action in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RemarketingActionServiceClient remarketingActionServiceClient =
   *     RemarketingActionServiceClient.create()) {
   *   RemarketingActionName resourceName =
   *       RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]");
   *   RemarketingAction response =
   *       remarketingActionServiceClient.getRemarketingAction(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the remarketing action to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemarketingAction getRemarketingAction(RemarketingActionName resourceName) {
    GetRemarketingActionRequest request =
        GetRemarketingActionRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getRemarketingAction(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested remarketing action in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RemarketingActionServiceClient remarketingActionServiceClient =
   *     RemarketingActionServiceClient.create()) {
   *   String resourceName =
   *       RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]").toString();
   *   RemarketingAction response =
   *       remarketingActionServiceClient.getRemarketingAction(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the remarketing action to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemarketingAction getRemarketingAction(String resourceName) {
    GetRemarketingActionRequest request =
        GetRemarketingActionRequest.newBuilder().setResourceName(resourceName).build();
    return getRemarketingAction(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested remarketing action in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RemarketingActionServiceClient remarketingActionServiceClient =
   *     RemarketingActionServiceClient.create()) {
   *   GetRemarketingActionRequest request =
   *       GetRemarketingActionRequest.newBuilder()
   *           .setResourceName(
   *               RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]").toString())
   *           .build();
   *   RemarketingAction response = remarketingActionServiceClient.getRemarketingAction(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemarketingAction getRemarketingAction(GetRemarketingActionRequest request) {
    return getRemarketingActionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested remarketing action in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RemarketingActionServiceClient remarketingActionServiceClient =
   *     RemarketingActionServiceClient.create()) {
   *   GetRemarketingActionRequest request =
   *       GetRemarketingActionRequest.newBuilder()
   *           .setResourceName(
   *               RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]").toString())
   *           .build();
   *   ApiFuture<RemarketingAction> future =
   *       remarketingActionServiceClient.getRemarketingActionCallable().futureCall(request);
   *   // Do something.
   *   RemarketingAction response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRemarketingActionRequest, RemarketingAction>
      getRemarketingActionCallable() {
    return stub.getRemarketingActionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates remarketing actions. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [ConversionActionError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RemarketingActionServiceClient remarketingActionServiceClient =
   *     RemarketingActionServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<RemarketingActionOperation> operations = new ArrayList<>();
   *   MutateRemarketingActionsResponse response =
   *       remarketingActionServiceClient.mutateRemarketingActions(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose remarketing actions are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual remarketing
   *     actions.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateRemarketingActionsResponse mutateRemarketingActions(
      String customerId, List<RemarketingActionOperation> operations) {
    MutateRemarketingActionsRequest request =
        MutateRemarketingActionsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateRemarketingActions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates remarketing actions. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [ConversionActionError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RemarketingActionServiceClient remarketingActionServiceClient =
   *     RemarketingActionServiceClient.create()) {
   *   MutateRemarketingActionsRequest request =
   *       MutateRemarketingActionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<RemarketingActionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateRemarketingActionsResponse response =
   *       remarketingActionServiceClient.mutateRemarketingActions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateRemarketingActionsResponse mutateRemarketingActions(
      MutateRemarketingActionsRequest request) {
    return mutateRemarketingActionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates remarketing actions. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [ConversionActionError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RemarketingActionServiceClient remarketingActionServiceClient =
   *     RemarketingActionServiceClient.create()) {
   *   MutateRemarketingActionsRequest request =
   *       MutateRemarketingActionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<RemarketingActionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateRemarketingActionsResponse> future =
   *       remarketingActionServiceClient.mutateRemarketingActionsCallable().futureCall(request);
   *   // Do something.
   *   MutateRemarketingActionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateRemarketingActionsRequest, MutateRemarketingActionsResponse>
      mutateRemarketingActionsCallable() {
    return stub.mutateRemarketingActionsCallable();
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
