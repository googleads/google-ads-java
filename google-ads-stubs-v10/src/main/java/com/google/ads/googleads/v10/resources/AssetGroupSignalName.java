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
public class AssetGroupSignalName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ASSET_GROUP_ID_CRITERION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/assetGroupSignals/{asset_group_id}~{criterion_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String assetGroupId;
  private final String criterionId;

  @Deprecated
  protected AssetGroupSignalName() {
    customerId = null;
    assetGroupId = null;
    criterionId = null;
  }

  private AssetGroupSignalName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    assetGroupId = Preconditions.checkNotNull(builder.getAssetGroupId());
    criterionId = Preconditions.checkNotNull(builder.getCriterionId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAssetGroupId() {
    return assetGroupId;
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

  public static AssetGroupSignalName of(
      String customerId, String assetGroupId, String criterionId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetGroupId(assetGroupId)
        .setCriterionId(criterionId)
        .build();
  }

  public static String format(String customerId, String assetGroupId, String criterionId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetGroupId(assetGroupId)
        .setCriterionId(criterionId)
        .build()
        .toString();
  }

  public static AssetGroupSignalName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_ASSET_GROUP_ID_CRITERION_ID.validatedMatch(
            formattedString, "AssetGroupSignalName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("asset_group_id"), matchMap.get("criterion_id"));
  }

  public static List<AssetGroupSignalName> parseList(List<String> formattedStrings) {
    List<AssetGroupSignalName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AssetGroupSignalName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AssetGroupSignalName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_ASSET_GROUP_ID_CRITERION_ID.matches(formattedString);
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
          if (assetGroupId != null) {
            fieldMapBuilder.put("asset_group_id", assetGroupId);
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
    return CUSTOMER_ID_ASSET_GROUP_ID_CRITERION_ID.instantiate(
        "customer_id", customerId, "asset_group_id", assetGroupId, "criterion_id", criterionId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AssetGroupSignalName that = ((AssetGroupSignalName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.assetGroupId, that.assetGroupId)
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
    h ^= Objects.hashCode(assetGroupId);
    h *= 1000003;
    h ^= Objects.hashCode(criterionId);
    return h;
  }

  /** Builder for customers/{customer_id}/assetGroupSignals/{asset_group_id}~{criterion_id}. */
  public static class Builder {
    private String customerId;
    private String assetGroupId;
    private String criterionId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAssetGroupId() {
      return assetGroupId;
    }

    public String getCriterionId() {
      return criterionId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAssetGroupId(String assetGroupId) {
      this.assetGroupId = assetGroupId;
      return this;
    }

    public Builder setCriterionId(String criterionId) {
      this.criterionId = criterionId;
      return this;
    }

    private Builder(AssetGroupSignalName assetGroupSignalName) {
      this.customerId = assetGroupSignalName.customerId;
      this.assetGroupId = assetGroupSignalName.assetGroupId;
      this.criterionId = assetGroupSignalName.criterionId;
    }

    public AssetGroupSignalName build() {
      return new AssetGroupSignalName(this);
    }
  }
}
