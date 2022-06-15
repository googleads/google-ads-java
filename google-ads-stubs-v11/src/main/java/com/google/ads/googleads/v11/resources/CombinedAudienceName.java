/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v11.resources;

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
public class CombinedAudienceName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_COMBINED_AUDIENCE_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/combinedAudiences/{combined_audience_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String combinedAudienceId;

  @Deprecated
  protected CombinedAudienceName() {
    customerId = null;
    combinedAudienceId = null;
  }

  private CombinedAudienceName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    combinedAudienceId = Preconditions.checkNotNull(builder.getCombinedAudienceId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCombinedAudienceId() {
    return combinedAudienceId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CombinedAudienceName of(String customerId, String combinedAudienceId) {
    return newBuilder().setCustomerId(customerId).setCombinedAudienceId(combinedAudienceId).build();
  }

  public static String format(String customerId, String combinedAudienceId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCombinedAudienceId(combinedAudienceId)
        .build()
        .toString();
  }

  public static CombinedAudienceName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_COMBINED_AUDIENCE_ID.validatedMatch(
            formattedString, "CombinedAudienceName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("combined_audience_id"));
  }

  public static List<CombinedAudienceName> parseList(List<String> formattedStrings) {
    List<CombinedAudienceName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CombinedAudienceName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CombinedAudienceName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_COMBINED_AUDIENCE_ID.matches(formattedString);
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
          if (combinedAudienceId != null) {
            fieldMapBuilder.put("combined_audience_id", combinedAudienceId);
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
    return CUSTOMER_ID_COMBINED_AUDIENCE_ID.instantiate(
        "customer_id", customerId, "combined_audience_id", combinedAudienceId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CombinedAudienceName that = ((CombinedAudienceName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.combinedAudienceId, that.combinedAudienceId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(combinedAudienceId);
    return h;
  }

  /** Builder for customers/{customer_id}/combinedAudiences/{combined_audience_id}. */
  public static class Builder {
    private String customerId;
    private String combinedAudienceId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCombinedAudienceId() {
      return combinedAudienceId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCombinedAudienceId(String combinedAudienceId) {
      this.combinedAudienceId = combinedAudienceId;
      return this;
    }

    private Builder(CombinedAudienceName combinedAudienceName) {
      this.customerId = combinedAudienceName.customerId;
      this.combinedAudienceId = combinedAudienceName.combinedAudienceId;
    }

    public CombinedAudienceName build() {
      return new CombinedAudienceName(this);
    }
  }
}
