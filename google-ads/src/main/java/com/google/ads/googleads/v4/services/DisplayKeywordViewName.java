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

package com.google.ads.googleads.v4.services;

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
public class DisplayKeywordViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/displayKeywordViews/{display_keyword_view}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String displayKeywordView;

  public String getCustomer() {
    return customer;
  }

  public String getDisplayKeywordView() {
    return displayKeywordView;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DisplayKeywordViewName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    displayKeywordView = Preconditions.checkNotNull(builder.getDisplayKeywordView());
  }

  public static DisplayKeywordViewName of(String customer, String displayKeywordView) {
    return newBuilder()
      .setCustomer(customer)
      .setDisplayKeywordView(displayKeywordView)
      .build();
  }

  public static String format(String customer, String displayKeywordView) {
    return newBuilder()
      .setCustomer(customer)
      .setDisplayKeywordView(displayKeywordView)
      .build()
      .toString();
  }

  public static DisplayKeywordViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DisplayKeywordViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("display_keyword_view"));
  }

  public static List<DisplayKeywordViewName> parseList(List<String> formattedStrings) {
    List<DisplayKeywordViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DisplayKeywordViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DisplayKeywordViewName value : values) {
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
          fieldMapBuilder.put("displayKeywordView", displayKeywordView);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "display_keyword_view", displayKeywordView);
  }

  /** Builder for DisplayKeywordViewName. */
  public static class Builder {

    private String customer;
    private String displayKeywordView;

    public String getCustomer() {
      return customer;
    }

    public String getDisplayKeywordView() {
      return displayKeywordView;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setDisplayKeywordView(String displayKeywordView) {
      this.displayKeywordView = displayKeywordView;
      return this;
    }

    private Builder() {
    }

    private Builder(DisplayKeywordViewName displayKeywordViewName) {
      customer = displayKeywordViewName.customer;
      displayKeywordView = displayKeywordViewName.displayKeywordView;
    }

    public DisplayKeywordViewName build() {
      return new DisplayKeywordViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DisplayKeywordViewName) {
      DisplayKeywordViewName that = (DisplayKeywordViewName) o;
      return (this.customer.equals(that.customer))
          && (this.displayKeywordView.equals(that.displayKeywordView));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= displayKeywordView.hashCode();
    return h;
  }
}

