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

package com.google.ads.googleads.v15.services;

import com.google.ads.googleads.v15.resources.OfflineUserDataJob;
import com.google.ads.googleads.v15.resources.OfflineUserDataJobName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.rpc.Status;
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
public class OfflineUserDataJobServiceClientTest {
  private static MockOfflineUserDataJobService mockOfflineUserDataJobService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private OfflineUserDataJobServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockOfflineUserDataJobService = new MockOfflineUserDataJobService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockOfflineUserDataJobService));
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
    OfflineUserDataJobServiceSettings settings =
        OfflineUserDataJobServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = OfflineUserDataJobServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createOfflineUserDataJobTest() throws Exception {
    CreateOfflineUserDataJobResponse expectedResponse =
        CreateOfflineUserDataJobResponse.newBuilder()
            .setResourceName(
                OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]")
                    .toString())
            .build();
    mockOfflineUserDataJobService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();

    CreateOfflineUserDataJobResponse actualResponse =
        client.createOfflineUserDataJob(customerId, job);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockOfflineUserDataJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateOfflineUserDataJobRequest actualRequest =
        ((CreateOfflineUserDataJobRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(job, actualRequest.getJob());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createOfflineUserDataJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockOfflineUserDataJobService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();
      client.createOfflineUserDataJob(customerId, job);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void addOfflineUserDataJobOperationsTest() throws Exception {
    AddOfflineUserDataJobOperationsResponse expectedResponse =
        AddOfflineUserDataJobOperationsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .setWarning(Status.newBuilder().build())
            .build();
    mockOfflineUserDataJobService.addResponse(expectedResponse);

    OfflineUserDataJobName resourceName =
        OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]");
    List<OfflineUserDataJobOperation> operations = new ArrayList<>();

    AddOfflineUserDataJobOperationsResponse actualResponse =
        client.addOfflineUserDataJobOperations(resourceName, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockOfflineUserDataJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddOfflineUserDataJobOperationsRequest actualRequest =
        ((AddOfflineUserDataJobOperationsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void addOfflineUserDataJobOperationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockOfflineUserDataJobService.addException(exception);

    try {
      OfflineUserDataJobName resourceName =
          OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]");
      List<OfflineUserDataJobOperation> operations = new ArrayList<>();
      client.addOfflineUserDataJobOperations(resourceName, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void addOfflineUserDataJobOperationsTest2() throws Exception {
    AddOfflineUserDataJobOperationsResponse expectedResponse =
        AddOfflineUserDataJobOperationsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .setWarning(Status.newBuilder().build())
            .build();
    mockOfflineUserDataJobService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";
    List<OfflineUserDataJobOperation> operations = new ArrayList<>();

    AddOfflineUserDataJobOperationsResponse actualResponse =
        client.addOfflineUserDataJobOperations(resourceName, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockOfflineUserDataJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AddOfflineUserDataJobOperationsRequest actualRequest =
        ((AddOfflineUserDataJobOperationsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void addOfflineUserDataJobOperationsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockOfflineUserDataJobService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      List<OfflineUserDataJobOperation> operations = new ArrayList<>();
      client.addOfflineUserDataJobOperations(resourceName, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void runOfflineUserDataJobTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("runOfflineUserDataJobTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockOfflineUserDataJobService.addResponse(resultOperation);

    OfflineUserDataJobName resourceName =
        OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]");

    client.runOfflineUserDataJobAsync(resourceName).get();

    List<AbstractMessage> actualRequests = mockOfflineUserDataJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RunOfflineUserDataJobRequest actualRequest =
        ((RunOfflineUserDataJobRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void runOfflineUserDataJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockOfflineUserDataJobService.addException(exception);

    try {
      OfflineUserDataJobName resourceName =
          OfflineUserDataJobName.of("[CUSTOMER_ID]", "[OFFLINE_USER_DATA_UPDATE_ID]");
      client.runOfflineUserDataJobAsync(resourceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void runOfflineUserDataJobTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("runOfflineUserDataJobTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockOfflineUserDataJobService.addResponse(resultOperation);

    String resourceName = "resourceName-384566343";

    client.runOfflineUserDataJobAsync(resourceName).get();

    List<AbstractMessage> actualRequests = mockOfflineUserDataJobService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RunOfflineUserDataJobRequest actualRequest =
        ((RunOfflineUserDataJobRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void runOfflineUserDataJobExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockOfflineUserDataJobService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.runOfflineUserDataJobAsync(resourceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
