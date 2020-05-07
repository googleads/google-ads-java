/*
 * Copyright 2019 Google LLC
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
package com.google.ads.googleads.v3.services;

import static com.google.ads.googleads.v3.services.CampaignExperimentServiceClient.ListCampaignExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v3.resources.CampaignExperiment;
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
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class CampaignExperimentServiceClientTest {
  private static MockAccountBudgetProposalService mockAccountBudgetProposalService;
  private static MockAccountBudgetService mockAccountBudgetService;
  private static MockAdGroupAdAssetViewService mockAdGroupAdAssetViewService;
  private static MockAdGroupAdLabelService mockAdGroupAdLabelService;
  private static MockAdGroupAdService mockAdGroupAdService;
  private static MockAdGroupAudienceViewService mockAdGroupAudienceViewService;
  private static MockAdGroupBidModifierService mockAdGroupBidModifierService;
  private static MockAdGroupCriterionLabelService mockAdGroupCriterionLabelService;
  private static MockAdGroupCriterionService mockAdGroupCriterionService;
  private static MockAdGroupCriterionSimulationService mockAdGroupCriterionSimulationService;
  private static MockAdGroupExtensionSettingService mockAdGroupExtensionSettingService;
  private static MockAdGroupFeedService mockAdGroupFeedService;
  private static MockAdGroupLabelService mockAdGroupLabelService;
  private static MockAdGroupService mockAdGroupService;
  private static MockAdGroupSimulationService mockAdGroupSimulationService;
  private static MockAdParameterService mockAdParameterService;
  private static MockAdScheduleViewService mockAdScheduleViewService;
  private static MockAdService mockAdService;
  private static MockAgeRangeViewService mockAgeRangeViewService;
  private static MockAssetService mockAssetService;
  private static MockBiddingStrategyService mockBiddingStrategyService;
  private static MockBillingSetupService mockBillingSetupService;
  private static MockCampaignAudienceViewService mockCampaignAudienceViewService;
  private static MockCampaignBidModifierService mockCampaignBidModifierService;
  private static MockCampaignBudgetService mockCampaignBudgetService;
  private static MockCampaignCriterionService mockCampaignCriterionService;
  private static MockCampaignCriterionSimulationService mockCampaignCriterionSimulationService;
  private static MockCampaignDraftService mockCampaignDraftService;
  private static MockCampaignExperimentService mockCampaignExperimentService;
  private static MockCampaignExtensionSettingService mockCampaignExtensionSettingService;
  private static MockCampaignFeedService mockCampaignFeedService;
  private static MockCampaignLabelService mockCampaignLabelService;
  private static MockCampaignService mockCampaignService;
  private static MockCampaignSharedSetService mockCampaignSharedSetService;
  private static MockCarrierConstantService mockCarrierConstantService;
  private static MockChangeStatusService mockChangeStatusService;
  private static MockClickViewService mockClickViewService;
  private static MockConversionActionService mockConversionActionService;
  private static MockConversionAdjustmentUploadService mockConversionAdjustmentUploadService;
  private static MockConversionUploadService mockConversionUploadService;
  private static MockCurrencyConstantService mockCurrencyConstantService;
  private static MockCustomInterestService mockCustomInterestService;
  private static MockCustomerClientLinkService mockCustomerClientLinkService;
  private static MockCustomerClientService mockCustomerClientService;
  private static MockCustomerExtensionSettingService mockCustomerExtensionSettingService;
  private static MockCustomerFeedService mockCustomerFeedService;
  private static MockCustomerLabelService mockCustomerLabelService;
  private static MockCustomerManagerLinkService mockCustomerManagerLinkService;
  private static MockCustomerNegativeCriterionService mockCustomerNegativeCriterionService;
  private static MockCustomerService mockCustomerService;
  private static MockDetailPlacementViewService mockDetailPlacementViewService;
  private static MockDisplayKeywordViewService mockDisplayKeywordViewService;
  private static MockDistanceViewService mockDistanceViewService;
  private static MockDomainCategoryService mockDomainCategoryService;
  private static MockDynamicSearchAdsSearchTermViewService
      mockDynamicSearchAdsSearchTermViewService;
  private static MockExpandedLandingPageViewService mockExpandedLandingPageViewService;
  private static MockExtensionFeedItemService mockExtensionFeedItemService;
  private static MockFeedItemService mockFeedItemService;
  private static MockFeedItemTargetService mockFeedItemTargetService;
  private static MockFeedMappingService mockFeedMappingService;
  private static MockFeedPlaceholderViewService mockFeedPlaceholderViewService;
  private static MockFeedService mockFeedService;
  private static MockGenderViewService mockGenderViewService;
  private static MockGeoTargetConstantService mockGeoTargetConstantService;
  private static MockGeographicViewService mockGeographicViewService;
  private static MockGoogleAdsFieldService mockGoogleAdsFieldService;
  private static MockGoogleAdsService mockGoogleAdsService;
  private static MockGroupPlacementViewService mockGroupPlacementViewService;
  private static MockHotelGroupViewService mockHotelGroupViewService;
  private static MockHotelPerformanceViewService mockHotelPerformanceViewService;
  private static MockInvoiceService mockInvoiceService;
  private static MockKeywordPlanAdGroupService mockKeywordPlanAdGroupService;
  private static MockKeywordPlanCampaignService mockKeywordPlanCampaignService;
  private static MockKeywordPlanIdeaService mockKeywordPlanIdeaService;
  private static MockKeywordPlanKeywordService mockKeywordPlanKeywordService;
  private static MockKeywordPlanNegativeKeywordService mockKeywordPlanNegativeKeywordService;
  private static MockKeywordPlanService mockKeywordPlanService;
  private static MockKeywordViewService mockKeywordViewService;
  private static MockLabelService mockLabelService;
  private static MockLandingPageViewService mockLandingPageViewService;
  private static MockLanguageConstantService mockLanguageConstantService;
  private static MockLocationViewService mockLocationViewService;
  private static MockManagedPlacementViewService mockManagedPlacementViewService;
  private static MockMediaFileService mockMediaFileService;
  private static MockMerchantCenterLinkService mockMerchantCenterLinkService;
  private static MockMobileAppCategoryConstantService mockMobileAppCategoryConstantService;
  private static MockMobileDeviceConstantService mockMobileDeviceConstantService;
  private static MockMutateJobService mockMutateJobService;
  private static MockOfflineUserDataJobService mockOfflineUserDataJobService;
  private static MockOperatingSystemVersionConstantService
      mockOperatingSystemVersionConstantService;
  private static MockPaidOrganicSearchTermViewService mockPaidOrganicSearchTermViewService;
  private static MockParentalStatusViewService mockParentalStatusViewService;
  private static MockPaymentsAccountService mockPaymentsAccountService;
  private static MockProductBiddingCategoryConstantService
      mockProductBiddingCategoryConstantService;
  private static MockProductGroupViewService mockProductGroupViewService;
  private static MockReachPlanService mockReachPlanService;
  private static MockRecommendationService mockRecommendationService;
  private static MockRemarketingActionService mockRemarketingActionService;
  private static MockSearchTermViewService mockSearchTermViewService;
  private static MockSharedCriterionService mockSharedCriterionService;
  private static MockSharedSetService mockSharedSetService;
  private static MockShoppingPerformanceViewService mockShoppingPerformanceViewService;
  private static MockTopicConstantService mockTopicConstantService;
  private static MockTopicViewService mockTopicViewService;
  private static MockUserDataService mockUserDataService;
  private static MockUserInterestService mockUserInterestService;
  private static MockUserListService mockUserListService;
  private static MockUserLocationViewService mockUserLocationViewService;
  private static MockVideoService mockVideoService;
  private static MockServiceHelper serviceHelper;
  private CampaignExperimentServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountBudgetProposalService = new MockAccountBudgetProposalService();
    mockAccountBudgetService = new MockAccountBudgetService();
    mockAdGroupAdAssetViewService = new MockAdGroupAdAssetViewService();
    mockAdGroupAdLabelService = new MockAdGroupAdLabelService();
    mockAdGroupAdService = new MockAdGroupAdService();
    mockAdGroupAudienceViewService = new MockAdGroupAudienceViewService();
    mockAdGroupBidModifierService = new MockAdGroupBidModifierService();
    mockAdGroupCriterionLabelService = new MockAdGroupCriterionLabelService();
    mockAdGroupCriterionService = new MockAdGroupCriterionService();
    mockAdGroupCriterionSimulationService = new MockAdGroupCriterionSimulationService();
    mockAdGroupExtensionSettingService = new MockAdGroupExtensionSettingService();
    mockAdGroupFeedService = new MockAdGroupFeedService();
    mockAdGroupLabelService = new MockAdGroupLabelService();
    mockAdGroupService = new MockAdGroupService();
    mockAdGroupSimulationService = new MockAdGroupSimulationService();
    mockAdParameterService = new MockAdParameterService();
    mockAdScheduleViewService = new MockAdScheduleViewService();
    mockAdService = new MockAdService();
    mockAgeRangeViewService = new MockAgeRangeViewService();
    mockAssetService = new MockAssetService();
    mockBiddingStrategyService = new MockBiddingStrategyService();
    mockBillingSetupService = new MockBillingSetupService();
    mockCampaignAudienceViewService = new MockCampaignAudienceViewService();
    mockCampaignBidModifierService = new MockCampaignBidModifierService();
    mockCampaignBudgetService = new MockCampaignBudgetService();
    mockCampaignCriterionService = new MockCampaignCriterionService();
    mockCampaignCriterionSimulationService = new MockCampaignCriterionSimulationService();
    mockCampaignDraftService = new MockCampaignDraftService();
    mockCampaignExperimentService = new MockCampaignExperimentService();
    mockCampaignExtensionSettingService = new MockCampaignExtensionSettingService();
    mockCampaignFeedService = new MockCampaignFeedService();
    mockCampaignLabelService = new MockCampaignLabelService();
    mockCampaignService = new MockCampaignService();
    mockCampaignSharedSetService = new MockCampaignSharedSetService();
    mockCarrierConstantService = new MockCarrierConstantService();
    mockChangeStatusService = new MockChangeStatusService();
    mockClickViewService = new MockClickViewService();
    mockConversionActionService = new MockConversionActionService();
    mockConversionAdjustmentUploadService = new MockConversionAdjustmentUploadService();
    mockConversionUploadService = new MockConversionUploadService();
    mockCurrencyConstantService = new MockCurrencyConstantService();
    mockCustomInterestService = new MockCustomInterestService();
    mockCustomerClientLinkService = new MockCustomerClientLinkService();
    mockCustomerClientService = new MockCustomerClientService();
    mockCustomerExtensionSettingService = new MockCustomerExtensionSettingService();
    mockCustomerFeedService = new MockCustomerFeedService();
    mockCustomerLabelService = new MockCustomerLabelService();
    mockCustomerManagerLinkService = new MockCustomerManagerLinkService();
    mockCustomerNegativeCriterionService = new MockCustomerNegativeCriterionService();
    mockCustomerService = new MockCustomerService();
    mockDetailPlacementViewService = new MockDetailPlacementViewService();
    mockDisplayKeywordViewService = new MockDisplayKeywordViewService();
    mockDistanceViewService = new MockDistanceViewService();
    mockDomainCategoryService = new MockDomainCategoryService();
    mockDynamicSearchAdsSearchTermViewService = new MockDynamicSearchAdsSearchTermViewService();
    mockExpandedLandingPageViewService = new MockExpandedLandingPageViewService();
    mockExtensionFeedItemService = new MockExtensionFeedItemService();
    mockFeedItemService = new MockFeedItemService();
    mockFeedItemTargetService = new MockFeedItemTargetService();
    mockFeedMappingService = new MockFeedMappingService();
    mockFeedPlaceholderViewService = new MockFeedPlaceholderViewService();
    mockFeedService = new MockFeedService();
    mockGenderViewService = new MockGenderViewService();
    mockGeoTargetConstantService = new MockGeoTargetConstantService();
    mockGeographicViewService = new MockGeographicViewService();
    mockGoogleAdsFieldService = new MockGoogleAdsFieldService();
    mockGoogleAdsService = new MockGoogleAdsService();
    mockGroupPlacementViewService = new MockGroupPlacementViewService();
    mockHotelGroupViewService = new MockHotelGroupViewService();
    mockHotelPerformanceViewService = new MockHotelPerformanceViewService();
    mockInvoiceService = new MockInvoiceService();
    mockKeywordPlanAdGroupService = new MockKeywordPlanAdGroupService();
    mockKeywordPlanCampaignService = new MockKeywordPlanCampaignService();
    mockKeywordPlanIdeaService = new MockKeywordPlanIdeaService();
    mockKeywordPlanKeywordService = new MockKeywordPlanKeywordService();
    mockKeywordPlanNegativeKeywordService = new MockKeywordPlanNegativeKeywordService();
    mockKeywordPlanService = new MockKeywordPlanService();
    mockKeywordViewService = new MockKeywordViewService();
    mockLabelService = new MockLabelService();
    mockLandingPageViewService = new MockLandingPageViewService();
    mockLanguageConstantService = new MockLanguageConstantService();
    mockLocationViewService = new MockLocationViewService();
    mockManagedPlacementViewService = new MockManagedPlacementViewService();
    mockMediaFileService = new MockMediaFileService();
    mockMerchantCenterLinkService = new MockMerchantCenterLinkService();
    mockMobileAppCategoryConstantService = new MockMobileAppCategoryConstantService();
    mockMobileDeviceConstantService = new MockMobileDeviceConstantService();
    mockMutateJobService = new MockMutateJobService();
    mockOfflineUserDataJobService = new MockOfflineUserDataJobService();
    mockOperatingSystemVersionConstantService = new MockOperatingSystemVersionConstantService();
    mockPaidOrganicSearchTermViewService = new MockPaidOrganicSearchTermViewService();
    mockParentalStatusViewService = new MockParentalStatusViewService();
    mockPaymentsAccountService = new MockPaymentsAccountService();
    mockProductBiddingCategoryConstantService = new MockProductBiddingCategoryConstantService();
    mockProductGroupViewService = new MockProductGroupViewService();
    mockReachPlanService = new MockReachPlanService();
    mockRecommendationService = new MockRecommendationService();
    mockRemarketingActionService = new MockRemarketingActionService();
    mockSearchTermViewService = new MockSearchTermViewService();
    mockSharedCriterionService = new MockSharedCriterionService();
    mockSharedSetService = new MockSharedSetService();
    mockShoppingPerformanceViewService = new MockShoppingPerformanceViewService();
    mockTopicConstantService = new MockTopicConstantService();
    mockTopicViewService = new MockTopicViewService();
    mockUserDataService = new MockUserDataService();
    mockUserInterestService = new MockUserInterestService();
    mockUserListService = new MockUserListService();
    mockUserLocationViewService = new MockUserLocationViewService();
    mockVideoService = new MockVideoService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1",
            Arrays.<MockGrpcService>asList(
                mockAccountBudgetProposalService,
                mockAccountBudgetService,
                mockAdGroupAdAssetViewService,
                mockAdGroupAdLabelService,
                mockAdGroupAdService,
                mockAdGroupAudienceViewService,
                mockAdGroupBidModifierService,
                mockAdGroupCriterionLabelService,
                mockAdGroupCriterionService,
                mockAdGroupCriterionSimulationService,
                mockAdGroupExtensionSettingService,
                mockAdGroupFeedService,
                mockAdGroupLabelService,
                mockAdGroupService,
                mockAdGroupSimulationService,
                mockAdParameterService,
                mockAdScheduleViewService,
                mockAdService,
                mockAgeRangeViewService,
                mockAssetService,
                mockBiddingStrategyService,
                mockBillingSetupService,
                mockCampaignAudienceViewService,
                mockCampaignBidModifierService,
                mockCampaignBudgetService,
                mockCampaignCriterionService,
                mockCampaignCriterionSimulationService,
                mockCampaignDraftService,
                mockCampaignExperimentService,
                mockCampaignExtensionSettingService,
                mockCampaignFeedService,
                mockCampaignLabelService,
                mockCampaignService,
                mockCampaignSharedSetService,
                mockCarrierConstantService,
                mockChangeStatusService,
                mockClickViewService,
                mockConversionActionService,
                mockConversionAdjustmentUploadService,
                mockConversionUploadService,
                mockCurrencyConstantService,
                mockCustomInterestService,
                mockCustomerClientLinkService,
                mockCustomerClientService,
                mockCustomerExtensionSettingService,
                mockCustomerFeedService,
                mockCustomerLabelService,
                mockCustomerManagerLinkService,
                mockCustomerNegativeCriterionService,
                mockCustomerService,
                mockDetailPlacementViewService,
                mockDisplayKeywordViewService,
                mockDistanceViewService,
                mockDomainCategoryService,
                mockDynamicSearchAdsSearchTermViewService,
                mockExpandedLandingPageViewService,
                mockExtensionFeedItemService,
                mockFeedItemService,
                mockFeedItemTargetService,
                mockFeedMappingService,
                mockFeedPlaceholderViewService,
                mockFeedService,
                mockGenderViewService,
                mockGeoTargetConstantService,
                mockGeographicViewService,
                mockGoogleAdsFieldService,
                mockGoogleAdsService,
                mockGroupPlacementViewService,
                mockHotelGroupViewService,
                mockHotelPerformanceViewService,
                mockInvoiceService,
                mockKeywordPlanAdGroupService,
                mockKeywordPlanCampaignService,
                mockKeywordPlanIdeaService,
                mockKeywordPlanKeywordService,
                mockKeywordPlanNegativeKeywordService,
                mockKeywordPlanService,
                mockKeywordViewService,
                mockLabelService,
                mockLandingPageViewService,
                mockLanguageConstantService,
                mockLocationViewService,
                mockManagedPlacementViewService,
                mockMediaFileService,
                mockMerchantCenterLinkService,
                mockMobileAppCategoryConstantService,
                mockMobileDeviceConstantService,
                mockMutateJobService,
                mockOfflineUserDataJobService,
                mockOperatingSystemVersionConstantService,
                mockPaidOrganicSearchTermViewService,
                mockParentalStatusViewService,
                mockPaymentsAccountService,
                mockProductBiddingCategoryConstantService,
                mockProductGroupViewService,
                mockReachPlanService,
                mockRecommendationService,
                mockRemarketingActionService,
                mockSearchTermViewService,
                mockSharedCriterionService,
                mockSharedSetService,
                mockShoppingPerformanceViewService,
                mockTopicConstantService,
                mockTopicViewService,
                mockUserDataService,
                mockUserInterestService,
                mockUserListService,
                mockUserLocationViewService,
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
  @SuppressWarnings("all")
  public void getCampaignExperimentTest() {
    String resourceName2 = "resourceName2625949903";
    CampaignExperiment expectedResponse =
        CampaignExperiment.newBuilder().setResourceName(resourceName2).build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String formattedResourceName =
        CampaignExperimentServiceClient.formatCampaignExperimentName(
            "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");

    CampaignExperiment actualResponse = client.getCampaignExperiment(formattedResourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignExperimentRequest actualRequest =
        (GetCampaignExperimentRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String formattedResourceName =
          CampaignExperimentServiceClient.formatCampaignExperimentName(
              "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");

      client.getCampaignExperiment(formattedResourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createCampaignExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createCampaignExperimentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockCampaignExperimentService.addResponse(resultOperation);

    String customerId = "customerId-1772061412";
    CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();
    boolean validateOnly = false;

    Empty actualResponse =
        client.createCampaignExperimentAsync(customerId, campaignExperiment, validateOnly).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateCampaignExperimentRequest actualRequest =
        (CreateCampaignExperimentRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(campaignExperiment, actualRequest.getCampaignExperiment());
    Assert.assertEquals(validateOnly, actualRequest.getValidateOnly());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();
      boolean validateOnly = false;

      client.createCampaignExperimentAsync(customerId, campaignExperiment, validateOnly).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createCampaignExperimentTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createCampaignExperimentTest2")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockCampaignExperimentService.addResponse(resultOperation);

    String customerId = "customerId-1772061412";
    CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();

    Empty actualResponse =
        client.createCampaignExperimentAsync(customerId, campaignExperiment).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateCampaignExperimentRequest actualRequest =
        (CreateCampaignExperimentRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(campaignExperiment, actualRequest.getCampaignExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createCampaignExperimentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      CampaignExperiment campaignExperiment = CampaignExperiment.newBuilder().build();

      client.createCampaignExperimentAsync(customerId, campaignExperiment).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignExperimentsTest() {
    MutateCampaignExperimentsResponse expectedResponse =
        MutateCampaignExperimentsResponse.newBuilder().build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<CampaignExperimentOperation> operations = new ArrayList<>();
    boolean partialFailure = true;
    boolean validateOnly = false;

    MutateCampaignExperimentsResponse actualResponse =
        client.mutateCampaignExperiments(customerId, operations, partialFailure, validateOnly);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignExperimentsRequest actualRequest =
        (MutateCampaignExperimentsRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertEquals(partialFailure, actualRequest.getPartialFailure());
    Assert.assertEquals(validateOnly, actualRequest.getValidateOnly());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignExperimentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<CampaignExperimentOperation> operations = new ArrayList<>();
      boolean partialFailure = true;
      boolean validateOnly = false;

      client.mutateCampaignExperiments(customerId, operations, partialFailure, validateOnly);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignExperimentsTest2() {
    MutateCampaignExperimentsResponse expectedResponse =
        MutateCampaignExperimentsResponse.newBuilder().build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<CampaignExperimentOperation> operations = new ArrayList<>();

    MutateCampaignExperimentsResponse actualResponse =
        client.mutateCampaignExperiments(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignExperimentsRequest actualRequest =
        (MutateCampaignExperimentsRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignExperimentsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<CampaignExperimentOperation> operations = new ArrayList<>();

      client.mutateCampaignExperiments(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void graduateCampaignExperimentTest() {
    String graduatedCampaign = "graduatedCampaign-758391274";
    GraduateCampaignExperimentResponse expectedResponse =
        GraduateCampaignExperimentResponse.newBuilder()
            .setGraduatedCampaign(graduatedCampaign)
            .build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String formattedCampaignExperiment =
        CampaignExperimentServiceClient.formatCampaignExperimentName(
            "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
    String campaignBudget = "campaignBudget1992382804";

    GraduateCampaignExperimentResponse actualResponse =
        client.graduateCampaignExperiment(formattedCampaignExperiment, campaignBudget);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GraduateCampaignExperimentRequest actualRequest =
        (GraduateCampaignExperimentRequest) actualRequests.get(0);

    Assert.assertEquals(formattedCampaignExperiment, actualRequest.getCampaignExperiment());
    Assert.assertEquals(campaignBudget, actualRequest.getCampaignBudget());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void graduateCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String formattedCampaignExperiment =
          CampaignExperimentServiceClient.formatCampaignExperimentName(
              "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
      String campaignBudget = "campaignBudget1992382804";

      client.graduateCampaignExperiment(formattedCampaignExperiment, campaignBudget);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void promoteCampaignExperimentTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("promoteCampaignExperimentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockCampaignExperimentService.addResponse(resultOperation);

    String formattedCampaignExperiment =
        CampaignExperimentServiceClient.formatCampaignExperimentName(
            "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");

    Empty actualResponse = client.promoteCampaignExperimentAsync(formattedCampaignExperiment).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    PromoteCampaignExperimentRequest actualRequest =
        (PromoteCampaignExperimentRequest) actualRequests.get(0);

    Assert.assertEquals(formattedCampaignExperiment, actualRequest.getCampaignExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void promoteCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String formattedCampaignExperiment =
          CampaignExperimentServiceClient.formatCampaignExperimentName(
              "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");

      client.promoteCampaignExperimentAsync(formattedCampaignExperiment).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void endCampaignExperimentTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String formattedCampaignExperiment =
        CampaignExperimentServiceClient.formatCampaignExperimentName(
            "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");

    client.endCampaignExperiment(formattedCampaignExperiment);

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    EndCampaignExperimentRequest actualRequest =
        (EndCampaignExperimentRequest) actualRequests.get(0);

    Assert.assertEquals(formattedCampaignExperiment, actualRequest.getCampaignExperiment());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void endCampaignExperimentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String formattedCampaignExperiment =
          CampaignExperimentServiceClient.formatCampaignExperimentName(
              "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");

      client.endCampaignExperiment(formattedCampaignExperiment);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listCampaignExperimentAsyncErrorsTest() {
    String nextPageToken = "";
    com.google.rpc.Status errorsElement = com.google.rpc.Status.newBuilder().build();
    List<com.google.rpc.Status> errors = Arrays.asList(errorsElement);
    ListCampaignExperimentAsyncErrorsResponse expectedResponse =
        ListCampaignExperimentAsyncErrorsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllErrors(errors)
            .build();
    mockCampaignExperimentService.addResponse(expectedResponse);

    String formattedResourceName =
        CampaignExperimentServiceClient.formatCampaignExperimentName(
            "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");

    ListCampaignExperimentAsyncErrorsPagedResponse pagedListResponse =
        client.listCampaignExperimentAsyncErrors(formattedResourceName);

    List<com.google.rpc.Status> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getErrorsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockCampaignExperimentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCampaignExperimentAsyncErrorsRequest actualRequest =
        (ListCampaignExperimentAsyncErrorsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listCampaignExperimentAsyncErrorsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignExperimentService.addException(exception);

    try {
      String formattedResourceName =
          CampaignExperimentServiceClient.formatCampaignExperimentName(
              "[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");

      client.listCampaignExperimentAsyncErrors(formattedResourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
