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
public class ChangeEventName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_TIMESTAMP_MICROS_COMMAND_INDEX_MUTATE_INDEX =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/changeEvents/{timestamp_micros}~{command_index}~{mutate_index}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String timestampMicros;
  private final String commandIndex;
  private final String mutateIndex;

  @Deprecated
  protected ChangeEventName() {
    customerId = null;
    timestampMicros = null;
    commandIndex = null;
    mutateIndex = null;
  }

  private ChangeEventName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    timestampMicros = Preconditions.checkNotNull(builder.getTimestampMicros());
    commandIndex = Preconditions.checkNotNull(builder.getCommandIndex());
    mutateIndex = Preconditions.checkNotNull(builder.getMutateIndex());
  }

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

  public static ChangeEventName of(
      String customerId, String timestampMicros, String commandIndex, String mutateIndex) {
    return newBuilder()
        .setCustomerId(customerId)
        .setTimestampMicros(timestampMicros)
        .setCommandIndex(commandIndex)
        .setMutateIndex(mutateIndex)
        .build();
  }

  public static String format(
      String customerId, String timestampMicros, String commandIndex, String mutateIndex) {
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
        CUSTOMER_ID_TIMESTAMP_MICROS_COMMAND_INDEX_MUTATE_INDEX.validatedMatch(
            formattedString, "ChangeEventName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("timestamp_micros"),
        matchMap.get("command_index"),
        matchMap.get("mutate_index"));
  }

  public static List<ChangeEventName> parseList(List<String> formattedStrings) {
    List<ChangeEventName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ChangeEventName> values) {
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_TIMESTAMP_MICROS_COMMAND_INDEX_MUTATE_INDEX.matches(formattedString);
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
          if (timestampMicros != null) {
            fieldMapBuilder.put("timestamp_micros", timestampMicros);
          }
          if (commandIndex != null) {
            fieldMapBuilder.put("command_index", commandIndex);
          }
          if (mutateIndex != null) {
            fieldMapBuilder.put("mutate_index", mutateIndex);
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
    return CUSTOMER_ID_TIMESTAMP_MICROS_COMMAND_INDEX_MUTATE_INDEX.instantiate(
        "customer_id",
        customerId,
        "timestamp_micros",
        timestampMicros,
        "command_index",
        commandIndex,
        "mutate_index",
        mutateIndex);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ChangeEventName that = ((ChangeEventName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.timestampMicros, that.timestampMicros)
          && Objects.equals(this.commandIndex, that.commandIndex)
          && Objects.equals(this.mutateIndex, that.mutateIndex);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(timestampMicros);
    h *= 1000003;
    h ^= Objects.hashCode(commandIndex);
    h *= 1000003;
    h ^= Objects.hashCode(mutateIndex);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/changeEvents/{timestamp_micros}~{command_index}~{mutate_index}.
   */
  public static class Builder {
    private String customerId;
    private String timestampMicros;
    private String commandIndex;
    private String mutateIndex;

    protected Builder() {}

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
}
