// Copyright 2020 Google LLC
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

package com.google.ads.googleads.v16.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.matchesPattern;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.ads.googleads.v16.enums.AndroidPrivacyInteractionTypeEnum.AndroidPrivacyInteractionType;
import com.google.ads.googleads.v16.enums.AndroidPrivacyNetworkTypeEnum.AndroidPrivacyNetworkType;
import com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v16.enums.AssetSetTypeEnum.AssetSetType;
import com.google.ads.googleads.v16.enums.ConversionActionCategoryEnum.ConversionActionCategory;
import com.google.ads.googleads.v16.enums.ConversionOriginEnum.ConversionOrigin;
import com.google.ads.googleads.v16.enums.DistanceBucketEnum.DistanceBucket;
import com.google.ads.googleads.v16.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v16.enums.FeedItemTargetTypeEnum.FeedItemTargetType;
import com.google.ads.googleads.v16.enums.GeoTargetingTypeEnum.GeoTargetingType;
import com.google.ads.googleads.v16.enums.OfflineEventUploadClientEnum.OfflineEventUploadClient;
import com.google.ads.googleads.v16.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v16.enums.ProductCategoryLevelEnum.ProductCategoryLevel;
import com.google.ads.googleads.v16.enums.RecommendationTypeEnum.RecommendationType;
import com.google.ads.googleads.v16.enums.SimulationModificationMethodEnum.SimulationModificationMethod;
import com.google.ads.googleads.v16.enums.SimulationTypeEnum.SimulationType;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;

public class ResourceNamesTest {

  @Test
  public void testAccountBudgetProposal() {
    String expected = "customers/1234/accountBudgetProposals/5678";
    assertEquals(expected, ResourceNames.accountBudgetProposal(1234L, 5678L));
  }

  @Test
  public void testAd() {
    String expected = "customers/1234/ads/5678";
    assertEquals(expected, ResourceNames.ad(1234L, 5678L));
  }

  @Test
  public void testAdGroupAd() {
    String expected = "customers/1234/adGroupAds/5678~1011";
    assertEquals(expected, ResourceNames.adGroupAd(1234L, 5678L, 1011L));
  }

  @Test
  public void testAdGroupBidModifier() {
    String expected = "customers/1234/adGroupBidModifiers/5678~1011";
    assertEquals(expected, ResourceNames.adGroupBidModifier(1234L, 5678L, 1011L));
  }

  @Test
  public void testAdGroupCriterion() {
    String expected = "customers/1234/adGroupCriteria/5678~1011";
    assertEquals(expected, ResourceNames.adGroupCriterion(1234L, 5678L, 1011L));
  }

  @Test
  public void testAdGroup() {
    String expected = "customers/1234/adGroups/5678";
    assertEquals(expected, ResourceNames.adGroup(1234L, 5678L));
  }

  @Test
  public void testAdParameter() {
    String expected = "customers/1234/adParameters/5678~1011~3";
    assertEquals(expected, ResourceNames.adParameter(1234L, 5678L, 1011L, 3L));
  }

  @Test
  public void testAdScheduleView() {
    String expected = "customers/1234/adScheduleViews/5678~1011";
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
    String expected = "customers/1234/campaignBidModifiers/5678~1011";
    assertEquals(expected, ResourceNames.campaignBidModifier(1234L, 5678L, 1011L));
  }

  @Test
  public void testCampaignBudget() {
    String expected = "customers/1234/campaignBudgets/5678";
    assertEquals(expected, ResourceNames.campaignBudget(1234L, 5678L));
  }

  @Test
  public void testCampaignCriteria() {
    String expected = "customers/1234/campaignCriteria/5678~1011";
    assertEquals(expected, ResourceNames.campaignCriterion(1234L, 5678L, 1011L));
  }

  @Test
  public void testCampaignSharedSet() {
    String expected = "customers/1234/campaignSharedSets/5678~91011";
    assertEquals(expected, ResourceNames.campaignSharedSet(1234L, 5678L, 91011L));
  }

  @Test
  public void testChangeStatus() {
    String expected = "customers/1234/changeStatus/5678asd";
    assertEquals(expected, ResourceNames.changeStatus(1234L, "5678asd"));
  }

  @Test
  public void testCurrencyConstant() {
    String expected = "currencyConstants/ABC";
    assertEquals(expected, ResourceNames.currencyConstant("ABC"));
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
    String expected = "customers/1234/keywordViews/5678~1011";
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
    String expected = "customers/1234/sharedCriteria/5678~91011";
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
            .put(boolean.class, false)
            .put(String.class, "abc123")
            .put(ExtensionType.class, ExtensionType.UNKNOWN)
            .put(FeedItemTargetType.class, FeedItemTargetType.UNKNOWN)
            .put(GeoTargetingType.class, GeoTargetingType.UNKNOWN)
            .put(PlaceholderType.class, PlaceholderType.UNKNOWN)
            .put(ProductCategoryLevel.class, ProductCategoryLevel.UNKNOWN)
            .put(SimulationModificationMethod.class, SimulationModificationMethod.UNKNOWN)
            .put(SimulationType.class, SimulationType.UNKNOWN)
            .put(AssetFieldType.class, AssetFieldType.UNKNOWN)
            .put(DistanceBucket.class, DistanceBucket.UNKNOWN)
            .put(ConversionActionCategory.class, ConversionActionCategory.UNKNOWN)
            .put(ConversionOrigin.class, ConversionOrigin.UNKNOWN)
            .put(AssetSetType.class, AssetSetType.UNKNOWN)
            .put(AndroidPrivacyInteractionType.class, AndroidPrivacyInteractionType.UNKNOWN)
            .put(AndroidPrivacyNetworkType.class, AndroidPrivacyNetworkType.UNKNOWN)
            .put(RecommendationType.class, RecommendationType.UNKNOWN)
            .put(OfflineEventUploadClient.class, OfflineEventUploadClient.UNKNOWN)
            .build();
    // Build an array of the resource name method parameters.
    Object[] invokeParams =
        Stream.of(method.getParameters()).map(param -> testData.get(param.getType())).toArray();
    Stream.of(invokeParams)
        .forEach(
            param ->
                assertNotNull(
                    "Params contain null, this is likely a new parameter type"
                        + " added to ResourceNames but without test data: "
                        + method,
                    param));
    // Construct a regex which ensures that the parameters appear in sequence.
    String paramOrderRegex =
        ".*"
            + Stream.of(invokeParams).map(Object::toString).collect(Collectors.joining(".*"))
            + ".*";
    // Call the ResourceNames formatter method with the generated params.
    String result = null;
    try {
      result = (String) method.invoke(null, invokeParams);
    } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
      fail("Failed to invoke method: " + method + " with params: " + Arrays.toString(invokeParams));
    }
    // Verify the parameters appear in the correct order.
    assertThat(result, matchesPattern(paramOrderRegex));
    // Check if we have compound keys.
    if (invokeParams.length > 2) {
      // Extract the last part of the resource, this will contain the compound keys.
      // Here we are only concerned that the format is correct, since we know the params are already
      // in the correct order.
      String possibleChainedIds = result.replaceFirst(".*/", "");
      assertTrue(possibleChainedIds.contains("~"));
      assertThat(
          result,
          possibleChainedIds,
          matchesPattern("(1234|abc123|UNKNOWN|false)((~1234|~abc123|~UNKNOWN|~false)+)"));
    }
  }
}
