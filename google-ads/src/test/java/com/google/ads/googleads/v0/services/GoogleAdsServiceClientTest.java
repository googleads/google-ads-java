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
package com.google.ads.googleads.v0.services;

import static com.google.ads.googleads.v0.services.GoogleAdsServiceClient.SearchPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
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
public class GoogleAdsServiceClientTest {
  private static MockAccountBudgetProposalService mockAccountBudgetProposalService;
  private static MockAccountBudgetService mockAccountBudgetService;
  private static MockAdGroupAdService mockAdGroupAdService;
  private static MockAdGroupAudienceViewService mockAdGroupAudienceViewService;
  private static MockAdGroupBidModifierService mockAdGroupBidModifierService;
  private static MockAdGroupCriterionService mockAdGroupCriterionService;
  private static MockAdGroupFeedService mockAdGroupFeedService;
  private static MockAdGroupService mockAdGroupService;
  private static MockAdParameterService mockAdParameterService;
  private static MockAdScheduleViewService mockAdScheduleViewService;
  private static MockAgeRangeViewService mockAgeRangeViewService;
  private static MockBiddingStrategyService mockBiddingStrategyService;
  private static MockBillingSetupService mockBillingSetupService;
  private static MockCampaignAudienceViewService mockCampaignAudienceViewService;
  private static MockCampaignBidModifierService mockCampaignBidModifierService;
  private static MockCampaignBudgetService mockCampaignBudgetService;
  private static MockCampaignCriterionService mockCampaignCriterionService;
  private static MockCampaignFeedService mockCampaignFeedService;
  private static MockCampaignService mockCampaignService;
  private static MockCampaignSharedSetService mockCampaignSharedSetService;
  private static MockCarrierConstantService mockCarrierConstantService;
  private static MockChangeStatusService mockChangeStatusService;
  private static MockConversionActionService mockConversionActionService;
  private static MockCustomerClientLinkService mockCustomerClientLinkService;
  private static MockCustomerClientService mockCustomerClientService;
  private static MockCustomerFeedService mockCustomerFeedService;
  private static MockCustomerManagerLinkService mockCustomerManagerLinkService;
  private static MockCustomerService mockCustomerService;
  private static MockDisplayKeywordViewService mockDisplayKeywordViewService;
  private static MockFeedItemService mockFeedItemService;
  private static MockFeedMappingService mockFeedMappingService;
  private static MockFeedService mockFeedService;
  private static MockGenderViewService mockGenderViewService;
  private static MockGeoTargetConstantService mockGeoTargetConstantService;
  private static MockGoogleAdsFieldService mockGoogleAdsFieldService;
  private static MockSharedCriterionService mockSharedCriterionService;
  private static MockSharedSetService mockSharedSetService;
  private static MockUserListService mockUserListService;
  private static MockGoogleAdsService mockGoogleAdsService;
  private static MockHotelGroupViewService mockHotelGroupViewService;
  private static MockHotelPerformanceViewService mockHotelPerformanceViewService;
  private static MockKeywordPlanAdGroupService mockKeywordPlanAdGroupService;
  private static MockKeywordPlanCampaignService mockKeywordPlanCampaignService;
  private static MockKeywordPlanIdeaService mockKeywordPlanIdeaService;
  private static MockKeywordPlanKeywordService mockKeywordPlanKeywordService;
  private static MockKeywordPlanNegativeKeywordService mockKeywordPlanNegativeKeywordService;
  private static MockKeywordPlanService mockKeywordPlanService;
  private static MockKeywordViewService mockKeywordViewService;
  private static MockLanguageConstantService mockLanguageConstantService;
  private static MockManagedPlacementViewService mockManagedPlacementViewService;
  private static MockMediaFileService mockMediaFileService;
  private static MockMobileAppCategoryConstantService mockMobileAppCategoryConstantService;
  private static MockMobileDeviceConstantService mockMobileDeviceConstantService;
  private static MockOperatingSystemVersionConstantService
      mockOperatingSystemVersionConstantService;
  private static MockParentalStatusViewService mockParentalStatusViewService;
  private static MockPaymentsAccountService mockPaymentsAccountService;
  private static MockProductGroupViewService mockProductGroupViewService;
  private static MockRecommendationService mockRecommendationService;
  private static MockRemarketingActionService mockRemarketingActionService;
  private static MockSearchTermViewService mockSearchTermViewService;
  private static MockTopicConstantService mockTopicConstantService;
  private static MockTopicViewService mockTopicViewService;
  private static MockUserInterestService mockUserInterestService;
  private static MockVideoService mockVideoService;
  private static MockServiceHelper serviceHelper;
  private GoogleAdsServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAccountBudgetProposalService = new MockAccountBudgetProposalService();
    mockAccountBudgetService = new MockAccountBudgetService();
    mockAdGroupAdService = new MockAdGroupAdService();
    mockAdGroupAudienceViewService = new MockAdGroupAudienceViewService();
    mockAdGroupBidModifierService = new MockAdGroupBidModifierService();
    mockAdGroupCriterionService = new MockAdGroupCriterionService();
    mockAdGroupFeedService = new MockAdGroupFeedService();
    mockAdGroupService = new MockAdGroupService();
    mockAdParameterService = new MockAdParameterService();
    mockAdScheduleViewService = new MockAdScheduleViewService();
    mockAgeRangeViewService = new MockAgeRangeViewService();
    mockBiddingStrategyService = new MockBiddingStrategyService();
    mockBillingSetupService = new MockBillingSetupService();
    mockCampaignAudienceViewService = new MockCampaignAudienceViewService();
    mockCampaignBidModifierService = new MockCampaignBidModifierService();
    mockCampaignBudgetService = new MockCampaignBudgetService();
    mockCampaignCriterionService = new MockCampaignCriterionService();
    mockCampaignFeedService = new MockCampaignFeedService();
    mockCampaignService = new MockCampaignService();
    mockCampaignSharedSetService = new MockCampaignSharedSetService();
    mockCarrierConstantService = new MockCarrierConstantService();
    mockChangeStatusService = new MockChangeStatusService();
    mockConversionActionService = new MockConversionActionService();
    mockCustomerClientLinkService = new MockCustomerClientLinkService();
    mockCustomerClientService = new MockCustomerClientService();
    mockCustomerFeedService = new MockCustomerFeedService();
    mockCustomerManagerLinkService = new MockCustomerManagerLinkService();
    mockCustomerService = new MockCustomerService();
    mockDisplayKeywordViewService = new MockDisplayKeywordViewService();
    mockFeedItemService = new MockFeedItemService();
    mockFeedMappingService = new MockFeedMappingService();
    mockFeedService = new MockFeedService();
    mockGenderViewService = new MockGenderViewService();
    mockGeoTargetConstantService = new MockGeoTargetConstantService();
    mockGoogleAdsFieldService = new MockGoogleAdsFieldService();
    mockSharedCriterionService = new MockSharedCriterionService();
    mockSharedSetService = new MockSharedSetService();
    mockUserListService = new MockUserListService();
    mockGoogleAdsService = new MockGoogleAdsService();
    mockHotelGroupViewService = new MockHotelGroupViewService();
    mockHotelPerformanceViewService = new MockHotelPerformanceViewService();
    mockKeywordPlanAdGroupService = new MockKeywordPlanAdGroupService();
    mockKeywordPlanCampaignService = new MockKeywordPlanCampaignService();
    mockKeywordPlanIdeaService = new MockKeywordPlanIdeaService();
    mockKeywordPlanKeywordService = new MockKeywordPlanKeywordService();
    mockKeywordPlanNegativeKeywordService = new MockKeywordPlanNegativeKeywordService();
    mockKeywordPlanService = new MockKeywordPlanService();
    mockKeywordViewService = new MockKeywordViewService();
    mockLanguageConstantService = new MockLanguageConstantService();
    mockManagedPlacementViewService = new MockManagedPlacementViewService();
    mockMediaFileService = new MockMediaFileService();
    mockMobileAppCategoryConstantService = new MockMobileAppCategoryConstantService();
    mockMobileDeviceConstantService = new MockMobileDeviceConstantService();
    mockOperatingSystemVersionConstantService = new MockOperatingSystemVersionConstantService();
    mockParentalStatusViewService = new MockParentalStatusViewService();
    mockPaymentsAccountService = new MockPaymentsAccountService();
    mockProductGroupViewService = new MockProductGroupViewService();
    mockRecommendationService = new MockRecommendationService();
    mockRemarketingActionService = new MockRemarketingActionService();
    mockSearchTermViewService = new MockSearchTermViewService();
    mockTopicConstantService = new MockTopicConstantService();
    mockTopicViewService = new MockTopicViewService();
    mockUserInterestService = new MockUserInterestService();
    mockVideoService = new MockVideoService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1",
            Arrays.<MockGrpcService>asList(
                mockAccountBudgetProposalService,
                mockAccountBudgetService,
                mockAdGroupAdService,
                mockAdGroupAudienceViewService,
                mockAdGroupBidModifierService,
                mockAdGroupCriterionService,
                mockAdGroupFeedService,
                mockAdGroupService,
                mockAdParameterService,
                mockAdScheduleViewService,
                mockAgeRangeViewService,
                mockBiddingStrategyService,
                mockBillingSetupService,
                mockCampaignAudienceViewService,
                mockCampaignBidModifierService,
                mockCampaignBudgetService,
                mockCampaignCriterionService,
                mockCampaignFeedService,
                mockCampaignService,
                mockCampaignSharedSetService,
                mockCarrierConstantService,
                mockChangeStatusService,
                mockConversionActionService,
                mockCustomerClientLinkService,
                mockCustomerClientService,
                mockCustomerFeedService,
                mockCustomerManagerLinkService,
                mockCustomerService,
                mockDisplayKeywordViewService,
                mockFeedItemService,
                mockFeedMappingService,
                mockFeedService,
                mockGenderViewService,
                mockGeoTargetConstantService,
                mockGoogleAdsFieldService,
                mockSharedCriterionService,
                mockSharedSetService,
                mockUserListService,
                mockGoogleAdsService,
                mockHotelGroupViewService,
                mockHotelPerformanceViewService,
                mockKeywordPlanAdGroupService,
                mockKeywordPlanCampaignService,
                mockKeywordPlanIdeaService,
                mockKeywordPlanKeywordService,
                mockKeywordPlanNegativeKeywordService,
                mockKeywordPlanService,
                mockKeywordViewService,
                mockLanguageConstantService,
                mockManagedPlacementViewService,
                mockMediaFileService,
                mockMobileAppCategoryConstantService,
                mockMobileDeviceConstantService,
                mockOperatingSystemVersionConstantService,
                mockParentalStatusViewService,
                mockPaymentsAccountService,
                mockProductGroupViewService,
                mockRecommendationService,
                mockRemarketingActionService,
                mockSearchTermViewService,
                mockTopicConstantService,
                mockTopicViewService,
                mockUserInterestService,
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
    GoogleAdsServiceSettings settings =
        GoogleAdsServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = GoogleAdsServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void searchTest() {
    String nextPageToken = "";
    long totalResultsCount = 43694645L;
    GoogleAdsRow resultsElement = GoogleAdsRow.newBuilder().build();
    List<GoogleAdsRow> results = Arrays.asList(resultsElement);
    SearchGoogleAdsResponse expectedResponse =
        SearchGoogleAdsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .setTotalResultsCount(totalResultsCount)
            .addAllResults(results)
            .build();
    mockGoogleAdsService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    String query = "query107944136";
    boolean validateOnly = false;

    SearchPagedResponse pagedListResponse = client.search(customerId, query, validateOnly);

    List<GoogleAdsRow> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockGoogleAdsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchGoogleAdsRequest actualRequest = (SearchGoogleAdsRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(query, actualRequest.getQuery());
    Assert.assertEquals(validateOnly, actualRequest.getValidateOnly());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void searchExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockGoogleAdsService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      String query = "query107944136";
      boolean validateOnly = false;

      client.search(customerId, query, validateOnly);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void searchTest2() {
    String nextPageToken = "";
    long totalResultsCount = 43694645L;
    GoogleAdsRow resultsElement = GoogleAdsRow.newBuilder().build();
    List<GoogleAdsRow> results = Arrays.asList(resultsElement);
    SearchGoogleAdsResponse expectedResponse =
        SearchGoogleAdsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .setTotalResultsCount(totalResultsCount)
            .addAllResults(results)
            .build();
    mockGoogleAdsService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    String query = "query107944136";

    SearchPagedResponse pagedListResponse = client.search(customerId, query);

    List<GoogleAdsRow> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockGoogleAdsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchGoogleAdsRequest actualRequest = (SearchGoogleAdsRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(query, actualRequest.getQuery());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void searchExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockGoogleAdsService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      String query = "query107944136";

      client.search(customerId, query);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateTest() {
    MutateGoogleAdsResponse expectedResponse = MutateGoogleAdsResponse.newBuilder().build();
    mockGoogleAdsService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<MutateOperation> mutateOperations = new ArrayList<>();
    boolean partialFailure = true;
    boolean validateOnly = false;

    MutateGoogleAdsResponse actualResponse =
        client.mutate(customerId, mutateOperations, partialFailure, validateOnly);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockGoogleAdsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateGoogleAdsRequest actualRequest = (MutateGoogleAdsRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(mutateOperations, actualRequest.getMutateOperationsList());
    Assert.assertEquals(partialFailure, actualRequest.getPartialFailure());
    Assert.assertEquals(validateOnly, actualRequest.getValidateOnly());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockGoogleAdsService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<MutateOperation> mutateOperations = new ArrayList<>();
      boolean partialFailure = true;
      boolean validateOnly = false;

      client.mutate(customerId, mutateOperations, partialFailure, validateOnly);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void mutateTest2() {
    MutateGoogleAdsResponse expectedResponse = MutateGoogleAdsResponse.newBuilder().build();
    mockGoogleAdsService.addResponse(expectedResponse);

    String customerId = "customerId-1772061412";
    List<MutateOperation> mutateOperations = new ArrayList<>();

    MutateGoogleAdsResponse actualResponse = client.mutate(customerId, mutateOperations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockGoogleAdsService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateGoogleAdsRequest actualRequest = (MutateGoogleAdsRequest) actualRequests.get(0);

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(mutateOperations, actualRequest.getMutateOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void mutateExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockGoogleAdsService.addException(exception);

    try {
      String customerId = "customerId-1772061412";
      List<MutateOperation> mutateOperations = new ArrayList<>();

      client.mutate(customerId, mutateOperations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
