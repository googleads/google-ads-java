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

package com.google.ads.googleads.v6.services;

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
public class GroupPlacementViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/groupPlacementViews/{ad_group_id}~{base64_placement}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String adGroupId;
  private final String base64Placement;

  public String getCustomerId() {
    return customerId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getBase64Placement() {
    return base64Placement;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private GroupPlacementViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    base64Placement = Preconditions.checkNotNull(builder.getBase64Placement());
  }

  public static GroupPlacementViewName of(String customerId, String adGroupId, String base64Placement) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAdGroupId(adGroupId)
      .setBase64Placement(base64Placement)
      .build();
  }

  public static String format(String customerId, String adGroupId, String base64Placement) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAdGroupId(adGroupId)
      .setBase64Placement(base64Placement)
      .build()
      .toString();
  }

  public static GroupPlacementViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "GroupPlacementViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("ad_group_id"), matchMap.get("base64_placement"));
  }

  public static List<GroupPlacementViewName> parseList(List<String> formattedStrings) {
    List<GroupPlacementViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<GroupPlacementViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (GroupPlacementViewName value : values) {
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
          fieldMapBuilder.put("customerId", customerId);
          fieldMapBuilder.put("adGroupId", adGroupId);
          fieldMapBuilder.put("base64Placement", base64Placement);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "ad_group_id", adGroupId, "base64_placement", base64Placement);
  }

  /** Builder for GroupPlacementViewName. */
  public static class Builder {

    private String customerId;
    private String adGroupId;
    private String base64Placement;

    public String getCustomerId() {
      return customerId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getBase64Placement() {
      return base64Placement;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setBase64Placement(String base64Placement) {
      this.base64Placement = base64Placement;
      return this;
    }

    private Builder() {
    }

    private Builder(GroupPlacementViewName groupPlacementViewName) {
      customerId = groupPlacementViewName.customerId;
      adGroupId = groupPlacementViewName.adGroupId;
      base64Placement = groupPlacementViewName.base64Placement;
    }

    public GroupPlacementViewName build() {
      return new GroupPlacementViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GroupPlacementViewName) {
      GroupPlacementViewName that = (GroupPlacementViewName) o;
      return (this.customerId.equals(that.customerId))
          && (this.adGroupId.equals(that.adGroupId))
          && (this.base64Placement.equals(that.base64Placement));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= adGroupId.hashCode();
    h *= 1000003;
    h ^= base64Placement.hashCode();
    return h;
  }
}

