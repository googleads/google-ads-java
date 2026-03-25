/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.resources;

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
public class VideoEnhancementName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_VIDEO_ENHANCEMENT =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/videoEnhancements/{video_enhancement}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String videoEnhancement;

  @Deprecated
  protected VideoEnhancementName() {
    customerId = null;
    videoEnhancement = null;
  }

  private VideoEnhancementName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    videoEnhancement = Preconditions.checkNotNull(builder.getVideoEnhancement());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getVideoEnhancement() {
    return videoEnhancement;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static VideoEnhancementName of(String customerId, String videoEnhancement) {
    return newBuilder().setCustomerId(customerId).setVideoEnhancement(videoEnhancement).build();
  }

  public static String format(String customerId, String videoEnhancement) {
    return newBuilder()
        .setCustomerId(customerId)
        .setVideoEnhancement(videoEnhancement)
        .build()
        .toString();
  }

  public static VideoEnhancementName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_VIDEO_ENHANCEMENT.validatedMatch(
            formattedString, "VideoEnhancementName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("video_enhancement"));
  }

  public static List<VideoEnhancementName> parseList(List<String> formattedStrings) {
    List<VideoEnhancementName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<VideoEnhancementName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (VideoEnhancementName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_VIDEO_ENHANCEMENT.matches(formattedString);
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
          if (videoEnhancement != null) {
            fieldMapBuilder.put("video_enhancement", videoEnhancement);
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
    return CUSTOMER_ID_VIDEO_ENHANCEMENT.instantiate(
        "customer_id", customerId, "video_enhancement", videoEnhancement);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      VideoEnhancementName that = ((VideoEnhancementName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.videoEnhancement, that.videoEnhancement);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(videoEnhancement);
    return h;
  }

  /** Builder for customers/{customer_id}/videoEnhancements/{video_enhancement}. */
  public static class Builder {
    private String customerId;
    private String videoEnhancement;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getVideoEnhancement() {
      return videoEnhancement;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setVideoEnhancement(String videoEnhancement) {
      this.videoEnhancement = videoEnhancement;
      return this;
    }

    private Builder(VideoEnhancementName videoEnhancementName) {
      this.customerId = videoEnhancementName.customerId;
      this.videoEnhancement = videoEnhancementName.videoEnhancement;
    }

    public VideoEnhancementName build() {
      return new VideoEnhancementName(this);
    }
  }
}
