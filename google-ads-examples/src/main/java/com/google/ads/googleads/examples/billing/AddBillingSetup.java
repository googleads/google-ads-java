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

package com.google.ads.googleads.examples.billing;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.BillingSetup;
import com.google.ads.googleads.v10.resources.BillingSetup.PaymentsAccountInfo;
import com.google.ads.googleads.v10.services.BillingSetupOperation;
import com.google.ads.googleads.v10.services.BillingSetupServiceClient;
import com.google.ads.googleads.v10.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v10.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v10.services.MutateBillingSetupResponse;
import com.google.ads.googleads.v10.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Creates a billing setup for a customer. A billing setup is a link between a payments account and
 * a customer. The new billing setup can either reuse an existing payments account, or create a new
 * payments account with a given payments profile. Billing setups are applicable for clients on
 * monthly invoicing only. See here for details about applying for monthly invoicing:
 * https://support.google.com/google-ads/answer/2375377. In the case of consolidated billing, a
 * payments account is linked to the manager account and is linked to a customer account via a
 * billing setup.
 */
public class AddBillingSetup {
  private static class AddBillingSetupParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.PAYMENTS_ACCOUNT_ID_ID)
    private String paymentsAccountId;

    @Parameter(names = ArgumentNames.PAYMENTS_PROFILE_ID)
    private String paymentsProfileId;
  }

  public static void main(String[] args) {
    AddBillingSetupParams params = new AddBillingSetupParams();

    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Either a payments account ID or a payments profile ID must be provided for the example
      // to run successfully. If both are provided, only the payments account ID will be used.
      // See:
      // https://developers.google.com/google-ads/api/docs/billing/billing-setups#creating_new_billing_setups
      // Provide an existing payments account ID to link to the new billing setup. Must be
      // formatted as "1234-5678-9012-3456".
      params.paymentsAccountId = "INSERT_PAYMENTS_ACCOUNT_ID_HERE";
      // Alternatively, provide a payments profile ID, which will be linked to a new payments
      // account and the new billing setup. Must be formatted as "1234-5678-9012".
      params.paymentsProfileId = "INSERT_PAYMENTS_PROFILE_ID_HERE";
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
      new AddBillingSetup()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.paymentsAccountId,
              params.paymentsProfileId);
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
    } catch (Exception e) {
      System.err.printf("  Error: %s%n", e);
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID containing the BillingSetup to remove.
   * @param paymentsAccountId optional payments account ID to attach to the new billing setup. Must
   *     be formatted as "1234-5678-9012-3456".
   * @param paymentsProfileId optional payments profile ID to attach to a new payments account and
   *     to the new billing setup. Must be formatted as "1234-5678-9012".
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String paymentsAccountId,
      String paymentsProfileId)
      throws Exception {
    // Constructs a new billing setup.
    BillingSetup billingSetup =
        createBillingSetup(customerId, paymentsAccountId, paymentsProfileId);

    billingSetup = setBillingSetupDateTimes(googleAdsClient, customerId, billingSetup);

    // Creates the billing setup operation.
    BillingSetupOperation operation =
        BillingSetupOperation.newBuilder().setCreate(billingSetup).build();

    // Creates the service client.
    try (BillingSetupServiceClient billingSetupServiceClient =
        googleAdsClient.getLatestVersion().createBillingSetupServiceClient()) {
      // Issues the mutate request to add the billing setup.
      MutateBillingSetupResponse billingResponse =
          billingSetupServiceClient.mutateBillingSetup(Long.toString(customerId), operation);

      System.out.printf(
          "Added new billing setup with resource name '%s'.%n",
          billingResponse.getResult().getResourceName());
    }
  }

  /**
   * Creates and returns a new Billing Setup instance with complete payment details. One of
   * paymentsAccountId or paymentsProfileId must be provided.
   *
   * @param customerId the customer ID containing the BillingSetup to remove.
   * @param paymentsAccountId optional payments account ID to attach to the new billing setup. Must
   *     be formatted as "1234-5678-9012-3456".
   * @param paymentsProfileId optional payments profile ID to attach to a new payments account and
   *     to the new billing setup. Must be formatted as "1234-5678-9012".
   * @return new Billing Setup instance with complete payment details.
   */
  private BillingSetup createBillingSetup(
      long customerId, String paymentsAccountId, String paymentsProfileId) throws Exception {
    BillingSetup.Builder billingSetupBuilder = BillingSetup.newBuilder();

    // Sets the appropriate payments account field.
    if (paymentsAccountId != null) {
      // If a payments account id has been provided, set PaymentsAccount to its resource
      // name. You can list available payments accounts via the PaymentsAccountService's
      // ListPaymentsAccounts method.
      billingSetupBuilder.setPaymentsAccount(
          ResourceNames.paymentsAccount(customerId, paymentsAccountId));
    } else if (paymentsProfileId != null) {
      // Otherwise, create a new payments account by setting the PaymentsAccountInfo
      // field. See https://support.google.com/google-ads/answer/7268503 for information
      // about payments profiles.
      billingSetupBuilder.setPaymentsAccountInfo(
          PaymentsAccountInfo.newBuilder()
              .setPaymentsAccountName("Payments Account #" + getPrintableDateTime())
              .setPaymentsProfileId(paymentsProfileId)
              .build());
    } else {
      throw new Exception("No paymentsAccountId or paymentsProfileId provided.");
    }

    return billingSetupBuilder.build();
  }

  /**
   * Sets the starting and ending date times for the new billing setup. Queries the customer's
   * account to see if there are any approved billing setups. If there are any, the new billing
   * setup starting date time is set to one day after the last. If not, the billing setup is set to
   * start immediately. The ending date is set to one day after the starting date time.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID containing the BillingSetup to remove.
   * @param billingSetup The instance of BillingSetup whose starting date time will be set.
   * @return Billing Setup with updated start and end date time.
   */
  private BillingSetup setBillingSetupDateTimes(
      GoogleAdsClient googleAdsClient, long customerId, BillingSetup billingSetup)
      throws Exception {
    // Defines a query to search existing approved billing setups in the end date time descending
    // order.
    // See GetBillingSetup.java for a more detailed example of requesting billing setup
    // information.
    String query =
        "SELECT billing_setup.end_date_time "
            + "FROM billing_setup "
            + "WHERE billing_setup.status = 'APPROVED' "
            + "ORDER BY billing_setup.end_date_time DESC";

    // Creates the service client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues a search request.
      SearchPagedResponse searchPagedResponse =
          googleAdsServiceClient.search(Long.toString(customerId), query);

      BillingSetup.Builder billingSetupBuilder = billingSetup.toBuilder();
      if (searchPagedResponse.getPage().getResponse().getResultsCount() > 0) {
        // Retrieves the ending date time of the last billing setup.
        String lastEndingDateTimeString =
            searchPagedResponse
                .getPage()
                .getResponse()
                .getResults(0)
                .getBillingSetup()
                .getEndDateTime();

        // A null ending date time indicates that the current billing setup is set to run
        // indefinitely. Billing setups cannot overlap, so throw an exception in this case.
        if (lastEndingDateTimeString == null) {
          throw new Exception(
              "Cannot set starting and ending date times for the new billing setup; the latest"
                  + " existing billing setup is set to run indefinitely.");
        }

        DateTime lastEndingDateTime = DateTime.parse(lastEndingDateTimeString.toString());

        // Sets the new billing setup to start one day after the ending date time.
        billingSetupBuilder.setStartDateTime(lastEndingDateTime.plusDays(1).toString("yyyy-MM-dd"));

        // Sets the new billing setup to end one day after the starting date time.
        billingSetupBuilder.setEndDateTime(lastEndingDateTime.plusDays(2).toString("yyyy-MM-dd"));
      } else {
        // Otherwise, the only acceptable start time is DateTime.now().
        billingSetupBuilder.setStartDateTime(DateTime.now().toString());

        // Sets the new billing setup to end tomorrow.
        billingSetupBuilder.setEndDateTime(new DateTime().plusDays(1).toString("yyyy-MM-dd"));
      }
      return billingSetupBuilder.build();
    }
  }
}
