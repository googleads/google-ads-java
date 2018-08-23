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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResourceNamesTest {

  @Test
  public void testAccountBudgetProposal() {
    String expected = "customers/1234/accountBudgetProposals/5678";
    assertEquals(expected, ResourceNames.accountBudgetProposal(1234L, 5678L));
  }

  @Test
  public void testAdGroupAd() {
    String expected = "customers/1234/adGroupAds/5678_1011";
    assertEquals(expected, ResourceNames.adGroupAd(1234L, 5678L, 1011L));
  }

  @Test
  public void testAdGroupBidModifier() {
    String expected = "customers/1234/adGroupBidModifiers/5678_1011";
    assertEquals(expected, ResourceNames.adGroupBidModifier(1234L, 5678L, 1011L));
  }

  @Test
  public void testAdGroupCriterion() {
    String expected = "customers/1234/adGroupCriteria/5678_1011";
    assertEquals(expected, ResourceNames.adGroupCriterion(1234L, 5678L, 1011L));
  }

  @Test
  public void testAdGroup() {
    String expected = "customers/1234/adGroups/5678";
    assertEquals(expected, ResourceNames.adGroup(1234L, 5678L));
  }

  @Test
  public void testBiddingStrategy() {
    String expected = "customers/1234/biddingStrategies/5678";
    assertEquals(expected, ResourceNames.biddingStrategy(1234L, 5678L));
  }

  @Test
  public void testBillingSetup() {
    String expected = "customers/1234/billingSetups/5678";
    assertEquals(expected, ResourceNames.billingSetup(1234L, 5678L));
  }

  @Test
  public void testCampaign() {
    String expected = "customers/1234/campaigns/5678";
    assertEquals(expected, ResourceNames.campaign(1234L, 5678L));
  }

  @Test
  public void testCampaignBidModifier() {
    String expected = "customers/1234/campaignBidModifiers/5678_1011";
    assertEquals(expected, ResourceNames.campaignBidModifier(1234L, 5678L, 1011L));
  }

  @Test
  public void testCampaignBudget() {
    String expected = "customers/1234/campaignBudgets/5678";
    assertEquals(expected, ResourceNames.campaignBudget(1234L, 5678L));
  }

  @Test
  public void testCampaignCriteria() {
    String expected = "customers/1234/campaignCriteria/5678_1011";
    assertEquals(expected, ResourceNames.campaignCriterion(1234L, 5678L, 1011L));
  }

  @Test
  public void testCampaignGroup() {
    String expected = "customers/1234/campaignGroups/5678";
    assertEquals(expected, ResourceNames.campaignGroup(1234L, 5678L));
  }

  @Test
  public void testCampaignSharedSet() {
    String expected = "customers/1234/campaignSharedSets/5678";
    assertEquals(expected, ResourceNames.campaignSharedSet(1234L, 5678L));
  }

  @Test
  public void testChangeStatus() {
    String expected = "customers/1234/changeStatus/5678";
    assertEquals(expected, ResourceNames.changeStatus(1234L, 5678L));
  }

  @Test
  public void testConversionAction() {
    String expected = "customers/1234/conversionActions/5678";
    assertEquals(expected, ResourceNames.conversionAction(1234L, 5678L));
  }

  @Test
  public void testCustomer() {
    String expected = "customers/1234";
    assertEquals(expected, ResourceNames.customer(1234L));
  }

  @Test
  public void testGeoTargetConstant() {
    String expected = "geoTargetConstants/1234";
    assertEquals(expected, ResourceNames.geoTargetConstant(1234L));
  }

  @Test
  public void testGoogleAdsField() {
    String expected = "googleAdsFields/ad_group_criterion.effective_cpm_bid_micros";
    assertEquals(
        expected, ResourceNames.googleAdsField("ad_group_criterion.effective_cpm_bid_micros"));
  }

  @Test
  public void testKeywordView() {
    String expected = "customers/1234/keywordViews/5678_1011";
    assertEquals(expected, ResourceNames.keywordView(1234L, 5678L, 1011L));
  }

  @Test
  public void testSharedSet() {
    String expected = "customers/1234/sharedSets/5678";
    assertEquals(expected, ResourceNames.sharedSet(1234L, 5678L));
  }

  @Test
  public void testSharedCriterion() {
    String expected = "customers/1234/sharedCriteria/5678";
    assertEquals(expected, ResourceNames.sharedCriterion(1234L, 5678L));
  }

  @Test
  public void testVideo() {
    String expected = "customers/1234/videos/5678";
    assertEquals(expected, ResourceNames.video(1234L, 5678L));
  }
}
