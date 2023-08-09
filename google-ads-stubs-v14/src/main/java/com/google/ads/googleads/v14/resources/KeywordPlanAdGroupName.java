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

package com.google.ads.googleads.v14.resources;

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
public class KeywordPlanAdGroupName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_KEYWORD_PLAN_AD_GROUP_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String keywordPlanAdGroupId;

  @Deprecated
  protected KeywordPlanAdGroupName() {
    customerId = null;
    keywordPlanAdGroupId = null;
  }

  private KeywordPlanAdGroupName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    keywordPlanAdGroupId = Preconditions.checkNotNull(builder.getKeywordPlanAdGroupId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getKeywordPlanAdGroupId() {
    return keywordPlanAdGroupId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static KeywordPlanAdGroupName of(String customerId, String keywordPlanAdGroupId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setKeywordPlanAdGroupId(keywordPlanAdGroupId)
        .build();
  }

  public static String format(String customerId, String keywordPlanAdGroupId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setKeywordPlanAdGroupId(keywordPlanAdGroupId)
        .build()
        .toString();
  }

  public static KeywordPlanAdGroupName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_KEYWORD_PLAN_AD_GROUP_ID.validatedMatch(
            formattedString, "KeywordPlanAdGroupName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("keyword_plan_ad_group_id"));
  }

  public static List<KeywordPlanAdGroupName> parseList(List<String> formattedStrings) {
    List<KeywordPlanAdGroupName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<KeywordPlanAdGroupName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (KeywordPlanAdGroupName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_KEYWORD_PLAN_AD_GROUP_ID.matches(formattedString);
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
          if (keywordPlanAdGroupId != null) {
            fieldMapBuilder.put("keyword_plan_ad_group_id", keywordPlanAdGroupId);
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
    return CUSTOMER_ID_KEYWORD_PLAN_AD_GROUP_ID.instantiate(
        "customer_id", customerId, "keyword_plan_ad_group_id", keywordPlanAdGroupId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      KeywordPlanAdGroupName that = ((KeywordPlanAdGroupName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.keywordPlanAdGroupId, that.keywordPlanAdGroupId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(keywordPlanAdGroupId);
    return h;
  }

  /** Builder for customers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}. */
  public static class Builder {
    private String customerId;
    private String keywordPlanAdGroupId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getKeywordPlanAdGroupId() {
      return keywordPlanAdGroupId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setKeywordPlanAdGroupId(String keywordPlanAdGroupId) {
      this.keywordPlanAdGroupId = keywordPlanAdGroupId;
      return this;
    }

    private Builder(KeywordPlanAdGroupName keywordPlanAdGroupName) {
      this.customerId = keywordPlanAdGroupName.customerId;
      this.keywordPlanAdGroupId = keywordPlanAdGroupName.keywordPlanAdGroupId;
    }

    public KeywordPlanAdGroupName build() {
      return new KeywordPlanAdGroupName(this);
    }
  }
}
