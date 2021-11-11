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

package com.google.ads.googleads.v9.resources;

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
public class KeywordPlanAdGroupKeywordName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_KEYWORD_PLAN_AD_GROUP_KEYWORD_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String keywordPlanAdGroupKeywordId;

  @Deprecated
  protected KeywordPlanAdGroupKeywordName() {
    customerId = null;
    keywordPlanAdGroupKeywordId = null;
  }

  private KeywordPlanAdGroupKeywordName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    keywordPlanAdGroupKeywordId =
        Preconditions.checkNotNull(builder.getKeywordPlanAdGroupKeywordId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getKeywordPlanAdGroupKeywordId() {
    return keywordPlanAdGroupKeywordId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static KeywordPlanAdGroupKeywordName of(
      String customerId, String keywordPlanAdGroupKeywordId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setKeywordPlanAdGroupKeywordId(keywordPlanAdGroupKeywordId)
        .build();
  }

  public static String format(String customerId, String keywordPlanAdGroupKeywordId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setKeywordPlanAdGroupKeywordId(keywordPlanAdGroupKeywordId)
        .build()
        .toString();
  }

  public static KeywordPlanAdGroupKeywordName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_KEYWORD_PLAN_AD_GROUP_KEYWORD_ID.validatedMatch(
            formattedString,
            "KeywordPlanAdGroupKeywordName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("keyword_plan_ad_group_keyword_id"));
  }

  public static List<KeywordPlanAdGroupKeywordName> parseList(List<String> formattedStrings) {
    List<KeywordPlanAdGroupKeywordName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<KeywordPlanAdGroupKeywordName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (KeywordPlanAdGroupKeywordName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_KEYWORD_PLAN_AD_GROUP_KEYWORD_ID.matches(formattedString);
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
          if (keywordPlanAdGroupKeywordId != null) {
            fieldMapBuilder.put("keyword_plan_ad_group_keyword_id", keywordPlanAdGroupKeywordId);
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
    return CUSTOMER_ID_KEYWORD_PLAN_AD_GROUP_KEYWORD_ID.instantiate(
        "customer_id", customerId, "keyword_plan_ad_group_keyword_id", keywordPlanAdGroupKeywordId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      KeywordPlanAdGroupKeywordName that = ((KeywordPlanAdGroupKeywordName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.keywordPlanAdGroupKeywordId, that.keywordPlanAdGroupKeywordId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(keywordPlanAdGroupKeywordId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}.
   */
  public static class Builder {
    private String customerId;
    private String keywordPlanAdGroupKeywordId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getKeywordPlanAdGroupKeywordId() {
      return keywordPlanAdGroupKeywordId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setKeywordPlanAdGroupKeywordId(String keywordPlanAdGroupKeywordId) {
      this.keywordPlanAdGroupKeywordId = keywordPlanAdGroupKeywordId;
      return this;
    }

    private Builder(KeywordPlanAdGroupKeywordName keywordPlanAdGroupKeywordName) {
      this.customerId = keywordPlanAdGroupKeywordName.customerId;
      this.keywordPlanAdGroupKeywordId = keywordPlanAdGroupKeywordName.keywordPlanAdGroupKeywordId;
    }

    public KeywordPlanAdGroupKeywordName build() {
      return new KeywordPlanAdGroupKeywordName(this);
    }
  }
}
