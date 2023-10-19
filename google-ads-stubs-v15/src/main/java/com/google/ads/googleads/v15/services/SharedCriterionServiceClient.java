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

import com.google.ads.googleads.v15.services.stub.SharedCriterionServiceStub;
import com.google.ads.googleads.v15.services.stub.SharedCriterionServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage shared criteria.
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
 * try (SharedCriterionServiceClient sharedCriterionServiceClient =
 *     SharedCriterionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<SharedCriterionOperation> operations = new ArrayList<>();
 *   MutateSharedCriteriaResponse response =
 *       sharedCriterionServiceClient.mutateSharedCriteria(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the SharedCriterionServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of SharedCriterionServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SharedCriterionServiceSettings sharedCriterionServiceSettings =
 *     SharedCriterionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SharedCriterionServiceClient sharedCriterionServiceClient =
 *     SharedCriterionServiceClient.create(sharedCriterionServiceSettings);
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
 * SharedCriterionServiceSettings sharedCriterionServiceSettings =
 *     SharedCriterionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SharedCriterionServiceClient sharedCriterionServiceClient =
 *     SharedCriterionServiceClient.create(sharedCriterionServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class SharedCriterionServiceClient implements BackgroundResource {
  private final SharedCriterionServiceSettings settings;
  private final SharedCriterionServiceStub stub;

  /** Constructs an instance of SharedCriterionServiceClient with default settings. */
  public static final SharedCriterionServiceClient create() throws IOException {
    return create(SharedCriterionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SharedCriterionServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SharedCriterionServiceClient create(SharedCriterionServiceSettings settings)
      throws IOException {
    return new SharedCriterionServiceClient(settings);
  }

  /**
   * Constructs an instance of SharedCriterionServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(SharedCriterionServiceSettings).
   */
  public static final SharedCriterionServiceClient create(SharedCriterionServiceStub stub) {
    return new SharedCriterionServiceClient(stub);
  }

  /**
   * Constructs an instance of SharedCriterionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected SharedCriterionServiceClient(SharedCriterionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((SharedCriterionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected SharedCriterionServiceClient(SharedCriterionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SharedCriterionServiceSettings getSettings() {
    return settings;
  }

  public SharedCriterionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes shared criteria. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CriterionError]()
   * [DatabaseError]() [DistinctError]() [FieldError]() [HeaderError]() [IdError]()
   * [InternalError]() [MutateError]() [NotEmptyError]() [NullError]() [OperatorError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SharedCriterionServiceClient sharedCriterionServiceClient =
   *     SharedCriterionServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<SharedCriterionOperation> operations = new ArrayList<>();
   *   MutateSharedCriteriaResponse response =
   *       sharedCriterionServiceClient.mutateSharedCriteria(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose shared criteria are being modified.
   * @param operations Required. The list of operations to perform on individual shared criteria.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateSharedCriteriaResponse mutateSharedCriteria(
      String customerId, List<SharedCriterionOperation> operations) {
    MutateSharedCriteriaRequest request =
        MutateSharedCriteriaRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateSharedCriteria(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes shared criteria. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CriterionError]()
   * [DatabaseError]() [DistinctError]() [FieldError]() [HeaderError]() [IdError]()
   * [InternalError]() [MutateError]() [NotEmptyError]() [NullError]() [OperatorError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SharedCriterionServiceClient sharedCriterionServiceClient =
   *     SharedCriterionServiceClient.create()) {
   *   MutateSharedCriteriaRequest request =
   *       MutateSharedCriteriaRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<SharedCriterionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateSharedCriteriaResponse response =
   *       sharedCriterionServiceClient.mutateSharedCriteria(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateSharedCriteriaResponse mutateSharedCriteria(
      MutateSharedCriteriaRequest request) {
    return mutateSharedCriteriaCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes shared criteria. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CriterionError]()
   * [DatabaseError]() [DistinctError]() [FieldError]() [HeaderError]() [IdError]()
   * [InternalError]() [MutateError]() [NotEmptyError]() [NullError]() [OperatorError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SharedCriterionServiceClient sharedCriterionServiceClient =
   *     SharedCriterionServiceClient.create()) {
   *   MutateSharedCriteriaRequest request =
   *       MutateSharedCriteriaRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<SharedCriterionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateSharedCriteriaResponse> future =
   *       sharedCriterionServiceClient.mutateSharedCriteriaCallable().futureCall(request);
   *   // Do something.
   *   MutateSharedCriteriaResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateSharedCriteriaRequest, MutateSharedCriteriaResponse>
      mutateSharedCriteriaCallable() {
    return stub.mutateSharedCriteriaCallable();
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
