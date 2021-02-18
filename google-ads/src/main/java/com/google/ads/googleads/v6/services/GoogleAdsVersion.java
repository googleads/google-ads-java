// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.lib.catalog.annotation.ServiceClientDescriptor;
import com.google.ads.googleads.annotations.api.VersionDescriptor;
import com.google.ads.googleads.v6.errors.GoogleAdsException;

@VersionDescriptor(versionName = "v6",
    googleAdsExceptionFactory = GoogleAdsException.Factory.class)
public interface GoogleAdsVersion {
 
        @ServiceClientDescriptor(settingsClass = AccountBudgetProposalServiceSettings.class)
        AccountBudgetProposalServiceClient createAccountBudgetProposalServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AccountBudgetServiceSettings.class)
        AccountBudgetServiceClient createAccountBudgetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AccountLinkServiceSettings.class)
        AccountLinkServiceClient createAccountLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupAdAssetViewServiceSettings.class)
        AdGroupAdAssetViewServiceClient createAdGroupAdAssetViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupAdLabelServiceSettings.class)
        AdGroupAdLabelServiceClient createAdGroupAdLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupAdServiceSettings.class)
        AdGroupAdServiceClient createAdGroupAdServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupAudienceViewServiceSettings.class)
        AdGroupAudienceViewServiceClient createAdGroupAudienceViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupBidModifierServiceSettings.class)
        AdGroupBidModifierServiceClient createAdGroupBidModifierServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupCriterionLabelServiceSettings.class)
        AdGroupCriterionLabelServiceClient createAdGroupCriterionLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupCriterionServiceSettings.class)
        AdGroupCriterionServiceClient createAdGroupCriterionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupCriterionSimulationServiceSettings.class)
        AdGroupCriterionSimulationServiceClient createAdGroupCriterionSimulationServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupExtensionSettingServiceSettings.class)
        AdGroupExtensionSettingServiceClient createAdGroupExtensionSettingServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupFeedServiceSettings.class)
        AdGroupFeedServiceClient createAdGroupFeedServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupLabelServiceSettings.class)
        AdGroupLabelServiceClient createAdGroupLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupServiceSettings.class)
        AdGroupServiceClient createAdGroupServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupSimulationServiceSettings.class)
        AdGroupSimulationServiceClient createAdGroupSimulationServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdParameterServiceSettings.class)
        AdParameterServiceClient createAdParameterServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdScheduleViewServiceSettings.class)
        AdScheduleViewServiceClient createAdScheduleViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdServiceSettings.class)
        AdServiceClient createAdServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AgeRangeViewServiceSettings.class)
        AgeRangeViewServiceClient createAgeRangeViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AssetServiceSettings.class)
        AssetServiceClient createAssetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = BatchJobServiceSettings.class)
        BatchJobServiceClient createBatchJobServiceClient();
         
        @ServiceClientDescriptor(settingsClass = BiddingStrategyServiceSettings.class)
        BiddingStrategyServiceClient createBiddingStrategyServiceClient();
         
        @ServiceClientDescriptor(settingsClass = BillingSetupServiceSettings.class)
        BillingSetupServiceClient createBillingSetupServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignAssetServiceSettings.class)
        CampaignAssetServiceClient createCampaignAssetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignAudienceViewServiceSettings.class)
        CampaignAudienceViewServiceClient createCampaignAudienceViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignBidModifierServiceSettings.class)
        CampaignBidModifierServiceClient createCampaignBidModifierServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignBudgetServiceSettings.class)
        CampaignBudgetServiceClient createCampaignBudgetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignCriterionServiceSettings.class)
        CampaignCriterionServiceClient createCampaignCriterionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignCriterionSimulationServiceSettings.class)
        CampaignCriterionSimulationServiceClient createCampaignCriterionSimulationServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignDraftServiceSettings.class)
        CampaignDraftServiceClient createCampaignDraftServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignExperimentServiceSettings.class)
        CampaignExperimentServiceClient createCampaignExperimentServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignExtensionSettingServiceSettings.class)
        CampaignExtensionSettingServiceClient createCampaignExtensionSettingServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignFeedServiceSettings.class)
        CampaignFeedServiceClient createCampaignFeedServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignLabelServiceSettings.class)
        CampaignLabelServiceClient createCampaignLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignServiceSettings.class)
        CampaignServiceClient createCampaignServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignSharedSetServiceSettings.class)
        CampaignSharedSetServiceClient createCampaignSharedSetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CarrierConstantServiceSettings.class)
        CarrierConstantServiceClient createCarrierConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ChangeStatusServiceSettings.class)
        ChangeStatusServiceClient createChangeStatusServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ClickViewServiceSettings.class)
        ClickViewServiceClient createClickViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CombinedAudienceServiceSettings.class)
        CombinedAudienceServiceClient createCombinedAudienceServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ConversionActionServiceSettings.class)
        ConversionActionServiceClient createConversionActionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ConversionAdjustmentUploadServiceSettings.class)
        ConversionAdjustmentUploadServiceClient createConversionAdjustmentUploadServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ConversionUploadServiceSettings.class)
        ConversionUploadServiceClient createConversionUploadServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CurrencyConstantServiceSettings.class)
        CurrencyConstantServiceClient createCurrencyConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomAudienceServiceSettings.class)
        CustomAudienceServiceClient createCustomAudienceServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomInterestServiceSettings.class)
        CustomInterestServiceClient createCustomInterestServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerClientLinkServiceSettings.class)
        CustomerClientLinkServiceClient createCustomerClientLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerClientServiceSettings.class)
        CustomerClientServiceClient createCustomerClientServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerExtensionSettingServiceSettings.class)
        CustomerExtensionSettingServiceClient createCustomerExtensionSettingServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerFeedServiceSettings.class)
        CustomerFeedServiceClient createCustomerFeedServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerLabelServiceSettings.class)
        CustomerLabelServiceClient createCustomerLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerManagerLinkServiceSettings.class)
        CustomerManagerLinkServiceClient createCustomerManagerLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerNegativeCriterionServiceSettings.class)
        CustomerNegativeCriterionServiceClient createCustomerNegativeCriterionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerServiceSettings.class)
        CustomerServiceClient createCustomerServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerUserAccessInvitationServiceSettings.class)
        CustomerUserAccessInvitationServiceClient createCustomerUserAccessInvitationServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerUserAccessServiceSettings.class)
        CustomerUserAccessServiceClient createCustomerUserAccessServiceClient();
         
        @ServiceClientDescriptor(settingsClass = DetailPlacementViewServiceSettings.class)
        DetailPlacementViewServiceClient createDetailPlacementViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = DisplayKeywordViewServiceSettings.class)
        DisplayKeywordViewServiceClient createDisplayKeywordViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = DistanceViewServiceSettings.class)
        DistanceViewServiceClient createDistanceViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = DomainCategoryServiceSettings.class)
        DomainCategoryServiceClient createDomainCategoryServiceClient();
         
        @ServiceClientDescriptor(settingsClass = DynamicSearchAdsSearchTermViewServiceSettings.class)
        DynamicSearchAdsSearchTermViewServiceClient createDynamicSearchAdsSearchTermViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ExpandedLandingPageViewServiceSettings.class)
        ExpandedLandingPageViewServiceClient createExpandedLandingPageViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ExtensionFeedItemServiceSettings.class)
        ExtensionFeedItemServiceClient createExtensionFeedItemServiceClient();
         
        @ServiceClientDescriptor(settingsClass = FeedItemServiceSettings.class)
        FeedItemServiceClient createFeedItemServiceClient();
         
        @ServiceClientDescriptor(settingsClass = FeedItemSetLinkServiceSettings.class)
        FeedItemSetLinkServiceClient createFeedItemSetLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = FeedItemSetServiceSettings.class)
        FeedItemSetServiceClient createFeedItemSetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = FeedItemTargetServiceSettings.class)
        FeedItemTargetServiceClient createFeedItemTargetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = FeedMappingServiceSettings.class)
        FeedMappingServiceClient createFeedMappingServiceClient();
         
        @ServiceClientDescriptor(settingsClass = FeedPlaceholderViewServiceSettings.class)
        FeedPlaceholderViewServiceClient createFeedPlaceholderViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = FeedServiceSettings.class)
        FeedServiceClient createFeedServiceClient();
         
        @ServiceClientDescriptor(settingsClass = GenderViewServiceSettings.class)
        GenderViewServiceClient createGenderViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = GeoTargetConstantServiceSettings.class)
        GeoTargetConstantServiceClient createGeoTargetConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = GeographicViewServiceSettings.class)
        GeographicViewServiceClient createGeographicViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = GoogleAdsFieldServiceSettings.class)
        GoogleAdsFieldServiceClient createGoogleAdsFieldServiceClient();
         
        @ServiceClientDescriptor(settingsClass = GoogleAdsServiceSettings.class)
        GoogleAdsServiceClient createGoogleAdsServiceClient();
         
        @ServiceClientDescriptor(settingsClass = GroupPlacementViewServiceSettings.class)
        GroupPlacementViewServiceClient createGroupPlacementViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = HotelGroupViewServiceSettings.class)
        HotelGroupViewServiceClient createHotelGroupViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = HotelPerformanceViewServiceSettings.class)
        HotelPerformanceViewServiceClient createHotelPerformanceViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = IncomeRangeViewServiceSettings.class)
        IncomeRangeViewServiceClient createIncomeRangeViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = InvoiceServiceSettings.class)
        InvoiceServiceClient createInvoiceServiceClient();
         
        @ServiceClientDescriptor(settingsClass = KeywordPlanAdGroupKeywordServiceSettings.class)
        KeywordPlanAdGroupKeywordServiceClient createKeywordPlanAdGroupKeywordServiceClient();
         
        @ServiceClientDescriptor(settingsClass = KeywordPlanAdGroupServiceSettings.class)
        KeywordPlanAdGroupServiceClient createKeywordPlanAdGroupServiceClient();
         
        @ServiceClientDescriptor(settingsClass = KeywordPlanCampaignKeywordServiceSettings.class)
        KeywordPlanCampaignKeywordServiceClient createKeywordPlanCampaignKeywordServiceClient();
         
        @ServiceClientDescriptor(settingsClass = KeywordPlanCampaignServiceSettings.class)
        KeywordPlanCampaignServiceClient createKeywordPlanCampaignServiceClient();
         
        @ServiceClientDescriptor(settingsClass = KeywordPlanIdeaServiceSettings.class)
        KeywordPlanIdeaServiceClient createKeywordPlanIdeaServiceClient();
         
        @ServiceClientDescriptor(settingsClass = KeywordPlanServiceSettings.class)
        KeywordPlanServiceClient createKeywordPlanServiceClient();
         
        @ServiceClientDescriptor(settingsClass = KeywordViewServiceSettings.class)
        KeywordViewServiceClient createKeywordViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = LabelServiceSettings.class)
        LabelServiceClient createLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = LandingPageViewServiceSettings.class)
        LandingPageViewServiceClient createLandingPageViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = LanguageConstantServiceSettings.class)
        LanguageConstantServiceClient createLanguageConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = LocationViewServiceSettings.class)
        LocationViewServiceClient createLocationViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ManagedPlacementViewServiceSettings.class)
        ManagedPlacementViewServiceClient createManagedPlacementViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = MediaFileServiceSettings.class)
        MediaFileServiceClient createMediaFileServiceClient();
         
        @ServiceClientDescriptor(settingsClass = MerchantCenterLinkServiceSettings.class)
        MerchantCenterLinkServiceClient createMerchantCenterLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = MobileAppCategoryConstantServiceSettings.class)
        MobileAppCategoryConstantServiceClient createMobileAppCategoryConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = MobileDeviceConstantServiceSettings.class)
        MobileDeviceConstantServiceClient createMobileDeviceConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = OfflineUserDataJobServiceSettings.class)
        OfflineUserDataJobServiceClient createOfflineUserDataJobServiceClient();
         
        @ServiceClientDescriptor(settingsClass = OperatingSystemVersionConstantServiceSettings.class)
        OperatingSystemVersionConstantServiceClient createOperatingSystemVersionConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = PaidOrganicSearchTermViewServiceSettings.class)
        PaidOrganicSearchTermViewServiceClient createPaidOrganicSearchTermViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ParentalStatusViewServiceSettings.class)
        ParentalStatusViewServiceClient createParentalStatusViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = PaymentsAccountServiceSettings.class)
        PaymentsAccountServiceClient createPaymentsAccountServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ProductBiddingCategoryConstantServiceSettings.class)
        ProductBiddingCategoryConstantServiceClient createProductBiddingCategoryConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ProductGroupViewServiceSettings.class)
        ProductGroupViewServiceClient createProductGroupViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ReachPlanServiceSettings.class)
        ReachPlanServiceClient createReachPlanServiceClient();
         
        @ServiceClientDescriptor(settingsClass = RecommendationServiceSettings.class)
        RecommendationServiceClient createRecommendationServiceClient();
         
        @ServiceClientDescriptor(settingsClass = RemarketingActionServiceSettings.class)
        RemarketingActionServiceClient createRemarketingActionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = SearchTermViewServiceSettings.class)
        SearchTermViewServiceClient createSearchTermViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = SharedCriterionServiceSettings.class)
        SharedCriterionServiceClient createSharedCriterionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = SharedSetServiceSettings.class)
        SharedSetServiceClient createSharedSetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ShoppingPerformanceViewServiceSettings.class)
        ShoppingPerformanceViewServiceClient createShoppingPerformanceViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ThirdPartyAppAnalyticsLinkServiceSettings.class)
        ThirdPartyAppAnalyticsLinkServiceClient createThirdPartyAppAnalyticsLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = TopicConstantServiceSettings.class)
        TopicConstantServiceClient createTopicConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = TopicViewServiceSettings.class)
        TopicViewServiceClient createTopicViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = UserDataServiceSettings.class)
        UserDataServiceClient createUserDataServiceClient();
         
        @ServiceClientDescriptor(settingsClass = UserInterestServiceSettings.class)
        UserInterestServiceClient createUserInterestServiceClient();
         
        @ServiceClientDescriptor(settingsClass = UserListServiceSettings.class)
        UserListServiceClient createUserListServiceClient();
         
        @ServiceClientDescriptor(settingsClass = UserLocationViewServiceSettings.class)
        UserLocationViewServiceClient createUserLocationViewServiceClient();
         
        @ServiceClientDescriptor(settingsClass = VideoServiceSettings.class)
        VideoServiceClient createVideoServiceClient();
        
}
