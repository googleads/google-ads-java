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

package com.google.ads.googleads.v13.services;

import static com.google.ads.googleads.v13.services.CampaignDraftServiceClient.ListCampaignDraftAsyncErrorsPagedResponse;

import com.google.ads.googleads.v13.resources.CampaignDraftName;
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
public class CampaignDraftServiceClientTest {
  private static MockCampaignDraftService mockCampaignDraftService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CampaignDraftServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignDraftService = new MockCampaignDraftService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockCampaignDraftService));
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
    CampaignDraftServiceSettings settings =
        CampaignDraftServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignDraftServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void mutateCampaignDraftsTest() throws Exception {
    MutateCampaignDraftsResponse expectedResponse =
        MutateCampaignDraftsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignDraftResult>())
            .build();
    mockCampaignDraftService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignDraftOperation> operations = new ArrayList<>();

    MutateCampaignDraftsResponse actualResponse =
        client.mutateCampaignDrafts(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignDraftService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignDraftsRequest actualRequest =
        ((MutateCampaignDraftsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignDraftsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignDraftService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignDraftOperation> operations = new ArrayList<>();
      client.mutateCampaignDrafts(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void promoteCampaignDraftTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("promoteCampaignDraftTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockCampaignDraftService.addResponse(resultOperation);

    CampaignDraftName campaignDraft =
        CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]");

    client.promoteCampaignDraftAsync(campaignDraft).get();

    List<AbstractMessage> actualRequests = mockCampaignDraftService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PromoteCampaignDraftRequest actualRequest =
        ((PromoteCampaignDraftRequest) actualRequests.get(0));

    Assert.assertEquals(campaignDraft.toString(), actualRequest.getCampaignDraft());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void promoteCampaignDraftExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignDraftService.addException(exception);

    try {
      CampaignDraftName campaignDraft =
          CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]");
      client.promoteCampaignDraftAsync(campaignDraft).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void promoteCampaignDraftTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("promoteCampaignDraftTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockCampaignDraftService.addResponse(resultOperation);

    String campaignDraft = "campaignDraft1041281649";

    client.promoteCampaignDraftAsync(campaignDraft).get();

    List<AbstractMessage> actualRequests = mockCampaignDraftService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PromoteCampaignDraftRequest actualRequest =
        ((PromoteCampaignDraftRequest) actualRequests.get(0));

    Assert.assertEquals(campaignDraft, actualRequest.getCampaignDraft());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void promoteCampaignDraftExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignDraftService.addException(exception);

    try {
      String campaignDraft = "campaignDraft1041281649";
      client.promoteCampaignDraftAsync(campaignDraft).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void listCampaignDraftAsyncErrorsTest() throws Exception {
    Status responsesElement = Status.newBuilder().build();
    ListCampaignDraftAsyncErrorsResponse expectedResponse =
        ListCampaignDraftAsyncErrorsResponse.newBuilder()
            .setNextPageToken("")
            .addAllErrors(Arrays.asList(responsesElement))
            .build();
    mockCampaignDraftService.addResponse(expectedResponse);

    CampaignDraftName resourceName =
        CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]");

    ListCampaignDraftAsyncErrorsPagedResponse pagedListResponse =
        client.listCampaignDraftAsyncErrors(resourceName);

    List<Status> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getErrorsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockCampaignDraftService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCampaignDraftAsyncErrorsRequest actualRequest =
        ((ListCampaignDraftAsyncErrorsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listCampaignDraftAsyncErrorsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignDraftService.addException(exception);

    try {
      CampaignDraftName resourceName =
          CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]");
      client.listCampaignDraftAsyncErrors(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listCampaignDraftAsyncErrorsTest2() throws Exception {
    Status responsesElement = Status.newBuilder().build();
    ListCampaignDraftAsyncErrorsResponse expectedResponse =
        ListCampaignDraftAsyncErrorsResponse.newBuilder()
            .setNextPageToken("")
            .addAllErrors(Arrays.asList(responsesElement))
            .build();
    mockCampaignDraftService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ListCampaignDraftAsyncErrorsPagedResponse pagedListResponse =
        client.listCampaignDraftAsyncErrors(resourceName);

    List<Status> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getErrorsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockCampaignDraftService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCampaignDraftAsyncErrorsRequest actualRequest =
        ((ListCampaignDraftAsyncErrorsRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listCampaignDraftAsyncErrorsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignDraftService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.listCampaignDraftAsyncErrors(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
