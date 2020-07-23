/*
 * Copyright 2020 Google LLC
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
package com.google.ads.googleads.v4.services;

import com.google.ads.googleads.v4.resources.OfflineUserDataJob;
import com.google.ads.googleads.v4.services.stub.OfflineUserDataJobServiceStub;
import com.google.ads.googleads.v4.services.stub.OfflineUserDataJobServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage offline user data jobs.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
 *   String customerId = "";
 *   OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();
 *   CreateOfflineUserDataJobResponse response = offlineUserDataJobServiceClient.createOfflineUserDataJob(customerId, job);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the offlineUserDataJobServiceClient object to clean up
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
 * OfflineUserDataJobServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * OfflineUserDataJobServiceSettings offlineUserDataJobServiceSettings =
 *     OfflineUserDataJobServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
 *     OfflineUserDataJobServiceClient.create(offlineUserDataJobServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * OfflineUserDataJobServiceSettings offlineUserDataJobServiceSettings =
 *     OfflineUserDataJobServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
 *     OfflineUserDataJobServiceClient.create(offlineUserDataJobServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class OfflineUserDataJobServiceClient implements BackgroundResource {
  private final OfflineUserDataJobServiceSettings settings;
  private final OfflineUserDataJobServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of OfflineUserDataJobServiceClient with default settings. */
  public static final OfflineUserDataJobServiceClient create() throws IOException {
    return create(OfflineUserDataJobServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of OfflineUserDataJobServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final OfflineUserDataJobServiceClient create(
      OfflineUserDataJobServiceSettings settings) throws IOException {
    return new OfflineUserDataJobServiceClient(settings);
  }

  /**
   * Constructs an instance of OfflineUserDataJobServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use OfflineUserDataJobServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final OfflineUserDataJobServiceClient create(OfflineUserDataJobServiceStub stub) {
    return new OfflineUserDataJobServiceClient(stub);
  }

  /**
   * Constructs an instance of OfflineUserDataJobServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected OfflineUserDataJobServiceClient(OfflineUserDataJobServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((OfflineUserDataJobServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected OfflineUserDataJobServiceClient(OfflineUserDataJobServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final OfflineUserDataJobServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public OfflineUserDataJobServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   offlineUserDataJobServiceClient.runOfflineUserDataJobAsync(resourceName).get();
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the OfflineUserDataJob to run.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, Empty> runOfflineUserDataJobAsync(
      OfflineUserDataJobName resourceName) {
    RunOfflineUserDataJobRequest request =
        RunOfflineUserDataJobRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return runOfflineUserDataJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   offlineUserDataJobServiceClient.runOfflineUserDataJobAsync(resourceName.toString()).get();
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the OfflineUserDataJob to run.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, Empty> runOfflineUserDataJobAsync(String resourceName) {
    RunOfflineUserDataJobRequest request =
        RunOfflineUserDataJobRequest.newBuilder().setResourceName(resourceName).build();
    return runOfflineUserDataJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   RunOfflineUserDataJobRequest request = RunOfflineUserDataJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   offlineUserDataJobServiceClient.runOfflineUserDataJobAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, Empty> runOfflineUserDataJobAsync(
      RunOfflineUserDataJobRequest request) {
    return runOfflineUserDataJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   RunOfflineUserDataJobRequest request = RunOfflineUserDataJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   OperationFuture&lt;Empty, Empty&gt; future = offlineUserDataJobServiceClient.runOfflineUserDataJobOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<RunOfflineUserDataJobRequest, Empty, Empty>
      runOfflineUserDataJobOperationCallable() {
    return stub.runOfflineUserDataJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   RunOfflineUserDataJobRequest request = RunOfflineUserDataJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = offlineUserDataJobServiceClient.runOfflineUserDataJobCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<RunOfflineUserDataJobRequest, Operation>
      runOfflineUserDataJobCallable() {
    return stub.runOfflineUserDataJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   String customerId = "";
   *   OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();
   *   CreateOfflineUserDataJobResponse response = offlineUserDataJobServiceClient.createOfflineUserDataJob(customerId, job);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer for which to create an offline user data
   *     job.
   * @param job Required. The offline user data job to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateOfflineUserDataJobResponse createOfflineUserDataJob(
      String customerId, OfflineUserDataJob job) {
    CreateOfflineUserDataJobRequest request =
        CreateOfflineUserDataJobRequest.newBuilder().setCustomerId(customerId).setJob(job).build();
    return createOfflineUserDataJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   String customerId = "";
   *   OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();
   *   CreateOfflineUserDataJobRequest request = CreateOfflineUserDataJobRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setJob(job)
   *     .build();
   *   CreateOfflineUserDataJobResponse response = offlineUserDataJobServiceClient.createOfflineUserDataJob(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateOfflineUserDataJobResponse createOfflineUserDataJob(
      CreateOfflineUserDataJobRequest request) {
    return createOfflineUserDataJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   String customerId = "";
   *   OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();
   *   CreateOfflineUserDataJobRequest request = CreateOfflineUserDataJobRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setJob(job)
   *     .build();
   *   ApiFuture&lt;CreateOfflineUserDataJobResponse&gt; future = offlineUserDataJobServiceClient.createOfflineUserDataJobCallable().futureCall(request);
   *   // Do something
   *   CreateOfflineUserDataJobResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobCallable() {
    return stub.createOfflineUserDataJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   OfflineUserDataJob response = offlineUserDataJobServiceClient.getOfflineUserDataJob(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the OfflineUserDataJob to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OfflineUserDataJob getOfflineUserDataJob(OfflineUserDataJobName resourceName) {
    GetOfflineUserDataJobRequest request =
        GetOfflineUserDataJobRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getOfflineUserDataJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   OfflineUserDataJob response = offlineUserDataJobServiceClient.getOfflineUserDataJob(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the OfflineUserDataJob to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OfflineUserDataJob getOfflineUserDataJob(String resourceName) {
    GetOfflineUserDataJobRequest request =
        GetOfflineUserDataJobRequest.newBuilder().setResourceName(resourceName).build();
    return getOfflineUserDataJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   GetOfflineUserDataJobRequest request = GetOfflineUserDataJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   OfflineUserDataJob response = offlineUserDataJobServiceClient.getOfflineUserDataJob(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OfflineUserDataJob getOfflineUserDataJob(GetOfflineUserDataJobRequest request) {
    return getOfflineUserDataJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   GetOfflineUserDataJobRequest request = GetOfflineUserDataJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;OfflineUserDataJob&gt; future = offlineUserDataJobServiceClient.getOfflineUserDataJobCallable().futureCall(request);
   *   // Do something
   *   OfflineUserDataJob response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetOfflineUserDataJobRequest, OfflineUserDataJob>
      getOfflineUserDataJobCallable() {
    return stub.getOfflineUserDataJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds operations to the offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   List&lt;OfflineUserDataJobOperation&gt; operations = new ArrayList&lt;&gt;();
   *   AddOfflineUserDataJobOperationsResponse response = offlineUserDataJobServiceClient.addOfflineUserDataJobOperations(resourceName, operations);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the OfflineUserDataJob.
   * @param operations Required. The list of operations to be done.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddOfflineUserDataJobOperationsResponse addOfflineUserDataJobOperations(
      OfflineUserDataJobName resourceName, List<OfflineUserDataJobOperation> operations) {
    AddOfflineUserDataJobOperationsRequest request =
        AddOfflineUserDataJobOperationsRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .addAllOperations(operations)
            .build();
    return addOfflineUserDataJobOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds operations to the offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   List&lt;OfflineUserDataJobOperation&gt; operations = new ArrayList&lt;&gt;();
   *   AddOfflineUserDataJobOperationsResponse response = offlineUserDataJobServiceClient.addOfflineUserDataJobOperations(resourceName.toString(), operations);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the OfflineUserDataJob.
   * @param operations Required. The list of operations to be done.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddOfflineUserDataJobOperationsResponse addOfflineUserDataJobOperations(
      String resourceName, List<OfflineUserDataJobOperation> operations) {
    AddOfflineUserDataJobOperationsRequest request =
        AddOfflineUserDataJobOperationsRequest.newBuilder()
            .setResourceName(resourceName)
            .addAllOperations(operations)
            .build();
    return addOfflineUserDataJobOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds operations to the offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   List&lt;OfflineUserDataJobOperation&gt; operations = new ArrayList&lt;&gt;();
   *   AddOfflineUserDataJobOperationsRequest request = AddOfflineUserDataJobOperationsRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .addAllOperations(operations)
   *     .build();
   *   AddOfflineUserDataJobOperationsResponse response = offlineUserDataJobServiceClient.addOfflineUserDataJobOperations(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddOfflineUserDataJobOperationsResponse addOfflineUserDataJobOperations(
      AddOfflineUserDataJobOperationsRequest request) {
    return addOfflineUserDataJobOperationsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Adds operations to the offline user data job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName = OfflineUserDataJobName.of("[CUSTOMER]", "[OFFLINE_USER_DATA_JOB]");
   *   List&lt;OfflineUserDataJobOperation&gt; operations = new ArrayList&lt;&gt;();
   *   AddOfflineUserDataJobOperationsRequest request = AddOfflineUserDataJobOperationsRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;AddOfflineUserDataJobOperationsResponse&gt; future = offlineUserDataJobServiceClient.addOfflineUserDataJobOperationsCallable().futureCall(request);
   *   // Do something
   *   AddOfflineUserDataJobOperationsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsCallable() {
    return stub.addOfflineUserDataJobOperationsCallable();
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
