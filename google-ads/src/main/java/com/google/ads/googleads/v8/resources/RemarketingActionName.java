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

package com.google.ads.googleads.v8.resources;

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
public class RemarketingActionName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_REMARKETING_ACTION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/remarketingActions/{remarketing_action_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String remarketingActionId;

  @Deprecated
  protected RemarketingActionName() {
    customerId = null;
    remarketingActionId = null;
  }

  private RemarketingActionName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    remarketingActionId = Preconditions.checkNotNull(builder.getRemarketingActionId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getRemarketingActionId() {
    return remarketingActionId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static RemarketingActionName of(String customerId, String remarketingActionId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setRemarketingActionId(remarketingActionId)
        .build();
  }

  public static String format(String customerId, String remarketingActionId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setRemarketingActionId(remarketingActionId)
        .build()
        .toString();
  }

  public static RemarketingActionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_REMARKETING_ACTION_ID.validatedMatch(
            formattedString, "RemarketingActionName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("remarketing_action_id"));
  }

  public static List<RemarketingActionName> parseList(List<String> formattedStrings) {
    List<RemarketingActionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<RemarketingActionName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (RemarketingActionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_REMARKETING_ACTION_ID.matches(formattedString);
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
          if (remarketingActionId != null) {
            fieldMapBuilder.put("remarketing_action_id", remarketingActionId);
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
    return CUSTOMER_ID_REMARKETING_ACTION_ID.instantiate(
        "customer_id", customerId, "remarketing_action_id", remarketingActionId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      RemarketingActionName that = ((RemarketingActionName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.remarketingActionId, that.remarketingActionId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(remarketingActionId);
    return h;
  }

  /** Builder for customers/{customer_id}/remarketingActions/{remarketing_action_id}. */
  public static class Builder {
    private String customerId;
    private String remarketingActionId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getRemarketingActionId() {
      return remarketingActionId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setRemarketingActionId(String remarketingActionId) {
      this.remarketingActionId = remarketingActionId;
      return this;
    }

    private Builder(RemarketingActionName remarketingActionName) {
      customerId = remarketingActionName.customerId;
      remarketingActionId = remarketingActionName.remarketingActionId;
    }

    public RemarketingActionName build() {
      return new RemarketingActionName(this);
    }
  }
}
