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

import com.google.protobuf.Message;

/**
 * Implements log scrubbing, e.g. for removing PII.
 *
 * <p>WARNING: THIS CLASS IS HIGHLY PERFORMANCE SENSITIVE
 *
 * <p>Every RPC calls this class at least twice (once each for request + response). Be extremely
 * careful not to increase latency. This class is an exception to the "premature optimization is the
 * root of all evil" rule-of-thumb; we should be proactive about optimizing performance here.
 */
public class LogScrubber {

  public static final String MASK_PATTERN = "REDACTED";
  private static final ReflectionScrubber SCRUBBER = new ReflectionScrubber();
  private static final LogScrubber INSTANCE = new LogScrubber();

  private LogScrubber() {}

  public static LogScrubber getInstance() {
    return INSTANCE;
  }

  /**
   * Scrubs a given input. Only supports Message instances, all other objects are returned
   * unmodified.
   */
  public Object edit(Object input) {
    if (input != null && Message.class.isAssignableFrom(input.getClass())) {
      return scrub((Message) input);
    } else {
      return input;
    }
  }

  private Message scrub(Message message) {
    if (SCRUBBER.supports(message)) {
      return SCRUBBER.scrub(message);
    }
    return message;
  }
}
