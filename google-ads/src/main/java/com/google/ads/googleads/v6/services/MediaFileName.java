/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ads.googleads.v6.services;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED DOCUMENTATION AND CLASS
 */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class MediaFileName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/mediaFiles/{media_file_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String mediaFileId;

  public String getCustomerId() {
    return customerId;
  }

  public String getMediaFileId() {
    return mediaFileId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private MediaFileName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    mediaFileId = Preconditions.checkNotNull(builder.getMediaFileId());
  }

  public static MediaFileName of(String customerId, String mediaFileId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setMediaFileId(mediaFileId)
      .build();
  }

  public static String format(String customerId, String mediaFileId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setMediaFileId(mediaFileId)
      .build()
      .toString();
  }

  public static MediaFileName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MediaFileName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("media_file_id"));
  }

  public static List<MediaFileName> parseList(List<String> formattedStrings) {
    List<MediaFileName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<MediaFileName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (MediaFileName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customerId", customerId);
          fieldMapBuilder.put("mediaFileId", mediaFileId);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "media_file_id", mediaFileId);
  }

  /** Builder for MediaFileName. */
  public static class Builder {

    private String customerId;
    private String mediaFileId;

    public String getCustomerId() {
      return customerId;
    }

    public String getMediaFileId() {
      return mediaFileId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setMediaFileId(String mediaFileId) {
      this.mediaFileId = mediaFileId;
      return this;
    }

    private Builder() {
    }

    private Builder(MediaFileName mediaFileName) {
      customerId = mediaFileName.customerId;
      mediaFileId = mediaFileName.mediaFileId;
    }

    public MediaFileName build() {
      return new MediaFileName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MediaFileName) {
      MediaFileName that = (MediaFileName) o;
      return (this.customerId.equals(that.customerId))
          && (this.mediaFileId.equals(that.mediaFileId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= mediaFileId.hashCode();
    return h;
  }
}

