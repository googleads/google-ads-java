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

import com.google.ads.googleads.lib.utils.messageproxy.MessageEditor;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Message;

/**
 * Implements log scrubbing, e.g. for removing PII.
 *
 * <p>WARNING: THIS CLASS IS HIGHLY PERFORMANCE SENSITIVE
 *
 * <p>Every RPC calls this class at least twice (once each for request + response). Be extremely
 * careful not to increase latency. This class is an exception to the "premature optimization is the
 * root of all evil" rule-of-thumb; we should be extremely proactive about optimizing performance
 * here.
 */
public class LogScrubber implements MessageEditor<Object> {

  public static final String MASK_PATTERN = "REDACTED";
  private final ImmutableList<MessageEditor<Message>> scrubbers =
      ImmutableList.of(new SearchResponsePiiScrubber(), new GetCustomerUserAccessPiiScrubber());
  private static final LogScrubber INSTANCE = new LogScrubber();

  private LogScrubber() {}

  public static LogScrubber getInstance() {
    return INSTANCE;
  }

  @Override
  public Object edit(Object input) {
    // Provides a convenient interface for interceptors which deal with Objects rather than
    // Messages.
    if (Message.class.isAssignableFrom(input.getClass())) {
      return scrub((Message) input);
    } else {
      return input;
    }
  }

  @Override
  public boolean supports(Object input) {
    // Supports all messages. Rather than the O(n) check for all scrubbers, we will check them
    // during the scrub.
    return true;
  }

  private Message scrub(Message message) {
    for (MessageEditor<Message> scrubber : scrubbers) {
      if (scrubber.supports(message)) {
        // Returns early, we know that other scrubbers do not need to run on this message since
        // scrubbers are partitioned by message type - there is never more than one scrubber per
        // message type.
        return scrubber.edit(message);
      }
    }
    return message;
  }
}
