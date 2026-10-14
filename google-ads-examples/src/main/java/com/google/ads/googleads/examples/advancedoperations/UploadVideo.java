// Copyright 2026 Google LLC
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

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v26.enums.YouTubeVideoPrivacyEnum.YouTubeVideoPrivacy;
import com.google.ads.googleads.v26.errors.GoogleAdsError;
import com.google.ads.googleads.v26.errors.GoogleAdsException;
import com.google.ads.googleads.v26.resources.YouTubeVideoUpload;
import com.google.ads.googleads.v26.services.CreateYouTubeVideoUploadRequest;
import com.google.ads.googleads.v26.services.CreateYouTubeVideoUploadResponse;
import com.google.ads.googleads.v26.services.GoogleAdsRow;
import com.google.ads.googleads.v26.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v26.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v26.services.SearchGoogleAdsStreamResponse;
import com.google.ads.googleads.v26.services.YouTubeVideoUploadServiceClient;
import com.google.api.gax.rpc.ServerStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/** This example illustrates how to upload videos to YouTube. */
public class UploadVideo {

  private static class UploadVideoParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.VIDEO_FILE, required = true)
    private String videoFile;
  }

  public static void main(String[] args) {
    UploadVideoParams params = new UploadVideoParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.videoFile = "INSERT_VIDEO_FILE_HERE";
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
      new UploadVideo().runExample(googleAdsClient, params.customerId, params.videoFile);
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
   * @param videoFile the absolute path to a video file on your machine.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, String videoFile) {
    // [START upload_video_1]
    String videoUploadResourceName;
    try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
        googleAdsClient.getLatestVersion().createYouTubeVideoUploadServiceClient()) {
      YouTubeVideoUpload youTubeVideoUpload =
          YouTubeVideoUpload.newBuilder()
              .setVideoTitle("Test Video")
              .setVideoDescription("Test Video Description")
              .setVideoPrivacy(YouTubeVideoPrivacy.UNLISTED)
              .build();

      CreateYouTubeVideoUploadRequest createUploadRequest =
          CreateYouTubeVideoUploadRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setYouTubeVideoUpload(youTubeVideoUpload)
              .build();

      CreateYouTubeVideoUploadResponse response =
          youTubeVideoUploadServiceClient.createYouTubeVideoUpload(
              createUploadRequest, () -> new FileInputStream(videoFile), null);

      videoUploadResourceName = response.getResourceName();
      System.out.printf("Created YouTube video upload: %s%n", videoUploadResourceName);
    }
    // [END upload_video_1]

    // [START upload_video_3]
    // Retrieve the metadata of the newly uploaded video.
    String query =
        String.format(
            "SELECT "
                + "you_tube_video_upload.resource_name, "
                + "you_tube_video_upload.video_id, "
                + "you_tube_video_upload.state "
                + "FROM you_tube_video_upload "
                + "WHERE you_tube_video_upload.resource_name = '%s'",
            videoUploadResourceName);

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(query)
              .build();

      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          YouTubeVideoUpload video = googleAdsRow.getYouTubeVideoUpload();
          System.out.printf(
              "Video with ID %s was found in state %s.%n",
              video.getVideoId(), video.getState());
        }
      }
    }
    // [END upload_video_3]
  }
}
