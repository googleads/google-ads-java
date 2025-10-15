// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleHelper;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v22.common.PageFeedAsset;
import com.google.ads.googleads.v22.common.WebpageConditionInfo;
import com.google.ads.googleads.v22.common.WebpageInfo;
import com.google.ads.googleads.v22.enums.AssetSetTypeEnum.AssetSetType;
import com.google.ads.googleads.v22.enums.WebpageConditionOperandEnum.WebpageConditionOperand;
import com.google.ads.googleads.v22.errors.GoogleAdsError;
import com.google.ads.googleads.v22.errors.GoogleAdsException;
import com.google.ads.googleads.v22.resources.AdGroupCriterion;
import com.google.ads.googleads.v22.resources.Asset;
import com.google.ads.googleads.v22.resources.AssetSet;
import com.google.ads.googleads.v22.resources.AssetSetAsset;
import com.google.ads.googleads.v22.resources.CampaignAssetSet;
import com.google.ads.googleads.v22.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v22.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v22.services.AssetOperation;
import com.google.ads.googleads.v22.services.AssetServiceClient;
import com.google.ads.googleads.v22.services.AssetSetAssetOperation;
import com.google.ads.googleads.v22.services.AssetSetAssetServiceClient;
import com.google.ads.googleads.v22.services.AssetSetOperation;
import com.google.ads.googleads.v22.services.AssetSetServiceClient;
import com.google.ads.googleads.v22.services.CampaignAssetSetOperation;
import com.google.ads.googleads.v22.services.CampaignAssetSetServiceClient;
import com.google.ads.googleads.v22.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v22.services.MutateAssetResult;
import com.google.ads.googleads.v22.services.MutateAssetSetAssetsResponse;
import com.google.ads.googleads.v22.services.MutateAssetSetsResponse;
import com.google.ads.googleads.v22.services.MutateAssetsResponse;
import com.google.ads.googleads.v22.services.MutateCampaignAssetSetsResponse;
import com.google.ads.googleads.v22.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Adds a page feed with URLs for a Dynamic Search Ads campaign. */
public class AddDynamicPageFeedAsset {

  private static class AddDynamicPageFeedParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    AddDynamicPageFeedParams params = new AddDynamicPageFeedParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    GoogleAdsClient googleAdsClient = null;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      System.exit(1);
    }

    try {
      new AddDynamicPageFeedAsset().runExample(googleAdsClient, params);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
      System.exit(1);
    }
  }

  /** Runs the example. */
  private void runExample(GoogleAdsClient googleAdsClient, AddDynamicPageFeedParams params) {
    // The label for the DSA page URLs.
    String dsaPageUrlLabel = "discounts";
    // Creates an Asset.
    List<String> assetResourceNames =
        createAssets(googleAdsClient, dsaPageUrlLabel, params.customerId);
    // Creates an AssetSet - this is a collection of assets that can be associated with a campaign.
    // Note: do not confuse this with an AssetGroup. An AssetGroup replaces AdGroups in some types
    // of campaigns.
    String assetSetResourceName = createAssetSet(googleAdsClient, params);
    // Adds the Assets to the AssetSet.
    addAssetsToAssetSet(googleAdsClient, assetResourceNames, assetSetResourceName, params);
    // Links the AssetSet to the Campaign.
    linkAssetSetToCampaign(googleAdsClient, assetSetResourceName, params);
    // Optional: Targets web pages matching the feed's label in the ad group.
    addDsaTarget(googleAdsClient, dsaPageUrlLabel, params);
    System.out.printf(
        "Dynamic page feed setup is complete for campaign with ID %d.%n", params.campaignId);
  }

  /** Creates Assets to be used in a DSA page feed. */
  private static List<String> createAssets(GoogleAdsClient googleAdsClient,
      String dsaPageUrlLabel, long customerId) {
    // [START add_asset]
    List<String> urls =
        ImmutableList.of(
            "http://www.example.com/discounts/rental-cars",
            "http://www.example.com/discounts/hotel-deals",
            "http://www.example.com/discounts/flight-deals");

    // Creates one operation per URL.
    List<AssetOperation> assetOperations = new ArrayList<>();
    for (String url : urls) {
      PageFeedAsset pageFeedAsset =
          PageFeedAsset.newBuilder()
              // Sets the URL of the page to include.
              .setPageUrl(url)
              // Recommended: adds labels to the asset. These labels can be used later in ad group
              // targeting to restrict the set of pages that can serve.
              .addLabels(dsaPageUrlLabel)
              .build();
      Asset asset = Asset.newBuilder().setPageFeedAsset(pageFeedAsset).build();
      assetOperations.add(AssetOperation.newBuilder().setCreate(asset).build());
    }

    // Creates the service client.
    try (AssetServiceClient assetServiceClient =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Adds the assets.
      MutateAssetsResponse response =
          assetServiceClient.mutateAssets(String.valueOf(customerId), assetOperations);
      // Prints some information about the result.
      List<String> resourceNames =
          response.getResultsList().stream()
              .map(MutateAssetResult::getResourceName)
              .collect(Collectors.toList());
      resourceNames.forEach(r -> System.out.printf("Created asset with resource name %s.%n", r));
      return resourceNames;
    }
    // [END add_asset]
  }

  /** Creates an AssetSet. */
  private String createAssetSet(GoogleAdsClient googleAdsClient, AddDynamicPageFeedParams params) {
    // [START add_asset_set]
    // Creates an AssetSet which will be used to link the dynamic page feed assets to a campaign.
    AssetSet assetSet =
        AssetSet.newBuilder()
            .setName("My dynamic page feed " + CodeSampleHelper.getPrintableDateTime())
            .setType(AssetSetType.PAGE_FEED)
            .build();
    // Creates an operation to add the AssetSet.
    AssetSetOperation operation = AssetSetOperation.newBuilder().setCreate(assetSet).build();
    try (AssetSetServiceClient serviceClient =
        googleAdsClient.getLatestVersion().createAssetSetServiceClient()) {
      // Sends the mutate request.
      MutateAssetSetsResponse response =
          serviceClient.mutateAssetSets(
              String.valueOf(params.customerId), ImmutableList.of(operation));
      // Prints some information about the response.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created asset set with resource name %s.%n", resourceName);
      return resourceName;
    }
    // [END add_asset_set]
  }

  /** Adds an Asset to an AssetSet by creating an AssetSetAsset link. */
  private void addAssetsToAssetSet(
      GoogleAdsClient googleAdsClient,
      List<String> assetResourceNames,
      String assetSetResourceName,
      AddDynamicPageFeedParams params) {
    // [START add_asset_set_asset]
    List<AssetSetAssetOperation> operations = new ArrayList<>();
    for (String assetResourceName : assetResourceNames) {
      AssetSetAsset assetSetAsset =
          AssetSetAsset.newBuilder()
              .setAsset(assetResourceName)
              .setAssetSet(assetSetResourceName)
              .build();
      // Creates an operation to add the link.
      AssetSetAssetOperation operation =
          AssetSetAssetOperation.newBuilder().setCreate(assetSetAsset).build();
      operations.add(operation);
    }
    try (AssetSetAssetServiceClient client =
        googleAdsClient.getLatestVersion().createAssetSetAssetServiceClient()) {
      // Sends the mutate request.
      MutateAssetSetAssetsResponse response =
          client.mutateAssetSetAssets(String.valueOf(params.customerId), operations);
      // Prints some information about the response.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created AssetSetAsset link with resource name %s.%n", resourceName);
    }
    // [END add_asset_set_asset]
  }

  /** Links an AssetSet to a Campaign by creating a CampaignAssetSet. */
  private void linkAssetSetToCampaign(
      GoogleAdsClient googleAdsClient,
      String assetSetResourceName,
      AddDynamicPageFeedParams params) {
    // [START add_campaign_asset_set]
    // Creates a CampaignAssetSet representing the link between an AssetSet and a Campaign.
    CampaignAssetSet campaignAssetSet =
        CampaignAssetSet.newBuilder()
            .setCampaign(ResourceNames.campaign(params.customerId, params.campaignId))
            .setAssetSet(assetSetResourceName)
            .build();
    // Creates an operation to add the CampaignAssetSet.
    CampaignAssetSetOperation operation =
        CampaignAssetSetOperation.newBuilder().setCreate(campaignAssetSet).build();
    // Creates the service client.
    try (CampaignAssetSetServiceClient client =
        googleAdsClient.getLatestVersion().createCampaignAssetSetServiceClient()) {
      // Issues the mutate request.
      MutateCampaignAssetSetsResponse response =
          client.mutateCampaignAssetSets(
              String.valueOf(params.customerId), ImmutableList.of(operation));
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created a CampaignAssetSet with resource name %s.%n", resourceName);
    }
    // [END add_campaign_asset_set]
  }

  /** Creates an ad group criterion targeting the DSA label. */
  private static void addDsaTarget(
      GoogleAdsClient googleAdsClient, String dsaPageUrlLabel, AddDynamicPageFeedParams params) {
    // [START add_dsa_target]
    String adGroupResourceName = ResourceNames.adGroup(params.customerId, params.adGroupId);

    // Creates the webpage condition info that targets an advertiser's webpages based on the
    // custom label specified by the dsaPageUrlLabel (e.g. "discounts").
    WebpageConditionInfo webpageConditionInfo =
        WebpageConditionInfo.newBuilder()
            .setOperand(WebpageConditionOperand.CUSTOM_LABEL)
            .setArgument(dsaPageUrlLabel)
            .build();

    // Creates the webpage info, or criterion for targeting webpages of an advertiser's website.
    WebpageInfo webpageInfo =
        WebpageInfo.newBuilder()
            .setCriterionName("Test Criterion")
            .addAllConditions(ImmutableList.of(webpageConditionInfo))
            .build();

    // Creates the ad group criterion.
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setWebpage(webpageInfo)
            .setCpcBidMicros(1_500_000)
            .build();

    // Creates the operation.
    AdGroupCriterionOperation operation =
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();

    // Creates the service client.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Adds the ad group criterion.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(params.customerId), ImmutableList.of(operation));

      // Displays the results.
      System.out.printf(
          "Created ad group criterion with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
    // [END add_dsa_target]
  }
}
