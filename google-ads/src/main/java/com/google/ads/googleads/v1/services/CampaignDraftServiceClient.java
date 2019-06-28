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
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.CampaignDraft;
import com.google.ads.googleads.v1.services.stub.CampaignDraftServiceStub;
import com.google.ads.googleads.v1.services.stub.CampaignDraftServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.rpc.Status;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage campaign drafts.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
 *   String formattedResourceName = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
 *   CampaignDraft response = campaignDraftServiceClient.getCampaignDraft(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the campaignDraftServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
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
 * <p>This class can be customized by passing in a custom instance of CampaignDraftServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CampaignDraftServiceSettings campaignDraftServiceSettings =
 *     CampaignDraftServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignDraftServiceClient campaignDraftServiceClient =
 *     CampaignDraftServiceClient.create(campaignDraftServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CampaignDraftServiceSettings campaignDraftServiceSettings =
 *     CampaignDraftServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignDraftServiceClient campaignDraftServiceClient =
 *     CampaignDraftServiceClient.create(campaignDraftServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignDraftServiceClient implements BackgroundResource {
  private final CampaignDraftServiceSettings settings;
  private final CampaignDraftServiceStub stub;
  private final OperationsClient operationsClient;

  private static final PathTemplate CAMPAIGN_DRAFT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaignDrafts/{campaign_draft}");

  /**
   * Formats a string containing the fully-qualified path to represent a campaign_draft resource.
   *
   * @deprecated Use the {@link CampaignDraftName} class instead.
   */
  @Deprecated
  public static final String formatCampaignDraftName(String customer, String campaignDraft) {
    return CAMPAIGN_DRAFT_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "campaign_draft", campaignDraft);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a campaign_draft
   * resource.
   *
   * @deprecated Use the {@link CampaignDraftName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromCampaignDraftName(String campaignDraftName) {
    return CAMPAIGN_DRAFT_PATH_TEMPLATE.parse(campaignDraftName).get("customer");
  }

  /**
   * Parses the campaign_draft from the given fully-qualified path which represents a campaign_draft
   * resource.
   *
   * @deprecated Use the {@link CampaignDraftName} class instead.
   */
  @Deprecated
  public static final String parseCampaignDraftFromCampaignDraftName(String campaignDraftName) {
    return CAMPAIGN_DRAFT_PATH_TEMPLATE.parse(campaignDraftName).get("campaign_draft");
  }

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
   * This is for advanced usage - prefer to use CampaignDraftServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignDraftServiceClient(CampaignDraftServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final CampaignDraftServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignDraftServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign draft in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedResourceName = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   CampaignDraft response = campaignDraftServiceClient.getCampaignDraft(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the campaign draft to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignDraft getCampaignDraft(String resourceName) {
    CAMPAIGN_DRAFT_PATH_TEMPLATE.validate(resourceName, "getCampaignDraft");
    GetCampaignDraftRequest request =
        GetCampaignDraftRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignDraft(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign draft in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedResourceName = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   GetCampaignDraftRequest request = GetCampaignDraftRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CampaignDraft response = campaignDraftServiceClient.getCampaignDraft(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignDraft getCampaignDraft(GetCampaignDraftRequest request) {
    return getCampaignDraftCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign draft in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedResourceName = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   GetCampaignDraftRequest request = GetCampaignDraftRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CampaignDraft&gt; future = campaignDraftServiceClient.getCampaignDraftCallable().futureCall(request);
   *   // Do something
   *   CampaignDraft response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCampaignDraftRequest, CampaignDraft> getCampaignDraftCallable() {
    return stub.getCampaignDraftCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign drafts. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignDraftOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateCampaignDraftsResponse response = campaignDraftServiceClient.mutateCampaignDrafts(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign drafts are being modified.
   * @param operations The list of operations to perform on individual campaign drafts.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignDraftsResponse mutateCampaignDrafts(
      String customerId,
      List<CampaignDraftOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateCampaignDraftsRequest request =
        MutateCampaignDraftsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateCampaignDrafts(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign drafts. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignDraftOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignDraftsResponse response = campaignDraftServiceClient.mutateCampaignDrafts(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign drafts are being modified.
   * @param operations The list of operations to perform on individual campaign drafts.
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign drafts. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignDraftOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignDraftsRequest request = MutateCampaignDraftsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCampaignDraftsResponse response = campaignDraftServiceClient.mutateCampaignDrafts(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignDraftsResponse mutateCampaignDrafts(
      MutateCampaignDraftsRequest request) {
    return mutateCampaignDraftsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign drafts. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignDraftOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignDraftsRequest request = MutateCampaignDraftsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCampaignDraftsResponse&gt; future = campaignDraftServiceClient.mutateCampaignDraftsCallable().futureCall(request);
   *   // Do something
   *   MutateCampaignDraftsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
      mutateCampaignDraftsCallable() {
    return stub.mutateCampaignDraftsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Promotes the changes in a draft back to the base campaign.
   *
   * <p>This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use
   * [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in
   * the response. See the status in the Campaign Draft resource to determine if the promotion was
   * successful. If the LRO failed, use
   * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v1.services.CampaignDraftService.ListCampaignDraftAsyncErrors]
   * to view the list of error reasons.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedCampaignDraft = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   campaignDraftServiceClient.promoteCampaignDraftAsync(formattedCampaignDraft).get();
   * }
   * </code></pre>
   *
   * @param campaignDraft The resource name of the campaign draft to promote.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, Empty> promoteCampaignDraftAsync(String campaignDraft) {
    CAMPAIGN_DRAFT_PATH_TEMPLATE.validate(campaignDraft, "promoteCampaignDraft");
    PromoteCampaignDraftRequest request =
        PromoteCampaignDraftRequest.newBuilder().setCampaignDraft(campaignDraft).build();
    return promoteCampaignDraftAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Promotes the changes in a draft back to the base campaign.
   *
   * <p>This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use
   * [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in
   * the response. See the status in the Campaign Draft resource to determine if the promotion was
   * successful. If the LRO failed, use
   * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v1.services.CampaignDraftService.ListCampaignDraftAsyncErrors]
   * to view the list of error reasons.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedCampaignDraft = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   PromoteCampaignDraftRequest request = PromoteCampaignDraftRequest.newBuilder()
   *     .setCampaignDraft(formattedCampaignDraft)
   *     .build();
   *   campaignDraftServiceClient.promoteCampaignDraftAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, Empty> promoteCampaignDraftAsync(
      PromoteCampaignDraftRequest request) {
    return promoteCampaignDraftOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Promotes the changes in a draft back to the base campaign.
   *
   * <p>This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use
   * [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in
   * the response. See the status in the Campaign Draft resource to determine if the promotion was
   * successful. If the LRO failed, use
   * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v1.services.CampaignDraftService.ListCampaignDraftAsyncErrors]
   * to view the list of error reasons.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedCampaignDraft = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   PromoteCampaignDraftRequest request = PromoteCampaignDraftRequest.newBuilder()
   *     .setCampaignDraft(formattedCampaignDraft)
   *     .build();
   *   OperationFuture&lt;Empty, Empty&gt; future = campaignDraftServiceClient.promoteCampaignDraftOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<PromoteCampaignDraftRequest, Empty, Empty>
      promoteCampaignDraftOperationCallable() {
    return stub.promoteCampaignDraftOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Promotes the changes in a draft back to the base campaign.
   *
   * <p>This method returns a Long Running Operation (LRO) indicating if the Promote is done. Use
   * [Operations.GetOperation] to poll the LRO until it is done. Only a done status is returned in
   * the response. See the status in the Campaign Draft resource to determine if the promotion was
   * successful. If the LRO failed, use
   * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v1.services.CampaignDraftService.ListCampaignDraftAsyncErrors]
   * to view the list of error reasons.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedCampaignDraft = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   PromoteCampaignDraftRequest request = PromoteCampaignDraftRequest.newBuilder()
   *     .setCampaignDraft(formattedCampaignDraft)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = campaignDraftServiceClient.promoteCampaignDraftCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<PromoteCampaignDraftRequest, Operation>
      promoteCampaignDraftCallable() {
    return stub.promoteCampaignDraftCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all errors that occurred during CampaignDraft promote. Throws an error if called before
   * campaign draft is promoted. Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedResourceName = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   for (Status element : campaignDraftServiceClient.listCampaignDraftAsyncErrors(formattedResourceName).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param resourceName The name of the campaign draft from which to retrieve the async errors.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignDraftAsyncErrorsPagedResponse listCampaignDraftAsyncErrors(
      String resourceName) {
    CAMPAIGN_DRAFT_PATH_TEMPLATE.validate(resourceName, "listCampaignDraftAsyncErrors");
    ListCampaignDraftAsyncErrorsRequest request =
        ListCampaignDraftAsyncErrorsRequest.newBuilder().setResourceName(resourceName).build();
    return listCampaignDraftAsyncErrors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all errors that occurred during CampaignDraft promote. Throws an error if called before
   * campaign draft is promoted. Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedResourceName = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   ListCampaignDraftAsyncErrorsRequest request = ListCampaignDraftAsyncErrorsRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   for (Status element : campaignDraftServiceClient.listCampaignDraftAsyncErrors(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignDraftAsyncErrorsPagedResponse listCampaignDraftAsyncErrors(
      ListCampaignDraftAsyncErrorsRequest request) {
    return listCampaignDraftAsyncErrorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all errors that occurred during CampaignDraft promote. Throws an error if called before
   * campaign draft is promoted. Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedResourceName = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   ListCampaignDraftAsyncErrorsRequest request = ListCampaignDraftAsyncErrorsRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;ListCampaignDraftAsyncErrorsPagedResponse&gt; future = campaignDraftServiceClient.listCampaignDraftAsyncErrorsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Status element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsPagedResponse>
      listCampaignDraftAsyncErrorsPagedCallable() {
    return stub.listCampaignDraftAsyncErrorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all errors that occurred during CampaignDraft promote. Throws an error if called before
   * campaign draft is promoted. Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
   *   String formattedResourceName = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
   *   ListCampaignDraftAsyncErrorsRequest request = ListCampaignDraftAsyncErrorsRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   while (true) {
   *     ListCampaignDraftAsyncErrorsResponse response = campaignDraftServiceClient.listCampaignDraftAsyncErrorsCallable().call(request);
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
   * </code></pre>
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
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse, Status,
          ListCampaignDraftAsyncErrorsPage, ListCampaignDraftAsyncErrorsFixedSizeCollection> {

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
          new ApiFunction<
              ListCampaignDraftAsyncErrorsPage, ListCampaignDraftAsyncErrorsPagedResponse>() {
            @Override
            public ListCampaignDraftAsyncErrorsPagedResponse apply(
                ListCampaignDraftAsyncErrorsPage input) {
              return new ListCampaignDraftAsyncErrorsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListCampaignDraftAsyncErrorsPagedResponse(ListCampaignDraftAsyncErrorsPage page) {
      super(page, ListCampaignDraftAsyncErrorsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListCampaignDraftAsyncErrorsPage
      extends AbstractPage<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse, Status,
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
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse, Status,
          ListCampaignDraftAsyncErrorsPage, ListCampaignDraftAsyncErrorsFixedSizeCollection> {

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
