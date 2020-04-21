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
import com.google.ads.googleads.v3.enums.MediaTypeEnum.MediaType;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.MediaBundle;
import com.google.ads.googleads.v3.resources.MediaFile;
import com.google.ads.googleads.v3.services.MediaFileOperation;
import com.google.ads.googleads.v3.services.MediaFileServiceClient;
import com.google.ads.googleads.v3.services.MutateMediaFilesResponse;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

/**
 * This example uploads an HTML5 zip file as a Media Bundle. More information about Media Bundle can
 * be found at https://developers.google.com/google-ads/api/docs/assets/overview.
 */
public class UploadMediaBundle {

  private static final String BUNDLE_URL = "https://goo.gl/9Y7qI2";

  public static void main(String[] args) throws IOException {
    UploadMediaBundleParams params = new UploadMediaBundleParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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

    byte[] bundleData = ByteStreams.toByteArray(new URL(BUNDLE_URL).openStream());

    // Creates a media bundle file.
    MediaBundle bundle =
        MediaBundle.newBuilder().setData(BytesValue.of(ByteString.copyFrom(bundleData))).build();

    MediaFile file =
        MediaFile.newBuilder()
            .setName(StringValue.of("Ad Media Bundle"))
            .setType(MediaType.MEDIA_BUNDLE)
            .setSourceUrl(StringValue.of(BUNDLE_URL))
            .setMediaBundle(bundle)
            .build();

    // Creates a MediaFile operation.
    MediaFileOperation op = MediaFileOperation.newBuilder().setCreate(file).build();

    // Creates the MediaFile service client.
    try (MediaFileServiceClient mediaFileServiceClient =
        googleAdsClient.getLatestVersion().createMediaFileServiceClient()) {
      MutateMediaFilesResponse response =
          mediaFileServiceClient.mutateMediaFiles(Long.toString(customerId), Arrays.asList(op));
      System.out.printf(
          "The media bundle with resource name '%s' was added.%n",
          response.getResults(0).getResourceName());
    }
  }

  private static class UploadMediaBundleParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }
}