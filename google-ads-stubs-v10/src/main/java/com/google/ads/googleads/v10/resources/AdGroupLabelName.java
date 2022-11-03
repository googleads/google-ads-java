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
public class AdGroupLabelName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_AD_GROUP_ID_LABEL_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adGroupId;
  private final String labelId;

  @Deprecated
  protected AdGroupLabelName() {
    customerId = null;
    adGroupId = null;
    labelId = null;
  }

  private AdGroupLabelName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    labelId = Preconditions.checkNotNull(builder.getLabelId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getLabelId() {
    return labelId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AdGroupLabelName of(String customerId, String adGroupId, String labelId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setLabelId(labelId)
        .build();
  }

  public static String format(String customerId, String adGroupId, String labelId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setLabelId(labelId)
        .build()
        .toString();
  }

  public static AdGroupLabelName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_AD_GROUP_ID_LABEL_ID.validatedMatch(
            formattedString, "AdGroupLabelName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("ad_group_id"), matchMap.get("label_id"));
  }

  public static List<AdGroupLabelName> parseList(List<String> formattedStrings) {
    List<AdGroupLabelName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdGroupLabelName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AdGroupLabelName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_AD_GROUP_ID_LABEL_ID.matches(formattedString);
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
          if (labelId != null) {
            fieldMapBuilder.put("label_id", labelId);
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
    return CUSTOMER_ID_AD_GROUP_ID_LABEL_ID.instantiate(
        "customer_id", customerId, "ad_group_id", adGroupId, "label_id", labelId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AdGroupLabelName that = ((AdGroupLabelName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.labelId, that.labelId);
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
    h ^= Objects.hashCode(labelId);
    return h;
  }

  /** Builder for customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}. */
  public static class Builder {
    private String customerId;
    private String adGroupId;
    private String labelId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getLabelId() {
      return labelId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setLabelId(String labelId) {
      this.labelId = labelId;
      return this;
    }

    private Builder(AdGroupLabelName adGroupLabelName) {
      this.customerId = adGroupLabelName.customerId;
      this.adGroupId = adGroupLabelName.adGroupId;
      this.labelId = adGroupLabelName.labelId;
    }

    public AdGroupLabelName build() {
      return new AdGroupLabelName(this);
    }
  }
}
