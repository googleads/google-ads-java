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
public class ProductGroupViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/productGroupViews/{adgroup_id}~{criterion_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String adgroupId;
  private final String criterionId;

  public String getCustomerId() {
    return customerId;
  }

  public String getAdgroupId() {
    return adgroupId;
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

  private ProductGroupViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adgroupId = Preconditions.checkNotNull(builder.getAdgroupId());
    criterionId = Preconditions.checkNotNull(builder.getCriterionId());
  }

  public static ProductGroupViewName of(String customerId, String adgroupId, String criterionId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAdgroupId(adgroupId)
      .setCriterionId(criterionId)
      .build();
  }

  public static String format(String customerId, String adgroupId, String criterionId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAdgroupId(adgroupId)
      .setCriterionId(criterionId)
      .build()
      .toString();
  }

  public static ProductGroupViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ProductGroupViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("adgroup_id"), matchMap.get("criterion_id"));
  }

  public static List<ProductGroupViewName> parseList(List<String> formattedStrings) {
    List<ProductGroupViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ProductGroupViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (ProductGroupViewName value : values) {
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
          fieldMapBuilder.put("adgroupId", adgroupId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "adgroup_id", adgroupId, "criterion_id", criterionId);
  }

  /** Builder for ProductGroupViewName. */
  public static class Builder {

    private String customerId;
    private String adgroupId;
    private String criterionId;

    public String getCustomerId() {
      return customerId;
    }

    public String getAdgroupId() {
      return adgroupId;
    }

    public String getCriterionId() {
      return criterionId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdgroupId(String adgroupId) {
      this.adgroupId = adgroupId;
      return this;
    }

    public Builder setCriterionId(String criterionId) {
      this.criterionId = criterionId;
      return this;
    }

    private Builder() {
    }

    private Builder(ProductGroupViewName productGroupViewName) {
      customerId = productGroupViewName.customerId;
      adgroupId = productGroupViewName.adgroupId;
      criterionId = productGroupViewName.criterionId;
    }

    public ProductGroupViewName build() {
      return new ProductGroupViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProductGroupViewName) {
      ProductGroupViewName that = (ProductGroupViewName) o;
      return (this.customerId.equals(that.customerId))
          && (this.adgroupId.equals(that.adgroupId))
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
    h ^= adgroupId.hashCode();
    h *= 1000003;
    h ^= criterionId.hashCode();
    return h;
  }
}

