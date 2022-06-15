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

package com.google.ads.googleads.v11.resources;

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
public class CustomerCustomizerName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CUSTOMIZER_ATTRIBUTE_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/customerCustomizers/{customizer_attribute_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String customizerAttributeId;

  @Deprecated
  protected CustomerCustomizerName() {
    customerId = null;
    customizerAttributeId = null;
  }

  private CustomerCustomizerName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    customizerAttributeId = Preconditions.checkNotNull(builder.getCustomizerAttributeId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCustomizerAttributeId() {
    return customizerAttributeId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CustomerCustomizerName of(String customerId, String customizerAttributeId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCustomizerAttributeId(customizerAttributeId)
        .build();
  }

  public static String format(String customerId, String customizerAttributeId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCustomizerAttributeId(customizerAttributeId)
        .build()
        .toString();
  }

  public static CustomerCustomizerName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CUSTOMIZER_ATTRIBUTE_ID.validatedMatch(
            formattedString, "CustomerCustomizerName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("customizer_attribute_id"));
  }

  public static List<CustomerCustomizerName> parseList(List<String> formattedStrings) {
    List<CustomerCustomizerName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerCustomizerName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerCustomizerName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CUSTOMIZER_ATTRIBUTE_ID.matches(formattedString);
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
          if (customizerAttributeId != null) {
            fieldMapBuilder.put("customizer_attribute_id", customizerAttributeId);
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
    return CUSTOMER_ID_CUSTOMIZER_ATTRIBUTE_ID.instantiate(
        "customer_id", customerId, "customizer_attribute_id", customizerAttributeId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CustomerCustomizerName that = ((CustomerCustomizerName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.customizerAttributeId, that.customizerAttributeId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(customizerAttributeId);
    return h;
  }

  /** Builder for customers/{customer_id}/customerCustomizers/{customizer_attribute_id}. */
  public static class Builder {
    private String customerId;
    private String customizerAttributeId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCustomizerAttributeId() {
      return customizerAttributeId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCustomizerAttributeId(String customizerAttributeId) {
      this.customizerAttributeId = customizerAttributeId;
      return this;
    }

    private Builder(CustomerCustomizerName customerCustomizerName) {
      this.customerId = customerCustomizerName.customerId;
      this.customizerAttributeId = customerCustomizerName.customizerAttributeId;
    }

    public CustomerCustomizerName build() {
      return new CustomerCustomizerName(this);
    }
  }
}
