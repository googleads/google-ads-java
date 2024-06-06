/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v17.resources;

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
public class VideoName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_VIDEO_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/videos/{video_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String videoId;

  @Deprecated
  protected VideoName() {
    customerId = null;
    videoId = null;
  }

  private VideoName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    videoId = Preconditions.checkNotNull(builder.getVideoId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getVideoId() {
    return videoId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static VideoName of(String customerId, String videoId) {
    return newBuilder().setCustomerId(customerId).setVideoId(videoId).build();
  }

  public static String format(String customerId, String videoId) {
    return newBuilder().setCustomerId(customerId).setVideoId(videoId).build().toString();
  }

  public static VideoName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_VIDEO_ID.validatedMatch(
            formattedString, "VideoName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("video_id"));
  }

  public static List<VideoName> parseList(List<String> formattedStrings) {
    List<VideoName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<VideoName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (VideoName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_VIDEO_ID.matches(formattedString);
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
          if (videoId != null) {
            fieldMapBuilder.put("video_id", videoId);
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
    return CUSTOMER_ID_VIDEO_ID.instantiate("customer_id", customerId, "video_id", videoId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      VideoName that = ((VideoName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.videoId, that.videoId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(videoId);
    return h;
  }

  /** Builder for customers/{customer_id}/videos/{video_id}. */
  public static class Builder {
    private String customerId;
    private String videoId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getVideoId() {
      return videoId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setVideoId(String videoId) {
      this.videoId = videoId;
      return this;
    }

    private Builder(VideoName videoName) {
      this.customerId = videoName.customerId;
      this.videoId = videoName.videoId;
    }

    public VideoName build() {
      return new VideoName(this);
    }
  }
}
