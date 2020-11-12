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

import com.google.ads.googleads.lib.GoogleAdsAllVersions;
import com.google.ads.googleads.lib.utils.messageproxy.MessageProxyProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.protobuf.Message;
import java.util.Optional;
import java.util.SortedSet;

/**
 * Provides metadata about the Google Ads API versions supported in the client library.
 *
 * <p>Note: This is *not* intended to be the external interface for accessing API versions. If you
 * are looking for that, please see the GoogleAdsAllVersions interface provided by GoogleAdsClient.
 */
public interface ApiCatalog {

  /** Returns a ApiCatalog implementation which reflects the current state of the library. */
  static ApiCatalog getDefault() {
    return GeneratedCatalog.getDefault();
  }

  /** Returns all API versions available in the current catalog. */
  SortedSet<Version> getSupportedVersions();

  /** Returns the most recent API version available. */
  Version getLatestVersion();

  /**
   * Instantiates a new GoogleAdsAllVersions object for the given TransportChannelProvider and
   * Credentials. Calling this method multiple times will create multiple instances of
   * GoogleAdsAllVersions.
   */
  GoogleAdsAllVersions createAllVersionsClient(
      TransportChannelProvider provider, Credentials credentials);

  /** Gets the {@link MessageProxyProvider} for a given message. */
  Optional<MessageProxyProvider> getMessageProxyProvider(Message input);

  /** Gets the {@link Version} for a given message. */
  Optional<Version> getVersionForMessage(Message input);
}
