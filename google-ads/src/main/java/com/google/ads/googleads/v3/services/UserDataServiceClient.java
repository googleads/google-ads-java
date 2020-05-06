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

import com.google.ads.googleads.v3.services.stub.UserDataServiceStub;
import com.google.ads.googleads.v3.services.stub.UserDataServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage user data uploads. Accessible to whitelisted customers
 * only.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (UserDataServiceClient userDataServiceClient = UserDataServiceClient.create()) {
 *   String customerId = "";
 *   List&lt;UserDataOperation&gt; operations = new ArrayList&lt;&gt;();
 *   UploadUserDataResponse response = userDataServiceClient.uploadUserData(customerId, operations);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the userDataServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of UserDataServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * UserDataServiceSettings userDataServiceSettings =
 *     UserDataServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * UserDataServiceClient userDataServiceClient =
 *     UserDataServiceClient.create(userDataServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * UserDataServiceSettings userDataServiceSettings =
 *     UserDataServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * UserDataServiceClient userDataServiceClient =
 *     UserDataServiceClient.create(userDataServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
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
   * for advanced usage - prefer to use UserDataServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected UserDataServiceClient(UserDataServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final UserDataServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public UserDataServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Uploads the given user data.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UserDataServiceClient userDataServiceClient = UserDataServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;UserDataOperation&gt; operations = new ArrayList&lt;&gt;();
   *   UploadUserDataResponse response = userDataServiceClient.uploadUserData(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer for which to update the user data.
   * @param operations Required. The list of operations to be done.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadUserDataResponse uploadUserData(
      String customerId, List<UserDataOperation> operations) {

    UploadUserDataRequest request =
        UploadUserDataRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return uploadUserData(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Uploads the given user data.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UserDataServiceClient userDataServiceClient = UserDataServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;UserDataOperation&gt; operations = new ArrayList&lt;&gt;();
   *   UploadUserDataRequest request = UploadUserDataRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   UploadUserDataResponse response = userDataServiceClient.uploadUserData(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadUserDataResponse uploadUserData(UploadUserDataRequest request) {
    return uploadUserDataCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Uploads the given user data.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UserDataServiceClient userDataServiceClient = UserDataServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;UserDataOperation&gt; operations = new ArrayList&lt;&gt;();
   *   UploadUserDataRequest request = UploadUserDataRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;UploadUserDataResponse&gt; future = userDataServiceClient.uploadUserDataCallable().futureCall(request);
   *   // Do something
   *   UploadUserDataResponse response = future.get();
   * }
   * </code></pre>
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
