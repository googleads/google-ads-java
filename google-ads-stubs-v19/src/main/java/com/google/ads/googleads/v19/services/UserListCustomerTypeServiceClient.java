/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v19.services;

import com.google.ads.googleads.v19.services.stub.UserListCustomerTypeServiceStub;
import com.google.ads.googleads.v19.services.stub.UserListCustomerTypeServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage user list customer types.
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
 * try (UserListCustomerTypeServiceClient userListCustomerTypeServiceClient =
 *     UserListCustomerTypeServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<UserListCustomerTypeOperation> operations = new ArrayList<>();
 *   MutateUserListCustomerTypesResponse response =
 *       userListCustomerTypeServiceClient.mutateUserListCustomerTypes(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the UserListCustomerTypeServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateUserListCustomerTypes</td>
 *      <td><p> Attach or remove user list customer types. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [UserListCustomerTypeError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateUserListCustomerTypes(MutateUserListCustomerTypesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateUserListCustomerTypes(String customerId, List&lt;UserListCustomerTypeOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateUserListCustomerTypesCallable()
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
 * UserListCustomerTypeServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * UserListCustomerTypeServiceSettings userListCustomerTypeServiceSettings =
 *     UserListCustomerTypeServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * UserListCustomerTypeServiceClient userListCustomerTypeServiceClient =
 *     UserListCustomerTypeServiceClient.create(userListCustomerTypeServiceSettings);
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
 * UserListCustomerTypeServiceSettings userListCustomerTypeServiceSettings =
 *     UserListCustomerTypeServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * UserListCustomerTypeServiceClient userListCustomerTypeServiceClient =
 *     UserListCustomerTypeServiceClient.create(userListCustomerTypeServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class UserListCustomerTypeServiceClient implements BackgroundResource {
  private final UserListCustomerTypeServiceSettings settings;
  private final UserListCustomerTypeServiceStub stub;

  /** Constructs an instance of UserListCustomerTypeServiceClient with default settings. */
  public static final UserListCustomerTypeServiceClient create() throws IOException {
    return create(UserListCustomerTypeServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of UserListCustomerTypeServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final UserListCustomerTypeServiceClient create(
      UserListCustomerTypeServiceSettings settings) throws IOException {
    return new UserListCustomerTypeServiceClient(settings);
  }

  /**
   * Constructs an instance of UserListCustomerTypeServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(UserListCustomerTypeServiceSettings).
   */
  public static final UserListCustomerTypeServiceClient create(
      UserListCustomerTypeServiceStub stub) {
    return new UserListCustomerTypeServiceClient(stub);
  }

  /**
   * Constructs an instance of UserListCustomerTypeServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected UserListCustomerTypeServiceClient(UserListCustomerTypeServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((UserListCustomerTypeServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected UserListCustomerTypeServiceClient(UserListCustomerTypeServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final UserListCustomerTypeServiceSettings getSettings() {
    return settings;
  }

  public UserListCustomerTypeServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Attach or remove user list customer types. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [UserListCustomerTypeError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (UserListCustomerTypeServiceClient userListCustomerTypeServiceClient =
   *     UserListCustomerTypeServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<UserListCustomerTypeOperation> operations = new ArrayList<>();
   *   MutateUserListCustomerTypesResponse response =
   *       userListCustomerTypeServiceClient.mutateUserListCustomerTypes(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose user list customer types are being
   *     modified.
   * @param operations Required. The list of operations to perform on the user list customer types.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateUserListCustomerTypesResponse mutateUserListCustomerTypes(
      String customerId, List<UserListCustomerTypeOperation> operations) {
    MutateUserListCustomerTypesRequest request =
        MutateUserListCustomerTypesRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateUserListCustomerTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Attach or remove user list customer types. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [UserListCustomerTypeError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (UserListCustomerTypeServiceClient userListCustomerTypeServiceClient =
   *     UserListCustomerTypeServiceClient.create()) {
   *   MutateUserListCustomerTypesRequest request =
   *       MutateUserListCustomerTypesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<UserListCustomerTypeOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateUserListCustomerTypesResponse response =
   *       userListCustomerTypeServiceClient.mutateUserListCustomerTypes(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateUserListCustomerTypesResponse mutateUserListCustomerTypes(
      MutateUserListCustomerTypesRequest request) {
    return mutateUserListCustomerTypesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Attach or remove user list customer types. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [UserListCustomerTypeError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (UserListCustomerTypeServiceClient userListCustomerTypeServiceClient =
   *     UserListCustomerTypeServiceClient.create()) {
   *   MutateUserListCustomerTypesRequest request =
   *       MutateUserListCustomerTypesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<UserListCustomerTypeOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateUserListCustomerTypesResponse> future =
   *       userListCustomerTypeServiceClient
   *           .mutateUserListCustomerTypesCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateUserListCustomerTypesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateUserListCustomerTypesRequest, MutateUserListCustomerTypesResponse>
      mutateUserListCustomerTypesCallable() {
    return stub.mutateUserListCustomerTypesCallable();
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
