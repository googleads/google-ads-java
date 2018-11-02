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
import com.google.ads.googleads.v0.services.AdGroupServiceClient;
import com.google.ads.googleads.v0.services.AgeRangeViewServiceClient;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v0.services.BillingSetupServiceClient;
import com.google.ads.googleads.v0.services.CampaignBidModifierServiceClient;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v0.services.CampaignGroupServiceClient;
import com.google.ads.googleads.v0.services.CampaignServiceClient;
import com.google.ads.googleads.v0.services.CampaignSharedSetServiceClient;
import com.google.ads.googleads.v0.services.ChangeStatusServiceClient;
import com.google.ads.googleads.v0.services.ConversionActionServiceClient;
import com.google.ads.googleads.v0.services.CustomerClientLinkServiceClient;
import com.google.ads.googleads.v0.services.CustomerManagerLinkServiceClient;
import com.google.ads.googleads.v0.services.CustomerServiceClient;
import com.google.ads.googleads.v0.services.DisplayKeywordViewServiceClient;
import com.google.ads.googleads.v0.services.GenderViewServiceClient;
import com.google.ads.googleads.v0.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v0.services.HotelGroupViewServiceClient;
import com.google.ads.googleads.v0.services.KeywordViewServiceClient;
import com.google.ads.googleads.v0.services.ManagedPlacementViewServiceClient;
import com.google.ads.googleads.v0.services.MediaFileServiceClient;
import com.google.ads.googleads.v0.services.ParentalStatusViewServiceClient;
import com.google.ads.googleads.v0.services.ProductGroupViewServiceClient;
import com.google.ads.googleads.v0.services.RecommendationServiceClient;
import com.google.ads.googleads.v0.services.SharedCriterionServiceClient;
import com.google.ads.googleads.v0.services.SharedSetServiceClient;
import com.google.ads.googleads.v0.services.TopicConstantServiceClient;
import com.google.ads.googleads.v0.services.TopicViewServiceClient;
import com.google.ads.googleads.v0.services.VideoServiceClient;

public interface ServiceClientFactory {
  AccountBudgetProposalServiceClient getAccountBudgetProposalServiceClient();

  AccountBudgetServiceClient getAccountBudgetServiceClient();

  AdGroupAdServiceClient getAdGroupAdServiceClient();

  AdGroupAudienceViewServiceClient getAdGroupAudienceViewServiceClient();

  AdGroupBidModifierServiceClient getAdGroupBidModifierServiceClient();

  AdGroupCriterionServiceClient getAdGroupCriterionServiceClient();

  AdGroupServiceClient getAdGroupServiceClient();

  AgeRangeViewServiceClient getAgeRangeViewServiceClient();

  BiddingStrategyServiceClient getBiddingStrategyServiceClient();

  BillingSetupServiceClient getBillingSetupServiceClient();

  CampaignBidModifierServiceClient getCampaignBidModifierServiceClient();

  CampaignBudgetServiceClient getCampaignBudgetServiceClient();

  CampaignCriterionServiceClient getCampaignCriterionServiceClient();

  CampaignGroupServiceClient getCampaignGroupServiceClient();

  CampaignServiceClient getCampaignServiceClient();

  CampaignSharedSetServiceClient getCampaignSharedSetServiceClient();

  ChangeStatusServiceClient getChangeStatusServiceClient();

  ConversionActionServiceClient getConversionActionServiceClient();

  CustomerClientLinkServiceClient getCustomerClientLinkServiceClient();

  CustomerManagerLinkServiceClient getCustomerManagerLinkServiceClient();

  CustomerServiceClient getCustomerServiceClient();

  DisplayKeywordViewServiceClient getDisplayKeywordViewServiceClient();

  GenderViewServiceClient getGenderViewServiceClient();

  GeoTargetConstantServiceClient getGeoTargetConstantServiceClient();

  GoogleAdsFieldServiceClient getGoogleAdsFieldServiceClient();

  GoogleAdsServiceClient getGoogleAdsServiceClient();

  HotelGroupViewServiceClient getHotelGroupViewServiceClient();

  KeywordViewServiceClient getKeywordViewServiceClient();

  ManagedPlacementViewServiceClient getManagedPlacementViewServiceClient();

  MediaFileServiceClient getMediaFileServiceClient();

  ParentalStatusViewServiceClient getParentalStatusViewServiceClient();

  ProductGroupViewServiceClient getProductGroupViewServiceClient();

  RecommendationServiceClient getRecommendationServiceClient();

  SharedCriterionServiceClient getSharedCriterionServiceClient();

  SharedSetServiceClient getSharedSetServiceClient();

  TopicConstantServiceClient getTopicConstantServiceClient();

  TopicViewServiceClient getTopicViewServiceClient();

  VideoServiceClient getVideoServiceClient();
}
