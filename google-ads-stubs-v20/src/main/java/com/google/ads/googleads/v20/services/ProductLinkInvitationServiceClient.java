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

package com.google.ads.googleads.v20.services;

import com.google.ads.googleads.v20.enums.ProductLinkInvitationStatusEnum;
import com.google.ads.googleads.v20.resources.ProductLinkInvitation;
import com.google.ads.googleads.v20.resources.ProductLinkInvitationName;
import com.google.ads.googleads.v20.services.stub.ProductLinkInvitationServiceStub;
import com.google.ads.googleads.v20.services.stub.ProductLinkInvitationServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service allows management of product link invitations from Google Ads
 * accounts to other accounts.
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
 * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
 *     ProductLinkInvitationServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   ProductLinkInvitation productLinkInvitation = ProductLinkInvitation.newBuilder().build();
 *   CreateProductLinkInvitationResponse response =
 *       productLinkInvitationServiceClient.createProductLinkInvitation(
 *           customerId, productLinkInvitation);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ProductLinkInvitationServiceClient object to clean up
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
 *      <td><p> CreateProductLinkInvitation</td>
 *      <td><p> Creates a product link invitation.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createProductLinkInvitation(CreateProductLinkInvitationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createProductLinkInvitation(String customerId, ProductLinkInvitation productLinkInvitation)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createProductLinkInvitationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateProductLinkInvitation</td>
 *      <td><p> Update a product link invitation.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateProductLinkInvitation(UpdateProductLinkInvitationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateProductLinkInvitation(String customerId, ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus, ProductLinkInvitationName resourceName)
 *           <li><p> updateProductLinkInvitation(String customerId, ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus, String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateProductLinkInvitationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> RemoveProductLinkInvitation</td>
 *      <td><p> Remove a product link invitation.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> removeProductLinkInvitation(RemoveProductLinkInvitationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> removeProductLinkInvitation(String customerId, ProductLinkInvitationName resourceName)
 *           <li><p> removeProductLinkInvitation(String customerId, String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> removeProductLinkInvitationCallable()
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
 * ProductLinkInvitationServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ProductLinkInvitationServiceSettings productLinkInvitationServiceSettings =
 *     ProductLinkInvitationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
 *     ProductLinkInvitationServiceClient.create(productLinkInvitationServiceSettings);
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
 * ProductLinkInvitationServiceSettings productLinkInvitationServiceSettings =
 *     ProductLinkInvitationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
 *     ProductLinkInvitationServiceClient.create(productLinkInvitationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ProductLinkInvitationServiceClient implements BackgroundResource {
  private final ProductLinkInvitationServiceSettings settings;
  private final ProductLinkInvitationServiceStub stub;

  /** Constructs an instance of ProductLinkInvitationServiceClient with default settings. */
  public static final ProductLinkInvitationServiceClient create() throws IOException {
    return create(ProductLinkInvitationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ProductLinkInvitationServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ProductLinkInvitationServiceClient create(
      ProductLinkInvitationServiceSettings settings) throws IOException {
    return new ProductLinkInvitationServiceClient(settings);
  }

  /**
   * Constructs an instance of ProductLinkInvitationServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(ProductLinkInvitationServiceSettings).
   */
  public static final ProductLinkInvitationServiceClient create(
      ProductLinkInvitationServiceStub stub) {
    return new ProductLinkInvitationServiceClient(stub);
  }

  /**
   * Constructs an instance of ProductLinkInvitationServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ProductLinkInvitationServiceClient(ProductLinkInvitationServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((ProductLinkInvitationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ProductLinkInvitationServiceClient(ProductLinkInvitationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ProductLinkInvitationServiceSettings getSettings() {
    return settings;
  }

  public ProductLinkInvitationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   ProductLinkInvitation productLinkInvitation = ProductLinkInvitation.newBuilder().build();
   *   CreateProductLinkInvitationResponse response =
   *       productLinkInvitationServiceClient.createProductLinkInvitation(
   *           customerId, productLinkInvitation);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer being modified.
   * @param productLinkInvitation Required. The product link invitation to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateProductLinkInvitationResponse createProductLinkInvitation(
      String customerId, ProductLinkInvitation productLinkInvitation) {
    CreateProductLinkInvitationRequest request =
        CreateProductLinkInvitationRequest.newBuilder()
            .setCustomerId(customerId)
            .setProductLinkInvitation(productLinkInvitation)
            .build();
    return createProductLinkInvitation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   CreateProductLinkInvitationRequest request =
   *       CreateProductLinkInvitationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setProductLinkInvitation(ProductLinkInvitation.newBuilder().build())
   *           .build();
   *   CreateProductLinkInvitationResponse response =
   *       productLinkInvitationServiceClient.createProductLinkInvitation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateProductLinkInvitationResponse createProductLinkInvitation(
      CreateProductLinkInvitationRequest request) {
    return createProductLinkInvitationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   CreateProductLinkInvitationRequest request =
   *       CreateProductLinkInvitationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setProductLinkInvitation(ProductLinkInvitation.newBuilder().build())
   *           .build();
   *   ApiFuture<CreateProductLinkInvitationResponse> future =
   *       productLinkInvitationServiceClient
   *           .createProductLinkInvitationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   CreateProductLinkInvitationResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          CreateProductLinkInvitationRequest, CreateProductLinkInvitationResponse>
      createProductLinkInvitationCallable() {
    return stub.createProductLinkInvitationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus =
   *       ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus.forNumber(0);
   *   ProductLinkInvitationName resourceName =
   *       ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]");
   *   UpdateProductLinkInvitationResponse response =
   *       productLinkInvitationServiceClient.updateProductLinkInvitation(
   *           customerId, productLinkInvitationStatus, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer being modified.
   * @param productLinkInvitationStatus Required. The product link invitation to be created.
   * @param resourceName Required. Resource name of the product link invitation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UpdateProductLinkInvitationResponse updateProductLinkInvitation(
      String customerId,
      ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus,
      ProductLinkInvitationName resourceName) {
    UpdateProductLinkInvitationRequest request =
        UpdateProductLinkInvitationRequest.newBuilder()
            .setCustomerId(customerId)
            .setProductLinkInvitationStatus(productLinkInvitationStatus)
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return updateProductLinkInvitation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus =
   *       ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus.forNumber(0);
   *   String resourceName =
   *       ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]").toString();
   *   UpdateProductLinkInvitationResponse response =
   *       productLinkInvitationServiceClient.updateProductLinkInvitation(
   *           customerId, productLinkInvitationStatus, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer being modified.
   * @param productLinkInvitationStatus Required. The product link invitation to be created.
   * @param resourceName Required. Resource name of the product link invitation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UpdateProductLinkInvitationResponse updateProductLinkInvitation(
      String customerId,
      ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus,
      String resourceName) {
    UpdateProductLinkInvitationRequest request =
        UpdateProductLinkInvitationRequest.newBuilder()
            .setCustomerId(customerId)
            .setProductLinkInvitationStatus(productLinkInvitationStatus)
            .setResourceName(resourceName)
            .build();
    return updateProductLinkInvitation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   UpdateProductLinkInvitationRequest request =
   *       UpdateProductLinkInvitationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(
   *               ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]")
   *                   .toString())
   *           .build();
   *   UpdateProductLinkInvitationResponse response =
   *       productLinkInvitationServiceClient.updateProductLinkInvitation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UpdateProductLinkInvitationResponse updateProductLinkInvitation(
      UpdateProductLinkInvitationRequest request) {
    return updateProductLinkInvitationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   UpdateProductLinkInvitationRequest request =
   *       UpdateProductLinkInvitationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(
   *               ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<UpdateProductLinkInvitationResponse> future =
   *       productLinkInvitationServiceClient
   *           .updateProductLinkInvitationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   UpdateProductLinkInvitationResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          UpdateProductLinkInvitationRequest, UpdateProductLinkInvitationResponse>
      updateProductLinkInvitationCallable() {
    return stub.updateProductLinkInvitationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   ProductLinkInvitationName resourceName =
   *       ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]");
   *   RemoveProductLinkInvitationResponse response =
   *       productLinkInvitationServiceClient.removeProductLinkInvitation(customerId, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the product link invitation being removed.
   * @param resourceName Required. The resource name of the product link invitation being removed.
   *     expected, in this format:
   *     <p>` `
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveProductLinkInvitationResponse removeProductLinkInvitation(
      String customerId, ProductLinkInvitationName resourceName) {
    RemoveProductLinkInvitationRequest request =
        RemoveProductLinkInvitationRequest.newBuilder()
            .setCustomerId(customerId)
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return removeProductLinkInvitation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   String resourceName =
   *       ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]").toString();
   *   RemoveProductLinkInvitationResponse response =
   *       productLinkInvitationServiceClient.removeProductLinkInvitation(customerId, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the product link invitation being removed.
   * @param resourceName Required. The resource name of the product link invitation being removed.
   *     expected, in this format:
   *     <p>` `
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveProductLinkInvitationResponse removeProductLinkInvitation(
      String customerId, String resourceName) {
    RemoveProductLinkInvitationRequest request =
        RemoveProductLinkInvitationRequest.newBuilder()
            .setCustomerId(customerId)
            .setResourceName(resourceName)
            .build();
    return removeProductLinkInvitation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   RemoveProductLinkInvitationRequest request =
   *       RemoveProductLinkInvitationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(
   *               ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]")
   *                   .toString())
   *           .build();
   *   RemoveProductLinkInvitationResponse response =
   *       productLinkInvitationServiceClient.removeProductLinkInvitation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveProductLinkInvitationResponse removeProductLinkInvitation(
      RemoveProductLinkInvitationRequest request) {
    return removeProductLinkInvitationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove a product link invitation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkInvitationServiceClient productLinkInvitationServiceClient =
   *     ProductLinkInvitationServiceClient.create()) {
   *   RemoveProductLinkInvitationRequest request =
   *       RemoveProductLinkInvitationRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(
   *               ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<RemoveProductLinkInvitationResponse> future =
   *       productLinkInvitationServiceClient
   *           .removeProductLinkInvitationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   RemoveProductLinkInvitationResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          RemoveProductLinkInvitationRequest, RemoveProductLinkInvitationResponse>
      removeProductLinkInvitationCallable() {
    return stub.removeProductLinkInvitationCallable();
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
