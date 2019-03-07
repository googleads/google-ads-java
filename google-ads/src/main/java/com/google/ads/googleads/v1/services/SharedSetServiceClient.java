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
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.SharedSet;
import com.google.ads.googleads.v1.services.stub.SharedSetServiceStub;
import com.google.ads.googleads.v1.services.stub.SharedSetServiceStubSettings;
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
 * Service Description: Service to manage shared sets.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
 *   String formattedResourceName = SharedSetServiceClient.formatSharedSetName("[CUSTOMER]", "[SHARED_SET]");
 *   SharedSet response = sharedSetServiceClient.getSharedSet(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the sharedSetServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of SharedSetServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * SharedSetServiceSettings sharedSetServiceSettings =
 *     SharedSetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SharedSetServiceClient sharedSetServiceClient =
 *     SharedSetServiceClient.create(sharedSetServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SharedSetServiceSettings sharedSetServiceSettings =
 *     SharedSetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SharedSetServiceClient sharedSetServiceClient =
 *     SharedSetServiceClient.create(sharedSetServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class SharedSetServiceClient implements BackgroundResource {
  private final SharedSetServiceSettings settings;
  private final SharedSetServiceStub stub;

  private static final PathTemplate SHARED_SET_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/sharedSets/{shared_set}");

  /** Formats a string containing the fully-qualified path to represent a shared_set resource. */
  public static final String formatSharedSetName(String customer, String sharedSet) {
    return SHARED_SET_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "shared_set", sharedSet);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a shared_set resource.
   */
  public static final String parseCustomerFromSharedSetName(String sharedSetName) {
    return SHARED_SET_PATH_TEMPLATE.parse(sharedSetName).get("customer");
  }

  /**
   * Parses the shared_set from the given fully-qualified path which represents a shared_set
   * resource.
   */
  public static final String parseSharedSetFromSharedSetName(String sharedSetName) {
    return SHARED_SET_PATH_TEMPLATE.parse(sharedSetName).get("shared_set");
  }

  /** Constructs an instance of SharedSetServiceClient with default settings. */
  public static final SharedSetServiceClient create() throws IOException {
    return create(SharedSetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SharedSetServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SharedSetServiceClient create(SharedSetServiceSettings settings)
      throws IOException {
    return new SharedSetServiceClient(settings);
  }

  /**
   * Constructs an instance of SharedSetServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use SharedSetServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SharedSetServiceClient create(SharedSetServiceStub stub) {
    return new SharedSetServiceClient(stub);
  }

  /**
   * Constructs an instance of SharedSetServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected SharedSetServiceClient(SharedSetServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SharedSetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SharedSetServiceClient(SharedSetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SharedSetServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SharedSetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested shared set in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
   *   String formattedResourceName = SharedSetServiceClient.formatSharedSetName("[CUSTOMER]", "[SHARED_SET]");
   *   SharedSet response = sharedSetServiceClient.getSharedSet(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the shared set to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SharedSet getSharedSet(String resourceName) {
    SHARED_SET_PATH_TEMPLATE.validate(resourceName, "getSharedSet");
    GetSharedSetRequest request =
        GetSharedSetRequest.newBuilder().setResourceName(resourceName).build();
    return getSharedSet(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested shared set in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
   *   String formattedResourceName = SharedSetServiceClient.formatSharedSetName("[CUSTOMER]", "[SHARED_SET]");
   *   GetSharedSetRequest request = GetSharedSetRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   SharedSet response = sharedSetServiceClient.getSharedSet(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SharedSet getSharedSet(GetSharedSetRequest request) {
    return getSharedSetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested shared set in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
   *   String formattedResourceName = SharedSetServiceClient.formatSharedSetName("[CUSTOMER]", "[SHARED_SET]");
   *   GetSharedSetRequest request = GetSharedSetRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;SharedSet&gt; future = sharedSetServiceClient.getSharedSetCallable().futureCall(request);
   *   // Do something
   *   SharedSet response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetSharedSetRequest, SharedSet> getSharedSetCallable() {
    return stub.getSharedSetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes shared sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;SharedSetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateSharedSetsResponse response = sharedSetServiceClient.mutateSharedSets(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose shared sets are being modified.
   * @param operations The list of operations to perform on individual shared sets.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateSharedSetsResponse mutateSharedSets(
      String customerId,
      List<SharedSetOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateSharedSetsRequest request =
        MutateSharedSetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateSharedSets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes shared sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;SharedSetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateSharedSetsResponse response = sharedSetServiceClient.mutateSharedSets(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose shared sets are being modified.
   * @param operations The list of operations to perform on individual shared sets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateSharedSetsResponse mutateSharedSets(
      String customerId, List<SharedSetOperation> operations) {

    MutateSharedSetsRequest request =
        MutateSharedSetsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateSharedSets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes shared sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;SharedSetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateSharedSetsRequest request = MutateSharedSetsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateSharedSetsResponse response = sharedSetServiceClient.mutateSharedSets(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateSharedSetsResponse mutateSharedSets(MutateSharedSetsRequest request) {
    return mutateSharedSetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes shared sets. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;SharedSetOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateSharedSetsRequest request = MutateSharedSetsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateSharedSetsResponse&gt; future = sharedSetServiceClient.mutateSharedSetsCallable().futureCall(request);
   *   // Do something
   *   MutateSharedSetsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateSharedSetsRequest, MutateSharedSetsResponse>
      mutateSharedSetsCallable() {
    return stub.mutateSharedSetsCallable();
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
