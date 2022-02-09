//
// Copyright 2020 Google LLC
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

package com.google.ads.googleads.examples.misc;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v10.enums.MediaTypeEnum.MediaType;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.MediaBundle;
import com.google.ads.googleads.v10.resources.MediaFile;
import com.google.ads.googleads.v10.services.MediaFileOperation;
import com.google.ads.googleads.v10.services.MediaFileServiceClient;
import com.google.ads.googleads.v10.services.MutateMediaFilesResponse;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

/**
 * Uploads an HTML5 zip file as a media bundle. More information about media bundles can be found at
 * https://developers.google.com/google-ads/api/docs/assets/overview.
 */
public class UploadMediaBundle {

  private static final String BUNDLE_URL = "https://gaagl.page.link/ib87";

  private static class UploadMediaBundleParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) throws IOException {
    UploadMediaBundleParams params = new UploadMediaBundleParams();
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
      new UploadMediaBundle().runExample(googleAdsClient, params.customerId);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) throws IOException {

    // Reads the sample media bundle from the URL into a byte array.
    byte[] bundleData = ByteStreams.toByteArray(new URL(BUNDLE_URL).openStream());

    // Creates a media bundle file.
    MediaBundle bundle = MediaBundle.newBuilder().setData(ByteString.copyFrom(bundleData)).build();

    // Creates a media file.
    MediaFile file =
        MediaFile.newBuilder()
            .setName("Ad Media Bundle")
            .setType(MediaType.MEDIA_BUNDLE)
            .setSourceUrl(BUNDLE_URL)
            .setMediaBundle(bundle)
            .build();

    // Creates a media file operation.
    MediaFileOperation op = MediaFileOperation.newBuilder().setCreate(file).build();

    // Issues a mutate request to add the media file.
    try (MediaFileServiceClient mediaFileServiceClient =
        googleAdsClient.getLatestVersion().createMediaFileServiceClient()) {
      MutateMediaFilesResponse response =
          mediaFileServiceClient.mutateMediaFiles(Long.toString(customerId), Arrays.asList(op));
      System.out.printf(
          "The media bundle with resource name '%s' was added.%n",
          response.getResults(0).getResourceName());
    }
  }
}
