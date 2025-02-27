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

package com.google.ads.googleads.v19.resources;

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
public class AssetFieldTypeViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_FIELD_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/assetFieldTypeViews/{field_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String fieldType;

  @Deprecated
  protected AssetFieldTypeViewName() {
    customerId = null;
    fieldType = null;
  }

  private AssetFieldTypeViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    fieldType = Preconditions.checkNotNull(builder.getFieldType());
  }

  public String getCustomerId() {
    return customerId;
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

  public static AssetFieldTypeViewName of(String customerId, String fieldType) {
    return newBuilder().setCustomerId(customerId).setFieldType(fieldType).build();
  }

  public static String format(String customerId, String fieldType) {
    return newBuilder().setCustomerId(customerId).setFieldType(fieldType).build().toString();
  }

  public static AssetFieldTypeViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_FIELD_TYPE.validatedMatch(
            formattedString, "AssetFieldTypeViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("field_type"));
  }

  public static List<AssetFieldTypeViewName> parseList(List<String> formattedStrings) {
    List<AssetFieldTypeViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AssetFieldTypeViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AssetFieldTypeViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_FIELD_TYPE.matches(formattedString);
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
    return CUSTOMER_ID_FIELD_TYPE.instantiate("customer_id", customerId, "field_type", fieldType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AssetFieldTypeViewName that = ((AssetFieldTypeViewName) o);
      return Objects.equals(this.customerId, that.customerId)
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
    h ^= Objects.hashCode(fieldType);
    return h;
  }

  /** Builder for customers/{customer_id}/assetFieldTypeViews/{field_type}. */
  public static class Builder {
    private String customerId;
    private String fieldType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getFieldType() {
      return fieldType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setFieldType(String fieldType) {
      this.fieldType = fieldType;
      return this;
    }

    private Builder(AssetFieldTypeViewName assetFieldTypeViewName) {
      this.customerId = assetFieldTypeViewName.customerId;
      this.fieldType = assetFieldTypeViewName.fieldType;
    }

    public AssetFieldTypeViewName build() {
      return new AssetFieldTypeViewName(this);
    }
  }
}
