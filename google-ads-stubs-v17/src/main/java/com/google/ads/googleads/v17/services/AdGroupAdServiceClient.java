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

package com.google.ads.googleads.v17.services;

import com.google.ads.googleads.v17.resources.AdGroupAdName;
import com.google.ads.googleads.v17.services.stub.AdGroupAdServiceStub;
import com.google.ads.googleads.v17.services.stub.AdGroupAdServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage ads in an ad group.
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
 * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupAdOperation> operations = new ArrayList<>();
 *   MutateAdGroupAdsResponse response =
 *       adGroupAdServiceClient.mutateAdGroupAds(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AdGroupAdServiceClient object to clean up resources
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
 *      <td><p> MutateAdGroupAds</td>
 *      <td><p> Creates, updates, or removes ads. Operation statuses are returned.
 * <p>  List of thrown errors:   [AdCustomizerError]()   [AdError]()   [AdGroupAdError]()   [AdSharingError]()   [AdxError]()   [AssetError]()   [AssetLinkError]()   [AuthenticationError]()   [AuthorizationError]()   [CollectionSizeError]()   [ContextError]()   [DatabaseError]()   [DateError]()   [DistinctError]()   [FeedAttributeReferenceError]()   [FieldError]()   [FieldMaskError]()   [FunctionError]()   [FunctionParsingError]()   [HeaderError]()   [IdError]()   [ImageError]()   [InternalError]()   [ListOperationError]()   [MediaBundleError]()   [MediaFileError]()   [MutateError]()   [NewResourceCreationError]()   [NotEmptyError]()   [NullError]()   [OperationAccessDeniedError]()   [OperatorError]()   [PolicyFindingError]()   [PolicyValidationParameterError]()   [PolicyViolationError]()   [QuotaError]()   [RangeError]()   [RequestError]()   [ResourceCountLimitExceededError]()   [SizeLimitError]()   [StringFormatError]()   [StringLengthError]()   [UrlFieldError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateAdGroupAds(MutateAdGroupAdsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateAdGroupAds(String customerId, List&lt;AdGroupAdOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateAdGroupAdsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> RemoveAutomaticallyCreatedAssets</td>
 *      <td><p> Remove automatically created assets from an ad.
 * <p>  List of thrown errors:   [AdError]()   [AuthenticationError]()   [AuthorizationError]()   [AutomaticallyCreatedAssetRemovalError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> removeAutomaticallyCreatedAssets(RemoveAutomaticallyCreatedAssetsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> removeAutomaticallyCreatedAssets(AdGroupAdName adGroupAd, List&lt;AssetsWithFieldType&gt; assetsWithFieldType)
 *           <li><p> removeAutomaticallyCreatedAssets(String adGroupAd, List&lt;AssetsWithFieldType&gt; assetsWithFieldType)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> removeAutomaticallyCreatedAssetsCallable()
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
 * <p>This class can be customized by passing in a custom instance of AdGroupAdServiceSettings to
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
 * AdGroupAdServiceSettings adGroupAdServiceSettings =
 *     AdGroupAdServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupAdServiceClient adGroupAdServiceClient =
 *     AdGroupAdServiceClient.create(adGroupAdServiceSettings);
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
 * AdGroupAdServiceSettings adGroupAdServiceSettings =
 *     AdGroupAdServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupAdServiceClient adGroupAdServiceClient =
 *     AdGroupAdServiceClient.create(adGroupAdServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AdGroupAdServiceClient implements BackgroundResource {
  private final AdGroupAdServiceSettings settings;
  private final AdGroupAdServiceStub stub;

  /** Constructs an instance of AdGroupAdServiceClient with default settings. */
  public static final AdGroupAdServiceClient create() throws IOException {
    return create(AdGroupAdServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupAdServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AdGroupAdServiceClient create(AdGroupAdServiceSettings settings)
      throws IOException {
    return new AdGroupAdServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupAdServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(AdGroupAdServiceSettings).
   */
  public static final AdGroupAdServiceClient create(AdGroupAdServiceStub stub) {
    return new AdGroupAdServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupAdServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected AdGroupAdServiceClient(AdGroupAdServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AdGroupAdServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AdGroupAdServiceClient(AdGroupAdServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupAdServiceSettings getSettings() {
    return settings;
  }

  public AdGroupAdServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ads. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdCustomizerError]() [AdError]() [AdGroupAdError]()
   * [AdSharingError]() [AdxError]() [AssetError]() [AssetLinkError]() [AuthenticationError]()
   * [AuthorizationError]() [CollectionSizeError]() [ContextError]() [DatabaseError]() [DateError]()
   * [DistinctError]() [FeedAttributeReferenceError]() [FieldError]() [FieldMaskError]()
   * [FunctionError]() [FunctionParsingError]() [HeaderError]() [IdError]() [ImageError]()
   * [InternalError]() [ListOperationError]() [MediaBundleError]() [MediaFileError]()
   * [MutateError]() [NewResourceCreationError]() [NotEmptyError]() [NullError]()
   * [OperationAccessDeniedError]() [OperatorError]() [PolicyFindingError]()
   * [PolicyValidationParameterError]() [PolicyViolationError]() [QuotaError]() [RangeError]()
   * [RequestError]() [ResourceCountLimitExceededError]() [SizeLimitError]() [StringFormatError]()
   * [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AdGroupAdOperation> operations = new ArrayList<>();
   *   MutateAdGroupAdsResponse response =
   *       adGroupAdServiceClient.mutateAdGroupAds(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose ads are being modified.
   * @param operations Required. The list of operations to perform on individual ads.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupAdsResponse mutateAdGroupAds(
      String customerId, List<AdGroupAdOperation> operations) {
    MutateAdGroupAdsRequest request =
        MutateAdGroupAdsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupAds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ads. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdCustomizerError]() [AdError]() [AdGroupAdError]()
   * [AdSharingError]() [AdxError]() [AssetError]() [AssetLinkError]() [AuthenticationError]()
   * [AuthorizationError]() [CollectionSizeError]() [ContextError]() [DatabaseError]() [DateError]()
   * [DistinctError]() [FeedAttributeReferenceError]() [FieldError]() [FieldMaskError]()
   * [FunctionError]() [FunctionParsingError]() [HeaderError]() [IdError]() [ImageError]()
   * [InternalError]() [ListOperationError]() [MediaBundleError]() [MediaFileError]()
   * [MutateError]() [NewResourceCreationError]() [NotEmptyError]() [NullError]()
   * [OperationAccessDeniedError]() [OperatorError]() [PolicyFindingError]()
   * [PolicyValidationParameterError]() [PolicyViolationError]() [QuotaError]() [RangeError]()
   * [RequestError]() [ResourceCountLimitExceededError]() [SizeLimitError]() [StringFormatError]()
   * [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   MutateAdGroupAdsRequest request =
   *       MutateAdGroupAdsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupAdOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAdGroupAdsResponse response = adGroupAdServiceClient.mutateAdGroupAds(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupAdsResponse mutateAdGroupAds(MutateAdGroupAdsRequest request) {
    return mutateAdGroupAdsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes ads. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdCustomizerError]() [AdError]() [AdGroupAdError]()
   * [AdSharingError]() [AdxError]() [AssetError]() [AssetLinkError]() [AuthenticationError]()
   * [AuthorizationError]() [CollectionSizeError]() [ContextError]() [DatabaseError]() [DateError]()
   * [DistinctError]() [FeedAttributeReferenceError]() [FieldError]() [FieldMaskError]()
   * [FunctionError]() [FunctionParsingError]() [HeaderError]() [IdError]() [ImageError]()
   * [InternalError]() [ListOperationError]() [MediaBundleError]() [MediaFileError]()
   * [MutateError]() [NewResourceCreationError]() [NotEmptyError]() [NullError]()
   * [OperationAccessDeniedError]() [OperatorError]() [PolicyFindingError]()
   * [PolicyValidationParameterError]() [PolicyViolationError]() [QuotaError]() [RangeError]()
   * [RequestError]() [ResourceCountLimitExceededError]() [SizeLimitError]() [StringFormatError]()
   * [StringLengthError]() [UrlFieldError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   MutateAdGroupAdsRequest request =
   *       MutateAdGroupAdsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AdGroupAdOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAdGroupAdsResponse> future =
   *       adGroupAdServiceClient.mutateAdGroupAdsCallable().futureCall(request);
   *   // Do something.
   *   MutateAdGroupAdsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateAdGroupAdsRequest, MutateAdGroupAdsResponse>
      mutateAdGroupAdsCallable() {
    return stub.mutateAdGroupAdsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove automatically created assets from an ad.
   *
   * <p>List of thrown errors: [AdError]() [AuthenticationError]() [AuthorizationError]()
   * [AutomaticallyCreatedAssetRemovalError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   AdGroupAdName adGroupAd = AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]");
   *   List<AssetsWithFieldType> assetsWithFieldType = new ArrayList<>();
   *   adGroupAdServiceClient.removeAutomaticallyCreatedAssets(adGroupAd, assetsWithFieldType);
   * }
   * }</pre>
   *
   * @param adGroupAd Required. The resource name of the AdGroupAd from which to remove
   *     automatically created assets.
   * @param assetsWithFieldType Required. List of assets with field type to be removed from the
   *     AdGroupAd.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void removeAutomaticallyCreatedAssets(
      AdGroupAdName adGroupAd, List<AssetsWithFieldType> assetsWithFieldType) {
    RemoveAutomaticallyCreatedAssetsRequest request =
        RemoveAutomaticallyCreatedAssetsRequest.newBuilder()
            .setAdGroupAd(adGroupAd == null ? null : adGroupAd.toString())
            .addAllAssetsWithFieldType(assetsWithFieldType)
            .build();
    removeAutomaticallyCreatedAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove automatically created assets from an ad.
   *
   * <p>List of thrown errors: [AdError]() [AuthenticationError]() [AuthorizationError]()
   * [AutomaticallyCreatedAssetRemovalError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   String adGroupAd = AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString();
   *   List<AssetsWithFieldType> assetsWithFieldType = new ArrayList<>();
   *   adGroupAdServiceClient.removeAutomaticallyCreatedAssets(adGroupAd, assetsWithFieldType);
   * }
   * }</pre>
   *
   * @param adGroupAd Required. The resource name of the AdGroupAd from which to remove
   *     automatically created assets.
   * @param assetsWithFieldType Required. List of assets with field type to be removed from the
   *     AdGroupAd.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void removeAutomaticallyCreatedAssets(
      String adGroupAd, List<AssetsWithFieldType> assetsWithFieldType) {
    RemoveAutomaticallyCreatedAssetsRequest request =
        RemoveAutomaticallyCreatedAssetsRequest.newBuilder()
            .setAdGroupAd(adGroupAd)
            .addAllAssetsWithFieldType(assetsWithFieldType)
            .build();
    removeAutomaticallyCreatedAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove automatically created assets from an ad.
   *
   * <p>List of thrown errors: [AdError]() [AuthenticationError]() [AuthorizationError]()
   * [AutomaticallyCreatedAssetRemovalError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   RemoveAutomaticallyCreatedAssetsRequest request =
   *       RemoveAutomaticallyCreatedAssetsRequest.newBuilder()
   *           .setAdGroupAd(
   *               AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
   *           .addAllAssetsWithFieldType(new ArrayList<AssetsWithFieldType>())
   *           .build();
   *   adGroupAdServiceClient.removeAutomaticallyCreatedAssets(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void removeAutomaticallyCreatedAssets(
      RemoveAutomaticallyCreatedAssetsRequest request) {
    removeAutomaticallyCreatedAssetsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove automatically created assets from an ad.
   *
   * <p>List of thrown errors: [AdError]() [AuthenticationError]() [AuthorizationError]()
   * [AutomaticallyCreatedAssetRemovalError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
   *   RemoveAutomaticallyCreatedAssetsRequest request =
   *       RemoveAutomaticallyCreatedAssetsRequest.newBuilder()
   *           .setAdGroupAd(
   *               AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
   *           .addAllAssetsWithFieldType(new ArrayList<AssetsWithFieldType>())
   *           .build();
   *   ApiFuture<Empty> future =
   *       adGroupAdServiceClient.removeAutomaticallyCreatedAssetsCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RemoveAutomaticallyCreatedAssetsRequest, Empty>
      removeAutomaticallyCreatedAssetsCallable() {
    return stub.removeAutomaticallyCreatedAssetsCallable();
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
