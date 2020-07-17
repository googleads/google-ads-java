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

package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.lib.catalog.annotation.ServiceClientDescriptor;
import com.google.ads.googleads.annotations.api.VersionDescriptor;
import com.google.ads.googleads.v1.errors.GoogleAdsException;

@VersionDescriptor(versionName = "v1", googleAdsExceptionFactory = GoogleAdsException.Factory.class)
public interface GoogleAdsVersion {

  @ServiceClientDescriptor(settingsClass = UserListServiceSettings.class)
  UserListServiceClient createUserListServiceClient();

  @ServiceClientDescriptor(settingsClass = GeoTargetConstantServiceSettings.class)
  GeoTargetConstantServiceClient createGeoTargetConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupCriterionServiceSettings.class)
  AdGroupCriterionServiceClient createAdGroupCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = ConversionAdjustmentUploadServiceSettings.class)
  ConversionAdjustmentUploadServiceClient createConversionAdjustmentUploadServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignFeedServiceSettings.class)
  CampaignFeedServiceClient createCampaignFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = AdParameterServiceSettings.class)
  AdParameterServiceClient createAdParameterServiceClient();

  @ServiceClientDescriptor(settingsClass = GenderViewServiceSettings.class)
  GenderViewServiceClient createGenderViewServiceClient();

  @ServiceClientDescriptor(settingsClass = ExpandedLandingPageViewServiceSettings.class)
  ExpandedLandingPageViewServiceClient createExpandedLandingPageViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignBudgetServiceSettings.class)
  CampaignBudgetServiceClient createCampaignBudgetServiceClient();

  @ServiceClientDescriptor(settingsClass = LabelServiceSettings.class)
  LabelServiceClient createLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = AdScheduleViewServiceSettings.class)
  AdScheduleViewServiceClient createAdScheduleViewServiceClient();

  @ServiceClientDescriptor(settingsClass = ManagedPlacementViewServiceSettings.class)
  ManagedPlacementViewServiceClient createManagedPlacementViewServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanCampaignServiceSettings.class)
  KeywordPlanCampaignServiceClient createKeywordPlanCampaignServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupCriterionSimulationServiceSettings.class)
  AdGroupCriterionSimulationServiceClient createAdGroupCriterionSimulationServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerFeedServiceSettings.class)
  CustomerFeedServiceClient createCustomerFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedServiceSettings.class)
  FeedServiceClient createFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedPlaceholderViewServiceSettings.class)
  FeedPlaceholderViewServiceClient createFeedPlaceholderViewServiceClient();

  @ServiceClientDescriptor(settingsClass = MobileAppCategoryConstantServiceSettings.class)
  MobileAppCategoryConstantServiceClient createMobileAppCategoryConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedItemTargetServiceSettings.class)
  FeedItemTargetServiceClient createFeedItemTargetServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupSimulationServiceSettings.class)
  AdGroupSimulationServiceClient createAdGroupSimulationServiceClient();

  @ServiceClientDescriptor(settingsClass = SharedCriterionServiceSettings.class)
  SharedCriterionServiceClient createSharedCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanAdGroupServiceSettings.class)
  KeywordPlanAdGroupServiceClient createKeywordPlanAdGroupServiceClient();

  @ServiceClientDescriptor(settingsClass = LocationViewServiceSettings.class)
  LocationViewServiceClient createLocationViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CarrierConstantServiceSettings.class)
  CarrierConstantServiceClient createCarrierConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = AgeRangeViewServiceSettings.class)
  AgeRangeViewServiceClient createAgeRangeViewServiceClient();

  @ServiceClientDescriptor(settingsClass = DisplayKeywordViewServiceSettings.class)
  DisplayKeywordViewServiceClient createDisplayKeywordViewServiceClient();

  @ServiceClientDescriptor(settingsClass = DetailPlacementViewServiceSettings.class)
  DetailPlacementViewServiceClient createDetailPlacementViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignCriterionServiceSettings.class)
  CampaignCriterionServiceClient createCampaignCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = TopicConstantServiceSettings.class)
  TopicConstantServiceClient createTopicConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = BiddingStrategyServiceSettings.class)
  BiddingStrategyServiceClient createBiddingStrategyServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignAudienceViewServiceSettings.class)
  CampaignAudienceViewServiceClient createCampaignAudienceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = GoogleAdsServiceSettings.class)
  GoogleAdsServiceClient createGoogleAdsServiceClient();

  @ServiceClientDescriptor(settingsClass = RemarketingActionServiceSettings.class)
  RemarketingActionServiceClient createRemarketingActionServiceClient();

  @ServiceClientDescriptor(settingsClass = ProductGroupViewServiceSettings.class)
  ProductGroupViewServiceClient createProductGroupViewServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanServiceSettings.class)
  KeywordPlanServiceClient createKeywordPlanServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomInterestServiceSettings.class)
  CustomInterestServiceClient createCustomInterestServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupServiceSettings.class)
  AdGroupServiceClient createAdGroupServiceClient();

  @ServiceClientDescriptor(settingsClass = UserInterestServiceSettings.class)
  UserInterestServiceClient createUserInterestServiceClient();

  @ServiceClientDescriptor(settingsClass = AssetServiceSettings.class)
  AssetServiceClient createAssetServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupCriterionLabelServiceSettings.class)
  AdGroupCriterionLabelServiceClient createAdGroupCriterionLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = PaidOrganicSearchTermViewServiceSettings.class)
  PaidOrganicSearchTermViewServiceClient createPaidOrganicSearchTermViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerNegativeCriterionServiceSettings.class)
  CustomerNegativeCriterionServiceClient createCustomerNegativeCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = ConversionUploadServiceSettings.class)
  ConversionUploadServiceClient createConversionUploadServiceClient();

  @ServiceClientDescriptor(settingsClass = ShoppingPerformanceViewServiceSettings.class)
  ShoppingPerformanceViewServiceClient createShoppingPerformanceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = MediaFileServiceSettings.class)
  MediaFileServiceClient createMediaFileServiceClient();

  @ServiceClientDescriptor(settingsClass = MerchantCenterLinkServiceSettings.class)
  MerchantCenterLinkServiceClient createMerchantCenterLinkServiceClient();

  @ServiceClientDescriptor(settingsClass = MobileDeviceConstantServiceSettings.class)
  MobileDeviceConstantServiceClient createMobileDeviceConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignLabelServiceSettings.class)
  CampaignLabelServiceClient createCampaignLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordViewServiceSettings.class)
  KeywordViewServiceClient createKeywordViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerClientServiceSettings.class)
  CustomerClientServiceClient createCustomerClientServiceClient();

  @ServiceClientDescriptor(settingsClass = MutateJobServiceSettings.class)
  MutateJobServiceClient createMutateJobServiceClient();

  @ServiceClientDescriptor(settingsClass = VideoServiceSettings.class)
  VideoServiceClient createVideoServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignDraftServiceSettings.class)
  CampaignDraftServiceClient createCampaignDraftServiceClient();

  @ServiceClientDescriptor(settingsClass = ClickViewServiceSettings.class)
  ClickViewServiceClient createClickViewServiceClient();

  @ServiceClientDescriptor(settingsClass = PaymentsAccountServiceSettings.class)
  PaymentsAccountServiceClient createPaymentsAccountServiceClient();

  @ServiceClientDescriptor(settingsClass = ExtensionFeedItemServiceSettings.class)
  ExtensionFeedItemServiceClient createExtensionFeedItemServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanIdeaServiceSettings.class)
  KeywordPlanIdeaServiceClient createKeywordPlanIdeaServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupFeedServiceSettings.class)
  AdGroupFeedServiceClient createAdGroupFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = SearchTermViewServiceSettings.class)
  SearchTermViewServiceClient createSearchTermViewServiceClient();

  @ServiceClientDescriptor(settingsClass = LanguageConstantServiceSettings.class)
  LanguageConstantServiceClient createLanguageConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignExtensionSettingServiceSettings.class)
  CampaignExtensionSettingServiceClient createCampaignExtensionSettingServiceClient();

  @ServiceClientDescriptor(settingsClass = AccountBudgetProposalServiceSettings.class)
  AccountBudgetProposalServiceClient createAccountBudgetProposalServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignCriterionSimulationServiceSettings.class)
  CampaignCriterionSimulationServiceClient createCampaignCriterionSimulationServiceClient();

  @ServiceClientDescriptor(settingsClass = GoogleAdsFieldServiceSettings.class)
  GoogleAdsFieldServiceClient createGoogleAdsFieldServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignServiceSettings.class)
  CampaignServiceClient createCampaignServiceClient();

  @ServiceClientDescriptor(settingsClass = HotelPerformanceViewServiceSettings.class)
  HotelPerformanceViewServiceClient createHotelPerformanceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = ProductBiddingCategoryConstantServiceSettings.class)
  ProductBiddingCategoryConstantServiceClient createProductBiddingCategoryConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanKeywordServiceSettings.class)
  KeywordPlanKeywordServiceClient createKeywordPlanKeywordServiceClient();

  @ServiceClientDescriptor(settingsClass = ChangeStatusServiceSettings.class)
  ChangeStatusServiceClient createChangeStatusServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupExtensionSettingServiceSettings.class)
  AdGroupExtensionSettingServiceClient createAdGroupExtensionSettingServiceClient();

  @ServiceClientDescriptor(settingsClass = RecommendationServiceSettings.class)
  RecommendationServiceClient createRecommendationServiceClient();

  @ServiceClientDescriptor(settingsClass = TopicViewServiceSettings.class)
  TopicViewServiceClient createTopicViewServiceClient();

  @ServiceClientDescriptor(settingsClass = LandingPageViewServiceSettings.class)
  LandingPageViewServiceClient createLandingPageViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignSharedSetServiceSettings.class)
  CampaignSharedSetServiceClient createCampaignSharedSetServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedMappingServiceSettings.class)
  FeedMappingServiceClient createFeedMappingServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerExtensionSettingServiceSettings.class)
  CustomerExtensionSettingServiceClient createCustomerExtensionSettingServiceClient();

  @ServiceClientDescriptor(settingsClass = DynamicSearchAdsSearchTermViewServiceSettings.class)
  DynamicSearchAdsSearchTermViewServiceClient createDynamicSearchAdsSearchTermViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerLabelServiceSettings.class)
  CustomerLabelServiceClient createCustomerLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = DomainCategoryServiceSettings.class)
  DomainCategoryServiceClient createDomainCategoryServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedItemServiceSettings.class)
  FeedItemServiceClient createFeedItemServiceClient();

  @ServiceClientDescriptor(settingsClass = BillingSetupServiceSettings.class)
  BillingSetupServiceClient createBillingSetupServiceClient();

  @ServiceClientDescriptor(settingsClass = GroupPlacementViewServiceSettings.class)
  GroupPlacementViewServiceClient createGroupPlacementViewServiceClient();

  @ServiceClientDescriptor(settingsClass = ConversionActionServiceSettings.class)
  ConversionActionServiceClient createConversionActionServiceClient();

  @ServiceClientDescriptor(settingsClass = AccountBudgetServiceSettings.class)
  AccountBudgetServiceClient createAccountBudgetServiceClient();

  @ServiceClientDescriptor(settingsClass = SharedSetServiceSettings.class)
  SharedSetServiceClient createSharedSetServiceClient();

  @ServiceClientDescriptor(settingsClass = ParentalStatusViewServiceSettings.class)
  ParentalStatusViewServiceClient createParentalStatusViewServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupLabelServiceSettings.class)
  AdGroupLabelServiceClient createAdGroupLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAdLabelServiceSettings.class)
  AdGroupAdLabelServiceClient createAdGroupAdLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerServiceSettings.class)
  CustomerServiceClient createCustomerServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerManagerLinkServiceSettings.class)
  CustomerManagerLinkServiceClient createCustomerManagerLinkServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignBidModifierServiceSettings.class)
  CampaignBidModifierServiceClient createCampaignBidModifierServiceClient();

  @ServiceClientDescriptor(settingsClass = OperatingSystemVersionConstantServiceSettings.class)
  OperatingSystemVersionConstantServiceClient createOperatingSystemVersionConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = GeographicViewServiceSettings.class)
  GeographicViewServiceClient createGeographicViewServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanNegativeKeywordServiceSettings.class)
  KeywordPlanNegativeKeywordServiceClient createKeywordPlanNegativeKeywordServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignExperimentServiceSettings.class)
  CampaignExperimentServiceClient createCampaignExperimentServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAdServiceSettings.class)
  AdGroupAdServiceClient createAdGroupAdServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupBidModifierServiceSettings.class)
  AdGroupBidModifierServiceClient createAdGroupBidModifierServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerClientLinkServiceSettings.class)
  CustomerClientLinkServiceClient createCustomerClientLinkServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAudienceViewServiceSettings.class)
  AdGroupAudienceViewServiceClient createAdGroupAudienceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = HotelGroupViewServiceSettings.class)
  HotelGroupViewServiceClient createHotelGroupViewServiceClient();
}
