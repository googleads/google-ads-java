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
package com.google.ads.googleads.v3.services;

import com.google.ads.googleads.v3.resources.RemarketingAction;
import com.google.ads.googleads.v3.services.stub.RemarketingActionServiceStub;
import com.google.ads.googleads.v3.services.stub.RemarketingActionServiceStubSettings;
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
 * Service Description: Service to manage remarketing actions.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (RemarketingActionServiceClient remarketingActionServiceClient = RemarketingActionServiceClient.create()) {
 *   String formattedResourceName = RemarketingActionServiceClient.formatRemarketingActionName("[CUSTOMER]", "[REMARKETING_ACTION]");
 *   RemarketingAction response = remarketingActionServiceClient.getRemarketingAction(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the remarketingActionServiceClient object to clean up
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
 * RemarketingActionServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * RemarketingActionServiceSettings remarketingActionServiceSettings =
 *     RemarketingActionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RemarketingActionServiceClient remarketingActionServiceClient =
 *     RemarketingActionServiceClient.create(remarketingActionServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RemarketingActionServiceSettings remarketingActionServiceSettings =
 *     RemarketingActionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RemarketingActionServiceClient remarketingActionServiceClient =
 *     RemarketingActionServiceClient.create(remarketingActionServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RemarketingActionServiceClient implements BackgroundResource {
  private final RemarketingActionServiceSettings settings;
  private final RemarketingActionServiceStub stub;

  private static final PathTemplate REMARKETING_ACTION_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/remarketingActions/{remarketing_action}");

  /**
   * Formats a string containing the fully-qualified path to represent a remarketing_action
   * resource.
   *
   * @deprecated Use the {@link RemarketingActionName} class instead.
   */
  @Deprecated
  public static final String formatRemarketingActionName(
      String customer, String remarketingAction) {
    return REMARKETING_ACTION_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "remarketing_action", remarketingAction);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a remarketing_action
   * resource.
   *
   * @deprecated Use the {@link RemarketingActionName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromRemarketingActionName(String remarketingActionName) {
    return REMARKETING_ACTION_PATH_TEMPLATE.parse(remarketingActionName).get("customer");
  }

  /**
   * Parses the remarketing_action from the given fully-qualified path which represents a
   * remarketing_action resource.
   *
   * @deprecated Use the {@link RemarketingActionName} class instead.
   */
  @Deprecated
  public static final String parseRemarketingActionFromRemarketingActionName(
      String remarketingActionName) {
    return REMARKETING_ACTION_PATH_TEMPLATE.parse(remarketingActionName).get("remarketing_action");
  }

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
   * calls. This is for advanced usage - prefer to use RemarketingActionServiceSettings}.
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested remarketing action in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RemarketingActionServiceClient remarketingActionServiceClient = RemarketingActionServiceClient.create()) {
   *   String formattedResourceName = RemarketingActionServiceClient.formatRemarketingActionName("[CUSTOMER]", "[REMARKETING_ACTION]");
   *   RemarketingAction response = remarketingActionServiceClient.getRemarketingAction(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the remarketing action to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemarketingAction getRemarketingAction(String resourceName) {
    REMARKETING_ACTION_PATH_TEMPLATE.validate(resourceName, "getRemarketingAction");
    GetRemarketingActionRequest request =
        GetRemarketingActionRequest.newBuilder().setResourceName(resourceName).build();
    return getRemarketingAction(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested remarketing action in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RemarketingActionServiceClient remarketingActionServiceClient = RemarketingActionServiceClient.create()) {
   *   String formattedResourceName = RemarketingActionServiceClient.formatRemarketingActionName("[CUSTOMER]", "[REMARKETING_ACTION]");
   *   GetRemarketingActionRequest request = GetRemarketingActionRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   RemarketingAction response = remarketingActionServiceClient.getRemarketingAction(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemarketingAction getRemarketingAction(GetRemarketingActionRequest request) {
    return getRemarketingActionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested remarketing action in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RemarketingActionServiceClient remarketingActionServiceClient = RemarketingActionServiceClient.create()) {
   *   String formattedResourceName = RemarketingActionServiceClient.formatRemarketingActionName("[CUSTOMER]", "[REMARKETING_ACTION]");
   *   GetRemarketingActionRequest request = GetRemarketingActionRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;RemarketingAction&gt; future = remarketingActionServiceClient.getRemarketingActionCallable().futureCall(request);
   *   // Do something
   *   RemarketingAction response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetRemarketingActionRequest, RemarketingAction>
      getRemarketingActionCallable() {
    return stub.getRemarketingActionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates remarketing actions. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RemarketingActionServiceClient remarketingActionServiceClient = RemarketingActionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;RemarketingActionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateRemarketingActionsResponse response = remarketingActionServiceClient.mutateRemarketingActions(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose remarketing actions are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual remarketing
   *     actions.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateRemarketingActionsResponse mutateRemarketingActions(
      String customerId,
      List<RemarketingActionOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateRemarketingActionsRequest request =
        MutateRemarketingActionsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateRemarketingActions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates remarketing actions. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RemarketingActionServiceClient remarketingActionServiceClient = RemarketingActionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;RemarketingActionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateRemarketingActionsResponse response = remarketingActionServiceClient.mutateRemarketingActions(customerId, operations);
   * }
   * </code></pre>
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates remarketing actions. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RemarketingActionServiceClient remarketingActionServiceClient = RemarketingActionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;RemarketingActionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateRemarketingActionsRequest request = MutateRemarketingActionsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateRemarketingActionsResponse response = remarketingActionServiceClient.mutateRemarketingActions(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateRemarketingActionsResponse mutateRemarketingActions(
      MutateRemarketingActionsRequest request) {
    return mutateRemarketingActionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates remarketing actions. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RemarketingActionServiceClient remarketingActionServiceClient = RemarketingActionServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;RemarketingActionOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateRemarketingActionsRequest request = MutateRemarketingActionsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateRemarketingActionsResponse&gt; future = remarketingActionServiceClient.mutateRemarketingActionsCallable().futureCall(request);
   *   // Do something
   *   MutateRemarketingActionsResponse response = future.get();
   * }
   * </code></pre>
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
