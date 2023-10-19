/*
 * Copyright 2023 Google LLC
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

package com.google.ads.googleads.v15.resources;

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
public class LifeEventName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_LIFE_EVENT_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/lifeEvents/{life_event_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String lifeEventId;

  @Deprecated
  protected LifeEventName() {
    customerId = null;
    lifeEventId = null;
  }

  private LifeEventName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    lifeEventId = Preconditions.checkNotNull(builder.getLifeEventId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getLifeEventId() {
    return lifeEventId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LifeEventName of(String customerId, String lifeEventId) {
    return newBuilder().setCustomerId(customerId).setLifeEventId(lifeEventId).build();
  }

  public static String format(String customerId, String lifeEventId) {
    return newBuilder().setCustomerId(customerId).setLifeEventId(lifeEventId).build().toString();
  }

  public static LifeEventName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_LIFE_EVENT_ID.validatedMatch(
            formattedString, "LifeEventName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("life_event_id"));
  }

  public static List<LifeEventName> parseList(List<String> formattedStrings) {
    List<LifeEventName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<LifeEventName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LifeEventName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_LIFE_EVENT_ID.matches(formattedString);
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
          if (lifeEventId != null) {
            fieldMapBuilder.put("life_event_id", lifeEventId);
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
    return CUSTOMER_ID_LIFE_EVENT_ID.instantiate(
        "customer_id", customerId, "life_event_id", lifeEventId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      LifeEventName that = ((LifeEventName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.lifeEventId, that.lifeEventId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(lifeEventId);
    return h;
  }

  /** Builder for customers/{customer_id}/lifeEvents/{life_event_id}. */
  public static class Builder {
    private String customerId;
    private String lifeEventId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getLifeEventId() {
      return lifeEventId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setLifeEventId(String lifeEventId) {
      this.lifeEventId = lifeEventId;
      return this;
    }

    private Builder(LifeEventName lifeEventName) {
      this.customerId = lifeEventName.customerId;
      this.lifeEventId = lifeEventName.lifeEventId;
    }

    public LifeEventName build() {
      return new LifeEventName(this);
    }
  }
}
