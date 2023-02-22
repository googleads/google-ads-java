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

package com.google.ads.googleads.lib.catalog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.ads.googleads.lib.FakeCredential;
import com.google.ads.googleads.lib.GoogleAdsAllVersions;
import com.google.ads.googleads.lib.stubs.exceptions.BaseGoogleAdsException;
import com.google.ads.googleads.v13.services.MockGoogleAdsService;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiException;
import com.google.protobuf.Message;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.Status.Code;
import io.grpc.StatusException;
import java.lang.reflect.Method;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ApiCatalogTest {

  private static final MockGoogleAdsService mockService = new MockGoogleAdsService();
  private static final MockServiceHelper mockServiceHelper =
      new MockServiceHelper("fake-address", mockService);
  private final ApiCatalog catalog = ApiCatalog.getDefault();
  private LocalChannelProvider transportProvider;

  @Before
  public void setup() {
    transportProvider = mockServiceHelper.createChannelProvider();
  }

  /** Ensure that basic getters are returning instances for all versions. */
  @Test
  public void typeFactory_gettersWorkInBaseCase() {
    for (Version version : catalog.getSupportedVersions()) {
      assertNotNull(version.getExceptionFactory().getTrailerKey());
      assertNotNull(version.getExceptionFactory().createGoogleAdsFailure());
    }
  }

  /** Ensures that null is returned for a null input. */
  @Test
  public void createGoogleAdsException_fromNullInput() {
    for (Version version : catalog.getSupportedVersions()) {
      assertEquals(
          "Unexpected nonnull return value",
          Optional.empty(),
          version.getExceptionFactory().createGoogleAdsException(null));
    }
  }

  /**
   * Ensure that all versions decode a GoogleAdsException when the metadata contains
   * GoogleAdsFailure.
   */
  @Test
  public void createGoogleAdsException_fromMetadata() {
    for (Version version : catalog.getSupportedVersions()) {
      Message expectedFailure = version.getExceptionFactory().createGoogleAdsFailure();
      ApiException exception =
          getApiExceptionForVersion(
              version.getExceptionFactory().getTrailerKey(), expectedFailure.toByteArray());
      Optional<? extends BaseGoogleAdsException> result =
          version.getExceptionFactory().createGoogleAdsException(exception);
      assertTrue("Missing GoogleAdsException from invalid data", result.isPresent());
      assertEquals(
          "Cause not equal to original exception", exception.getCause(), result.get().getCause());
      assertEquals(
          "GoogleAdsFailure present but not equal",
          expectedFailure,
          result.get().getGoogleAdsFailure());
    }
  }

  /**
   * Ensure that all versions throw a creation exception when the metadata is present but invalid.
   */
  @Test
  public void createGoogleAdsException_fromInvalidData() {
    for (Version version : catalog.getSupportedVersions()) {
      ApiException exception =
          getApiExceptionForVersion(
              version.getExceptionFactory().getTrailerKey(), new byte[] {1, 2, 3});
      Optional<? extends BaseGoogleAdsException> result =
          version.getExceptionFactory().createGoogleAdsException(exception);
      assertFalse("Invalid data produced result", result.isPresent());
    }
  }

  /**
   * Ensure that all versions return Optional.empty() when the ApiException doesn't have a cause.
   */
  @Test
  public void createGoogleAdsException_fromNullCause() {
    for (Version version : catalog.getSupportedVersions()) {
      ApiException exception = new ApiException(null, GrpcStatusCode.of(Code.UNKNOWN), false);
      Optional<? extends BaseGoogleAdsException> result =
          version.getExceptionFactory().createGoogleAdsException(exception);
      assertFalse("Null cause produced result", result.isPresent());
    }
  }

  /** Ensure that all versions return Optional.empty() when the trailing metadata is not present. */
  @Test
  public void createGoogleAdsException_fromNullMetadata() {
    for (Version version : catalog.getSupportedVersions()) {
      ApiException exception =
          new ApiException(
              new StatusException(Status.UNKNOWN, null), GrpcStatusCode.of(Code.UNKNOWN), false);
      Optional<? extends BaseGoogleAdsException> result =
          version.getExceptionFactory().createGoogleAdsException(exception);
      assertFalse("Null metadata produced result", result.isPresent());
    }
  }

  /**
   * Ensure that all versions return Optional.empty() when the trailing metadata contains the key
   * but no proto data.
   */
  @Test
  public void createGoogleAdsException_nullProtoData_isTranslated() {
    for (Version version : catalog.getSupportedVersions()) {
      ApiException exception =
          getApiExceptionForVersion(version.getExceptionFactory().getTrailerKey(), null);
      Optional<? extends BaseGoogleAdsException> result =
          version.getExceptionFactory().createGoogleAdsException(exception);
      assertFalse("Null proto data produced result", result.isPresent());
    }
  }

  /** Ensure that all services and all service clients can be instantiated. */
  @Test
  public void createServices_createsAllServiceClients() throws Exception {
    GoogleAdsAllVersions versions =
        catalog.createAllVersionsClient(transportProvider, new FakeCredential());
    for (Method serviceFactoryMethod : GoogleAdsAllVersions.class.getMethods()) {
      Object factory = serviceFactoryMethod.invoke(versions);
      for (Method serviceMethod : serviceFactoryMethod.getReturnType().getMethods()) {
        try (AutoCloseable serviceClient = (AutoCloseable) serviceMethod.invoke(factory)) {
          assertNotNull(
              "Expected a valid service client for " + serviceFactoryMethod, serviceClient);
        }
      }
    }
  }

  /** Constructs an ApiException embedding the proto in the trailing metadata for a given key. */
  private static ApiException getApiExceptionForVersion(
      Metadata.Key<byte[]> failureKey, byte[] data) {
    Metadata trailers = new Metadata();
    if (data != null) {
      trailers.put(failureKey, data);
    }
    return new ApiException(
        new StatusException(Status.UNKNOWN, trailers), GrpcStatusCode.of(Code.UNKNOWN), false);
  }
}
