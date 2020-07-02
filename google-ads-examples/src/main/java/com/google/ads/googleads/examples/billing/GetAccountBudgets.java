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
import com.google.ads.googleads.v5.resources.AccountBudget;
import com.google.ads.googleads.v5.resources.AccountBudget.ApprovedEndTimeCase;
import com.google.ads.googleads.v5.resources.AccountBudget.ApprovedSpendingLimitCase;
import com.google.ads.googleads.v5.resources.AccountBudget.ProposedEndTimeCase;
import com.google.ads.googleads.v5.resources.AccountBudget.ProposedSpendingLimitCase;
import com.google.ads.googleads.v5.services.GoogleAdsRow;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient.SearchPagedResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Retrieves all account budgets for a Google Ads customer. */
public class GetAccountBudgets {

  private static class GetAccountBudgetParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    GetAccountBudgetParams params = new GetAccountBudgetParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new GetAccountBudgets().runExample(googleAdsClient, params.customerId);
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
   * @param customerId the customer ID for which to retrieve account budgets.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    String query =
        "SELECT "
            + "account_budget.status, "
            + "account_budget.billing_setup, "
            + "account_budget.approved_spending_limit_micros, "
            + "account_budget.approved_spending_limit_type, "
            + "account_budget.proposed_spending_limit_micros, "
            + "account_budget.proposed_spending_limit_type, "
            + "account_budget.approved_start_date_time, "
            + "account_budget.proposed_start_date_time, "
            + "account_budget.approved_end_date_time, "
            + "account_budget.approved_end_time_type,"
            + "account_budget.proposed_end_date_time, "
            + "account_budget.proposed_end_time_type "
            + "FROM account_budget";
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues the search request.
      SearchPagedResponse searchPagedResponse =
          googleAdsServiceClient.search(Long.toString(customerId), query);

      // Iterates over all rows in all pages and prints the requested field values for the account
      // budget in each row.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AccountBudget accountBudget = googleAdsRow.getAccountBudget();

        System.out.printf(
            "Account budget '%s' with "
                + "status '%s' "
                + "billing setup '%s' "
                + "amount served %.2f "
                + "total adjustments %.2f "
                + "approved spending limit '%s' "
                + "(proposed '%s') "
                + "approved start time '%s' "
                + "(proposed '%s') "
                + "approved end time '%s' "
                + "(proposed '%s')"
                + ".%n",
            accountBudget.getResourceName(),
            accountBudget.getStatus(),
            accountBudget.getBillingSetup(),
            accountBudget.getAmountServedMicros() / 1_000_000.0,
            accountBudget.getTotalAdjustmentsMicros() / 1_000_000.0,
            accountBudget.getApprovedSpendingLimitCase() == ApprovedSpendingLimitCase.APPROVED_SPENDING_LIMIT_MICROS
                ? String.format(
                    "%.2f", accountBudget.getApprovedSpendingLimitMicros() / 1_000_000.0)
                : accountBudget.getApprovedSpendingLimitType().name(),
            accountBudget.getProposedSpendingLimitCase() == ProposedSpendingLimitCase.PROPOSED_SPENDING_LIMIT_MICROS
                ? String.format(
                    "%.2f", accountBudget.getProposedSpendingLimitMicros() / 1_000_000.0)
                : accountBudget.getProposedSpendingLimitType().name(),
            accountBudget.getApprovedStartDateTime(),
            accountBudget.getProposedStartDateTime(),
            accountBudget.getApprovedEndTimeCase() == ApprovedEndTimeCase.APPROVED_END_DATE_TIME
                ? accountBudget.getApprovedEndDateTime()
                : accountBudget.getApprovedEndTimeType(),
            accountBudget.getProposedEndTimeCase() == ProposedEndTimeCase.PROPOSED_END_DATE_TIME
                ? accountBudget.getProposedEndDateTime()
                : accountBudget.getProposedEndTimeType());
      }
    }
  }
}
