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

import com.google.ads.googleads.lib.reflect.ReflectionFieldAccessor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Message;
import java.util.Optional;

/**
 * Defines GoogleAdsService.search() and searchStream() responses as a special case for response
 * scrubbing. Only scrubs these responses if the field mask for the response contains the fields of
 * interest.
 */
public class SearchResponseScrubber extends ReflectionFieldAccessor {

  private static final FieldDescriptorCache FIELD_DESCRIPTOR_CACHE =
      FieldDescriptorCache.getDefault();
  private final String fieldPathInsideRow;

  public SearchResponseScrubber(String fieldPathInsideRow) {
    // Inserts results. so that we process all rows inside a response.
    super("results." + fieldPathInsideRow);
    // Caches the path inside the row so that we can check if it's in the field mask.
    this.fieldPathInsideRow = fieldPathInsideRow;
  }

  @Override
  public Message setFieldIfPresent(Message input, String toSet) {
    if (isSearchResponse(input)) {
      // Checks if the search response field mask contains the field to be set. If the field mask is
      // not present then we do not need to do any further processing.
      Optional<FieldDescriptor> maskField = FIELD_DESCRIPTOR_CACHE.lookupField("field_mask", input);
      if (!maskField.isPresent()) {
        return input;
      }
      FieldMask fieldMask = (FieldMask) input.getField(maskField.get());
      if (fieldMask != null && fieldMask.getPathsList().contains(fieldPathInsideRow)) {
        return super.setFieldIfPresent(input, toSet);
      }
    }
    return input;
  }

  private boolean isSearchResponse(Message input) {
    return input.getClass().getSimpleName().equals("SearchGoogleAdsResponse")
        || input.getClass().getSimpleName().equals("SearchGoogleAdsStreamResponse");
  }
}
