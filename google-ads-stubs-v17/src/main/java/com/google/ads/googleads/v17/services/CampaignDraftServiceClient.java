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

import com.google.ads.googleads.v17.resources.CampaignDraftName;
import com.google.ads.googleads.v17.services.stub.CampaignDraftServiceStub;
import com.google.ads.googleads.v17.services.stub.CampaignDraftServiceStubSettings;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.rpc.Status;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage campaign drafts.
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
 * try (CampaignDraftServiceClient campaignDraftServiceClient =
 *     CampaignDraftServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignDraftOperation> operations = new ArrayList<>();
 *   MutateCampaignDraftsResponse response =
 *       campaignDraftServiceClient.mutateCampaignDrafts(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CampaignDraftServiceClient object to clean up
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
 *      <td><p> MutateCampaignDrafts</td>
 *      <td><p> Creates, updates, or removes campaign drafts. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CampaignDraftError]()   [DatabaseError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateCampaignDrafts(MutateCampaignDraftsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateCampaignDrafts(String customerId, List&lt;CampaignDraftOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateCampaignDraftsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> PromoteCampaignDraft</td>
 *      <td><p> Promotes the changes in a draft back to the base campaign.
 * <p>  This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in the response. See the status in the Campaign Draft resource to determine if the promotion was successful. If the LRO failed, use [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v17.services.CampaignDraftService.ListCampaignDraftAsyncErrors] to view the list of error reasons.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CampaignDraftError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> promoteCampaignDraftAsync(PromoteCampaignDraftRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> promoteCampaignDraftAsync(CampaignDraftName campaignDraft)
 *           <li><p> promoteCampaignDraftAsync(String campaignDraft)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> promoteCampaignDraftOperationCallable()
 *           <li><p> promoteCampaignDraftCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListCampaignDraftAsyncErrors</td>
 *      <td><p> Returns all errors that occurred during CampaignDraft promote. Throws an error if called before campaign draft is promoted. Supports standard list paging.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listCampaignDraftAsyncErrors(ListCampaignDraftAsyncErrorsRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> listCampaignDraftAsyncErrors(CampaignDraftName resourceName)
 *           <li><p> listCampaignDraftAsyncErrors(String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listCampaignDraftAsyncErrorsPagedCallable()
 *           <li><p> listCampaignDraftAsyncErrorsCallable()
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
 * <p>This class can be customized by passing in a custom instance of CampaignDraftServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CampaignDraftServiceSettings campaignDraftServiceSettings =
 *     CampaignDraftServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignDraftServiceClient campaignDraftServiceClient =
 *     CampaignDraftServiceClient.create(campaignDraftServiceSettings);
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
 * CampaignDraftServiceSettings campaignDraftServiceSettings =
 *     CampaignDraftServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignDraftServiceClient campaignDraftServiceClient =
 *     CampaignDraftServiceClient.create(campaignDraftServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CampaignDraftServiceClient implements BackgroundResource {
  private final CampaignDraftServiceSettings settings;
  private final CampaignDraftServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of CampaignDraftServiceClient with default settings. */
  public static final CampaignDraftServiceClient create() throws IOException {
    return create(CampaignDraftServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignDraftServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CampaignDraftServiceClient create(CampaignDraftServiceSettings settings)
      throws IOException {
    return new CampaignDraftServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignDraftServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(CampaignDraftServiceSettings).
   */
  public static final CampaignDraftServiceClient create(CampaignDraftServiceStub stub) {
    return new CampaignDraftServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignDraftServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignDraftServiceClient(CampaignDraftServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CampaignDraftServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  protected CampaignDraftServiceClient(CampaignDraftServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final CampaignDraftServiceSettings getSettings() {
    return settings;
  }

  public CampaignDraftServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign drafts. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CampaignDraftError]()
   * [DatabaseError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CampaignDraftOperation> operations = new ArrayList<>();
   *   MutateCampaignDraftsResponse response =
   *       campaignDraftServiceClient.mutateCampaignDrafts(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose campaign drafts are being modified.
   * @param operations Required. The list of operations to perform on individual campaign drafts.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignDraftsResponse mutateCampaignDrafts(
      String customerId, List<CampaignDraftOperation> operations) {
    MutateCampaignDraftsRequest request =
        MutateCampaignDraftsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignDrafts(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign drafts. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CampaignDraftError]()
   * [DatabaseError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   MutateCampaignDraftsRequest request =
   *       MutateCampaignDraftsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignDraftOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCampaignDraftsResponse response =
   *       campaignDraftServiceClient.mutateCampaignDrafts(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignDraftsResponse mutateCampaignDrafts(
      MutateCampaignDraftsRequest request) {
    return mutateCampaignDraftsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes campaign drafts. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CampaignDraftError]()
   * [DatabaseError]() [FieldError]() [HeaderError]() [InternalError]() [MutateError]()
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   MutateCampaignDraftsRequest request =
   *       MutateCampaignDraftsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignDraftOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCampaignDraftsResponse> future =
   *       campaignDraftServiceClient.mutateCampaignDraftsCallable().futureCall(request);
   *   // Do something.
   *   MutateCampaignDraftsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
      mutateCampaignDraftsCallable() {
    return stub.mutateCampaignDraftsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the changes in a draft back to the base campaign.
   *
   * <p>This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use
   * [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in
   * the response. See the status in the Campaign Draft resource to determine if the promotion was
   * successful. If the LRO failed, use
   * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v17.services.CampaignDraftService.ListCampaignDraftAsyncErrors]
   * to view the list of error reasons.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CampaignDraftError]()
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   CampaignDraftName campaignDraft =
   *       CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]");
   *   campaignDraftServiceClient.promoteCampaignDraftAsync(campaignDraft).get();
   * }
   * }</pre>
   *
   * @param campaignDraft Required. The resource name of the campaign draft to promote.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Empty> promoteCampaignDraftAsync(
      CampaignDraftName campaignDraft) {
    PromoteCampaignDraftRequest request =
        PromoteCampaignDraftRequest.newBuilder()
            .setCampaignDraft(campaignDraft == null ? null : campaignDraft.toString())
            .build();
    return promoteCampaignDraftAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the changes in a draft back to the base campaign.
   *
   * <p>This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use
   * [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in
   * the response. See the status in the Campaign Draft resource to determine if the promotion was
   * successful. If the LRO failed, use
   * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v17.services.CampaignDraftService.ListCampaignDraftAsyncErrors]
   * to view the list of error reasons.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CampaignDraftError]()
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   String campaignDraft =
   *       CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]").toString();
   *   campaignDraftServiceClient.promoteCampaignDraftAsync(campaignDraft).get();
   * }
   * }</pre>
   *
   * @param campaignDraft Required. The resource name of the campaign draft to promote.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Empty> promoteCampaignDraftAsync(String campaignDraft) {
    PromoteCampaignDraftRequest request =
        PromoteCampaignDraftRequest.newBuilder().setCampaignDraft(campaignDraft).build();
    return promoteCampaignDraftAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the changes in a draft back to the base campaign.
   *
   * <p>This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use
   * [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in
   * the response. See the status in the Campaign Draft resource to determine if the promotion was
   * successful. If the LRO failed, use
   * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v17.services.CampaignDraftService.ListCampaignDraftAsyncErrors]
   * to view the list of error reasons.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CampaignDraftError]()
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   PromoteCampaignDraftRequest request =
   *       PromoteCampaignDraftRequest.newBuilder()
   *           .setCampaignDraft(
   *               CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]")
   *                   .toString())
   *           .setValidateOnly(true)
   *           .build();
   *   campaignDraftServiceClient.promoteCampaignDraftAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Empty> promoteCampaignDraftAsync(
      PromoteCampaignDraftRequest request) {
    return promoteCampaignDraftOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the changes in a draft back to the base campaign.
   *
   * <p>This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use
   * [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in
   * the response. See the status in the Campaign Draft resource to determine if the promotion was
   * successful. If the LRO failed, use
   * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v17.services.CampaignDraftService.ListCampaignDraftAsyncErrors]
   * to view the list of error reasons.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CampaignDraftError]()
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   PromoteCampaignDraftRequest request =
   *       PromoteCampaignDraftRequest.newBuilder()
   *           .setCampaignDraft(
   *               CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]")
   *                   .toString())
   *           .setValidateOnly(true)
   *           .build();
   *   OperationFuture<Empty, Empty> future =
   *       campaignDraftServiceClient.promoteCampaignDraftOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<PromoteCampaignDraftRequest, Empty, Empty>
      promoteCampaignDraftOperationCallable() {
    return stub.promoteCampaignDraftOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the changes in a draft back to the base campaign.
   *
   * <p>This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use
   * [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in
   * the response. See the status in the Campaign Draft resource to determine if the promotion was
   * successful. If the LRO failed, use
   * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v17.services.CampaignDraftService.ListCampaignDraftAsyncErrors]
   * to view the list of error reasons.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [CampaignDraftError]()
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   PromoteCampaignDraftRequest request =
   *       PromoteCampaignDraftRequest.newBuilder()
   *           .setCampaignDraft(
   *               CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]")
   *                   .toString())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       campaignDraftServiceClient.promoteCampaignDraftCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PromoteCampaignDraftRequest, Operation>
      promoteCampaignDraftCallable() {
    return stub.promoteCampaignDraftCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignDraft promote. Throws an error if called before
   * campaign draft is promoted. Supports standard list paging.
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   CampaignDraftName resourceName =
   *       CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]");
   *   for (Status element :
   *       campaignDraftServiceClient.listCampaignDraftAsyncErrors(resourceName).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param resourceName Required. The name of the campaign draft from which to retrieve the async
   *     errors.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignDraftAsyncErrorsPagedResponse listCampaignDraftAsyncErrors(
      CampaignDraftName resourceName) {
    ListCampaignDraftAsyncErrorsRequest request =
        ListCampaignDraftAsyncErrorsRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return listCampaignDraftAsyncErrors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignDraft promote. Throws an error if called before
   * campaign draft is promoted. Supports standard list paging.
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   String resourceName =
   *       CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]").toString();
   *   for (Status element :
   *       campaignDraftServiceClient.listCampaignDraftAsyncErrors(resourceName).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param resourceName Required. The name of the campaign draft from which to retrieve the async
   *     errors.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignDraftAsyncErrorsPagedResponse listCampaignDraftAsyncErrors(
      String resourceName) {
    ListCampaignDraftAsyncErrorsRequest request =
        ListCampaignDraftAsyncErrorsRequest.newBuilder().setResourceName(resourceName).build();
    return listCampaignDraftAsyncErrors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignDraft promote. Throws an error if called before
   * campaign draft is promoted. Supports standard list paging.
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   ListCampaignDraftAsyncErrorsRequest request =
   *       ListCampaignDraftAsyncErrorsRequest.newBuilder()
   *           .setResourceName(
   *               CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]")
   *                   .toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (Status element :
   *       campaignDraftServiceClient.listCampaignDraftAsyncErrors(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignDraftAsyncErrorsPagedResponse listCampaignDraftAsyncErrors(
      ListCampaignDraftAsyncErrorsRequest request) {
    return listCampaignDraftAsyncErrorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignDraft promote. Throws an error if called before
   * campaign draft is promoted. Supports standard list paging.
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   ListCampaignDraftAsyncErrorsRequest request =
   *       ListCampaignDraftAsyncErrorsRequest.newBuilder()
   *           .setResourceName(
   *               CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]")
   *                   .toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<Status> future =
   *       campaignDraftServiceClient
   *           .listCampaignDraftAsyncErrorsPagedCallable()
   *           .futureCall(request);
   *   // Do something.
   *   for (Status element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsPagedResponse>
      listCampaignDraftAsyncErrorsPagedCallable() {
    return stub.listCampaignDraftAsyncErrorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignDraft promote. Throws an error if called before
   * campaign draft is promoted. Supports standard list paging.
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
   * try (CampaignDraftServiceClient campaignDraftServiceClient =
   *     CampaignDraftServiceClient.create()) {
   *   ListCampaignDraftAsyncErrorsRequest request =
   *       ListCampaignDraftAsyncErrorsRequest.newBuilder()
   *           .setResourceName(
   *               CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]")
   *                   .toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListCampaignDraftAsyncErrorsResponse response =
   *         campaignDraftServiceClient.listCampaignDraftAsyncErrorsCallable().call(request);
   *     for (Status element : response.getErrorsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse>
      listCampaignDraftAsyncErrorsCallable() {
    return stub.listCampaignDraftAsyncErrorsCallable();
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

  public static class ListCampaignDraftAsyncErrorsPagedResponse
      extends AbstractPagedListResponse<
          ListCampaignDraftAsyncErrorsRequest,
          ListCampaignDraftAsyncErrorsResponse,
          Status,
          ListCampaignDraftAsyncErrorsPage,
          ListCampaignDraftAsyncErrorsFixedSizeCollection> {

    public static ApiFuture<ListCampaignDraftAsyncErrorsPagedResponse> createAsync(
        PageContext<
                ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse, Status>
            context,
        ApiFuture<ListCampaignDraftAsyncErrorsResponse> futureResponse) {
      ApiFuture<ListCampaignDraftAsyncErrorsPage> futurePage =
          ListCampaignDraftAsyncErrorsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListCampaignDraftAsyncErrorsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListCampaignDraftAsyncErrorsPagedResponse(ListCampaignDraftAsyncErrorsPage page) {
      super(page, ListCampaignDraftAsyncErrorsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListCampaignDraftAsyncErrorsPage
      extends AbstractPage<
          ListCampaignDraftAsyncErrorsRequest,
          ListCampaignDraftAsyncErrorsResponse,
          Status,
          ListCampaignDraftAsyncErrorsPage> {

    private ListCampaignDraftAsyncErrorsPage(
        PageContext<
                ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse, Status>
            context,
        ListCampaignDraftAsyncErrorsResponse response) {
      super(context, response);
    }

    private static ListCampaignDraftAsyncErrorsPage createEmptyPage() {
      return new ListCampaignDraftAsyncErrorsPage(null, null);
    }

    @Override
    protected ListCampaignDraftAsyncErrorsPage createPage(
        PageContext<
                ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse, Status>
            context,
        ListCampaignDraftAsyncErrorsResponse response) {
      return new ListCampaignDraftAsyncErrorsPage(context, response);
    }

    @Override
    public ApiFuture<ListCampaignDraftAsyncErrorsPage> createPageAsync(
        PageContext<
                ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse, Status>
            context,
        ApiFuture<ListCampaignDraftAsyncErrorsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListCampaignDraftAsyncErrorsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListCampaignDraftAsyncErrorsRequest,
          ListCampaignDraftAsyncErrorsResponse,
          Status,
          ListCampaignDraftAsyncErrorsPage,
          ListCampaignDraftAsyncErrorsFixedSizeCollection> {

    private ListCampaignDraftAsyncErrorsFixedSizeCollection(
        List<ListCampaignDraftAsyncErrorsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListCampaignDraftAsyncErrorsFixedSizeCollection createEmptyCollection() {
      return new ListCampaignDraftAsyncErrorsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListCampaignDraftAsyncErrorsFixedSizeCollection createCollection(
        List<ListCampaignDraftAsyncErrorsPage> pages, int collectionSize) {
      return new ListCampaignDraftAsyncErrorsFixedSizeCollection(pages, collectionSize);
    }
  }
}
