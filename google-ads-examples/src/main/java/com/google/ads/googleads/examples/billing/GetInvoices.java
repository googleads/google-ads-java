// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
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
import com.google.ads.googleads.v9.enums.MonthOfYearEnum.MonthOfYear;
import com.google.ads.googleads.v9.errors.GoogleAdsError;
import com.google.ads.googleads.v9.errors.GoogleAdsException;
import com.google.ads.googleads.v9.resources.Invoice;
import com.google.ads.googleads.v9.resources.Invoice.AccountBudgetSummary;
import com.google.ads.googleads.v9.services.InvoiceServiceClient;
import com.google.ads.googleads.v9.services.ListInvoicesResponse;
import com.google.ads.googleads.v9.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.ZonedDateTime;

/** Retrieves the invoices issued last month for a given billing setup. */
public class GetInvoices {

  private static class GetInvoicesParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.BILLING_SETUP_ID, required = true)
    private Long billingSetupId;
  }

  public static void main(String[] args) {
    GetInvoicesParams params = new GetInvoicesParams();

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
      new GetInvoices().runExample(googleAdsClient, params.customerId, params.billingSetupId);
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

  private void runExample(GoogleAdsClient googleAdsClient, Long customerId, Long billingSetupId) {
    try (InvoiceServiceClient invoiceServiceClient =
        googleAdsClient.getLatestVersion().createInvoiceServiceClient()) {
      ZonedDateTime oneMonthAgo = ZonedDateTime.now().minusMonths(1);

      // [START get_invoices]
      // Issues the request.
      ListInvoicesResponse response =
          invoiceServiceClient.listInvoices(
              String.valueOf(customerId),
              ResourceNames.billingSetup(customerId, billingSetupId),
              String.valueOf(oneMonthAgo.getYear()),
              MonthOfYear.valueOf(oneMonthAgo.getMonth().toString()));
      // [END get_invoices]

      // [START get_invoices_1]
      // Iterates over all invoices retrieved and prints their information.
      for (Invoice invoice : response.getInvoicesList()) {
        System.out.printf(
            "- Found the invoice '%s':\n"
                + "  ID (also known as Invoice Number): '%s'\n"
                + "  Type: %s\n"
                + "  Billing setup ID: '%s'\n"
                + "  Payments account ID (also known as Billing Account Number): '%s'\n"
                + "  Payments profile ID (also known as Billing ID): '%s'\n"
                + "  Issue date (also known as Invoice Date): %s\n"
                + "  Due date: %s\n"
                + "  Currency code: %s\n"
                + "  Service date range (inclusive): from %s to %s\n"
                + "  Adjustments: subtotal '%.2f', tax '%.2f', total '%.2f'\n"
                + "  Regulatory costs: subtotal '%.2f', tax '%.2f', total '%.2f'\n"
                + "  Replaced invoices: '%s'\n"
                + "  Amounts: subtotal '%.2f', tax '%.2f', total '%.2f'\n"
                + "  Corrected invoice: '%s'\n"
                + "  PDF URL: '%s'\n"
                + "  Account budgets: ",
            invoice.getResourceName(),
            invoice.getId(),
            invoice.getType(),
            invoice.getBillingSetup(),
            invoice.getPaymentsAccountId(),
            invoice.getPaymentsProfileId(),
            invoice.getIssueDate(),
            invoice.getDueDate(),
            invoice.getCurrencyCode(),
            invoice.getServiceDateRange().getStartDate(),
            invoice.getServiceDateRange().getEndDate(),
            convertMicrosToCurrency(invoice.getAdjustmentsSubtotalAmountMicros()),
            convertMicrosToCurrency(invoice.getAdjustmentsTaxAmountMicros()),
            convertMicrosToCurrency(invoice.getAdjustmentsTotalAmountMicros()),
            convertMicrosToCurrency(invoice.getRegulatoryCostsSubtotalAmountMicros()),
            convertMicrosToCurrency(invoice.getRegulatoryCostsTaxAmountMicros()),
            convertMicrosToCurrency(invoice.getRegulatoryCostsTotalAmountMicros()),
            invoice.getReplacedInvoicesList(),
            convertMicrosToCurrency(invoice.getSubtotalAmountMicros()),
            convertMicrosToCurrency(invoice.getTaxAmountMicros()),
            convertMicrosToCurrency(invoice.getTotalAmountMicros()),
            invoice.getCorrectedInvoice(),
            invoice.getPdfUrl());
        for (AccountBudgetSummary accountBudgetSummary : invoice.getAccountBudgetSummariesList()) {
          System.out.printf(
              "  - Account budget '%s':\n"
                  + "      Name (also known as Account Budget): '%s'\n"
                  + "      Customer (also known as Account ID): '%s'\n"
                  + "      Customer descriptive name (also known as Account): '%s'\n"
                  + "      Purchase order number (also known as Purchase Order): '%s'\n"
                  + "      Billing activity date range (inclusive): from %s to %s\n"
                  + "      Amounts: subtotal '%.2f', tax '%.2f', total '%.2f'\n",
              accountBudgetSummary.getAccountBudget(),
              accountBudgetSummary.getAccountBudgetName(),
              accountBudgetSummary.getCustomer(),
              accountBudgetSummary.getCustomerDescriptiveName(),
              accountBudgetSummary.getPurchaseOrderNumber(),
              accountBudgetSummary.getBillableActivityDateRange().getStartDate(),
              accountBudgetSummary.getBillableActivityDateRange().getEndDate(),
              convertMicrosToCurrency(accountBudgetSummary.getSubtotalAmountMicros()),
              convertMicrosToCurrency(accountBudgetSummary.getTaxAmountMicros()),
              convertMicrosToCurrency(accountBudgetSummary.getTotalAmountMicros()));
        }
      }
      // [END get_invoices_1]
    }
  }

  /**
   * Provides a utility method which converts API micros into an amount of currency. For example, if
   * the API returns 1_250_000 micros, and the account currency is USD, then this represents $1.25.
   */
  private static double convertMicrosToCurrency(long amountMicros) {
    return amountMicros / 1_000_000.0;
  }
}
