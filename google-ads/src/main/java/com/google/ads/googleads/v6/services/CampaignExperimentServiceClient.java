/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.CampaignExperiment;
import com.google.ads.googleads.v6.resources.CampaignExperimentName;
import com.google.ads.googleads.v6.services.stub.CampaignExperimentServiceStub;
import com.google.ads.googleads.v6.services.stub.CampaignExperimentServiceStubSettings;
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
 * Service Description: CampaignExperimentService manages the life cycle of campaign experiments. It
 * is used to create new experiments from drafts, modify experiment properties, promote changes in
 * an experiment back to its base campaign, graduate experiments into new stand-alone campaigns, and
 * to remove an experiment.
 *
 * <p>An experiment consists of two variants or arms - the base campaign and the experiment
 * campaign, directing a fixed share of traffic to each arm. A campaign experiment is created from a
 * draft of changes to the base campaign and will be a snapshot of changes in the draft at the time
 * of creation.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the CampaignExperimentServiceClient object to clean up
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
 * CampaignExperimentServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CampaignExperimentServiceSettings campaignExperimentServiceSettings =
 *     CampaignExperimentServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignExperimentServiceClient campaignExperimentServiceClient =
 *     CampaignExperimentServiceClient.create(campaignExperimentServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CampaignExperimentServiceSettings campaignExperimentServiceSettings =
 *     CampaignExperimentServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignExperimentServiceClient campaignExperimentServiceClient =
 *     CampaignExperimentServiceClient.create(campaignExperimentServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class CampaignExperimentServiceClient implements BackgroundResource {
  private final CampaignExperimentServiceSettings settings;
  private final CampaignExperimentServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of CampaignExperimentServiceClient with default settings. */
  public static final CampaignExperimentServiceClient create() throws IOException {
    return create(CampaignExperimentServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignExperimentServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CampaignExperimentServiceClient create(
      CampaignExperimentServiceSettings settings) throws IOException {
    return new CampaignExperimentServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignExperimentServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(CampaignExperimentServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CampaignExperimentServiceClient create(CampaignExperimentServiceStub stub) {
    return new CampaignExperimentServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignExperimentServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignExperimentServiceClient(CampaignExperimentServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((CampaignExperimentServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignExperimentServiceClient(CampaignExperimentServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final CampaignExperimentServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignExperimentServiceStub getStub() {
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
   * Returns the requested campaign experiment in full detail.
   *
   * @param resource_name Required. The resource name of the campaign experiment to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignExperiment getCampaignExperiment(CampaignExperimentName resourceName) {
    GetCampaignExperimentRequest request =
        GetCampaignExperimentRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCampaignExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign experiment in full detail.
   *
   * @param resource_name Required. The resource name of the campaign experiment to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignExperiment getCampaignExperiment(String resourceName) {
    GetCampaignExperimentRequest request =
        GetCampaignExperimentRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign experiment in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignExperiment getCampaignExperiment(GetCampaignExperimentRequest request) {
    return getCampaignExperimentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign experiment in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetCampaignExperimentRequest, CampaignExperiment>
      getCampaignExperimentCallable() {
    return stub.getCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a campaign experiment based on a campaign draft. The draft campaign will be forked into
   * a real campaign (called the experiment campaign) that will begin serving ads if successfully
   * created.
   *
   * <p>The campaign experiment is created immediately with status INITIALIZING. This method return
   * a long running operation that tracks the forking of the draft campaign. If the forking fails, a
   * list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method. The
   * operation's metadata will be a StringValue containing the resource name of the created campaign
   * experiment.
   *
   * @param customer_id Required. The ID of the customer whose campaign experiment is being created.
   * @param campaign_experiment Required. The campaign experiment to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentAsync(String customerId, CampaignExperiment campaignExperiment) {
    CreateCampaignExperimentRequest request =
        CreateCampaignExperimentRequest.newBuilder()
            .setCustomerId(customerId)
            .setCampaignExperiment(campaignExperiment)
            .build();
    return createCampaignExperimentAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a campaign experiment based on a campaign draft. The draft campaign will be forked into
   * a real campaign (called the experiment campaign) that will begin serving ads if successfully
   * created.
   *
   * <p>The campaign experiment is created immediately with status INITIALIZING. This method return
   * a long running operation that tracks the forking of the draft campaign. If the forking fails, a
   * list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method. The
   * operation's metadata will be a StringValue containing the resource name of the created campaign
   * experiment.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentAsync(CreateCampaignExperimentRequest request) {
    return createCampaignExperimentOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a campaign experiment based on a campaign draft. The draft campaign will be forked into
   * a real campaign (called the experiment campaign) that will begin serving ads if successfully
   * created.
   *
   * <p>The campaign experiment is created immediately with status INITIALIZING. This method return
   * a long running operation that tracks the forking of the draft campaign. If the forking fails, a
   * list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method. The
   * operation's metadata will be a StringValue containing the resource name of the created campaign
   * experiment.
   *
   * <p>Sample code:
   */
  public final OperationCallable<
          CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentOperationCallable() {
    return stub.createCampaignExperimentOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a campaign experiment based on a campaign draft. The draft campaign will be forked into
   * a real campaign (called the experiment campaign) that will begin serving ads if successfully
   * created.
   *
   * <p>The campaign experiment is created immediately with status INITIALIZING. This method return
   * a long running operation that tracks the forking of the draft campaign. If the forking fails, a
   * list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method. The
   * operation's metadata will be a StringValue containing the resource name of the created campaign
   * experiment.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateCampaignExperimentRequest, Operation>
      createCampaignExperimentCallable() {
    return stub.createCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates campaign experiments. Operation statuses are returned.
   *
   * @param customer_id Required. The ID of the customer whose campaign experiments are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual campaign
   *     experiments.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignExperimentsResponse mutateCampaignExperiments(
      String customerId, List<CampaignExperimentOperation> operations) {
    MutateCampaignExperimentsRequest request =
        MutateCampaignExperimentsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignExperiments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates campaign experiments. Operation statuses are returned.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignExperimentsResponse mutateCampaignExperiments(
      MutateCampaignExperimentsRequest request) {
    return mutateCampaignExperimentsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates campaign experiments. Operation statuses are returned.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
      mutateCampaignExperimentsCallable() {
    return stub.mutateCampaignExperimentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Graduates a campaign experiment to a full campaign. The base and experiment campaigns will
   * start running independently with their own budgets.
   *
   * @param campaign_experiment Required. The resource name of the campaign experiment to graduate.
   * @param campaign_budget Required. Resource name of the budget to attach to the campaign
   *     graduated from the experiment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GraduateCampaignExperimentResponse graduateCampaignExperiment(
      String campaignExperiment, String campaignBudget) {
    GraduateCampaignExperimentRequest request =
        GraduateCampaignExperimentRequest.newBuilder()
            .setCampaignExperiment(campaignExperiment)
            .setCampaignBudget(campaignBudget)
            .build();
    return graduateCampaignExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Graduates a campaign experiment to a full campaign. The base and experiment campaigns will
   * start running independently with their own budgets.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GraduateCampaignExperimentResponse graduateCampaignExperiment(
      GraduateCampaignExperimentRequest request) {
    return graduateCampaignExperimentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Graduates a campaign experiment to a full campaign. The base and experiment campaigns will
   * start running independently with their own budgets.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
      graduateCampaignExperimentCallable() {
    return stub.graduateCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the changes in a experiment campaign back to the base campaign.
   *
   * <p>The campaign experiment is updated immediately with status PROMOTING. This method return a
   * long running operation that tracks the promoting of the experiment campaign. If the promoting
   * fails, a list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method.
   *
   * @param campaign_experiment Required. The resource name of the campaign experiment to promote.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Empty> promoteCampaignExperimentAsync(
      String campaignExperiment) {
    PromoteCampaignExperimentRequest request =
        PromoteCampaignExperimentRequest.newBuilder()
            .setCampaignExperiment(campaignExperiment)
            .build();
    return promoteCampaignExperimentAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the changes in a experiment campaign back to the base campaign.
   *
   * <p>The campaign experiment is updated immediately with status PROMOTING. This method return a
   * long running operation that tracks the promoting of the experiment campaign. If the promoting
   * fails, a list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, Empty> promoteCampaignExperimentAsync(
      PromoteCampaignExperimentRequest request) {
    return promoteCampaignExperimentOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the changes in a experiment campaign back to the base campaign.
   *
   * <p>The campaign experiment is updated immediately with status PROMOTING. This method return a
   * long running operation that tracks the promoting of the experiment campaign. If the promoting
   * fails, a list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method.
   *
   * <p>Sample code:
   */
  public final OperationCallable<PromoteCampaignExperimentRequest, Empty, Empty>
      promoteCampaignExperimentOperationCallable() {
    return stub.promoteCampaignExperimentOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the changes in a experiment campaign back to the base campaign.
   *
   * <p>The campaign experiment is updated immediately with status PROMOTING. This method return a
   * long running operation that tracks the promoting of the experiment campaign. If the promoting
   * fails, a list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<PromoteCampaignExperimentRequest, Operation>
      promoteCampaignExperimentCallable() {
    return stub.promoteCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Immediately ends a campaign experiment, changing the experiment's scheduled end date and
   * without waiting for end of day. End date is updated to be the time of the request.
   *
   * @param campaign_experiment Required. The resource name of the campaign experiment to end.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void endCampaignExperiment(String campaignExperiment) {
    EndCampaignExperimentRequest request =
        EndCampaignExperimentRequest.newBuilder().setCampaignExperiment(campaignExperiment).build();
    endCampaignExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Immediately ends a campaign experiment, changing the experiment's scheduled end date and
   * without waiting for end of day. End date is updated to be the time of the request.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void endCampaignExperiment(EndCampaignExperimentRequest request) {
    endCampaignExperimentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Immediately ends a campaign experiment, changing the experiment's scheduled end date and
   * without waiting for end of day. End date is updated to be the time of the request.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<EndCampaignExperimentRequest, Empty> endCampaignExperimentCallable() {
    return stub.endCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignExperiment create or promote (whichever
   * occurred last). Supports standard list paging.
   *
   * @param resource_name Required. The name of the campaign experiment from which to retrieve the
   *     async errors.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignExperimentAsyncErrorsPagedResponse listCampaignExperimentAsyncErrors(
      CampaignExperimentName resourceName) {
    ListCampaignExperimentAsyncErrorsRequest request =
        ListCampaignExperimentAsyncErrorsRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return listCampaignExperimentAsyncErrors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignExperiment create or promote (whichever
   * occurred last). Supports standard list paging.
   *
   * @param resource_name Required. The name of the campaign experiment from which to retrieve the
   *     async errors.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignExperimentAsyncErrorsPagedResponse listCampaignExperimentAsyncErrors(
      String resourceName) {
    ListCampaignExperimentAsyncErrorsRequest request =
        ListCampaignExperimentAsyncErrorsRequest.newBuilder().setResourceName(resourceName).build();
    return listCampaignExperimentAsyncErrors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignExperiment create or promote (whichever
   * occurred last). Supports standard list paging.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignExperimentAsyncErrorsPagedResponse listCampaignExperimentAsyncErrors(
      ListCampaignExperimentAsyncErrorsRequest request) {
    return listCampaignExperimentAsyncErrorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignExperiment create or promote (whichever
   * occurred last). Supports standard list paging.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsPagedResponse>
      listCampaignExperimentAsyncErrorsPagedCallable() {
    return stub.listCampaignExperimentAsyncErrorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during CampaignExperiment create or promote (whichever
   * occurred last). Supports standard list paging.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse>
      listCampaignExperimentAsyncErrorsCallable() {
    return stub.listCampaignExperimentAsyncErrorsCallable();
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

  public static class ListCampaignExperimentAsyncErrorsPagedResponse
      extends AbstractPagedListResponse<
          ListCampaignExperimentAsyncErrorsRequest,
          ListCampaignExperimentAsyncErrorsResponse,
          Status,
          ListCampaignExperimentAsyncErrorsPage,
          ListCampaignExperimentAsyncErrorsFixedSizeCollection> {

    public static ApiFuture<ListCampaignExperimentAsyncErrorsPagedResponse> createAsync(
        PageContext<
                ListCampaignExperimentAsyncErrorsRequest,
                ListCampaignExperimentAsyncErrorsResponse,
                Status>
            context,
        ApiFuture<ListCampaignExperimentAsyncErrorsResponse> futureResponse) {
      ApiFuture<ListCampaignExperimentAsyncErrorsPage> futurePage =
          ListCampaignExperimentAsyncErrorsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<
              ListCampaignExperimentAsyncErrorsPage,
              ListCampaignExperimentAsyncErrorsPagedResponse>() {
            @Override
            public ListCampaignExperimentAsyncErrorsPagedResponse apply(
                ListCampaignExperimentAsyncErrorsPage input) {
              return new ListCampaignExperimentAsyncErrorsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListCampaignExperimentAsyncErrorsPagedResponse(
        ListCampaignExperimentAsyncErrorsPage page) {
      super(page, ListCampaignExperimentAsyncErrorsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListCampaignExperimentAsyncErrorsPage
      extends AbstractPage<
          ListCampaignExperimentAsyncErrorsRequest,
          ListCampaignExperimentAsyncErrorsResponse,
          Status,
          ListCampaignExperimentAsyncErrorsPage> {

    private ListCampaignExperimentAsyncErrorsPage(
        PageContext<
                ListCampaignExperimentAsyncErrorsRequest,
                ListCampaignExperimentAsyncErrorsResponse,
                Status>
            context,
        ListCampaignExperimentAsyncErrorsResponse response) {
      super(context, response);
    }

    private static ListCampaignExperimentAsyncErrorsPage createEmptyPage() {
      return new ListCampaignExperimentAsyncErrorsPage(null, null);
    }

    @Override
    protected ListCampaignExperimentAsyncErrorsPage createPage(
        PageContext<
                ListCampaignExperimentAsyncErrorsRequest,
                ListCampaignExperimentAsyncErrorsResponse,
                Status>
            context,
        ListCampaignExperimentAsyncErrorsResponse response) {
      return new ListCampaignExperimentAsyncErrorsPage(context, response);
    }

    @Override
    public ApiFuture<ListCampaignExperimentAsyncErrorsPage> createPageAsync(
        PageContext<
                ListCampaignExperimentAsyncErrorsRequest,
                ListCampaignExperimentAsyncErrorsResponse,
                Status>
            context,
        ApiFuture<ListCampaignExperimentAsyncErrorsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListCampaignExperimentAsyncErrorsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListCampaignExperimentAsyncErrorsRequest,
          ListCampaignExperimentAsyncErrorsResponse,
          Status,
          ListCampaignExperimentAsyncErrorsPage,
          ListCampaignExperimentAsyncErrorsFixedSizeCollection> {

    private ListCampaignExperimentAsyncErrorsFixedSizeCollection(
        List<ListCampaignExperimentAsyncErrorsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListCampaignExperimentAsyncErrorsFixedSizeCollection createEmptyCollection() {
      return new ListCampaignExperimentAsyncErrorsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListCampaignExperimentAsyncErrorsFixedSizeCollection createCollection(
        List<ListCampaignExperimentAsyncErrorsPage> pages, int collectionSize) {
      return new ListCampaignExperimentAsyncErrorsFixedSizeCollection(pages, collectionSize);
    }
  }
}
