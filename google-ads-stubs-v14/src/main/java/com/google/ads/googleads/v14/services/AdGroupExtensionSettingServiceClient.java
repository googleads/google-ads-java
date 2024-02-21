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

package com.google.ads.googleads.v14.services;

import com.google.ads.googleads.v14.services.stub.AdGroupExtensionSettingServiceStub;
import com.google.ads.googleads.v14.services.stub.AdGroupExtensionSettingServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage ad group extension settings.
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
 * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient =
 *     AdGroupExtensionSettingServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupExtensionSettingOperation> operations = new ArrayList<>();
 *   MutateAdGroupExtensionSettingsResponse response =
 *       adGroupExtensionSettingServiceClient.mutateAdGroupExtensionSettings(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AdGroupExtensionSettingServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
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
 *      <td><p> MutateAdGroupExtensionSettings</td>
 *      <td><p> Creates, updates, or removes ad group extension settings. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CollectionSizeError]()   [CriterionError]()   [DatabaseError]()   [DateError]()   [DistinctError]()   [ExtensionSettingError]()   [FieldError]()   [FieldMaskError]()   [HeaderError]()   [IdError]()   [InternalError]()   [ListOperationError]()   [MutateError]()   [NewResourceCreationError]()   [NotEmptyError]()   [NullError]()   [OperationAccessDeniedError]()   [OperatorError]()   [QuotaError]()   [RangeError]()   [RequestError]()   [ResourceCountLimitExceededError]()   [SizeLimitError]()   [StringFormatError]()   [StringLengthError]()   [UrlFieldError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateAdGroupExtensionSettings(MutateAdGroupExtensionSettingsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateAdGroupExtensionSettings(String customerId, List&lt;AdGroupExtensionSettingOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateAdGroupExtensionSettingsCallable()
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
 * AdGroupExtensionSettingServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AdGroupExtensionSettingServiceSettings adGroupExtensionSettingServiceSettings =
 *     AdGroupExtensionSettingServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient =
 *     AdGroupExtensionSettingServiceClient.create(adGroupExtensionSettingServiceSettings);
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
 * AdGroupExtensionSettingServiceSettings adGroupExtensionSettingServiceSettings =
 *     AdGroupExtensionSettingServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient =
 *     AdGroupExtensionSettingServiceClient.create(adGroupExtensionSettingServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AdGroupExtensionSettingServiceClient implements BackgroundResource {
  private final AdGroupExtensionSettingServiceSettings settings;
  private final AdGroupExtensionSettingServiceStub stub;

  /** Constructs an instance of AdGroupExtensionSettingServiceClient with default settings. */
  public static final AdGroupExtensionSettingServiceClient create() throws IOException {
    return create(AdGroupExtensionSettingServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupExtensionSettingServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final AdGroupExtensionSettingServiceClient create(
      AdGroupExtensionSettingServiceSettings settings) throws IOException {
    return new AdGroupExtensionSettingServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupExtensionSettingServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using
   * create(AdGroupExtensionSettingServiceSettings).
   */
  public static final AdGroupExtensionSettingServiceClient create(
      AdGroupExtensionSettingServiceStub stub) {
    return new AdGroupExtensionSettingServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupExtensionSettingServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupExtensionSettingServiceClient(AdGroupExtensionSettingServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((AdGroupExtensionSettingServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AdGroupExtensionSettingServiceClient(AdGroupExtensionSettingServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupExtensionSettingServiceSettings getSettings() {
    return settings;
  }

  public AdGroupExtensionSettingServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ad group extension settings. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [CriterionError]() [DatabaseError]() [DateError]() [DistinctError]()
   * [ExtensionSettingError]() [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]()
   * [InternalError]() [ListOperationError]() [MutateError]() [NewResourceCreationError]()
   * [NotEmptyError]() [NullError]() [OperationAccessDeniedError]() [OperatorError]() [QuotaError]()
   * [RangeError]() [RequestError]() [ResourceCountLimitExceededError]() [SizeLimitError]()
   * [StringFormatError]() [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient =
   *     AdGroupExtensionSettingServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AdGroupExtensionSettingOperation> operations = new ArrayList<>();
   *   MutateAdGroupExtensionSettingsResponse response =
   *       adGroupExtensionSettingServiceClient.mutateAdGroupExtensionSettings(
   *           customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose ad group extension settings are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual ad group extension
   *     settings.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupExtensionSettingsResponse mutateAdGroupExtensionSettings(
      String customerId, List<AdGroupExtensionSettingOperation> operations) {
    MutateAdGroupExtensionSettingsRequest request =
        MutateAdGroupExtensionSettingsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupExtensionSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ad group extension settings. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [CriterionError]() [DatabaseError]() [DateError]() [DistinctError]()
   * [ExtensionSettingError]() [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]()
   * [InternalError]() [ListOperationError]() [MutateError]() [NewResourceCreationError]()
   * [NotEmptyError]() [NullError]() [OperationAccessDeniedError]() [OperatorError]() [QuotaError]()
   * [RangeError]() [RequestError]() [ResourceCountLimitExceededError]() [SizeLimitError]()
   * [StringFormatError]() [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient =
   *     AdGroupExtensionSettingServiceClient.create()) {
   *   MutateAdGroupExtensionSettingsRequest request =
   *       MutateAdGroupExtensionSettingsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupExtensionSettingOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAdGroupExtensionSettingsResponse response =
   *       adGroupExtensionSettingServiceClient.mutateAdGroupExtensionSettings(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupExtensionSettingsResponse mutateAdGroupExtensionSettings(
      MutateAdGroupExtensionSettingsRequest request) {
    return mutateAdGroupExtensionSettingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ad group extension settings. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [CriterionError]() [DatabaseError]() [DateError]() [DistinctError]()
   * [ExtensionSettingError]() [FieldError]() [FieldMaskError]() [HeaderError]() [IdError]()
   * [InternalError]() [ListOperationError]() [MutateError]() [NewResourceCreationError]()
   * [NotEmptyError]() [NullError]() [OperationAccessDeniedError]() [OperatorError]() [QuotaError]()
   * [RangeError]() [RequestError]() [ResourceCountLimitExceededError]() [SizeLimitError]()
   * [StringFormatError]() [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient =
   *     AdGroupExtensionSettingServiceClient.create()) {
   *   MutateAdGroupExtensionSettingsRequest request =
   *       MutateAdGroupExtensionSettingsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupExtensionSettingOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAdGroupExtensionSettingsResponse> future =
   *       adGroupExtensionSettingServiceClient
   *           .mutateAdGroupExtensionSettingsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   MutateAdGroupExtensionSettingsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          MutateAdGroupExtensionSettingsRequest, MutateAdGroupExtensionSettingsResponse>
      mutateAdGroupExtensionSettingsCallable() {
    return stub.mutateAdGroupExtensionSettingsCallable();
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
