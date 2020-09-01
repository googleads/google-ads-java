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
package com.google.ads.googleads.examples.billing;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.AccountBudgetProposal;
import com.google.ads.googleads.v5.services.GoogleAdsRow;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v5.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Gets all account budget proposals. To add an account budget proposal, run
 * AddAccountBudgetProposal.java.
 */
public class GetAccountBudgetProposals {

  private static final int PAGE_SIZE = 1_000;

  private static class GetAccountBudgetProposalsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    GetAccountBudgetProposalsParams params = new GetAccountBudgetProposalsParams();
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
      new GetAccountBudgetProposals().runExample(googleAdsClient, params.customerId);
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
   * @param customerId the customer ID for which to retrieve AccountBudgetProposals.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Constructs a GAQL query which will retrieve AccountBudgetProposals.
    String queryString =
        "SELECT account_budget_proposal.id, "
            + "  account_budget_proposal.account_budget, "
            + "  account_budget_proposal.billing_setup, "
            + "  account_budget_proposal.status, "
            + "  account_budget_proposal.proposed_name, "
            + "  account_budget_proposal.proposed_notes, "
            + "  account_budget_proposal.proposed_purchase_order_number, "
            + "  account_budget_proposal.proposal_type, "
            + "  account_budget_proposal.approval_date_time, "
            + "  account_budget_proposal.creation_date_time "
            + "FROM account_budget_proposal";

    // Creates a request that will retrieve all account budget proposals using pages of the
    // specified page size.
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(Long.toString(customerId))
            .setPageSize(PAGE_SIZE)
            .setQuery(queryString)
            .build();

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);

      // Iterates over all rows in all pages and prints the requested field values for the account
      // budget in each row.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AccountBudgetProposal proposal = googleAdsRow.getAccountBudgetProposal();
        System.out.printf(
            "Account budget proposal with "
                + "ID '%s' "
                + "status '%s' "
                + "account_budget '%s' "
                + "billing_setup '%s' "
                + "proposed_name '%s' "
                + "proposed_notes '%s' "
                + "proposed_po_number '%s' "
                + "proposal_type '%s' "
                + "approval_date_time '%s' "
                + "creation_date_time '%s'.%n",
            proposal.getId().getValue(),
            proposal.getStatus().name(),
            proposal.getAccountBudget().getValue(),
            proposal.getBillingSetup().getValue(),
            proposal.getProposedName().getValue(),
            proposal.getProposedNotes().getValue(),
            proposal.getProposedPurchaseOrderNumber().getValue(),
            proposal.getProposalType().name(),
            proposal.getApprovalDateTime().getValue(),
            proposal.getCreationDateTime().getValue());
      }
    }
  }
}
