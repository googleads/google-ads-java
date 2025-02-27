/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v19.resources;

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
public class AccountLinkName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ACCOUNT_LINK_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/accountLinks/{account_link_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String accountLinkId;

  @Deprecated
  protected AccountLinkName() {
    customerId = null;
    accountLinkId = null;
  }

  private AccountLinkName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    accountLinkId = Preconditions.checkNotNull(builder.getAccountLinkId());
  }

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

  public static AccountLinkName of(String customerId, String accountLinkId) {
    return newBuilder().setCustomerId(customerId).setAccountLinkId(accountLinkId).build();
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
        CUSTOMER_ID_ACCOUNT_LINK_ID.validatedMatch(
            formattedString, "AccountLinkName.parse: formattedString not in valid format");
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
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_ACCOUNT_LINK_ID.matches(formattedString);
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
          if (accountLinkId != null) {
            fieldMapBuilder.put("account_link_id", accountLinkId);
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
    return CUSTOMER_ID_ACCOUNT_LINK_ID.instantiate(
        "customer_id", customerId, "account_link_id", accountLinkId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AccountLinkName that = ((AccountLinkName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.accountLinkId, that.accountLinkId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(accountLinkId);
    return h;
  }

  /** Builder for customers/{customer_id}/accountLinks/{account_link_id}. */
  public static class Builder {
    private String customerId;
    private String accountLinkId;

    protected Builder() {}

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

    private Builder(AccountLinkName accountLinkName) {
      this.customerId = accountLinkName.customerId;
      this.accountLinkId = accountLinkName.accountLinkId;
    }

    public AccountLinkName build() {
      return new AccountLinkName(this);
    }
  }
}
