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
public class ChannelAggregateAssetViewName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_ADVERTISING_CHANNEL_TYPE_ASSET_ID_ASSET_SOURCE_FIELD_TYPE =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/channelAggregateAssetViews/{advertising_channel_type}~{asset_id}~{asset_source}~{field_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String advertisingChannelType;
  private final String assetId;
  private final String assetSource;
  private final String fieldType;

  @Deprecated
  protected ChannelAggregateAssetViewName() {
    customerId = null;
    advertisingChannelType = null;
    assetId = null;
    assetSource = null;
    fieldType = null;
  }

  private ChannelAggregateAssetViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    advertisingChannelType = Preconditions.checkNotNull(builder.getAdvertisingChannelType());
    assetId = Preconditions.checkNotNull(builder.getAssetId());
    assetSource = Preconditions.checkNotNull(builder.getAssetSource());
    fieldType = Preconditions.checkNotNull(builder.getFieldType());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAdvertisingChannelType() {
    return advertisingChannelType;
  }

  public String getAssetId() {
    return assetId;
  }

  public String getAssetSource() {
    return assetSource;
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

  public static ChannelAggregateAssetViewName of(
      String customerId,
      String advertisingChannelType,
      String assetId,
      String assetSource,
      String fieldType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdvertisingChannelType(advertisingChannelType)
        .setAssetId(assetId)
        .setAssetSource(assetSource)
        .setFieldType(fieldType)
        .build();
  }

  public static String format(
      String customerId,
      String advertisingChannelType,
      String assetId,
      String assetSource,
      String fieldType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdvertisingChannelType(advertisingChannelType)
        .setAssetId(assetId)
        .setAssetSource(assetSource)
        .setFieldType(fieldType)
        .build()
        .toString();
  }

  public static ChannelAggregateAssetViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_ADVERTISING_CHANNEL_TYPE_ASSET_ID_ASSET_SOURCE_FIELD_TYPE.validatedMatch(
            formattedString,
            "ChannelAggregateAssetViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("advertising_channel_type"),
        matchMap.get("asset_id"),
        matchMap.get("asset_source"),
        matchMap.get("field_type"));
  }

  public static List<ChannelAggregateAssetViewName> parseList(List<String> formattedStrings) {
    List<ChannelAggregateAssetViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ChannelAggregateAssetViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ChannelAggregateAssetViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_ADVERTISING_CHANNEL_TYPE_ASSET_ID_ASSET_SOURCE_FIELD_TYPE.matches(
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
          if (advertisingChannelType != null) {
            fieldMapBuilder.put("advertising_channel_type", advertisingChannelType);
          }
          if (assetId != null) {
            fieldMapBuilder.put("asset_id", assetId);
          }
          if (assetSource != null) {
            fieldMapBuilder.put("asset_source", assetSource);
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
    return CUSTOMER_ID_ADVERTISING_CHANNEL_TYPE_ASSET_ID_ASSET_SOURCE_FIELD_TYPE.instantiate(
        "customer_id",
        customerId,
        "advertising_channel_type",
        advertisingChannelType,
        "asset_id",
        assetId,
        "asset_source",
        assetSource,
        "field_type",
        fieldType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ChannelAggregateAssetViewName that = ((ChannelAggregateAssetViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.advertisingChannelType, that.advertisingChannelType)
          && Objects.equals(this.assetId, that.assetId)
          && Objects.equals(this.assetSource, that.assetSource)
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
    h ^= Objects.hashCode(advertisingChannelType);
    h *= 1000003;
    h ^= Objects.hashCode(assetId);
    h *= 1000003;
    h ^= Objects.hashCode(assetSource);
    h *= 1000003;
    h ^= Objects.hashCode(fieldType);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/channelAggregateAssetViews/{advertising_channel_type}~{asset_id}~{asset_source}~{field_type}.
   */
  public static class Builder {
    private String customerId;
    private String advertisingChannelType;
    private String assetId;
    private String assetSource;
    private String fieldType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAdvertisingChannelType() {
      return advertisingChannelType;
    }

    public String getAssetId() {
      return assetId;
    }

    public String getAssetSource() {
      return assetSource;
    }

    public String getFieldType() {
      return fieldType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdvertisingChannelType(String advertisingChannelType) {
      this.advertisingChannelType = advertisingChannelType;
      return this;
    }

    public Builder setAssetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    public Builder setAssetSource(String assetSource) {
      this.assetSource = assetSource;
      return this;
    }

    public Builder setFieldType(String fieldType) {
      this.fieldType = fieldType;
      return this;
    }

    private Builder(ChannelAggregateAssetViewName channelAggregateAssetViewName) {
      this.customerId = channelAggregateAssetViewName.customerId;
      this.advertisingChannelType = channelAggregateAssetViewName.advertisingChannelType;
      this.assetId = channelAggregateAssetViewName.assetId;
      this.assetSource = channelAggregateAssetViewName.assetSource;
      this.fieldType = channelAggregateAssetViewName.fieldType;
    }

    public ChannelAggregateAssetViewName build() {
      return new ChannelAggregateAssetViewName(this);
    }
  }
}
