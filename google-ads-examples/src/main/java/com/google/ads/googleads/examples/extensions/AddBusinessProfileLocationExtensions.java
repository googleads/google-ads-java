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

package com.google.ads.googleads.examples.extensions;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v15.common.MatchingFunction;
import com.google.ads.googleads.v15.common.Operand;
import com.google.ads.googleads.v15.common.Operand.ConstantOperand;
import com.google.ads.googleads.v15.enums.FeedOriginEnum.FeedOrigin;
import com.google.ads.googleads.v15.enums.MatchingFunctionOperatorEnum.MatchingFunctionOperator;
import com.google.ads.googleads.v15.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.resources.CustomerFeed;
import com.google.ads.googleads.v15.resources.Feed;
import com.google.ads.googleads.v15.resources.Feed.PlacesLocationFeedData;
import com.google.ads.googleads.v15.resources.Feed.PlacesLocationFeedData.OAuthInfo;
import com.google.ads.googleads.v15.services.CustomerFeedOperation;
import com.google.ads.googleads.v15.services.CustomerFeedServiceClient;
import com.google.ads.googleads.v15.services.FeedOperation;
import com.google.ads.googleads.v15.services.FeedServiceClient;
import com.google.ads.googleads.v15.services.MutateCustomerFeedsResponse;
import com.google.ads.googleads.v15.services.MutateFeedsResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a feed that syncs feed items from a Business Profile account and associates the feed with a
 * customer.
 */
public class AddBusinessProfileLocationExtensions {
  // The required scope for setting the OAuth info.
  private final String GOOGLE_ADS_SCOPE = "https://www.googleapis.com/auth/adwords";

  // The maximum number of CustomerFeed ADD operation attempts to make before throwing an exception.
  private static final int MAX_CUSTOMER_FEED_ADD_ATTEMPTS = 10;

  private static class AddBusinessProfileLocationExtensionsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.BUSINESS_PROFILE_EMAIL_ADDRESS, required = true)
    private String businessProfileEmailAddress;

    @Parameter(names = ArgumentNames.BUSINESS_ACCOUNT_IDENTIFIER)
    private String businessAccountIdentifier;

    @Parameter(names = ArgumentNames.BUSINESS_PROFILE_ACCESS_TOKEN, required = true)
    private String businessProfileAccessToken;
  }

  public static void main(String[] args) throws InterruptedException, IOException {
    AddBusinessProfileLocationExtensionsParams params =
        new AddBusinessProfileLocationExtensionsParams();

    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.businessProfileEmailAddress = "INSERT_BUSINESS_PROFILE_EMAIL_ADDRESS_HERE";
      params.businessAccountIdentifier = "INSERT_BUSINESS_ACCOUNT_IDENTIFIER_HERE";
      params.businessProfileAccessToken = "INSERT_BUSINESS_PROFILE_ACCESS_TOKEN_HERE";
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
      new AddBusinessProfileLocationExtensions()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.businessProfileEmailAddress,
              params.businessAccountIdentifier,
              params.businessProfileAccessToken);
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
   * @param businessProfileEmailAddress email address associated with the Business Profile account.
   * @param businessAccountIdentifier the account number of the Business Profile account (optional).
   * @param businessProfileAccessToken the access token created using the 'AdWords' scope and the
   *     client ID and client secret of with the Cloud project associated with the Business Profile
   *     account.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   * @throws InterruptedException if the Thread.sleep operation is interrupted.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String businessProfileEmailAddress,
      String businessAccountIdentifier,
      String businessProfileAccessToken)
      throws InterruptedException {
    // Creates a PlacesLocationFeedData object to identify the Business Profile account, specify
    // location filters, and provide authorization for Google Ads to retrieve locations from the
    // account on behalf of the user identified by businessProfileEmailAddress.
    PlacesLocationFeedData.Builder placesLocationFeedData =
        PlacesLocationFeedData.newBuilder()
            .setEmailAddress(businessProfileEmailAddress)
            // Used to filter Business Profile listings by labels. If entries exist in
            // label_filters, only listings that have at least one of the labels set are
            // candidates to be synchronized into FeedItems. If no entries exist in
            // label_filters, then all listings are candidates for syncing.
            .addLabelFilters("Stores in New York")
            // Sets the authentication info to be able to connect Google Ads to the Business Profile
            // account.
            .setOauthInfo(
                OAuthInfo.newBuilder()
                    .setHttpMethod("GET")
                    .setHttpRequestUrl(GOOGLE_ADS_SCOPE)
                    .setHttpAuthorizationHeader("Bearer " + businessProfileAccessToken)
                    .build());

    if (businessAccountIdentifier != null) {
      placesLocationFeedData.setBusinessAccountId(businessAccountIdentifier);
    }

    // [START add_business_profile_location_extensions]
    // Creates a feed that will sync to the Business Profile account. Do not add FeedAttributes to
    // this object as Google Ads will add them automatically because this will be a system generated
    // feed.
    Feed.Builder businessProfileFeed =
        Feed.newBuilder()
            .setName("Business Profile feed #" + getPrintableDateTime())
            // Configures the location feed populated from Business Profile Locations.
            .setPlacesLocationFeedData(placesLocationFeedData)
            // Since this feed's feed items will be managed by Google,
            // you must set its origin to GOOGLE.
            .setOrigin(FeedOrigin.GOOGLE);

    FeedOperation operation = FeedOperation.newBuilder().setCreate(businessProfileFeed).build();
    // [END add_business_profile_location_extensions]

    // [START add_business_profile_location_extensions_1]
    try (FeedServiceClient feedServiceClient =
        googleAdsClient.getLatestVersion().createFeedServiceClient()) {
      // Adds the feed. Since it is a system generated feed, Google Ads will automatically:
      // 1. Set up the FeedAttributes on the feed.
      // 2. Set up a FeedMapping that associates the FeedAttributes of the feed
      // with the placeholder fields of the LOCATION placeholder type.
      MutateFeedsResponse response =
          feedServiceClient.mutateFeeds(Long.toString(customerId), ImmutableList.of(operation));
      String businessProfileFeedResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Business Profile feed created with resource name: %s%n",
          businessProfileFeedResourceName);
      // [END add_business_profile_location_extensions_1]

      // [START add_business_profile_location_extensions_2]
      // Adds a CustomerFeed that associates the feed with this customer for
      // the LOCATION placeholder type.
      CustomerFeed customerFeed =
          CustomerFeed.newBuilder()
              .setFeed(businessProfileFeedResourceName)
              .addPlaceholderTypes(PlaceholderType.LOCATION)
              // Creates a matching function that will always evaluate to true.
              .setMatchingFunction(
                  MatchingFunction.newBuilder()
                      .addLeftOperands(
                          Operand.newBuilder()
                              .setConstantOperand(
                                  ConstantOperand.newBuilder().setBooleanValue(true).build())
                              .build())
                      .setFunctionString("IDENTITY(true)")
                      .setOperator(MatchingFunctionOperator.IDENTITY)
                      .build())
              .build();

      CustomerFeedOperation customerFeedOperation =
          CustomerFeedOperation.newBuilder().setCreate(customerFeed).build();
      // [END add_business_profile_location_extensions_2]

      // [START add_business_profile_location_extensions_3]
      try (CustomerFeedServiceClient customerFeedServiceClient =
          googleAdsClient.getLatestVersion().createCustomerFeedServiceClient()) {

        // After the completion of the Feed ADD operation above the added feed will not be available
        // for usage in a CustomerFeed until the sync between the Google Ads and Business Profile
        // accounts
        // completes. The loop below will retry adding the CustomerFeed up to ten times with an
        // exponential back-off policy.
        String addedCustomerFeed = null;
        int numberOfAttempts = 0;
        do {
          numberOfAttempts++;
          try {
            MutateCustomerFeedsResponse customerFeedsResponse =
                customerFeedServiceClient.mutateCustomerFeeds(
                    Long.toString(customerId), ImmutableList.of(customerFeedOperation));
            addedCustomerFeed = customerFeedsResponse.getResults(0).getResourceName();
            System.out.printf("Customer feed created with resource name: %s%n", addedCustomerFeed);
          } catch (GoogleAdsException gae) {
            // Waits using exponential backoff policy.
            long sleepSeconds = (long) Math.scalb(5, numberOfAttempts);

            // Exits the loop early if sleepSeconds grows too large in the event that
            // MAX_CUSTOMER_FEED_ADD_ATTEMPTS is set too high.
            if (sleepSeconds > (long) Math.scalb(5, 10)) {
              break;
            }

            System.out.printf(
                "Attempt #%d to add the CustomerFeed was not successful. "
                    + "Waiting %d seconds before trying again.%n",
                numberOfAttempts, sleepSeconds);
            Thread.sleep(sleepSeconds * 1000);
          }
        } while (numberOfAttempts < MAX_CUSTOMER_FEED_ADD_ATTEMPTS && addedCustomerFeed == null);
        // [END add_business_profile_location_extensions_3]

        if (addedCustomerFeed == null) {
          throw new RuntimeException(
              "Could not create the CustomerFeed after "
                  + MAX_CUSTOMER_FEED_ADD_ATTEMPTS
                  + " attempts. Please retry "
                  + "the CustomerFeed ADD operation later.");
        }

        // OPTIONAL: Create a CampaignFeed to specify which FeedItems to use at the Campaign
        // level.

        // OPTIONAL: Create an AdGroupFeed for even more fine grained control over
        // which feed items are used at the AdGroup level.
      }
    }
  }
}
