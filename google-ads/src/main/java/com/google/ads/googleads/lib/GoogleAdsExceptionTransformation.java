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

import com.google.ads.googleads.v0.errors.GoogleAdsFailure;
import com.google.api.gax.rpc.ApiException;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.Metadata;
import io.grpc.Metadata.Key;

/**
 * Transforms an ApiException into a GoogleAdsException whenever a binary GoogleAdsFailure message
 * was sent in the RPC trailers.
 */
public class GoogleAdsExceptionTransformation
    implements ExceptionTransformingCallable.ExceptionTransformation {
  private static final Metadata.Key<byte[]> GOOGLE_ADS_FAILURE_KEY =
      Key.of(
          "google.ads.googleads.v0.errors.googleadsfailure-bin", Metadata.BINARY_BYTE_MARSHALLER);

  @Override
  public Throwable transform(ApiException exception) {
    Throwable cause = exception.getCause();
    Metadata metadata = io.grpc.Status.trailersFromThrowable(cause);
    if (!metadata.containsKey(GOOGLE_ADS_FAILURE_KEY)) {
      // When the GoogleAdsFailure message is not present, return the original exception
      return exception;
    }

    try {
      GoogleAdsFailure googleAdsFailure =
          GoogleAdsFailure.parseFrom(metadata.get(GOOGLE_ADS_FAILURE_KEY));
      return new GoogleAdsException(exception, googleAdsFailure, metadata);
    } catch (InvalidProtocolBufferException e) {
      // Swallow the exception and return the original
    }

    return exception;
  }
}
