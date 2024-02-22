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

package com.google.ads.googleads.v16.services;

import com.google.ads.googleads.v16.resources.ProductLink;
import com.google.ads.googleads.v16.resources.ProductLinkName;
import com.google.ads.googleads.v16.services.stub.ProductLinkServiceStub;
import com.google.ads.googleads.v16.services.stub.ProductLinkServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service allows management of links between a Google Ads customer and
 * another product.
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
 * try (ProductLinkServiceClient productLinkServiceClient = ProductLinkServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   ProductLink productLink = ProductLink.newBuilder().build();
 *   CreateProductLinkResponse response =
 *       productLinkServiceClient.createProductLink(customerId, productLink);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ProductLinkServiceClient object to clean up resources
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
 *      <td><p> CreateProductLink</td>
 *      <td><p> Creates a product link.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [DatabaseError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createProductLink(CreateProductLinkRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createProductLink(String customerId, ProductLink productLink)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createProductLinkCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> RemoveProductLink</td>
 *      <td><p> Removes a product link.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [FieldMaskError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> removeProductLink(RemoveProductLinkRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> removeProductLink(String customerId, ProductLinkName resourceName)
 *           <li><p> removeProductLink(String customerId, String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> removeProductLinkCallable()
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
 * <p>This class can be customized by passing in a custom instance of ProductLinkServiceSettings to
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
 * ProductLinkServiceSettings productLinkServiceSettings =
 *     ProductLinkServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ProductLinkServiceClient productLinkServiceClient =
 *     ProductLinkServiceClient.create(productLinkServiceSettings);
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
 * ProductLinkServiceSettings productLinkServiceSettings =
 *     ProductLinkServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ProductLinkServiceClient productLinkServiceClient =
 *     ProductLinkServiceClient.create(productLinkServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ProductLinkServiceClient implements BackgroundResource {
  private final ProductLinkServiceSettings settings;
  private final ProductLinkServiceStub stub;

  /** Constructs an instance of ProductLinkServiceClient with default settings. */
  public static final ProductLinkServiceClient create() throws IOException {
    return create(ProductLinkServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ProductLinkServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ProductLinkServiceClient create(ProductLinkServiceSettings settings)
      throws IOException {
    return new ProductLinkServiceClient(settings);
  }

  /**
   * Constructs an instance of ProductLinkServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(ProductLinkServiceSettings).
   */
  public static final ProductLinkServiceClient create(ProductLinkServiceStub stub) {
    return new ProductLinkServiceClient(stub);
  }

  /**
   * Constructs an instance of ProductLinkServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ProductLinkServiceClient(ProductLinkServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ProductLinkServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ProductLinkServiceClient(ProductLinkServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ProductLinkServiceSettings getSettings() {
    return settings;
  }

  public ProductLinkServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a product link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkServiceClient productLinkServiceClient = ProductLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   ProductLink productLink = ProductLink.newBuilder().build();
   *   CreateProductLinkResponse response =
   *       productLinkServiceClient.createProductLink(customerId, productLink);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer for which the product link is created.
   * @param productLink Required. The product link to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateProductLinkResponse createProductLink(
      String customerId, ProductLink productLink) {
    CreateProductLinkRequest request =
        CreateProductLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setProductLink(productLink)
            .build();
    return createProductLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a product link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkServiceClient productLinkServiceClient = ProductLinkServiceClient.create()) {
   *   CreateProductLinkRequest request =
   *       CreateProductLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setProductLink(ProductLink.newBuilder().build())
   *           .build();
   *   CreateProductLinkResponse response = productLinkServiceClient.createProductLink(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateProductLinkResponse createProductLink(CreateProductLinkRequest request) {
    return createProductLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a product link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [FieldError]() [HeaderError]() [InternalError]() [MutateError]() [QuotaError]()
   * [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkServiceClient productLinkServiceClient = ProductLinkServiceClient.create()) {
   *   CreateProductLinkRequest request =
   *       CreateProductLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setProductLink(ProductLink.newBuilder().build())
   *           .build();
   *   ApiFuture<CreateProductLinkResponse> future =
   *       productLinkServiceClient.createProductLinkCallable().futureCall(request);
   *   // Do something.
   *   CreateProductLinkResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateProductLinkRequest, CreateProductLinkResponse>
      createProductLinkCallable() {
    return stub.createProductLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes a product link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkServiceClient productLinkServiceClient = ProductLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   ProductLinkName resourceName = ProductLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]");
   *   RemoveProductLinkResponse response =
   *       productLinkServiceClient.removeProductLink(customerId, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer being modified.
   * @param resourceName Required. Remove operation: A resource name for the product link to remove
   *     is expected, in this format:
   *     <p>`customers/{customer_id}/productLinks/{product_link_id} `
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveProductLinkResponse removeProductLink(
      String customerId, ProductLinkName resourceName) {
    RemoveProductLinkRequest request =
        RemoveProductLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return removeProductLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes a product link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkServiceClient productLinkServiceClient = ProductLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   String resourceName = ProductLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]").toString();
   *   RemoveProductLinkResponse response =
   *       productLinkServiceClient.removeProductLink(customerId, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer being modified.
   * @param resourceName Required. Remove operation: A resource name for the product link to remove
   *     is expected, in this format:
   *     <p>`customers/{customer_id}/productLinks/{product_link_id} `
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveProductLinkResponse removeProductLink(String customerId, String resourceName) {
    RemoveProductLinkRequest request =
        RemoveProductLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setResourceName(resourceName)
            .build();
    return removeProductLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes a product link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkServiceClient productLinkServiceClient = ProductLinkServiceClient.create()) {
   *   RemoveProductLinkRequest request =
   *       RemoveProductLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(ProductLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   RemoveProductLinkResponse response = productLinkServiceClient.removeProductLink(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveProductLinkResponse removeProductLink(RemoveProductLinkRequest request) {
    return removeProductLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes a product link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ProductLinkServiceClient productLinkServiceClient = ProductLinkServiceClient.create()) {
   *   RemoveProductLinkRequest request =
   *       RemoveProductLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(ProductLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<RemoveProductLinkResponse> future =
   *       productLinkServiceClient.removeProductLinkCallable().futureCall(request);
   *   // Do something.
   *   RemoveProductLinkResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RemoveProductLinkRequest, RemoveProductLinkResponse>
      removeProductLinkCallable() {
    return stub.removeProductLinkCallable();
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
