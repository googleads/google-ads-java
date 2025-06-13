package com.google.ads.googleads.examples.advancedoperations;

import com.google.ads.googleads.examples.advancedoperations.AddDemandGenCampaign;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v20.common.AdImageAsset;
import com.google.ads.googleads.v20.common.AdTextAsset;
import com.google.ads.googleads.v20.common.AdVideoAsset;
import com.google.ads.googleads.v20.common.DemandGenVideoResponsiveAdInfo;
import com.google.ads.googleads.v20.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v20.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v20.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v20.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v20.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v20.resources.Ad;
import com.google.ads.googleads.v20.resources.AdGroup;
import com.google.ads.googleads.v20.resources.AdGroupAd;
import com.google.ads.googleads.v20.resources.Asset;
import com.google.ads.googleads.v20.resources.Campaign;
import com.google.ads.googleads.v20.resources.CampaignBudget;
import com.google.ads.googleads.v20.services.AdGroupAdOperation;
import com.google.ads.googleads.v20.services.AdGroupOperation;
import com.google.ads.googleads.v20.services.AssetOperation;
import com.google.ads.googleads.v20.services.CampaignBudgetOperation;
import com.google.ads.googleads.v20.services.CampaignOperation;
import com.google.ads.googleads.v20.services.CampaignBudgetResult;
import com.google.ads.googleads.v20.services.CampaignResult;
import com.google.ads.googleads.v20.services.AdGroupResult;
import com.google.ads.googleads.v20.services.AdGroupAdResult;
import com.google.ads.googleads.v20.services.AssetResult;
import com.google.ads.googleads.v20.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v20.services.MutateGoogleAdsRequest;
import com.google.ads.googleads.v20.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v20.services.MutateOperation;
import com.google.ads.googleads.v20.services.MutateOperationResponse;
import com.google.ads.googleads.v20.utils.ResourceNames;
import java.io.IOException;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** Tests for {@link AddDemandGenCampaign}. */
@RunWith(JUnit4.class)
public class AddDemandGenCampaignTest {

  @Mock private GoogleAdsClient googleAdsClient;

  @Mock(answer = Answers.RETURNS_DEEP_STUBS)
  private GoogleAdsClient.Versions versions;

  @Mock private GoogleAdsServiceClient googleAdsServiceClient;

  @Captor private ArgumentCaptor<MutateGoogleAdsRequest> requestCaptor;

  private AddDemandGenCampaign addDemandGenCampaign;

  // Test constants
  private static final long TEST_CUSTOMER_ID = 1234567890L;
  private static final String TEST_VIDEO_ID = "videoId123";
  private static final String TEST_LOGO_IMAGE_URL = "https://www.gstatic.com/images/branding/googlelogo/2x/googlelogo_color_150x54dp.png";

  // Temporary IDs are now referenced from AddDemandGenCampaign.java

  private String expectedBudgetResourceName;
  private String expectedCampaignResourceName;
  private String expectedAdGroupResourceName;
  private String expectedLogoAssetResourceName;
  private String expectedVideoAssetResourceName;
  private String expectedAdGroupAdResourceName; // Not explicitly created with temp ID but good to have for response

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    addDemandGenCampaign = new AddDemandGenCampaign();

    when(googleAdsClient.getLatestVersion()).thenReturn(versions);
    when(versions.createGoogleAdsServiceClient()).thenReturn(googleAdsServiceClient);

    // Define expected resource names
    expectedBudgetResourceName = ResourceNames.campaignBudget(TEST_CUSTOMER_ID, AddDemandGenCampaign.BUDGET_TEMPORARY_ID);
    expectedCampaignResourceName = ResourceNames.campaign(TEST_CUSTOMER_ID, AddDemandGenCampaign.CAMPAIGN_TEMPORARY_ID);
    expectedAdGroupResourceName = ResourceNames.adGroup(TEST_CUSTOMER_ID, AddDemandGenCampaign.AD_GROUP_TEMPORARY_ID);
    expectedLogoAssetResourceName = ResourceNames.asset(TEST_CUSTOMER_ID, AddDemandGenCampaign.LOGO_ASSET_TEMPORARY_ID);
    expectedVideoAssetResourceName = ResourceNames.asset(TEST_CUSTOMER_ID, AddDemandGenCampaign.VIDEO_ASSET_TEMPORARY_ID);
    // AdGroupAd doesn't have a temporary ID in the main code, but its result will have a resource name.
    // We can use a placeholder if needed for the response, or rely on the SUT to not need a specific temp ID for it.
    expectedAdGroupAdResourceName = ResourceNames.adGroupAd(TEST_CUSTOMER_ID, 12345L); // Dummy ad ID
  }

  @Test
  public void testRun_createsDemandGenCampaignSuccessfully() throws IOException {
    // Arrange
    MutateGoogleAdsResponse mockResponse =
        MutateGoogleAdsResponse.newBuilder()
            .addMutateOperationResponses(
                MutateOperationResponse.newBuilder()
                    .setCampaignBudgetResult(
                        CampaignBudgetResult.newBuilder()
                            .setResourceName(expectedBudgetResourceName)))
            .addMutateOperationResponses(
                MutateOperationResponse.newBuilder()
                    .setCampaignResult(
                        CampaignResult.newBuilder().setResourceName(expectedCampaignResourceName)))
            .addMutateOperationResponses(
                MutateOperationResponse.newBuilder()
                    .setAdGroupResult(
                        AdGroupResult.newBuilder().setResourceName(expectedAdGroupResourceName)))
            .addMutateOperationResponses( // Logo Asset
                MutateOperationResponse.newBuilder()
                    .setAssetResult(
                        AssetResult.newBuilder().setResourceName(expectedLogoAssetResourceName)))
            .addMutateOperationResponses( // Video Asset
                MutateOperationResponse.newBuilder()
                    .setAssetResult(
                        AssetResult.newBuilder().setResourceName(expectedVideoAssetResourceName)))
            .addMutateOperationResponses(
                MutateOperationResponse.newBuilder()
                    .setAdGroupAdResult(
                        AdGroupAdResult.newBuilder().setResourceName(expectedAdGroupAdResourceName)))
            .build();

    when(googleAdsServiceClient.mutate(any(MutateGoogleAdsRequest.class)))
        .thenReturn(mockResponse);

    // Act
    addDemandGenCampaign.run(googleAdsClient, TEST_CUSTOMER_ID, TEST_VIDEO_ID);

    // Assert
    verify(googleAdsServiceClient).mutate(requestCaptor.capture());
    MutateGoogleAdsRequest actualRequest = requestCaptor.getValue();

    assertEquals(String.valueOf(TEST_CUSTOMER_ID), actualRequest.getCustomerId());
    assertEquals(6, actualRequest.getMutateOperationsCount()); // Budget, Campaign, AdGroup, LogoAsset, VideoAsset, AdGroupAd

    // 1. CampaignBudget Operation
    MutateOperation budgetOperation = actualRequest.getMutateOperations(0);
    assertTrue(budgetOperation.hasCampaignBudgetOperation());
    CampaignBudgetOperation campaignBudgetOp = budgetOperation.getCampaignBudgetOperation();
    assertTrue(campaignBudgetOp.hasCreate());
    CampaignBudget budget = campaignBudgetOp.getCreate();
    assertTrue(budget.getName().startsWith("Demand Gen Campaign Budget #"));
    assertEquals(5_000_000L, budget.getAmountMicros());
    assertFalse(budget.getExplicitlyShared());
    assertEquals(expectedBudgetResourceName, budget.getResourceName());
    assertEquals(BudgetDeliveryMethod.STANDARD, budget.getDeliveryMethod());


    // 2. Campaign Operation
    MutateOperation campaignOperation = actualRequest.getMutateOperations(1);
    assertTrue(campaignOperation.hasCampaignOperation());
    CampaignOperation campaignOp = campaignOperation.getCampaignOperation();
    assertTrue(campaignOp.hasCreate());
    Campaign campaign = campaignOp.getCreate();
    assertTrue(campaign.getName().startsWith("Demand Gen Campaign #"));
    assertEquals(CampaignStatus.PAUSED, campaign.getStatus());
    assertEquals(AdvertisingChannelType.DEMAND_GEN, campaign.getAdvertisingChannelType());
    assertEquals(expectedBudgetResourceName, campaign.getCampaignBudget());
    assertEquals(expectedCampaignResourceName, campaign.getResourceName());
    // TargetCpa is not set by default in the SUT, so no assertion for it unless SUT changes.

    // 3. AdGroup Operation
    MutateOperation adGroupOperation = actualRequest.getMutateOperations(2);
    assertTrue(adGroupOperation.hasAdGroupOperation());
    AdGroupOperation adGroupOp = adGroupOperation.getAdGroupOperation();
    assertTrue(adGroupOp.hasCreate());
    AdGroup adGroup = adGroupOp.getCreate();
    assertTrue(adGroup.getName().startsWith("Demand Gen Ad Group #"));
    assertEquals(AdGroupStatus.ENABLED, adGroup.getStatus());
    assertEquals(expectedCampaignResourceName, adGroup.getCampaign());
    assertEquals(expectedAdGroupResourceName, adGroup.getResourceName());
    assertNotNull(adGroup.getDemandGenAdGroupSettings()); // Check settings object exists
    // ChannelControls are optional and not set by default in SUT, so no assertion for them.

    // 4. Logo Asset Operation
    MutateOperation logoAssetOperation = actualRequest.getMutateOperations(3);
    assertTrue(logoAssetOperation.hasAssetOperation());
    AssetOperation assetOpLogo = logoAssetOperation.getAssetOperation();
    assertTrue(assetOpLogo.hasCreate());
    Asset logoAsset = assetOpLogo.getCreate();
    assertTrue(logoAsset.getName().startsWith("Demand Gen Logo Asset #"));
    assertEquals(expectedLogoAssetResourceName, logoAsset.getResourceName());
    assertEquals(AssetType.IMAGE, logoAsset.getType());
    assertNotNull(logoAsset.getImageAsset());
    assertFalse(logoAsset.getImageAsset().getData().isEmpty());

    // 5. Video Asset Operation
    MutateOperation videoAssetOperation = actualRequest.getMutateOperations(4);
    assertTrue(videoAssetOperation.hasAssetOperation());
    AssetOperation assetOpVideo = videoAssetOperation.getAssetOperation();
    assertTrue(assetOpVideo.hasCreate());
    Asset videoAsset = assetOpVideo.getCreate();
    assertTrue(videoAsset.getName().startsWith("Demand Gen Video Asset #"));
    assertEquals(expectedVideoAssetResourceName, videoAsset.getResourceName());
    assertEquals(AssetType.YOUTUBE_VIDEO, videoAsset.getType());
    assertNotNull(videoAsset.getYoutubeVideoAsset());
    assertEquals(TEST_VIDEO_ID, videoAsset.getYoutubeVideoAsset().getYoutubeVideoId());

    // 6. AdGroupAd Operation
    MutateOperation adGroupAdOperation = actualRequest.getMutateOperations(5);
    assertTrue(adGroupAdOperation.hasAdGroupAdOperation());
    AdGroupAdOperation adGroupAdOp = adGroupAdOperation.getAdGroupAdOperation();
    assertTrue(adGroupAdOp.hasCreate());
    AdGroupAd adGroupAd = adGroupAdOp.getCreate();
    assertEquals(expectedAdGroupResourceName, adGroupAd.getAdGroup());
    // Ad status is inherited from AdGroup, not explicitly set on AdGroupAd in SUT for Demand Gen.

    Ad ad = adGroupAd.getAd();
    assertNotNull(ad);
    assertEquals(1, ad.getFinalUrlsCount());
    assertEquals("https://www.example.com", ad.getFinalUrls(0));
    assertTrue(ad.hasDemandGenVideoResponsiveAd());

    DemandGenVideoResponsiveAdInfo demandGenAdInfo = ad.getDemandGenVideoResponsiveAd();
    assertEquals("Your Awesome Company Inc.", demandGenAdInfo.getBusinessName().getText());
    assertEquals("LEARN_MORE", demandGenAdInfo.getCallToAction().getText()); // SUT uses "LEARN_MORE"

    // Videos
    assertEquals(1, demandGenAdInfo.getVideosCount());
    AdVideoAsset adVideo = demandGenAdInfo.getVideos(0);
    assertEquals(expectedVideoAssetResourceName, adVideo.getAsset());

    // Logo Images
    assertEquals(1, demandGenAdInfo.getLogoImagesCount());
    AdImageAsset adLogo = demandGenAdInfo.getLogoImages(0);
    assertEquals(expectedLogoAssetResourceName, adLogo.getAsset());

    // Headlines
    List<AdTextAsset> headlines = demandGenAdInfo.getHeadlinesList();
    assertEquals(3, headlines.size());
    assertEquals("Headline 1 - Experience the Magic", headlines.get(0).getText());
    assertEquals("Headline 2 - Discover New Horizons", headlines.get(1).getText());
    assertEquals("Headline 3 - Your Adventure Awaits", headlines.get(2).getText());

    // Long Headlines
    List<AdTextAsset> longHeadlines = demandGenAdInfo.getLongHeadlinesList();
    assertEquals(2, longHeadlines.size());
    assertEquals("Long Headline 1 - Unlock Exclusive Content and Explore a World of Possibilities Today!", longHeadlines.get(0).getText());
    assertEquals("Long Headline 2 - Join Our Community and Get Access to Premium Features and Support.", longHeadlines.get(1).getText());

    // Descriptions
    List<AdTextAsset> descriptions = demandGenAdInfo.getDescriptionsList();
    assertEquals(2, descriptions.size());
    assertEquals("Description 1 - Sign up now and transform your experience.", descriptions.get(0).getText());
    assertEquals("Description 2 - Limited time offer: Don't miss out!", descriptions.get(1).getText());
  }
}
