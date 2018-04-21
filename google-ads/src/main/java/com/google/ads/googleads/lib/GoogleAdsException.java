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
import com.google.common.base.Preconditions;
import io.grpc.Metadata;

/** An exception thrown by a GoogleAds RPC. */
public class GoogleAdsException extends ApiException {

  private static final String REQUEST_ID_HEADER_KEY = "request-id";

  private final GoogleAdsFailure googleAdsFailure;
  private final Metadata metadata;

  public GoogleAdsException(
      ApiException original, GoogleAdsFailure googleAdsFailure, Metadata metadata) {
    super(
        original.getMessage(),
        original.getCause(),
        original.getStatusCode(),
        original.isRetryable());
    this.googleAdsFailure =
        Preconditions.checkNotNull(googleAdsFailure, "googleAdsFailure was null");
    this.metadata = Preconditions.checkNotNull(metadata, "metadata was null");
  }

  /** Get the GoogleAdsFailure message. */
  public GoogleAdsFailure getGoogleAdsFailure() {
    return googleAdsFailure;
  }

  /**
   * Get the request id returned in the RPC trailers. Returns null if the RPC has not completed or
   * no request id was received.
   */
  public String getRequestId() {
    return getHeader(REQUEST_ID_HEADER_KEY);
  }

  /**
   * Get a string value from the trailers returned by the RPC. If the given key is not present,
   * returns null.
   */
  String getHeader(String headerKey) {
    Metadata.Key<String> key = Metadata.Key.of(headerKey, Metadata.ASCII_STRING_MARSHALLER);
    return metadata.get(key);
  }
}
