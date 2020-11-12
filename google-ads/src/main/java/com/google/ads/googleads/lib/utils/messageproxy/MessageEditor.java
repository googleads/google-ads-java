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

package com.google.ads.googleads.lib.utils.messageproxy;

/** Provides an interface for abstracting edits that are made to a message. */
public interface MessageEditor<T> {

  /** Performs the edit on an input message. */
  T edit(T input);

  /**
   * Checks if this can edit a given message. This check should be highly optimized for performance.
   * If a validation check cannot be completed extremely fast, this method should return true and
   * decide in the scrub() implementation whether to perform the edit or not.
   */
  boolean supports(T input);
}
