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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.ads.googleads.lib.GoogleAdsClient.Builder;
import com.google.ads.googleads.lib.GoogleAdsClient.Builder.ConfigPropertyKey;
import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.errors.GoogleAdsFailure;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v3.services.MockGoogleAdsService;
import com.google.ads.googleads.v3.services.SearchGoogleAdsResponse;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.auth.Credentials;
import com.google.auth.oauth2.UserCredentials;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.Status.Code;
import io.grpc.StatusException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.hamcrest.Matchers;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link GoogleAdsClient}.
 */
@RunWith(Parameterized.class)
public class GoogleAdsClientTest {

  private static final String CLIENT_ID = "xyz.apps.googleusercontent.com";
  private static final String CLIENT_SECRET = "abcdefghijklmnop";
  private static final String REFRESH_TOKEN = "QRSTUVWXYZ";
  private static final String DEVELOPER_TOKEN = "developer_token";
  private static final long LOGIN_CUSTOMER_ID = 123456789L;
  private static final MockGoogleAdsService mockService = new MockGoogleAdsService();
  private static final MockServiceHelper mockServiceHelper =
      new MockServiceHelper("fake-address", mockService);
  @Rule
  public TemporaryFolder folder = new TemporaryFolder();
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Mock
  private ScheduledExecutorService executor;
  private Credentials fakeCredentials = new FakeCredential();
  private LocalChannelProvider localChannelProvider;
  private Properties testProperties;
  private final boolean enabledGeneratedCatalog;

  public GoogleAdsClientTest(boolean enabledGeneratedCatalog) {
    this.enabledGeneratedCatalog = enabledGeneratedCatalog;
  }

  @Parameterized.Parameters
  public static List<Object[]> parameters() {
    return Arrays.asList(new Object[]{Boolean.FALSE}, new Object[]{Boolean.TRUE});
  }

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
    MockitoAnnotations.initMocks(this);
    testProperties = new Properties();
    testProperties.setProperty(ConfigPropertyKey.CLIENT_ID.getPropertyKey(), CLIENT_ID);
    testProperties.setProperty(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey(), CLIENT_SECRET);
    testProperties.setProperty(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey(), REFRESH_TOKEN);
    testProperties.setProperty(ConfigPropertyKey.DEVELOPER_TOKEN.getPropertyKey(), DEVELOPER_TOKEN);
    testProperties.setProperty(
        ConfigPropertyKey.LOGIN_CUSTOMER_ID.getPropertyKey(), String.valueOf(LOGIN_CUSTOMER_ID));
    testProperties.setProperty(
        ConfigPropertyKey.ENABLE_GENERATED_CATALOG.getPropertyKey(),
        String.valueOf(enabledGeneratedCatalog));
    mockServiceHelper.reset();
    localChannelProvider = mockServiceHelper.createChannelProvider();
  }

  /**
   * Verifies that all Factory methods are implemented and operational in GoogleAdsClient.
   */
  @Test
  public void getServiceClient_creationSucceeds() {
    Stream.of(ApiCatalog
        .getDefault(enabledGeneratedCatalog)
        .getLatestVersion()
        .getServiceClientFactoryClass()
        .getMethods())
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

  /**
   * Verifies reading config from a Java properties file
   */
  @Test
  public void buildFromPropertiesFile_readsFromPropertiesFile() throws IOException {
    File propertiesFile = folder.newFile("ads.properties");
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }
    Builder builder = GoogleAdsClient.newBuilder();
    builder.setConfigurationFileSupplier(() -> propertiesFile);
    GoogleAdsClient client = builder.fromPropertiesFile().build();
    assertGoogleAdsClient(client);
  }

  /**
   * Tests building a client from a properties file.
   */
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
    assertGoogleAdsClient(client);
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
        GoogleAdsClient.newBuilder()
            .fromPropertiesFile(propertiesFile)
            .setTransportChannelProvider(localChannelProvider)
            .build();
    assertGoogleAdsClient(client, null, enabledGeneratedCatalog);
  }

  /**
   * Tests that an exception is thrown for a nonexistant properties file.
   */
  @Test
  public void buildFromPropertiesFile_invalidFilePath_throwsException() throws IOException {
    File nonExistentFile = new File(folder.getRoot(), "I_dont_exist.properties");
    // Invokes the fromPropertiesFile method on the builder, which should fail.
    thrown.expect(FileNotFoundException.class);
    thrown.expectMessage(nonExistentFile.getName());
    GoogleAdsClient.newBuilder().fromPropertiesFile(nonExistentFile);
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
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .build();
    client = client.toBuilder().setLoginCustomerId(null).build();
    assertNull("Unable to clear loginCustomerId", client.getLoginCustomerId());
  }

  /**
   * Tests building a client without the use of a properties file.
   */
  @Test
  public void buildWithoutPropertiesFile_supportsAllFields() throws IOException {
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
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .setTransportChannelProvider(localChannelProvider)
            .build();
    assertGoogleAdsClient(client);
  }

  /**
   * Verifies that builder supports nullable loginCustomerId.
   */
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
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .build();
    assertNull("invalid login-customer-id", client.getLoginCustomerId());
  }

  /**
   * Verifies that builder does not require enableGeneratedCatalog to be set explicitly.
   */
  @Test
  public void build_enableGeneratedCatalog_not_required() throws IOException {
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
            .build();
    assertGoogleAdsClient(client, LOGIN_CUSTOMER_ID, false);
  }

  /**
   * Verifies that loginCustomerId is not required.
   */
  @Test
  public void buildFromProperties_loginCustomerId_isOptional() {
    testProperties.remove(ConfigPropertyKey.LOGIN_CUSTOMER_ID.getPropertyKey());
    GoogleAdsClient client = GoogleAdsClient.newBuilder().fromProperties(testProperties).build();
    assertNull(client.getLoginCustomerId());
  }

  /**
   * Verifies that enableGeneratedCatalog is not required and defaults to false.
   */
  @Test
  public void buildFromProperties_enableGeneratedCatalog_isOptional() {
    testProperties.remove(ConfigPropertyKey.ENABLE_GENERATED_CATALOG.getPropertyKey());
    GoogleAdsClient client = GoogleAdsClient.newBuilder().fromProperties(testProperties).build();
    assertFalse(client.getEnableGeneratedCatalog());
  }

  /**
   * Verifies that the internal headers for the API client versions (gax, grpc, java) etc. are
   * sent.
   */
  @Test
  public void x_goog_api_client_header_isSent() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setLoginCustomerId(LOGIN_CUSTOMER_ID)
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
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

  /**
   * Verifies that headers include loginCustomerId if present.
   */
  @Test
  public void loginCustomerId_sentIfSpecified() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setLoginCustomerId(LOGIN_CUSTOMER_ID)
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
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

  /**
   * Verifies that headers does not include loginCustomerId if not specified.
   */
  @Test
  public void loginCustomerId_notSentIfExcluded() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setTransportChannelProvider(localChannelProvider)
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
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

  /**
   * Verifies that the exception transformation behaviour is working for a test example.
   */
  @Test
  public void exceptionTransformedToGoogleAdsException() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setTransportChannelProvider(localChannelProvider)
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .build();
    Metadata.Key trailerKey = ApiCatalog
        .getDefault(enabledGeneratedCatalog)
        .getLatestVersion()
        .getExceptionFactory()
        .getTrailerKey();
    Metadata trailers = new Metadata();
    GoogleAdsFailure.Builder failure = GoogleAdsFailure.newBuilder();
    failure.addErrors(GoogleAdsError.newBuilder().setMessage("Test error message"));
    trailers.put(trailerKey, failure.build().toByteArray());
    StatusException rootCause = new StatusException(Status.UNKNOWN, trailers);
    mockService.addException(new ApiException(rootCause, GrpcStatusCode.of(Code.UNKNOWN), false));
    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      googleAdsServiceClient.search("123", "select blah");
    } catch (GoogleAdsException ex) {
      // Expected
    }
  }

  /**
   * Ensure that can set endpoint on default transport channel.
   */
  @Test
  public void transportChannelProvider_defaultRequiresEndpoint() {
    assertTrue(
        "Default TransportChannelProvider must accept endpoint.",
        GoogleAdsClient.newBuilder().getTransportChannelProvider().needsEndpoint());
  }

  /**
   * Ensure that hashCode doesn't collide for a test instance.
   */
  @Test
  public void hashCode_doesNotCollide() {
    GoogleAdsClient clientA =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .build();
    GoogleAdsClient clientB =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN + "asdf")
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .build();
    // Granted there could be hash collisions, but this should not happen for this test case.
    assertNotEquals(
        "Clients with distinct params should have distinct hashCodes",
        clientA.hashCode(),
        clientB.hashCode());
  }

  /**
   * Ensures that equals is true for A == B.
   */
  @Test
  public void equals_equalIfSameInstance() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .build();
    assertEquals("same instance should be equal", client, client);
  }

  /**
   * Ensures that equals is false for A != B, with same config.
   */
  @Test
  public void equals_notEqualIfDifferentInstance() {
    GoogleAdsClient clientA =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .build();
    GoogleAdsClient clientB =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .build();
    assertNotEquals("different instances should not be equal", clientA, clientB);
  }

  /**
   * Ensures that toString returns a nonnull value with length() > 0.
   */
  @Test
  public void toString_returnsNotNull() {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .setCredentials(fakeCredentials)
            .setDeveloperToken(DEVELOPER_TOKEN)
            .setEnableGeneratedCatalog(enabledGeneratedCatalog)
            .build();
    String toString = client.toString();
    assertNotNull("toString should return a non-null string", toString);
    assertFalse("toString should return a non-empty string", toString.isEmpty());
  }

  /**
   * Creates an GoogleAdsClient using mock credentials.
   */
  private GoogleAdsClient createTestGoogleAdsClient() {
    return GoogleAdsClient.newBuilder()
        .setCredentials(fakeCredentials)
        .setDeveloperToken(DEVELOPER_TOKEN)
        .setLoginCustomerId(LOGIN_CUSTOMER_ID)
        .setEnableGeneratedCatalog(enabledGeneratedCatalog)
        .setTransportChannelProvider(localChannelProvider)
        .build();
  }

  /**
   * Asserts that the provided client matches expectations. Expects a login customer ID of {@link
   * #LOGIN_CUSTOMER_ID} on the client.
   */
  private void assertGoogleAdsClient(GoogleAdsClient client) throws IOException {
    assertGoogleAdsClient(client, LOGIN_CUSTOMER_ID, enabledGeneratedCatalog);
  }

  /**
   * Asserts that the provided client matches expectations. Expects a login customer ID that matches
   * the provided value.
   */
  private void assertGoogleAdsClient(
      GoogleAdsClient client,
      @Nullable Long loginCustomerId,
      boolean enableGeneratedCatalog)
      throws IOException {
    assertNotNull("Null client", client);

    Credentials credentials = client.getCredentials();
    assertNotNull("Null credentials", credentials);
    assertThat(credentials, Matchers.instanceOf(UserCredentials.class));
    UserCredentials userCredentials = (UserCredentials) credentials;
    assertEquals("Client ID", CLIENT_ID, userCredentials.getClientId());
    assertEquals("Client secret", CLIENT_SECRET, userCredentials.getClientSecret());
    assertEquals("Refresh token", REFRESH_TOKEN, userCredentials.getRefreshToken());

    assertEquals("Developer token", DEVELOPER_TOKEN, client.getDeveloperToken());
    assertEquals("Login customer id", loginCustomerId, client.getLoginCustomerId());
    assertEquals(
        "Enable generated catalog",
        enableGeneratedCatalog,
        client.getEnableGeneratedCatalog());
  }
}
