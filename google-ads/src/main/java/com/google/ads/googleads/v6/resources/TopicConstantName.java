/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.resources;

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
public class TopicConstantName implements ResourceName {
  private static final PathTemplate TOPIC_ID =
      PathTemplate.createWithoutUrlEncoding("topicConstants/{topic_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String topicId;

  @Deprecated
  protected TopicConstantName() {
    topicId = null;
  }

  private TopicConstantName(Builder builder) {
    topicId = Preconditions.checkNotNull(builder.getTopicId());
  }

  public String getTopicId() {
    return topicId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static TopicConstantName of(String topicId) {
    return newBuilder().setTopicId(topicId).build();
  }

  public static String format(String topicId) {
    return newBuilder().setTopicId(topicId).build().toString();
  }

  public static TopicConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        TOPIC_ID.validatedMatch(
            formattedString, "TopicConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("topic_id"));
  }

  public static List<TopicConstantName> parseList(List<String> formattedStrings) {
    List<TopicConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<TopicConstantName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (TopicConstantName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return TOPIC_ID.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (topicId != null) {
            fieldMapBuilder.put("topic_id", topicId);
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
    return TOPIC_ID.instantiate("topic_id", topicId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      TopicConstantName that = ((TopicConstantName) o);
      return Objects.equals(this.topicId, that.topicId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(topicId);
    return h;
  }

  /** Builder for topicConstants/{topic_id}. */
  public static class Builder {
    private String topicId;

    protected Builder() {}

    public String getTopicId() {
      return topicId;
    }

    public Builder setTopicId(String topicId) {
      this.topicId = topicId;
      return this;
    }

    private Builder(TopicConstantName topicConstantName) {
      topicId = topicConstantName.topicId;
    }

    public TopicConstantName build() {
      return new TopicConstantName(this);
    }
  }
}
