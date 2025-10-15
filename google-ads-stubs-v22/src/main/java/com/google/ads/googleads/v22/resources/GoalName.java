/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v22.resources;

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
public class GoalName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_UNIFIED_GOAL_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/goals/{unified_goal_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String unifiedGoalId;

  @Deprecated
  protected GoalName() {
    customerId = null;
    unifiedGoalId = null;
  }

  private GoalName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    unifiedGoalId = Preconditions.checkNotNull(builder.getUnifiedGoalId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getUnifiedGoalId() {
    return unifiedGoalId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static GoalName of(String customerId, String unifiedGoalId) {
    return newBuilder().setCustomerId(customerId).setUnifiedGoalId(unifiedGoalId).build();
  }

  public static String format(String customerId, String unifiedGoalId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setUnifiedGoalId(unifiedGoalId)
        .build()
        .toString();
  }

  public static GoalName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_UNIFIED_GOAL_ID.validatedMatch(
            formattedString, "GoalName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("unified_goal_id"));
  }

  public static List<GoalName> parseList(List<String> formattedStrings) {
    List<GoalName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<GoalName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (GoalName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_UNIFIED_GOAL_ID.matches(formattedString);
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
          if (unifiedGoalId != null) {
            fieldMapBuilder.put("unified_goal_id", unifiedGoalId);
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
    return CUSTOMER_ID_UNIFIED_GOAL_ID.instantiate(
        "customer_id", customerId, "unified_goal_id", unifiedGoalId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      GoalName that = ((GoalName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.unifiedGoalId, that.unifiedGoalId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(unifiedGoalId);
    return h;
  }

  /** Builder for customers/{customer_id}/goals/{unified_goal_id}. */
  public static class Builder {
    private String customerId;
    private String unifiedGoalId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getUnifiedGoalId() {
      return unifiedGoalId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setUnifiedGoalId(String unifiedGoalId) {
      this.unifiedGoalId = unifiedGoalId;
      return this;
    }

    private Builder(GoalName goalName) {
      this.customerId = goalName.customerId;
      this.unifiedGoalId = goalName.unifiedGoalId;
    }

    public GoalName build() {
      return new GoalName(this);
    }
  }
}
