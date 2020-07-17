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

package com.google.ads.googleads.examples.reporting;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v4.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v4.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.StreamController;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Shows how to download a set of reports from a list of accounts in parallel.
 *
 * <p>If you need to obtain a list of accounts, please see the {@link
 * com.google.ads.googleads.examples.accountmanagement.GetAccountHierarchy} or {@link
 * com.google.ads.googleads.examples.accountmanagement.ListAccessibleCustomers} examples.
 */
public class ParallelReportDownload {

  // Adjust as required.
  /** Defines the Google Ads Query Language (GAQL) query strings to run for each customer ID. */
  private static final List<String> GAQL_QUERY_STRINGS =
      ImmutableList.of(
          "SELECT campaign.id, metrics.impressions, metrics.clicks"
              + " FROM campaign"
              + " WHERE segments.date DURING LAST_30_DAYS",
          "SELECT campaign.id, ad_group.id, metrics.impressions, metrics.clicks"
              + " FROM ad_group"
              + " WHERE segments.date DURING LAST_30_DAYS");

  private static class ParallelReportDownloadParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_ID,
        required = true,
        description = "Specify a comma-separated list of customer IDs to downloads reports from.")
    List<Long> customerIds;

    @Parameter(
        names = ArgumentNames.LOGIN_CUSTOMER_ID,
        description =
            "Optionally specify the manager account ID which provides access to the customer IDs")
    Long loginCustomerId;
  }

  public static void main(String[] args) throws InterruptedException {
    ParallelReportDownloadParams params = new ParallelReportDownloadParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerIds = ImmutableList.of(Long.valueOf("INSERT CUSTOMER IDS"));
      // Optionally specify the login customer ID if your access to the CIDs is via a manager
      // account.
      // params.loginCustomerId = Long.parseLong("INSERT_LOGIN_CUSTOMER_ID");
    }

    GoogleAdsClient googleAdsClient;
    try {
      GoogleAdsClient.Builder builder = GoogleAdsClient.newBuilder().fromPropertiesFile();
      if (params.loginCustomerId != null) {
        builder.setLoginCustomerId(params.loginCustomerId);
      }
      googleAdsClient = builder.build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new ParallelReportDownload().runExample(googleAdsClient, params.customerIds);
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
   * @param googleAdsClient the client library instance for API access.
   * @param customerIds the customer IDs to run against.
   */
  private void runExample(GoogleAdsClient googleAdsClient, List<Long> customerIds)
      throws InterruptedException {
    // Creates a single client which can be shared by all threads.
    // gRPC handles multiplexing parallel requests to the underlying API connection.
    try (GoogleAdsServiceClient serviceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // IMPORTANT: You should avoid hitting the same customer ID in parallel. There are rate limits
      // at the customer ID level which are much stricter than limits at the developer token level.
      // Hitting these limits frequently enough will significantly reduce throughput as the client
      // library will automatically retry with exponential back-off before failing the request.
      for (String gaqlQuery : GAQL_QUERY_STRINGS) {
        // Uses a list of futures to make sure that we wait for this report to complete on all
        // customer IDs before proceeding. The Future data type here is just for demonstration.
        List<ListenableFuture<ReportSummary>> futures = new ArrayList<>();

        // Uses the API to retrieve the report for each customer ID.
        for (Long customerId : customerIds) {
          // Uses the gRPC asynchronous API to download the reports in parallel. This saves having
          // to create/manage our own thread pool.
          ResponseCountingObserver responseObserver = new ResponseCountingObserver(customerId);

          // Starts the report download in a background thread.
          serviceClient
              .searchStreamCallable()
              .call(
                  SearchGoogleAdsStreamRequest.newBuilder()
                      .setCustomerId(customerId.toString())
                      .setQuery(gaqlQuery)
                      .build(),
                  responseObserver);

          // Stores a future to retrieve the results.
          futures.add(responseObserver.asFuture());
        }

        // Waits for all pending requests to the current set of customer IDs to complete.
        //
        // This is a naive implementation for illustrative purposes. It is possible to optimize the
        // utilization of each customer ID by providing a queue of work (or similar). However, this
        // would complicate the example code and so is omitted here.
        List<ReportSummary> results = Futures.allAsList(futures).get();

        System.out.println("Report results for query: " + gaqlQuery);
        results.forEach(System.out::println);
      }
    } catch (ExecutionException e) {
      throw new RuntimeException(e);
    }
  }

  /** An observer which records a simple count of the result rows received. */
  private static class ResponseCountingObserver
      implements ResponseObserver<SearchGoogleAdsStreamResponse> {

    private final long customerId;
    private final SettableFuture<ReportSummary> future = SettableFuture.create();
    private final AtomicLong numResponses = new AtomicLong(0);

    ResponseCountingObserver(long customerId) {
      this.customerId = customerId;
    }

    @Override
    public void onStart(StreamController controller) {
      // Nothing to do here.
    }

    @Override
    public void onResponse(SearchGoogleAdsStreamResponse response) {
      // Does something useful with the response. In this case we just count the responses, but
      // could also write the response to a database/file, pass the response on to another method
      // for further processing, etc.
      numResponses.incrementAndGet();
      // Note: this method may be called from multiple threads, though responses will always arrive
      // in the same order as returned by the API.
    }

    @Override
    public void onError(Throwable t) {
      // Notify that this report failed.
      notifyResultReady(new ReportSummary(customerId, numResponses.get(), t));
    }

    @Override
    public void onComplete() {
      // Notify that this report succeeded.
      notifyResultReady(new ReportSummary(customerId, numResponses.get()));
    }

    /** Sets the value on the future and unblocks any threads waiting for result. */
    private void notifyResultReady(ReportSummary summary) {
      future.set(summary);
    }

    /** Gets a {@link ListenableFuture} which represents the result of this stream. */
    ListenableFuture<ReportSummary> asFuture() {
      return future;
    }
  }

  /** Summarizes the result of a reporting API call. */
  private static class ReportSummary {

    private final Long customerId;
    private final long numResponses;
    private final Throwable throwable;

    ReportSummary(Long customerId, long numResponses, Throwable throwable) {
      this.customerId = customerId;
      this.throwable = throwable;
      this.numResponses = numResponses;
    }

    ReportSummary(Long customerId, long numResponses) {
      this(customerId, numResponses, null);
    }

    boolean isSuccess() {
      return throwable == null;
    }

    @Override
    public String toString() {
      return "Customer ID '"
          + customerId
          + "' Number of responses: "
          + numResponses
          + " IsSuccess? "
          + (isSuccess() ? "Yes!" : "No :-( Why? " + throwable.getMessage());
    }
  }
}
