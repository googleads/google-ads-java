package com.google.ads.googleads.examples.shoppingads;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v10.enums.ListingGroupFilterProductConditionEnum.ListingGroupFilterProductCondition;
import com.google.ads.googleads.v10.enums.ListingGroupFilterTypeEnum.ListingGroupFilterType;
import com.google.ads.googleads.v10.enums.ListingGroupFilterVerticalEnum.ListingGroupFilterVertical;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.AssetGroupListingGroupFilter;
import com.google.ads.googleads.v10.resources.ListingGroupFilterDimension;
import com.google.ads.googleads.v10.resources.ListingGroupFilterDimension.ProductBrand;
import com.google.ads.googleads.v10.resources.ListingGroupFilterDimension.ProductCondition;
import com.google.ads.googleads.v10.services.AssetGroupListingGroupFilterOperation;
import com.google.ads.googleads.v10.services.GoogleAdsRow;
import com.google.ads.googleads.v10.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v10.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v10.services.MutateGoogleAdsRequest;
import com.google.ads.googleads.v10.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v10.services.MutateOperation;
import com.google.ads.googleads.v10.services.MutateOperationResponse;
import com.google.ads.googleads.v10.services.MutateOperationResponse.ResponseCase;
import com.google.ads.googleads.v10.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v10.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * This example shows how to add product partitions to a Performance Max retail campaign.
 *
 * <p>For Performance Max campaigns, product partitions are represented using the
 * AssetGroupListingGroupFilter resource. This resource can be combined with itself to form a
 * hierarchy that creates a product partition tree.
 *
 * <p>For more information about Performance Max retail campaigns, see the {@link
 * AddPerformanceMaxRetailCampaign} example.
 */
public class AddPerformanceMaxProductListingGroupTree {

  private final int TEMPORARY_ID_LISTING_GROUP_ROOT = -1;

  private static final int PAGE_SIZE = 10_000;

  private static class AddPerformanceMaxProductListingGroupTreeParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.ASSET_GROUP_ID, required = true)
    private Long assetGroupId;

    @Parameter(names = ArgumentNames.REPLACE_EXISTING_TREE, required = true, arity = 1)
    private Boolean replaceExistingTree;
  }

  public static void main(String[] args) throws Exception {
    AddPerformanceMaxProductListingGroupTreeParams params =
        new AddPerformanceMaxProductListingGroupTreeParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.assetGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      // Optional: To replace the existing listing group tree from the asset group set this
      // parameter to true.
      // The option to remove the existing listing group tree. If the current AssetGroup already has
      // a tree of ListingGroupFilters, and you try to add a new set of ListingGroupFilters
      // including a root filter, you'll receive an
      // 'ASSET_GROUP_LISTING_GROUP_FILTER_ERROR_MULTIPLE_ROOTS' error. Setting this option to true
      // will remove the existing tree and prevent this error.
      params.replaceExistingTree = Boolean.parseBoolean("INSERT_REPLACE_EXISTING_TREE_HERE");
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
      new AddPerformanceMaxProductListingGroupTree()
          .runExample(
              googleAdsClient, params.customerId, params.assetGroupId, params.replaceExistingTree);
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
   * A factory that creates MutateOperations for removing an existing tree of
   * AssetGroupListingGroupFilters.
   *
   * <p>AssetGroupListingGroupFilters must be removed in a specific order: all of the children of a
   * filter must be removed before the filter itself, otherwise the API will return an error.
   *
   * <p>This object is intended to be used with an array of MutateOperations to perform a series of
   * related updates to an AssetGroup.
   */
  private static class AssetGroupListingGroupFilterRemoveOperationFactory {
    private String rootResourceName = "";
    private final HashMap<String, HashSet<String>> parentsToChildren = new HashMap<>();

    public AssetGroupListingGroupFilterRemoveOperationFactory(
        List<AssetGroupListingGroupFilter> resources) throws Exception {
      if (resources.isEmpty()) {
        throw new Exception("No listing group filters to remove");
      }

      for (AssetGroupListingGroupFilter filter : resources) {
        // When the node has no parent, it means it's the root node, which is treated differently.
        if (filter.getParentListingGroupFilter().isEmpty() && !this.rootResourceName.isEmpty()) {
          throw new Exception("More than one root node");
        } else if (filter.getParentListingGroupFilter().isEmpty()) {
          this.rootResourceName = filter.getResourceName();
          continue;
        }

        String parentResourceName = filter.getParentListingGroupFilter();
        HashSet<String> siblings;
        // Check to see if we've already visited a sibling in this group, and fetch or create a new
        // set as required.
        if (this.parentsToChildren.containsKey(parentResourceName)) {
          siblings = this.parentsToChildren.get(parentResourceName);
        } else {
          siblings = new HashSet<>();
        }

        siblings.add(filter.getResourceName());
        this.parentsToChildren.put(parentResourceName, siblings);
      }
    }

    // [START add_performance_max_product_listing_group_tree_2]
    /**
     * Creates a list of MutateOperations that remove all of the resources in the tree originally
     * used to create this factory object.
     */
    public List<MutateOperation> removeAll() {
      return removeDescendantsAndFilter(rootResourceName);
    }
    // [END add_performance_max_product_listing_group_tree_2]

    // [START add_performance_max_product_listing_group_tree_3]
    /**
     * Creates a list of MutateOperations that remove all the descendants of the specified
     * AssetGroupListingGroupFilter resource name. The order of removal is post-order, where all the
     * children (and their children, recursively) are removed first. Then, the node itself is
     * removed.
     */
    public List<MutateOperation> removeDescendantsAndFilter(String resourceName) {
      List<MutateOperation> operations = new ArrayList<>();

      if (this.parentsToChildren.containsKey(resourceName)) {
        HashSet<String> children = parentsToChildren.get(resourceName);
        for (String child : children) {
          operations.addAll(removeDescendantsAndFilter(child));
        }
      }

      AssetGroupListingGroupFilterOperation operation =
          AssetGroupListingGroupFilterOperation.newBuilder().setRemove(resourceName).build();
      operations.add(
          MutateOperation.newBuilder().setAssetGroupListingGroupFilterOperation(operation).build());
      return operations;
    }
  }
  // [END add_performance_max_product_listing_group_tree_3]

  /**
   * A factory that creates MutateOperations wrapping AssetGroupListingGroupFilterMutateOperations
   * for a specific customerId and assetGroupId.
   *
   * <p>This object is intended to be used with an array of MutateOperations to perform an atomic
   * update to an AssetGroup.
   */
  private static class AssetGroupListingGroupFilterCreateOperationFactory {
    private final long customerId;
    private final long assetGroupId;
    private final long rootListingGroupId;
    private long nextId;

    public AssetGroupListingGroupFilterCreateOperationFactory(
        long customerId, long assetGroupId, long rootListingGroupId) {
      this.customerId = customerId;
      this.assetGroupId = assetGroupId;
      this.rootListingGroupId = rootListingGroupId;
      this.nextId = this.rootListingGroupId;
    }

    /**
     * Returns a new temporary ID to be used for a resource name in a MutateOperation. See
     * https://developers.google.com/google-ads/api/docs/mutating/best-practices#temporary_resource_names
     * for details about temporary IDs.
     */
    public long getNextId() {
      return --nextId;
    }

    // [START add_performance_max_product_listing_group_tree_4]
    /**
     * Creates a MutateOperation that creates a root AssetGroupListingGroupFilter for the factory's
     * AssetGroup.
     *
     * <p>The root node or partition is the default, which is displayed as "All Products".
     */
    public MutateOperation createRoot() {
      AssetGroupListingGroupFilter listingGroupFilter =
          AssetGroupListingGroupFilter.newBuilder()
              .setResourceName(
                  ResourceNames.assetGroupListingGroupFilter(
                      customerId, assetGroupId, rootListingGroupId))
              .setAssetGroup(ResourceNames.assetGroup(customerId, assetGroupId))
              // Since this is the root node, do not set the ParentListingGroupFilter. For all other
              // nodes, this would refer to the parent listing group filter resource name.
              // ParentListingGroupFilter = "<PARENT FILTER NAME>"
              //
              // Unlike AddPerformanceMaxRetailCampaign, the type for the root node here must be
              // Subdivision because we add child partitions under it.
              .setType(ListingGroupFilterType.SUBDIVISION)
              // Because this is a Performance Max campaign for retail, we need to specify that this
              // is in the shopping vertical.
              .setVertical(ListingGroupFilterVertical.SHOPPING)
              // Note the case_value is not set because it should be undefined for the root node.
              .build();
      AssetGroupListingGroupFilterOperation operation =
          AssetGroupListingGroupFilterOperation.newBuilder().setCreate(listingGroupFilter).build();
      return MutateOperation.newBuilder()
          .setAssetGroupListingGroupFilterOperation(operation)
          .build();
    }
    // [END add_performance_max_product_listing_group_tree_4]

    // [START add_performance_max_product_listing_group_tree_5]
    /**
     * Creates a MutateOperation that creates an intermediate AssetGroupListingGroupFilter for the
     * factory's AssetGroup.
     *
     * <p>Use this method if the filter will have child filters. Otherwise, use the CreateUnit
     * method.
     *
     * @param parent the ID of the parent AssetGroupListingGroupFilter.
     * @param id the ID of AssetGroupListingGroupFilter that will be created.
     * @param dimension the dimension to associate with the AssetGroupListingGroupFilter.
     */
    public MutateOperation createSubdivision(
        long parent, long id, ListingGroupFilterDimension dimension) {
      AssetGroupListingGroupFilter listingGroupFilter =
          AssetGroupListingGroupFilter.newBuilder()
              .setResourceName(
                  ResourceNames.assetGroupListingGroupFilter(customerId, assetGroupId, id))
              .setAssetGroup(ResourceNames.assetGroup(customerId, assetGroupId))
              .setParentListingGroupFilter(
                  ResourceNames.assetGroupListingGroupFilter(customerId, assetGroupId, parent))
              // We must use the Subdivision type to indicate that the AssetGroupListingGroupFilter
              // will have children.
              .setType(ListingGroupFilterType.SUBDIVISION)
              // Because this is a Performance Max campaign for retail, we need to specify that this
              // is in the shopping vertical.
              .setVertical(ListingGroupFilterVertical.SHOPPING)
              .setCaseValue(dimension)
              .build();
      AssetGroupListingGroupFilterOperation filterOperation =
          AssetGroupListingGroupFilterOperation.newBuilder().setCreate(listingGroupFilter).build();
      return MutateOperation.newBuilder()
          .setAssetGroupListingGroupFilterOperation(filterOperation)
          .build();
    }
    // [END add_performance_max_product_listing_group_tree_5]

    // [START add_performance_max_product_listing_group_tree_6]
    /**
     * Creates a MutateOperation that creates a child AssetGroupListingGroupFilter for the factory's
     * AssetGroup.
     *
     * <p>Use this method if the filter won't have child filters. Otherwise, use the
     * createSubdivision method.
     *
     * @param parent the ID of the parent AssetGroupListingGroupFilter.
     * @param id the ID of AssetGroupListingGroupFilter that will be created.
     * @param dimension the dimension to associate with the AssetGroupListingGroupFilter.
     */
    public MutateOperation createUnit(long parent, long id, ListingGroupFilterDimension dimension) {
      AssetGroupListingGroupFilter listingGroupFilter =
          AssetGroupListingGroupFilter.newBuilder()
              .setResourceName(
                  ResourceNames.assetGroupListingGroupFilter(customerId, assetGroupId, id))
              .setAssetGroup(ResourceNames.assetGroup(customerId, assetGroupId))
              .setParentListingGroupFilter(
                  ResourceNames.assetGroupListingGroupFilter(customerId, assetGroupId, parent))
              // We must use the UnitIncluded type to indicate that the AssetGroupListingGroupFilter
              // won't have children.
              .setType(ListingGroupFilterType.UNIT_INCLUDED)
              // Because this is a Performance Max campaign for retail, we need to specify that this
              // is in the shopping vertical.
              .setVertical(ListingGroupFilterVertical.SHOPPING)
              .setCaseValue(dimension)
              .build();
      AssetGroupListingGroupFilterOperation filterOperation =
          AssetGroupListingGroupFilterOperation.newBuilder().setCreate(listingGroupFilter).build();
      return MutateOperation.newBuilder()
          .setAssetGroupListingGroupFilterOperation(filterOperation)
          .build();
    }
    // [END add_performance_max_product_listing_group_tree_6]
  }

  // [START add_performance_max_product_listing_group_tree]
  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param assetGroupId the asset group id for the Performance Max campaign.
   * @param replaceExistingTree option to remove existing product tree from the passed in asset
   *     group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long assetGroupId,
      boolean replaceExistingTree)
      throws Exception {
    String assetGroupResourceName = ResourceNames.assetGroup(customerId, assetGroupId);

    List<MutateOperation> operations = new ArrayList<>();

    if (replaceExistingTree) {
      List<AssetGroupListingGroupFilter> existingListingGroupFilters =
          getAllExistingListingGroupFilterAssetsInAssetGroup(
              googleAdsClient, customerId, assetGroupResourceName);

      if (!existingListingGroupFilters.isEmpty()) {
        // A special factory object that ensures the creation of remove operations in the
        // correct order (child listing group filters must be removed before their parents).
        AssetGroupListingGroupFilterRemoveOperationFactory removeOperationFactory =
            new AssetGroupListingGroupFilterRemoveOperationFactory(existingListingGroupFilters);

        operations.addAll(removeOperationFactory.removeAll());
      }
    }

    // We use a factory to create all the MutateOperations that manipulate a specific
    // AssetGroup for a specific customer. The operations returned by the factory's methods
    // are used to construct a new tree of filters. These filters can have parent-child
    // relationships, and also include a special root that includes all children.
    //
    // When creating these filters, we use temporary IDs to create the hierarchy between
    // each of the nodes in the tree, beginning with the root listing group filter.
    //
    // The factory created below is specific to a customerId and assetGroupId.
    AssetGroupListingGroupFilterCreateOperationFactory createOperationFactory =
        new AssetGroupListingGroupFilterCreateOperationFactory(
            customerId, assetGroupId, TEMPORARY_ID_LISTING_GROUP_ROOT);

    // Creates the operation to add the root node of the tree.
    operations.add(createOperationFactory.createRoot());

    // Creates an operation to add a leaf node for new products.
    ListingGroupFilterDimension newProductDimension =
        ListingGroupFilterDimension.newBuilder()
            .setProductCondition(
                ProductCondition.newBuilder()
                    .setCondition(ListingGroupFilterProductCondition.NEW)
                    .build())
            .build();
    operations.add(
        createOperationFactory.createUnit(
            TEMPORARY_ID_LISTING_GROUP_ROOT,
            createOperationFactory.getNextId(),
            newProductDimension));

    // Creates an operation to add a leaf node for used products.
    ListingGroupFilterDimension usedProductDimension =
        ListingGroupFilterDimension.newBuilder()
            .setProductCondition(
                ProductCondition.newBuilder()
                    .setCondition(ListingGroupFilterProductCondition.USED)
                    .build())
            .build();
    operations.add(
        createOperationFactory.createUnit(
            TEMPORARY_ID_LISTING_GROUP_ROOT,
            createOperationFactory.getNextId(),
            usedProductDimension));

    // This represents the ID of the "other" category in the ProductCondition subdivision. We save
    // this ID because the node with this ID will be further partitioned, and this ID will serve as
    // the parent ID for subsequent child nodes of the "other" category.
    long otherSubdivisionId = createOperationFactory.getNextId();

    // Creates an operation to add a subdivision node for other products in the ProductCondition
    // subdivision.
    ListingGroupFilterDimension otherProductDimension =
        ListingGroupFilterDimension.newBuilder()
            .setProductCondition(ProductCondition.newBuilder().build())
            .build();
    operations.add(
        // We call createSubdivision because this listing group will have children.
        createOperationFactory.createSubdivision(
            TEMPORARY_ID_LISTING_GROUP_ROOT, otherSubdivisionId, otherProductDimension));

    // Creates an operation to add a leaf node for products with the brand "CoolBrand".
    ListingGroupFilterDimension coolBrandProductDimension =
        ListingGroupFilterDimension.newBuilder()
            .setProductBrand(ProductBrand.newBuilder().setValue("CoolBrand").build())
            .build();
    operations.add(
        createOperationFactory.createUnit(
            otherSubdivisionId, createOperationFactory.getNextId(), coolBrandProductDimension));

    // Creates an operation to add a leaf node for products with the brand "CheapBrand".
    ListingGroupFilterDimension cheapBrandProductDimension =
        ListingGroupFilterDimension.newBuilder()
            .setProductBrand(ProductBrand.newBuilder().setValue("CheapBrand").build())
            .build();
    operations.add(
        createOperationFactory.createUnit(
            otherSubdivisionId, createOperationFactory.getNextId(), cheapBrandProductDimension));

    // Creates an operation to add a leaf node for other products in the ProductBrand subdivision.
    ListingGroupFilterDimension otherBrandProductDimension =
        ListingGroupFilterDimension.newBuilder()
            .setProductBrand(ProductBrand.newBuilder().build())
            .build();
    operations.add(
        createOperationFactory.createUnit(
            otherSubdivisionId, createOperationFactory.getNextId(), otherBrandProductDimension));

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      MutateGoogleAdsRequest request =
          MutateGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .addAllMutateOperations(operations)
              .build();
      MutateGoogleAdsResponse response = googleAdsServiceClient.mutate(request);
      printResponseDetails(request, response);
    }
  }
  // [END add_performance_max_product_listing_group_tree]

  // [START add_performance_max_product_listing_group_tree_7]
  /**
   * Fetches all of the listing group filters in an asset group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param assetGroupResourceName the resource name of the asset group.
   */
  private List<AssetGroupListingGroupFilter> getAllExistingListingGroupFilterAssetsInAssetGroup(
      GoogleAdsClient googleAdsClient, long customerId, String assetGroupResourceName) {
    String query =
        "SELECT "
            + "asset_group_listing_group_filter.resource_name, "
            + "asset_group_listing_group_filter.parent_listing_group_filter "
            + "FROM asset_group_listing_group_filter "
            + "WHERE "
            + "asset_group_listing_group_filter.asset_group = '"
            + assetGroupResourceName
            + "'";
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(Long.toString(customerId))
            .setPageSize(PAGE_SIZE)
            .setQuery(query)
            .build();

    List<AssetGroupListingGroupFilter> resources = new ArrayList<>();
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        resources.add(googleAdsRow.getAssetGroupListingGroupFilter());
      }
    }
    return resources;
  }
  // [END add_performance_max_product_listing_group_tree_7]

  /**
   * Prints the details of a MutateGoogleAdsResponse.
   *
   * @param request a MutateGoogleAdsRequest instance.
   * @param response a MutateGoogleAdsResponse instance.
   */
  private void printResponseDetails(
      MutateGoogleAdsRequest request, MutateGoogleAdsResponse response) {
    // Parse the Mutate response to print details about the entities that were removed and/or
    // created in the request.
    for (int i = 0; i < response.getMutateOperationResponsesCount(); i++) {
      MutateOperation operationRequest = request.getMutateOperations(i);
      MutateOperationResponse operationResponse = response.getMutateOperationResponses(i);


      if (operationResponse.getResponseCase()
          != ResponseCase.ASSET_GROUP_LISTING_GROUP_FILTER_RESULT) {
        String entityName = operationResponse.getResponseCase().toString();
        // Trim the substring "_RESULT" from the end of the entity name.
        entityName = entityName.substring(0, entityName.lastIndexOf("_RESULT"));
        System.out.printf("Unsupported entity type: %s%n", entityName);
      }

      String resourceName =
          operationResponse.getAssetGroupListingGroupFilterResult().getResourceName();
      AssetGroupListingGroupFilterOperation assetOperation =
          operationRequest.getAssetGroupListingGroupFilterOperation();

      String operationType =
          StringUtils.capitalize(assetOperation.getOperationCase().toString().toLowerCase());
      System.out.printf(
          "%sd a(n) AssetGroupListingGroupFilter with resource name: '%s'%n",
          operationType, resourceName);
    }
  }
}
