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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import com.google.ads.googleads.lib.GoogleAdsClient.Builder;
import com.google.ads.googleads.lib.GoogleAdsClient.Builder.ConfigPropertyKey;
import com.google.auth.Credentials;
import com.google.auth.oauth2.UserCredentials;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
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

  @Rule public TemporaryFolder folder = new TemporaryFolder();
  @Rule public ExpectedException thrown = ExpectedException.none();

  private static final String CLIENT_ID = "xyz.apps.googleusercontent.com";
  private static final String CLIENT_SECRET = "abcdefghijklmnop";
  private static final String REFRESH_TOKEN = "QRSTUVWXYZ";
  private static final String DEVELOPER_TOKEN = "developer_token";

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
  }

  /** Creates an GoogleAdsClient using mock credentials. */
  private GoogleAdsClient createTestGoogleAdsClient() {
    return GoogleAdsClient.newBuilder()
        .setCredentials(Mockito.mock(Credentials.class))
        .setDeveloperToken("my-dev-token")
        .build();
  }

  @Test
  public void testGetAccountBudgetProposalServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getAccountBudgetProposalServiceClient());
  }

  @Test
  public void testGetAdGroupAdServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getAdGroupAdServiceClient());
  }

  @Test
  public void testGetAdGroupBidModifierServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getAdGroupBidModifierServiceClient());
  }

  @Test
  public void testGetAdGroupCriterionServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getAdGroupCriterionServiceClient());
  }

  @Test
  public void testGetAdGroupServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getAdGroupServiceClient());
  }

  @Test
  public void testGetBiddingStrategyServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getBiddingStrategyServiceClient());
  }

  @Test
  public void testGetBillingSetupServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getBillingSetupServiceClient());
  }

  @Test
  public void testGetCampaignBidModifierServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getCampaignBidModifierServiceClient());
  }

  @Test
  public void testGetCampaignBudgetServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getCampaignBudgetServiceClient());
  }

  @Test
  public void testGetCampaignCriterionServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getCampaignCriterionServiceClient());
  }

  @Test
  public void testGetCampaignGroupServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getCampaignGroupServiceClient());
  }

  @Test
  public void testGetCampaignServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getCampaignServiceClient());
  }

  @Test
  public void testGetCampaignSharedSetServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getCampaignSharedSetServiceClient());
  }

  @Test
  public void testGetChangeStatusServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getChangeStatusServiceClient());
  }

  @Test
  public void testGetConversionActionServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getConversionActionServiceClient());
  }

  @Test
  public void testGetCustomerServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getCustomerServiceClient());
  }

  @Test
  public void testGetGeoTargetConstantServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getGeoTargetConstantServiceClient());
  }

  @Test
  public void testGetGoogleAdsFieldServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getGoogleAdsFieldServiceClient());
  }

  @Test
  public void testGetGoogleAdsServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getGoogleAdsServiceClient());
  }

  @Test
  public void testGetKeywordViewServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getKeywordViewServiceClient());
  }

  @Test
  public void testGetRecommendationServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getRecommendationServiceClient());
  }

  @Test
  public void testGetSharedCriterionServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getSharedCriterionServiceClient());
  }

  @Test
  public void testGetSharedSetServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getSharedSetServiceClient());
  }

  @Test
  public void testGetVideoServiceClient() throws Exception {
    assertNotNullAndClose(createTestGoogleAdsClient().getVideoServiceClient());
  }

  /**
   * Verifies that {@link GoogleAdsClient} has a corresponding {@code getXServiceClient} method for
   * each supported service client class. This ensures that {@link GoogleAdsClient} stays up to date
   * as services are added or removed.
   */
  @Test
  public void testGetterExistsForAllSupportedServiceClients() throws SecurityException {
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

  /**
   * Verifies that a test exists for each getXServiceClient. This ensures that this test class stays
   * up to date as services are added.
   */
  @Test
  public void testTestExistsForAllServiceClientGetters() throws SecurityException {
    Set<String> missingGetterTests = new HashSet<>();
    for (Class<?> clientClass : GrpcServiceDescriptor.getAllServiceClientClasses()) {
      String expectedGetterTestName = "testGet" + clientClass.getSimpleName();
      try {
        getClass().getMethod(expectedGetterTestName);
      } catch (NoSuchMethodException e) {
        missingGetterTests.add(expectedGetterTestName);
      }
    }
    assertEquals(
        "testGetXServiceClient is not present on GoogleAdsClientTest for at least one supported "
            + "service client class",
        Collections.<String>emptySet(),
        missingGetterTests);
  }

  /** Tests building a client from a properties file. */
  @Test
  public void testBuildFromPropertiesFile() throws IOException {
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
   * Tests building a client from a properties file, where the file path and name is specified via
   * the {@link
   * com.google.ads.googleads.lib.GoogleAdsClient.Builder#PROPERTIES_CONFIG_FILE_PROPERTY} system
   * property.
   */
  @Test
  public void testBuildFromPropertiesFileViaSystemProperty() throws IOException {
    // Create a clientProperties file in the temporary folder.
    File propertiesFile = folder.newFile("ads.clientProperties");
    try (FileWriter propertiesFileWriter = new FileWriter(propertiesFile)) {
      testProperties.store(propertiesFileWriter, null);
    }

    Properties properties = new Properties();
    properties.setProperty(Builder.PROPERTIES_CONFIG_FILE_PROPERTY, propertiesFile.getPath());
    // Build a new client from the file.
    GoogleAdsClient client = GoogleAdsClient.newBuilder().fromPropertiesFile(properties).build();
    assertGoogleAdsClient(client);
  }

  @Test
  public void testBuildFromPropertiesFile_invalidFilePath_throwsException() throws IOException {
    File nonExistentFile = new File(folder.getRoot(), "I_dont_exist.properties");
    Properties properties = new Properties();
    properties.setProperty(Builder.PROPERTIES_CONFIG_FILE_PROPERTY, nonExistentFile.getPath());
    // Invokes the fromPropertiesFile method on the builder, which should fail.
    thrown.expect(FileNotFoundException.class);
    thrown.expectMessage(nonExistentFile.getName());
    GoogleAdsClient.newBuilder().fromPropertiesFile(properties);
  }

  /** Tests building a client without the use of a properties file. */
  @Test
  public void testBuildWithoutPropertiesFile() throws IOException {
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
    assertGoogleAdsClient(client);
  }

  /**
   * Asserts the argument is not null and closes it in a {@code finally} block to clean up
   * resources. Useful for tests that instantiate closeable objects such as service clients.
   */
  private void assertNotNullAndClose(AutoCloseable closeable) throws Exception {
    try {
      assertNotNull(closeable);
    } finally {
      closeable.close();
    }
  }

  /** Asserts that the provided client matches expectations. */
  private void assertGoogleAdsClient(GoogleAdsClient client) throws IOException {
    assertNotNull("Null client", client);
    assertNotNull("Null channel", client.withExecutor(executor).getTransportChannel());

    Credentials credentials = client.getCredentials();
    assertNotNull("Null credentials", credentials);
    assertThat(credentials, Matchers.instanceOf(UserCredentials.class));
    UserCredentials userCredentials = (UserCredentials) credentials;
    assertEquals("Client ID", CLIENT_ID, userCredentials.getClientId());
    assertEquals("Client secret", CLIENT_SECRET, userCredentials.getClientSecret());
    assertEquals("Refresh token", REFRESH_TOKEN, userCredentials.getRefreshToken());
  }
}
