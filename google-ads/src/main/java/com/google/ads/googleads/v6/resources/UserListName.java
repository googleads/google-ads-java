/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v6.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class UserListName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_USER_LIST_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/userLists/{user_list_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String userListId;

  @Deprecated
  protected UserListName() {
    customerId = null;
    userListId = null;
  }

  private UserListName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    userListId = Preconditions.checkNotNull(builder.getUserListId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getUserListId() {
    return userListId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static UserListName of(String customerId, String userListId) {
    return newBuilder().setCustomerId(customerId).setUserListId(userListId).build();
  }

  public static String format(String customerId, String userListId) {
    return newBuilder().setCustomerId(customerId).setUserListId(userListId).build().toString();
  }

  public static UserListName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_USER_LIST_ID.validatedMatch(
            formattedString, "UserListName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("user_list_id"));
  }

  public static List<UserListName> parseList(List<String> formattedStrings) {
    List<UserListName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<UserListName> values) {
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_USER_LIST_ID.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (customerId != null) {
            fieldMapBuilder.put("customer_id", customerId);
          }
          if (userListId != null) {
            fieldMapBuilder.put("user_list_id", userListId);
          }
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
    return CUSTOMER_ID_USER_LIST_ID.instantiate(
        "customer_id", customerId, "user_list_id", userListId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      UserListName that = ((UserListName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.userListId, that.userListId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(userListId);
    return h;
  }

  /** Builder for customers/{customer_id}/userLists/{user_list_id}. */
  public static class Builder {
    private String customerId;
    private String userListId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getUserListId() {
      return userListId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setUserListId(String userListId) {
      this.userListId = userListId;
      return this;
    }

    private Builder(UserListName userListName) {
      customerId = userListName.customerId;
      userListId = userListName.userListId;
    }

    public UserListName build() {
      return new UserListName(this);
    }
  }
}
