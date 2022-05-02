/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= AccountBudgetProposalServiceClient =======================
 *
 * <p>Service Description: A service for managing account-level budgets via proposals.
 *
 * <p>A proposal is a request to create a new budget or make changes to an existing one.
 *
 * <p>Mutates: The CREATE operation creates a new proposal. UPDATE operations aren't supported. The
 * REMOVE operation cancels a pending proposal.
 *
 * <p>Sample for AccountBudgetProposalServiceClient:
 *
 * <pre>{@code
 * try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
 *     AccountBudgetProposalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   AccountBudgetProposalOperation operation =
 *       AccountBudgetProposalOperation.newBuilder().build();
 *   MutateAccountBudgetProposalResponse response =
 *       accountBudgetProposalServiceClient.mutateAccountBudgetProposal(customerId, operation);
 * }
 * }</pre>
 *
 * <p>======================= AccountLinkServiceClient =======================
 *
 * <p>Service Description: This service allows management of links between Google Ads accounts and
 * other accounts.
 *
 * <p>Sample for AccountLinkServiceClient:
 *
 * <pre>{@code
 * try (AccountLinkServiceClient accountLinkServiceClient = AccountLinkServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   AccountLink accountLink = AccountLink.newBuilder().build();
 *   CreateAccountLinkResponse response =
 *       accountLinkServiceClient.createAccountLink(customerId, accountLink);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupAdLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on ad group ads.
 *
 * <p>Sample for AdGroupAdLabelServiceClient:
 *
 * <pre>{@code
 * try (AdGroupAdLabelServiceClient adGroupAdLabelServiceClient =
 *     AdGroupAdLabelServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupAdLabelOperation> operations = new ArrayList<>();
 *   MutateAdGroupAdLabelsResponse response =
 *       adGroupAdLabelServiceClient.mutateAdGroupAdLabels(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupAdServiceClient =======================
 *
 * <p>Service Description: Service to manage ads in an ad group.
 *
 * <p>Sample for AdGroupAdServiceClient:
 *
 * <pre>{@code
 * try (AdGroupAdServiceClient adGroupAdServiceClient = AdGroupAdServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupAdOperation> operations = new ArrayList<>();
 *   MutateAdGroupAdsResponse response =
 *       adGroupAdServiceClient.mutateAdGroupAds(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupAssetServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group assets.
 *
 * <p>Sample for AdGroupAssetServiceClient:
 *
 * <pre>{@code
 * try (AdGroupAssetServiceClient adGroupAssetServiceClient = AdGroupAssetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupAssetOperation> operations = new ArrayList<>();
 *   MutateAdGroupAssetsResponse response =
 *       adGroupAssetServiceClient.mutateAdGroupAssets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupBidModifierServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group bid modifiers.
 *
 * <p>Sample for AdGroupBidModifierServiceClient:
 *
 * <pre>{@code
 * try (AdGroupBidModifierServiceClient adGroupBidModifierServiceClient =
 *     AdGroupBidModifierServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupBidModifierOperation> operations = new ArrayList<>();
 *   MutateAdGroupBidModifiersResponse response =
 *       adGroupBidModifierServiceClient.mutateAdGroupBidModifiers(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupCriterionCustomizerServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group criterion customizer
 *
 * <p>Sample for AdGroupCriterionCustomizerServiceClient:
 *
 * <pre>{@code
 * try (AdGroupCriterionCustomizerServiceClient adGroupCriterionCustomizerServiceClient =
 *     AdGroupCriterionCustomizerServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupCriterionCustomizerOperation> operations = new ArrayList<>();
 *   MutateAdGroupCriterionCustomizersResponse response =
 *       adGroupCriterionCustomizerServiceClient.mutateAdGroupCriterionCustomizers(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupCriterionLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on ad group criteria.
 *
 * <p>Sample for AdGroupCriterionLabelServiceClient:
 *
 * <pre>{@code
 * try (AdGroupCriterionLabelServiceClient adGroupCriterionLabelServiceClient =
 *     AdGroupCriterionLabelServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupCriterionLabelOperation> operations = new ArrayList<>();
 *   MutateAdGroupCriterionLabelsResponse response =
 *       adGroupCriterionLabelServiceClient.mutateAdGroupCriterionLabels(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupCriterionServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group criteria.
 *
 * <p>Sample for AdGroupCriterionServiceClient:
 *
 * <pre>{@code
 * try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
 *     AdGroupCriterionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupCriterionOperation> operations = new ArrayList<>();
 *   MutateAdGroupCriteriaResponse response =
 *       adGroupCriterionServiceClient.mutateAdGroupCriteria(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupCustomizerServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group customizer
 *
 * <p>Sample for AdGroupCustomizerServiceClient:
 *
 * <pre>{@code
 * try (AdGroupCustomizerServiceClient adGroupCustomizerServiceClient =
 *     AdGroupCustomizerServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupCustomizerOperation> operations = new ArrayList<>();
 *   MutateAdGroupCustomizersResponse response =
 *       adGroupCustomizerServiceClient.mutateAdGroupCustomizers(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupExtensionSettingServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group extension settings.
 *
 * <p>Sample for AdGroupExtensionSettingServiceClient:
 *
 * <pre>{@code
 * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient =
 *     AdGroupExtensionSettingServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupExtensionSettingOperation> operations = new ArrayList<>();
 *   MutateAdGroupExtensionSettingsResponse response =
 *       adGroupExtensionSettingServiceClient.mutateAdGroupExtensionSettings(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupFeedServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group feeds.
 *
 * <p>Sample for AdGroupFeedServiceClient:
 *
 * <pre>{@code
 * try (AdGroupFeedServiceClient adGroupFeedServiceClient = AdGroupFeedServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupFeedOperation> operations = new ArrayList<>();
 *   MutateAdGroupFeedsResponse response =
 *       adGroupFeedServiceClient.mutateAdGroupFeeds(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on ad groups.
 *
 * <p>Sample for AdGroupLabelServiceClient:
 *
 * <pre>{@code
 * try (AdGroupLabelServiceClient adGroupLabelServiceClient = AdGroupLabelServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupLabelOperation> operations = new ArrayList<>();
 *   MutateAdGroupLabelsResponse response =
 *       adGroupLabelServiceClient.mutateAdGroupLabels(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdGroupServiceClient =======================
 *
 * <p>Service Description: Service to manage ad groups.
 *
 * <p>Sample for AdGroupServiceClient:
 *
 * <pre>{@code
 * try (AdGroupServiceClient adGroupServiceClient = AdGroupServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdGroupOperation> operations = new ArrayList<>();
 *   MutateAdGroupsResponse response = adGroupServiceClient.mutateAdGroups(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdParameterServiceClient =======================
 *
 * <p>Service Description: Service to manage ad parameters.
 *
 * <p>Sample for AdParameterServiceClient:
 *
 * <pre>{@code
 * try (AdParameterServiceClient adParameterServiceClient = AdParameterServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AdParameterOperation> operations = new ArrayList<>();
 *   MutateAdParametersResponse response =
 *       adParameterServiceClient.mutateAdParameters(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AdServiceClient =======================
 *
 * <p>Service Description: Service to manage ads.
 *
 * <p>Sample for AdServiceClient:
 *
 * <pre>{@code
 * try (AdServiceClient adServiceClient = AdServiceClient.create()) {
 *   AdName resourceName = AdName.of("[CUSTOMER_ID]", "[AD_ID]");
 *   Ad response = adServiceClient.getAd(resourceName);
 * }
 * }</pre>
 *
 * <p>======================= AssetGroupAssetServiceClient =======================
 *
 * <p>Service Description: Service to manage asset group asset.
 *
 * <p>Sample for AssetGroupAssetServiceClient:
 *
 * <pre>{@code
 * try (AssetGroupAssetServiceClient assetGroupAssetServiceClient =
 *     AssetGroupAssetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AssetGroupAssetOperation> operations = new ArrayList<>();
 *   MutateAssetGroupAssetsResponse response =
 *       assetGroupAssetServiceClient.mutateAssetGroupAssets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AssetGroupListingGroupFilterServiceClient =======================
 *
 * <p>Service Description: Service to manage asset group listing group filter.
 *
 * <p>Sample for AssetGroupListingGroupFilterServiceClient:
 *
 * <pre>{@code
 * try (AssetGroupListingGroupFilterServiceClient assetGroupListingGroupFilterServiceClient =
 *     AssetGroupListingGroupFilterServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AssetGroupListingGroupFilterOperation> operations = new ArrayList<>();
 *   MutateAssetGroupListingGroupFiltersResponse response =
 *       assetGroupListingGroupFilterServiceClient.mutateAssetGroupListingGroupFilters(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AssetGroupServiceClient =======================
 *
 * <p>Service Description: Service to manage asset group
 *
 * <p>Sample for AssetGroupServiceClient:
 *
 * <pre>{@code
 * try (AssetGroupServiceClient assetGroupServiceClient = AssetGroupServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AssetGroupOperation> operations = new ArrayList<>();
 *   MutateAssetGroupsResponse response =
 *       assetGroupServiceClient.mutateAssetGroups(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AssetGroupSignalServiceClient =======================
 *
 * <p>Service Description: Service to manage asset group signal.
 *
 * <p>Sample for AssetGroupSignalServiceClient:
 *
 * <pre>{@code
 * try (AssetGroupSignalServiceClient assetGroupSignalServiceClient =
 *     AssetGroupSignalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AssetGroupSignalOperation> operations = new ArrayList<>();
 *   MutateAssetGroupSignalsResponse response =
 *       assetGroupSignalServiceClient.mutateAssetGroupSignals(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AssetServiceClient =======================
 *
 * <p>Service Description: Service to manage assets. Asset types can be created with AssetService
 * are YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be created with Ad
 * inline.
 *
 * <p>Sample for AssetServiceClient:
 *
 * <pre>{@code
 * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AssetOperation> operations = new ArrayList<>();
 *   MutateAssetsResponse response = assetServiceClient.mutateAssets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AssetSetAssetServiceClient =======================
 *
 * <p>Service Description: Service to manage asset set asset.
 *
 * <p>Sample for AssetSetAssetServiceClient:
 *
 * <pre>{@code
 * try (AssetSetAssetServiceClient assetSetAssetServiceClient =
 *     AssetSetAssetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AssetSetAssetOperation> operations = new ArrayList<>();
 *   MutateAssetSetAssetsResponse response =
 *       assetSetAssetServiceClient.mutateAssetSetAssets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AssetSetServiceClient =======================
 *
 * <p>Service Description: Service to manage asset set
 *
 * <p>Sample for AssetSetServiceClient:
 *
 * <pre>{@code
 * try (AssetSetServiceClient assetSetServiceClient = AssetSetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AssetSetOperation> operations = new ArrayList<>();
 *   MutateAssetSetsResponse response =
 *       assetSetServiceClient.mutateAssetSets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= AudienceServiceClient =======================
 *
 * <p>Service Description: Service to manage audiences.
 *
 * <p>Sample for AudienceServiceClient:
 *
 * <pre>{@code
 * try (AudienceServiceClient audienceServiceClient = AudienceServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AudienceOperation> operations = new ArrayList<>();
 *   MutateAudiencesResponse response =
 *       audienceServiceClient.mutateAudiences(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= BatchJobServiceClient =======================
 *
 * <p>Service Description: Service to manage batch jobs.
 *
 * <p>Sample for BatchJobServiceClient:
 *
 * <pre>{@code
 * try (BatchJobServiceClient batchJobServiceClient = BatchJobServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   BatchJobOperation operation = BatchJobOperation.newBuilder().build();
 *   MutateBatchJobResponse response = batchJobServiceClient.mutateBatchJob(customerId, operation);
 * }
 * }</pre>
 *
 * <p>======================= BiddingDataExclusionServiceClient =======================
 *
 * <p>Service Description: Service to manage bidding data exclusions.
 *
 * <p>Sample for BiddingDataExclusionServiceClient:
 *
 * <pre>{@code
 * try (BiddingDataExclusionServiceClient biddingDataExclusionServiceClient =
 *     BiddingDataExclusionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<BiddingDataExclusionOperation> operations = new ArrayList<>();
 *   MutateBiddingDataExclusionsResponse response =
 *       biddingDataExclusionServiceClient.mutateBiddingDataExclusions(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= BiddingSeasonalityAdjustmentServiceClient =======================
 *
 * <p>Service Description: Service to manage bidding seasonality adjustments.
 *
 * <p>Sample for BiddingSeasonalityAdjustmentServiceClient:
 *
 * <pre>{@code
 * try (BiddingSeasonalityAdjustmentServiceClient biddingSeasonalityAdjustmentServiceClient =
 *     BiddingSeasonalityAdjustmentServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<BiddingSeasonalityAdjustmentOperation> operations = new ArrayList<>();
 *   MutateBiddingSeasonalityAdjustmentsResponse response =
 *       biddingSeasonalityAdjustmentServiceClient.mutateBiddingSeasonalityAdjustments(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= BiddingStrategyServiceClient =======================
 *
 * <p>Service Description: Service to manage bidding strategies.
 *
 * <p>Sample for BiddingStrategyServiceClient:
 *
 * <pre>{@code
 * try (BiddingStrategyServiceClient biddingStrategyServiceClient =
 *     BiddingStrategyServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<BiddingStrategyOperation> operations = new ArrayList<>();
 *   MutateBiddingStrategiesResponse response =
 *       biddingStrategyServiceClient.mutateBiddingStrategies(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= BillingSetupServiceClient =======================
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
 * <pre>{@code
 * try (BillingSetupServiceClient billingSetupServiceClient = BillingSetupServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   BillingSetupOperation operation = BillingSetupOperation.newBuilder().build();
 *   MutateBillingSetupResponse response =
 *       billingSetupServiceClient.mutateBillingSetup(customerId, operation);
 * }
 * }</pre>
 *
 * <p>======================= CampaignAssetServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign assets.
 *
 * <p>Sample for CampaignAssetServiceClient:
 *
 * <pre>{@code
 * try (CampaignAssetServiceClient campaignAssetServiceClient =
 *     CampaignAssetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignAssetOperation> operations = new ArrayList<>();
 *   MutateCampaignAssetsResponse response =
 *       campaignAssetServiceClient.mutateCampaignAssets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignAssetSetServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign asset set
 *
 * <p>Sample for CampaignAssetSetServiceClient:
 *
 * <pre>{@code
 * try (CampaignAssetSetServiceClient campaignAssetSetServiceClient =
 *     CampaignAssetSetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignAssetSetOperation> operations = new ArrayList<>();
 *   MutateCampaignAssetSetsResponse response =
 *       campaignAssetSetServiceClient.mutateCampaignAssetSets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignBidModifierServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign bid modifiers.
 *
 * <p>Sample for CampaignBidModifierServiceClient:
 *
 * <pre>{@code
 * try (CampaignBidModifierServiceClient campaignBidModifierServiceClient =
 *     CampaignBidModifierServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignBidModifierOperation> operations = new ArrayList<>();
 *   MutateCampaignBidModifiersResponse response =
 *       campaignBidModifierServiceClient.mutateCampaignBidModifiers(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignBudgetServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign budgets.
 *
 * <p>Sample for CampaignBudgetServiceClient:
 *
 * <pre>{@code
 * try (CampaignBudgetServiceClient campaignBudgetServiceClient =
 *     CampaignBudgetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignBudgetOperation> operations = new ArrayList<>();
 *   MutateCampaignBudgetsResponse response =
 *       campaignBudgetServiceClient.mutateCampaignBudgets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignConversionGoalServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign conversion goal.
 *
 * <p>Sample for CampaignConversionGoalServiceClient:
 *
 * <pre>{@code
 * try (CampaignConversionGoalServiceClient campaignConversionGoalServiceClient =
 *     CampaignConversionGoalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignConversionGoalOperation> operations = new ArrayList<>();
 *   MutateCampaignConversionGoalsResponse response =
 *       campaignConversionGoalServiceClient.mutateCampaignConversionGoals(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignCriterionServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign criteria.
 *
 * <p>Sample for CampaignCriterionServiceClient:
 *
 * <pre>{@code
 * try (CampaignCriterionServiceClient campaignCriterionServiceClient =
 *     CampaignCriterionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignCriterionOperation> operations = new ArrayList<>();
 *   MutateCampaignCriteriaResponse response =
 *       campaignCriterionServiceClient.mutateCampaignCriteria(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignCustomizerServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign customizer
 *
 * <p>Sample for CampaignCustomizerServiceClient:
 *
 * <pre>{@code
 * try (CampaignCustomizerServiceClient campaignCustomizerServiceClient =
 *     CampaignCustomizerServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignCustomizerOperation> operations = new ArrayList<>();
 *   MutateCampaignCustomizersResponse response =
 *       campaignCustomizerServiceClient.mutateCampaignCustomizers(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignDraftServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign drafts.
 *
 * <p>Sample for CampaignDraftServiceClient:
 *
 * <pre>{@code
 * try (CampaignDraftServiceClient campaignDraftServiceClient =
 *     CampaignDraftServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignDraftOperation> operations = new ArrayList<>();
 *   MutateCampaignDraftsResponse response =
 *       campaignDraftServiceClient.mutateCampaignDrafts(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignExperimentServiceClient =======================
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
 * <pre>{@code
 * try (CampaignExperimentServiceClient campaignExperimentServiceClient =
 *     CampaignExperimentServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignExperimentOperation> operations = new ArrayList<>();
 *   MutateCampaignExperimentsResponse response =
 *       campaignExperimentServiceClient.mutateCampaignExperiments(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignExtensionSettingServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign extension settings.
 *
 * <p>Sample for CampaignExtensionSettingServiceClient:
 *
 * <pre>{@code
 * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient =
 *     CampaignExtensionSettingServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignExtensionSettingOperation> operations = new ArrayList<>();
 *   MutateCampaignExtensionSettingsResponse response =
 *       campaignExtensionSettingServiceClient.mutateCampaignExtensionSettings(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignFeedServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign feeds.
 *
 * <p>Sample for CampaignFeedServiceClient:
 *
 * <pre>{@code
 * try (CampaignFeedServiceClient campaignFeedServiceClient = CampaignFeedServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignFeedOperation> operations = new ArrayList<>();
 *   MutateCampaignFeedsResponse response =
 *       campaignFeedServiceClient.mutateCampaignFeeds(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignGroupServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign groups.
 *
 * <p>Sample for CampaignGroupServiceClient:
 *
 * <pre>{@code
 * try (CampaignGroupServiceClient campaignGroupServiceClient =
 *     CampaignGroupServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignGroupOperation> operations = new ArrayList<>();
 *   MutateCampaignGroupsResponse response =
 *       campaignGroupServiceClient.mutateCampaignGroups(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on campaigns.
 *
 * <p>Sample for CampaignLabelServiceClient:
 *
 * <pre>{@code
 * try (CampaignLabelServiceClient campaignLabelServiceClient =
 *     CampaignLabelServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignLabelOperation> operations = new ArrayList<>();
 *   MutateCampaignLabelsResponse response =
 *       campaignLabelServiceClient.mutateCampaignLabels(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignServiceClient =======================
 *
 * <p>Service Description: Service to manage campaigns.
 *
 * <p>Sample for CampaignServiceClient:
 *
 * <pre>{@code
 * try (CampaignServiceClient campaignServiceClient = CampaignServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignOperation> operations = new ArrayList<>();
 *   MutateCampaignsResponse response =
 *       campaignServiceClient.mutateCampaigns(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CampaignSharedSetServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign shared sets.
 *
 * <p>Sample for CampaignSharedSetServiceClient:
 *
 * <pre>{@code
 * try (CampaignSharedSetServiceClient campaignSharedSetServiceClient =
 *     CampaignSharedSetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignSharedSetOperation> operations = new ArrayList<>();
 *   MutateCampaignSharedSetsResponse response =
 *       campaignSharedSetServiceClient.mutateCampaignSharedSets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= ConversionActionServiceClient =======================
 *
 * <p>Service Description: Service to manage conversion actions.
 *
 * <p>Sample for ConversionActionServiceClient:
 *
 * <pre>{@code
 * try (ConversionActionServiceClient conversionActionServiceClient =
 *     ConversionActionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ConversionActionOperation> operations = new ArrayList<>();
 *   MutateConversionActionsResponse response =
 *       conversionActionServiceClient.mutateConversionActions(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= ConversionAdjustmentUploadServiceClient =======================
 *
 * <p>Service Description: Service to upload conversion adjustments.
 *
 * <p>Sample for ConversionAdjustmentUploadServiceClient:
 *
 * <pre>{@code
 * try (ConversionAdjustmentUploadServiceClient conversionAdjustmentUploadServiceClient =
 *     ConversionAdjustmentUploadServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ConversionAdjustment> conversionAdjustments = new ArrayList<>();
 *   boolean partialFailure = true;
 *   UploadConversionAdjustmentsResponse response =
 *       conversionAdjustmentUploadServiceClient.uploadConversionAdjustments(
 *           customerId, conversionAdjustments, partialFailure);
 * }
 * }</pre>
 *
 * <p>======================= ConversionCustomVariableServiceClient =======================
 *
 * <p>Service Description: Service to manage conversion custom variables.
 *
 * <p>Sample for ConversionCustomVariableServiceClient:
 *
 * <pre>{@code
 * try (ConversionCustomVariableServiceClient conversionCustomVariableServiceClient =
 *     ConversionCustomVariableServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ConversionCustomVariableOperation> operations = new ArrayList<>();
 *   MutateConversionCustomVariablesResponse response =
 *       conversionCustomVariableServiceClient.mutateConversionCustomVariables(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= ConversionGoalCampaignConfigServiceClient =======================
 *
 * <p>Service Description: Service to manage conversion goal campaign config.
 *
 * <p>Sample for ConversionGoalCampaignConfigServiceClient:
 *
 * <pre>{@code
 * try (ConversionGoalCampaignConfigServiceClient conversionGoalCampaignConfigServiceClient =
 *     ConversionGoalCampaignConfigServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ConversionGoalCampaignConfigOperation> operations = new ArrayList<>();
 *   MutateConversionGoalCampaignConfigsResponse response =
 *       conversionGoalCampaignConfigServiceClient.mutateConversionGoalCampaignConfigs(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= ConversionUploadServiceClient =======================
 *
 * <p>Service Description: Service to upload conversions.
 *
 * <p>Sample for ConversionUploadServiceClient:
 *
 * <pre>{@code
 * try (ConversionUploadServiceClient conversionUploadServiceClient =
 *     ConversionUploadServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ClickConversion> conversions = new ArrayList<>();
 *   boolean partialFailure = true;
 *   UploadClickConversionsResponse response =
 *       conversionUploadServiceClient.uploadClickConversions(
 *           customerId, conversions, partialFailure);
 * }
 * }</pre>
 *
 * <p>======================= ConversionValueRuleServiceClient =======================
 *
 * <p>Service Description: Service to manage conversion value rules.
 *
 * <p>Sample for ConversionValueRuleServiceClient:
 *
 * <pre>{@code
 * try (ConversionValueRuleServiceClient conversionValueRuleServiceClient =
 *     ConversionValueRuleServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ConversionValueRuleOperation> operations = new ArrayList<>();
 *   MutateConversionValueRulesResponse response =
 *       conversionValueRuleServiceClient.mutateConversionValueRules(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= ConversionValueRuleSetServiceClient =======================
 *
 * <p>Service Description: Service to manage conversion value rule sets.
 *
 * <p>Sample for ConversionValueRuleSetServiceClient:
 *
 * <pre>{@code
 * try (ConversionValueRuleSetServiceClient conversionValueRuleSetServiceClient =
 *     ConversionValueRuleSetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ConversionValueRuleSetOperation> operations = new ArrayList<>();
 *   MutateConversionValueRuleSetsResponse response =
 *       conversionValueRuleSetServiceClient.mutateConversionValueRuleSets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomAudienceServiceClient =======================
 *
 * <p>Service Description: Service to manage custom audiences.
 *
 * <p>Sample for CustomAudienceServiceClient:
 *
 * <pre>{@code
 * try (CustomAudienceServiceClient customAudienceServiceClient =
 *     CustomAudienceServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomAudienceOperation> operations = new ArrayList<>();
 *   MutateCustomAudiencesResponse response =
 *       customAudienceServiceClient.mutateCustomAudiences(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomConversionGoalServiceClient =======================
 *
 * <p>Service Description: Service to manage custom conversion goal.
 *
 * <p>Sample for CustomConversionGoalServiceClient:
 *
 * <pre>{@code
 * try (CustomConversionGoalServiceClient customConversionGoalServiceClient =
 *     CustomConversionGoalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomConversionGoalOperation> operations = new ArrayList<>();
 *   MutateCustomConversionGoalsResponse response =
 *       customConversionGoalServiceClient.mutateCustomConversionGoals(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomInterestServiceClient =======================
 *
 * <p>Service Description: Service to manage custom interests.
 *
 * <p>Sample for CustomInterestServiceClient:
 *
 * <pre>{@code
 * try (CustomInterestServiceClient customInterestServiceClient =
 *     CustomInterestServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomInterestOperation> operations = new ArrayList<>();
 *   MutateCustomInterestsResponse response =
 *       customInterestServiceClient.mutateCustomInterests(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomerAssetServiceClient =======================
 *
 * <p>Service Description: Service to manage customer assets.
 *
 * <p>Sample for CustomerAssetServiceClient:
 *
 * <pre>{@code
 * try (CustomerAssetServiceClient customerAssetServiceClient =
 *     CustomerAssetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomerAssetOperation> operations = new ArrayList<>();
 *   MutateCustomerAssetsResponse response =
 *       customerAssetServiceClient.mutateCustomerAssets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomerClientLinkServiceClient =======================
 *
 * <p>Service Description: Service to manage customer client links.
 *
 * <p>Sample for CustomerClientLinkServiceClient:
 *
 * <pre>{@code
 * try (CustomerClientLinkServiceClient customerClientLinkServiceClient =
 *     CustomerClientLinkServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   CustomerClientLinkOperation operation = CustomerClientLinkOperation.newBuilder().build();
 *   MutateCustomerClientLinkResponse response =
 *       customerClientLinkServiceClient.mutateCustomerClientLink(customerId, operation);
 * }
 * }</pre>
 *
 * <p>======================= CustomerConversionGoalServiceClient =======================
 *
 * <p>Service Description: Service to manage customer conversion goal.
 *
 * <p>Sample for CustomerConversionGoalServiceClient:
 *
 * <pre>{@code
 * try (CustomerConversionGoalServiceClient customerConversionGoalServiceClient =
 *     CustomerConversionGoalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomerConversionGoalOperation> operations = new ArrayList<>();
 *   MutateCustomerConversionGoalsResponse response =
 *       customerConversionGoalServiceClient.mutateCustomerConversionGoals(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomerCustomizerServiceClient =======================
 *
 * <p>Service Description: Service to manage customer customizer
 *
 * <p>Sample for CustomerCustomizerServiceClient:
 *
 * <pre>{@code
 * try (CustomerCustomizerServiceClient customerCustomizerServiceClient =
 *     CustomerCustomizerServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomerCustomizerOperation> operations = new ArrayList<>();
 *   MutateCustomerCustomizersResponse response =
 *       customerCustomizerServiceClient.mutateCustomerCustomizers(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomerExtensionSettingServiceClient =======================
 *
 * <p>Service Description: Service to manage customer extension settings.
 *
 * <p>Sample for CustomerExtensionSettingServiceClient:
 *
 * <pre>{@code
 * try (CustomerExtensionSettingServiceClient customerExtensionSettingServiceClient =
 *     CustomerExtensionSettingServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomerExtensionSettingOperation> operations = new ArrayList<>();
 *   MutateCustomerExtensionSettingsResponse response =
 *       customerExtensionSettingServiceClient.mutateCustomerExtensionSettings(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomerFeedServiceClient =======================
 *
 * <p>Service Description: Service to manage customer feeds.
 *
 * <p>Sample for CustomerFeedServiceClient:
 *
 * <pre>{@code
 * try (CustomerFeedServiceClient customerFeedServiceClient = CustomerFeedServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomerFeedOperation> operations = new ArrayList<>();
 *   MutateCustomerFeedsResponse response =
 *       customerFeedServiceClient.mutateCustomerFeeds(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomerLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on customers.
 *
 * <p>Sample for CustomerLabelServiceClient:
 *
 * <pre>{@code
 * try (CustomerLabelServiceClient customerLabelServiceClient =
 *     CustomerLabelServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomerLabelOperation> operations = new ArrayList<>();
 *   MutateCustomerLabelsResponse response =
 *       customerLabelServiceClient.mutateCustomerLabels(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomerManagerLinkServiceClient =======================
 *
 * <p>Service Description: Service to manage customer-manager links.
 *
 * <p>Sample for CustomerManagerLinkServiceClient:
 *
 * <pre>{@code
 * try (CustomerManagerLinkServiceClient customerManagerLinkServiceClient =
 *     CustomerManagerLinkServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomerManagerLinkOperation> operations = new ArrayList<>();
 *   MutateCustomerManagerLinkResponse response =
 *       customerManagerLinkServiceClient.mutateCustomerManagerLink(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomerNegativeCriterionServiceClient =======================
 *
 * <p>Service Description: Service to manage customer negative criteria.
 *
 * <p>Sample for CustomerNegativeCriterionServiceClient:
 *
 * <pre>{@code
 * try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient =
 *     CustomerNegativeCriterionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomerNegativeCriterionOperation> operations = new ArrayList<>();
 *   MutateCustomerNegativeCriteriaResponse response =
 *       customerNegativeCriterionServiceClient.mutateCustomerNegativeCriteria(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= CustomerServiceClient =======================
 *
 * <p>Service Description: Service to manage customers.
 *
 * <p>Sample for CustomerServiceClient:
 *
 * <pre>{@code
 * try (CustomerServiceClient customerServiceClient = CustomerServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   CustomerOperation operation = CustomerOperation.newBuilder().build();
 *   MutateCustomerResponse response = customerServiceClient.mutateCustomer(customerId, operation);
 * }
 * }</pre>
 *
 * <p>======================= CustomerUserAccessInvitationServiceClient =======================
 *
 * <p>Service Description: This service manages the access invitation extended to users for a given
 * customer.
 *
 * <p>Sample for CustomerUserAccessInvitationServiceClient:
 *
 * <pre>{@code
 * try (CustomerUserAccessInvitationServiceClient customerUserAccessInvitationServiceClient =
 *     CustomerUserAccessInvitationServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   CustomerUserAccessInvitationOperation operation =
 *       CustomerUserAccessInvitationOperation.newBuilder().build();
 *   MutateCustomerUserAccessInvitationResponse response =
 *       customerUserAccessInvitationServiceClient.mutateCustomerUserAccessInvitation(
 *           customerId, operation);
 * }
 * }</pre>
 *
 * <p>======================= CustomerUserAccessServiceClient =======================
 *
 * <p>Service Description: This service manages the permissions of a user on a given customer.
 *
 * <p>Sample for CustomerUserAccessServiceClient:
 *
 * <pre>{@code
 * try (CustomerUserAccessServiceClient customerUserAccessServiceClient =
 *     CustomerUserAccessServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   CustomerUserAccessOperation operation = CustomerUserAccessOperation.newBuilder().build();
 *   MutateCustomerUserAccessResponse response =
 *       customerUserAccessServiceClient.mutateCustomerUserAccess(customerId, operation);
 * }
 * }</pre>
 *
 * <p>======================= CustomizerAttributeServiceClient =======================
 *
 * <p>Service Description: Service to manage customizer attribute
 *
 * <p>Sample for CustomizerAttributeServiceClient:
 *
 * <pre>{@code
 * try (CustomizerAttributeServiceClient customizerAttributeServiceClient =
 *     CustomizerAttributeServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CustomizerAttributeOperation> operations = new ArrayList<>();
 *   MutateCustomizerAttributesResponse response =
 *       customizerAttributeServiceClient.mutateCustomizerAttributes(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= ExperimentArmServiceClient =======================
 *
 * <p>Service Description: Service to manage experiment arms.
 *
 * <p>Sample for ExperimentArmServiceClient:
 *
 * <pre>{@code
 * try (ExperimentArmServiceClient experimentArmServiceClient =
 *     ExperimentArmServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ExperimentArmOperation> operations = new ArrayList<>();
 *   MutateExperimentArmsResponse response =
 *       experimentArmServiceClient.mutateExperimentArms(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= ExperimentServiceClient =======================
 *
 * <p>Service Description: Service to manage experiments.
 *
 * <p>Sample for ExperimentServiceClient:
 *
 * <pre>{@code
 * try (ExperimentServiceClient experimentServiceClient = ExperimentServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ExperimentOperation> operations = new ArrayList<>();
 *   MutateExperimentsResponse response =
 *       experimentServiceClient.mutateExperiments(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= ExtensionFeedItemServiceClient =======================
 *
 * <p>Service Description: Service to manage extension feed items.
 *
 * <p>Sample for ExtensionFeedItemServiceClient:
 *
 * <pre>{@code
 * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
 *     ExtensionFeedItemServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ExtensionFeedItemOperation> operations = new ArrayList<>();
 *   MutateExtensionFeedItemsResponse response =
 *       extensionFeedItemServiceClient.mutateExtensionFeedItems(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= FeedItemServiceClient =======================
 *
 * <p>Service Description: Service to manage feed items.
 *
 * <p>Sample for FeedItemServiceClient:
 *
 * <pre>{@code
 * try (FeedItemServiceClient feedItemServiceClient = FeedItemServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<FeedItemOperation> operations = new ArrayList<>();
 *   MutateFeedItemsResponse response =
 *       feedItemServiceClient.mutateFeedItems(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= FeedItemSetLinkServiceClient =======================
 *
 * <p>Service Description: Service to manage feed item set links.
 *
 * <p>Sample for FeedItemSetLinkServiceClient:
 *
 * <pre>{@code
 * try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient =
 *     FeedItemSetLinkServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<FeedItemSetLinkOperation> operations = new ArrayList<>();
 *   MutateFeedItemSetLinksResponse response =
 *       feedItemSetLinkServiceClient.mutateFeedItemSetLinks(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= FeedItemSetServiceClient =======================
 *
 * <p>Service Description: Service to manage feed Item Set
 *
 * <p>Sample for FeedItemSetServiceClient:
 *
 * <pre>{@code
 * try (FeedItemSetServiceClient feedItemSetServiceClient = FeedItemSetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<FeedItemSetOperation> operations = new ArrayList<>();
 *   MutateFeedItemSetsResponse response =
 *       feedItemSetServiceClient.mutateFeedItemSets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= FeedItemTargetServiceClient =======================
 *
 * <p>Service Description: Service to manage feed item targets.
 *
 * <p>Sample for FeedItemTargetServiceClient:
 *
 * <pre>{@code
 * try (FeedItemTargetServiceClient feedItemTargetServiceClient =
 *     FeedItemTargetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<FeedItemTargetOperation> operations = new ArrayList<>();
 *   MutateFeedItemTargetsResponse response =
 *       feedItemTargetServiceClient.mutateFeedItemTargets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= FeedMappingServiceClient =======================
 *
 * <p>Service Description: Service to manage feed mappings.
 *
 * <p>Sample for FeedMappingServiceClient:
 *
 * <pre>{@code
 * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<FeedMappingOperation> operations = new ArrayList<>();
 *   MutateFeedMappingsResponse response =
 *       feedMappingServiceClient.mutateFeedMappings(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= FeedServiceClient =======================
 *
 * <p>Service Description: Service to manage feeds.
 *
 * <p>Sample for FeedServiceClient:
 *
 * <pre>{@code
 * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<FeedOperation> operations = new ArrayList<>();
 *   MutateFeedsResponse response = feedServiceClient.mutateFeeds(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= GeoTargetConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch geo target constants.
 *
 * <p>Sample for GeoTargetConstantServiceClient:
 *
 * <pre>{@code
 * try (GeoTargetConstantServiceClient geoTargetConstantServiceClient =
 *     GeoTargetConstantServiceClient.create()) {
 *   SuggestGeoTargetConstantsRequest request =
 *       SuggestGeoTargetConstantsRequest.newBuilder()
 *           .setLocale("locale-1097462182")
 *           .setCountryCode("countryCode-1477067101")
 *           .build();
 *   SuggestGeoTargetConstantsResponse response =
 *       geoTargetConstantServiceClient.suggestGeoTargetConstants(request);
 * }
 * }</pre>
 *
 * <p>======================= GoogleAdsFieldServiceClient =======================
 *
 * <p>Service Description: Service to fetch Google Ads API fields.
 *
 * <p>Sample for GoogleAdsFieldServiceClient:
 *
 * <pre>{@code
 * try (GoogleAdsFieldServiceClient googleAdsFieldServiceClient =
 *     GoogleAdsFieldServiceClient.create()) {
 *   GoogleAdsFieldName resourceName = GoogleAdsFieldName.of("[GOOGLE_ADS_FIELD]");
 *   GoogleAdsField response = googleAdsFieldServiceClient.getGoogleAdsField(resourceName);
 * }
 * }</pre>
 *
 * <p>======================= GoogleAdsServiceClient =======================
 *
 * <p>Service Description: Service to fetch data and metrics across resources.
 *
 * <p>Sample for GoogleAdsServiceClient:
 *
 * <pre>{@code
 * try (GoogleAdsServiceClient googleAdsServiceClient = GoogleAdsServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<MutateOperation> mutateOperations = new ArrayList<>();
 *   MutateGoogleAdsResponse response =
 *       googleAdsServiceClient.mutate(customerId, mutateOperations);
 * }
 * }</pre>
 *
 * <p>======================= InvoiceServiceClient =======================
 *
 * <p>Service Description: A service to fetch invoices issued for a billing setup during a given
 * month.
 *
 * <p>Sample for InvoiceServiceClient:
 *
 * <pre>{@code
 * try (InvoiceServiceClient invoiceServiceClient = InvoiceServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   String billingSetup = "billingSetup-1435075390";
 *   String issueYear = "issueYear184914102";
 *   MonthOfYearEnum.MonthOfYear issueMonth = MonthOfYearEnum.MonthOfYear.forNumber(0);
 *   ListInvoicesResponse response =
 *       invoiceServiceClient.listInvoices(customerId, billingSetup, issueYear, issueMonth);
 * }
 * }</pre>
 *
 * <p>======================= KeywordPlanAdGroupKeywordServiceClient =======================
 *
 * <p>Service Description: Service to manage Keyword Plan ad group keywords. KeywordPlanAdGroup is
 * required to add ad group keywords. Positive and negative keywords are supported. A maximum of
 * 10,000 positive keywords are allowed per keyword plan. A maximum of 1,000 negative keywords are
 * allower per keyword plan. This includes campaign negative keywords and ad group negative
 * keywords.
 *
 * <p>Sample for KeywordPlanAdGroupKeywordServiceClient:
 *
 * <pre>{@code
 * try (KeywordPlanAdGroupKeywordServiceClient keywordPlanAdGroupKeywordServiceClient =
 *     KeywordPlanAdGroupKeywordServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<KeywordPlanAdGroupKeywordOperation> operations = new ArrayList<>();
 *   MutateKeywordPlanAdGroupKeywordsResponse response =
 *       keywordPlanAdGroupKeywordServiceClient.mutateKeywordPlanAdGroupKeywords(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= KeywordPlanAdGroupServiceClient =======================
 *
 * <p>Service Description: Service to manage Keyword Plan ad groups.
 *
 * <p>Sample for KeywordPlanAdGroupServiceClient:
 *
 * <pre>{@code
 * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient =
 *     KeywordPlanAdGroupServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<KeywordPlanAdGroupOperation> operations = new ArrayList<>();
 *   MutateKeywordPlanAdGroupsResponse response =
 *       keywordPlanAdGroupServiceClient.mutateKeywordPlanAdGroups(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= KeywordPlanCampaignKeywordServiceClient =======================
 *
 * <p>Service Description: Service to manage Keyword Plan campaign keywords. KeywordPlanCampaign is
 * required to add the campaign keywords. Only negative keywords are supported. A maximum of 1000
 * negative keywords are allowed per plan. This includes both campaign negative keywords and ad
 * group negative keywords.
 *
 * <p>Sample for KeywordPlanCampaignKeywordServiceClient:
 *
 * <pre>{@code
 * try (KeywordPlanCampaignKeywordServiceClient keywordPlanCampaignKeywordServiceClient =
 *     KeywordPlanCampaignKeywordServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<KeywordPlanCampaignKeywordOperation> operations = new ArrayList<>();
 *   MutateKeywordPlanCampaignKeywordsResponse response =
 *       keywordPlanCampaignKeywordServiceClient.mutateKeywordPlanCampaignKeywords(
 *           customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= KeywordPlanCampaignServiceClient =======================
 *
 * <p>Service Description: Service to manage Keyword Plan campaigns.
 *
 * <p>Sample for KeywordPlanCampaignServiceClient:
 *
 * <pre>{@code
 * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient =
 *     KeywordPlanCampaignServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<KeywordPlanCampaignOperation> operations = new ArrayList<>();
 *   MutateKeywordPlanCampaignsResponse response =
 *       keywordPlanCampaignServiceClient.mutateKeywordPlanCampaigns(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= KeywordPlanIdeaServiceClient =======================
 *
 * <p>Service Description: Service to generate keyword ideas.
 *
 * <p>Sample for KeywordPlanIdeaServiceClient:
 *
 * <pre>{@code
 * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
 *     KeywordPlanIdeaServiceClient.create()) {
 *   GenerateKeywordHistoricalMetricsRequest request =
 *       GenerateKeywordHistoricalMetricsRequest.newBuilder()
 *           .setCustomerId("customerId-1581184615")
 *           .addAllKeywords(new ArrayList<String>())
 *           .setHistoricalMetricsOptions(HistoricalMetricsOptions.newBuilder().build())
 *           .build();
 *   GenerateKeywordHistoricalMetricsResponse response =
 *       keywordPlanIdeaServiceClient.generateKeywordHistoricalMetrics(request);
 * }
 * }</pre>
 *
 * <p>======================= KeywordPlanServiceClient =======================
 *
 * <p>Service Description: Service to manage keyword plans.
 *
 * <p>Sample for KeywordPlanServiceClient:
 *
 * <pre>{@code
 * try (KeywordPlanServiceClient keywordPlanServiceClient = KeywordPlanServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<KeywordPlanOperation> operations = new ArrayList<>();
 *   MutateKeywordPlansResponse response =
 *       keywordPlanServiceClient.mutateKeywordPlans(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= KeywordThemeConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch Smart Campaign keyword themes.
 *
 * <p>Sample for KeywordThemeConstantServiceClient:
 *
 * <pre>{@code
 * try (KeywordThemeConstantServiceClient keywordThemeConstantServiceClient =
 *     KeywordThemeConstantServiceClient.create()) {
 *   SuggestKeywordThemeConstantsRequest request =
 *       SuggestKeywordThemeConstantsRequest.newBuilder()
 *           .setQueryText("queryText-1806881259")
 *           .setCountryCode("countryCode-1477067101")
 *           .setLanguageCode("languageCode-2092349083")
 *           .build();
 *   SuggestKeywordThemeConstantsResponse response =
 *       keywordThemeConstantServiceClient.suggestKeywordThemeConstants(request);
 * }
 * }</pre>
 *
 * <p>======================= LabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels.
 *
 * <p>Sample for LabelServiceClient:
 *
 * <pre>{@code
 * try (LabelServiceClient labelServiceClient = LabelServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<LabelOperation> operations = new ArrayList<>();
 *   MutateLabelsResponse response = labelServiceClient.mutateLabels(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= MediaFileServiceClient =======================
 *
 * <p>Service Description: Service to manage media files.
 *
 * <p>Sample for MediaFileServiceClient:
 *
 * <pre>{@code
 * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<MediaFileOperation> operations = new ArrayList<>();
 *   MutateMediaFilesResponse response =
 *       mediaFileServiceClient.mutateMediaFiles(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= MerchantCenterLinkServiceClient =======================
 *
 * <p>Service Description: This service allows management of links between Google Ads and Google
 * Merchant Center.
 *
 * <p>Sample for MerchantCenterLinkServiceClient:
 *
 * <pre>{@code
 * try (MerchantCenterLinkServiceClient merchantCenterLinkServiceClient =
 *     MerchantCenterLinkServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   ListMerchantCenterLinksResponse response =
 *       merchantCenterLinkServiceClient.listMerchantCenterLinks(customerId);
 * }
 * }</pre>
 *
 * <p>======================= OfflineUserDataJobServiceClient =======================
 *
 * <p>Service Description: Service to manage offline user data jobs.
 *
 * <p>Sample for OfflineUserDataJobServiceClient:
 *
 * <pre>{@code
 * try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
 *     OfflineUserDataJobServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   OfflineUserDataJob job = OfflineUserDataJob.newBuilder().build();
 *   CreateOfflineUserDataJobResponse response =
 *       offlineUserDataJobServiceClient.createOfflineUserDataJob(customerId, job);
 * }
 * }</pre>
 *
 * <p>======================= PaymentsAccountServiceClient =======================
 *
 * <p>Service Description: Service to provide payments accounts that can be used to set up
 * consolidated billing.
 *
 * <p>Sample for PaymentsAccountServiceClient:
 *
 * <pre>{@code
 * try (PaymentsAccountServiceClient paymentsAccountServiceClient =
 *     PaymentsAccountServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   ListPaymentsAccountsResponse response =
 *       paymentsAccountServiceClient.listPaymentsAccounts(customerId);
 * }
 * }</pre>
 *
 * <p>======================= ReachPlanServiceClient =======================
 *
 * <p>Service Description: Reach Plan Service gives users information about audience size that can
 * be reached through advertisement on YouTube. In particular, GenerateReachForecast provides
 * estimated number of people of specified demographics that can be reached by an ad in a given
 * market by a campaign of certain duration with a defined budget.
 *
 * <p>Sample for ReachPlanServiceClient:
 *
 * <pre>{@code
 * try (ReachPlanServiceClient reachPlanServiceClient = ReachPlanServiceClient.create()) {
 *   ListPlannableLocationsRequest request = ListPlannableLocationsRequest.newBuilder().build();
 *   ListPlannableLocationsResponse response =
 *       reachPlanServiceClient.listPlannableLocations(request);
 * }
 * }</pre>
 *
 * <p>======================= RecommendationServiceClient =======================
 *
 * <p>Service Description: Service to manage recommendations.
 *
 * <p>Sample for RecommendationServiceClient:
 *
 * <pre>{@code
 * try (RecommendationServiceClient recommendationServiceClient =
 *     RecommendationServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ApplyRecommendationOperation> operations = new ArrayList<>();
 *   ApplyRecommendationResponse response =
 *       recommendationServiceClient.applyRecommendation(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= RemarketingActionServiceClient =======================
 *
 * <p>Service Description: Service to manage remarketing actions.
 *
 * <p>Sample for RemarketingActionServiceClient:
 *
 * <pre>{@code
 * try (RemarketingActionServiceClient remarketingActionServiceClient =
 *     RemarketingActionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<RemarketingActionOperation> operations = new ArrayList<>();
 *   MutateRemarketingActionsResponse response =
 *       remarketingActionServiceClient.mutateRemarketingActions(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= SharedCriterionServiceClient =======================
 *
 * <p>Service Description: Service to manage shared criteria.
 *
 * <p>Sample for SharedCriterionServiceClient:
 *
 * <pre>{@code
 * try (SharedCriterionServiceClient sharedCriterionServiceClient =
 *     SharedCriterionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<SharedCriterionOperation> operations = new ArrayList<>();
 *   MutateSharedCriteriaResponse response =
 *       sharedCriterionServiceClient.mutateSharedCriteria(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= SharedSetServiceClient =======================
 *
 * <p>Service Description: Service to manage shared sets.
 *
 * <p>Sample for SharedSetServiceClient:
 *
 * <pre>{@code
 * try (SharedSetServiceClient sharedSetServiceClient = SharedSetServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<SharedSetOperation> operations = new ArrayList<>();
 *   MutateSharedSetsResponse response =
 *       sharedSetServiceClient.mutateSharedSets(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= SmartCampaignSettingServiceClient =======================
 *
 * <p>Service Description: Service to manage Smart campaign settings.
 *
 * <p>Sample for SmartCampaignSettingServiceClient:
 *
 * <pre>{@code
 * try (SmartCampaignSettingServiceClient smartCampaignSettingServiceClient =
 *     SmartCampaignSettingServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<SmartCampaignSettingOperation> operations = new ArrayList<>();
 *   MutateSmartCampaignSettingsResponse response =
 *       smartCampaignSettingServiceClient.mutateSmartCampaignSettings(customerId, operations);
 * }
 * }</pre>
 *
 * <p>======================= SmartCampaignSuggestServiceClient =======================
 *
 * <p>Service Description: Service to get suggestions for Smart Campaigns.
 *
 * <p>Sample for SmartCampaignSuggestServiceClient:
 *
 * <pre>{@code
 * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
 *     SmartCampaignSuggestServiceClient.create()) {
 *   SuggestSmartCampaignBudgetOptionsRequest request =
 *       SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
 *           .setCustomerId("customerId-1581184615")
 *           .build();
 *   SuggestSmartCampaignBudgetOptionsResponse response =
 *       smartCampaignSuggestServiceClient.suggestSmartCampaignBudgetOptions(request);
 * }
 * }</pre>
 *
 * <p>======================= ThirdPartyAppAnalyticsLinkServiceClient =======================
 *
 * <p>Service Description: This service allows management of links between Google Ads and third
 * party app analytics.
 *
 * <p>Sample for ThirdPartyAppAnalyticsLinkServiceClient:
 *
 * <pre>{@code
 * try (ThirdPartyAppAnalyticsLinkServiceClient thirdPartyAppAnalyticsLinkServiceClient =
 *     ThirdPartyAppAnalyticsLinkServiceClient.create()) {
 *   RegenerateShareableLinkIdRequest request =
 *       RegenerateShareableLinkIdRequest.newBuilder()
 *           .setResourceName(
 *               ThirdPartyAppAnalyticsLinkName.of("[CUSTOMER_ID]", "[CUSTOMER_LINK_ID]")
 *                   .toString())
 *           .build();
 *   RegenerateShareableLinkIdResponse response =
 *       thirdPartyAppAnalyticsLinkServiceClient.regenerateShareableLinkId(request);
 * }
 * }</pre>
 *
 * <p>======================= UserDataServiceClient =======================
 *
 * <p>Service Description: Service to manage user data uploads.
 *
 * <p>Sample for UserDataServiceClient:
 *
 * <pre>{@code
 * try (UserDataServiceClient userDataServiceClient = UserDataServiceClient.create()) {
 *   UploadUserDataRequest request =
 *       UploadUserDataRequest.newBuilder()
 *           .setCustomerId("customerId-1581184615")
 *           .addAllOperations(new ArrayList<UserDataOperation>())
 *           .build();
 *   UploadUserDataResponse response = userDataServiceClient.uploadUserData(request);
 * }
 * }</pre>
 *
 * <p>======================= UserListServiceClient =======================
 *
 * <p>Service Description: Service to manage user lists.
 *
 * <p>Sample for UserListServiceClient:
 *
 * <pre>{@code
 * try (UserListServiceClient userListServiceClient = UserListServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<UserListOperation> operations = new ArrayList<>();
 *   MutateUserListsResponse response =
 *       userListServiceClient.mutateUserLists(customerId, operations);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.ads.googleads.v10.services;

import javax.annotation.Generated;
