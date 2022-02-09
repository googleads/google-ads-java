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

package com.google.ads.googleads.v10.services;

import com.google.ads.googleads.lib.stubs.annotations.ServiceClientDescriptor;
import com.google.ads.googleads.lib.stubs.annotations.VersionDescriptor;
import com.google.ads.googleads.v10.errors.GoogleAdsException;

@VersionDescriptor(versionName = "v10",
    googleAdsExceptionFactory = GoogleAdsException.Factory.class)
public interface GoogleAdsVersion {
 
        @ServiceClientDescriptor(settingsClass = AccountBudgetProposalServiceSettings.class)
        AccountBudgetProposalServiceClient createAccountBudgetProposalServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AccountLinkServiceSettings.class)
        AccountLinkServiceClient createAccountLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupAdLabelServiceSettings.class)
        AdGroupAdLabelServiceClient createAdGroupAdLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupAdServiceSettings.class)
        AdGroupAdServiceClient createAdGroupAdServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupAssetServiceSettings.class)
        AdGroupAssetServiceClient createAdGroupAssetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupBidModifierServiceSettings.class)
        AdGroupBidModifierServiceClient createAdGroupBidModifierServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupCriterionCustomizerServiceSettings.class)
        AdGroupCriterionCustomizerServiceClient createAdGroupCriterionCustomizerServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupCriterionLabelServiceSettings.class)
        AdGroupCriterionLabelServiceClient createAdGroupCriterionLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupCriterionServiceSettings.class)
        AdGroupCriterionServiceClient createAdGroupCriterionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupCustomizerServiceSettings.class)
        AdGroupCustomizerServiceClient createAdGroupCustomizerServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupExtensionSettingServiceSettings.class)
        AdGroupExtensionSettingServiceClient createAdGroupExtensionSettingServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupFeedServiceSettings.class)
        AdGroupFeedServiceClient createAdGroupFeedServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupLabelServiceSettings.class)
        AdGroupLabelServiceClient createAdGroupLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdGroupServiceSettings.class)
        AdGroupServiceClient createAdGroupServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdParameterServiceSettings.class)
        AdParameterServiceClient createAdParameterServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AdServiceSettings.class)
        AdServiceClient createAdServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AssetGroupAssetServiceSettings.class)
        AssetGroupAssetServiceClient createAssetGroupAssetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AssetGroupListingGroupFilterServiceSettings.class)
        AssetGroupListingGroupFilterServiceClient createAssetGroupListingGroupFilterServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AssetGroupServiceSettings.class)
        AssetGroupServiceClient createAssetGroupServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AssetGroupSignalServiceSettings.class)
        AssetGroupSignalServiceClient createAssetGroupSignalServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AssetServiceSettings.class)
        AssetServiceClient createAssetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AssetSetAssetServiceSettings.class)
        AssetSetAssetServiceClient createAssetSetAssetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AssetSetServiceSettings.class)
        AssetSetServiceClient createAssetSetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = AudienceServiceSettings.class)
        AudienceServiceClient createAudienceServiceClient();
         
        @ServiceClientDescriptor(settingsClass = BatchJobServiceSettings.class)
        BatchJobServiceClient createBatchJobServiceClient();
         
        @ServiceClientDescriptor(settingsClass = BiddingDataExclusionServiceSettings.class)
        BiddingDataExclusionServiceClient createBiddingDataExclusionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = BiddingSeasonalityAdjustmentServiceSettings.class)
        BiddingSeasonalityAdjustmentServiceClient createBiddingSeasonalityAdjustmentServiceClient();
         
        @ServiceClientDescriptor(settingsClass = BiddingStrategyServiceSettings.class)
        BiddingStrategyServiceClient createBiddingStrategyServiceClient();
         
        @ServiceClientDescriptor(settingsClass = BillingSetupServiceSettings.class)
        BillingSetupServiceClient createBillingSetupServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignAssetServiceSettings.class)
        CampaignAssetServiceClient createCampaignAssetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignAssetSetServiceSettings.class)
        CampaignAssetSetServiceClient createCampaignAssetSetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignBidModifierServiceSettings.class)
        CampaignBidModifierServiceClient createCampaignBidModifierServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignBudgetServiceSettings.class)
        CampaignBudgetServiceClient createCampaignBudgetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignConversionGoalServiceSettings.class)
        CampaignConversionGoalServiceClient createCampaignConversionGoalServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignCriterionServiceSettings.class)
        CampaignCriterionServiceClient createCampaignCriterionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CampaignCustomizerServiceSettings.class)
        CampaignCustomizerServiceClient createCampaignCustomizerServiceClient();
         
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
         
        @ServiceClientDescriptor(settingsClass = ConversionActionServiceSettings.class)
        ConversionActionServiceClient createConversionActionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ConversionAdjustmentUploadServiceSettings.class)
        ConversionAdjustmentUploadServiceClient createConversionAdjustmentUploadServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ConversionCustomVariableServiceSettings.class)
        ConversionCustomVariableServiceClient createConversionCustomVariableServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ConversionGoalCampaignConfigServiceSettings.class)
        ConversionGoalCampaignConfigServiceClient createConversionGoalCampaignConfigServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ConversionUploadServiceSettings.class)
        ConversionUploadServiceClient createConversionUploadServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ConversionValueRuleServiceSettings.class)
        ConversionValueRuleServiceClient createConversionValueRuleServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ConversionValueRuleSetServiceSettings.class)
        ConversionValueRuleSetServiceClient createConversionValueRuleSetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomAudienceServiceSettings.class)
        CustomAudienceServiceClient createCustomAudienceServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomConversionGoalServiceSettings.class)
        CustomConversionGoalServiceClient createCustomConversionGoalServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomInterestServiceSettings.class)
        CustomInterestServiceClient createCustomInterestServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerAssetServiceSettings.class)
        CustomerAssetServiceClient createCustomerAssetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerClientLinkServiceSettings.class)
        CustomerClientLinkServiceClient createCustomerClientLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerConversionGoalServiceSettings.class)
        CustomerConversionGoalServiceClient createCustomerConversionGoalServiceClient();
         
        @ServiceClientDescriptor(settingsClass = CustomerCustomizerServiceSettings.class)
        CustomerCustomizerServiceClient createCustomerCustomizerServiceClient();
         
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
         
        @ServiceClientDescriptor(settingsClass = CustomizerAttributeServiceSettings.class)
        CustomizerAttributeServiceClient createCustomizerAttributeServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ExperimentArmServiceSettings.class)
        ExperimentArmServiceClient createExperimentArmServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ExperimentServiceSettings.class)
        ExperimentServiceClient createExperimentServiceClient();
         
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
         
        @ServiceClientDescriptor(settingsClass = FeedServiceSettings.class)
        FeedServiceClient createFeedServiceClient();
         
        @ServiceClientDescriptor(settingsClass = GeoTargetConstantServiceSettings.class)
        GeoTargetConstantServiceClient createGeoTargetConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = GoogleAdsFieldServiceSettings.class)
        GoogleAdsFieldServiceClient createGoogleAdsFieldServiceClient();
         
        @ServiceClientDescriptor(settingsClass = GoogleAdsServiceSettings.class)
        GoogleAdsServiceClient createGoogleAdsServiceClient();
         
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
         
        @ServiceClientDescriptor(settingsClass = KeywordThemeConstantServiceSettings.class)
        KeywordThemeConstantServiceClient createKeywordThemeConstantServiceClient();
         
        @ServiceClientDescriptor(settingsClass = LabelServiceSettings.class)
        LabelServiceClient createLabelServiceClient();
         
        @ServiceClientDescriptor(settingsClass = MediaFileServiceSettings.class)
        MediaFileServiceClient createMediaFileServiceClient();
         
        @ServiceClientDescriptor(settingsClass = MerchantCenterLinkServiceSettings.class)
        MerchantCenterLinkServiceClient createMerchantCenterLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = OfflineUserDataJobServiceSettings.class)
        OfflineUserDataJobServiceClient createOfflineUserDataJobServiceClient();
         
        @ServiceClientDescriptor(settingsClass = PaymentsAccountServiceSettings.class)
        PaymentsAccountServiceClient createPaymentsAccountServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ReachPlanServiceSettings.class)
        ReachPlanServiceClient createReachPlanServiceClient();
         
        @ServiceClientDescriptor(settingsClass = RecommendationServiceSettings.class)
        RecommendationServiceClient createRecommendationServiceClient();
         
        @ServiceClientDescriptor(settingsClass = RemarketingActionServiceSettings.class)
        RemarketingActionServiceClient createRemarketingActionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = SharedCriterionServiceSettings.class)
        SharedCriterionServiceClient createSharedCriterionServiceClient();
         
        @ServiceClientDescriptor(settingsClass = SharedSetServiceSettings.class)
        SharedSetServiceClient createSharedSetServiceClient();
         
        @ServiceClientDescriptor(settingsClass = SmartCampaignSettingServiceSettings.class)
        SmartCampaignSettingServiceClient createSmartCampaignSettingServiceClient();
         
        @ServiceClientDescriptor(settingsClass = SmartCampaignSuggestServiceSettings.class)
        SmartCampaignSuggestServiceClient createSmartCampaignSuggestServiceClient();
         
        @ServiceClientDescriptor(settingsClass = ThirdPartyAppAnalyticsLinkServiceSettings.class)
        ThirdPartyAppAnalyticsLinkServiceClient createThirdPartyAppAnalyticsLinkServiceClient();
         
        @ServiceClientDescriptor(settingsClass = UserDataServiceSettings.class)
        UserDataServiceClient createUserDataServiceClient();
         
        @ServiceClientDescriptor(settingsClass = UserListServiceSettings.class)
        UserListServiceClient createUserListServiceClient();
        
}
