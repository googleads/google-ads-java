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

import com.google.ads.googleads.v0.resources.CampaignSharedSet;
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
public class CampaignSharedSetServiceClientTest {
  private static MockAccountBudgetProposalService mockAccountBudgetProposalService;
  private static MockAdGroupAdService mockAdGroupAdService;
  private static MockAdGroupBidModifierService mockAdGroupBidModifierService;
  private static MockAdGroupCriterionService mockAdGroupCriterionService;
  private static MockAdGroupService mockAdGroupService;
  private static MockBiddingStrategyService mockBiddingStrategyService;
  private static MockBillingSetupService mockBillingSetupService;
  private static MockCampaignBidModifierService mockCampaignBidModifierService;
  private static MockCampaignBudgetService mockCampaignBudgetService;
  private static MockCampaignCriterionService mockCampaignCriterionService;
  private static MockCampaignGroupService mockCampaignGroupService;
  private static MockCampaignService mockCampaignService;
  private static MockCampaignSharedSetService mockCampaignSharedSetService;
  private static MockChangeStatusService mockChangeStatusService;
  private static MockConversionActionService mockConversionActionService;
  private static MockCustomerService mockCustomerService;
  private static MockGeoTargetConstantService mockGeoTargetConstantService;
  private static MockGoogleAdsFieldService mockGoogleAdsFieldService;
  private static MockGoogleAdsService mockGoogleAdsService;
  private static MockKeywordViewService mockKeywordViewService;
  private static MockRecommendationService mockRecommendationService;
  private static MockSharedCriterionService mockSharedCriterionService;
  private static MockSharedSetService mockSharedSetService;
  private static MockVideoService mockVideoService;
  private static MockServiceHelper serviceHelper;
  private CampaignSharedSetServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountBudgetProposalService = new MockAccountBudgetProposalService();
    mockAdGroupAdService = new MockAdGroupAdService();
    mockAdGroupBidModifierService = new MockAdGroupBidModifierService();
    mockAdGroupCriterionService = new MockAdGroupCriterionService();
    mockAdGroupService = new MockAdGroupService();
    mockBiddingStrategyService = new MockBiddingStrategyService();
    mockBillingSetupService = new MockBillingSetupService();
    mockCampaignBidModifierService = new MockCampaignBidModifierService();
    mockCampaignBudgetService = new MockCampaignBudgetService();
    mockCampaignCriterionService = new MockCampaignCriterionService();
    mockCampaignGroupService = new MockCampaignGroupService();
    mockCampaignService = new MockCampaignService();
    mockCampaignSharedSetService = new MockCampaignSharedSetService();
    mockChangeStatusService = new MockChangeStatusService();
    mockConversionActionService = new MockConversionActionService();
    mockCustomerService = new MockCustomerService();
    mockGeoTargetConstantService = new MockGeoTargetConstantService();
    mockGoogleAdsFieldService = new MockGoogleAdsFieldService();
    mockGoogleAdsService = new MockGoogleAdsService();
    mockKeywordViewService = new MockKeywordViewService();
    mockRecommendationService = new MockRecommendationService();
    mockSharedCriterionService = new MockSharedCriterionService();
    mockSharedSetService = new MockSharedSetService();
    mockVideoService = new MockVideoService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1",
            Arrays.<MockGrpcService>asList(
                mockAccountBudgetProposalService,
                mockAdGroupAdService,
                mockAdGroupBidModifierService,
                mockAdGroupCriterionService,
                mockAdGroupService,
                mockBiddingStrategyService,
                mockBillingSetupService,
                mockCampaignBidModifierService,
                mockCampaignBudgetService,
                mockCampaignCriterionService,
                mockCampaignGroupService,
                mockCampaignService,
                mockCampaignSharedSetService,
                mockChangeStatusService,
                mockConversionActionService,
                mockCustomerService,
                mockGeoTargetConstantService,
                mockGoogleAdsFieldService,
                mockGoogleAdsService,
                mockKeywordViewService,
                mockRecommendationService,
                mockSharedCriterionService,
                mockSharedSetService,
                mockVideoService));
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
    CampaignSharedSetServiceSettings settings =
        CampaignSharedSetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignSharedSetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getCampaignSharedSetTest() {
    String resourceName2 = "resourceName2625949903";
    CampaignSharedSet expectedResponse =
        CampaignSharedSet.newBuilder().setResourceName(resourceName2).build();
    mockCampaignSharedSetService.addResponse(expectedResponse);

    String formattedResourceName =
        CampaignSharedSetServiceClient.formatCampaignSharedSetName(
            "[CUSTOMER]", "[CAMPAIGN_SHARED_SET]");

    CampaignSharedSet actualResponse = client.getCampaignSharedSet(formattedResourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockCampaignSharedSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignSharedSetRequest actualRequest = (GetCampaignSharedSetRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getCampaignSharedSetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignSharedSetService.addException(exception);

    try {
      String formattedResourceName =
          CampaignSharedSetServiceClient.formatCampaignSharedSetName(
              "[CUSTOMER]", "[CAMPAIGN_SHARED_SET]");

      client.getCampaignSharedSet(formattedResourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignSharedSetsTest() {
    MutateCampaignSharedSetsResponse expectedResponse =
        MutateCampaignSharedSetsResponse.newBuilder().build();
    mockCampaignSharedSetService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<CampaignSharedSetOperation> operations = new ArrayList<>();

    MutateCampaignSharedSetsResponse actualResponse =
        client.mutateCampaignSharedSets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockCampaignSharedSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignSharedSetsRequest actualRequest =
        (MutateCampaignSharedSetsRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignSharedSetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignSharedSetService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<CampaignSharedSetOperation> operations = new ArrayList<>();

      client.mutateCampaignSharedSets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
