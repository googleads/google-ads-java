/*
 * Copyright 2018 Google LLC
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

/**
 * A client to Google Ads API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>====================== AdGroupAdServiceClient ======================
 *
 * <p>Service Description: Service to manage ads in an ad group.
 *
 * <p>Sample for AdGroupAdServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
 *   String formattedResourceName = AdGroupAdServiceClient.formatAdGroupAdName("[CUSTOMER]", "[AD_GROUP_AD]");
 *   AdGroupAd response = adGroupAdServiceClient.getAdGroupAd(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================= AdGroupCriterionServiceClient =============================
 *
 * <p>Service Description: Service to manage ad group criteria.
 *
 * <p>Sample for AdGroupCriterionServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient = AdGroupCriterionServiceClient.create()) {
 *   String formattedResourceName = AdGroupCriterionServiceClient.formatAdGroupCriteriaName("[CUSTOMER]", "[AD_GROUP_CRITERIA]");
 *   AdGroupCriterion response = adGroupCriterionServiceClient.getAdGroupCriterion(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ==================== AdGroupServiceClient ====================
 *
 * <p>Service Description: Service to manage ad groups.
 *
 * <p>Sample for AdGroupServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
 *   String formattedResourceName = AdGroupServiceClient.formatAdGroupName("[CUSTOMER]", "[AD_GROUP]");
 *   AdGroup response = adGroupServiceClient.getAdGroup(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ BiddingStrategyServiceClient ============================
 *
 * <p>Service Description: Service to manage bidding strategies.
 *
 * <p>Sample for BiddingStrategyServiceClient:
 *
 * <pre>
 * <code>
 * try (BiddingStrategyServiceClient biddingStrategyServiceClient = BiddingStrategyServiceClient.create()) {
 *   String formattedResourceName = BiddingStrategyServiceClient.formatBiddingStrategyName("[CUSTOMER]", "[BIDDING_STRATEGY]");
 *   BiddingStrategy response = biddingStrategyServiceClient.getBiddingStrategy(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== CampaignBudgetServiceClient ===========================
 *
 * <p>Service Description: Service to manage campaign budgets.
 *
 * <p>Sample for CampaignBudgetServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignBudgetServiceClient campaignBudgetServiceClient = CampaignBudgetServiceClient.create()) {
 *   String formattedResourceName = CampaignBudgetServiceClient.formatCampaignBudgetName("[CUSTOMER]", "[CAMPAIGN_BUDGET]");
 *   CampaignBudget response = campaignBudgetServiceClient.getCampaignBudget(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================== CampaignCriterionServiceClient ==============================
 *
 * <p>Service Description: Service to manage campaign criteria.
 *
 * <p>Sample for CampaignCriterionServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignCriterionServiceClient campaignCriterionServiceClient = CampaignCriterionServiceClient.create()) {
 *   String formattedResourceName = CampaignCriterionServiceClient.formatCampaignCriteriaName("[CUSTOMER]", "[CAMPAIGN_CRITERIA]");
 *   CampaignCriterion response = campaignCriterionServiceClient.getCampaignCriterion(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ===================== CampaignServiceClient =====================
 *
 * <p>Service Description: Service to manage campaigns.
 *
 * <p>Sample for CampaignServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
 *   String formattedResourceName = CampaignServiceClient.formatCampaignName("[CUSTOMER]", "[CAMPAIGN]");
 *   Campaign response = campaignServiceClient.getCampaign(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ===================== CustomerServiceClient =====================
 *
 * <p>Service Description: Service to manage customers.
 *
 * <p>Sample for CustomerServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
 *   String formattedResourceName = CustomerServiceClient.formatCustomerName("[CUSTOMER]");
 *   Customer response = customerServiceClient.getCustomer(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== GoogleAdsFieldServiceClient ===========================
 *
 * <p>Service Description: Service to fetch Google Ads API fields.
 *
 * <p>Sample for GoogleAdsFieldServiceClient:
 *
 * <pre>
 * <code>
 * try (GoogleAdsFieldServiceClient googleAdsFieldServiceClient = GoogleAdsFieldServiceClient.create()) {
 *   String formattedResourceName = GoogleAdsFieldServiceClient.formatGoogleAdsFieldName("[GOOGLE_ADS_FIELD]");
 *   GoogleAdsField response = googleAdsFieldServiceClient.getGoogleAdsField(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== GoogleAdsServiceClient ======================
 *
 * <p>Service Description: Service to fetch data and metrics across resources.
 *
 * <p>Sample for GoogleAdsServiceClient:
 *
 * <pre>
 * <code>
 * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
 *   String customerId = "";
 *   String query = "";
 *   SearchPagedResponse response = googleAdsServiceClient.search(customerId, query);
 * }
 * </code>
 * </pre>
 *
 * ======================== KeywordViewServiceClient ========================
 *
 * <p>Service Description: Service to manage keyword views.
 *
 * <p>Sample for KeywordViewServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordViewServiceClient keywordViewServiceClient = KeywordViewServiceClient.create()) {
 *   String formattedResourceName = KeywordViewServiceClient.formatKeywordViewName("[CUSTOMER]", "[KEYWORD_VIEW]");
 *   KeywordView response = keywordViewServiceClient.getKeywordView(formattedResourceName);
 * }
 * </code>
 * </pre>
 */
package com.google.ads.googleads.v0.services;
