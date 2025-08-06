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

package com.google.ads.googleads.v21.services;

import com.google.ads.googleads.v21.enums.DataLinkStatusEnum;
import com.google.ads.googleads.v21.resources.DataLink;
import com.google.ads.googleads.v21.resources.DataLinkName;
import com.google.ads.googleads.v21.services.stub.DataLinkServiceStub;
import com.google.ads.googleads.v21.services.stub.DataLinkServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: This service allows management of data links between a Google Ads customer
 * and another data entity.
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
 * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   DataLink dataLink = DataLink.newBuilder().build();
 *   CreateDataLinkResponse response = dataLinkServiceClient.createDataLink(customerId, dataLink);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the DataLinkServiceClient object to clean up resources
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
 *      <td><p> CreateDataLink</td>
 *      <td><p> Creates a data link. The requesting Google Ads account name and account ID will be shared with the third party (such as YouTube creators for video links) to whom you are creating the link with. Only customers on the allow-list can create data links.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [DatabaseError]()   [DataLinkError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createDataLink(CreateDataLinkRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createDataLink(String customerId, DataLink dataLink)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createDataLinkCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> RemoveDataLink</td>
 *      <td><p> Remove a data link.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [DatabaseError]()   [DataLinkError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> removeDataLink(RemoveDataLinkRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> removeDataLink(String customerId, DataLinkName resourceName)
 *           <li><p> removeDataLink(String customerId, String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> removeDataLinkCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateDataLink</td>
 *      <td><p> Update a data link.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [DatabaseError]()   [DataLinkError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateDataLink(UpdateDataLinkRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateDataLink(String customerId, DataLinkStatusEnum.DataLinkStatus dataLinkStatus, DataLinkName resourceName)
 *           <li><p> updateDataLink(String customerId, DataLinkStatusEnum.DataLinkStatus dataLinkStatus, String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateDataLinkCallable()
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
 * <p>This class can be customized by passing in a custom instance of DataLinkServiceSettings to
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
 * DataLinkServiceSettings dataLinkServiceSettings =
 *     DataLinkServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DataLinkServiceClient dataLinkServiceClient =
 *     DataLinkServiceClient.create(dataLinkServiceSettings);
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
 * DataLinkServiceSettings dataLinkServiceSettings =
 *     DataLinkServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DataLinkServiceClient dataLinkServiceClient =
 *     DataLinkServiceClient.create(dataLinkServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class DataLinkServiceClient implements BackgroundResource {
  private final DataLinkServiceSettings settings;
  private final DataLinkServiceStub stub;

  /** Constructs an instance of DataLinkServiceClient with default settings. */
  public static final DataLinkServiceClient create() throws IOException {
    return create(DataLinkServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DataLinkServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final DataLinkServiceClient create(DataLinkServiceSettings settings)
      throws IOException {
    return new DataLinkServiceClient(settings);
  }

  /**
   * Constructs an instance of DataLinkServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(DataLinkServiceSettings).
   */
  public static final DataLinkServiceClient create(DataLinkServiceStub stub) {
    return new DataLinkServiceClient(stub);
  }

  /**
   * Constructs an instance of DataLinkServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected DataLinkServiceClient(DataLinkServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((DataLinkServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected DataLinkServiceClient(DataLinkServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DataLinkServiceSettings getSettings() {
    return settings;
  }

  public DataLinkServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a data link. The requesting Google Ads account name and account ID will be shared with
   * the third party (such as YouTube creators for video links) to whom you are creating the link
   * with. Only customers on the allow-list can create data links.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   DataLink dataLink = DataLink.newBuilder().build();
   *   CreateDataLinkResponse response = dataLinkServiceClient.createDataLink(customerId, dataLink);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer for which the data link is created.
   * @param dataLink Required. The data link to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateDataLinkResponse createDataLink(String customerId, DataLink dataLink) {
    CreateDataLinkRequest request =
        CreateDataLinkRequest.newBuilder().setCustomerId(customerId).setDataLink(dataLink).build();
    return createDataLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a data link. The requesting Google Ads account name and account ID will be shared with
   * the third party (such as YouTube creators for video links) to whom you are creating the link
   * with. Only customers on the allow-list can create data links.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   CreateDataLinkRequest request =
   *       CreateDataLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setDataLink(DataLink.newBuilder().build())
   *           .build();
   *   CreateDataLinkResponse response = dataLinkServiceClient.createDataLink(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateDataLinkResponse createDataLink(CreateDataLinkRequest request) {
    return createDataLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a data link. The requesting Google Ads account name and account ID will be shared with
   * the third party (such as YouTube creators for video links) to whom you are creating the link
   * with. Only customers on the allow-list can create data links.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   CreateDataLinkRequest request =
   *       CreateDataLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setDataLink(DataLink.newBuilder().build())
   *           .build();
   *   ApiFuture<CreateDataLinkResponse> future =
   *       dataLinkServiceClient.createDataLinkCallable().futureCall(request);
   *   // Do something.
   *   CreateDataLinkResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateDataLinkRequest, CreateDataLinkResponse>
      createDataLinkCallable() {
    return stub.createDataLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove a data link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   DataLinkName resourceName =
   *       DataLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]", "[DATA_LINK_ID]");
   *   RemoveDataLinkResponse response =
   *       dataLinkServiceClient.removeDataLink(customerId, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer for which the data link is updated.
   * @param resourceName Required. The data link is expected to have a valid resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveDataLinkResponse removeDataLink(String customerId, DataLinkName resourceName) {
    RemoveDataLinkRequest request =
        RemoveDataLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return removeDataLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove a data link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   String resourceName =
   *       DataLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]", "[DATA_LINK_ID]").toString();
   *   RemoveDataLinkResponse response =
   *       dataLinkServiceClient.removeDataLink(customerId, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer for which the data link is updated.
   * @param resourceName Required. The data link is expected to have a valid resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveDataLinkResponse removeDataLink(String customerId, String resourceName) {
    RemoveDataLinkRequest request =
        RemoveDataLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setResourceName(resourceName)
            .build();
    return removeDataLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove a data link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   RemoveDataLinkRequest request =
   *       RemoveDataLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(
   *               DataLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]", "[DATA_LINK_ID]")
   *                   .toString())
   *           .build();
   *   RemoveDataLinkResponse response = dataLinkServiceClient.removeDataLink(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveDataLinkResponse removeDataLink(RemoveDataLinkRequest request) {
    return removeDataLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Remove a data link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   RemoveDataLinkRequest request =
   *       RemoveDataLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(
   *               DataLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]", "[DATA_LINK_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<RemoveDataLinkResponse> future =
   *       dataLinkServiceClient.removeDataLinkCallable().futureCall(request);
   *   // Do something.
   *   RemoveDataLinkResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RemoveDataLinkRequest, RemoveDataLinkResponse>
      removeDataLinkCallable() {
    return stub.removeDataLinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a data link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   DataLinkStatusEnum.DataLinkStatus dataLinkStatus =
   *       DataLinkStatusEnum.DataLinkStatus.forNumber(0);
   *   DataLinkName resourceName =
   *       DataLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]", "[DATA_LINK_ID]");
   *   UpdateDataLinkResponse response =
   *       dataLinkServiceClient.updateDataLink(customerId, dataLinkStatus, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer for which the data link is created.
   * @param dataLinkStatus Required. The data link status to be updated to.
   * @param resourceName Required. The data link is expected to have a valid resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UpdateDataLinkResponse updateDataLink(
      String customerId,
      DataLinkStatusEnum.DataLinkStatus dataLinkStatus,
      DataLinkName resourceName) {
    UpdateDataLinkRequest request =
        UpdateDataLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setDataLinkStatus(dataLinkStatus)
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return updateDataLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a data link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   DataLinkStatusEnum.DataLinkStatus dataLinkStatus =
   *       DataLinkStatusEnum.DataLinkStatus.forNumber(0);
   *   String resourceName =
   *       DataLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]", "[DATA_LINK_ID]").toString();
   *   UpdateDataLinkResponse response =
   *       dataLinkServiceClient.updateDataLink(customerId, dataLinkStatus, resourceName);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer for which the data link is created.
   * @param dataLinkStatus Required. The data link status to be updated to.
   * @param resourceName Required. The data link is expected to have a valid resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UpdateDataLinkResponse updateDataLink(
      String customerId, DataLinkStatusEnum.DataLinkStatus dataLinkStatus, String resourceName) {
    UpdateDataLinkRequest request =
        UpdateDataLinkRequest.newBuilder()
            .setCustomerId(customerId)
            .setDataLinkStatus(dataLinkStatus)
            .setResourceName(resourceName)
            .build();
    return updateDataLink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a data link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   UpdateDataLinkRequest request =
   *       UpdateDataLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(
   *               DataLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]", "[DATA_LINK_ID]")
   *                   .toString())
   *           .build();
   *   UpdateDataLinkResponse response = dataLinkServiceClient.updateDataLink(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UpdateDataLinkResponse updateDataLink(UpdateDataLinkRequest request) {
    return updateDataLinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a data link.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [DatabaseError]()
   * [DataLinkError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (DataLinkServiceClient dataLinkServiceClient = DataLinkServiceClient.create()) {
   *   UpdateDataLinkRequest request =
   *       UpdateDataLinkRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setResourceName(
   *               DataLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]", "[DATA_LINK_ID]")
   *                   .toString())
   *           .build();
   *   ApiFuture<UpdateDataLinkResponse> future =
   *       dataLinkServiceClient.updateDataLinkCallable().futureCall(request);
   *   // Do something.
   *   UpdateDataLinkResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateDataLinkRequest, UpdateDataLinkResponse>
      updateDataLinkCallable() {
    return stub.updateDataLinkCallable();
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
