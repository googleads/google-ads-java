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

import com.google.ads.googleads.v1.resources.CampaignExperiment;
import com.google.ads.googleads.v1.services.stub.CampaignExperimentServiceStub;
import com.google.ads.googleads.v1.services.stub.CampaignExperimentServiceStubSettings;
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
 * <pre>
 * <code>
 * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
 *   String formattedResourceName = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
 *   CampaignExperiment response = campaignExperimentServiceClient.getCampaignExperiment(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the campaignExperimentServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of
 * CampaignExperimentServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CampaignExperimentServiceSettings campaignExperimentServiceSettings =
 *     CampaignExperimentServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignExperimentServiceClient campaignExperimentServiceClient =
 *     CampaignExperimentServiceClient.create(campaignExperimentServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CampaignExperimentServiceSettings campaignExperimentServiceSettings =
 *     CampaignExperimentServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignExperimentServiceClient campaignExperimentServiceClient =
 *     CampaignExperimentServiceClient.create(campaignExperimentServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignExperimentServiceClient implements BackgroundResource {
  private final CampaignExperimentServiceSettings settings;
  private final CampaignExperimentServiceStub stub;
  private final OperationsClient operationsClient;

  private static final PathTemplate CAMPAIGN_EXPERIMENT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/campaignExperiments/{campaign_experiment}");

  /**
   * Formats a string containing the fully-qualified path to represent a campaign_experiment
   * resource.
   *
   * @deprecated Use the {@link CampaignExperimentName} class instead.
   */
  @Deprecated
  public static final String formatCampaignExperimentName(
      String customer, String campaignExperiment) {
    return CAMPAIGN_EXPERIMENT_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "campaign_experiment", campaignExperiment);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a campaign_experiment
   * resource.
   *
   * @deprecated Use the {@link CampaignExperimentName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromCampaignExperimentName(
      String campaignExperimentName) {
    return CAMPAIGN_EXPERIMENT_PATH_TEMPLATE.parse(campaignExperimentName).get("customer");
  }

  /**
   * Parses the campaign_experiment from the given fully-qualified path which represents a
   * campaign_experiment resource.
   *
   * @deprecated Use the {@link CampaignExperimentName} class instead.
   */
  @Deprecated
  public static final String parseCampaignExperimentFromCampaignExperimentName(
      String campaignExperimentName) {
    return CAMPAIGN_EXPERIMENT_PATH_TEMPLATE
        .parse(campaignExperimentName)
        .get("campaign_experiment");
  }

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
   * calls. This is for advanced usage - prefer to use CampaignExperimentServiceSettings}.
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
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign experiment in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedResourceName = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   CampaignExperiment response = campaignExperimentServiceClient.getCampaignExperiment(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the campaign experiment to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignExperiment getCampaignExperiment(String resourceName) {
    CAMPAIGN_EXPERIMENT_PATH_TEMPLATE.validate(resourceName, "getCampaignExperiment");
    GetCampaignExperimentRequest request =
        GetCampaignExperimentRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign experiment in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedResourceName = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   GetCampaignExperimentRequest request = GetCampaignExperimentRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CampaignExperiment response = campaignExperimentServiceClient.getCampaignExperiment(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignExperiment getCampaignExperiment(GetCampaignExperimentRequest request) {
    return getCampaignExperimentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign experiment in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedResourceName = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   GetCampaignExperimentRequest request = GetCampaignExperimentRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CampaignExperiment&gt; future = campaignExperimentServiceClient.getCampaignExperimentCallable().futureCall(request);
   *   // Do something
   *   CampaignExperiment response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCampaignExperimentRequest, CampaignExperiment>
      getCampaignExperimentCallable() {
    return stub.getCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
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
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String customerId = "";
   *   CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();
   *   boolean validateOnly = false;
   *   campaignExperimentServiceClient.createCampaignExperimentAsync(customerId, campaignExperiment, validateOnly).get();
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign experiment is being created.
   * @param campaignExperiment The campaign experiment to be created.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentAsync(
          String customerId, CampaignExperiment campaignExperiment, boolean validateOnly) {

    CreateCampaignExperimentRequest request =
        CreateCampaignExperimentRequest.newBuilder()
            .setCustomerId(customerId)
            .setCampaignExperiment(campaignExperiment)
            .setValidateOnly(validateOnly)
            .build();
    return createCampaignExperimentAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
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
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String customerId = "";
   *   CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();
   *   campaignExperimentServiceClient.createCampaignExperimentAsync(customerId, campaignExperiment).get();
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign experiment is being created.
   * @param campaignExperiment The campaign experiment to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentAsync(String customerId, CampaignExperiment campaignExperiment) {

    CreateCampaignExperimentRequest request =
        CreateCampaignExperimentRequest.newBuilder()
            .setCustomerId(customerId)
            .setCampaignExperiment(campaignExperiment)
            .build();
    return createCampaignExperimentAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
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
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String customerId = "";
   *   CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();
   *   CreateCampaignExperimentRequest request = CreateCampaignExperimentRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setCampaignExperiment(campaignExperiment)
   *     .build();
   *   campaignExperimentServiceClient.createCampaignExperimentAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentAsync(CreateCampaignExperimentRequest request) {
    return createCampaignExperimentOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
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
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String customerId = "";
   *   CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();
   *   CreateCampaignExperimentRequest request = CreateCampaignExperimentRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setCampaignExperiment(campaignExperiment)
   *     .build();
   *   OperationFuture&lt;Empty, CreateCampaignExperimentMetadata&gt; future = campaignExperimentServiceClient.createCampaignExperimentOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<
          CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentOperationCallable() {
    return stub.createCampaignExperimentOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
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
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String customerId = "";
   *   CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();
   *   CreateCampaignExperimentRequest request = CreateCampaignExperimentRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setCampaignExperiment(campaignExperiment)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = campaignExperimentServiceClient.createCampaignExperimentCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateCampaignExperimentRequest, Operation>
      createCampaignExperimentCallable() {
    return stub.createCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates campaign experiments. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignExperimentOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateCampaignExperimentsResponse response = campaignExperimentServiceClient.mutateCampaignExperiments(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign experiments are being modified.
   * @param operations The list of operations to perform on individual campaign experiments.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignExperimentsResponse mutateCampaignExperiments(
      String customerId,
      List<CampaignExperimentOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateCampaignExperimentsRequest request =
        MutateCampaignExperimentsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateCampaignExperiments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates campaign experiments. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignExperimentOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignExperimentsResponse response = campaignExperimentServiceClient.mutateCampaignExperiments(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose campaign experiments are being modified.
   * @param operations The list of operations to perform on individual campaign experiments.
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates campaign experiments. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignExperimentOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignExperimentsRequest request = MutateCampaignExperimentsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCampaignExperimentsResponse response = campaignExperimentServiceClient.mutateCampaignExperiments(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignExperimentsResponse mutateCampaignExperiments(
      MutateCampaignExperimentsRequest request) {
    return mutateCampaignExperimentsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates campaign experiments. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignExperimentOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignExperimentsRequest request = MutateCampaignExperimentsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCampaignExperimentsResponse&gt; future = campaignExperimentServiceClient.mutateCampaignExperimentsCallable().futureCall(request);
   *   // Do something
   *   MutateCampaignExperimentsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
      mutateCampaignExperimentsCallable() {
    return stub.mutateCampaignExperimentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Graduates a campaign experiment to a full campaign. The base and experiment campaigns will
   * start running independently with their own budgets.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   String campaignBudget = "";
   *   GraduateCampaignExperimentResponse response = campaignExperimentServiceClient.graduateCampaignExperiment(formattedCampaignExperiment, campaignBudget);
   * }
   * </code></pre>
   *
   * @param campaignExperiment The resource name of the campaign experiment to graduate.
   * @param campaignBudget Resource name of the budget to attach to the campaign graduated from the
   *     experiment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GraduateCampaignExperimentResponse graduateCampaignExperiment(
      String campaignExperiment, String campaignBudget) {
    CAMPAIGN_EXPERIMENT_PATH_TEMPLATE.validate(campaignExperiment, "graduateCampaignExperiment");
    GraduateCampaignExperimentRequest request =
        GraduateCampaignExperimentRequest.newBuilder()
            .setCampaignExperiment(campaignExperiment)
            .setCampaignBudget(campaignBudget)
            .build();
    return graduateCampaignExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Graduates a campaign experiment to a full campaign. The base and experiment campaigns will
   * start running independently with their own budgets.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   String campaignBudget = "";
   *   GraduateCampaignExperimentRequest request = GraduateCampaignExperimentRequest.newBuilder()
   *     .setCampaignExperiment(formattedCampaignExperiment)
   *     .setCampaignBudget(campaignBudget)
   *     .build();
   *   GraduateCampaignExperimentResponse response = campaignExperimentServiceClient.graduateCampaignExperiment(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GraduateCampaignExperimentResponse graduateCampaignExperiment(
      GraduateCampaignExperimentRequest request) {
    return graduateCampaignExperimentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Graduates a campaign experiment to a full campaign. The base and experiment campaigns will
   * start running independently with their own budgets.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   String campaignBudget = "";
   *   GraduateCampaignExperimentRequest request = GraduateCampaignExperimentRequest.newBuilder()
   *     .setCampaignExperiment(formattedCampaignExperiment)
   *     .setCampaignBudget(campaignBudget)
   *     .build();
   *   ApiFuture&lt;GraduateCampaignExperimentResponse&gt; future = campaignExperimentServiceClient.graduateCampaignExperimentCallable().futureCall(request);
   *   // Do something
   *   GraduateCampaignExperimentResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
      graduateCampaignExperimentCallable() {
    return stub.graduateCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Promotes the changes in a experiment campaign back to the base campaign.
   *
   * <p>The campaign experiment is updated immediately with status PROMOTING. This method return a
   * long running operation that tracks the promoting of the experiment campaign. If the promoting
   * fails, a list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   campaignExperimentServiceClient.promoteCampaignExperimentAsync(formattedCampaignExperiment).get();
   * }
   * </code></pre>
   *
   * @param campaignExperiment The resource name of the campaign experiment to promote.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, Empty> promoteCampaignExperimentAsync(
      String campaignExperiment) {
    CAMPAIGN_EXPERIMENT_PATH_TEMPLATE.validate(campaignExperiment, "promoteCampaignExperiment");
    PromoteCampaignExperimentRequest request =
        PromoteCampaignExperimentRequest.newBuilder()
            .setCampaignExperiment(campaignExperiment)
            .build();
    return promoteCampaignExperimentAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Promotes the changes in a experiment campaign back to the base campaign.
   *
   * <p>The campaign experiment is updated immediately with status PROMOTING. This method return a
   * long running operation that tracks the promoting of the experiment campaign. If the promoting
   * fails, a list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   PromoteCampaignExperimentRequest request = PromoteCampaignExperimentRequest.newBuilder()
   *     .setCampaignExperiment(formattedCampaignExperiment)
   *     .build();
   *   campaignExperimentServiceClient.promoteCampaignExperimentAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, Empty> promoteCampaignExperimentAsync(
      PromoteCampaignExperimentRequest request) {
    return promoteCampaignExperimentOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Promotes the changes in a experiment campaign back to the base campaign.
   *
   * <p>The campaign experiment is updated immediately with status PROMOTING. This method return a
   * long running operation that tracks the promoting of the experiment campaign. If the promoting
   * fails, a list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   PromoteCampaignExperimentRequest request = PromoteCampaignExperimentRequest.newBuilder()
   *     .setCampaignExperiment(formattedCampaignExperiment)
   *     .build();
   *   OperationFuture&lt;Empty, Empty&gt; future = campaignExperimentServiceClient.promoteCampaignExperimentOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<PromoteCampaignExperimentRequest, Empty, Empty>
      promoteCampaignExperimentOperationCallable() {
    return stub.promoteCampaignExperimentOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Promotes the changes in a experiment campaign back to the base campaign.
   *
   * <p>The campaign experiment is updated immediately with status PROMOTING. This method return a
   * long running operation that tracks the promoting of the experiment campaign. If the promoting
   * fails, a list of errors can be retrieved using the ListCampaignExperimentAsyncErrors method.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   PromoteCampaignExperimentRequest request = PromoteCampaignExperimentRequest.newBuilder()
   *     .setCampaignExperiment(formattedCampaignExperiment)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = campaignExperimentServiceClient.promoteCampaignExperimentCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<PromoteCampaignExperimentRequest, Operation>
      promoteCampaignExperimentCallable() {
    return stub.promoteCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Immediately ends a campaign experiment, changing the experiment's scheduled end date and
   * without waiting for end of day. End date is updated to be the time of the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   campaignExperimentServiceClient.endCampaignExperiment(formattedCampaignExperiment);
   * }
   * </code></pre>
   *
   * @param campaignExperiment The resource name of the campaign experiment to end.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void endCampaignExperiment(String campaignExperiment) {
    CAMPAIGN_EXPERIMENT_PATH_TEMPLATE.validate(campaignExperiment, "endCampaignExperiment");
    EndCampaignExperimentRequest request =
        EndCampaignExperimentRequest.newBuilder().setCampaignExperiment(campaignExperiment).build();
    endCampaignExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Immediately ends a campaign experiment, changing the experiment's scheduled end date and
   * without waiting for end of day. End date is updated to be the time of the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   EndCampaignExperimentRequest request = EndCampaignExperimentRequest.newBuilder()
   *     .setCampaignExperiment(formattedCampaignExperiment)
   *     .build();
   *   campaignExperimentServiceClient.endCampaignExperiment(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void endCampaignExperiment(EndCampaignExperimentRequest request) {
    endCampaignExperimentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Immediately ends a campaign experiment, changing the experiment's scheduled end date and
   * without waiting for end of day. End date is updated to be the time of the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedCampaignExperiment = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   EndCampaignExperimentRequest request = EndCampaignExperimentRequest.newBuilder()
   *     .setCampaignExperiment(formattedCampaignExperiment)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = campaignExperimentServiceClient.endCampaignExperimentCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<EndCampaignExperimentRequest, Empty> endCampaignExperimentCallable() {
    return stub.endCampaignExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all errors that occurred during CampaignExperiment create or promote (whichever
   * occurred last). Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedResourceName = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   for (Status element : campaignExperimentServiceClient.listCampaignExperimentAsyncErrors(formattedResourceName).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param resourceName The name of the campaign experiment from which to retrieve the async
   *     errors.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignExperimentAsyncErrorsPagedResponse listCampaignExperimentAsyncErrors(
      String resourceName) {
    CAMPAIGN_EXPERIMENT_PATH_TEMPLATE.validate(resourceName, "listCampaignExperimentAsyncErrors");
    ListCampaignExperimentAsyncErrorsRequest request =
        ListCampaignExperimentAsyncErrorsRequest.newBuilder().setResourceName(resourceName).build();
    return listCampaignExperimentAsyncErrors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all errors that occurred during CampaignExperiment create or promote (whichever
   * occurred last). Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedResourceName = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   ListCampaignExperimentAsyncErrorsRequest request = ListCampaignExperimentAsyncErrorsRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   for (Status element : campaignExperimentServiceClient.listCampaignExperimentAsyncErrors(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCampaignExperimentAsyncErrorsPagedResponse listCampaignExperimentAsyncErrors(
      ListCampaignExperimentAsyncErrorsRequest request) {
    return listCampaignExperimentAsyncErrorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all errors that occurred during CampaignExperiment create or promote (whichever
   * occurred last). Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedResourceName = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   ListCampaignExperimentAsyncErrorsRequest request = ListCampaignExperimentAsyncErrorsRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;ListCampaignExperimentAsyncErrorsPagedResponse&gt; future = campaignExperimentServiceClient.listCampaignExperimentAsyncErrorsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Status element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsPagedResponse>
      listCampaignExperimentAsyncErrorsPagedCallable() {
    return stub.listCampaignExperimentAsyncErrorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns all errors that occurred during CampaignExperiment create or promote (whichever
   * occurred last). Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
   *   String formattedResourceName = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
   *   ListCampaignExperimentAsyncErrorsRequest request = ListCampaignExperimentAsyncErrorsRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   while (true) {
   *     ListCampaignExperimentAsyncErrorsResponse response = campaignExperimentServiceClient.listCampaignExperimentAsyncErrorsCallable().call(request);
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
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
          Status, ListCampaignExperimentAsyncErrorsPage,
          ListCampaignExperimentAsyncErrorsFixedSizeCollection> {

    public static ApiFuture<ListCampaignExperimentAsyncErrorsPagedResponse> createAsync(
        PageContext<
                ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
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
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
          Status, ListCampaignExperimentAsyncErrorsPage> {

    private ListCampaignExperimentAsyncErrorsPage(
        PageContext<
                ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
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
                ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
                Status>
            context,
        ListCampaignExperimentAsyncErrorsResponse response) {
      return new ListCampaignExperimentAsyncErrorsPage(context, response);
    }

    @Override
    public ApiFuture<ListCampaignExperimentAsyncErrorsPage> createPageAsync(
        PageContext<
                ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
                Status>
            context,
        ApiFuture<ListCampaignExperimentAsyncErrorsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListCampaignExperimentAsyncErrorsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
          Status, ListCampaignExperimentAsyncErrorsPage,
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
