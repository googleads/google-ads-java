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

import com.google.ads.googleads.v20.resources.ExperimentName;
import com.google.ads.googleads.v20.services.stub.ExperimentServiceStub;
import com.google.ads.googleads.v20.services.stub.ExperimentServiceStubSettings;
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
 * Service Description: Service to manage experiments.
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
 * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ExperimentOperation> operations = new ArrayList<>();
 *   MutateExperimentsResponse response =
 *       experimentServiceClient.mutateExperiments(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ExperimentServiceClient object to clean up resources
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
 *      <td><p> MutateExperiments</td>
 *      <td><p> Creates, updates, or removes experiments. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [ExperimentError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateExperiments(MutateExperimentsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateExperiments(String customerId, List&lt;ExperimentOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateExperimentsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> EndExperiment</td>
 *      <td><p> Immediately ends an experiment, changing the experiment's scheduled end date and without waiting for end of day. End date is updated to be the time of the request.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [ExperimentError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> endExperiment(EndExperimentRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> endExperiment(ExperimentName experiment)
 *           <li><p> endExperiment(String experiment)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> endExperimentCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListExperimentAsyncErrors</td>
 *      <td><p> Returns all errors that occurred during the last Experiment update (either scheduling or promotion). Supports standard list paging.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listExperimentAsyncErrors(ListExperimentAsyncErrorsRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> listExperimentAsyncErrors(ExperimentName resourceName)
 *           <li><p> listExperimentAsyncErrors(String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listExperimentAsyncErrorsPagedCallable()
 *           <li><p> listExperimentAsyncErrorsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GraduateExperiment</td>
 *      <td><p> Graduates an experiment to a full campaign.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [ExperimentError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> graduateExperiment(GraduateExperimentRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> graduateExperiment(ExperimentName experiment, List&lt;CampaignBudgetMapping&gt; campaignBudgetMappings)
 *           <li><p> graduateExperiment(String experiment, List&lt;CampaignBudgetMapping&gt; campaignBudgetMappings)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> graduateExperimentCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ScheduleExperiment</td>
 *      <td><p> Schedule an experiment. The in design campaign will be converted into a real campaign (called the experiment campaign) that will begin serving ads if successfully created.
 * <p>  The experiment is scheduled immediately with status INITIALIZING. This method returns a long running operation that tracks the forking of the in design campaign. If the forking fails, a list of errors can be retrieved using the ListExperimentAsyncErrors method. The operation's metadata will be a string containing the resource name of the created experiment.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [ExperimentError]()   [DatabaseError]()   [DateError]()   [DateRangeError]()   [FieldError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RangeError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> scheduleExperimentAsync(ScheduleExperimentRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> scheduleExperimentAsync(ExperimentName resourceName)
 *           <li><p> scheduleExperimentAsync(String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> scheduleExperimentOperationCallable()
 *           <li><p> scheduleExperimentCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> PromoteExperiment</td>
 *      <td><p> Promotes the trial campaign thus applying changes in the trial campaign to the base campaign. This method returns a long running operation that tracks the promotion of the experiment campaign. If it fails, a list of errors can be retrieved using the ListExperimentAsyncErrors method. The operation's metadata will be a string containing the resource name of the created experiment.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [ExperimentError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> promoteExperimentAsync(PromoteExperimentRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> promoteExperimentAsync(ExperimentName resourceName)
 *           <li><p> promoteExperimentAsync(String resourceName)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> promoteExperimentOperationCallable()
 *           <li><p> promoteExperimentCallable()
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
 * <p>This class can be customized by passing in a custom instance of ExperimentServiceSettings to
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
 * ExperimentServiceSettings experimentServiceSettings =
 *     ExperimentServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ExperimentServiceClient experimentServiceClient =
 *     ExperimentServiceClient.create(experimentServiceSettings);
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
 * ExperimentServiceSettings experimentServiceSettings =
 *     ExperimentServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ExperimentServiceClient experimentServiceClient =
 *     ExperimentServiceClient.create(experimentServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ExperimentServiceClient implements BackgroundResource {
  private final ExperimentServiceSettings settings;
  private final ExperimentServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of ExperimentServiceClient with default settings. */
  public static final ExperimentServiceClient create() throws IOException {
    return create(ExperimentServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ExperimentServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ExperimentServiceClient create(ExperimentServiceSettings settings)
      throws IOException {
    return new ExperimentServiceClient(settings);
  }

  /**
   * Constructs an instance of ExperimentServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(ExperimentServiceSettings).
   */
  public static final ExperimentServiceClient create(ExperimentServiceStub stub) {
    return new ExperimentServiceClient(stub);
  }

  /**
   * Constructs an instance of ExperimentServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ExperimentServiceClient(ExperimentServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ExperimentServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  protected ExperimentServiceClient(ExperimentServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final ExperimentServiceSettings getSettings() {
    return settings;
  }

  public ExperimentServiceStub getStub() {
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
   * Creates, updates, or removes experiments. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<ExperimentOperation> operations = new ArrayList<>();
   *   MutateExperimentsResponse response =
   *       experimentServiceClient.mutateExperiments(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose experiments are being modified.
   * @param operations Required. The list of operations to perform on individual experiments.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateExperimentsResponse mutateExperiments(
      String customerId, List<ExperimentOperation> operations) {
    MutateExperimentsRequest request =
        MutateExperimentsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateExperiments(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes experiments. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   MutateExperimentsRequest request =
   *       MutateExperimentsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ExperimentOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateExperimentsResponse response = experimentServiceClient.mutateExperiments(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateExperimentsResponse mutateExperiments(MutateExperimentsRequest request) {
    return mutateExperimentsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes experiments. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   MutateExperimentsRequest request =
   *       MutateExperimentsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<ExperimentOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateExperimentsResponse> future =
   *       experimentServiceClient.mutateExperimentsCallable().futureCall(request);
   *   // Do something.
   *   MutateExperimentsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateExperimentsRequest, MutateExperimentsResponse>
      mutateExperimentsCallable() {
    return stub.mutateExperimentsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Immediately ends an experiment, changing the experiment's scheduled end date and without
   * waiting for end of day. End date is updated to be the time of the request.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ExperimentName experiment = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
   *   experimentServiceClient.endExperiment(experiment);
   * }
   * }</pre>
   *
   * @param experiment Required. The resource name of the campaign experiment to end.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void endExperiment(ExperimentName experiment) {
    EndExperimentRequest request =
        EndExperimentRequest.newBuilder()
            .setExperiment(experiment == null ? null : experiment.toString())
            .build();
    endExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Immediately ends an experiment, changing the experiment's scheduled end date and without
   * waiting for end of day. End date is updated to be the time of the request.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   String experiment = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString();
   *   experimentServiceClient.endExperiment(experiment);
   * }
   * }</pre>
   *
   * @param experiment Required. The resource name of the campaign experiment to end.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void endExperiment(String experiment) {
    EndExperimentRequest request =
        EndExperimentRequest.newBuilder().setExperiment(experiment).build();
    endExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Immediately ends an experiment, changing the experiment's scheduled end date and without
   * waiting for end of day. End date is updated to be the time of the request.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   EndExperimentRequest request =
   *       EndExperimentRequest.newBuilder()
   *           .setExperiment(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   experimentServiceClient.endExperiment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void endExperiment(EndExperimentRequest request) {
    endExperimentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Immediately ends an experiment, changing the experiment's scheduled end date and without
   * waiting for end of day. End date is updated to be the time of the request.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   EndExperimentRequest request =
   *       EndExperimentRequest.newBuilder()
   *           .setExperiment(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Empty> future = experimentServiceClient.endExperimentCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<EndExperimentRequest, Empty> endExperimentCallable() {
    return stub.endExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during the last Experiment update (either scheduling or
   * promotion). Supports standard list paging.
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ExperimentName resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
   *   for (Status element :
   *       experimentServiceClient.listExperimentAsyncErrors(resourceName).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param resourceName Required. The name of the experiment from which to retrieve the async
   *     errors.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListExperimentAsyncErrorsPagedResponse listExperimentAsyncErrors(
      ExperimentName resourceName) {
    ListExperimentAsyncErrorsRequest request =
        ListExperimentAsyncErrorsRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return listExperimentAsyncErrors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during the last Experiment update (either scheduling or
   * promotion). Supports standard list paging.
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   String resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString();
   *   for (Status element :
   *       experimentServiceClient.listExperimentAsyncErrors(resourceName).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param resourceName Required. The name of the experiment from which to retrieve the async
   *     errors.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListExperimentAsyncErrorsPagedResponse listExperimentAsyncErrors(
      String resourceName) {
    ListExperimentAsyncErrorsRequest request =
        ListExperimentAsyncErrorsRequest.newBuilder().setResourceName(resourceName).build();
    return listExperimentAsyncErrors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during the last Experiment update (either scheduling or
   * promotion). Supports standard list paging.
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ListExperimentAsyncErrorsRequest request =
   *       ListExperimentAsyncErrorsRequest.newBuilder()
   *           .setResourceName(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (Status element :
   *       experimentServiceClient.listExperimentAsyncErrors(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListExperimentAsyncErrorsPagedResponse listExperimentAsyncErrors(
      ListExperimentAsyncErrorsRequest request) {
    return listExperimentAsyncErrorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during the last Experiment update (either scheduling or
   * promotion). Supports standard list paging.
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ListExperimentAsyncErrorsRequest request =
   *       ListExperimentAsyncErrorsRequest.newBuilder()
   *           .setResourceName(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<Status> future =
   *       experimentServiceClient.listExperimentAsyncErrorsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Status element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsPagedResponse>
      listExperimentAsyncErrorsPagedCallable() {
    return stub.listExperimentAsyncErrorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns all errors that occurred during the last Experiment update (either scheduling or
   * promotion). Supports standard list paging.
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ListExperimentAsyncErrorsRequest request =
   *       ListExperimentAsyncErrorsRequest.newBuilder()
   *           .setResourceName(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListExperimentAsyncErrorsResponse response =
   *         experimentServiceClient.listExperimentAsyncErrorsCallable().call(request);
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
  public final UnaryCallable<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse>
      listExperimentAsyncErrorsCallable() {
    return stub.listExperimentAsyncErrorsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Graduates an experiment to a full campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ExperimentName experiment = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
   *   List<CampaignBudgetMapping> campaignBudgetMappings = new ArrayList<>();
   *   experimentServiceClient.graduateExperiment(experiment, campaignBudgetMappings);
   * }
   * }</pre>
   *
   * @param experiment Required. The experiment to be graduated.
   * @param campaignBudgetMappings Required. List of campaign budget mappings for graduation. Each
   *     campaign that appears here will graduate, and will be assigned a new budget that is paired
   *     with it in the mapping. The maximum size is one.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void graduateExperiment(
      ExperimentName experiment, List<CampaignBudgetMapping> campaignBudgetMappings) {
    GraduateExperimentRequest request =
        GraduateExperimentRequest.newBuilder()
            .setExperiment(experiment == null ? null : experiment.toString())
            .addAllCampaignBudgetMappings(campaignBudgetMappings)
            .build();
    graduateExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Graduates an experiment to a full campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   String experiment = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString();
   *   List<CampaignBudgetMapping> campaignBudgetMappings = new ArrayList<>();
   *   experimentServiceClient.graduateExperiment(experiment, campaignBudgetMappings);
   * }
   * }</pre>
   *
   * @param experiment Required. The experiment to be graduated.
   * @param campaignBudgetMappings Required. List of campaign budget mappings for graduation. Each
   *     campaign that appears here will graduate, and will be assigned a new budget that is paired
   *     with it in the mapping. The maximum size is one.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void graduateExperiment(
      String experiment, List<CampaignBudgetMapping> campaignBudgetMappings) {
    GraduateExperimentRequest request =
        GraduateExperimentRequest.newBuilder()
            .setExperiment(experiment)
            .addAllCampaignBudgetMappings(campaignBudgetMappings)
            .build();
    graduateExperiment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Graduates an experiment to a full campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   GraduateExperimentRequest request =
   *       GraduateExperimentRequest.newBuilder()
   *           .setExperiment(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .addAllCampaignBudgetMappings(new ArrayList<CampaignBudgetMapping>())
   *           .setValidateOnly(true)
   *           .build();
   *   experimentServiceClient.graduateExperiment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void graduateExperiment(GraduateExperimentRequest request) {
    graduateExperimentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Graduates an experiment to a full campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   GraduateExperimentRequest request =
   *       GraduateExperimentRequest.newBuilder()
   *           .setExperiment(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .addAllCampaignBudgetMappings(new ArrayList<CampaignBudgetMapping>())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Empty> future =
   *       experimentServiceClient.graduateExperimentCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GraduateExperimentRequest, Empty> graduateExperimentCallable() {
    return stub.graduateExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Schedule an experiment. The in design campaign will be converted into a real campaign (called
   * the experiment campaign) that will begin serving ads if successfully created.
   *
   * <p>The experiment is scheduled immediately with status INITIALIZING. This method returns a long
   * running operation that tracks the forking of the in design campaign. If the forking fails, a
   * list of errors can be retrieved using the ListExperimentAsyncErrors method. The operation's
   * metadata will be a string containing the resource name of the created experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
   * [DatabaseError]() [DateError]() [DateRangeError]() [FieldError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ExperimentName resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
   *   experimentServiceClient.scheduleExperimentAsync(resourceName).get();
   * }
   * }</pre>
   *
   * @param resourceName Required. The scheduled experiment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, ScheduleExperimentMetadata> scheduleExperimentAsync(
      ExperimentName resourceName) {
    ScheduleExperimentRequest request =
        ScheduleExperimentRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return scheduleExperimentAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Schedule an experiment. The in design campaign will be converted into a real campaign (called
   * the experiment campaign) that will begin serving ads if successfully created.
   *
   * <p>The experiment is scheduled immediately with status INITIALIZING. This method returns a long
   * running operation that tracks the forking of the in design campaign. If the forking fails, a
   * list of errors can be retrieved using the ListExperimentAsyncErrors method. The operation's
   * metadata will be a string containing the resource name of the created experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
   * [DatabaseError]() [DateError]() [DateRangeError]() [FieldError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   String resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString();
   *   experimentServiceClient.scheduleExperimentAsync(resourceName).get();
   * }
   * }</pre>
   *
   * @param resourceName Required. The scheduled experiment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, ScheduleExperimentMetadata> scheduleExperimentAsync(
      String resourceName) {
    ScheduleExperimentRequest request =
        ScheduleExperimentRequest.newBuilder().setResourceName(resourceName).build();
    return scheduleExperimentAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Schedule an experiment. The in design campaign will be converted into a real campaign (called
   * the experiment campaign) that will begin serving ads if successfully created.
   *
   * <p>The experiment is scheduled immediately with status INITIALIZING. This method returns a long
   * running operation that tracks the forking of the in design campaign. If the forking fails, a
   * list of errors can be retrieved using the ListExperimentAsyncErrors method. The operation's
   * metadata will be a string containing the resource name of the created experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
   * [DatabaseError]() [DateError]() [DateRangeError]() [FieldError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ScheduleExperimentRequest request =
   *       ScheduleExperimentRequest.newBuilder()
   *           .setResourceName(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   experimentServiceClient.scheduleExperimentAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, ScheduleExperimentMetadata> scheduleExperimentAsync(
      ScheduleExperimentRequest request) {
    return scheduleExperimentOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Schedule an experiment. The in design campaign will be converted into a real campaign (called
   * the experiment campaign) that will begin serving ads if successfully created.
   *
   * <p>The experiment is scheduled immediately with status INITIALIZING. This method returns a long
   * running operation that tracks the forking of the in design campaign. If the forking fails, a
   * list of errors can be retrieved using the ListExperimentAsyncErrors method. The operation's
   * metadata will be a string containing the resource name of the created experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
   * [DatabaseError]() [DateError]() [DateRangeError]() [FieldError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ScheduleExperimentRequest request =
   *       ScheduleExperimentRequest.newBuilder()
   *           .setResourceName(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   OperationFuture<Empty, ScheduleExperimentMetadata> future =
   *       experimentServiceClient.scheduleExperimentOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
      scheduleExperimentOperationCallable() {
    return stub.scheduleExperimentOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Schedule an experiment. The in design campaign will be converted into a real campaign (called
   * the experiment campaign) that will begin serving ads if successfully created.
   *
   * <p>The experiment is scheduled immediately with status INITIALIZING. This method returns a long
   * running operation that tracks the forking of the in design campaign. If the forking fails, a
   * list of errors can be retrieved using the ListExperimentAsyncErrors method. The operation's
   * metadata will be a string containing the resource name of the created experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
   * [DatabaseError]() [DateError]() [DateRangeError]() [FieldError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RangeError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ScheduleExperimentRequest request =
   *       ScheduleExperimentRequest.newBuilder()
   *           .setResourceName(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       experimentServiceClient.scheduleExperimentCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ScheduleExperimentRequest, Operation> scheduleExperimentCallable() {
    return stub.scheduleExperimentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the trial campaign thus applying changes in the trial campaign to the base campaign.
   * This method returns a long running operation that tracks the promotion of the experiment
   * campaign. If it fails, a list of errors can be retrieved using the ListExperimentAsyncErrors
   * method. The operation's metadata will be a string containing the resource name of the created
   * experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   ExperimentName resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
   *   experimentServiceClient.promoteExperimentAsync(resourceName).get();
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the experiment to promote.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, PromoteExperimentMetadata> promoteExperimentAsync(
      ExperimentName resourceName) {
    PromoteExperimentRequest request =
        PromoteExperimentRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return promoteExperimentAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the trial campaign thus applying changes in the trial campaign to the base campaign.
   * This method returns a long running operation that tracks the promotion of the experiment
   * campaign. If it fails, a list of errors can be retrieved using the ListExperimentAsyncErrors
   * method. The operation's metadata will be a string containing the resource name of the created
   * experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   String resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString();
   *   experimentServiceClient.promoteExperimentAsync(resourceName).get();
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the experiment to promote.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, PromoteExperimentMetadata> promoteExperimentAsync(
      String resourceName) {
    PromoteExperimentRequest request =
        PromoteExperimentRequest.newBuilder().setResourceName(resourceName).build();
    return promoteExperimentAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the trial campaign thus applying changes in the trial campaign to the base campaign.
   * This method returns a long running operation that tracks the promotion of the experiment
   * campaign. If it fails, a list of errors can be retrieved using the ListExperimentAsyncErrors
   * method. The operation's metadata will be a string containing the resource name of the created
   * experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   PromoteExperimentRequest request =
   *       PromoteExperimentRequest.newBuilder()
   *           .setResourceName(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   experimentServiceClient.promoteExperimentAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, PromoteExperimentMetadata> promoteExperimentAsync(
      PromoteExperimentRequest request) {
    return promoteExperimentOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the trial campaign thus applying changes in the trial campaign to the base campaign.
   * This method returns a long running operation that tracks the promotion of the experiment
   * campaign. If it fails, a list of errors can be retrieved using the ListExperimentAsyncErrors
   * method. The operation's metadata will be a string containing the resource name of the created
   * experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   PromoteExperimentRequest request =
   *       PromoteExperimentRequest.newBuilder()
   *           .setResourceName(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   OperationFuture<Empty, PromoteExperimentMetadata> future =
   *       experimentServiceClient.promoteExperimentOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
      promoteExperimentOperationCallable() {
    return stub.promoteExperimentOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promotes the trial campaign thus applying changes in the trial campaign to the base campaign.
   * This method returns a long running operation that tracks the promotion of the experiment
   * campaign. If it fails, a list of errors can be retrieved using the ListExperimentAsyncErrors
   * method. The operation's metadata will be a string containing the resource name of the created
   * experiment.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [ExperimentError]()
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
   * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
   *   PromoteExperimentRequest request =
   *       PromoteExperimentRequest.newBuilder()
   *           .setResourceName(ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]").toString())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       experimentServiceClient.promoteExperimentCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PromoteExperimentRequest, Operation> promoteExperimentCallable() {
    return stub.promoteExperimentCallable();
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

  public static class ListExperimentAsyncErrorsPagedResponse
      extends AbstractPagedListResponse<
          ListExperimentAsyncErrorsRequest,
          ListExperimentAsyncErrorsResponse,
          Status,
          ListExperimentAsyncErrorsPage,
          ListExperimentAsyncErrorsFixedSizeCollection> {

    public static ApiFuture<ListExperimentAsyncErrorsPagedResponse> createAsync(
        PageContext<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse, Status>
            context,
        ApiFuture<ListExperimentAsyncErrorsResponse> futureResponse) {
      ApiFuture<ListExperimentAsyncErrorsPage> futurePage =
          ListExperimentAsyncErrorsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListExperimentAsyncErrorsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListExperimentAsyncErrorsPagedResponse(ListExperimentAsyncErrorsPage page) {
      super(page, ListExperimentAsyncErrorsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListExperimentAsyncErrorsPage
      extends AbstractPage<
          ListExperimentAsyncErrorsRequest,
          ListExperimentAsyncErrorsResponse,
          Status,
          ListExperimentAsyncErrorsPage> {

    private ListExperimentAsyncErrorsPage(
        PageContext<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse, Status>
            context,
        ListExperimentAsyncErrorsResponse response) {
      super(context, response);
    }

    private static ListExperimentAsyncErrorsPage createEmptyPage() {
      return new ListExperimentAsyncErrorsPage(null, null);
    }

    @Override
    protected ListExperimentAsyncErrorsPage createPage(
        PageContext<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse, Status>
            context,
        ListExperimentAsyncErrorsResponse response) {
      return new ListExperimentAsyncErrorsPage(context, response);
    }

    @Override
    public ApiFuture<ListExperimentAsyncErrorsPage> createPageAsync(
        PageContext<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse, Status>
            context,
        ApiFuture<ListExperimentAsyncErrorsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListExperimentAsyncErrorsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListExperimentAsyncErrorsRequest,
          ListExperimentAsyncErrorsResponse,
          Status,
          ListExperimentAsyncErrorsPage,
          ListExperimentAsyncErrorsFixedSizeCollection> {

    private ListExperimentAsyncErrorsFixedSizeCollection(
        List<ListExperimentAsyncErrorsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListExperimentAsyncErrorsFixedSizeCollection createEmptyCollection() {
      return new ListExperimentAsyncErrorsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListExperimentAsyncErrorsFixedSizeCollection createCollection(
        List<ListExperimentAsyncErrorsPage> pages, int collectionSize) {
      return new ListExperimentAsyncErrorsFixedSizeCollection(pages, collectionSize);
    }
  }
}
