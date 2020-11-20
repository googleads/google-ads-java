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
import com.google.ads.googleads.lib.utils.messageproxy.MessageEditor;
import com.google.ads.googleads.lib.utils.messageproxy.SearchResponseProxy;
import com.google.protobuf.Message;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Scrubs PII from GoogleAdsService.search() and searchStream() responses. */
public class SearchResponsePiiScrubber implements MessageEditor<Message> {
  private static final Logger LOGGER = LoggerFactory.getLogger(LogScrubber.class);
  private static final ApiCatalog CATALOG = ApiCatalog.getDefault();
  private static final String CUSTOMER_USER_EMAIL_PATH = "customer_user_access.email_address";
  private static final String CUSTOMER_USER_INVITER_EMAIL_PATH =
      "customer_user_access.inviter_user_email_address";
  private static final String CHANGE_EVENT_EMAIL_PATH = "change_event.user_email";

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
    // Checks which type of search response we're scrubbing (streamed or paged).
    // The scrub logic is the same either way, but the proxy instance is different due to the
    // layout of these messages.
    SearchResponseProxy proxy;
    if (isSearchStreamResponse(input)) {
      proxy = version.getMessageProxyProvider().getSearchStreamResponseProxy();
    } else if (isSearchPagedResponse(input)) {
      proxy = version.getMessageProxyProvider().getSearchPagedResponseProxy();
    } else {
      LOGGER.warn(
          "Unhandled search stream response {}, please report a bug to"
              + " https://github.com/googleads/google-ads-java/issues/new",
          input.getClass());
      return input;
    }
    // Uses FieldMask to determine which fields need to scrubbed. This allows us to avoid checking
    // each message in the response (which may contain up to 10k messages).
    boolean needsEmailScrub = false;
    boolean needsInviterEmailScrub = false;
    boolean needsChangeEventEmailScrub = false;
    for (String path : (List<String>) proxy.getFieldMaskPaths(input)) {
      if (!needsEmailScrub && path.equals(CUSTOMER_USER_EMAIL_PATH)) {
        needsEmailScrub = true;
        continue;
      }
      if (!needsInviterEmailScrub && path.equals(CUSTOMER_USER_INVITER_EMAIL_PATH)) {
        needsInviterEmailScrub = true;
      }
      if (!needsChangeEventEmailScrub && path.equals(CHANGE_EVENT_EMAIL_PATH)) {
        needsChangeEventEmailScrub = true;
      }
      // Exits early once all fields to scrub are found.
      if ((needsEmailScrub && needsInviterEmailScrub) || needsChangeEventEmailScrub) {
        break;
      }
    }
    // Scrubs the response.
    Message.Builder builder = input.toBuilder();
    if (needsEmailScrub) {
      proxy.setCustomerUserAccessEmailAddressIfPresent(builder, LogScrubber.MASK_PATTERN);
    }
    if (needsInviterEmailScrub) {
      proxy.setCustomerUserAccessInviterEmailAddressIfPresent(builder, LogScrubber.MASK_PATTERN);
    }
    if (needsChangeEventEmailScrub) {
      proxy.setChangeEventUserEmailIfPresent(builder, LogScrubber.MASK_PATTERN);
    }
    return builder.build();
  }

  @Override
  public boolean supports(Message input) {
    return input != null && (isSearchStreamResponse(input) || isSearchPagedResponse(input));
  }

  private static boolean isSearchPagedResponse(Message input) {
    return input.getClass().getSimpleName().equals("SearchGoogleAdsResponse");
  }

  private static boolean isSearchStreamResponse(Message input) {
    // Compares based on class name, to save loading all search response classes up front.
    return input.getClass().getSimpleName().equals("SearchGoogleAdsStreamResponse");
  }
}
