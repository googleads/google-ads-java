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
public class PaidOrganicSearchTermViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/paidOrganicSearchTermViews/{paid_organic_search_term_view}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String paidOrganicSearchTermView;

  public String getCustomer() {
    return customer;
  }

  public String getPaidOrganicSearchTermView() {
    return paidOrganicSearchTermView;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private PaidOrganicSearchTermViewName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    paidOrganicSearchTermView = Preconditions.checkNotNull(builder.getPaidOrganicSearchTermView());
  }

  public static PaidOrganicSearchTermViewName of(String customer, String paidOrganicSearchTermView) {
    return newBuilder()
      .setCustomer(customer)
      .setPaidOrganicSearchTermView(paidOrganicSearchTermView)
      .build();
  }

  public static String format(String customer, String paidOrganicSearchTermView) {
    return newBuilder()
      .setCustomer(customer)
      .setPaidOrganicSearchTermView(paidOrganicSearchTermView)
      .build()
      .toString();
  }

  public static PaidOrganicSearchTermViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "PaidOrganicSearchTermViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("paid_organic_search_term_view"));
  }

  public static List<PaidOrganicSearchTermViewName> parseList(List<String> formattedStrings) {
    List<PaidOrganicSearchTermViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<PaidOrganicSearchTermViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (PaidOrganicSearchTermViewName value : values) {
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
          fieldMapBuilder.put("paidOrganicSearchTermView", paidOrganicSearchTermView);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "paid_organic_search_term_view", paidOrganicSearchTermView);
  }

  /** Builder for PaidOrganicSearchTermViewName. */
  public static class Builder {

    private String customer;
    private String paidOrganicSearchTermView;

    public String getCustomer() {
      return customer;
    }

    public String getPaidOrganicSearchTermView() {
      return paidOrganicSearchTermView;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setPaidOrganicSearchTermView(String paidOrganicSearchTermView) {
      this.paidOrganicSearchTermView = paidOrganicSearchTermView;
      return this;
    }

    private Builder() {
    }

    private Builder(PaidOrganicSearchTermViewName paidOrganicSearchTermViewName) {
      customer = paidOrganicSearchTermViewName.customer;
      paidOrganicSearchTermView = paidOrganicSearchTermViewName.paidOrganicSearchTermView;
    }

    public PaidOrganicSearchTermViewName build() {
      return new PaidOrganicSearchTermViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PaidOrganicSearchTermViewName) {
      PaidOrganicSearchTermViewName that = (PaidOrganicSearchTermViewName) o;
      return (this.customer.equals(that.customer))
          && (this.paidOrganicSearchTermView.equals(that.paidOrganicSearchTermView));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= paidOrganicSearchTermView.hashCode();
    return h;
  }
}

