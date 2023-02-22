// Copyright 2020 Google LLC
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

package com.google.ads.googleads.examples.misc;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v13.errors.GoogleAdsError;
import com.google.ads.googleads.v13.errors.GoogleAdsException;
import com.google.ads.googleads.v13.services.GoogleAdsRow;
import com.google.ads.googleads.v13.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v13.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v13.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v13.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v13.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.grpc.GrpcCallContext;
import com.google.api.gax.rpc.ServerStream;
import com.google.api.gax.rpc.StatusCode.Code;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.threeten.bp.Duration;

/**
 * Illustrates the use of custom client timeouts in the context of server streaming and unary calls.
 *
 * <p>For more information about the concepts, see this documentation:
 * https://grpc.io/docs/what-is-grpc/core-concepts/#rpc-life-cycle.
 */
public class SetCustomClientTimeouts {
  private static final int CLIENT_TIMEOUT_MILLIS = 5 * 60 * 1000; // 5 minutes in milliseconds.

  private static class SetCustomClientTimeoutsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) throws IOException {
    SetCustomClientTimeoutsParams params = new SetCustomClientTimeoutsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new SetCustomClientTimeouts().runExample(googleAdsClient, params.customerId);
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

  /** Runs the example. */
  private void runExample(GoogleAdsClient googleAdsClient, Long customerId) {
    makeServerStreamingCall(googleAdsClient, customerId);
    makeUnaryCall(googleAdsClient, customerId);
  }

  /** Makes a server streaming call using a custom client timeout. */
  // [START set_custom_client_timeouts]
  private void makeServerStreamingCall(GoogleAdsClient googleAdsClient, Long customerId) {
    StringBuilder output = new StringBuilder();
    try (GoogleAdsServiceClient serviceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues a search stream request by setting a custom client timeout
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          serviceClient
              .searchStreamCallable()
              .call(
                  SearchGoogleAdsStreamRequest.newBuilder()
                      .setCustomerId(String.valueOf(customerId))
                      .setQuery("SELECT campaign.id FROM campaign")
                      .build(),
                  // Sets the timeout to use.
                  // Note: This overrides the default value and can lead to
                  // RequestError.RPC_DEADLINE_TOO_SHORT errors when too small. We recommend
                  // to do it only if necessary.
                  GrpcCallContext.createDefault()
                      .withTimeout(Duration.ofMillis(CLIENT_TIMEOUT_MILLIS)));
      // Iterates over all rows in all messages and collects the campaign IDs.
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          output.append(" ").append(googleAdsRow.getCampaign().getId());
        }
      }
      System.out.println("The server streaming call completed before the timeout");
    } catch (GoogleAdsException ex) {
      if (ex.getStatusCode().getCode() == Code.DEADLINE_EXCEEDED) {
        System.out.println("The server streaming call did not complete before the timeout.");
      } else {
        // Bubbles up if the exception is not about timeout.
        throw ex;
      }
    } finally {
      System.out.printf("All campaign IDs retrieved: %s.%n", output.toString());
    }
  }
  // [END set_custom_client_timeouts]

  /** Makes an unary call using a custom client timeout. */
  // [START set_custom_client_timeouts_1]
  private void makeUnaryCall(GoogleAdsClient googleAdsClient, Long customerId) {
    StringBuilder output = new StringBuilder();
    try (GoogleAdsServiceClient serviceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues a search paged request by setting a custom client timeout
      SearchPagedResponse pagedResponse =
          serviceClient
              .searchPagedCallable()
              .call(
                  SearchGoogleAdsRequest.newBuilder()
                      .setCustomerId(String.valueOf(customerId))
                      .setQuery("SELECT campaign.id FROM campaign")
                      .build(),
                  // Sets the timeout to use.
                  GrpcCallContext.createDefault()
                      .withTimeout(Duration.ofMillis(CLIENT_TIMEOUT_MILLIS)));
      // Iterates over all rows in all messages and collects the campaign IDs.
      for (GoogleAdsRow row : pagedResponse.iterateAll()) {
        output.append(" ").append(row.getCampaign().getId());
      }
      System.out.println("The search paged call completed before the timeout");
    } catch (GoogleAdsException ex) {
      if (ex.getStatusCode().getCode() == Code.DEADLINE_EXCEEDED) {
        System.out.println("The search paged call did not complete before the timeout.");
      } else {
        // Bubbles up if the exception is not about timeout.
        throw ex;
      }
    } finally {
      System.out.printf("All campaign IDs retrieved: %s.%n", output.toString());
    }
  }
  // [END set_custom_client_timeouts_1]
}
