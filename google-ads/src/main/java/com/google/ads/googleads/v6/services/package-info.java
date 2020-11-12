/*
 * Copyright 2020 Google LLC
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
 * <p>================================== AccountBudgetProposalServiceClient
 * ==================================
 *
 * <p>Service Description: A service for managing account-level budgets via proposals.
 *
 * <p>A proposal is a request to create a new budget or make changes to an existing one.
 *
 * <p>Reads for account-level budgets managed by these proposals will be supported in a future
 * version. Until then, please use the BudgetOrderService from the AdWords API. Learn more at
 * https://developers.google.com/adwords/api/docs/guides/budget-order
 *
 * <p>Mutates: The CREATE operation creates a new proposal. UPDATE operations aren't supported. The
 * REMOVE operation cancels a pending proposal.
 *
 * <p>Sample for AccountBudgetProposalServiceClient:
 *
 * <pre>
 * <code>
 * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient = AccountBudgetProposalServiceClient.create()) {
 *   AccountBudgetProposalName resourceName = AccountBudgetProposalName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_PROPOSAL_ID]");
 *   AccountBudgetProposal response = accountBudgetProposalServiceClient.getAccountBudgetProposal(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================== AccountBudgetServiceClient ==========================
 *
 * <p>Service Description: A service for fetching an account-level budget.
 *
 * <p>Account-level budgets are mutated by creating proposal resources.
 *
 * <p>Sample for AccountBudgetServiceClient:
 *
 * <pre>
 * <code>
 * try (AccountBudgetServiceClient accountBudgetServiceClient = AccountBudgetServiceClient.create()) {
 *   AccountBudgetName resourceName = AccountBudgetName.of("[CUSTOMER_ID]", "[ACCOUNT_BUDGET_ID]");
 *   AccountBudget response = accountBudgetServiceClient.getAccountBudget(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================== AccountLinkServiceClient ========================
 *
 * <p>Service Description: This service allows management of links between Google Ads accounts and
 * other accounts.
 *
 * <p>Sample for AccountLinkServiceClient:
 *
 * <pre>
 * <code>
 * try (AccountLinkServiceClient accountLinkServiceClient = AccountLinkServiceClient.create()) {
 *   AccountLinkName resourceName = AccountLinkName.of("[CUSTOMER_ID]", "[ACCOUNT_LINK_ID]");
 *   AccountLink response = accountLinkServiceClient.getAccountLink(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== AdGroupAdAssetViewServiceClient ===============================
 *
 * <p>Service Description: Service to fetch ad group ad asset views.
 *
 * <p>Sample for AdGroupAdAssetViewServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupAdAssetViewServiceClient adGroupAdAssetViewServiceClient = AdGroupAdAssetViewServiceClient.create()) {
 *   AdGroupAdAssetViewName resourceName = AdGroupAdAssetViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
 *   AdGroupAdAssetView response = adGroupAdAssetViewServiceClient.getAdGroupAdAssetView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== AdGroupAdLabelServiceClient ===========================
 *
 * <p>Service Description: Service to manage labels on ad group ads.
 *
 * <p>Sample for AdGroupAdLabelServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient = AdGroupAdLabelServiceClient.create()) {
 *   AdGroupAdLabelName resourceName = AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]");
 *   AdGroupAdLabel response = adGroupAdLabelServiceClient.getAdGroupAdLabel(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== AdGroupAdServiceClient ======================
 *
 * <p>Service Description: Service to manage ads in an ad group.
 *
 * <p>Sample for AdGroupAdServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
 *   AdGroupAdName resourceName = AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]");
 *   AdGroupAd response = adGroupAdServiceClient.getAdGroupAd(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================ AdGroupAudienceViewServiceClient
 * ================================
 *
 * <p>Service Description: Service to manage ad group audience views.
 *
 * <p>Sample for AdGroupAudienceViewServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupAudienceViewServiceClient adGroupAudienceViewServiceClient = AdGroupAudienceViewServiceClient.create()) {
 *   AdGroupAudienceViewName resourceName = AdGroupAudienceViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   AdGroupAudienceView response = adGroupAudienceViewServiceClient.getAdGroupAudienceView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== AdGroupBidModifierServiceClient ===============================
 *
 * <p>Service Description: Service to manage ad group bid modifiers.
 *
 * <p>Sample for AdGroupBidModifierServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupBidModifierServiceClient adGroupBidModifierServiceClient = AdGroupBidModifierServiceClient.create()) {
 *   AdGroupBidModifierName resourceName = AdGroupBidModifierName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   AdGroupBidModifier response = adGroupBidModifierServiceClient.getAdGroupBidModifier(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================== AdGroupCriterionLabelServiceClient
 * ==================================
 *
 * <p>Service Description: Service to manage labels on ad group criteria.
 *
 * <p>Sample for AdGroupCriterionLabelServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient = AdGroupCriterionLabelServiceClient.create()) {
 *   AdGroupCriterionLabelName resourceName = AdGroupCriterionLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]");
 *   AdGroupCriterionLabel response = adGroupCriterionLabelServiceClient.getAdGroupCriterionLabel(resourceName);
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
 *   AdGroupCriterionName resourceName = AdGroupCriterionName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   AdGroupCriterion response = adGroupCriterionServiceClient.getAdGroupCriterion(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================================= AdGroupCriterionSimulationServiceClient
 * =======================================
 *
 * <p>Service Description: Service to fetch ad group criterion simulations.
 *
 * <p>Sample for AdGroupCriterionSimulationServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupCriterionSimulationServiceClient adGroupCriterionSimulationServiceClient = AdGroupCriterionSimulationServiceClient.create()) {
 *   AdGroupCriterionSimulationName resourceName = AdGroupCriterionSimulationName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[TYPE]", "[MODIFICATION_METHOD]", "[START_DATE]", "[END_DATE]");
 *   AdGroupCriterionSimulation response = adGroupCriterionSimulationServiceClient.getAdGroupCriterionSimulation(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ==================================== AdGroupExtensionSettingServiceClient
 * ====================================
 *
 * <p>Service Description: Service to manage ad group extension settings.
 *
 * <p>Sample for AdGroupExtensionSettingServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient = AdGroupExtensionSettingServiceClient.create()) {
 *   AdGroupExtensionSettingName resourceName = AdGroupExtensionSettingName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[EXTENSION_TYPE]");
 *   AdGroupExtensionSetting response = adGroupExtensionSettingServiceClient.getAdGroupExtensionSetting(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================== AdGroupFeedServiceClient ========================
 *
 * <p>Service Description: Service to manage ad group feeds.
 *
 * <p>Sample for AdGroupFeedServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupFeedServiceClient adGroupFeedServiceClient = AdGroupFeedServiceClient.create()) {
 *   AdGroupFeedName resourceName = AdGroupFeedName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[FEED_ID]");
 *   AdGroupFeed response = adGroupFeedServiceClient.getAdGroupFeed(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= AdGroupLabelServiceClient =========================
 *
 * <p>Service Description: Service to manage labels on ad groups.
 *
 * <p>Sample for AdGroupLabelServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
 *   AdGroupLabelName resourceName = AdGroupLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[LABEL_ID]");
 *   AdGroupLabel response = adGroupLabelServiceClient.getAdGroupLabel(resourceName);
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
 *   AdGroupName resourceName = AdGroupName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]");
 *   AdGroup response = adGroupServiceClient.getAdGroup(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================== AdGroupSimulationServiceClient ==============================
 *
 * <p>Service Description: Service to fetch ad group simulations.
 *
 * <p>Sample for AdGroupSimulationServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupSimulationServiceClient adGroupSimulationServiceClient = AdGroupSimulationServiceClient.create()) {
 *   AdGroupSimulationName resourceName = AdGroupSimulationName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[TYPE]", "[MODIFICATION_METHOD]", "[START_DATE]", "[END_DATE]");
 *   AdGroupSimulation response = adGroupSimulationServiceClient.getAdGroupSimulation(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================== AdParameterServiceClient ========================
 *
 * <p>Service Description: Service to manage ad parameters.
 *
 * <p>Sample for AdParameterServiceClient:
 *
 * <pre>
 * <code>
 * try (AdParameterServiceClient adParameterServiceClient = AdParameterServiceClient.create()) {
 *   AdParameterName resourceName = AdParameterName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[PARAMETER_INDEX]");
 *   AdParameter response = adParameterServiceClient.getAdParameter(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== AdScheduleViewServiceClient ===========================
 *
 * <p>Service Description: Service to fetch ad schedule views.
 *
 * <p>Sample for AdScheduleViewServiceClient:
 *
 * <pre>
 * <code>
 * try (AdScheduleViewServiceClient adScheduleViewServiceClient = AdScheduleViewServiceClient.create()) {
 *   AdScheduleViewName resourceName = AdScheduleViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");
 *   AdScheduleView response = adScheduleViewServiceClient.getAdScheduleView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============== AdServiceClient ===============
 *
 * <p>Service Description: Service to manage ads.
 *
 * <p>Sample for AdServiceClient:
 *
 * <pre>
 * <code>
 * try (AdServiceClient adServiceClient = AdServiceClient.create()) {
 *   AdName resourceName = AdName.of("[CUSTOMER_ID]", "[AD_ID]");
 *   Ad response = adServiceClient.getAd(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= AgeRangeViewServiceClient =========================
 *
 * <p>Service Description: Service to manage age range views.
 *
 * <p>Sample for AgeRangeViewServiceClient:
 *
 * <pre>
 * <code>
 * try (AgeRangeViewServiceClient ageRangeViewServiceClient = AgeRangeViewServiceClient.create()) {
 *   AgeRangeViewName resourceName = AgeRangeViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   AgeRangeView response = ageRangeViewServiceClient.getAgeRangeView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================== AssetServiceClient ==================
 *
 * <p>Service Description: Service to manage assets. Asset types can be created with AssetService
 * are YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be created with Ad
 * inline.
 *
 * <p>Sample for AssetServiceClient:
 *
 * <pre>
 * <code>
 * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
 *   AssetName resourceName = AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]");
 *   Asset response = assetServiceClient.getAsset(resourceName);
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
 *   BiddingStrategyName resourceName = BiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]");
 *   BiddingStrategy response = biddingStrategyServiceClient.getBiddingStrategy(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================== CampaignAssetServiceClient ==========================
 *
 * <p>Service Description: Service to manage campaign assets.
 *
 * <p>Sample for CampaignAssetServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignAssetServiceClient campaignAssetServiceClient = CampaignAssetServiceClient.create()) {
 *   CampaignAssetName resourceName = CampaignAssetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
 *   CampaignAsset response = campaignAssetServiceClient.getCampaignAsset(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================ CampaignBidModifierServiceClient
 * ================================
 *
 * <p>Service Description: Service to manage campaign bid modifiers.
 *
 * <p>Sample for CampaignBidModifierServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignBidModifierServiceClient campaignBidModifierServiceClient = CampaignBidModifierServiceClient.create()) {
 *   CampaignBidModifierName resourceName = CampaignBidModifierName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");
 *   CampaignBidModifier response = campaignBidModifierServiceClient.getCampaignBidModifier(resourceName);
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
 *   CampaignBudgetName resourceName = CampaignBudgetName.of("[CUSTOMER_ID]", "[CAMPAIGN_BUDGET_ID]");
 *   CampaignBudget response = campaignBudgetServiceClient.getCampaignBudget(resourceName);
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
 *   CampaignCriterionName resourceName = CampaignCriterionName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");
 *   CampaignCriterion response = campaignCriterionServiceClient.getCampaignCriterion(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================== CampaignDraftServiceClient ==========================
 *
 * <p>Service Description: Service to manage campaign drafts.
 *
 * <p>Sample for CampaignDraftServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignDraftServiceClient campaignDraftServiceClient = CampaignDraftServiceClient.create()) {
 *   CampaignDraftName resourceName = CampaignDraftName.of("[CUSTOMER_ID]", "[BASE_CAMPAIGN_ID]", "[DRAFT_ID]");
 *   CampaignDraft response = campaignDraftServiceClient.getCampaignDraft(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== CampaignExperimentServiceClient ===============================
 *
 * <p>Service Description: CampaignExperimentService manages the life cycle of campaign experiments.
 * It is used to create new experiments from drafts, modify experiment properties, promote changes
 * in an experiment back to its base campaign, graduate experiments into new stand-alone campaigns,
 * and to remove an experiment.
 *
 * <p>An experiment consists of two variants or arms - the base campaign and the experiment
 * campaign, directing a fixed share of traffic to each arm. A campaign experiment is created from a
 * draft of changes to the base campaign and will be a snapshot of changes in the draft at the time
 * of creation.
 *
 * <p>Sample for CampaignExperimentServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignExperimentServiceClient campaignExperimentServiceClient = CampaignExperimentServiceClient.create()) {
 *   CampaignExperimentName resourceName = CampaignExperimentName.of("[CUSTOMER_ID]", "[CAMPAIGN_EXPERIMENT_ID]");
 *   CampaignExperiment response = campaignExperimentServiceClient.getCampaignExperiment(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ===================================== CampaignExtensionSettingServiceClient
 * =====================================
 *
 * <p>Service Description: Service to manage campaign extension settings.
 *
 * <p>Sample for CampaignExtensionSettingServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient = CampaignExtensionSettingServiceClient.create()) {
 *   CampaignExtensionSettingName resourceName = CampaignExtensionSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[EXTENSION_TYPE]");
 *   CampaignExtensionSetting response = campaignExtensionSettingServiceClient.getCampaignExtensionSetting(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= CampaignFeedServiceClient =========================
 *
 * <p>Service Description: Service to manage campaign feeds.
 *
 * <p>Sample for CampaignFeedServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
 *   CampaignFeedName resourceName = CampaignFeedName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[FEED_ID]");
 *   CampaignFeed response = campaignFeedServiceClient.getCampaignFeed(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================== CampaignLabelServiceClient ==========================
 *
 * <p>Service Description: Service to manage labels on campaigns.
 *
 * <p>Sample for CampaignLabelServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignLabelServiceClient campaignLabelServiceClient = CampaignLabelServiceClient.create()) {
 *   CampaignLabelName resourceName = CampaignLabelName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[LABEL_ID]");
 *   CampaignLabel response = campaignLabelServiceClient.getCampaignLabel(resourceName);
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
 *   CampaignName resourceName = CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]");
 *   Campaign response = campaignServiceClient.getCampaign(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================== CampaignSharedSetServiceClient ==============================
 *
 * <p>Service Description: Service to manage campaign shared sets.
 *
 * <p>Sample for CampaignSharedSetServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
 *   CampaignSharedSetName resourceName = CampaignSharedSetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[SHARED_SET_ID]");
 *   CampaignSharedSet response = campaignSharedSetServiceClient.getCampaignSharedSet(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================= ConversionActionServiceClient =============================
 *
 * <p>Service Description: Service to manage conversion actions.
 *
 * <p>Sample for ConversionActionServiceClient:
 *
 * <pre>
 * <code>
 * try (ConversionActionServiceClient conversionActionServiceClient = ConversionActionServiceClient.create()) {
 *   ConversionActionName resourceName = ConversionActionName.of("[CUSTOMER_ID]", "[CONVERSION_ACTION_ID]");
 *   ConversionAction response = conversionActionServiceClient.getConversionAction(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ===================================== CustomerExtensionSettingServiceClient
 * =====================================
 *
 * <p>Service Description: Service to manage customer extension settings.
 *
 * <p>Sample for CustomerExtensionSettingServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerExtensionSettingServiceClient customerExtensionSettingServiceClient = CustomerExtensionSettingServiceClient.create()) {
 *   CustomerExtensionSettingName resourceName = CustomerExtensionSettingName.of("[CUSTOMER_ID]", "[EXTENSION_TYPE]");
 *   CustomerExtensionSetting response = customerExtensionSettingServiceClient.getCustomerExtensionSetting(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= CustomerFeedServiceClient =========================
 *
 * <p>Service Description: Service to manage customer feeds.
 *
 * <p>Sample for CustomerFeedServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
 *   CustomerFeedName resourceName = CustomerFeedName.of("[CUSTOMER_ID]", "[FEED_ID]");
 *   CustomerFeed response = customerFeedServiceClient.getCustomerFeed(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================== CustomerLabelServiceClient ==========================
 *
 * <p>Service Description: Service to manage labels on customers.
 *
 * <p>Sample for CustomerLabelServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerLabelServiceClient customerLabelServiceClient = CustomerLabelServiceClient.create()) {
 *   CustomerLabelName resourceName = CustomerLabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");
 *   CustomerLabel response = customerLabelServiceClient.getCustomerLabel(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================================== CustomerNegativeCriterionServiceClient
 * ======================================
 *
 * <p>Service Description: Service to manage customer negative criteria.
 *
 * <p>Sample for CustomerNegativeCriterionServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient = CustomerNegativeCriterionServiceClient.create()) {
 *   CustomerNegativeCriterionName resourceName = CustomerNegativeCriterionName.of("[CUSTOMER_ID]", "[CRITERION_ID]");
 *   CustomerNegativeCriterion response = customerNegativeCriterionServiceClient.getCustomerNegativeCriterion(resourceName);
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
 *   CustomerName resourceName = CustomerName.of("[CUSTOMER_ID]");
 *   Customer response = customerServiceClient.getCustomer(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================== ExtensionFeedItemServiceClient ==============================
 *
 * <p>Service Description: Service to manage extension feed items.
 *
 * <p>Sample for ExtensionFeedItemServiceClient:
 *
 * <pre>
 * <code>
 * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = ExtensionFeedItemServiceClient.create()) {
 *   ExtensionFeedItemName resourceName = ExtensionFeedItemName.of("[CUSTOMER_ID]", "[FEED_ITEM_ID]");
 *   ExtensionFeedItem response = extensionFeedItemServiceClient.getExtensionFeedItem(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ===================== FeedItemServiceClient =====================
 *
 * <p>Service Description: Service to manage feed items.
 *
 * <p>Sample for FeedItemServiceClient:
 *
 * <pre>
 * <code>
 * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
 *   FeedItemName resourceName = FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]");
 *   FeedItem response = feedItemServiceClient.getFeedItem(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ FeedItemSetLinkServiceClient ============================
 *
 * <p>Service Description: Service to manage feed item set links.
 *
 * <p>Sample for FeedItemSetLinkServiceClient:
 *
 * <pre>
 * <code>
 * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient = FeedItemSetLinkServiceClient.create()) {
 *   FeedItemSetLinkName resourceName = FeedItemSetLinkName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]");
 *   FeedItemSetLink response = feedItemSetLinkServiceClient.getFeedItemSetLink(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================== FeedItemSetServiceClient ========================
 *
 * <p>Service Description: Service to manage feed Item Set
 *
 * <p>Sample for FeedItemSetServiceClient:
 *
 * <pre>
 * <code>
 * try (FeedItemSetServiceClient feedItemSetServiceClient = FeedItemSetServiceClient.create()) {
 *   FeedItemSetName resourceName = FeedItemSetName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]");
 *   FeedItemSet response = feedItemSetServiceClient.getFeedItemSet(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== FeedItemTargetServiceClient ===========================
 *
 * <p>Service Description: Service to manage feed item targets.
 *
 * <p>Sample for FeedItemTargetServiceClient:
 *
 * <pre>
 * <code>
 * try (FeedItemTargetServiceClient feedItemTargetServiceClient = FeedItemTargetServiceClient.create()) {
 *   FeedItemTargetName resourceName = FeedItemTargetName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]", "[FEED_ITEM_TARGET_TYPE]", "[FEED_ITEM_TARGET_ID]");
 *   FeedItemTarget response = feedItemTargetServiceClient.getFeedItemTarget(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================== FeedMappingServiceClient ========================
 *
 * <p>Service Description: Service to manage feed mappings.
 *
 * <p>Sample for FeedMappingServiceClient:
 *
 * <pre>
 * <code>
 * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
 *   FeedMappingName resourceName = FeedMappingName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_MAPPING_ID]");
 *   FeedMapping response = feedMappingServiceClient.getFeedMapping(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================= FeedServiceClient =================
 *
 * <p>Service Description: Service to manage feeds.
 *
 * <p>Sample for FeedServiceClient:
 *
 * <pre>
 * <code>
 * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
 *   FeedName resourceName = FeedName.of("[CUSTOMER_ID]", "[FEED_ID]");
 *   Feed response = feedServiceClient.getFeed(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================================== KeywordPlanAdGroupKeywordServiceClient
 * ======================================
 *
 * <p>Service Description: Service to manage Keyword Plan ad group keywords. KeywordPlanAdGroup is
 * required to add ad group keywords. Positive and negative keywords are supported. A maximum of
 * 10,000 positive keywords are allowed per keyword plan. A maximum of 1,000 negative keywords are
 * allower per keyword plan. This includes campaign negative keywords and ad group negative
 * keywords.
 *
 * <p>Sample for KeywordPlanAdGroupKeywordServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient = KeywordPlanAdGroupKeywordServiceClient.create()) {
 *   KeywordPlanAdGroupKeywordName resourceName = KeywordPlanAdGroupKeywordName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_KEYWORD_ID]");
 *   KeywordPlanAdGroupKeyword response = keywordPlanAdGroupKeywordServiceClient.getKeywordPlanAdGroupKeyword(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== KeywordPlanAdGroupServiceClient ===============================
 *
 * <p>Service Description: Service to manage Keyword Plan ad groups.
 *
 * <p>Sample for KeywordPlanAdGroupServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient = KeywordPlanAdGroupServiceClient.create()) {
 *   KeywordPlanAdGroupName resourceName = KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]");
 *   KeywordPlanAdGroup response = keywordPlanAdGroupServiceClient.getKeywordPlanAdGroup(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================================= KeywordPlanCampaignKeywordServiceClient
 * =======================================
 *
 * <p>Service Description: Service to manage Keyword Plan campaign keywords. KeywordPlanCampaign is
 * required to add the campaign keywords. Only negative keywords are supported. A maximum of 1000
 * negative keywords are allowed per plan. This includes both campaign negative keywords and ad
 * group negative keywords.
 *
 * <p>Sample for KeywordPlanCampaignKeywordServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient = KeywordPlanCampaignKeywordServiceClient.create()) {
 *   KeywordPlanCampaignKeywordName resourceName = KeywordPlanCampaignKeywordName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_KEYWORD_ID]");
 *   KeywordPlanCampaignKeyword response = keywordPlanCampaignKeywordServiceClient.getKeywordPlanCampaignKeyword(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================ KeywordPlanCampaignServiceClient
 * ================================
 *
 * <p>Service Description: Service to manage Keyword Plan campaigns.
 *
 * <p>Sample for KeywordPlanCampaignServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient = KeywordPlanCampaignServiceClient.create()) {
 *   KeywordPlanCampaignName resourceName = KeywordPlanCampaignName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_CAMPAIGN_ID]");
 *   KeywordPlanCampaign response = keywordPlanCampaignServiceClient.getKeywordPlanCampaign(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================== KeywordPlanServiceClient ========================
 *
 * <p>Service Description: Service to manage keyword plans.
 *
 * <p>Sample for KeywordPlanServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
 *   KeywordPlanName resourceName = KeywordPlanName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_ID]");
 *   KeywordPlan response = keywordPlanServiceClient.getKeywordPlan(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================== LabelServiceClient ==================
 *
 * <p>Service Description: Service to manage labels.
 *
 * <p>Sample for LabelServiceClient:
 *
 * <pre>
 * <code>
 * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
 *   LabelName resourceName = LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");
 *   Label response = labelServiceClient.getLabel(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== MediaFileServiceClient ======================
 *
 * <p>Service Description: Service to manage media files.
 *
 * <p>Sample for MediaFileServiceClient:
 *
 * <pre>
 * <code>
 * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
 *   MediaFileName resourceName = MediaFileName.of("[CUSTOMER_ID]", "[MEDIA_FILE_ID]");
 *   MediaFile response = mediaFileServiceClient.getMediaFile(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================== RemarketingActionServiceClient ==============================
 *
 * <p>Service Description: Service to manage remarketing actions.
 *
 * <p>Sample for RemarketingActionServiceClient:
 *
 * <pre>
 * <code>
 * try (RemarketingActionServiceClient remarketingActionServiceClient = RemarketingActionServiceClient.create()) {
 *   RemarketingActionName resourceName = RemarketingActionName.of("[CUSTOMER_ID]", "[REMARKETING_ACTION_ID]");
 *   RemarketingAction response = remarketingActionServiceClient.getRemarketingAction(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ SharedCriterionServiceClient ============================
 *
 * <p>Service Description: Service to manage shared criteria.
 *
 * <p>Sample for SharedCriterionServiceClient:
 *
 * <pre>
 * <code>
 * try (SharedCriterionServiceClient sharedCriterionServiceClient = SharedCriterionServiceClient.create()) {
 *   SharedCriterionName resourceName = SharedCriterionName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]", "[CRITERION_ID]");
 *   SharedCriterion response = sharedCriterionServiceClient.getSharedCriterion(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== SharedSetServiceClient ======================
 *
 * <p>Service Description: Service to manage shared sets.
 *
 * <p>Sample for SharedSetServiceClient:
 *
 * <pre>
 * <code>
 * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
 *   SharedSetName resourceName = SharedSetName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]");
 *   SharedSet response = sharedSetServiceClient.getSharedSet(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ===================== UserListServiceClient =====================
 *
 * <p>Service Description: Service to manage user lists.
 *
 * <p>Sample for UserListServiceClient:
 *
 * <pre>
 * <code>
 * try (UserListServiceClient userListServiceClient = UserListServiceClient.create()) {
 *   UserListName resourceName = UserListName.of("[CUSTOMER_ID]", "[USER_LIST_ID]");
 *   UserList response = userListServiceClient.getUserList(resourceName);
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
 *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
 *   MutateGoogleAdsResponse response = googleAdsServiceClient.mutate(customerId, mutateOperations);
 * }
 * </code>
 * </pre>
 *
 * ===================== BatchJobServiceClient =====================
 *
 * <p>Service Description: Service to manage batch jobs.
 *
 * <p>Sample for BatchJobServiceClient:
 *
 * <pre>
 * <code>
 * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
 *   String customerId = "";
 *   BatchJobOperation operation = BatchJobOperation.newBuilder().build();
 *   MutateBatchJobResponse response = batchJobServiceClient.mutateBatchJob(customerId, operation);
 * }
 * </code>
 * </pre>
 *
 * ========================= BillingSetupServiceClient =========================
 *
 * <p>Service Description: A service for designating the business entity responsible for accrued
 * costs.
 *
 * <p>A billing setup is associated with a payments account. Billing-related activity for all
 * billing setups associated with a particular payments account will appear on a single invoice
 * generated monthly.
 *
 * <p>Mutates: The REMOVE operation cancels a pending billing setup. The CREATE operation creates a
 * new billing setup.
 *
 * <p>Sample for BillingSetupServiceClient:
 *
 * <pre>
 * <code>
 * try (BillingSetupServiceClient billingSetupServiceClient = BillingSetupServiceClient.create()) {
 *   BillingSetupName resourceName = BillingSetupName.of("[CUSTOMER_ID]", "[BILLING_SETUP_ID]");
 *   BillingSetup response = billingSetupServiceClient.getBillingSetup(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================= CampaignAudienceViewServiceClient
 * =================================
 *
 * <p>Service Description: Service to manage campaign audience views.
 *
 * <p>Sample for CampaignAudienceViewServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignAudienceViewServiceClient campaignAudienceViewServiceClient = CampaignAudienceViewServiceClient.create()) {
 *   CampaignAudienceViewName resourceName = CampaignAudienceViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");
 *   CampaignAudienceView response = campaignAudienceViewServiceClient.getCampaignAudienceView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================================== CampaignCriterionSimulationServiceClient
 * ========================================
 *
 * <p>Service Description: Service to fetch campaign criterion simulations.
 *
 * <p>Sample for CampaignCriterionSimulationServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignCriterionSimulationServiceClient campaignCriterionSimulationServiceClient = CampaignCriterionSimulationServiceClient.create()) {
 *   CampaignCriterionSimulationName resourceName = CampaignCriterionSimulationName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]", "[TYPE]", "[MODIFICATION_METHOD]", "[START_DATE]", "[END_DATE]");
 *   CampaignCriterionSimulation response = campaignCriterionSimulationServiceClient.getCampaignCriterionSimulation(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ CarrierConstantServiceClient ============================
 *
 * <p>Service Description: Service to fetch carrier constants.
 *
 * <p>Sample for CarrierConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (CarrierConstantServiceClient carrierConstantServiceClient = CarrierConstantServiceClient.create()) {
 *   CarrierConstantName resourceName = CarrierConstantName.of("[CRITERION_ID]");
 *   CarrierConstant response = carrierConstantServiceClient.getCarrierConstant(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= ChangeStatusServiceClient =========================
 *
 * <p>Service Description: Service to fetch change statuses.
 *
 * <p>Sample for ChangeStatusServiceClient:
 *
 * <pre>
 * <code>
 * try (ChangeStatusServiceClient changeStatusServiceClient = ChangeStatusServiceClient.create()) {
 *   ChangeStatusName resourceName = ChangeStatusName.of("[CUSTOMER_ID]", "[CHANGE_STATUS_ID]");
 *   ChangeStatus response = changeStatusServiceClient.getChangeStatus(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== ClickViewServiceClient ======================
 *
 * <p>Service Description: Service to fetch click views.
 *
 * <p>Sample for ClickViewServiceClient:
 *
 * <pre>
 * <code>
 * try (ClickViewServiceClient clickViewServiceClient = ClickViewServiceClient.create()) {
 *   ClickViewName resourceName = ClickViewName.of("[CUSTOMER_ID]", "[DATE]", "[GCLID]");
 *   ClickView response = clickViewServiceClient.getClickView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================= CombinedAudienceServiceClient =============================
 *
 * <p>Service Description: Service to manage combined audiences. This service can be used to list
 * all your combined audiences with metadata, but won't show the structure and components of the
 * combined audience.
 *
 * <p>Sample for CombinedAudienceServiceClient:
 *
 * <pre>
 * <code>
 * try (CombinedAudienceServiceClient combinedAudienceServiceClient = CombinedAudienceServiceClient.create()) {
 *   CombinedAudienceName resourceName = CombinedAudienceName.of("[CUSTOMER_ID]", "[COMBINED_AUDIENCE_ID]");
 *   CombinedAudience response = combinedAudienceServiceClient.getCombinedAudience(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================================= ConversionAdjustmentUploadServiceClient
 * =======================================
 *
 * <p>Service Description: Service to upload conversion adjustments.
 *
 * <p>Sample for ConversionAdjustmentUploadServiceClient:
 *
 * <pre>
 * <code>
 * try (ConversionAdjustmentUploadServiceClient conversionAdjustmentUploadServiceClient = ConversionAdjustmentUploadServiceClient.create()) {
 *   String customerId = "";
 *   List&lt;ConversionAdjustment&gt; conversionAdjustments = new ArrayList&lt;&gt;();
 *   boolean partialFailure = false;
 *   UploadConversionAdjustmentsResponse response = conversionAdjustmentUploadServiceClient.uploadConversionAdjustments(customerId, conversionAdjustments, partialFailure);
 * }
 * </code>
 * </pre>
 *
 * ============================= ConversionUploadServiceClient =============================
 *
 * <p>Service Description: Service to upload conversions.
 *
 * <p>Sample for ConversionUploadServiceClient:
 *
 * <pre>
 * <code>
 * try (ConversionUploadServiceClient conversionUploadServiceClient = ConversionUploadServiceClient.create()) {
 *   String customerId = "";
 *   List&lt;ClickConversion&gt; conversions = new ArrayList&lt;&gt;();
 *   boolean partialFailure = false;
 *   UploadClickConversionsResponse response = conversionUploadServiceClient.uploadClickConversions(customerId, conversions, partialFailure);
 * }
 * </code>
 * </pre>
 *
 * ============================= CurrencyConstantServiceClient =============================
 *
 * <p>Service Description: Service to fetch currency constants.
 *
 * <p>Sample for CurrencyConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (CurrencyConstantServiceClient currencyConstantServiceClient = CurrencyConstantServiceClient.create()) {
 *   CurrencyConstantName resourceName = CurrencyConstantName.of("[CODE]");
 *   CurrencyConstant response = currencyConstantServiceClient.getCurrencyConstant(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== CustomAudienceServiceClient ===========================
 *
 * <p>Service Description: Service to manage custom audiences.
 *
 * <p>Sample for CustomAudienceServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomAudienceServiceClient customAudienceServiceClient = CustomAudienceServiceClient.create()) {
 *   CustomAudienceName resourceName = CustomAudienceName.of("[CUSTOMER_ID]", "[CUSTOM_AUDIENCE_ID]");
 *   CustomAudience response = customAudienceServiceClient.getCustomAudience(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== CustomInterestServiceClient ===========================
 *
 * <p>Service Description: Service to manage custom interests.
 *
 * <p>Sample for CustomInterestServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomInterestServiceClient customInterestServiceClient = CustomInterestServiceClient.create()) {
 *   CustomInterestName resourceName = CustomInterestName.of("[CUSTOMER_ID]", "[CUSTOM_INTEREST_ID]");
 *   CustomInterest response = customInterestServiceClient.getCustomInterest(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== CustomerClientLinkServiceClient ===============================
 *
 * <p>Service Description: Service to manage customer client links.
 *
 * <p>Sample for CustomerClientLinkServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerClientLinkServiceClient customerClientLinkServiceClient = CustomerClientLinkServiceClient.create()) {
 *   CustomerClientLinkName resourceName = CustomerClientLinkName.of("[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]", "[MANAGER_LINK_ID]");
 *   CustomerClientLink response = customerClientLinkServiceClient.getCustomerClientLink(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== CustomerClientServiceClient ===========================
 *
 * <p>Service Description: Service to get clients in a customer's hierarchy.
 *
 * <p>Sample for CustomerClientServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerClientServiceClient customerClientServiceClient = CustomerClientServiceClient.create()) {
 *   CustomerClientName resourceName = CustomerClientName.of("[CUSTOMER_ID]", "[CLIENT_CUSTOMER_ID]");
 *   CustomerClient response = customerClientServiceClient.getCustomerClient(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================ CustomerManagerLinkServiceClient
 * ================================
 *
 * <p>Service Description: Service to manage customer-manager links.
 *
 * <p>Sample for CustomerManagerLinkServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient = CustomerManagerLinkServiceClient.create()) {
 *   CustomerManagerLinkName resourceName = CustomerManagerLinkName.of("[CUSTOMER_ID]", "[MANAGER_CUSTOMER_ID]", "[MANAGER_LINK_ID]");
 *   CustomerManagerLink response = customerManagerLinkServiceClient.getCustomerManagerLink(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== CustomerUserAccessServiceClient ===============================
 *
 * <p>Service Description: This service manages the permissions of a user on a given customer.
 *
 * <p>Sample for CustomerUserAccessServiceClient:
 *
 * <pre>
 * <code>
 * try (CustomerUserAccessServiceClient customerUserAccessServiceClient = CustomerUserAccessServiceClient.create()) {
 *   CustomerUserAccessName resourceName = CustomerUserAccessName.of("[CUSTOMER_ID]", "[USER_ID]");
 *   CustomerUserAccess response = customerUserAccessServiceClient.getCustomerUserAccess(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================ DetailPlacementViewServiceClient
 * ================================
 *
 * <p>Service Description: Service to fetch Detail Placement views.
 *
 * <p>Sample for DetailPlacementViewServiceClient:
 *
 * <pre>
 * <code>
 * try (DetailPlacementViewServiceClient detailPlacementViewServiceClient = DetailPlacementViewServiceClient.create()) {
 *   DetailPlacementViewName resourceName = DetailPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]");
 *   DetailPlacementView response = detailPlacementViewServiceClient.getDetailPlacementView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== DisplayKeywordViewServiceClient ===============================
 *
 * <p>Service Description: Service to manage display keyword views.
 *
 * <p>Sample for DisplayKeywordViewServiceClient:
 *
 * <pre>
 * <code>
 * try (DisplayKeywordViewServiceClient displayKeywordViewServiceClient = DisplayKeywordViewServiceClient.create()) {
 *   DisplayKeywordViewName resourceName = DisplayKeywordViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   DisplayKeywordView response = displayKeywordViewServiceClient.getDisplayKeywordView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= DistanceViewServiceClient =========================
 *
 * <p>Service Description: Service to fetch distance views.
 *
 * <p>Sample for DistanceViewServiceClient:
 *
 * <pre>
 * <code>
 * try (DistanceViewServiceClient distanceViewServiceClient = DistanceViewServiceClient.create()) {
 *   DistanceViewName resourceName = DistanceViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_CHAIN_ID]", "[DISTANCE_BUCKET]");
 *   DistanceView response = distanceViewServiceClient.getDistanceView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== DomainCategoryServiceClient ===========================
 *
 * <p>Service Description: Service to fetch domain categories.
 *
 * <p>Sample for DomainCategoryServiceClient:
 *
 * <pre>
 * <code>
 * try (DomainCategoryServiceClient domainCategoryServiceClient = DomainCategoryServiceClient.create()) {
 *   DomainCategoryName resourceName = DomainCategoryName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[BASE64_CATEGORY]", "[LANGUAGE_CODE]");
 *   DomainCategory response = domainCategoryServiceClient.getDomainCategory(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================================== DynamicSearchAdsSearchTermViewServiceClient
 * ===========================================
 *
 * <p>Service Description: Service to fetch dynamic search ads views.
 *
 * <p>Sample for DynamicSearchAdsSearchTermViewServiceClient:
 *
 * <pre>
 * <code>
 * try (DynamicSearchAdsSearchTermViewServiceClient dynamicSearchAdsSearchTermViewServiceClient = DynamicSearchAdsSearchTermViewServiceClient.create()) {
 *   DynamicSearchAdsSearchTermViewName resourceName = DynamicSearchAdsSearchTermViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[SEARCH_TERM_FINGERPRINT]", "[HEADLINE_FINGERPRINT]", "[LANDING_PAGE_FINGERPRINT]", "[PAGE_URL_FINGERPRINT]");
 *   DynamicSearchAdsSearchTermView response = dynamicSearchAdsSearchTermViewServiceClient.getDynamicSearchAdsSearchTermView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ==================================== ExpandedLandingPageViewServiceClient
 * ====================================
 *
 * <p>Service Description: Service to fetch expanded landing page views.
 *
 * <p>Sample for ExpandedLandingPageViewServiceClient:
 *
 * <pre>
 * <code>
 * try (ExpandedLandingPageViewServiceClient expandedLandingPageViewServiceClient = ExpandedLandingPageViewServiceClient.create()) {
 *   ExpandedLandingPageViewName resourceName = ExpandedLandingPageViewName.of("[CUSTOMER_ID]", "[EXPANDED_FINAL_URL_FINGERPRINT]");
 *   ExpandedLandingPageView response = expandedLandingPageViewServiceClient.getExpandedLandingPageView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================ FeedPlaceholderViewServiceClient
 * ================================
 *
 * <p>Service Description: Service to fetch feed placeholder views.
 *
 * <p>Sample for FeedPlaceholderViewServiceClient:
 *
 * <pre>
 * <code>
 * try (FeedPlaceholderViewServiceClient feedPlaceholderViewServiceClient = FeedPlaceholderViewServiceClient.create()) {
 *   FeedPlaceholderViewName resourceName = FeedPlaceholderViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_TYPE]");
 *   FeedPlaceholderView response = feedPlaceholderViewServiceClient.getFeedPlaceholderView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================= GenderViewServiceClient =======================
 *
 * <p>Service Description: Service to manage gender views.
 *
 * <p>Sample for GenderViewServiceClient:
 *
 * <pre>
 * <code>
 * try (GenderViewServiceClient genderViewServiceClient = GenderViewServiceClient.create()) {
 *   GenderViewName resourceName = GenderViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   GenderView response = genderViewServiceClient.getGenderView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================== GeoTargetConstantServiceClient ==============================
 *
 * <p>Service Description: Service to fetch geo target constants.
 *
 * <p>Sample for GeoTargetConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (GeoTargetConstantServiceClient geoTargetConstantServiceClient = GeoTargetConstantServiceClient.create()) {
 *   GeoTargetConstantName resourceName = GeoTargetConstantName.of("[CRITERION_ID]");
 *   GeoTargetConstant response = geoTargetConstantServiceClient.getGeoTargetConstant(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== GeographicViewServiceClient ===========================
 *
 * <p>Service Description: Service to manage geographic views.
 *
 * <p>Sample for GeographicViewServiceClient:
 *
 * <pre>
 * <code>
 * try (GeographicViewServiceClient geographicViewServiceClient = GeographicViewServiceClient.create()) {
 *   GeographicViewName resourceName = GeographicViewName.of("[CUSTOMER_ID]", "[COUNTRY_CRITERION_ID]", "[LOCATION_TYPE]");
 *   GeographicView response = geographicViewServiceClient.getGeographicView(resourceName);
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
 *   GoogleAdsFieldName resourceName = GoogleAdsFieldName.of("[GOOGLE_ADS_FIELD]");
 *   GoogleAdsField response = googleAdsFieldServiceClient.getGoogleAdsField(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== GroupPlacementViewServiceClient ===============================
 *
 * <p>Service Description: Service to fetch Group Placement views.
 *
 * <p>Sample for GroupPlacementViewServiceClient:
 *
 * <pre>
 * <code>
 * try (GroupPlacementViewServiceClient groupPlacementViewServiceClient = GroupPlacementViewServiceClient.create()) {
 *   GroupPlacementViewName resourceName = GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]");
 *   GroupPlacementView response = groupPlacementViewServiceClient.getGroupPlacementView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== HotelGroupViewServiceClient ===========================
 *
 * <p>Service Description: Service to manage Hotel Group Views.
 *
 * <p>Sample for HotelGroupViewServiceClient:
 *
 * <pre>
 * <code>
 * try (HotelGroupViewServiceClient hotelGroupViewServiceClient = HotelGroupViewServiceClient.create()) {
 *   HotelGroupViewName resourceName = HotelGroupViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   HotelGroupView response = hotelGroupViewServiceClient.getHotelGroupView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================= HotelPerformanceViewServiceClient
 * =================================
 *
 * <p>Service Description: Service to manage Hotel Performance Views.
 *
 * <p>Sample for HotelPerformanceViewServiceClient:
 *
 * <pre>
 * <code>
 * try (HotelPerformanceViewServiceClient hotelPerformanceViewServiceClient = HotelPerformanceViewServiceClient.create()) {
 *   HotelPerformanceViewName resourceName = HotelPerformanceViewName.of("[CUSTOMER_ID]");
 *   HotelPerformanceView response = hotelPerformanceViewServiceClient.getHotelPerformanceView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ IncomeRangeViewServiceClient ============================
 *
 * <p>Service Description: Service to manage income range views.
 *
 * <p>Sample for IncomeRangeViewServiceClient:
 *
 * <pre>
 * <code>
 * try (IncomeRangeViewServiceClient incomeRangeViewServiceClient = IncomeRangeViewServiceClient.create()) {
 *   IncomeRangeViewName resourceName = IncomeRangeViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   IncomeRangeView response = incomeRangeViewServiceClient.getIncomeRangeView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ==================== InvoiceServiceClient ====================
 *
 * <p>Service Description: A service to fetch invoices issued for a billing setup during a given
 * month.
 *
 * <p>Sample for InvoiceServiceClient:
 *
 * <pre>
 * <code>
 * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
 *   String customerId = "";
 *   String billingSetup = "";
 *   String issueYear = "";
 *   MonthOfYearEnum.MonthOfYear issueMonth = MonthOfYearEnum.MonthOfYear.UNSPECIFIED;
 *   ListInvoicesResponse response = invoiceServiceClient.listInvoices(customerId, billingSetup, issueYear, issueMonth);
 * }
 * </code>
 * </pre>
 *
 * ============================ KeywordPlanIdeaServiceClient ============================
 *
 * <p>Service Description: Service to generate keyword ideas.
 *
 * <p>Sample for KeywordPlanIdeaServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient = KeywordPlanIdeaServiceClient.create()) {
 *   GenerateKeywordIdeasRequest request = GenerateKeywordIdeasRequest.newBuilder().build();
 *   GenerateKeywordIdeasPagedResponse response = keywordPlanIdeaServiceClient.generateKeywordIdeasPagedCallable(request);
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
 *   KeywordViewName resourceName = KeywordViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   KeywordView response = keywordViewServiceClient.getKeywordView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ LandingPageViewServiceClient ============================
 *
 * <p>Service Description: Service to fetch landing page views.
 *
 * <p>Sample for LandingPageViewServiceClient:
 *
 * <pre>
 * <code>
 * try (LandingPageViewServiceClient landingPageViewServiceClient = LandingPageViewServiceClient.create()) {
 *   LandingPageViewName resourceName = LandingPageViewName.of("[CUSTOMER_ID]", "[UNEXPANDED_FINAL_URL_FINGERPRINT]");
 *   LandingPageView response = landingPageViewServiceClient.getLandingPageView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================= LanguageConstantServiceClient =============================
 *
 * <p>Service Description: Service to fetch language constants.
 *
 * <p>Sample for LanguageConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (LanguageConstantServiceClient languageConstantServiceClient = LanguageConstantServiceClient.create()) {
 *   LanguageConstantName resourceName = LanguageConstantName.of("[CRITERION_ID]");
 *   LanguageConstant response = languageConstantServiceClient.getLanguageConstant(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ========================= LocationViewServiceClient =========================
 *
 * <p>Service Description: Service to fetch location views.
 *
 * <p>Sample for LocationViewServiceClient:
 *
 * <pre>
 * <code>
 * try (LocationViewServiceClient locationViewServiceClient = LocationViewServiceClient.create()) {
 *   LocationViewName resourceName = LocationViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");
 *   LocationView response = locationViewServiceClient.getLocationView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================= ManagedPlacementViewServiceClient
 * =================================
 *
 * <p>Service Description: Service to manage Managed Placement views.
 *
 * <p>Sample for ManagedPlacementViewServiceClient:
 *
 * <pre>
 * <code>
 * try (ManagedPlacementViewServiceClient managedPlacementViewServiceClient = ManagedPlacementViewServiceClient.create()) {
 *   ManagedPlacementViewName resourceName = ManagedPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   ManagedPlacementView response = managedPlacementViewServiceClient.getManagedPlacementView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== MerchantCenterLinkServiceClient ===============================
 *
 * <p>Service Description: This service allows management of links between Google Ads and Google
 * Merchant Center.
 *
 * <p>Sample for MerchantCenterLinkServiceClient:
 *
 * <pre>
 * <code>
 * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient = MerchantCenterLinkServiceClient.create()) {
 *   String customerId = "";
 *   ListMerchantCenterLinksResponse response = merchantCenterLinkServiceClient.listMerchantCenterLinks(customerId);
 * }
 * </code>
 * </pre>
 *
 * ====================================== MobileAppCategoryConstantServiceClient
 * ======================================
 *
 * <p>Service Description: Service to fetch mobile app category constants.
 *
 * <p>Sample for MobileAppCategoryConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (MobileAppCategoryConstantServiceClient mobileAppCategoryConstantServiceClient = MobileAppCategoryConstantServiceClient.create()) {
 *   MobileAppCategoryConstantName resourceName = MobileAppCategoryConstantName.of("[MOBILE_APP_CATEGORY_ID]");
 *   MobileAppCategoryConstant response = mobileAppCategoryConstantServiceClient.getMobileAppCategoryConstant(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================================= MobileDeviceConstantServiceClient
 * =================================
 *
 * <p>Service Description: Service to fetch mobile device constants.
 *
 * <p>Sample for MobileDeviceConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (MobileDeviceConstantServiceClient mobileDeviceConstantServiceClient = MobileDeviceConstantServiceClient.create()) {
 *   MobileDeviceConstantName resourceName = MobileDeviceConstantName.of("[CRITERION_ID]");
 *   MobileDeviceConstant response = mobileDeviceConstantServiceClient.getMobileDeviceConstant(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== OfflineUserDataJobServiceClient ===============================
 *
 * <p>Service Description: Service to manage offline user data jobs.
 *
 * <p>Sample for OfflineUserDataJobServiceClient:
 *
 * <pre>
 * <code>
 * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient = OfflineUserDataJobServiceClient.create()) {
 *   String customerId = "";
 *   OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();
 *   CreateOfflineUserDataJobResponse response = offlineUserDataJobServiceClient.createOfflineUserDataJob(customerId, job);
 * }
 * </code>
 * </pre>
 *
 * =========================================== OperatingSystemVersionConstantServiceClient
 * ===========================================
 *
 * <p>Service Description: Service to fetch Operating System Version constants.
 *
 * <p>Sample for OperatingSystemVersionConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (OperatingSystemVersionConstantServiceClient operatingSystemVersionConstantServiceClient = OperatingSystemVersionConstantServiceClient.create()) {
 *   OperatingSystemVersionConstantName resourceName = OperatingSystemVersionConstantName.of("[CRITERION_ID]");
 *   OperatingSystemVersionConstant response = operatingSystemVersionConstantServiceClient.getOperatingSystemVersionConstant(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================================== PaidOrganicSearchTermViewServiceClient
 * ======================================
 *
 * <p>Service Description: Service to fetch paid organic search term views.
 *
 * <p>Sample for PaidOrganicSearchTermViewServiceClient:
 *
 * <pre>
 * <code>
 * try (PaidOrganicSearchTermViewServiceClient paidOrganicSearchTermViewServiceClient = PaidOrganicSearchTermViewServiceClient.create()) {
 *   PaidOrganicSearchTermViewName resourceName = PaidOrganicSearchTermViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[AD_GROUP_ID]", "[BASE64_SEARCH_TERM]");
 *   PaidOrganicSearchTermView response = paidOrganicSearchTermViewServiceClient.getPaidOrganicSearchTermView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =============================== ParentalStatusViewServiceClient ===============================
 *
 * <p>Service Description: Service to manage parental status views.
 *
 * <p>Sample for ParentalStatusViewServiceClient:
 *
 * <pre>
 * <code>
 * try (ParentalStatusViewServiceClient parentalStatusViewServiceClient = ParentalStatusViewServiceClient.create()) {
 *   ParentalStatusViewName resourceName = ParentalStatusViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   ParentalStatusView response = parentalStatusViewServiceClient.getParentalStatusView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ PaymentsAccountServiceClient ============================
 *
 * <p>Service Description: Service to provide payments accounts that can be used to set up
 * consolidated billing.
 *
 * <p>Sample for PaymentsAccountServiceClient:
 *
 * <pre>
 * <code>
 * try (PaymentsAccountServiceClient paymentsAccountServiceClient = PaymentsAccountServiceClient.create()) {
 *   String customerId = "";
 *   ListPaymentsAccountsResponse response = paymentsAccountServiceClient.listPaymentsAccounts(customerId);
 * }
 * </code>
 * </pre>
 *
 * =========================================== ProductBiddingCategoryConstantServiceClient
 * ===========================================
 *
 * <p>Service Description: Service to fetch Product Bidding Categories.
 *
 * <p>Sample for ProductBiddingCategoryConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (ProductBiddingCategoryConstantServiceClient productBiddingCategoryConstantServiceClient = ProductBiddingCategoryConstantServiceClient.create()) {
 *   ProductBiddingCategoryConstantName resourceName = ProductBiddingCategoryConstantName.of("[COUNTRY_CODE]", "[LEVEL]", "[ID]");
 *   ProductBiddingCategoryConstant response = productBiddingCategoryConstantServiceClient.getProductBiddingCategoryConstant(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================= ProductGroupViewServiceClient =============================
 *
 * <p>Service Description: Service to manage product group views.
 *
 * <p>Sample for ProductGroupViewServiceClient:
 *
 * <pre>
 * <code>
 * try (ProductGroupViewServiceClient productGroupViewServiceClient = ProductGroupViewServiceClient.create()) {
 *   ProductGroupViewName resourceName = ProductGroupViewName.of("[CUSTOMER_ID]", "[ADGROUP_ID]", "[CRITERION_ID]");
 *   ProductGroupView response = productGroupViewServiceClient.getProductGroupView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== ReachPlanServiceClient ======================
 *
 * <p>Service Description: Reach Plan Service gives users information about audience size that can
 * be reached through advertisement on YouTube. In particular, GenerateReachForecast provides
 * estimated number of people of specified demographics that can be reached by an ad in a given
 * market by a campaign of certain duration with a defined budget.
 *
 * <p>Sample for ReachPlanServiceClient:
 *
 * <pre>
 * <code>
 * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
 *   String plannableLocationId = "";
 *   ListPlannableProductsResponse response = reachPlanServiceClient.listPlannableProducts(plannableLocationId);
 * }
 * </code>
 * </pre>
 *
 * =========================== RecommendationServiceClient ===========================
 *
 * <p>Service Description: Service to manage recommendations.
 *
 * <p>Sample for RecommendationServiceClient:
 *
 * <pre>
 * <code>
 * try (RecommendationServiceClient recommendationServiceClient = RecommendationServiceClient.create()) {
 *   RecommendationName resourceName = RecommendationName.of("[CUSTOMER_ID]", "[RECOMMENDATION_ID]");
 *   Recommendation response = recommendationServiceClient.getRecommendation(resourceName);
 * }
 * </code>
 * </pre>
 *
 * =========================== SearchTermViewServiceClient ===========================
 *
 * <p>Service Description: Service to manage search term views.
 *
 * <p>Sample for SearchTermViewServiceClient:
 *
 * <pre>
 * <code>
 * try (SearchTermViewServiceClient searchTermViewServiceClient = SearchTermViewServiceClient.create()) {
 *   SearchTermViewName resourceName = SearchTermViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[AD_GROUP_ID]", "[QUERY]");
 *   SearchTermView response = searchTermViewServiceClient.getSearchTermView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ==================================== ShoppingPerformanceViewServiceClient
 * ====================================
 *
 * <p>Service Description: Service to fetch Shopping performance views.
 *
 * <p>Sample for ShoppingPerformanceViewServiceClient:
 *
 * <pre>
 * <code>
 * try (ShoppingPerformanceViewServiceClient shoppingPerformanceViewServiceClient = ShoppingPerformanceViewServiceClient.create()) {
 *   ShoppingPerformanceViewName resourceName = ShoppingPerformanceViewName.of("[CUSTOMER_ID]");
 *   ShoppingPerformanceView response = shoppingPerformanceViewServiceClient.getShoppingPerformanceView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================================= ThirdPartyAppAnalyticsLinkServiceClient
 * =======================================
 *
 * <p>Service Description: This service allows management of links between Google Ads and third
 * party app analytics.
 *
 * <p>Sample for ThirdPartyAppAnalyticsLinkServiceClient:
 *
 * <pre>
 * <code>
 * try (ThirdPartyAppAnalyticsLinkServiceClient thirdPartyAppAnalyticsLinkServiceClient = ThirdPartyAppAnalyticsLinkServiceClient.create()) {
 *   GetThirdPartyAppAnalyticsLinkRequest request = GetThirdPartyAppAnalyticsLinkRequest.newBuilder().build();
 *   ThirdPartyAppAnalyticsLink response = thirdPartyAppAnalyticsLinkServiceClient.getThirdPartyAppAnalyticsLink(request);
 * }
 * </code>
 * </pre>
 *
 * ========================== TopicConstantServiceClient ==========================
 *
 * <p>Service Description: Service to fetch topic constants.
 *
 * <p>Sample for TopicConstantServiceClient:
 *
 * <pre>
 * <code>
 * try (TopicConstantServiceClient topicConstantServiceClient = TopicConstantServiceClient.create()) {
 *   TopicConstantName resourceName = TopicConstantName.of("[TOPIC_ID]");
 *   TopicConstant response = topicConstantServiceClient.getTopicConstant(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== TopicViewServiceClient ======================
 *
 * <p>Service Description: Service to manage topic views.
 *
 * <p>Sample for TopicViewServiceClient:
 *
 * <pre>
 * <code>
 * try (TopicViewServiceClient topicViewServiceClient = TopicViewServiceClient.create()) {
 *   TopicViewName resourceName = TopicViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
 *   TopicView response = topicViewServiceClient.getTopicView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ===================== UserDataServiceClient =====================
 *
 * <p>Service Description: Service to manage user data uploads. Accessible only to customers on the
 * allow-list.
 *
 * <p>Sample for UserDataServiceClient:
 *
 * <pre>
 * <code>
 * try (UserDataServiceClient userDataServiceClient = UserDataServiceClient.create()) {
 *   String customerId = "";
 *   List&lt;UserDataOperation&gt; operations = new ArrayList&lt;&gt;();
 *   UploadUserDataRequest request = UploadUserDataRequest.newBuilder()
 *     .setCustomerId(customerId)
 *     .addAllOperations(operations)
 *     .build();
 *   UploadUserDataResponse response = userDataServiceClient.uploadUserData(request);
 * }
 * </code>
 * </pre>
 *
 * ========================= UserInterestServiceClient =========================
 *
 * <p>Service Description: Service to fetch Google Ads User Interest.
 *
 * <p>Sample for UserInterestServiceClient:
 *
 * <pre>
 * <code>
 * try (UserInterestServiceClient userInterestServiceClient = UserInterestServiceClient.create()) {
 *   UserInterestName resourceName = UserInterestName.of("[CUSTOMER_ID]", "[USER_INTEREST_ID]");
 *   UserInterest response = userInterestServiceClient.getUserInterest(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================= UserLocationViewServiceClient =============================
 *
 * <p>Service Description: Service to manage user location views.
 *
 * <p>Sample for UserLocationViewServiceClient:
 *
 * <pre>
 * <code>
 * try (UserLocationViewServiceClient userLocationViewServiceClient = UserLocationViewServiceClient.create()) {
 *   UserLocationViewName resourceName = UserLocationViewName.of("[CUSTOMER_ID]", "[COUNTRY_CRITERION_ID]", "[IS_TARGETING_LOCATION]");
 *   UserLocationView response = userLocationViewServiceClient.getUserLocationView(resourceName);
 * }
 * </code>
 * </pre>
 *
 * ================== VideoServiceClient ==================
 *
 * <p>Service Description: Service to manage videos.
 *
 * <p>Sample for VideoServiceClient:
 *
 * <pre>
 * <code>
 * try (VideoServiceClient videoServiceClient = VideoServiceClient.create()) {
 *   VideoName resourceName = VideoName.of("[CUSTOMER_ID]", "[VIDEO_ID]");
 *   Video response = videoServiceClient.getVideo(resourceName);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.ads.googleads.v6.services;

import javax.annotation.Generated;
