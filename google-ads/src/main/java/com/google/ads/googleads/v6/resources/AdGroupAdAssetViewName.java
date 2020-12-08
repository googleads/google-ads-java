/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.resources;

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
public class AdGroupAdAssetViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_AD_GROUP_ID_AD_ID_ASSET_ID_FIELD_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/adGroupAdAssetViews/{ad_group_id}~{ad_id}~{asset_id}~{field_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adGroupId;
  private final String adId;
  private final String assetId;
  private final String fieldType;

  @Deprecated
  protected AdGroupAdAssetViewName() {
    customerId = null;
    adGroupId = null;
    adId = null;
    assetId = null;
    fieldType = null;
  }

  private AdGroupAdAssetViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    adId = Preconditions.checkNotNull(builder.getAdId());
    assetId = Preconditions.checkNotNull(builder.getAssetId());
    fieldType = Preconditions.checkNotNull(builder.getFieldType());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getAdId() {
    return adId;
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

  public static AdGroupAdAssetViewName of(
      String customerId, String adGroupId, String adId, String assetId, String fieldType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setAdId(adId)
        .setAssetId(assetId)
        .setFieldType(fieldType)
        .build();
  }

  public static String format(
      String customerId, String adGroupId, String adId, String assetId, String fieldType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setAdId(adId)
        .setAssetId(assetId)
        .setFieldType(fieldType)
        .build()
        .toString();
  }

  public static AdGroupAdAssetViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_AD_GROUP_ID_AD_ID_ASSET_ID_FIELD_TYPE.validatedMatch(
            formattedString, "AdGroupAdAssetViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("ad_group_id"),
        matchMap.get("ad_id"),
        matchMap.get("asset_id"),
        matchMap.get("field_type"));
  }

  public static List<AdGroupAdAssetViewName> parseList(List<String> formattedStrings) {
    List<AdGroupAdAssetViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdGroupAdAssetViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AdGroupAdAssetViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_AD_GROUP_ID_AD_ID_ASSET_ID_FIELD_TYPE.matches(formattedString);
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
          if (adId != null) {
            fieldMapBuilder.put("ad_id", adId);
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
    return CUSTOMER_ID_AD_GROUP_ID_AD_ID_ASSET_ID_FIELD_TYPE.instantiate(
        "customer_id",
        customerId,
        "ad_group_id",
        adGroupId,
        "ad_id",
        adId,
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
      AdGroupAdAssetViewName that = ((AdGroupAdAssetViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.adId, that.adId)
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
    h ^= Objects.hashCode(adGroupId);
    h *= 1000003;
    h ^= Objects.hashCode(adId);
    h *= 1000003;
    h ^= Objects.hashCode(assetId);
    h *= 1000003;
    h ^= Objects.hashCode(fieldType);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/adGroupAdAssetViews/{ad_group_id}~{ad_id}~{asset_id}~{field_type}.
   */
  public static class Builder {
    private String customerId;
    private String adGroupId;
    private String adId;
    private String assetId;
    private String fieldType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getAdId() {
      return adId;
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

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setAdId(String adId) {
      this.adId = adId;
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

    private Builder(AdGroupAdAssetViewName adGroupAdAssetViewName) {
      customerId = adGroupAdAssetViewName.customerId;
      adGroupId = adGroupAdAssetViewName.adGroupId;
      adId = adGroupAdAssetViewName.adId;
      assetId = adGroupAdAssetViewName.assetId;
      fieldType = adGroupAdAssetViewName.fieldType;
    }

    public AdGroupAdAssetViewName build() {
      return new AdGroupAdAssetViewName(this);
    }
  }
}
