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
public class GenderViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/genderViews/{gender_view}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String genderView;

  public String getCustomer() {
    return customer;
  }

  public String getGenderView() {
    return genderView;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private GenderViewName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    genderView = Preconditions.checkNotNull(builder.getGenderView());
  }

  public static GenderViewName of(String customer, String genderView) {
    return newBuilder()
      .setCustomer(customer)
      .setGenderView(genderView)
      .build();
  }

  public static String format(String customer, String genderView) {
    return newBuilder()
      .setCustomer(customer)
      .setGenderView(genderView)
      .build()
      .toString();
  }

  public static GenderViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "GenderViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("gender_view"));
  }

  public static List<GenderViewName> parseList(List<String> formattedStrings) {
    List<GenderViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<GenderViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (GenderViewName value : values) {
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
          fieldMapBuilder.put("genderView", genderView);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "gender_view", genderView);
  }

  /** Builder for GenderViewName. */
  public static class Builder {

    private String customer;
    private String genderView;

    public String getCustomer() {
      return customer;
    }

    public String getGenderView() {
      return genderView;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setGenderView(String genderView) {
      this.genderView = genderView;
      return this;
    }

    private Builder() {
    }

    private Builder(GenderViewName genderViewName) {
      customer = genderViewName.customer;
      genderView = genderViewName.genderView;
    }

    public GenderViewName build() {
      return new GenderViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenderViewName) {
      GenderViewName that = (GenderViewName) o;
      return (this.customer.equals(that.customer))
          && (this.genderView.equals(that.genderView));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= genderView.hashCode();
    return h;
  }
}

