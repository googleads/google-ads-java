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
public class SharedSetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_SHARED_SET_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/sharedSets/{shared_set_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String sharedSetId;

  @Deprecated
  protected SharedSetName() {
    customerId = null;
    sharedSetId = null;
  }

  private SharedSetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    sharedSetId = Preconditions.checkNotNull(builder.getSharedSetId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getSharedSetId() {
    return sharedSetId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static SharedSetName of(String customerId, String sharedSetId) {
    return newBuilder().setCustomerId(customerId).setSharedSetId(sharedSetId).build();
  }

  public static String format(String customerId, String sharedSetId) {
    return newBuilder().setCustomerId(customerId).setSharedSetId(sharedSetId).build().toString();
  }

  public static SharedSetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_SHARED_SET_ID.validatedMatch(
            formattedString, "SharedSetName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("shared_set_id"));
  }

  public static List<SharedSetName> parseList(List<String> formattedStrings) {
    List<SharedSetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SharedSetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (SharedSetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_SHARED_SET_ID.matches(formattedString);
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
          if (sharedSetId != null) {
            fieldMapBuilder.put("shared_set_id", sharedSetId);
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
    return CUSTOMER_ID_SHARED_SET_ID.instantiate(
        "customer_id", customerId, "shared_set_id", sharedSetId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      SharedSetName that = ((SharedSetName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.sharedSetId, that.sharedSetId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(sharedSetId);
    return h;
  }

  /** Builder for customers/{customer_id}/sharedSets/{shared_set_id}. */
  public static class Builder {
    private String customerId;
    private String sharedSetId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getSharedSetId() {
      return sharedSetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setSharedSetId(String sharedSetId) {
      this.sharedSetId = sharedSetId;
      return this;
    }

    private Builder(SharedSetName sharedSetName) {
      customerId = sharedSetName.customerId;
      sharedSetId = sharedSetName.sharedSetId;
    }

    public SharedSetName build() {
      return new SharedSetName(this);
    }
  }
}
