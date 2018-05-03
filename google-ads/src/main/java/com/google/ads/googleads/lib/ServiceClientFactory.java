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

import com.google.ads.googleads.v0.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v0.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v0.services.AdGroupServiceClient;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v0.services.CampaignServiceClient;
import com.google.ads.googleads.v0.services.CustomerServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsServiceClient;

public interface ServiceClientFactory {
  AdGroupAdServiceClient getAdGroupAdServiceClient();

  AdGroupCriterionServiceClient getAdGroupCriterionServiceClient();

  AdGroupServiceClient getAdGroupServiceClient();

  BiddingStrategyServiceClient getBiddingStrategyServiceClient();

  CampaignBudgetServiceClient getCampaignBudgetServiceClient();

  CampaignCriterionServiceClient getCampaignCriterionServiceClient();

  CampaignServiceClient getCampaignServiceClient();

  CustomerServiceClient getCustomerServiceClient();

  GoogleAdsServiceClient getGoogleAdsServiceClient();

  GoogleAdsFieldServiceClient getGoogleAdsFieldServiceClient();
}
