/*
 * Copyright 2020 Google LLC
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
package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.BatchJob;
import com.google.ads.googleads.v6.resources.BatchJob.BatchJobMetadata;
import com.google.ads.googleads.v6.services.stub.BatchJobServiceStub;
import com.google.ads.googleads.v6.services.stub.BatchJobServiceStubSettings;
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
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage batch jobs.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
 *   String customerId = "";
 *   BatchJobOperation operation = BatchJobOperation.newBuilder().build();
 *   MutateBatchJobResponse response = batchJobServiceClient.mutateBatchJob(customerId, operation);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the batchJobServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of BatchJobServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * BatchJobServiceSettings batchJobServiceSettings =
 *     BatchJobServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BatchJobServiceClient batchJobServiceClient =
 *     BatchJobServiceClient.create(batchJobServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * BatchJobServiceSettings batchJobServiceSettings =
 *     BatchJobServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BatchJobServiceClient batchJobServiceClient =
 *     BatchJobServiceClient.create(batchJobServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class BatchJobServiceClient implements BackgroundResource {
  private final BatchJobServiceSettings settings;
  private final BatchJobServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of BatchJobServiceClient with default settings. */
  public static final BatchJobServiceClient create() throws IOException {
    return create(BatchJobServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BatchJobServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BatchJobServiceClient create(BatchJobServiceSettings settings)
      throws IOException {
    return new BatchJobServiceClient(settings);
  }

  /**
   * Constructs an instance of BatchJobServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use BatchJobServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final BatchJobServiceClient create(BatchJobServiceStub stub) {
    return new BatchJobServiceClient(stub);
  }

  /**
   * Constructs an instance of BatchJobServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected BatchJobServiceClient(BatchJobServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((BatchJobServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected BatchJobServiceClient(BatchJobServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final BatchJobServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BatchJobServiceStub getStub() {
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
   * Mutates a batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   String customerId = "";
   *   BatchJobOperation operation = BatchJobOperation.newBuilder().build();
   *   MutateBatchJobResponse response = batchJobServiceClient.mutateBatchJob(customerId, operation);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer for which to create a batch job.
   * @param operation Required. The operation to perform on an individual batch job.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBatchJobResponse mutateBatchJob(
      String customerId, BatchJobOperation operation) {
    MutateBatchJobRequest request =
        MutateBatchJobRequest.newBuilder()
            .setCustomerId(customerId)
            .setOperation(operation)
            .build();
    return mutateBatchJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mutates a batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   String customerId = "";
   *   BatchJobOperation operation = BatchJobOperation.newBuilder().build();
   *   MutateBatchJobRequest request = MutateBatchJobRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setOperation(operation)
   *     .build();
   *   MutateBatchJobResponse response = batchJobServiceClient.mutateBatchJob(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateBatchJobResponse mutateBatchJob(MutateBatchJobRequest request) {
    return mutateBatchJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mutates a batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   String customerId = "";
   *   BatchJobOperation operation = BatchJobOperation.newBuilder().build();
   *   MutateBatchJobRequest request = MutateBatchJobRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setOperation(operation)
   *     .build();
   *   ApiFuture&lt;MutateBatchJobResponse&gt; future = batchJobServiceClient.mutateBatchJobCallable().futureCall(request);
   *   // Do something
   *   MutateBatchJobResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateBatchJobRequest, MutateBatchJobResponse>
      mutateBatchJobCallable() {
    return stub.mutateBatchJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   BatchJob response = batchJobServiceClient.getBatchJob(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the batch job to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchJob getBatchJob(BatchJobName resourceName) {
    GetBatchJobRequest request =
        GetBatchJobRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getBatchJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   BatchJob response = batchJobServiceClient.getBatchJob(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the batch job to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchJob getBatchJob(String resourceName) {
    GetBatchJobRequest request =
        GetBatchJobRequest.newBuilder().setResourceName(resourceName).build();
    return getBatchJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   GetBatchJobRequest request = GetBatchJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   BatchJob response = batchJobServiceClient.getBatchJob(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchJob getBatchJob(GetBatchJobRequest request) {
    return getBatchJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   GetBatchJobRequest request = GetBatchJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;BatchJob&gt; future = batchJobServiceClient.getBatchJobCallable().futureCall(request);
   *   // Do something
   *   BatchJob response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetBatchJobRequest, BatchJob> getBatchJobCallable() {
    return stub.getBatchJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the results of the batch job. The job must be done. Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   for (BatchJobResult element : batchJobServiceClient.listBatchJobResults(resourceName).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the batch job whose results are being
   *     listed.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBatchJobResultsPagedResponse listBatchJobResults(BatchJobName resourceName) {
    ListBatchJobResultsRequest request =
        ListBatchJobResultsRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return listBatchJobResults(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the results of the batch job. The job must be done. Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   for (BatchJobResult element : batchJobServiceClient.listBatchJobResults(resourceName.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the batch job whose results are being
   *     listed.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBatchJobResultsPagedResponse listBatchJobResults(String resourceName) {
    ListBatchJobResultsRequest request =
        ListBatchJobResultsRequest.newBuilder().setResourceName(resourceName).build();
    return listBatchJobResults(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the results of the batch job. The job must be done. Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   ListBatchJobResultsRequest request = ListBatchJobResultsRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   for (BatchJobResult element : batchJobServiceClient.listBatchJobResults(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBatchJobResultsPagedResponse listBatchJobResults(
      ListBatchJobResultsRequest request) {
    return listBatchJobResultsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the results of the batch job. The job must be done. Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   ListBatchJobResultsRequest request = ListBatchJobResultsRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;ListBatchJobResultsPagedResponse&gt; future = batchJobServiceClient.listBatchJobResultsPagedCallable().futureCall(request);
   *   // Do something
   *   for (BatchJobResult element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListBatchJobResultsRequest, ListBatchJobResultsPagedResponse>
      listBatchJobResultsPagedCallable() {
    return stub.listBatchJobResultsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the results of the batch job. The job must be done. Supports standard list paging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   ListBatchJobResultsRequest request = ListBatchJobResultsRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   while (true) {
   *     ListBatchJobResultsResponse response = batchJobServiceClient.listBatchJobResultsCallable().call(request);
   *     for (BatchJobResult element : response.getResultsList()) {
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
  public final UnaryCallable<ListBatchJobResultsRequest, ListBatchJobResultsResponse>
      listBatchJobResultsCallable() {
    return stub.listBatchJobResultsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the batch job.
   *
   * <p>The Operation.metadata field type is BatchJobMetadata. When finished, the long running
   * operation will not contain errors or a response. Instead, use ListBatchJobResults to get the
   * results of the job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   batchJobServiceClient.runBatchJobAsync(resourceName).get();
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the BatchJob to run.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, BatchJobMetadata> runBatchJobAsync(
      BatchJobName resourceName) {
    RunBatchJobRequest request =
        RunBatchJobRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return runBatchJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the batch job.
   *
   * <p>The Operation.metadata field type is BatchJobMetadata. When finished, the long running
   * operation will not contain errors or a response. Instead, use ListBatchJobResults to get the
   * results of the job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   batchJobServiceClient.runBatchJobAsync(resourceName.toString()).get();
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the BatchJob to run.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, BatchJobMetadata> runBatchJobAsync(String resourceName) {
    RunBatchJobRequest request =
        RunBatchJobRequest.newBuilder().setResourceName(resourceName).build();
    return runBatchJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the batch job.
   *
   * <p>The Operation.metadata field type is BatchJobMetadata. When finished, the long running
   * operation will not contain errors or a response. Instead, use ListBatchJobResults to get the
   * results of the job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   RunBatchJobRequest request = RunBatchJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   batchJobServiceClient.runBatchJobAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, BatchJobMetadata> runBatchJobAsync(
      RunBatchJobRequest request) {
    return runBatchJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the batch job.
   *
   * <p>The Operation.metadata field type is BatchJobMetadata. When finished, the long running
   * operation will not contain errors or a response. Instead, use ListBatchJobResults to get the
   * results of the job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   RunBatchJobRequest request = RunBatchJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   OperationFuture&lt;Empty, BatchJobMetadata&gt; future = batchJobServiceClient.runBatchJobOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<RunBatchJobRequest, Empty, BatchJobMetadata>
      runBatchJobOperationCallable() {
    return stub.runBatchJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Runs the batch job.
   *
   * <p>The Operation.metadata field type is BatchJobMetadata. When finished, the long running
   * operation will not contain errors or a response. Instead, use ListBatchJobResults to get the
   * results of the job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   RunBatchJobRequest request = RunBatchJobRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = batchJobServiceClient.runBatchJobCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<RunBatchJobRequest, Operation> runBatchJobCallable() {
    return stub.runBatchJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Add operations to the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   String sequenceToken = "";
   *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
   *   AddBatchJobOperationsResponse response = batchJobServiceClient.addBatchJobOperations(resourceName, sequenceToken, mutateOperations);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the batch job.
   * @param sequenceToken A token used to enforce sequencing.
   *     <p>The first AddBatchJobOperations request for a batch job should not set sequence_token.
   *     Subsequent requests must set sequence_token to the value of next_sequence_token received in
   *     the previous AddBatchJobOperations response.
   * @param mutateOperations Required. The list of mutates being added.
   *     <p>Operations can use negative integers as temp ids to signify dependencies between
   *     entities created in this batch job. For example, a customer with id = 1234 can create a
   *     campaign and an ad group in that same campaign by creating a campaign in the first
   *     operation with the resource name explicitly set to "customers/1234/campaigns/-1", and
   *     creating an ad group in the second operation with the campaign field also set to
   *     "customers/1234/campaigns/-1".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddBatchJobOperationsResponse addBatchJobOperations(
      BatchJobName resourceName, String sequenceToken, List<MutateOperation> mutateOperations) {
    AddBatchJobOperationsRequest request =
        AddBatchJobOperationsRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .setSequenceToken(sequenceToken)
            .addAllMutateOperations(mutateOperations)
            .build();
    return addBatchJobOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Add operations to the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   String sequenceToken = "";
   *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
   *   AddBatchJobOperationsResponse response = batchJobServiceClient.addBatchJobOperations(resourceName.toString(), sequenceToken, mutateOperations);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the batch job.
   * @param sequenceToken A token used to enforce sequencing.
   *     <p>The first AddBatchJobOperations request for a batch job should not set sequence_token.
   *     Subsequent requests must set sequence_token to the value of next_sequence_token received in
   *     the previous AddBatchJobOperations response.
   * @param mutateOperations Required. The list of mutates being added.
   *     <p>Operations can use negative integers as temp ids to signify dependencies between
   *     entities created in this batch job. For example, a customer with id = 1234 can create a
   *     campaign and an ad group in that same campaign by creating a campaign in the first
   *     operation with the resource name explicitly set to "customers/1234/campaigns/-1", and
   *     creating an ad group in the second operation with the campaign field also set to
   *     "customers/1234/campaigns/-1".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddBatchJobOperationsResponse addBatchJobOperations(
      String resourceName, String sequenceToken, List<MutateOperation> mutateOperations) {
    AddBatchJobOperationsRequest request =
        AddBatchJobOperationsRequest.newBuilder()
            .setResourceName(resourceName)
            .setSequenceToken(sequenceToken)
            .addAllMutateOperations(mutateOperations)
            .build();
    return addBatchJobOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Add operations to the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
   *   AddBatchJobOperationsResponse response = batchJobServiceClient.addBatchJobOperations(resourceName, mutateOperations);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the batch job.
   * @param mutateOperations Required. The list of mutates being added.
   *     <p>Operations can use negative integers as temp ids to signify dependencies between
   *     entities created in this batch job. For example, a customer with id = 1234 can create a
   *     campaign and an ad group in that same campaign by creating a campaign in the first
   *     operation with the resource name explicitly set to "customers/1234/campaigns/-1", and
   *     creating an ad group in the second operation with the campaign field also set to
   *     "customers/1234/campaigns/-1".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddBatchJobOperationsResponse addBatchJobOperations(
      BatchJobName resourceName, List<MutateOperation> mutateOperations) {
    AddBatchJobOperationsRequest request =
        AddBatchJobOperationsRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .addAllMutateOperations(mutateOperations)
            .build();
    return addBatchJobOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Add operations to the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
   *   AddBatchJobOperationsResponse response = batchJobServiceClient.addBatchJobOperations(resourceName.toString(), mutateOperations);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the batch job.
   * @param mutateOperations Required. The list of mutates being added.
   *     <p>Operations can use negative integers as temp ids to signify dependencies between
   *     entities created in this batch job. For example, a customer with id = 1234 can create a
   *     campaign and an ad group in that same campaign by creating a campaign in the first
   *     operation with the resource name explicitly set to "customers/1234/campaigns/-1", and
   *     creating an ad group in the second operation with the campaign field also set to
   *     "customers/1234/campaigns/-1".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddBatchJobOperationsResponse addBatchJobOperations(
      String resourceName, List<MutateOperation> mutateOperations) {
    AddBatchJobOperationsRequest request =
        AddBatchJobOperationsRequest.newBuilder()
            .setResourceName(resourceName)
            .addAllMutateOperations(mutateOperations)
            .build();
    return addBatchJobOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Add operations to the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
   *   AddBatchJobOperationsRequest request = AddBatchJobOperationsRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .addAllMutateOperations(mutateOperations)
   *     .build();
   *   AddBatchJobOperationsResponse response = batchJobServiceClient.addBatchJobOperations(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddBatchJobOperationsResponse addBatchJobOperations(
      AddBatchJobOperationsRequest request) {
    return addBatchJobOperationsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Add operations to the batch job.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
   *   BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
   *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
   *   AddBatchJobOperationsRequest request = AddBatchJobOperationsRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .addAllMutateOperations(mutateOperations)
   *     .build();
   *   ApiFuture&lt;AddBatchJobOperationsResponse&gt; future = batchJobServiceClient.addBatchJobOperationsCallable().futureCall(request);
   *   // Do something
   *   AddBatchJobOperationsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
      addBatchJobOperationsCallable() {
    return stub.addBatchJobOperationsCallable();
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

  public static class ListBatchJobResultsPagedResponse
      extends AbstractPagedListResponse<
          ListBatchJobResultsRequest,
          ListBatchJobResultsResponse,
          BatchJobResult,
          ListBatchJobResultsPage,
          ListBatchJobResultsFixedSizeCollection> {

    public static ApiFuture<ListBatchJobResultsPagedResponse> createAsync(
        PageContext<ListBatchJobResultsRequest, ListBatchJobResultsResponse, BatchJobResult>
            context,
        ApiFuture<ListBatchJobResultsResponse> futureResponse) {
      ApiFuture<ListBatchJobResultsPage> futurePage =
          ListBatchJobResultsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListBatchJobResultsPage, ListBatchJobResultsPagedResponse>() {
            @Override
            public ListBatchJobResultsPagedResponse apply(ListBatchJobResultsPage input) {
              return new ListBatchJobResultsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListBatchJobResultsPagedResponse(ListBatchJobResultsPage page) {
      super(page, ListBatchJobResultsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListBatchJobResultsPage
      extends AbstractPage<
          ListBatchJobResultsRequest,
          ListBatchJobResultsResponse,
          BatchJobResult,
          ListBatchJobResultsPage> {

    private ListBatchJobResultsPage(
        PageContext<ListBatchJobResultsRequest, ListBatchJobResultsResponse, BatchJobResult>
            context,
        ListBatchJobResultsResponse response) {
      super(context, response);
    }

    private static ListBatchJobResultsPage createEmptyPage() {
      return new ListBatchJobResultsPage(null, null);
    }

    @Override
    protected ListBatchJobResultsPage createPage(
        PageContext<ListBatchJobResultsRequest, ListBatchJobResultsResponse, BatchJobResult>
            context,
        ListBatchJobResultsResponse response) {
      return new ListBatchJobResultsPage(context, response);
    }

    @Override
    public ApiFuture<ListBatchJobResultsPage> createPageAsync(
        PageContext<ListBatchJobResultsRequest, ListBatchJobResultsResponse, BatchJobResult>
            context,
        ApiFuture<ListBatchJobResultsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListBatchJobResultsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListBatchJobResultsRequest,
          ListBatchJobResultsResponse,
          BatchJobResult,
          ListBatchJobResultsPage,
          ListBatchJobResultsFixedSizeCollection> {

    private ListBatchJobResultsFixedSizeCollection(
        List<ListBatchJobResultsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListBatchJobResultsFixedSizeCollection createEmptyCollection() {
      return new ListBatchJobResultsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListBatchJobResultsFixedSizeCollection createCollection(
        List<ListBatchJobResultsPage> pages, int collectionSize) {
      return new ListBatchJobResultsFixedSizeCollection(pages, collectionSize);
    }
  }
}
