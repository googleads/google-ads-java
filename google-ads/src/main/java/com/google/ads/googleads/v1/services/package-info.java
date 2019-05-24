/*
 * Copyright 2019 Google LLC
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
 * version. Please use BudgetOrderService until then:
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
 *   String formattedResourceName = AccountBudgetProposalServiceClient.formatAccountBudgetProposalName("[CUSTOMER]", "[ACCOUNT_BUDGET_PROPOSAL]");
 *   AccountBudgetProposal response = accountBudgetProposalServiceClient.getAccountBudgetProposal(formattedResourceName);
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
 *   String formattedResourceName = AccountBudgetServiceClient.formatAccountBudgetName("[CUSTOMER]", "[ACCOUNT_BUDGET]");
 *   AccountBudget response = accountBudgetServiceClient.getAccountBudget(formattedResourceName);
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
 *   String formattedResourceName = AdGroupAdLabelServiceClient.formatAdGroupAdLabelName("[CUSTOMER]", "[AD_GROUP_AD_LABEL]");
 *   AdGroupAdLabel response = adGroupAdLabelServiceClient.getAdGroupAdLabel(formattedResourceName);
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
 *   String formattedResourceName = AdGroupAdServiceClient.formatAdGroupAdName("[CUSTOMER]", "[AD_GROUP_AD]");
 *   AdGroupAd response = adGroupAdServiceClient.getAdGroupAd(formattedResourceName);
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
 *   String formattedResourceName = AdGroupAudienceViewServiceClient.formatAdGroupAudienceViewName("[CUSTOMER]", "[AD_GROUP_AUDIENCE_VIEW]");
 *   AdGroupAudienceView response = adGroupAudienceViewServiceClient.getAdGroupAudienceView(formattedResourceName);
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
 *   String formattedResourceName = AdGroupBidModifierServiceClient.formatAdGroupBidModifierName("[CUSTOMER]", "[AD_GROUP_BID_MODIFIER]");
 *   AdGroupBidModifier response = adGroupBidModifierServiceClient.getAdGroupBidModifier(formattedResourceName);
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
 *   String formattedResourceName = AdGroupCriterionLabelServiceClient.formatAdGroupCriterionLabelName("[CUSTOMER]", "[AD_GROUP_CRITERION_LABEL]");
 *   AdGroupCriterionLabel response = adGroupCriterionLabelServiceClient.getAdGroupCriterionLabel(formattedResourceName);
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
 *   String formattedResourceName = AdGroupCriterionSimulationServiceClient.formatAdGroupCriterionSimulationName("[CUSTOMER]", "[AD_GROUP_CRITERION_SIMULATION]");
 *   AdGroupCriterionSimulation response = adGroupCriterionSimulationServiceClient.getAdGroupCriterionSimulation(formattedResourceName);
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
 *   String formattedResourceName = AdGroupExtensionSettingServiceClient.formatAdGroupExtensionSettingName("[CUSTOMER]", "[AD_GROUP_EXTENSION_SETTING]");
 *   AdGroupExtensionSetting response = adGroupExtensionSettingServiceClient.getAdGroupExtensionSetting(formattedResourceName);
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
 *   String formattedResourceName = AdGroupFeedServiceClient.formatAdGroupFeedName("[CUSTOMER]", "[AD_GROUP_FEED]");
 *   AdGroupFeed response = adGroupFeedServiceClient.getAdGroupFeed(formattedResourceName);
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
 *   String formattedResourceName = AdGroupLabelServiceClient.formatAdGroupLabelName("[CUSTOMER]", "[AD_GROUP_LABEL]");
 *   AdGroupLabel response = adGroupLabelServiceClient.getAdGroupLabel(formattedResourceName);
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
 * ============================== AdGroupSimulationServiceClient ==============================
 *
 * <p>Service Description: Service to fetch ad group simulations.
 *
 * <p>Sample for AdGroupSimulationServiceClient:
 *
 * <pre>
 * <code>
 * try (AdGroupSimulationServiceClient adGroupSimulationServiceClient = AdGroupSimulationServiceClient.create()) {
 *   String formattedResourceName = AdGroupSimulationServiceClient.formatAdGroupSimulationName("[CUSTOMER]", "[AD_GROUP_SIMULATION]");
 *   AdGroupSimulation response = adGroupSimulationServiceClient.getAdGroupSimulation(formattedResourceName);
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
 *   String formattedResourceName = AdParameterServiceClient.formatAdParameterName("[CUSTOMER]", "[AD_PARAMETER]");
 *   AdParameter response = adParameterServiceClient.getAdParameter(formattedResourceName);
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
 *   String formattedResourceName = AdScheduleViewServiceClient.formatAdScheduleViewName("[CUSTOMER]", "[AD_SCHEDULE_VIEW]");
 *   AdScheduleView response = adScheduleViewServiceClient.getAdScheduleView(formattedResourceName);
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
 *   String formattedResourceName = AgeRangeViewServiceClient.formatAgeRangeViewName("[CUSTOMER]", "[AGE_RANGE_VIEW]");
 *   AgeRangeView response = ageRangeViewServiceClient.getAgeRangeView(formattedResourceName);
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
 *   String formattedResourceName = AssetServiceClient.formatAssetName("[CUSTOMER]", "[ASSET]");
 *   Asset response = assetServiceClient.getAsset(formattedResourceName);
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
 * ========================= BillingSetupServiceClient =========================
 *
 * <p>Service Description: A service for designating the business entity responsible for accrued
 * costs.
 *
 * <p>A billing setup is associated with a Payments account. Billing-related activity for all
 * billing setups associated with a particular Payments account will appear on a single invoice
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
 *   String formattedResourceName = BillingSetupServiceClient.formatBillingSetupName("[CUSTOMER]", "[BILLING_SETUP]");
 *   BillingSetup response = billingSetupServiceClient.getBillingSetup(formattedResourceName);
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
 *   String formattedResourceName = CampaignAudienceViewServiceClient.formatCampaignAudienceViewName("[CUSTOMER]", "[CAMPAIGN_AUDIENCE_VIEW]");
 *   CampaignAudienceView response = campaignAudienceViewServiceClient.getCampaignAudienceView(formattedResourceName);
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
 *   String formattedResourceName = CampaignBidModifierServiceClient.formatCampaignBidModifierName("[CUSTOMER]", "[CAMPAIGN_BID_MODIFIER]");
 *   CampaignBidModifier response = campaignBidModifierServiceClient.getCampaignBidModifier(formattedResourceName);
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
 *   String formattedResourceName = CampaignCriterionSimulationServiceClient.formatCampaignCriterionSimulationName("[CUSTOMER]", "[CAMPAIGN_CRITERION_SIMULATION]");
 *   CampaignCriterionSimulation response = campaignCriterionSimulationServiceClient.getCampaignCriterionSimulation(formattedResourceName);
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
 *   String formattedResourceName = CampaignDraftServiceClient.formatCampaignDraftName("[CUSTOMER]", "[CAMPAIGN_DRAFT]");
 *   CampaignDraft response = campaignDraftServiceClient.getCampaignDraft(formattedResourceName);
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
 *   String formattedResourceName = CampaignExperimentServiceClient.formatCampaignExperimentName("[CUSTOMER]", "[CAMPAIGN_EXPERIMENT]");
 *   CampaignExperiment response = campaignExperimentServiceClient.getCampaignExperiment(formattedResourceName);
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
 *   String formattedResourceName = CampaignExtensionSettingServiceClient.formatCampaignExtensionSettingName("[CUSTOMER]", "[CAMPAIGN_EXTENSION_SETTING]");
 *   CampaignExtensionSetting response = campaignExtensionSettingServiceClient.getCampaignExtensionSetting(formattedResourceName);
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
 *   String formattedResourceName = CampaignFeedServiceClient.formatCampaignFeedName("[CUSTOMER]", "[CAMPAIGN_FEED]");
 *   CampaignFeed response = campaignFeedServiceClient.getCampaignFeed(formattedResourceName);
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
 *   String formattedResourceName = CampaignLabelServiceClient.formatCampaignLabelName("[CUSTOMER]", "[CAMPAIGN_LABEL]");
 *   CampaignLabel response = campaignLabelServiceClient.getCampaignLabel(formattedResourceName);
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
 * ============================== CampaignSharedSetServiceClient ==============================
 *
 * <p>Service Description: Service to manage campaign shared sets.
 *
 * <p>Sample for CampaignSharedSetServiceClient:
 *
 * <pre>
 * <code>
 * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient = CampaignSharedSetServiceClient.create()) {
 *   String formattedResourceName = CampaignSharedSetServiceClient.formatCampaignSharedSetName("[CUSTOMER]", "[CAMPAIGN_SHARED_SET]");
 *   CampaignSharedSet response = campaignSharedSetServiceClient.getCampaignSharedSet(formattedResourceName);
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
 *   String formattedResourceName = CarrierConstantServiceClient.formatCarrierConstantName("[CARRIER_CONSTANT]");
 *   CarrierConstant response = carrierConstantServiceClient.getCarrierConstant(formattedResourceName);
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
 *   String formattedResourceName = ChangeStatusServiceClient.formatChangeStatusName("[CUSTOMER]", "[CHANGE_STATUS]");
 *   ChangeStatus response = changeStatusServiceClient.getChangeStatus(formattedResourceName);
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
 *   String formattedResourceName = ClickViewServiceClient.formatClickViewName("[CUSTOMER]", "[CLICK_VIEW]");
 *   ClickView response = clickViewServiceClient.getClickView(formattedResourceName);
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
 *   String formattedResourceName = ConversionActionServiceClient.formatConversionActionName("[CUSTOMER]", "[CONVERSION_ACTION]");
 *   ConversionAction response = conversionActionServiceClient.getConversionAction(formattedResourceName);
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
 *   boolean validateOnly = false;
 *   UploadConversionAdjustmentsResponse response = conversionAdjustmentUploadServiceClient.uploadConversionAdjustments(customerId, conversionAdjustments, partialFailure, validateOnly);
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
 *   boolean validateOnly = false;
 *   UploadClickConversionsResponse response = conversionUploadServiceClient.uploadClickConversions(customerId, conversions, partialFailure, validateOnly);
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
 *   String formattedResourceName = CustomInterestServiceClient.formatCustomInterestName("[CUSTOMER]", "[CUSTOM_INTEREST]");
 *   CustomInterest response = customInterestServiceClient.getCustomInterest(formattedResourceName);
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
 *   String formattedResourceName = CustomerClientLinkServiceClient.formatCustomerClientLinkName("[CUSTOMER]", "[CUSTOMER_CLIENT_LINK]");
 *   CustomerClientLink response = customerClientLinkServiceClient.getCustomerClientLink(formattedResourceName);
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
 *   String formattedResourceName = CustomerClientServiceClient.formatCustomerClientName("[CUSTOMER]", "[CUSTOMER_CLIENT]");
 *   CustomerClient response = customerClientServiceClient.getCustomerClient(formattedResourceName);
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
 *   String formattedResourceName = CustomerExtensionSettingServiceClient.formatCustomerExtensionSettingName("[CUSTOMER]", "[CUSTOMER_EXTENSION_SETTING]");
 *   CustomerExtensionSetting response = customerExtensionSettingServiceClient.getCustomerExtensionSetting(formattedResourceName);
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
 *   String formattedResourceName = CustomerFeedServiceClient.formatCustomerFeedName("[CUSTOMER]", "[CUSTOMER_FEED]");
 *   CustomerFeed response = customerFeedServiceClient.getCustomerFeed(formattedResourceName);
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
 *   String formattedResourceName = CustomerLabelServiceClient.formatCustomerLabelName("[CUSTOMER]", "[CUSTOMER_LABEL]");
 *   CustomerLabel response = customerLabelServiceClient.getCustomerLabel(formattedResourceName);
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
 *   String formattedResourceName = CustomerManagerLinkServiceClient.formatCustomerManagerLinkName("[CUSTOMER]", "[CUSTOMER_MANAGER_LINK]");
 *   CustomerManagerLink response = customerManagerLinkServiceClient.getCustomerManagerLink(formattedResourceName);
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
 *   String formattedResourceName = CustomerNegativeCriterionServiceClient.formatCustomerNegativeCriteriaName("[CUSTOMER]", "[CUSTOMER_NEGATIVE_CRITERIA]");
 *   CustomerNegativeCriterion response = customerNegativeCriterionServiceClient.getCustomerNegativeCriterion(formattedResourceName);
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
 *   String formattedResourceName = DetailPlacementViewServiceClient.formatDetailPlacementViewName("[CUSTOMER]", "[DETAIL_PLACEMENT_VIEW]");
 *   DetailPlacementView response = detailPlacementViewServiceClient.getDetailPlacementView(formattedResourceName);
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
 *   String formattedResourceName = DisplayKeywordViewServiceClient.formatDisplayKeywordViewName("[CUSTOMER]", "[DISPLAY_KEYWORD_VIEW]");
 *   DisplayKeywordView response = displayKeywordViewServiceClient.getDisplayKeywordView(formattedResourceName);
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
 *   String formattedResourceName = DomainCategoryServiceClient.formatDomainCategoryName("[CUSTOMER]", "[DOMAIN_CATEGORY]");
 *   DomainCategory response = domainCategoryServiceClient.getDomainCategory(formattedResourceName);
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
 *   String formattedResourceName = DynamicSearchAdsSearchTermViewServiceClient.formatDynamicSearchAdsSearchTermViewName("[CUSTOMER]", "[DYNAMIC_SEARCH_ADS_SEARCH_TERM_VIEW]");
 *   DynamicSearchAdsSearchTermView response = dynamicSearchAdsSearchTermViewServiceClient.getDynamicSearchAdsSearchTermView(formattedResourceName);
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
 *   String formattedResourceName = ExpandedLandingPageViewServiceClient.formatExpandedLandingPageViewName("[CUSTOMER]", "[EXPANDED_LANDING_PAGE_VIEW]");
 *   ExpandedLandingPageView response = expandedLandingPageViewServiceClient.getExpandedLandingPageView(formattedResourceName);
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
 *   String formattedResourceName = ExtensionFeedItemServiceClient.formatExtensionFeedItemName("[CUSTOMER]", "[EXTENSION_FEED_ITEM]");
 *   ExtensionFeedItem response = extensionFeedItemServiceClient.getExtensionFeedItem(formattedResourceName);
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
 *   String formattedResourceName = FeedItemServiceClient.formatFeedItemName("[CUSTOMER]", "[FEED_ITEM]");
 *   FeedItem response = feedItemServiceClient.getFeedItem(formattedResourceName);
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
 *   String formattedResourceName = FeedItemTargetServiceClient.formatFeedItemTargetName("[CUSTOMER]", "[FEED_ITEM_TARGET]");
 *   FeedItemTarget response = feedItemTargetServiceClient.getFeedItemTarget(formattedResourceName);
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
 *   String formattedResourceName = FeedMappingServiceClient.formatFeedMappingName("[CUSTOMER]", "[FEED_MAPPING]");
 *   FeedMapping response = feedMappingServiceClient.getFeedMapping(formattedResourceName);
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
 *   String formattedResourceName = FeedPlaceholderViewServiceClient.formatFeedPlaceholderViewName("[CUSTOMER]", "[FEED_PLACEHOLDER_VIEW]");
 *   FeedPlaceholderView response = feedPlaceholderViewServiceClient.getFeedPlaceholderView(formattedResourceName);
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
 *   String formattedResourceName = FeedServiceClient.formatFeedName("[CUSTOMER]", "[FEED]");
 *   Feed response = feedServiceClient.getFeed(formattedResourceName);
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
 *   String formattedResourceName = GenderViewServiceClient.formatGenderViewName("[CUSTOMER]", "[GENDER_VIEW]");
 *   GenderView response = genderViewServiceClient.getGenderView(formattedResourceName);
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
 *   String formattedResourceName = GeoTargetConstantServiceClient.formatGeoTargetConstantName("[GEO_TARGET_CONSTANT]");
 *   GeoTargetConstant response = geoTargetConstantServiceClient.getGeoTargetConstant(formattedResourceName);
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
 *   String formattedResourceName = GeographicViewServiceClient.formatGeographicViewName("[CUSTOMER]", "[GEOGRAPHIC_VIEW]");
 *   GeographicView response = geographicViewServiceClient.getGeographicView(formattedResourceName);
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
 *   List&lt;MutateOperation&gt; mutateOperations = new ArrayList&lt;&gt;();
 *   boolean partialFailure = false;
 *   boolean validateOnly = false;
 *   MutateGoogleAdsResponse response = googleAdsServiceClient.mutate(customerId, mutateOperations, partialFailure, validateOnly);
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
 *   String formattedResourceName = GroupPlacementViewServiceClient.formatGroupPlacementViewName("[CUSTOMER]", "[GROUP_PLACEMENT_VIEW]");
 *   GroupPlacementView response = groupPlacementViewServiceClient.getGroupPlacementView(formattedResourceName);
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
 *   String formattedResourceName = HotelGroupViewServiceClient.formatHotelGroupViewName("[CUSTOMER]", "[HOTEL_GROUP_VIEW]");
 *   HotelGroupView response = hotelGroupViewServiceClient.getHotelGroupView(formattedResourceName);
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
 *   String formattedResourceName = HotelPerformanceViewServiceClient.formatHotelPerformanceViewName("[CUSTOMER]");
 *   HotelPerformanceView response = hotelPerformanceViewServiceClient.getHotelPerformanceView(formattedResourceName);
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
 *   String formattedResourceName = KeywordPlanAdGroupServiceClient.formatKeywordPlanAdGroupName("[CUSTOMER]", "[KEYWORD_PLAN_AD_GROUP]");
 *   KeywordPlanAdGroup response = keywordPlanAdGroupServiceClient.getKeywordPlanAdGroup(formattedResourceName);
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
 *   String formattedResourceName = KeywordPlanCampaignServiceClient.formatKeywordPlanCampaignName("[CUSTOMER]", "[KEYWORD_PLAN_CAMPAIGN]");
 *   KeywordPlanCampaign response = keywordPlanCampaignServiceClient.getKeywordPlanCampaign(formattedResourceName);
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
 *   String customerId = "";
 *   StringValue language = StringValue.newBuilder().build();
 *   List&lt;StringValue&gt; geoTargetConstants = new ArrayList&lt;&gt;();
 *   KeywordPlanNetworkEnum.KeywordPlanNetwork keywordPlanNetwork = KeywordPlanNetworkEnum.KeywordPlanNetwork.UNSPECIFIED;
 *   GenerateKeywordIdeaResponse response = keywordPlanIdeaServiceClient.generateKeywordIdeas(customerId, language, geoTargetConstants, keywordPlanNetwork);
 * }
 * </code>
 * </pre>
 *
 * =============================== KeywordPlanKeywordServiceClient ===============================
 *
 * <p>Service Description: Service to manage Keyword Plan ad group keywords.
 *
 * <p>Sample for KeywordPlanKeywordServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient = KeywordPlanKeywordServiceClient.create()) {
 *   String formattedResourceName = KeywordPlanKeywordServiceClient.formatKeywordPlanKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_KEYWORD]");
 *   KeywordPlanKeyword response = keywordPlanKeywordServiceClient.getKeywordPlanKeyword(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ======================================= KeywordPlanNegativeKeywordServiceClient
 * =======================================
 *
 * <p>Service Description: Service to manage Keyword Plan negative keywords.
 *
 * <p>Sample for KeywordPlanNegativeKeywordServiceClient:
 *
 * <pre>
 * <code>
 * try (KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient = KeywordPlanNegativeKeywordServiceClient.create()) {
 *   String formattedResourceName = KeywordPlanNegativeKeywordServiceClient.formatKeywordPlanNegativeKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_NEGATIVE_KEYWORD]");
 *   KeywordPlanNegativeKeyword response = keywordPlanNegativeKeywordServiceClient.getKeywordPlanNegativeKeyword(formattedResourceName);
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
 *   String formattedResourceName = KeywordPlanServiceClient.formatKeywordPlanName("[CUSTOMER]", "[KEYWORD_PLAN]");
 *   KeywordPlan response = keywordPlanServiceClient.getKeywordPlan(formattedResourceName);
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
 *   String formattedResourceName = LabelServiceClient.formatLabelName("[CUSTOMER]", "[LABEL]");
 *   Label response = labelServiceClient.getLabel(formattedResourceName);
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
 *   String formattedResourceName = LandingPageViewServiceClient.formatLandingPageViewName("[CUSTOMER]", "[LANDING_PAGE_VIEW]");
 *   LandingPageView response = landingPageViewServiceClient.getLandingPageView(formattedResourceName);
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
 *   String formattedResourceName = LanguageConstantServiceClient.formatLanguageConstantName("[LANGUAGE_CONSTANT]");
 *   LanguageConstant response = languageConstantServiceClient.getLanguageConstant(formattedResourceName);
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
 *   String formattedResourceName = LocationViewServiceClient.formatLocationViewName("[CUSTOMER]", "[LOCATION_VIEW]");
 *   LocationView response = locationViewServiceClient.getLocationView(formattedResourceName);
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
 *   String formattedResourceName = ManagedPlacementViewServiceClient.formatManagedPlacementViewName("[CUSTOMER]", "[MANAGED_PLACEMENT_VIEW]");
 *   ManagedPlacementView response = managedPlacementViewServiceClient.getManagedPlacementView(formattedResourceName);
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
 *   String formattedResourceName = MediaFileServiceClient.formatMediaFileName("[CUSTOMER]", "[MEDIA_FILE]");
 *   MediaFile response = mediaFileServiceClient.getMediaFile(formattedResourceName);
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
 *   String formattedResourceName = MobileAppCategoryConstantServiceClient.formatMobileAppCategoryConstantName("[MOBILE_APP_CATEGORY_CONSTANT]");
 *   MobileAppCategoryConstant response = mobileAppCategoryConstantServiceClient.getMobileAppCategoryConstant(formattedResourceName);
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
 *   String formattedResourceName = MobileDeviceConstantServiceClient.formatMobileDeviceConstantName("[MOBILE_DEVICE_CONSTANT]");
 *   MobileDeviceConstant response = mobileDeviceConstantServiceClient.getMobileDeviceConstant(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ====================== MutateJobServiceClient ======================
 *
 * <p>Service Description: Service to manage mutate jobs.
 *
 * <p>Sample for MutateJobServiceClient:
 *
 * <pre>
 * <code>
 * try (MutateJobServiceClient mutateJobServiceClient = MutateJobServiceClient.create()) {
 *   String customerId = "";
 *   CreateMutateJobResponse response = mutateJobServiceClient.createMutateJob(customerId);
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
 *   String formattedResourceName = OperatingSystemVersionConstantServiceClient.formatOperatingSystemVersionConstantName("[OPERATING_SYSTEM_VERSION_CONSTANT]");
 *   OperatingSystemVersionConstant response = operatingSystemVersionConstantServiceClient.getOperatingSystemVersionConstant(formattedResourceName);
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
 *   String formattedResourceName = PaidOrganicSearchTermViewServiceClient.formatPaidOrganicSearchTermViewName("[CUSTOMER]", "[PAID_ORGANIC_SEARCH_TERM_VIEW]");
 *   PaidOrganicSearchTermView response = paidOrganicSearchTermViewServiceClient.getPaidOrganicSearchTermView(formattedResourceName);
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
 *   String formattedResourceName = ParentalStatusViewServiceClient.formatParentalStatusViewName("[CUSTOMER]", "[PARENTAL_STATUS_VIEW]");
 *   ParentalStatusView response = parentalStatusViewServiceClient.getParentalStatusView(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * ============================ PaymentsAccountServiceClient ============================
 *
 * <p>Service Description: Service to provide Payments accounts that can be used to set up
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
 *   String formattedResourceName = ProductBiddingCategoryConstantServiceClient.formatProductBiddingCategoryConstantName("[PRODUCT_BIDDING_CATEGORY_CONSTANT]");
 *   ProductBiddingCategoryConstant response = productBiddingCategoryConstantServiceClient.getProductBiddingCategoryConstant(formattedResourceName);
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
 *   String formattedResourceName = ProductGroupViewServiceClient.formatProductGroupViewName("[CUSTOMER]", "[PRODUCT_GROUP_VIEW]");
 *   ProductGroupView response = productGroupViewServiceClient.getProductGroupView(formattedResourceName);
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
 *   String formattedResourceName = RecommendationServiceClient.formatRecommendationName("[CUSTOMER]", "[RECOMMENDATION]");
 *   Recommendation response = recommendationServiceClient.getRecommendation(formattedResourceName);
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
 *   String formattedResourceName = RemarketingActionServiceClient.formatRemarketingActionName("[CUSTOMER]", "[REMARKETING_ACTION]");
 *   RemarketingAction response = remarketingActionServiceClient.getRemarketingAction(formattedResourceName);
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
 *   String formattedResourceName = SearchTermViewServiceClient.formatSearchTermViewName("[CUSTOMER]", "[SEARCH_TERM_VIEW]");
 *   SearchTermView response = searchTermViewServiceClient.getSearchTermView(formattedResourceName);
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
 *   String formattedResourceName = SharedCriterionServiceClient.formatSharedCriteriaName("[CUSTOMER]", "[SHARED_CRITERIA]");
 *   SharedCriterion response = sharedCriterionServiceClient.getSharedCriterion(formattedResourceName);
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
 *   String formattedResourceName = SharedSetServiceClient.formatSharedSetName("[CUSTOMER]", "[SHARED_SET]");
 *   SharedSet response = sharedSetServiceClient.getSharedSet(formattedResourceName);
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
 *   String formattedResourceName = ShoppingPerformanceViewServiceClient.formatShoppingPerformanceViewName("[CUSTOMER]");
 *   ShoppingPerformanceView response = shoppingPerformanceViewServiceClient.getShoppingPerformanceView(formattedResourceName);
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
 *   String formattedResourceName = TopicConstantServiceClient.formatTopicConstantName("[TOPIC_CONSTANT]");
 *   TopicConstant response = topicConstantServiceClient.getTopicConstant(formattedResourceName);
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
 *   String formattedResourceName = TopicViewServiceClient.formatTopicViewName("[CUSTOMER]", "[TOPIC_VIEW]");
 *   TopicView response = topicViewServiceClient.getTopicView(formattedResourceName);
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
 *   String formattedResourceName = UserInterestServiceClient.formatUserInterestName("[CUSTOMER]", "[USER_INTEREST]");
 *   UserInterest response = userInterestServiceClient.getUserInterest(formattedResourceName);
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
 *   String formattedResourceName = UserListServiceClient.formatUserListName("[CUSTOMER]", "[USER_LIST]");
 *   UserList response = userListServiceClient.getUserList(formattedResourceName);
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
 *   String formattedResourceName = VideoServiceClient.formatVideoName("[CUSTOMER]", "[VIDEO]");
 *   Video response = videoServiceClient.getVideo(formattedResourceName);
 * }
 * </code>
 * </pre>
 */
package com.google.ads.googleads.v1.services;
