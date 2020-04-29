// Copyright 2018 Google LLC
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

package com.google.ads.googleads.examples.authentication;

import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.GoogleAdsClient.Builder.ConfigPropertyKey;
import com.google.auth.oauth2.ClientId;
import com.google.auth.oauth2.UserAuthorizer;
import com.google.auth.oauth2.UserCredentials;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

/**
 * Creates an OAuth2 refresh token for the Google Ads API using the Native/Installed application
 * flow.
 *
 * <p>This example is meant to be run from the command line and requires user input.
 */
public class AuthenticateInStandaloneApplication {

  // Scopes for the generated OAuth2 credentials. The list here only contains the AdWords scope,
  // but you can add multiple scopes if you want to use the credentials for other Google APIs.
  private static final ImmutableList<String> SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private static final String CALLBACK_URI = "urn:ietf:wg:oauth:2.0:oob";

  public static void main(String[] args) throws IOException {
    // Generates the client ID and client secret from the Google Cloud Console:
    // https://console.cloud.google.com
    String clientId;
    String clientSecret;

    Console console = System.console();
    if (console == null) {
      // The console will be null when running this example in some IDEs. In this case, please
      // set the clientId and clientSecret in the lines below.
      clientId = "INSERT_CLIENT_ID_HERE";
      clientSecret = "INSERT_CLIENT_SECRET_HERE";
      // Ensures that the client ID and client secret are not the "INSERT_..._HERE" values.
      Preconditions.checkArgument(
          !clientId.matches("INSERT_.*_HERE"),
          "Client ID is invalid. Please update the example and try again.");
      Preconditions.checkArgument(
          !clientSecret.matches("INSERT_.*_HERE"),
          "Client secret is invalid. Please update the example and try again.");
    } else {
      console.printf(
          "NOTE: When prompting for the client secret below, echoing will be disabled%n");
      console.printf("      since the client secret is sensitive information.%n");
      console.printf("Enter your client ID:%n");
      clientId = console.readLine();
      console.printf("Enter your client secret:%n");
      clientSecret = String.valueOf(console.readPassword());
    }

    new AuthenticateInStandaloneApplication().runExample(clientId, clientSecret);
  }

  public void runExample(String clientId, String clientSecret) throws IOException {
    UserAuthorizer userAuthorizer =
        UserAuthorizer.newBuilder()
            .setClientId(ClientId.of(clientId, clientSecret))
            .setScopes(SCOPES)
            .setCallbackUri(URI.create(CALLBACK_URI))
            .build();
    URL authorizationUrl = userAuthorizer.getAuthorizationUrl(null, null, null);
    System.out.printf("Paste this url in your browser:%n%s%n", authorizationUrl);

    // Waits for the authorization code.
    System.out.println("Type the code you received here: ");
    @SuppressWarnings("DefaultCharset") // Reading from stdin, so default charset is appropriate.
    String authorizationCode = new BufferedReader(new InputStreamReader(System.in)).readLine();

    // Exchanges the authorization code for credentials and print the refresh token.
    UserCredentials userCredentials =
        userAuthorizer.getCredentialsFromCode(authorizationCode, null);
    System.out.printf("Your refresh token is: %s%n", userCredentials.getRefreshToken());

    // Prints the configuration file contents.
    Properties adsProperties = new Properties();
    adsProperties.put(ConfigPropertyKey.CLIENT_ID.getPropertyKey(), clientId);
    adsProperties.put(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey(), clientSecret);
    adsProperties.put(
        ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey(), userCredentials.getRefreshToken());
    adsProperties.put(
        ConfigPropertyKey.DEVELOPER_TOKEN.getPropertyKey(), "INSERT_DEVELOPER_TOKEN_HERE");

    showConfigurationFile(adsProperties);
  }

  private void showConfigurationFile(Properties adsProperties) throws IOException {
    System.out.printf(
        "Copy the text below into a file named %s in your home directory, and replace "
            + "INSERT_XXX_HERE with your configuration:%n",
        GoogleAdsClient.Builder.DEFAULT_PROPERTIES_CONFIG_FILE_NAME);
    System.out.println(
        "######################## Configuration file start ########################");
    adsProperties.store(System.out, null);
    System.out.printf(
        "# Required for manager accounts only: Specify the login customer ID used to%n"
            + "# authenticate API calls. This will be the customer ID of the authenticated%n"
            + "# manager account. You can also specify this later in code if your application%n"
            + "# uses multiple manager account + OAuth pairs.%n"
            + "#%n");
    System.out.println(
        "# " + ConfigPropertyKey.LOGIN_CUSTOMER_ID.getPropertyKey() + "=INSERT_LOGIN_CUSTOMER_ID");
    System.out.println(
        "######################## Configuration file end ##########################");
  }
}
