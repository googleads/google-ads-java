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

package com.google.ads.googleads.v10.resources;

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
public class ProductGroupViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ADGROUP_ID_CRITERION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/productGroupViews/{adgroup_id}~{criterion_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adgroupId;
  private final String criterionId;

  @Deprecated
  protected ProductGroupViewName() {
    customerId = null;
    adgroupId = null;
    criterionId = null;
  }

  private ProductGroupViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adgroupId = Preconditions.checkNotNull(builder.getAdgroupId());
    criterionId = Preconditions.checkNotNull(builder.getCriterionId());
  }

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
        CUSTOMER_ID_ADGROUP_ID_CRITERION_ID.validatedMatch(
            formattedString, "ProductGroupViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("adgroup_id"), matchMap.get("criterion_id"));
  }

  public static List<ProductGroupViewName> parseList(List<String> formattedStrings) {
    List<ProductGroupViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ProductGroupViewName> values) {
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_ADGROUP_ID_CRITERION_ID.matches(formattedString);
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
          if (adgroupId != null) {
            fieldMapBuilder.put("adgroup_id", adgroupId);
          }
          if (criterionId != null) {
            fieldMapBuilder.put("criterion_id", criterionId);
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
    return CUSTOMER_ID_ADGROUP_ID_CRITERION_ID.instantiate(
        "customer_id", customerId, "adgroup_id", adgroupId, "criterion_id", criterionId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ProductGroupViewName that = ((ProductGroupViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adgroupId, that.adgroupId)
          && Objects.equals(this.criterionId, that.criterionId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(adgroupId);
    h *= 1000003;
    h ^= Objects.hashCode(criterionId);
    return h;
  }

  /** Builder for customers/{customer_id}/productGroupViews/{adgroup_id}~{criterion_id}. */
  public static class Builder {
    private String customerId;
    private String adgroupId;
    private String criterionId;

    protected Builder() {}

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

    private Builder(ProductGroupViewName productGroupViewName) {
      this.customerId = productGroupViewName.customerId;
      this.adgroupId = productGroupViewName.adgroupId;
      this.criterionId = productGroupViewName.criterionId;
    }

    public ProductGroupViewName build() {
      return new ProductGroupViewName(this);
    }
  }
}
