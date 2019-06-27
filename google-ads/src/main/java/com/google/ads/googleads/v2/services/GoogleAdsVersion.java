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

package com.google.ads.googleads.v2.services;

import com.google.ads.googleads.lib.catalog.annotation.ServiceClientDescriptor;
import com.google.ads.googleads.lib.catalog.annotation.VersionDescriptor;
import com.google.ads.googleads.v2.errors.GoogleAdsException;

@VersionDescriptor(versionName = "v2", googleAdsExceptionFactory = GoogleAdsException.Factory.class)
public interface GoogleAdsVersion {

  @ServiceClientDescriptor(settingsClass = CustomerNegativeCriterionServiceSettings.class)
  CustomerNegativeCriterionServiceClient createCustomerNegativeCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = LabelServiceSettings.class)
  LabelServiceClient createLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupSimulationServiceSettings.class)
  AdGroupSimulationServiceClient createAdGroupSimulationServiceClient();

  @ServiceClientDescriptor(settingsClass = LanguageConstantServiceSettings.class)
  LanguageConstantServiceClient createLanguageConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanAdGroupServiceSettings.class)
  KeywordPlanAdGroupServiceClient createKeywordPlanAdGroupServiceClient();

  @ServiceClientDescriptor(settingsClass = AgeRangeViewServiceSettings.class)
  AgeRangeViewServiceClient createAgeRangeViewServiceClient();

  @ServiceClientDescriptor(settingsClass = BillingSetupServiceSettings.class)
  BillingSetupServiceClient createBillingSetupServiceClient();

  @ServiceClientDescriptor(settingsClass = CarrierConstantServiceSettings.class)
  CarrierConstantServiceClient createCarrierConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanNegativeKeywordServiceSettings.class)
  KeywordPlanNegativeKeywordServiceClient createKeywordPlanNegativeKeywordServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignDraftServiceSettings.class)
  CampaignDraftServiceClient createCampaignDraftServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerLabelServiceSettings.class)
  CustomerLabelServiceClient createCustomerLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = GeoTargetConstantServiceSettings.class)
  GeoTargetConstantServiceClient createGeoTargetConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignExperimentServiceSettings.class)
  CampaignExperimentServiceClient createCampaignExperimentServiceClient();

  @ServiceClientDescriptor(settingsClass = ManagedPlacementViewServiceSettings.class)
  ManagedPlacementViewServiceClient createManagedPlacementViewServiceClient();

  @ServiceClientDescriptor(settingsClass = LandingPageViewServiceSettings.class)
  LandingPageViewServiceClient createLandingPageViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignCriterionServiceSettings.class)
  CampaignCriterionServiceClient createCampaignCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = SharedCriterionServiceSettings.class)
  SharedCriterionServiceClient createSharedCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = GeographicViewServiceSettings.class)
  GeographicViewServiceClient createGeographicViewServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanCampaignServiceSettings.class)
  KeywordPlanCampaignServiceClient createKeywordPlanCampaignServiceClient();

  @ServiceClientDescriptor(settingsClass = ProductGroupViewServiceSettings.class)
  ProductGroupViewServiceClient createProductGroupViewServiceClient();

  @ServiceClientDescriptor(settingsClass = UserListServiceSettings.class)
  UserListServiceClient createUserListServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupLabelServiceSettings.class)
  AdGroupLabelServiceClient createAdGroupLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedPlaceholderViewServiceSettings.class)
  FeedPlaceholderViewServiceClient createFeedPlaceholderViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignExtensionSettingServiceSettings.class)
  CampaignExtensionSettingServiceClient createCampaignExtensionSettingServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedMappingServiceSettings.class)
  FeedMappingServiceClient createFeedMappingServiceClient();

  @ServiceClientDescriptor(settingsClass = GoogleAdsFieldServiceSettings.class)
  GoogleAdsFieldServiceClient createGoogleAdsFieldServiceClient();

  @ServiceClientDescriptor(settingsClass = DistanceViewServiceSettings.class)
  DistanceViewServiceClient createDistanceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignBudgetServiceSettings.class)
  CampaignBudgetServiceClient createCampaignBudgetServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerClientServiceSettings.class)
  CustomerClientServiceClient createCustomerClientServiceClient();

  @ServiceClientDescriptor(settingsClass = ConversionActionServiceSettings.class)
  ConversionActionServiceClient createConversionActionServiceClient();

  @ServiceClientDescriptor(settingsClass = PaidOrganicSearchTermViewServiceSettings.class)
  PaidOrganicSearchTermViewServiceClient createPaidOrganicSearchTermViewServiceClient();

  @ServiceClientDescriptor(settingsClass = OperatingSystemVersionConstantServiceSettings.class)
  OperatingSystemVersionConstantServiceClient createOperatingSystemVersionConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = HotelPerformanceViewServiceSettings.class)
  HotelPerformanceViewServiceClient createHotelPerformanceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = AdParameterServiceSettings.class)
  AdParameterServiceClient createAdParameterServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerExtensionSettingServiceSettings.class)
  CustomerExtensionSettingServiceClient createCustomerExtensionSettingServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedItemServiceSettings.class)
  FeedItemServiceClient createFeedItemServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerClientLinkServiceSettings.class)
  CustomerClientLinkServiceClient createCustomerClientLinkServiceClient();

  @ServiceClientDescriptor(settingsClass = AccountBudgetServiceSettings.class)
  AccountBudgetServiceClient createAccountBudgetServiceClient();

  @ServiceClientDescriptor(settingsClass = ClickViewServiceSettings.class)
  ClickViewServiceClient createClickViewServiceClient();

  @ServiceClientDescriptor(settingsClass = BiddingStrategyServiceSettings.class)
  BiddingStrategyServiceClient createBiddingStrategyServiceClient();

  @ServiceClientDescriptor(settingsClass = HotelGroupViewServiceSettings.class)
  HotelGroupViewServiceClient createHotelGroupViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignBidModifierServiceSettings.class)
  CampaignBidModifierServiceClient createCampaignBidModifierServiceClient();

  @ServiceClientDescriptor(settingsClass = TopicConstantServiceSettings.class)
  TopicConstantServiceClient createTopicConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupBidModifierServiceSettings.class)
  AdGroupBidModifierServiceClient createAdGroupBidModifierServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerFeedServiceSettings.class)
  CustomerFeedServiceClient createCustomerFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = PaymentsAccountServiceSettings.class)
  PaymentsAccountServiceClient createPaymentsAccountServiceClient();

  @ServiceClientDescriptor(settingsClass = AssetServiceSettings.class)
  AssetServiceClient createAssetServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerManagerLinkServiceSettings.class)
  CustomerManagerLinkServiceClient createCustomerManagerLinkServiceClient();

  @ServiceClientDescriptor(settingsClass = ConversionUploadServiceSettings.class)
  ConversionUploadServiceClient createConversionUploadServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanKeywordServiceSettings.class)
  KeywordPlanKeywordServiceClient createKeywordPlanKeywordServiceClient();

  @ServiceClientDescriptor(settingsClass = RecommendationServiceSettings.class)
  RecommendationServiceClient createRecommendationServiceClient();

  @ServiceClientDescriptor(settingsClass = AccountBudgetProposalServiceSettings.class)
  AccountBudgetProposalServiceClient createAccountBudgetProposalServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignCriterionSimulationServiceSettings.class)
  CampaignCriterionSimulationServiceClient createCampaignCriterionSimulationServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupFeedServiceSettings.class)
  AdGroupFeedServiceClient createAdGroupFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignLabelServiceSettings.class)
  CampaignLabelServiceClient createCampaignLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = LocationViewServiceSettings.class)
  LocationViewServiceClient createLocationViewServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAudienceViewServiceSettings.class)
  AdGroupAudienceViewServiceClient createAdGroupAudienceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = UserInterestServiceSettings.class)
  UserInterestServiceClient createUserInterestServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanIdeaServiceSettings.class)
  KeywordPlanIdeaServiceClient createKeywordPlanIdeaServiceClient();

  @ServiceClientDescriptor(settingsClass = AdScheduleViewServiceSettings.class)
  AdScheduleViewServiceClient createAdScheduleViewServiceClient();

  @ServiceClientDescriptor(settingsClass = TopicViewServiceSettings.class)
  TopicViewServiceClient createTopicViewServiceClient();

  @ServiceClientDescriptor(settingsClass = DisplayKeywordViewServiceSettings.class)
  DisplayKeywordViewServiceClient createDisplayKeywordViewServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupCriterionSimulationServiceSettings.class)
  AdGroupCriterionSimulationServiceClient createAdGroupCriterionSimulationServiceClient();

  @ServiceClientDescriptor(settingsClass = ParentalStatusViewServiceSettings.class)
  ParentalStatusViewServiceClient createParentalStatusViewServiceClient();

  @ServiceClientDescriptor(settingsClass = MobileDeviceConstantServiceSettings.class)
  MobileDeviceConstantServiceClient createMobileDeviceConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupCriterionServiceSettings.class)
  AdGroupCriterionServiceClient createAdGroupCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignAudienceViewServiceSettings.class)
  CampaignAudienceViewServiceClient createCampaignAudienceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = ProductBiddingCategoryConstantServiceSettings.class)
  ProductBiddingCategoryConstantServiceClient createProductBiddingCategoryConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAdAssetViewServiceSettings.class)
  AdGroupAdAssetViewServiceClient createAdGroupAdAssetViewServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAdServiceSettings.class)
  AdGroupAdServiceClient createAdGroupAdServiceClient();

  @ServiceClientDescriptor(settingsClass = AdServiceSettings.class)
  AdServiceClient createAdServiceClient();

  @ServiceClientDescriptor(settingsClass = MediaFileServiceSettings.class)
  MediaFileServiceClient createMediaFileServiceClient();

  @ServiceClientDescriptor(settingsClass = ExpandedLandingPageViewServiceSettings.class)
  ExpandedLandingPageViewServiceClient createExpandedLandingPageViewServiceClient();

  @ServiceClientDescriptor(settingsClass = DetailPlacementViewServiceSettings.class)
  DetailPlacementViewServiceClient createDetailPlacementViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignFeedServiceSettings.class)
  CampaignFeedServiceClient createCampaignFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanServiceSettings.class)
  KeywordPlanServiceClient createKeywordPlanServiceClient();

  @ServiceClientDescriptor(settingsClass = MutateJobServiceSettings.class)
  MutateJobServiceClient createMutateJobServiceClient();

  @ServiceClientDescriptor(settingsClass = DomainCategoryServiceSettings.class)
  DomainCategoryServiceClient createDomainCategoryServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordViewServiceSettings.class)
  KeywordViewServiceClient createKeywordViewServiceClient();

  @ServiceClientDescriptor(settingsClass = MobileAppCategoryConstantServiceSettings.class)
  MobileAppCategoryConstantServiceClient createMobileAppCategoryConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = MerchantCenterLinkServiceSettings.class)
  MerchantCenterLinkServiceClient createMerchantCenterLinkServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomInterestServiceSettings.class)
  CustomInterestServiceClient createCustomInterestServiceClient();

  @ServiceClientDescriptor(settingsClass = ConversionAdjustmentUploadServiceSettings.class)
  ConversionAdjustmentUploadServiceClient createConversionAdjustmentUploadServiceClient();

  @ServiceClientDescriptor(settingsClass = ChangeStatusServiceSettings.class)
  ChangeStatusServiceClient createChangeStatusServiceClient();

  @ServiceClientDescriptor(settingsClass = DynamicSearchAdsSearchTermViewServiceSettings.class)
  DynamicSearchAdsSearchTermViewServiceClient createDynamicSearchAdsSearchTermViewServiceClient();

  @ServiceClientDescriptor(settingsClass = GoogleAdsServiceSettings.class)
  GoogleAdsServiceClient createGoogleAdsServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignSharedSetServiceSettings.class)
  CampaignSharedSetServiceClient createCampaignSharedSetServiceClient();

  @ServiceClientDescriptor(settingsClass = ExtensionFeedItemServiceSettings.class)
  ExtensionFeedItemServiceClient createExtensionFeedItemServiceClient();

  @ServiceClientDescriptor(settingsClass = GroupPlacementViewServiceSettings.class)
  GroupPlacementViewServiceClient createGroupPlacementViewServiceClient();

  @ServiceClientDescriptor(settingsClass = UserLocationViewServiceSettings.class)
  UserLocationViewServiceClient createUserLocationViewServiceClient();

  @ServiceClientDescriptor(settingsClass = ShoppingPerformanceViewServiceSettings.class)
  ShoppingPerformanceViewServiceClient createShoppingPerformanceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignServiceSettings.class)
  CampaignServiceClient createCampaignServiceClient();

  @ServiceClientDescriptor(settingsClass = RemarketingActionServiceSettings.class)
  RemarketingActionServiceClient createRemarketingActionServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedItemTargetServiceSettings.class)
  FeedItemTargetServiceClient createFeedItemTargetServiceClient();

  @ServiceClientDescriptor(settingsClass = SharedSetServiceSettings.class)
  SharedSetServiceClient createSharedSetServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupCriterionLabelServiceSettings.class)
  AdGroupCriterionLabelServiceClient createAdGroupCriterionLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAdLabelServiceSettings.class)
  AdGroupAdLabelServiceClient createAdGroupAdLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupServiceSettings.class)
  AdGroupServiceClient createAdGroupServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupExtensionSettingServiceSettings.class)
  AdGroupExtensionSettingServiceClient createAdGroupExtensionSettingServiceClient();

  @ServiceClientDescriptor(settingsClass = GenderViewServiceSettings.class)
  GenderViewServiceClient createGenderViewServiceClient();

  @ServiceClientDescriptor(settingsClass = VideoServiceSettings.class)
  VideoServiceClient createVideoServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerServiceSettings.class)
  CustomerServiceClient createCustomerServiceClient();

  @ServiceClientDescriptor(settingsClass = SearchTermViewServiceSettings.class)
  SearchTermViewServiceClient createSearchTermViewServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedServiceSettings.class)
  FeedServiceClient createFeedServiceClient();
}
