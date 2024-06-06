/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v17.resources;

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
public class CustomerUserAccessInvitationName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_INVITATION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/customerUserAccessInvitations/{invitation_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String invitationId;

  @Deprecated
  protected CustomerUserAccessInvitationName() {
    customerId = null;
    invitationId = null;
  }

  private CustomerUserAccessInvitationName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    invitationId = Preconditions.checkNotNull(builder.getInvitationId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getInvitationId() {
    return invitationId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CustomerUserAccessInvitationName of(String customerId, String invitationId) {
    return newBuilder().setCustomerId(customerId).setInvitationId(invitationId).build();
  }

  public static String format(String customerId, String invitationId) {
    return newBuilder().setCustomerId(customerId).setInvitationId(invitationId).build().toString();
  }

  public static CustomerUserAccessInvitationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_INVITATION_ID.validatedMatch(
            formattedString,
            "CustomerUserAccessInvitationName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("invitation_id"));
  }

  public static List<CustomerUserAccessInvitationName> parseList(List<String> formattedStrings) {
    List<CustomerUserAccessInvitationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerUserAccessInvitationName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerUserAccessInvitationName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_INVITATION_ID.matches(formattedString);
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
          if (invitationId != null) {
            fieldMapBuilder.put("invitation_id", invitationId);
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
    return CUSTOMER_ID_INVITATION_ID.instantiate(
        "customer_id", customerId, "invitation_id", invitationId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CustomerUserAccessInvitationName that = ((CustomerUserAccessInvitationName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.invitationId, that.invitationId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(invitationId);
    return h;
  }

  /** Builder for customers/{customer_id}/customerUserAccessInvitations/{invitation_id}. */
  public static class Builder {
    private String customerId;
    private String invitationId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getInvitationId() {
      return invitationId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setInvitationId(String invitationId) {
      this.invitationId = invitationId;
      return this;
    }

    private Builder(CustomerUserAccessInvitationName customerUserAccessInvitationName) {
      this.customerId = customerUserAccessInvitationName.customerId;
      this.invitationId = customerUserAccessInvitationName.invitationId;
    }

    public CustomerUserAccessInvitationName build() {
      return new CustomerUserAccessInvitationName(this);
    }
  }
}
