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

import com.google.ads.googleads.lib.catalog.Version;
import com.google.protobuf.Message;

/** Scrubs PII from CreateCustomerClientRequest messages. */
public class CreateCustomerClientRequestScrubber extends AbstractScrubber {

  private static final int MIN_VERSION_FOR_SCRUB = 5;

  public CreateCustomerClientRequestScrubber() {
    super(MIN_VERSION_FOR_SCRUB);
  }

  @Override
  protected Message scrubValidatedMessage(Message input, Version version) {
    Message.Builder builder = input.toBuilder();
    version
        .getMessageProxyProvider()
        .getCreateCustomerClientRequestMessageProxy()
        .setEmailAddressIfPresent(builder, LogScrubber.MASK_PATTERN);
    return builder.build();
  }

  @Override
  public boolean supports(Message input) {
    return input != null && input.getClass().getSimpleName().equals("CreateCustomerClientRequest");
  }
}
