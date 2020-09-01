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

package com.google.ads.googleads.v5.services;

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
public class AdParameterName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/adParameters/{ad_parameter}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String adParameter;

  public String getCustomer() {
    return customer;
  }

  public String getAdParameter() {
    return adParameter;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AdParameterName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    adParameter = Preconditions.checkNotNull(builder.getAdParameter());
  }

  public static AdParameterName of(String customer, String adParameter) {
    return newBuilder()
      .setCustomer(customer)
      .setAdParameter(adParameter)
      .build();
  }

  public static String format(String customer, String adParameter) {
    return newBuilder()
      .setCustomer(customer)
      .setAdParameter(adParameter)
      .build()
      .toString();
  }

  public static AdParameterName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "AdParameterName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("ad_parameter"));
  }

  public static List<AdParameterName> parseList(List<String> formattedStrings) {
    List<AdParameterName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdParameterName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (AdParameterName value : values) {
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
          fieldMapBuilder.put("adParameter", adParameter);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "ad_parameter", adParameter);
  }

  /** Builder for AdParameterName. */
  public static class Builder {

    private String customer;
    private String adParameter;

    public String getCustomer() {
      return customer;
    }

    public String getAdParameter() {
      return adParameter;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setAdParameter(String adParameter) {
      this.adParameter = adParameter;
      return this;
    }

    private Builder() {
    }

    private Builder(AdParameterName adParameterName) {
      customer = adParameterName.customer;
      adParameter = adParameterName.adParameter;
    }

    public AdParameterName build() {
      return new AdParameterName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AdParameterName) {
      AdParameterName that = (AdParameterName) o;
      return (this.customer.equals(that.customer))
          && (this.adParameter.equals(that.adParameter));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= adParameter.hashCode();
    return h;
  }
}

