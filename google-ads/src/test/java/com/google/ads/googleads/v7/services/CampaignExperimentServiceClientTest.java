/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v7.services;

import static com.google.ads.googleads.v7.services.CampaignExperimentServiceClient.ListCampaignExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v7.resources.CampaignDraftName;
import com.google.ads.googleads.v7.resources.CampaignExperiment;
import com.google.ads.googleads.v7.resources.CampaignExperimentName;
import com.google.ads.googleads.v7.resources.CampaignName;
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
public class CampaignExperimentServiceClientTest {
  private static MockCampaignExperimentService mockCampaignExperimentService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CampaignExperimentServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignExperimentService = new MockCampaignExperimentService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCampaignExperimentService));
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
    CampaignExperimentServiceSettings settings =
        CampaignExperimentServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignExperimentServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignExperimentTest() throws Exception {
    CampaignExperiment expectedResponse =
        CampaignExperiment.newBuilder()
            .setResourceName(
                CampaignExperimentName.of("[CUSTOMER_ID]", "[CAMPAIGN_EXPERIMENT_ID]").toString())
            .setId(3355)
            .setCampaignDraft(
                CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]")
                    .toString())
            .setName(
                CampaignExperimentName.of("[CUSTOMER_ID]", "[CAMPAIGN_EXPERIMENT_ID]").toString())
            .setDescription("description-1724546052")
            .setTrafficSplitPercent(1828954462)
            .setExperimentCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setLongRunningOperation("longRunningOperation-234653436")
            .setStartDate("startDate-2129778896")
            .setEndDate("endDate-1607727319")
            .build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    CampaignExperimentName resourceName =
        CampaignExperimentName.of("[CUSTOMER_ID]", "[CAMPAIGN_EXPERIMENT_ID]");

    CampaignExperiment actualResponse = client.getCampaignExperiment(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignExperimentRequest actualRequest =
        ((GetCampaignExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      CampaignExperimentName resourceName =
          CampaignExperimentName.of("[CUSTOMER_ID]", "[CAMPAIGN_EXPERIMENT_ID]");
      client.getCampaignExperiment(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignExperimentTest2() throws Exception {
    CampaignExperiment expectedResponse =
        CampaignExperiment.newBuilder()
            .setResourceName(
                CampaignExperimentName.of("[CUSTOMER_ID]", "[CAMPAIGN_EXPERIMENT_ID]").toString())
            .setId(3355)
            .setCampaignDraft(
                CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]")
                    .toString())
            .setName(
                CampaignExperimentName.of("[CUSTOMER_ID]", "[CAMPAIGN_EXPERIMENT_ID]").toString())
            .setDescription("description-1724546052")
            .setTrafficSplitPercent(1828954462)
            .setExperimentCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setLongRunningOperation("longRunningOperation-234653436")
            .setStartDate("startDate-2129778896")
            .setEndDate("endDate-1607727319")
            .build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CampaignExperiment actualResponse = client.getCampaignExperiment(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignExperimentRequest actualRequest =
        ((GetCampaignExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaignExperiment(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createCampaignExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createCampaignExperimentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockCampaignExperimentService.addResponse(resultOperation);

    String customerId = "customerId-1581184615";
    CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();

    client.createCampaignExperimentAsync(customerId, campaignExperiment).get();

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateCampaignExperimentRequest actualRequest =
        ((CreateCampaignExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(campaignExperiment, actualRequest.getCampaignExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();
      client.createCampaignExperimentAsync(customerId, campaignExperiment).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void mutateCampaignExperimentsTest() throws Exception {
    MutateCampaignExperimentsResponse expectedResponse =
        MutateCampaignExperimentsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignExperimentResult>())
            .build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignExperimentOperation> operations = new ArrayList<>();

    MutateCampaignExperimentsResponse actualResponse =
        client.mutateCampaignExperiments(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignExperimentsRequest actualRequest =
        ((MutateCampaignExperimentsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignExperimentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignExperimentOperation> operations = new ArrayList<>();
      client.mutateCampaignExperiments(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void graduateCampaignExperimentTest() throws Exception {
    GraduateCampaignExperimentResponse expectedResponse =
        GraduateCampaignExperimentResponse.newBuilder()
            .setGraduatedCampaign("graduatedCampaign-652334935")
            .build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String campaignExperiment = "campaignExperiment-584932051";
    String campaignBudget = "campaignBudget-2134405003";

    GraduateCampaignExperimentResponse actualResponse =
        client.graduateCampaignExperiment(campaignExperiment, campaignBudget);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GraduateCampaignExperimentRequest actualRequest =
        ((GraduateCampaignExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(campaignExperiment, actualRequest.getCampaignExperiment());
    Assert.assertEquals(campaignBudget, actualRequest.getCampaignBudget());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void graduateCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String campaignExperiment = "campaignExperiment-584932051";
      String campaignBudget = "campaignBudget-2134405003";
      client.graduateCampaignExperiment(campaignExperiment, campaignBudget);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void promoteCampaignExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("promoteCampaignExperimentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockCampaignExperimentService.addResponse(resultOperation);

    String campaignExperiment = "campaignExperiment-584932051";

    client.promoteCampaignExperimentAsync(campaignExperiment).get();

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PromoteCampaignExperimentRequest actualRequest =
        ((PromoteCampaignExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(campaignExperiment, actualRequest.getCampaignExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void promoteCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String campaignExperiment = "campaignExperiment-584932051";
      client.promoteCampaignExperimentAsync(campaignExperiment).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void endCampaignExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String campaignExperiment = "campaignExperiment-584932051";

    client.endCampaignExperiment(campaignExperiment);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    EndCampaignExperimentRequest actualRequest =
        ((EndCampaignExperimentRequest) actualRequests.get(0));

    Assert.assertEquals(campaignExperiment, actualRequest.getCampaignExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void endCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String campaignExperiment = "campaignExperiment-584932051";
      client.endCampaignExperiment(campaignExperiment);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listCampaignExperimentAsyncErrorsTest() throws Exception {
    Status responsesElement = Status.newBuilder().build();
    ListCampaignExperimentAsyncErrorsResponse expectedResponse =
        ListCampaignExperimentAsyncErrorsResponse.newBuilder()
            .setNextPageToken("")
            .addAllErrors(Arrays.asList(responsesElement))
            .build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    CampaignExperimentName resourceName =
        CampaignExperimentName.of("[CUSTOMER_ID]", "[CAMPAIGN_EXPERIMENT_ID]");

    ListCampaignExperimentAsyncErrorsPagedResponse pagedListResponse =
        client.listCampaignExperimentAsyncErrors(resourceName);

    List<Status> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getErrorsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCampaignExperimentAsyncErrorsRequest actualRequest =
        ((ListCampaignExperimentAsyncErrorsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listCampaignExperimentAsyncErrorsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      CampaignExperimentName resourceName =
          CampaignExperimentName.of("[CUSTOMER_ID]", "[CAMPAIGN_EXPERIMENT_ID]");
      client.listCampaignExperimentAsyncErrors(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listCampaignExperimentAsyncErrorsTest2() throws Exception {
    Status responsesElement = Status.newBuilder().build();
    ListCampaignExperimentAsyncErrorsResponse expectedResponse =
        ListCampaignExperimentAsyncErrorsResponse.newBuilder()
            .setNextPageToken("")
            .addAllErrors(Arrays.asList(responsesElement))
            .build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ListCampaignExperimentAsyncErrorsPagedResponse pagedListResponse =
        client.listCampaignExperimentAsyncErrors(resourceName);

    List<Status> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getErrorsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCampaignExperimentAsyncErrorsRequest actualRequest =
        ((ListCampaignExperimentAsyncErrorsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listCampaignExperimentAsyncErrorsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.listCampaignExperimentAsyncErrors(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
