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

package com.google.ads.googleads.v15.services;

import com.google.ads.googleads.v15.services.stub.ConversionUploadServiceStub;
import com.google.ads.googleads.v15.services.stub.ConversionUploadServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to upload conversions.
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
 * try (ConversionUploadServiceClient conversionUploadServiceClient =
 *     ConversionUploadServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ClickConversion> conversions = new ArrayList<>();
 *   boolean partialFailure = true;
 *   UploadClickConversionsResponse response =
 *       conversionUploadServiceClient.uploadClickConversions(
 *           customerId, conversions, partialFailure);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ConversionUploadServiceClient object to clean up
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
 *      <td><p> UploadClickConversions</td>
 *      <td><p> Processes the given click conversions.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [ConversionUploadError]()   [HeaderError]()   [InternalError]()   [PartialFailureError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> uploadClickConversions(UploadClickConversionsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> uploadClickConversions(String customerId, List&lt;ClickConversion&gt; conversions, boolean partialFailure)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> uploadClickConversionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UploadCallConversions</td>
 *      <td><p> Processes the given call conversions.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [PartialFailureError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> uploadCallConversions(UploadCallConversionsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> uploadCallConversions(String customerId, List&lt;CallConversion&gt; conversions, boolean partialFailure)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> uploadCallConversionsCallable()
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
 * ConversionUploadServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ConversionUploadServiceSettings conversionUploadServiceSettings =
 *     ConversionUploadServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ConversionUploadServiceClient conversionUploadServiceClient =
 *     ConversionUploadServiceClient.create(conversionUploadServiceSettings);
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
 * ConversionUploadServiceSettings conversionUploadServiceSettings =
 *     ConversionUploadServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ConversionUploadServiceClient conversionUploadServiceClient =
 *     ConversionUploadServiceClient.create(conversionUploadServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ConversionUploadServiceClient implements BackgroundResource {
  private final ConversionUploadServiceSettings settings;
  private final ConversionUploadServiceStub stub;

  /** Constructs an instance of ConversionUploadServiceClient with default settings. */
  public static final ConversionUploadServiceClient create() throws IOException {
    return create(ConversionUploadServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ConversionUploadServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ConversionUploadServiceClient create(ConversionUploadServiceSettings settings)
      throws IOException {
    return new ConversionUploadServiceClient(settings);
  }

  /**
   * Constructs an instance of ConversionUploadServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(ConversionUploadServiceSettings).
   */
  public static final ConversionUploadServiceClient create(ConversionUploadServiceStub stub) {
    return new ConversionUploadServiceClient(stub);
  }

  /**
   * Constructs an instance of ConversionUploadServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ConversionUploadServiceClient(ConversionUploadServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((ConversionUploadServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ConversionUploadServiceClient(ConversionUploadServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ConversionUploadServiceSettings getSettings() {
    return settings;
  }

  public ConversionUploadServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Processes the given click conversions.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [ConversionUploadError]() [HeaderError]() [InternalError]() [PartialFailureError]()
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
   * try (ConversionUploadServiceClient conversionUploadServiceClient =
   *     ConversionUploadServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<ClickConversion> conversions = new ArrayList<>();
   *   boolean partialFailure = true;
   *   UploadClickConversionsResponse response =
   *       conversionUploadServiceClient.uploadClickConversions(
   *           customerId, conversions, partialFailure);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer performing the upload.
   * @param conversions Required. The conversions that are being uploaded.
   * @param partialFailure Required. If true, successful operations will be carried out and invalid
   *     operations will return errors. If false, all operations will be carried out in one
   *     transaction if and only if they are all valid. This should always be set to true. See
   *     https://developers.google.com/google-ads/api/docs/best-practices/partial-failures for more
   *     information about partial failure.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadClickConversionsResponse uploadClickConversions(
      String customerId, List<ClickConversion> conversions, boolean partialFailure) {
    UploadClickConversionsRequest request =
        UploadClickConversionsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllConversions(conversions)
            .setPartialFailure(partialFailure)
            .build();
    return uploadClickConversions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Processes the given click conversions.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [ConversionUploadError]() [HeaderError]() [InternalError]() [PartialFailureError]()
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
   * try (ConversionUploadServiceClient conversionUploadServiceClient =
   *     ConversionUploadServiceClient.create()) {
   *   UploadClickConversionsRequest request =
   *       UploadClickConversionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllConversions(new ArrayList<ClickConversion>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .setDebugEnabled(true)
   *           .setJobId(-1154752291)
   *           .build();
   *   UploadClickConversionsResponse response =
   *       conversionUploadServiceClient.uploadClickConversions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadClickConversionsResponse uploadClickConversions(
      UploadClickConversionsRequest request) {
    return uploadClickConversionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Processes the given click conversions.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [ConversionUploadError]() [HeaderError]() [InternalError]() [PartialFailureError]()
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
   * try (ConversionUploadServiceClient conversionUploadServiceClient =
   *     ConversionUploadServiceClient.create()) {
   *   UploadClickConversionsRequest request =
   *       UploadClickConversionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllConversions(new ArrayList<ClickConversion>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .setDebugEnabled(true)
   *           .setJobId(-1154752291)
   *           .build();
   *   ApiFuture<UploadClickConversionsResponse> future =
   *       conversionUploadServiceClient.uploadClickConversionsCallable().futureCall(request);
   *   // Do something.
   *   UploadClickConversionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UploadClickConversionsRequest, UploadClickConversionsResponse>
      uploadClickConversionsCallable() {
    return stub.uploadClickConversionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Processes the given call conversions.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [PartialFailureError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ConversionUploadServiceClient conversionUploadServiceClient =
   *     ConversionUploadServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CallConversion> conversions = new ArrayList<>();
   *   boolean partialFailure = true;
   *   UploadCallConversionsResponse response =
   *       conversionUploadServiceClient.uploadCallConversions(
   *           customerId, conversions, partialFailure);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer performing the upload.
   * @param conversions Required. The conversions that are being uploaded.
   * @param partialFailure Required. If true, successful operations will be carried out and invalid
   *     operations will return errors. If false, all operations will be carried out in one
   *     transaction if and only if they are all valid. This should always be set to true. See
   *     https://developers.google.com/google-ads/api/docs/best-practices/partial-failures for more
   *     information about partial failure.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadCallConversionsResponse uploadCallConversions(
      String customerId, List<CallConversion> conversions, boolean partialFailure) {
    UploadCallConversionsRequest request =
        UploadCallConversionsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllConversions(conversions)
            .setPartialFailure(partialFailure)
            .build();
    return uploadCallConversions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Processes the given call conversions.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [PartialFailureError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ConversionUploadServiceClient conversionUploadServiceClient =
   *     ConversionUploadServiceClient.create()) {
   *   UploadCallConversionsRequest request =
   *       UploadCallConversionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllConversions(new ArrayList<CallConversion>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   UploadCallConversionsResponse response =
   *       conversionUploadServiceClient.uploadCallConversions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadCallConversionsResponse uploadCallConversions(
      UploadCallConversionsRequest request) {
    return uploadCallConversionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Processes the given call conversions.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [PartialFailureError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ConversionUploadServiceClient conversionUploadServiceClient =
   *     ConversionUploadServiceClient.create()) {
   *   UploadCallConversionsRequest request =
   *       UploadCallConversionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllConversions(new ArrayList<CallConversion>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<UploadCallConversionsResponse> future =
   *       conversionUploadServiceClient.uploadCallConversionsCallable().futureCall(request);
   *   // Do something.
   *   UploadCallConversionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UploadCallConversionsRequest, UploadCallConversionsResponse>
      uploadCallConversionsCallable() {
    return stub.uploadCallConversionsCallable();
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
