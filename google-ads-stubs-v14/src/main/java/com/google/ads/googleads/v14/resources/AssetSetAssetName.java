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
public class AssetSetAssetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ASSET_SET_ID_ASSET_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String assetSetId;
  private final String assetId;

  @Deprecated
  protected AssetSetAssetName() {
    customerId = null;
    assetSetId = null;
    assetId = null;
  }

  private AssetSetAssetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    assetSetId = Preconditions.checkNotNull(builder.getAssetSetId());
    assetId = Preconditions.checkNotNull(builder.getAssetId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAssetSetId() {
    return assetSetId;
  }

  public String getAssetId() {
    return assetId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AssetSetAssetName of(String customerId, String assetSetId, String assetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetSetId(assetSetId)
        .setAssetId(assetId)
        .build();
  }

  public static String format(String customerId, String assetSetId, String assetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetSetId(assetSetId)
        .setAssetId(assetId)
        .build()
        .toString();
  }

  public static AssetSetAssetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_ASSET_SET_ID_ASSET_ID.validatedMatch(
            formattedString, "AssetSetAssetName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("asset_set_id"), matchMap.get("asset_id"));
  }

  public static List<AssetSetAssetName> parseList(List<String> formattedStrings) {
    List<AssetSetAssetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AssetSetAssetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AssetSetAssetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_ASSET_SET_ID_ASSET_ID.matches(formattedString);
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
          if (assetSetId != null) {
            fieldMapBuilder.put("asset_set_id", assetSetId);
          }
          if (assetId != null) {
            fieldMapBuilder.put("asset_id", assetId);
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
    return CUSTOMER_ID_ASSET_SET_ID_ASSET_ID.instantiate(
        "customer_id", customerId, "asset_set_id", assetSetId, "asset_id", assetId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AssetSetAssetName that = ((AssetSetAssetName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.assetSetId, that.assetSetId)
          && Objects.equals(this.assetId, that.assetId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(assetSetId);
    h *= 1000003;
    h ^= Objects.hashCode(assetId);
    return h;
  }

  /** Builder for customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}. */
  public static class Builder {
    private String customerId;
    private String assetSetId;
    private String assetId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAssetSetId() {
      return assetSetId;
    }

    public String getAssetId() {
      return assetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAssetSetId(String assetSetId) {
      this.assetSetId = assetSetId;
      return this;
    }

    public Builder setAssetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    private Builder(AssetSetAssetName assetSetAssetName) {
      this.customerId = assetSetAssetName.customerId;
      this.assetSetId = assetSetAssetName.assetSetId;
      this.assetId = assetSetAssetName.assetId;
    }

    public AssetSetAssetName build() {
      return new AssetSetAssetName(this);
    }
  }
}
