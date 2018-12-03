// Copyright 2018 Google LLC
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
package com.google.ads.googleads.lib.utils;

import com.google.ads.googleads.v0.resources.AccountBudgetName;
import com.google.ads.googleads.v0.resources.AccountBudgetProposalName;
import com.google.ads.googleads.v0.resources.AdGroupAdName;
import com.google.ads.googleads.v0.resources.AdGroupAudienceViewName;
import com.google.ads.googleads.v0.resources.AdGroupBidModifierName;
import com.google.ads.googleads.v0.resources.AdGroupCriteriaName;
import com.google.ads.googleads.v0.resources.AdGroupFeedName;
import com.google.ads.googleads.v0.resources.AdGroupName;
import com.google.ads.googleads.v0.resources.AgeRangeViewName;
import com.google.ads.googleads.v0.resources.BiddingStrategyName;
import com.google.ads.googleads.v0.resources.BillingSetupName;
import com.google.ads.googleads.v0.resources.CampaignAudienceViewName;
import com.google.ads.googleads.v0.resources.CampaignBidModifierName;
import com.google.ads.googleads.v0.resources.CampaignBudgetName;
import com.google.ads.googleads.v0.resources.CampaignCriteriaName;
import com.google.ads.googleads.v0.resources.CampaignFeedName;
import com.google.ads.googleads.v0.resources.CampaignGroupName;
import com.google.ads.googleads.v0.resources.CampaignName;
import com.google.ads.googleads.v0.resources.CampaignSharedSetName;
import com.google.ads.googleads.v0.resources.CarrierConstantName;
import com.google.ads.googleads.v0.resources.ChangeStatusName;
import com.google.ads.googleads.v0.resources.ConversionActionName;
import com.google.ads.googleads.v0.resources.CustomerClientLinkName;
import com.google.ads.googleads.v0.resources.CustomerClientName;
import com.google.ads.googleads.v0.resources.CustomerFeedName;
import com.google.ads.googleads.v0.resources.CustomerManagerLinkName;
import com.google.ads.googleads.v0.resources.CustomerName;
import com.google.ads.googleads.v0.resources.DisplayKeywordViewName;
import com.google.ads.googleads.v0.resources.FeedItemName;
import com.google.ads.googleads.v0.resources.FeedMappingName;
import com.google.ads.googleads.v0.resources.FeedName;
import com.google.ads.googleads.v0.resources.GenderViewName;
import com.google.ads.googleads.v0.resources.GeoTargetConstantName;
import com.google.ads.googleads.v0.resources.GoogleAdsFieldName;
import com.google.ads.googleads.v0.resources.HotelGroupViewName;
import com.google.ads.googleads.v0.resources.HotelPerformanceViewName;
import com.google.ads.googleads.v0.resources.KeywordPlanAdGroupName;
import com.google.ads.googleads.v0.resources.KeywordPlanCampaignName;
import com.google.ads.googleads.v0.resources.KeywordPlanKeywordName;
import com.google.ads.googleads.v0.resources.KeywordPlanName;
import com.google.ads.googleads.v0.resources.KeywordPlanNegativeKeywordName;
import com.google.ads.googleads.v0.resources.KeywordViewName;
import com.google.ads.googleads.v0.resources.LanguageConstantName;
import com.google.ads.googleads.v0.resources.ManagedPlacementViewName;
import com.google.ads.googleads.v0.resources.MediaFileName;
import com.google.ads.googleads.v0.resources.ParentalStatusViewName;
import com.google.ads.googleads.v0.resources.ProductGroupViewName;
import com.google.ads.googleads.v0.resources.RecommendationName;
import com.google.ads.googleads.v0.resources.SearchTermViewName;
import com.google.ads.googleads.v0.resources.SharedCriteriaName;
import com.google.ads.googleads.v0.resources.SharedSetName;
import com.google.ads.googleads.v0.resources.TopicConstantName;
import com.google.ads.googleads.v0.resources.TopicViewName;
import com.google.ads.googleads.v0.resources.UserInterestName;
import com.google.ads.googleads.v0.resources.UserListName;
import com.google.ads.googleads.v0.resources.VideoName;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
 *       ID. In contrast, {@link AdGroupCriteriaName#format(String, String)} expects a customer ID
 *       and an underscore-delimited combination of ad group ID and criterion ID.
 * </ul>
 */
public class ResourceNames {
  /** Returns the account budget resource name for the specified components. */
  public static String accountBudget(long customerId, long accountBudgetId) {
    return AccountBudgetName.format(String.valueOf(customerId), String.valueOf(accountBudgetId));
  }

  /** Returns the account budget proposal resource name for the specified components. */
  public static String accountBudgetProposal(long customerId, long accountBudgetProposalId) {
    return AccountBudgetProposalName.format(
        String.valueOf(customerId), String.valueOf(accountBudgetProposalId));
  }

  /** Returns the ad group resource name for the specified components. */
  public static String adGroup(long customerId, long adGroupId) {
    return AdGroupName.format(String.valueOf(customerId), String.valueOf(adGroupId));
  }

  /** Returns the ad group ad resource name for the specified components. */
  public static String adGroupAd(long customerId, long adGroupId, long adId) {
    return AdGroupAdName.format(String.valueOf(customerId), concatIdentifiers(adGroupId, adId));
  }

  /** Returns the ad group audience view resource name for the specified components. */
  public static String adGroupAudienceView(long customerId, long adGroupId, long criterionId) {
    return AdGroupAudienceViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the ad group bid modifier resource name for the specified components. */
  public static String adGroupBidModifier(long customerId, long adGroupId, long criterionId) {
    return AdGroupBidModifierName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the ad group criterion resource name for the specified components. */
  public static String adGroupCriterion(long customerId, long adGroupId, long criterionId) {
    return AdGroupCriteriaName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the ad group feed resource name for the specified components. */
  public static String adGroupFeed(long customerId, long adGroupId, long feedId) {
    return AdGroupFeedName.format(String.valueOf(customerId), concatIdentifiers(adGroupId, feedId));
  }

  /** Returns the age range view resource name for the specified components. */
  public static String ageRangeView(long customerId, long adGroupId, long criterionId) {
    return AgeRangeViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the bidding strategy resource name for the specified components. */
  public static String biddingStrategy(long customerId, long biddingStrategyId) {
    return BiddingStrategyName.format(
        String.valueOf(customerId), String.valueOf(biddingStrategyId));
  }

  /** Returns the billing setup resource name for the specified components. */
  public static String billingSetup(long customerId, long billingSetupId) {
    return BillingSetupName.format(String.valueOf(customerId), String.valueOf(billingSetupId));
  }

  /** Returns the campaign resource name for the specified components. */
  public static String campaign(long customerId, long campaignId) {
    return CampaignName.format(String.valueOf(customerId), String.valueOf(campaignId));
  }

  /** Returns the campaign audience view resource name for the specified components. */
  public static String campaignAudienceView(long customerId, long campaignId, long criterionId) {
    return CampaignAudienceViewName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, criterionId));
  }

  /** Returns the campaign bid modifier resource name for the specified components. */
  public static String campaignBidModifier(long customerId, long campaignId, long criterionId) {
    return CampaignBidModifierName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, criterionId));
  }

  /** Returns the campaign budget resource name for the specified components. */
  public static String campaignBudget(long customerId, long budgetId) {
    return CampaignBudgetName.format(String.valueOf(customerId), String.valueOf(budgetId));
  }

  /** Returns the campaign criterion resource name for the specified components. */
  public static String campaignCriterion(long customerId, long campaignId, long criterionId) {
    return CampaignCriteriaName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, criterionId));
  }

  /** Returns the campaign feed resource name for the specified components. */
  public static String campaignFeed(long customerId, long campaignId, long feedId) {
    return CampaignFeedName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, feedId));
  }

  /** Returns the campaign group resource name for the specified components. */
  public static String campaignGroup(long customerId, long campaignGroupId) {
    return CampaignGroupName.format(String.valueOf(customerId), String.valueOf(campaignGroupId));
  }

  /** Returns the campaign shared set resource name for the specified components. */
  public static String campaignSharedSet(long customerId, long campaignId, long sharedSetId) {
    return CampaignSharedSetName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, sharedSetId));
  }

  /** Returns the carrier constant resource name for the specified components. */
  public static String carrierConstant(long criterionId) {
    return CarrierConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the change status resource name for the specified components. */
  public static String changeStatus(long customerId, String changeStatusId) {
    return ChangeStatusName.format(String.valueOf(customerId), changeStatusId);
  }

  /** Returns the conversion action resource name for the specified components. */
  public static String conversionAction(long customerId, long conversionActionId) {
    return ConversionActionName.format(
        String.valueOf(customerId), String.valueOf(conversionActionId));
  }

  /** Returns the customer resource name for the specified components. */
  public static String customer(long customerId) {
    return CustomerName.format(String.valueOf(customerId));
  }

  /** Returns the customer client resource name for the specified components. */
  public static String customerClient(long customerId, long clientCustomerId) {
    return CustomerClientName.format(String.valueOf(customerId), String.valueOf(clientCustomerId));
  }

  /** Returns the customer client link resource name for the specified components. */
  public static String customerClientLink(
      long customerId, long clientCustomerId, long managerLinkId) {
    return CustomerClientLinkName.format(
        String.valueOf(customerId), concatIdentifiers(clientCustomerId, managerLinkId));
  }

  /** Returns the customer feed resource name for the specified components. */
  public static String customerFeed(long customerId, long feedId) {
    return CustomerFeedName.format(String.valueOf(customerId), String.valueOf(feedId));
  }

  /** Returns the customer manager link resource name for the specified components. */
  public static String customerManagerLink(
      long customerId, long managerCustomerId, long managerLinkId) {
    return CustomerManagerLinkName.format(
        String.valueOf(customerId), concatIdentifiers(managerCustomerId, managerLinkId));
  }

  /** Returns the display keyword view resource name for the specified components. */
  public static String displayKeywordView(long customerId, long adGroupId, long criterionId) {
    return DisplayKeywordViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the feed resource name for the specified components. */
  public static String feed(long customerId, long feedId) {
    return FeedName.format(String.valueOf(customerId), String.valueOf(feedId));
  }

  /** Returns the feed item resource name for the specified components. */
  public static String feedItem(long customerId, long feedId, long feedItemId) {
    return FeedItemName.format(String.valueOf(customerId), concatIdentifiers(feedId, feedItemId));
  }

  /** Returns the feed mapping resource name for the specified components. */
  public static String feedMapping(long customerId, long feedId, long feedMappingId) {
    return FeedMappingName.format(
        String.valueOf(customerId), concatIdentifiers(feedId, feedMappingId));
  }

  /** Returns the gender view resource name for the specified components. */
  public static String genderView(long customerId, long adGroupId, long criterionId) {
    return GenderViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the geo target constant resource name for the specified components. */
  public static String geoTargetConstant(long criterionId) {
    return GeoTargetConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the google ads field resource name for the specified components. */
  public static String googleAdsField(String field) {
    return GoogleAdsFieldName.format(field);
  }

  /** Returns the hotel group view resource name for the specified components. */
  public static String hotelGroupView(long customerId, long adGroupId, long criterionId) {
    return HotelGroupViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the hotel performance view resource name for the specified components. */
  public static String hotelPerformanceView(long customerId) {
    return HotelPerformanceViewName.format(String.valueOf(customerId));
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
  public static String keywordPlanKeyword(long customerId, long kpAdGroupKeywordId) {
    return KeywordPlanKeywordName.format(
        String.valueOf(customerId), String.valueOf(kpAdGroupKeywordId));
  }

  /** Returns the keyword plan negative keyword resource name for the specified components. */
  public static String keywordPlanNegativeKeyword(long customerId, long kpCampaignKeywordId) {
    return KeywordPlanNegativeKeywordName.format(
        String.valueOf(customerId), String.valueOf(kpCampaignKeywordId));
  }

  /** Returns the keyword view resource name for the specified components. */
  public static String keywordView(long customerId, long adGroupId, long criterionId) {
    return KeywordViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the language constant resource name for the specified components. */
  public static String languageConstant(long criterionId) {
    return LanguageConstantName.format(String.valueOf(criterionId));
  }

  /** Returns the managed placement view resource name for the specified components. */
  public static String managedPlacementView(long customerId, long adGroupId, long criterionId) {
    return ManagedPlacementViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the media file resource name for the specified components. */
  public static String mediaFile(long customerId, long mediaId) {
    return MediaFileName.format(String.valueOf(customerId), String.valueOf(mediaId));
  }

  /** Returns the parental status view resource name for the specified components. */
  public static String parentalStatusView(long customerId, long adGroupId, long criterionId) {
    return ParentalStatusViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the payments account resource name for the specified components. */
  public static String paymentsAccount(
      long customerId, long paymentsProfileId, long paymentsAccountId) {
    return String.format(
        "customers/%s/paymentsAccounts/%s",
        String.valueOf(customerId), concatIdentifiers(paymentsProfileId, paymentsAccountId));
  }

  /** Returns the product group view resource name for the specified components. */
  public static String productGroupView(long customerId, long adgroupId, long criterionId) {
    return ProductGroupViewName.format(
        String.valueOf(customerId), concatIdentifiers(adgroupId, criterionId));
  }

  /** Returns the recommendation resource name for the specified components. */
  public static String recommendation(long customerId, String recommendationId) {
    return RecommendationName.format(String.valueOf(customerId), recommendationId);
  }

  /** Returns the search term view resource name for the specified components. */
  public static String searchTermView(
      long customerId, long campaignId, long adGroupId, String query) {
    return SearchTermViewName.format(
        String.valueOf(customerId), concatIdentifiers(campaignId, adGroupId, query));
  }

  /** Returns the shared criterion resource name for the specified components. */
  public static String sharedCriterion(long customerId, long sharedSetId, long criterionId) {
    return SharedCriteriaName.format(
        String.valueOf(customerId), concatIdentifiers(sharedSetId, criterionId));
  }

  /** Returns the shared set resource name for the specified components. */
  public static String sharedSet(long customerId, long sharedSetId) {
    return SharedSetName.format(String.valueOf(customerId), String.valueOf(sharedSetId));
  }

  /** Returns the topic constant resource name for the specified components. */
  public static String topicConstant(long verticalId) {
    return TopicConstantName.format(String.valueOf(verticalId));
  }

  /** Returns the topic view resource name for the specified components. */
  public static String topicView(long customerId, long adGroupId, long criterionId) {
    return TopicViewName.format(
        String.valueOf(customerId), concatIdentifiers(adGroupId, criterionId));
  }

  /** Returns the user interest resource name for the specified components. */
  public static String userInterest(long customerId, long categoryId) {
    return UserInterestName.format(String.valueOf(customerId), String.valueOf(categoryId));
  }

  /** Returns the user list resource name for the specified components. */
  public static String userList(long customerId, long userListId) {
    return UserListName.format(String.valueOf(customerId), String.valueOf(userListId));
  }

  /** Returns the video resource name for the specified components. */
  public static String video(long customerId, String videoId) {
    return VideoName.format(String.valueOf(customerId), videoId);
  }

  /**
   * Returns a string consisting of the specified identifiers, concatenated together using the
   * standard delimiter for composite identifiers.
   */
  private static String concatIdentifiers(Object... toConcat) {
    String pattern = Stream.of(toConcat).map(arg -> "%s").collect(Collectors.joining("_"));
    return String.format(pattern, toConcat);
  }
}
