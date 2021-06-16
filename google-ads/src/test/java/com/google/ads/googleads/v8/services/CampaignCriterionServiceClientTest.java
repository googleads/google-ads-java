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

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.resources.CampaignCriterion;
import com.google.ads.googleads.v8.resources.CampaignCriterionName;
import com.google.ads.googleads.v8.resources.CampaignName;
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
public class CampaignCriterionServiceClientTest {
  private static MockCampaignCriterionService mockCampaignCriterionService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CampaignCriterionServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignCriterionService = new MockCampaignCriterionService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCampaignCriterionService));
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
    CampaignCriterionServiceSettings settings =
        CampaignCriterionServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignCriterionServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignCriterionTest() throws Exception {
    CampaignCriterion expectedResponse =
        CampaignCriterion.newBuilder()
            .setResourceName(
                CampaignCriterionName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]")
                    .toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setCriterionId(-326773895)
            .setDisplayName("displayName1714148973")
            .setBidModifier(1362363353)
            .setNegative(true)
            .build();
    mockCampaignCriterionService.addResponse(expectedResponse);

    CampaignCriterionName resourceName =
        CampaignCriterionName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");

    CampaignCriterion actualResponse = client.getCampaignCriterion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignCriterionRequest actualRequest =
        ((GetCampaignCriterionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignCriterionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignCriterionService.addException(exception);

    try {
      CampaignCriterionName resourceName =
          CampaignCriterionName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");
      client.getCampaignCriterion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignCriterionTest2() throws Exception {
    CampaignCriterion expectedResponse =
        CampaignCriterion.newBuilder()
            .setResourceName(
                CampaignCriterionName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]")
                    .toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setCriterionId(-326773895)
            .setDisplayName("displayName1714148973")
            .setBidModifier(1362363353)
            .setNegative(true)
            .build();
    mockCampaignCriterionService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CampaignCriterion actualResponse = client.getCampaignCriterion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignCriterionRequest actualRequest =
        ((GetCampaignCriterionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignCriterionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignCriterionService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaignCriterion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCampaignCriteriaTest() throws Exception {
    MutateCampaignCriteriaResponse expectedResponse =
        MutateCampaignCriteriaResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignCriterionResult>())
            .build();
    mockCampaignCriterionService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignCriterionOperation> operations = new ArrayList<>();

    MutateCampaignCriteriaResponse actualResponse =
        client.mutateCampaignCriteria(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignCriteriaRequest actualRequest =
        ((MutateCampaignCriteriaRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignCriteriaExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignCriterionService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignCriterionOperation> operations = new ArrayList<>();
      client.mutateCampaignCriteria(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
