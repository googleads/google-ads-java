// Copyright 2020 Google LLC
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

import com.google.ads.googleads.lib.utils.messageproxy.MessageProxyProvider;
import com.google.protobuf.Message;
import java.util.Optional;

/** Provides partial implementation of ApiCatalog interface. */
public abstract class AbstractCatalog implements ApiCatalog {

  @Override
  public Optional<Version> getVersionForMessage(Message input) {
    for (Version version : getSupportedVersions()) {
      if (version.containsMessage(input)) {
        return Optional.of(version);
      }
    }
    return Optional.empty();
  }

  @Override
  public Optional<MessageProxyProvider> getMessageProxyProvider(Message input) {
    Optional<Version> version = getVersionForMessage(input);
    if (version.isPresent()) {
      return Optional.of(version.get().getMessageProxyProvider());
    } else {
      return Optional.empty();
    }
  }
}
