// Copyright 2018 Google LLC
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

package com.google.ads.googleads.lib;

import com.google.ads.googleads.v0.services.AccountBudgetProposalServiceClient;
import com.google.ads.googleads.v0.services.AccountBudgetServiceClient;
import com.google.ads.googleads.v0.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v0.services.AdGroupAudienceViewServiceClient;
import com.google.ads.googleads.v0.services.AdGroupBidModifierServiceClient;
import com.google.ads.googleads.v0.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v0.services.AdGroupFeedServiceClient;
import com.google.ads.googleads.v0.services.AdGroupServiceClient;
import com.google.ads.googleads.v0.services.AdParameterServiceClient;
import com.google.ads.googleads.v0.services.AdScheduleViewServiceClient;
import com.google.ads.googleads.v0.services.AgeRangeViewServiceClient;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v0.services.BillingSetupServiceClient;
import com.google.ads.googleads.v0.services.CampaignAudienceViewServiceClient;
import com.google.ads.googleads.v0.services.CampaignBidModifierServiceClient;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v0.services.CampaignFeedServiceClient;
import com.google.ads.googleads.v0.services.CampaignServiceClient;
import com.google.ads.googleads.v0.services.CampaignSharedSetServiceClient;
import com.google.ads.googleads.v0.services.CarrierConstantServiceClient;
import com.google.ads.googleads.v0.services.ChangeStatusServiceClient;
import com.google.ads.googleads.v0.services.ConversionActionServiceClient;
import com.google.ads.googleads.v0.services.CustomerClientLinkServiceClient;
import com.google.ads.googleads.v0.services.CustomerClientServiceClient;
import com.google.ads.googleads.v0.services.CustomerFeedServiceClient;
import com.google.ads.googleads.v0.services.CustomerManagerLinkServiceClient;
import com.google.ads.googleads.v0.services.CustomerServiceClient;
import com.google.ads.googleads.v0.services.DisplayKeywordViewServiceClient;
import com.google.ads.googleads.v0.services.FeedItemServiceClient;
import com.google.ads.googleads.v0.services.FeedMappingServiceClient;
import com.google.ads.googleads.v0.services.FeedServiceClient;
import com.google.ads.googleads.v0.services.GenderViewServiceClient;
import com.google.ads.googleads.v0.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v0.services.HotelGroupViewServiceClient;
import com.google.ads.googleads.v0.services.HotelPerformanceViewServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanAdGroupServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanCampaignServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanKeywordServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanNegativeKeywordServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanServiceClient;
import com.google.ads.googleads.v0.services.KeywordViewServiceClient;
import com.google.ads.googleads.v0.services.LanguageConstantServiceClient;
import com.google.ads.googleads.v0.services.ManagedPlacementViewServiceClient;
import com.google.ads.googleads.v0.services.MediaFileServiceClient;
import com.google.ads.googleads.v0.services.MobileAppCategoryConstantServiceClient;
import com.google.ads.googleads.v0.services.MobileDeviceConstantServiceClient;
import com.google.ads.googleads.v0.services.OperatingSystemVersionConstantServiceClient;
import com.google.ads.googleads.v0.services.ParentalStatusViewServiceClient;
import com.google.ads.googleads.v0.services.PaymentsAccountServiceClient;
import com.google.ads.googleads.v0.services.ProductGroupViewServiceClient;
import com.google.ads.googleads.v0.services.RecommendationServiceClient;
import com.google.ads.googleads.v0.services.RemarketingActionServiceClient;
import com.google.ads.googleads.v0.services.SearchTermViewServiceClient;
import com.google.ads.googleads.v0.services.SharedCriterionServiceClient;
import com.google.ads.googleads.v0.services.SharedSetServiceClient;
import com.google.ads.googleads.v0.services.TopicConstantServiceClient;
import com.google.ads.googleads.v0.services.TopicViewServiceClient;
import com.google.ads.googleads.v0.services.UserInterestServiceClient;
import com.google.ads.googleads.v0.services.UserListServiceClient;
import com.google.ads.googleads.v0.services.VideoServiceClient;

public interface ServiceClientFactory {
  AccountBudgetProposalServiceClient getAccountBudgetProposalServiceClient();

  AccountBudgetServiceClient getAccountBudgetServiceClient();

  AdGroupAdServiceClient getAdGroupAdServiceClient();

  AdGroupAudienceViewServiceClient getAdGroupAudienceViewServiceClient();

  AdGroupBidModifierServiceClient getAdGroupBidModifierServiceClient();

  AdGroupCriterionServiceClient getAdGroupCriterionServiceClient();

  AdGroupFeedServiceClient getAdGroupFeedServiceClient();

  AdGroupServiceClient getAdGroupServiceClient();

  AdParameterServiceClient getAdParameterServiceClient();

  AdScheduleViewServiceClient getAdScheduleViewServiceClient();

  AgeRangeViewServiceClient getAgeRangeViewServiceClient();

  BiddingStrategyServiceClient getBiddingStrategyServiceClient();

  BillingSetupServiceClient getBillingSetupServiceClient();

  CampaignAudienceViewServiceClient getCampaignAudienceViewServiceClient();

  CampaignBidModifierServiceClient getCampaignBidModifierServiceClient();

  CampaignBudgetServiceClient getCampaignBudgetServiceClient();

  CampaignCriterionServiceClient getCampaignCriterionServiceClient();

  CampaignFeedServiceClient getCampaignFeedServiceClient();

  CampaignServiceClient getCampaignServiceClient();

  CampaignSharedSetServiceClient getCampaignSharedSetServiceClient();

  CarrierConstantServiceClient getCarrierConstantServiceClient();

  ChangeStatusServiceClient getChangeStatusServiceClient();

  ConversionActionServiceClient getConversionActionServiceClient();

  CustomerClientLinkServiceClient getCustomerClientLinkServiceClient();

  CustomerClientServiceClient getCustomerClientServiceClient();

  CustomerFeedServiceClient getCustomerFeedServiceClient();

  CustomerManagerLinkServiceClient getCustomerManagerLinkServiceClient();

  CustomerServiceClient getCustomerServiceClient();

  DisplayKeywordViewServiceClient getDisplayKeywordViewServiceClient();

  FeedItemServiceClient getFeedItemServiceClient();

  FeedMappingServiceClient getFeedMappingServiceClient();

  FeedServiceClient getFeedServiceClient();

  GenderViewServiceClient getGenderViewServiceClient();

  GeoTargetConstantServiceClient getGeoTargetConstantServiceClient();

  GoogleAdsFieldServiceClient getGoogleAdsFieldServiceClient();

  GoogleAdsServiceClient getGoogleAdsServiceClient();

  HotelGroupViewServiceClient getHotelGroupViewServiceClient();

  HotelPerformanceViewServiceClient getHotelPerformanceViewServiceClient();

  KeywordPlanAdGroupServiceClient getKeywordPlanAdGroupServiceClient();

  KeywordPlanCampaignServiceClient getKeywordPlanCampaignServiceClient();

  KeywordPlanIdeaServiceClient getKeywordPlanIdeaServiceClient();

  KeywordPlanKeywordServiceClient getKeywordPlanKeywordServiceClient();

  KeywordPlanNegativeKeywordServiceClient getKeywordPlanNegativeKeywordServiceClient();

  KeywordPlanServiceClient getKeywordPlanServiceClient();

  KeywordViewServiceClient getKeywordViewServiceClient();

  LanguageConstantServiceClient getLanguageConstantServiceClient();

  ManagedPlacementViewServiceClient getManagedPlacementViewServiceClient();

  MediaFileServiceClient getMediaFileServiceClient();

  MobileAppCategoryConstantServiceClient getMobileAppCategoryConstantServiceClient();

  MobileDeviceConstantServiceClient getMobileDeviceConstantServiceClient();

  OperatingSystemVersionConstantServiceClient getOperatingSystemVersionConstantServiceClient();

  ParentalStatusViewServiceClient getParentalStatusViewServiceClient();

  PaymentsAccountServiceClient getPaymentsAccountServiceClient();

  ProductGroupViewServiceClient getProductGroupViewServiceClient();

  RecommendationServiceClient getRecommendationServiceClient();

  RemarketingActionServiceClient getRemarketingActionServiceClient();

  SearchTermViewServiceClient getSearchTermViewServiceClient();

  SharedCriterionServiceClient getSharedCriterionServiceClient();

  SharedSetServiceClient getSharedSetServiceClient();

  TopicConstantServiceClient getTopicConstantServiceClient();

  TopicViewServiceClient getTopicViewServiceClient();

  UserInterestServiceClient getUserInterestServiceClient();

  UserListServiceClient getUserListServiceClient();

  VideoServiceClient getVideoServiceClient();
}
