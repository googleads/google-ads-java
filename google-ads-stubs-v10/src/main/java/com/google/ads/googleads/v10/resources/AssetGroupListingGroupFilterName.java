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
public class AssetGroupListingGroupFilterName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ASSET_GROUP_ID_LISTING_GROUP_FILTER_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/assetGroupListingGroupFilters/{asset_group_id}~{listing_group_filter_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String assetGroupId;
  private final String listingGroupFilterId;

  @Deprecated
  protected AssetGroupListingGroupFilterName() {
    customerId = null;
    assetGroupId = null;
    listingGroupFilterId = null;
  }

  private AssetGroupListingGroupFilterName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    assetGroupId = Preconditions.checkNotNull(builder.getAssetGroupId());
    listingGroupFilterId = Preconditions.checkNotNull(builder.getListingGroupFilterId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAssetGroupId() {
    return assetGroupId;
  }

  public String getListingGroupFilterId() {
    return listingGroupFilterId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AssetGroupListingGroupFilterName of(
      String customerId, String assetGroupId, String listingGroupFilterId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetGroupId(assetGroupId)
        .setListingGroupFilterId(listingGroupFilterId)
        .build();
  }

  public static String format(String customerId, String assetGroupId, String listingGroupFilterId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetGroupId(assetGroupId)
        .setListingGroupFilterId(listingGroupFilterId)
        .build()
        .toString();
  }

  public static AssetGroupListingGroupFilterName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_ASSET_GROUP_ID_LISTING_GROUP_FILTER_ID.validatedMatch(
            formattedString,
            "AssetGroupListingGroupFilterName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("asset_group_id"),
        matchMap.get("listing_group_filter_id"));
  }

  public static List<AssetGroupListingGroupFilterName> parseList(List<String> formattedStrings) {
    List<AssetGroupListingGroupFilterName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AssetGroupListingGroupFilterName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AssetGroupListingGroupFilterName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_ASSET_GROUP_ID_LISTING_GROUP_FILTER_ID.matches(formattedString);
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
          if (listingGroupFilterId != null) {
            fieldMapBuilder.put("listing_group_filter_id", listingGroupFilterId);
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
    return CUSTOMER_ID_ASSET_GROUP_ID_LISTING_GROUP_FILTER_ID.instantiate(
        "customer_id",
        customerId,
        "asset_group_id",
        assetGroupId,
        "listing_group_filter_id",
        listingGroupFilterId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AssetGroupListingGroupFilterName that = ((AssetGroupListingGroupFilterName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.assetGroupId, that.assetGroupId)
          && Objects.equals(this.listingGroupFilterId, that.listingGroupFilterId);
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
    h ^= Objects.hashCode(listingGroupFilterId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/assetGroupListingGroupFilters/{asset_group_id}~{listing_group_filter_id}.
   */
  public static class Builder {
    private String customerId;
    private String assetGroupId;
    private String listingGroupFilterId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAssetGroupId() {
      return assetGroupId;
    }

    public String getListingGroupFilterId() {
      return listingGroupFilterId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAssetGroupId(String assetGroupId) {
      this.assetGroupId = assetGroupId;
      return this;
    }

    public Builder setListingGroupFilterId(String listingGroupFilterId) {
      this.listingGroupFilterId = listingGroupFilterId;
      return this;
    }

    private Builder(AssetGroupListingGroupFilterName assetGroupListingGroupFilterName) {
      this.customerId = assetGroupListingGroupFilterName.customerId;
      this.assetGroupId = assetGroupListingGroupFilterName.assetGroupId;
      this.listingGroupFilterId = assetGroupListingGroupFilterName.listingGroupFilterId;
    }

    public AssetGroupListingGroupFilterName build() {
      return new AssetGroupListingGroupFilterName(this);
    }
  }
}
