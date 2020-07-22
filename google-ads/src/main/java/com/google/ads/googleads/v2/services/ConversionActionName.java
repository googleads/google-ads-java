/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ads.googleads.v2.services;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED DOCUMENTATION AND CLASS
 */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ConversionActionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/conversionActions/{conversion_action}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String conversionAction;

  public String getCustomer() {
    return customer;
  }

  public String getConversionAction() {
    return conversionAction;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ConversionActionName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    conversionAction = Preconditions.checkNotNull(builder.getConversionAction());
  }

  public static ConversionActionName of(String customer, String conversionAction) {
    return newBuilder()
      .setCustomer(customer)
      .setConversionAction(conversionAction)
      .build();
  }

  public static String format(String customer, String conversionAction) {
    return newBuilder()
      .setCustomer(customer)
      .setConversionAction(conversionAction)
      .build()
      .toString();
  }

  public static ConversionActionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ConversionActionName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("conversion_action"));
  }

  public static List<ConversionActionName> parseList(List<String> formattedStrings) {
    List<ConversionActionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ConversionActionName> values) {
    List<String> list = new ArrayList<String>(values.size());
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
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customer", customer);
          fieldMapBuilder.put("conversionAction", conversionAction);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "conversion_action", conversionAction);
  }

  /** Builder for ConversionActionName. */
  public static class Builder {

    private String customer;
    private String conversionAction;

    public String getCustomer() {
      return customer;
    }

    public String getConversionAction() {
      return conversionAction;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setConversionAction(String conversionAction) {
      this.conversionAction = conversionAction;
      return this;
    }

    private Builder() {
    }

    private Builder(ConversionActionName conversionActionName) {
      customer = conversionActionName.customer;
      conversionAction = conversionActionName.conversionAction;
    }

    public ConversionActionName build() {
      return new ConversionActionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ConversionActionName) {
      ConversionActionName that = (ConversionActionName) o;
      return (this.customer.equals(that.customer))
          && (this.conversionAction.equals(that.conversionAction));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= conversionAction.hashCode();
    return h;
  }
}

