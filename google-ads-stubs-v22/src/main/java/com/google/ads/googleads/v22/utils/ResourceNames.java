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
package com.google.ads.googleads.v22.utils;

import com.google.ads.googleads.v22.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v22.enums.AndroidPrivacyInteractionTypeEnum.AndroidPrivacyInteractionType;
import com.google.ads.googleads.v22.enums.AndroidPrivacyNetworkTypeEnum.AndroidPrivacyNetworkType;
import com.google.ads.googleads.v22.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v22.enums.AssetSetTypeEnum.AssetSetType;
import com.google.ads.googleads.v22.enums.AssetSourceEnum.AssetSource;
import com.google.ads.googleads.v22.enums.ConversionActionCategoryEnum.ConversionActionCategory;
import com.google.ads.googleads.v22.enums.ConversionOriginEnum.ConversionOrigin;
import com.google.ads.googleads.v22.enums.DistanceBucketEnum.DistanceBucket;
import com.google.ads.googleads.v22.enums.GeoTargetingTypeEnum.GeoTargetingType;
import com.google.ads.googleads.v22.enums.OfflineEventUploadClientEnum.OfflineEventUploadClient;
import com.google.ads.googleads.v22.enums.ProductCategoryLevelEnum.ProductCategoryLevel;
import com.google.ads.googleads.v22.enums.ProductChannelEnum.ProductChannel;
import com.google.ads.googleads.v22.enums.RecommendationTypeEnum.RecommendationType;
import com.google.ads.googleads.v22.enums.SimulationModificationMethodEnum.SimulationModificationMethod;
import com.google.ads.googleads.v22.enums.SimulationTypeEnum.SimulationType;
import com.google.ads.googleads.v22.enums.UserListCustomerTypeCategoryEnum.UserListCustomerTypeCategory;
import com.google.ads.googleads.v22.resources.AccessibleBiddingStrategyName;
import com.google.ads.googleads.v22.resources.AccountBudgetName;
import com.google.ads.googleads.v22.resources.AccountBudgetProposalName;
import com.google.ads.googleads.v22.resources.AccountLinkName;
import com.google.ads.googleads.v22.resources.AdGroupAdAssetCombinationViewName;
import com.google.ads.googleads.v22.resources.AdGroupAdAssetViewName;
import com.google.ads.googleads.v22.resources.AdGroupAdLabelName;
import com.google.ads.googleads.v22.resources.AdGroupAdName;
import com.google.ads.googleads.v22.resources.AdGroupAssetName;
import com.google.ads.googleads.v22.resources.AdGroupAssetSetName;
import com.google.ads.googleads.v22.resources.AdGroupAudienceViewName;
import com.google.ads.googleads.v22.resources.AdGroupBidModifierName;
import com.google.ads.googleads.v22.resources.AdGroupCriterionCustomizerName;
import com.google.ads.googleads.v22.resources.AdGroupCriterionLabelName;
import com.google.ads.googleads.v22.resources.AdGroupCriterionName;
import com.google.ads.googleads.v22.resources.AdGroupCriterionSimulationName;
import com.google.ads.googleads.v22.resources.AdGroupCustomizerName;
import com.google.ads.googleads.v22.resources.AdGroupLabelName;
import com.google.ads.googleads.v22.resources.AdGroupName;
import com.google.ads.googleads.v22.resources.AdGroupSimulationName;
import com.google.ads.googleads.v22.resources.AdName;
import com.google.ads.googleads.v22.resources.AdParameterName;
import com.google.ads.googleads.v22.resources.AdScheduleViewName;
import com.google.ads.googleads.v22.resources.AgeRangeViewName;
import com.google.ads.googleads.v22.resources.AiMaxSearchTermAdCombinationViewName;
import com.google.ads.googleads.v22.resources.AndroidPrivacySharedKeyGoogleAdGroupName;
import com.google.ads.googleads.v22.resources.AndroidPrivacySharedKeyGoogleCampaignName;
import com.google.ads.googleads.v22.resources.AndroidPrivacySharedKeyGoogleNetworkTypeName;
import com.google.ads.googleads.v22.resources.AssetFieldTypeViewName;
import com.google.ads.googleads.v22.resources.AssetGroupAssetName;
import com.google.ads.googleads.v22.resources.AssetGroupListingGroupFilterName;
import com.google.ads.googleads.v22.resources.AssetGroupName;
import com.google.ads.googleads.v22.resources.AssetGroupProductGroupViewName;
import com.google.ads.googleads.v22.resources.AssetGroupSignalName;
import com.google.ads.googleads.v22.resources.AssetGroupTopCombinationViewName;
import com.google.ads.googleads.v22.resources.AssetName;
import com.google.ads.googleads.v22.resources.AssetSetAssetName;
import com.google.ads.googleads.v22.resources.AssetSetName;
import com.google.ads.googleads.v22.resources.AssetSetTypeViewName;
import com.google.ads.googleads.v22.resources.AudienceName;
import com.google.ads.googleads.v22.resources.BatchJobName;
import com.google.ads.googleads.v22.resources.BiddingDataExclusionName;
import com.google.ads.googleads.v22.resources.BiddingSeasonalityAdjustmentName;
import com.google.ads.googleads.v22.resources.BiddingStrategyName;
import com.google.ads.googleads.v22.resources.BiddingStrategySimulationName;
import com.google.ads.googleads.v22.resources.BillingSetupName;
import com.google.ads.googleads.v22.resources.CallViewName;
import com.google.ads.googleads.v22.resources.CampaignAggregateAssetViewName;
import com.google.ads.googleads.v22.resources.CampaignAssetName;
import com.google.ads.googleads.v22.resources.CampaignAssetSetName;
import com.google.ads.googleads.v22.resources.CampaignAudienceViewName;
import com.google.ads.googleads.v22.resources.CampaignBidModifierName;
import com.google.ads.googleads.v22.resources.CampaignBudgetName;
import com.google.ads.googleads.v22.resources.CampaignConversionGoalName;
import com.google.ads.googleads.v22.resources.CampaignCriterionName;
import com.google.ads.googleads.v22.resources.CampaignCustomizerName;
import com.google.ads.googleads.v22.resources.CampaignDraftName;
import com.google.ads.googleads.v22.resources.CampaignGoalConfigName;
import com.google.ads.googleads.v22.resources.CampaignGroupName;
import com.google.ads.googleads.v22.resources.CampaignLabelName;
import com.google.ads.googleads.v22.resources.CampaignLifecycleGoalName;
import com.google.ads.googleads.v22.resources.CampaignName;
import com.google.ads.googleads.v22.resources.CampaignSearchTermInsightName;
import com.google.ads.googleads.v22.resources.CampaignSharedSetName;
import com.google.ads.googleads.v22.resources.CampaignSimulationName;
import com.google.ads.googleads.v22.resources.CarrierConstantName;
import com.google.ads.googleads.v22.resources.ChangeEventName;
import com.google.ads.googleads.v22.resources.ChangeStatusName;
import com.google.ads.googleads.v22.resources.ChannelAggregateAssetViewName;
import com.google.ads.googleads.v22.resources.ClickViewName;
import com.google.ads.googleads.v22.resources.CombinedAudienceName;
import com.google.ads.googleads.v22.resources.ContentCriterionViewName;
import com.google.ads.googleads.v22.resources.ConversionActionName;
import com.google.ads.googleads.v22.resources.ConversionCustomVariableName;
import com.google.ads.googleads.v22.resources.ConversionGoalCampaignConfigName;
import com.google.ads.googleads.v22.resources.ConversionValueRuleName;
import com.google.ads.googleads.v22.resources.ConversionValueRuleSetName;
import com.google.ads.googleads.v22.resources.CurrencyConstantName;
import com.google.ads.googleads.v22.resources.CustomAudienceName;
import com.google.ads.googleads.v22.resources.CustomConversionGoalName;
import com.google.ads.googleads.v22.resources.CustomInterestName;
import com.google.ads.googleads.v22.resources.CustomerAssetName;
import com.google.ads.googleads.v22.resources.CustomerAssetSetName;
import com.google.ads.googleads.v22.resources.CustomerClientLinkName;
import com.google.ads.googleads.v22.resources.CustomerClientName;
import com.google.ads.googleads.v22.resources.CustomerConversionGoalName;
import com.google.ads.googleads.v22.resources.CustomerCustomizerName;
import com.google.ads.googleads.v22.resources.CustomerLabelName;
import com.google.ads.googleads.v22.resources.CustomerLifecycleGoalName;
import com.google.ads.googleads.v22.resources.CustomerManagerLinkName;
import com.google.ads.googleads.v22.resources.CustomerName;
import com.google.ads.googleads.v22.resources.CustomerNegativeCriterionName;
import com.google.ads.googleads.v22.resources.CustomerSearchTermInsightName;
import com.google.ads.googleads.v22.resources.CustomerSkAdNetworkConversionValueSchemaName;
import com.google.ads.googleads.v22.resources.CustomerUserAccessInvitationName;
import com.google.ads.googleads.v22.resources.CustomerUserAccessName;
import com.google.ads.googleads.v22.resources.CustomizerAttributeName;
import com.google.ads.googleads.v22.resources.DataLinkName;
import com.google.ads.googleads.v22.resources.DetailContentSuitabilityPlacementViewName;
import com.google.ads.googleads.v22.resources.DetailPlacementViewName;
import com.google.ads.googleads.v22.resources.DetailedDemographicName;
import com.google.ads.googleads.v22.resources.DisplayKeywordViewName;
import com.google.ads.googleads.v22.resources.DistanceViewName;
import com.google.ads.googleads.v22.resources.DomainCategoryName;
import com.google.ads.googleads.v22.resources.DynamicSearchAdsSearchTermViewName;
import com.google.ads.googleads.v22.resources.ExpandedLandingPageViewName;
import com.google.ads.googleads.v22.resources.ExperimentArmName;
import com.google.ads.googleads.v22.resources.ExperimentName;
import com.google.ads.googleads.v22.resources.FinalUrlExpansionAssetViewName;
import com.google.ads.googleads.v22.resources.GenderViewName;
import com.google.ads.googleads.v22.resources.GeoTargetConstantName;
import com.google.ads.googleads.v22.resources.GeographicViewName;
import com.google.ads.googleads.v22.resources.GoalName;
import com.google.ads.googleads.v22.resources.GoogleAdsFieldName;
import com.google.ads.googleads.v22.resources.GroupContentSuitabilityPlacementViewName;
import com.google.ads.googleads.v22.resources.GroupPlacementViewName;
import com.google.ads.googleads.v22.resources.HotelGroupViewName;
import com.google.ads.googleads.v22.resources.HotelPerformanceViewName;
import com.google.ads.googleads.v22.resources.HotelReconciliationName;
import com.google.ads.googleads.v22.resources.IncomeRangeViewName;
import com.google.ads.googleads.v22.resources.InvoiceName;
import com.google.ads.googleads.v22.resources.KeywordPlanAdGroupKeywordName;
import com.google.ads.googleads.v22.resources.KeywordPlanAdGroupName;
import com.google.ads.googleads.v22.resources.KeywordPlanCampaignKeywordName;
import com.google.ads.googleads.v22.resources.KeywordPlanCampaignName;
import com.google.ads.googleads.v22.resources.KeywordPlanName;
import com.google.ads.googleads.v22.resources.KeywordThemeConstantName;
import com.google.ads.googleads.v22.resources.KeywordViewName;
import com.google.ads.googleads.v22.resources.LabelName;
import com.google.ads.googleads.v22.resources.LandingPageViewName;
import com.google.ads.googleads.v22.resources.LanguageConstantName;
import com.google.ads.googleads.v22.resources.LeadFormSubmissionDataName;
import com.google.ads.googleads.v22.resources.LifeEventName;
import com.google.ads.googleads.v22.resources.LocalServicesEmployeeName;
import com.google.ads.googleads.v22.resources.LocalServicesLeadConversationName;
import com.google.ads.googleads.v22.resources.LocalServicesLeadName;
import com.google.ads.googleads.v22.resources.LocalServicesVerificationArtifactName;
import com.google.ads.googleads.v22.resources.LocationInterestViewName;
import com.google.ads.googleads.v22.resources.LocationViewName;
import com.google.ads.googleads.v22.resources.ManagedPlacementViewName;
import com.google.ads.googleads.v22.resources.MediaFileName;
import com.google.ads.googleads.v22.resources.MobileAppCategoryConstantName;
import com.google.ads.googleads.v22.resources.MobileDeviceConstantName;
import com.google.ads.googleads.v22.resources.OfflineConversionUploadClientSummaryName;
import com.google.ads.googleads.v22.resources.OfflineConversionUploadConversionActionSummaryName;
import com.google.ads.googleads.v22.resources.OfflineUserDataJobName;
import com.google.ads.googleads.v22.resources.OperatingSystemVersionConstantName;
import com.google.ads.googleads.v22.resources.PaidOrganicSearchTermViewName;
import com.google.ads.googleads.v22.resources.ParentalStatusViewName;
import com.google.ads.googleads.v22.resources.PaymentsAccountName;
import com.google.ads.googleads.v22.resources.PerStoreViewName;
import com.google.ads.googleads.v22.resources.PerformanceMaxPlacementViewName;
import com.google.ads.googleads.v22.resources.ProductCategoryConstantName;
import com.google.ads.googleads.v22.resources.ProductGroupViewName;
import com.google.ads.googleads.v22.resources.ProductLinkInvitationName;
import com.google.ads.googleads.v22.resources.ProductLinkName;
import com.google.ads.googleads.v22.resources.QualifyingQuestionName;
import com.google.ads.googleads.v22.resources.RecommendationName;
import com.google.ads.googleads.v22.resources.RecommendationSubscriptionName;
import com.google.ads.googleads.v22.resources.RemarketingActionName;
import com.google.ads.googleads.v22.resources.SearchTermViewName;
import com.google.ads.googleads.v22.resources.SharedCriterionName;
import com.google.ads.googleads.v22.resources.SharedSetName;
import com.google.ads.googleads.v22.resources.ShoppingPerformanceViewName;
import com.google.ads.googleads.v22.resources.ShoppingProductName;
import com.google.ads.googleads.v22.resources.SmartCampaignSearchTermViewName;
import com.google.ads.googleads.v22.resources.SmartCampaignSettingName;
import com.google.ads.googleads.v22.resources.TargetingExpansionViewName;
import com.google.ads.googleads.v22.resources.ThirdPartyAppAnalyticsLinkName;
import com.google.ads.googleads.v22.resources.TopicConstantName;
import com.google.ads.googleads.v22.resources.TopicViewName;
import com.google.ads.googleads.v22.resources.TravelActivityGroupViewName;
import com.google.ads.googleads.v22.resources.TravelActivityPerformanceViewName;
import com.google.ads.googleads.v22.resources.UserInterestName;
import com.google.ads.googleads.v22.resources.UserListCustomerTypeName;
import com.google.ads.googleads.v22.resources.UserListName;
import com.google.ads.googleads.v22.resources.UserLocationViewName;
import com.google.ads.googleads.v22.resources.VideoName;
import com.google.ads.googleads.v22.resources.WebpageViewName;

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

  /**
   * Returns the AI Max search term ad combination view resource name for the specified components.
   */
  public static String aiMaxSearchTermAdCombinationView(
      long customerId, long adGroupId, String searchTerm, String landingPage, String headline) {
    return AiMaxSearchTermAdCombinationViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), searchTerm, landingPage, headline);
  }

  /**
   * Returns the Android privacy shared key google ad group resource name for the specified
   * components.
   *
   * @param androidPrivacyInteractionDate the interaction date in YYYY-mm-dd format.
   */
  public static String androidPrivacySharedKeyGoogleAdGroup(
      long customerId,
      long campaignId,
      long adGroupId,
      AndroidPrivacyInteractionType androidPrivacyInteractionType,
      AndroidPrivacyNetworkType androidPrivacyNetworkType,
      String androidPrivacyInteractionDate) {
    return AndroidPrivacySharedKeyGoogleAdGroupName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        String.valueOf(adGroupId),
        androidPrivacyInteractionType.name(),
        androidPrivacyNetworkType.name(),
        androidPrivacyInteractionDate);
  }

  /**
   * Returns the Android privacy shared key google campaign resource name for the specified
   * components.
   *
   * @param androidPrivacyInteractionDate the interaction date in YYYY-mm-dd format.
   */
  public static String androidPrivacySharedKeyGoogleCampaign(
      long customerId,
      long campaignId,
      AndroidPrivacyInteractionType androidPrivacyInteractionType,
      String androidPrivacyInteractionDate) {
    return AndroidPrivacySharedKeyGoogleCampaignName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        androidPrivacyInteractionType.name(),
        androidPrivacyInteractionDate);
  }

  /**
   * Returns the Android privacy shared key google network type resource name for the specified
   * components.
   *
   * @param androidPrivacyInteractionDate the interaction date in YYYY-mm-dd format.
   */
  public static String androidPrivacySharedKeyGoogleNetworkType(
      long customerId,
      long campaignId,
      AndroidPrivacyInteractionType androidPrivacyInteractionType,
      AndroidPrivacyNetworkType androidPrivacyNetworkType,
      String androidPrivacyInteractionDate) {
    return AndroidPrivacySharedKeyGoogleNetworkTypeName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        androidPrivacyInteractionType.name(),
        androidPrivacyNetworkType.name(),
        androidPrivacyInteractionDate);
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

  /** Returns the asset group top combination view resource name for the specified components. */
  public static String assetGroupTopCombinationView(
      long customerId, long assetGroupId, String assetGroupCombinationCategory) {
    return AssetGroupTopCombinationViewName.format(
        String.valueOf(customerId), String.valueOf(assetGroupId), assetGroupCombinationCategory);
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

  /** Returns the Campaign Aggregate Asset View resource name for the specified components. */
  public static String campaignAggregateAssetView(
      long customerId,
      long campaignId,
      long assetId,
      AssetSource assetSource,
      AssetFieldType assetFieldType) {
    return CampaignAggregateAssetViewName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        String.valueOf(assetId),
        assetSource.toString(),
        assetFieldType.toString());
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

  /** Returns the campaign goal config resource name for the specified components. */
  public static String campaignGoalConfig(long customerId, long campaignId,
      long unifiedGoalId) {
    return CampaignGoalConfigName.format(String.valueOf(customerId), String.valueOf(campaignId),
        String.valueOf(unifiedGoalId));
  }

  /** Returns the campaign group resource name for the specified components. */
  public static String campaignGroup(long customerId, long campaignGroupId) {
    return CampaignGroupName.format(String.valueOf(customerId), String.valueOf(campaignGroupId));
  }

  /** Returns the campaign label resource name for the specified components. */
  public static String campaignLabel(long customerId, long campaignId, long labelId) {
    return CampaignLabelName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(labelId));
  }

  /** Returns the campaign lifecycle goal resource name for the specified components. */
  public static String campaignLifecycleGoal(long customerId, long campaignId) {
    return CampaignLifecycleGoalName.format(String.valueOf(customerId), String.valueOf(campaignId));
  }

  /** Returns the campaign search term insight resource name for the specified components. */
  public static String campaignSearchTermInsightName(
      long customerId, long campaignId, long clusterId) {
    return CampaignSearchTermInsightName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(clusterId));
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

  /** Returns the Channel Aggregate Asset View resource name for the specified components. */
  public static String channelAggregateAssetView(
      long customerId,
      AdvertisingChannelType advertisingChannelType,
      long assetId,
      AssetSource assetSource,
      AssetFieldType assetFieldType) {
    return ChannelAggregateAssetViewName.format(
        String.valueOf(customerId),
        advertisingChannelType.toString(),
        String.valueOf(assetId),
        assetSource.toString(),
        assetFieldType.toString());
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

  /** Returns the content criterion view resource name for the specified components. */
  public static String contentCriterionView(long customerId, long adGroupId, long criterionId) {
    return ContentCriterionViewName.format(
        String.valueOf(customerId), String.valueOf(adGroupId), String.valueOf(criterionId));
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

  /** Returns the customer search term insight resource name for the specified components. */
  public static String customerSearchTermInsightName(long customerId, long clusterId) {
    return CustomerSearchTermInsightName.format(
        String.valueOf(customerId), String.valueOf(clusterId));
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

  /** Returns the customer label for the specified components. */
  public static String customerLabel(long customerId, long labelId) {
    return CustomerLabelName.format(String.valueOf(customerId), String.valueOf(labelId));
  }

  /** Returns the customer lifecycle goal resource name for the specified components. */
  public static String customerLifecycleGoal(long customerId) {
    return CustomerLifecycleGoalName.format(String.valueOf(customerId));
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

  /** Returns the data link resource name for the specified components. */
  public static String dataLink(long customerId, long productLinkId, long dataLinkId) {
    return DataLinkName.format(
        String.valueOf(customerId), String.valueOf(productLinkId), String.valueOf(dataLinkId));
  }

  /** Returns the detail content suitability placement view for the specified components. */
  public static String detailContentSuitabilityPlacementView(
      long customerId, String placementFingerprint) {
    return DetailContentSuitabilityPlacementViewName.format(
        String.valueOf(customerId), placementFingerprint);
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

  /** Returns the final URL expansion asset view for the specified components. */
  public static String finalUrlExpansionAssetView(
      long customerId, long campaignId, long assetId, AssetFieldType fieldType, String urlFp) {
    return FinalUrlExpansionAssetViewName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        String.valueOf(assetId),
        String.valueOf(fieldType),
        urlFp);
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

  /** Returns the goal resource name for the specified components. */
  public static String goal(long customerId, long unifiedGoalId) {
    return GoalName.format(String.valueOf(customerId), String.valueOf(unifiedGoalId));
  }

  /** Returns the google ads field resource name for the specified components. */
  public static String googleAdsField(String field) {
    return GoogleAdsFieldName.format(field);
  }

  /** Returns the group content suitability placement view for the specified components. */
  public static String groupContentSuitabilityPlacementView(
      long customerId, String placementFingerprint) {
    return GroupContentSuitabilityPlacementViewName.format(
        String.valueOf(customerId), placementFingerprint);
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

  /** Returns the location interest view for the specified components. */
  public static String locationInterestView(
      long customerId, long campaignId, long adGroupId, long criterionId) {
    return LocationInterestViewName.format(
        String.valueOf(customerId),
        String.valueOf(campaignId),
        String.valueOf(adGroupId),
        String.valueOf(criterionId));
  }

  /** Returns the location view for the specified components. */
  public static String locationView(long customerId, long campaignId, long criterionId) {
    return LocationViewName.format(
        String.valueOf(customerId), String.valueOf(campaignId), String.valueOf(criterionId));
  }

  /** Returns the local services employee resource name for the specified components. */
  public static String localServicesEmployee(long customerId, long localServicesEmployeeId) {
    return LocalServicesEmployeeName.format(
        String.valueOf(customerId), String.valueOf(localServicesEmployeeId));
  }

  /** Returns the local services lead conversation resource name for the specified components. */
  public static String localServicesLeadConversation(
      long customerId, long localServicesLeadConversationId) {
    return LocalServicesLeadConversationName.format(
        String.valueOf(customerId), String.valueOf(localServicesLeadConversationId));
  }

  /** Returns the local services lead resource name for the specified components. */
  public static String localServicesLead(long customerId, long localServicesLeadId) {
    return LocalServicesLeadName.format(
        String.valueOf(customerId), String.valueOf(localServicesLeadId));
  }

  /**
   * Returns the local services verification artifact resource name for the specified components.
   */
  public static String localServicesVerificationArtifact(
      long customerId, long localServicesVerificationArtifactId) {
    return LocalServicesVerificationArtifactName.format(
        String.valueOf(customerId), String.valueOf(localServicesVerificationArtifactId));
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

  /** Returns the mobile app category constant resource name for the specified components. */
  public static String mobileAppCategoryConstant(long mobileAppCategoryId) {
    return MobileAppCategoryConstantName.format(String.valueOf(mobileAppCategoryId));
  }

  /** Returns the mobile device constant resource name for the specified components. */
  public static String mobileDeviceConstant(long criterionId) {
    return MobileDeviceConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the batch job resource name for the specified components. */
  public static String batchJob(long customerId, long mutateJobId) {
    return BatchJobName.format(String.valueOf(customerId), String.valueOf(mutateJobId));
  }

  /** Returns the offline conversion client summary resource name for the specified components. */
  public static String offlineConversionClientSummary(
      long customerId, OfflineEventUploadClient client) {
    return OfflineConversionUploadClientSummaryName.format(
        String.valueOf(customerId), client.name());
  }

  /**
   * Returns the offline conversion upload conversion action summary resource name for the specified
   * components.
   */
  public static String offlineConversionUploadConversionActionSummary(
      long customerId, long conversionActionId, OfflineEventUploadClient client) {
    return OfflineConversionUploadConversionActionSummaryName.format(
        String.valueOf(customerId), String.valueOf(conversionActionId), client.name());
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

  /** Returns the performance max placement view resource name for the specified components. */
  public static String performanceMaxPlacementView(long customerId, String base64Placement) {
    return PerformanceMaxPlacementViewName.format(String.valueOf(customerId), base64Placement);
  }

  /** Returns the per store view resource name for the specified components. */
  public static String perStoreView(long customerId, String placeId) {
    return PerStoreViewName.format(String.valueOf(customerId), placeId);
  }

  /** Returns the product category constant for the specified components. */
  public static String productCategoryConstant(ProductCategoryLevel level, long constantId) {
    return ProductCategoryConstantName.format(level.name(), String.valueOf(constantId));
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

  /** Returns the product link invitation resource name for the specified components. */
  public static String productLinkInvitation(long customerId, long productLinkInvitationId) {
    return ProductLinkInvitationName.format(
        String.valueOf(customerId), String.valueOf(productLinkInvitationId));
  }

  /** Returns the qualifying question resource name for the specified components. */
  public static String qualifyingQuestion(long questionId) {
    return QualifyingQuestionName.format(String.valueOf(questionId));
  }

  /** Returns the recommendation resource name for the specified components. */
  public static String recommendation(long customerId, String recommendationId) {
    return RecommendationName.format(String.valueOf(customerId), recommendationId);
  }

  /** Returns the recommendation subscription resource name for the specified components. */
  public static String recommendationSubscription(
      long customerId, RecommendationType recommendationType) {
    return RecommendationSubscriptionName.format(
        String.valueOf(customerId), recommendationType.name());
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

  /** Returns the Shopping Product resource name for the specified components. */
  public static String shoppingProduct(
      long customerId,
      long merchantCenterId,
      ProductChannel productChannel,
      String languageCode,
      String feedLabel,
      String itemId) {
    return ShoppingProductName.format(
        String.valueOf(customerId),
        String.valueOf(merchantCenterId),
        productChannel.toString(),
        languageCode,
        feedLabel,
        itemId);
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

  /** Returns the targeting expansion view resource name for the specified components. */
  public static String targetingExpansionView(long customerId, long campaignId,
      String targetingExpansionType) {
    return TargetingExpansionViewName.format(String.valueOf(customerId), String.valueOf(campaignId),
        targetingExpansionType);
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

  /** Returns the user list customer type resource name for the specified components. */
  public static String userListCustomerType(
      long customerId, long userListId, UserListCustomerTypeCategory userListCustomerTypeCategory) {
    return UserListCustomerTypeName.format(
        String.valueOf(customerId),
        String.valueOf(userListId),
        userListCustomerTypeCategory.toString());
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
