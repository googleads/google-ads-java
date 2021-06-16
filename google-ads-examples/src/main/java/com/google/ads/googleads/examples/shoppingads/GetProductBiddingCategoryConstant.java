// Copyright 2019 Google LLC
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
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.ProductBiddingCategoryConstant;
import com.google.ads.googleads.v8.services.GoogleAdsRow;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v8.services.SearchGoogleAdsRequest;
import com.google.api.client.util.Preconditions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Fetches the set of valid ProductBiddingCategories. */
public class GetProductBiddingCategoryConstant {

  private static final int PAGE_SIZE = 1_000;

  private static class GetProductBiddingCategoryConstantParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    Long customerId;
  }

  public static void main(String args[]) {
    GetProductBiddingCategoryConstantParams params = new GetProductBiddingCategoryConstantParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("ENTER_CUSTOMER_ID_HERE");
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
      new GetProductBiddingCategoryConstant().runExample(googleAdsClient, params.customerId);
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
   * @param customerId the client customer ID.
   */
  private static void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates the query.
    String query =
        "SELECT "
            + "product_bidding_category_constant.localized_name, "
            + "product_bidding_category_constant.product_bidding_category_constant_parent "
            + "FROM "
            + "product_bidding_category_constant "
            + "WHERE "
            + "product_bidding_category_constant.country_code IN ('US') "
            + "ORDER BY "
            + "product_bidding_category_constant.localized_name ASC";

    // Creates the request.
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setPageSize(PAGE_SIZE)
            .setCustomerId(Long.toString(customerId))
            .setQuery(query)
            .build();

    // Creates the Google Ads Service Client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Creates a list of top level category nodes.
      List<CategoryNode> rootCategories = new ArrayList<>();
      // Creates a map of category ID to category node for all categories found in the results.
      // This Map is a convenience lookup to enable fast retrieval of existing nodes.
      Map<String, CategoryNode> biddingCategories = new HashMap<>();

      // Performs the search request.
      SearchPagedResponse response = googleAdsServiceClient.search(request);
      for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
        ProductBiddingCategoryConstant productBiddingCategory =
            googleAdsRow.getProductBiddingCategoryConstant();

        String localizedName = productBiddingCategory.getLocalizedName();
        String resourceName = productBiddingCategory.getResourceName();
        CategoryNode node = biddingCategories.get(resourceName);
        if (node == null) {
          node = new CategoryNode(resourceName, localizedName);
          biddingCategories.put(resourceName, node);
        } else if (node.getLocalizedName() == null) {
          // Ensures that the name attribute for the node is set. Name will be null for nodes added
          // to biddingCategories as a result of being a parentNode below.
          node.setLocalizedName(localizedName);
        }

        if (productBiddingCategory.hasProductBiddingCategoryConstantParent()) {
          String parentResourceName =
              productBiddingCategory.getProductBiddingCategoryConstantParent();
          CategoryNode parentNode = biddingCategories.get(parentResourceName);
          if (parentNode == null) {
            parentNode = new CategoryNode(parentResourceName);
            biddingCategories.put(parentResourceName, parentNode);
          }
          parentNode.children.add(node);
        } else {
          rootCategories.add(node);
        }
      }
      displayCategories(rootCategories, "");
    }
  }

  /**
   * Recursively prints out each category node and its children.
   *
   * @param categories the categories to print.
   * @param prefix the string to print at the beginning of each line of output.
   */
  private static void displayCategories(List<CategoryNode> categories, String prefix) {
    for (CategoryNode category : categories) {
      System.out.printf("%s%s [%s]%n", prefix, category.localizedName, category.resourceName);
      displayCategories(
          category.children, String.format("%s%s > ", prefix, category.localizedName));
    }
  }

  /** Node that tracks a product bidding category's id, name, and child nodes. */
  private static class CategoryNode {
    private final String resourceName;
    private String localizedName;
    private final List<CategoryNode> children;

    /**
     * Gets the localized name of the category.
     *
     * @return the name of the category.
     */
    public String getLocalizedName() {
      return this.localizedName;
    }

    /**
     * Sets the localized name of the category.
     *
     * @param localizedName the new name of the category.
     */
    public void setLocalizedName(String localizedName) {
      this.localizedName = localizedName;
    }

    /**
     * Constructor for categories first encountered as non-parent elements in the results.
     *
     * @param resourceName the resource name = of the category
     * @param localizedName the name of the category
     */
    CategoryNode(String resourceName, String localizedName) {
      this.children = new ArrayList<>();
      this.resourceName = Preconditions.checkNotNull(resourceName);
      this.localizedName = localizedName;
    }

    /**
     * Constructor for categories first encountered as a parent category, in which case only the ID
     * is available.
     *
     * @param resourceName the resource name of the category
     */
    CategoryNode(String resourceName) {
      this(resourceName, null);
    }
  }
}
