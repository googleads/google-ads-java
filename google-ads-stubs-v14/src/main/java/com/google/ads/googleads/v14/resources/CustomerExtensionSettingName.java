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
public class CustomerExtensionSettingName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_EXTENSION_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/customerExtensionSettings/{extension_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String extensionType;

  @Deprecated
  protected CustomerExtensionSettingName() {
    customerId = null;
    extensionType = null;
  }

  private CustomerExtensionSettingName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    extensionType = Preconditions.checkNotNull(builder.getExtensionType());
  }

  public String getCustomerId() {
    return customerId;
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

  public static CustomerExtensionSettingName of(String customerId, String extensionType) {
    return newBuilder().setCustomerId(customerId).setExtensionType(extensionType).build();
  }

  public static String format(String customerId, String extensionType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setExtensionType(extensionType)
        .build()
        .toString();
  }

  public static CustomerExtensionSettingName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_EXTENSION_TYPE.validatedMatch(
            formattedString,
            "CustomerExtensionSettingName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("extension_type"));
  }

  public static List<CustomerExtensionSettingName> parseList(List<String> formattedStrings) {
    List<CustomerExtensionSettingName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerExtensionSettingName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerExtensionSettingName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_EXTENSION_TYPE.matches(formattedString);
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
    return CUSTOMER_ID_EXTENSION_TYPE.instantiate(
        "customer_id", customerId, "extension_type", extensionType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CustomerExtensionSettingName that = ((CustomerExtensionSettingName) o);
      return Objects.equals(this.customerId, that.customerId)
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
    h ^= Objects.hashCode(extensionType);
    return h;
  }

  /** Builder for customers/{customer_id}/customerExtensionSettings/{extension_type}. */
  public static class Builder {
    private String customerId;
    private String extensionType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getExtensionType() {
      return extensionType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setExtensionType(String extensionType) {
      this.extensionType = extensionType;
      return this;
    }

    private Builder(CustomerExtensionSettingName customerExtensionSettingName) {
      this.customerId = customerExtensionSettingName.customerId;
      this.extensionType = customerExtensionSettingName.extensionType;
    }

    public CustomerExtensionSettingName build() {
      return new CustomerExtensionSettingName(this);
    }
  }
}
