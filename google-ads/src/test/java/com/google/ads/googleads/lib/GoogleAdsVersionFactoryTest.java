// Copyright 2019 Google LLC
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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.lib.catalog.GoogleAdsVersionFactory;
import com.google.ads.googleads.lib.catalog.Version;
import com.google.ads.googleads.lib.catalog.annotation.ServiceClientDescriptor;
import com.google.ads.googleads.annotations.api.VersionDescriptor;
import com.google.ads.googleads.v4.services.MockGoogleAdsService;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ClientSettings;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GoogleAdsVersionFactoryTest {

  private static final MockGoogleAdsService mockService = new MockGoogleAdsService();
  private static final MockServiceHelper mockServiceHelper =
      new MockServiceHelper("fake-address", mockService);
  private final ApiCatalog catalog = ApiCatalog.getDefault();
  private LocalChannelProvider transportProvider;

  @Before
  public void setup() {
    transportProvider = mockServiceHelper.createChannelProvider();
  }

  /** Ensures that all known versions can be proxied. */
  @Test
  public void create_loadsAllKnownVersions() {
    for (Version version : catalog.getSupportedVersions()) {
      Object clientFactory =
          GoogleAdsVersionFactory.createProxy(
              version.getServiceClientFactoryClass(), transportProvider, new FakeCredential());
      assertNotNull(clientFactory);
      assertTrue(version.getServiceClientFactoryClass().isAssignableFrom(clientFactory.getClass()));
    }
  }

  /** Ensures that a random interface cannot be proxied. */
  @Test
  public void create_invalidInterface_throwsIllegalArgumentException() {
    try {
      GoogleAdsVersionFactory.createProxy(
          String.class, transportProvider, new FakeCredential());
      fail();
    } catch (IllegalArgumentException ex) {
      // Expected.
    }
  }

  /** Ensures that an interface missing a VersionDescriptor annotation cannot be proxied. */
  @Test
  public void create_missingVersionDescriptor_throwsIllegalArgumentException() {
    try {
      GoogleAdsVersionFactory.createProxy(
          MissingVersion.class, transportProvider, new FakeCredential());
      fail();
    } catch (IllegalArgumentException ex) {
      // Expected.
    }
  }

  /** Ensures that an interface missing a ServiceClientDescriptor annotations cannot be proxied. */
  @Test
  public void create_settingsBuilderNotPresent_throwsIllegalArgumentException() {
    try {
      GoogleAdsVersionFactory.createProxy(
          MissingService.class, transportProvider, new FakeCredential());
      fail();
    } catch (IllegalArgumentException ex) {
      // Expected.
    }
  }

  /** Ensures that a mock interface with correct setup can be proxied. */
  @Test
  public void create_workingMock_succeeds() {
    WorkingExample instance =
        GoogleAdsVersionFactory.createProxy(
            WorkingExample.class, transportProvider, new FakeCredential());
    assertTrue(WorkingExample.class.isAssignableFrom(instance.getClass()));
  }

  // ------------------------- Mock interfaces/classes for test cases above ------------------------
  public interface MissingVersion {

    @ServiceClientDescriptor(settingsClass = DummySettings.class)
    DummyClient getClient();
  }

  @VersionDescriptor(
      versionName = "v4",
      googleAdsExceptionFactory = BaseGoogleAdsException.Factory.class,
      catalogName = "v4")
  public interface MissingService {

    DummyClient getClient();
  }

  @VersionDescriptor(
      versionName = "v4",
      googleAdsExceptionFactory = BaseGoogleAdsException.Factory.class,
      catalogName = "v4")
  public interface WorkingExample {

    @ServiceClientDescriptor(settingsClass = DummySettings.class)
    DummyClient getClient();
  }

  public static class DummyClient {

    public static DummyClient create(DummySettings settings) {
      return new DummyClient();
    }
  }

  public static class DummySettings extends ClientSettings {

    public static Builder newBuilder() {
      return new Builder() {
        @Override
        public ClientSettings build() {
          return null;
        }
      };
    }

    protected DummySettings(Builder builder) throws IOException {
      super(builder);
    }

    @Override
    public Builder toBuilder() {
      return null;
    }
  }
}
