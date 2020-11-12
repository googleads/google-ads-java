/*
 * Copyright 2020 Google LLC
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
package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.UserList;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class UserListServiceClientTest {
  private static MockAccountBudgetProposalService mockAccountBudgetProposalService;
  private static MockAccountBudgetService mockAccountBudgetService;
  private static MockAccountLinkService mockAccountLinkService;
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
  private static MockCampaignAssetService mockCampaignAssetService;
  private static MockCampaignBidModifierService mockCampaignBidModifierService;
  private static MockCampaignBudgetService mockCampaignBudgetService;
  private static MockCampaignCriterionService mockCampaignCriterionService;
  private static MockCampaignDraftService mockCampaignDraftService;
  private static MockCampaignExperimentService mockCampaignExperimentService;
  private static MockCampaignExtensionSettingService mockCampaignExtensionSettingService;
  private static MockCampaignFeedService mockCampaignFeedService;
  private static MockCampaignLabelService mockCampaignLabelService;
  private static MockCampaignService mockCampaignService;
  private static MockCampaignSharedSetService mockCampaignSharedSetService;
  private static MockConversionActionService mockConversionActionService;
  private static MockCustomerExtensionSettingService mockCustomerExtensionSettingService;
  private static MockCustomerFeedService mockCustomerFeedService;
  private static MockCustomerLabelService mockCustomerLabelService;
  private static MockCustomerNegativeCriterionService mockCustomerNegativeCriterionService;
  private static MockCustomerService mockCustomerService;
  private static MockExtensionFeedItemService mockExtensionFeedItemService;
  private static MockFeedItemService mockFeedItemService;
  private static MockFeedItemSetLinkService mockFeedItemSetLinkService;
  private static MockFeedItemSetService mockFeedItemSetService;
  private static MockFeedItemTargetService mockFeedItemTargetService;
  private static MockFeedMappingService mockFeedMappingService;
  private static MockFeedService mockFeedService;
  private static MockKeywordPlanAdGroupKeywordService mockKeywordPlanAdGroupKeywordService;
  private static MockKeywordPlanAdGroupService mockKeywordPlanAdGroupService;
  private static MockKeywordPlanCampaignKeywordService mockKeywordPlanCampaignKeywordService;
  private static MockKeywordPlanCampaignService mockKeywordPlanCampaignService;
  private static MockKeywordPlanService mockKeywordPlanService;
  private static MockLabelService mockLabelService;
  private static MockMediaFileService mockMediaFileService;
  private static MockRemarketingActionService mockRemarketingActionService;
  private static MockSharedCriterionService mockSharedCriterionService;
  private static MockSharedSetService mockSharedSetService;
  private static MockUserListService mockUserListService;
  private static MockGoogleAdsService mockGoogleAdsService;
  private static MockBatchJobService mockBatchJobService;
  private static MockBillingSetupService mockBillingSetupService;
  private static MockCampaignAudienceViewService mockCampaignAudienceViewService;
  private static MockCampaignCriterionSimulationService mockCampaignCriterionSimulationService;
  private static MockCarrierConstantService mockCarrierConstantService;
  private static MockChangeStatusService mockChangeStatusService;
  private static MockClickViewService mockClickViewService;
  private static MockCombinedAudienceService mockCombinedAudienceService;
  private static MockConversionAdjustmentUploadService mockConversionAdjustmentUploadService;
  private static MockConversionUploadService mockConversionUploadService;
  private static MockCurrencyConstantService mockCurrencyConstantService;
  private static MockCustomAudienceService mockCustomAudienceService;
  private static MockCustomInterestService mockCustomInterestService;
  private static MockCustomerClientLinkService mockCustomerClientLinkService;
  private static MockCustomerClientService mockCustomerClientService;
  private static MockCustomerManagerLinkService mockCustomerManagerLinkService;
  private static MockCustomerUserAccessService mockCustomerUserAccessService;
  private static MockDetailPlacementViewService mockDetailPlacementViewService;
  private static MockDisplayKeywordViewService mockDisplayKeywordViewService;
  private static MockDistanceViewService mockDistanceViewService;
  private static MockDomainCategoryService mockDomainCategoryService;
  private static MockDynamicSearchAdsSearchTermViewService
      mockDynamicSearchAdsSearchTermViewService;
  private static MockExpandedLandingPageViewService mockExpandedLandingPageViewService;
  private static MockFeedPlaceholderViewService mockFeedPlaceholderViewService;
  private static MockGenderViewService mockGenderViewService;
  private static MockGeoTargetConstantService mockGeoTargetConstantService;
  private static MockGeographicViewService mockGeographicViewService;
  private static MockGoogleAdsFieldService mockGoogleAdsFieldService;
  private static MockGroupPlacementViewService mockGroupPlacementViewService;
  private static MockHotelGroupViewService mockHotelGroupViewService;
  private static MockHotelPerformanceViewService mockHotelPerformanceViewService;
  private static MockIncomeRangeViewService mockIncomeRangeViewService;
  private static MockInvoiceService mockInvoiceService;
  private static MockKeywordPlanIdeaService mockKeywordPlanIdeaService;
  private static MockKeywordViewService mockKeywordViewService;
  private static MockLandingPageViewService mockLandingPageViewService;
  private static MockLanguageConstantService mockLanguageConstantService;
  private static MockLocationViewService mockLocationViewService;
  private static MockManagedPlacementViewService mockManagedPlacementViewService;
  private static MockMerchantCenterLinkService mockMerchantCenterLinkService;
  private static MockMobileAppCategoryConstantService mockMobileAppCategoryConstantService;
  private static MockMobileDeviceConstantService mockMobileDeviceConstantService;
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
  private static MockSearchTermViewService mockSearchTermViewService;
  private static MockShoppingPerformanceViewService mockShoppingPerformanceViewService;
  private static MockThirdPartyAppAnalyticsLinkService mockThirdPartyAppAnalyticsLinkService;
  private static MockTopicConstantService mockTopicConstantService;
  private static MockTopicViewService mockTopicViewService;
  private static MockUserDataService mockUserDataService;
  private static MockUserInterestService mockUserInterestService;
  private static MockUserLocationViewService mockUserLocationViewService;
  private static MockVideoService mockVideoService;
  private static MockServiceHelper serviceHelper;
  private UserListServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountBudgetProposalService = new MockAccountBudgetProposalService();
    mockAccountBudgetService = new MockAccountBudgetService();
    mockAccountLinkService = new MockAccountLinkService();
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
    mockCampaignAssetService = new MockCampaignAssetService();
    mockCampaignBidModifierService = new MockCampaignBidModifierService();
    mockCampaignBudgetService = new MockCampaignBudgetService();
    mockCampaignCriterionService = new MockCampaignCriterionService();
    mockCampaignDraftService = new MockCampaignDraftService();
    mockCampaignExperimentService = new MockCampaignExperimentService();
    mockCampaignExtensionSettingService = new MockCampaignExtensionSettingService();
    mockCampaignFeedService = new MockCampaignFeedService();
    mockCampaignLabelService = new MockCampaignLabelService();
    mockCampaignService = new MockCampaignService();
    mockCampaignSharedSetService = new MockCampaignSharedSetService();
    mockConversionActionService = new MockConversionActionService();
    mockCustomerExtensionSettingService = new MockCustomerExtensionSettingService();
    mockCustomerFeedService = new MockCustomerFeedService();
    mockCustomerLabelService = new MockCustomerLabelService();
    mockCustomerNegativeCriterionService = new MockCustomerNegativeCriterionService();
    mockCustomerService = new MockCustomerService();
    mockExtensionFeedItemService = new MockExtensionFeedItemService();
    mockFeedItemService = new MockFeedItemService();
    mockFeedItemSetLinkService = new MockFeedItemSetLinkService();
    mockFeedItemSetService = new MockFeedItemSetService();
    mockFeedItemTargetService = new MockFeedItemTargetService();
    mockFeedMappingService = new MockFeedMappingService();
    mockFeedService = new MockFeedService();
    mockKeywordPlanAdGroupKeywordService = new MockKeywordPlanAdGroupKeywordService();
    mockKeywordPlanAdGroupService = new MockKeywordPlanAdGroupService();
    mockKeywordPlanCampaignKeywordService = new MockKeywordPlanCampaignKeywordService();
    mockKeywordPlanCampaignService = new MockKeywordPlanCampaignService();
    mockKeywordPlanService = new MockKeywordPlanService();
    mockLabelService = new MockLabelService();
    mockMediaFileService = new MockMediaFileService();
    mockRemarketingActionService = new MockRemarketingActionService();
    mockSharedCriterionService = new MockSharedCriterionService();
    mockSharedSetService = new MockSharedSetService();
    mockUserListService = new MockUserListService();
    mockGoogleAdsService = new MockGoogleAdsService();
    mockBatchJobService = new MockBatchJobService();
    mockBillingSetupService = new MockBillingSetupService();
    mockCampaignAudienceViewService = new MockCampaignAudienceViewService();
    mockCampaignCriterionSimulationService = new MockCampaignCriterionSimulationService();
    mockCarrierConstantService = new MockCarrierConstantService();
    mockChangeStatusService = new MockChangeStatusService();
    mockClickViewService = new MockClickViewService();
    mockCombinedAudienceService = new MockCombinedAudienceService();
    mockConversionAdjustmentUploadService = new MockConversionAdjustmentUploadService();
    mockConversionUploadService = new MockConversionUploadService();
    mockCurrencyConstantService = new MockCurrencyConstantService();
    mockCustomAudienceService = new MockCustomAudienceService();
    mockCustomInterestService = new MockCustomInterestService();
    mockCustomerClientLinkService = new MockCustomerClientLinkService();
    mockCustomerClientService = new MockCustomerClientService();
    mockCustomerManagerLinkService = new MockCustomerManagerLinkService();
    mockCustomerUserAccessService = new MockCustomerUserAccessService();
    mockDetailPlacementViewService = new MockDetailPlacementViewService();
    mockDisplayKeywordViewService = new MockDisplayKeywordViewService();
    mockDistanceViewService = new MockDistanceViewService();
    mockDomainCategoryService = new MockDomainCategoryService();
    mockDynamicSearchAdsSearchTermViewService = new MockDynamicSearchAdsSearchTermViewService();
    mockExpandedLandingPageViewService = new MockExpandedLandingPageViewService();
    mockFeedPlaceholderViewService = new MockFeedPlaceholderViewService();
    mockGenderViewService = new MockGenderViewService();
    mockGeoTargetConstantService = new MockGeoTargetConstantService();
    mockGeographicViewService = new MockGeographicViewService();
    mockGoogleAdsFieldService = new MockGoogleAdsFieldService();
    mockGroupPlacementViewService = new MockGroupPlacementViewService();
    mockHotelGroupViewService = new MockHotelGroupViewService();
    mockHotelPerformanceViewService = new MockHotelPerformanceViewService();
    mockIncomeRangeViewService = new MockIncomeRangeViewService();
    mockInvoiceService = new MockInvoiceService();
    mockKeywordPlanIdeaService = new MockKeywordPlanIdeaService();
    mockKeywordViewService = new MockKeywordViewService();
    mockLandingPageViewService = new MockLandingPageViewService();
    mockLanguageConstantService = new MockLanguageConstantService();
    mockLocationViewService = new MockLocationViewService();
    mockManagedPlacementViewService = new MockManagedPlacementViewService();
    mockMerchantCenterLinkService = new MockMerchantCenterLinkService();
    mockMobileAppCategoryConstantService = new MockMobileAppCategoryConstantService();
    mockMobileDeviceConstantService = new MockMobileDeviceConstantService();
    mockOfflineUserDataJobService = new MockOfflineUserDataJobService();
    mockOperatingSystemVersionConstantService = new MockOperatingSystemVersionConstantService();
    mockPaidOrganicSearchTermViewService = new MockPaidOrganicSearchTermViewService();
    mockParentalStatusViewService = new MockParentalStatusViewService();
    mockPaymentsAccountService = new MockPaymentsAccountService();
    mockProductBiddingCategoryConstantService = new MockProductBiddingCategoryConstantService();
    mockProductGroupViewService = new MockProductGroupViewService();
    mockReachPlanService = new MockReachPlanService();
    mockRecommendationService = new MockRecommendationService();
    mockSearchTermViewService = new MockSearchTermViewService();
    mockShoppingPerformanceViewService = new MockShoppingPerformanceViewService();
    mockThirdPartyAppAnalyticsLinkService = new MockThirdPartyAppAnalyticsLinkService();
    mockTopicConstantService = new MockTopicConstantService();
    mockTopicViewService = new MockTopicViewService();
    mockUserDataService = new MockUserDataService();
    mockUserInterestService = new MockUserInterestService();
    mockUserLocationViewService = new MockUserLocationViewService();
    mockVideoService = new MockVideoService();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(
                mockAccountBudgetProposalService,
                mockAccountBudgetService,
                mockAccountLinkService,
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
                mockCampaignAssetService,
                mockCampaignBidModifierService,
                mockCampaignBudgetService,
                mockCampaignCriterionService,
                mockCampaignDraftService,
                mockCampaignExperimentService,
                mockCampaignExtensionSettingService,
                mockCampaignFeedService,
                mockCampaignLabelService,
                mockCampaignService,
                mockCampaignSharedSetService,
                mockConversionActionService,
                mockCustomerExtensionSettingService,
                mockCustomerFeedService,
                mockCustomerLabelService,
                mockCustomerNegativeCriterionService,
                mockCustomerService,
                mockExtensionFeedItemService,
                mockFeedItemService,
                mockFeedItemSetLinkService,
                mockFeedItemSetService,
                mockFeedItemTargetService,
                mockFeedMappingService,
                mockFeedService,
                mockKeywordPlanAdGroupKeywordService,
                mockKeywordPlanAdGroupService,
                mockKeywordPlanCampaignKeywordService,
                mockKeywordPlanCampaignService,
                mockKeywordPlanService,
                mockLabelService,
                mockMediaFileService,
                mockRemarketingActionService,
                mockSharedCriterionService,
                mockSharedSetService,
                mockUserListService,
                mockGoogleAdsService,
                mockBatchJobService,
                mockBillingSetupService,
                mockCampaignAudienceViewService,
                mockCampaignCriterionSimulationService,
                mockCarrierConstantService,
                mockChangeStatusService,
                mockClickViewService,
                mockCombinedAudienceService,
                mockConversionAdjustmentUploadService,
                mockConversionUploadService,
                mockCurrencyConstantService,
                mockCustomAudienceService,
                mockCustomInterestService,
                mockCustomerClientLinkService,
                mockCustomerClientService,
                mockCustomerManagerLinkService,
                mockCustomerUserAccessService,
                mockDetailPlacementViewService,
                mockDisplayKeywordViewService,
                mockDistanceViewService,
                mockDomainCategoryService,
                mockDynamicSearchAdsSearchTermViewService,
                mockExpandedLandingPageViewService,
                mockFeedPlaceholderViewService,
                mockGenderViewService,
                mockGeoTargetConstantService,
                mockGeographicViewService,
                mockGoogleAdsFieldService,
                mockGroupPlacementViewService,
                mockHotelGroupViewService,
                mockHotelPerformanceViewService,
                mockIncomeRangeViewService,
                mockInvoiceService,
                mockKeywordPlanIdeaService,
                mockKeywordViewService,
                mockLandingPageViewService,
                mockLanguageConstantService,
                mockLocationViewService,
                mockManagedPlacementViewService,
                mockMerchantCenterLinkService,
                mockMobileAppCategoryConstantService,
                mockMobileDeviceConstantService,
                mockOfflineUserDataJobService,
                mockOperatingSystemVersionConstantService,
                mockPaidOrganicSearchTermViewService,
                mockParentalStatusViewService,
                mockPaymentsAccountService,
                mockProductBiddingCategoryConstantService,
                mockProductGroupViewService,
                mockReachPlanService,
                mockRecommendationService,
                mockSearchTermViewService,
                mockShoppingPerformanceViewService,
                mockThirdPartyAppAnalyticsLinkService,
                mockTopicConstantService,
                mockTopicViewService,
                mockUserDataService,
                mockUserInterestService,
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
    UserListServiceSettings settings =
        UserListServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = UserListServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getUserListTest() {
    com.google.ads.googleads.v6.services.UserListName resourceName2 =
        com.google.ads.googleads.v6.services.UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]");
    long id = 3355L;
    boolean readOnly = false;
    com.google.ads.googleads.v6.services.UserListName name =
        com.google.ads.googleads.v6.services.UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]");
    String description = "description-1724546052";
    String integrationCode = "integrationCode79787384";
    long membershipLifeSpan = 1773195900L;
    long sizeForDisplay = 42289138L;
    long sizeForSearch = 1116581084L;
    boolean eligibleForSearch = true;
    boolean eligibleForDisplay = true;
    int matchRatePercentage = 1873464097;
    UserList expectedResponse =
        UserList.newBuilder()
            .setResourceName(resourceName2.toString())
            .setId(id)
            .setReadOnly(readOnly)
            .setName(name.toString())
            .setDescription(description)
            .setIntegrationCode(integrationCode)
            .setMembershipLifeSpan(membershipLifeSpan)
            .setSizeForDisplay(sizeForDisplay)
            .setSizeForSearch(sizeForSearch)
            .setEligibleForSearch(eligibleForSearch)
            .setEligibleForDisplay(eligibleForDisplay)
            .setMatchRatePercentage(matchRatePercentage)
            .build();
    mockUserListService.addResponse(expectedResponse);

    UserListName resourceName = UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]");

    UserList actualResponse = client.getUserList(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockUserListService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetUserListRequest actualRequest = (GetUserListRequest) actualRequests.get(0);

    Assert.assertEquals(resourceName, UserListName.parse(actualRequest.getResourceName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getUserListExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockUserListService.addException(exception);

    try {
      UserListName resourceName = UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]");

      client.getUserList(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateUserListsTest() {
    MutateUserListsResponse expectedResponse = MutateUserListsResponse.newBuilder().build();
    mockUserListService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<UserListOperation> operations = new ArrayList<>();

    MutateUserListsResponse actualResponse = client.mutateUserLists(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockUserListService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateUserListsRequest actualRequest = (MutateUserListsRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateUserListsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockUserListService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<UserListOperation> operations = new ArrayList<>();

      client.mutateUserLists(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
