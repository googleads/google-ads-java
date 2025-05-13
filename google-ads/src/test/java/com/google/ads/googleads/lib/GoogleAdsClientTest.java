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

package com.google.ads.googleads.lib;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.ads.googleads.lib.GoogleAdsClient.Builder;
import com.google.ads.googleads.lib.GoogleAdsClient.Builder.AdsEnvironmentVariable;
import com.google.ads.googleads.lib.GoogleAdsClient.Builder.ConfigPropertyKey;
import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.v20.errors.GoogleAdsError;
import com.google.ads.googleads.v20.errors.GoogleAdsException;
import com.google.ads.googleads.v20.errors.GoogleAdsFailure;
import com.google.ads.googleads.v20.services.GoogleAdsRow;
import com.google.ads.googleads.v20.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v20.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v20.services.MockGoogleAdsService;
import com.google.ads.googleads.v20.services.SearchGoogleAdsResponse;
import com.google.ads.googleads.v20.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v20.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.auth.oauth2.UserCredentials;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.Status.Code;
import io.grpc.StatusException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.hamcrest.Matchers;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for {@link GoogleAdsClient}. */
@RunWith(JUnit4.class)
public class GoogleAdsClientTest {

  private static final String CLIENT_ID = "xyz.apps.googleusercontent.com";
  private static final String CLIENT_SECRET = "abcdefghijklmnop";
  private static final String REFRESH_TOKEN = "QRSTUVWXYZ";
  private static final String DEVELOPER_TOKEN = "developer_token";
  private static final String SERVICE_ACCOUNT_USER = "someuser@example.com";
  private static final long LOGIN_CUSTOMER_ID = 123456789L;
  private static final long LINKED_CUSTOMER_ID = 987654321L;
  private static final Integer MAX_INBOUND_MESSAGE_SIZE = 123456789;
  private static final MockGoogleAdsService mockService = new MockGoogleAdsService();
  private static final MockServiceHelper mockServiceHelper =
      new MockServiceHelper("fake-address", mockService);
  @Rule public TemporaryFolder folder = new TemporaryFolder();
  private Credentials fakeCredentials = new FakeCredential();
  private LocalChannelProvider localChannelProvider;
  private Properties testProperties;

  @BeforeClass
  public static void startLocalServer() {
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopLocalServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() {
    testProperties = new Properties();
    testProperties.setProperty(ConfigPropertyKey.CLIENT_ID.getPropertyKey(), CLIENT_ID);
    testProperties.setProperty(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey(), CLIENT_SECRET);
    testProperties.setProperty(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey(), REFRESH_TOKEN);
    testProperties.setProperty(ConfigPropertyKey.DEVELOPER_TOKEN.getPropertyKey(), DEVELOPER_TOKEN);
    testProperties.setProperty(
        ConfigPropertyKey.LOGIN_CUSTOMER_ID.getPropertyKey(), String.valueOf(LOGIN_CUSTOMER_ID));
    testProperties.setProperty(
        ConfigPropertyKey.MAX_INBOUND_MESSAGE_BYTES.getPropertyKey(),
        String.valueOf(MAX_INBOUND_MESSAGE_SIZE));
    mockServiceHelper.reset();
    localChannelProvider = mockServiceHelper.createChannelProvider();
  }

  /** Verifies that all Factory methods are implemented and operational in GoogleAdsClient. */
  @Test
  public void getServiceClient_creationSucceeds() {
    Stream.of(
            ApiCatalog.getDefault().getLatestVersion().getServiceClientFactoryClass().getMethods())
        .forEach(
            method -> {
              try (AutoCloseable client =
                  (AutoCloseable) method.invoke(createTestGoogleAdsClient().getLatestVersion())) {
                assertNotNull(client);
              } catch (IllegalAccessException | InvocationTargetException e) {
                fail("Unable to open client for " + method.getName());
              } catch (Exception e) {
                fail("Unable to close client for " + method.getName());
              }
            });
  }

  /** Verifies reading config from a Java properties file */
  @Test
  public void buildFromPropertiesFile_readsFromPropertiesFile() throws IOException {
    File propertiesFile = folder.newFile("ads.properties");
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }
    Builder builder = GoogleAdsClient.newBuilder();
    builder.setConfigurationFileSupplier(() -> propertiesFile);
    GoogleAdsClient client = builder.fromPropertiesFile().build();
    assertGoogleAdsClient(client, true);
  }

  /** Tests building a client from a properties file. */
  @Test
  public void buildFromPropertiesFile_readsAllProperties() throws IOException {
    // Create a properties file in the temporary folder.
    File propertiesFile = folder.newFile("ads.properties");
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }

    // Build a new client from the file.
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder().fromPropertiesFile(propertiesFile).build();
    assertGoogleAdsClient(client, true);
  }

  /**
   * Tests building a client from a properties file that does not contain an entry for the developer
   * token property.
   */
  @Test
  public void testBuildFromPropertiesFile_withoutDeveloperToken_withUseCloudOrgForApiAccess()
      throws IOException {
    // Create a properties file in the temporary folder.
    File propertiesFile = folder.newFile("ads.properties");
    // Remove the developer token property.
    testProperties.remove(ConfigPropertyKey.DEVELOPER_TOKEN.getPropertyKey());
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }

    // Build a new client from the file.
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .fromPropertiesFile(propertiesFile)
            .setUseCloudOrgForApiAccess(true)
            .build();
    assertGoogleAdsClient(client, LOGIN_CUSTOMER_ID, true);
  }

  /** Tests that clients can only use exactly one of dev token or Cloud org for API access. */
  @Test
  public void testDevTokenAndUseCloudOrgForApiAccessAreExclusive_failIfBothOrNeither() {
    GoogleAdsClient.Builder builder = GoogleAdsClient.newBuilder().fromProperties(testProperties);
    // Confirms developer token is set on the builder.
    assertNotNull("dev token not set from test properties", builder.getDeveloperToken());
    // Opts into using Cloud org for API access.
    builder.setUseCloudOrgForApiAccess(true);
    // Confirms build() fails.
    Throwable exception =
        assertThrows(
            "Should fail when both dev token is set and using Cloud org for API access",
            IllegalStateException.class,
            () -> builder.build());
    // Checks the exception message.
    assertThat(exception.getMessage(), Matchers.containsString("not both"));

    // Clears dev token and opts out of using Cloud org for API access.
    builder.setDeveloperToken(null).setUseCloudOrgForApiAccess(false);
    // Confirms build() fails.
    exception =
        assertThrows(
            "Should fail when neither dev token is set nor using Cloud org for API access",
            IllegalStateException.class,
            () -> builder.build());
    // Checks the exception message.
    assertThat(exception.getMessage(), Matchers.containsString("not both"));
  }

  /**
   * Tests building a client from a properties file that does not contain an entry for the login
   * customer ID property.
   */
  @Test
  public void testBuildFromPropertiesFile_withoutLoginCustomerId() throws IOException {
    // Create a properties file in the temporary folder.
    File propertiesFile = folder.newFile("ads.properties");
    // Remove the login customer ID property.
    testProperties.remove(ConfigPropertyKey.LOGIN_CUSTOMER_ID.getPropertyKey());
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }

    // Build a new client from the file.
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder().fromPropertiesFile(propertiesFile).build();
    assertGoogleAdsClient(client, null, true);
  }

  /**
   * Verifies reading config from a Java properties file where the path is specified from the
   * environment variable.
   */
  @Test
  public void buildFromPropertiesFile_readsFromPropertiesFile_viaEnvironment() throws IOException {
    File propertiesFile = folder.newFile("ads.properties");
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }
    Builder builder = GoogleAdsClient.newBuilder();
    Map<String, String> environment =
        ImmutableMap.<String, String>builder()
            .put(
                AdsEnvironmentVariable.GOOGLE_ADS_CONFIGURATION_FILE_PATH.name(),
                propertiesFile.getPath())
            .build();
    GoogleAdsClient client =
        builder.setEnvironmentValueGetter(environment::get).fromPropertiesFile().build();
    assertGoogleAdsClient(client, true);
  }

  /** Tests that an exception is thrown for a nonexistant properties file. */
  @Test
  public void buildFromPropertiesFile_invalidFilePath_throwsException() throws IOException {
    File nonExistentFile = new File(folder.getRoot(), "I_dont_exist.properties");
    // Invokes the fromPropertiesFile method on the builder, which should fail.
    FileNotFoundException exception =
        Assert.assertThrows(
            FileNotFoundException.class,
            () -> GoogleAdsClient.newBuilder().fromPropertiesFile(nonExistentFile));
    assertThat(exception.getMessage(), Matchers.containsString("I_dont_exist.properties"));
  }

  /**
   * Tests that the loginCustomerId can be unset when cloning the client via builder methods. This
   * is important so that users can easily change the login customer ID.
   */
  @Test
  public void setLoginCustomerId_canClearOnceSet() {
    Credentials credentials =
        UserCredentials.newBuilder()
            .setClientId(CLIENT_ID)
            .setClientSecret(CLIENT_SECRET)
            .setRefreshToken(REFRESH_TOKEN)
            .build();
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(credentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setLoginCustomerId(1L)
            .build();
    client = client.toBuilder().setLoginCustomerId(null).build();
    assertNull("Unable to clear loginCustomerId", client.getLoginCustomerId());
  }

  /** Tests building a client without the use of a properties file. */
  @Test
  public void buildWithoutPropertiesFile_supportsAllFields() {
    Credentials credentials =
        UserCredentials.newBuilder()
            .setClientId(CLIENT_ID)
            .setClientSecret(CLIENT_SECRET)
            .setRefreshToken(REFRESH_TOKEN)
            .build();
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(credentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setLoginCustomerId(LOGIN_CUSTOMER_ID)
            .setMaxInboundMessageBytes(MAX_INBOUND_MESSAGE_SIZE)
            .build();
    assertGoogleAdsClient(client, true);
  }

  /** Verifies that builder supports nullable loginCustomerId. */
  @Test
  public void build_loginCustomerId_allowsNullable() {
    Credentials credentials =
        UserCredentials.newBuilder()
            .setClientId(CLIENT_ID)
            .setClientSecret(CLIENT_SECRET)
            .setRefreshToken(REFRESH_TOKEN)
            .build();
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(credentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .build();
    assertNull("invalid login-customer-id", client.getLoginCustomerId());
  }

  /** Verifies that loginCustomerId is not required. */
  @Test
  public void buildFromProperties_loginCustomerId_isOptional() {
    testProperties.remove(ConfigPropertyKey.LOGIN_CUSTOMER_ID.getPropertyKey());
    GoogleAdsClient client = GoogleAdsClient.newBuilder().fromProperties(testProperties).build();
    assertNull(client.getLoginCustomerId());
  }

  /**
   * Verifies that a proper exception is thrown when both refresh token and service account secrets
   * path are specified in properties.
   */
  @Test
  public void buildFromProperties_bothCredentialsPresent_throwsException() {
    assertNotNull(
        "Refresh token not set in test properties",
        ConfigPropertyKey.REFRESH_TOKEN.getPropertyValue(testProperties));
    testProperties.put(
        ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH.getPropertyKey(), "/some/path/secrets.json");
    // Invokes the fromProperties method on the builder, which should fail.
    Throwable throwable =
        assertThrows(
            IllegalArgumentException.class,
            () -> GoogleAdsClient.newBuilder().fromProperties(testProperties).build());
    assertThat(throwable.getMessage(), Matchers.containsString("both"));
  }

  @Test
  public void buildFromEnvironment_bothCredentialsPresent_throwsException() {
    Map<String, String> environment =
        ImmutableMap.<String, String>builder()
            .put(AdsEnvironmentVariable.GOOGLE_ADS_CLIENT_ID.name(), CLIENT_ID)
            .put(AdsEnvironmentVariable.GOOGLE_ADS_CLIENT_SECRET.name(), CLIENT_SECRET)
            .put(AdsEnvironmentVariable.GOOGLE_ADS_REFRESH_TOKEN.name(), REFRESH_TOKEN)
            .put(
                AdsEnvironmentVariable.GOOGLE_ADS_JSON_KEY_FILE_PATH.name(),
                "/some/path/secrets.json")
            .put(AdsEnvironmentVariable.GOOGLE_ADS_IMPERSONATED_EMAIL.name(), SERVICE_ACCOUNT_USER)
            .build();
    GoogleAdsClient.Builder builder =
        GoogleAdsClient.newBuilder().setEnvironmentValueGetter(environment::get);
    // Invokes the fromEnvironment method on the builder, which should fail.
    Throwable throwable =
        assertThrows(IllegalArgumentException.class, () -> builder.fromEnvironment());
    assertThat(throwable.getMessage(), Matchers.containsString("both"));
  }

  /**
   * Verifies that a proper exception is thrown when neither refresh token nor service account
   * secrets path are specified in properties.
   */
  @Test
  public void buildFromProperties_neitherCredentialsPresent_throwsException_atBuild() {
    testProperties.remove(ConfigPropertyKey.CLIENT_ID.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH.getPropertyKey());
    // Invokes the fromProperties() method on the builder, which should succeed.
    Builder builder = GoogleAdsClient.newBuilder().fromProperties(testProperties);
    // Invokes the build() method on the builder, which should fail.
    Throwable throwable = assertThrows(IllegalStateException.class, () -> builder.build());
    assertThat(throwable.getMessage(), Matchers.containsString("credentials"));
  }

  @Test
  public void buildFromEnvironment_mergeWithProperties_withUserCredentials() throws IOException {
    Map<String, String> environment =
        ImmutableMap.<String, String>builder()
            .put(AdsEnvironmentVariable.GOOGLE_ADS_CLIENT_ID.name(), CLIENT_ID)
            .put(AdsEnvironmentVariable.GOOGLE_ADS_CLIENT_SECRET.name(), CLIENT_SECRET)
            .put(AdsEnvironmentVariable.GOOGLE_ADS_REFRESH_TOKEN.name(), REFRESH_TOKEN)
            .put(
                AdsEnvironmentVariable.GOOGLE_ADS_LINKED_CUSTOMER_ID.name(),
                Long.toString(LINKED_CUSTOMER_ID))
            .put(
                AdsEnvironmentVariable.GOOGLE_ADS_MAX_INBOUND_MESSAGE_BYTES.name(),
                Integer.toString(MAX_INBOUND_MESSAGE_SIZE))
            .build();
    testProperties.remove(ConfigPropertyKey.CLIENT_ID.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.MAX_INBOUND_MESSAGE_BYTES.getPropertyKey());
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromEnvironment()
            .fromProperties(testProperties)
            .build();
    assertGoogleAdsClient(client, true);
    // Changes the order to properties, then environment, and tests again.
    client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromProperties(testProperties)
            .fromEnvironment()
            .build();
    assertGoogleAdsClient(client, true);
    assertEquals(LINKED_CUSTOMER_ID, client.getLinkedCustomerId().longValue());
  }

  @Test
  public void buildFromEnvironment_mergeWithProperties_withUserCredentials_split()
      throws IOException {
    // Specifies the client ID and secret via environment variables, and refresh token via
    // properties.
    Map<String, String> environment =
        ImmutableMap.<String, String>builder()
            .put(AdsEnvironmentVariable.GOOGLE_ADS_CLIENT_ID.name(), CLIENT_ID)
            .put(AdsEnvironmentVariable.GOOGLE_ADS_CLIENT_SECRET.name(), CLIENT_SECRET)
            .build();
    // Removes all auth properties except refresh token.
    testProperties.remove(ConfigPropertyKey.CLIENT_ID.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey());
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromEnvironment()
            .fromProperties(testProperties)
            .build();
    assertGoogleAdsClient(client, true);
    // Changes the order to properties, then environment, and tests again.
    client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromProperties(testProperties)
            .fromEnvironment()
            .build();
    assertGoogleAdsClient(client, true);
  }

  @Test
  public void buildFromEnvironment_mergeWithProperties_withServiceAccountCredentials()
      throws IOException {
    // Copies the mock service account credentials secrets file from test resources to a file in the
    // temporary folder.
    File secretsFile = createTestServiceAccountSecretsFile();
    Map<String, String> environment =
        ImmutableMap.<String, String>builder()
            .put(AdsEnvironmentVariable.GOOGLE_ADS_JSON_KEY_FILE_PATH.name(), secretsFile.getPath())
            .put(AdsEnvironmentVariable.GOOGLE_ADS_IMPERSONATED_EMAIL.name(), SERVICE_ACCOUNT_USER)
            .build();
    // Removes all auth properties.
    testProperties.remove(ConfigPropertyKey.CLIENT_ID.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey());
    testProperties.put(
        ConfigPropertyKey.LINKED_CUSTOMER_ID.getPropertyKey(), Long.toString(LINKED_CUSTOMER_ID));
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromEnvironment()
            .fromProperties(testProperties)
            .build();
    assertGoogleAdsClient(client, false);
    assertEquals(LINKED_CUSTOMER_ID, client.getLinkedCustomerId().longValue());
    // Changes the order to properties, then environment, and tests again.
    client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromProperties(testProperties)
            .fromEnvironment()
            .build();
    assertGoogleAdsClient(client, false);
    assertEquals(LINKED_CUSTOMER_ID, client.getLinkedCustomerId().longValue());
  }

  /**
   * Tests the service accounts case where the impersonated email comes from the environment and the
   * file comes from properties.
   */
  @Test
  public void buildFromEnvironment_mergeWithProperties_withServiceAccountCredentials_split_1()
      throws IOException {
    // Copies the mock service account credentials secrets file from test resources to a file in the
    // temporary folder.
    File secretsFile = createTestServiceAccountSecretsFile();
    Map<String, String> environment =
        ImmutableMap.<String, String>builder()
            .put(AdsEnvironmentVariable.GOOGLE_ADS_IMPERSONATED_EMAIL.name(), SERVICE_ACCOUNT_USER)
            .build();
    // Removes all auth properties for user credentials, and adds the service account secrets path
    // property.
    testProperties.remove(ConfigPropertyKey.CLIENT_ID.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey());
    testProperties.put(
        ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH.getPropertyKey(), secretsFile.getPath());
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromEnvironment()
            .fromProperties(testProperties)
            .build();
    assertGoogleAdsClient(client, false);
    // Changes the order to properties, then environment, and tests again.
    client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromProperties(testProperties)
            .fromEnvironment()
            .build();
    assertGoogleAdsClient(client, false);
  }

  /**
   * Tests the service accounts case where the file comes from the environment and the impersonated
   * email comes from properties.
   */
  @Test
  public void buildFromEnvironment_mergeWithProperties_withServiceAccountCredentials_split_2()
      throws IOException {
    // Copies the mock service account credentials secrets file from test resources to a file in the
    // temporary folder.
    File secretsFile = createTestServiceAccountSecretsFile();
    Map<String, String> environment =
        ImmutableMap.<String, String>builder()
            .put(AdsEnvironmentVariable.GOOGLE_ADS_JSON_KEY_FILE_PATH.name(), secretsFile.getPath())
            .build();
    // Removes all auth properties for user credentials, and adds the service account user
    // property.
    testProperties.remove(ConfigPropertyKey.CLIENT_ID.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey());
    testProperties.put(
        ConfigPropertyKey.SERVICE_ACCOUNT_USER.getPropertyKey(), SERVICE_ACCOUNT_USER);
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromEnvironment()
            .fromProperties(testProperties)
            .build();
    assertGoogleAdsClient(client, false);
    // Changes the order to properties, then environment, and tests again.
    client =
        GoogleAdsClient.newBuilder()
            .setEnvironmentValueGetter(environment::get)
            .fromProperties(testProperties)
            .fromEnvironment()
            .build();
    assertGoogleAdsClient(client, false);
  }

  /**
   * Verifies that if the user configures service account credentials via properties or environment
   * variables and also explicitly sets credentials via the setter, the last action is used.
   */
  @Test
  public void buildFromProperties_withConfigAndExplicitServiceAccountCredentials_lastWins()
      throws IOException {
    File secretsFile = createTestServiceAccountSecretsFile();

    // Configures properties for the service account use case, including reading the service account
    // secrets from the file created above.
    testProperties.remove(ConfigPropertyKey.CLIENT_ID.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey());
    testProperties.setProperty(
        ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH.getPropertyKey(), secretsFile.getPath());
    testProperties.setProperty(
        ConfigPropertyKey.SERVICE_ACCOUNT_USER.getPropertyKey(), SERVICE_ACCOUNT_USER);

    ServiceAccountCredentials serviceAccountCredentials =
        ServiceAccountCredentials.fromStream(new FileInputStream(secretsFile)).toBuilder()
            .setServiceAccountUser("someOtherUser@example.com")
            .build();

    // Builds the client, first explicitly setting credentials, then loading from properties.
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(serviceAccountCredentials)
            .fromProperties(testProperties)
            .build();
    assertEquals(
        "Service account user should match setting from properties",
        SERVICE_ACCOUNT_USER,
        ((ServiceAccountCredentials) client.getCredentials()).getServiceAccountUser());
    // Changes the order.
    client =
        GoogleAdsClient.newBuilder()
            .fromProperties(testProperties)
            .setCredentials(serviceAccountCredentials)
            .build();
    assertSame(
        "Credentials should be the ones explicitly set",
        serviceAccountCredentials,
        client.getCredentials());
  }

  /**
   * Verifies that if the user configures user credentials via properties or environment variables
   * and also explicitly sets credentials via the setter, the last action is used.
   */
  @Test
  public void buildFromProperties_withConfigAndExplicitUserCredentials_lastWins()
      throws IOException {
    UserCredentials userCredentials =
        UserCredentials.newBuilder()
            .setClientId(CLIENT_ID)
            .setClientSecret(CLIENT_SECRET)
            .setRefreshToken("some-other-refresh-token")
            .build();

    // Builds the client, first explicitly setting credentials, then loading from properties.
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(userCredentials)
            .fromProperties(testProperties)
            .build();
    assertEquals(
        "Refresh token should match setting from properties",
        REFRESH_TOKEN,
        ((UserCredentials) client.getCredentials()).getRefreshToken());
    // Changes the order.
    client =
        GoogleAdsClient.newBuilder()
            .fromProperties(testProperties)
            .setCredentials(userCredentials)
            .build();
    assertSame(
        "Credentials should be the ones explicitly set", userCredentials, client.getCredentials());
  }

  /**
   * Verifies that a client with service account credentials is created when service account keys
   * have valid values in the properties map.
   */
  @Test
  public void buildFromProperties_withServiceAccountCredentials() throws IOException {
    File secretsFile = createTestServiceAccountSecretsFile();

    // Configures properties for the service account use case, including reading the service account
    // secrets from the file created above.
    testProperties.remove(ConfigPropertyKey.CLIENT_ID.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey());
    testProperties.remove(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey());
    testProperties.setProperty(
        ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH.getPropertyKey(), secretsFile.getPath());
    testProperties.setProperty(
        ConfigPropertyKey.SERVICE_ACCOUNT_USER.getPropertyKey(), SERVICE_ACCOUNT_USER);

    // Builds the client.
    GoogleAdsClient clientWithServiceAccountUser =
        GoogleAdsClient.newBuilder().fromProperties(testProperties).build();

    // Asserts client and credentials match expectations.
    assertGoogleAdsClient(clientWithServiceAccountUser, false);

    // Repeats the test above but without a service account user.
    testProperties.remove(ConfigPropertyKey.SERVICE_ACCOUNT_USER);
    // Builds the client.
    GoogleAdsClient clientWithoutServiceAccountUser =
        GoogleAdsClient.newBuilder().fromProperties(testProperties).build();

    // Asserts client and credentials match expectations.
    assertGoogleAdsClient(clientWithoutServiceAccountUser, false);
  }

  /**
   * Verifies that the internal headers for the API client versions (gax, grpc, java) etc. are sent.
   */
  @Test
  public void x_goog_api_client_header_isSent() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setLoginCustomerId(LOGIN_CUSTOMER_ID)
            .setTransportChannelProvider(localChannelProvider)
            .setEndpoint("fake-address")
            .build();
    mockService.addResponse(SearchGoogleAdsResponse.newBuilder().build());
    try (GoogleAdsServiceClient googleAdsClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      googleAdsClient.search("123", "select blah");
    }
    assertTrue(
        "GAX/GRPC/Java platform headers missing",
        localChannelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  /** Verifies that headers include loginCustomerId if present. */
  @Test
  public void loginCustomerId_sentIfSpecified() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setLoginCustomerId(LOGIN_CUSTOMER_ID)
            .setTransportChannelProvider(localChannelProvider)
            .setEndpoint("fake-address")
            .build();
    mockService.addResponse(SearchGoogleAdsResponse.newBuilder().build());
    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      googleAdsServiceClient.search("123", "select blah");
    }
    assertTrue(
        "login customer ID not found",
        localChannelProvider.isHeaderSent(
            "login-customer-id", Pattern.compile(String.valueOf(LOGIN_CUSTOMER_ID))));
  }

  /** Verifies that headers does not include loginCustomerId if not specified. */
  @Test
  public void loginCustomerId_notSentIfExcluded() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setTransportChannelProvider(localChannelProvider)
            .build();
    mockService.addResponse(SearchGoogleAdsResponse.newBuilder().build());
    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      googleAdsServiceClient.search("123", "select blah");
    }
    assertFalse(
        "login customer ID header should be excluded if not configured",
        localChannelProvider.isHeaderSent("login-customer-id", Pattern.compile(".*")));
  }

  /** Verifies that headers include linkedCustomerId if present. */
  @Test
  public void linkedCustomerId_sentIfSpecified() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setLinkedCustomerId(LINKED_CUSTOMER_ID)
            .setTransportChannelProvider(localChannelProvider)
            .setEndpoint("fake-address")
            .build();
    mockService.addResponse(SearchGoogleAdsResponse.newBuilder().build());
    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      googleAdsServiceClient.search("123", "select blah");
    }
    assertTrue(
        "linked customer ID not found",
        localChannelProvider.isHeaderSent(
            "linked-customer-id", Pattern.compile(String.valueOf(LINKED_CUSTOMER_ID))));
  }

  /** Verifies that the exception transformation behaviour is working for a test example. */
  @Test
  public void unaryCallable_exceptionTransformedToGoogleAdsException() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setTransportChannelProvider(localChannelProvider)
            .build();
    Metadata.Key<byte[]> trailerKey =
        ApiCatalog.getDefault().getLatestVersion().getExceptionFactory().getTrailerKey();
    Metadata trailers = new Metadata();
    GoogleAdsFailure.Builder failure = GoogleAdsFailure.newBuilder();
    failure.addErrors(GoogleAdsError.newBuilder().setMessage("Test error message"));
    trailers.put(trailerKey, failure.build().toByteArray());
    StatusException rootCause = new StatusException(Status.UNKNOWN, trailers);
    mockService.addException(new ApiException(rootCause, GrpcStatusCode.of(Code.UNKNOWN), false));
    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse response = googleAdsServiceClient.search("123", "select blah");
      for (GoogleAdsRow row : response.iterateAll()) {
        // Attempt to process the rows.
      }
      fail();
    } catch (GoogleAdsException ex) {
      // Expected
    }
  }

  /** Verifies that the exception transformation behaviour is working for a test example. */
  @Test
  public void streamingCallable_exceptionTransformedToGoogleAdsException() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setTransportChannelProvider(localChannelProvider)
            .build();
    Metadata.Key<byte[]> trailerKey =
        ApiCatalog.getDefault().getLatestVersion().getExceptionFactory().getTrailerKey();
    Metadata trailers = new Metadata();
    GoogleAdsFailure.Builder failure = GoogleAdsFailure.newBuilder();
    failure.addErrors(GoogleAdsError.newBuilder().setMessage("Test error message"));
    trailers.put(trailerKey, failure.build().toByteArray());
    StatusException rootCause = new StatusException(Status.UNKNOWN, trailers);
    mockService.addException(new ApiException(rootCause, GrpcStatusCode.of(Code.UNKNOWN), false));
    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      for (SearchGoogleAdsStreamResponse row :
          googleAdsServiceClient
              .searchStreamCallable()
              .call(SearchGoogleAdsStreamRequest.getDefaultInstance())) {
        // Attempt to process the stream.
      }
      fail();
    } catch (GoogleAdsException ex) {
      // Expected
    }
  }

  /** Ensure that can set endpoint on default transport channel. */
  @Test
  public void transportChannelProvider_defaultRequiresEndpoint() {
    assertTrue(
        "Default TransportChannelProvider must accept endpoint.",
        GoogleAdsClient.newBuilder().getTransportChannelProvider().needsEndpoint());
  }

  /** Ensure that can set the max inbound message size from properties. */
  @Test
  public void maxInboundMessageBytes_isSet() {
    GoogleAdsClient client = GoogleAdsClient.newBuilder().fromProperties(testProperties).build();
    InstantiatingGrpcChannelProvider channelProvider =
        (InstantiatingGrpcChannelProvider) client.getTransportChannelProvider();
    assertEquals(
        "Max inbound message size must be set",
        MAX_INBOUND_MESSAGE_SIZE,
        channelProvider.toBuilder().getMaxInboundMessageSize());
  }

  /** Ensure that can set the max inbound message size directly on the builder. */
  @Test
  public void maxInboundMessageBytes_isSet_fromBuilder() {
    testProperties.remove(ConfigPropertyKey.MAX_INBOUND_MESSAGE_BYTES.getPropertyKey());
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setMaxInboundMessageBytes(MAX_INBOUND_MESSAGE_SIZE)
            .fromProperties(testProperties)
            .build();
    InstantiatingGrpcChannelProvider channelProvider =
        (InstantiatingGrpcChannelProvider) client.getTransportChannelProvider();
    assertEquals(
        "Max inbound message size must be set",
        MAX_INBOUND_MESSAGE_SIZE,
        channelProvider.toBuilder().getMaxInboundMessageSize());
  }

  /** Ensure that the max inbound message size the default value when not set. */
  @Test
  public void maxInboundMessageBytes_isDefault_ifNotSet() {
    testProperties.remove(ConfigPropertyKey.MAX_INBOUND_MESSAGE_BYTES.getPropertyKey());
    GoogleAdsClient client = GoogleAdsClient.newBuilder().fromProperties(testProperties).build();
    InstantiatingGrpcChannelProvider channelProvider =
        (InstantiatingGrpcChannelProvider) client.getTransportChannelProvider();
    assertEquals(
        "Max inbound message size must be the default value",
        GoogleAdsClient.DEFAULT_MAX_INBOUND_MESSAGE_SIZE,
        channelProvider.toBuilder().getMaxInboundMessageSize());
  }

  /** Ensure that the max inbound message size can be overridden on cloned clients. */
  @Test
  public void maxInboundMessageBytes_canSetOnClonedClients() {
    Integer expectedValue = Integer.valueOf(987654321);
    GoogleAdsClient client = GoogleAdsClient.newBuilder().fromProperties(testProperties).build();
    GoogleAdsClient otherClient =
        client.toBuilder().setMaxInboundMessageBytes(expectedValue).build();
    InstantiatingGrpcChannelProvider channelProvider =
        (InstantiatingGrpcChannelProvider) otherClient.getTransportChannelProvider();
    assertEquals(
        "Max inbound message size must be the value from the new builder",
        expectedValue,
        channelProvider.toBuilder().getMaxInboundMessageSize());
  }

  /** Ensure that hashCode doesn't collide for a test instance. */
  @Test
  public void hashCode_doesNotCollide() {
    GoogleAdsClient clientA =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .build();
    GoogleAdsClient clientB =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN + "asdf")
            .build();
    // Granted there could be hash collisions, but this should not happen for this test case.
    assertNotEquals(
        "Clients with distinct params should have distinct hashCodes",
        clientA.hashCode(),
        clientB.hashCode());
  }

  /** Ensures that equals is true for A == B. */
  @Test
  public void equals_equalIfSameInstance() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .build();
    assertEquals("same instance should be equal", client, client);
  }

  /** Ensures that equals is false for A != B, with same config. */
  @Test
  public void equals_notEqualIfDifferentInstance() {
    GoogleAdsClient clientA =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .build();
    GoogleAdsClient clientB =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .build();
    assertNotEquals("different instances should not be equal", clientA, clientB);
  }

  /** Ensures that toString returns a nonnull value with length() > 0. */
  @Test
  public void toString_returnsNotNull() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .build();
    String toString = client.toString();
    assertNotNull("toString should return a non-null string", toString);
    assertFalse("toString should return a non-empty string", toString.isEmpty());
  }

  /** Creates an GoogleAdsClient using mock credentials. */
  private GoogleAdsClient createTestGoogleAdsClient() {
    return GoogleAdsClient.newBuilder()
        .setCredentials(fakeCredentials)
        .setDeveloperToken(DEVELOPER_TOKEN)
        .setLoginCustomerId(LOGIN_CUSTOMER_ID)
        .setTransportChannelProvider(localChannelProvider)
        .build();
  }

  /**
   * Asserts that the provided client matches expectations. Expects a login customer ID of {@link
   * #LOGIN_CUSTOMER_ID} on the client.
   */
  private void assertGoogleAdsClient(GoogleAdsClient client, boolean expectUserCredentials) {
    assertGoogleAdsClient(client, LOGIN_CUSTOMER_ID, expectUserCredentials);
  }

  /**
   * Asserts that the provided client matches expectations. Expects a login customer ID that matches
   * the provided value.
   */
  private void assertGoogleAdsClient(
      GoogleAdsClient client, @Nullable Long loginCustomerId, boolean expectUserCredentials) {
    assertNotNull("Null client", client);

    Credentials credentials = client.getCredentials();
    assertNotNull("Null credentials", credentials);
    if (expectUserCredentials) {
      assertThat(credentials, Matchers.instanceOf(UserCredentials.class));
      UserCredentials userCredentials = (UserCredentials) credentials;
      assertEquals("Client ID", CLIENT_ID, userCredentials.getClientId());
      assertEquals("Client secret", CLIENT_SECRET, userCredentials.getClientSecret());
      assertEquals("Refresh token", REFRESH_TOKEN, userCredentials.getRefreshToken());
    } else {
      assertThat(credentials, Matchers.instanceOf(ServiceAccountCredentials.class));
      ServiceAccountCredentials serviceAccountCredentials = (ServiceAccountCredentials) credentials;
      assertEquals(SERVICE_ACCOUNT_USER, serviceAccountCredentials.getServiceAccountUser());
      assertEquals(
          "Scope",
          Collections.singleton("https://www.googleapis.com/auth/adwords"),
          serviceAccountCredentials.getScopes());
    }

    if (client.getTransportChannelProvider() == client.getDefaultTransportChannelProvider()) {
      InstantiatingGrpcChannelProvider channelProvider =
          (InstantiatingGrpcChannelProvider) client.getTransportChannelProvider();
      assertEquals(
          "Max inbound metadata size",
          GoogleAdsClient.DEFAULT_MAX_INBOUND_METADATA_SIZE,
          channelProvider.getMaxInboundMetadataSize());
      assertEquals(
          "Max inbound message size",
          MAX_INBOUND_MESSAGE_SIZE,
          // For some reason, this setting is only available on the builder.
          channelProvider.toBuilder().getMaxInboundMessageSize());
    }

    if (client.getDeveloperToken() == null) {
      assertTrue(
          "Developer token is null but use cloud org is false", client.isUseCloudOrgForApiAccess());
    } else {
      assertEquals("developer token", DEVELOPER_TOKEN, client.getDeveloperToken());
    }
    assertEquals("Login customer id", loginCustomerId, client.getLoginCustomerId());
    assertEquals(
        "Max inbound message size", MAX_INBOUND_MESSAGE_SIZE, client.getMaxInboundMessageBytes());
  }

  /**
   * Copies the mock service account credentials secrets file from test resources to a file in the
   * temporary folder.
   *
   * @return the created secrets file
   */
  private File createTestServiceAccountSecretsFile() throws IOException {
    File secretsFile = folder.newFile("serviceAccountSecrets.json");
    Resources.asCharSource(
            Resources.getResource(getClass(), "mock_service_account_secrets.json"),
            StandardCharsets.UTF_8)
        .copyTo(Files.asCharSink(secretsFile, StandardCharsets.UTF_8));
    return secretsFile;
  }

  /**
   * Tests that the GoogleAdsClient, TransportChannelProvider, and InterceptorProvider all update
   * the loginCustomerId if it is set after the GoogleAdsClient.Builder is initially built, and a
   * custom transport channel provider is not used.
   */
  @Test
  public void testLoginCustomerIdSetAfterCreatingClient()
      throws IOException, NoSuchFieldException, IllegalAccessException {
    // Create a properties file in the temporary folder.
    File propertiesFile = folder.newFile("ads.properties");
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }

    // Build a new client from the file.
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder().fromPropertiesFile(propertiesFile).build();
    // Create a new GoogleAdsClient with a new loginCustomerId.
    long loginCustomerId = 987654321L;
    client = client.toBuilder().setLoginCustomerId(loginCustomerId).build();
    assertGoogleAdsClient(client, loginCustomerId, true);
    assertEquals(client.getLoginCustomerId().longValue(), loginCustomerId);

    Long transportLoginCustomerId =
        getTransportLoginCustomerId(client.getTransportChannelProvider());
    assertEquals(transportLoginCustomerId.longValue(), loginCustomerId);
    Long interceptorLoginCustomerId =
        getInterceptorLoginCustomerId(client.getTransportChannelProvider());
    assertEquals(interceptorLoginCustomerId.longValue(), loginCustomerId);
  }

  /**
   * Tests that the GoogleAdsClient, TransportChannelProvider, and InterceptorProvider all update
   * the loginCustomerId if it is set after the GoogleAdsClient.Builder is initially built, and a
   * custom transport channel provider is not used when chaining together multiple builders.
   */
  @Test
  public void testLoginCustomerIdSetAfterCreatingClientWithMultipleBuilders()
      throws IOException, NoSuchFieldException, IllegalAccessException {
    // Create a properties file in the temporary folder.
    File propertiesFile = folder.newFile("ads.properties");
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }

    // Build a new client from the file.
    long loginCustomerId = 987654321L;
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder().fromPropertiesFile(propertiesFile).build().toBuilder()
            .build()
            .toBuilder()
            .build()
            .toBuilder()
            .setLoginCustomerId(loginCustomerId)
            .build();
    assertGoogleAdsClient(client, loginCustomerId, true);
    assertEquals(client.getLoginCustomerId().longValue(), loginCustomerId);

    Long transportLoginCustomerId =
        getTransportLoginCustomerId(client.getTransportChannelProvider());
    assertEquals(transportLoginCustomerId.longValue(), loginCustomerId);
    Long interceptorLoginCustomerId =
        getInterceptorLoginCustomerId(client.getTransportChannelProvider());
    assertEquals(interceptorLoginCustomerId.longValue(), loginCustomerId);
  }

  /**
   * Tests that the two separate GoogleAdsClients, TransportChannelProviders, and Interceptor
   * providers all update the loginCustomerId if it is set after the GoogleAdsClient.Builder is
   * initially built, and a custom transport channel provider is not used.
   */
  @Test
  public void testMultipleLoginCustomerIdsSetAfterCreatingClient()
      throws IOException, NoSuchFieldException, IllegalAccessException {
    // Create a properties file in the temporary folder.
    File propertiesFile = folder.newFile("ads.properties");
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }

    // Build a new client from the file.
    GoogleAdsClient client1 =
        GoogleAdsClient.newBuilder().fromPropertiesFile(propertiesFile).build();
    GoogleAdsClient client2 =
        GoogleAdsClient.newBuilder().fromPropertiesFile(propertiesFile).build();
    // Create a new GoogleAdsClient with a new loginCustomerId.
    long loginCustomerId1 = 111111111L;
    client1 = client1.toBuilder().setLoginCustomerId(loginCustomerId1).build();
    assertGoogleAdsClient(client1, loginCustomerId1, true);
    assertEquals(client1.getLoginCustomerId().longValue(), loginCustomerId1);

    long loginCustomerId2 = 222222222L;
    client2 = client2.toBuilder().setLoginCustomerId(loginCustomerId2).build();
    assertGoogleAdsClient(client2, loginCustomerId2, true);
    assertEquals(client2.getLoginCustomerId().longValue(), loginCustomerId2);

    Long transportLoginCustomerId1 =
        getTransportLoginCustomerId(client1.getTransportChannelProvider());
    assertEquals(transportLoginCustomerId1.longValue(), loginCustomerId1);
    Long interceptorLoginCustomerId1 =
        getInterceptorLoginCustomerId(client1.getTransportChannelProvider());
    assertEquals(interceptorLoginCustomerId1.longValue(), loginCustomerId1);

    Long transportLoginCustomerId2 =
        getTransportLoginCustomerId(client2.getTransportChannelProvider());
    assertEquals(transportLoginCustomerId2.longValue(), loginCustomerId2);
    Long interceptorLoginCustomerId2 =
        getInterceptorLoginCustomerId(client2.getTransportChannelProvider());
    assertEquals(interceptorLoginCustomerId2.longValue(), loginCustomerId2);
  }

  /**
   * Tests that the GoogleAdsClient.Builder updates the loginCustomerId, but the
   * TransportChannelProvider does not when the loginCustomerID is set after the
   * GoogleAdsClient.Builder is initially built, but a custom transport channel provider is used. In
   * this case, we do not test the InterceptorProvider because the LocalChannelProvider does not
   * allow for one.
   */
  @Test
  public void testLoginCustomerIdNotSetAfterCreatingClient()
      throws IOException, NoSuchFieldException, IllegalAccessException {
    // Create a properties file in the temporary folder.
    File propertiesFile = folder.newFile("ads.properties");
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }

    // Build a new client from the file.
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .fromPropertiesFile(propertiesFile)
            .setTransportChannelProvider(localChannelProvider)
            .build();
    // Create a new GoogleAdsClient with a new loginCustomerId.
    long loginCustomerId = 987654321L;
    client = client.toBuilder().setLoginCustomerId(loginCustomerId).build();
    assertGoogleAdsClient(client, loginCustomerId, true);
    assertEquals(client.getLoginCustomerId().longValue(), loginCustomerId);

    Long transportLoginCustomerId =
        getTransportLoginCustomerId(client.getTransportChannelProvider());
    assertEquals(transportLoginCustomerId.longValue(), LOGIN_CUSTOMER_ID);
  }

  /** Returns the loginCustomerId from a TransportChannelProvider * */
  private static Long getTransportLoginCustomerId(TransportChannelProvider transportChannelProvider)
      throws NoSuchFieldException, IllegalAccessException {
    Field headerProvider = transportChannelProvider.getClass().getDeclaredField("headerProvider");
    headerProvider.setAccessible(true);
    Object headerProviderObj = headerProvider.get(transportChannelProvider);
    Field headers = headerProviderObj.getClass().getDeclaredField("headers");
    headers.setAccessible(true);
    Object headersObj = headers.get(headerProviderObj);
    ImmutableMap<String, String> headersMap = (ImmutableMap<String, String>) headersObj;
    return Long.valueOf(headersMap.get("login-customer-id"));
  }

  /** Returns the loginCustomerId from the InterceptorProvider of a TransportChannelProvider * */
  private static Long getInterceptorLoginCustomerId(
      TransportChannelProvider transportChannelProvider)
      throws NoSuchFieldException, IllegalAccessException {
    Field interceptorProvider =
        transportChannelProvider.getClass().getDeclaredField("interceptorProvider");
    interceptorProvider.setAccessible(true);
    Object interceptorProviderObj = interceptorProvider.get(transportChannelProvider);
    Field arg1 = interceptorProviderObj.getClass().getDeclaredField("arg$1");
    arg1.setAccessible(true);
    Object arg1Obj = arg1.get(interceptorProviderObj);
    Field ipLoginCustomerId = arg1Obj.getClass().getDeclaredField("loginCustomerId");
    ipLoginCustomerId.setAccessible(true);
    return (Long) ipLoginCustomerId.get(arg1Obj);
  }
}
