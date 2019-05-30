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
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.util.Key;
import com.google.auth.oauth2.ClientId;
import com.google.auth.oauth2.UserAuthorizer;
import com.google.auth.oauth2.UserCredentials;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Creates an OAuth2 refresh token for the Google Ads API using the Web application flow.
 *
 * <p>This example will start a basic server that listens for requests at {@code
 * http://localhost:PORT}, where {@code PORT} is dynamically assigned.
 *
 * <p>IMPORTANT: You must add {@code http://localhost/oauth2callback} to the "Authorize redirect
 * URIs" list in your Google Cloud Console project before running this example.
 */
public class AuthenticateInWebApplication {

  // Scopes for the generated OAuth2 credentials. The list here only contains the AdWords scope,
  // but you can add multiple scopes if you want to use the credentials for other Google APIs.
  private static final ImmutableList<String> SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();
  private static final String OAUTH2_CALLBACK = "/oauth2callback";

  public static void main(String[] args) throws Exception {
    // To fill in the values below, generate a client ID and client secret from the Google Cloud
    // Console (https://console.cloud.google.com) by creating credentials for a Web application.
    // Set the "Authorized redirect URIs" to:
    //   http://localhost/oauth2callback
    String clientId;
    String clientSecret;
    String loginEmailAddressHint;

    Console console = System.console();
    if (console == null) {
      // The console will be null when running this example in some IDEs. In this case, please
      // set the clientId and clientSecret in the lines below.
      clientId = "INSERT_CLIENT_ID_HERE";
      clientSecret = "INSERT_CLIENT_SECRET_HERE";
      // Optional: If your application knows which user is trying to authenticate, you can set this
      // to the user's email address so that the Google Authentication Server will automatically
      // populate the account selection prompt with that address.
      loginEmailAddressHint = null;
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
      console.printf("(Optional) Enter the login email address hint:%n");
      loginEmailAddressHint = Strings.emptyToNull(console.readLine());
    }

    new AuthenticateInWebApplication().runExample(clientId, clientSecret, loginEmailAddressHint);
  }

  public void runExample(String clientId, String clientSecret, String loginEmailAddressHint)
      throws Exception {
    // Creates an anti-forgery state token as described here:
    // https://developers.google.com/identity/protocols/OpenIDConnect#createxsrftoken
    String state = new BigInteger(130, new SecureRandom()).toString(32);

    // Creates an HTTP server that will listen for the OAuth2 callback request.
    URI baseUri;
    UserAuthorizer userAuthorizer;
    AuthorizationResponse authorizationResponse = null;
    try (SimpleCallbackServer simpleCallbackServer = new SimpleCallbackServer()) {
      userAuthorizer =
          UserAuthorizer.newBuilder()
              .setClientId(ClientId.of(clientId, clientSecret))
              .setScopes(SCOPES)
              .setCallbackUri(URI.create(OAUTH2_CALLBACK))
              .build();
      baseUri = URI.create("http://localhost:" + simpleCallbackServer.getLocalPort());
      System.out.printf(
          "Paste this url in your browser:%n%s%n",
          userAuthorizer.getAuthorizationUrl(loginEmailAddressHint, state, baseUri));

      // Waits for the authorization code.
      simpleCallbackServer.accept();
      authorizationResponse = simpleCallbackServer.authorizationResponse;
    }

    if (authorizationResponse == null || authorizationResponse.code == null) {
      throw new NullPointerException(
          "OAuth2 callback did not contain an authorization code: " + authorizationResponse);
    }

    // Confirms that the state in the response matches the state token used to generate the
    // authorization URL.
    if (!state.equals(authorizationResponse.state)) {
      throw new IllegalStateException("State does not match expected state");
    }

    // Exchanges the authorization code for credentials and print the refresh token.
    UserCredentials userCredentials =
        userAuthorizer.getCredentialsFromCode(authorizationResponse.code, baseUri);
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

  /** Basic server that listens for the OAuth2 callback from the Web application flow. */
  private static class SimpleCallbackServer extends ServerSocket {

    private AuthorizationResponse authorizationResponse;

    SimpleCallbackServer() throws IOException {
      // Passes a port # of zero so that a port will be automatically allocated.
      super(0);
    }

    /**
     * Blocks until a connection is made to this server. After this method completes, the
     * authorizationResponse of this server will be set, provided the request line is in the
     * expected format.
     */
    @Override
    public Socket accept() throws IOException {
      Socket socket = super.accept();

      try (BufferedReader in =
          new BufferedReader(
              new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))) {
        String callbackRequest = in.readLine();
        // Uses a regular expression to extract the request line from the first line of the
        // callback request, e.g.:
        //   GET /?code=AUTH_CODE&state=XYZ&scope=https://www.googleapis.com/auth/adwords HTTP/1.1
        Pattern pattern = Pattern.compile("GET +([^ ]+)");
        Matcher matcher = pattern.matcher(Strings.nullToEmpty(callbackRequest));
        if (matcher.find()) {
          String relativeUrl = matcher.group(1);
          authorizationResponse = new AuthorizationResponse("http://localhost" + relativeUrl);
        }
        try (Writer outputWriter = new OutputStreamWriter(socket.getOutputStream())) {
          outputWriter.append("HTTP/1.1 ");
          outputWriter.append(Integer.toString(HttpStatusCodes.STATUS_CODE_OK));
          outputWriter.append(" OK\n");
          outputWriter.append("Content-Type: text/html\n\n");

          outputWriter.append("<b>");
          if (authorizationResponse.code != null) {
            outputWriter.append("Authorization code was successfully retrieved.");
          } else {
            outputWriter.append("Failed to retrieve authorization code.");
          }
          outputWriter.append("</b>");
          outputWriter.append("<p>Please check the console output from <code>");
          outputWriter.append(AuthenticateInWebApplication.class.getSimpleName());
          outputWriter.append("</code> for further instructions.");
        }
      }
      return socket;
    }
  }

  /** Response object with attributes corresponding to OAuth2 callback parameters. */
  static class AuthorizationResponse extends GenericUrl {

    /** The authorization code to exchange for an access token and (optionally) a refresh token. */
    @Key String code;

    /** Error from the request or from the processing of the request. */
    @Key String error;

    /** State parameter from the callback request. */
    @Key String state;

    /**
     * Constructs a new instance based on an absolute URL. All fields annotated with the {@link Key}
     * annotation will be set if they are present in the URL.
     *
     * @param encodedUrl absolute URL with query parameters.
     */
    public AuthorizationResponse(String encodedUrl) {
      super(encodedUrl);
    }

    @Override
    public String toString() {
      return MoreObjects.toStringHelper(getClass())
          .add("code", code)
          .add("error", error)
          .add("state", state)
          .toString();
    }
  }
}
