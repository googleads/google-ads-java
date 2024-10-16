/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v18.resources;

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
public class AdParameterName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_AD_GROUP_ID_CRITERION_ID_PARAMETER_INDEX =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/adParameters/{ad_group_id}~{criterion_id}~{parameter_index}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adGroupId;
  private final String criterionId;
  private final String parameterIndex;

  @Deprecated
  protected AdParameterName() {
    customerId = null;
    adGroupId = null;
    criterionId = null;
    parameterIndex = null;
  }

  private AdParameterName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    criterionId = Preconditions.checkNotNull(builder.getCriterionId());
    parameterIndex = Preconditions.checkNotNull(builder.getParameterIndex());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getCriterionId() {
    return criterionId;
  }

  public String getParameterIndex() {
    return parameterIndex;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AdParameterName of(
      String customerId, String adGroupId, String criterionId, String parameterIndex) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setCriterionId(criterionId)
        .setParameterIndex(parameterIndex)
        .build();
  }

  public static String format(
      String customerId, String adGroupId, String criterionId, String parameterIndex) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setCriterionId(criterionId)
        .setParameterIndex(parameterIndex)
        .build()
        .toString();
  }

  public static AdParameterName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_AD_GROUP_ID_CRITERION_ID_PARAMETER_INDEX.validatedMatch(
            formattedString, "AdParameterName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("ad_group_id"),
        matchMap.get("criterion_id"),
        matchMap.get("parameter_index"));
  }

  public static List<AdParameterName> parseList(List<String> formattedStrings) {
    List<AdParameterName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdParameterName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AdParameterName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_AD_GROUP_ID_CRITERION_ID_PARAMETER_INDEX.matches(formattedString);
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
          if (adGroupId != null) {
            fieldMapBuilder.put("ad_group_id", adGroupId);
          }
          if (criterionId != null) {
            fieldMapBuilder.put("criterion_id", criterionId);
          }
          if (parameterIndex != null) {
            fieldMapBuilder.put("parameter_index", parameterIndex);
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
    return CUSTOMER_ID_AD_GROUP_ID_CRITERION_ID_PARAMETER_INDEX.instantiate(
        "customer_id",
        customerId,
        "ad_group_id",
        adGroupId,
        "criterion_id",
        criterionId,
        "parameter_index",
        parameterIndex);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AdParameterName that = ((AdParameterName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.criterionId, that.criterionId)
          && Objects.equals(this.parameterIndex, that.parameterIndex);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(adGroupId);
    h *= 1000003;
    h ^= Objects.hashCode(criterionId);
    h *= 1000003;
    h ^= Objects.hashCode(parameterIndex);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/adParameters/{ad_group_id}~{criterion_id}~{parameter_index}.
   */
  public static class Builder {
    private String customerId;
    private String adGroupId;
    private String criterionId;
    private String parameterIndex;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getCriterionId() {
      return criterionId;
    }

    public String getParameterIndex() {
      return parameterIndex;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setCriterionId(String criterionId) {
      this.criterionId = criterionId;
      return this;
    }

    public Builder setParameterIndex(String parameterIndex) {
      this.parameterIndex = parameterIndex;
      return this;
    }

    private Builder(AdParameterName adParameterName) {
      this.customerId = adParameterName.customerId;
      this.adGroupId = adParameterName.adGroupId;
      this.criterionId = adParameterName.criterionId;
      this.parameterIndex = adParameterName.parameterIndex;
    }

    public AdParameterName build() {
      return new AdParameterName(this);
    }
  }
}
