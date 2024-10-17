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

package com.google.ads.googleads.examples.errorhandling;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v18.common.KeywordInfo;
import com.google.ads.googleads.v18.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v18.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v18.errors.GoogleAdsError;
import com.google.ads.googleads.v18.errors.GoogleAdsException;
import com.google.ads.googleads.v18.errors.QuotaErrorEnum.QuotaError;
import com.google.ads.googleads.v18.resources.AdGroupCriterion;
import com.google.ads.googleads.v18.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v18.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v18.services.MutateAdGroupCriteriaRequest;
import com.google.ads.googleads.v18.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v18.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles RateExceededError in an application. This code example runs 5 threads in parallel, each
 * thread attempting to validate 100 keywords in a single request. While spanning 5 parallel threads
 * is unlikely to trigger a rate exceeded error, substantially increasing the number of threads may
 * have that effect. Note that this example is for illustrative purposes only, and you shouldn't
 * intentionally try to trigger a rate exceed error in your application.
 */
public class HandleRateExceededError {
  private static class HandleRateExceededErrorParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) throws InterruptedException {
    HandleRateExceededErrorParams params = new HandleRateExceededErrorParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
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
      new HandleRateExceededError()
          .runExample(googleAdsClient, params.customerId, params.adGroupId);
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
   * @param adGroupId the ID of the ad group to which keywords are added.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId)
      throws InterruptedException {
    final int NUM_THREADS = 5;

    List<Thread> threads = new ArrayList<>();

    // Adds 5 threads that validate keywords to a list.
    for (int i = 0; i < NUM_THREADS; i++) {
      KeywordsThread keywordsThread = new KeywordsThread(googleAdsClient, customerId, adGroupId, i);
      Thread thread = new Thread(keywordsThread);
      threads.add(thread);
    }

    // Starts the threads.
    for (Thread thread : threads) {
      thread.start();
    }

    // Ensures the calling thread waits until all threads of terminated.
    for (Thread thread : threads) {
      thread.join();
    }
  }

  /** Thread class for validating keywords */
  private static class KeywordsThread implements Runnable {
    // Number of keywords to be validated in each API call.
    private final int NUM_KEYWORDS = 100;

    // The GoogleAdsClient.
    private final GoogleAdsClient googleAdsClient;

    // The customer ID.
    private final long customerId;

    // The ad group ID to which keywords are added.
    private final long adGroupId;

    // Index of this thread, for identifying and debugging.
    private final int threadIndex;

    /**
     * Initializes a new instance of the KeywordThread
     *
     * @param googleAdsClient the Google Ads API client.
     * @param customerId the client customer ID.
     * @param adGroupId the ID of the ad group to which keywords are added.
     * @param threadIndex the index of the thread.
     */
    public KeywordsThread(
        GoogleAdsClient googleAdsClient, long customerId, long adGroupId, int threadIndex) {
      this.googleAdsClient = googleAdsClient;
      this.customerId = customerId;
      this.adGroupId = adGroupId;
      this.threadIndex = threadIndex;
    }

    /** Main method for the thread. */
    public void run() {
      List<AdGroupCriterionOperation> operations = new ArrayList<>();

      for (int i = 0; i < NUM_KEYWORDS; i++) {
        // Configures the keywordText text and match type settings.
        KeywordInfo keywordInfo =
            KeywordInfo.newBuilder()
                .setText(
                    "mars cruise thread "
                        + String.valueOf(threadIndex)
                        + " seed "
                        + ""
                        + String.valueOf(i))
                .setMatchType(KeywordMatchType.EXACT)
                .build();

        String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);

        // Constructs an ad group criterion using the keywordText configuration above.
        AdGroupCriterion criterion =
            AdGroupCriterion.newBuilder()
                .setAdGroup(adGroupResourceName)
                .setStatus(AdGroupCriterionStatus.PAUSED)
                .setKeyword(keywordInfo)
                .build();

        // Creates the operation.
        AdGroupCriterionOperation operation =
            AdGroupCriterionOperation.newBuilder().setCreate(criterion).build();

        operations.add(operation);
      }

      // Gets the AdGroupCriterionService. This should be done within the thread, since a service
      // can only handle one outgoing HTTP request at a time.
      try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
          googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {

        int retryCount = 0;
        int retrySeconds = 10;
        final int NUM_RETRIES = 3;

        try {
          while (retryCount < NUM_RETRIES) {
            try {
              // Creates the validateOnly request.
              MutateAdGroupCriteriaRequest mutateAdGroupCriteriaRequest =
                  MutateAdGroupCriteriaRequest.newBuilder()
                      .setCustomerId(Long.toString(customerId))
                      .addAllOperations(operations)
                      .setValidateOnly(true)
                      .build();

              // Makes the mutate request. The result set will be empty because validateOnly is set
              // to true in the MutateAdGroupCriteriaRequest.
              MutateAdGroupCriteriaResponse response =
                  adGroupCriterionServiceClient.mutateAdGroupCriteria(mutateAdGroupCriteriaRequest);
              System.out.printf("%d operations validated.%n", operations.size());
              break;
            } catch (GoogleAdsException gae) {
              for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
                // Checks if any of the errors are QuotaError.RESOURCE_EXHAUSTED or
                // QuotaError.RESOURCE_TEMPORARILY_EXHAUSTED.
                if (googleAdsError.getErrorCode().getQuotaError() == QuotaError.RESOURCE_EXHAUSTED
                    || googleAdsError.getErrorCode().getQuotaError()
                        == QuotaError.RESOURCE_TEMPORARILY_EXHAUSTED) {
                  System.err.printf(
                      "Received rate exceeded error, retry after %d seconds.%n", retrySeconds);
                  Thread.sleep(retrySeconds * 1000);
                  retryCount++;
                  // Uses an exponential backoff policy to avoid polling too aggressively.
                  retrySeconds *= 2;
                }
              }
            } finally {
              if (retryCount == NUM_RETRIES) {
                throw new Exception(
                    String.format("Could not recover after making %d attempts.%n", retryCount));
              }
            }
          }
        } catch (Exception e) {
          System.err.printf("Failed to validate keywords.%n", e);
          System.exit(1);
        }
      }
    }
  }
}
