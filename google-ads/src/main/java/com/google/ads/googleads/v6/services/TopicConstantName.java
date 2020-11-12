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
public class TopicConstantName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("topicConstants/{topic_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String topicId;

  public String getTopicId() {
    return topicId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private TopicConstantName(Builder builder) {
    topicId = Preconditions.checkNotNull(builder.getTopicId());
  }

  public static TopicConstantName of(String topicId) {
    return newBuilder()
      .setTopicId(topicId)
      .build();
  }

  public static String format(String topicId) {
    return newBuilder()
      .setTopicId(topicId)
      .build()
      .toString();
  }

  public static TopicConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "TopicConstantName.parse: formattedString not in valid format");
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
    List<String> list = new ArrayList<String>(values.size());
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
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("topicId", topicId);
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
    return PATH_TEMPLATE.instantiate("topic_id", topicId);
  }

  /** Builder for TopicConstantName. */
  public static class Builder {

    private String topicId;

    public String getTopicId() {
      return topicId;
    }

    public Builder setTopicId(String topicId) {
      this.topicId = topicId;
      return this;
    }

    private Builder() {
    }

    private Builder(TopicConstantName topicConstantName) {
      topicId = topicConstantName.topicId;
    }

    public TopicConstantName build() {
      return new TopicConstantName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TopicConstantName) {
      TopicConstantName that = (TopicConstantName) o;
      return (this.topicId.equals(that.topicId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= topicId.hashCode();
    return h;
  }
}

