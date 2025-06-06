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

package com.google.ads.googleads.v18.services;

import com.google.ads.googleads.v18.services.stub.UserDataServiceStub;
import com.google.ads.googleads.v18.services.stub.UserDataServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage user data uploads. Any uploads made to a Customer Match
 * list through this service will be eligible for matching as per the customer matching process. See
 * https://support.google.com/google-ads/answer/7474263. However, the uploads made through this
 * service will not be visible under the 'Segment members' section for the Customer Match List in
 * the Google Ads UI.
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
 * try (UserDataServiceClient userDataServiceClient = UserDataServiceClient.create()) {
 *   UploadUserDataRequest request =
 *       UploadUserDataRequest.newBuilder()
 *           .setCustomerId("customerId-1581184615")
 *           .addAllOperations(new ArrayList<UserDataOperation>())
 *           .build();
 *   UploadUserDataResponse response = userDataServiceClient.uploadUserData(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the UserDataServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> UploadUserData</td>
 *      <td><p> Uploads the given user data.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CollectionSizeError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [OfflineUserDataJobError]()   [QuotaError]()   [RequestError]()   [UserDataError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> uploadUserData(UploadUserDataRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> uploadUserDataCallable()
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
 * <p>This class can be customized by passing in a custom instance of UserDataServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * UserDataServiceSettings userDataServiceSettings =
 *     UserDataServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * UserDataServiceClient userDataServiceClient =
 *     UserDataServiceClient.create(userDataServiceSettings);
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
 * UserDataServiceSettings userDataServiceSettings =
 *     UserDataServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * UserDataServiceClient userDataServiceClient =
 *     UserDataServiceClient.create(userDataServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class UserDataServiceClient implements BackgroundResource {
  private final UserDataServiceSettings settings;
  private final UserDataServiceStub stub;

  /** Constructs an instance of UserDataServiceClient with default settings. */
  public static final UserDataServiceClient create() throws IOException {
    return create(UserDataServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of UserDataServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final UserDataServiceClient create(UserDataServiceSettings settings)
      throws IOException {
    return new UserDataServiceClient(settings);
  }

  /**
   * Constructs an instance of UserDataServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(UserDataServiceSettings).
   */
  public static final UserDataServiceClient create(UserDataServiceStub stub) {
    return new UserDataServiceClient(stub);
  }

  /**
   * Constructs an instance of UserDataServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected UserDataServiceClient(UserDataServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((UserDataServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected UserDataServiceClient(UserDataServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final UserDataServiceSettings getSettings() {
    return settings;
  }

  public UserDataServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Uploads the given user data.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
   * [OfflineUserDataJobError]() [QuotaError]() [RequestError]() [UserDataError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (UserDataServiceClient userDataServiceClient = UserDataServiceClient.create()) {
   *   UploadUserDataRequest request =
   *       UploadUserDataRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<UserDataOperation>())
   *           .build();
   *   UploadUserDataResponse response = userDataServiceClient.uploadUserData(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadUserDataResponse uploadUserData(UploadUserDataRequest request) {
    return uploadUserDataCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Uploads the given user data.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
   * [OfflineUserDataJobError]() [QuotaError]() [RequestError]() [UserDataError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (UserDataServiceClient userDataServiceClient = UserDataServiceClient.create()) {
   *   UploadUserDataRequest request =
   *       UploadUserDataRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<UserDataOperation>())
   *           .build();
   *   ApiFuture<UploadUserDataResponse> future =
   *       userDataServiceClient.uploadUserDataCallable().futureCall(request);
   *   // Do something.
   *   UploadUserDataResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UploadUserDataRequest, UploadUserDataResponse>
      uploadUserDataCallable() {
    return stub.uploadUserDataCallable();
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
