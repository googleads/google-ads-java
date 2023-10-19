// Copyright 2022 Google LLC
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

package com.google.ads.googleads.examples.basicoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.resources.GoogleAdsField;
import com.google.ads.googleads.v15.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v15.services.GoogleAdsFieldServiceClient.SearchGoogleAdsFieldsPagedResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Searches for {@link GoogleAdsField}s that match a given prefix, retrieving metadata such as
 * whether the field is selectable, filterable, or sortable, along with the data type and the fields
 * that are selectable with the field. Each {@link GoogleAdsField} represents either a resource
 * (such as {@code customer}, {@code campaign}) or a field (such as {@code metrics.impressions},
 * {@code campaign.id}).
 */
public class SearchForGoogleAdsFields {

  private static class SearchForGoogleAdsFieldsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.NAME_PREFIX, required = true)
    private String namePrefix;
  }

  public static void main(String[] args) {
    SearchForGoogleAdsFieldsParams params = new SearchForGoogleAdsFieldsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.namePrefix = "INSERT_NAME_PREFIX_HERE";
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
      new SearchForGoogleAdsFields().runExample(googleAdsClient, params.namePrefix);
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
   * @param namePrefix the name prefix to use in the query.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, String namePrefix) {
    try (GoogleAdsFieldServiceClient googleAdsFieldServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsFieldServiceClient()) {
      // Searches for all fields whose name begins with the specified namePrefix.
      SearchGoogleAdsFieldsPagedResponse searchGoogleAdsFieldsPagedResponse =
          googleAdsFieldServiceClient.searchGoogleAdsFields(
              String.format(
                  "SELECT "
                      + "name, "
                      + "category, "
                      + "selectable, "
                      + "filterable, "
                      + "sortable, "
                      + "data_type, "
                      + "is_repeated, "
                      + "selectable_with "
                      // The double "%%" below will produce a single "%" in the string returned by
                      // String.format. A single "%" is the wildcard token in the Google Ads Query
                      // language.
                      + "WHERE name LIKE '%s%%'",
                  namePrefix));

      if (searchGoogleAdsFieldsPagedResponse.getPage().getResponse().getTotalResultsCount() == 0) {
        System.out.printf(
            "No GoogleAdsFields found with a name that begins with '%s'.%n", namePrefix);
        return;
      }

      // Retrieves each matching GoogleAdsField and prints its metadata.
      for (GoogleAdsField googleAdsField : searchGoogleAdsFieldsPagedResponse.iterateAll()) {
        System.out.printf("%s:%n", googleAdsField.getName());
        System.out.printf("  %-16s %s%n", "category:", googleAdsField.getCategory());
        System.out.printf("  %-16s %s%n", "data type:", googleAdsField.getDataType());
        System.out.printf("  %-16s %s%n", "selectable:", googleAdsField.getSelectable());
        System.out.printf("  %-16s %s%n", "filterable:", googleAdsField.getFilterable());
        System.out.printf("  %-16s %s%n", "sortable:", googleAdsField.getSortable());
        System.out.printf("  %-16s %s%n", "repeated:", googleAdsField.getIsRepeated());

        // Prints the list of fields that are selectable with the field.
        List<String> selectableWithFields = new ArrayList(googleAdsField.getSelectableWithList());
        if (!selectableWithFields.isEmpty()) {
          // Sorts and then prints the list.
          Collections.sort(selectableWithFields);
          System.out.printf("  %s%n", "selectable with:");
          for (String selectableWithField : selectableWithFields) {
            System.out.printf("    %s%n", selectableWithField);
          }
        }
      }
    }
  }
}
