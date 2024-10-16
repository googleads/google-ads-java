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

package com.google.ads.googleads.v18.services;

import static com.google.ads.googleads.v18.services.BatchJobServiceClient.ListBatchJobResultsPagedResponse;

import com.google.ads.googleads.v18.resources.BatchJobName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class BatchJobServiceClientTest {
  private static MockBatchJobService mockBatchJobService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BatchJobServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBatchJobService = new MockBatchJobService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockBatchJobService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    BatchJobServiceSettings settings =
        BatchJobServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BatchJobServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void mutateBatchJobTest() throws Exception {
    MutateBatchJobResponse expectedResponse =
        MutateBatchJobResponse.newBuilder()
            .setResult(MutateBatchJobResult.newBuilder().build())
            .build();
    mockBatchJobService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    BatchJobOperation operation = BatchJobOperation.newBuilder().build();

    MutateBatchJobResponse actualResponse = client.mutateBatchJob(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateBatchJobRequest actualRequest = ((MutateBatchJobRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateBatchJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchJobService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      BatchJobOperation operation = BatchJobOperation.newBuilder().build();
      client.mutateBatchJob(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBatchJobResultsTest() throws Exception {
    BatchJobResult responsesElement = BatchJobResult.newBuilder().build();
    ListBatchJobResultsResponse expectedResponse =
        ListBatchJobResultsResponse.newBuilder()
            .setNextPageToken("")
            .addAllResults(Arrays.asList(responsesElement))
            .build();
    mockBatchJobService.addResponse(expectedResponse);

    BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");

    ListBatchJobResultsPagedResponse pagedListResponse = client.listBatchJobResults(resourceName);

    List<BatchJobResult> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBatchJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBatchJobResultsRequest actualRequest = ((ListBatchJobResultsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBatchJobResultsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchJobService.addException(exception);

    try {
      BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
      client.listBatchJobResults(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBatchJobResultsTest2() throws Exception {
    BatchJobResult responsesElement = BatchJobResult.newBuilder().build();
    ListBatchJobResultsResponse expectedResponse =
        ListBatchJobResultsResponse.newBuilder()
            .setNextPageToken("")
            .addAllResults(Arrays.asList(responsesElement))
            .build();
    mockBatchJobService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ListBatchJobResultsPagedResponse pagedListResponse = client.listBatchJobResults(resourceName);

    List<BatchJobResult> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBatchJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBatchJobResultsRequest actualRequest = ((ListBatchJobResultsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBatchJobResultsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchJobService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.listBatchJobResults(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void runBatchJobTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("runBatchJobTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBatchJobService.addResponse(resultOperation);

    BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");

    client.runBatchJobAsync(resourceName).get();

    List<AbstractMessage> actualRequests = mockBatchJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RunBatchJobRequest actualRequest = ((RunBatchJobRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void runBatchJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchJobService.addException(exception);

    try {
      BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
      client.runBatchJobAsync(resourceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void runBatchJobTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("runBatchJobTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBatchJobService.addResponse(resultOperation);

    String resourceName = "resourceName-384566343";

    client.runBatchJobAsync(resourceName).get();

    List<AbstractMessage> actualRequests = mockBatchJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RunBatchJobRequest actualRequest = ((RunBatchJobRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void runBatchJobExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchJobService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.runBatchJobAsync(resourceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void addBatchJobOperationsTest() throws Exception {
    AddBatchJobOperationsResponse expectedResponse =
        AddBatchJobOperationsResponse.newBuilder()
            .setTotalOperations(1685086151)
            .setNextSequenceToken("nextSequenceToken586107525")
            .build();
    mockBatchJobService.addResponse(expectedResponse);

    BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
    List<MutateOperation> mutateOperations = new ArrayList<>();

    AddBatchJobOperationsResponse actualResponse =
        client.addBatchJobOperations(resourceName, mutateOperations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddBatchJobOperationsRequest actualRequest =
        ((AddBatchJobOperationsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertEquals(mutateOperations, actualRequest.getMutateOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void addBatchJobOperationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchJobService.addException(exception);

    try {
      BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
      List<MutateOperation> mutateOperations = new ArrayList<>();
      client.addBatchJobOperations(resourceName, mutateOperations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void addBatchJobOperationsTest2() throws Exception {
    AddBatchJobOperationsResponse expectedResponse =
        AddBatchJobOperationsResponse.newBuilder()
            .setTotalOperations(1685086151)
            .setNextSequenceToken("nextSequenceToken586107525")
            .build();
    mockBatchJobService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";
    List<MutateOperation> mutateOperations = new ArrayList<>();

    AddBatchJobOperationsResponse actualResponse =
        client.addBatchJobOperations(resourceName, mutateOperations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddBatchJobOperationsRequest actualRequest =
        ((AddBatchJobOperationsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertEquals(mutateOperations, actualRequest.getMutateOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void addBatchJobOperationsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchJobService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      List<MutateOperation> mutateOperations = new ArrayList<>();
      client.addBatchJobOperations(resourceName, mutateOperations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void addBatchJobOperationsTest3() throws Exception {
    AddBatchJobOperationsResponse expectedResponse =
        AddBatchJobOperationsResponse.newBuilder()
            .setTotalOperations(1685086151)
            .setNextSequenceToken("nextSequenceToken586107525")
            .build();
    mockBatchJobService.addResponse(expectedResponse);

    BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
    String sequenceToken = "sequenceToken-731053384";
    List<MutateOperation> mutateOperations = new ArrayList<>();

    AddBatchJobOperationsResponse actualResponse =
        client.addBatchJobOperations(resourceName, sequenceToken, mutateOperations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddBatchJobOperationsRequest actualRequest =
        ((AddBatchJobOperationsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertEquals(sequenceToken, actualRequest.getSequenceToken());
    Assert.assertEquals(mutateOperations, actualRequest.getMutateOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void addBatchJobOperationsExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchJobService.addException(exception);

    try {
      BatchJobName resourceName = BatchJobName.of("[CUSTOMER_ID]", "[BATCH_JOB_ID]");
      String sequenceToken = "sequenceToken-731053384";
      List<MutateOperation> mutateOperations = new ArrayList<>();
      client.addBatchJobOperations(resourceName, sequenceToken, mutateOperations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void addBatchJobOperationsTest4() throws Exception {
    AddBatchJobOperationsResponse expectedResponse =
        AddBatchJobOperationsResponse.newBuilder()
            .setTotalOperations(1685086151)
            .setNextSequenceToken("nextSequenceToken586107525")
            .build();
    mockBatchJobService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";
    String sequenceToken = "sequenceToken-731053384";
    List<MutateOperation> mutateOperations = new ArrayList<>();

    AddBatchJobOperationsResponse actualResponse =
        client.addBatchJobOperations(resourceName, sequenceToken, mutateOperations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddBatchJobOperationsRequest actualRequest =
        ((AddBatchJobOperationsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertEquals(sequenceToken, actualRequest.getSequenceToken());
    Assert.assertEquals(mutateOperations, actualRequest.getMutateOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void addBatchJobOperationsExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchJobService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      String sequenceToken = "sequenceToken-731053384";
      List<MutateOperation> mutateOperations = new ArrayList<>();
      client.addBatchJobOperations(resourceName, sequenceToken, mutateOperations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
