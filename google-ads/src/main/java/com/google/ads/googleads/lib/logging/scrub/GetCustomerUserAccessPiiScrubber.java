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

package com.google.ads.googleads.lib.logging.scrub;

import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.lib.catalog.Version;
import com.google.ads.googleads.lib.utils.messageproxy.CustomerUserAccessMessageProxy;
import com.google.ads.googleads.lib.utils.messageproxy.MessageEditor;
import com.google.protobuf.Message;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Scrubs PII from CustomerUserAccess.get(). */
public class GetCustomerUserAccessPiiScrubber implements MessageEditor<Message> {
  private static final ApiCatalog CATALOG = ApiCatalog.getDefault();
  private static final Logger LOGGER = LoggerFactory.getLogger(LogScrubber.class);

  @Override
  public Message edit(Message input) {
    Optional<Version> versionForMessage = CATALOG.getVersionForMessage(input);
    if (!versionForMessage.isPresent()) {
      // Don't throw unchecked exceptions here, but ask users nicely to report a bug.
      LOGGER.warn(
          "Unable to scrub log message from {}, catalog version not found. Please report a bug to"
              + " https://github.com/googleads/google-ads-java/issues/new",
          input.getClass());
      return input;
    }
    Version version = versionForMessage.get();
    // Supports scrubbing only for v6+, i.e. when the PII fields were added.
    if (version.getVersionNumber() < 6) {
      return input;
    }
    Message.Builder builder = input.toBuilder();
    CustomerUserAccessMessageProxy proxy =
        version.getMessageProxyProvider().getCustomerUserAccessProxy();
    proxy.setCustomerUserAccessEmailAddressIfPresent(builder, LogScrubber.MASK_PATTERN);
    proxy.setCustomerUserAccessInviterEmailAddressIfPresent(builder, LogScrubber.MASK_PATTERN);
    return builder.build();
  }

  @Override
  public boolean supports(Message input) {
    return input != null && input.getClass().getSimpleName().equals("CustomerUserAccess");
  }
}
