/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v25.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@NullMarked
@Generated("by gapic-generator-java")
public class LiftMeasurementFlightName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_LIFT_MEASUREMENT_FLIGHT_ID =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/liftMeasurementFlights/{lift_measurement_configuration_id}~{lift_measurement_flight_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String liftMeasurementConfigurationId;
  private final String liftMeasurementFlightId;

  @Deprecated
  protected LiftMeasurementFlightName() {
    customerId = null;
    liftMeasurementConfigurationId = null;
    liftMeasurementFlightId = null;
  }

  private LiftMeasurementFlightName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    liftMeasurementConfigurationId =
        Preconditions.checkNotNull(builder.getLiftMeasurementConfigurationId());
    liftMeasurementFlightId = Preconditions.checkNotNull(builder.getLiftMeasurementFlightId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getLiftMeasurementConfigurationId() {
    return liftMeasurementConfigurationId;
  }

  public String getLiftMeasurementFlightId() {
    return liftMeasurementFlightId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LiftMeasurementFlightName of(
      String customerId, String liftMeasurementConfigurationId, String liftMeasurementFlightId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLiftMeasurementConfigurationId(liftMeasurementConfigurationId)
        .setLiftMeasurementFlightId(liftMeasurementFlightId)
        .build();
  }

  public static String format(
      String customerId, String liftMeasurementConfigurationId, String liftMeasurementFlightId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLiftMeasurementConfigurationId(liftMeasurementConfigurationId)
        .setLiftMeasurementFlightId(liftMeasurementFlightId)
        .build()
        .toString();
  }

  public static @Nullable LiftMeasurementFlightName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_LIFT_MEASUREMENT_FLIGHT_ID.validatedMatch(
            formattedString,
            "LiftMeasurementFlightName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("lift_measurement_configuration_id"),
        matchMap.get("lift_measurement_flight_id"));
  }

  public static List<LiftMeasurementFlightName> parseList(List<String> formattedStrings) {
    List<LiftMeasurementFlightName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<@Nullable LiftMeasurementFlightName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LiftMeasurementFlightName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_LIFT_MEASUREMENT_FLIGHT_ID.matches(
        formattedString);
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
          if (liftMeasurementConfigurationId != null) {
            fieldMapBuilder.put(
                "lift_measurement_configuration_id", liftMeasurementConfigurationId);
          }
          if (liftMeasurementFlightId != null) {
            fieldMapBuilder.put("lift_measurement_flight_id", liftMeasurementFlightId);
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
    return CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_LIFT_MEASUREMENT_FLIGHT_ID.instantiate(
        "customer_id",
        customerId,
        "lift_measurement_configuration_id",
        liftMeasurementConfigurationId,
        "lift_measurement_flight_id",
        liftMeasurementFlightId);
  }

  @Override
  public boolean equals(@Nullable Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      LiftMeasurementFlightName that = ((LiftMeasurementFlightName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(
              this.liftMeasurementConfigurationId, that.liftMeasurementConfigurationId)
          && Objects.equals(this.liftMeasurementFlightId, that.liftMeasurementFlightId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(liftMeasurementConfigurationId);
    h *= 1000003;
    h ^= Objects.hashCode(liftMeasurementFlightId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/liftMeasurementFlights/{lift_measurement_configuration_id}~{lift_measurement_flight_id}.
   */
  public static class Builder {
    private String customerId;
    private String liftMeasurementConfigurationId;
    private String liftMeasurementFlightId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getLiftMeasurementConfigurationId() {
      return liftMeasurementConfigurationId;
    }

    public String getLiftMeasurementFlightId() {
      return liftMeasurementFlightId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setLiftMeasurementConfigurationId(String liftMeasurementConfigurationId) {
      this.liftMeasurementConfigurationId = liftMeasurementConfigurationId;
      return this;
    }

    public Builder setLiftMeasurementFlightId(String liftMeasurementFlightId) {
      this.liftMeasurementFlightId = liftMeasurementFlightId;
      return this;
    }

    private Builder(LiftMeasurementFlightName liftMeasurementFlightName) {
      this.customerId = liftMeasurementFlightName.customerId;
      this.liftMeasurementConfigurationId =
          liftMeasurementFlightName.liftMeasurementConfigurationId;
      this.liftMeasurementFlightId = liftMeasurementFlightName.liftMeasurementFlightId;
    }

    public LiftMeasurementFlightName build() {
      return new LiftMeasurementFlightName(this);
    }
  }
}
