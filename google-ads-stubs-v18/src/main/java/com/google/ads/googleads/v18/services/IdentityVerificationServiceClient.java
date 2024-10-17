/*
 * Copyright 2024 Google LLC
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

import com.google.ads.googleads.v18.enums.IdentityVerificationProgramEnum;
import com.google.ads.googleads.v18.services.stub.IdentityVerificationServiceStub;
import com.google.ads.googleads.v18.services.stub.IdentityVerificationServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service for managing Identity Verification Service.
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
 * try (IdentityVerificationServiceClient identityVerificationServiceClient =
 *     IdentityVerificationServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   IdentityVerificationProgramEnum.IdentityVerificationProgram verificationProgram =
 *       IdentityVerificationProgramEnum.IdentityVerificationProgram.forNumber(0);
 *   identityVerificationServiceClient.startIdentityVerification(customerId, verificationProgram);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the IdentityVerificationServiceClient object to clean up
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
 *      <td><p> StartIdentityVerification</td>
 *      <td><p> Starts Identity Verification for a given verification program type.  Statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> startIdentityVerification(StartIdentityVerificationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> startIdentityVerification(String customerId, IdentityVerificationProgramEnum.IdentityVerificationProgram verificationProgram)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> startIdentityVerificationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetIdentityVerification</td>
 *      <td><p> Returns Identity Verification information.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getIdentityVerification(GetIdentityVerificationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getIdentityVerification(String customerId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getIdentityVerificationCallable()
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
 * IdentityVerificationServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * IdentityVerificationServiceSettings identityVerificationServiceSettings =
 *     IdentityVerificationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * IdentityVerificationServiceClient identityVerificationServiceClient =
 *     IdentityVerificationServiceClient.create(identityVerificationServiceSettings);
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
 * IdentityVerificationServiceSettings identityVerificationServiceSettings =
 *     IdentityVerificationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * IdentityVerificationServiceClient identityVerificationServiceClient =
 *     IdentityVerificationServiceClient.create(identityVerificationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class IdentityVerificationServiceClient implements BackgroundResource {
  private final IdentityVerificationServiceSettings settings;
  private final IdentityVerificationServiceStub stub;

  /** Constructs an instance of IdentityVerificationServiceClient with default settings. */
  public static final IdentityVerificationServiceClient create() throws IOException {
    return create(IdentityVerificationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of IdentityVerificationServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final IdentityVerificationServiceClient create(
      IdentityVerificationServiceSettings settings) throws IOException {
    return new IdentityVerificationServiceClient(settings);
  }

  /**
   * Constructs an instance of IdentityVerificationServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(IdentityVerificationServiceSettings).
   */
  public static final IdentityVerificationServiceClient create(
      IdentityVerificationServiceStub stub) {
    return new IdentityVerificationServiceClient(stub);
  }

  /**
   * Constructs an instance of IdentityVerificationServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected IdentityVerificationServiceClient(IdentityVerificationServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((IdentityVerificationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected IdentityVerificationServiceClient(IdentityVerificationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final IdentityVerificationServiceSettings getSettings() {
    return settings;
  }

  public IdentityVerificationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts Identity Verification for a given verification program type. Statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IdentityVerificationServiceClient identityVerificationServiceClient =
   *     IdentityVerificationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   IdentityVerificationProgramEnum.IdentityVerificationProgram verificationProgram =
   *       IdentityVerificationProgramEnum.IdentityVerificationProgram.forNumber(0);
   *   identityVerificationServiceClient.startIdentityVerification(customerId, verificationProgram);
   * }
   * }</pre>
   *
   * @param customerId Required. The Id of the customer for whom we are creating this verification.
   * @param verificationProgram Required. The verification program type for which we want to start
   *     the verification.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void startIdentityVerification(
      String customerId,
      IdentityVerificationProgramEnum.IdentityVerificationProgram verificationProgram) {
    StartIdentityVerificationRequest request =
        StartIdentityVerificationRequest.newBuilder()
            .setCustomerId(customerId)
            .setVerificationProgram(verificationProgram)
            .build();
    startIdentityVerification(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts Identity Verification for a given verification program type. Statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IdentityVerificationServiceClient identityVerificationServiceClient =
   *     IdentityVerificationServiceClient.create()) {
   *   StartIdentityVerificationRequest request =
   *       StartIdentityVerificationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   identityVerificationServiceClient.startIdentityVerification(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void startIdentityVerification(StartIdentityVerificationRequest request) {
    startIdentityVerificationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts Identity Verification for a given verification program type. Statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IdentityVerificationServiceClient identityVerificationServiceClient =
   *     IdentityVerificationServiceClient.create()) {
   *   StartIdentityVerificationRequest request =
   *       StartIdentityVerificationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   ApiFuture<Empty> future =
   *       identityVerificationServiceClient.startIdentityVerificationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StartIdentityVerificationRequest, Empty>
      startIdentityVerificationCallable() {
    return stub.startIdentityVerificationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns Identity Verification information.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IdentityVerificationServiceClient identityVerificationServiceClient =
   *     IdentityVerificationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   GetIdentityVerificationResponse response =
   *       identityVerificationServiceClient.getIdentityVerification(customerId);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer for whom we are requesting verification
   *     information.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GetIdentityVerificationResponse getIdentityVerification(String customerId) {
    GetIdentityVerificationRequest request =
        GetIdentityVerificationRequest.newBuilder().setCustomerId(customerId).build();
    return getIdentityVerification(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns Identity Verification information.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IdentityVerificationServiceClient identityVerificationServiceClient =
   *     IdentityVerificationServiceClient.create()) {
   *   GetIdentityVerificationRequest request =
   *       GetIdentityVerificationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   GetIdentityVerificationResponse response =
   *       identityVerificationServiceClient.getIdentityVerification(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GetIdentityVerificationResponse getIdentityVerification(
      GetIdentityVerificationRequest request) {
    return getIdentityVerificationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns Identity Verification information.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (IdentityVerificationServiceClient identityVerificationServiceClient =
   *     IdentityVerificationServiceClient.create()) {
   *   GetIdentityVerificationRequest request =
   *       GetIdentityVerificationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   ApiFuture<GetIdentityVerificationResponse> future =
   *       identityVerificationServiceClient.getIdentityVerificationCallable().futureCall(request);
   *   // Do something.
   *   GetIdentityVerificationResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIdentityVerificationRequest, GetIdentityVerificationResponse>
      getIdentityVerificationCallable() {
    return stub.getIdentityVerificationCallable();
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
