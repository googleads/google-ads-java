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
public class UserInterestName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/userInterests/{user_interest_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String userInterestId;

  public String getCustomerId() {
    return customerId;
  }

  public String getUserInterestId() {
    return userInterestId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private UserInterestName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    userInterestId = Preconditions.checkNotNull(builder.getUserInterestId());
  }

  public static UserInterestName of(String customerId, String userInterestId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setUserInterestId(userInterestId)
      .build();
  }

  public static String format(String customerId, String userInterestId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setUserInterestId(userInterestId)
      .build()
      .toString();
  }

  public static UserInterestName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "UserInterestName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("user_interest_id"));
  }

  public static List<UserInterestName> parseList(List<String> formattedStrings) {
    List<UserInterestName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<UserInterestName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (UserInterestName value : values) {
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
          fieldMapBuilder.put("userInterestId", userInterestId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "user_interest_id", userInterestId);
  }

  /** Builder for UserInterestName. */
  public static class Builder {

    private String customerId;
    private String userInterestId;

    public String getCustomerId() {
      return customerId;
    }

    public String getUserInterestId() {
      return userInterestId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setUserInterestId(String userInterestId) {
      this.userInterestId = userInterestId;
      return this;
    }

    private Builder() {
    }

    private Builder(UserInterestName userInterestName) {
      customerId = userInterestName.customerId;
      userInterestId = userInterestName.userInterestId;
    }

    public UserInterestName build() {
      return new UserInterestName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UserInterestName) {
      UserInterestName that = (UserInterestName) o;
      return (this.customerId.equals(that.customerId))
          && (this.userInterestId.equals(that.userInterestId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= userInterestId.hashCode();
    return h;
  }
}

