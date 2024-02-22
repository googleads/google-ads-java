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

package com.google.ads.googleads.v14.resources;

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
public class CustomerLabelName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_LABEL_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/customerLabels/{label_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String labelId;

  @Deprecated
  protected CustomerLabelName() {
    customerId = null;
    labelId = null;
  }

  private CustomerLabelName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    labelId = Preconditions.checkNotNull(builder.getLabelId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getLabelId() {
    return labelId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CustomerLabelName of(String customerId, String labelId) {
    return newBuilder().setCustomerId(customerId).setLabelId(labelId).build();
  }

  public static String format(String customerId, String labelId) {
    return newBuilder().setCustomerId(customerId).setLabelId(labelId).build().toString();
  }

  public static CustomerLabelName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_LABEL_ID.validatedMatch(
            formattedString, "CustomerLabelName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("label_id"));
  }

  public static List<CustomerLabelName> parseList(List<String> formattedStrings) {
    List<CustomerLabelName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerLabelName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerLabelName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_LABEL_ID.matches(formattedString);
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
          if (labelId != null) {
            fieldMapBuilder.put("label_id", labelId);
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
    return CUSTOMER_ID_LABEL_ID.instantiate("customer_id", customerId, "label_id", labelId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CustomerLabelName that = ((CustomerLabelName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.labelId, that.labelId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(labelId);
    return h;
  }

  /** Builder for customers/{customer_id}/customerLabels/{label_id}. */
  public static class Builder {
    private String customerId;
    private String labelId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getLabelId() {
      return labelId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setLabelId(String labelId) {
      this.labelId = labelId;
      return this;
    }

    private Builder(CustomerLabelName customerLabelName) {
      this.customerId = customerLabelName.customerId;
      this.labelId = customerLabelName.labelId;
    }

    public CustomerLabelName build() {
      return new CustomerLabelName(this);
    }
  }
}
