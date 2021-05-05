/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v7.resources;

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
public class ConversionActionName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CONVERSION_ACTION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/conversionActions/{conversion_action_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String conversionActionId;

  @Deprecated
  protected ConversionActionName() {
    customerId = null;
    conversionActionId = null;
  }

  private ConversionActionName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    conversionActionId = Preconditions.checkNotNull(builder.getConversionActionId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getConversionActionId() {
    return conversionActionId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ConversionActionName of(String customerId, String conversionActionId) {
    return newBuilder().setCustomerId(customerId).setConversionActionId(conversionActionId).build();
  }

  public static String format(String customerId, String conversionActionId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setConversionActionId(conversionActionId)
        .build()
        .toString();
  }

  public static ConversionActionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CONVERSION_ACTION_ID.validatedMatch(
            formattedString, "ConversionActionName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("conversion_action_id"));
  }

  public static List<ConversionActionName> parseList(List<String> formattedStrings) {
    List<ConversionActionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ConversionActionName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ConversionActionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CONVERSION_ACTION_ID.matches(formattedString);
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
          if (conversionActionId != null) {
            fieldMapBuilder.put("conversion_action_id", conversionActionId);
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
    return CUSTOMER_ID_CONVERSION_ACTION_ID.instantiate(
        "customer_id", customerId, "conversion_action_id", conversionActionId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ConversionActionName that = ((ConversionActionName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.conversionActionId, that.conversionActionId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(conversionActionId);
    return h;
  }

  /** Builder for customers/{customer_id}/conversionActions/{conversion_action_id}. */
  public static class Builder {
    private String customerId;
    private String conversionActionId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getConversionActionId() {
      return conversionActionId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setConversionActionId(String conversionActionId) {
      this.conversionActionId = conversionActionId;
      return this;
    }

    private Builder(ConversionActionName conversionActionName) {
      customerId = conversionActionName.customerId;
      conversionActionId = conversionActionName.conversionActionId;
    }

    public ConversionActionName build() {
      return new ConversionActionName(this);
    }
  }
}
