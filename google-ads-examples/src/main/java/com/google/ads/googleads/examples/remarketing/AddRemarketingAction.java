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

package com.google.ads.googleads.examples.remarketing;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v8.common.TagSnippet;
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.RemarketingAction;
import com.google.ads.googleads.v8.services.GoogleAdsRow;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v8.services.MutateRemarketingActionsResponse;
import com.google.ads.googleads.v8.services.RemarketingActionOperation;
import com.google.ads.googleads.v8.services.RemarketingActionServiceClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/** Adds a new remarketing action to the customer and then retrieves its associated tag snippets. */
public class AddRemarketingAction {

  private static class AddRemarketingActionParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    AddRemarketingActionParams params = new AddRemarketingActionParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new AddRemarketingAction().runExample(googleAdsClient, params.customerId);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_remarketing_action]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {

    // Creates a remarketing action with the specified name.
    RemarketingAction remarketingAction =
        RemarketingAction.newBuilder()
            .setName("Remarketing action #" + getPrintableDateTime())
            .build();

    // Creates a remarketing action operation.
    RemarketingActionOperation operation =
        RemarketingActionOperation.newBuilder().setCreate(remarketingAction).build();

    // Issues a mutate request to add the remarketing action and prints out some information.
    String remarketingActionResourceName;
    try (RemarketingActionServiceClient conversionActionServiceClient =
        googleAdsClient.getLatestVersion().createRemarketingActionServiceClient()) {
      MutateRemarketingActionsResponse response =
          conversionActionServiceClient.mutateRemarketingActions(
              Long.toString(customerId), Collections.singletonList(operation));
      remarketingActionResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Added remarketing action with resource name '%s'.%n", remarketingActionResourceName);
    }

    // Creates a query that retrieves the previously created remarketing action with its generated
    // tag snippets.
    // [START add_remarketing_action_1]
    String query =
        String.format(
            "SELECT remarketing_action.id,"
                + " remarketing_action.name,"
                + " remarketing_action.tag_snippets "
                + "FROM remarketing_action "
                + "WHERE remarketing_action.resource_name = '%s'",
            remarketingActionResourceName);
    // [END add_remarketing_action_1]
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues a search request.
      SearchPagedResponse searchPagedResponse =
          googleAdsServiceClient.search(Long.toString(customerId), query);

      // There is only one row because we limited the search using the resource name, which is
      // unique.
      GoogleAdsRow googleAdsRow = searchPagedResponse.iterateAll().iterator().next();

      // Prints some attributes of the remarketing action. The ID and tag snippets are generated by
      // the API.
      RemarketingAction newRemarketingAction = googleAdsRow.getRemarketingAction();
      System.out.printf(
          "Remarketing action has ID %d and name '%s'.%n%n",
          newRemarketingAction.getId(), newRemarketingAction.getName());
      System.out.println("It has the following generated tag snippets:");
      for (TagSnippet tagSnippet : newRemarketingAction.getTagSnippetsList()) {
        System.out.printf(
            "Tag snippet with code type '%s' and code page format '%s' has the following global"
                + " site tag:%n%s%n",
            tagSnippet.getType(), tagSnippet.getPageFormat(), tagSnippet.getGlobalSiteTag());
        System.out.printf("and the following event snippet:%n%s%n%n", tagSnippet.getEventSnippet());
      }
    }
  }
  // [END add_remarketing_action]
}
