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

package com.google.ads.googleads.examples.remarketing;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v15.enums.CustomAudienceMemberTypeEnum.CustomAudienceMemberType;
import com.google.ads.googleads.v15.enums.CustomAudienceStatusEnum.CustomAudienceStatus;
import com.google.ads.googleads.v15.enums.CustomAudienceTypeEnum.CustomAudienceType;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.resources.CustomAudience;
import com.google.ads.googleads.v15.resources.CustomAudienceMember;
import com.google.ads.googleads.v15.services.CustomAudienceOperation;
import com.google.ads.googleads.v15.services.CustomAudienceServiceClient;
import com.google.ads.googleads.v15.services.MutateCustomAudiencesResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Illustrates adding a custom audience. Custom audiences help you reach your ideal audience by
 * entering relevant keywords, URLs and apps. For more information about custom audiences, see:
 * https://support.google.com/google-ads/answer/9805516.
 */
public class AddCustomAudience {

  private static class AddCustomAudienceParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    AddCustomAudienceParams params = new AddCustomAudienceParams();
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
      new AddCustomAudience().runExample(googleAdsClient, params.customerId);
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
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a CustomAudience object to represent the new audience.
    CustomAudience customAudience =
        CustomAudience.newBuilder()
            .setName("Example CustomAudience #" + getPrintableDateTime())
            .setDescription("Custom audiences who have searched specific terms on Google Search")
            // Matches customers by what they searched on Google Search.
            // Note: "INTEREST" OR "PURCHASE_INTENT" is not allowed for the type field
            //       of newly created custom audience. Use "AUTO" instead of these 2 options
            //       when creating a new custom audience.
            .setType(CustomAudienceType.SEARCH)
            .setStatus(CustomAudienceStatus.ENABLED)

            // Lists the members that this custom audience is composed of. Customers that meet any
            // of the membership conditions will be reached.

            // Adds Keywords or keyword phrases, which describe the customers' interests or search
            // terms.
            .addMembers(createCustomAudienceMember(CustomAudienceMemberType.KEYWORD, "mars cruise"))
            .addMembers(
                createCustomAudienceMember(CustomAudienceMemberType.KEYWORD, "jupiter cruise"))

            // Adds website URLs that your customers might visit.
            .addMembers(
                createCustomAudienceMember(
                    CustomAudienceMemberType.URL, "http://www.example.com/locations/mars"))
            .addMembers(
                createCustomAudienceMember(
                    CustomAudienceMemberType.URL, "http://www.example.com/locations/jupiter"))

            // Adds package names of Android apps which customers might install.
            .addMembers(
                createCustomAudienceMember(
                    CustomAudienceMemberType.APP, "com.google.android.apps.adwords"))
            .build();

    // Creates an operation to add the CustomAudience.
    CustomAudienceOperation operation =
        CustomAudienceOperation.newBuilder().setCreate(customAudience).build();

    // Creates an API client and send the mutate request.
    try (CustomAudienceServiceClient serviceClient =
        googleAdsClient.getLatestVersion().createCustomAudienceServiceClient()) {
      // Issues the mutate request.
      MutateCustomAudiencesResponse response =
          serviceClient.mutateCustomAudiences(
              String.valueOf(customerId), ImmutableList.of(operation));

      // Prints some information about the result.
      System.out.printf(
          "New custom audience added with resource name: '%s'.\n",
          response.getResults(0).getResourceName());
    }
  }

  /**
   * Constructs a {@link CustomAudienceMember} from a {@link CustomAudienceMemberType} and value for
   * the member type.
   */
  private static CustomAudienceMember createCustomAudienceMember(
      CustomAudienceMemberType memberType, String value) {
    CustomAudienceMember.Builder builder =
        CustomAudienceMember.newBuilder().setMemberType(memberType);
    if (memberType == CustomAudienceMemberType.KEYWORD) {
      builder.setKeyword(value);
    } else if (memberType == CustomAudienceMemberType.URL) {
      builder.setUrl(value);
    } else if (memberType == CustomAudienceMemberType.APP) {
      builder.setApp(value);
    }
    return builder.build();
  }
}
