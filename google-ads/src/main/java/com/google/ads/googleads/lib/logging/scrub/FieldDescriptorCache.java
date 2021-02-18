// Copyright 2021 Google LLC
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

import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.MessageOrBuilder;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Caches the results of looking up fields in a protobuf message's Descriptor.
 *
 * <p>Empirical testing suggests that the first request for a message's descriptor is quite slow,
 * for instance GoogleAdsRow takes about 0.5 seconds. Future requests to the protobuf descriptor API
 * take around 3 usec. This cache reduces the ongoing lookup time to around 1 usec, but still
 * suffers from the slow initial request performance.
 */
public class FieldDescriptorCache {

  private static final FieldDescriptorCache INSTANCE = new FieldDescriptorCache();

  /** Obtains a global instance of the cache. */
  public static FieldDescriptorCache getDefault() {
    return INSTANCE;
  }

  private final ConcurrentMap<String, Optional<FieldDescriptor>> messageFieldToDescriptor =
      new ConcurrentHashMap<>();

  private FieldDescriptorCache() {}

  /**
   * Retrieves a named field from a MessageOrBuilder. If the field is not in the cache then it is
   * first populated and then returned.
   */
  public Optional<FieldDescriptor> lookupField(
      String fieldName, MessageOrBuilder containingMessage) {
    return messageFieldToDescriptor.computeIfAbsent(
        containingMessage.getClass().getName() + "." + fieldName,
        key ->
            Optional.ofNullable(
                containingMessage.getDescriptorForType().findFieldByName(fieldName)));
  }
}
