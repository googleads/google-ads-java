/*
 * Copyright 2023 Google LLC
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
public class AdGroupAdAssetCombinationViewName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_AD_GROUP_ID_AD_ID_ASSET_COMBINATION_ID_LOW_ASSET_COMBINATION_ID_HIGH =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/adGroupAdAssetCombinationViews/{ad_group_id}~{ad_id}~{asset_combination_id_low}~{asset_combination_id_high}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adGroupId;
  private final String adId;
  private final String assetCombinationIdLow;
  private final String assetCombinationIdHigh;

  @Deprecated
  protected AdGroupAdAssetCombinationViewName() {
    customerId = null;
    adGroupId = null;
    adId = null;
    assetCombinationIdLow = null;
    assetCombinationIdHigh = null;
  }

  private AdGroupAdAssetCombinationViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    adId = Preconditions.checkNotNull(builder.getAdId());
    assetCombinationIdLow = Preconditions.checkNotNull(builder.getAssetCombinationIdLow());
    assetCombinationIdHigh = Preconditions.checkNotNull(builder.getAssetCombinationIdHigh());
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

  public String getAssetCombinationIdLow() {
    return assetCombinationIdLow;
  }

  public String getAssetCombinationIdHigh() {
    return assetCombinationIdHigh;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AdGroupAdAssetCombinationViewName of(
      String customerId,
      String adGroupId,
      String adId,
      String assetCombinationIdLow,
      String assetCombinationIdHigh) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setAdId(adId)
        .setAssetCombinationIdLow(assetCombinationIdLow)
        .setAssetCombinationIdHigh(assetCombinationIdHigh)
        .build();
  }

  public static String format(
      String customerId,
      String adGroupId,
      String adId,
      String assetCombinationIdLow,
      String assetCombinationIdHigh) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setAdId(adId)
        .setAssetCombinationIdLow(assetCombinationIdLow)
        .setAssetCombinationIdHigh(assetCombinationIdHigh)
        .build()
        .toString();
  }

  public static AdGroupAdAssetCombinationViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_AD_GROUP_ID_AD_ID_ASSET_COMBINATION_ID_LOW_ASSET_COMBINATION_ID_HIGH
            .validatedMatch(
                formattedString,
                "AdGroupAdAssetCombinationViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("ad_group_id"),
        matchMap.get("ad_id"),
        matchMap.get("asset_combination_id_low"),
        matchMap.get("asset_combination_id_high"));
  }

  public static List<AdGroupAdAssetCombinationViewName> parseList(List<String> formattedStrings) {
    List<AdGroupAdAssetCombinationViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdGroupAdAssetCombinationViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AdGroupAdAssetCombinationViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_AD_GROUP_ID_AD_ID_ASSET_COMBINATION_ID_LOW_ASSET_COMBINATION_ID_HIGH.matches(
        formattedString);
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
          if (assetCombinationIdLow != null) {
            fieldMapBuilder.put("asset_combination_id_low", assetCombinationIdLow);
          }
          if (assetCombinationIdHigh != null) {
            fieldMapBuilder.put("asset_combination_id_high", assetCombinationIdHigh);
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
    return CUSTOMER_ID_AD_GROUP_ID_AD_ID_ASSET_COMBINATION_ID_LOW_ASSET_COMBINATION_ID_HIGH
        .instantiate(
            "customer_id",
            customerId,
            "ad_group_id",
            adGroupId,
            "ad_id",
            adId,
            "asset_combination_id_low",
            assetCombinationIdLow,
            "asset_combination_id_high",
            assetCombinationIdHigh);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AdGroupAdAssetCombinationViewName that = ((AdGroupAdAssetCombinationViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.adId, that.adId)
          && Objects.equals(this.assetCombinationIdLow, that.assetCombinationIdLow)
          && Objects.equals(this.assetCombinationIdHigh, that.assetCombinationIdHigh);
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
    h ^= Objects.hashCode(assetCombinationIdLow);
    h *= 1000003;
    h ^= Objects.hashCode(assetCombinationIdHigh);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/adGroupAdAssetCombinationViews/{ad_group_id}~{ad_id}~{asset_combination_id_low}~{asset_combination_id_high}.
   */
  public static class Builder {
    private String customerId;
    private String adGroupId;
    private String adId;
    private String assetCombinationIdLow;
    private String assetCombinationIdHigh;

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

    public String getAssetCombinationIdLow() {
      return assetCombinationIdLow;
    }

    public String getAssetCombinationIdHigh() {
      return assetCombinationIdHigh;
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

    public Builder setAssetCombinationIdLow(String assetCombinationIdLow) {
      this.assetCombinationIdLow = assetCombinationIdLow;
      return this;
    }

    public Builder setAssetCombinationIdHigh(String assetCombinationIdHigh) {
      this.assetCombinationIdHigh = assetCombinationIdHigh;
      return this;
    }

    private Builder(AdGroupAdAssetCombinationViewName adGroupAdAssetCombinationViewName) {
      this.customerId = adGroupAdAssetCombinationViewName.customerId;
      this.adGroupId = adGroupAdAssetCombinationViewName.adGroupId;
      this.adId = adGroupAdAssetCombinationViewName.adId;
      this.assetCombinationIdLow = adGroupAdAssetCombinationViewName.assetCombinationIdLow;
      this.assetCombinationIdHigh = adGroupAdAssetCombinationViewName.assetCombinationIdHigh;
    }

    public AdGroupAdAssetCombinationViewName build() {
      return new AdGroupAdAssetCombinationViewName(this);
    }
  }
}
