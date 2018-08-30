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

package com.google.ads.googleads.examples.basicoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.GoogleAdsException;
import com.google.ads.googleads.v0.errors.GoogleAdsError;
import com.google.ads.googleads.v0.resources.GoogleAdsField;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient.SearchGoogleAdsFieldsPagedResponse;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This example gets the metadata, such as whether the artifact is selectable, filterable and
 * sortable, of an artifact. The artifact can be either a resource (such as customer, campaign) or a
 * field (such as metrics.impressions, campaign.id). It'll also show the data type and artifacts
 * that are selectable with the artifact.
 */
public class GetArtifactMetadata {

  private static class GetArtifactMetadataParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.ARTIFACT_NAME, required = true)
    private String artifactName;
  }

  public static void main(String[] args) {
    GetArtifactMetadataParams params = new GetArtifactMetadataParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.artifactName = "INSERT_ARTIFACT_NAME_HERE";
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
      new GetArtifactMetadata().runExample(googleAdsClient, params.artifactName);
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
   * @param artifactName the name of artifact to get its metadata.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, String artifactName) {
    try (GoogleAdsFieldServiceClient googleAdsFieldServiceClient =
        googleAdsClient.getGoogleAdsFieldServiceClient()) {
      // Search for an artifact whose name is the same as the specified artifactName.
      SearchGoogleAdsFieldsPagedResponse searchGoogleAdsFieldsPagedResponse =
          googleAdsFieldServiceClient.searchGoogleAdsFields(
              String.format(
                  "SELECT name, category, selectable, filterable, sortable, selectable_with, "
                      + "data_type, is_repeated WHERE name = '%s'",
                  artifactName));

      // Get all returned artifacts and print out their metadata.
      List<GoogleAdsField> googleAdsFields =
          Lists.newArrayList(searchGoogleAdsFieldsPagedResponse.iterateAll());
      for (GoogleAdsField googleAdsField : googleAdsFields) {
        System.out.printf(
            "An artifact named '%s' with category '%s' and data type '%s' %s selectable, %s "
                + "filterable, %s sortable and %s repeated.%n%n",
            googleAdsField.getName().getValue(),
            googleAdsField.getCategory(),
            googleAdsField.getDataType(),
            getIsOrIsNot(googleAdsField.getSelectable()),
            getIsOrIsNot(googleAdsField.getFilterable()),
            getIsOrIsNot(googleAdsField.getSortable()),
            getIsOrIsNot(googleAdsField.getIsRepeated()));

        // Unwrap and sort the list of artifact names that are selectable with the specified
        // artifact.
        List<String> selectableArtifacts =
            new ArrayList<>(
                Lists.transform(
                    googleAdsField.getSelectableWithList(),
                    new Function<StringValue, String>() {
                      @Override
                      public String apply(StringValue selectableWithField) {
                        return selectableWithField.getValue();
                      }
                    }));
        Collections.sort(selectableArtifacts);

        System.out.println("The artifact can be selected with the following artifacts:");
        for (String selectableField : selectableArtifacts) {
          System.out.println(selectableField);
        }
      }

      if (googleAdsFields.isEmpty()) {
        System.err.printf("The specified artifact '%s' doesn't exist.%n", artifactName);
      }
    }
  }

  /**
   * Returns "is" when the specified value is true and "is not" when the specified value is false.
   */
  private String getIsOrIsNot(BoolValue boolValue) {
    return boolValue.getValue() ? "is" : "is not";
  }
}
