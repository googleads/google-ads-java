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

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v2.common.GmailAdInfo;
import com.google.ads.googleads.v2.common.GmailTeaser;
import com.google.ads.googleads.v2.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v2.enums.MediaTypeEnum.MediaType;
import com.google.ads.googleads.v2.enums.MimeTypeEnum.MimeType;
import com.google.ads.googleads.v2.errors.GoogleAdsError;
import com.google.ads.googleads.v2.errors.GoogleAdsException;
import com.google.ads.googleads.v2.resources.Ad;
import com.google.ads.googleads.v2.resources.AdGroupAd;
import com.google.ads.googleads.v2.resources.MediaFile;
import com.google.ads.googleads.v2.resources.MediaImage;
import com.google.ads.googleads.v2.services.AdGroupAdOperation;
import com.google.ads.googleads.v2.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v2.services.MediaFileOperation;
import com.google.ads.googleads.v2.services.MediaFileServiceClient;
import com.google.ads.googleads.v2.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v2.services.MutateMediaFileResult;
import com.google.ads.googleads.v2.services.MutateMediaFilesResponse;
import com.google.ads.googleads.v2.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Adds a Gmail ad to a given ad group. The ad group's campaign needs to have an
 * AdvertisingChannelType of DISPLAY and AdvertisingChannelSubType of DISPLAY_GMAIL_AD.
 */
public class AddGmailAd {
  private static class AddGmailAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID)
    private Long adGroupId;
  }

  public static void main(String[] args) throws IOException {
    AddGmailAdParams params = new AddGmailAdParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
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
      new AddGmailAd().runExample(googleAdsClient, params);
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
   * @param params the ads entities to use when running the example.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   * @throws IOException if there is an error opening the image files.
   */
  public void runExample(GoogleAdsClient googleAdsClient, AddGmailAdParams params)
      throws IOException {
    Map<String, String> mediaFiles = addMediaFiles(googleAdsClient, params.customerId);
    addGmailAd(googleAdsClient, params.customerId, params.adGroupId, mediaFiles);
  }

  /**
   * Adds the image files.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   * @throws IOException if there is an error opening the image files.
   * @return a hash map of the image file resource names.
   */
  private Map<String, String> addMediaFiles(GoogleAdsClient googleAdsClient, long customerId)
      throws IOException {
    // Creates a bytes array from the logo image data.
    byte[] logoImageData = ByteStreams.toByteArray(new URL("https://goo.gl/mtt54n").openStream());

    // Creates the logo image.
    MediaFile mediaFileLogo =
        MediaFile.newBuilder()
            .setType(MediaType.IMAGE)
            .setImage(
                MediaImage.newBuilder()
                    .setData(BytesValue.of(ByteString.copyFrom(logoImageData)))
                    .build())
            .setMimeType(MimeType.IMAGE_PNG)
            .build();

    // Creates the operation for the logo image.
    MediaFileOperation mediaFileLogoOperation =
        MediaFileOperation.newBuilder().setCreate(mediaFileLogo).build();

    // Creates a bytes array from the marketing image data.
    byte[] marketingImageData =
        ByteStreams.toByteArray(new URL("https://goo.gl/3b9Wfh").openStream());

    // Creates the marketing image.
    MediaFile mediaFileMarketing =
        MediaFile.newBuilder()
            .setType(MediaType.IMAGE)
            .setImage(
                MediaImage.newBuilder()
                    .setData(BytesValue.of(ByteString.copyFrom(marketingImageData)))
                    .build())
            .setMimeType(MimeType.IMAGE_JPEG)
            .build();

    // Creates the operation for the marketing image.
    MediaFileOperation mediaFileMarketingOperation =
        MediaFileOperation.newBuilder().setCreate(mediaFileMarketing).build();

    // Creates the media file service client.
    try (MediaFileServiceClient mediaFileServiceClient =
        googleAdsClient.getLatestVersion().createMediaFileServiceClient()) {
      // Adds the media files.
      MutateMediaFilesResponse response =
          mediaFileServiceClient.mutateMediaFiles(
              Long.toString(customerId),
              ImmutableList.of(mediaFileLogoOperation, mediaFileMarketingOperation));
      // Displays the results.
      for (MutateMediaFileResult result : response.getResultsList()) {
        System.out.printf(
            "Created media file with resource name '%s'.%n", result.getResourceName());
      }
      // Creates a map of the media files to return.
      Map<String, String> mediaFiles = new HashMap<>();
      mediaFiles.put("logoResourceName", response.getResults(0).getResourceName());
      mediaFiles.put("marketingImageResourceName", response.getResults(1).getResourceName());
      return mediaFiles;
    }
  }

  /**
   * Adds the gmail ad.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupId the ad group ID.
   * @param mediaFiles a map with keys of unique string identifiers and values of media file
   *     resource names.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   * @throws IOException if there is an error opening the image files.
   */
  private void addGmailAd(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      Map<String, String> mediaFiles) {
    // Creates the Gmail ad info.
    GmailAdInfo gmailAdInfo =
        GmailAdInfo.newBuilder()
            // Sets the teaser information.
            .setTeaser(
                GmailTeaser.newBuilder()
                    .setHeadline(StringValue.of("Dream"))
                    .setDescription(StringValue.of("Create your own adventure"))
                    .setBusinessName(StringValue.of("Interplanetary Ships"))
                    .setLogoImage(StringValue.of(mediaFiles.get("logoResourceName")))
                    .build())
            // Sets the marketing image and other information.
            .setMarketingImage(StringValue.of(mediaFiles.get("marketingImageResourceName")))
            .setMarketingImageHeadline(StringValue.of("Travel"))
            .setMarketingImageDescription(StringValue.of("Take to the skies!"))
            .build();

    // Creates the ad.
    Ad ad =
        Ad.newBuilder()
            .setName(StringValue.of("Gmail Ad #" + System.currentTimeMillis()))
            .addFinalUrls(StringValue.of("http://www.example.com"))
            .setGmailAd(gmailAdInfo)
            .build();

    // Gets the ad group resource name.
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);

    // Creates the ad group ad.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAd(ad)
            .setStatus(AdGroupAdStatus.PAUSED)
            .setAdGroup(StringValue.of(adGroupResourceName))
            .build();

    // Creates the operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Creates the ad group ad service client.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(operation));
      // Displays the results.
      System.out.printf(
          "Created ad group ad with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
}
