/*
 * Copyright 2020 Google LLC
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
 * <p>Reads for account-level budgets managed by these proposals will be supported in a future
 * version. Until then, please use the BudgetOrderService from the AdWords API. Learn more at
 * https://developers.google.com/adwords/api/docs/guides/budget-order
 *
 * <p>Mutates: The CREATE operation creates a new proposal. UPDATE operations aren't supported. The
 * REMOVE operation cancels a pending proposal.
 *
 * <p>Sample for AccountBudgetProposalServiceClient:
 *
 * <p>======================= AccountBudgetServiceClient =======================
 *
 * <p>Service Description: A service for fetching an account-level budget.
 *
 * <p>Account-level budgets are mutated by creating proposal resources.
 *
 * <p>Sample for AccountBudgetServiceClient:
 *
 * <p>======================= AccountLinkServiceClient =======================
 *
 * <p>Service Description: This service allows management of links between Google Ads accounts and
 * other accounts.
 *
 * <p>Sample for AccountLinkServiceClient:
 *
 * <p>======================= AdGroupAdAssetViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch ad group ad asset views.
 *
 * <p>Sample for AdGroupAdAssetViewServiceClient:
 *
 * <p>======================= AdGroupAdLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on ad group ads.
 *
 * <p>Sample for AdGroupAdLabelServiceClient:
 *
 * <p>======================= AdGroupAdServiceClient =======================
 *
 * <p>Service Description: Service to manage ads in an ad group.
 *
 * <p>Sample for AdGroupAdServiceClient:
 *
 * <p>======================= AdGroupAudienceViewServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group audience views.
 *
 * <p>Sample for AdGroupAudienceViewServiceClient:
 *
 * <p>======================= AdGroupBidModifierServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group bid modifiers.
 *
 * <p>Sample for AdGroupBidModifierServiceClient:
 *
 * <p>======================= AdGroupCriterionLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on ad group criteria.
 *
 * <p>Sample for AdGroupCriterionLabelServiceClient:
 *
 * <p>======================= AdGroupCriterionServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group criteria.
 *
 * <p>Sample for AdGroupCriterionServiceClient:
 *
 * <p>======================= AdGroupCriterionSimulationServiceClient =======================
 *
 * <p>Service Description: Service to fetch ad group criterion simulations.
 *
 * <p>Sample for AdGroupCriterionSimulationServiceClient:
 *
 * <p>======================= AdGroupExtensionSettingServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group extension settings.
 *
 * <p>Sample for AdGroupExtensionSettingServiceClient:
 *
 * <p>======================= AdGroupFeedServiceClient =======================
 *
 * <p>Service Description: Service to manage ad group feeds.
 *
 * <p>Sample for AdGroupFeedServiceClient:
 *
 * <p>======================= AdGroupLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on ad groups.
 *
 * <p>Sample for AdGroupLabelServiceClient:
 *
 * <p>======================= AdGroupServiceClient =======================
 *
 * <p>Service Description: Service to manage ad groups.
 *
 * <p>Sample for AdGroupServiceClient:
 *
 * <p>======================= AdGroupSimulationServiceClient =======================
 *
 * <p>Service Description: Service to fetch ad group simulations.
 *
 * <p>Sample for AdGroupSimulationServiceClient:
 *
 * <p>======================= AdParameterServiceClient =======================
 *
 * <p>Service Description: Service to manage ad parameters.
 *
 * <p>Sample for AdParameterServiceClient:
 *
 * <p>======================= AdScheduleViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch ad schedule views.
 *
 * <p>Sample for AdScheduleViewServiceClient:
 *
 * <p>======================= AdServiceClient =======================
 *
 * <p>Service Description: Service to manage ads.
 *
 * <p>Sample for AdServiceClient:
 *
 * <p>======================= AgeRangeViewServiceClient =======================
 *
 * <p>Service Description: Service to manage age range views.
 *
 * <p>Sample for AgeRangeViewServiceClient:
 *
 * <p>======================= AssetServiceClient =======================
 *
 * <p>Service Description: Service to manage assets. Asset types can be created with AssetService
 * are YoutubeVideoAsset, MediaBundleAsset and ImageAsset. TextAsset should be created with Ad
 * inline.
 *
 * <p>Sample for AssetServiceClient:
 *
 * <p>======================= BatchJobServiceClient =======================
 *
 * <p>Service Description: Service to manage batch jobs.
 *
 * <p>Sample for BatchJobServiceClient:
 *
 * <p>======================= BiddingStrategyServiceClient =======================
 *
 * <p>Service Description: Service to manage bidding strategies.
 *
 * <p>Sample for BiddingStrategyServiceClient:
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
 * <p>======================= CampaignAssetServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign assets.
 *
 * <p>Sample for CampaignAssetServiceClient:
 *
 * <p>======================= CampaignAudienceViewServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign audience views.
 *
 * <p>Sample for CampaignAudienceViewServiceClient:
 *
 * <p>======================= CampaignBidModifierServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign bid modifiers.
 *
 * <p>Sample for CampaignBidModifierServiceClient:
 *
 * <p>======================= CampaignBudgetServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign budgets.
 *
 * <p>Sample for CampaignBudgetServiceClient:
 *
 * <p>======================= CampaignCriterionServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign criteria.
 *
 * <p>Sample for CampaignCriterionServiceClient:
 *
 * <p>======================= CampaignCriterionSimulationServiceClient =======================
 *
 * <p>Service Description: Service to fetch campaign criterion simulations.
 *
 * <p>Sample for CampaignCriterionSimulationServiceClient:
 *
 * <p>======================= CampaignDraftServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign drafts.
 *
 * <p>Sample for CampaignDraftServiceClient:
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
 * <p>======================= CampaignExtensionSettingServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign extension settings.
 *
 * <p>Sample for CampaignExtensionSettingServiceClient:
 *
 * <p>======================= CampaignFeedServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign feeds.
 *
 * <p>Sample for CampaignFeedServiceClient:
 *
 * <p>======================= CampaignLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on campaigns.
 *
 * <p>Sample for CampaignLabelServiceClient:
 *
 * <p>======================= CampaignServiceClient =======================
 *
 * <p>Service Description: Service to manage campaigns.
 *
 * <p>Sample for CampaignServiceClient:
 *
 * <p>======================= CampaignSharedSetServiceClient =======================
 *
 * <p>Service Description: Service to manage campaign shared sets.
 *
 * <p>Sample for CampaignSharedSetServiceClient:
 *
 * <p>======================= CarrierConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch carrier constants.
 *
 * <p>Sample for CarrierConstantServiceClient:
 *
 * <p>======================= ChangeStatusServiceClient =======================
 *
 * <p>Service Description: Service to fetch change statuses.
 *
 * <p>Sample for ChangeStatusServiceClient:
 *
 * <p>======================= ClickViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch click views.
 *
 * <p>Sample for ClickViewServiceClient:
 *
 * <p>======================= CombinedAudienceServiceClient =======================
 *
 * <p>Service Description: Service to manage combined audiences. This service can be used to list
 * all your combined audiences with metadata, but won't show the structure and components of the
 * combined audience.
 *
 * <p>Sample for CombinedAudienceServiceClient:
 *
 * <p>======================= ConversionActionServiceClient =======================
 *
 * <p>Service Description: Service to manage conversion actions.
 *
 * <p>Sample for ConversionActionServiceClient:
 *
 * <p>======================= ConversionAdjustmentUploadServiceClient =======================
 *
 * <p>Service Description: Service to upload conversion adjustments.
 *
 * <p>Sample for ConversionAdjustmentUploadServiceClient:
 *
 * <p>======================= ConversionUploadServiceClient =======================
 *
 * <p>Service Description: Service to upload conversions.
 *
 * <p>Sample for ConversionUploadServiceClient:
 *
 * <p>======================= CurrencyConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch currency constants.
 *
 * <p>Sample for CurrencyConstantServiceClient:
 *
 * <p>======================= CustomAudienceServiceClient =======================
 *
 * <p>Service Description: Service to manage custom audiences.
 *
 * <p>Sample for CustomAudienceServiceClient:
 *
 * <p>======================= CustomInterestServiceClient =======================
 *
 * <p>Service Description: Service to manage custom interests.
 *
 * <p>Sample for CustomInterestServiceClient:
 *
 * <p>======================= CustomerClientLinkServiceClient =======================
 *
 * <p>Service Description: Service to manage customer client links.
 *
 * <p>Sample for CustomerClientLinkServiceClient:
 *
 * <p>======================= CustomerClientServiceClient =======================
 *
 * <p>Service Description: Service to get clients in a customer's hierarchy.
 *
 * <p>Sample for CustomerClientServiceClient:
 *
 * <p>======================= CustomerExtensionSettingServiceClient =======================
 *
 * <p>Service Description: Service to manage customer extension settings.
 *
 * <p>Sample for CustomerExtensionSettingServiceClient:
 *
 * <p>======================= CustomerFeedServiceClient =======================
 *
 * <p>Service Description: Service to manage customer feeds.
 *
 * <p>Sample for CustomerFeedServiceClient:
 *
 * <p>======================= CustomerLabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels on customers.
 *
 * <p>Sample for CustomerLabelServiceClient:
 *
 * <p>======================= CustomerManagerLinkServiceClient =======================
 *
 * <p>Service Description: Service to manage customer-manager links.
 *
 * <p>Sample for CustomerManagerLinkServiceClient:
 *
 * <p>======================= CustomerNegativeCriterionServiceClient =======================
 *
 * <p>Service Description: Service to manage customer negative criteria.
 *
 * <p>Sample for CustomerNegativeCriterionServiceClient:
 *
 * <p>======================= CustomerServiceClient =======================
 *
 * <p>Service Description: Service to manage customers.
 *
 * <p>Sample for CustomerServiceClient:
 *
 * <p>======================= CustomerUserAccessInvitationServiceClient =======================
 *
 * <p>Service Description: This service manages the access invitation extended to users for a given
 * customer.
 *
 * <p>Sample for CustomerUserAccessInvitationServiceClient:
 *
 * <p>======================= CustomerUserAccessServiceClient =======================
 *
 * <p>Service Description: This service manages the permissions of a user on a given customer.
 *
 * <p>Sample for CustomerUserAccessServiceClient:
 *
 * <p>======================= DetailPlacementViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch Detail Placement views.
 *
 * <p>Sample for DetailPlacementViewServiceClient:
 *
 * <p>======================= DisplayKeywordViewServiceClient =======================
 *
 * <p>Service Description: Service to manage display keyword views.
 *
 * <p>Sample for DisplayKeywordViewServiceClient:
 *
 * <p>======================= DistanceViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch distance views.
 *
 * <p>Sample for DistanceViewServiceClient:
 *
 * <p>======================= DomainCategoryServiceClient =======================
 *
 * <p>Service Description: Service to fetch domain categories.
 *
 * <p>Sample for DomainCategoryServiceClient:
 *
 * <p>======================= DynamicSearchAdsSearchTermViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch dynamic search ads views.
 *
 * <p>Sample for DynamicSearchAdsSearchTermViewServiceClient:
 *
 * <p>======================= ExpandedLandingPageViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch expanded landing page views.
 *
 * <p>Sample for ExpandedLandingPageViewServiceClient:
 *
 * <p>======================= ExtensionFeedItemServiceClient =======================
 *
 * <p>Service Description: Service to manage extension feed items.
 *
 * <p>Sample for ExtensionFeedItemServiceClient:
 *
 * <p>======================= FeedItemServiceClient =======================
 *
 * <p>Service Description: Service to manage feed items.
 *
 * <p>Sample for FeedItemServiceClient:
 *
 * <p>======================= FeedItemSetLinkServiceClient =======================
 *
 * <p>Service Description: Service to manage feed item set links.
 *
 * <p>Sample for FeedItemSetLinkServiceClient:
 *
 * <p>======================= FeedItemSetServiceClient =======================
 *
 * <p>Service Description: Service to manage feed Item Set
 *
 * <p>Sample for FeedItemSetServiceClient:
 *
 * <p>======================= FeedItemTargetServiceClient =======================
 *
 * <p>Service Description: Service to manage feed item targets.
 *
 * <p>Sample for FeedItemTargetServiceClient:
 *
 * <p>======================= FeedMappingServiceClient =======================
 *
 * <p>Service Description: Service to manage feed mappings.
 *
 * <p>Sample for FeedMappingServiceClient:
 *
 * <p>======================= FeedPlaceholderViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch feed placeholder views.
 *
 * <p>Sample for FeedPlaceholderViewServiceClient:
 *
 * <p>======================= FeedServiceClient =======================
 *
 * <p>Service Description: Service to manage feeds.
 *
 * <p>Sample for FeedServiceClient:
 *
 * <p>======================= GenderViewServiceClient =======================
 *
 * <p>Service Description: Service to manage gender views.
 *
 * <p>Sample for GenderViewServiceClient:
 *
 * <p>======================= GeoTargetConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch geo target constants.
 *
 * <p>Sample for GeoTargetConstantServiceClient:
 *
 * <p>======================= GeographicViewServiceClient =======================
 *
 * <p>Service Description: Service to manage geographic views.
 *
 * <p>Sample for GeographicViewServiceClient:
 *
 * <p>======================= GoogleAdsFieldServiceClient =======================
 *
 * <p>Service Description: Service to fetch Google Ads API fields.
 *
 * <p>Sample for GoogleAdsFieldServiceClient:
 *
 * <p>======================= GoogleAdsServiceClient =======================
 *
 * <p>Service Description: Service to fetch data and metrics across resources.
 *
 * <p>Sample for GoogleAdsServiceClient:
 *
 * <p>======================= GroupPlacementViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch Group Placement views.
 *
 * <p>Sample for GroupPlacementViewServiceClient:
 *
 * <p>======================= HotelGroupViewServiceClient =======================
 *
 * <p>Service Description: Service to manage Hotel Group Views.
 *
 * <p>Sample for HotelGroupViewServiceClient:
 *
 * <p>======================= HotelPerformanceViewServiceClient =======================
 *
 * <p>Service Description: Service to manage Hotel Performance Views.
 *
 * <p>Sample for HotelPerformanceViewServiceClient:
 *
 * <p>======================= IncomeRangeViewServiceClient =======================
 *
 * <p>Service Description: Service to manage income range views.
 *
 * <p>Sample for IncomeRangeViewServiceClient:
 *
 * <p>======================= InvoiceServiceClient =======================
 *
 * <p>Service Description: A service to fetch invoices issued for a billing setup during a given
 * month.
 *
 * <p>Sample for InvoiceServiceClient:
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
 * <p>======================= KeywordPlanAdGroupServiceClient =======================
 *
 * <p>Service Description: Service to manage Keyword Plan ad groups.
 *
 * <p>Sample for KeywordPlanAdGroupServiceClient:
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
 * <p>======================= KeywordPlanCampaignServiceClient =======================
 *
 * <p>Service Description: Service to manage Keyword Plan campaigns.
 *
 * <p>Sample for KeywordPlanCampaignServiceClient:
 *
 * <p>======================= KeywordPlanIdeaServiceClient =======================
 *
 * <p>Service Description: Service to generate keyword ideas.
 *
 * <p>Sample for KeywordPlanIdeaServiceClient:
 *
 * <p>======================= KeywordPlanServiceClient =======================
 *
 * <p>Service Description: Service to manage keyword plans.
 *
 * <p>Sample for KeywordPlanServiceClient:
 *
 * <p>======================= KeywordViewServiceClient =======================
 *
 * <p>Service Description: Service to manage keyword views.
 *
 * <p>Sample for KeywordViewServiceClient:
 *
 * <p>======================= LabelServiceClient =======================
 *
 * <p>Service Description: Service to manage labels.
 *
 * <p>Sample for LabelServiceClient:
 *
 * <p>======================= LandingPageViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch landing page views.
 *
 * <p>Sample for LandingPageViewServiceClient:
 *
 * <p>======================= LanguageConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch language constants.
 *
 * <p>Sample for LanguageConstantServiceClient:
 *
 * <p>======================= LocationViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch location views.
 *
 * <p>Sample for LocationViewServiceClient:
 *
 * <p>======================= ManagedPlacementViewServiceClient =======================
 *
 * <p>Service Description: Service to manage Managed Placement views.
 *
 * <p>Sample for ManagedPlacementViewServiceClient:
 *
 * <p>======================= MediaFileServiceClient =======================
 *
 * <p>Service Description: Service to manage media files.
 *
 * <p>Sample for MediaFileServiceClient:
 *
 * <p>======================= MerchantCenterLinkServiceClient =======================
 *
 * <p>Service Description: This service allows management of links between Google Ads and Google
 * Merchant Center.
 *
 * <p>Sample for MerchantCenterLinkServiceClient:
 *
 * <p>======================= MobileAppCategoryConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch mobile app category constants.
 *
 * <p>Sample for MobileAppCategoryConstantServiceClient:
 *
 * <p>======================= MobileDeviceConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch mobile device constants.
 *
 * <p>Sample for MobileDeviceConstantServiceClient:
 *
 * <p>======================= OfflineUserDataJobServiceClient =======================
 *
 * <p>Service Description: Service to manage offline user data jobs.
 *
 * <p>Sample for OfflineUserDataJobServiceClient:
 *
 * <p>======================= OperatingSystemVersionConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch Operating System Version constants.
 *
 * <p>Sample for OperatingSystemVersionConstantServiceClient:
 *
 * <p>======================= PaidOrganicSearchTermViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch paid organic search term views.
 *
 * <p>Sample for PaidOrganicSearchTermViewServiceClient:
 *
 * <p>======================= ParentalStatusViewServiceClient =======================
 *
 * <p>Service Description: Service to manage parental status views.
 *
 * <p>Sample for ParentalStatusViewServiceClient:
 *
 * <p>======================= PaymentsAccountServiceClient =======================
 *
 * <p>Service Description: Service to provide payments accounts that can be used to set up
 * consolidated billing.
 *
 * <p>Sample for PaymentsAccountServiceClient:
 *
 * <p>======================= ProductBiddingCategoryConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch Product Bidding Categories.
 *
 * <p>Sample for ProductBiddingCategoryConstantServiceClient:
 *
 * <p>======================= ProductGroupViewServiceClient =======================
 *
 * <p>Service Description: Service to manage product group views.
 *
 * <p>Sample for ProductGroupViewServiceClient:
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
 * <p>======================= RecommendationServiceClient =======================
 *
 * <p>Service Description: Service to manage recommendations.
 *
 * <p>Sample for RecommendationServiceClient:
 *
 * <p>======================= RemarketingActionServiceClient =======================
 *
 * <p>Service Description: Service to manage remarketing actions.
 *
 * <p>Sample for RemarketingActionServiceClient:
 *
 * <p>======================= SearchTermViewServiceClient =======================
 *
 * <p>Service Description: Service to manage search term views.
 *
 * <p>Sample for SearchTermViewServiceClient:
 *
 * <p>======================= SharedCriterionServiceClient =======================
 *
 * <p>Service Description: Service to manage shared criteria.
 *
 * <p>Sample for SharedCriterionServiceClient:
 *
 * <p>======================= SharedSetServiceClient =======================
 *
 * <p>Service Description: Service to manage shared sets.
 *
 * <p>Sample for SharedSetServiceClient:
 *
 * <p>======================= ShoppingPerformanceViewServiceClient =======================
 *
 * <p>Service Description: Service to fetch Shopping performance views.
 *
 * <p>Sample for ShoppingPerformanceViewServiceClient:
 *
 * <p>======================= ThirdPartyAppAnalyticsLinkServiceClient =======================
 *
 * <p>Service Description: This service allows management of links between Google Ads and third
 * party app analytics.
 *
 * <p>Sample for ThirdPartyAppAnalyticsLinkServiceClient:
 *
 * <p>======================= TopicConstantServiceClient =======================
 *
 * <p>Service Description: Service to fetch topic constants.
 *
 * <p>Sample for TopicConstantServiceClient:
 *
 * <p>======================= TopicViewServiceClient =======================
 *
 * <p>Service Description: Service to manage topic views.
 *
 * <p>Sample for TopicViewServiceClient:
 *
 * <p>======================= UserDataServiceClient =======================
 *
 * <p>Service Description: Service to manage user data uploads. Accessible only to customers on the
 * allow-list.
 *
 * <p>Sample for UserDataServiceClient:
 *
 * <p>======================= UserInterestServiceClient =======================
 *
 * <p>Service Description: Service to fetch Google Ads User Interest.
 *
 * <p>Sample for UserInterestServiceClient:
 *
 * <p>======================= UserListServiceClient =======================
 *
 * <p>Service Description: Service to manage user lists.
 *
 * <p>Sample for UserListServiceClient:
 *
 * <p>======================= UserLocationViewServiceClient =======================
 *
 * <p>Service Description: Service to manage user location views.
 *
 * <p>Sample for UserLocationViewServiceClient:
 *
 * <p>======================= VideoServiceClient =======================
 *
 * <p>Service Description: Service to manage videos.
 *
 * <p>Sample for VideoServiceClient:
 */
@Generated("by gapic-generator-java")
package com.google.ads.googleads.v6.services;

import javax.annotation.Generated;
