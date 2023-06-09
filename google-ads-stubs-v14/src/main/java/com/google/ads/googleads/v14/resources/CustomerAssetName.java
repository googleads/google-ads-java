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
public class CustomerAssetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ASSET_ID_FIELD_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/customerAssets/{asset_id}~{field_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String assetId;
  private final String fieldType;

  @Deprecated
  protected CustomerAssetName() {
    customerId = null;
    assetId = null;
    fieldType = null;
  }

  private CustomerAssetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    assetId = Preconditions.checkNotNull(builder.getAssetId());
    fieldType = Preconditions.checkNotNull(builder.getFieldType());
  }

  public String getCustomerId() {
    return customerId;
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

  public static CustomerAssetName of(String customerId, String assetId, String fieldType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetId(assetId)
        .setFieldType(fieldType)
        .build();
  }

  public static String format(String customerId, String assetId, String fieldType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAssetId(assetId)
        .setFieldType(fieldType)
        .build()
        .toString();
  }

  public static CustomerAssetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_ASSET_ID_FIELD_TYPE.validatedMatch(
            formattedString, "CustomerAssetName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("asset_id"), matchMap.get("field_type"));
  }

  public static List<CustomerAssetName> parseList(List<String> formattedStrings) {
    List<CustomerAssetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerAssetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerAssetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_ASSET_ID_FIELD_TYPE.matches(formattedString);
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
    return CUSTOMER_ID_ASSET_ID_FIELD_TYPE.instantiate(
        "customer_id", customerId, "asset_id", assetId, "field_type", fieldType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CustomerAssetName that = ((CustomerAssetName) o);
      return Objects.equals(this.customerId, that.customerId)
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
    h ^= Objects.hashCode(assetId);
    h *= 1000003;
    h ^= Objects.hashCode(fieldType);
    return h;
  }

  /** Builder for customers/{customer_id}/customerAssets/{asset_id}~{field_type}. */
  public static class Builder {
    private String customerId;
    private String assetId;
    private String fieldType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
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

    public Builder setAssetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    public Builder setFieldType(String fieldType) {
      this.fieldType = fieldType;
      return this;
    }

    private Builder(CustomerAssetName customerAssetName) {
      this.customerId = customerAssetName.customerId;
      this.assetId = customerAssetName.assetId;
      this.fieldType = customerAssetName.fieldType;
    }

    public CustomerAssetName build() {
      return new CustomerAssetName(this);
    }
  }
}
