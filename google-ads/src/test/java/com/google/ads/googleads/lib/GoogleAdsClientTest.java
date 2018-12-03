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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import com.google.ads.googleads.lib.GoogleAdsClient.Builder;
import com.google.ads.googleads.lib.GoogleAdsClient.Builder.ConfigPropertyKey;
import com.google.auth.Credentials;
import com.google.auth.oauth2.UserCredentials;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/** Tests for {@link GoogleAdsClient}. */
@RunWith(JUnit4.class)
public class GoogleAdsClientTest {

  private static final String CLIENT_ID = "xyz.apps.googleusercontent.com";
  private static final String CLIENT_SECRET = "abcdefghijklmnop";
  private static final String REFRESH_TOKEN = "QRSTUVWXYZ";
  private static final String DEVELOPER_TOKEN = "developer_token";
  private static final long LOGIN_CUSTOMER_ID = 123456789L;
  @Rule public TemporaryFolder folder = new TemporaryFolder();
  @Rule public ExpectedException thrown = ExpectedException.none();
  @Mock private ScheduledExecutorService executor;
  private Properties testProperties;

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
  }

  /** Creates an GoogleAdsClient using mock credentials. */
  private GoogleAdsClient createTestGoogleAdsClient() {
    return GoogleAdsClient.newBuilder()
        .setCredentials(Mockito.mock(Credentials.class))
        .setDeveloperToken(DEVELOPER_TOKEN)
        .setLoginCustomerId(LOGIN_CUSTOMER_ID)
        .build();
  }

  /**
   * Verifies that all ServiceClientFactory methods are implemented and operational in
   * GoogleAdsClient.
   */
  @Test
  public void getServiceClient_creationSucceeds() {
    Stream.of(ServiceClientFactory.class.getMethods())
        .forEach(
            method -> {
              try (AutoCloseable client =
                  (AutoCloseable) method.invoke(createTestGoogleAdsClient())) {
                assertNotNull(client);
              } catch (IllegalAccessException | InvocationTargetException e) {
                fail("Unable to open client for " + method.getName());
              } catch (Exception e) {
                fail("Unable to close client for " + method.getName());
              }
            });
  }

  /**
   * Verifies that {@link GoogleAdsClient} has a corresponding {@code getXServiceClient} method for
   * each supported service client class. This ensures that {@link GoogleAdsClient} stays up to date
   * as services are added or removed.
   */
  @Test
  public void getServiceClient_exists_forAllGrpcServiceDescriptors() {
    Set<Class<?>> clientsMissingGetter = new HashSet<>();
    for (Class<?> clientClass : GrpcServiceDescriptor.getAllServiceClientClasses()) {
      String clientClassName = clientClass.getSimpleName();
      try {
        GoogleAdsClient.class.getMethod(
            "get"
                + Character.toUpperCase(clientClassName.charAt(0))
                + clientClassName.substring(1));
      } catch (NoSuchMethodException e) {
        // Getter does not exist for the service client.
        clientsMissingGetter.add(clientClass);
      }
    }
    assertEquals(
        "getXServiceClient is not present on GoogleAdsClient for at least one supported service "
            + "client class",
        Collections.<Class<?>>emptySet(),
        clientsMissingGetter);
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
    assertGoogleAdsClient(client);
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
        GoogleAdsClient.newBuilder().fromPropertiesFile(propertiesFile).build();
    assertGoogleAdsClient(client, null);
  }

  /** Tests that an exception is thrown for a nonexistant properties file. */
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
            .build();
    client = client.toBuilder().setLoginCustomerId(null).build();
    assertNull("Unable to clear loginCustomerId", client.getLoginCustomerId());
  }

  /** Tests building a client without the use of a properties file. */
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
            .build();
    assertGoogleAdsClient(client);
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

  /** Verifies that headers include loginCustomerId if present. */
  @Test
  public void getHeaders_loginCustomerId_includedIfSpecified() {
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
    Map<String, String> headers = client.getHeaders();
    assertEquals(
        "invalid login-customer-id",
        String.valueOf(LOGIN_CUSTOMER_ID),
        headers.get("login-customer-id"));
  }

  /** Verifies that headers does not include loginCustomerId if not specified. */
  @Test
  public void getHeaders_loginCustomerId_excludedIfNotSpecified() {
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
    Map<String, String> headers = client.getHeaders();
    assertFalse("invalid login-customer-id", headers.containsKey("login-customer-id"));
  }

  /**
   * Asserts that the provided client matches expectations. Expects a login customer ID of {@link
   * #LOGIN_CUSTOMER_ID} on the client.
   */
  private void assertGoogleAdsClient(GoogleAdsClient client) throws IOException {
    assertGoogleAdsClient(client, LOGIN_CUSTOMER_ID);
  }

  /**
   * Asserts that the provided client matches expectations. Expects a login customer ID that matches
   * the provided value.
   */
  private void assertGoogleAdsClient(GoogleAdsClient client, @Nullable Long loginCustomerId)
      throws IOException {
    assertNotNull("Null client", client);
    assertNotNull("Null channel", client.withExecutor(executor).getTransportChannel());

    Credentials credentials = client.getCredentials();
    assertNotNull("Null credentials", credentials);
    assertThat(credentials, Matchers.instanceOf(UserCredentials.class));
    UserCredentials userCredentials = (UserCredentials) credentials;
    assertEquals("Client ID", CLIENT_ID, userCredentials.getClientId());
    assertEquals("Client secret", CLIENT_SECRET, userCredentials.getClientSecret());
    assertEquals("Refresh token", REFRESH_TOKEN, userCredentials.getRefreshToken());

    assertEquals("Developer token", DEVELOPER_TOKEN, client.getDeveloperToken());
    assertEquals("Login customer id", loginCustomerId, client.getLoginCustomerId());
  }
}
