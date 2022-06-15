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
import com.google.ads.googleads.v11.enums.AccountBudgetProposalTypeEnum.AccountBudgetProposalType;
import com.google.ads.googleads.v11.enums.TimeTypeEnum.TimeType;
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.resources.AccountBudgetProposal;
import com.google.ads.googleads.v11.services.AccountBudgetProposalOperation;
import com.google.ads.googleads.v11.services.AccountBudgetProposalServiceClient;
import com.google.ads.googleads.v11.services.MutateAccountBudgetProposalResponse;
import com.google.ads.googleads.v11.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Creates an account budget proposal using the 'CREATE' operation. To get account budget proposals,
 * run GetAccountBudgetProposals.java.
 */
public class AddAccountBudgetProposal {

  private static class AddAccountBudgetProposalParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.BILLING_SETUP_ID, required = true)
    private Long billingSetupId;
  }

  public static void main(String[] args) {
    AddAccountBudgetProposalParams params = new AddAccountBudgetProposalParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.billingSetupId = Long.parseLong("INSERT_BILLING_SETUP_ID_HERE");
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
      new AddAccountBudgetProposal()
          .runExample(googleAdsClient, params.customerId, params.billingSetupId);
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

  // [START add_account_budget_proposal]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long billingSetupId) {
    // Creates an AccountBudgetProposal. This will be reviewed offline by Google Ads, and if
    // approved will become an AccountBudget.
    AccountBudgetProposal proposal =
        AccountBudgetProposal.newBuilder()
            .setBillingSetup(ResourceNames.billingSetup(customerId, billingSetupId))
            .setProposalType(AccountBudgetProposalType.CREATE)
            .setProposedName("Account Budget (example)")

            // Specifies the account budget starts immediately.
            .setProposedStartTimeType(TimeType.NOW)
            // Alternatively you can specify a specific start time. Refer to the
            // AccountBudgetProposal
            // resource documentation for allowed formats.
            //
            // .setProposedStartDateTime("2020-01-02 03:04:05")

            // Specifies that the budget runs forever.
            .setProposedEndTimeType(TimeType.FOREVER)
            // Alternatively you can specify a specific end time. Allowed formats are as above.
            // .setProposedEndDateTime("2021-02-03 04:05:06")

            // Optional: sets notes for the budget. These are free text and do not effect budget
            // delivery.
            // .setProposedNotes("Received prepayment of $0.01")

            // Sets the spending limit to 0.01, measured in the Google Ads account currency.
            .setProposedSpendingLimitMicros(10_000)

            // Optional: sets PO number for record keeping. This value is at the user's
            // discretion, and has no effect on Google Billing & Payments.
            // .setProposedPurchaseOrderNumber("PO number 12345")
            .build();

    // Creates an operation which will add the new AccountBudgetProposal.
    AccountBudgetProposalOperation operation =
        AccountBudgetProposalOperation.newBuilder().setCreate(proposal).build();

    try (AccountBudgetProposalServiceClient accountBudgetProposalServiceClient =
        googleAdsClient.getLatestVersion().createAccountBudgetProposalServiceClient()) {
      // Sends the request to the Account Budget Proposal Service.
      MutateAccountBudgetProposalResponse response =
          accountBudgetProposalServiceClient.mutateAccountBudgetProposal(
              String.valueOf(customerId), operation);

      System.out.printf(
          "Account budget proposal created: %s.%n", response.getResult().getResourceName());
    }
  }
  // [END add_account_budget_proposal]
}
