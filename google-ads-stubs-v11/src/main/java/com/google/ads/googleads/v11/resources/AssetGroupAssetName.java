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
public class AssetGroupAssetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ASSET_GROUP_ID_ASSET_ID_FIELD_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/assetGroupAssets/{asset_group_id}~{asset_id}~{field_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String assetGroupId;
  private final String assetId;
  private final String fieldType;

  @Deprecated
  protected AssetGroupAssetName() {
    customerId = null;
    assetGroupId = null;
    assetId = null;
    fieldType = null;
  }

  private AssetGroupAssetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    assetGroupId = Preconditions.checkNotNull(builder.getAssetGroupId());
    assetId = Preconditions.checkNotNull(builder.getAssetId());
    fieldType = Preconditions.checkNotNull(builder.getFieldType());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAssetGroupId() {
    return assetGroupId;
  }

  public String getAssetId() {
    return assetId;
  }

  public String getFieldType() {
    return fieldType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AssetGroupAssetName of(
      String customerId, String assetGroupId, String assetId, String fieldType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetGroupId(assetGroupId)
        .setAssetId(assetId)
        .setFieldType(fieldType)
        .build();
  }

  public static String format(
      String customerId, String assetGroupId, String assetId, String fieldType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetGroupId(assetGroupId)
        .setAssetId(assetId)
        .setFieldType(fieldType)
        .build()
        .toString();
  }

  public static AssetGroupAssetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_ASSET_GROUP_ID_ASSET_ID_FIELD_TYPE.validatedMatch(
            formattedString, "AssetGroupAssetName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("asset_group_id"),
        matchMap.get("asset_id"),
        matchMap.get("field_type"));
  }

  public static List<AssetGroupAssetName> parseList(List<String> formattedStrings) {
    List<AssetGroupAssetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AssetGroupAssetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AssetGroupAssetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_ASSET_GROUP_ID_ASSET_ID_FIELD_TYPE.matches(formattedString);
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
          if (assetId != null) {
            fieldMapBuilder.put("asset_id", assetId);
          }
          if (fieldType != null) {
            fieldMapBuilder.put("field_type", fieldType);
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
    return CUSTOMER_ID_ASSET_GROUP_ID_ASSET_ID_FIELD_TYPE.instantiate(
        "customer_id",
        customerId,
        "asset_group_id",
        assetGroupId,
        "asset_id",
        assetId,
        "field_type",
        fieldType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AssetGroupAssetName that = ((AssetGroupAssetName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.assetGroupId, that.assetGroupId)
          && Objects.equals(this.assetId, that.assetId)
          && Objects.equals(this.fieldType, that.fieldType);
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
    h ^= Objects.hashCode(assetId);
    h *= 1000003;
    h ^= Objects.hashCode(fieldType);
    return h;
  }

  /**
   * Builder for customers/{customer_id}/assetGroupAssets/{asset_group_id}~{asset_id}~{field_type}.
   */
  public static class Builder {
    private String customerId;
    private String assetGroupId;
    private String assetId;
    private String fieldType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAssetGroupId() {
      return assetGroupId;
    }

    public String getAssetId() {
      return assetId;
    }

    public String getFieldType() {
      return fieldType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAssetGroupId(String assetGroupId) {
      this.assetGroupId = assetGroupId;
      return this;
    }

    public Builder setAssetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    public Builder setFieldType(String fieldType) {
      this.fieldType = fieldType;
      return this;
    }

    private Builder(AssetGroupAssetName assetGroupAssetName) {
      this.customerId = assetGroupAssetName.customerId;
      this.assetGroupId = assetGroupAssetName.assetGroupId;
      this.assetId = assetGroupAssetName.assetId;
      this.fieldType = assetGroupAssetName.fieldType;
    }

    public AssetGroupAssetName build() {
      return new AssetGroupAssetName(this);
    }
  }
}
