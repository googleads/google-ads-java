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
public class ChangeEventName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/changeEvents/{timestamp_micros}~{command_index}~{mutate_index}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String timestampMicros;
  private final String commandIndex;
  private final String mutateIndex;

  public String getCustomerId() {
    return customerId;
  }

  public String getTimestampMicros() {
    return timestampMicros;
  }

  public String getCommandIndex() {
    return commandIndex;
  }

  public String getMutateIndex() {
    return mutateIndex;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ChangeEventName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    timestampMicros = Preconditions.checkNotNull(builder.getTimestampMicros());
    commandIndex = Preconditions.checkNotNull(builder.getCommandIndex());
    mutateIndex = Preconditions.checkNotNull(builder.getMutateIndex());
  }

  public static ChangeEventName of(String customerId, String timestampMicros, String commandIndex, String mutateIndex) {
    return newBuilder()
      .setCustomerId(customerId)
      .setTimestampMicros(timestampMicros)
      .setCommandIndex(commandIndex)
      .setMutateIndex(mutateIndex)
      .build();
  }

  public static String format(String customerId, String timestampMicros, String commandIndex, String mutateIndex) {
    return newBuilder()
      .setCustomerId(customerId)
      .setTimestampMicros(timestampMicros)
      .setCommandIndex(commandIndex)
      .setMutateIndex(mutateIndex)
      .build()
      .toString();
  }

  public static ChangeEventName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ChangeEventName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("timestamp_micros"), matchMap.get("command_index"), matchMap.get("mutate_index"));
  }

  public static List<ChangeEventName> parseList(List<String> formattedStrings) {
    List<ChangeEventName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ChangeEventName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (ChangeEventName value : values) {
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
          fieldMapBuilder.put("timestampMicros", timestampMicros);
          fieldMapBuilder.put("commandIndex", commandIndex);
          fieldMapBuilder.put("mutateIndex", mutateIndex);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "timestamp_micros", timestampMicros, "command_index", commandIndex, "mutate_index", mutateIndex);
  }

  /** Builder for ChangeEventName. */
  public static class Builder {

    private String customerId;
    private String timestampMicros;
    private String commandIndex;
    private String mutateIndex;

    public String getCustomerId() {
      return customerId;
    }

    public String getTimestampMicros() {
      return timestampMicros;
    }

    public String getCommandIndex() {
      return commandIndex;
    }

    public String getMutateIndex() {
      return mutateIndex;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setTimestampMicros(String timestampMicros) {
      this.timestampMicros = timestampMicros;
      return this;
    }

    public Builder setCommandIndex(String commandIndex) {
      this.commandIndex = commandIndex;
      return this;
    }

    public Builder setMutateIndex(String mutateIndex) {
      this.mutateIndex = mutateIndex;
      return this;
    }

    private Builder() {
    }

    private Builder(ChangeEventName changeEventName) {
      customerId = changeEventName.customerId;
      timestampMicros = changeEventName.timestampMicros;
      commandIndex = changeEventName.commandIndex;
      mutateIndex = changeEventName.mutateIndex;
    }

    public ChangeEventName build() {
      return new ChangeEventName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ChangeEventName) {
      ChangeEventName that = (ChangeEventName) o;
      return (this.customerId.equals(that.customerId))
          && (this.timestampMicros.equals(that.timestampMicros))
          && (this.commandIndex.equals(that.commandIndex))
          && (this.mutateIndex.equals(that.mutateIndex));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= timestampMicros.hashCode();
    h *= 1000003;
    h ^= commandIndex.hashCode();
    h *= 1000003;
    h ^= mutateIndex.hashCode();
    return h;
  }
}

