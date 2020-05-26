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
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v3.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v3.services.SearchGoogleAdsStreamResponse;
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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public class ParallelReportDownload {

  // Adjust these fields as required.
  /** Defines the Google Ads Query Language (GAQL) query strings to run for each customer ID. */
  private static final List<String> GAQL_QUERY_STRINGS =
      ImmutableList.of(
          "SELECT campaign.id, metrics.impressions, metrics.clicks FROM campaign",
          "SELECT campaign.id, ad_group.id, metrics.impressions, metrics.clicks FROM ad_group");

  /** Specifies the maximum duration that this code example may run for. */
  private static final int MAX_WAIT_TIME_SECONDS = 60 * 60; // 1 hour.

  /** Absolute wall clock time by when the job must be completed. */
  private static final long DEADLINE_MILLIS =
      System.currentTimeMillis() + MAX_WAIT_TIME_SECONDS * 1000;

  private static class ParallelReportDownloadParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    List<Long> customerIds;

    @Parameter(names = ArgumentNames.LOGIN_CUSTOMER_ID)
    Long loginCustomerId;
  }

  public static void main(String[] args) {
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
   * Runs the example. This method may block for up to MAX_WAIT_TIME_SECONDS while waiting for
   * reports to complete.
   *
   * @param googleAdsClient the client library instance for API access.
   */
  private void runExample(GoogleAdsClient googleAdsClient, List<Long> customerIds) {
    // Creates a single client which can be shared by all threads.
    // gRPC handles multiplexing parallel requests to the underlying API connection.
    try (GoogleAdsServiceClient serviceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // IMPORTANT: You should avoid hitting the same customer ID in parallel. There are rate limit
      // errors at the customer ID level, but not at the developer token level. Rate limits are
      // retried by the client library with exponential back-off, and therefore would reduce overall
      // throughput.
      for (String gaqlQuery : GAQL_QUERY_STRINGS) {
        // Uses a list of futures to make sure that we wait for this report to complete on all
        // customer IDs before proceeding. The Future data type here is just for demonstration.
        List<ListenableFuture<ReportSummary>> futures = new ArrayList<>();

        // Calls the API for each customer ID on the current report.
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
        List<ReportSummary> results =
            Futures.allAsList(futures)
                .get(DEADLINE_MILLIS - System.currentTimeMillis(), TimeUnit.MILLISECONDS);

        System.out.println("Report results for query: " + gaqlQuery);
        results.forEach(System.out::println);
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    } catch (ExecutionException | TimeoutException e) {
      throw new RuntimeException(e);
    }
  }

  /** An observer which records a simple count of the result rows received. */
  private static class ResponseCountingObserver
      implements ResponseObserver<SearchGoogleAdsStreamResponse> {

    private final long customerId;
    private final SettableFuture<ReportSummary> future = SettableFuture.create();
    private AtomicLong numRecords = new AtomicLong(0);

    ResponseCountingObserver(long customerId) {
      this.customerId = customerId;
    }

    @Override
    public void onStart(StreamController controller) {
      // Nothing to do here.
    }

    @Override
    public void onResponse(SearchGoogleAdsStreamResponse response) {
      // Does something useful with the row. In this case we just count the
      // records. Note that this method may be called from multiple threads, though always in
      // sequence.
      numRecords.incrementAndGet();
    }

    @Override
    public void onError(Throwable t) {
      // Notify that this report failed.
      notifyComplete(new ReportSummary(customerId, numRecords.get(), t));
    }

    @Override
    public void onComplete() {
      // Notify that this report succeeded.
      notifyComplete(new ReportSummary(customerId, numRecords.get()));
    }

    /** Sets the value on the future and unblocks any threads waiting for result. */
    private void notifyComplete(ReportSummary summary) {
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
    private final long numRecords;
    private final Throwable throwable;

    ReportSummary(Long customerId, long numRecords, Throwable throwable) {
      this.customerId = customerId;
      this.throwable = throwable;
      this.numRecords = numRecords;
    }

    ReportSummary(Long customerId, long numRecords) {
      this(customerId, numRecords, null);
    }

    boolean isSuccess() {
      return throwable == null;
    }

    @Override
    public String toString() {
      return "Customer ID "
          + customerId
          + " Number of records: "
          + numRecords
          + " IsSuccess? "
          + (isSuccess() ? "Yes!" : "No :-( " + throwable.getMessage());
    }
  }
}
