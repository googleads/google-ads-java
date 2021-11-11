/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v9.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class MediaFileName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_MEDIA_FILE_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/mediaFiles/{media_file_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String mediaFileId;

  @Deprecated
  protected MediaFileName() {
    customerId = null;
    mediaFileId = null;
  }

  private MediaFileName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    mediaFileId = Preconditions.checkNotNull(builder.getMediaFileId());
  }

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

  public static MediaFileName of(String customerId, String mediaFileId) {
    return newBuilder().setCustomerId(customerId).setMediaFileId(mediaFileId).build();
  }

  public static String format(String customerId, String mediaFileId) {
    return newBuilder().setCustomerId(customerId).setMediaFileId(mediaFileId).build().toString();
  }

  public static MediaFileName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_MEDIA_FILE_ID.validatedMatch(
            formattedString, "MediaFileName.parse: formattedString not in valid format");
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
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_MEDIA_FILE_ID.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (customerId != null) {
            fieldMapBuilder.put("customer_id", customerId);
          }
          if (mediaFileId != null) {
            fieldMapBuilder.put("media_file_id", mediaFileId);
          }
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
    return CUSTOMER_ID_MEDIA_FILE_ID.instantiate(
        "customer_id", customerId, "media_file_id", mediaFileId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      MediaFileName that = ((MediaFileName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.mediaFileId, that.mediaFileId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(mediaFileId);
    return h;
  }

  /** Builder for customers/{customer_id}/mediaFiles/{media_file_id}. */
  public static class Builder {
    private String customerId;
    private String mediaFileId;

    protected Builder() {}

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

    private Builder(MediaFileName mediaFileName) {
      this.customerId = mediaFileName.customerId;
      this.mediaFileId = mediaFileName.mediaFileId;
    }

    public MediaFileName build() {
      return new MediaFileName(this);
    }
  }
}
