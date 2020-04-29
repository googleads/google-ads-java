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

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.common.MatchingFunction;
import com.google.ads.googleads.v3.common.Operand;
import com.google.ads.googleads.v3.common.Operand.ConstantOperand;
import com.google.ads.googleads.v3.enums.FeedOriginEnum.FeedOrigin;
import com.google.ads.googleads.v3.enums.MatchingFunctionOperatorEnum.MatchingFunctionOperator;
import com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.CustomerFeed;
import com.google.ads.googleads.v3.resources.Feed;
import com.google.ads.googleads.v3.resources.Feed.PlacesLocationFeedData;
import com.google.ads.googleads.v3.resources.Feed.PlacesLocationFeedData.OAuthInfo;
import com.google.ads.googleads.v3.services.CustomerFeedOperation;
import com.google.ads.googleads.v3.services.CustomerFeedServiceClient;
import com.google.ads.googleads.v3.services.FeedOperation;
import com.google.ads.googleads.v3.services.FeedServiceClient;
import com.google.ads.googleads.v3.services.MutateCustomerFeedsResponse;
import com.google.ads.googleads.v3.services.MutateFeedsResponse;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a feed that syncs feed items from a Google My Business (GMB) account and associates the feed
 * with a customer.
 */
public class AddGoogleMyBusinessLocationExtensions {
  // The required scope for setting the OAuth info.
  private final String GOOGLE_ADS_SCOPE = "https://www.googleapis.com/auth/adwords";

  // The maximum number of CustomerFeed ADD operation attempts to make before throwing an exception.
  private static final int MAX_CUSTOMER_FEED_ADD_ATTEMPTS = 10;

  private static class AddGoogleMyBusinessLocationExtensionsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.GMB_EMAIL_ADDRESS, required = true)
    private String gmbEmailAddress;

    @Parameter(names = ArgumentNames.BUSINESS_ACCOUNT_IDENTIFIER)
    private String businessAccountIdentifier;

    @Parameter(names = ArgumentNames.GMB_ACCESS_TOKEN, required = true)
    private String gmbAccessToken;
  }

  public static void main(String[] args) throws InterruptedException, IOException {
    AddGoogleMyBusinessLocationExtensionsParams params =
        new AddGoogleMyBusinessLocationExtensionsParams();

    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.gmbEmailAddress = "INSERT_GMB_EMAIL_ADDRESS_HERE";
      params.businessAccountIdentifier = "INSERT_BUSINESS_ACCOUNT_IDENTIFIER_HERE";
      params.gmbAccessToken = "INSERT_GMB_ACCESS_TOKEN_HERE";
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
      new AddGoogleMyBusinessLocationExtensions()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.gmbEmailAddress,
              params.businessAccountIdentifier,
              params.gmbAccessToken);
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
   * @param customerId the client customer ID.
   * @param gmbEmailAddress email address associated with the GMB account.
   * @param businessAccountIdentifier the account number of the GMB account.
   * @param gmbAccessToken the access token created using the 'AdWords' scope and the client ID and
   *     client secret of with the Cloud project associated with the GMB account.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   * @throws InterruptedException if the Thread.sleep operation is interrupted.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String gmbEmailAddress,
      String businessAccountIdentifier,
      String gmbAccessToken)
      throws InterruptedException {
    // Creates a feed that will sync to the Google My Business account specified by
    // gmbEmailAddress. Do not add FeedAttributes to this object as Google Ads will add them
    // automatically because this will be a system generated feed.
    Feed gmbFeed =
        Feed.newBuilder()
            .setName(StringValue.of("Google My Business feed #" + System.currentTimeMillis()))
            // Configures the location feed populated from Google My Business Locations.
            .setPlacesLocationFeedData(
                PlacesLocationFeedData.newBuilder()
                    .setEmailAddress(StringValue.of(gmbEmailAddress))
                    .setBusinessAccountId(StringValue.of(businessAccountIdentifier))
                    // Used to filter Google My Business listings by labels. If entries exist in
                    // label_filters, only listings that have at least one of the labels set are
                    // candidates to be synchronized into FeedItems. If no entries exist in
                    // label_filters, then all listings are candidates for syncing.
                    .addLabelFilters(StringValue.of("Stores in New York"))
                    // Sets the authentication info to be able to connect Google Ads to the GMB
                    // account.
                    .setOauthInfo(
                        OAuthInfo.newBuilder()
                            .setHttpMethod(StringValue.of("GET"))
                            .setHttpRequestUrl(StringValue.of(GOOGLE_ADS_SCOPE))
                            .setHttpAuthorizationHeader(StringValue.of("Bearer " + gmbAccessToken))
                            .build())
                    .build())
            // Since this feed's feed items will be managed by Google,
            // you must set its origin to GOOGLE.
            .setOrigin(FeedOrigin.GOOGLE)
            .build();

    FeedOperation operation = FeedOperation.newBuilder().setCreate(gmbFeed).build();

    try (FeedServiceClient feedServiceClient =
        googleAdsClient.getLatestVersion().createFeedServiceClient()) {
      // Adds the feed. Since it is a system generated feed, Google Ads will automatically:
      // 1. Set up the FeedAttributes on the feed.
      // 2. Set up a FeedMapping that associates the FeedAttributes of the feed
      // with the placeholder fields of the LOCATION placeholder type.
      MutateFeedsResponse response =
          feedServiceClient.mutateFeeds(Long.toString(customerId), ImmutableList.of(operation));
      String gmbFeedResourceName = response.getResults(0).getResourceName();
      System.out.printf("GMB feed created with resource name: %s%n", gmbFeedResourceName);

      // Adds a CustomerFeed that associates the feed with this customer for
      // the LOCATION placeholder type.
      CustomerFeed customerFeed =
          CustomerFeed.newBuilder()
              .setFeed(StringValue.of(gmbFeedResourceName))
              .addPlaceholderTypes(PlaceholderType.LOCATION)
              // Creates a matching function that will always evaluate to true.
              .setMatchingFunction(
                  MatchingFunction.newBuilder()
                      .addLeftOperands(
                          Operand.newBuilder()
                              .setConstantOperand(
                                  ConstantOperand.newBuilder()
                                      .setBooleanValue(BoolValue.of(true))
                                      .build())
                              .build())
                      .setFunctionString(StringValue.of("IDENTITY(true)"))
                      .setOperator(MatchingFunctionOperator.IDENTITY)
                      .build())
              .build();

      CustomerFeedOperation customerFeedOperation =
          CustomerFeedOperation.newBuilder().setCreate(customerFeed).build();

      try (CustomerFeedServiceClient customerFeedServiceClient =
          googleAdsClient.getLatestVersion().createCustomerFeedServiceClient()) {

        // After the completion of the Feed ADD operation above the added feed will not be available
        // for usage in a CustomerFeed until the sync between the Google Ads and GMB accounts
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
