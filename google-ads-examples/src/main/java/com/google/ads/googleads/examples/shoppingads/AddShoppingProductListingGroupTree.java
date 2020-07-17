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

package com.google.ads.googleads.examples.shoppingads;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v4.common.ListingDimensionInfo;
import com.google.ads.googleads.v4.common.ListingGroupInfo;
import com.google.ads.googleads.v4.common.ProductBrandInfo;
import com.google.ads.googleads.v4.common.ProductConditionInfo;
import com.google.ads.googleads.v4.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v4.enums.ListingGroupTypeEnum.ListingGroupType;
import com.google.ads.googleads.v4.enums.ProductConditionEnum.ProductCondition;
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.resources.AdGroupCriterion;
import com.google.ads.googleads.v4.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v4.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v4.services.GoogleAdsRow;
import com.google.ads.googleads.v4.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v4.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v4.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v4.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v4.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v4.utils.ResourceNames;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Adds a shopping listing group tree to a shopping ad group. The example will clear an existing
 * listing group tree and rebuild it include the following tree structure:
 *
 * <pre>
 * ProductCanonicalCondition NEW $0.20
 * ProductCanonicalCondition USED $0.10
 * ProductCanonicalCondition null (everything else)
 *  ProductBrand CoolBrand $0.90
 *  ProductBrand CheapBrand $0.01
 *  ProductBrand null (everything else) $0.50
 * </pre>
 */
public class AddShoppingProductListingGroupTree {

  private static final int PAGE_SIZE = 1_000;

  private static class AddShoppingListingGroupParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.REPLACE_EXISTING_TREE, required = true, arity = 1)
    private Boolean replaceExistingTree;
  }

  public static void main(String[] args) {
    AddShoppingListingGroupParams params = new AddShoppingListingGroupParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      // Optional: To replace the existing listing group tree on an ad group set this parameter to
      // true.
      // This option will remove the existing listing group tree before creating a replacement.
      params.replaceExistingTree = Boolean.parseBoolean("INSERT_REPLACE_EXISTING_TREE_HERE");
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new AddShoppingProductListingGroupTree()
          .runExample(
              googleAdsClient, params.customerId, params.adGroupId, params.replaceExistingTree);
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
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupId the ID of the ad group.
   * @param replaceExistingTree replace the existing listing group tree on the ad group, if it
   *     already exists. The example will throw a 'LISTING_GROUP_ALREADY_EXISTS' error if listing
   *     group tree already exists and this option is not set to true.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      boolean replaceExistingTree) {
    // 1) Optional: Removes the existing listing group tree, if it already exists on the ad group.
    if (replaceExistingTree) {
      removeListingGroupTree(googleAdsClient, customerId, adGroupId);
    }
    // Creates a list of ad group criterion to add.q
    List<AdGroupCriterionOperation> operations = new ArrayList<>();

    // 2) Constructs the listing group tree "root" node.

    // Subdivision node: (Root node)
    AdGroupCriterion adGroupCriterionRoot =
        createListingGroupSubdivisionRoot(customerId, adGroupId, -1L);
    // Get the resource name that will be used for the root node.
    // This resource has not been created yet and will include the temporary ID as part of the
    // criterion ID.
    String adGroupCriterionResourceNameRoot = adGroupCriterionRoot.getResourceName();
    operations.add(AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterionRoot).build());

    // 3) Construct the listing group unit nodes for NEW, USED and other

    // Biddable Unit node: (Condition NEW node)
    // * Product Condition: NEW
    // * CPC bid: $0.20
    AdGroupCriterion adGroupCriterionConditionNew =
        createListingGroupUnitBiddable(
            customerId,
            adGroupId,
            adGroupCriterionResourceNameRoot,
            ListingDimensionInfo.newBuilder()
                .setProductCondition(
                    ProductConditionInfo.newBuilder().setCondition(ProductCondition.NEW).build())
                .build(),
            200_000L);
    operations.add(
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterionConditionNew).build());

    // Biddable Unit node: (Condition USED node)
    // * Product Condition: USED
    // * CPC bid: $0.10
    AdGroupCriterion adGroupCriterionConditionUsed =
        createListingGroupUnitBiddable(
            customerId,
            adGroupId,
            adGroupCriterionResourceNameRoot,
            ListingDimensionInfo.newBuilder()
                .setProductCondition(
                    ProductConditionInfo.newBuilder().setCondition(ProductCondition.USED).build())
                .build(),
            100_000L);
    operations.add(
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterionConditionUsed).build());

    // Sub-division node: (Condition "other" node)
    // * Product Condition: (not specified)
    AdGroupCriterion adGroupCriterionConditionOther =
        createListingGroupSubdivision(
            customerId,
            adGroupId,
            -2L,
            adGroupCriterionResourceNameRoot,
            ListingDimensionInfo.newBuilder()
                // All sibling nodes must have the same dimension type, even if they don't contain a
                // bid.
                // parent
                .setProductCondition(ProductConditionInfo.newBuilder().build())
                .build());
    // Gets the resource name that will be used for the condition other node.
    // This resource has not been created yet and will include the temporary ID as part of the
    // criterion ID.
    String adGroupCriterionResourceNameConditionOther =
        adGroupCriterionConditionOther.getResourceName();
    operations.add(
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterionConditionOther).build());

    // 4) Constructs the listing group unit nodes for CoolBrand, CheapBrand and other

    // Biddable Unit node: (Brand CoolBrand node)
    // * Brand: CoolBrand
    // * CPC bid: $0.90
    AdGroupCriterion adGroupCriterionBrandCoolBrand =
        createListingGroupUnitBiddable(
            customerId,
            adGroupId,
            adGroupCriterionResourceNameConditionOther,
            ListingDimensionInfo.newBuilder()
                .setProductBrand(
                    ProductBrandInfo.newBuilder().setValue(StringValue.of("CoolBrand")).build())
                .build(),
            900_000L);
    operations.add(
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterionBrandCoolBrand).build());

    // Biddable Unit node: (Brand CheapBrand node)
    // * Brand: CheapBrand
    // * CPC bid: $0.01
    AdGroupCriterion adGroupCriterionBrandCheapBrand =
        createListingGroupUnitBiddable(
            customerId,
            adGroupId,
            adGroupCriterionResourceNameConditionOther,
            ListingDimensionInfo.newBuilder()
                .setProductBrand(
                    ProductBrandInfo.newBuilder().setValue(StringValue.of("CheapBrand")).build())
                .build(),
            10_000L);
    operations.add(
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterionBrandCheapBrand).build());

    // Biddable Unit node: (Brand other node)
    // * Brand: CheapBrand
    // * CPC bid: $0.01
    AdGroupCriterion adGroupCriterionBrandOther =
        createListingGroupUnitBiddable(
            customerId,
            adGroupId,
            adGroupCriterionResourceNameConditionOther,
            ListingDimensionInfo.newBuilder()
                .setProductBrand(ProductBrandInfo.newBuilder().build())
                .build(),
            50_000L);
    operations.add(
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterionBrandOther).build());

    // Issues a mutate request to add the ad group criterion to the ad group.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      List<MutateAdGroupCriterionResult> mutateAdGroupCriteriaResults =
          adGroupCriterionServiceClient
              .mutateAdGroupCriteria(Long.toString(customerId), operations)
              .getResultsList();
      for (MutateAdGroupCriterionResult mutateAdGroupCriterionResult :
          mutateAdGroupCriteriaResults) {
        System.out.printf(
            "Added ad group criterion for listing group with resource name: '%s'%n",
            mutateAdGroupCriterionResult.getResourceName());
      }
    }
  }

  /**
   * Removes all the ad group criteria that define the existing listing group tree for an ad group.
   * Returns without an error if all listing group criterion are successfully removed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupId the ID of the ad group that the new listing group tree will be removed from.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void removeListingGroupTree(
      GoogleAdsClient googleAdsClient, long customerId, long adGroupId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String searchQuery =
          "SELECT ad_group_criterion.resource_name "
              + "FROM ad_group_criterion "
              + "WHERE ad_group_criterion.type = LISTING_GROUP "
              + "AND ad_group_criterion.listing_group.parent_ad_group_criterion IS NULL "
              + String.format("AND ad_group.id = %d", adGroupId);

      // Creates a request that will retrieve all listing groups where the parent ad group criterion
      // is NULL (and hence the root node in the tree) for a given ad group id.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(searchQuery)
              .build();

      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Iterates over all rows in all pages to find the ad group criterion to remove.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AdGroupCriterion adGroupCriterion = googleAdsRow.getAdGroupCriterion();
        System.out.printf(
            "Found ad group criterion with the resource name: '%s'.%n",
            adGroupCriterion.getResourceName());

        AdGroupCriterionOperation operation =
            AdGroupCriterionOperation.newBuilder()
                .setRemove(adGroupCriterion.getResourceName())
                .build();

        try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
            googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
          MutateAdGroupCriteriaResponse response =
              adGroupCriterionServiceClient.mutateAdGroupCriteria(
                  Long.toString(customerId), Collections.singletonList(operation));
          System.out.printf("Removed %d ad group criteria.%n", response.getResultsCount());
        }
      }
    }
  }

  /**
   * Creates a new criterion containing a biddable unit listing group node.
   *
   * @param customerId the client customer ID.
   * @param adGroupId the ID of the ad group.
   * @param parentAdGroupCriterionResourceName the resource name of the parent of this criterion.
   * @param listingDimensionInfo the ListingDimensionInfo to be set for this listing group.
   * @param cpcBidMicros the CPC bid for items in this listing group. This value should be specified
   *     in micros.
   * @return the ad group criterion object that contains the biddable unit listing group node.
   */
  private AdGroupCriterion createListingGroupUnitBiddable(
      long customerId,
      long adGroupId,
      String parentAdGroupCriterionResourceName,
      ListingDimensionInfo listingDimensionInfo,
      long cpcBidMicros) {

    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);
    // Note: There are two approaches for creating new unit nodes:
    // (1) Set the ad group resource name on the criterion (no temporary ID required).
    // (2) Use a temporary ID to construct the criterion resource name and set it using
    // setResourceName.
    // In both cases you must set the parentAdGroupCriterionResourceName on the listing
    // group for non-root nodes.
    // This example demonstrates method (1).
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            // The ad group the listing group will be attached to.
            .setAdGroup(StringValue.of(adGroupResourceName))
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setListingGroup(
                ListingGroupInfo.newBuilder()
                    // Sets the type as a UNIT, which will allow the group to be biddable.
                    .setType(ListingGroupType.UNIT)
                    // Sets the ad group criterion resource name for the parent listing group.
                    // This can include a temporary ID if the parent criterion is not yet created.
                    // Use StringValue to convert from a String to a compatible argument type.
                    .setParentAdGroupCriterion(StringValue.of(parentAdGroupCriterionResourceName))
                    // Case values contain the listing dimension used for the node.
                    .setCaseValue(listingDimensionInfo)
                    .build())
            // Sets the bid for this listing group unit.
            // This will be used as the CPC bid for items that are included in this listing group
            .setCpcBidMicros(Int64Value.of(cpcBidMicros))
            .build();

    return adGroupCriterion;
  }

  /**
   * Creates a new criterion containing a subdivision listing group node.
   *
   * @param customerId the client customer ID.
   * @param adGroupId the ID of the ad group.
   * @param adGroupCriterionId the ID of the criterion. This value will used to construct the
   *     resource name. This can be a negative number if the criterion is yet to be created.
   * @param parentAdGroupCriterionResourceName the resource name of the parent of this criterion.
   * @param listingDimensionInfo the ListingDimensionInfo to be set for this listing group.
   * @return the ad group criterion object that contains the subdivision listing group node.
   */
  private AdGroupCriterion createListingGroupSubdivision(
      long customerId,
      long adGroupId,
      long adGroupCriterionId,
      String parentAdGroupCriterionResourceName,
      ListingDimensionInfo listingDimensionInfo) {

    String adGroupCriterionResourceName =
        ResourceNames.adGroupCriterion(customerId, adGroupId, adGroupCriterionId);
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            // The resource name the criterion will be created with. This will define the ID for the
            // ad group criterion.
            .setResourceName(adGroupCriterionResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setListingGroup(
                ListingGroupInfo.newBuilder()
                    // Sets the type as a SUBDIVISION, which will allow the node to be the parent of
                    // another sub-tree.
                    .setType(ListingGroupType.SUBDIVISION)
                    // Sets the ad group criterion resource name for the parent listing group.
                    // This can include a temporary ID if the parent criterion is not yet created.
                    // Uses StringValue to convert from a String to a compatible argument type.
                    .setParentAdGroupCriterion(StringValue.of(parentAdGroupCriterionResourceName))
                    // Case values contain the listing dimension used for the node.
                    .setCaseValue(listingDimensionInfo)
                    .build())
            .build();

    return adGroupCriterion;
  }

  /**
   * Creates a new criterion containing a root subdivision listing group node.
   *
   * @param customerId the client customer ID.
   * @param adGroupId the ID of the ad group.
   * @param adGroupCriterionId the ID of the criterion. This value will used to construct the
   *     resource name. This can be a negative number if the criterion is yet to be created.
   * @return the ad group criterion object that contains the listing group root node.
   */
  private AdGroupCriterion createListingGroupSubdivisionRoot(
      long customerId, long adGroupId, long adGroupCriterionId) {

    String adGroupCriterionResourceName =
        ResourceNames.adGroupCriterion(customerId, adGroupId, adGroupCriterionId);
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            // The resource name the criterion will be created with. This will define the ID for the
            // ad group criterion.
            .setResourceName(adGroupCriterionResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setListingGroup(
                ListingGroupInfo.newBuilder()
                    // Sets the type as a SUBDIVISION, which will allow the node to be the parent of
                    // another sub-tree.
                    .setType(ListingGroupType.SUBDIVISION)
                    .build())
            .build();

    return adGroupCriterion;
  }
}
