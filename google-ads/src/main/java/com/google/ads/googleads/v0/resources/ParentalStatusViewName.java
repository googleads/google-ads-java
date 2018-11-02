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

package com.google.ads.googleads.v0.resources;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ParentalStatusViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/parentalStatusViews/{parental_status_view}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String parentalStatusView;

  public String getCustomer() {
    return customer;
  }

  public String getParentalStatusView() {
    return parentalStatusView;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ParentalStatusViewName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    parentalStatusView = Preconditions.checkNotNull(builder.getParentalStatusView());
  }

  public static ParentalStatusViewName of(String customer, String parentalStatusView) {
    return newBuilder()
      .setCustomer(customer)
      .setParentalStatusView(parentalStatusView)
      .build();
  }

  public static String format(String customer, String parentalStatusView) {
    return newBuilder()
      .setCustomer(customer)
      .setParentalStatusView(parentalStatusView)
      .build()
      .toString();
  }

  public static ParentalStatusViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ParentalStatusViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("parental_status_view"));
  }

  public static List<ParentalStatusViewName> parseList(List<String> formattedStrings) {
    List<ParentalStatusViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ParentalStatusViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (ParentalStatusViewName value : values) {
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
          fieldMapBuilder.put("parentalStatusView", parentalStatusView);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "parental_status_view", parentalStatusView);
  }

  /** Builder for ParentalStatusViewName. */
  public static class Builder {

    private String customer;
    private String parentalStatusView;

    public String getCustomer() {
      return customer;
    }

    public String getParentalStatusView() {
      return parentalStatusView;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setParentalStatusView(String parentalStatusView) {
      this.parentalStatusView = parentalStatusView;
      return this;
    }

    private Builder() {
    }

    private Builder(ParentalStatusViewName parentalStatusViewName) {
      customer = parentalStatusViewName.customer;
      parentalStatusView = parentalStatusViewName.parentalStatusView;
    }

    public ParentalStatusViewName build() {
      return new ParentalStatusViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ParentalStatusViewName) {
      ParentalStatusViewName that = (ParentalStatusViewName) o;
      return (this.customer.equals(that.customer))
          && (this.parentalStatusView.equals(that.parentalStatusView));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= parentalStatusView.hashCode();
    return h;
  }
}

