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
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.CampaignLabel;
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
public class CampaignLabelServiceClientTest {
  private static MockAccountBudgetProposalService mockAccountBudgetProposalService;
  private static MockAccountBudgetService mockAccountBudgetService;
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
  private static MockOperatingSystemVersionConstantService
      mockOperatingSystemVersionConstantService;
  private static MockPaidOrganicSearchTermViewService mockPaidOrganicSearchTermViewService;
  private static MockParentalStatusViewService mockParentalStatusViewService;
  private static MockPaymentsAccountService mockPaymentsAccountService;
  private static MockProductBiddingCategoryConstantService
      mockProductBiddingCategoryConstantService;
  private static MockProductGroupViewService mockProductGroupViewService;
  private static MockRecommendationService mockRecommendationService;
  private static MockRemarketingActionService mockRemarketingActionService;
  private static MockSearchTermViewService mockSearchTermViewService;
  private static MockSharedCriterionService mockSharedCriterionService;
  private static MockSharedSetService mockSharedSetService;
  private static MockShoppingPerformanceViewService mockShoppingPerformanceViewService;
  private static MockTopicConstantService mockTopicConstantService;
  private static MockTopicViewService mockTopicViewService;
  private static MockUserInterestService mockUserInterestService;
  private static MockUserListService mockUserListService;
  private static MockVideoService mockVideoService;
  private static MockServiceHelper serviceHelper;
  private CampaignLabelServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountBudgetProposalService = new MockAccountBudgetProposalService();
    mockAccountBudgetService = new MockAccountBudgetService();
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
    mockOperatingSystemVersionConstantService = new MockOperatingSystemVersionConstantService();
    mockPaidOrganicSearchTermViewService = new MockPaidOrganicSearchTermViewService();
    mockParentalStatusViewService = new MockParentalStatusViewService();
    mockPaymentsAccountService = new MockPaymentsAccountService();
    mockProductBiddingCategoryConstantService = new MockProductBiddingCategoryConstantService();
    mockProductGroupViewService = new MockProductGroupViewService();
    mockRecommendationService = new MockRecommendationService();
    mockRemarketingActionService = new MockRemarketingActionService();
    mockSearchTermViewService = new MockSearchTermViewService();
    mockSharedCriterionService = new MockSharedCriterionService();
    mockSharedSetService = new MockSharedSetService();
    mockShoppingPerformanceViewService = new MockShoppingPerformanceViewService();
    mockTopicConstantService = new MockTopicConstantService();
    mockTopicViewService = new MockTopicViewService();
    mockUserInterestService = new MockUserInterestService();
    mockUserListService = new MockUserListService();
    mockVideoService = new MockVideoService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1",
            Arrays.<MockGrpcService>asList(
                mockAccountBudgetProposalService,
                mockAccountBudgetService,
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
                mockOperatingSystemVersionConstantService,
                mockPaidOrganicSearchTermViewService,
                mockParentalStatusViewService,
                mockPaymentsAccountService,
                mockProductBiddingCategoryConstantService,
                mockProductGroupViewService,
                mockRecommendationService,
                mockRemarketingActionService,
                mockSearchTermViewService,
                mockSharedCriterionService,
                mockSharedSetService,
                mockShoppingPerformanceViewService,
                mockTopicConstantService,
                mockTopicViewService,
                mockUserInterestService,
                mockUserListService,
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
    CampaignLabelServiceSettings settings =
        CampaignLabelServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignLabelServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getCampaignLabelTest() {
    String resourceName2 = "resourceName2625949903";
    CampaignLabel expectedResponse =
        CampaignLabel.newBuilder().setResourceName(resourceName2).build();
    mockCampaignLabelService.addResponse(expectedResponse);

    String formattedResourceName =
        CampaignLabelServiceClient.formatCampaignLabelName("[CUSTOMER]", "[CAMPAIGN_LABEL]");

    CampaignLabel actualResponse = client.getCampaignLabel(formattedResourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockCampaignLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignLabelRequest actualRequest = (GetCampaignLabelRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getCampaignLabelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignLabelService.addException(exception);

    try {
      String formattedResourceName =
          CampaignLabelServiceClient.formatCampaignLabelName("[CUSTOMER]", "[CAMPAIGN_LABEL]");

      client.getCampaignLabel(formattedResourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignLabelsTest() {
    MutateCampaignLabelsResponse expectedResponse =
        MutateCampaignLabelsResponse.newBuilder().build();
    mockCampaignLabelService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<CampaignLabelOperation> operations = new ArrayList<>();
    boolean partialFailure = true;
    boolean validateOnly = false;

    MutateCampaignLabelsResponse actualResponse =
        client.mutateCampaignLabels(customerId, operations, partialFailure, validateOnly);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockCampaignLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignLabelsRequest actualRequest = (MutateCampaignLabelsRequest) actualRequests.get(0);

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
  public void mutateCampaignLabelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignLabelService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<CampaignLabelOperation> operations = new ArrayList<>();
      boolean partialFailure = true;
      boolean validateOnly = false;

      client.mutateCampaignLabels(customerId, operations, partialFailure, validateOnly);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignLabelsTest2() {
    MutateCampaignLabelsResponse expectedResponse =
        MutateCampaignLabelsResponse.newBuilder().build();
    mockCampaignLabelService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<CampaignLabelOperation> operations = new ArrayList<>();

    MutateCampaignLabelsResponse actualResponse =
        client.mutateCampaignLabels(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockCampaignLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignLabelsRequest actualRequest = (MutateCampaignLabelsRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateCampaignLabelsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockCampaignLabelService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<CampaignLabelOperation> operations = new ArrayList<>();

      client.mutateCampaignLabels(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
