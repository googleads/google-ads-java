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

import com.google.api.gax.grpc.GrpcResponseMetadata;
import com.google.common.collect.ImmutableMap;
import io.grpc.Metadata;
import io.grpc.Metadata.Key;
import java.util.Map;

/**
 * GoogleAdsResponseMetadata is used to access the response metadata returned by a Google Ads RPC.
 *
 * <p>NOTE: the GoogleAdsResponseMetadata class is not thread-safe and should NOT be re-used for
 * multiple calls. A new instance of GoogleAdsResponseMetadata should be constructed for each call
 * that requires metadata to be accessed.
 *
 * <p>Example usage:
 *
 * <pre>
 * <code>
 * GoogleAdsResponseMetadata metadata = new GoogleAdsResponseMetadata();
 * Foo foo = client.getFooCallable().call(getFooRequest, metadata.createContextWithHandlers());
 * System.out.println("Request id: " + metadata.getRequestId());
 * </code>
 * </pre>
 */
public class GoogleAdsResponseMetadata extends GrpcResponseMetadata {

  public static final String REQUEST_ID_HEADER_KEY = "request-id";

  private volatile Map<String, String> headerMap = ImmutableMap.of();

  @Override
  public void onHeaders(Metadata metadata) {
    super.onHeaders(metadata);
    ImmutableMap.Builder<String, String> headerBuilder = ImmutableMap.builder();
    for (String key : metadata.keys()) {
      // Ignore binary headers
      if (!key.endsWith(Metadata.BINARY_HEADER_SUFFIX)) {
        Key<String> stringKey = Key.of(key, Metadata.ASCII_STRING_MARSHALLER);
        if (metadata.containsKey(stringKey)) {
          headerBuilder.put(key, metadata.get(stringKey));
        }
      }
    }
    headerMap = headerBuilder.build();
  }

  /**
   * Get the request id returned in the RPC headers. Returns null if the RPC has not completed or no
   * request id was received.
   */
  public String getRequestId() {
    return headerMap.get(REQUEST_ID_HEADER_KEY);
  }

  Map<String, String> getHeaderMap() {
    return headerMap;
  }
}
