/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v14.services;

import static com.google.ads.googleads.v14.services.ExperimentServiceClient.ListExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v14.resources.ExperimentName;
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
public class ExperimentServiceClientTest {
  private static MockExperimentService mockExperimentService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ExperimentServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockExperimentService = new MockExperimentService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockExperimentService));
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
    ExperimentServiceSettings settings =
        ExperimentServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ExperimentServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void mutateExperimentsTest() throws Exception {
    MutateExperimentsResponse expectedResponse =
        MutateExperimentsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateExperimentResult>())
            .build();
    mockExperimentService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<ExperimentOperation> operations = new ArrayList<>();

    MutateExperimentsResponse actualResponse = client.mutateExperiments(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateExperimentsRequest actualRequest = ((MutateExperimentsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateExperimentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<ExperimentOperation> operations = new ArrayList<>();
      client.mutateExperiments(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void endExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockExperimentService.addResponse(expectedResponse);

    ExperimentName experiment = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");

    client.endExperiment(experiment);

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    EndExperimentRequest actualRequest = ((EndExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(experiment.toString(), actualRequest.getExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void endExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      ExperimentName experiment = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
      client.endExperiment(experiment);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void endExperimentTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockExperimentService.addResponse(expectedResponse);

    String experiment = "experiment-85337091";

    client.endExperiment(experiment);

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    EndExperimentRequest actualRequest = ((EndExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(experiment, actualRequest.getExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void endExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      String experiment = "experiment-85337091";
      client.endExperiment(experiment);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listExperimentAsyncErrorsTest() throws Exception {
    Status responsesElement = Status.newBuilder().build();
    ListExperimentAsyncErrorsResponse expectedResponse =
        ListExperimentAsyncErrorsResponse.newBuilder()
            .setNextPageToken("")
            .addAllErrors(Arrays.asList(responsesElement))
            .build();
    mockExperimentService.addResponse(expectedResponse);

    ExperimentName resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");

    ListExperimentAsyncErrorsPagedResponse pagedListResponse =
        client.listExperimentAsyncErrors(resourceName);

    List<Status> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getErrorsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListExperimentAsyncErrorsRequest actualRequest =
        ((ListExperimentAsyncErrorsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listExperimentAsyncErrorsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      ExperimentName resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
      client.listExperimentAsyncErrors(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listExperimentAsyncErrorsTest2() throws Exception {
    Status responsesElement = Status.newBuilder().build();
    ListExperimentAsyncErrorsResponse expectedResponse =
        ListExperimentAsyncErrorsResponse.newBuilder()
            .setNextPageToken("")
            .addAllErrors(Arrays.asList(responsesElement))
            .build();
    mockExperimentService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ListExperimentAsyncErrorsPagedResponse pagedListResponse =
        client.listExperimentAsyncErrors(resourceName);

    List<Status> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getErrorsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListExperimentAsyncErrorsRequest actualRequest =
        ((ListExperimentAsyncErrorsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listExperimentAsyncErrorsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.listExperimentAsyncErrors(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void graduateExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockExperimentService.addResponse(expectedResponse);

    ExperimentName experiment = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
    List<CampaignBudgetMapping> campaignBudgetMappings = new ArrayList<>();

    client.graduateExperiment(experiment, campaignBudgetMappings);

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GraduateExperimentRequest actualRequest = ((GraduateExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(experiment.toString(), actualRequest.getExperiment());
    Assert.assertEquals(campaignBudgetMappings, actualRequest.getCampaignBudgetMappingsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void graduateExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      ExperimentName experiment = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
      List<CampaignBudgetMapping> campaignBudgetMappings = new ArrayList<>();
      client.graduateExperiment(experiment, campaignBudgetMappings);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void graduateExperimentTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockExperimentService.addResponse(expectedResponse);

    String experiment = "experiment-85337091";
    List<CampaignBudgetMapping> campaignBudgetMappings = new ArrayList<>();

    client.graduateExperiment(experiment, campaignBudgetMappings);

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GraduateExperimentRequest actualRequest = ((GraduateExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(experiment, actualRequest.getExperiment());
    Assert.assertEquals(campaignBudgetMappings, actualRequest.getCampaignBudgetMappingsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void graduateExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      String experiment = "experiment-85337091";
      List<CampaignBudgetMapping> campaignBudgetMappings = new ArrayList<>();
      client.graduateExperiment(experiment, campaignBudgetMappings);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void scheduleExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("scheduleExperimentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockExperimentService.addResponse(resultOperation);

    ExperimentName resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");

    client.scheduleExperimentAsync(resourceName).get();

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ScheduleExperimentRequest actualRequest = ((ScheduleExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void scheduleExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      ExperimentName resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
      client.scheduleExperimentAsync(resourceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void scheduleExperimentTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("scheduleExperimentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockExperimentService.addResponse(resultOperation);

    String resourceName = "resourceName-384566343";

    client.scheduleExperimentAsync(resourceName).get();

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ScheduleExperimentRequest actualRequest = ((ScheduleExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void scheduleExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.scheduleExperimentAsync(resourceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void promoteExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("promoteExperimentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockExperimentService.addResponse(resultOperation);

    ExperimentName resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");

    client.promoteExperimentAsync(resourceName).get();

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PromoteExperimentRequest actualRequest = ((PromoteExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void promoteExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      ExperimentName resourceName = ExperimentName.of("[CUSTOMER_ID]", "[TRIAL_ID]");
      client.promoteExperimentAsync(resourceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void promoteExperimentTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("promoteExperimentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockExperimentService.addResponse(resultOperation);

    String resourceName = "resourceName-384566343";

    client.promoteExperimentAsync(resourceName).get();

    List<AbstractMessage> actualRequests = mockExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PromoteExperimentRequest actualRequest = ((PromoteExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void promoteExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExperimentService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.promoteExperimentAsync(resourceName).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
