/*
 * Copyright 2018 Google LLC
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
package com.google.ads.googleads.v0.services;

import com.google.ads.googleads.v0.resources.CampaignCriterion;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class CampaignCriterionServiceClientTest {
  private static MockAdGroupAdService mockAdGroupAdService;
  private static MockAdGroupCriterionService mockAdGroupCriterionService;
  private static MockAdGroupService mockAdGroupService;
  private static MockBiddingStrategyService mockBiddingStrategyService;
  private static MockCampaignBudgetService mockCampaignBudgetService;
  private static MockCampaignCriterionService mockCampaignCriterionService;
  private static MockCampaignService mockCampaignService;
  private static MockCustomerService mockCustomerService;
  private static MockGoogleAdsFieldService mockGoogleAdsFieldService;
  private static MockGoogleAdsService mockGoogleAdsService;
  private static MockKeywordViewService mockKeywordViewService;
  private static MockServiceHelper serviceHelper;
  private CampaignCriterionServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupAdService = new MockAdGroupAdService();
    mockAdGroupCriterionService = new MockAdGroupCriterionService();
    mockAdGroupService = new MockAdGroupService();
    mockBiddingStrategyService = new MockBiddingStrategyService();
    mockCampaignBudgetService = new MockCampaignBudgetService();
    mockCampaignCriterionService = new MockCampaignCriterionService();
    mockCampaignService = new MockCampaignService();
    mockCustomerService = new MockCustomerService();
    mockGoogleAdsFieldService = new MockGoogleAdsFieldService();
    mockGoogleAdsService = new MockGoogleAdsService();
    mockKeywordViewService = new MockKeywordViewService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1",
            Arrays.<MockGrpcService>asList(
                mockAdGroupAdService,
                mockAdGroupCriterionService,
                mockAdGroupService,
                mockBiddingStrategyService,
                mockCampaignBudgetService,
                mockCampaignCriterionService,
                mockCampaignService,
                mockCustomerService,
                mockGoogleAdsFieldService,
                mockGoogleAdsService,
                mockKeywordViewService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
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
  @SuppressWarnings("all")
  public void getCampaignCriterionTest() {
    String resourceName2 = "resourceName2625949903";
    CampaignCriterion expectedResponse =
        CampaignCriterion.newBuilder().setResourceName(resourceName2).build();
    mockCampaignCriterionService.addResponse(expectedResponse);

    String formattedResourceName =
        CampaignCriterionServiceClient.formatCampaignCriteriaName(
            "[CUSTOMER]", "[CAMPAIGN_CRITERIA]");

    CampaignCriterion actualResponse = client.getCampaignCriterion(formattedResourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockCampaignCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignCriterionRequest actualRequest = (GetCampaignCriterionRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getCampaignCriterionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignCriterionService.addException(exception);

    try {
      String formattedResourceName =
          CampaignCriterionServiceClient.formatCampaignCriteriaName(
              "[CUSTOMER]", "[CAMPAIGN_CRITERIA]");

      client.getCampaignCriterion(formattedResourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignCriteriaTest() {
    MutateCampaignCriteriaResponse expectedResponse =
        MutateCampaignCriteriaResponse.newBuilder().build();
    mockCampaignCriterionService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<CampaignCriterionOperation> operations = new ArrayList<>();

    MutateCampaignCriteriaResponse actualResponse =
        client.mutateCampaignCriteria(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockCampaignCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignCriteriaRequest actualRequest =
        (MutateCampaignCriteriaRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignCriteriaExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignCriterionService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<CampaignCriterionOperation> operations = new ArrayList<>();

      client.mutateCampaignCriteria(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
