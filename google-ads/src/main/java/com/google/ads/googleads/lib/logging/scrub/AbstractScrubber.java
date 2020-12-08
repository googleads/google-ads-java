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
import com.google.protobuf.Message;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstracts the functionality of scrubbing a message. Handles pinning the scrub to a minimum
 * version.
 */
public abstract class AbstractScrubber implements MessageEditor<Message> {

  private static final ApiCatalog CATALOG = ApiCatalog.getDefault();
  private static final Logger LOGGER = LoggerFactory.getLogger(AbstractScrubber.class);
  private final int minVersionForScrub;

  /**
   * Creates a new scrubber instance, specifying the minimum version that is supported for
   * scrubbing.
   */
  public AbstractScrubber(int minVersionForScrub) {
    this.minVersionForScrub = minVersionForScrub;
  }

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
    // Supports scrubbing only after the fields were added.
    if (version.getVersionNumber() < minVersionForScrub) {
      return input;
    }
    return scrubValidatedMessage(input, version);
  }

  /**
   * Executes the scrub operation on a message, given it's containing catalog version. It is safe to
   * assume that:
   *
   * <ul>
   *   <li>{@link #supports(Object)} is true.
   *   <li>the API version of input message is greater than or equal to the minimum version
   *       required.
   * </ul>
   */
  protected abstract Message scrubValidatedMessage(Message input, Version version);
}
