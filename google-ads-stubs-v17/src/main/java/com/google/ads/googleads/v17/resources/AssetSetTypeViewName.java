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

package com.google.ads.googleads.v17.resources;

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
public class AssetSetTypeViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ASSET_SET_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/assetSetTypeViews/{asset_set_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String assetSetType;

  @Deprecated
  protected AssetSetTypeViewName() {
    customerId = null;
    assetSetType = null;
  }

  private AssetSetTypeViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    assetSetType = Preconditions.checkNotNull(builder.getAssetSetType());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAssetSetType() {
    return assetSetType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AssetSetTypeViewName of(String customerId, String assetSetType) {
    return newBuilder().setCustomerId(customerId).setAssetSetType(assetSetType).build();
  }

  public static String format(String customerId, String assetSetType) {
    return newBuilder().setCustomerId(customerId).setAssetSetType(assetSetType).build().toString();
  }

  public static AssetSetTypeViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_ASSET_SET_TYPE.validatedMatch(
            formattedString, "AssetSetTypeViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("asset_set_type"));
  }

  public static List<AssetSetTypeViewName> parseList(List<String> formattedStrings) {
    List<AssetSetTypeViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AssetSetTypeViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AssetSetTypeViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_ASSET_SET_TYPE.matches(formattedString);
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
          if (assetSetType != null) {
            fieldMapBuilder.put("asset_set_type", assetSetType);
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
    return CUSTOMER_ID_ASSET_SET_TYPE.instantiate(
        "customer_id", customerId, "asset_set_type", assetSetType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AssetSetTypeViewName that = ((AssetSetTypeViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.assetSetType, that.assetSetType);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(assetSetType);
    return h;
  }

  /** Builder for customers/{customer_id}/assetSetTypeViews/{asset_set_type}. */
  public static class Builder {
    private String customerId;
    private String assetSetType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAssetSetType() {
      return assetSetType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAssetSetType(String assetSetType) {
      this.assetSetType = assetSetType;
      return this;
    }

    private Builder(AssetSetTypeViewName assetSetTypeViewName) {
      this.customerId = assetSetTypeViewName.customerId;
      this.assetSetType = assetSetTypeViewName.assetSetType;
    }

    public AssetSetTypeViewName build() {
      return new AssetSetTypeViewName(this);
    }
  }
}
