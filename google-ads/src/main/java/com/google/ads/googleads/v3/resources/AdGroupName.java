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

package com.google.ads.googleads.v3.resources;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class AdGroupName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/adGroups/{ad_group}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String adGroup;

  public String getCustomer() {
    return customer;
  }

  public String getAdGroup() {
    return adGroup;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AdGroupName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    adGroup = Preconditions.checkNotNull(builder.getAdGroup());
  }

  public static AdGroupName of(String customer, String adGroup) {
    return newBuilder()
      .setCustomer(customer)
      .setAdGroup(adGroup)
      .build();
  }

  public static String format(String customer, String adGroup) {
    return newBuilder()
      .setCustomer(customer)
      .setAdGroup(adGroup)
      .build()
      .toString();
  }

  public static AdGroupName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "AdGroupName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("ad_group"));
  }

  public static List<AdGroupName> parseList(List<String> formattedStrings) {
    List<AdGroupName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdGroupName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (AdGroupName value : values) {
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
          fieldMapBuilder.put("adGroup", adGroup);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "ad_group", adGroup);
  }

  /** Builder for AdGroupName. */
  public static class Builder {

    private String customer;
    private String adGroup;

    public String getCustomer() {
      return customer;
    }

    public String getAdGroup() {
      return adGroup;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setAdGroup(String adGroup) {
      this.adGroup = adGroup;
      return this;
    }

    private Builder() {
    }

    private Builder(AdGroupName adGroupName) {
      customer = adGroupName.customer;
      adGroup = adGroupName.adGroup;
    }

    public AdGroupName build() {
      return new AdGroupName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AdGroupName) {
      AdGroupName that = (AdGroupName) o;
      return (this.customer.equals(that.customer))
          && (this.adGroup.equals(that.adGroup));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= adGroup.hashCode();
    return h;
  }
}

