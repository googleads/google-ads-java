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
public class AdGroupAssetSetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_AD_GROUP_ID_ASSET_SET_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adGroupId;
  private final String assetSetId;

  @Deprecated
  protected AdGroupAssetSetName() {
    customerId = null;
    adGroupId = null;
    assetSetId = null;
  }

  private AdGroupAssetSetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    assetSetId = Preconditions.checkNotNull(builder.getAssetSetId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getAssetSetId() {
    return assetSetId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AdGroupAssetSetName of(String customerId, String adGroupId, String assetSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setAssetSetId(assetSetId)
        .build();
  }

  public static String format(String customerId, String adGroupId, String assetSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setAssetSetId(assetSetId)
        .build()
        .toString();
  }

  public static AdGroupAssetSetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_AD_GROUP_ID_ASSET_SET_ID.validatedMatch(
            formattedString, "AdGroupAssetSetName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("ad_group_id"), matchMap.get("asset_set_id"));
  }

  public static List<AdGroupAssetSetName> parseList(List<String> formattedStrings) {
    List<AdGroupAssetSetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdGroupAssetSetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AdGroupAssetSetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_AD_GROUP_ID_ASSET_SET_ID.matches(formattedString);
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
          if (assetSetId != null) {
            fieldMapBuilder.put("asset_set_id", assetSetId);
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
    return CUSTOMER_ID_AD_GROUP_ID_ASSET_SET_ID.instantiate(
        "customer_id", customerId, "ad_group_id", adGroupId, "asset_set_id", assetSetId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AdGroupAssetSetName that = ((AdGroupAssetSetName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.assetSetId, that.assetSetId);
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
    h ^= Objects.hashCode(assetSetId);
    return h;
  }

  /** Builder for customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}. */
  public static class Builder {
    private String customerId;
    private String adGroupId;
    private String assetSetId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getAssetSetId() {
      return assetSetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setAssetSetId(String assetSetId) {
      this.assetSetId = assetSetId;
      return this;
    }

    private Builder(AdGroupAssetSetName adGroupAssetSetName) {
      this.customerId = adGroupAssetSetName.customerId;
      this.adGroupId = adGroupAssetSetName.adGroupId;
      this.assetSetId = adGroupAssetSetName.assetSetId;
    }

    public AdGroupAssetSetName build() {
      return new AdGroupAssetSetName(this);
    }
  }
}
