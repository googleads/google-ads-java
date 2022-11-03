/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v11.services;

import com.google.ads.googleads.v11.resources.MerchantCenterLink;
import com.google.ads.googleads.v11.resources.MerchantCenterLinkName;
import com.google.ads.googleads.v11.services.stub.MerchantCenterLinkServiceStub;
import com.google.ads.googleads.v11.services.stub.MerchantCenterLinkServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service allows management of links between Google Ads and Google
 * Merchant Center.
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
 * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
 *     MerchantCenterLinkServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   ListMerchantCenterLinksResponse response =
 *       merchantCenterLinkServiceClient.listMerchantCenterLinks(customerId);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the MerchantCenterLinkServiceClient object to clean up
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
 * MerchantCenterLinkServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * MerchantCenterLinkServiceSettings merchantCenterLinkServiceSettings =
 *     MerchantCenterLinkServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
 *     MerchantCenterLinkServiceClient.create(merchantCenterLinkServiceSettings);
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
 * MerchantCenterLinkServiceSettings merchantCenterLinkServiceSettings =
 *     MerchantCenterLinkServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
 *     MerchantCenterLinkServiceClient.create(merchantCenterLinkServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class MerchantCenterLinkServiceClient implements BackgroundResource {
  private final MerchantCenterLinkServiceSettings settings;
  private final MerchantCenterLinkServiceStub stub;

  /** Constructs an instance of MerchantCenterLinkServiceClient with default settings. */
  public static final MerchantCenterLinkServiceClient create() throws IOException {
    return create(MerchantCenterLinkServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of MerchantCenterLinkServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final MerchantCenterLinkServiceClient create(
      MerchantCenterLinkServiceSettings settings) throws IOException {
    return new MerchantCenterLinkServiceClient(settings);
  }

  /**
   * Constructs an instance of MerchantCenterLinkServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(MerchantCenterLinkServiceSettings).
   */
  public static final MerchantCenterLinkServiceClient create(MerchantCenterLinkServiceStub stub) {
    return new MerchantCenterLinkServiceClient(stub);
  }

  /**
   * Constructs an instance of MerchantCenterLinkServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected MerchantCenterLinkServiceClient(MerchantCenterLinkServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((MerchantCenterLinkServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected MerchantCenterLinkServiceClient(MerchantCenterLinkServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MerchantCenterLinkServiceSettings getSettings() {
    return settings;
  }

  public MerchantCenterLinkServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns Merchant Center links available for this customer.
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
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   ListMerchantCenterLinksResponse response =
   *       merchantCenterLinkServiceClient.listMerchantCenterLinks(customerId);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer onto which to apply the Merchant Center link
   *     list operation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMerchantCenterLinksResponse listMerchantCenterLinks(String customerId) {
    ListMerchantCenterLinksRequest request =
        ListMerchantCenterLinksRequest.newBuilder().setCustomerId(customerId).build();
    return listMerchantCenterLinks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns Merchant Center links available for this customer.
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
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   ListMerchantCenterLinksRequest request =
   *       ListMerchantCenterLinksRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   ListMerchantCenterLinksResponse response =
   *       merchantCenterLinkServiceClient.listMerchantCenterLinks(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMerchantCenterLinksResponse listMerchantCenterLinks(
      ListMerchantCenterLinksRequest request) {
    return listMerchantCenterLinksCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns Merchant Center links available for this customer.
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
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   ListMerchantCenterLinksRequest request =
   *       ListMerchantCenterLinksRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   ApiFuture<ListMerchantCenterLinksResponse> future =
   *       merchantCenterLinkServiceClient.listMerchantCenterLinksCallable().futureCall(request);
   *   // Do something.
   *   ListMerchantCenterLinksResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListMerchantCenterLinksRequest, ListMerchantCenterLinksResponse>
      listMerchantCenterLinksCallable() {
    return stub.listMerchantCenterLinksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the Merchant Center link in full detail.
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
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   MerchantCenterLinkName resourceName =
   *       MerchantCenterLinkName.of("[CUSTOMER_ID]", "[MERCHANT_CENTER_ID]");
   *   MerchantCenterLink response =
   *       merchantCenterLinkServiceClient.getMerchantCenterLink(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. Resource name of the Merchant Center link.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MerchantCenterLink getMerchantCenterLink(MerchantCenterLinkName resourceName) {
    GetMerchantCenterLinkRequest request =
        GetMerchantCenterLinkRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getMerchantCenterLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the Merchant Center link in full detail.
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
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   String resourceName =
   *       MerchantCenterLinkName.of("[CUSTOMER_ID]", "[MERCHANT_CENTER_ID]").toString();
   *   MerchantCenterLink response =
   *       merchantCenterLinkServiceClient.getMerchantCenterLink(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. Resource name of the Merchant Center link.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MerchantCenterLink getMerchantCenterLink(String resourceName) {
    GetMerchantCenterLinkRequest request =
        GetMerchantCenterLinkRequest.newBuilder().setResourceName(resourceName).build();
    return getMerchantCenterLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the Merchant Center link in full detail.
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
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   GetMerchantCenterLinkRequest request =
   *       GetMerchantCenterLinkRequest.newBuilder()
   *           .setResourceName(
   *               MerchantCenterLinkName.of("[CUSTOMER_ID]", "[MERCHANT_CENTER_ID]").toString())
   *           .build();
   *   MerchantCenterLink response = merchantCenterLinkServiceClient.getMerchantCenterLink(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MerchantCenterLink getMerchantCenterLink(GetMerchantCenterLinkRequest request) {
    return getMerchantCenterLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the Merchant Center link in full detail.
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
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   GetMerchantCenterLinkRequest request =
   *       GetMerchantCenterLinkRequest.newBuilder()
   *           .setResourceName(
   *               MerchantCenterLinkName.of("[CUSTOMER_ID]", "[MERCHANT_CENTER_ID]").toString())
   *           .build();
   *   ApiFuture<MerchantCenterLink> future =
   *       merchantCenterLinkServiceClient.getMerchantCenterLinkCallable().futureCall(request);
   *   // Do something.
   *   MerchantCenterLink response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetMerchantCenterLinkRequest, MerchantCenterLink>
      getMerchantCenterLinkCallable() {
    return stub.getMerchantCenterLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates status or removes a Merchant Center link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   MerchantCenterLinkOperation operation = MerchantCenterLinkOperation.newBuilder().build();
   *   MutateMerchantCenterLinkResponse response =
   *       merchantCenterLinkServiceClient.mutateMerchantCenterLink(customerId, operation);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer being modified.
   * @param operation Required. The operation to perform on the link
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateMerchantCenterLinkResponse mutateMerchantCenterLink(
      String customerId, MerchantCenterLinkOperation operation) {
    MutateMerchantCenterLinkRequest request =
        MutateMerchantCenterLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateMerchantCenterLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates status or removes a Merchant Center link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   MutateMerchantCenterLinkRequest request =
   *       MutateMerchantCenterLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(MerchantCenterLinkOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   MutateMerchantCenterLinkResponse response =
   *       merchantCenterLinkServiceClient.mutateMerchantCenterLink(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateMerchantCenterLinkResponse mutateMerchantCenterLink(
      MutateMerchantCenterLinkRequest request) {
    return mutateMerchantCenterLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates status or removes a Merchant Center link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
   *     MerchantCenterLinkServiceClient.create()) {
   *   MutateMerchantCenterLinkRequest request =
   *       MutateMerchantCenterLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setOperation(MerchantCenterLinkOperation.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateMerchantCenterLinkResponse> future =
   *       merchantCenterLinkServiceClient.mutateMerchantCenterLinkCallable().futureCall(request);
   *   // Do something.
   *   MutateMerchantCenterLinkResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateMerchantCenterLinkRequest, MutateMerchantCenterLinkResponse>
      mutateMerchantCenterLinkCallable() {
    return stub.mutateMerchantCenterLinkCallable();
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
