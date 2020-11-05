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

package com.google.ads.googleads.v3.services;

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
public class AdScheduleViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/adScheduleViews/{ad_schedule_view}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String adScheduleView;

  public String getCustomer() {
    return customer;
  }

  public String getAdScheduleView() {
    return adScheduleView;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AdScheduleViewName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    adScheduleView = Preconditions.checkNotNull(builder.getAdScheduleView());
  }

  public static AdScheduleViewName of(String customer, String adScheduleView) {
    return newBuilder()
      .setCustomer(customer)
      .setAdScheduleView(adScheduleView)
      .build();
  }

  public static String format(String customer, String adScheduleView) {
    return newBuilder()
      .setCustomer(customer)
      .setAdScheduleView(adScheduleView)
      .build()
      .toString();
  }

  public static AdScheduleViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "AdScheduleViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("ad_schedule_view"));
  }

  public static List<AdScheduleViewName> parseList(List<String> formattedStrings) {
    List<AdScheduleViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdScheduleViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (AdScheduleViewName value : values) {
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
          fieldMapBuilder.put("adScheduleView", adScheduleView);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "ad_schedule_view", adScheduleView);
  }

  /** Builder for AdScheduleViewName. */
  public static class Builder {

    private String customer;
    private String adScheduleView;

    public String getCustomer() {
      return customer;
    }

    public String getAdScheduleView() {
      return adScheduleView;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setAdScheduleView(String adScheduleView) {
      this.adScheduleView = adScheduleView;
      return this;
    }

    private Builder() {
    }

    private Builder(AdScheduleViewName adScheduleViewName) {
      customer = adScheduleViewName.customer;
      adScheduleView = adScheduleViewName.adScheduleView;
    }

    public AdScheduleViewName build() {
      return new AdScheduleViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AdScheduleViewName) {
      AdScheduleViewName that = (AdScheduleViewName) o;
      return (this.customer.equals(that.customer))
          && (this.adScheduleView.equals(that.adScheduleView));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= adScheduleView.hashCode();
    return h;
  }
}

