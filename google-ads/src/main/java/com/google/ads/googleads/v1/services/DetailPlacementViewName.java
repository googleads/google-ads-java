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

package com.google.ads.googleads.v1.services;

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
public class DetailPlacementViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/detailPlacementViews/{detail_placement_view}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String detailPlacementView;

  public String getCustomer() {
    return customer;
  }

  public String getDetailPlacementView() {
    return detailPlacementView;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DetailPlacementViewName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    detailPlacementView = Preconditions.checkNotNull(builder.getDetailPlacementView());
  }

  public static DetailPlacementViewName of(String customer, String detailPlacementView) {
    return newBuilder()
      .setCustomer(customer)
      .setDetailPlacementView(detailPlacementView)
      .build();
  }

  public static String format(String customer, String detailPlacementView) {
    return newBuilder()
      .setCustomer(customer)
      .setDetailPlacementView(detailPlacementView)
      .build()
      .toString();
  }

  public static DetailPlacementViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DetailPlacementViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("detail_placement_view"));
  }

  public static List<DetailPlacementViewName> parseList(List<String> formattedStrings) {
    List<DetailPlacementViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DetailPlacementViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DetailPlacementViewName value : values) {
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
          fieldMapBuilder.put("detailPlacementView", detailPlacementView);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "detail_placement_view", detailPlacementView);
  }

  /** Builder for DetailPlacementViewName. */
  public static class Builder {

    private String customer;
    private String detailPlacementView;

    public String getCustomer() {
      return customer;
    }

    public String getDetailPlacementView() {
      return detailPlacementView;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setDetailPlacementView(String detailPlacementView) {
      this.detailPlacementView = detailPlacementView;
      return this;
    }

    private Builder() {
    }

    private Builder(DetailPlacementViewName detailPlacementViewName) {
      customer = detailPlacementViewName.customer;
      detailPlacementView = detailPlacementViewName.detailPlacementView;
    }

    public DetailPlacementViewName build() {
      return new DetailPlacementViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DetailPlacementViewName) {
      DetailPlacementViewName that = (DetailPlacementViewName) o;
      return (this.customer.equals(that.customer))
          && (this.detailPlacementView.equals(that.detailPlacementView));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= detailPlacementView.hashCode();
    return h;
  }
}

