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

import com.google.ads.googleads.v6.resources.CampaignBudget;
import com.google.ads.googleads.v6.resources.CampaignBudgetName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.rpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class CampaignBudgetServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockCampaignBudgetService mockCampaignBudgetService;
  private CampaignBudgetServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignBudgetService = new MockCampaignBudgetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCampaignBudgetService));
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
    CampaignBudgetServiceSettings settings =
        CampaignBudgetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignBudgetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignBudgetTest() throws Exception {
    CampaignBudget expectedResponse =
        CampaignBudget.newBuilder()
            .setResourceName(
                CampaignBudgetName.of("[CUSTOMER_ID]", "[CAMPAIGN_BUDGET_ID]").toString())
            .build();
    mockCampaignBudgetService.addResponse(expectedResponse);

    CampaignBudgetName resourceName =
        CampaignBudgetName.of("[CUSTOMER_ID]", "[CAMPAIGN_BUDGET_ID]");

    CampaignBudget actualResponse = client.getCampaignBudget(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignBudgetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignBudgetRequest actualRequest = ((GetCampaignBudgetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignBudgetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignBudgetService.addException(exception);

    try {
      CampaignBudgetName resourceName =
          CampaignBudgetName.of("[CUSTOMER_ID]", "[CAMPAIGN_BUDGET_ID]");
      client.getCampaignBudget(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignBudgetTest2() throws Exception {
    CampaignBudget expectedResponse =
        CampaignBudget.newBuilder()
            .setResourceName(
                CampaignBudgetName.of("[CUSTOMER_ID]", "[CAMPAIGN_BUDGET_ID]").toString())
            .build();
    mockCampaignBudgetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CampaignBudget actualResponse = client.getCampaignBudget(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignBudgetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignBudgetRequest actualRequest = ((GetCampaignBudgetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignBudgetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignBudgetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaignBudget(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCampaignBudgetsTest() throws Exception {
    MutateCampaignBudgetsResponse expectedResponse =
        MutateCampaignBudgetsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignBudgetResult>())
            .build();
    mockCampaignBudgetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignBudgetOperation> operations = new ArrayList<>();

    MutateCampaignBudgetsResponse actualResponse =
        client.mutateCampaignBudgets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignBudgetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignBudgetsRequest actualRequest =
        ((MutateCampaignBudgetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignBudgetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignBudgetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignBudgetOperation> operations = new ArrayList<>();
      client.mutateCampaignBudgets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
