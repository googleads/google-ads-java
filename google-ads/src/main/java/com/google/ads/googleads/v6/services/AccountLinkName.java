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
public class AccountLinkName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/accountLinks/{account_link_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String accountLinkId;

  public String getCustomerId() {
    return customerId;
  }

  public String getAccountLinkId() {
    return accountLinkId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AccountLinkName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    accountLinkId = Preconditions.checkNotNull(builder.getAccountLinkId());
  }

  public static AccountLinkName of(String customerId, String accountLinkId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAccountLinkId(accountLinkId)
      .build();
  }

  public static String format(String customerId, String accountLinkId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAccountLinkId(accountLinkId)
      .build()
      .toString();
  }

  public static AccountLinkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "AccountLinkName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("account_link_id"));
  }

  public static List<AccountLinkName> parseList(List<String> formattedStrings) {
    List<AccountLinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AccountLinkName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (AccountLinkName value : values) {
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
          fieldMapBuilder.put("accountLinkId", accountLinkId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "account_link_id", accountLinkId);
  }

  /** Builder for AccountLinkName. */
  public static class Builder {

    private String customerId;
    private String accountLinkId;

    public String getCustomerId() {
      return customerId;
    }

    public String getAccountLinkId() {
      return accountLinkId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAccountLinkId(String accountLinkId) {
      this.accountLinkId = accountLinkId;
      return this;
    }

    private Builder() {
    }

    private Builder(AccountLinkName accountLinkName) {
      customerId = accountLinkName.customerId;
      accountLinkId = accountLinkName.accountLinkId;
    }

    public AccountLinkName build() {
      return new AccountLinkName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AccountLinkName) {
      AccountLinkName that = (AccountLinkName) o;
      return (this.customerId.equals(that.customerId))
          && (this.accountLinkId.equals(that.accountLinkId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= accountLinkId.hashCode();
    return h;
  }
}

