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

package com.google.ads.googleads.v2.resources;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class OperatingSystemVersionConstantName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("operatingSystemVersionConstants/{operating_system_version_constant}");

  private volatile Map<String, String> fieldValuesMap;

  private final String operatingSystemVersionConstant;

  public String getOperatingSystemVersionConstant() {
    return operatingSystemVersionConstant;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private OperatingSystemVersionConstantName(Builder builder) {
    operatingSystemVersionConstant = Preconditions.checkNotNull(builder.getOperatingSystemVersionConstant());
  }

  public static OperatingSystemVersionConstantName of(String operatingSystemVersionConstant) {
    return newBuilder()
      .setOperatingSystemVersionConstant(operatingSystemVersionConstant)
      .build();
  }

  public static String format(String operatingSystemVersionConstant) {
    return newBuilder()
      .setOperatingSystemVersionConstant(operatingSystemVersionConstant)
      .build()
      .toString();
  }

  public static OperatingSystemVersionConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "OperatingSystemVersionConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("operating_system_version_constant"));
  }

  public static List<OperatingSystemVersionConstantName> parseList(List<String> formattedStrings) {
    List<OperatingSystemVersionConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<OperatingSystemVersionConstantName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (OperatingSystemVersionConstantName value : values) {
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
          fieldMapBuilder.put("operatingSystemVersionConstant", operatingSystemVersionConstant);
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
    return PATH_TEMPLATE.instantiate("operating_system_version_constant", operatingSystemVersionConstant);
  }

  /** Builder for OperatingSystemVersionConstantName. */
  public static class Builder {

    private String operatingSystemVersionConstant;

    public String getOperatingSystemVersionConstant() {
      return operatingSystemVersionConstant;
    }

    public Builder setOperatingSystemVersionConstant(String operatingSystemVersionConstant) {
      this.operatingSystemVersionConstant = operatingSystemVersionConstant;
      return this;
    }

    private Builder() {
    }

    private Builder(OperatingSystemVersionConstantName operatingSystemVersionConstantName) {
      operatingSystemVersionConstant = operatingSystemVersionConstantName.operatingSystemVersionConstant;
    }

    public OperatingSystemVersionConstantName build() {
      return new OperatingSystemVersionConstantName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OperatingSystemVersionConstantName) {
      OperatingSystemVersionConstantName that = (OperatingSystemVersionConstantName) o;
      return (this.operatingSystemVersionConstant.equals(that.operatingSystemVersionConstant));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= operatingSystemVersionConstant.hashCode();
    return h;
  }
}

