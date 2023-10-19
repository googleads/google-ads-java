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

package com.google.ads.googleads.examples.library;

import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v15.services.GoogleAdsServiceClient;
import com.google.auth.oauth2.UserCredentials;

/**
 * Shows how to configure the client library programmatically.
 *
 * <p>This is useful when you authenticate with many sets of credentials. For example, if you
 * authenticate on behalf of third-party advertisers.
 */
public class ConfigureClientLibraryProgrammatically {

  private static final String DEVELOPER_TOKEN = "INSERT_DEVELOPER_TOKEN";
  private static final String OAUTH_CLIENT_ID = "INSERT_CLIENT_ID";
  private static final String OAUTH_CLIENT_SECRET = "INSERT_CLIENT_SECRET";
  private static final String REFRESH_TOKEN = "INSERT_REFRESH_TOKEN";
  private static final String OPERATING_CUSTOMER_ID = "INSERT_CUSTOMER_ID";
  private static final String LOGIN_CUSTOMER_ID = "INSERT_CUSTOMER_ID";

  public static void main(String[] args) {
    // Sets up the credentials for Google Ads user authentication.
    UserCredentials credentials =
        UserCredentials.newBuilder()
            .setClientId(OAUTH_CLIENT_ID)
            .setClientSecret(OAUTH_CLIENT_SECRET)
            .setRefreshToken(REFRESH_TOKEN)
            .build();

    // Creates a GoogleAdsClient with the provided credentials.
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            // Sets the developer token which enables API access.
            .setDeveloperToken(DEVELOPER_TOKEN)
            // Sets the OAuth credentials which provide Google Ads account access.
            .setCredentials(credentials)
            // Optional: sets the login customer ID. This is required when the Google account
            // authenticated with the refresh token does not have direct access to
            // OPERATING_CUSTOMER_ID and the access is via a manager account. In this case, specify
            // the manager account ID as LOGIN_CUSTOMER_ID.
            .setLoginCustomerId(Long.valueOf(LOGIN_CUSTOMER_ID))
            .build();

    // Uses the client configured with these credentials.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      googleAdsServiceClient.search(OPERATING_CUSTOMER_ID, "SELECT campaign.id FROM campaign");
    }
  }
}
