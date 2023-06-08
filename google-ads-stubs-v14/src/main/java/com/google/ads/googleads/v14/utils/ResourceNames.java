// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the license.
package com.google.ads.googleads.v14.utils;

import com.google.ads.googleads.v14.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v14.enums.AssetSetTypeEnum.AssetSetType;
import com.google.ads.googleads.v14.enums.ConversionActionCategoryEnum.ConversionActionCategory;
import com.google.ads.googleads.v14.enums.ConversionOriginEnum.ConversionOrigin;
import com.google.ads.googleads.v14.enums.DistanceBucketEnum.DistanceBucket;
import com.google.ads.googleads.v14.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v14.enums.FeedItemTargetTypeEnum.FeedItemTargetType;
import com.google.ads.googleads.v14.enums.GeoTargetingTypeEnum.GeoTargetingType;
import com.google.ads.googleads.v14.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v14.enums.ProductBiddingCategoryLevelEnum.ProductBiddingCategoryLevel;
import com.google.ads.googleads.v14.enums.SimulationModificationMethodEnum.SimulationModificationMethod;
import com.google.ads.googleads.v14.enums.SimulationTypeEnum.SimulationType;
import com.google.ads.googleads.v14.resources.AccessibleBiddingStrategyName;
import com.google.ads.googleads.v14.resources.AccountBudgetName;
import com.google.ads.googleads.v14.resources.AccountBudgetProposalName;
import com.google.ads.googleads.v14.resources.AccountLinkName;
import com.google.ads.googleads.v14.resources.AdGroupAdAssetCombinationViewName;
import com.google.ads.googleads.v14.resources.AdGroupAdAssetViewName;
import com.google.ads.googleads.v14.resources.AdGroupAdLabelName;
import com.google.ads.googleads.v14.resources.AdGroupAdName;
import com.google.ads.googleads.v14.resources.AdGroupAssetName;
import com.google.ads.googleads.v14.resources.AdGroupAssetSetName;
import com.google.ads.googleads.v14.resources.AdGroupAudienceViewName;
import com.google.ads.googleads.v14.resources.AdGroupBidModifierName;
import com.google.ads.googleads.v14.resources.AdGroupCriterionCustomizerName;
import com.google.ads.googleads.v14.resources.AdGroupCriterionLabelName;
import com.google.ads.googleads.v14.resources.AdGroupCriterionName;
import com.google.ads.googleads.v14.resources.AdGroupCriterionSimulationName;
import com.google.ads.googleads.v14.resources.AdGroupCustomizerName;
import com.google.ads.googleads.v14.resources.AdGroupExtensionSettingName;
import com.google.ads.googleads.v14.resources.AdGroupFeedName;
import com.google.ads.googleads.v14.resources.AdGroupLabelName;
import com.google.ads.googleads.v14.resources.AdGroupName;
import com.google.ads.googleads.v14.resources.AdGroupSimulationName;
import com.google.ads.googleads.v14.resources.AdName;
import com.google.ads.googleads.v14.resources.AdParameterName;
import com.google.ads.googleads.v14.resources.AdScheduleViewName;
import com.google.ads.googleads.v14.resources.AgeRangeViewName;
import com.google.ads.googleads.v14.resources.AssetFieldTypeViewName;
import com.google.ads.googleads.v14.resources.AssetGroupAssetName;
import com.google.ads.googleads.v14.resources.AssetGroupListingGroupFilterName;
import com.google.ads.googleads.v14.resources.AssetGroupName;
import com.google.ads.googleads.v14.resources.AssetGroupProductGroupViewName;
import com.google.ads.googleads.v14.resources.AssetGroupSignalName;
import com.google.ads.googleads.v14.resources.AssetName;
import com.google.ads.googleads.v14.resources.AssetSetAssetName;
import com.google.ads.googleads.v14.resources.AssetSetName;
import com.google.ads.googleads.v14.resources.AssetSetTypeViewName;
import com.google.ads.googleads.v14.resources.AudienceName;
import com.google.ads.googleads.v14.resources.BatchJobName;
import com.google.ads.googleads.v14.resources.BiddingDataExclusionName;
import com.google.ads.googleads.v14.resources.BiddingSeasonalityAdjustmentName;
import com.google.ads.googleads.v14.resources.BiddingStrategyName;
import com.google.ads.googleads.v14.resources.BiddingStrategySimulationName;
import com.google.ads.googleads.v14.resources.BillingSetupName;
import com.google.ads.googleads.v14.resources.CallViewName;
import com.google.ads.googleads.v14.resources.CampaignAssetName;
import com.google.ads.googleads.v14.resources.CampaignAssetSetName;
import com.google.ads.googleads.v14.resources.CampaignAudienceViewName;
import com.google.ads.googleads.v14.resources.CampaignBidModifierName;
import com.google.ads.googleads.v14.resources.CampaignBudgetName;
import com.google.ads.googleads.v14.resources.CampaignConversionGoalName;
import com.google.ads.googleads.v14.resources.CampaignCriterionName;
import com.google.ads.googleads.v14.resources.CampaignCustomizerName;
import com.google.ads.googleads.v14.resources.CampaignDraftName;
import com.google.ads.googleads.v14.resources.CampaignExtensionSettingName;
import com.google.ads.googleads.v14.resources.CampaignFeedName;
import com.google.ads.googleads.v14.resources.CampaignGroupName;
import com.google.ads.googleads.v14.resources.CampaignLabelName;
import com.google.ads.googleads.v14.resources.CampaignName;
import com.google.ads.googleads.v14.resources.CampaignSharedSetName;
import com.google.ads.googleads.v14.resources.CampaignSimulationName;
import com.google.ads.googleads.v14.resources.CarrierConstantName;
import com.google.ads.googleads.v14.resources.ChangeEventName;
import com.google.ads.googleads.v14.resources.ChangeStatusName;
import com.google.ads.googleads.v14.resources.ClickViewName;
import com.google.ads.googleads.v14.resources.CombinedAudienceName;
import com.google.ads.googleads.v14.resources.ConversionActionName;
import com.google.ads.googleads.v14.resources.ConversionCustomVariableName;
import com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfigName;
import com.google.ads.googleads.v14.resources.ConversionValueRuleName;
import com.google.ads.googleads.v14.resources.ConversionValueRuleSetName;
import com.google.ads.googleads.v14.resources.CurrencyConstantName;
import com.google.ads.googleads.v14.resources.CustomAudienceName;
import com.google.ads.googleads.v14.resources.CustomConversionGoalName;
import com.google.ads.googleads.v14.resources.CustomInterestName;
import com.google.ads.googleads.v14.resources.CustomerAssetName;
import com.google.ads.googleads.v14.resources.CustomerAssetSetName;
import com.google.ads.googleads.v14.resources.CustomerClientLinkName;
import com.google.ads.googleads.v14.resources.CustomerClientName;
import com.google.ads.googleads.v14.resources.CustomerConversionGoalName;
import com.google.ads.googleads.v14.resources.CustomerCustomizerName;
import com.google.ads.googleads.v14.resources.CustomerExtensionSettingName;
import com.google.ads.googleads.v14.resources.CustomerFeedName;
import com.google.ads.googleads.v14.resources.CustomerLabelName;
import com.google.ads.googleads.v14.resources.CustomerManagerLinkName;
import com.google.ads.googleads.v14.resources.CustomerName;
import com.google.ads.googleads.v14.resources.CustomerNegativeCriterionName;
import com.google.ads.googleads.v14.resources.CustomerSkAdNetworkConversionValueSchemaName;
import com.google.ads.googleads.v14.resources.CustomerUserAccessInvitationName;
import com.google.ads.googleads.v14.resources.CustomerUserAccessName;
import com.google.ads.googleads.v14.resources.CustomizerAttributeName;
import com.google.ads.googleads.v14.resources.DetailPlacementViewName;
import com.google.ads.googleads.v14.resources.DetailedDemographicName;
import com.google.ads.googleads.v14.resources.DisplayKeywordViewName;
import com.google.ads.googleads.v14.resources.DistanceViewName;
import com.google.ads.googleads.v14.resources.DomainCategoryName;
import com.google.ads.googleads.v14.resources.DynamicSearchAdsSearchTermViewName;
import com.google.ads.googleads.v14.resources.ExpandedLandingPageViewName;
import com.google.ads.googleads.v14.resources.ExperimentArmName;
import com.google.ads.googleads.v14.resources.ExperimentName;
import com.google.ads.googleads.v14.resources.ExtensionFeedItemName;
import com.google.ads.googleads.v14.resources.FeedItemName;
import com.google.ads.googleads.v14.resources.FeedItemSetLinkName;
import com.google.ads.googleads.v14.resources.FeedItemSetName;
import com.google.ads.googleads.v14.resources.FeedItemTargetName;
import com.google.ads.googleads.v14.resources.FeedMappingName;
import com.google.ads.googleads.v14.resources.FeedName;
import com.google.ads.googleads.v14.resources.FeedPlaceholderViewName;
import com.google.ads.googleads.v14.resources.GenderViewName;
import com.google.ads.googleads.v14.resources.GeoTargetConstantName;
import com.google.ads.googleads.v14.resources.GeographicViewName;
import com.google.ads.googleads.v14.resources.GoogleAdsFieldName;
import com.google.ads.googleads.v14.resources.GroupPlacementViewName;
import com.google.ads.googleads.v14.resources.HotelGroupViewName;
import com.google.ads.googleads.v14.resources.HotelPerformanceViewName;
import com.google.ads.googleads.v14.resources.HotelReconciliationName;
import com.google.ads.googleads.v14.resources.IncomeRangeViewName;
import com.google.ads.googleads.v14.resources.InvoiceName;
import com.google.ads.googleads.v14.resources.KeywordPlanAdGroupKeywordName;
import com.google.ads.googleads.v14.resources.KeywordPlanAdGroupName;
import com.google.ads.googleads.v14.resources.KeywordPlanCampaignKeywordName;
import com.google.ads.googleads.v14.resources.KeywordPlanCampaignName;
import com.google.ads.googleads.v14.resources.KeywordPlanName;
import com.google.ads.googleads.v14.resources.KeywordThemeConstantName;
import com.google.ads.googleads.v14.resources.KeywordViewName;
import com.google.ads.googleads.v14.resources.LabelName;
import com.google.ads.googleads.v14.resources.LandingPageViewName;
import com.google.ads.googleads.v14.resources.LanguageConstantName;
import com.google.ads.googleads.v14.resources.LeadFormSubmissionDataName;
import com.google.ads.googleads.v14.resources.LifeEventName;
import com.google.ads.googleads.v14.resources.LocationViewName;
import com.google.ads.googleads.v14.resources.ManagedPlacementViewName;
import com.google.ads.googleads.v14.resources.MediaFileName;
import com.google.ads.googleads.v14.resources.MerchantCenterLinkName;
import com.google.ads.googleads.v14.resources.MobileAppCategoryConstantName;
import com.google.ads.googleads.v14.resources.MobileDeviceConstantName;
import com.google.ads.googleads.v14.resources.OfflineUserDataJobName;
import com.google.ads.googleads.v14.resources.OperatingSystemVersionConstantName;
import com.google.ads.googleads.v14.resources.PaidOrganicSearchTermViewName;
import com.google.ads.googleads.v14.resources.ParentalStatusViewName;
import com.google.ads.googleads.v14.resources.PaymentsAccountName;
import com.google.ads.googleads.v14.resources.PerStoreViewName;
import com.google.ads.googleads.v14.resources.ProductBiddingCategoryConstantName;
import com.google.ads.googleads.v14.resources.ProductGroupViewName;
import com.google.ads.googleads.v14.resources.ProductLinkName;
import com.google.ads.googleads.v14.resources.QualifyingQuestionName;
import com.google.ads.googleads.v14.resources.RecommendationName;
import com.google.ads.googleads.v14.resources.RemarketingActionName;
import com.google.ads.googleads.v14.resources.SearchTermViewName;
import com.google.ads.googleads.v14.resources.SharedCriterionName;
import com.google.ads.googleads.v14.resources.SharedSetName;
import com.google.ads.googleads.v14.resources.ShoppingPerformanceViewName;
import com.google.ads.googleads.v14.resources.SmartCampaignSearchTermViewName;
import com.google.ads.googleads.v14.resources.SmartCampaignSettingName;
import com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLinkName;
import com.google.ads.googleads.v14.resources.TopicConstantName;
import com.google.ads.googleads.v14.resources.TopicViewName;
import com.google.ads.googleads.v14.resources.TravelActivityGroupViewName;
import com.google.ads.googleads.v14.resources.TravelActivityPerformanceViewName;
import com.google.ads.googleads.v14.resources.UserInterestName;
import com.google.ads.googleads.v14.resources.UserListName;
import com.google.ads.googleads.v14.resources.UserLocationViewName;
import com.google.ads.googleads.v14.resources.VideoName;
import com.google.ads.googleads.v14.resources.WebpageViewName;

/**
 * Utilities for generating resource names. Offers several advantages over the utilities in the
 * various {@code *Name} classes.
 *
 * <ul>
 *   <li>Method parameter types match the type of each identifier. For example, the {@code
 *       campaignId} parameter of {@link #campaign(long, long)} is of type {@code long}. In
 *       contrast, the {@code campaign} parameter of {@link CampaignName#format(String, String)} is
 *       of type {@code String}.
 *   <li>Method parameter lists contain each component identifier. For example, {@link
 *       #adGroupCriterion(long, long, long)} expects a customer ID, an ad group ID, and a criterion
 *       ID. In contrast, {@link AdGroupCriterionName#format(String, String, String)} expects a
 *       customer ID and an underscore-delimited combination of ad group ID and criterion ID.
 * </ul>
 */
public class ResourceNames {
  /** Returns the Accessible Bidding Strategy resource name for the specified components. */
  public static String accessibleBiddingStrategy(long customerId, long biddingStrategyId) {
    return AccessibleBiddingStrategyName.format(
        String.valueOf(customerId), String.valueOf(biddingStrategyId));
  }

  /** Returns the Account Link resource name for the specified components. */
  public static String accountLink(long customerId, long accountLinkId) {
    return AccountLinkName.format(String.valueOf(customerId), String.valueOf(accountLinkId));
  }

  /** Returns the account budget resource name for the specified components. */
  public static String accountBudget(long customerId, long accountBudgetId) {
    return AccountBudgetName.format(String.valueOf(customerId), String.valueOf(accountBudgetId));
  }

  /** Returns the account budget proposal resource name for the specified components. */
  public static String accountBudgetProposal(long customerId, long accountBudgetProposalId) {
    return AccountBudgetProposalName.format(
        String.valueOf(customerId), String.valueOf(accountBudgetProposalId));
  }

  /** Returns the ad resource name for the specified components. */
  public static String ad(long customerId, long adId) {
    return AdName.format(String.valueOf(customerId), String.valueOf(adId));
  }

  /** Returns the ad group resource name for the specified components. */
  public static String adGroup(long customerId, long adGroupId) {
    return AdGroupName.format(String.valueOf(customerId), String.valueOf(adGroupId));
  }

  /** Returns the ad group ad resource name for the specified components. */
  public static String adGroupAd(long customerId, long adGroupId, long adId) {
    return AdGroupAdName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(adId));
  }

  /** Returns the Ad Group Ad Asset Combination View resource name for the specified components. */
  public static String adGroupAdAssetCombinationView(
      long customerId,
      long adGroupId,
      long adId,
      long assetCombinationIdLow,
      long assetCombinationIdHigh) {
    return AdGroupAdAssetCombinationViewName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        String.valueOf(adId),
        String.valueOf(assetCombinationIdLow),
        String.valueOf(assetCombinationIdHigh));
  }

  /** Returns the Ad Group Ad Asset View resource name for the specified components. */
  public static String adGroupAdAssetView(
      long customerId, long adGroupId, long adId, long assetId, AssetFieldType fieldType) {
    return AdGroupAdAssetViewName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        String.valueOf(adId),
        String.valueOf(assetId),
        String.valueOf(fieldType));
  }

  /** Returns the ad group ad label for the specified components. */
  public static String adGroupAdLabel(long customerId, long adGroupId, long adId, long labelId) {
    return AdGroupAdLabelName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        String.valueOf(adId),
        String.valueOf(labelId));
  }

  /** Returns the Ad Group Asset resource name for the specified components. */
  public static String adGroupAsset(
      long customerId, long adGroupId, long assetId, AssetFieldType fieldType) {
    return AdGroupAssetName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        String.valueOf(assetId),
        fieldType.toString());
  }

  /** Returns the Ad Group Asset Set resource name for the specified components. */
  public static String adGroupAssetSet(long customerId, long adGroupId, long assetSetId) {
    return AdGroupAssetSetName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(assetSetId));
  }

  /** Returns the ad group audience view resource name for the specified components. */
  public static String adGroupAudienceView(long customerId, long adGroupId, long criterionId) {
    return AdGroupAudienceViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the ad group bid modifier resource name for the specified components. */
  public static String adGroupBidModifier(long customerId, long adGroupId, long criterionId) {
    return AdGroupBidModifierName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the ad group criterion resource name for the specified components. */
  public static String adGroupCriterion(long customerId, long adGroupId, long criterionId) {
    return AdGroupCriterionName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the Ad Group Criterion Customizer resource name for the specified components. */
  public static String adGroupCriterionCustomizer(
      long customerId, long adGroupId, long criterionId, long customizerAttributeId) {
    return AdGroupCriterionCustomizerName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        String.valueOf(criterionId),
        String.valueOf(customizerAttributeId));
  }

  /** Returns the Ad Group Customizer resource name for the specified components. */
  public static String adGroupCustomizer(long customerId, long adGroupId, long customizerId) {
    return AdGroupCustomizerName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(customizerId));
  }

  /** Returns the ad group criterion label for the specified components. */
  public static String adGroupCriterionLabel(
      long customerId, long adGroupId, long criterionId, long labelId) {
    return AdGroupCriterionLabelName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        String.valueOf(criterionId),
        String.valueOf(labelId));
  }

  /** Returns the Ad Group Criterion Simulation resource name for the specified components. */
  public static String adGroupCriterionSimulation(
      long customerId,
      long adGroupId,
      long criterionId,
      SimulationType type,
      SimulationModificationMethod method,
      String startDate,
      String endDate) {
    return AdGroupCriterionSimulationName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        String.valueOf(criterionId),
        String.valueOf(type),
        String.valueOf(method),
        startDate,
        endDate);
  }

  /** Returns the ad group extension setting for the specified components. */
  public static String adGroupExtensionSetting(
      long customerId, long adGroupId, ExtensionType extensionType) {
    return AdGroupExtensionSettingName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), extensionType.name());
  }

  /** Returns the ad group feed resource name for the specified components. */
  public static String adGroupFeed(long customerId, long adGroupId, long feedId) {
    return AdGroupFeedName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(feedId));
  }

  /** Returns the ad group label for the specified components. */
  public static String adGroupLabel(long customerId, long adGroupId, long labelId) {
    return AdGroupLabelName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(labelId));
  }

  /** Returns the Ad Group Simulation resource name for the specified components. */
  public static String adGroupSimulation(
      long customerId,
      long adGroupId,
      SimulationType type,
      SimulationModificationMethod method,
      String startDate,
      String endDate) {
    return AdGroupSimulationName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        String.valueOf(type),
        String.valueOf(method),
        startDate,
        endDate);
  }

  /** Returns the ad parameter resource name for the specified components. */
  public static String adParameter(
      long customerId, long adGroupId, long criterionId, long parameterIndex) {
    return AdParameterName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        String.valueOf(criterionId),
        String.valueOf(parameterIndex));
  }

  /** Returns the ad schedule view resource name for the specified components. */
  public static String adScheduleView(long customerId, long campaignId, long criterionId) {
    return AdScheduleViewName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(criterionId));
  }

  /** Returns the age range view resource name for the specified components. */
  public static String ageRangeView(long customerId, long adGroupId, long criterionId) {
    return AgeRangeViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the Asset resource name for the specified components. */
  public static String asset(long customerId, long assetId) {
    return AssetName.format(String.valueOf(customerId), String.valueOf(assetId));
  }

  /** Returns the Asset Field Type View resource name for the specified components. */
  public static String assetFieldTypeView(long customerId, AssetFieldType fieldType) {
    return AssetFieldTypeViewName.format(String.valueOf(customerId), fieldType.toString());
  }

  /** Returns the Asset Group resource name for the specified components. */
  public static String assetGroup(long customerId, long assetGroupId) {
    return AssetGroupName.format(String.valueOf(customerId), String.valueOf(assetGroupId));
  }

  /** Returns the Asset Group Asset resource name for the specified components. */
  public static String assetGroupAsset(
      long customerId, long assetGroupId, long assetId, AssetFieldType fieldType) {
    return AssetGroupAssetName.format(
        String.valueOf(customerId),
        String.valueOf(assetGroupId),
        String.valueOf(assetId),
        fieldType.toString());
  }

  /** Returns the Asset Group Listing Group Filter resource name for the specified components. */
  public static String assetGroupListingGroupFilter(
      long customerId, long assetGroupId, long listingGroupFilterId) {
    return AssetGroupListingGroupFilterName.format(
        String.valueOf(customerId),
        String.valueOf(assetGroupId),
        String.valueOf(listingGroupFilterId));
  }

  /** Returns the Asset Group Product Group View resource name for the specified components. */
  public static String assetGroupProductGroupView(
      long customerId, long assetGroupId, long listingGroupFilterId) {
    return AssetGroupProductGroupViewName.format(
        String.valueOf(customerId),
        String.valueOf(assetGroupId),
        String.valueOf(listingGroupFilterId));
  }

  /** Returns the Asset Group Signal resource name for the specified components. */
  public static String assetGroupSignal(long customerId, long assetGroupId, long criterionId) {
    return AssetGroupSignalName.format(
        String.valueOf(customerId), String.valueOf(assetGroupId), String.valueOf(criterionId));
  }

  /** Returns the Asset Set resource name for the specified components. */
  public static String assetSet(long customerId, long assetSetId) {
    return AssetSetName.format(String.valueOf(customerId), String.valueOf(assetSetId));
  }

  /** Returns the Asset Set Type View resource name for the specified components. */
  public static String assetSetTypeView(long customerId, AssetSetType assetSetType) {
    return AssetSetTypeViewName.format(String.valueOf(customerId), assetSetType.name());
  }

  /** Returns the Asset Set Asset resource name for the specified components. */
  public static String assetSetAsset(long customerId, long assetSetId, long assetId) {
    return AssetSetAssetName.format(
        String.valueOf(customerId), String.valueOf(assetSetId), String.valueOf(assetId));
  }

  /** Returns the Audience resource name for the specified components. */
  public static String audience(long customerId, long audienceId) {
    return AudienceName.format(String.valueOf(customerId), String.valueOf(audienceId));
  }

  /** Returns the Bidding Data Exclusion resource name for the specified components. */
  public static String biddingDataExclusion(long customerId, long seasonalityEventId) {
    return BiddingDataExclusionName.format(
        String.valueOf(customerId), String.valueOf(seasonalityEventId));
  }

  /** Returns the Bidding Seasonality Adjustment resource name for the specified components. */
  public static String biddingSeasonalityAdjustment(long customerId, long seasonalityEventId) {
    return BiddingSeasonalityAdjustmentName.format(
        String.valueOf(customerId), String.valueOf(seasonalityEventId));
  }

  /** Returns the bidding strategy resource name for the specified components. */
  public static String biddingStrategy(long customerId, long biddingStrategyId) {
    return BiddingStrategyName.format(
        String.valueOf(customerId), String.valueOf(biddingStrategyId));
  }

  /** Returns the Bidding Strategy Simulation resource name for the specified components. */
  public static String biddingStrategySimulation(
      long customerId,
      long biddingStrategyId,
      SimulationType type,
      SimulationModificationMethod modificationMethod,
      String startDate,
      String endDate) {
    return BiddingStrategySimulationName.format(
        String.valueOf(customerId),
        String.valueOf(biddingStrategyId),
        type.toString(),
        modificationMethod.toString(),
        startDate,
        endDate);
  }

  /** Returns the billing setup resource name for the specified components. */
  public static String billingSetup(long customerId, long billingSetupId) {
    return BillingSetupName.format(String.valueOf(customerId), String.valueOf(billingSetupId));
  }

  /** Returns the Call View resource name for the specified components. */
  public static String callView(long customerId, long callDetailId) {
    return CallViewName.format(String.valueOf(customerId), String.valueOf(callDetailId));
  }

  /** Returns the campaign resource name for the specified components. */
  public static String campaign(long customerId, long campaignId) {
    return CampaignName.format(String.valueOf(customerId), String.valueOf(campaignId));
  }

  /** Returns the Campaign Asset resource name for the specified components. */
  public static String campaignAsset(
      long customerId, long campaignId, long assetId, AssetFieldType fieldType) {
    return CampaignAssetName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        String.valueOf(assetId),
        fieldType.toString());
  }

  /** Returns the Campaign Asset Set resource name for the specified components. */
  public static String campaignAssetSet(long customerId, long campaignId, long assetSetId) {
    return CampaignAssetSetName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(assetSetId));
  }

  /** Returns the Campaign Conversion Goal resource name for the specified components. */
  public static String campaignConversionGoal(
      long customerId,
      long capmaignId,
      ConversionActionCategory category,
      ConversionOrigin origin) {
    return CampaignConversionGoalName.format(
        String.valueOf(customerId),
        String.valueOf(capmaignId),
        category.toString(),
        origin.toString());
  }

  /** Returns the Campaign Customizer resource name for the specified components. */
  public static String campaignCustomizer(
      long customerId, long campaignId, long customizerAttributeId) {
    return CampaignCustomizerName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        String.valueOf(customizerAttributeId));
  }

  /** Returns the campaign audience view resource name for the specified components. */
  public static String campaignAudienceView(long customerId, long campaignId, long criterionId) {
    return CampaignAudienceViewName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(criterionId));
  }

  /** Returns the campaign bid modifier resource name for the specified components. */
  public static String campaignBidModifier(long customerId, long campaignId, long criterionId) {
    return CampaignBidModifierName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(criterionId));
  }

  /** Returns the campaign budget resource name for the specified components. */
  public static String campaignBudget(long customerId, long budgetId) {
    return CampaignBudgetName.format(String.valueOf(customerId), String.valueOf(budgetId));
  }

  /** Returns the campaign criterion resource name for the specified components. */
  public static String campaignCriterion(long customerId, long campaignId, long criterionId) {
    return CampaignCriterionName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(criterionId));
  }

  /** Returns the Campaign Draft resource name for the specified components. */
  public static String campaignDraft(long customerId, long baseCampaignId, long draftId) {
    return CampaignDraftName.format(
        String.valueOf(customerId), String.valueOf(baseCampaignId), String.valueOf(draftId));
  }

  /** Returns the campaign extension setting for the specified components. */
  public static String campaignExtensionSetting(
      long customerId, long campaignId, ExtensionType extensionType) {
    return CampaignExtensionSettingName.format(
        String.valueOf(customerId), String.valueOf(campaignId), extensionType.name());
  }

  /** Returns the campaign feed resource name for the specified components. */
  public static String campaignFeed(long customerId, long campaignId, long feedId) {
    return CampaignFeedName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(feedId));
  }

  /** Returns the campaign group resource name for the specified components. */
  public static String campaignGroup(long customerId, long campaignGroupId) {
    return CampaignGroupName.format(String.valueOf(customerId), String.valueOf(campaignGroupId));
  }

  /** Returns the campaign label for the specified components. */
  public static String campaignLabel(long customerId, long campaignId, long labelId) {
    return CampaignLabelName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(labelId));
  }

  /** Returns the campaign shared set resource name for the specified components. */
  public static String campaignSharedSet(long customerId, long campaignId, long sharedSetId) {
    return CampaignSharedSetName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(sharedSetId));
  }

  /** Returns the Campaign Simulation resource name for the specified components. */
  public static String campaignSimulation(
      long customerId,
      long campaignId,
      SimulationType type,
      SimulationModificationMethod modificationMethod,
      String startDate,
      String endDate) {
    return CampaignSimulationName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        type.toString(),
        modificationMethod.toString(),
        startDate,
        endDate);
  }

  /** Returns the carrier constant resource name for the specified components. */
  public static String carrierConstant(long criterionId) {
    return CarrierConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the Change Event resource name for the specified components. */
  public static String changeEvent(
      long customerId, long timestampMicros, long commandIndex, long mutateIndex) {
    return ChangeEventName.format(
        String.valueOf(customerId),
        String.valueOf(timestampMicros),
        String.valueOf(commandIndex),
        String.valueOf(mutateIndex));
  }

  /** Returns the change status resource name for the specified components. */
  public static String changeStatus(long customerId, String changeStatusId) {
    return ChangeStatusName.format(String.valueOf(customerId), changeStatusId);
  }

  /** Returns the click view for the specified components. */
  public static String clickView(long customerId, String date, String gclid) {
    return ClickViewName.format(String.valueOf(customerId), date, gclid);
  }

  /** Returns the Combined Audience resource name for the specified components. */
  public static String combinedAudience(long customerId, long combinedAudienceId) {
    return CombinedAudienceName.format(
        String.valueOf(customerId), String.valueOf(combinedAudienceId));
  }

  /** Returns the conversion action resource name for the specified components. */
  public static String conversionAction(long customerId, long conversionActionId) {
    return ConversionActionName.format(
        String.valueOf(customerId), String.valueOf(conversionActionId));
  }

  /** Returns the Conversion Custom Variable resource name for the specified components. */
  public static String conversionCustomVariable(long customerId, long conversionCustomVariableId) {
    return ConversionCustomVariableName.format(
        String.valueOf(customerId), String.valueOf(conversionCustomVariableId));
  }

  /** Returns the Conversion Goal Campaign Config resource name for the specified components. */
  public static String conversionGoalCampaignConfig(long customerId, long campaignId) {
    return ConversionGoalCampaignConfigName.format(
        String.valueOf(customerId), String.valueOf(campaignId));
  }

  /** Returns the Conversion Value Rule resource name for the specified components. */
  public static String conversionValueRule(long customerId, long conversionValueRuleId) {
    return ConversionValueRuleName.format(
        String.valueOf(customerId), String.valueOf(conversionValueRuleId));
  }

  /** Returns the Conversion Value Rule Set resource name for the specified components. */
  public static String conversionValueRuleSet(long customerId, long conversionValueRuleSetId) {
    return ConversionValueRuleSetName.format(
        String.valueOf(customerId), String.valueOf(conversionValueRuleSetId));
  }

  /** Returns the Custom Conversion Goal resource name for the specified components. */
  public static String customConversionGoal(long customerId, long goalId) {
    return CustomConversionGoalName.format(String.valueOf(customerId), String.valueOf(goalId));
  }

  /** Returns the Customer Conversion Goal resource name for the specified components. */
  public static String customerConversionGoal(
      long customerId, ConversionActionCategory category, ConversionOrigin source) {
    return CustomerConversionGoalName.format(
        String.valueOf(customerId), String.valueOf(category), String.valueOf(source));
  }

  /** Returns the Customer Customizer resource name for the specified components. */
  public static String customerCustomizer(long customerId, long customizerAttributeId) {
    return CustomerCustomizerName.format(
        String.valueOf(customerId), String.valueOf(customizerAttributeId));
  }

  /**
   * Returns the Customer SK Ad Network Conversion Value Schema resource name for the specified
   * components.
   */
  public static String customerSkAdNetworkConversionValueSchema(
      long customerId, long accountLinkId) {
    return CustomerSkAdNetworkConversionValueSchemaName.format(
        String.valueOf(customerId), String.valueOf(accountLinkId));
  }

  /** Returns the Customer User Access Invitation resource name for the specified components. */
  public static String customerUserAccessInvitation(long customerId, long invitationId) {
    return CustomerUserAccessInvitationName.format(
        String.valueOf(customerId), String.valueOf(invitationId));
  }

  /** Returns the Customizer Attribute resource name for the specified components. */
  public static String customizerAttribute(long customerId, long customizerAttributeId) {
    return CustomizerAttributeName.format(
        String.valueOf(customerId), String.valueOf(customizerAttributeId));
  }

  /** Returns the Hotel Reconciliation resource name for the specified components. */
  public static String hotelReconciliation(long customerId, long commisionId) {
    return HotelReconciliationName.format(String.valueOf(customerId), String.valueOf(commisionId));
  }

  /** Returns the currency constant resource name for the specified components. */
  public static String currencyConstant(String currencyCode) {
    return CurrencyConstantName.format(currencyCode);
  }

  /** Returns the Custom Audience resource name for the specified components. */
  public static String customAudience(long customerId, long customAudienceId) {
    return CustomAudienceName.format(String.valueOf(customerId), String.valueOf(customAudienceId));
  }

  /** Returns the custom interest for the specified components. */
  public static String customInterest(long customerId, long customInterestId) {
    return CustomInterestName.format(String.valueOf(customerId), String.valueOf(customInterestId));
  }

  /** Returns the customer resource name for the specified components. */
  public static String customer(long customerId) {
    return CustomerName.format(String.valueOf(customerId));
  }

  /** Returns the Customer Asset resource name for the specified components. */
  public static String customerAsset(long customerId, long assetId, AssetFieldType fieldType) {
    return CustomerAssetName.format(
        String.valueOf(customerId), String.valueOf(assetId), fieldType.toString());
  }

  /** Returns the Customer Asset Set resource name for the specified components. */
  public static String customerAssetSet(long customerId, long assetSetId) {
    return CustomerAssetSetName.format(String.valueOf(customerId), String.valueOf(assetSetId));
  }

  /** Returns the customer client resource name for the specified components. */
  public static String customerClient(long customerId, long clientCustomerId) {
    return CustomerClientName.format(String.valueOf(customerId), String.valueOf(clientCustomerId));
  }

  /** Returns the customer client link resource name for the specified components. */
  public static String customerClientLink(
      long customerId, long clientCustomerId, long managerLinkId) {
    return CustomerClientLinkName.format(
        String.valueOf(customerId),
        String.valueOf(clientCustomerId),
        String.valueOf(managerLinkId));
  }

  /** Returns the customer extension setting for the specified components. */
  public static String customerExtensionSetting(long customerId, ExtensionType extensionType) {
    return CustomerExtensionSettingName.format(String.valueOf(customerId), extensionType.name());
  }

  /** Returns the customer feed resource name for the specified components. */
  public static String customerFeed(long customerId, long feedId) {
    return CustomerFeedName.format(String.valueOf(customerId), String.valueOf(feedId));
  }

  /** Returns the customer label for the specified components. */
  public static String customerLabel(long customerId, long labelId) {
    return CustomerLabelName.format(String.valueOf(customerId), String.valueOf(labelId));
  }

  /** Returns the customer manager link resource name for the specified components. */
  public static String customerManagerLink(
      long customerId, long managerCustomerId, long managerLinkId) {
    return CustomerManagerLinkName.format(
        String.valueOf(customerId),
        String.valueOf(managerCustomerId),
        String.valueOf(managerLinkId));
  }

  /** Returns the customer negative criterion for the specified components. */
  public static String customerNegativeCriterion(long customerId, long criterionId) {
    return CustomerNegativeCriterionName.format(
        String.valueOf(customerId), String.valueOf(criterionId));
  }

  /** Returns the Customer User Access resource name for the specified components. */
  public static String customerUserAccess(long customerId, long userId) {
    return CustomerUserAccessName.format(String.valueOf(customerId), String.valueOf(userId));
  }

  /** Returns the Detailed Demographic resource name for the specified components. */
  public static String detailedDemographic(long customerId, long detailedDemographicId) {
    return DetailedDemographicName.format(
        String.valueOf(customerId), String.valueOf(detailedDemographicId));
  }

  /** Returns the detail placement view for the specified components. */
  public static String detailPlacementView(
      long customerId, long adGroupId, String placementBase64) {
    return DetailPlacementViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), placementBase64);
  }

  /** Returns the display keyword view resource name for the specified components. */
  public static String displayKeywordView(long customerId, long adGroupId, long criterionId) {
    return DisplayKeywordViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the Distance View resource name for the specified components. */
  public static String distanceView(long customerId, long chainId, DistanceBucket distanceBucket) {
    return DistanceViewName.format(
        String.valueOf(customerId), String.valueOf(chainId), String.valueOf(distanceBucket));
  }

  /** Returns the domain category for the specified components. */
  public static String domainCategory(
      long customerId, long campaignId, String categoryBase64, String languageCode) {
    return DomainCategoryName.format(
        String.valueOf(customerId), String.valueOf(campaignId), categoryBase64, languageCode);
  }

  /** Returns the dynamic search ads search term view for the specified components. */
  public static String dynamicSearchAdsSearchTermView(
      long customerId,
      long adGroupId,
      String searchTermFingerprint,
      String headlineFingerprint,
      String landingPageFingerprint,
      String pageUrlFingerprint) {
    return DynamicSearchAdsSearchTermViewName.format(
        String.valueOf(customerId),
        String.valueOf(adGroupId),
        searchTermFingerprint,
        headlineFingerprint,
        landingPageFingerprint,
        pageUrlFingerprint);
  }

  /** Returns the Expanded Landing Page View resource name for the specified components. */
  public static String expandedLandingPageView(
      long customerId, String expandedFinalUrlFingerprint) {
    return ExpandedLandingPageViewName.format(
        String.valueOf(customerId), expandedFinalUrlFingerprint);
  }

  /** Returns the Experiment resource name for the specified components. */
  public static String experiment(long customerId, long trialId) {
    return ExperimentName.format(String.valueOf(customerId), String.valueOf(trialId));
  }

  /** Returns the Experiment Arm resource name for the specified components. */
  public static String experimentArm(long customerId, long trialId, long trialArmId) {
    return ExperimentArmName.format(
        String.valueOf(customerId), String.valueOf(trialId), String.valueOf(trialArmId));
  }

  /** Returns the extension feed item for the specified components. */
  public static String extensionFeedItem(long customerId, long feedItemId) {
    return ExtensionFeedItemName.format(String.valueOf(customerId), String.valueOf(feedItemId));
  }

  /** Returns the feed resource name for the specified components. */
  public static String feed(long customerId, long feedId) {
    return FeedName.format(String.valueOf(customerId), String.valueOf(feedId));
  }

  /** Returns the feed item resource name for the specified components. */
  public static String feedItem(long customerId, long feedId, long feedItemId) {
    return FeedItemName.format(
        String.valueOf(customerId), String.valueOf(feedId), String.valueOf(feedItemId));
  }

  /** Returns the feed item set resource name for the specified components. */
  public static String feedItemSet(long customerId, long feedId, long feedItemSetId) {
    return FeedItemSetName.format(
        String.valueOf(customerId), String.valueOf(feedId), String.valueOf(feedItemSetId));
  }

  /** Returns the feed item set link resource name for the specified components. */
  public static String feedItemSetLink(
      long customerId, long feedId, long feedItemSetId, long feedItemId) {
    return FeedItemSetLinkName.format(
        String.valueOf(customerId),
        String.valueOf(feedId),
        String.valueOf(feedItemSetId),
        String.valueOf(feedItemId));
  }

  /** Returns the feed item target for the specified components. */
  public static String feedItemTarget(
      long customerId,
      long feedId,
      long feedItemId,
      FeedItemTargetType targetType,
      long feedItemTargetId) {
    return FeedItemTargetName.format(
        String.valueOf(customerId),
        String.valueOf(feedId),
        String.valueOf(feedItemId),
        targetType.name(),
        String.valueOf(feedItemTargetId));
  }

  /** Returns the feed mapping resource name for the specified components. */
  public static String feedMapping(long customerId, long feedId, long feedMappingId) {
    return FeedMappingName.format(
        String.valueOf(customerId), String.valueOf(feedId), String.valueOf(feedMappingId));
  }

  /** Returns the feed placeholder view for the specified components. */
  public static String feedPlaceholderView(long customerId, PlaceholderType placeholderType) {
    return FeedPlaceholderViewName.format(String.valueOf(customerId), placeholderType.name());
  }

  /** Returns the gender view resource name for the specified components. */
  public static String genderView(long customerId, long adGroupId, long criterionId) {
    return GenderViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the geo target constant resource name for the specified components. */
  public static String geoTargetConstant(long criterionId) {
    return GeoTargetConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the geographic view for the specified components. */
  public static String geographicView(
      long customerId, long countryCriterionId, GeoTargetingType targetType) {
    return GeographicViewName.format(
        String.valueOf(customerId), String.valueOf(countryCriterionId), targetType.name());
  }

  /** Returns the google ads field resource name for the specified components. */
  public static String googleAdsField(String field) {
    return GoogleAdsFieldName.format(field);
  }

  /** Returns the group placement view for the specified components. */
  public static String groupPlacementView(long customerId, long adGroupId, String placementBase64) {
    return GroupPlacementViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), placementBase64);
  }

  /** Returns the hotel group view resource name for the specified components. */
  public static String hotelGroupView(long customerId, long adGroupId, long criterionId) {
    return HotelGroupViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the hotel performance view resource name for the specified components. */
  public static String hotelPerformanceView(long customerId) {
    return HotelPerformanceViewName.format(String.valueOf(customerId));
  }

  /** Returns the Income Range View resource name for the specified components. */
  public static String incomeRangeView(long customerId, long adGroupId, long criterionId) {
    return IncomeRangeViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the Invoice resource name for the specified components. */
  public static String invoice(long customerId, long invoiceId) {
    return InvoiceName.format(String.valueOf(customerId), String.valueOf(invoiceId));
  }

  /** Returns the keyword plan resource name for the specified components. */
  public static String keywordPlan(long customerId, long kpPlanId) {
    return KeywordPlanName.format(String.valueOf(customerId), String.valueOf(kpPlanId));
  }

  /** Returns the keyword plan ad group resource name for the specified components. */
  public static String keywordPlanAdGroup(long customerId, long kpAdGroupId) {
    return KeywordPlanAdGroupName.format(String.valueOf(customerId), String.valueOf(kpAdGroupId));
  }

  /** Returns the keyword plan campaign resource name for the specified components. */
  public static String keywordPlanCampaign(long customerId, long kpCampaignId) {
    return KeywordPlanCampaignName.format(String.valueOf(customerId), String.valueOf(kpCampaignId));
  }

  /** Returns the keyword plan keyword resource name for the specified components. */
  public static String keywordPlanAdGroupKeyword(long customerId, long kpAdGroupKeywordId) {
    return KeywordPlanAdGroupKeywordName.format(
        String.valueOf(customerId), String.valueOf(kpAdGroupKeywordId));
  }

  /** Returns the keyword plan negative keyword resource name for the specified components. */
  public static String keywordPlanCampaignKeyword(long customerId, long kpCampaignKeywordId) {
    return KeywordPlanCampaignKeywordName.format(
        String.valueOf(customerId), String.valueOf(kpCampaignKeywordId));
  }

  /** Returns the Keyword Theme Constant resource name for the specified components. */
  public static String keywordThemeConstant(long customerId, long expressSubCategoryId) {
    return KeywordThemeConstantName.format(
        String.valueOf(customerId), String.valueOf(expressSubCategoryId));
  }

  /** Returns the keyword view resource name for the specified components. */
  public static String keywordView(long customerId, long adGroupId, long criterionId) {
    return KeywordViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the label for the specified components. */
  public static String label(long customerId, long labelId) {
    return LabelName.format(String.valueOf(customerId), String.valueOf(labelId));
  }

  /** Returns the Landing Page View resource name for the specified components. */
  public static String landingPageView(long customerId, String unexpandedFinalUrlFingerprint) {
    return LandingPageViewName.format(String.valueOf(customerId), unexpandedFinalUrlFingerprint);
  }

  /** Returns the language constant resource name for the specified components. */
  public static String languageConstant(long criterionId) {
    return LanguageConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the lead form submission data resource name for the specified components. */
  public static String leadFormSubmissionData(long customerId, String leadFormUserSubmissionId) {
    return LeadFormSubmissionDataName.format(String.valueOf(customerId), leadFormUserSubmissionId);
  }

  /** Returns the Life Event resource name for the specified components. */
  public static String lifeEvent(long customerId, long lifeEventId) {
    return LifeEventName.format(String.valueOf(customerId), String.valueOf(lifeEventId));
  }

  /** Returns the location view for the specified components. */
  public static String locationView(long customerId, long campaignId, long criterionId) {
    return LocationViewName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(criterionId));
  }

  /** Returns the managed placement view resource name for the specified components. */
  public static String managedPlacementView(long customerId, long adGroupId, long criterionId) {
    return ManagedPlacementViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the media file resource name for the specified components. */
  public static String mediaFile(long customerId, long mediaId) {
    return MediaFileName.format(String.valueOf(customerId), String.valueOf(mediaId));
  }

  /** Returns the merchant center link for the specified components. */
  public static String merchantCenterLink(long customerId, long merchantCenterId) {
    return MerchantCenterLinkName.format(
        String.valueOf(customerId), String.valueOf(merchantCenterId));
  }

  /** Returns the mobile app category constant resource name for the specified components. */
  public static String mobileAppCategoryConstant(long mobileAppCategoryId) {
    return MobileAppCategoryConstantName.format(String.valueOf(mobileAppCategoryId));
  }

  /** Returns the mobile device constant resource name for the specified components. */
  public static String mobileDeviceConstant(long criterionId) {
    return MobileDeviceConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the batch job for the specified components. */
  public static String batchJob(long customerId, long mutateJobId) {
    return BatchJobName.format(String.valueOf(customerId), String.valueOf(mutateJobId));
  }

  /** Returns the Offline User Data Job resource name for the specified components. */
  public static String offlineUserDataJob(long customerId, long offlineUserDataJobId) {
    return OfflineUserDataJobName.format(
        String.valueOf(customerId), String.valueOf(offlineUserDataJobId));
  }

  /** Returns the operation system version constant resource name for the specified components. */
  public static String operatingSystemVersionConstant(long criterionId) {
    return OperatingSystemVersionConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the Paid Organic Search Term View resource name for the specified components. */
  public static String paidOrganicSearchTermView(
      long customerId, long campaignId, long adGroupId, String searchTermBase64) {
    return PaidOrganicSearchTermViewName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        String.valueOf(adGroupId),
        searchTermBase64);
  }

  /** Returns the parental status view resource name for the specified components. */
  public static String parentalStatusView(long customerId, long adGroupId, long criterionId) {
    return ParentalStatusViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the payments account resource name for the specified components. */
  public static String paymentsAccount(long customerId, String paymentsAccountId) {
    return PaymentsAccountName.format(String.valueOf(customerId), paymentsAccountId);
  }

  /** Returns the per store view resource name for the specified components. */
  public static String perStoreView(long customerId, String placeId) {
    return PerStoreViewName.format(String.valueOf(customerId), placeId);
  }

  /** Returns the product bidding category constant for the specified components. */
  public static String productBiddingCategoryConstant(
      String countryCode, ProductBiddingCategoryLevel level, long constantId) {
    return ProductBiddingCategoryConstantName.format(
        countryCode, level.name(), String.valueOf(constantId));
  }

  /** Returns the product group view resource name for the specified components. */
  public static String productGroupView(long customerId, long adgroupId, long criterionId) {
    return ProductGroupViewName.format(
        String.valueOf(customerId), String.valueOf(adgroupId), String.valueOf(criterionId));
  }

  /** Returns the product link resource name for the specified components. */
  public static String productLink(long customerId, long productLinkId) {
    return ProductLinkName.format(String.valueOf(customerId), String.valueOf(productLinkId));
  }

  /** Returns the qualifying question resource name for the specified components. */
  public static String qualifyingQuestion(long questionId) {
    return QualifyingQuestionName.format(String.valueOf(questionId));
  }

  /** Returns the recommendation resource name for the specified components. */
  public static String recommendation(long customerId, String recommendationId) {
    return RecommendationName.format(String.valueOf(customerId), recommendationId);
  }

  /** Returns the remarketing action resource name for the specified components. */
  public static String remarketingAction(long customerId, long remarketingActionId) {
    return RemarketingActionName.format(
        String.valueOf(customerId), String.valueOf(remarketingActionId));
  }

  /** Returns the search term view resource name for the specified components. */
  public static String searchTermView(
      long customerId, long campaignId, long adGroupId, String query) {
    return SearchTermViewName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        String.valueOf(adGroupId),
        String.valueOf(query));
  }

  /** Returns the shared criterion resource name for the specified components. */
  public static String sharedCriterion(long customerId, long sharedSetId, long criterionId) {
    return SharedCriterionName.format(
        String.valueOf(customerId), String.valueOf(sharedSetId), String.valueOf(criterionId));
  }

  /** Returns the shared set resource name for the specified components. */
  public static String sharedSet(long customerId, long sharedSetId) {
    return SharedSetName.format(String.valueOf(customerId), String.valueOf(sharedSetId));
  }

  /** Returns the Shopping Performance View resource name for the specified components. */
  public static String shoppingPerformanceView(long customerId) {
    return ShoppingPerformanceViewName.format(String.valueOf(customerId));
  }

  /** Returns the Smart Campaign Search Term View resource name for the specified components. */
  public static String smartCampaignSearchTermView(long customerId, long campaignId, String query) {
    return SmartCampaignSearchTermViewName.format(
        String.valueOf(customerId), String.valueOf(campaignId), query);
  }

  /** Returns the Smart Campaign Setting resource name for the specified components. */
  public static String smartCampaignSetting(long customerId, long campaignId) {
    return SmartCampaignSettingName.format(String.valueOf(customerId), String.valueOf(campaignId));
  }

  /** Returns the Third Party App Analytics Link resource name for the specified components. */
  public static String thirdPartyAppAnalyticsLink(long customerId, long customerLinkId) {
    return ThirdPartyAppAnalyticsLinkName.format(
        String.valueOf(customerId), String.valueOf(customerLinkId));
  }

  /** Returns the topic constant resource name for the specified components. */
  public static String topicConstant(long verticalId) {
    return TopicConstantName.format(String.valueOf(verticalId));
  }

  /** Returns the topic view resource name for the specified components. */
  public static String topicView(long customerId, long adGroupId, long criterionId) {
    return TopicViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the travel activity group view resource name for the specified components. */
  public static String travelActivityGroupView(long customerId, long adGroupId, long criterionId) {
    return TravelActivityGroupViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }

  /** Returns the travel activity performance view resource name for the specified components. */
  public static String travelActivityPerformanceView(long customerId) {
    return TravelActivityPerformanceViewName.format(String.valueOf(customerId));
  }

  /** Returns the user interest resource name for the specified components. */
  public static String userInterest(long customerId, long categoryId) {
    return UserInterestName.format(String.valueOf(customerId), String.valueOf(categoryId));
  }

  /** Returns the user list resource name for the specified components. */
  public static String userList(long customerId, long userListId) {
    return UserListName.format(String.valueOf(customerId), String.valueOf(userListId));
  }

  /** Returns the User Location View resource name for the specified components. */
  public static String userLocationView(
      long customerId, long countryCriterionId, boolean isTargetingLocation) {
    return UserLocationViewName.format(
        String.valueOf(customerId),
        String.valueOf(countryCriterionId),
        String.valueOf(isTargetingLocation));
  }

  /** Returns the video resource name for the specified components. */
  public static String video(long customerId, String videoId) {
    return VideoName.format(String.valueOf(customerId), videoId);
  }

  /** Returns the Webpage View resource name for the specified components. */
  public static String webpageView(long customerId, long adGroupId, long criterionId) {
    return WebpageViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
  }
}
