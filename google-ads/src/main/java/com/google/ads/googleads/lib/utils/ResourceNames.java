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
// limitations under the license.

package com.google.ads.googleads.lib.utils;

import com.google.ads.googleads.v0.resources.AccountBudgetProposalName;
import com.google.ads.googleads.v0.resources.AdGroupAdName;
import com.google.ads.googleads.v0.resources.AdGroupBidModifierName;
import com.google.ads.googleads.v0.resources.AdGroupCriteriaName;
import com.google.ads.googleads.v0.resources.AdGroupName;
import com.google.ads.googleads.v0.resources.BiddingStrategyName;
import com.google.ads.googleads.v0.resources.BillingSetupName;
import com.google.ads.googleads.v0.resources.CampaignBidModifierName;
import com.google.ads.googleads.v0.resources.CampaignBudgetName;
import com.google.ads.googleads.v0.resources.CampaignCriteriaName;
import com.google.ads.googleads.v0.resources.CampaignGroupName;
import com.google.ads.googleads.v0.resources.CampaignName;
import com.google.ads.googleads.v0.resources.CampaignSharedSetName;
import com.google.ads.googleads.v0.resources.ChangeStatusName;
import com.google.ads.googleads.v0.resources.ConversionActionName;
import com.google.ads.googleads.v0.resources.CustomerName;
import com.google.ads.googleads.v0.resources.GeoTargetConstantName;
import com.google.ads.googleads.v0.resources.GoogleAdsFieldName;
import com.google.ads.googleads.v0.resources.KeywordViewName;
import com.google.ads.googleads.v0.resources.RecommendationName;
import com.google.ads.googleads.v0.resources.SharedCriteriaName;
import com.google.ads.googleads.v0.resources.SharedSetName;
import com.google.ads.googleads.v0.resources.VideoName;
import com.google.common.base.Joiner;
import java.util.Arrays;

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

  /** Joiner for resource path components that consist of multiple identifiers. */
  private static final Joiner IDENTIFIER_JOINER = Joiner.on('_');

  /**
   * Returns a string consisting of the specified identifiers, concatenated together using the
   * standard delimiter for composite identifiers.
   */
  private static String concatLongs(long... components) {
    return IDENTIFIER_JOINER.join(Arrays.stream(components).mapToObj(Long::toString).iterator());
  }

  /** Returns the account budget proposal resource name for the specified components. */
  public static String accountBudgetProposal(long customerId, long accountBudgetProposalId) {
    return AccountBudgetProposalName.format(
        Long.toString(customerId), Long.toString(accountBudgetProposalId));
  }

  /** Returns the ad group ad resource name for the specified components. */
  public static String adGroupAd(long customerId, long adGroupId, long adId) {
    return AdGroupAdName.format(Long.toString(customerId), concatLongs(adGroupId, adId));
  }

  /** Returns the ad group bid modifier resource name for the specified components. */
  public static String adGroupBidModifier(long customerId, long adGroupId, long criterionId) {
    return AdGroupBidModifierName.format(
        Long.toString(customerId), concatLongs(adGroupId, criterionId));
  }

  /** Returns the ad group criterion resource name for the specified components. */
  public static String adGroupCriterion(long customerId, long adGroupId, long criterionId) {
    return AdGroupCriteriaName.format(
        Long.toString(customerId), concatLongs(adGroupId, criterionId));
  }

  /** Returns the ad group resource name for the specified components. */
  public static String adGroup(long customerId, long adGroupId) {
    return AdGroupName.format(Long.toString(customerId), Long.toString(adGroupId));
  }

  /** Returns the bidding strategy resource name for the specified components. */
  public static String biddingStrategy(long customerId, long biddingStrategyId) {
    return BiddingStrategyName.format(Long.toString(customerId), Long.toString(biddingStrategyId));
  }

  /** Returns the billing setup resource name for the specified components. */
  public static String billingSetup(long customerId, long billingSetupId) {
    return BillingSetupName.format(Long.toString(customerId), Long.toString(billingSetupId));
  }

  /** Returns the campaign bid modifier resource name for the specified components. */
  public static String campaignBidModifier(long customerId, long campaignId, long criterionId) {
    return CampaignBidModifierName.format(
        Long.toString(customerId), concatLongs(campaignId, criterionId));
  }

  /** Returns the campaign budget resource name for the specified components. */
  public static String campaignBudget(long customerId, long campaignBudgetId) {
    return CampaignBudgetName.format(Long.toString(customerId), Long.toString(campaignBudgetId));
  }

  /** Returns the campaign criterion resource name for the specified components. */
  public static String campaignCriterion(long customerId, long campaignId, long criterionId) {
    return CampaignCriteriaName.format(
        Long.toString(customerId), concatLongs(campaignId, criterionId));
  }

  /** Returns the campaign group resource name for the specified components. */
  public static String campaignGroup(long customerId, long campaignGroupId) {
    return CampaignGroupName.format(Long.toString(customerId), Long.toString(campaignGroupId));
  }

  /** Returns the campaign resource name for the specified components. */
  public static String campaign(long customerId, long campaignId) {
    return CampaignName.format(Long.toString(customerId), Long.toString(campaignId));
  }

  /** Returns the campaign shared set resource name for the specified components. */
  public static String campaignSharedSet(long customerId, long campaignSharedSetId) {
    return CampaignSharedSetName.format(
        Long.toString(customerId), Long.toString(campaignSharedSetId));
  }

  /** Returns the change status resource name for the specified components. */
  public static String changeStatus(long customerId, long changeStatusId) {
    return ChangeStatusName.format(Long.toString(customerId), Long.toString(changeStatusId));
  }

  /** Returns the conversion action resource name for the specified components. */
  public static String conversionAction(long customerId, long conversionActionId) {
    return ConversionActionName.format(Long.toString(customerId), Long.toString(conversionActionId));
  }

  /** Returns the customer resource name for the specified components. */
  public static String customer(long customerId) {
    return CustomerName.format(Long.toString(customerId));
  }

  /** Returns the geo target constant resource name for the specified components. */
  public static String geoTargetConstant(long geoTargetConstantId) {
    return GeoTargetConstantName.format(Long.toString(geoTargetConstantId));
  }

  /** Returns the google ads field resource name for the specified components. */
  public static String googleAdsField(String fieldName) {
    return GoogleAdsFieldName.format(fieldName);
  }

  /** Returns the keyword view resource name for the specified components. */
  public static String keywordView(long customerId, long adGroupId, long criterionId) {
    return KeywordViewName.format(Long.toString(customerId), concatLongs(adGroupId, criterionId));
  }

  /** Returns the recommendation resource name for the specified components. */
  public static String recommendation(long customerId, String recommendationId) {
    return RecommendationName.format(Long.toString(customerId), recommendationId);
  }

  /** Returns the shared criterion resource name for the specified components. */
  public static String sharedCriterion(long customerId, long sharedCriterionId) {
    return SharedCriteriaName.format(Long.toString(customerId), Long.toString(sharedCriterionId));
  }

  /** Returns the shared set resource name for the specified components. */
  public static String sharedSet(long customerId, long sharedSetId) {
    return SharedSetName.format(Long.toString(customerId), Long.toString(sharedSetId));
  }

  /** Returns the video resource name for the specified components. */
  public static String video(long customerId, long videoId) {
    return VideoName.format(Long.toString(customerId), Long.toString(videoId));
  }
}
