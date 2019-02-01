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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.matchesPattern;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;

public class ResourceNamesTest {

  /**
   * Check a broad match on the generated resource name. This method checks that all IDs are in
   * order and composite IDs are properly joined. It does not test the actual format of the resource
   * name (e.g. the customer or entity parts are as expected). That is assumed to be correct from
   * the code generation.
   *
   * @param method the ResourceName.java method to check.
   */
  private static void testAllMethodsBroadMatch(Method method) {
    // Create a map to hold test data, specifically values of the resource name parameters for each
    // parameter type.
    ImmutableMap<Class, Object> testData =
        ImmutableMap.<Class, Object>builder()
            .put(long.class, 1234L)
            .put(String.class, "abc123")
            .build();
    // Build an array of the resource name method parameters.
    Object[] invokeParams =
        Stream.of(method.getParameters()).map(param -> testData.get(param.getType())).toArray();
    Stream.of(invokeParams).forEach(param -> assertNotNull(param));
    // Construct a regex which ensures that the parameters appear in sequence.
    String paramOrderRegex =
        ".*"
            + Stream.of(invokeParams).map(Object::toString).collect(Collectors.joining(".*"))
            + ".*";
    // Call the ResourceNames formatter method with the generated params.
    String result = null;
    try {
      result = (String) method.invoke(null, invokeParams);
    } catch (IllegalAccessException | InvocationTargetException e) {
      fail();
    }
    // Verify the parameters appear in the correct order.
    assertThat(result, matchesPattern(paramOrderRegex));
    // Check if we have compound keys.
    if (invokeParams.length > 2) {
      // Extract the last part of the resource, this will contain the compound keys.
      // Here we are only concerned that the format is correct, since we know the params are already
      // in the correct order.
      String possibleChainedIds = result.replaceFirst(".*/", "");
      assertTrue(possibleChainedIds.contains("_"));
      assertThat(result, possibleChainedIds, matchesPattern("(1234|abc123)((_1234|_abc123)+)"));
    }
  }

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
  public void testAdParameter() {
    String expected = "customers/1234/adParameters/5678_1011_3";
    assertEquals(expected, ResourceNames.adParameter(1234L, 5678L, 1011L, 3L));
  }

  @Test
  public void testAdScheduleView() {
    String expected = "customers/1234/adScheduleViews/5678_1011";
    assertEquals(expected, ResourceNames.adScheduleView(1234L, 5678L, 1011L));
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
  public void testCampaignSharedSet() {
    String expected = "customers/1234/campaignSharedSets/5678_91011";
    assertEquals(expected, ResourceNames.campaignSharedSet(1234L, 5678L, 91011L));
  }

  @Test
  public void testChangeStatus() {
    String expected = "customers/1234/changeStatus/5678asd";
    assertEquals(expected, ResourceNames.changeStatus(1234L, "5678asd"));
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
  public void testMobileAppCategoryConstant() {
    String expected = "mobileAppCategoryConstants/1234";
    assertEquals(expected, ResourceNames.mobileAppCategoryConstant(1234L));
  }

  @Test
  public void testMobileDeviceConstant() {
    String expected = "mobileDeviceConstants/1234";
    assertEquals(expected, ResourceNames.mobileDeviceConstant(1234L));
  }

  @Test
  public void testOperationSystemVersionConstant() {
    String expected = "operatingSystemVersionConstants/1234";
    assertEquals(expected, ResourceNames.operatingSystemVersionConstant(1234L));
  }

  @Test
  public void testRemarketingAction() {
    String expected = "customers/1234/remarketingActions/5678";
    assertEquals(expected, ResourceNames.remarketingAction(1234L, 5678L));
  }

  @Test
  public void testSharedSet() {
    String expected = "customers/1234/sharedSets/5678";
    assertEquals(expected, ResourceNames.sharedSet(1234L, 5678L));
  }

  @Test
  public void testSharedCriterion() {
    String expected = "customers/1234/sharedCriteria/5678_91011";
    assertEquals(expected, ResourceNames.sharedCriterion(1234L, 5678L, 91011L));
  }

  @Test
  public void testVideo() {
    String expected = "customers/1234/videos/5678asd";
    assertEquals(expected, ResourceNames.video(1234L, "5678asd"));
  }

  /**
   * Tests all resource names contain the test data in the correct order, and that any chained IDs
   * are properly formatted.
   *
   * <p>Does not test that the resource name is a legal pattern. This could be handled later with
   * codegen.
   */
  @Test
  public void testAllResourceNamesBroadMatch() {
    Stream.of(ResourceNames.class.getMethods())
        .filter(
            method ->
                Modifier.isStatic(method.getModifiers())
                    && Modifier.isPublic(method.getModifiers()))
        .forEach(method -> testAllMethodsBroadMatch(method));
  }
}
