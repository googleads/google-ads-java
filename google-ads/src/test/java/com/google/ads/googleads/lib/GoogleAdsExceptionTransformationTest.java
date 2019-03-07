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

import static org.junit.Assert.assertEquals;

import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.lib.catalog.Version;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.rpc.ApiException;
import com.google.protobuf.Message;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.Status.Code;
import io.grpc.StatusException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GoogleAdsExceptionTransformationTest {

  private final ApiCatalog catalog = ApiCatalog.getDefault();
  private final GoogleAdsExceptionTransformation transformation =
      new GoogleAdsExceptionTransformation();

  @Test
  public void loadsAllVersions() {
    for (Version version : catalog.getSupportedVersions()) {
      Message expectedFailure = version.getExceptionFactory().createDefaultFailure();
      ApiException exception =
          getApiExceptionForVersion(
              version.getExceptionFactory().getTrailerKey(), expectedFailure.toByteArray());
      Throwable result = transformation.transform(exception);
      Message actualFailure = ((BaseGoogleAdsException) result).getGoogleAdsFailure();
      assertEquals(expectedFailure, actualFailure);
    }
  }

  @Test
  public void handlesNoRootCause() {
    ApiException exception = new ApiException(null, GrpcStatusCode.of(Code.UNKNOWN), false);
    Throwable result = transformation.transform(exception);
    assertEquals(exception, result);
  }

  @Test
  public void handlesNullTrailers() {
    ApiException exception =
        new ApiException(
            new StatusException(Status.UNKNOWN), GrpcStatusCode.of(Code.UNKNOWN), false);
    Throwable result = transformation.transform(exception);
    assertEquals(exception, result);
  }

  @Test
  public void handlesEmptyTrailers() {
    for (Version version : catalog.getSupportedVersions()) {
      ApiException exception =
          getApiExceptionForVersion(version.getExceptionFactory().getTrailerKey(), null);
      Throwable result = transformation.transform(exception);
      assertEquals(exception, result);
    }
  }

  @Test
  public void failsGracefullyWithUnparsableFailureProto() {
    for (Version version : catalog.getSupportedVersions()) {
      ApiException exception =
          getApiExceptionForVersion(
              version.getExceptionFactory().getTrailerKey(), new byte[] {0, 1, 2, 3});
      Throwable result = transformation.transform(exception);
      assertEquals(exception, result);
    }
  }

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
