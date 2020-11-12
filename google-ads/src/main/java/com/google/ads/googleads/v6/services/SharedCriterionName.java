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
public class SharedCriterionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String sharedSetId;
  private final String criterionId;

  public String getCustomerId() {
    return customerId;
  }

  public String getSharedSetId() {
    return sharedSetId;
  }

  public String getCriterionId() {
    return criterionId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SharedCriterionName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    sharedSetId = Preconditions.checkNotNull(builder.getSharedSetId());
    criterionId = Preconditions.checkNotNull(builder.getCriterionId());
  }

  public static SharedCriterionName of(String customerId, String sharedSetId, String criterionId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setSharedSetId(sharedSetId)
      .setCriterionId(criterionId)
      .build();
  }

  public static String format(String customerId, String sharedSetId, String criterionId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setSharedSetId(sharedSetId)
      .setCriterionId(criterionId)
      .build()
      .toString();
  }

  public static SharedCriterionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SharedCriterionName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("shared_set_id"), matchMap.get("criterion_id"));
  }

  public static List<SharedCriterionName> parseList(List<String> formattedStrings) {
    List<SharedCriterionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SharedCriterionName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (SharedCriterionName value : values) {
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
          fieldMapBuilder.put("sharedSetId", sharedSetId);
          fieldMapBuilder.put("criterionId", criterionId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "shared_set_id", sharedSetId, "criterion_id", criterionId);
  }

  /** Builder for SharedCriterionName. */
  public static class Builder {

    private String customerId;
    private String sharedSetId;
    private String criterionId;

    public String getCustomerId() {
      return customerId;
    }

    public String getSharedSetId() {
      return sharedSetId;
    }

    public String getCriterionId() {
      return criterionId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setSharedSetId(String sharedSetId) {
      this.sharedSetId = sharedSetId;
      return this;
    }

    public Builder setCriterionId(String criterionId) {
      this.criterionId = criterionId;
      return this;
    }

    private Builder() {
    }

    private Builder(SharedCriterionName sharedCriterionName) {
      customerId = sharedCriterionName.customerId;
      sharedSetId = sharedCriterionName.sharedSetId;
      criterionId = sharedCriterionName.criterionId;
    }

    public SharedCriterionName build() {
      return new SharedCriterionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SharedCriterionName) {
      SharedCriterionName that = (SharedCriterionName) o;
      return (this.customerId.equals(that.customerId))
          && (this.sharedSetId.equals(that.sharedSetId))
          && (this.criterionId.equals(that.criterionId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= sharedSetId.hashCode();
    h *= 1000003;
    h ^= criterionId.hashCode();
    return h;
  }
}

