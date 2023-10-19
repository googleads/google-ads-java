/*
 * Copyright 2023 Google LLC
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

package com.google.ads.googleads.v15.services;

import com.google.ads.googleads.v15.resources.OfflineUserDataJob;
import com.google.ads.googleads.v15.resources.OfflineUserDataJobMetadata;
import com.google.ads.googleads.v15.resources.OfflineUserDataJobName;
import com.google.ads.googleads.v15.services.stub.OfflineUserDataJobServiceStub;
import com.google.ads.googleads.v15.services.stub.OfflineUserDataJobServiceStubSettings;
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

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage offline user data jobs.
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
 * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
 *     OfflineUserDataJobServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();
 *   CreateOfflineUserDataJobResponse response =
 *       offlineUserDataJobServiceClient.createOfflineUserDataJob(customerId, job);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the OfflineUserDataJobServiceClient object to clean up
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
 * OfflineUserDataJobServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * OfflineUserDataJobServiceSettings offlineUserDataJobServiceSettings =
 *     OfflineUserDataJobServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
 *     OfflineUserDataJobServiceClient.create(offlineUserDataJobServiceSettings);
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
 * OfflineUserDataJobServiceSettings offlineUserDataJobServiceSettings =
 *     OfflineUserDataJobServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
 *     OfflineUserDataJobServiceClient.create(offlineUserDataJobServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
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
   * calls. This is for advanced usage - prefer using create(OfflineUserDataJobServiceSettings).
   */
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

  protected OfflineUserDataJobServiceClient(OfflineUserDataJobServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final OfflineUserDataJobServiceSettings getSettings() {
    return settings;
  }

  public OfflineUserDataJobServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an offline user data job.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [NotAllowlistedError]()
   * [OfflineUserDataJobError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();
   *   CreateOfflineUserDataJobResponse response =
   *       offlineUserDataJobServiceClient.createOfflineUserDataJob(customerId, job);
   * }
   * }</pre>
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an offline user data job.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [NotAllowlistedError]()
   * [OfflineUserDataJobError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   CreateOfflineUserDataJobRequest request =
   *       CreateOfflineUserDataJobRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setJob(OfflineUserDataJob.newBuilder().build())
   *           .setValidateOnly(true)
   *           .setEnableMatchRateRangePreview(true)
   *           .build();
   *   CreateOfflineUserDataJobResponse response =
   *       offlineUserDataJobServiceClient.createOfflineUserDataJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateOfflineUserDataJobResponse createOfflineUserDataJob(
      CreateOfflineUserDataJobRequest request) {
    return createOfflineUserDataJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an offline user data job.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [NotAllowlistedError]()
   * [OfflineUserDataJobError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   CreateOfflineUserDataJobRequest request =
   *       CreateOfflineUserDataJobRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setJob(OfflineUserDataJob.newBuilder().build())
   *           .setValidateOnly(true)
   *           .setEnableMatchRateRangePreview(true)
   *           .build();
   *   ApiFuture<CreateOfflineUserDataJobResponse> future =
   *       offlineUserDataJobServiceClient.createOfflineUserDataJobCallable().futureCall(request);
   *   // Do something.
   *   CreateOfflineUserDataJobResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobCallable() {
    return stub.createOfflineUserDataJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds operations to the offline user data job.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [OfflineUserDataJobError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName =
   *       OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]");
   *   List<OfflineUserDataJobOperation> operations = new ArrayList<>();
   *   AddOfflineUserDataJobOperationsResponse response =
   *       offlineUserDataJobServiceClient.addOfflineUserDataJobOperations(resourceName, operations);
   * }
   * }</pre>
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds operations to the offline user data job.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [OfflineUserDataJobError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   String resourceName =
   *       OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]").toString();
   *   List<OfflineUserDataJobOperation> operations = new ArrayList<>();
   *   AddOfflineUserDataJobOperationsResponse response =
   *       offlineUserDataJobServiceClient.addOfflineUserDataJobOperations(resourceName, operations);
   * }
   * }</pre>
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds operations to the offline user data job.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [OfflineUserDataJobError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   AddOfflineUserDataJobOperationsRequest request =
   *       AddOfflineUserDataJobOperationsRequest.newBuilder()
   *           .setResourceName(
   *               OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]")
   *                   .toString())
   *           .setEnablePartialFailure(true)
   *           .setEnableWarnings(true)
   *           .addAllOperations(new ArrayList<OfflineUserDataJobOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   AddOfflineUserDataJobOperationsResponse response =
   *       offlineUserDataJobServiceClient.addOfflineUserDataJobOperations(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddOfflineUserDataJobOperationsResponse addOfflineUserDataJobOperations(
      AddOfflineUserDataJobOperationsRequest request) {
    return addOfflineUserDataJobOperationsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds operations to the offline user data job.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [OfflineUserDataJobError]()
   * [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   AddOfflineUserDataJobOperationsRequest request =
   *       AddOfflineUserDataJobOperationsRequest.newBuilder()
   *           .setResourceName(
   *               OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]")
   *                   .toString())
   *           .setEnablePartialFailure(true)
   *           .setEnableWarnings(true)
   *           .addAllOperations(new ArrayList<OfflineUserDataJobOperation>())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<AddOfflineUserDataJobOperationsResponse> future =
   *       offlineUserDataJobServiceClient
   *           .addOfflineUserDataJobOperationsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   AddOfflineUserDataJobOperationsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsCallable() {
    return stub.addOfflineUserDataJobOperationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [HeaderError]() [InternalError]() [OfflineUserDataJobError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   OfflineUserDataJobName resourceName =
   *       OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]");
   *   offlineUserDataJobServiceClient.runOfflineUserDataJobAsync(resourceName).get();
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the OfflineUserDataJob to run.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OfflineUserDataJobMetadata> runOfflineUserDataJobAsync(
      OfflineUserDataJobName resourceName) {
    RunOfflineUserDataJobRequest request =
        RunOfflineUserDataJobRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return runOfflineUserDataJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [HeaderError]() [InternalError]() [OfflineUserDataJobError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   String resourceName =
   *       OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]").toString();
   *   offlineUserDataJobServiceClient.runOfflineUserDataJobAsync(resourceName).get();
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the OfflineUserDataJob to run.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OfflineUserDataJobMetadata> runOfflineUserDataJobAsync(
      String resourceName) {
    RunOfflineUserDataJobRequest request =
        RunOfflineUserDataJobRequest.newBuilder().setResourceName(resourceName).build();
    return runOfflineUserDataJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [HeaderError]() [InternalError]() [OfflineUserDataJobError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   RunOfflineUserDataJobRequest request =
   *       RunOfflineUserDataJobRequest.newBuilder()
   *           .setResourceName(
   *               OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]")
   *                   .toString())
   *           .setValidateOnly(true)
   *           .build();
   *   offlineUserDataJobServiceClient.runOfflineUserDataJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OfflineUserDataJobMetadata> runOfflineUserDataJobAsync(
      RunOfflineUserDataJobRequest request) {
    return runOfflineUserDataJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [HeaderError]() [InternalError]() [OfflineUserDataJobError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   RunOfflineUserDataJobRequest request =
   *       RunOfflineUserDataJobRequest.newBuilder()
   *           .setResourceName(
   *               OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]")
   *                   .toString())
   *           .setValidateOnly(true)
   *           .build();
   *   OperationFuture<Empty, OfflineUserDataJobMetadata> future =
   *       offlineUserDataJobServiceClient
   *           .runOfflineUserDataJobOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<RunOfflineUserDataJobRequest, Empty, OfflineUserDataJobMetadata>
      runOfflineUserDataJobOperationCallable() {
    return stub.runOfflineUserDataJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Runs the offline user data job.
   *
   * <p>When finished, the long running operation will contain the processing result or failure
   * information, if any.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [HeaderError]() [InternalError]() [OfflineUserDataJobError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
   *     OfflineUserDataJobServiceClient.create()) {
   *   RunOfflineUserDataJobRequest request =
   *       RunOfflineUserDataJobRequest.newBuilder()
   *           .setResourceName(
   *               OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]")
   *                   .toString())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       offlineUserDataJobServiceClient.runOfflineUserDataJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RunOfflineUserDataJobRequest, Operation>
      runOfflineUserDataJobCallable() {
    return stub.runOfflineUserDataJobCallable();
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
