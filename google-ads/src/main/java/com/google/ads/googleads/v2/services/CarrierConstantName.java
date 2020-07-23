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

package com.google.ads.googleads.v2.services;

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
public class CarrierConstantName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("carrierConstants/{carrier_constant}");

  private volatile Map<String, String> fieldValuesMap;

  private final String carrierConstant;

  public String getCarrierConstant() {
    return carrierConstant;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CarrierConstantName(Builder builder) {
    carrierConstant = Preconditions.checkNotNull(builder.getCarrierConstant());
  }

  public static CarrierConstantName of(String carrierConstant) {
    return newBuilder()
      .setCarrierConstant(carrierConstant)
      .build();
  }

  public static String format(String carrierConstant) {
    return newBuilder()
      .setCarrierConstant(carrierConstant)
      .build()
      .toString();
  }

  public static CarrierConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CarrierConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("carrier_constant"));
  }

  public static List<CarrierConstantName> parseList(List<String> formattedStrings) {
    List<CarrierConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CarrierConstantName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CarrierConstantName value : values) {
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
          fieldMapBuilder.put("carrierConstant", carrierConstant);
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
    return PATH_TEMPLATE.instantiate("carrier_constant", carrierConstant);
  }

  /** Builder for CarrierConstantName. */
  public static class Builder {

    private String carrierConstant;

    public String getCarrierConstant() {
      return carrierConstant;
    }

    public Builder setCarrierConstant(String carrierConstant) {
      this.carrierConstant = carrierConstant;
      return this;
    }

    private Builder() {
    }

    private Builder(CarrierConstantName carrierConstantName) {
      carrierConstant = carrierConstantName.carrierConstant;
    }

    public CarrierConstantName build() {
      return new CarrierConstantName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CarrierConstantName) {
      CarrierConstantName that = (CarrierConstantName) o;
      return (this.carrierConstant.equals(that.carrierConstant));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= carrierConstant.hashCode();
    return h;
  }
}

