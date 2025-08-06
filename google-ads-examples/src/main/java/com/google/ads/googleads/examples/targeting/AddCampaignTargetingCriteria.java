// Copyright 2018 Google LLC
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

package com.google.ads.googleads.examples.targeting;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v21.common.AddressInfo;
import com.google.ads.googleads.v21.common.KeywordInfo;
import com.google.ads.googleads.v21.common.ProximityInfo;
import com.google.ads.googleads.v21.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v21.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits;
import com.google.ads.googleads.v21.errors.GoogleAdsError;
import com.google.ads.googleads.v21.errors.GoogleAdsException;
import com.google.ads.googleads.v21.resources.CampaignCriterion;
import com.google.ads.googleads.v21.resources.CampaignCriterion.Builder;
import com.google.ads.googleads.v21.services.CampaignCriterionOperation;
import com.google.ads.googleads.v21.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v21.services.MutateCampaignCriteriaResponse;
import com.google.ads.googleads.v21.services.MutateCampaignCriterionResult;
import com.google.ads.googleads.v21.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Adds campaign targeting criteria. To get campaign targeting criteria, run
 * GetCampaignTargetingCriteria.java.
 */
public class AddCampaignTargetingCriteria {

  private static class AddCampaignTargetingCriteriaParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.KEYWORD_TEXT, required = true)
    private String keywordText;

    @Parameter(
        names = ArgumentNames.LOCATION_ID,
        required = true,
        description =
            "A location criterion ID. For example, specify 21167 for New York. For more information"
                + " on determining this value, see: "
                + " https://developers.google.com/google-ads/api/reference/data/geotargets.")
    private Long locationId;
  }

  public static void main(String[] args) {
    AddCampaignTargetingCriteriaParams params = new AddCampaignTargetingCriteriaParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.keywordText = "INSERT_KEYWORD_HERE";
      params.locationId = Long.parseLong("INSERT_LOCATION_ID_HERE");
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
      new AddCampaignTargetingCriteria()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.campaignId,
              params.keywordText,
              params.locationId);
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

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param campaignId the campaign ID in which to create criterion.
   * @param keywordText the keyword text for which to add a criterion.
   * @param locationId the locationId for which to add a criterion.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long campaignId,
      String keywordText,
      long locationId) {
    String campaignResourceName = ResourceNames.campaign(customerId, campaignId);

    List<CampaignCriterionOperation> operations =
        ImmutableList.of(
            CampaignCriterionOperation.newBuilder()
                .setCreate(buildNegativeKeywordCriterion(keywordText, campaignResourceName))
                .build(),
            CampaignCriterionOperation.newBuilder()
                .setCreate(buildLocationIdCriterion(locationId, campaignResourceName))
                .build(),
            CampaignCriterionOperation.newBuilder()
                .setCreate(buildProximityLocation(campaignResourceName))
                .build());

    try (CampaignCriterionServiceClient campaignCriterionServiceClient =
        googleAdsClient.getLatestVersion().createCampaignCriterionServiceClient()) {
      MutateCampaignCriteriaResponse response =
          campaignCriterionServiceClient.mutateCampaignCriteria(
              Long.toString(customerId), operations);
      System.out.printf("Added %d campaign criteria:%n", response.getResultsCount());
      for (MutateCampaignCriterionResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }

  /**
   * Creates a negative keyword as a campaign targeting criterion.
   *
   * @param keywordText the keyword text to exclude.
   * @param campaignResourceName the campaign where the keyword will be excluded.
   * @return a campaign criterion object with the negative keyword targeting.
   */
  private static CampaignCriterion buildNegativeKeywordCriterion(
      String keywordText, String campaignResourceName) {
    return CampaignCriterion.newBuilder()
        .setCampaign(campaignResourceName)
        .setNegative(true)
        .setKeyword(
            KeywordInfo.newBuilder()
                .setMatchType(KeywordMatchType.BROAD)
                .setText(keywordText)
                .build())
        .build();
  }

  /**
   * Creates a location constant (provided by GeoTargetConstantService) as a campaign targeting
   * criterion. Please refer to GetGeoTargetConstantsByName.java for retrieval of location
   * constants.
   *
   * @param locationId the location to target.
   * @param campaignResourceName the campaign resource name to target.
   * @return a campaign criterion object with the specified locationId and resource name.
   */
  // [START add_campaign_targeting_criteria]
  private static CampaignCriterion buildLocationIdCriterion(
      long locationId, String campaignResourceName) {
    Builder criterionBuilder = CampaignCriterion.newBuilder().setCampaign(campaignResourceName);

    criterionBuilder
        .getLocationBuilder()
        .setGeoTargetConstant(ResourceNames.geoTargetConstant(locationId));

    return criterionBuilder.build();
  }
  // [END add_campaign_targeting_criteria]

  /**
   * Creates a campaign criterion from an address and proximity radius.
   *
   * @param campaignResourceName the campaign resource name to target.
   * @return a campaign criterion object with the specified address and targeting radius.
   */
  // [START add_campaign_targeting_criteria_1]
  private static CampaignCriterion buildProximityLocation(String campaignResourceName) {
    Builder builder = CampaignCriterion.newBuilder().setCampaign(campaignResourceName);

    ProximityInfo.Builder proximityBuilder = builder.getProximityBuilder();
    proximityBuilder.setRadius(10.0).setRadiusUnits(ProximityRadiusUnits.MILES);

    AddressInfo.Builder addressBuilder = proximityBuilder.getAddressBuilder();
    addressBuilder
        .setStreetAddress("38 avenue de l'Opéra")
        .setCityName("Paris")
        .setPostalCode("75002")
        .setCountryCode("FR");

    return builder.build();
  }
  // [END add_campaign_targeting_criteria_1]
}
