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

package com.google.ads.googleads.v4.resources;

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
public class UserListName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/userLists/{user_list}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String userList;

  public String getCustomer() {
    return customer;
  }

  public String getUserList() {
    return userList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private UserListName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    userList = Preconditions.checkNotNull(builder.getUserList());
  }

  public static UserListName of(String customer, String userList) {
    return newBuilder()
      .setCustomer(customer)
      .setUserList(userList)
      .build();
  }

  public static String format(String customer, String userList) {
    return newBuilder()
      .setCustomer(customer)
      .setUserList(userList)
      .build()
      .toString();
  }

  public static UserListName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "UserListName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("user_list"));
  }

  public static List<UserListName> parseList(List<String> formattedStrings) {
    List<UserListName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<UserListName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (UserListName value : values) {
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
          fieldMapBuilder.put("userList", userList);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "user_list", userList);
  }

  /** Builder for UserListName. */
  public static class Builder {

    private String customer;
    private String userList;

    public String getCustomer() {
      return customer;
    }

    public String getUserList() {
      return userList;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setUserList(String userList) {
      this.userList = userList;
      return this;
    }

    private Builder() {
    }

    private Builder(UserListName userListName) {
      customer = userListName.customer;
      userList = userListName.userList;
    }

    public UserListName build() {
      return new UserListName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UserListName) {
      UserListName that = (UserListName) o;
      return (this.customer.equals(that.customer))
          && (this.userList.equals(that.userList));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= userList.hashCode();
    return h;
  }
}

