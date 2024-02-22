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

package com.google.ads.googleads.v15.resources;

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
public class LocalServicesLeadConversationName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_LOCAL_SERVICES_LEAD_CONVERSATION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/localServicesLeadConversations/{local_services_lead_conversation_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String localServicesLeadConversationId;

  @Deprecated
  protected LocalServicesLeadConversationName() {
    customerId = null;
    localServicesLeadConversationId = null;
  }

  private LocalServicesLeadConversationName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    localServicesLeadConversationId =
        Preconditions.checkNotNull(builder.getLocalServicesLeadConversationId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getLocalServicesLeadConversationId() {
    return localServicesLeadConversationId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LocalServicesLeadConversationName of(
      String customerId, String localServicesLeadConversationId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLocalServicesLeadConversationId(localServicesLeadConversationId)
        .build();
  }

  public static String format(String customerId, String localServicesLeadConversationId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLocalServicesLeadConversationId(localServicesLeadConversationId)
        .build()
        .toString();
  }

  public static LocalServicesLeadConversationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_LOCAL_SERVICES_LEAD_CONVERSATION_ID.validatedMatch(
            formattedString,
            "LocalServicesLeadConversationName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("local_services_lead_conversation_id"));
  }

  public static List<LocalServicesLeadConversationName> parseList(List<String> formattedStrings) {
    List<LocalServicesLeadConversationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<LocalServicesLeadConversationName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LocalServicesLeadConversationName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_LOCAL_SERVICES_LEAD_CONVERSATION_ID.matches(formattedString);
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
          if (localServicesLeadConversationId != null) {
            fieldMapBuilder.put(
                "local_services_lead_conversation_id", localServicesLeadConversationId);
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
    return CUSTOMER_ID_LOCAL_SERVICES_LEAD_CONVERSATION_ID.instantiate(
        "customer_id",
        customerId,
        "local_services_lead_conversation_id",
        localServicesLeadConversationId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      LocalServicesLeadConversationName that = ((LocalServicesLeadConversationName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(
              this.localServicesLeadConversationId, that.localServicesLeadConversationId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(localServicesLeadConversationId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/localServicesLeadConversations/{local_services_lead_conversation_id}.
   */
  public static class Builder {
    private String customerId;
    private String localServicesLeadConversationId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getLocalServicesLeadConversationId() {
      return localServicesLeadConversationId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setLocalServicesLeadConversationId(String localServicesLeadConversationId) {
      this.localServicesLeadConversationId = localServicesLeadConversationId;
      return this;
    }

    private Builder(LocalServicesLeadConversationName localServicesLeadConversationName) {
      this.customerId = localServicesLeadConversationName.customerId;
      this.localServicesLeadConversationId =
          localServicesLeadConversationName.localServicesLeadConversationId;
    }

    public LocalServicesLeadConversationName build() {
      return new LocalServicesLeadConversationName(this);
    }
  }
}
