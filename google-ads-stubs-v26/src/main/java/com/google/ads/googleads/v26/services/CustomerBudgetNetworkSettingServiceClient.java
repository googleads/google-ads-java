/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v26.services;

import com.google.ads.googleads.v26.services.stub.CustomerBudgetNetworkSettingServiceStub;
import com.google.ads.googleads.v26.services.stub.CustomerBudgetNetworkSettingServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage customer-level budget network settings.
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
 * try (CustomerBudgetNetworkSettingServiceClient customerBudgetNetworkSettingServiceClient =
 *     CustomerBudgetNetworkSettingServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   CustomerBudgetNetworkSettingOperation operation =
 *       CustomerBudgetNetworkSettingOperation.newBuilder().build();
 *   MutateCustomerBudgetNetworkSettingResponse response =
 *       customerBudgetNetworkSettingServiceClient.mutateCustomerBudgetNetworkSetting(
 *           customerId, operation);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CustomerBudgetNetworkSettingServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateCustomerBudgetNetworkSetting</td>
 *      <td><p> Creates or updates the customer budget network setting.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [BudgetNetworkSettingError]()   [DatabaseError]()   [DistinctError]()   [FieldError]()   [FieldMaskError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [NewResourceCreationError]()   [OperationAccessDeniedError]()   [QuotaError]()   [RangeError]()   [RequestError]()   [ResourceCountLimitExceededError]()   [StringLengthError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateCustomerBudgetNetworkSetting(MutateCustomerBudgetNetworkSettingRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateCustomerBudgetNetworkSetting(String customerId, CustomerBudgetNetworkSettingOperation operation)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateCustomerBudgetNetworkSettingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * CustomerBudgetNetworkSettingServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CustomerBudgetNetworkSettingServiceSettings customerBudgetNetworkSettingServiceSettings =
 *     CustomerBudgetNetworkSettingServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CustomerBudgetNetworkSettingServiceClient customerBudgetNetworkSettingServiceClient =
 *     CustomerBudgetNetworkSettingServiceClient.create(
 *         customerBudgetNetworkSettingServiceSettings);
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
 * CustomerBudgetNetworkSettingServiceSettings customerBudgetNetworkSettingServiceSettings =
 *     CustomerBudgetNetworkSettingServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CustomerBudgetNetworkSettingServiceClient customerBudgetNetworkSettingServiceClient =
 *     CustomerBudgetNetworkSettingServiceClient.create(
 *         customerBudgetNetworkSettingServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@NullMarked
@Generated("by gapic-generator-java")
public class CustomerBudgetNetworkSettingServiceClient implements BackgroundResource {
  private final @Nullable CustomerBudgetNetworkSettingServiceSettings settings;
  private final CustomerBudgetNetworkSettingServiceStub stub;

  /** Constructs an instance of CustomerBudgetNetworkSettingServiceClient with default settings. */
  public static final CustomerBudgetNetworkSettingServiceClient create() throws IOException {
    return create(CustomerBudgetNetworkSettingServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CustomerBudgetNetworkSettingServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final CustomerBudgetNetworkSettingServiceClient create(
      CustomerBudgetNetworkSettingServiceSettings settings) throws IOException {
    return new CustomerBudgetNetworkSettingServiceClient(settings);
  }

  /**
   * Constructs an instance of CustomerBudgetNetworkSettingServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(CustomerBudgetNetworkSettingServiceSettings).
   */
  public static final CustomerBudgetNetworkSettingServiceClient create(
      CustomerBudgetNetworkSettingServiceStub stub) {
    return new CustomerBudgetNetworkSettingServiceClient(stub);
  }

  /**
   * Constructs an instance of CustomerBudgetNetworkSettingServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected CustomerBudgetNetworkSettingServiceClient(
      CustomerBudgetNetworkSettingServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((CustomerBudgetNetworkSettingServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected CustomerBudgetNetworkSettingServiceClient(
      CustomerBudgetNetworkSettingServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final @Nullable CustomerBudgetNetworkSettingServiceSettings getSettings() {
    return settings;
  }

  public CustomerBudgetNetworkSettingServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates the customer budget network setting.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [BudgetNetworkSettingError]() [DatabaseError]() [DistinctError]() [FieldError]()
   * [FieldMaskError]() [HeaderError]() [InternalError]() [MutateError]()
   * [NewResourceCreationError]() [OperationAccessDeniedError]() [QuotaError]() [RangeError]()
   * [RequestError]() [ResourceCountLimitExceededError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerBudgetNetworkSettingServiceClient customerBudgetNetworkSettingServiceClient =
   *     CustomerBudgetNetworkSettingServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   CustomerBudgetNetworkSettingOperation operation =
   *       CustomerBudgetNetworkSettingOperation.newBuilder().build();
   *   MutateCustomerBudgetNetworkSettingResponse response =
   *       customerBudgetNetworkSettingServiceClient.mutateCustomerBudgetNetworkSetting(
   *           customerId, operation);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose customer budget network setting is
   *     being modified.
   * @param operation Required. The operation to perform on the customer budget network setting.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerBudgetNetworkSettingResponse mutateCustomerBudgetNetworkSetting(
      String customerId, CustomerBudgetNetworkSettingOperation operation) {
    MutateCustomerBudgetNetworkSettingRequest request =
        MutateCustomerBudgetNetworkSettingRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateCustomerBudgetNetworkSetting(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates the customer budget network setting.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [BudgetNetworkSettingError]() [DatabaseError]() [DistinctError]() [FieldError]()
   * [FieldMaskError]() [HeaderError]() [InternalError]() [MutateError]()
   * [NewResourceCreationError]() [OperationAccessDeniedError]() [QuotaError]() [RangeError]()
   * [RequestError]() [ResourceCountLimitExceededError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerBudgetNetworkSettingServiceClient customerBudgetNetworkSettingServiceClient =
   *     CustomerBudgetNetworkSettingServiceClient.create()) {
   *   MutateCustomerBudgetNetworkSettingRequest request =
   *       MutateCustomerBudgetNetworkSettingRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerBudgetNetworkSettingOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCustomerBudgetNetworkSettingResponse response =
   *       customerBudgetNetworkSettingServiceClient.mutateCustomerBudgetNetworkSetting(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCustomerBudgetNetworkSettingResponse mutateCustomerBudgetNetworkSetting(
      MutateCustomerBudgetNetworkSettingRequest request) {
    return mutateCustomerBudgetNetworkSettingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates the customer budget network setting.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [BudgetNetworkSettingError]() [DatabaseError]() [DistinctError]() [FieldError]()
   * [FieldMaskError]() [HeaderError]() [InternalError]() [MutateError]()
   * [NewResourceCreationError]() [OperationAccessDeniedError]() [QuotaError]() [RangeError]()
   * [RequestError]() [ResourceCountLimitExceededError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CustomerBudgetNetworkSettingServiceClient customerBudgetNetworkSettingServiceClient =
   *     CustomerBudgetNetworkSettingServiceClient.create()) {
   *   MutateCustomerBudgetNetworkSettingRequest request =
   *       MutateCustomerBudgetNetworkSettingRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(CustomerBudgetNetworkSettingOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCustomerBudgetNetworkSettingResponse> future =
   *       customerBudgetNetworkSettingServiceClient
   *           .mutateCustomerBudgetNetworkSettingCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateCustomerBudgetNetworkSettingResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateCustomerBudgetNetworkSettingRequest, MutateCustomerBudgetNetworkSettingResponse>
      mutateCustomerBudgetNetworkSettingCallable() {
    return stub.mutateCustomerBudgetNetworkSettingCallable();
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
