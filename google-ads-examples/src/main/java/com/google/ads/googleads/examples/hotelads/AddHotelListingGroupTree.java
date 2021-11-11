// Copyright 2020 Google LLC
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

package com.google.ads.googleads.examples.hotelads;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v9.common.HotelClassInfo;
import com.google.ads.googleads.v9.common.HotelCountryRegionInfo;
import com.google.ads.googleads.v9.common.ListingDimensionInfo;
import com.google.ads.googleads.v9.common.ListingGroupInfo;
import com.google.ads.googleads.v9.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v9.enums.ListingGroupTypeEnum.ListingGroupType;
import com.google.ads.googleads.v9.errors.GoogleAdsError;
import com.google.ads.googleads.v9.errors.GoogleAdsException;
import com.google.ads.googleads.v9.resources.AdGroupCriterion;
import com.google.ads.googleads.v9.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v9.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v9.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v9.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v9.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.LongStream;

/**
 * This example shows how to add a hotel listing group tree, which has two levels. The first level
 * is partitioned by the hotel class. The second level is partitioned by the country region.
 *
 * <p>Each level is composed of two types of nodes: `UNIT` and `SUBDIVISION`. `UNIT` nodes serve as
 * leaf nodes in a tree and can have bid amount set. `SUBDIVISION` nodes serve as internal nodes
 * where a subtree will be built. The `SUBDIVISION` node cannot have bid amount set. See
 * https://developers.google.com/google-ads/api/docs/hotel-ads/overview for more information.
 *
 * <p>Note: Only one listing group tree can be added per ad group. Attempting to add another listing
 * group tree to an ad group that already has one will fail.
 */
public class AddHotelListingGroupTree {

  private static Iterator<Long> idGenerator;

  private static class AddHotelListingGroupTreeParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    // Specify the CPC bid micro amount to be set on a created ad group criterion.
    // For simplicity, each ad group criterion will use the below amount equally. In practice, you
    // probably want to use different values for each ad group criterion.
    @Parameter(names = ArgumentNames.PERCENT_CPC_BID_MICRO_AMOUNT)
    private Long percentCpcBidMicroAmount = 1_000_000L;
  }

  public static void main(String[] args) {
    AddHotelListingGroupTreeParams params = new AddHotelListingGroupTreeParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      // Optional: To use a different CPC bid micro value from the default (1_000_000), uncomment
      // the line below and insert the desired CPC bid micro value.
      // params.percentCpcBidMicroAmount = Long.parseInt("INSERT_PERCENT_CPC_BID_MICRO_AMOUNT");
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
      new AddHotelListingGroupTree()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.adGroupId,
              params.percentCpcBidMicroAmount);
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
   * Constructor used to create iterator for generating temporary criterion IDs, which are negative
   * integers.
   *
   * <p>When creating a tree, we need to specify the parent-child relationships between nodes.
   * However, until a criterion has been created on the server we do not have a criterion ID with
   * which to refer to it.
   *
   * <p>Instead we can specify temporary IDs that are specific to a single mutate request. Once a
   * criterion is created, it is assigned an ID as normal and the temporary ID will no longer refer
   * to it.
   */
  AddHotelListingGroupTree() {
    idGenerator = LongStream.iterate(-1L, prev -> prev - 1).iterator();
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupId the ID of the ad group.
   * @param percentCpcBidMicroAmount the percent CPC bid micro amount to set on created ad group
   *     criteria.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      long percentCpcBidMicroAmount) {
    List<AdGroupCriterionOperation> operations = new ArrayList<>();

    // Creates the root of the tree as a SUBDIVISION node.
    String rootResourceName =
        addRootNode(customerId, adGroupId, operations, percentCpcBidMicroAmount);

    // Creates child nodes of level 1, partitioned by the hotel class info.
    String otherHotelResourceName =
        addLevel1Nodes(
            customerId, adGroupId, rootResourceName, operations, percentCpcBidMicroAmount);

    // Creates child nodes of level 2, partitioned by the hotel country region info.
    addLevel2Nodes(
        customerId, adGroupId, otherHotelResourceName, operations, percentCpcBidMicroAmount);

    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              String.valueOf(customerId), operations);

      System.out.printf("Added %d listing group info entities.%n", response.getResultsCount());
      for (MutateAdGroupCriterionResult result : response.getResultsList()) {
        System.out.println(result.getAdGroupCriterion().getResourceName());
      }
    }
  }

  /**
   * Creates the root node of the listing group tree and adds its create operation to the operations
   * list.
   *
   * @param customerId the customer ID.
   * @param adGroupId the ad group ID.
   * @param operations the operations.
   * @param percentCpcBidMicroAmount the CPC bid micro amount to set on created ad group criteria.
   * @return the root node's resource name
   */
  private static String addRootNode(
      long customerId,
      long adGroupId,
      List<AdGroupCriterionOperation> operations,
      long percentCpcBidMicroAmount) {
    // Creates the root of the tree as a SUBDIVISION node.
    ListingGroupInfo root =
        ListingGroupInfo.newBuilder().setType(ListingGroupType.SUBDIVISION).build();
    AdGroupCriterion rootAdGroupCriterion =
        createAdGroupCriterion(customerId, adGroupId, root, percentCpcBidMicroAmount);
    AdGroupCriterionOperation operation = generateCreateOperation(rootAdGroupCriterion);
    operations.add(operation);
    return rootAdGroupCriterion.getResourceName();
  }

  /**
   * Creates child nodes of level 1, partitioned by the hotel class info.
   *
   * @param customerId the customer ID.
   * @param adGroupId the ad group ID.
   * @param rootResourceName the resource name of the root node.
   * @param operations the operations list.
   * @param percentCpcBidMicroAmount the CPC bid micro amount to set on created ad group criteria.
   * @return the "other hotel classes" node's resource name, which serves as a parent node for the
   *     next level.
   */
  // [START add_hotel_listing_group_tree]
  private static String addLevel1Nodes(
      long customerId,
      long adGroupId,
      String rootResourceName,
      List<AdGroupCriterionOperation> operations,
      long percentCpcBidMicroAmount) {
    // Creates hotel class info and dimension info for 5-star hotels.
    ListingDimensionInfo fiveStarredDimensionInfo =
        ListingDimensionInfo.newBuilder()
            .setHotelClass(HotelClassInfo.newBuilder().setValue(5).build())
            .build();
    // Creates listing group info for 5-star hotels as a UNIT node.
    ListingGroupInfo fiveStarredUnit =
        ListingGroupInfo.newBuilder()
            .setType(ListingGroupType.UNIT)
            .setParentAdGroupCriterion(rootResourceName)
            .setCaseValue(fiveStarredDimensionInfo)
            .build();
    // Creates an ad group criterion for 5-star hotels.
    AdGroupCriterion fiveStarredAdGroupCriterion =
        createAdGroupCriterion(customerId, adGroupId, fiveStarredUnit, percentCpcBidMicroAmount);
    // Decrements the temp ID for the next ad group criterion.
    AdGroupCriterionOperation operation = generateCreateOperation(fiveStarredAdGroupCriterion);
    operations.add(operation);

    // You can also create more UNIT nodes for other hotel classes by copying the above code in
    // this method and modifying the value passed to HotelClassInfo() to the value you want.
    // For instance, passing 4 instead of 5 in the above code will create a UNIT node of 4-star
    // hotels instead.

    // Creates hotel class info and dimension info for other hotel classes by not specifying
    // any attributes on those object.
    ListingDimensionInfo otherHotelsDimensionInfo =
        ListingDimensionInfo.newBuilder()
            .setHotelClass(HotelClassInfo.newBuilder().build())
            .build();
    // Creates listing group info for other hotel classes as a SUBDIVISION node, which will be
    // used as a parent node for children nodes of the next level.
    ListingGroupInfo otherHotelsSubdivision =
        createListingGroupInfo(
            ListingGroupType.SUBDIVISION, rootResourceName, otherHotelsDimensionInfo);
    // Creates an ad group criterion for other hotel classes.
    AdGroupCriterion otherHotelsAdGroupCriterion =
        createAdGroupCriterion(
            customerId, adGroupId, otherHotelsSubdivision, percentCpcBidMicroAmount);
    operation = generateCreateOperation(otherHotelsAdGroupCriterion);
    operations.add(operation);

    return otherHotelsAdGroupCriterion.getResourceName();
  }
  // [END add_hotel_listing_group_tree]

  /**
   * Creates child nodes of level 2, partitioned by the country region.
   *
   * @param customerId the customer ID.
   * @param adGroupId the ad group ID.
   * @param parentResourceName the resource name of the parent node.
   * @param operations the operations list.
   * @param percentCpcBidMicroAmount the CPC bid micro amount to set on created ad group criteria.
   *     criteria
   */
  private static void addLevel2Nodes(
      long customerId,
      long adGroupId,
      String parentResourceName,
      List<AdGroupCriterionOperation> operations,
      long percentCpcBidMicroAmount) {
    // The criterion ID for Japan is 2392.
    // See https://developers.google.com/google-ads/api/reference/data/geotargets for criteria IDs
    // of other countries.
    long japanGeoTargetConstantId = 2392;
    ListingDimensionInfo japanDimensionInfo =
        ListingDimensionInfo.newBuilder()
            // Creates hotel country region info and dimension info for hotels in Japan.
            .setHotelCountryRegion(
                HotelCountryRegionInfo.newBuilder()
                    .setCountryRegionCriterion(
                        ResourceNames.geoTargetConstant(japanGeoTargetConstantId))
                    .build())
            .build();
    // Creates hotel country region info and dimension info for hotels in Japan.
    ListingGroupInfo japanHotelsUnit =
        createListingGroupInfo(ListingGroupType.UNIT, parentResourceName, japanDimensionInfo);
    // Creates an ad group criterion for hotels in Japan.
    AdGroupCriterion japanHotelsAdGroupCriterion =
        createAdGroupCriterion(customerId, adGroupId, japanHotelsUnit, percentCpcBidMicroAmount);
    // Decrements the temp ID for the next ad group criterion.
    AdGroupCriterionOperation operation = generateCreateOperation(japanHotelsAdGroupCriterion);
    operations.add(operation);

    // Creates hotel class info and dimension info for hotels in other regions.
    ListingDimensionInfo otherHotelRegionsDimensionInfo =
        ListingDimensionInfo.newBuilder()
            .setHotelCountryRegion(HotelCountryRegionInfo.newBuilder().build())
            .build();
    // Creates listing group info for hotels in other regions as a UNIT node.
    // The "others" node is always required for every level of the tree.
    ListingGroupInfo otherHotelRegionsUnit =
        createListingGroupInfo(
            ListingGroupType.UNIT, parentResourceName, otherHotelRegionsDimensionInfo);
    // Creates an ad group criterion for other hotel country regions.
    AdGroupCriterion otherHotelRegionsAdGroupCriterion =
        createAdGroupCriterion(
            customerId, adGroupId, otherHotelRegionsUnit, percentCpcBidMicroAmount);
    operation = generateCreateOperation(otherHotelRegionsAdGroupCriterion);
    operations.add(operation);
  }

  /**
   * Creates the listing group info with the provided parameters.
   *
   * @param listingGroupType the listing group type.
   * @param parentCriterionResourceName the resource name of parent criterion ID of the listing
   *     group info.
   * @param caseValue the dimension info for the listing group.
   * @return the created listing group info
   */
  private static ListingGroupInfo createListingGroupInfo(
      ListingGroupType listingGroupType,
      String parentCriterionResourceName,
      ListingDimensionInfo caseValue) {
    return ListingGroupInfo.newBuilder()
        .setType(listingGroupType)
        .setParentAdGroupCriterion(parentCriterionResourceName)
        .setCaseValue(caseValue)
        .build();
  }

  /**
   * Creates an ad group criterion from the provided listing group info. Bid amount will be set on
   * the created ad group criterion when listing group info type is `UNIT`. Setting bid amount for
   * `SUBDIVISION` types is not allowed.
   *
   * @param customerId the customer ID.
   * @param adGroupId the ad group ID.
   * @param listingGroupInfo the listing group info.
   * @param percentCpcBidMicroAmount the CPC bid micro amount to set for the ad group criterion.
   * @return the created ad group criterion
   */
  private static AdGroupCriterion createAdGroupCriterion(
      long customerId,
      long adGroupId,
      ListingGroupInfo listingGroupInfo,
      long percentCpcBidMicroAmount) {
    AdGroupCriterion.Builder adGroupCriterionBuilder =
        AdGroupCriterion.newBuilder()
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setListingGroup(listingGroupInfo)
            .setResourceName(
                ResourceNames.adGroupCriterion(customerId, adGroupId, idGenerator.next()));

    // Bids are valid only for UNIT nodes.
    if (listingGroupInfo.getType() == ListingGroupType.UNIT) {
      adGroupCriterionBuilder.setPercentCpcBidMicros(percentCpcBidMicroAmount);
    }

    return adGroupCriterionBuilder.build();
  }

  /**
   * Creates an operation for creating the specified ad group criterion.
   *
   * @param adGroupCriterion the ad group criterion to create an operation for.
   * @return the created ad group criterion operation
   */
  private static AdGroupCriterionOperation generateCreateOperation(
      AdGroupCriterion adGroupCriterion) {
    return AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();
  }
}
