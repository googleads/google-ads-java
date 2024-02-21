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

package com.google.ads.googleads.v15.resources;

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
public class AdGroupExtensionSettingName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_AD_GROUP_ID_EXTENSION_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/adGroupExtensionSettings/{ad_group_id}~{extension_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adGroupId;
  private final String extensionType;

  @Deprecated
  protected AdGroupExtensionSettingName() {
    customerId = null;
    adGroupId = null;
    extensionType = null;
  }

  private AdGroupExtensionSettingName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    extensionType = Preconditions.checkNotNull(builder.getExtensionType());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getExtensionType() {
    return extensionType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AdGroupExtensionSettingName of(
      String customerId, String adGroupId, String extensionType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setExtensionType(extensionType)
        .build();
  }

  public static String format(String customerId, String adGroupId, String extensionType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setExtensionType(extensionType)
        .build()
        .toString();
  }

  public static AdGroupExtensionSettingName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_AD_GROUP_ID_EXTENSION_TYPE.validatedMatch(
            formattedString,
            "AdGroupExtensionSettingName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("ad_group_id"), matchMap.get("extension_type"));
  }

  public static List<AdGroupExtensionSettingName> parseList(List<String> formattedStrings) {
    List<AdGroupExtensionSettingName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdGroupExtensionSettingName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AdGroupExtensionSettingName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_AD_GROUP_ID_EXTENSION_TYPE.matches(formattedString);
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
          if (extensionType != null) {
            fieldMapBuilder.put("extension_type", extensionType);
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
    return CUSTOMER_ID_AD_GROUP_ID_EXTENSION_TYPE.instantiate(
        "customer_id", customerId, "ad_group_id", adGroupId, "extension_type", extensionType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AdGroupExtensionSettingName that = ((AdGroupExtensionSettingName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.extensionType, that.extensionType);
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
    h ^= Objects.hashCode(extensionType);
    return h;
  }

  /**
   * Builder for customers/{customer_id}/adGroupExtensionSettings/{ad_group_id}~{extension_type}.
   */
  public static class Builder {
    private String customerId;
    private String adGroupId;
    private String extensionType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getExtensionType() {
      return extensionType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setExtensionType(String extensionType) {
      this.extensionType = extensionType;
      return this;
    }

    private Builder(AdGroupExtensionSettingName adGroupExtensionSettingName) {
      this.customerId = adGroupExtensionSettingName.customerId;
      this.adGroupId = adGroupExtensionSettingName.adGroupId;
      this.extensionType = adGroupExtensionSettingName.extensionType;
    }

    public AdGroupExtensionSettingName build() {
      return new AdGroupExtensionSettingName(this);
    }
  }
}
