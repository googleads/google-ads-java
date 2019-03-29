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
import com.google.ads.googleads.lib.catalog.annotation.VersionDescriptor;
import com.google.ads.googleads.v1.errors.GoogleAdsException;

@VersionDescriptor(versionName = "v1", googleAdsExceptionFactory = GoogleAdsException.Factory.class)
public interface GoogleAdsVersion {

  @ServiceClientDescriptor(settingsClass = CustomInterestServiceSettings.class)
  CustomInterestServiceClient createCustomInterestServiceClient();

  @ServiceClientDescriptor(settingsClass = SharedSetServiceSettings.class)
  SharedSetServiceClient createSharedSetServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAudienceViewServiceSettings.class)
  AdGroupAudienceViewServiceClient createAdGroupAudienceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = HotelGroupViewServiceSettings.class)
  HotelGroupViewServiceClient createHotelGroupViewServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAdLabelServiceSettings.class)
  AdGroupAdLabelServiceClient createAdGroupAdLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupExtensionSettingServiceSettings.class)
  AdGroupExtensionSettingServiceClient createAdGroupExtensionSettingServiceClient();

  @ServiceClientDescriptor(settingsClass = DynamicSearchAdsSearchTermViewServiceSettings.class)
  DynamicSearchAdsSearchTermViewServiceClient createDynamicSearchAdsSearchTermViewServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanServiceSettings.class)
  KeywordPlanServiceClient createKeywordPlanServiceClient();

  @ServiceClientDescriptor(settingsClass = HotelPerformanceViewServiceSettings.class)
  HotelPerformanceViewServiceClient createHotelPerformanceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedServiceSettings.class)
  FeedServiceClient createFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = MutateJobServiceSettings.class)
  MutateJobServiceClient createMutateJobServiceClient();

  @ServiceClientDescriptor(settingsClass = VideoServiceSettings.class)
  VideoServiceClient createVideoServiceClient();

  @ServiceClientDescriptor(settingsClass = GoogleAdsFieldServiceSettings.class)
  GoogleAdsFieldServiceClient createGoogleAdsFieldServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedItemTargetServiceSettings.class)
  FeedItemTargetServiceClient createFeedItemTargetServiceClient();

  @ServiceClientDescriptor(settingsClass = ManagedPlacementViewServiceSettings.class)
  ManagedPlacementViewServiceClient createManagedPlacementViewServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanKeywordServiceSettings.class)
  KeywordPlanKeywordServiceClient createKeywordPlanKeywordServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignBudgetServiceSettings.class)
  CampaignBudgetServiceClient createCampaignBudgetServiceClient();

  @ServiceClientDescriptor(settingsClass = AdParameterServiceSettings.class)
  AdParameterServiceClient createAdParameterServiceClient();

  @ServiceClientDescriptor(settingsClass = GeoTargetConstantServiceSettings.class)
  GeoTargetConstantServiceClient createGeoTargetConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = PaymentsAccountServiceSettings.class)
  PaymentsAccountServiceClient createPaymentsAccountServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerManagerLinkServiceSettings.class)
  CustomerManagerLinkServiceClient createCustomerManagerLinkServiceClient();

  @ServiceClientDescriptor(settingsClass = ConversionActionServiceSettings.class)
  ConversionActionServiceClient createConversionActionServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupAdServiceSettings.class)
  AdGroupAdServiceClient createAdGroupAdServiceClient();

  @ServiceClientDescriptor(settingsClass = MerchantCenterLinkServiceSettings.class)
  MerchantCenterLinkServiceClient createMerchantCenterLinkServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanAdGroupServiceSettings.class)
  KeywordPlanAdGroupServiceClient createKeywordPlanAdGroupServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignSharedSetServiceSettings.class)
  CampaignSharedSetServiceClient createCampaignSharedSetServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupBidModifierServiceSettings.class)
  AdGroupBidModifierServiceClient createAdGroupBidModifierServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerLabelServiceSettings.class)
  CustomerLabelServiceClient createCustomerLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedPlaceholderViewServiceSettings.class)
  FeedPlaceholderViewServiceClient createFeedPlaceholderViewServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanNegativeKeywordServiceSettings.class)
  KeywordPlanNegativeKeywordServiceClient createKeywordPlanNegativeKeywordServiceClient();

  @ServiceClientDescriptor(settingsClass = ConversionAdjustmentUploadServiceSettings.class)
  ConversionAdjustmentUploadServiceClient createConversionAdjustmentUploadServiceClient();

  @ServiceClientDescriptor(settingsClass = SearchTermViewServiceSettings.class)
  SearchTermViewServiceClient createSearchTermViewServiceClient();

  @ServiceClientDescriptor(settingsClass = SharedCriterionServiceSettings.class)
  SharedCriterionServiceClient createSharedCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = ProductGroupViewServiceSettings.class)
  ProductGroupViewServiceClient createProductGroupViewServiceClient();

  @ServiceClientDescriptor(settingsClass = LocationViewServiceSettings.class)
  LocationViewServiceClient createLocationViewServiceClient();

  @ServiceClientDescriptor(settingsClass = DomainCategoryServiceSettings.class)
  DomainCategoryServiceClient createDomainCategoryServiceClient();

  @ServiceClientDescriptor(settingsClass = ShoppingPerformanceViewServiceSettings.class)
  ShoppingPerformanceViewServiceClient createShoppingPerformanceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = AccountBudgetServiceSettings.class)
  AccountBudgetServiceClient createAccountBudgetServiceClient();

  @ServiceClientDescriptor(settingsClass = MediaFileServiceSettings.class)
  MediaFileServiceClient createMediaFileServiceClient();

  @ServiceClientDescriptor(settingsClass = GroupPlacementViewServiceSettings.class)
  GroupPlacementViewServiceClient createGroupPlacementViewServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupFeedServiceSettings.class)
  AdGroupFeedServiceClient createAdGroupFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupCriterionServiceSettings.class)
  AdGroupCriterionServiceClient createAdGroupCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = DetailPlacementViewServiceSettings.class)
  DetailPlacementViewServiceClient createDetailPlacementViewServiceClient();

  @ServiceClientDescriptor(settingsClass = LabelServiceSettings.class)
  LabelServiceClient createLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = BiddingStrategyServiceSettings.class)
  BiddingStrategyServiceClient createBiddingStrategyServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupServiceSettings.class)
  AdGroupServiceClient createAdGroupServiceClient();

  @ServiceClientDescriptor(settingsClass = GeographicViewServiceSettings.class)
  GeographicViewServiceClient createGeographicViewServiceClient();

  @ServiceClientDescriptor(settingsClass = OperatingSystemVersionConstantServiceSettings.class)
  OperatingSystemVersionConstantServiceClient createOperatingSystemVersionConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = LanguageConstantServiceSettings.class)
  LanguageConstantServiceClient createLanguageConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = DisplayKeywordViewServiceSettings.class)
  DisplayKeywordViewServiceClient createDisplayKeywordViewServiceClient();

  @ServiceClientDescriptor(settingsClass = ExtensionFeedItemServiceSettings.class)
  ExtensionFeedItemServiceClient createExtensionFeedItemServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerNegativeCriterionServiceSettings.class)
  CustomerNegativeCriterionServiceClient createCustomerNegativeCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = BillingSetupServiceSettings.class)
  BillingSetupServiceClient createBillingSetupServiceClient();

  @ServiceClientDescriptor(settingsClass = TopicConstantServiceSettings.class)
  TopicConstantServiceClient createTopicConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = ProductBiddingCategoryConstantServiceSettings.class)
  ProductBiddingCategoryConstantServiceClient createProductBiddingCategoryConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = ChangeStatusServiceSettings.class)
  ChangeStatusServiceClient createChangeStatusServiceClient();

  @ServiceClientDescriptor(settingsClass = GenderViewServiceSettings.class)
  GenderViewServiceClient createGenderViewServiceClient();

  @ServiceClientDescriptor(settingsClass = MobileDeviceConstantServiceSettings.class)
  MobileDeviceConstantServiceClient createMobileDeviceConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerExtensionSettingServiceSettings.class)
  CustomerExtensionSettingServiceClient createCustomerExtensionSettingServiceClient();

  @ServiceClientDescriptor(settingsClass = UserListServiceSettings.class)
  UserListServiceClient createUserListServiceClient();

  @ServiceClientDescriptor(settingsClass = RemarketingActionServiceSettings.class)
  RemarketingActionServiceClient createRemarketingActionServiceClient();

  @ServiceClientDescriptor(settingsClass = ParentalStatusViewServiceSettings.class)
  ParentalStatusViewServiceClient createParentalStatusViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerClientServiceSettings.class)
  CustomerClientServiceClient createCustomerClientServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanIdeaServiceSettings.class)
  KeywordPlanIdeaServiceClient createKeywordPlanIdeaServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignBidModifierServiceSettings.class)
  CampaignBidModifierServiceClient createCampaignBidModifierServiceClient();

  @ServiceClientDescriptor(settingsClass = GoogleAdsServiceSettings.class)
  GoogleAdsServiceClient createGoogleAdsServiceClient();

  @ServiceClientDescriptor(settingsClass = MobileAppCategoryConstantServiceSettings.class)
  MobileAppCategoryConstantServiceClient createMobileAppCategoryConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupLabelServiceSettings.class)
  AdGroupLabelServiceClient createAdGroupLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignLabelServiceSettings.class)
  CampaignLabelServiceClient createCampaignLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = AdScheduleViewServiceSettings.class)
  AdScheduleViewServiceClient createAdScheduleViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignServiceSettings.class)
  CampaignServiceClient createCampaignServiceClient();

  @ServiceClientDescriptor(settingsClass = ClickViewServiceSettings.class)
  ClickViewServiceClient createClickViewServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerFeedServiceSettings.class)
  CustomerFeedServiceClient createCustomerFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignCriterionServiceSettings.class)
  CampaignCriterionServiceClient createCampaignCriterionServiceClient();

  @ServiceClientDescriptor(settingsClass = AssetServiceSettings.class)
  AssetServiceClient createAssetServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedMappingServiceSettings.class)
  FeedMappingServiceClient createFeedMappingServiceClient();

  @ServiceClientDescriptor(settingsClass = CarrierConstantServiceSettings.class)
  CarrierConstantServiceClient createCarrierConstantServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerClientLinkServiceSettings.class)
  CustomerClientLinkServiceClient createCustomerClientLinkServiceClient();

  @ServiceClientDescriptor(settingsClass = CustomerServiceSettings.class)
  CustomerServiceClient createCustomerServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignExtensionSettingServiceSettings.class)
  CampaignExtensionSettingServiceClient createCampaignExtensionSettingServiceClient();

  @ServiceClientDescriptor(settingsClass = TopicViewServiceSettings.class)
  TopicViewServiceClient createTopicViewServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordViewServiceSettings.class)
  KeywordViewServiceClient createKeywordViewServiceClient();

  @ServiceClientDescriptor(settingsClass = RecommendationServiceSettings.class)
  RecommendationServiceClient createRecommendationServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignAudienceViewServiceSettings.class)
  CampaignAudienceViewServiceClient createCampaignAudienceViewServiceClient();

  @ServiceClientDescriptor(settingsClass = FeedItemServiceSettings.class)
  FeedItemServiceClient createFeedItemServiceClient();

  @ServiceClientDescriptor(settingsClass = KeywordPlanCampaignServiceSettings.class)
  KeywordPlanCampaignServiceClient createKeywordPlanCampaignServiceClient();

  @ServiceClientDescriptor(settingsClass = AccountBudgetProposalServiceSettings.class)
  AccountBudgetProposalServiceClient createAccountBudgetProposalServiceClient();

  @ServiceClientDescriptor(settingsClass = AdGroupCriterionLabelServiceSettings.class)
  AdGroupCriterionLabelServiceClient createAdGroupCriterionLabelServiceClient();

  @ServiceClientDescriptor(settingsClass = CampaignFeedServiceSettings.class)
  CampaignFeedServiceClient createCampaignFeedServiceClient();

  @ServiceClientDescriptor(settingsClass = ConversionUploadServiceSettings.class)
  ConversionUploadServiceClient createConversionUploadServiceClient();

  @ServiceClientDescriptor(settingsClass = UserInterestServiceSettings.class)
  UserInterestServiceClient createUserInterestServiceClient();

  @ServiceClientDescriptor(settingsClass = AgeRangeViewServiceSettings.class)
  AgeRangeViewServiceClient createAgeRangeViewServiceClient();
}
