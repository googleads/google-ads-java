/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v21.resources;

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
public class AssetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ASSET_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/assets/{asset_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String assetId;

  @Deprecated
  protected AssetName() {
    customerId = null;
    assetId = null;
  }

  private AssetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    assetId = Preconditions.checkNotNull(builder.getAssetId());
  }

  public String getCustomerId() {
    return customerId;
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

  public static AssetName of(String customerId, String assetId) {
    return newBuilder().setCustomerId(customerId).setAssetId(assetId).build();
  }

  public static String format(String customerId, String assetId) {
    return newBuilder().setCustomerId(customerId).setAssetId(assetId).build().toString();
  }

  public static AssetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_ASSET_ID.validatedMatch(
            formattedString, "AssetName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("asset_id"));
  }

  public static List<AssetName> parseList(List<String> formattedStrings) {
    List<AssetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AssetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AssetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_ASSET_ID.matches(formattedString);
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
    return CUSTOMER_ID_ASSET_ID.instantiate("customer_id", customerId, "asset_id", assetId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AssetName that = ((AssetName) o);
      return Objects.equals(this.customerId, that.customerId)
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
    h ^= Objects.hashCode(assetId);
    return h;
  }

  /** Builder for customers/{customer_id}/assets/{asset_id}. */
  public static class Builder {
    private String customerId;
    private String assetId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAssetId() {
      return assetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAssetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    private Builder(AssetName assetName) {
      this.customerId = assetName.customerId;
      this.assetId = assetName.assetId;
    }

    public AssetName build() {
      return new AssetName(this);
    }
  }
}
