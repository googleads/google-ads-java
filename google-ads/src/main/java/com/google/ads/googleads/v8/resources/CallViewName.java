/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.resources;

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
public class CallViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CALL_DETAIL_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/callViews/{call_detail_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String callDetailId;

  @Deprecated
  protected CallViewName() {
    customerId = null;
    callDetailId = null;
  }

  private CallViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    callDetailId = Preconditions.checkNotNull(builder.getCallDetailId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCallDetailId() {
    return callDetailId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CallViewName of(String customerId, String callDetailId) {
    return newBuilder().setCustomerId(customerId).setCallDetailId(callDetailId).build();
  }

  public static String format(String customerId, String callDetailId) {
    return newBuilder().setCustomerId(customerId).setCallDetailId(callDetailId).build().toString();
  }

  public static CallViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CALL_DETAIL_ID.validatedMatch(
            formattedString, "CallViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("call_detail_id"));
  }

  public static List<CallViewName> parseList(List<String> formattedStrings) {
    List<CallViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CallViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CallViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CALL_DETAIL_ID.matches(formattedString);
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
          if (callDetailId != null) {
            fieldMapBuilder.put("call_detail_id", callDetailId);
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
    return CUSTOMER_ID_CALL_DETAIL_ID.instantiate(
        "customer_id", customerId, "call_detail_id", callDetailId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CallViewName that = ((CallViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.callDetailId, that.callDetailId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(callDetailId);
    return h;
  }

  /** Builder for customers/{customer_id}/callViews/{call_detail_id}. */
  public static class Builder {
    private String customerId;
    private String callDetailId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCallDetailId() {
      return callDetailId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCallDetailId(String callDetailId) {
      this.callDetailId = callDetailId;
      return this;
    }

    private Builder(CallViewName callViewName) {
      customerId = callViewName.customerId;
      callDetailId = callViewName.callDetailId;
    }

    public CallViewName build() {
      return new CallViewName(this);
    }
  }
}
