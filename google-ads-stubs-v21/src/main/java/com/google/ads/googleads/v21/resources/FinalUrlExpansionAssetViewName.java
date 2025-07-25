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
public class FinalUrlExpansionAssetViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_ID_ASSET_ID_FIELD_TYPE_URL_FP =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/finalUrlExpansionAssetViews/{campaign_id}~{asset_id}~{field_type}~{url_fp}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String assetId;
  private final String fieldType;
  private final String urlFp;

  @Deprecated
  protected FinalUrlExpansionAssetViewName() {
    customerId = null;
    campaignId = null;
    assetId = null;
    fieldType = null;
    urlFp = null;
  }

  private FinalUrlExpansionAssetViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    assetId = Preconditions.checkNotNull(builder.getAssetId());
    fieldType = Preconditions.checkNotNull(builder.getFieldType());
    urlFp = Preconditions.checkNotNull(builder.getUrlFp());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getAssetId() {
    return assetId;
  }

  public String getFieldType() {
    return fieldType;
  }

  public String getUrlFp() {
    return urlFp;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static FinalUrlExpansionAssetViewName of(
      String customerId, String campaignId, String assetId, String fieldType, String urlFp) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setAssetId(assetId)
        .setFieldType(fieldType)
        .setUrlFp(urlFp)
        .build();
  }

  public static String format(
      String customerId, String campaignId, String assetId, String fieldType, String urlFp) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setAssetId(assetId)
        .setFieldType(fieldType)
        .setUrlFp(urlFp)
        .build()
        .toString();
  }

  public static FinalUrlExpansionAssetViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_ASSET_ID_FIELD_TYPE_URL_FP.validatedMatch(
            formattedString,
            "FinalUrlExpansionAssetViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("campaign_id"),
        matchMap.get("asset_id"),
        matchMap.get("field_type"),
        matchMap.get("url_fp"));
  }

  public static List<FinalUrlExpansionAssetViewName> parseList(List<String> formattedStrings) {
    List<FinalUrlExpansionAssetViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<FinalUrlExpansionAssetViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (FinalUrlExpansionAssetViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_ASSET_ID_FIELD_TYPE_URL_FP.matches(formattedString);
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
          if (campaignId != null) {
            fieldMapBuilder.put("campaign_id", campaignId);
          }
          if (assetId != null) {
            fieldMapBuilder.put("asset_id", assetId);
          }
          if (fieldType != null) {
            fieldMapBuilder.put("field_type", fieldType);
          }
          if (urlFp != null) {
            fieldMapBuilder.put("url_fp", urlFp);
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
    return CUSTOMER_ID_CAMPAIGN_ID_ASSET_ID_FIELD_TYPE_URL_FP.instantiate(
        "customer_id",
        customerId,
        "campaign_id",
        campaignId,
        "asset_id",
        assetId,
        "field_type",
        fieldType,
        "url_fp",
        urlFp);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      FinalUrlExpansionAssetViewName that = ((FinalUrlExpansionAssetViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.assetId, that.assetId)
          && Objects.equals(this.fieldType, that.fieldType)
          && Objects.equals(this.urlFp, that.urlFp);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(campaignId);
    h *= 1000003;
    h ^= Objects.hashCode(assetId);
    h *= 1000003;
    h ^= Objects.hashCode(fieldType);
    h *= 1000003;
    h ^= Objects.hashCode(urlFp);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/finalUrlExpansionAssetViews/{campaign_id}~{asset_id}~{field_type}~{url_fp}.
   */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String assetId;
    private String fieldType;
    private String urlFp;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getAssetId() {
      return assetId;
    }

    public String getFieldType() {
      return fieldType;
    }

    public String getUrlFp() {
      return urlFp;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
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

    public Builder setUrlFp(String urlFp) {
      this.urlFp = urlFp;
      return this;
    }

    private Builder(FinalUrlExpansionAssetViewName finalUrlExpansionAssetViewName) {
      this.customerId = finalUrlExpansionAssetViewName.customerId;
      this.campaignId = finalUrlExpansionAssetViewName.campaignId;
      this.assetId = finalUrlExpansionAssetViewName.assetId;
      this.fieldType = finalUrlExpansionAssetViewName.fieldType;
      this.urlFp = finalUrlExpansionAssetViewName.urlFp;
    }

    public FinalUrlExpansionAssetViewName build() {
      return new FinalUrlExpansionAssetViewName(this);
    }
  }
}
