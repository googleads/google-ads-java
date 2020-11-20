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
public class ChangeStatusName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/changeStatus/{change_status_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String changeStatusId;

  public String getCustomerId() {
    return customerId;
  }

  public String getChangeStatusId() {
    return changeStatusId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ChangeStatusName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    changeStatusId = Preconditions.checkNotNull(builder.getChangeStatusId());
  }

  public static ChangeStatusName of(String customerId, String changeStatusId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setChangeStatusId(changeStatusId)
      .build();
  }

  public static String format(String customerId, String changeStatusId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setChangeStatusId(changeStatusId)
      .build()
      .toString();
  }

  public static ChangeStatusName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ChangeStatusName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("change_status_id"));
  }

  public static List<ChangeStatusName> parseList(List<String> formattedStrings) {
    List<ChangeStatusName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ChangeStatusName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (ChangeStatusName value : values) {
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
          fieldMapBuilder.put("changeStatusId", changeStatusId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "change_status_id", changeStatusId);
  }

  /** Builder for ChangeStatusName. */
  public static class Builder {

    private String customerId;
    private String changeStatusId;

    public String getCustomerId() {
      return customerId;
    }

    public String getChangeStatusId() {
      return changeStatusId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setChangeStatusId(String changeStatusId) {
      this.changeStatusId = changeStatusId;
      return this;
    }

    private Builder() {
    }

    private Builder(ChangeStatusName changeStatusName) {
      customerId = changeStatusName.customerId;
      changeStatusId = changeStatusName.changeStatusId;
    }

    public ChangeStatusName build() {
      return new ChangeStatusName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ChangeStatusName) {
      ChangeStatusName that = (ChangeStatusName) o;
      return (this.customerId.equals(that.customerId))
          && (this.changeStatusId.equals(that.changeStatusId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= changeStatusId.hashCode();
    return h;
  }
}

