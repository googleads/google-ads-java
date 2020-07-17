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

package com.google.ads.googleads.examples.shoppingads;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v4.enums.MerchantCenterLinkStatusEnum.MerchantCenterLinkStatus;
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.resources.MerchantCenterLink;
import com.google.ads.googleads.v4.services.ListMerchantCenterLinksRequest;
import com.google.ads.googleads.v4.services.ListMerchantCenterLinksResponse;
import com.google.ads.googleads.v4.services.MerchantCenterLinkOperation;
import com.google.ads.googleads.v4.services.MerchantCenterLinkServiceClient;
import com.google.ads.googleads.v4.services.MutateMerchantCenterLinkResponse;
import com.google.ads.googleads.v4.services.MutateMerchantCenterLinkResult;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Demonstrates how to approve a Merchant Center link request.
 *
 * <p>Prerequisite: You need to have access to a Merchant Center account. You can find instructions
 * to create a Merchant Center account here: https://support.google.com/merchants/answer/188924.
 *
 * <p>To run this example, you must use the Merchant Center UI or the Content API for Shopping to
 * send a link request between your Merchant Center and Google Ads accounts.
 */
public class ApproveMerchantCenterLink {

  private static class ApproveMerchantCenterLinkParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.MERCHANT_CENTER_ACCOUNT_ID, required = true)
    private Long merchantCenterAccountId;
  }

  public static void main(String[] args) {
    ApproveMerchantCenterLinkParams params = new ApproveMerchantCenterLinkParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.merchantCenterAccountId = Long.parseLong("INSERT_MERCHANT_CENTER_ACCOUNT_ID_HERE");
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
      new ApproveMerchantCenterLink()
          .runExample(googleAdsClient, params.customerId, params.merchantCenterAccountId);
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
   * @param customerId the client customer ID of the Google Ads account to approve the link request.
   * @param merchantCenterAccountId the Merchant Center account ID for the account requesting to
   *     link.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long merchantCenterAccountId) {

    // Approves a pending link request for a Google Ads account with customerId from a Merchant
    // Center account with merchantCenterAccountId.
    try (MerchantCenterLinkServiceClient merchantCenterLinkService =
        googleAdsClient.getLatestVersion().createMerchantCenterLinkServiceClient()) {
      ListMerchantCenterLinksResponse response =
          merchantCenterLinkService.listMerchantCenterLinks(
              ListMerchantCenterLinksRequest.newBuilder()
                  .setCustomerId(Long.toString(customerId))
                  .build());

      System.out.printf(
          "%d Merchant Center link(s) found with the following details:%n",
          response.getMerchantCenterLinksCount());

      for (MerchantCenterLink merchantCenterLink : response.getMerchantCenterLinksList()) {
        System.out.printf(
            "Link '%s' has status '%s'.%n",
            merchantCenterLink.getResourceName(), merchantCenterLink.getStatus());

        // Checks if there is a link for the Merchant Center account we are looking for, then only
        // approves the link if it is in a 'PENDING' state.
        if (merchantCenterAccountId == merchantCenterLink.getId().getValue()
            && merchantCenterLink.getStatus() == MerchantCenterLinkStatus.PENDING) {
          // Updates the status of Merchant Center link to 'ENABLED' to approve the link.
          updateMerchantCenterLinkStatus(
              merchantCenterLinkService,
              customerId,
              merchantCenterLink,
              MerchantCenterLinkStatus.ENABLED);
        }
      }
    }
  }

  /**
   * Updates the status of a Merchant Center link request for a given resource name.
   *
   * @param merchantCenterLinkServiceClient the MerchantCenterLinkService client.
   * @param customerId the client customer ID of the Google Ads account to approve the link request.
   * @param merchantCenterLink the MerchantCenterLink object to update.
   * @param status the new status to set on the link.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void updateMerchantCenterLinkStatus(
      MerchantCenterLinkServiceClient merchantCenterLinkServiceClient,
      long customerId,
      MerchantCenterLink merchantCenterLink,
      MerchantCenterLinkStatus status) {
    // Creates an updated MerchantCenterLink object derived from the original, but with the new
    // status.
    MerchantCenterLink updatedMerchantCenterLink =
        merchantCenterLink.toBuilder().setStatus(status).build();

    // Constructs an operation that will update the merchantCenterLink, using the FieldMasks compare
    // utility to derive the update mask from the changes. This mask tells the Google Ads API which
    // attributes of the merchantCenterLink to change. In this case we only want to change the
    // MerchantCenterLinkStatus.
    MerchantCenterLinkOperation operation =
        MerchantCenterLinkOperation.newBuilder()
            .setUpdate(updatedMerchantCenterLink)
            .setUpdateMask(FieldMasks.compare(merchantCenterLink, updatedMerchantCenterLink))
            .build();

    // Sends the operation in a mutate request.
    MutateMerchantCenterLinkResponse response =
        merchantCenterLinkServiceClient.mutateMerchantCenterLink(
            String.valueOf(customerId), operation);

    // Prints the resource name of the updated object.
    MutateMerchantCenterLinkResult merchantCenterLinkResult = response.getResult();
    System.out.printf(
        "Updated Merchant Center link with resource name: '%s'.%n",
        merchantCenterLinkResult.getResourceName());
  }
}
